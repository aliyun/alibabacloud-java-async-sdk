// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefundRenderResult} extends {@link TeaModel}
 *
 * <p>RefundRenderResult</p>
 */
public class RefundRenderResult extends TeaModel {
    @NameInMap("bizClaimType")
    private Integer bizClaimType;

    @NameInMap("maxRefundFeeData")
    private DistributionMaxRefundFee maxRefundFeeData;

    @NameInMap("orderLineId")
    private String orderLineId;

    @NameInMap("refundReasonList")
    private java.util.List < RefundReason > refundReasonList;

    @NameInMap("requestId")
    private String requestId;

    private RefundRenderResult(Builder builder) {
        this.bizClaimType = builder.bizClaimType;
        this.maxRefundFeeData = builder.maxRefundFeeData;
        this.orderLineId = builder.orderLineId;
        this.refundReasonList = builder.refundReasonList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefundRenderResult create() {
        return builder().build();
    }

    /**
     * @return bizClaimType
     */
    public Integer getBizClaimType() {
        return this.bizClaimType;
    }

    /**
     * @return maxRefundFeeData
     */
    public DistributionMaxRefundFee getMaxRefundFeeData() {
        return this.maxRefundFeeData;
    }

    /**
     * @return orderLineId
     */
    public String getOrderLineId() {
        return this.orderLineId;
    }

    /**
     * @return refundReasonList
     */
    public java.util.List < RefundReason > getRefundReasonList() {
        return this.refundReasonList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer bizClaimType; 
        private DistributionMaxRefundFee maxRefundFeeData; 
        private String orderLineId; 
        private java.util.List < RefundReason > refundReasonList; 
        private String requestId; 

        /**
         * bizClaimType.
         */
        public Builder bizClaimType(Integer bizClaimType) {
            this.bizClaimType = bizClaimType;
            return this;
        }

        /**
         * maxRefundFeeData.
         */
        public Builder maxRefundFeeData(DistributionMaxRefundFee maxRefundFeeData) {
            this.maxRefundFeeData = maxRefundFeeData;
            return this;
        }

        /**
         * orderLineId.
         */
        public Builder orderLineId(String orderLineId) {
            this.orderLineId = orderLineId;
            return this;
        }

        /**
         * refundReasonList.
         */
        public Builder refundReasonList(java.util.List < RefundReason > refundReasonList) {
            this.refundReasonList = refundReasonList;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RefundRenderResult build() {
            return new RefundRenderResult(this);
        } 

    } 

}
