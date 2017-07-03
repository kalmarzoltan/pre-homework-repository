package com.foldik.git.upload;

import java.io.IOException;

import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

public class DefaultGitHubPageCreator implements GitHubPageCreator {

	@Override
	public String create(UploadData uploadData) {
		try {
			GitHub github = GitHub.connect(uploadData.getGitUser(), uploadData.getGitToken());
			github.createRepository("git-homework-ver2").create().createContent("Hello Homework", "Message",
					"index.html", "gh-pages");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return null;
	}
}
