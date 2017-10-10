package com.egco428.searchdialog

import ir.mirrajabi.searchdialog.core.Searchable

/**
 * Created by 6272user on 10/10/2017 AD.
 */
class SearchModel (private var mtitle:String):Searchable{
    override fun getTitle(): String {
        return mtitle
    }
}
