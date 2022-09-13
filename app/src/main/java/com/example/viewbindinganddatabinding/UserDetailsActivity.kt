package com.example.viewbindinganddatabinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.viewbindinganddatabinding.databinding.UserDetailsActivityBinding

class UserDetailsActivity : AppCompatActivity() {

    private lateinit var binding: UserDetailsActivityBinding
    private lateinit var user: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = UserDetailsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bindDataToViews()
    }

    private fun bindDataToViews(){
        user = intent.getSerializableExtra("user") as User
        binding.userObject = user

        /*binding.imgUser.setImageResource(user.userImageId)
        binding.txtUserName.setText(user.username)
        binding.txtUserAge.setText("${2022 - user.birthYear}")

        if(user.gender == 1){
            binding.radioGenderMale.isChecked = true
        }
        else{
            binding.radioGenderFemale.isChecked = true
        }*/
    }
}