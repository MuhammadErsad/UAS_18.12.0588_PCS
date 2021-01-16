package id.Ersad.livescore

import android.app.Application
import id.Ersad.livescore.data.db.AppDatabase
import id.Ersad.livescore.data.pref.PrefManager
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule

class Score : Application(), KodeinAware {

    override val kodein = Kodein.lazy {
        import(androidXModule(this@Score))

    }

    companion object {
        @get:Synchronized
        lateinit var instance: Score
        lateinit var prefManager: PrefManager
        lateinit var db: AppDatabase

    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        prefManager = PrefManager(this)
        db = AppDatabase(this)
    }
}