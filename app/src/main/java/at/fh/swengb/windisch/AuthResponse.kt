package at.fh.swengb.windisch

import com.squareup.moshi.JsonClass

@JsonClass (generateAdapter = true)
class AuthResponse(val token: String) {
}