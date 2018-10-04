package study.inno.immutable;

public class Group {
    private final String name;
    private final String date;

    public Group(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public Group() {
        this.name = "";
        this.date = ((Long) System.currentTimeMillis()).toString();
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }
}
