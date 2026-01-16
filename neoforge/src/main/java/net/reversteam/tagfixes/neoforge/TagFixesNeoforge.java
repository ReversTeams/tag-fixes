package net.reversteam.tagfixes.neoforge;

import net.neoforged.fml.common.Mod;

import net.reversteam.tagfixes.TagFixes;

@Mod(TagFixes.MOD_ID)
public final class TagFixesNeoforge {

    public static final String MOD_ID = "tagfixes";

    public TagFixesNeoforge() {
        TagFixes.init();
    }
}