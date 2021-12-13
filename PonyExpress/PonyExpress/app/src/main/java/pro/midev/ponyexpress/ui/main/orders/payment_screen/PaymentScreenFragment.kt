package pro.midev.ponyexpress.ui.main.orders.payment_screen
import android.os.Bundle
import android.view.View
import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.presenter.InjectPresenter
import kotlinx.android.synthetic.main.fragment_payment_screen.*
import pro.midev.ponyexpress.R
import pro.midev.supersld.common.base.BaseFragment

class PaymentScreenFragment : BaseFragment(R.layout.fragment_payment_screen), MvpView {

    @InjectPresenter
    lateinit var presenter: PaymentScreenPresenter

    private lateinit var success : String

    private lateinit var resultBtnTopAcquiring : String
    private lateinit var resultBtnBottomAcquiring : String

    override fun onBackPressed() {
        TODO("Not yet implemented")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(btnChoose) {
            success = "Отправление успешно оформлено\n\n№ 33220545\n\nВы можете отследить отправление в \n«Мои отправления»"
            resultBtnTopAcquiring = "Вызвать курьера"
            resultBtnBottomAcquiring = "Продолжить"
            setOnClickListener{ presenter.resultSuccess(success, resultBtnTopAcquiring, resultBtnBottomAcquiring) }
        }
    }
}