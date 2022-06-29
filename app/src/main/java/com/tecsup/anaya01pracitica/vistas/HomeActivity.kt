package com.tecsup.anaya01pracitica.vistas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.tecsup.anaya01pracitica.R
import kotlinx.android.synthetic.main.activity_home.*
class HomeActivity: AppCompatActivity(), AdapterView.OnItemSelectedListener {

    val opciones = arrayOf("A: 30% T + 70% L", "B: 40% T + 60% L")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val actionBar = supportActionBar
        actionBar?.hide()

        spinnersistema.onItemSelectedListener = this
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, opciones)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnersistema.adapter = adapter

    }
    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
    }
    override fun onNothingSelected(p0: AdapterView<*>?) {
    }
}