// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link SubmitSlaCouponApplyResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitSlaCouponApplyResponseBody</p>
 */
public class SubmitSlaCouponApplyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Metadata")
    private Object metadata;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SumCoupon")
    private Double sumCoupon;

    @com.aliyun.core.annotation.NameInMap("ValidEndTime")
    private String validEndTime;

    @com.aliyun.core.annotation.NameInMap("ValidStartTime")
    private String validStartTime;

    private SubmitSlaCouponApplyResponseBody(Builder builder) {
        this.metadata = builder.metadata;
        this.requestId = builder.requestId;
        this.sumCoupon = builder.sumCoupon;
        this.validEndTime = builder.validEndTime;
        this.validStartTime = builder.validStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitSlaCouponApplyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metadata
     */
    public Object getMetadata() {
        return this.metadata;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sumCoupon
     */
    public Double getSumCoupon() {
        return this.sumCoupon;
    }

    /**
     * @return validEndTime
     */
    public String getValidEndTime() {
        return this.validEndTime;
    }

    /**
     * @return validStartTime
     */
    public String getValidStartTime() {
        return this.validStartTime;
    }

    public static final class Builder {
        private Object metadata; 
        private String requestId; 
        private Double sumCoupon; 
        private String validEndTime; 
        private String validStartTime; 

        private Builder() {
        } 

        private Builder(SubmitSlaCouponApplyResponseBody model) {
            this.metadata = model.metadata;
            this.requestId = model.requestId;
            this.sumCoupon = model.sumCoupon;
            this.validEndTime = model.validEndTime;
            this.validStartTime = model.validStartTime;
        } 

        /**
         * Metadata.
         */
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SumCoupon.
         */
        public Builder sumCoupon(Double sumCoupon) {
            this.sumCoupon = sumCoupon;
            return this;
        }

        /**
         * ValidEndTime.
         */
        public Builder validEndTime(String validEndTime) {
            this.validEndTime = validEndTime;
            return this;
        }

        /**
         * ValidStartTime.
         */
        public Builder validStartTime(String validStartTime) {
            this.validStartTime = validStartTime;
            return this;
        }

        public SubmitSlaCouponApplyResponseBody build() {
            return new SubmitSlaCouponApplyResponseBody(this);
        } 

    } 

}
