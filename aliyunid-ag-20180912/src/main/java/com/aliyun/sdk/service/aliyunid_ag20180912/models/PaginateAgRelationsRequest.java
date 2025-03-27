// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliyunid_ag20180912.models;

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
 * {@link PaginateAgRelationsRequest} extends {@link RequestModel}
 *
 * <p>PaginateAgRelationsRequest</p>
 */
public class PaginateAgRelationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryCount")
    private Boolean queryCount;

    private PaginateAgRelationsRequest(Builder builder) {
        super(builder);
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.queryCount = builder.queryCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PaginateAgRelationsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return queryCount
     */
    public Boolean getQueryCount() {
        return this.queryCount;
    }

    public static final class Builder extends Request.Builder<PaginateAgRelationsRequest, Builder> {
        private Long pageNo; 
        private Integer pageSize; 
        private Boolean queryCount; 

        private Builder() {
            super();
        } 

        private Builder(PaginateAgRelationsRequest request) {
            super(request);
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.queryCount = request.queryCount;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * QueryCount.
         */
        public Builder queryCount(Boolean queryCount) {
            this.putQueryParameter("QueryCount", queryCount);
            this.queryCount = queryCount;
            return this;
        }

        @Override
        public PaginateAgRelationsRequest build() {
            return new PaginateAgRelationsRequest(this);
        } 

    } 

}
