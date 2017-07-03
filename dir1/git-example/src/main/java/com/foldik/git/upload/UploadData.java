package com.foldik.git.upload;

public class UploadData {

    private final String gitUser;
    private final String gitToken;
    private final String content;
    private final String message;

    public UploadData(String gitUser, String gitToken, String content, String message) {
        this.gitUser = gitUser;
        this.gitToken = gitToken;
        this.content = content;
        this.message = message;
    }

    public String getGitUser() {
        return gitUser;
    }

    public String getGitToken() {
        return gitToken;
    }

    public String getContent() {
        return content;
    }

    public String getMessage() {
        return message;
    }
}
