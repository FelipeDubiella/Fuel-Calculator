package com.felipedubiella.fuel_calculator

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.felipedubiella.fuel_calculator.databinding.ActivityConsumptionBinding
import com.felipedubiella.fuel_calculator.databinding.ActivityResultBinding

class resultActivity : AppCompatActivity() {
    private val binding by lazy { ActivityResultBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        with(binding) {

            val bundle = intent.extras
            if (bundle != null) {

                val fuelPrice = bundle.getFloat("fuelPrice")
                val consumption = bundle.getFloat("consumption")
                val km = bundle.getFloat("km")
                val result = (km / consumption) * fuelPrice


                tvKm.text = "$km"
                tvConsumption.text = "$consumption"
                tvPrice.text = "$fuelPrice"
                tvResult.text = "$ $result"

                btnNew.setOnClickListener {

                    val intent = Intent(this@resultActivity, MainActivity::class.java)
                    startActivity(intent)
                }

            }
        }


    }
}