package net.reversteam.tagfixes.forge;

import net.minecraftforge.fml.common.Mod;

import net.reversteam.tagfixes.TagFixes;

@Mod(TagFixes.MOD_ID)
public final class TagFixesForge {
    public TagFixesForge() {
        // Run our common setup.
        TagFixes.init();
    }
}
