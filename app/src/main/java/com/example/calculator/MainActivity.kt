package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder
import javax.xml.xpath.XPathExpression

class MainActivity : AppCompatActivity() {

    lateinit var Binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        Binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(Binding.root)

        Binding.btnAc.setOnClickListener({
            Binding.inputtext.text=""
            Binding.outputtext.text=""
        })

        Binding.btn0.setOnClickListener({
            Binding.inputtext.append("0")
        })

        Binding.btn1.setOnClickListener({
            Binding.inputtext.append("1")
        })

        Binding.btn2.setOnClickListener({
            Binding.inputtext.append("2")
        })

        Binding.btn3.setOnClickListener({
            Binding.inputtext.append("3")
        })

        Binding.btn4.setOnClickListener({
            Binding.inputtext.append("4")
        })

        Binding.btn5.setOnClickListener({
            Binding.inputtext.append("5")
        })

        Binding.btn6.setOnClickListener({
            Binding.inputtext.append("6")
        })

        Binding.btn7.setOnClickListener({
            Binding.inputtext.append("7")
        })

        Binding.btn8.setOnClickListener({
            Binding.inputtext.append("8")
        })

        Binding.btn9.setOnClickListener({
            Binding.inputtext.append("9")
        })

        Binding.btnDot.setOnClickListener({
            Binding.inputtext.append(".")
        })

        Binding.btnPlus.setOnClickListener({
            Binding.inputtext.append("+")
        })

        Binding.btnMinus.setOnClickListener({
            Binding.inputtext.append("-")
        })

        Binding.btnMultiplication.setOnClickListener({
            Binding.inputtext.append("*")
        })
        Binding.btnDivide.setOnClickListener({
            Binding.inputtext.append("/")
        })

        Binding.btnStartBracket.setOnClickListener({
            Binding.inputtext.append("(")
        })

        Binding.btnEndBracket.setOnClickListener({
            Binding.inputtext.append(")")
        })

        Binding.btnEqual.setOnClickListener({
            val expression=ExpressionBuilder(Binding.inputtext.text.toString()).build()
            val result=expression.evaluate()
            val longresult=result.toLong()
            if (result== longresult.toDouble()){
                Binding.outputtext.text=longresult.toString()
            }else{
                Binding.outputtext.text=result.toString()
            }
        })
    }
}

