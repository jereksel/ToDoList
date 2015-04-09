package klimczak.todolist;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import klimczak.todolist.model.Entries;
import klimczak.todolist.model.Entry;


public class MainActivity extends ActionBarActivity
{
	private ListView listView;
	private EntryAdapter entryAdapter;
	private EditText editText;

	private ArrayAdapter<String> adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		listView = (ListView) findViewById(R.id.listView);
		editText = (EditText) findViewById(R.id.editText);

		if (Entries.isEmpty())
		{
			Entries.add(new Entry("test1", new Date()));
			Entries.add(new Entry("test2", new Date()));
			Entries.add(new Entry("test3", new Date()));
			Entries.add(new Entry("test4", new Date()));
			Entries.add(new Entry("test5", new Date()));
		}

		entryAdapter = new EntryAdapter(this, R.layout.entry_layout, Entries.getEntries());
		listView.setAdapter(entryAdapter);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		
		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings)
		{
			return true;
		}
		
		return super.onOptionsItemSelected(item);
	}

	public void addEntry(View view)
	{
		Entries.add(new Entry(editText.getText().toString(), new Date()));
		entryAdapter.notifyDataSetChanged();
	}
}
