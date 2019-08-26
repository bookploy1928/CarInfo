package buu.informatics.s59160378.car

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var licenseCarSlot1 = ""
    var carBrandSlot1 = ""
    var driverSlot1 = ""

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
        val numberEdit = findViewById<EditText>(R.id.license_number2)
        val carBrandEdit = findViewById<EditText>(R.id.carBrand)
        val driverEdit = findViewById<EditText>(R.id.driver1)
        licenseCarSlot1 = numberEdit.text.toString()
        carBrandSlot1 = carBrandEdit.text.toString()
        driverSlot1 = driverEdit.text.toString()
    }

    private fun showCarSlot1 (view: View) {

        val numberSlot1 = findViewById<Button>(R.id.slot1)
        val numberEdit = findViewById<EditText>(R.id.license_number2)
        val carBrandEdit = findViewById<EditText>(R.id.carBrand)
        val driverEdit = findViewById<EditText>(R.id.driver1)
        
        numberSlot1.text = licenseCarSlot1
        numberSlot1.visibility = View.GONE
        numberSlot1.visibility = View.VISIBLE

        numberEdit.text = licenseCarSlot1
        numberEdit.visibility = View.GONE
        numberEdit.visibility = View.VISIBLE

        carBrandEdit.text = carBrandSlot1
        carBrandEdit.visibility = View.GONE
        carBrandEdit.visibility = View.VISIBLE

        driverEdit.text = driverSlot1
        driverEdit.visibility = View.GONE
        driverEdit.visibility = View.VISIBLE







    }

}
