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
 * {@link ModelRouterQueryClientListRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterQueryClientListRequest</p>
 */
public class ModelRouterQueryClientListRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("parentId")
    private Long parentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private Integer status;

    private ModelRouterQueryClientListRequest(Builder builder) {
        super(builder);
        this.groupBy = builder.groupBy;
        this.keyword = builder.keyword;
        this.maxResults = builder.maxResults;
        this.needTotalCount = builder.needTotalCount;
        this.nextToken = builder.nextToken;
        this.orderBy = builder.orderBy;
        this.orderDirection = builder.orderDirection;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.parentId = builder.parentId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterQueryClientListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return parentId
     */
    public Long getParentId() {
        return this.parentId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ModelRouterQueryClientListRequest, Builder> {
        private String groupBy; 
        private String keyword; 
        private Integer maxResults; 
        private Boolean needTotalCount; 
        private String nextToken; 
        private String orderBy; 
        private String orderDirection; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private Long parentId; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterQueryClientListRequest request) {
            super(request);
            this.groupBy = request.groupBy;
            this.keyword = request.keyword;
            this.maxResults = request.maxResults;
            this.needTotalCount = request.needTotalCount;
            this.nextToken = request.nextToken;
            this.orderBy = request.orderBy;
            this.orderDirection = request.orderDirection;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.parentId = request.parentId;
            this.status = request.status;
        } 

        /**
         * <p>The field to group the results by.</p>
         * 
         * <strong>example:</strong>
         * <p>resourceId</p>
         */
        public Builder groupBy(String groupBy) {
            this.putQueryParameter("groupBy", groupBy);
            this.groupBy = groupBy;
            return this;
        }

        /**
         * <p>The search keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The maximum number of results to return.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Specifies whether to return the total count of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder needTotalCount(Boolean needTotalCount) {
            this.putQueryParameter("needTotalCount", needTotalCount);
            this.needTotalCount = needTotalCount;
            return this;
        }

        /**
         * <p>The token for the next page of results. Set this to the nextToken value from the previous response. Omit for the first page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The field to sort the results by.</p>
         * 
         * <strong>example:</strong>
         * <p>resourceId</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("orderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The sort direction.</p>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        public Builder orderDirection(String orderDirection) {
            this.putQueryParameter("orderDirection", orderDirection);
            this.orderDirection = orderDirection;
            return this;
        }

        /**
         * <p>The page number of the results to return. The first page is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putQueryParameter("pageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>The number of entries to return per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * parentId.
         */
        public Builder parentId(Long parentId) {
            this.putQueryParameter("parentId", parentId);
            this.parentId = parentId;
            return this;
        }

        /**
         * <p>Filters the results by status.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public ModelRouterQueryClientListRequest build() {
            return new ModelRouterQueryClientListRequest(this);
        } 

    } 

}
