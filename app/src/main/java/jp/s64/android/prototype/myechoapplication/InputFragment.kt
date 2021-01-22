package jp.s64.android.prototype.myechoapplication

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.Navigation

class InputFragment : Fragment() {

    var dato: String ? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.input_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val editText = view.findViewById<EditText>(R.id.editText)

        /*
        view.findViewById<Button>(R.id.button2).setOnClickListener {
            Navigation.findNavController(it).navigate(
                    R.id.action_flow_input_to_flow_result,
                    ResultFragmentArgs.Builder()
                            .setInputText(editText.text.toString())
                            .build()
                            .toBundle()
            )
        }
         */
        view.findViewById<Button>(R.id.button2).setOnClickListener {
            dato= (activity as MainActivity).dato
            Log.d("app:InputFragment", "dato:"+dato)
            (activity as MainActivity).dato = editText.text.toString()
            Log.d("app:InputFragment", "dato del formu:"+(activity as MainActivity).dato)
            Navigation.findNavController(it).navigate(
                    R.id.action_flow_input_to_flow_result,
                    ResultFragmentArgs.Builder()
                            .setInputText(editText.text.toString())
                            .build()
                            .toBundle())
        }
    }

}
