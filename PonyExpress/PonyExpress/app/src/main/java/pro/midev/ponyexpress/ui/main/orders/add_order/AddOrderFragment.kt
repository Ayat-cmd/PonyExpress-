package pro.midev.ponyexpress.ui.main.orders.add_order
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.presenter.InjectPresenter
import kotlinx.android.synthetic.main.fragment_add_order.*
import pro.midev.ponyexpress.R
import pro.midev.supersld.common.base.BaseFragment

class AddOrderFragment : BaseFragment(R.layout.fragment_add_order), MvpView {

    @InjectPresenter
    lateinit var presenter: AddOrderPresenter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(vToolbar) {
            setTitle("Рассчитать и отправить")
            onBack(this@AddOrderFragment::onBackPressed)
        }

        with(vCity) {
            setTitle("Город")
            hideDivider()
            setOnClickListener { presenter.onCityClick("Город отпраления") }
        }

        with(vCityTo) {
            setTitle("Город")
            hideDivider()
            setOnClickListener { presenter.onCityClick("Город назначения") }
        }
        with(vDate) {
            setTitle("Возможная дата")
            hideDivider()
            setOnClickListener { presenter.onDispatchSizeDateReceiptClick("Дата приема пасылки") }
        }
        with(vOrder) {
            setTitle("Размеры и вес отправления")
            hideDivider()
            setOnClickListener { presenter.onDispatchSizeDateReceiptClick("Размер отправления") }
        }
        with(ivPrice) {
            setPrefix("₽")
            setHint("")
        }

        with(btnFurther){
            setOnClickListener { presenter.arrangeDeparture() }
        }

        with(radioGroup) {
//            setOnCheckedChangeListener { _, checkedId ->
//                // get the radio group checked radio button
//                findViewById<RadioButton>(checkedId)?.apply { }
//            }
        }
    }

    override fun onBackPressed() {
        presenter.back()
    }
}