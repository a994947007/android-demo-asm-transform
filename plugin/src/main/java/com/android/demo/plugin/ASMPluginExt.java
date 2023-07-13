package com.android.demo.plugin;

public class ASMPluginExt {
    private String classHandlerPath;

    public ASMPluginExt() {}

    public ASMPluginExt(String classHandlerPath) {
        this.classHandlerPath = classHandlerPath;
    }

    public String getClassHandlerPath() {
        return classHandlerPath;
    }

    public void setClassHandlerPath(String classHandlerPath) {
        this.classHandlerPath = classHandlerPath;
    }
}
