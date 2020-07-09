package com.professionalandroid.apps.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import kotlinx.android.synthetic.main.activity_fragment.*

class Fragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        val fragment1 = test4()
        val adapts = pagerAdapter(supportFragmentManager)
        adapts.addItem(fragment1)

        ViewPager1.adapter = adapts

        TabLayout1.setupWithViewPager(ViewPager1)

        TabLayout1.getTabAt(0)?.setText("tab1")




    }

}

class pagerAdapter(fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager){
    val list : ArrayList<Fragment> = ArrayList()
    override fun getItem(position: Int): Fragment {
        return list[position]
    }

    override fun getCount(): Int {
        return list.size
    }

    fun addItem(item : Fragment){
        list.add(item)
    }
}