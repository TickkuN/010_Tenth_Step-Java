public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beackham");

        Team adelaideCrows = new Team("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        adelaideCrows.addPlayer(pat);
        adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());
    }
}