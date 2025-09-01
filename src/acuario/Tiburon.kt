package acuario

class Tiburon: Pez(), AccionPez {
    override val color: String = "gris"

    override fun comer() {
        println("cazar y comer peces")
    }
}