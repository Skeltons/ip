package duke;

import duke.command.Command;
import duke.command.Parser;
import duke.task.Task;
import duke.task.TaskList;
import duke.ui.Ui;
import duke.storage.Storage;

import java.util.LinkedList;

public class Duke {
    Storage storage;
    Ui ui;
    TaskList tasks;

    public Duke(String fileName) {
        this.storage = new Storage(fileName);
        this.ui = new Ui();
        this.tasks = new TaskList();
    }

    private void chat() {
        this.ui.greetings();
        Parser p = new Parser();
        boolean isExit = false;
        while (!isExit) {
            String command = this.ui.getLine();
            Command c = p.parse(command);
            c.execute(tasks, ui, storage);
            isExit = c.isExit();
        }
        ui.endUi();
    }

    public static void main(String[] args) {
        new Duke("duke").chat();
    }
}
