// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryProductListRequest} extends {@link RequestModel}
 *
 * <p>QueryProductListRequest</p>
 */
public class QueryProductListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryTotalCount")
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

        private Builder(QueryProductListRequest request) {
            super(request);
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.queryTotalCount = request.queryTotalCount;
        } 

        /**
         * <p>The page number of the page to return.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Specifies whether to return the total number of services. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
