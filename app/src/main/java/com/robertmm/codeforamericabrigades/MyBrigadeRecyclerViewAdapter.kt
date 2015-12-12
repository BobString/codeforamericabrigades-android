package com.robertmm.codeforamericabrigades

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.robertmm.codeforamericabrigades.BrigadeFragment.OnListFragmentInteractionListener
import com.robertmm.codeforamericabrigades.dummy.DummyContent.DummyItem

import kotlinx.android.synthetic.fragment_brigade.*;
import kotlinx.android.synthetic.main.fragment_brigade.view.*
import org.jetbrains.anko.onClick

/**
 * [RecyclerView.Adapter] that can display a [DummyItem] and makes a call to the
 * specified [OnListFragmentInteractionListener].
 * TODO: Replace the implementation with code for your data type.
 */
class MyBrigadeRecyclerViewAdapter(private val mValues: List<DummyItem>, private val mListener: OnListFragmentInteractionListener?) : RecyclerView.Adapter<MyBrigadeRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_brigade, parent, false)
        return ViewHolder(view, mListener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindViewHolder(mValues[position])

    }

    override fun getItemCount(): Int {
        return mValues.size
    }

    inner class ViewHolder(val mView: View, val itemClick: OnListFragmentInteractionListener?) : RecyclerView.ViewHolder(mView) {


        fun bindViewHolder(item: DummyItem) {
            with(item) {
                itemView.id_dummy.text = this.id
                itemView.content_dummy.text = this.content
                itemView.onClick { itemClick?.onListFragmentInteraction(item) }
            }
        }

    }
}
