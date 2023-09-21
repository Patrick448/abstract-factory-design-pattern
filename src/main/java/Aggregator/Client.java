package Aggregator;

public class Client {

    private Post post;
    private Profile profile;


    public Client(AbstractFactory factory) {
        this.post = factory.createPost();
        this.profile = factory.createProfile();
    }

    public String displayPost(){
        return this.post.display();
    }
    public String displayProfile(){
        return this.profile.display();
    }

}
