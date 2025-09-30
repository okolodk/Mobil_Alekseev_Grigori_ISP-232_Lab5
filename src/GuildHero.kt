class GuildHero {
    var name : String = "Неизвестно"
    val members: MutableList<Hero> = mutableListOf()

    fun addMember(hero: Hero) {
        members.add(hero)
        println("${hero.name} добавлен в гильдию $name.")
    }
    fun showMembers() {
        if (members.isEmpty()) {
            println("Гильдия пуста.")
        } else {
            members.forEach { it.showStats() }
        }
    }
    fun averageLevel() : Double {
        if (members.isEmpty()) { return 0.0}
        else {
            var sum_levels = 0
            members.forEach { sum_levels = sum_levels + it.level }
            return sum_levels / members.size.toDouble()
        }
    }
}