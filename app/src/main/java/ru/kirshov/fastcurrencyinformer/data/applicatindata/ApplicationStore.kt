package ru.kirshov.fastcurrencyinformer.data.applicatindata

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class ApplicationStore @Inject constructor() :LoadingStore,ErrorStore {
    private val errorList = mutableListOf<ErrorData>(ErrorData("Test error"))
    override fun getLoadingData(): Flow<LoadingData> {
        return flow {
            emit(LoadingData(title = "Loading"))
        }
    }

    override val error: ErrorData
        get() = errorList.last()

}
