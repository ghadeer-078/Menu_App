package com.example.mmenu_app_bonus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.core.view.get


class HelpActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        menu!![2].isVisible = false
        return super.onPrepareOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.helpMenu -> {
                startActivity(Intent(this,HelpActivity::class.java))
                return true
            }
            R.id.aboutMenu -> {
                startActivity(Intent(this,AboutActivity::class.java))
                return true
            }
            R.id.mainMenu -> {
                startActivity(Intent(this,MainActivity::class.java))
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

}