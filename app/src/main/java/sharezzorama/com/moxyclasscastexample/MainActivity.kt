package sharezzorama.com.moxyclasscastexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import sharezzorama.com.moxyclasscastexample.fragment1.Fragment1
import sharezzorama.com.moxyclasscastexample.fragment2.Fragment2

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener { switchFragment(Fragment1()) }
        button2.setOnClickListener { switchFragment(Fragment2()) }
    }

    private fun switchFragment(fragment: Fragment) {
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentContainer, fragment)
                .commit()
    }
}
