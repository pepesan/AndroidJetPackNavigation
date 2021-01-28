package jp.s64.android.prototype.myechoapplication

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI

class MainActivity : AppCompatActivity(), BlankFragment.OnFragmentInteractionListener, BlankFragment2.OnFragmentInteractionListener , BlankFragment3.OnFragmentInteractionListener{
    override fun onFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    lateinit var navHost: NavHostFragment
    var dato: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        navHost = supportFragmentManager
                .findFragmentById(R.id.navHost) as NavHostFragment

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottomNavigation)

        NavigationUI.setupActionBarWithNavController(this, navHost.navController)
        NavigationUI.setupWithNavController(bottomNavigation, navHost.navController)
        this.dato = (application as Aplicacion).dato
        this.dato="Dato en MainActivity"
        Log.d("app:MainActivity", this.dato.toString())
    }

    /*
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, navHost.navController) || super.onOptionsItemSelected(item)
    }
    */

    override fun onSupportNavigateUp(): Boolean {
        return navHost.navController.navigateUp() || super.onSupportNavigateUp()
        //return NavigationUI.navigateUp(drawer, navHost.navController) || super.onSupportNavigateUp()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_bottom_navigation, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        when (item.itemId) {

            R.id.screen_about -> {
                navegaAAbout()
                return true
            }

            else -> return super.onOptionsItemSelected(item)
        }
    }

    private fun navegaAAbout() {
        navHost.navController.navigate(R.id.action_launcher_title_to_screen_about)
    }

}
