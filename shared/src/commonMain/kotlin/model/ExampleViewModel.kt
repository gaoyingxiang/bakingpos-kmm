package model

import base.BaseViewModel
import io.ktor.client.call.body
import io.ktor.client.request.post
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import moe.tlaster.precompose.viewmodel.viewModelScope

data class ExampleUiState(
    val example: List<String> = emptyList()
)

class ExampleViewModel : BaseViewModel() {
    private val _UiState = MutableStateFlow(ExampleUiState())
    val uiState = _UiState.asStateFlow()

    fun fetchData() {
        viewModelScope.launch {
            val data = getData()
            _UiState.update {
                it.copy(example = data)
            }
        }
    }

    private suspend fun getData(): List<String> {
        return httpClient.post("http://www.baidu.com").body<List<String>>()
    }
}