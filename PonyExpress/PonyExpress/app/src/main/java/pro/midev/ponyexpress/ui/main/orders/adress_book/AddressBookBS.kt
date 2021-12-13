package pro.midev.ponyexpress.ui.main.orders.adress_book

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import com.arellomobile.mvp.MvpView
import kotlinx.android.synthetic.main.bs_address_book.*
import pro.midev.ponyexpress.R
import pro.midev.ponyexpress.common.MvpBottomSheetDialogFragment

class AddressBookBS: MvpBottomSheetDialogFragment(R.layout.bs_address_book), MvpView {

    @SuppressLint("MissingSuperCall")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(btnClose) {
            setOnClickListener { dismiss() }
        }
    }

}