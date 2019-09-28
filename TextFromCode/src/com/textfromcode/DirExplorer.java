package com.textfromcode;

import java.io.File;
 
public class DirExplorer {
    public interface Filehandler {
        void handle(int level, String path, File file);
    }
 
    public interface FileFilter {
        boolean interested(int level, String path, File file);
    }
 
    private Filehandler filehandler;
    private FileFilter fileFilter;
 
    public DirExplorer(FileFilter filefilter, Filehandler filehandler) {
        this.fileFilter = filefilter;
        this.filehandler = filehandler;
    }
 
    public void explore(File root) {
        explore(0, "", root);
    }
 
    private void explore(int level, String path, File file) {
        if (file.isDirectory()) {
            for (File subfile : file.listFiles()) {
                explore(level + 1, path + "/" + subfile.getName(), subfile);
            }
        } else {
            if (fileFilter.interested(level, path, file)) {
                filehandler.handle(level, path, file);
            }
        }
    }
 
}