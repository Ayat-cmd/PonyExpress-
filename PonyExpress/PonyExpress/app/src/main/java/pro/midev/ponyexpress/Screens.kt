package pro.midev.ponyexpress

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import pro.midev.ponyexpress.ui.FlowGlobalFragment
import pro.midev.ponyexpress.ui.main.FlowMainFragment
import pro.midev.ponyexpress.ui.main.MainContainerFragment
import pro.midev.ponyexpress.ui.main.auth.AuthFragment
import pro.midev.ponyexpress.ui.main.auth.reg_phone.RegPhoneFragment
import pro.midev.ponyexpress.ui.main.auth.reg_sms_code.RegSmsCodeFragment
import pro.midev.ponyexpress.ui.main.notifications.FlowNotificationsFragment
import pro.midev.ponyexpress.ui.main.notifications.NotificationsFragment
import pro.midev.ponyexpress.ui.main.orders.FlowOrdersFragment
import pro.midev.ponyexpress.ui.main.orders.MyOrdersFragment
import pro.midev.ponyexpress.ui.main.orders.add_order.AddOrderFragment
import pro.midev.ponyexpress.ui.main.orders.arrange_departure.ArrangeDepartureFragment
import pro.midev.ponyexpress.ui.main.orders.call_courier.CallCourierFragment
import pro.midev.ponyexpress.ui.main.orders.order_detail.OrderDetailFragment
import pro.midev.ponyexpress.ui.main.orders.payment_screen.PaymentScreenFragment
import pro.midev.ponyexpress.ui.main.orders.street_or_house.StreetOrHouseBS
import pro.midev.ponyexpress.ui.main.orders.succes.SuccessFragment
import pro.midev.ponyexpress.ui.main.other.FlowOtherFragment
import pro.midev.ponyexpress.ui.main.other.OtherFragment
import pro.midev.ponyexpress.ui.main.other.aboutApp.AboutApplicationFragment
import pro.midev.ponyexpress.ui.main.other.adresses.AddressesFragment
import pro.midev.ponyexpress.ui.main.other.adresses.add_address.AddAddressesFragment
import pro.midev.ponyexpress.ui.main.other.adresses.address_detail.DetailAddressesFragment
import pro.midev.ponyexpress.ui.main.other.feedback.FeedbackFragment
import pro.midev.ponyexpress.ui.main.points.FlowPointsFragment
import pro.midev.ponyexpress.ui.main.points.PointsFragment
import pro.midev.ponyexpress.ui.main.points.filter.MapFilterFragment
import pro.midev.ponyexpress.ui.main.points.point_detail.PointDetailFragment
import pro.midev.ponyexpress.ui.main.points.search.SearchPointsFragment
import pro.midev.ponyexpress.ui.splash.SplashFragment
import ru.terrakok.cicerone.android.pure.AppScreen
import ru.terrakok.cicerone.android.support.SupportAppScreen

object Screens {

    /** Глобальный роутер */

    object FlowGlobal : SupportAppScreen() {
        override fun getFragment() = FlowGlobalFragment()
    }

    object Splash : SupportAppScreen() {
        override fun getFragment() = SplashFragment()
    }

    /** Контейнер роутер */

    object FlowMain : SupportAppScreen() {
        override fun getFragment() = FlowMainFragment()
    }

    object MainContainer : SupportAppScreen() {
        override fun getFragment() = MainContainerFragment.create()
    }

    /** Заказы роутер */

    object FlowOrders : SupportAppScreen() {
        override fun getFragment(): Fragment = FlowOrdersFragment()
    }

    object MyOrders: SupportAppScreen() {
        override fun getFragment(): Fragment = MyOrdersFragment()
    }

    object OrderDetail: SupportAppScreen() {
        override fun getFragment(): Fragment = OrderDetailFragment()
    }

    object AddOrder: SupportAppScreen() {
        override fun getFragment(): Fragment = AddOrderFragment()
    }

    object ArrangeDeparture: SupportAppScreen() {
        override fun getFragment(): Fragment = ArrangeDepartureFragment()
    }

    object Street: SupportAppScreen() {
        override fun getFragment(): Fragment = StreetOrHouseBS()
    }

    object House: SupportAppScreen() {
        override fun getFragment(): Fragment = StreetOrHouseBS()
    }
    object PaymentScreen: SupportAppScreen() {
        override fun getFragment(): Fragment = PaymentScreenFragment()
    }

    object CallCourier: SupportAppScreen() {
        override fun getFragment(): Fragment = CallCourierFragment()
    }

    object MapScreen: SupportAppScreen() {
        override fun getFragment(): Fragment = FlowPointsFragment()
    }
    /** Точки роутер */

    object FlowPoints : SupportAppScreen() {
        override fun getFragment(): Fragment = FlowPointsFragment()
    }

    object Points: SupportAppScreen() {
        override fun getFragment(): Fragment = PointsFragment()
    }

    object PointDetail: SupportAppScreen() {
        override fun getFragment(): Fragment = PointDetailFragment()
    }

    object PointSearch: SupportAppScreen() {
        override fun getFragment(): Fragment = SearchPointsFragment()
    }

    object PointFilter: SupportAppScreen() {
        override fun getFragment(): Fragment = MapFilterFragment()
    }

    class ResultSuccess(var success: String,var resultBtnTopAcquiring: String, var resultBtnBottomAcquiring: String) : SupportAppScreen() {
        override fun getFragment(): Fragment? =
            SuccessFragment.newText(success, resultBtnTopAcquiring, resultBtnBottomAcquiring)

    }

    /** Уведомления роутер */

    object FlowNotifications : SupportAppScreen() {
        override fun getFragment(): Fragment = FlowNotificationsFragment()
    }

    object Notifications: SupportAppScreen() {
        override fun getFragment(): Fragment = NotificationsFragment()
    }

    /** Еще.... роутер */

    object FlowOther : SupportAppScreen() {
        override fun getFragment(): Fragment = FlowOtherFragment()
    }

    object Other: SupportAppScreen() {
        override fun getFragment(): Fragment = OtherFragment()
    }

    object Addresses: SupportAppScreen() {
        override fun getFragment(): Fragment = AddressesFragment()
    }

    object AddressesDetail: SupportAppScreen() {
        override fun getFragment(): Fragment = DetailAddressesFragment()
    }

    object AddAddresses: SupportAppScreen() {
        override fun getFragment(): Fragment = AddAddressesFragment()
    }

    object Feedback: SupportAppScreen() {
        override fun getFragment(): Fragment = FeedbackFragment()
    }

    object AboutApplication: SupportAppScreen() {
        override fun getFragment(): Fragment = AboutApplicationFragment()
    }

    /** Авторизация */
    object Auth: SupportAppScreen() {
        override fun getFragment(): Fragment = AuthFragment()
    }

    object RegPhone: SupportAppScreen() {
        override fun getFragment(): Fragment = RegPhoneFragment()
    }

    object RegSmsCode: SupportAppScreen() {
        override fun getFragment(): Fragment = RegSmsCodeFragment()
    }
}