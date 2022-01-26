package com.example.seanpractice

interface QuotesResponseListener {
    fun didFetch(response : List<QuotesResponse>, message : String)
    fun didError(message : String)
    fun didFeth(response: List<QuotesResponse>, message: String)
}