fun main() {
    var a = Weapon()
    a.damage = 220
    a.durability = 10
    a.type = "эпик"
    a.name = "Копью"
    a.showInfo()
    a.use()
    a.upgrade(20)
    a.showInfo()
}