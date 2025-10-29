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
 * {@link AgentRuntimeEndpoint} extends {@link TeaModel}
 *
 * <p>AgentRuntimeEndpoint</p>
 */
public class AgentRuntimeEndpoint extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentRuntimeEndpointArn")
    private String agentRuntimeEndpointArn;

    @com.aliyun.core.annotation.NameInMap("agentRuntimeEndpointId")
    private String agentRuntimeEndpointId;

    @com.aliyun.core.annotation.NameInMap("agentRuntimeEndpointName")
    private String agentRuntimeEndpointName;

    @com.aliyun.core.annotation.NameInMap("agentRuntimeId")
    private String agentRuntimeId;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("endpointPublicUrl")
    private String endpointPublicUrl;

    @com.aliyun.core.annotation.NameInMap("routingConfiguration")
    private RoutingConfiguration routingConfiguration;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("statusReason")
    private String statusReason;

    @com.aliyun.core.annotation.NameInMap("targetVersion")
    private String targetVersion;

    private AgentRuntimeEndpoint(Builder builder) {
        this.agentRuntimeEndpointArn = builder.agentRuntimeEndpointArn;
        this.agentRuntimeEndpointId = builder.agentRuntimeEndpointId;
        this.agentRuntimeEndpointName = builder.agentRuntimeEndpointName;
        this.agentRuntimeId = builder.agentRuntimeId;
        this.description = builder.description;
        this.endpointPublicUrl = builder.endpointPublicUrl;
        this.routingConfiguration = builder.routingConfiguration;
        this.status = builder.status;
        this.statusReason = builder.statusReason;
        this.targetVersion = builder.targetVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgentRuntimeEndpoint create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentRuntimeEndpointArn
     */
    public String getAgentRuntimeEndpointArn() {
        return this.agentRuntimeEndpointArn;
    }

    /**
     * @return agentRuntimeEndpointId
     */
    public String getAgentRuntimeEndpointId() {
        return this.agentRuntimeEndpointId;
    }

    /**
     * @return agentRuntimeEndpointName
     */
    public String getAgentRuntimeEndpointName() {
        return this.agentRuntimeEndpointName;
    }

    /**
     * @return agentRuntimeId
     */
    public String getAgentRuntimeId() {
        return this.agentRuntimeId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return endpointPublicUrl
     */
    public String getEndpointPublicUrl() {
        return this.endpointPublicUrl;
    }

    /**
     * @return routingConfiguration
     */
    public RoutingConfiguration getRoutingConfiguration() {
        return this.routingConfiguration;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return statusReason
     */
    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * @return targetVersion
     */
    public String getTargetVersion() {
        return this.targetVersion;
    }

    public static final class Builder {
        private String agentRuntimeEndpointArn; 
        private String agentRuntimeEndpointId; 
        private String agentRuntimeEndpointName; 
        private String agentRuntimeId; 
        private String description; 
        private String endpointPublicUrl; 
        private RoutingConfiguration routingConfiguration; 
        private String status; 
        private String statusReason; 
        private String targetVersion; 

        private Builder() {
        } 

        private Builder(AgentRuntimeEndpoint model) {
            this.agentRuntimeEndpointArn = model.agentRuntimeEndpointArn;
            this.agentRuntimeEndpointId = model.agentRuntimeEndpointId;
            this.agentRuntimeEndpointName = model.agentRuntimeEndpointName;
            this.agentRuntimeId = model.agentRuntimeId;
            this.description = model.description;
            this.endpointPublicUrl = model.endpointPublicUrl;
            this.routingConfiguration = model.routingConfiguration;
            this.status = model.status;
            this.statusReason = model.statusReason;
            this.targetVersion = model.targetVersion;
        } 

        /**
         * agentRuntimeEndpointArn.
         */
        public Builder agentRuntimeEndpointArn(String agentRuntimeEndpointArn) {
            this.agentRuntimeEndpointArn = agentRuntimeEndpointArn;
            return this;
        }

        /**
         * agentRuntimeEndpointId.
         */
        public Builder agentRuntimeEndpointId(String agentRuntimeEndpointId) {
            this.agentRuntimeEndpointId = agentRuntimeEndpointId;
            return this;
        }

        /**
         * agentRuntimeEndpointName.
         */
        public Builder agentRuntimeEndpointName(String agentRuntimeEndpointName) {
            this.agentRuntimeEndpointName = agentRuntimeEndpointName;
            return this;
        }

        /**
         * agentRuntimeId.
         */
        public Builder agentRuntimeId(String agentRuntimeId) {
            this.agentRuntimeId = agentRuntimeId;
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
         * <p>智能体运行时端点的公网访问地址</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://ar-1234567890abcdef.cn-hangzhou.agentrun.aliyuncs.com">https://ar-1234567890abcdef.cn-hangzhou.agentrun.aliyuncs.com</a></p>
         */
        public Builder endpointPublicUrl(String endpointPublicUrl) {
            this.endpointPublicUrl = endpointPublicUrl;
            return this;
        }

        /**
         * <p>智能体运行时端点的路由配置，支持多版本权重分配</p>
         */
        public Builder routingConfiguration(RoutingConfiguration routingConfiguration) {
            this.routingConfiguration = routingConfiguration;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * statusReason.
         */
        public Builder statusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }

        /**
         * targetVersion.
         */
        public Builder targetVersion(String targetVersion) {
            this.targetVersion = targetVersion;
            return this;
        }

        public AgentRuntimeEndpoint build() {
            return new AgentRuntimeEndpoint(this);
        } 

    } 

}
