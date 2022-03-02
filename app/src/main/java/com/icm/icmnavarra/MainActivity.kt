package com.icm.icmnavarra
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import com.icm.icmnavarra.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main2)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

         val btn_siguiente=findViewById<Button>(R.id.btn_Siguiente)

         btn_siguiente.setOnClickListener {
             val lanza = Intent(this, MainActivity2::class.java)
             startActivity(lanza)
         }


        val btn_Pastor= findViewById<Button>(R.id.btn_Pastor)
        val btn_Pastora= findViewById<Button>(R.id.btn_Pastora)
        val btn_Ministros= findViewById<Button>(R.id.btn_Ministros)
        val btn_Discipulado= findViewById<Button>(R.id.btn_Discipulado)
        val btn_Facebook= findViewById<Button>(R.id.btn_Facebook)
        val btn_Alavanzas= findViewById<Button>(R.id.btn_Alavanzas)
        val btn_Video= findViewById<Button>(R.id.btn_video)
        val btn_Diario= findViewById<Button>(R.id.btn_Diario)
        val btn_Biblia= findViewById<Button>(R.id.btn_biblia)

        btn_Pastor.setOnClickListener {
            val miIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://cosechamundialnavarra.com/videos/"))
            startActivity(miIntent)
        }

        btn_Pastora.setOnClickListener {
            val miIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://cosechamundialnavarra.com/videos-pastora/"))
            startActivity(miIntent)
        }

        btn_Ministros.setOnClickListener {
            val miIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://cosechamundialnavarra.com/ministros-icm/"))
            startActivity(miIntent)
        }

        btn_Discipulado.setOnClickListener {
            val miIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://edu.cosechamundialnavarra.com/login/index.php"))
            startActivity(miIntent)
        }

        btn_Facebook.setOnClickListener {
            val miIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/662093197932076"))
            startActivity(miIntent)
        }

        btn_Alavanzas.setOnClickListener {
            val miIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://cosechamundialnavarra.com/alabanzas-y-adoracion/"))
            startActivity(miIntent)
        }

        btn_Video.setOnClickListener {
            val miIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://cosechamundialnavarra.com/multimedia/"))
            startActivity(miIntent)
        }

        btn_Diario.setOnClickListener {
            val miIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/236611451987843"))
            startActivity(miIntent)
        }

        btn_Biblia.setOnClickListener {
            val miIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://cosechamundialnavarra.com/biblia/"))
            startActivity(miIntent)
        }


    }
}