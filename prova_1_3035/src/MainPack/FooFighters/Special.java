/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainPack.FooFighters;

/**
 *
 * @author mikha
 */
public class Special {
    private String NomeDoEspecial;
    private Double ValorDoSpecial;

    public Special(String NomeDoSpecial, Double ValorDoSpecial) {
        this.NomeDoEspecial = NomeDoSpecial;
        this.ValorDoSpecial = ValorDoSpecial;
    }

    public String getName() {
        return NomeDoEspecial;
    }

    public void setName(String nome) {
        this.NomeDoEspecial = nome;
    }

    public Double getValueSpecial() {
        return ValorDoSpecial;
    }

    public void setValueSpecial(Double ValorDoSpecial) {
        this.ValorDoSpecial = ValorDoSpecial;
    }
}

