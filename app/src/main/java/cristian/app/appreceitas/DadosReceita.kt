package cristian.app.appreceitas

class DadosReceita {

    companion object {
        fun recuperarReceitas(): List<Receita> {

            val r1 = Receita(
                "ESCONDIDINHO DE CAMARÃO", "35min",
                R.drawable.carne1, listOf(
                    "1 Kg de camarão branco limpo",
                    "Azeite de oliva",
                    "2 dentes de alho picados ou amassados",
                    "Sal a gosto",
                    "1 cebola média picada",
                    "1 tomate grande picado",
                    "Salsinha e coentro a gosto"
                )
            )

            val r2 = Receita(
                "PANQUECA DE CARNE MOÍDA", "45min",
                R.drawable.carne2, listOf(
                    "1 e 1/2 xícara (chá) de farinha de trigo",
                    "1 xícara (chá) de leite",
                    "2 ovos",
                    "4 colheres (sopa) de óleo",
                    "sal a gosto",
                    "300 g de carne moída",
                    "2 colheres (sopa) de cebola picada ou ralada",
                )
            )

            val r3 = Receita(
                "ROCAMBOLE DE CARNE MOÍDA", "25min",
                R.drawable.carne3, listOf(
                    "1/2 kg de carne moída",
                    "1 pacote de sopa de cebola",
                    "presunto fatiado",
                    "queijo fatiado",
                    "tempero verde",
                    "sal a gosto",
                )
            )

            val r4 = Receita(
                "ESCONDIDINHO DE CARNE SECA", "60min",
                R.drawable.carne4, listOf(
                    "1 kg de mandioca cozida",
                    "1 lata de creme de leite com soro",
                    "2 colheres de margarina",
                    "1/2 kg de carne-seca dessalgada e cozida",
                    "1 cebola média picadinha",
                    "4 dentes de alho esmagados",
                    "2 tomates sem casca e picados",
                    "sal e pimenta a gosto",
                    "queijo ralado a gosto",
                )
            )

            return listOf(r1, r2, r3, r4)
        }
    }
}