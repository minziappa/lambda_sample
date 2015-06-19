package io.lambda.sample;

import java.io.File;

public interface FileFilter {
	boolean accept(File pathname);
}