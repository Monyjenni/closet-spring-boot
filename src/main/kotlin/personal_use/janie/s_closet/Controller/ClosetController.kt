package personal_use.janie.s_closet.Controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import personal_use.janie.s_closet.Service.ClosetService
import personal_use.janie.s_closet.model.Closet

@RestController
@RequestMapping("api/v1/janie's closet")

class ClosetController(

    private val closetService: ClosetService

){
    @GetMapping("/getALl")
    fun getAll(): List<Closet>{
        return closetService.getAll()
    }


    @GetMapping("/{id}")
    fun getById(@PathVariable("id") id:Long):Closet?{
        return closetService.getByID(id)

    }

    @PostMapping("/createOne")
    fun buyNew (@RequestBody id: Long): String {
        return ""
    }

}
