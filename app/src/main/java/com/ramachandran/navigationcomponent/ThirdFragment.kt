package com.ramachandran.navigationcomponent


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_third.view.*

/**
 * A simple [Fragment] subclass.
 */
class ThirdFragment : BaseFragment() {
    private val args : ThirdFragmentArgs by navArgs()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle("Third Fragment")
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_third, container, false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val data=args.returnData
        view.text3.text =data
        view.setOnClickListener {
            val direction=ThirdFragmentDirections.actionThirdFragmentToFirstFragment("Home Screen")
            val navOptions : NavOptions=NavOptions.Builder().setPopUpTo(R.id.firstFragment,true).build()
            findNavController().navigate(direction,navOptions)
        }
    }


}
