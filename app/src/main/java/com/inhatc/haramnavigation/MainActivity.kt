package com.inhatc.haramnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.inhatc.haramnavigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // 데이터 바인딩 사용
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.apply {
            // NavController 획득
            val navController = findNavController(R.id.demo_nav_host_fragment)
            bnvMain.setupWithNavController(navController)
        }
    }
}