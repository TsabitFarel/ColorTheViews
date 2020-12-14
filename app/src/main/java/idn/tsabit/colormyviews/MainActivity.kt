package idn.tsabit.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun setListeners() {
        val clickableView: List<View> =
            listOf(txt_box_one, txt_box_two, txt_box_three, txt_box_four, txt_box_five, btn_red,
            btn_green, btn_yellow)

        for (item in clickableView) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    fun makeColored(view: View) {
        when(view.id) {

            R.id.txt_box_one -> view.setBackgroundColor(Color.GREEN)
            R.id.txt_box_two -> view.setBackgroundColor(Color.BLUE)

            R.id.txt_box_three -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.txt_box_four -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.txt_box_five -> view.setBackgroundResource(android.R.color.holo_green_light)

            R.id.btn_yellow -> txt_box_three.setBackgroundResource(R.color.yellow)
            R.id.btn_red -> txt_box_four.setBackgroundResource(R.color.red)
            R.id.btn_green -> txt_box_five.setBackgroundResource(R.color.green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}