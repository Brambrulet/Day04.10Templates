package study.inno.immutable;

public class User {
    private final String name;
    private final Group group;

    public User(String name, Group group) {
        this.name = name;
        this.group = group;
    }

    public User() {
        name = "";
        group = new Group();
    }

    public String getName() {
        return name;
    }

    public Group getGroup() {
        return group;
    }
}
