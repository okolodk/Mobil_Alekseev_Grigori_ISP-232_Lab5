fun main() {
//    Задание 1
//    var a = Weapon()
//    a.damage = 220
//    a.durability = 100
//    a.type = "эпик"
//    a.name = "Копью"
//    a.showInfo()
//    a.use()
//    a.upgrade(20)
//    a.showInfo()

    // Задание 2
    val naruto = Hero().apply {
        name = "Наруто"
        element = "ветер"
        hp = 120
        mp = 60
    }

    val sasuke = Hero().apply {
        name = "Саске"
        element = "огонь"
        level = 5
    }
    val guild = GuildHero()
    guild.name = "list guild"
    guild.addMember(naruto)
    guild.addMember(sasuke)
    guild.showMembers()
    println("Средний уровень гильдии: ${guild.averageLevel()}")



}