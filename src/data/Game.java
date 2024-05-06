/**
 *
 * @author LUCAS
 */
package data;

public class Game {
    private int id;
    private String name;
    private double value;
    private String descricao;
    private String cover;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    @Override
    public String toString(){
        System.out.println(">>>>> GAME OBJETO <<<<<");
        
        System.out.println("Id: " + this.getId());
        System.out.println("Nome: " + this.getName());
        System.out.println("Valor: " + this.getValue());
        System.out.println("Capa: " + this.getCover());
        System.out.println("Descrição: " + this.getDescricao());
        
        return "";
    }
}
