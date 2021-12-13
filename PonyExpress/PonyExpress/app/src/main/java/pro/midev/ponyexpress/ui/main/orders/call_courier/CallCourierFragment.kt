package pro.midev.ponyexpress.ui.main.orders.call_courier
import android.os.Bundle
import android.view.View
import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.presenter.InjectPresenter
import kotlinx.android.synthetic.main.fragment_call_courier.*
import pro.midev.ponyexpress.R
import pro.midev.supersld.common.base.BaseFragment

class CallCourierFragment : BaseFragment(R.layout.fragment_call_courier), MvpView {

    @InjectPresenter
    lateinit var presenter: CallCourierPresenter

    override fun onBackPressed() {
        presenter.back()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(vToolbar) {
            setTitle("Вызов курьера")
            onBack(this@CallCourierFragment::onBackPressed)
        }
    }

}