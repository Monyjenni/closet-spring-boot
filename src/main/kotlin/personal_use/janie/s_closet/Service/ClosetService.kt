package personal_use.janie.s_closet.Service

import personal_use.janie.s_closet.model.Closet
import personal_use.janie.s_closet.repository.ClosetRepository

class ClosetService (

    private val closetRepository: ClosetRepository
        ){

    fun getAll(): List<Closet>{
        val clothes = closetRepository.findAll()
        return clothes.toList()
    }

    fun getByID(id:Long):Closet?{
        val shirt = closetRepository.findById(id).orElseThrow()
        return shirt
    }

    fun buyClothes(categorize_new : String, brand_new : String?= null , quality_new :Double , designer_new: String,
                   price_new: Double) :
            Closet {
        val newCloset = Closet(
            categorize = categorize_new,
            brand = brand_new,
            quality = quality_new,
            designer = designer_new,
            price = price_new


        )

        val savedNewClothes = closetRepository.save(newCloset)

        return savedNewClothes
    }

    fun donateClothes(id:Long): List<Closet> {
        closetRepository.deleteById(id)
        val remainingClosets = closetRepository.findAll()
        remainingClosets.toMutableList()
        return remainingClosets

    }

   fun donateAll():String{
       closetRepository.deleteAll()
       return "Everything has been succesfully donating."
   }


   fun donate_remaining (id:Long):String {
       closetRepository.deleteById(id)
     return "$id is has been donated"
   }







}