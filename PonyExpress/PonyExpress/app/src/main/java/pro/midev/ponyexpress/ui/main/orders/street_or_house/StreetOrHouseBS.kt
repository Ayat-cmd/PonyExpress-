package pro.midev.ponyexpress.ui.main.orders.street_or_house

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.presenter.InjectPresenter
import kotlinx.android.synthetic.main.bs_street_home.*
import kotlinx.android.synthetic.main.bs_street_home.clear_text_btn
import kotlinx.android.synthetic.main.bs_street_home.find_city
import pro.midev.ponyexpress.R
import pro.midev.ponyexpress.common.MvpBottomSheetDialogFragment
import pro.midev.ponyexpress.extensions.getHeading
import pro.midev.supersld.common.base.BaseFragment

class StreetOrHouseBS : BaseFragment(R.layout.bs_street_home), MvpView {

    @InjectPresenter
    lateinit var presenter: StreetOrHousePresenter
    override fun onBackPressed() {
        presenter.back()
    }

    @SuppressLint("MissingSuperCall")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(vToolbar) {
            requireContext().getHeading()?.let { setTitle(it) }
            onBack(this@StreetOrHouseBS::onBackPressed)
        }
        clear_text_btn.visibility = View.INVISIBLE;
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
    }
}