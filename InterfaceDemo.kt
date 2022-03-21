interface ISports
{
    public fun setTeam(t1: String, t2:String, score1 : Int, score2 : Int)
    public fun showResult()
}
class Cricket : ISports
{
    private var team1Runs : Int = 0
    private var team2Runs :Int = 0
    private lateinit var team1: String
    private lateinit var team2 : String
    override fun setTeam(t1: String, t2: String, score1: Int, score2: Int) {
        team1Runs = score1
        team2Runs = score2
        team1 = t1
        team2 = t2
    }
    override fun showResult() {
        println("$team1 - $team1Runs Runs ")
        println("$team2 - $team2Runs Runs ")
    }
}
class Hockey : ISports
{
    private var team1Runs : Int = 0
    private var team2Runs :Int = 0
    private lateinit var team1: String
    private lateinit var team2 : String
    override fun setTeam(t1: String, t2: String, score1: Int, score2: Int) {
        team1Runs = score1
        team2Runs = score2
        team1 = t1
        team2 = t2
    }
    override fun showResult() {
        println("$team1 - $team1Runs Goals ")
        println("$team2 - $team2Runs Goals ")
    }
}
fun main()
{
    val c = Cricket()
    val h = Hockey()
    c.setTeam("India", "England",240,220);
    h.setTeam("India", "Germany",3,2);
    c.showResult();
    h.showResult();
}
