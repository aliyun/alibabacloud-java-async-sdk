// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link AgentInfo} extends {@link TeaModel}
 *
 * <p>AgentInfo</p>
 */
public class AgentInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentAccess")
    private AgentAccess agentAccess;

    @com.aliyun.core.annotation.NameInMap("agentId")
    private String agentId;

    @com.aliyun.core.annotation.NameInMap("agentType")
    private String agentType;

    @com.aliyun.core.annotation.NameInMap("allowedCapabilities")
    private java.util.List<String> allowedCapabilities;

    @com.aliyun.core.annotation.NameInMap("createTimestamp")
    private Long createTimestamp;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.NameInMap("modelAccess")
    private ModelAccess modelAccess;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("updateTimestamp")
    private Long updateTimestamp;

    private AgentInfo(Builder builder) {
        this.agentAccess = builder.agentAccess;
        this.agentId = builder.agentId;
        this.agentType = builder.agentType;
        this.allowedCapabilities = builder.allowedCapabilities;
        this.createTimestamp = builder.createTimestamp;
        this.description = builder.description;
        this.gatewayId = builder.gatewayId;
        this.modelAccess = builder.modelAccess;
        this.name = builder.name;
        this.resourceGroupId = builder.resourceGroupId;
        this.status = builder.status;
        this.updateTimestamp = builder.updateTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgentInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentAccess
     */
    public AgentAccess getAgentAccess() {
        return this.agentAccess;
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return agentType
     */
    public String getAgentType() {
        return this.agentType;
    }

    /**
     * @return allowedCapabilities
     */
    public java.util.List<String> getAllowedCapabilities() {
        return this.allowedCapabilities;
    }

    /**
     * @return createTimestamp
     */
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return modelAccess
     */
    public ModelAccess getModelAccess() {
        return this.modelAccess;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updateTimestamp
     */
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public static final class Builder {
        private AgentAccess agentAccess; 
        private String agentId; 
        private String agentType; 
        private java.util.List<String> allowedCapabilities; 
        private Long createTimestamp; 
        private String description; 
        private String gatewayId; 
        private ModelAccess modelAccess; 
        private String name; 
        private String resourceGroupId; 
        private String status; 
        private Long updateTimestamp; 

        private Builder() {
        } 

        private Builder(AgentInfo model) {
            this.agentAccess = model.agentAccess;
            this.agentId = model.agentId;
            this.agentType = model.agentType;
            this.allowedCapabilities = model.allowedCapabilities;
            this.createTimestamp = model.createTimestamp;
            this.description = model.description;
            this.gatewayId = model.gatewayId;
            this.modelAccess = model.modelAccess;
            this.name = model.name;
            this.resourceGroupId = model.resourceGroupId;
            this.status = model.status;
            this.updateTimestamp = model.updateTimestamp;
        } 

        /**
         * <p>The associated resource information for the Agent access capability. Returns null if the Agent access capability is not configured.</p>
         */
        public Builder agentAccess(AgentAccess agentAccess) {
            this.agentAccess = agentAccess;
            return this;
        }

        /**
         * <p>Agent ID。</p>
         * 
         * <strong>example:</strong>
         * <p>agent-1</p>
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>The Agent type. DashScope (Bailian) allows only Agent access. Dify allows both Agent access and model access. ClaudeCode allows only model access. Custom allows both Agent access and model access.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        public Builder agentType(String agentType) {
            this.agentType = agentType;
            return this;
        }

        /**
         * <p>The list of capabilities that the current Agent type allows to be configured. This field does not indicate that the capabilities are already configured. To determine whether a capability is configured, check whether agentAccess or modelAccess is null.</p>
         */
        public Builder allowedCapabilities(java.util.List<String> allowedCapabilities) {
            this.allowedCapabilities = allowedCapabilities;
            return this;
        }

        /**
         * <p>The Agent creation time, in Unix millisecond timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1755129600000</p>
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * <p>The Agent description.</p>
         * 
         * <strong>example:</strong>
         * <p>custom agent</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The gateway ID to which the Agent belongs. When reading the associated API deployment configuration, select the configuration whose gatewayId matches this value.</p>
         * 
         * <strong>example:</strong>
         * <p>gateway-1</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The associated resource information for the model access capability. Returns null if the model access capability is not configured.</p>
         */
        public Builder modelAccess(ModelAccess modelAccess) {
            this.modelAccess = modelAccess;
            return this;
        }

        /**
         * <p>The Agent name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The resource group ID in which the Agent is saved.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-1</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The Agent status. An Agent that is successfully created and queryable always returns Ready. Internal creation or compensation states are not returned externally.</p>
         * 
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The Agent last update time, in Unix millisecond timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1755129600000</p>
         */
        public Builder updateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }

        public AgentInfo build() {
            return new AgentInfo(this);
        } 

    } 

    /**
     * 
     * {@link AgentInfo} extends {@link TeaModel}
     *
     * <p>AgentInfo</p>
     */
    public static class AgentAccess extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("httpApiId")
        private String httpApiId;

        private AgentAccess(Builder builder) {
            this.httpApiId = builder.httpApiId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentAccess create() {
            return builder().build();
        }

        /**
         * @return httpApiId
         */
        public String getHttpApiId() {
            return this.httpApiId;
        }

        public static final class Builder {
            private String httpApiId; 

            private Builder() {
            } 

            private Builder(AgentAccess model) {
                this.httpApiId = model.httpApiId;
            } 

            /**
             * <p>The HTTP API ID associated with the Agent access capability. The frontend uses this ID to call existing HTTP API, route, consumer authorization, policy, and plugin query interfaces.</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;httpApiId&quot;: &quot;api-abc123&quot; }</p>
             */
            public Builder httpApiId(String httpApiId) {
                this.httpApiId = httpApiId;
                return this;
            }

            public AgentAccess build() {
                return new AgentAccess(this);
            } 

        } 

    }
    /**
     * 
     * {@link AgentInfo} extends {@link TeaModel}
     *
     * <p>AgentInfo</p>
     */
    public static class ModelAccess extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("consumerIds")
        private java.util.List<String> consumerIds;

        @com.aliyun.core.annotation.NameInMap("modelApiId")
        private String modelApiId;

        private ModelAccess(Builder builder) {
            this.consumerIds = builder.consumerIds;
            this.modelApiId = builder.modelApiId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelAccess create() {
            return builder().build();
        }

        /**
         * @return consumerIds
         */
        public java.util.List<String> getConsumerIds() {
            return this.consumerIds;
        }

        /**
         * @return modelApiId
         */
        public String getModelApiId() {
            return this.modelApiId;
        }

        public static final class Builder {
            private java.util.List<String> consumerIds; 
            private String modelApiId; 

            private Builder() {
            } 

            private Builder(ModelAccess model) {
                this.consumerIds = model.consumerIds;
                this.modelApiId = model.modelApiId;
            } 

            /**
             * <p>The list of consumer identity bindings maintained by the Agent domain. The Model API ID and the consumer IDs in this list together identify the Agent identity and take effect on all routes of the Model API. Consumer details and their Model API authorization details can be obtained through existing Consumer API and consumer authorization query interfaces.</p>
             */
            public Builder consumerIds(java.util.List<String> consumerIds) {
                this.consumerIds = consumerIds;
                return this;
            }

            /**
             * <p>The Model API ID associated with the model access capability. Model Access does not distinguish routes. The frontend uses this ID to query the Model API basic information and all routes.</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;modelApiId&quot;: &quot;model-api-1&quot; }</p>
             */
            public Builder modelApiId(String modelApiId) {
                this.modelApiId = modelApiId;
                return this;
            }

            public ModelAccess build() {
                return new ModelAccess(this);
            } 

        } 

    }
}
