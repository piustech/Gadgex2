package com.example.gadgex.activities

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.onNavDestinationSelected
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.gadgex.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)
        val toolBar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)

        appBarConfiguration = AppBarConfiguration(
            setOf( R.id.homePageFragment2, R.id.aboutFragment, R.id.logoutFragment)
        )

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController = navHostFragment.findNavController()




        setSupportActionBar(toolBar)
        setupActionBarWithNavController(navController, appBarConfiguration)

        bottomNav.setupWithNavController(navController)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.nav_bar, menu)
        return  true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return item.onNavDestinationSelected(navController)  || super.onOptionsItemSelected(item)

    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()

    }


}