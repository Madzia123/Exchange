package magdalena.pl.exchange.api

import com.google.gson.annotations.SerializedName

data class Info(

    @SerializedName("timestamp")
    val timeStamp: Int,

    @SerializedName("rate")
    val rate:Double

)
