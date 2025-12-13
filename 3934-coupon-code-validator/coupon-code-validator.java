class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {

        List<String> order = Arrays.asList(
                "electronics", "grocery", "pharmacy", "restaurant"
        );

        List<String[]> validCoupons = new ArrayList<>();

        for (int i = 0; i < code.length; i++) {

            if (!isActive[i]) continue;

            if (code[i] == null || code[i].isEmpty()) continue;
            if (!code[i].matches("[a-zA-Z0-9_]+")) continue;

            if (!order.contains(businessLine[i])) continue;

            validCoupons.add(new String[]{code[i], businessLine[i]});
        }

        Collections.sort(validCoupons, (a, b) -> {
            int blCompare = Integer.compare(
                    order.indexOf(a[1]),
                    order.indexOf(b[1])
            );
            if (blCompare != 0) return blCompare;
            return a[0].compareTo(b[0]);
        });

        List<String> result = new ArrayList<>();
        for (String[] coupon : validCoupons) {
            result.add(coupon[0]);
        }

        return result;
    }
}
