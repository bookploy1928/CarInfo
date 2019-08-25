package buu.informatics.s59160378.car

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var licenseCarSlot1 = ""
    val carBrandSlot1 = ""
    val driverSlot1 = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        update.setOnClickListener{
            clickHandlerFunction(it)
        }
        slot1.setOnClickListener{
            clickHandlerFunction(it)
        }
        findViewById<Button>(R.id.update).setOnClickListener {
            addCar(it)
        }
        findViewById<Button>(R.id.slot1).setOnClickListener {
            showCarSlot1(it)
        }
    }
    private fun clickHandlerFunction(viewThatIsClicked: View) {
// Add code to perform the button click event
    }
    private fun addCar(view: View) {
        val number = findViewById<EditText>(R.id.license_number2)
        licenseCarSlot1 = number.text.toString()
    }

    private fun showCarSlot1 (view: View) {

        val numberSlot1 = findViewById<Button>(R.id.slot1)
        numberSlot1.text = licenseCarSlot1
        numberSlot1.visibility = View.GONE
        numberSlot1.visibility = View.VISIBLE

    }

}
