// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tablestore20201209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceRequest</p>
 */
public class CreateInstanceRequest extends Request {
    @Body
    @NameInMap("ClusterType")
    @Validation(required = true)
    private String clusterType;

    @Body
    @NameInMap("InstanceDescription")
    private String instanceDescription;

    @Body
    @NameInMap("InstanceName")
    @Validation(required = true)
    private String instanceName;

    @Body
    @NameInMap("Network")
    private String network;

    @Body
    @NameInMap("NetworkSourceACL")
    private java.util.List < String > networkSourceACL;

    @Body
    @NameInMap("NetworkTypeACL")
    private java.util.List < String > networkTypeACL;

    @Body
    @NameInMap("Policy")
    @Validation(maxLength = 4000)
    private String policy;

    @Body
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Body
    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
        this.clusterType = builder.clusterType;
        this.instanceDescription = builder.instanceDescription;
        this.instanceName = builder.instanceName;
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

    public static CreateInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return instanceDescription
     */
    public String getInstanceDescription() {
        return this.instanceDescription;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
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
    public java.util.List < String > getNetworkSourceACL() {
        return this.networkSourceACL;
    }

    /**
     * @return networkTypeACL
     */
    public java.util.List < String > getNetworkTypeACL() {
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
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<CreateInstanceRequest, Builder> {
        private String clusterType; 
        private String instanceDescription; 
        private String instanceName; 
        private String network; 
        private java.util.List < String > networkSourceACL; 
        private java.util.List < String > networkTypeACL; 
        private String policy; 
        private String resourceGroupId; 
        private java.util.List < Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceRequest request) {
            super(request);
            this.clusterType = request.clusterType;
            this.instanceDescription = request.instanceDescription;
            this.instanceName = request.instanceName;
            this.network = request.network;
            this.networkSourceACL = request.networkSourceACL;
            this.networkTypeACL = request.networkTypeACL;
            this.policy = request.policy;
            this.resourceGroupId = request.resourceGroupId;
            this.tags = request.tags;
        } 

        /**
         * ClusterType.
         */
        public Builder clusterType(String clusterType) {
            this.putBodyParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * InstanceDescription.
         */
        public Builder instanceDescription(String instanceDescription) {
            this.putBodyParameter("InstanceDescription", instanceDescription);
            this.instanceDescription = instanceDescription;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
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
        public Builder networkSourceACL(java.util.List < String > networkSourceACL) {
            this.putBodyParameter("NetworkSourceACL", networkSourceACL);
            this.networkSourceACL = networkSourceACL;
            return this;
        }

        /**
         * NetworkTypeACL.
         */
        public Builder networkTypeACL(java.util.List < String > networkTypeACL) {
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putBodyParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public CreateInstanceRequest build() {
            return new CreateInstanceRequest(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        private String key;

        @NameInMap("Value")
        @Validation(required = true)
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

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
