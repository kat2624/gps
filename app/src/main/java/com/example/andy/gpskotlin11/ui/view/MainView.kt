package com.example.andy.gpskotlin11.ui.presenter

import com.example.andy.gpskotlin11.ErrorTypes
import com.example.andy.gpskotlin11.ui.ForecastItemViewModel

interface MainView {
    fun showSpinner()
    fun hideSpinner()
    fun updateForecast(forecasts: List<ForecastItemViewModel>)
    fun showErrorToast(errorType: ErrorTypes)
}