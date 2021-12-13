package pro.midev.ponyexpress.ui.main.orders.call_courier

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
class CallCourierPresenter : BasePresenter<MvpView>() {

    private val bottomVisibilityController: BottomVisibilityController by inject()
    override fun attachView(view: MvpView?) {
        super.attachView(view)
        bottomVisibilityController.hide()
    }

    fun back() {
        router?.exit()
    }
}