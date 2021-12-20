package com.ramachandran.navigationcomponent


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavHostController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.fragment_first.view.*

/**
 * A simple [Fragment] subclass.
 */
class FirstFragment : BaseFragment() {
    private val args: FirstFragmentArgs by navArgs()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onResume() {
        super.onResume()

        setTitle("First Fragment")
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view= inflater.inflate(R.layout.fragment_first, container, false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val homeValue=args.homeData
        view.text1.text=homeValue
        view.text1.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment("ramu got success")
            findNavController().navigate(action)
        }
    }


}
