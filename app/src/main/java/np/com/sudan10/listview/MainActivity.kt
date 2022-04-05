package np.com.sudan10.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf(
            "Ankit Sharma",
            "Aakancha Thapa",
            "Aayush Karki",
            "Alina Pathak",
            "Arpan Dhakal",
            "Avipsha Shahi",
            "Kishor Majhi",
            "Kristina Maharjan",
            "Kushal Aryal",
            "Mirash Poudel",
            "Neha Shrestha",
            "Nishan Karki",
            "Nishesh Thakuri",
            "Poonam Khatri",
            "Prarambhika Khadka",
            "Reeshesh Thapa",
            "Shrijal Khanal",
            "Srijan Pyakural",
            "Susobhan Ghimire",
            "Aaraj Bhattarai"
        )

        // access the listView from xml file
        var mListView = findViewById<ListView>(R.id.userlist)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, users)
        mListView.adapter = arrayAdapter
    }
}
