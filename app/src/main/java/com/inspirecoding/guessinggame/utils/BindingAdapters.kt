package com.inspirecoding.guessinggame.utils

import android.content.Context
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.inspirecoding.guessinggame.R


@BindingAdapter("app:state", "android:context")
fun gameRunning(button: Button, isRunning: Boolean, context: Context)
{
    when(isRunning)
    {
        true -> button.text = context.getString(R.string.guess)
        false -> button.text = context.getString(R.string.new_game)
    }
}

@BindingAdapter("app:resultImage")
fun resultImage(imageView: ImageView, result: GuessResult?)
{
    result?.let { _result ->
        when(_result)
        {
            GuessResult.LOWER -> imageView.setImageResource(R.drawable.arrow_down)
            GuessResult.HIGHER -> imageView.setImageResource(R.drawable.arrow_up)
            GuessResult.WIN -> imageView.setImageResource(R.drawable.trophy)
            GuessResult.GUESSING -> imageView.setImageDrawable(null)
        }
    }
}

@BindingAdapter("app:resultText", "android:context")
fun resultText(textView: TextView, result: GuessResult?, context: Context)
{
    result?.let { _result ->
        when(_result)
        {
            GuessResult.LOWER -> textView.text = context.getString(R.string.lower)
            GuessResult.HIGHER -> textView.text = context.getString(R.string.higher)
            GuessResult.WIN -> textView.text = context.getString(R.string.you_win)
            GuessResult.GUESSING -> textView.text = ""
        }
    }
}