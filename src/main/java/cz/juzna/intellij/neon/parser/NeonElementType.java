package cz.juzna.intellij.neon.parser;

import com.intellij.psi.tree.IElementType;
import lv.kid.vermut.intellij.ansible.YamlLanguage;
import org.jetbrains.annotations.NotNull;


public class NeonElementType extends IElementType {
	public NeonElementType(@NotNull String debugName) {
		super(debugName, YamlLanguage.INSTANCE);
	}

	public String toString() {
		return "[Neon] " + super.toString();
	}
}
