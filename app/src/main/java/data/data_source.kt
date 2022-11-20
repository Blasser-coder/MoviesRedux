package data

import Model.Pelicula
import com.example.moviesredux.R

class data_source {
    fun loadPelicula(): List<Pelicula>{
        return listOf<Pelicula>(
            Pelicula(R.drawable.interstellar, "Interstelar", "Christopher nolan", "Sci-Fi"),
            Pelicula(R.drawable.arca_perdida, "En busca del arca perdida", "Steven Spielberg", "Aventura"),
            Pelicula(R.drawable.la_vida_es_bella, "La vida es bella", "Roberto Begnini", "Drama"),
            Pelicula(R.drawable.platoon, "Platoon", "Oliver Stone", "Belica"),
            Pelicula(R.drawable.el_golpe, "El Golpe", "George Roy Hill", "Comedia"),
            Pelicula(R.drawable.toy_story, "Toy Story", "John Lasseter", "Animacion"),
        )
    }
}