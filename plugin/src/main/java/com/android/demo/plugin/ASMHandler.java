package com.android.demo.plugin;

import java.io.File;

public interface ASMHandler {
    byte[] handle(File classFile);
}
