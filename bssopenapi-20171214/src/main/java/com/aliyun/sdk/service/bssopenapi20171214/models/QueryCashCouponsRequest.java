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

        private Builder(QueryCashCouponsRequest request) {
            super(request);
            this.effectiveOrNot = request.effectiveOrNot;
            this.expiryTimeEnd = request.expiryTimeEnd;
            this.expiryTimeStart = request.expiryTimeStart;
        } 

        /**
         * Specifies whether the voucher takes effect. Valid values:
         * <p>
         * 
         * *   true: The voucher takes effect.
         * *   false: The voucher does not take effect.
         */
        public Builder effectiveOrNot(Boolean effectiveOrNot) {
            this.putQueryParameter("EffectiveOrNot", effectiveOrNot);
            this.effectiveOrNot = effectiveOrNot;
            return this;
        }

        /**
         * The end time of the validity period of the voucher. Specify the parameter in the yyyy-MM-ddTHH:mm:ssZ format. Example: 2018-08-01T00:00:00Z.
         */
        public Builder expiryTimeEnd(String expiryTimeEnd) {
            this.putQueryParameter("ExpiryTimeEnd", expiryTimeEnd);
            this.expiryTimeEnd = expiryTimeEnd;
            return this;
        }

        /**
         * The start time of the validity period of the voucher. Specify the parameter in the yyyy-MM-ddTHH:mm:ssZ format. Example: 2018-08-01T00:00:00Z.
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
