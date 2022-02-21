// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCashCouponsRequest} extends {@link RequestModel}
 *
 * <p>QueryCashCouponsRequest</p>
 */
public class QueryCashCouponsRequest extends Request {
    @Query
    @NameInMap("EffectiveOrNot")
    private Boolean effectiveOrNot;

    @Query
    @NameInMap("ExpiryTimeEnd")
    private String expiryTimeEnd;

    @Query
    @NameInMap("ExpiryTimeStart")
    private String expiryTimeStart;

    private QueryCashCouponsRequest(Builder builder) {
        super(builder);
        this.effectiveOrNot = builder.effectiveOrNot;
        this.expiryTimeEnd = builder.expiryTimeEnd;
        this.expiryTimeStart = builder.expiryTimeStart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCashCouponsRequest create() {
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

    public static final class Builder extends Request.Builder<QueryCashCouponsRequest, Builder> {
        private Boolean effectiveOrNot; 
        private String expiryTimeEnd; 
        private String expiryTimeStart; 

        private Builder() {
            super();
        } 

        private Builder(QueryCashCouponsRequest response) {
            super(response);
            this.effectiveOrNot = response.effectiveOrNot;
            this.expiryTimeEnd = response.expiryTimeEnd;
            this.expiryTimeStart = response.expiryTimeStart;
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

        @Override
        public QueryCashCouponsRequest build() {
            return new QueryCashCouponsRequest(this);
        } 

    } 

}
