// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

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
 * {@link CancelCouponRequest} extends {@link RequestModel}
 *
 * <p>CancelCouponRequest</p>
 */
public class CancelCouponRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CouponId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long couponId;

    private CancelCouponRequest(Builder builder) {
        super(builder);
        this.couponId = builder.couponId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelCouponRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return couponId
     */
    public Long getCouponId() {
        return this.couponId;
    }

    public static final class Builder extends Request.Builder<CancelCouponRequest, Builder> {
        private Long couponId; 

        private Builder() {
            super();
        } 

        private Builder(CancelCouponRequest request) {
            super(request);
            this.couponId = request.couponId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>501001340370350</p>
         */
        public Builder couponId(Long couponId) {
            this.putQueryParameter("CouponId", couponId);
            this.couponId = couponId;
            return this;
        }

        @Override
        public CancelCouponRequest build() {
            return new CancelCouponRequest(this);
        } 

    } 

}
