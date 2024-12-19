// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link RefundOrderRequest} extends {@link RequestModel}
 *
 * <p>RefundOrderRequest</p>
 */
public class RefundOrderRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExtInfo")
    private String extInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MerchantId")
    private String merchantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OutRequestNo")
    private String outRequestNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OutTradeNo")
    private String outTradeNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RefundAmount")
    private String refundAmount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RefundReason")
    private String refundReason;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RefundRoyaltyParameters")
    private String refundRoyaltyParameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TradeNo")
    private String tradeNo;

    private RefundOrderRequest(Builder builder) {
        super(builder);
        this.extInfo = builder.extInfo;
        this.merchantId = builder.merchantId;
        this.outRequestNo = builder.outRequestNo;
        this.outTradeNo = builder.outTradeNo;
        this.refundAmount = builder.refundAmount;
        this.refundReason = builder.refundReason;
        this.refundRoyaltyParameters = builder.refundRoyaltyParameters;
        this.tradeNo = builder.tradeNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefundOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extInfo
     */
    public String getExtInfo() {
        return this.extInfo;
    }

    /**
     * @return merchantId
     */
    public String getMerchantId() {
        return this.merchantId;
    }

    /**
     * @return outRequestNo
     */
    public String getOutRequestNo() {
        return this.outRequestNo;
    }

    /**
     * @return outTradeNo
     */
    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    /**
     * @return refundAmount
     */
    public String getRefundAmount() {
        return this.refundAmount;
    }

    /**
     * @return refundReason
     */
    public String getRefundReason() {
        return this.refundReason;
    }

    /**
     * @return refundRoyaltyParameters
     */
    public String getRefundRoyaltyParameters() {
        return this.refundRoyaltyParameters;
    }

    /**
     * @return tradeNo
     */
    public String getTradeNo() {
        return this.tradeNo;
    }

    public static final class Builder extends Request.Builder<RefundOrderRequest, Builder> {
        private String extInfo; 
        private String merchantId; 
        private String outRequestNo; 
        private String outTradeNo; 
        private String refundAmount; 
        private String refundReason; 
        private String refundRoyaltyParameters; 
        private String tradeNo; 

        private Builder() {
            super();
        } 

        private Builder(RefundOrderRequest request) {
            super(request);
            this.extInfo = request.extInfo;
            this.merchantId = request.merchantId;
            this.outRequestNo = request.outRequestNo;
            this.outTradeNo = request.outTradeNo;
            this.refundAmount = request.refundAmount;
            this.refundReason = request.refundReason;
            this.refundRoyaltyParameters = request.refundRoyaltyParameters;
            this.tradeNo = request.tradeNo;
        } 

        /**
         * ExtInfo.
         */
        public Builder extInfo(String extInfo) {
            this.putBodyParameter("ExtInfo", extInfo);
            this.extInfo = extInfo;
            return this;
        }

        /**
         * MerchantId.
         */
        public Builder merchantId(String merchantId) {
            this.putBodyParameter("MerchantId", merchantId);
            this.merchantId = merchantId;
            return this;
        }

        /**
         * OutRequestNo.
         */
        public Builder outRequestNo(String outRequestNo) {
            this.putBodyParameter("OutRequestNo", outRequestNo);
            this.outRequestNo = outRequestNo;
            return this;
        }

        /**
         * OutTradeNo.
         */
        public Builder outTradeNo(String outTradeNo) {
            this.putBodyParameter("OutTradeNo", outTradeNo);
            this.outTradeNo = outTradeNo;
            return this;
        }

        /**
         * RefundAmount.
         */
        public Builder refundAmount(String refundAmount) {
            this.putBodyParameter("RefundAmount", refundAmount);
            this.refundAmount = refundAmount;
            return this;
        }

        /**
         * RefundReason.
         */
        public Builder refundReason(String refundReason) {
            this.putBodyParameter("RefundReason", refundReason);
            this.refundReason = refundReason;
            return this;
        }

        /**
         * RefundRoyaltyParameters.
         */
        public Builder refundRoyaltyParameters(String refundRoyaltyParameters) {
            this.putBodyParameter("RefundRoyaltyParameters", refundRoyaltyParameters);
            this.refundRoyaltyParameters = refundRoyaltyParameters;
            return this;
        }

        /**
         * TradeNo.
         */
        public Builder tradeNo(String tradeNo) {
            this.putBodyParameter("TradeNo", tradeNo);
            this.tradeNo = tradeNo;
            return this;
        }

        @Override
        public RefundOrderRequest build() {
            return new RefundOrderRequest(this);
        } 

    } 

}
