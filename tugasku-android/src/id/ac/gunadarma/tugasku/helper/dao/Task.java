package id.ac.gunadarma.tugasku.helper.dao;

import java.util.Date;

import com.google.gson.annotations.Expose;

public class Task {
	@Expose public String id;
	@Expose public Date created;
	@Expose public String content;
	public String user;
	@Expose public Date deadline;
	@Expose public boolean done;
	@Expose public boolean deleted;
	
	public Task() {}

	public Task(String content, Date deadline, boolean done, boolean deleted) {
		this.content = content;
		this.deadline = deadline;
		this.done = done;
		this.deleted = deleted;
	}

	public Task(String id, Date created, String content, String user, Date deadline, boolean done, boolean deleted) {
		this.id = id;
		this.created = created;
		this.content = content;
		this.user = user;
		this.deadline = deadline;
		this.done = done;
		this.deleted = deleted;
	}
	
	public id.ac.gunadarma.tugasku.db.Task getTaskLocal(){
		return new id.ac.gunadarma.tugasku.db.Task(content, deadline.getTime(), done, deleted, id);
	}
}
