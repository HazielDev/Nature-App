package com.example.natureapp.data

import com.example.natureapp.data.model.Product

interface Api {

    suspend fun getProductsList(): Product

}