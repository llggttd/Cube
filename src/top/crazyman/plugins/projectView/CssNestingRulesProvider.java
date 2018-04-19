package top.crazyman.plugins.projectView;

import com.intellij.ide.projectView.ProjectViewNestingRulesProvider;
import org.jetbrains.annotations.NotNull;

public class CssNestingRulesProvider implements ProjectViewNestingRulesProvider {

    public CssNestingRulesProvider() {
    }

    @Override
    public void addFileNestingRules(@NotNull Consumer consumer) {
        consumer.addNestingRule(".route.js", ".vue");
        consumer.addNestingRule(".route.js", ".children.vue");
    }
}
