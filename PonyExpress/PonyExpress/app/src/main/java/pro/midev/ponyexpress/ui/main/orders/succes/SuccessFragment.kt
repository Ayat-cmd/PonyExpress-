package pro.midev.ponyexpress.ui.main.orders.succes
import android.os.Bundle
import android.view.View
import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.presenter.InjectPresenter
import kotlinx.android.synthetic.main.fragment_success.*
import pro.midev.ponyexpress.R
import pro.midev.ponyexpress.extensions.getAcquiring
import pro.midev.ponyexpress.extensions.getAcquiringBtnFillBottom
import pro.midev.ponyexpress.extensions.getAcquiringBtnStrokeTop
import pro.midev.supersld.common.base.BaseFragment

class SuccessFragment : BaseFragment(R.layout.fragment_success), MvpView {

    @InjectPresenter
    lateinit var presenter: SuccessPresenter

    override fun onBackPressed() { }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        btnCallCourier.visibility = View.INVISIBLE  //надо сделать проверку на успех или ошибку
        with(textAcquiring) {
            text = arguments?.getString(ARG_SUCCESS)!!
        }

        with(btnCallCourier) {
            text = arguments?.getString(ARG_BTN_TOP)!!
            setOnClickListener{ presenter.callCourier() }
        }

        with(btnProceed) {
            text = arguments?.getString(ARG_BTN_BOTOOM)!!
        }
    }

    companion object {
        private const val ARG_SUCCESS = "arg_success"
        private const val ARG_BTN_TOP = "arg_top"
        private const val ARG_BTN_BOTOOM = "arg_bottom"


        fun newText(success: String, resultBtnTopAcquiring: String, resultBtnBottomAcquiring: String) : SuccessFragment {
            val fragment = SuccessFragment()
            val args = Bundle()
            args.putString(ARG_SUCCESS, success)
            args.putString(ARG_BTN_TOP, resultBtnTopAcquiring)
            args.putString(ARG_BTN_BOTOOM, resultBtnBottomAcquiring)
            fragment.arguments = args
            return fragment
        }
    }
}