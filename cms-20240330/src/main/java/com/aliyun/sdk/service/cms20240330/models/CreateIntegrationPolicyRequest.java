// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link CreateIntegrationPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateIntegrationPolicyRequest</p>
 */
public class CreateIntegrationPolicyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("entityGroup")
    private EntityGroup entityGroup;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("policyName")
    private String policyName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("policyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private CreateIntegrationPolicyRequest(Builder builder) {
        super(builder);
        this.entityGroup = builder.entityGroup;
        this.policyName = builder.policyName;
        this.policyType = builder.policyType;
        this.resourceGroupId = builder.resourceGroupId;
        this.tags = builder.tags;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIntegrationPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return entityGroup
     */
    public EntityGroup getEntityGroup() {
        return this.entityGroup;
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * @return policyType
     */
    public String getPolicyType() {
        return this.policyType;
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

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<CreateIntegrationPolicyRequest, Builder> {
        private EntityGroup entityGroup; 
        private String policyName; 
        private String policyType; 
        private String resourceGroupId; 
        private java.util.List<Tags> tags; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(CreateIntegrationPolicyRequest request) {
            super(request);
            this.entityGroup = request.entityGroup;
            this.policyName = request.policyName;
            this.policyType = request.policyType;
            this.resourceGroupId = request.resourceGroupId;
            this.tags = request.tags;
            this.workspace = request.workspace;
        } 

        /**
         * <p>Entity group for creating the policy. Policies can be quickly created using the entity group, and <code>clusterId</code> and <code>vpcId</code> are independent of each other.</p>
         */
        public Builder entityGroup(EntityGroup entityGroup) {
            this.putBodyParameter("entityGroup", entityGroup);
            this.entityGroup = entityGroup;
            return this;
        }

        /**
         * <p>Policy name</p>
         * 
         * <strong>example:</strong>
         * <p>prod-database</p>
         */
        public Builder policyName(String policyName) {
            this.putBodyParameter("policyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * <p>Policy type: CS/ECS/Cloud</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CS</p>
         */
        public Builder policyType(String policyType) {
            this.putBodyParameter("policyType", policyType);
            this.policyType = policyType;
            return this;
        }

        /**
         * <p>Resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekz2km4kmhtbii</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Resource tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>Workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>prometheus</p>
         */
        public Builder workspace(String workspace) {
            this.putBodyParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public CreateIntegrationPolicyRequest build() {
            return new CreateIntegrationPolicyRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateIntegrationPolicyRequest} extends {@link TeaModel}
     *
     * <p>CreateIntegrationPolicyRequest</p>
     */
    public static class EntityGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("clusterEntityType")
        private String clusterEntityType;

        @com.aliyun.core.annotation.NameInMap("clusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("clusterNamespace")
        private String clusterNamespace;

        @com.aliyun.core.annotation.NameInMap("disablePolicyShare")
        private Boolean disablePolicyShare;

        @com.aliyun.core.annotation.NameInMap("entityGroupId")
        private String entityGroupId;

        @com.aliyun.core.annotation.NameInMap("entityUserId")
        private String entityUserId;

        @com.aliyun.core.annotation.NameInMap("vpcId")
        private String vpcId;

        private EntityGroup(Builder builder) {
            this.clusterEntityType = builder.clusterEntityType;
            this.clusterId = builder.clusterId;
            this.clusterNamespace = builder.clusterNamespace;
            this.disablePolicyShare = builder.disablePolicyShare;
            this.entityGroupId = builder.entityGroupId;
            this.entityUserId = builder.entityUserId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EntityGroup create() {
            return builder().build();
        }

        /**
         * @return clusterEntityType
         */
        public String getClusterEntityType() {
            return this.clusterEntityType;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterNamespace
         */
        public String getClusterNamespace() {
            return this.clusterNamespace;
        }

        /**
         * @return disablePolicyShare
         */
        public Boolean getDisablePolicyShare() {
            return this.disablePolicyShare;
        }

        /**
         * @return entityGroupId
         */
        public String getEntityGroupId() {
            return this.entityGroupId;
        }

        /**
         * @return entityUserId
         */
        public String getEntityUserId() {
            return this.entityUserId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String clusterEntityType; 
            private String clusterId; 
            private String clusterNamespace; 
            private Boolean disablePolicyShare; 
            private String entityGroupId; 
            private String entityUserId; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(EntityGroup model) {
                this.clusterEntityType = model.clusterEntityType;
                this.clusterId = model.clusterId;
                this.clusterNamespace = model.clusterNamespace;
                this.disablePolicyShare = model.disablePolicyShare;
                this.entityGroupId = model.entityGroupId;
                this.entityUserId = model.entityUserId;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>Cluster entity type, such as acs.ack.cluster/acs.one.cluster/acs.asi.cluster or others.</p>
             * 
             * <strong>example:</strong>
             * <p>acs.ack.cluster</p>
             */
            public Builder clusterEntityType(String clusterEntityType) {
                this.clusterEntityType = clusterEntityType;
                return this;
            }

            /**
             * <p>Cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>na61prod3-na61cloudhdfsssd</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * clusterNamespace.
             */
            public Builder clusterNamespace(String clusterNamespace) {
                this.clusterNamespace = clusterNamespace;
                return this;
            }

            /**
             * <p>Whether to disable the unique binding of the Policy. If enabled, multiple Policies can be created for a single container cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>ture</p>
             */
            public Builder disablePolicyShare(Boolean disablePolicyShare) {
                this.disablePolicyShare = disablePolicyShare;
                return this;
            }

            /**
             * <p>Entity group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>eg-b79f65d11fb94e779867cf937c3a3002</p>
             */
            public Builder entityGroupId(String entityGroupId) {
                this.entityGroupId = entityGroupId;
                return this;
            }

            /**
             * <p>User ID to which the cluster belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>12xxxx</p>
             */
            public Builder entityUserId(String entityUserId) {
                this.entityUserId = entityUserId;
                return this;
            }

            /**
             * <p>VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp18fgg3ffxa9czna40xt</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public EntityGroup build() {
                return new EntityGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateIntegrationPolicyRequest} extends {@link TeaModel}
     *
     * <p>CreateIntegrationPolicyRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
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
             * <p>Tag <code>key</code> value.</p>
             * 
             * <strong>example:</strong>
             * <p>use</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Tag <code>value</code> value.</p>
             * 
             * <strong>example:</strong>
             * <p>database</p>
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
