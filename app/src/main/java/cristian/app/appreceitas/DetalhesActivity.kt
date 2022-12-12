package cristian.app.appreceitas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import cristian.app.appreceitas.databinding.ActivityDetalhesBinding

class DetalhesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetalhesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalhesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras
        val receita = bundle?.getParcelable<Receita>("receita")

        if (receita != null) {
            with(binding) {
                textTituloDetalhes.text = receita.titulo
                textPreparoDetalhes.text = receita.tempoPreparo
                imageReceitaDetalhes.setImageResource(receita.resIdImagem)

                var ingrediente = ""
                receita.ingredientes.forEach { ingredientes ->
                    ingrediente += "-$ingredientes \n"
                }
                textIngredientes.text = ingrediente
            }
        }
    }

    fun voltar(view: View) {
        finish()
    }
}