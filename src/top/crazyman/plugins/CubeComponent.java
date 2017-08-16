package top.crazyman.plugins;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.components.ApplicationComponent;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class CubeComponent implements ApplicationComponent {
    public CubeComponent() {
        notify("执行", "CubeComponent");
    }

    @Override
    public void initComponent() {
        notify("执行", "initComponent");
    }

    @Override
    public void disposeComponent() {
        notify("执行", "disposeComponent");
    }

    @Override
    @NotNull
    public String getComponentName() {
        return "CubeComponent";
    }

    private void notify(String title, String msg) {
        Notification notification = new Notification("Cube", title, msg, NotificationType.WARNING);
        Notifications.Bus.notify(notification);
    }
}
