package com.patika.week3

import android.app.DatePickerDialog
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.nvt.color.ColorPickerDialog
import com.patika.week3.databinding.FragmentDayBinding
import java.text.SimpleDateFormat
import java.util.*

class DayFragment : Fragment() {

    private var _binding: FragmentDayBinding? = null
    private val binding get() = _binding!!
    private lateinit var buttonDatePicker: Button
    private lateinit var buttonColorPicker: Button
    private lateinit var editTextDay: EditText
    private lateinit var buttonSave: Button
    private lateinit var todaysDate: String
    private lateinit var myCalendar: Calendar
    private lateinit var textViewTodaysDate: TextView
    var newBackgroundColor: Int = 0

    /**
     *
     * @param savedInstanceState Gets key-pair values that we added in onSaveInstanceState()
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        todaysDate = savedInstanceState?.getString("TODAY_DATE") ?: ""
        if (savedInstanceState != null) {
            newBackgroundColor = savedInstanceState.getInt("TODAY_COLOR")
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDayBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonDatePicker = binding.buttonDatePick
        buttonSave = binding.buttonSave
        buttonColorPicker = binding.buttonColor
        textViewTodaysDate = binding.textViewTodaysDate
        textViewTodaysDate.text = todaysDate

        binding.constraintDay.setBackgroundColor(newBackgroundColor)

        myCalendar = Calendar.getInstance()
        val datePicker = DatePickerDialog.OnDateSetListener { _, year, month, dayOfMonth ->
            myCalendar.set(Calendar.YEAR, year)
            myCalendar.set(Calendar.MONTH, month)
            myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
            updateDatePickerButton(myCalendar)
        }
        buttonColorPicker.setOnClickListener {
            val colorPicker = ColorPickerDialog(
                context,
                Color.BLACK, // color init
                true, // true is show alpha
                object : ColorPickerDialog.OnColorPickerListener {
                    override fun onCancel(dialog: ColorPickerDialog?) {
                        // handle click button Cancel
                    }

                    override fun onOk(dialog: ColorPickerDialog?, colorPicker: Int) {
                        binding.constraintDay.setBackgroundColor(colorPicker)
                        newBackgroundColor = colorPicker
                        // handle click button OK
                    }
                })
            colorPicker.show()
        }

        buttonDatePicker.setOnClickListener {
            DatePickerDialog(
                requireActivity(),
                datePicker,
                myCalendar.get(Calendar.YEAR),
                myCalendar.get(Calendar.MONTH),
                myCalendar.get(Calendar.DAY_OF_MONTH)
            ).show()

        }

        buttonSave.setOnClickListener {
            val newDay = Day(todaysDate, newBackgroundColor, editTextDay.text.toString())
            Navigation.findNavController(view).navigate(R.id.action_dayFragment_to_homeFragment)
        }
    }

    private fun updateDatePickerButton(myCalendar: Calendar): String {
        val myFormat = "dd-MM-yyyy"
        val sdf = SimpleDateFormat(myFormat, Locale.ROOT)
        todaysDate = sdf.format(myCalendar.time)
        textViewTodaysDate.text = todaysDate
        return todaysDate
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("TODAY_DATE", todaysDate)
        outState.putInt("TODAY_COLOR", newBackgroundColor)
    }


}