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
 * {@link MCPAPIConfiguration} extends {@link TeaModel}
 *
 * <p>MCPAPIConfiguration</p>
 */
public class MCPAPIConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("exposedUriPath")
    private String exposedUriPath;

    @com.aliyun.core.annotation.NameInMap("mcpStatisticsEnable")
    private Boolean mcpStatisticsEnable;

    @com.aliyun.core.annotation.NameInMap("protocol")
    private String protocol;

    @com.aliyun.core.annotation.NameInMap("toolId")
    private String toolId;

    private MCPAPIConfiguration(Builder builder) {
        this.description = builder.description;
        this.exposedUriPath = builder.exposedUriPath;
        this.mcpStatisticsEnable = builder.mcpStatisticsEnable;
        this.protocol = builder.protocol;
        this.toolId = builder.toolId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MCPAPIConfiguration create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder {
        private String description; 
        private String exposedUriPath; 
        private Boolean mcpStatisticsEnable; 
        private String protocol; 
        private String toolId; 

        private Builder() {
        } 

        private Builder(MCPAPIConfiguration model) {
            this.description = model.description;
            this.exposedUriPath = model.exposedUriPath;
            this.mcpStatisticsEnable = model.mcpStatisticsEnable;
            this.protocol = model.protocol;
            this.toolId = model.toolId;
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

        public MCPAPIConfiguration build() {
            return new MCPAPIConfiguration(this);
        } 

    } 

}
