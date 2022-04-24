// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRedeemRequest} extends {@link RequestModel}
 *
 * <p>QueryRedeemRequest</p>
 */
public class QueryRedeemRequest extends Request {
    @Query
    @NameInMap("EffectiveOrNot")
    private Boolean effectiveOrNot;

    @Query
    @NameInMap("ExpiryTimeEnd")
    private String expiryTimeEnd;

    @Query
    @NameInMap("ExpiryTimeStart")
    private String expiryTimeStart;

    @Query
    @NameInMap("PageNum")
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    private QueryRedeemRequest(Builder builder) {
        super(builder);
        this.effectiveOrNot = builder.effectiveOrNot;
        this.expiryTimeEnd = builder.expiryTimeEnd;
        this.expiryTimeStart = builder.expiryTimeStart;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRedeemRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return effectiveOrNot
     */
    public Boolean getEffectiveOrNot() {
        return this.effectiveOrNot;
    }

    /**
     * @return expiryTimeEnd
     */
    public String getExpiryTimeEnd() {
        return this.expiryTimeEnd;
    }

    /**
     * @return expiryTimeStart
     */
    public String getExpiryTimeStart() {
        return this.expiryTimeStart;
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

    public static final class Builder extends Request.Builder<QueryRedeemRequest, Builder> {
        private Boolean effectiveOrNot; 
        private String expiryTimeEnd; 
        private String expiryTimeStart; 
        private Integer pageNum; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(QueryRedeemRequest request) {
            super(request);
            this.effectiveOrNot = request.effectiveOrNot;
            this.expiryTimeEnd = request.expiryTimeEnd;
            this.expiryTimeStart = request.expiryTimeStart;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
        } 

        /**
         * EffectiveOrNot.
         */
        public Builder effectiveOrNot(Boolean effectiveOrNot) {
            this.putQueryParameter("EffectiveOrNot", effectiveOrNot);
            this.effectiveOrNot = effectiveOrNot;
            return this;
        }

        /**
         * ExpiryTimeEnd.
         */
        public Builder expiryTimeEnd(String expiryTimeEnd) {
            this.putQueryParameter("ExpiryTimeEnd", expiryTimeEnd);
            this.expiryTimeEnd = expiryTimeEnd;
            return this;
        }

        /**
         * ExpiryTimeStart.
         */
        public Builder expiryTimeStart(String expiryTimeStart) {
            this.putQueryParameter("ExpiryTimeStart", expiryTimeStart);
            this.expiryTimeStart = expiryTimeStart;
            return this;
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

        @Override
        public QueryRedeemRequest build() {
            return new QueryRedeemRequest(this);
        } 

    } 

}
