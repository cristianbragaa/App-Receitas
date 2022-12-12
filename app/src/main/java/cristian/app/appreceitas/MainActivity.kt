package cristian.app.appreceitas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import cristian.app.appreceitas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            rvReceitas.adapter = ReceitaAdapter { receita ->
                val intent = Intent(applicationContext, DetalhesActivity::class.java)
                intent.putExtra("receita", receita)
                startActivity(intent)
            }

            rvReceitas.layoutManager = LinearLayoutManager(applicationContext, RecyclerView.VERTICAL, false)
            rvReceitas.addItemDecoration(
                DividerItemDecoration(applicationContext, RecyclerView.VERTICAL)
            )
        }
    }
}