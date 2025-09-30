class Quest {
    var title: String = ""
    var duration: Int = 0
    var reward: Int = 0
    var difficulty: String = ""

    fun printInfo() {
        println(" Задание: $title\nДлительность: $duration ч.\nНаграда: $reward монет\nСложность: $difficulty")
    }

    fun init(title: String, duration: Int, reward: Int, difficulty: String) {
        this.title = title
        this.duration = duration
        this.reward = reward
        this.difficulty = difficulty
    }
}