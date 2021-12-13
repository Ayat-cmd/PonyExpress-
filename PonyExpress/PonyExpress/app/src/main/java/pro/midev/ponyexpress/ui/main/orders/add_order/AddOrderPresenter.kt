package pro.midev.ponyexpress.ui.main.orders.add_order

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
class AddOrderPresenter : BasePresenter<MvpView>() {

    private val bottomSheetDialogController: BottomSheetDialogController by inject()

    private val context: Context by inject()
    private val bottomVisibilityController: BottomVisibilityController by inject()
    override fun attachView(view: MvpView?) {
        super.attachView(view)
        bottomVisibilityController.hide()
    }

    fun onCityClick(city: String) {
        context.saveHeading(city)
        bottomSheetDialogController.show(BottomSheetDialogType.DESTINATION_DEPARTURE_CITY)
    }

    fun onDispatchSizeDateReceiptClick(dataReceiptOrSizeDispatch: String) {
        context.saveHeading(dataReceiptOrSizeDispatch)
        bottomSheetDialogController.show(BottomSheetDialogType.DISPATCH_SIZE_OR_RECEIPT_DATE)
    }

    fun arrangeDeparture() {
        router?.navigateTo(Screens.ArrangeDeparture)
    }

    fun back() {
        router?.exit()
    }
}