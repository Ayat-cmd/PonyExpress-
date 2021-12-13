package pro.midev.ponyexpress.ui.main.orders.arrange_departure

import android.content.Context
import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpView
import org.koin.core.inject
import pro.midev.ponyexpress.Screens
import pro.midev.ponyexpress.common.base.BottomSheetDialogController
import pro.midev.ponyexpress.common.enums.BottomSheetDialogType
import pro.midev.ponyexpress.controllers.BottomVisibilityController
import pro.midev.ponyexpress.extensions.getHeading
import pro.midev.ponyexpress.extensions.saveHeading
import pro.midev.supersld.common.base.BasePresenter

@InjectViewState
class ArrangeDeparturePresenter : BasePresenter<MvpView>() {

    private val bottomSheetDialogController: BottomSheetDialogController by inject()

    private val context: Context by inject()
    private val bottomVisibilityController: BottomVisibilityController by inject()
    override fun attachView(view: MvpView?) {
        super.attachView(view)
        bottomVisibilityController.hide()
    }

    fun back() {
        router?.exit()
    }

    fun onStreetBtn(street: String) {
        router?.navigateTo(Screens.Street)
        context.saveHeading(street)
    }

    fun onHouseBtn(house: String) {
        router?.navigateTo(Screens.House)
        context.saveHeading(house)
    }

    fun onAddressBook() {
        bottomSheetDialogController.show(BottomSheetDialogType.ADDRESS_BOOK)
    }

    fun onAdditionalServices() {
        bottomSheetDialogController.show(BottomSheetDialogType.ADDITIONAL_SERVICES)
    }

    fun paymentScreen() {
        router?.navigateTo(Screens.PaymentScreen)
    }

    fun mapScreen() {
        router?.navigateTo(Screens.MapScreen)
    }
}