// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resellertrade20191227.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DiscardCouponListRequest} extends {@link RequestModel}
 *
 * <p>DiscardCouponListRequest</p>
 */
public class DiscardCouponListRequest extends Request {
    @Body
    @NameInMap("CouponList")
    private java.util.List < Long > couponList;

    private DiscardCouponListRequest(Builder builder) {
        super(builder);
        this.couponList = builder.couponList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DiscardCouponListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return couponList
     */
    public java.util.List < Long > getCouponList() {
        return this.couponList;
    }

    public static final class Builder extends Request.Builder<DiscardCouponListRequest, Builder> {
        private java.util.List < Long > couponList; 

        private Builder() {
            super();
        } 

        private Builder(DiscardCouponListRequest request) {
            super(request);
            this.couponList = request.couponList;
        } 

        /**
         * CouponList.
         */
        public Builder couponList(java.util.List < Long > couponList) {
            this.putBodyParameter("CouponList", couponList);
            this.couponList = couponList;
            return this;
        }

        @Override
        public DiscardCouponListRequest build() {
            return new DiscardCouponListRequest(this);
        } 

    } 

}
