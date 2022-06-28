package vn.app.qrcode.ui.home

import android.os.Bundle
import android.view.View
import com.base.common.base.fragment.BaseMVVMFragment
import com.base.common.base.viewmodel.CommonEvent
import org.koin.androidx.viewmodel.ext.android.viewModel
import vn.app.qrcode.R
import vn.app.qrcode.databinding.FragmentHomeBinding

class HomeFragment : BaseMVVMFragment<CommonEvent, FragmentHomeBinding, HomeViewModel>() {

    companion object {
        const val TAG = "HomeFragment"
    }

    override val layoutId: Int
        get() = R.layout.fragment_home
    override val viewModel: HomeViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewEvent()
    }

    private fun setupViewEvent() {

    }

}