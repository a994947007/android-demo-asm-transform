package com.android.demo.plugin;

import com.android.build.gradle.AppExtension;

import org.gradle.api.Action;
import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class ASMPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        final ASMPluginExt asmPluginExt = project.getExtensions().create("asmPlugin", ASMPluginExt.class);
        project.afterEvaluate(new Action<Project>() {
            @Override
            public void execute(Project project) {
                AppExtension appExtension = project.getExtensions().getByType(AppExtension.class);
                appExtension.registerTransform(new ASMTransform(asmPluginExt.getClassHandlerPath()));
            }
        });
    }
}