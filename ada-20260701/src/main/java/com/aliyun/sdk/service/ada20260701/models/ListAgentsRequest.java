// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ada20260701.models;

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
 * {@link ListAgentsRequest} extends {@link RequestModel}
 *
 * <p>ListAgentsRequest</p>
 */
public class ListAgentsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreatorId")
    private String creatorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Q")
    private String q;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequiredRuntime")
    private String requiredRuntime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Visibility")
    private String visibility;

    private ListAgentsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.creatorId = builder.creatorId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.q = builder.q;
        this.requiredRuntime = builder.requiredRuntime;
        this.scope = builder.scope;
        this.visibility = builder.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return creatorId
     */
    public String getCreatorId() {
        return this.creatorId;
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
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return q
     */
    public String getQ() {
        return this.q;
    }

    /**
     * @return requiredRuntime
     */
    public String getRequiredRuntime() {
        return this.requiredRuntime;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return visibility
     */
    public String getVisibility() {
        return this.visibility;
    }

    public static final class Builder extends Request.Builder<ListAgentsRequest, Builder> {
        private String regionId; 
        private String creatorId; 
        private Integer maxResults; 
        private String nextToken; 
        private Long pageNumber; 
        private Long pageSize; 
        private String q; 
        private String requiredRuntime; 
        private String scope; 
        private String visibility; 

        private Builder() {
            super();
        } 

        private Builder(ListAgentsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.creatorId = request.creatorId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.q = request.q;
            this.requiredRuntime = request.requiredRuntime;
            this.scope = request.scope;
            this.visibility = request.visibility;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Filters agents by the exact creator ID.</p>
         * 
         * <strong>example:</strong>
         * <p>example-user</p>
         */
        public Builder creatorId(String creatorId) {
            this.putQueryParameter("CreatorId", creatorId);
            this.creatorId = creatorId;
            return this;
        }

        /**
         * <p>The number of entries per page for cursor-based pagination. Valid values: 1 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The next page token returned in the previous response.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJwYWdlIjoyfQ.example</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number for page number-based pagination. Minimum value: 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page for page number-based pagination. Valid values: 1 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The search keyword. Matches the name, display name, or description.</p>
         * 
         * <strong>example:</strong>
         * <p>code review</p>
         */
        public Builder q(String q) {
            this.putQueryParameter("Q", q);
            this.q = q;
            return this;
        }

        /**
         * <p>Filters agents by runtime label.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen</p>
         */
        public Builder requiredRuntime(String requiredRuntime) {
            this.putQueryParameter("RequiredRuntime", requiredRuntime);
            this.requiredRuntime = requiredRuntime;
            return this;
        }

        /**
         * <p>The query scope. Valid values: <code>SYSTEM</code> and <code>CUSTOM</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * <p>Filters agents by visibility scope. Valid values: <code>user</code> and <code>tenant</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        public Builder visibility(String visibility) {
            this.putQueryParameter("Visibility", visibility);
            this.visibility = visibility;
            return this;
        }

        @Override
        public ListAgentsRequest build() {
            return new ListAgentsRequest(this);
        } 

    } 

}
