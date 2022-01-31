package com.informatika.uas_fadlijahyadi.model

import com.google.gson.annotations.SerializedName

data class ResponseActionBarang(

	@field:SerializedName("pesan")
	val pesan: Any? = null,

	@field:SerializedName("data")
	val data: List<Boolean?>? = null,

	@field:SerializedName("status")
	val status: String? = null,
)

