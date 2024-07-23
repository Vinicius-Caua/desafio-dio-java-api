package dio.me.dio_desafio_api.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String nickname;
    private String number;

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;
    private Long recipiesNumber;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Recipie> recipies;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Long getRecipiesNumber() {
        return recipiesNumber;
    }

    public void setRecipiesNumber(Long recipiesNumber) {
        this.recipiesNumber = recipiesNumber;
    }

    public List<Recipie> getRecipies() {
        return recipies;
    }

    public void setRecipies(List<Recipie> recipies) {
        this.recipies = recipies;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
