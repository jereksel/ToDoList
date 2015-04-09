package klimczak.todolist;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.os.Debug;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Locale;

import klimczak.todolist.model.Entries;
import klimczak.todolist.model.Entry;

/**
 * Created by cj on 2015-04-09.
 */
public class EntryAdapter extends ArrayAdapter<Entry>
{
	private Context context;
	private int layout;
	private ArrayList<Entry> entries;

	public EntryAdapter(Context context, int layout, ArrayList<Entry> entries)
	{
		super(context, layout);
		this.context = context;
		this.layout = layout;
		this.entries = entries;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View view = inflater.inflate(layout, parent, false);
		TextView entryContent = (TextView) view.findViewById(R.id.entryContent);
		TextView entryDate = (TextView) view.findViewById(R.id.entryDate);
		Entry entry = entries.get(position);
		Log.d("entry", "trying to draw entry number " + position + " ( " + entry.getContent() + " )");

		entryContent.setText(entry.getContent());
		entryDate.setText("test");//entry.getDate().toString());

		return view;
	}

}
