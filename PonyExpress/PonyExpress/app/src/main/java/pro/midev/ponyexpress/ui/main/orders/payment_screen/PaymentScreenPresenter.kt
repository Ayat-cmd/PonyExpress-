package pro.midev.ponyexpress.ui.main.orders.payment_screen

import android.content.Context
import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpView
import org.koin.core.inject
import pro.midev.ponyexpress.Screens
import pro.midev.ponyexpress.controllers.BottomVisibilityController
import pro.midev.ponyexpress.extensions.saveAcquiring
import pro.midev.ponyexpress.extensions.saveAcquiringBtnFillBottom
import pro.midev.ponyexpress.extensions.saveAcquiringBtnStrokeTop
import pro.midev.supersld.common.base.BasePresenter

@InjectViewState
class PaymentScreenPresenter : BasePresenter<MvpView>() {

    private val context: Context by inject()
    private val bottomVisibilityController: BottomVisibilityController by inject()
    override fun attachView(view: MvpView?) {
        super.attachView(view)
        bottomVisibilityController.hide()
    }

    fun resultSuccess(success: String, resultBtnTopAcquiring: String, resultBtnBottomAcquiring: String) {
        router?.navigateTo(Screens.ResultSuccess(success, resultBtnTopAcquiring, resultBtnBottomAcquiring))
    }

    fun back() {
        router?.exit()
    }
}