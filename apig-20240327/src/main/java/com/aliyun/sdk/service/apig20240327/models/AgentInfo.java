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
         * agentAccess.
         */
        public Builder agentAccess(AgentAccess agentAccess) {
            this.agentAccess = agentAccess;
            return this;
        }

        /**
         * agentId.
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            return this;
        }

        /**
         * agentType.
         */
        public Builder agentType(String agentType) {
            this.agentType = agentType;
            return this;
        }

        /**
         * allowedCapabilities.
         */
        public Builder allowedCapabilities(java.util.List<String> allowedCapabilities) {
            this.allowedCapabilities = allowedCapabilities;
            return this;
        }

        /**
         * createTimestamp.
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
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
         * gatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * modelAccess.
         */
        public Builder modelAccess(ModelAccess modelAccess) {
            this.modelAccess = modelAccess;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * resourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
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
         * updateTimestamp.
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
             * httpApiId.
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
             * consumerIds.
             */
            public Builder consumerIds(java.util.List<String> consumerIds) {
                this.consumerIds = consumerIds;
                return this;
            }

            /**
             * modelApiId.
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
