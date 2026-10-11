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
 * {@link ListEgressProxyRuleGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListEgressProxyRuleGroupsRequest</p>
 */
public class ListEgressProxyRuleGroupsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyRuleGroupIds")
    private java.util.List<String> egressProxyRuleGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyRuleGroupNames")
    private java.util.List<String> egressProxyRuleGroupNames;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 1000)
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Skip")
    private Integer skip;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private ListEgressProxyRuleGroupsRequest(Builder builder) {
        super(builder);
        this.egressProxyRuleGroupIds = builder.egressProxyRuleGroupIds;
        this.egressProxyRuleGroupNames = builder.egressProxyRuleGroupNames;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceGroupId = builder.resourceGroupId;
        this.skip = builder.skip;
        this.status = builder.status;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEgressProxyRuleGroupsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return egressProxyRuleGroupIds
     */
    public java.util.List<String> getEgressProxyRuleGroupIds() {
        return this.egressProxyRuleGroupIds;
    }

    /**
     * @return egressProxyRuleGroupNames
     */
    public java.util.List<String> getEgressProxyRuleGroupNames() {
        return this.egressProxyRuleGroupNames;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return skip
     */
    public Integer getSkip() {
        return this.skip;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<ListEgressProxyRuleGroupsRequest, Builder> {
        private java.util.List<String> egressProxyRuleGroupIds; 
        private java.util.List<String> egressProxyRuleGroupNames; 
        private Integer maxResults; 
        private String nextToken; 
        private String resourceGroupId; 
        private Integer skip; 
        private String status; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(ListEgressProxyRuleGroupsRequest request) {
            super(request);
            this.egressProxyRuleGroupIds = request.egressProxyRuleGroupIds;
            this.egressProxyRuleGroupNames = request.egressProxyRuleGroupNames;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.resourceGroupId = request.resourceGroupId;
            this.skip = request.skip;
            this.status = request.status;
            this.tag = request.tag;
        } 

        /**
         * EgressProxyRuleGroupIds.
         */
        public Builder egressProxyRuleGroupIds(java.util.List<String> egressProxyRuleGroupIds) {
            this.putBodyParameter("EgressProxyRuleGroupIds", egressProxyRuleGroupIds);
            this.egressProxyRuleGroupIds = egressProxyRuleGroupIds;
            return this;
        }

        /**
         * EgressProxyRuleGroupNames.
         */
        public Builder egressProxyRuleGroupNames(java.util.List<String> egressProxyRuleGroupNames) {
            this.putBodyParameter("EgressProxyRuleGroupNames", egressProxyRuleGroupNames);
            this.egressProxyRuleGroupNames = egressProxyRuleGroupNames;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
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
         * Skip.
         */
        public Builder skip(Integer skip) {
            this.putBodyParameter("Skip", skip);
            this.skip = skip;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putBodyParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public ListEgressProxyRuleGroupsRequest build() {
            return new ListEgressProxyRuleGroupsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListEgressProxyRuleGroupsRequest} extends {@link TeaModel}
     *
     * <p>ListEgressProxyRuleGroupsRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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

            private Builder(Tag model) {
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

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
