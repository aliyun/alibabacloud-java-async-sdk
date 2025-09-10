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
 * {@link GetIntegrationPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetIntegrationPolicyResponseBody</p>
 */
public class GetIntegrationPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("policy")
    private Policy policy;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetIntegrationPolicyResponseBody(Builder builder) {
        this.policy = builder.policy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIntegrationPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policy
     */
    public Policy getPolicy() {
        return this.policy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Policy policy; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetIntegrationPolicyResponseBody model) {
            this.policy = model.policy;
            this.requestId = model.requestId;
        } 

        /**
         * policy.
         */
        public Builder policy(Policy policy) {
            this.policy = policy;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0B9377D9-C56B-5C2E-A8A4-A01D6CC3F4B8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetIntegrationPolicyResponseBody build() {
            return new GetIntegrationPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetIntegrationPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetIntegrationPolicyResponseBody</p>
     */
    public static class BindResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("clusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("clusterType")
        private String clusterType;

        @com.aliyun.core.annotation.NameInMap("vpcCidr")
        private String vpcCidr;

        @com.aliyun.core.annotation.NameInMap("vpcId")
        private String vpcId;

        private BindResource(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterType = builder.clusterType;
            this.vpcCidr = builder.vpcCidr;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BindResource create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return vpcCidr
         */
        public String getVpcCidr() {
            return this.vpcCidr;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String clusterId; 
            private String clusterType; 
            private String vpcCidr; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(BindResource model) {
                this.clusterId = model.clusterId;
                this.clusterType = model.clusterType;
                this.vpcCidr = model.vpcCidr;
                this.vpcId = model.vpcId;
            } 

            /**
             * clusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * clusterType.
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * vpcCidr.
             */
            public Builder vpcCidr(String vpcCidr) {
                this.vpcCidr = vpcCidr;
                return this;
            }

            /**
             * vpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public BindResource build() {
                return new BindResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIntegrationPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetIntegrationPolicyResponseBody</p>
     */
    public static class Annotations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("op")
        private String op;

        @com.aliyun.core.annotation.NameInMap("tagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("tagValues")
        private java.util.List<String> tagValues;

        private Annotations(Builder builder) {
            this.op = builder.op;
            this.tagKey = builder.tagKey;
            this.tagValues = builder.tagValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Annotations create() {
            return builder().build();
        }

        /**
         * @return op
         */
        public String getOp() {
            return this.op;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValues
         */
        public java.util.List<String> getTagValues() {
            return this.tagValues;
        }

        public static final class Builder {
            private String op; 
            private String tagKey; 
            private java.util.List<String> tagValues; 

            private Builder() {
            } 

            private Builder(Annotations model) {
                this.op = model.op;
                this.tagKey = model.tagKey;
                this.tagValues = model.tagValues;
            } 

            /**
             * op.
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            /**
             * tagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * tagValues.
             */
            public Builder tagValues(java.util.List<String> tagValues) {
                this.tagValues = tagValues;
                return this;
            }

            public Annotations build() {
                return new Annotations(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIntegrationPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetIntegrationPolicyResponseBody</p>
     */
    public static class FieldRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fieldKey")
        private String fieldKey;

        @com.aliyun.core.annotation.NameInMap("fieldValues")
        private java.util.List<String> fieldValues;

        @com.aliyun.core.annotation.NameInMap("op")
        private String op;

        private FieldRules(Builder builder) {
            this.fieldKey = builder.fieldKey;
            this.fieldValues = builder.fieldValues;
            this.op = builder.op;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FieldRules create() {
            return builder().build();
        }

        /**
         * @return fieldKey
         */
        public String getFieldKey() {
            return this.fieldKey;
        }

        /**
         * @return fieldValues
         */
        public java.util.List<String> getFieldValues() {
            return this.fieldValues;
        }

        /**
         * @return op
         */
        public String getOp() {
            return this.op;
        }

        public static final class Builder {
            private String fieldKey; 
            private java.util.List<String> fieldValues; 
            private String op; 

            private Builder() {
            } 

            private Builder(FieldRules model) {
                this.fieldKey = model.fieldKey;
                this.fieldValues = model.fieldValues;
                this.op = model.op;
            } 

            /**
             * fieldKey.
             */
            public Builder fieldKey(String fieldKey) {
                this.fieldKey = fieldKey;
                return this;
            }

            /**
             * fieldValues.
             */
            public Builder fieldValues(java.util.List<String> fieldValues) {
                this.fieldValues = fieldValues;
                return this;
            }

            /**
             * op.
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            public FieldRules build() {
                return new FieldRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIntegrationPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetIntegrationPolicyResponseBody</p>
     */
    public static class IpMatchRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ipCidr")
        private String ipCidr;

        @com.aliyun.core.annotation.NameInMap("ipFieldKey")
        private String ipFieldKey;

        private IpMatchRule(Builder builder) {
            this.ipCidr = builder.ipCidr;
            this.ipFieldKey = builder.ipFieldKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpMatchRule create() {
            return builder().build();
        }

        /**
         * @return ipCidr
         */
        public String getIpCidr() {
            return this.ipCidr;
        }

        /**
         * @return ipFieldKey
         */
        public String getIpFieldKey() {
            return this.ipFieldKey;
        }

        public static final class Builder {
            private String ipCidr; 
            private String ipFieldKey; 

            private Builder() {
            } 

            private Builder(IpMatchRule model) {
                this.ipCidr = model.ipCidr;
                this.ipFieldKey = model.ipFieldKey;
            } 

            /**
             * ipCidr.
             */
            public Builder ipCidr(String ipCidr) {
                this.ipCidr = ipCidr;
                return this;
            }

            /**
             * ipFieldKey.
             */
            public Builder ipFieldKey(String ipFieldKey) {
                this.ipFieldKey = ipFieldKey;
                return this;
            }

            public IpMatchRule build() {
                return new IpMatchRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIntegrationPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetIntegrationPolicyResponseBody</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("op")
        private String op;

        @com.aliyun.core.annotation.NameInMap("tagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("tagValues")
        private java.util.List<String> tagValues;

        private Labels(Builder builder) {
            this.op = builder.op;
            this.tagKey = builder.tagKey;
            this.tagValues = builder.tagValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return op
         */
        public String getOp() {
            return this.op;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValues
         */
        public java.util.List<String> getTagValues() {
            return this.tagValues;
        }

        public static final class Builder {
            private String op; 
            private String tagKey; 
            private java.util.List<String> tagValues; 

            private Builder() {
            } 

            private Builder(Labels model) {
                this.op = model.op;
                this.tagKey = model.tagKey;
                this.tagValues = model.tagValues;
            } 

            /**
             * op.
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            /**
             * tagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * tagValues.
             */
            public Builder tagValues(java.util.List<String> tagValues) {
                this.tagValues = tagValues;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIntegrationPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetIntegrationPolicyResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("op")
        private String op;

        @com.aliyun.core.annotation.NameInMap("tagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("tagValues")
        private java.util.List<String> tagValues;

        private Tags(Builder builder) {
            this.op = builder.op;
            this.tagKey = builder.tagKey;
            this.tagValues = builder.tagValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return op
         */
        public String getOp() {
            return this.op;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValues
         */
        public java.util.List<String> getTagValues() {
            return this.tagValues;
        }

        public static final class Builder {
            private String op; 
            private String tagKey; 
            private java.util.List<String> tagValues; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.op = model.op;
                this.tagKey = model.tagKey;
                this.tagValues = model.tagValues;
            } 

            /**
             * op.
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            /**
             * tagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * tagValues.
             */
            public Builder tagValues(java.util.List<String> tagValues) {
                this.tagValues = tagValues;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIntegrationPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetIntegrationPolicyResponseBody</p>
     */
    public static class EntityRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("annotations")
        private java.util.List<Annotations> annotations;

        @com.aliyun.core.annotation.NameInMap("entityTypes")
        private java.util.List<String> entityTypes;

        @com.aliyun.core.annotation.NameInMap("fieldRules")
        private java.util.List<FieldRules> fieldRules;

        @com.aliyun.core.annotation.NameInMap("instanceIds")
        private java.util.List<String> instanceIds;

        @com.aliyun.core.annotation.NameInMap("ipMatchRule")
        private IpMatchRule ipMatchRule;

        @com.aliyun.core.annotation.NameInMap("labels")
        private java.util.List<Labels> labels;

        @com.aliyun.core.annotation.NameInMap("regionIds")
        private java.util.List<String> regionIds;

        @com.aliyun.core.annotation.NameInMap("resourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List<Tags> tags;

        private EntityRules(Builder builder) {
            this.annotations = builder.annotations;
            this.entityTypes = builder.entityTypes;
            this.fieldRules = builder.fieldRules;
            this.instanceIds = builder.instanceIds;
            this.ipMatchRule = builder.ipMatchRule;
            this.labels = builder.labels;
            this.regionIds = builder.regionIds;
            this.resourceGroupId = builder.resourceGroupId;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EntityRules create() {
            return builder().build();
        }

        /**
         * @return annotations
         */
        public java.util.List<Annotations> getAnnotations() {
            return this.annotations;
        }

        /**
         * @return entityTypes
         */
        public java.util.List<String> getEntityTypes() {
            return this.entityTypes;
        }

        /**
         * @return fieldRules
         */
        public java.util.List<FieldRules> getFieldRules() {
            return this.fieldRules;
        }

        /**
         * @return instanceIds
         */
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        /**
         * @return ipMatchRule
         */
        public IpMatchRule getIpMatchRule() {
            return this.ipMatchRule;
        }

        /**
         * @return labels
         */
        public java.util.List<Labels> getLabels() {
            return this.labels;
        }

        /**
         * @return regionIds
         */
        public java.util.List<String> getRegionIds() {
            return this.regionIds;
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

        public static final class Builder {
            private java.util.List<Annotations> annotations; 
            private java.util.List<String> entityTypes; 
            private java.util.List<FieldRules> fieldRules; 
            private java.util.List<String> instanceIds; 
            private IpMatchRule ipMatchRule; 
            private java.util.List<Labels> labels; 
            private java.util.List<String> regionIds; 
            private String resourceGroupId; 
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(EntityRules model) {
                this.annotations = model.annotations;
                this.entityTypes = model.entityTypes;
                this.fieldRules = model.fieldRules;
                this.instanceIds = model.instanceIds;
                this.ipMatchRule = model.ipMatchRule;
                this.labels = model.labels;
                this.regionIds = model.regionIds;
                this.resourceGroupId = model.resourceGroupId;
                this.tags = model.tags;
            } 

            /**
             * annotations.
             */
            public Builder annotations(java.util.List<Annotations> annotations) {
                this.annotations = annotations;
                return this;
            }

            /**
             * entityTypes.
             */
            public Builder entityTypes(java.util.List<String> entityTypes) {
                this.entityTypes = entityTypes;
                return this;
            }

            /**
             * fieldRules.
             */
            public Builder fieldRules(java.util.List<FieldRules> fieldRules) {
                this.fieldRules = fieldRules;
                return this;
            }

            /**
             * instanceIds.
             */
            public Builder instanceIds(java.util.List<String> instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            /**
             * ipMatchRule.
             */
            public Builder ipMatchRule(IpMatchRule ipMatchRule) {
                this.ipMatchRule = ipMatchRule;
                return this;
            }

            /**
             * labels.
             */
            public Builder labels(java.util.List<Labels> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * regionIds.
             */
            public Builder regionIds(java.util.List<String> regionIds) {
                this.regionIds = regionIds;
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
             * tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public EntityRules build() {
                return new EntityRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIntegrationPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetIntegrationPolicyResponseBody</p>
     */
    public static class EntityGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("entityGroupId")
        private String entityGroupId;

        @com.aliyun.core.annotation.NameInMap("entityGroupName")
        private String entityGroupName;

        @com.aliyun.core.annotation.NameInMap("entityRules")
        private EntityRules entityRules;

        @com.aliyun.core.annotation.NameInMap("query")
        private String query;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("workspace")
        private String workspace;

        private EntityGroup(Builder builder) {
            this.description = builder.description;
            this.entityGroupId = builder.entityGroupId;
            this.entityGroupName = builder.entityGroupName;
            this.entityRules = builder.entityRules;
            this.query = builder.query;
            this.regionId = builder.regionId;
            this.userId = builder.userId;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EntityGroup create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return entityGroupId
         */
        public String getEntityGroupId() {
            return this.entityGroupId;
        }

        /**
         * @return entityGroupName
         */
        public String getEntityGroupName() {
            return this.entityGroupName;
        }

        /**
         * @return entityRules
         */
        public EntityRules getEntityRules() {
            return this.entityRules;
        }

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private String description; 
            private String entityGroupId; 
            private String entityGroupName; 
            private EntityRules entityRules; 
            private String query; 
            private String regionId; 
            private String userId; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(EntityGroup model) {
                this.description = model.description;
                this.entityGroupId = model.entityGroupId;
                this.entityGroupName = model.entityGroupName;
                this.entityRules = model.entityRules;
                this.query = model.query;
                this.regionId = model.regionId;
                this.userId = model.userId;
                this.workspace = model.workspace;
            } 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * entityGroupId.
             */
            public Builder entityGroupId(String entityGroupId) {
                this.entityGroupId = entityGroupId;
                return this;
            }

            /**
             * entityGroupName.
             */
            public Builder entityGroupName(String entityGroupName) {
                this.entityGroupName = entityGroupName;
                return this;
            }

            /**
             * entityRules.
             */
            public Builder entityRules(EntityRules entityRules) {
                this.entityRules = entityRules;
                return this;
            }

            /**
             * query.
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            /**
             * regionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * userId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * workspace.
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public EntityGroup build() {
                return new EntityGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIntegrationPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetIntegrationPolicyResponseBody</p>
     */
    public static class ManagedInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("securityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("vswitchId")
        private String vswitchId;

        private ManagedInfo(Builder builder) {
            this.securityGroupId = builder.securityGroupId;
            this.vswitchId = builder.vswitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ManagedInfo create() {
            return builder().build();
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        public static final class Builder {
            private String securityGroupId; 
            private String vswitchId; 

            private Builder() {
            } 

            private Builder(ManagedInfo model) {
                this.securityGroupId = model.securityGroupId;
                this.vswitchId = model.vswitchId;
            } 

            /**
             * securityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * vswitchId.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            public ManagedInfo build() {
                return new ManagedInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIntegrationPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetIntegrationPolicyResponseBody</p>
     */
    public static class PolicyTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private PolicyTags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyTags create() {
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

            private Builder(PolicyTags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public PolicyTags build() {
                return new PolicyTags(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIntegrationPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetIntegrationPolicyResponseBody</p>
     */
    public static class Policy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bindResource")
        private BindResource bindResource;

        @com.aliyun.core.annotation.NameInMap("entityGroup")
        private EntityGroup entityGroup;

        @com.aliyun.core.annotation.NameInMap("managedInfo")
        private ManagedInfo managedInfo;

        @com.aliyun.core.annotation.NameInMap("policyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("policyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("policyType")
        private String policyType;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("resourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List<PolicyTags> tags;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("workspace")
        private String workspace;

        private Policy(Builder builder) {
            this.bindResource = builder.bindResource;
            this.entityGroup = builder.entityGroup;
            this.managedInfo = builder.managedInfo;
            this.policyId = builder.policyId;
            this.policyName = builder.policyName;
            this.policyType = builder.policyType;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.tags = builder.tags;
            this.userId = builder.userId;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policy create() {
            return builder().build();
        }

        /**
         * @return bindResource
         */
        public BindResource getBindResource() {
            return this.bindResource;
        }

        /**
         * @return entityGroup
         */
        public EntityGroup getEntityGroup() {
            return this.entityGroup;
        }

        /**
         * @return managedInfo
         */
        public ManagedInfo getManagedInfo() {
            return this.managedInfo;
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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
        public java.util.List<PolicyTags> getTags() {
            return this.tags;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private BindResource bindResource; 
            private EntityGroup entityGroup; 
            private ManagedInfo managedInfo; 
            private String policyId; 
            private String policyName; 
            private String policyType; 
            private String regionId; 
            private String resourceGroupId; 
            private java.util.List<PolicyTags> tags; 
            private String userId; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(Policy model) {
                this.bindResource = model.bindResource;
                this.entityGroup = model.entityGroup;
                this.managedInfo = model.managedInfo;
                this.policyId = model.policyId;
                this.policyName = model.policyName;
                this.policyType = model.policyType;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.tags = model.tags;
                this.userId = model.userId;
                this.workspace = model.workspace;
            } 

            /**
             * bindResource.
             */
            public Builder bindResource(BindResource bindResource) {
                this.bindResource = bindResource;
                return this;
            }

            /**
             * entityGroup.
             */
            public Builder entityGroup(EntityGroup entityGroup) {
                this.entityGroup = entityGroup;
                return this;
            }

            /**
             * managedInfo.
             */
            public Builder managedInfo(ManagedInfo managedInfo) {
                this.managedInfo = managedInfo;
                return this;
            }

            /**
             * policyId.
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * policyName.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * policyType.
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * regionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
             * tags.
             */
            public Builder tags(java.util.List<PolicyTags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * userId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * workspace.
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public Policy build() {
                return new Policy(this);
            } 

        } 

    }
}
