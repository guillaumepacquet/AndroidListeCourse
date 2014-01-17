package com.esaip.android.marketList;

import java.util.ArrayList;
import java.util.List;

import com.esaip.android.beans.Article;
import com.esaip.android.beans.ContainerData;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	public ArrayList<Article> tousLesArticles;
	ListView lvListe;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tousLesArticles=ContainerData.getFeeds();
		lvListe = (ListView)findViewById(R.id.lvListe);
		List<String> listeStrings = null;
		for(Article a:tousLesArticles){
			listeStrings.add(a.getNom());
		}
		lvListe.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listeStrings));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
