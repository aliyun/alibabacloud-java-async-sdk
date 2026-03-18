// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ModelRouterQueryApiKeyListRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterQueryApiKeyListRequest</p>
 */
public class ModelRouterQueryApiKeyListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientId")
    private Long clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("groupBy")
    private String groupBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("needTotalCount")
    private Boolean needTotalCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("orderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("orderDirection")
    private String orderDirection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private Integer status;

    private ModelRouterQueryApiKeyListRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.groupBy = builder.groupBy;
        this.keyword = builder.keyword;
        this.maxResults = builder.maxResults;
        this.needTotalCount = builder.needTotalCount;
        this.nextToken = builder.nextToken;
        this.orderBy = builder.orderBy;
        this.orderDirection = builder.orderDirection;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterQueryApiKeyListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientId
     */
    public Long getClientId() {
        return this.clientId;
    }

    /**
     * @return groupBy
     */
    public String getGroupBy() {
        return this.groupBy;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return needTotalCount
     */
    public Boolean getNeedTotalCount() {
        return this.needTotalCount;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return orderDirection
     */
    public String getOrderDirection() {
        return this.orderDirection;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ModelRouterQueryApiKeyListRequest, Builder> {
        private Long clientId; 
        private String groupBy; 
        private String keyword; 
        private Integer maxResults; 
        private Boolean needTotalCount; 
        private String nextToken; 
        private String orderBy; 
        private String orderDirection; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterQueryApiKeyListRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.groupBy = request.groupBy;
            this.keyword = request.keyword;
            this.maxResults = request.maxResults;
            this.needTotalCount = request.needTotalCount;
            this.nextToken = request.nextToken;
            this.orderBy = request.orderBy;
            this.orderDirection = request.orderDirection;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.status = request.status;
        } 

        /**
         * clientId.
         */
        public Builder clientId(Long clientId) {
            this.putQueryParameter("clientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * groupBy.
         */
        public Builder groupBy(String groupBy) {
            this.putQueryParameter("groupBy", groupBy);
            this.groupBy = groupBy;
            return this;
        }

        /**
         * keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("keyword", keyword);
            this.keyword = keyword;
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
         * needTotalCount.
         */
        public Builder needTotalCount(Boolean needTotalCount) {
            this.putQueryParameter("needTotalCount", needTotalCount);
            this.needTotalCount = needTotalCount;
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
         * orderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("orderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * orderDirection.
         */
        public Builder orderDirection(String orderDirection) {
            this.putQueryParameter("orderDirection", orderDirection);
            this.orderDirection = orderDirection;
            return this;
        }

        /**
         * pageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putQueryParameter("pageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public ModelRouterQueryApiKeyListRequest build() {
            return new ModelRouterQueryApiKeyListRequest(this);
        } 

    } 

}
