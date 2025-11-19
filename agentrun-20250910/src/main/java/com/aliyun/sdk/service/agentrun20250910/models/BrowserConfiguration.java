// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BrowserConfiguration} extends {@link TeaModel}
 *
 * <p>BrowserConfiguration</p>
 */
public class BrowserConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("browserType")
    private String browserType;

    @com.aliyun.core.annotation.NameInMap("enableExtension")
    private java.util.List<String> enableExtension;

    @com.aliyun.core.annotation.NameInMap("headless")
    private Boolean headless;

    @com.aliyun.core.annotation.NameInMap("userAgent")
    private String userAgent;

    @com.aliyun.core.annotation.NameInMap("viewPort")
    private ViewPortConfiguration viewPort;

    private BrowserConfiguration(Builder builder) {
        this.browserType = builder.browserType;
        this.enableExtension = builder.enableExtension;
        this.headless = builder.headless;
        this.userAgent = builder.userAgent;
        this.viewPort = builder.viewPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BrowserConfiguration create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return browserType
     */
    public String getBrowserType() {
        return this.browserType;
    }

    /**
     * @return enableExtension
     */
    public java.util.List<String> getEnableExtension() {
        return this.enableExtension;
    }

    /**
     * @return headless
     */
    public Boolean getHeadless() {
        return this.headless;
    }

    /**
     * @return userAgent
     */
    public String getUserAgent() {
        return this.userAgent;
    }

    /**
     * @return viewPort
     */
    public ViewPortConfiguration getViewPort() {
        return this.viewPort;
    }

    public static final class Builder {
        private String browserType; 
        private java.util.List<String> enableExtension; 
        private Boolean headless; 
        private String userAgent; 
        private ViewPortConfiguration viewPort; 

        private Builder() {
        } 

        private Builder(BrowserConfiguration model) {
            this.browserType = model.browserType;
            this.enableExtension = model.enableExtension;
            this.headless = model.headless;
            this.userAgent = model.userAgent;
            this.viewPort = model.viewPort;
        } 

        /**
         * browserType.
         */
        public Builder browserType(String browserType) {
            this.browserType = browserType;
            return this;
        }

        /**
         * <p>要启用的浏览器扩展列表</p>
         */
        public Builder enableExtension(java.util.List<String> enableExtension) {
            this.enableExtension = enableExtension;
            return this;
        }

        /**
         * <p>是否以无头模式运行浏览器</p>
         */
        public Builder headless(Boolean headless) {
            this.headless = headless;
            return this;
        }

        /**
         * <p>浏览器用户代理字符串</p>
         */
        public Builder userAgent(String userAgent) {
            this.userAgent = userAgent;
            return this;
        }

        /**
         * viewPort.
         */
        public Builder viewPort(ViewPortConfiguration viewPort) {
            this.viewPort = viewPort;
            return this;
        }

        public BrowserConfiguration build() {
            return new BrowserConfiguration(this);
        } 

    } 

}
