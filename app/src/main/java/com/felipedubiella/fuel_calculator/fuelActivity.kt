package com.felipedubiella.fuel_calculator

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.felipedubiella.fuel_calculator.databinding.ActivityFuelBinding
import com.felipedubiella.fuel_calculator.databinding.ActivityMainBinding

class fuelActivity : AppCompatActivity() {
    private val binding by lazy { ActivityFuelBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        with(binding) {

            btnNext.setOnClickListener {

                val fuelPrice: String = edtFuelPrice.text.toString()

                val intent = Intent(this@fuelActivity, consumptionActivity::class.java)

                if (fuelPrice.isNotEmpty()){
                    intent.putExtra("fuelPrice", fuelPrice.toFloat())
                    startActivity(intent)
                }else{
                    Toast.makeText(this@fuelActivity, "Fill the text field to continue", Toast.LENGTH_SHORT).show()
                }

            }


        }

    }
}
