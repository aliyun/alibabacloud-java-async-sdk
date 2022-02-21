// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryProductListRequest} extends {@link RequestModel}
 *
 * <p>QueryProductListRequest</p>
 */
public class QueryProductListRequest extends Request {
    @Query
    @NameInMap("PageNum")
    @Validation(required = true)
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("QueryTotalCount")
    private Boolean queryTotalCount;

    private QueryProductListRequest(Builder builder) {
        super(builder);
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.queryTotalCount = builder.queryTotalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryProductListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return queryTotalCount
     */
    public Boolean getQueryTotalCount() {
        return this.queryTotalCount;
    }

    public static final class Builder extends Request.Builder<QueryProductListRequest, Builder> {
        private Integer pageNum; 
        private Integer pageSize; 
        private Boolean queryTotalCount; 

        private Builder() {
            super();
        } 

        private Builder(QueryProductListRequest response) {
            super(response);
            this.pageNum = response.pageNum;
            this.pageSize = response.pageSize;
            this.queryTotalCount = response.queryTotalCount;
        } 

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * QueryTotalCount.
         */
        public Builder queryTotalCount(Boolean queryTotalCount) {
            this.putQueryParameter("QueryTotalCount", queryTotalCount);
            this.queryTotalCount = queryTotalCount;
            return this;
        }

        @Override
        public QueryProductListRequest build() {
            return new QueryProductListRequest(this);
        } 

    } 

}
