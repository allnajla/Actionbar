package com.example.actionbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.AdapterView
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
lateinit var textview : TextView
lateinit var mylayout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textview =findViewById(R.id.mytext)
        mylayout = findViewById(R.id.mylayout)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.actionsbar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.red-> {
               Toast.makeText(this,"Menu red sélectionné",Toast.LENGTH_LONG).show()
                // afficher un Toast avec le message “Menu search sélectionné”
                true
            }

            R.id.yellow -> {
                Toast.makeText(this,"Menu yellow sélectionné",Toast.LENGTH_LONG).show()
                // afficher un Toast avec le message “Menu search sélectionné”
                true
            }

            R.id.gray -> {
                Toast.makeText(this,"Menu gray sélectionné",Toast.LENGTH_LONG).show()
                // afficher un Toast avec le message “Menu search sélectionné”
                true
            }
            R.id.green -> {
                Toast.makeText(this,"Menu green sélectionné",Toast.LENGTH_LONG).show()
                // afficher un Toast avec le message “Menu search sélectionné”
                true
            }

            // completer de meme pour menu_exit

            else -> super.onOptionsItemSelected(item)
        }
    }
}