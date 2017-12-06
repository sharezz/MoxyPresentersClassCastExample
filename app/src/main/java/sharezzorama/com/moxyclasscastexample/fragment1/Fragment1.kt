package sharezzorama.com.moxyclasscastexample.fragment1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.arellomobile.mvp.MvpAppCompatFragment
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.PresenterType

class Fragment1 : MvpAppCompatFragment(), Fragment1View {

    @InjectPresenter(type = PresenterType.WEAK)
    lateinit var mPresenter: Fragment1Presenter

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val textView = TextView(context)
        textView.text = "Fragment1"
        return textView
    }
}