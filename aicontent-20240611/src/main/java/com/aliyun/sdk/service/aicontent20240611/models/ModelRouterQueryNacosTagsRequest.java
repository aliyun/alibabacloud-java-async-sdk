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
 * {@link ModelRouterQueryNacosTagsRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterQueryNacosTagsRequest</p>
 */
public class ModelRouterQueryNacosTagsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("configType")
    private String configType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("groupBy")
    private String groupBy;

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

    private ModelRouterQueryNacosTagsRequest(Builder builder) {
        super(builder);
        this.configType = builder.configType;
        this.groupBy = builder.groupBy;
        this.maxResults = builder.maxResults;
        this.needTotalCount = builder.needTotalCount;
        this.nextToken = builder.nextToken;
        this.orderBy = builder.orderBy;
        this.orderDirection = builder.orderDirection;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterQueryNacosTagsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configType
     */
    public String getConfigType() {
        return this.configType;
    }

    /**
     * @return groupBy
     */
    public String getGroupBy() {
        return this.groupBy;
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

    public static final class Builder extends Request.Builder<ModelRouterQueryNacosTagsRequest, Builder> {
        private String configType; 
        private String groupBy; 
        private Integer maxResults; 
        private Boolean needTotalCount; 
        private String nextToken; 
        private String orderBy; 
        private String orderDirection; 
        private Integer pageIndex; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterQueryNacosTagsRequest request) {
            super(request);
            this.configType = request.configType;
            this.groupBy = request.groupBy;
            this.maxResults = request.maxResults;
            this.needTotalCount = request.needTotalCount;
            this.nextToken = request.nextToken;
            this.orderBy = request.orderBy;
            this.orderDirection = request.orderDirection;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
        } 

        /**
         * configType.
         */
        public Builder configType(String configType) {
            this.putQueryParameter("configType", configType);
            this.configType = configType;
            return this;
        }

        /**
         * <p>The field by which to group the results.</p>
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
         * <p>Specifies whether to return the total count of results.</p>
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
         * <p>The token from a previous response to retrieve the next page of results.</p>
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
         * <p>The field by which to sort the results.</p>
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
         * <p>The sort order.</p>
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
         * <p>The page number.</p>
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
         * <p>The number of results to return per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ModelRouterQueryNacosTagsRequest build() {
            return new ModelRouterQueryNacosTagsRequest(this);
        } 

    } 

}
