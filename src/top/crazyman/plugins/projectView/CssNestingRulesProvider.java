package top.crazyman.plugins.projectView;

import com.intellij.ide.projectView.ProjectViewNestingRulesProvider;
import org.jetbrains.annotations.NotNull;

public class CssNestingRulesProvider implements ProjectViewNestingRulesProvider {
    public CssNestingRulesProvider() {
    }

    public void addFileNestingRules(@NotNull Consumer consumer) {
        consumer.addNestingRule(".css", ".min.css.map2");
    }
}
