package presenter
import android.util.Log
import android.view.View
import model.User
import rest.ApiClient
import rest.ApiInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import view.ISetDataView
class Presenter(internal var isetdata:ISetDataView ):IPresenter{

    override fun callRetrofitApi() {

        var apiServices = ApiClient.client.create(ApiInterface::class.java)

        val call = apiServices.getPost()

       call.enqueue(object :Callback<User>
       {
           override fun onFailure(call: Call<User>?, t: Throwable?) {
               TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
           }

           override fun onResponse(call: Call<User>?, response: Response<User>?) {

               val response:User= response!!.body()!!
           }

       })

        // isetdata.setData(apiServices.getPost())
    }
}