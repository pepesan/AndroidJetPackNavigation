package jp.s64.android.prototype.myechoapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.Navigation

class TitleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.title_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        /*
        val button3 = view.findViewById<TextView>(R.id.button3)
        button3.setOnClickListener({
            Navigation.createNavigateOnClickListener(R.id.action_launcher_title_to_blankFragment)
        })

         */
        view.findViewById<Button>(R.id.button).setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_launcher_title_to_flow_input))
        view.findViewById<Button>(R.id.button3).setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_launcher_title_to_blankFragment))
    }

}
