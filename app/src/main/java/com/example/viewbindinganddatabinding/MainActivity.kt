package com.example.viewbindinganddatabinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.viewbindinganddatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       // binding.txtName.setText("Welcome TO Android Batch!")

        binding.txtName.text = "Welcome To Android Batch"

        binding.btnSetName.setOnClickListener {
            binding.txtName.setText(binding.edtName.text.toString())
            binding.imgLogo.setImageResource(R.mipmap.ic_launcher)
        }

        binding.btnShowUserDetails.setOnClickListener {
            var user = User(
                R.mipmap.ic_launcher,
                "Aishwarya Phatak",
                2,
                1990,
                "aishwarya.phatak@bitcode.in"
            )

            var intent : Intent = Intent(this,UserDetailsActivity::class.java)
            intent.putExtra("user",user)
            startActivity(intent)
        }
    }
}