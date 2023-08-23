package exemplosmatdesign.titopetri.com.exemplosmatdesign;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MeuAdaptador extends RecyclerView.Adapter {

    ArrayList<Episodio> episodios;
    Context context;
     OnItemClickListener listener;

    public MeuAdaptador(ArrayList<Episodio> episodios, Context context, OnItemClickListener listener) {
        this.episodios = episodios;
        this.context = context;
        this.listener = listener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.minha_celula,parent,false);
        MeuViewHolder meuViewHolder = new MeuViewHolder(view);
        return meuViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MeuViewHolder meuViewHolder = (MeuViewHolder) holder;
        Episodio meuEpisodio = episodios.get(position);
        meuViewHolder.titulo.setText(meuEpisodio.getTitulo());
        meuViewHolder.data_exib.setText(meuEpisodio.getData_exib());
        meuViewHolder.imagem.setImageResource(R.drawable.carrinho);

        meuViewHolder.bind(episodios.get(position), listener);
    }

    @Override
    public int getItemCount() {
        return episodios.size();
    }

    public  interface OnItemClickListener{
        void onItemClick(Episodio episodio);
    }
}
