package pro.midev.ponyexpress.ui.main.orders.arrange_departure
import android.os.Bundle
import android.view.View
import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.presenter.InjectPresenter
import kotlinx.android.synthetic.main.fragment_arrange_departure.*
import pro.midev.ponyexpress.R
import pro.midev.supersld.common.base.BaseFragment

class ArrangeDepartureFragment : BaseFragment(R.layout.fragment_arrange_departure), MvpView {

    @InjectPresenter
    lateinit var presenter: ArrangeDeparturePresenter

    override fun onBackPressed() {
        presenter.back()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(vToolbar) {
            setTitle("Оформить отправление")
            onBack(this@ArrangeDepartureFragment::onBackPressed)
        }

        with(vStreet) {
            setTitle("Улица")
            setOnClickListener { presenter.onStreetBtn("Улица") }
        }

        with(vHouse) {
            setTitle("Дом")
            setOnClickListener { presenter.onHouseBtn("Дом") }

        }

        with(btnChooseAddress) {
            setOnClickListener { presenter.onAddressBook() }
        }

        with(vAddress) {
            hideDivider()
            setTitle("Выберите отделение")
            setOnClickListener { presenter.mapScreen() }
        }

        with(vAdditionalServices) {
            hideDivider()
            setTitle("Выберите дополнительные услуги")
            setOnClickListener { presenter.onAdditionalServices() }
        }

        with(btnCheckoutSend) {
            setOnClickListener{ presenter.paymentScreen() }
        }
    }

}