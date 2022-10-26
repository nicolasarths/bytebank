 public class Client extends Person {
    private String job;

    public Client (String name, String cpf) {
        super(name, cpf);
    }

    public String getJob() {
        return job;
    }

    public void setWork(String job) {
        this.job = job;
    }
}