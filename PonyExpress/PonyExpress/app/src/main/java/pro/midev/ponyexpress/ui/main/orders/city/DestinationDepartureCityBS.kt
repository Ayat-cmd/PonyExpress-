package pro.midev.ponyexpress.ui.main.orders.city

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.bs_city.*
import pro.midev.ponyexpress.R
import pro.midev.ponyexpress.common.MvpBottomSheetDialogFragment
import android.text.Editable
import android.text.TextWatcher
import pro.midev.ponyexpress.extensions.getHeading

class DestinationDepartureCityBS : MvpBottomSheetDialogFragment(R.layout.bs_city) {


    @SuppressLint("MissingSuperCall")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        clear_text_btn.visibility = View.INVISIBLE;
        header_title.text = requireContext().getHeading()
        find_city.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) { }
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) { }
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                if(s.toString() != "") {
                    clear_text_btn.visibility = View.VISIBLE
                } else {
                    clear_text_btn.visibility = View.INVISIBLE
                }
            }
        })

        clear_text_btn.setOnClickListener { find_city.setText("") }
        close_btn.setOnClickListener { dismiss() }
    }
}