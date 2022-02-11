package turntabl.example.NewAggregator

import org.springframework.stereotype.Service

@Service
class  MessageService(val db: MessageRepository){
    fun findMessage(): List<Message> = db.findMessages()
    fun post(message: Message){
        db.save(message)
    }
}
