package com.example.proverresheniegabitov

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.proverresheniegabitov.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val number1 = 0
        val number2 = 0
        val oper = 0
        val otv = 0
        val otv2= 0
        val prover = 0
        binding.button.setEnabled(false);
        binding.button2.setEnabled(false);
        val prav = 0
        val neprav = 0
        val proverprim = 0

        val bStart = findViewById<Button>(R.id.button3)
        bStart.setOnClickListener{
            number1 == (10..99).random()
            number2 == (10..99).random()
            oper == (1..3).random()
            prover ==(1..2).random()
            if(oper == 1)
            {
                binding.textView15.setText(String.format("%d",number1))
                binding.textView16.setText(String.format("+"))
                binding.textView17.setText(String.format("%d",number2))
                otv == number1+number2
                otv2== otv
                if(prover==1){
                    binding.textView18.setText(String.format("%d",otv))
                }else
                    if (prover==2){
                        otv==(10..99).random()
                        binding.textView18.setText(String.format("%d",otv))
                    }
            }else
                if(oper == 2)
                {
                    binding.textView15.setText(String.format("%d",number1))
                    binding.textView16.setText(String.format("-"))
                    binding.textView17.setText(String.format("%d",number2))
                    otv == number1-number2
                    binding.textView18.setText(String.format("%d",otv))
                    otv2== otv
                    if(prover==1){
                        binding.textView18.setText(String.format("%d",otv))
                    }else
                        if (prover==2){
                            otv==(10..99).random()
                            binding.textView18.setText(String.format("%d",otv))
                        }
                }else
                    if(oper==3)
                    {
                        binding.textView15.setText(String.format("%d",number1))
                        binding.textView16.setText(String.format("/"))
                        binding.textView17.setText(String.format("%d",number2))
                        otv == number1/number2
                        binding.textView18.setText(String.format("%d",otv))
                        otv2== otv
                        if(prover==1){
                            binding.textView18.setText(String.format("%d",otv))
                        }else
                            if (prover==2){
                                otv==(10..99).random()
                                binding.textView18.setText(String.format("%d",otv))
                            }
                    }
            binding.button.setEnabled(true);
            binding.button2.setEnabled(true);
        }
        val bVer = findViewById<Button>(R.id.button)
        bVer.setOnClickListener{
            if(otv==otv2) {
                prav + 1
                binding.textView5.setText(String.format(",",prav))
            }else
            {
                neprav + 1
                binding.textView6.setText(String.format("",neprav))
            }
            proverprim+1
            binding.textView2.setText(String.format("",proverprim))
            binding.button.setEnabled(false);
            binding.button2.setEnabled(false);
        }
        val bNeVer = findViewById<Button>(R.id.button2)
        bNeVer.setOnClickListener {
            if(otv==otv2) {
                neprav + 1
                binding.textView6.setText(String.format("",neprav))
            }else
            {
                prav + 1
                binding.textView5.setText(String.format("",prav))
            }
            proverprim+1
            binding.textView2.setText(String.format("",proverprim))
            binding.button.setEnabled(false);
            binding.button2.setEnabled(false);
        }
    }
}