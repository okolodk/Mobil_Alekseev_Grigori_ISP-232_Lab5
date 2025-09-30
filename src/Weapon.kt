class Weapon {
    var name : String = "Оружие"
    var damage : Int = 100
    var durability : Int = 100
    var type : String = "Обычное"

    fun showInfo() {
        println("name $name")
        println("damage $damage")
        println("durability $durability")
        println("type $type")
    }
    fun use() {
        durability -= 10
        if (durability <= 0) {
            durability = 0
            println("Оружие сломано")
        }
        else {

            println("durability $durability")
        }
    }
    fun upgrade(bonus: Int) {
        damage += bonus
    }
}