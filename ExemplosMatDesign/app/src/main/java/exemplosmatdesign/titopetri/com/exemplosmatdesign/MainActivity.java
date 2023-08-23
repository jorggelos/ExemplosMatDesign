package exemplosmatdesign.titopetri.com.exemplosmatdesign;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    RecyclerView recyclerView;
    ArrayList<Episodio> episodios;
FloatingActionButton floatingActionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.minhaToolbar);
        recyclerView = findViewById(R.id.minharecview);
        floatingActionButton = findViewById(R.id.meuFab);


        toolbar.setLogo(R.drawable.moeda);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Episodio episodio = new Episodio("Tito Petri","dfsdfs","HDHd7837","12 de janeiro de 2017");
        episodios = new ArrayList<Episodio>();
        episodios.add(new Episodio("Android","dfsdfs","HDHd7837","12 de janeiro de 2017"));
        episodios.add(new Episodio("iOS","dfsdfs","HDHd7837","25 de dezembro de 2017"));
        episodios.add(new Episodio("Unity3D","dfsdfs","HDHd7837","12 de janeiro de 2017"));
        episodios.add(new Episodio("Godot","dfsdfs","HDHd7837","12 de janeiro de 2017"));
        episodios.add(new Episodio("Android Studio","dfsdfs","HDHd7837","12 de janeiro de 2017"));
        episodios.add(new Episodio("3D Studio Max","dfsdfs","HDHd7837","12 de janeiro de 2017"));
        episodios.add(new Episodio("Tito Petri","dfsdfs","HDHd7837","12 de janeiro de 2017"));
        episodios.add(new Episodio("Tito Petri","dfsdfs","HDHd7837","12 de janeiro de 2017"));
        episodios.add(new Episodio("Tito Petri","dfsdfs","HDHd7837","12 de janeiro de 2017"));

        MeuAdaptador meuAdaptador = new MeuAdaptador(episodios, getApplicationContext(), new MeuAdaptador.OnItemClickListener() {
            @Override
            public void onItemClick(Episodio episodio) {
                Toast.makeText(MainActivity.this, ""+episodio.getTitulo(), Toast.LENGTH_SHORT).show();
            }
        });
        recyclerView.setAdapter(meuAdaptador);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "FLOATING BUTTON", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.meu_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.item_contato:
                Toast.makeText(this, "Clicou Contato!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_fav:
                Toast.makeText(this, "Clicou Favorito!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_home:
                Toast.makeText(this, "Clicou Home!", Toast.LENGTH_SHORT).show();
                break;
            case android.R.id.home:
                Toast.makeText(this, "Clicou BackButon!", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
