package cz.juzna.intellij.neon.editor;

import com.intellij.application.options.IndentOptionsEditor;
import com.intellij.lang.Language;
import com.intellij.psi.codeStyle.CommonCodeStyleSettings;
import com.intellij.psi.codeStyle.CommonCodeStyleSettings.IndentOptions;
import com.intellij.psi.codeStyle.LanguageCodeStyleSettingsProvider;
import lv.kid.vermut.intellij.ansible.YamlLanguage;
import org.jetbrains.annotations.NotNull;

/**
 * Code style settings (tabs etc)
 */
public class NeonLanguageCodeStyleSettingsProvider extends LanguageCodeStyleSettingsProvider
{
	public CommonCodeStyleSettings getDefaultCommonSettings()
	{
		CommonCodeStyleSettings defaultSettings = new CommonCodeStyleSettings(YamlLanguage.INSTANCE);
		IndentOptions indentOptions = defaultSettings.initIndentOptions();
		indentOptions.INDENT_SIZE = 2;
		indentOptions.TAB_SIZE = 2;
		indentOptions.USE_TAB_CHARACTER = false;
		indentOptions.SMART_TABS = false;

		return defaultSettings;
	}

	public IndentOptionsEditor getIndentOptionsEditor()
	{
		return new IndentOptionsEditor();
	}

	@NotNull
	public Language getLanguage() {
		return YamlLanguage.INSTANCE;
	}

	public String getCodeSample(@NotNull SettingsType settingsType) {
		return "product:\n  name: Neon\n  version: 4\n  vendor: juzna.cz\n  url: \"http://blog.juzna.cz\"";
	}
}
