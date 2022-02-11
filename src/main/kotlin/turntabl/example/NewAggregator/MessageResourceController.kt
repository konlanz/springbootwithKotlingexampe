package turntabl.example.NewAggregator

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageResourceController(val service: MessageService){
    @GetMapping
    fun getMessages(): List<Message> = service.findMessage()
    @PostMapping
    fun postMessage(@RequestBody message: Message){
        service.post(message)
    }
}

