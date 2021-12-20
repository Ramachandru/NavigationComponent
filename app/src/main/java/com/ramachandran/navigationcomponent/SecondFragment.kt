package com.ramachandran.navigationcomponent


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_second.view.*

/**
 * A simple [Fragment] subclass.
 */
class SecondFragment :BaseFragment() {
    private val args: SecondFragmentArgs by navArgs()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle("Second Fragment")
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view= inflater.inflate(R.layout.fragment_second, container, false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val value= args.dataName
        view.text2.text=value
        view.setOnClickListener {viewObject ->
           val action= SecondFragmentDirections.actionSecondFragmentToThirdFragment("Very Success")
            val navOptions=NavOptions.Builder().setPopUpTo(R.id.secondFragment,true).build()
            findNavController().navigate(action,navOptions)
        }
    }


}
