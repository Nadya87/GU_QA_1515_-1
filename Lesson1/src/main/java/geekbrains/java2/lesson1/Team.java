package geekbrains.java2.lesson1;

public class Team {
    private String teamName;

    public Runner[] runners = {new Runner("Runner10"), new Runner("Runner20"),
            new Runner("Runner30"), new Runner("Runner40")};
    public Team(String teamName){
        this.teamName = teamName;
    }
    public void membersName (){
        System.out.println("Команда " + this.teamName + " Члены команды:");
        for (int i = 0; i < runners.length; i++)
            System.out.println(runners[i]);
    }
    public void showResults(){
        for (Runner courRunner:runners){
            System.out.println(courRunner.getRunnerName() + ": " + courRunner.getTime());
        }
    }
}
