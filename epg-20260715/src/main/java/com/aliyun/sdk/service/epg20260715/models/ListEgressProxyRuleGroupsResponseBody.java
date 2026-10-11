// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.epg20260715.models;

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
 * {@link ListEgressProxyRuleGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEgressProxyRuleGroupsResponseBody</p>
 */
public class ListEgressProxyRuleGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EgressProxyRuleGroups")
    private java.util.List<EgressProxyRuleGroups> egressProxyRuleGroups;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListEgressProxyRuleGroupsResponseBody(Builder builder) {
        this.egressProxyRuleGroups = builder.egressProxyRuleGroups;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEgressProxyRuleGroupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return egressProxyRuleGroups
     */
    public java.util.List<EgressProxyRuleGroups> getEgressProxyRuleGroups() {
        return this.egressProxyRuleGroups;
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
        private java.util.List<EgressProxyRuleGroups> egressProxyRuleGroups; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListEgressProxyRuleGroupsResponseBody model) {
            this.egressProxyRuleGroups = model.egressProxyRuleGroups;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * EgressProxyRuleGroups.
         */
        public Builder egressProxyRuleGroups(java.util.List<EgressProxyRuleGroups> egressProxyRuleGroups) {
            this.egressProxyRuleGroups = egressProxyRuleGroups;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListEgressProxyRuleGroupsResponseBody build() {
            return new ListEgressProxyRuleGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEgressProxyRuleGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEgressProxyRuleGroupsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
    /**
     * 
     * {@link ListEgressProxyRuleGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEgressProxyRuleGroupsResponseBody</p>
     */
    public static class EgressProxyRuleGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EgressProxyIpPoolId")
        private String egressProxyIpPoolId;

        @com.aliyun.core.annotation.NameInMap("EgressProxyRuleGroupId")
        private String egressProxyRuleGroupId;

        @com.aliyun.core.annotation.NameInMap("EgressProxyRuleGroupName")
        private String egressProxyRuleGroupName;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private EgressProxyRuleGroups(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.egressProxyIpPoolId = builder.egressProxyIpPoolId;
            this.egressProxyRuleGroupId = builder.egressProxyRuleGroupId;
            this.egressProxyRuleGroupName = builder.egressProxyRuleGroupName;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EgressProxyRuleGroups create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return egressProxyIpPoolId
         */
        public String getEgressProxyIpPoolId() {
            return this.egressProxyIpPoolId;
        }

        /**
         * @return egressProxyRuleGroupId
         */
        public String getEgressProxyRuleGroupId() {
            return this.egressProxyRuleGroupId;
        }

        /**
         * @return egressProxyRuleGroupName
         */
        public String getEgressProxyRuleGroupName() {
            return this.egressProxyRuleGroupName;
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
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String egressProxyIpPoolId; 
            private String egressProxyRuleGroupId; 
            private String egressProxyRuleGroupName; 
            private String resourceGroupId; 
            private String status; 
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(EgressProxyRuleGroups model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.egressProxyIpPoolId = model.egressProxyIpPoolId;
                this.egressProxyRuleGroupId = model.egressProxyRuleGroupId;
                this.egressProxyRuleGroupName = model.egressProxyRuleGroupName;
                this.resourceGroupId = model.resourceGroupId;
                this.status = model.status;
                this.tags = model.tags;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EgressProxyIpPoolId.
             */
            public Builder egressProxyIpPoolId(String egressProxyIpPoolId) {
                this.egressProxyIpPoolId = egressProxyIpPoolId;
                return this;
            }

            /**
             * EgressProxyRuleGroupId.
             */
            public Builder egressProxyRuleGroupId(String egressProxyRuleGroupId) {
                this.egressProxyRuleGroupId = egressProxyRuleGroupId;
                return this;
            }

            /**
             * EgressProxyRuleGroupName.
             */
            public Builder egressProxyRuleGroupName(String egressProxyRuleGroupName) {
                this.egressProxyRuleGroupName = egressProxyRuleGroupName;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public EgressProxyRuleGroups build() {
                return new EgressProxyRuleGroups(this);
            } 

        } 

    }
}
