// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUnfinishedSessionsRequest} extends {@link RequestModel}
 *
 * <p>QueryUnfinishedSessionsRequest</p>
 */
public class QueryUnfinishedSessionsRequest extends Request {
    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 20, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("QueryTime")
    private Long queryTime;

    private QueryUnfinishedSessionsRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.queryTime = builder.queryTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUnfinishedSessionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return queryTime
     */
    public Long getQueryTime() {
        return this.queryTime;
    }

    public static final class Builder extends Request.Builder<QueryUnfinishedSessionsRequest, Builder> {
        private String bizId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long queryTime; 

        private Builder() {
            super();
        } 

        private Builder(QueryUnfinishedSessionsRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.queryTime = request.queryTime;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * QueryTime.
         */
        public Builder queryTime(Long queryTime) {
            this.putQueryParameter("QueryTime", queryTime);
            this.queryTime = queryTime;
            return this;
        }

        @Override
        public QueryUnfinishedSessionsRequest build() {
            return new QueryUnfinishedSessionsRequest(this);
        } 

    } 

}
