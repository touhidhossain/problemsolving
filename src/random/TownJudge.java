package random;

public class TownJudge {
    public static void main(String[] args) {
        int[][] trust = {{1,3},{2,3},{3,1}};
        System.out.println(findJudge(3, trust));
    }

    public static int findJudge(int n, int[][] trust) {

        int townJudge = -1;

        int[] peopleWithTrustCount = new int[n + 1];

        for (int[] ints : trust) {
            peopleWithTrustCount[ints[1]] = peopleWithTrustCount[ints[1]] + 1;
        }

        for (int i = 0; i < peopleWithTrustCount.length; i++) {
            if(peopleWithTrustCount[i] ==  (n -1)){
                townJudge = i;
            }
        }

        for (int[] ints : trust) {
            if (ints[0] == townJudge) {
                townJudge = -1;
                break;
            }
        }

        return townJudge;
    }
}
