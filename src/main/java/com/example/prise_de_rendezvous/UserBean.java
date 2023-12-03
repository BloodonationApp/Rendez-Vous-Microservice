package com.example.prise_de_rendezvous;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserBean {
    private Long id;
    //@NotNull(message = "L'email est obligatoire !")
    private String email;
    //@NotNull(message = "Veuillez entrer votre nom svp")
    private String name;
    //@NotNull(message = "Le mot de passe est obligatoire !")
    private String password;
    //@NotNull(message = "Le groupe sanguin est obligatoire !")
    private String groupeSanguin;
    //@NotNull(message = "Votre age est obligatoire !")
    private Long age;
}
