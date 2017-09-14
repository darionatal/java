
package br.iskisita;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
/**
 *
 * @author a9166375
 */
public class Sexo {
    
    @Id //  Identifica o indice
    @GeneratedValue(strategy = GenerationType.AUTO) //
    private int id;
    private String nome;
    private char sigla;

    public Sexo() {
    }

    public Sexo(int id, String nome, char sigla) {
        this.id = id;
        this.nome = nome;
        this.sigla = sigla;
    }

    public char getSigla() {
        return sigla;
    }

    public void setSigla(char sigla) {
        this.sigla = sigla;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sexo other = (Sexo) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sexo{" + "id=" + id + ", nome=" + nome + ", sigla=" + sigla + '}';
    }
    
    
    
}
