package catobot.exception;

/**
 * Represents exception when the task list is empty.
 */
public class EmptyTaskListException extends BotException {
    /**
     * Constructor for EmptyTaskListException.
     */
    public EmptyTaskListException() {
        super("There are no tasks currently! Try to add one!");
    }
}
