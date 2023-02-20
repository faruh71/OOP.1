package Transport;

    public enum Capacity {
        С1(0, 10),
        С2(11, 25),
        С3(26, 50),
        С4(51, 80),
        С5(81, 120);
        int min;
        int max;

        Capacity(int min, int max) {
            this.min = min;
            this.max = max;
        }

        public static Capacity getValue(int value) {
            for (Capacity i : Capacity.values()) {
                if (value >= i.min && value <= i.max) {
                    System.out.println(i);
                    return i;
                }
            }
            return null;
        }

        public int getMin() {
            return min;
        }

        public int getMax() {
            return max;
        }

        @Override
        public String toString() {
            return " вместимость" +
                    " от=" + min +
                    " ,до=" + max;
        }
    }
