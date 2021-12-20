package com.ramachandran.navigationcomponent


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * A simple [Fragment] subclass.
 */
open class BaseFragment : Fragment() {

   fun setTitle(title : String){
       (activity as? MainActivity)?.supportActionBar?.title = title
   }

}
