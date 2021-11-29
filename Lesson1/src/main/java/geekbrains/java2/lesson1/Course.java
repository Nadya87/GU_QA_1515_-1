package geekbrains.java2.lesson1;


public class Course {
        private Obstacles[] poolCourse = {new Obstacles("Obstacle10"),
                new Obstacles("Obstacle20"), new Obstacles("Obstacle30")};
        public void doIt(Team team){
            for (Runner courRunner:team.runners){
                int result = 0;
                for (Obstacles courObst:poolCourse){
                    result += courObst.overcome(courRunner.getRunnerName());
                }
                courRunner.setTime(result);
            }
        }
    }


