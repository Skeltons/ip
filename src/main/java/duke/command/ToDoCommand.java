package duke.command;

import duke.ui.Ui;
import duke.storage.Storage;
import duke.task.TaskList;
import duke.exception.DukeException;
import duke.task.Todo;

/**
 * A subclass of Command that represents the
 * command to add a todo task into the TaskList.
 */
public class ToDoCommand extends Command {

    /**
     * Constructor of ToDoCommand.
     * @param command Command from the user.
     */
    public ToDoCommand(String[] command) {
        super(command);
    }

    /**
     * Method to add a todo task into the TaskList.
     * @param tasks List of tasks.
     * @param ui Ui of the chat.
     * @param storage Storage of Duke.
     */
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        try {
            if (command.length == 1) {
                throw new DukeException(null, null);
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < command.length; i++) {
                sb.append(command[i]);
                if (i + 1 != command.length) {
                    sb.append(" ");
                }
            }
            tasks.add(new Todo(sb.toString()));
            ui.addMsg(tasks);
            storage.write(tasks);
        } catch (DukeException e) {
            ui.todoError();
        }
    }
}