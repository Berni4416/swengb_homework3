// Code generated by moshi-kotlin-codegen. Do not edit.
package at.fh.swengb.windisch

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.internal.Util
import java.lang.NullPointerException
import kotlin.String
import kotlin.Suppress
import kotlin.collections.emptySet
import kotlin.text.buildString

@Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION")
class AuthRequestJsonAdapter(
  moshi: Moshi
) : JsonAdapter<AuthRequest>() {
  private val options: JsonReader.Options = JsonReader.Options.of("username", "password")

  private val stringAdapter: JsonAdapter<String> = moshi.adapter(String::class.java, emptySet(),
      "username")

  override fun toString(): String = buildString(33) {
      append("GeneratedJsonAdapter(").append("AuthRequest").append(')') }

  override fun fromJson(reader: JsonReader): AuthRequest {
    var username: String? = null
    var password: String? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> username = stringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("username",
            "username", reader)
        1 -> password = stringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("password",
            "password", reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return AuthRequest(
        username = username ?: throw Util.missingProperty("username", "username", reader),
        password = password ?: throw Util.missingProperty("password", "password", reader)
    )
  }

  override fun toJson(writer: JsonWriter, value: AuthRequest?) {
    if (value == null) {
      throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("username")
    stringAdapter.toJson(writer, value.username)
    writer.name("password")
    stringAdapter.toJson(writer, value.password)
    writer.endObject()
  }
}
