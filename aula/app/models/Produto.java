package models;

import javax.persistence.Entity;
import play.db.jpa.JPABase;
import play.db.jpa.Model;

@Entity
public class Produto extends Model{

    public String nome;
    public String descricao;
    public double valor;
    public int quantidade;

    @Override
    public String toString(){
        return nome;
    }
}