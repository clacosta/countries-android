package com.example.countries.di

import com.example.countries.model.CountriesService
import dagger.Component

@Component(modules = [ApiModule::class])
interface ApiComponent {

    fun injenct(service: CountriesService)

}