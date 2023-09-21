package Aggregator;

public class LinkedinFactory implements AbstractFactory{

    @Override
    public Post createPost() {
        return new LinkedinPost();
    }

    @Override
    public Profile createProfile() {
        return new LinkedinProfile();
    }
}
