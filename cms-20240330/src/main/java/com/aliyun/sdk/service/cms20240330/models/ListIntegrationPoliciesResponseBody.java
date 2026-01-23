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
 * {@link ListIntegrationPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>ListIntegrationPoliciesResponseBody</p>
 */
public class ListIntegrationPoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("policies")
    private java.util.List<Policies> policies;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListIntegrationPoliciesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.policies = builder.policies;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIntegrationPoliciesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return policies
     */
    public java.util.List<Policies> getPolicies() {
        return this.policies;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<Policies> policies; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListIntegrationPoliciesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.policies = model.policies;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Page size
         * Default value:
         *     50
         * Maximum value:
         *     50</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Pagination token</p>
         * 
         * <strong>example:</strong>
         * <p>44ANBjKZmQeKnaB1fXRq06w7sFYK3MUcCALMD9qQbmEiE</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Access policy list</p>
         */
        public Builder policies(java.util.List<Policies> policies) {
            this.policies = policies;
            return this;
        }

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>CD8BA7D6-995D-578D-9941-78B0FECD14B5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total number of entries</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListIntegrationPoliciesResponseBody build() {
            return new ListIntegrationPoliciesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIntegrationPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntegrationPoliciesResponseBody</p>
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
             * <p>Cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cv68tt87d78vyc89zy9v</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>Cluster type.</p>
             * 
             * <strong>example:</strong>
             * <p>ManagedKubernetes</p>
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * <p>VPC CIDR</p>
             * 
             * <strong>example:</strong>
             * <p>100.100.0.1/16</p>
             */
            public Builder vpcCidr(String vpcCidr) {
                this.vpcCidr = vpcCidr;
                return this;
            }

            /**
             * <p>Virtual Private Cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-uf664nyle5khp5d4d7hdo</p>
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
     * {@link ListIntegrationPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntegrationPoliciesResponseBody</p>
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
             * <p>Operation to be performed.</p>
             * 
             * <strong>example:</strong>
             * <p>add</p>
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            /**
             * <p>Tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>Tag values</p>
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
     * {@link ListIntegrationPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntegrationPoliciesResponseBody</p>
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
             * <p>Unique identifier for the field.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder fieldKey(String fieldKey) {
                this.fieldKey = fieldKey;
                return this;
            }

            /**
             * <p>Field content, multiple values separated by English commas.</p>
             */
            public Builder fieldValues(java.util.List<String> fieldValues) {
                this.fieldValues = fieldValues;
                return this;
            }

            /**
             * <p>Operation to be performed.</p>
             * 
             * <strong>example:</strong>
             * <p>add</p>
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
     * {@link ListIntegrationPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntegrationPoliciesResponseBody</p>
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
             * <p>IP segment</p>
             * 
             * <strong>example:</strong>
             * <p>100.100.1.0/16</p>
             */
            public Builder ipCidr(String ipCidr) {
                this.ipCidr = ipCidr;
                return this;
            }

            /**
             * <p>Key of the IP field</p>
             * 
             * <strong>example:</strong>
             * <p>xxxx</p>
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
     * {@link ListIntegrationPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntegrationPoliciesResponseBody</p>
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
             * <p>Operation to be performed.</p>
             * 
             * <strong>example:</strong>
             * <p>add</p>
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            /**
             * <p>Tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>Tag values</p>
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
     * {@link ListIntegrationPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntegrationPoliciesResponseBody</p>
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
             * <p>Operation to be performed.</p>
             * 
             * <strong>example:</strong>
             * <p>add</p>
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            /**
             * <p>Tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>Tag value.</p>
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
     * {@link ListIntegrationPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntegrationPoliciesResponseBody</p>
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
             * <p>Annotations</p>
             */
            public Builder annotations(java.util.List<Annotations> annotations) {
                this.annotations = annotations;
                return this;
            }

            /**
             * <p>List of entity types</p>
             */
            public Builder entityTypes(java.util.List<String> entityTypes) {
                this.entityTypes = entityTypes;
                return this;
            }

            /**
             * <p>Field rules</p>
             */
            public Builder fieldRules(java.util.List<FieldRules> fieldRules) {
                this.fieldRules = fieldRules;
                return this;
            }

            /**
             * <p>Instance IDs.</p>
             */
            public Builder instanceIds(java.util.List<String> instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            /**
             * <p>IP match rule</p>
             */
            public Builder ipMatchRule(IpMatchRule ipMatchRule) {
                this.ipMatchRule = ipMatchRule;
                return this;
            }

            /**
             * <p>Labels</p>
             */
            public Builder labels(java.util.List<Labels> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>List of region IDs.</p>
             */
            public Builder regionIds(java.util.List<String> regionIds) {
                this.regionIds = regionIds;
                return this;
            }

            /**
             * <p>Resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-5i6dbwxfxuqihk7k</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>Instance tag information.</p>
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
     * {@link ListIntegrationPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntegrationPoliciesResponseBody</p>
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
             * <p>Description.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxx</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Entity group ID</p>
             * 
             * <strong>example:</strong>
             * <p>eg-b79f65d11fb94e779867cf937c3a3002</p>
             */
            public Builder entityGroupId(String entityGroupId) {
                this.entityGroupId = entityGroupId;
                return this;
            }

            /**
             * <p>Entity group name</p>
             * 
             * <strong>example:</strong>
             * <p>test-eg</p>
             */
            public Builder entityGroupName(String entityGroupName) {
                this.entityGroupName = entityGroupName;
                return this;
            }

            /**
             * <p>Entity group</p>
             */
            public Builder entityRules(EntityRules entityRules) {
                this.entityRules = entityRules;
                return this;
            }

            /**
             * <p>Search keywords, supporting document library name and description</p>
             * 
             * <strong>example:</strong>
             * <p>哈弗</p>
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            /**
             * <p>Region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-heyuan</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>User ID</p>
             * 
             * <strong>example:</strong>
             * <p>1236812738</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>Workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>test-api</p>
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
     * {@link ListIntegrationPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntegrationPoliciesResponseBody</p>
     */
    public static class ManagedInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("eniId")
        private String eniId;

        @com.aliyun.core.annotation.NameInMap("securityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("vswitchId")
        private String vswitchId;

        private ManagedInfo(Builder builder) {
            this.eniId = builder.eniId;
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
         * @return eniId
         */
        public String getEniId() {
            return this.eniId;
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
            private String eniId; 
            private String securityGroupId; 
            private String vswitchId; 

            private Builder() {
            } 

            private Builder(ManagedInfo model) {
                this.eniId = model.eniId;
                this.securityGroupId = model.securityGroupId;
                this.vswitchId = model.vswitchId;
            } 

            /**
             * <p>ENI card ID of the managed probe. For example: eni-xxxx.</p>
             * 
             * <strong>example:</strong>
             * <p>eni-12345678</p>
             */
            public Builder eniId(String eniId) {
                this.eniId = eniId;
                return this;
            }

            /**
             * <p>Security group ID</p>
             * 
             * <strong>example:</strong>
             * <p>sg-xxxxx</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>VSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-xxxxxx</p>
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
     * {@link ListIntegrationPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntegrationPoliciesResponseBody</p>
     */
    public static class SubAddonRelease extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ready")
        private Integer ready;

        @com.aliyun.core.annotation.NameInMap("total")
        private Integer total;

        private SubAddonRelease(Builder builder) {
            this.ready = builder.ready;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubAddonRelease create() {
            return builder().build();
        }

        /**
         * @return ready
         */
        public Integer getReady() {
            return this.ready;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer ready; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(SubAddonRelease model) {
                this.ready = model.ready;
                this.total = model.total;
            } 

            /**
             * <p>Number of ready sub-releases</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder ready(Integer ready) {
                this.ready = ready;
                return this;
            }

            /**
             * <p>Number of rules.</p>
             * 
             * <strong>example:</strong>
             * <p>278</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public SubAddonRelease build() {
                return new SubAddonRelease(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIntegrationPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntegrationPoliciesResponseBody</p>
     */
    public static class Policies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bindResource")
        private BindResource bindResource;

        @com.aliyun.core.annotation.NameInMap("csUmodelStatus")
        private Boolean csUmodelStatus;

        @com.aliyun.core.annotation.NameInMap("entityGroup")
        private EntityGroup entityGroup;

        @com.aliyun.core.annotation.NameInMap("feePackage")
        private String feePackage;

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

        @com.aliyun.core.annotation.NameInMap("subAddonRelease")
        private SubAddonRelease subAddonRelease;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("workspace")
        private String workspace;

        private Policies(Builder builder) {
            this.bindResource = builder.bindResource;
            this.csUmodelStatus = builder.csUmodelStatus;
            this.entityGroup = builder.entityGroup;
            this.feePackage = builder.feePackage;
            this.managedInfo = builder.managedInfo;
            this.policyId = builder.policyId;
            this.policyName = builder.policyName;
            this.policyType = builder.policyType;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.subAddonRelease = builder.subAddonRelease;
            this.userId = builder.userId;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policies create() {
            return builder().build();
        }

        /**
         * @return bindResource
         */
        public BindResource getBindResource() {
            return this.bindResource;
        }

        /**
         * @return csUmodelStatus
         */
        public Boolean getCsUmodelStatus() {
            return this.csUmodelStatus;
        }

        /**
         * @return entityGroup
         */
        public EntityGroup getEntityGroup() {
            return this.entityGroup;
        }

        /**
         * @return feePackage
         */
        public String getFeePackage() {
            return this.feePackage;
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
         * @return subAddonRelease
         */
        public SubAddonRelease getSubAddonRelease() {
            return this.subAddonRelease;
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
            private Boolean csUmodelStatus; 
            private EntityGroup entityGroup; 
            private String feePackage; 
            private ManagedInfo managedInfo; 
            private String policyId; 
            private String policyName; 
            private String policyType; 
            private String regionId; 
            private String resourceGroupId; 
            private SubAddonRelease subAddonRelease; 
            private String userId; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(Policies model) {
                this.bindResource = model.bindResource;
                this.csUmodelStatus = model.csUmodelStatus;
                this.entityGroup = model.entityGroup;
                this.feePackage = model.feePackage;
                this.managedInfo = model.managedInfo;
                this.policyId = model.policyId;
                this.policyName = model.policyName;
                this.policyType = model.policyType;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.subAddonRelease = model.subAddonRelease;
                this.userId = model.userId;
                this.workspace = model.workspace;
            } 

            /**
             * <p>Bound resource information</p>
             */
            public Builder bindResource(BindResource bindResource) {
                this.bindResource = bindResource;
                return this;
            }

            /**
             * <p>Container environment umodel installation status.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder csUmodelStatus(Boolean csUmodelStatus) {
                this.csUmodelStatus = csUmodelStatus;
                return this;
            }

            /**
             * <p>Entity group</p>
             */
            public Builder entityGroup(EntityGroup entityGroup) {
                this.entityGroup = entityGroup;
                return this;
            }

            /**
             * <p>Billing type.</p>
             * 
             * <strong>example:</strong>
             * <p>CS_Pro</p>
             */
            public Builder feePackage(String feePackage) {
                this.feePackage = feePackage;
                return this;
            }

            /**
             * <p>Policy network management information.</p>
             */
            public Builder managedInfo(ManagedInfo managedInfo) {
                this.managedInfo = managedInfo;
                return this;
            }

            /**
             * <p>Policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>policy-ac38a7cb02d14ff48bc9f97d0a75063e</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>Rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>6f5HSsg3AP</p>
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * <p>Access center policy type</p>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * <p>Region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-heyuan</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-xxxxx</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>Number of sub-releases</p>
             */
            public Builder subAddonRelease(SubAddonRelease subAddonRelease) {
                this.subAddonRelease = subAddonRelease;
                return this;
            }

            /**
             * <p>User ID</p>
             * 
             * <strong>example:</strong>
             * <p>128470923</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>Workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>test-api</p>
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public Policies build() {
                return new Policies(this);
            } 

        } 

    }
}
