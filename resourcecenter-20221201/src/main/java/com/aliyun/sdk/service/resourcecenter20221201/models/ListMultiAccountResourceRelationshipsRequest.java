// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

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
 * {@link ListMultiAccountResourceRelationshipsRequest} extends {@link RequestModel}
 *
 * <p>ListMultiAccountResourceRelationshipsRequest</p>
 */
public class ListMultiAccountResourceRelationshipsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 500, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelatedResourceFilter")
    private java.util.List<RelatedResourceFilter> relatedResourceFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scope")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scope;

    private ListMultiAccountResourceRelationshipsRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.relatedResourceFilter = builder.relatedResourceFilter;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
        this.scope = builder.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMultiAccountResourceRelationshipsRequest create() {
        return builder().build();
    }

@Override
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return relatedResourceFilter
     */
    public java.util.List<RelatedResourceFilter> getRelatedResourceFilter() {
        return this.relatedResourceFilter;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    public static final class Builder extends Request.Builder<ListMultiAccountResourceRelationshipsRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private java.util.List<RelatedResourceFilter> relatedResourceFilter; 
        private String resourceId; 
        private String resourceType; 
        private String scope; 

        private Builder() {
            super();
        } 

        private Builder(ListMultiAccountResourceRelationshipsRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.relatedResourceFilter = request.relatedResourceFilter;
            this.resourceId = request.resourceId;
            this.resourceType = request.resourceType;
            this.scope = request.scope;
        } 

        /**
         * <p>The maximum number of entries per page.</p>
         * <p>Valid values: 1 to 500.</p>
         * <p>Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJzZWFyY2hBZnRlcnMiOlsiMTAwMTU2Nzk4MTU1OSJd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The region ID of the resource.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The filter conditions for resources associated with the resource.</p>
         */
        public Builder relatedResourceFilter(java.util.List<RelatedResourceFilter> relatedResourceFilter) {
            this.putQueryParameter("RelatedResourceFilter", relatedResourceFilter);
            this.relatedResourceFilter = relatedResourceFilter;
            return this;
        }

        /**
         * <p>The ID of the resource.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>m-eb3hji****</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The type of the resource.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::ACK::Cluster</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The search scope. Valid values:</p>
         * <ul>
         * <li>ID of a resource directory: Resources within the management account and all members of the resource directory are searched. You can call the <a href="https://help.aliyun.com/document_detail/159995.html">GetResourceDirectory</a> operation to query the ID.</li>
         * <li>ID of the Root folder: Resources within all members in the Root folder and the subfolders of the Root folder are searched. You can call the <a href="https://help.aliyun.com/document_detail/159997.html">ListFoldersForParent</a> operation to query the ID.</li>
         * <li>ID of a folder: Resources within all members in the folder are searched. You can call the <a href="https://help.aliyun.com/document_detail/159997.html">ListFoldersForParent</a> operation to query the ID.</li>
         * <li>ID of a member: Resources within the member are searched. You can call the <a href="https://help.aliyun.com/document_detail/160016.html">ListAccounts</a> operation to query the ID.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rd-r4****</p>
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        @Override
        public ListMultiAccountResourceRelationshipsRequest build() {
            return new ListMultiAccountResourceRelationshipsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListMultiAccountResourceRelationshipsRequest} extends {@link TeaModel}
     *
     * <p>ListMultiAccountResourceRelationshipsRequest</p>
     */
    public static class RelatedResourceFilter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("MatchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("Value")
        private java.util.List<String> value;

        private RelatedResourceFilter(Builder builder) {
            this.key = builder.key;
            this.matchType = builder.matchType;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedResourceFilter create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
        }

        /**
         * @return value
         */
        public java.util.List<String> getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String matchType; 
            private java.util.List<String> value; 

            private Builder() {
            } 

            private Builder(RelatedResourceFilter model) {
                this.key = model.key;
                this.matchType = model.matchType;
                this.value = model.value;
            } 

            /**
             * <p>The key of the filter condition. For more information, see <code>Supported filter parameters</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>RelatedResourceRegionId</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The matching method.</p>
             * 
             * <strong>example:</strong>
             * <p>Equals</p>
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * <p>The values of the filter condition.</p>
             */
            public Builder value(java.util.List<String> value) {
                this.value = value;
                return this;
            }

            public RelatedResourceFilter build() {
                return new RelatedResourceFilter(this);
            } 

        } 

    }
}
