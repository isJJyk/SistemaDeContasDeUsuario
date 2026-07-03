package Classes;
import  Enum.Qualidade;

public class PlanoPadrao extends ContaStreaming{
    private final Qualidade qualidadee= Qualidade.FULL_HD;
    private final int QuantidadeDeTelas=2;

    public PlanoPadrao(String nomeUsuario, String email) {
        super(nomeUsuario,email);
        super.setPrecoBase(30);
    }
    @Override
    public String toString(){
        return "PLANO PADRÃO \n"+
                super.toString()+"\n"+
                "Qualidade maxima de video: "+qualidadee.getDescricao()+"\n"+
                "Limite de telas: "+QuantidadeDeTelas+"\n"+
                "Valor mensal: "+getPrecoBase()+"\n"+
                "-------------------------------";




    }
}
