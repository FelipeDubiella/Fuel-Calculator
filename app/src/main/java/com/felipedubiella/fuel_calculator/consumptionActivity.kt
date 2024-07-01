package com.felipedubiella.fuel_calculator

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
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

        with(binding) {


            btnNext.setOnClickListener {


                val bundle = intent.extras
                if (bundle != null){

                    val fuelPrice = bundle.getFloat("fuelPrice")
                    val consumption: String = edtConsumption.text.toString()

                    val intent = Intent(this@consumptionActivity, kmActivity::class.java)

                    if (consumption.isNotEmpty()) {
                        intent.putExtra("consumption", consumption.toFloat())
                        intent.putExtra("fuelPrice", fuelPrice.toFloat())
                        startActivity(intent)
                    } else {
                        Toast.makeText(
                            this@consumptionActivity,
                            "Fill the text field to continue",
                            Toast.LENGTH_SHORT
                        ).show()
                    }


                }


            }


        }


    }
}

