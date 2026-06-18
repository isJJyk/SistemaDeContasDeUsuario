package Classes;
import  Enum.Qualidade;

public class PlanoPremium extends ContaStreaming {
    private final  Qualidade qualidade= Qualidade.ULTRA_HD_4K;
    private final int QuantidadeDeTelas=4;

    public PlanoPremium(String nomeUsuario, String email) {
        super(nomeUsuario, email);
        super.setPrecoBase(50);
    }
    @Override
    public String toString(){
        return "PLANO PADRÃO \n"+
                super.toString()+"\n"+
                "Qualidade maxima de video: "+qualidade.getDescricao()+"\n"+
                "Limite de telas: "+QuantidadeDeTelas+"\n"+
                "Valor mensal: "+getPrecoBase()+"\n"+
                "-------------------------------";
    }
}
