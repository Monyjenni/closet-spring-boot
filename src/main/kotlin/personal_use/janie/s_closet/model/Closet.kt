package personal_use.janie.s_closet.model

import javax.persistence.*


@Entity
@Table(name= "closet")
data class Closet (

    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(name= "Categorize")
    val categorize : String ,

    @Column(name="Brand")
    val brand : String?,

    @Column(name="Quality")
    val quality : Double= 0.0,

    @Column (name="Designer")
    val designer: String,

    @Column(name="Price")
    val price : Double = 0.0
)