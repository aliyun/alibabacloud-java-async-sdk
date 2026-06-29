// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tablestore20201209.models;

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
 * {@link CreateAgentStorageRequest} extends {@link RequestModel}
 *
 * <p>CreateAgentStorageRequest</p>
 */
public class CreateAgentStorageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentStorageDescription")
    private String agentStorageDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentStorageName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentStorageName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Network")
    private String network;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NetworkSourceACL")
    private java.util.List<String> networkSourceACL;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NetworkTypeACL")
    private java.util.List<String> networkTypeACL;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Policy")
    @com.aliyun.core.annotation.Validation(maxLength = 4000)
    private String policy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    private CreateAgentStorageRequest(Builder builder) {
        super(builder);
        this.agentStorageDescription = builder.agentStorageDescription;
        this.agentStorageName = builder.agentStorageName;
        this.network = builder.network;
        this.networkSourceACL = builder.networkSourceACL;
        this.networkTypeACL = builder.networkTypeACL;
        this.policy = builder.policy;
        this.resourceGroupId = builder.resourceGroupId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgentStorageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentStorageDescription
     */
    public String getAgentStorageDescription() {
        return this.agentStorageDescription;
    }

    /**
     * @return agentStorageName
     */
    public String getAgentStorageName() {
        return this.agentStorageName;
    }

    /**
     * @return network
     */
    public String getNetwork() {
        return this.network;
    }

    /**
     * @return networkSourceACL
     */
    public java.util.List<String> getNetworkSourceACL() {
        return this.networkSourceACL;
    }

    /**
     * @return networkTypeACL
     */
    public java.util.List<String> getNetworkTypeACL() {
        return this.networkTypeACL;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<CreateAgentStorageRequest, Builder> {
        private String agentStorageDescription; 
        private String agentStorageName; 
        private String network; 
        private java.util.List<String> networkSourceACL; 
        private java.util.List<String> networkTypeACL; 
        private String policy; 
        private String resourceGroupId; 
        private java.util.List<Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(CreateAgentStorageRequest request) {
            super(request);
            this.agentStorageDescription = request.agentStorageDescription;
            this.agentStorageName = request.agentStorageName;
            this.network = request.network;
            this.networkSourceACL = request.networkSourceACL;
            this.networkTypeACL = request.networkTypeACL;
            this.policy = request.policy;
            this.resourceGroupId = request.resourceGroupId;
            this.tags = request.tags;
        } 

        /**
         * <p>agent storage description</p>
         * 
         * <strong>example:</strong>
         * <p>description for agent storage</p>
         */
        public Builder agentStorageDescription(String agentStorageDescription) {
            this.putBodyParameter("AgentStorageDescription", agentStorageDescription);
            this.agentStorageDescription = agentStorageDescription;
            return this;
        }

        /**
         * <p>agent storage name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>first-ins</p>
         */
        public Builder agentStorageName(String agentStorageName) {
            this.putBodyParameter("AgentStorageName", agentStorageName);
            this.agentStorageName = agentStorageName;
            return this;
        }

        /**
         * Network.
         */
        public Builder network(String network) {
            this.putBodyParameter("Network", network);
            this.network = network;
            return this;
        }

        /**
         * NetworkSourceACL.
         */
        public Builder networkSourceACL(java.util.List<String> networkSourceACL) {
            this.putBodyParameter("NetworkSourceACL", networkSourceACL);
            this.networkSourceACL = networkSourceACL;
            return this;
        }

        /**
         * NetworkTypeACL.
         */
        public Builder networkTypeACL(java.util.List<String> networkTypeACL) {
            this.putBodyParameter("NetworkTypeACL", networkTypeACL);
            this.networkTypeACL = networkTypeACL;
            return this;
        }

        /**
         * Policy.
         */
        public Builder policy(String policy) {
            this.putBodyParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * <p>resource group id</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxh4em5jnbcd</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>tag</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putBodyParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public CreateAgentStorageRequest build() {
            return new CreateAgentStorageRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAgentStorageRequest} extends {@link TeaModel}
     *
     * <p>CreateAgentStorageRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>created</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0woauavextilfqr61</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
