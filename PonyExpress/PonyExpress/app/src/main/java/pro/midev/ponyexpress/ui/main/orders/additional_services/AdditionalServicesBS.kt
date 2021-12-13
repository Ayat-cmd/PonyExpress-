package pro.midev.ponyexpress.ui.main.orders.additional_services

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import com.arellomobile.mvp.MvpView
import kotlinx.android.synthetic.main.bs_additional_services.*
import pro.midev.ponyexpress.R
import pro.midev.ponyexpress.common.MvpBottomSheetDialogFragment

class AdditionalServicesBS: MvpBottomSheetDialogFragment(R.layout.bs_additional_services), MvpView {

    @SuppressLint("MissingSuperCall")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(btnClose) {
            setOnClickListener { dismiss() }
        }

        with(btnChoose) { }
    }

}