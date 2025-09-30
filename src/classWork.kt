fun main() {
    // Создание героев
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

    val gojo = Hero().apply {
        name = "Годжо Сатору"
        element = "пространство"
        level = 10
        hp = 200
        mp = 100
    }

    // Демонстрация действий героя
    naruto.introduce()
    naruto.castSpell()
    naruto.heal()
    naruto.showStats()

    // Создание врага
    val orochimaru = Enemy().apply {
        name = "Орочимару"
        element = "огонь"
    }

    // Атака и магия
    naruto.attack(orochimaru)
    naruto.castSpellOn(orochimaru, "Футон: Рюха", 30)

    // Поединок
    sasuke.duel(gojo)

    // Работа с квестами
    val quests = mutableListOf<Quest>()

    repeat(3) {
        println("Введите данные квеста:")
        print("Название: ")
        val title = readln()

        print("Длительность (ч): ")
        val duration = readln().toInt()

        print("Награда (монеты): ")
        val reward = readln().toInt()

        print("Сложность: ")
        val difficulty = readln()

        val quest = Quest()
        quest.init(title, duration, reward, difficulty)
        // Или с именованными параметрами:
        // quest.init(title = title, duration = duration, reward = reward, difficulty = difficulty)
        quests.add(quest)
    }

    // Вывод всех квестов
    quests.forEach { it.printInfo() }
}