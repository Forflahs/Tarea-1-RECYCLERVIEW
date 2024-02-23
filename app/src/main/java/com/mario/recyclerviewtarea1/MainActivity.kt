package com.mario.recyclerviewtarea1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var listAdapter: MutableList<dtProductos> = mutableListOf()
    private lateinit var  recycler: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listAdapter.add(dtProductos("id del producto:1","leche:producto lactio", "Precio por menudeo:13", "Precio por mayoreo:11"));
        listAdapter.add(dtProductos("id del producto:2", "pan:producto de harina", "Precio por menudeo:8", "Precio por mayoreo:7"));
        listAdapter.add(dtProductos("id del producto:3", "manzanas:frutas frescas", "Precio por menudeo:15", "Precio por mayoreo:14"));
        listAdapter.add(dtProductos("id del producto:4", "pasta:producto de harina", "Precio por menudeo:10", "Precio por mayoreo:9"));
        listAdapter.add(dtProductos("id del producto:5", "huevos:producto avícola", "Precio por menudeo:12", "Precio por mayoreo:11"));
        listAdapter.add(dtProductos("id del producto:6", "agua mineral:bebida", "Precio por menudeo:5", "Precio por mayoreo:4"));
        listAdapter.add(dtProductos("id del producto:7", "yogur:producto lácteo", "Precio por menudeo:10", "Precio por mayoreo:9"));
        listAdapter.add(dtProductos("id del producto:8", "pollo:carne avícola", "Precio por menudeo:18", "Precio por mayoreo:16"));
        listAdapter.add(dtProductos("id del producto:9", "queso:producto lácteo", "Precio por menudeo:15", "Precio por mayoreo:12"));
        listAdapter.add(dtProductos("id del producto:10", "arroz:producto de grano", "Precio por menudeo:14", "Precio por mayoreo:13"));
        listAdapter.add(dtProductos("id del producto:11", "tomates:vegetales frescos", "Precio por menudeo:9", "Precio por mayoreo:8"));
        listAdapter.add(dtProductos("id del producto:12", "café:bebida caliente", "Precio por menudeo:11", "Precio por mayoreo:10"));
        listAdapter.add(dtProductos("id del producto:13", "zanahorias:vegetales frescos", "Precio por menudeo:7", "Precio por mayoreo:6"));
        listAdapter.add(dtProductos("id del producto:14", "galletas:producto horneado", "Precio por menudeo:6", "Precio por mayoreo:5"));
        listAdapter.add(dtProductos("id del producto:15", "mermelada:producto de frutas", "Precio por menudeo:8", "Precio por mayoreo:7"));
        listAdapter.add(dtProductos("id del producto:16", "atún enlatado:producto enlatado", "Precio por menudeo:12", "Precio por mayoreo:11"));
        listAdapter.add(dtProductos("id del producto:17", "lechuga:vegetales frescos", "Precio por menudeo:5", "Precio por mayoreo:4"));
        listAdapter.add(dtProductos("id del producto:18", "sopa enlatada:producto enlatado", "Precio por menudeo:7", "Precio por mayoreo:6"));
        listAdapter.add(dtProductos("id del producto:19", "queso cottage:producto lácteo", "Precio por menudeo:10", "Precio por mayoreo:9"));
        listAdapter.add(dtProductos("id del producto:20", "zanahorias:vegetales frescos", "Precio por menudeo:7", "Precio por mayoreo:6"));

        var tabla =findViewById<RecyclerView>(R.id.TablaProductos)
        recycler=tabla
        recycler.layoutManager=LinearLayoutManager(this)
        recycler.adapter=ProductosAdapter(this,listAdapter)
    }
}