package data;

public class Teacher {
    protected String name;
    protected String object;
    protected Integer yea;
    protected Integer id;

    public Teacher(String name, String object, Integer yea, Integer id) {
        this.name = name;
        this.object = object;
        this.yea = yea;
        this.id = id;
    }

    public Teacher() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public Integer getYea() {
        return yea;
    }

    public void setYea(Integer yea) {
        this.yea = yea;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\nTeacher id: " + id +
                "\n   name:" + name +
                "\n   object:" + object +
                "\n   yea: " + yea;
    }
}