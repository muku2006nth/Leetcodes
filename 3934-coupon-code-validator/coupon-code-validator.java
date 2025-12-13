class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {

        String[] order = {"electronics", "grocery", "pharmacy", "restaurant"};

        int count = 0;
        for (int i = 0; i < code.length; i++) {
            if (!isActive[i]) continue;
            if (code[i] == null || code[i].isEmpty()) continue;
            if (!code[i].matches("[a-zA-Z0-9_]+")) continue;

            boolean validBL = false;
            for (String b : order) {
                if (b.equals(businessLine[i])) {
                    validBL = true;
                    break;
                }
            }
            if (!validBL) continue;

            count++;
        }

        String[][] valid = new String[count][2];
        int idx = 0;

        for (int i = 0; i < code.length; i++) {
            if (!isActive[i]) continue;
            if (code[i] == null || code[i].isEmpty()) continue;
            if (!code[i].matches("[a-zA-Z0-9_]+")) continue;

            boolean validBL = false;
            for (String b : order) {
                if (b.equals(businessLine[i])) {
                    validBL = true;
                    break;
                }
            }
            if (!validBL) continue;

            valid[idx][0] = code[i];
            valid[idx][1] = businessLine[i];
            idx++;
        }

        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                int bi = getIndex(order, valid[i][1]);
                int bj = getIndex(order, valid[j][1]);

                if (bi > bj || (bi == bj && valid[i][0].compareTo(valid[j][0]) > 0)) {
                    String[] temp = valid[i];
                    valid[i] = valid[j];
                    valid[j] = temp;
                }
            }
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(valid[i][0]);
        }

        return result;
    }

    private int getIndex(String[] order, String b) {
        for (int i = 0; i < order.length; i++) {
            if (order[i].equals(b)) return i;
        }
        return -1;
    }
}
