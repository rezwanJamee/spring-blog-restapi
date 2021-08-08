package io.blogs.openblogs.post;

public class Post {

    private String id;
    private String title;
    private String body;
    private String datepublished;

    public Post(){

    }

    public Post(String id, String title, String body, String datepublished) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.datepublished = datepublished;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDatepublished() {
        return datepublished;
    }

    public void setDatepublished(String datepublished) {
        this.datepublished = datepublished;
    }
}
