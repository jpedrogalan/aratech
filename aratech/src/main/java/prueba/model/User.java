package prueba.model;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Getter @Setter @NoArgsConstructor 
public class User {

    @Id
    private String id;

    private String name;
    private Date birthday;
    
    public User(String name, Date birthday){
    	this.name = name;
    	this.birthday = birthday;
    }

	@Override
    public String toString() {
        return "User{" +
                ", id='" + id + '\'' +
                ", name=" + name +
                ", birthday='" + birthday + '\'' +
                '}';
    }


}
