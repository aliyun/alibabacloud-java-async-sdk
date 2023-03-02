// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPartnerProduceListRequest} extends {@link RequestModel}
 *
 * <p>QueryPartnerProduceListRequest</p>
 */
public class QueryPartnerProduceListRequest extends Request {
    @Query
    @NameInMap("BizId")
    private String bizId;

    @Query
    @NameInMap("BizType")
    private String bizType;

    @Query
    @NameInMap("PageNum")
    private Long pageNum;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    private QueryPartnerProduceListRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.bizType = builder.bizType;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPartnerProduceListRequest create() {
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
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return pageNum
     */
    public Long getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<QueryPartnerProduceListRequest, Builder> {
        private String bizId; 
        private String bizType; 
        private Long pageNum; 
        private Long pageSize; 

        private Builder() {
            super();
        } 

        private Builder(QueryPartnerProduceListRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.bizType = request.bizType;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
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
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Long pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public QueryPartnerProduceListRequest build() {
            return new QueryPartnerProduceListRequest(this);
        } 

    } 

}
