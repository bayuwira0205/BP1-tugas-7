fun main (){

    val bayu : Human = Human("Bayu")
    val wira : Human = Human("Wira")

    bayu.email = "bayu.0205@students.amikom.ac.id"
    bayu.address = "jl.babarsari"

    wira.email = "wira21@gmail.com"
    wira.address = "jl.babarsari"

    bayu.talk()
    wira.talk()

    bayu.introduce()
    wira.introduce()

    println(bayu.verify("mohammad.firmansyah@students.amikom.ac.id"))

    println(Bayu.nama)

    val name : Bayu = Bayu
    println(name.kenegaraan)
}