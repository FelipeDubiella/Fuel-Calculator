package com.felipedubiella.fuel_calculator

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.felipedubiella.fuel_calculator.databinding.ActivityConsumptionBinding
import com.felipedubiella.fuel_calculator.databinding.ActivityFuelBinding

class consumptionActivity : AppCompatActivity() {
    private val binding by lazy { ActivityConsumptionBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        with(binding){

            val bundle = intent.extras
            if (bundle != null){



            }


        }



        }
    }
