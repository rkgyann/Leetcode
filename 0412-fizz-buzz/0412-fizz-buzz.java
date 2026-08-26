class Solution {
    public List<String> fizzBuzz(int n) {
        int i;

        String[] answer = new String[n];
        for (i = 0; i < n; i++) {
            answer[i] = String.valueOf(i + 1);
        }

        for (i = 0; i < n; i++) {
            if (n >= 3) {
                if ((i + 1) % 5 == 0)
                    answer[i] = "Buzz";
                if ((i + 1) % 3 == 0)
                    answer[i] = "Fizz";
            }
            if (n >= 15) {
                if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0)
                    answer[i] = "FizzBuzz";
            }
        }

        return List.of(answer);
    }
}