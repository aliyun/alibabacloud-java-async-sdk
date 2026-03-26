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
 * {@link McpConfig} extends {@link TeaModel}
 *
 * <p>McpConfig</p>
 */
public class McpConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("boundConfiguration")
    private BoundConfiguration boundConfiguration;

    @com.aliyun.core.annotation.NameInMap("mcpProxyConfiguration")
    private McpProxyConfiguration mcpProxyConfiguration;

    @com.aliyun.core.annotation.NameInMap("proxyEnabled")
    private Boolean proxyEnabled;

    @com.aliyun.core.annotation.NameInMap("sessionAffinity")
    private String sessionAffinity;

    @com.aliyun.core.annotation.NameInMap("sessionAffinityConfig")
    private String sessionAffinityConfig;

    private McpConfig(Builder builder) {
        this.boundConfiguration = builder.boundConfiguration;
        this.mcpProxyConfiguration = builder.mcpProxyConfiguration;
        this.proxyEnabled = builder.proxyEnabled;
        this.sessionAffinity = builder.sessionAffinity;
        this.sessionAffinityConfig = builder.sessionAffinityConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static McpConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return boundConfiguration
     */
    public BoundConfiguration getBoundConfiguration() {
        return this.boundConfiguration;
    }

    /**
     * @return mcpProxyConfiguration
     */
    public McpProxyConfiguration getMcpProxyConfiguration() {
        return this.mcpProxyConfiguration;
    }

    /**
     * @return proxyEnabled
     */
    public Boolean getProxyEnabled() {
        return this.proxyEnabled;
    }

    /**
     * @return sessionAffinity
     */
    public String getSessionAffinity() {
        return this.sessionAffinity;
    }

    /**
     * @return sessionAffinityConfig
     */
    public String getSessionAffinityConfig() {
        return this.sessionAffinityConfig;
    }

    public static final class Builder {
        private BoundConfiguration boundConfiguration; 
        private McpProxyConfiguration mcpProxyConfiguration; 
        private Boolean proxyEnabled; 
        private String sessionAffinity; 
        private String sessionAffinityConfig; 

        private Builder() {
        } 

        private Builder(McpConfig model) {
            this.boundConfiguration = model.boundConfiguration;
            this.mcpProxyConfiguration = model.mcpProxyConfiguration;
            this.proxyEnabled = model.proxyEnabled;
            this.sessionAffinity = model.sessionAffinity;
            this.sessionAffinityConfig = model.sessionAffinityConfig;
        } 

        /**
         * <p>工具的绑定配置，定义工具与 HTTP 路径和方法的映射关系</p>
         */
        public Builder boundConfiguration(BoundConfiguration boundConfiguration) {
            this.boundConfiguration = boundConfiguration;
            return this;
        }

        /**
         * <p>MCP 代理的详细配置，包括钩子函数等，用于在 MCP 请求处理过程中执行自定义逻辑</p>
         */
        public Builder mcpProxyConfiguration(McpProxyConfiguration mcpProxyConfiguration) {
            this.mcpProxyConfiguration = mcpProxyConfiguration;
            return this;
        }

        /**
         * <p>是否启用 MCP 代理功能，启用后可以通过代理配置对 MCP 请求进行拦截和处理</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder proxyEnabled(Boolean proxyEnabled) {
            this.proxyEnabled = proxyEnabled;
            return this;
        }

        /**
         * <p>会话亲和性策略，用于控制请求的路由方式。NONE：无亲和性，MCP_SSE：基于 SSE 的会话亲和性，MCP_STREAMABLE：基于流式 HTTP 的会话亲和性</p>
         * 
         * <strong>example:</strong>
         * <p>MCP_STREAMABLE</p>
         */
        public Builder sessionAffinity(String sessionAffinity) {
            this.sessionAffinity = sessionAffinity;
            return this;
        }

        /**
         * <p>会话亲和性的详细配置信息，JSON 格式字符串，包含会话保持的具体参数</p>
         */
        public Builder sessionAffinityConfig(String sessionAffinityConfig) {
            this.sessionAffinityConfig = sessionAffinityConfig;
            return this;
        }

        public McpConfig build() {
            return new McpConfig(this);
        } 

    } 

}
