package pro.midev.ponyexpress.ui.main.orders.dispatch_size_or_receipt_data

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.bs_dispatch_size.*
import pro.midev.ponyexpress.R
import pro.midev.ponyexpress.common.MvpBottomSheetDialogFragment
import pro.midev.ponyexpress.extensions.getHeading

class DispatchSizeOrReceiptDataBS : MvpBottomSheetDialogFragment(R.layout.bs_dispatch_size) {

    @SuppressLint("MissingSuperCall")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        close_btn.setOnClickListener { dismiss() }
        header_title.text = requireContext().getHeading()
    }
}