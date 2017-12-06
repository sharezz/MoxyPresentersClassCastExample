package sharezzorama.com.moxyclasscastexample.fragment2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.arellomobile.mvp.MvpAppCompatFragment
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.PresenterType

class Fragment2 : MvpAppCompatFragment(), Fragment2View {

    @InjectPresenter(type = PresenterType.WEAK)
    lateinit var mPresenter: Fragment2Presenter

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val textView = TextView(context)
        textView.text = "Fragment2"
        return textView
    }
}