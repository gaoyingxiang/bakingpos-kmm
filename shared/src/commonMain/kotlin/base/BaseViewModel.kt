package base

import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import moe.tlaster.precompose.viewmodel.ViewModel

open class BaseViewModel : ViewModel() {
    val httpClient = HttpClient {
        install(ContentNegotiation) {
            json()
        }
    }

    override fun onCleared() {
        httpClient.close()
    }
}