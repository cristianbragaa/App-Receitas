package cristian.app.appreceitas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import cristian.app.appreceitas.databinding.ActivityMainBinding
import cristian.app.appreceitas.databinding.ItemReceitaBinding

class ReceitaAdapter(
    private val onClick: (Receita) -> Unit
) : RecyclerView.Adapter<ReceitaAdapter.ReceitaViewHolder>() {

    private val receitas = DadosReceita.recuperarReceitas()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReceitaViewHolder {
        val binding = ItemReceitaBinding
            .inflate(LayoutInflater.from(parent.context))
        return ReceitaViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ReceitaViewHolder, position: Int) {
        val receita = receitas[position]
        holder.bind(receita, onClick)
    }

    override fun getItemCount(): Int {
        return receitas.size
    }

    inner class ReceitaViewHolder(binding: ItemReceitaBinding) : RecyclerView.ViewHolder(binding.root) {

        private val imageReceita = binding.imageReceita
        private val textTitulo = binding.textTitulo
        private val textTempoPreparo = binding.textPreparo

        fun bind(receita: Receita, onClick: (Receita) -> Unit) {
            itemView.setOnClickListener {
                onClick(receita)
            }

            textTitulo.text = receita.titulo
            textTempoPreparo.text = receita.tempoPreparo

            imageReceita.setImageDrawable(
                ContextCompat.getDrawable(
                    itemView.context,
                    receita.resIdImagem
                )
            )
        }
    }
}