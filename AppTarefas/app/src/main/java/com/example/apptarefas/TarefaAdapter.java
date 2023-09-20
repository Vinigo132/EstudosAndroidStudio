package com.example.apptarefas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TarefaAdapter extends RecyclerView.Adapter<TarefaAdapter.ViewHolder> {

    private List<Tarefa> lista;

    public TarefaAdapter(List<Tarefa> lista){
        this.lista = lista;
    }

    //quando a view é criada
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_lista, parent, false);
        ViewHolder viewHolder = new ViewHolder(
                view
        );
        return viewHolder;
    }


    //quando quer exibir dados
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Tarefa tarefa = lista.get(position);
        TextView txtTitulo = holder.txtTitulo;
        txtTitulo.setText(tarefa.getTitulo());
        //holder.txtTitulo.setText(tarefa.getTitulo());
        holder.btnExcluir.setOnClickListener(view -> excluirItem(position));
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public void excluirItem(int position){
        lista.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, lista.size());

    }

    public void adicionarItem(Tarefa tarefa){
        lista.add(tarefa);
        notifyItemInserted(getItemCount());
    }

    //viewHolder, referencia aos itens ad lista
    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView txtTitulo;
        public ImageButton btnExcluir;

        public ViewHolder(View itemView){
            super(itemView);
            txtTitulo = itemView.findViewById(R.id.txtTitulo);
            btnExcluir = itemView.findViewById(R.id.btnExcluir);


        }
    }



}
