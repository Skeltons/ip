package duke.task;

/**
 * Program that represents a task.
 *
 * @author Oskar Lew
 * @version 0.1
 * @since 0.1
 */
public class Task {
    protected String description;
    protected boolean isDone;

    /**
     * Constructor for Task.
     * @param description Description of the task.
     */
    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    /**
     * Returns the status of the task as a string.
     * @return statusIcon
     */
    public String getStatusIcon() {
        return (isDone ? "[X]" : "[ ]"); // mark done task with X
    }

    /**
     * Method to mark the task as done.
     */
    public void markAsDone() {
        this.isDone = true;
    }

    /**
     * Method to unmark the task.
     */
    public void unmarkTask() {
        this.isDone = false;
    }

    /**
     * Method to get the time specified in the task.
     * @return Time of task.
     */
    public String getTiming() {
        return "No timing";
    }

    /**
     * Returns a string representation of a task.
     * @return String representation.
     */
    public String toString() {
        return "";
    }
}
