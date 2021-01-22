package jp.s64.android.prototype.myechoapplication

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class ResultFragment : Fragment() {
    var dato: String? = null
    var textView: TextView? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.result_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView = view.findViewById<TextView>(R.id.textView)
        Log.d("app: ResultFragment", "on attach")
        this.dato= (activity as MainActivity).dato
        Log.d("app: ResultFragment", "instancia de app: "+ (activity as MainActivity).dato)
        textView?.text =  this.dato
        /*
        val args = ResultFragmentArgs.fromBundle(arguments as Bundle)

        this.textView?.text = args.inputText


         */

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }


}
