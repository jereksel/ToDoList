package klimczak.todolist.model;
import android.support.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/**
 * Created by cj on 2015-04-09.
 */
public class Entries
{
	private static ArrayList<Entry> entries = new ArrayList<>();

	public static ArrayList<Entry> getEntries()
	{
		return entries;
	}

	public static void clear()
	{
		entries.clear();
	}

	public static void add(Entry entry)
	{
		entries.add(entry);
	}

	public static void remove(Entry entry)
	{
		entries.remove(entry);
	}

	public static boolean contains(Entry entry)
	{
		return entries.contains(entry);
	}
	public static boolean isEmpty()
	{
		return entries.isEmpty();
	}

	public static Entry get(int position)
	{
		if(position < entries.size())return entries.get(position);
		else return null;
	}

	public static int size()
	{
		return entries.size();
	}
}
