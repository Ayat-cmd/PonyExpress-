package pro.midev.ponyexpress.ui.main.orders.street_or_house

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
class StreetOrHousePresenter : BasePresenter<MvpView>() {


    private val bottomVisibilityController: BottomVisibilityController by inject()
    override fun attachView(view: MvpView?) {
        super.attachView(view)
        bottomVisibilityController.hide()
    }


    fun back() {
        router?.exit()
    }
}