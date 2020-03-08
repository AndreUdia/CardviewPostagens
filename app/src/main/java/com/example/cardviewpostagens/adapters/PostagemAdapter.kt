import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cardviewpostagens.R
import kotlinx.android.synthetic.main.postagem_item.view.*

class PostagemAdapter(private val postagens: List<Postagem>,
                      private val context: Context
) : RecyclerView.Adapter<PostagemAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val posta = postagens[position]
        holder.bindView(posta)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.postagem_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return postagens.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(postagem: Postagem) {

            val titulo = itemView.textNomePostagem
            val descricao = itemView.textSubDescricaoPostagem
            val imagem = itemView.postagemImage


            titulo.text = postagem.tituloPostagem
            descricao.text = postagem.tituloPostagem
            imagem.setImageResource(postagem.imagemPostagem)

        }

    }

}