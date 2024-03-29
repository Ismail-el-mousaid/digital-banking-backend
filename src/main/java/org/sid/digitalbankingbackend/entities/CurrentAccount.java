package org.sid.digitalbankingbackend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

//Compte courant
@Entity
@DiscriminatorValue("CA")
@Data @NoArgsConstructor @AllArgsConstructor
public class CurrentAccount extends BankAccount{
    private double overDraft;
}
