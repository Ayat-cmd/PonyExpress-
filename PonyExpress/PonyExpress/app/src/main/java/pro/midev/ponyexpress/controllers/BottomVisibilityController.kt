package pro.midev.ponyexpress.controllers


import com.jakewharton.rxrelay3.BehaviorRelay
import io.reactivex.rxjava3.core.Observable
import pro.midev.ponyexpress.common.enums.BottomSheetDialogType

class BottomVisibilityController {
    private val stateRelay = BehaviorRelay.create<Boolean>()

    val state: Observable<Boolean> = stateRelay
    fun show() = stateRelay.accept(true)
    fun hide() = stateRelay.accept(false)
}
