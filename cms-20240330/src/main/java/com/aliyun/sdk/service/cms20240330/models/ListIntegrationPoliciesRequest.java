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
 * {@link ListIntegrationPoliciesRequest} extends {@link RequestModel}
 *
 * <p>ListIntegrationPoliciesRequest</p>
 */
public class ListIntegrationPoliciesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("addonName")
    private String addonName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("entityGroupIds")
    private String entityGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("filterRegionIds")
    private String filterRegionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("policyId")
    private String policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("policyName")
    private String policyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("policyType")
    private String policyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("prometheusInstanceId")
    private String prometheusInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("query")
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private ListIntegrationPoliciesRequest(Builder builder) {
        super(builder);
        this.addonName = builder.addonName;
        this.entityGroupIds = builder.entityGroupIds;
        this.filterRegionIds = builder.filterRegionIds;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.policyId = builder.policyId;
        this.policyName = builder.policyName;
        this.policyType = builder.policyType;
        this.prometheusInstanceId = builder.prometheusInstanceId;
        this.query = builder.query;
        this.resourceGroupId = builder.resourceGroupId;
        this.tag = builder.tag;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIntegrationPoliciesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addonName
     */
    public String getAddonName() {
        return this.addonName;
    }

    /**
     * @return entityGroupIds
     */
    public String getEntityGroupIds() {
        return this.entityGroupIds;
    }

    /**
     * @return filterRegionIds
     */
    public String getFilterRegionIds() {
        return this.filterRegionIds;
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
     * @return prometheusInstanceId
     */
    public String getPrometheusInstanceId() {
        return this.prometheusInstanceId;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<ListIntegrationPoliciesRequest, Builder> {
        private String addonName; 
        private String entityGroupIds; 
        private String filterRegionIds; 
        private Integer maxResults; 
        private String nextToken; 
        private String policyId; 
        private String policyName; 
        private String policyType; 
        private String prometheusInstanceId; 
        private String query; 
        private String resourceGroupId; 
        private java.util.List<Tag> tag; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(ListIntegrationPoliciesRequest request) {
            super(request);
            this.addonName = request.addonName;
            this.entityGroupIds = request.entityGroupIds;
            this.filterRegionIds = request.filterRegionIds;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.policyId = request.policyId;
            this.policyName = request.policyName;
            this.policyType = request.policyType;
            this.prometheusInstanceId = request.prometheusInstanceId;
            this.query = request.query;
            this.resourceGroupId = request.resourceGroupId;
            this.tag = request.tag;
            this.workspace = request.workspace;
        } 

        /**
         * addonName.
         */
        public Builder addonName(String addonName) {
            this.putQueryParameter("addonName", addonName);
            this.addonName = addonName;
            return this;
        }

        /**
         * entityGroupIds.
         */
        public Builder entityGroupIds(String entityGroupIds) {
            this.putQueryParameter("entityGroupIds", entityGroupIds);
            this.entityGroupIds = entityGroupIds;
            return this;
        }

        /**
         * filterRegionIds.
         */
        public Builder filterRegionIds(String filterRegionIds) {
            this.putQueryParameter("filterRegionIds", filterRegionIds);
            this.filterRegionIds = filterRegionIds;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * policyId.
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("policyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * policyName.
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("policyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * policyType.
         */
        public Builder policyType(String policyType) {
            this.putQueryParameter("policyType", policyType);
            this.policyType = policyType;
            return this;
        }

        /**
         * prometheusInstanceId.
         */
        public Builder prometheusInstanceId(String prometheusInstanceId) {
            this.putQueryParameter("prometheusInstanceId", prometheusInstanceId);
            this.prometheusInstanceId = prometheusInstanceId;
            return this;
        }

        /**
         * query.
         */
        public Builder query(String query) {
            this.putQueryParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * resourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * tag.
         */
        public Builder tag(java.util.List<Tag> tag) {
            String tagShrink = shrink(tag, "tag", "json");
            this.putQueryParameter("tag", tagShrink);
            this.tag = tag;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.putQueryParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public ListIntegrationPoliciesRequest build() {
            return new ListIntegrationPoliciesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListIntegrationPoliciesRequest} extends {@link TeaModel}
     *
     * <p>ListIntegrationPoliciesRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
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

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
