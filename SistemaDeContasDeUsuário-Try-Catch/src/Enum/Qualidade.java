package Enum;

public enum Qualidade {
    FULL_HD("Full HD"),
    ULTRA_HD_4K("4K Ultra HD");

    private final String descricao;
    Qualidade(String descricao){
        this.descricao=descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
