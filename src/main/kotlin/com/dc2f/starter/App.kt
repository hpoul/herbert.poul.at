package com.dc2f.starter

import com.dc2f.common.*
import com.dc2f.common.contentdef.BaseWebsite
import com.dc2f.common.theme.BaseTheme
import com.dc2f.render.ThemeConfig

class WebsiteTheme : BaseTheme() {
    override fun configure(config: ThemeConfig) {
        super.configure(config)
    }
}

abstract class MyWebsite : BaseWebsite

fun main(args: Array<String>) =
    Generator(
        GeneratorDc2fConfig(
            contentDirectory = "web/content",
            staticDirectory = "web/static",
            assetBaseDirectory = "src/main/resources",
            rootContentType = MyWebsite::class,
            theme = WebsiteTheme(),
            urlConfigFromRootContent = { it.config.url }
        )
    ).main(args)
