package ru.kirshov.fastcurrencyinformer.data

import kotlinx.serialization.Serializable

sealed interface ApplicationState

@Serializable
data class Team(val inr:String)

