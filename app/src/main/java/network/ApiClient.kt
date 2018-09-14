package rest
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient
{
    companion object {

        val baseURL: String = "https://jsonplaceholder.typicode.com/"
        var retofit: Retrofit? = null

        val client: Retrofit
            get() {
                if (retofit == null) {
                    retofit = Retrofit.Builder()
                            .baseUrl(baseURL)
                            .addConverterFactory(GsonConverterFactory.create())
                            .build()
                }
                return retofit!!
            }
    }
}