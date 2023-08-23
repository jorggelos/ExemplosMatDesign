package exemplosmatdesign.titopetri.com.exemplosmatdesign;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MeuViewHolder extends RecyclerView.ViewHolder {

    ImageView imagem;
    TextView titulo;
    TextView data_exib;

    public MeuViewHolder(View itemView) {
        super(itemView);
        imagem = itemView.findViewById(R.id.imagem_celula);
        titulo = itemView.findViewById(R.id.textView);
        data_exib = itemView.findViewById(R.id.textView2);
    }

    public void bind(final Episodio item, final MeuAdaptador.OnItemClickListener listener){

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClick(item);
            }
        });

    }


}
