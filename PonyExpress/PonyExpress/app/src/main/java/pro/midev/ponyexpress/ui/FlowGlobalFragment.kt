package pro.midev.ponyexpress.ui

import android.os.Bundle
import com.arellomobile.mvp.presenter.InjectPresenter
import kotlinx.android.synthetic.main.fragment_arrange_departure.*
import pro.midev.ponyexpress.Screens
import pro.midev.ponyexpress.common.MvpBottomSheetDialogFragment
import pro.midev.ponyexpress.common.enums.*
import pro.midev.ponyexpress.ui.main.orders.additional_services.AdditionalServicesBS
import pro.midev.ponyexpress.ui.main.orders.adress_book.AddressBookBS
import pro.midev.ponyexpress.ui.main.orders.city.DestinationDepartureCityBS
import pro.midev.ponyexpress.ui.main.orders.dispatch_size_or_receipt_data.DispatchSizeOrReceiptDataBS
import pro.midev.ponyexpress.ui.main.orders.street_or_house.StreetOrHouseBS
import pro.midev.supersld.common.base.FlowFragment
import ru.terrakok.cicerone.commands.BackTo
import ru.terrakok.cicerone.commands.Replace

class FlowGlobalFragment : FlowFragment(ROUTER), GlobalView {

    companion object {
        const val ROUTER = "APP_ROUTER"
    }

    @InjectPresenter
    lateinit var presenter: GlobalPresenter

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if (childFragmentManager.fragments.isEmpty()) {
            navigator.applyCommands(
                arrayOf(
                    BackTo(null),
                    Replace(Screens.Splash)
                )
            )
        }
    }

    override fun showBottomSheet(type: BottomSheetDialogType, data: Any?) {
        val bottomSheet: MvpBottomSheetDialogFragment = when (type) {
            BottomSheetDialogType.DESTINATION_DEPARTURE_CITY -> DestinationDepartureCityBS()
            BottomSheetDialogType.DISPATCH_SIZE_OR_RECEIPT_DATE -> DispatchSizeOrReceiptDataBS()
            BottomSheetDialogType.ADDRESS_BOOK -> AddressBookBS()
            BottomSheetDialogType.ADDITIONAL_SERVICES -> AdditionalServicesBS()
        }

        bottomSheet.show(childFragmentManager, bottomSheet.tag)
    }
}