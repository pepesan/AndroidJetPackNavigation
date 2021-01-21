package jp.s64.android.prototype.myechoapplication

import android.app.Application

class Aplicacion: Application() {
    var dato: String? = null
    init {
        this.dato = ""
    }
}