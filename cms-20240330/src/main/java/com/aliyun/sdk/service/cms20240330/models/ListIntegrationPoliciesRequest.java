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
    @com.aliyun.core.annotation.NameInMap("bindResourceId")
    private String bindResourceId;

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
        this.bindResourceId = builder.bindResourceId;
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
     * @return bindResourceId
     */
    public String getBindResourceId() {
        return this.bindResourceId;
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
        private String bindResourceId; 
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
            this.bindResourceId = request.bindResourceId;
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
         * <p>Addon name.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-default</p>
         */
        public Builder addonName(String addonName) {
            this.putQueryParameter("addonName", addonName);
            this.addonName = addonName;
            return this;
        }

        /**
         * <p>Bound resource ID</p>
         * 
         * <strong>example:</strong>
         * <p>622d27c2e87d49debceeebc7c642610e</p>
         */
        public Builder bindResourceId(String bindResourceId) {
            this.putQueryParameter("bindResourceId", bindResourceId);
            this.bindResourceId = bindResourceId;
            return this;
        }

        /**
         * <p>Filter for entity IDs, separated by commas</p>
         * 
         * <strong>example:</strong>
         * <p>eg-1,eg-2,eg-3</p>
         */
        public Builder entityGroupIds(String entityGroupIds) {
            this.putQueryParameter("entityGroupIds", entityGroupIds);
            this.entityGroupIds = entityGroupIds;
            return this;
        }

        /**
         * <p>Used for Region query, separated by commas</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing,cn-hangzhou</p>
         */
        public Builder filterRegionIds(String filterRegionIds) {
            this.putQueryParameter("filterRegionIds", filterRegionIds);
            this.filterRegionIds = filterRegionIds;
            return this;
        }

        /**
         * <p>Maximum number of results to return. Default is 30, with a maximum of 100.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Used to return more results. This parameter is not required for the first query. For subsequent queries, use the Token obtained from the response.</p>
         * 
         * <strong>example:</strong>
         * <p>mvnX6zqg3P</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-93817a401f78435596d745a97d2e85a1</p>
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("policyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>Rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>prod-database</p>
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("policyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * <p>Policy type</p>
         * 
         * <strong>example:</strong>
         * <p>CS</p>
         */
        public Builder policyType(String policyType) {
            this.putQueryParameter("policyType", policyType);
            this.policyType = policyType;
            return this;
        }

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cmee-622d27c2e87d49debceeebc7c642610e</p>
         */
        public Builder prometheusInstanceId(String prometheusInstanceId) {
            this.putQueryParameter("prometheusInstanceId", prometheusInstanceId);
            this.prometheusInstanceId = prometheusInstanceId;
            return this;
        }

        /**
         * <p>Used for general queries</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>Resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-xxxxx</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Tag list.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            String tagShrink = shrink(tag, "tag", "json");
            this.putQueryParameter("tag", tagShrink);
            this.tag = tag;
            return this;
        }

        /**
         * <p>Workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
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
             * <p>Tag key</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Tag value</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
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
