package com.example.entregajesuitas_recycleview

import Model.Pelicula
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesredux.InnitialFragment
import com.example.moviesredux.MainActivity
import com.example.moviesredux.R
import com.example.moviesredux.databinding.FragmentInnitialBinding

class MyAdapter ( val Context: Fragment ,
                  private val DataSet: List<Pelicula>): RecyclerView.Adapter<MyAdapter.ItemViewHolder>() {
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view){
        val textAutor: TextView = view.findViewById(R.id.AutorPelicula)
        val textCategory: TextView = view.findViewById(R.id.CategoriaPelicula)
        val textTitle: TextView = view.findViewById(R.id.TituloPelicula)
        val ImagePeli: ImageView = view.findViewById(R.id.ImagenPelicula)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_items, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = DataSet[position]
        holder.textCategory.text = item.Categoria
        holder.textAutor.text = item.Director
        holder.textTitle.text = item.Titulo
        holder.ImagePeli.setImageResource(item.Imagen)
        holder.ImagePeli.setOnClickListener{

        }
    }



    override fun getItemCount(): Int {
        return DataSet.size
    }
}