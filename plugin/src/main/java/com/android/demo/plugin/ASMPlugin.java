package com.android.demo.plugin;

import com.android.build.gradle.AppExtension;

import org.gradle.api.Action;
import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class ASMPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        final ASMPluginExt asmPluginExt = project.getExtensions().create("asmPlugin", ASMPluginExt.class);
        project.afterEvaluate(pro -> {
            AppExtension appExtension = pro.getExtensions().getByType(AppExtension.class);
            appExtension.registerTransform(new ASMTransform(asmPluginExt.getClassHandlerPath()));
        });
    }
}