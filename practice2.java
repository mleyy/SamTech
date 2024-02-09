public class practice2 {
    public static void main(String[] args) {
        int myAge = 22;
        int votingAge = 16;
        System.out.println(myAge >= votingAge);
        // output old enough to vote if my age is greater than or equal to 20.otherwise
        // output not old enough to vote
        if (myAge > votingAge) {
            System.out.println("old enough to vote");
        } else if (myAge < votingAge) {
            System.out.println("not old enough to vote");
        } else {
            System.out.println("myAge is equal to votingAge");
        }
    }
}
