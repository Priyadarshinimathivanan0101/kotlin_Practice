/*sealed class SealedClass {
    data class Manager(val name: String, val age: Int, val team: List<String>): SealedClass()
    class SeniorDev(val name: String, val age: Int, val projects: Int): SealedClass()
    object JuniorDev: SealedClass()
}
fun main() {

    val sealc: SealedClass =//SeniorDev("Name", 20, 10)
    val message = when(sealc)
    {
        is Manager -> {
            "Welcome ${sealc.name}! You have ${employee.team.size} employees in your team!"
        }
        is SeniorDev -> {
            "Welcome ${sealc.name}! You have already ${employee.projects} projects under your belt!"
        }
        JuniorDev -> {
            "Welcome aboard! We wish you an awesome Experience!"
        }

    }
}*/