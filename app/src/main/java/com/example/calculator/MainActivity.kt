package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val math = Math()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setUpListener()
        setContentView(binding.root)
    }

    private fun setUpListener() {
      binding.add.setOnClickListener{
          result(math.add(binding.firstCalcEdit.text.toString(), binding.secondCalcEdit.text.toString()))
      }
        binding.divide.setOnClickListener{
          doubleRes(math.divide(binding.firstCalcEdit.text.toString().toDouble(), binding.secondCalcEdit.text.toString().toDouble()))
      }
        binding.btnCalcMinus.setOnClickListener {
            result(math.minus(binding.firstCalcEdit.text.toString(),binding.secondCalcEdit.text.toString()))
        }
        binding.btnCalcIncrease.setOnClickListener {
            result(math.increase(binding.firstCalcEdit.text.toString(),binding.secondCalcEdit.text.toString()))
        }
        binding.btnCalcPercent.setOnClickListener {
            doubleRes(math.percent(binding.firstCalcEdit.text.toString().toDouble(),binding.secondCalcEdit.text.toString().toDouble()))
        }
    }

    private fun result(value:String){
        binding.calcResult.text = value
    }
    private fun divideRes(value:Int){
        binding.calcResult.text = value.toString()
    }
    private fun doubleRes(value:Double){
        binding.calcResult.text = value.toString()
    }

}