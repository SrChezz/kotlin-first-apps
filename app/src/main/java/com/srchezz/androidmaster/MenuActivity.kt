package com.srchezz.androidmaster

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.srchezz.androidmaster.firstapp.FirstAppActivity
import com.srchezz.androidmaster.imccalculator.ImcCalculatorActivity
import com.srchezz.androidmaster.todoapp.TodoActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        val btnSaludApp = findViewById<Button>(R.id.btnSaludApp)
        btnSaludApp.setOnClickListener{ navigateToSaludApp() }
        val btnImcApp = findViewById<Button>(R.id.btnIMCApp)
        btnImcApp.setOnClickListener{ navigateToImcApp() }
        val btnTODO = findViewById<Button>(R.id.btnTODO)
        btnTODO.setOnClickListener{ navigateTodoApp() }
    }

    private fun navigateTodoApp() {
        val intent = Intent(this, TodoActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToImcApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludApp() {
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
}