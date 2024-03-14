class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.length() == 1 || s.length() == 0) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            }

            if (s.charAt(i) == '}') {
                if (!stack.isEmpty()) {
                    if (stack.peek() == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }

            if (s.charAt(i) == ')') {
                if (!stack.isEmpty()) {
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }

            if (s.charAt(i) == ']') {
                if (!stack.isEmpty()) {
                    if (stack.peek() == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        System.out.println(stack.toString());
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
