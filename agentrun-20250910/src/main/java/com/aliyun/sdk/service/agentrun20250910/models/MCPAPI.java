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
 * {@link MCPAPI} extends {@link TeaModel}
 *
 * <p>MCPAPI</p>
 */
public class MCPAPI extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("backendConfig")
    private MCPBackendConfig backendConfig;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("exposedUriPath")
    private String exposedUriPath;

    @com.aliyun.core.annotation.NameInMap("match")
    private MCPMatch match;

    @com.aliyun.core.annotation.NameInMap("mcpStatisticsEnable")
    private Boolean mcpStatisticsEnable;

    @com.aliyun.core.annotation.NameInMap("protocol")
    private String protocol;

    @com.aliyun.core.annotation.NameInMap("toolId")
    private String toolId;

    @com.aliyun.core.annotation.NameInMap("toolsConfig")
    private String toolsConfig;

    private MCPAPI(Builder builder) {
        this.backendConfig = builder.backendConfig;
        this.description = builder.description;
        this.exposedUriPath = builder.exposedUriPath;
        this.match = builder.match;
        this.mcpStatisticsEnable = builder.mcpStatisticsEnable;
        this.protocol = builder.protocol;
        this.toolId = builder.toolId;
        this.toolsConfig = builder.toolsConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MCPAPI create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backendConfig
     */
    public MCPBackendConfig getBackendConfig() {
        return this.backendConfig;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return exposedUriPath
     */
    public String getExposedUriPath() {
        return this.exposedUriPath;
    }

    /**
     * @return match
     */
    public MCPMatch getMatch() {
        return this.match;
    }

    /**
     * @return mcpStatisticsEnable
     */
    public Boolean getMcpStatisticsEnable() {
        return this.mcpStatisticsEnable;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return toolId
     */
    public String getToolId() {
        return this.toolId;
    }

    /**
     * @return toolsConfig
     */
    public String getToolsConfig() {
        return this.toolsConfig;
    }

    public static final class Builder {
        private MCPBackendConfig backendConfig; 
        private String description; 
        private String exposedUriPath; 
        private MCPMatch match; 
        private Boolean mcpStatisticsEnable; 
        private String protocol; 
        private String toolId; 
        private String toolsConfig; 

        private Builder() {
        } 

        private Builder(MCPAPI model) {
            this.backendConfig = model.backendConfig;
            this.description = model.description;
            this.exposedUriPath = model.exposedUriPath;
            this.match = model.match;
            this.mcpStatisticsEnable = model.mcpStatisticsEnable;
            this.protocol = model.protocol;
            this.toolId = model.toolId;
            this.toolsConfig = model.toolsConfig;
        } 

        /**
         * backendConfig.
         */
        public Builder backendConfig(MCPBackendConfig backendConfig) {
            this.backendConfig = backendConfig;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * exposedUriPath.
         */
        public Builder exposedUriPath(String exposedUriPath) {
            this.exposedUriPath = exposedUriPath;
            return this;
        }

        /**
         * match.
         */
        public Builder match(MCPMatch match) {
            this.match = match;
            return this;
        }

        /**
         * mcpStatisticsEnable.
         */
        public Builder mcpStatisticsEnable(Boolean mcpStatisticsEnable) {
            this.mcpStatisticsEnable = mcpStatisticsEnable;
            return this;
        }

        /**
         * protocol.
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * toolId.
         */
        public Builder toolId(String toolId) {
            this.toolId = toolId;
            return this;
        }

        /**
         * toolsConfig.
         */
        public Builder toolsConfig(String toolsConfig) {
            this.toolsConfig = toolsConfig;
            return this;
        }

        public MCPAPI build() {
            return new MCPAPI(this);
        } 

    } 

}
