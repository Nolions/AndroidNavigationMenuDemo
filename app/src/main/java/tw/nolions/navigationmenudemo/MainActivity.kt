package tw.nolions.navigationmenudemo

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navMenu.setOnNavigationItemSelectedListener { item ->
            val msg = getString(
                when (item.itemId) {
                    R.id.sidleMenuHome -> R.string.home
                    R.id.sidleMenuAccount -> R.string.account
                    R.id.sidleMenuMore -> R.string.more
                    else -> R.string.home
                }
            )

            text.text = msg
            Toast.makeText(this, msg, Toast.LENGTH_LONG).show()

            true
        }
    }
}