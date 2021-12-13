package pro.midev.ponyexpress.ui.main.orders.succes

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpView
import org.koin.core.inject
import pro.midev.ponyexpress.Screens
import pro.midev.ponyexpress.controllers.BottomVisibilityController
import pro.midev.supersld.common.base.BasePresenter

@InjectViewState
class SuccessPresenter : BasePresenter<MvpView>() {


    private val bottomVisibilityController: BottomVisibilityController by inject()
    override fun attachView(view: MvpView?) {
        super.attachView(view)
        bottomVisibilityController.hide()
    }

    fun callCourier() {
        router?.navigateTo(Screens.CallCourier)
    }

    fun back() {
        router?.exit()
    }
}