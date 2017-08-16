package top.crazyman.plugins;

import com.intellij.openapi.components.ApplicationComponent;
import org.jetbrains.annotations.NotNull;

public class CubeComponent implements ApplicationComponent {
    public CubeComponent() {
        System.out.printf("CubeComponent");
    }

    @Override
    public void initComponent() {
        System.out.printf("initComponent");
    }

    @Override
    public void disposeComponent() {
        System.out.printf("disposeComponent");
    }

    @Override
    @NotNull
    public String getComponentName() {
        return "CubeComponent";
    }
}
