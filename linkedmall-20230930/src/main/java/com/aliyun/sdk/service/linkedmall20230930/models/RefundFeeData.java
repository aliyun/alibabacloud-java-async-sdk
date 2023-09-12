// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefundFeeData} extends {@link TeaModel}
 *
 * <p>RefundFeeData</p>
 */
public class RefundFeeData extends TeaModel {
    @NameInMap("maxRefundFee")
    private Long maxRefundFee;

    @NameInMap("minRefundFee")
    private Long minRefundFee;

    private RefundFeeData(Builder builder) {
        this.maxRefundFee = builder.maxRefundFee;
        this.minRefundFee = builder.minRefundFee;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefundFeeData create() {
        return builder().build();
    }

    /**
     * @return maxRefundFee
     */
    public Long getMaxRefundFee() {
        return this.maxRefundFee;
    }

    /**
     * @return minRefundFee
     */
    public Long getMinRefundFee() {
        return this.minRefundFee;
    }

    public static final class Builder {
        private Long maxRefundFee; 
        private Long minRefundFee; 

        /**
         * maxRefundFee.
         */
        public Builder maxRefundFee(Long maxRefundFee) {
            this.maxRefundFee = maxRefundFee;
            return this;
        }

        /**
         * minRefundFee.
         */
        public Builder minRefundFee(Long minRefundFee) {
            this.minRefundFee = minRefundFee;
            return this;
        }

        public RefundFeeData build() {
            return new RefundFeeData(this);
        } 

    } 

}
