package personal_use.janie.s_closet.repository

import org.springframework.data.jpa.repository.JpaRepository
import personal_use.janie.s_closet.model.Closet

interface ClosetRepository : JpaRepository<Closet,Long>
