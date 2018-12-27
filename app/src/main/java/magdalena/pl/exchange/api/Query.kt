package magdalena.pl.exchange.api

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Query(

    @SerializedName("from")
    @Expose
    val from: String,

    @SerializedName("to")
    @Expose
    val to: String,

    @SerializedName("amount")
    @Expose
    val amount:Int
)