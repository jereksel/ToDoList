package klimczak.todolist.model;

import java.util.Date;

/**
 * Created by cj on 2015-04-09.
 */
public class Entry
{
	private String content;
	private Date date;

	public Entry(String content, Date date)
	{
		this.content = content;
		this.date = date;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public Date getDate()
	{
		return date;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}
}
