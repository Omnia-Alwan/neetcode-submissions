class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum=0;
        for (String operation : operations) {
            switch (operation) {
                case "C" -> sum -= stack.pop();
                case "D" -> {
                    int top = stack.peek();
                    sum += stack.push(top * 2);
                }
                case "+" -> {
                    int top = stack.pop();
                    int tot = top + stack.peek();
                    stack.push(top);
                    sum += stack.push(tot);
                }
                default -> sum += stack.push(Integer.parseInt(operation));
            }
        }
        return sum;
    }
}