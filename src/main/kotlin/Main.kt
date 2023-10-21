import club.minnced.discord.webhook.WebhookClientBuilder
import java.net.URL
import javax.net.ssl.HttpsURLConnection


fun main(args: Array<String>) {
    val method = args[0]
    val url = args[1]
    when(method) {
        "DELETE" -> {
            deleteWebhook(url)
        }
        "SPAM" -> {
            val client = WebhookClientBuilder(url)
                .build()
            while (true) {
                client.send("stop scamming :3 @everyone")
                Thread.sleep(200)
            }
        }
    }

}
fun deleteWebhook(urlString: String) {
    val url = URL(urlString)
    val connection = url.openConnection() as HttpsURLConnection
    connection.addRequestProperty("Content-Type", "application/json")
    connection.addRequestProperty("User-Agent", "Webhook-Nuker")
    connection.setDoOutput(true)
    connection.setRequestMethod("DELETE")

    connection.inputStream.close() //I'm not sure why, but it doesn't work without getting the InputStream

    connection.disconnect()
}
