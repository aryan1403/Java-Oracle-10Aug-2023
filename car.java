interface car {
    String color();
    String modelNo();
    String name();
    Integer power();
    Double price();
    /* default void task() {
        System.out.println("task is");
    } */
}

class BMW implements car {

    @Override
    public String color() {
        return "White";
    }

    @Override
    public String modelNo() {
        return "M5";
    }

    @Override
    public String name() {
        return "X7";
    }

    @Override
    public Integer power() {
        return 1200;
    }

    @Override
    public Double price() {
        return 1.5;
    }

}


class Mercedes implements car {
    @Override
    public String color() {
        return "Blue";
    }

    @Override
    public String modelNo() {
        return "Benz";
    }

    @Override
    public String name() {
        return "C class";
    }

    @Override
    public Integer power() {
        return 900;
    }

    @Override
    public Double price() {
        return 80.0;
    }
}


class Toyota implements car {
    @Override
    public String color() {
        return "black";
    }

    @Override
    public String modelNo() {
        return "SUV";
    }

    @Override
    public String name() {
        return "fortuner";
    }

    @Override
    public Integer power() {
        return 1400;
    }

    @Override
    public Double price() {
        return 50.0;
    }
}

class superclass {
    public static void main(String[] args) {
        BMW bmw = new BMW();

        bmw.name();
    }
}
