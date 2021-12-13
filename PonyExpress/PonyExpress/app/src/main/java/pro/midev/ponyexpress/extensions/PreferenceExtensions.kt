package pro.midev.ponyexpress.extensions

import android.content.Context
import org.koin.ext.getScopeName
import pro.midev.supersld.common.PreferenceHelper

const val PONY_PREFS = "prefs"

const val THEME = "is_day"
const val AUTH = "is_auth"
fun Context.saveThemeIsDay(isDay: Boolean) {
    PreferenceHelper.customPrefs(this, PONY_PREFS).edit().putBoolean(THEME, isDay).apply()
}

fun Context.themeIsDay(): Boolean {
    return PreferenceHelper.customPrefs(this, PONY_PREFS).getBoolean(THEME, true)
}

fun Context.saveAuthState(isDay: Boolean) {
    PreferenceHelper.customPrefs(this, PONY_PREFS).edit().putBoolean(AUTH, isDay).apply()
}

fun Context.isAuth(): Boolean {
    return PreferenceHelper.customPrefs(this, PONY_PREFS).getBoolean(AUTH, false)
}

const val CITY = "city"

fun Context.saveHeading(city: String) {
    PreferenceHelper.customPrefs(this, CITY).edit().putString(CITY, city).apply()
}

fun Context.getHeading(): String? {
    return PreferenceHelper.customPrefs(this, CITY).getString(CITY, "")
}

const val ACQUIRING = "Acquiring"

fun Context.saveAcquiring(Acquiring: String) {
    PreferenceHelper.customPrefs(this, ACQUIRING).edit().putString(ACQUIRING, Acquiring).apply()
}

fun Context.getAcquiring(): String? {
    return PreferenceHelper.customPrefs(this, ACQUIRING).getString(ACQUIRING, "")
}

fun Context.saveAcquiringBtnStrokeTop(Acquiring: String) {
    PreferenceHelper.customPrefs(this, ACQUIRING).edit().putString(ACQUIRING, Acquiring).apply()
}

fun Context.getAcquiringBtnStrokeTop(): String? {
    return PreferenceHelper.customPrefs(this, ACQUIRING).getString(ACQUIRING, "")
}

fun Context.saveAcquiringBtnFillBottom(Acquiring: String) {
    PreferenceHelper.customPrefs(this, ACQUIRING).edit().putString(ACQUIRING, Acquiring).apply()
}

fun Context.getAcquiringBtnFillBottom(): String? {
    return PreferenceHelper.customPrefs(this, ACQUIRING).getString(ACQUIRING, "")
}