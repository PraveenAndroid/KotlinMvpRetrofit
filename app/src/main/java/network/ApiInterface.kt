package rest
import model.User
import retrofit2.Call
import retrofit2.http.GET


interface ApiInterface {

    @GET("posts")
    fun getPost():Call<User>
}