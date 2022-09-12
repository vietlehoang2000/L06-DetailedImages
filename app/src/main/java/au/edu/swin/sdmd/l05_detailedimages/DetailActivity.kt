package au.edu.swin.sdmd.l05_detailedimages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val vName = findViewById<TextView>(R.id.name)
        val name = intent.getStringExtra("name")
        vName.text=name
    }
}