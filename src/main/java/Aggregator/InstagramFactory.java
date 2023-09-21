package Aggregator;

public class InstagramFactory implements AbstractFactory{
    @Override
    public Post createPost() {
        return new InstagramPost();
    }

    @Override
    public Profile createProfile() {
        return new InstagramProfile();
    }
}
