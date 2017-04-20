package com.atlassian.clover.api.registry;

/**
 * A region of some source code in a file
 */
public interface SourceInfo {
    int getStartLine();

    int getStartColumn();

    int getEndLine();

    int getEndColumn();
}
