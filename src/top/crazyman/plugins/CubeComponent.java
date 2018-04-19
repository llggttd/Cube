package top.crazyman.plugins;

import com.intellij.openapi.components.ApplicationComponent;
import org.jetbrains.annotations.NotNull;

public class CubeComponent implements ApplicationComponent {
    public CubeComponent() {
        notify("RUN", "CubeComponent");
    }

    @Override
    public void initComponent() {
        notify("RUN", "initComponent");
    }

    @Override
    public void disposeComponent() {
        notify("RUN", "disposeComponent");
    }

    @Override
    @NotNull
    public String getComponentName() {
        return "CubeComponent";
    }

    private void notify(String title, String msg) {
//        Notification notification = new Notification("Cube", title, msg, NotificationType.WARNING);
//        Notifications.Bus.notify(notification);
    }
}
