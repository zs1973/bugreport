package com.drake.softinput.example.base

import android.app.Application
import androidx.core.content.ContextCompat
import com.drake.brv.utils.BRV
import com.scwang.smart.refresh.footer.ClassicsFooter
import com.scwang.smart.refresh.header.MaterialHeader
import com.scwang.smart.refresh.layout.SmartRefreshLayout

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        BRV.modelId = com.drake.softinput.example.BR.m
        SmartRefreshLayout.setDefaultRefreshHeaderCreator { context, layout ->
            MaterialHeader(this).apply {
                setColorSchemeColors(ContextCompat.getColor(context, com.drake.brv.R.color.primary_dark_material_dark))
            }
        }
        SmartRefreshLayout.setDefaultRefreshFooterCreator { context, layout -> ClassicsFooter(this) }
    }
}