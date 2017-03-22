package gitpro;

import gitpro.exceptions.GitPROException;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by wackloner on 22-Mar-17.
 */
public class GitPRO {
    private CommandHandler commandHandler;

    public GitPRO(Path currentDirectory) {
        commandHandler = new CommandHandler(currentDirectory);
    }

    public GitPRO(String currentDirectory) {
        this(Paths.get(currentDirectory));
    }

    public void initNewRepository() throws GitPROException {
        commandHandler.initRepository();
    }

    public void loadRepository() {
        commandHandler.loadRepository();
    }

    public void commit(String message) {

    }

    public void checkout(String branchName) {

    }

    public void createBranch(String branchName) {

    }

    public void deleteBranch(String branchName) {

    }

    public void merge(String branchName) {

    }
}
