// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefundResult} extends {@link TeaModel}
 *
 * <p>RefundResult</p>
 */
public class RefundResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("applyDisputeDesc")
    private String applyDisputeDesc;

    @com.aliyun.core.annotation.NameInMap("applyReason")
    private ApplyReason applyReason;

    @com.aliyun.core.annotation.NameInMap("bizClaimType")
    private Integer bizClaimType;

    @com.aliyun.core.annotation.NameInMap("disputeCreateTime")
    private String disputeCreateTime;

    @com.aliyun.core.annotation.NameInMap("disputeDesc")
    private String disputeDesc;

    @com.aliyun.core.annotation.NameInMap("disputeEndTime")
    private String disputeEndTime;

    @com.aliyun.core.annotation.NameInMap("disputeId")
    private String disputeId;

    @com.aliyun.core.annotation.NameInMap("disputeStatus")
    private Integer disputeStatus;

    @com.aliyun.core.annotation.NameInMap("orderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("orderLineId")
    private String orderLineId;

    @com.aliyun.core.annotation.NameInMap("orderLogisticsStatus")
    private Integer orderLogisticsStatus;

    @com.aliyun.core.annotation.NameInMap("refundFee")
    private Long refundFee;

    @com.aliyun.core.annotation.NameInMap("refundFeeData")
    private RefundFeeData refundFeeData;

    @com.aliyun.core.annotation.NameInMap("refunderAddress")
    private String refunderAddress;

    @com.aliyun.core.annotation.NameInMap("refunderName")
    private String refunderName;

    @com.aliyun.core.annotation.NameInMap("refunderTel")
    private String refunderTel;

    @com.aliyun.core.annotation.NameInMap("refunderZipCode")
    private String refunderZipCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("returnGoodLogisticsStatus")
    private Integer returnGoodLogisticsStatus;

    @com.aliyun.core.annotation.NameInMap("sellerAgreeMsg")
    private String sellerAgreeMsg;

    @com.aliyun.core.annotation.NameInMap("sellerRefuseAgreementMessage")
    private String sellerRefuseAgreementMessage;

    @com.aliyun.core.annotation.NameInMap("sellerRefuseReason")
    private String sellerRefuseReason;

    private RefundResult(Builder builder) {
        this.applyDisputeDesc = builder.applyDisputeDesc;
        this.applyReason = builder.applyReason;
        this.bizClaimType = builder.bizClaimType;
        this.disputeCreateTime = builder.disputeCreateTime;
        this.disputeDesc = builder.disputeDesc;
        this.disputeEndTime = builder.disputeEndTime;
        this.disputeId = builder.disputeId;
        this.disputeStatus = builder.disputeStatus;
        this.orderId = builder.orderId;
        this.orderLineId = builder.orderLineId;
        this.orderLogisticsStatus = builder.orderLogisticsStatus;
        this.refundFee = builder.refundFee;
        this.refundFeeData = builder.refundFeeData;
        this.refunderAddress = builder.refunderAddress;
        this.refunderName = builder.refunderName;
        this.refunderTel = builder.refunderTel;
        this.refunderZipCode = builder.refunderZipCode;
        this.requestId = builder.requestId;
        this.returnGoodLogisticsStatus = builder.returnGoodLogisticsStatus;
        this.sellerAgreeMsg = builder.sellerAgreeMsg;
        this.sellerRefuseAgreementMessage = builder.sellerRefuseAgreementMessage;
        this.sellerRefuseReason = builder.sellerRefuseReason;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefundResult create() {
        return builder().build();
    }

    /**
     * @return applyDisputeDesc
     */
    public String getApplyDisputeDesc() {
        return this.applyDisputeDesc;
    }

    /**
     * @return applyReason
     */
    public ApplyReason getApplyReason() {
        return this.applyReason;
    }

    /**
     * @return bizClaimType
     */
    public Integer getBizClaimType() {
        return this.bizClaimType;
    }

    /**
     * @return disputeCreateTime
     */
    public String getDisputeCreateTime() {
        return this.disputeCreateTime;
    }

    /**
     * @return disputeDesc
     */
    public String getDisputeDesc() {
        return this.disputeDesc;
    }

    /**
     * @return disputeEndTime
     */
    public String getDisputeEndTime() {
        return this.disputeEndTime;
    }

    /**
     * @return disputeId
     */
    public String getDisputeId() {
        return this.disputeId;
    }

    /**
     * @return disputeStatus
     */
    public Integer getDisputeStatus() {
        return this.disputeStatus;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return orderLineId
     */
    public String getOrderLineId() {
        return this.orderLineId;
    }

    /**
     * @return orderLogisticsStatus
     */
    public Integer getOrderLogisticsStatus() {
        return this.orderLogisticsStatus;
    }

    /**
     * @return refundFee
     */
    public Long getRefundFee() {
        return this.refundFee;
    }

    /**
     * @return refundFeeData
     */
    public RefundFeeData getRefundFeeData() {
        return this.refundFeeData;
    }

    /**
     * @return refunderAddress
     */
    public String getRefunderAddress() {
        return this.refunderAddress;
    }

    /**
     * @return refunderName
     */
    public String getRefunderName() {
        return this.refunderName;
    }

    /**
     * @return refunderTel
     */
    public String getRefunderTel() {
        return this.refunderTel;
    }

    /**
     * @return refunderZipCode
     */
    public String getRefunderZipCode() {
        return this.refunderZipCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return returnGoodLogisticsStatus
     */
    public Integer getReturnGoodLogisticsStatus() {
        return this.returnGoodLogisticsStatus;
    }

    /**
     * @return sellerAgreeMsg
     */
    public String getSellerAgreeMsg() {
        return this.sellerAgreeMsg;
    }

    /**
     * @return sellerRefuseAgreementMessage
     */
    public String getSellerRefuseAgreementMessage() {
        return this.sellerRefuseAgreementMessage;
    }

    /**
     * @return sellerRefuseReason
     */
    public String getSellerRefuseReason() {
        return this.sellerRefuseReason;
    }

    public static final class Builder {
        private String applyDisputeDesc; 
        private ApplyReason applyReason; 
        private Integer bizClaimType; 
        private String disputeCreateTime; 
        private String disputeDesc; 
        private String disputeEndTime; 
        private String disputeId; 
        private Integer disputeStatus; 
        private String orderId; 
        private String orderLineId; 
        private Integer orderLogisticsStatus; 
        private Long refundFee; 
        private RefundFeeData refundFeeData; 
        private String refunderAddress; 
        private String refunderName; 
        private String refunderTel; 
        private String refunderZipCode; 
        private String requestId; 
        private Integer returnGoodLogisticsStatus; 
        private String sellerAgreeMsg; 
        private String sellerRefuseAgreementMessage; 
        private String sellerRefuseReason; 

        /**
         * applyDisputeDesc.
         */
        public Builder applyDisputeDesc(String applyDisputeDesc) {
            this.applyDisputeDesc = applyDisputeDesc;
            return this;
        }

        /**
         * applyReason.
         */
        public Builder applyReason(ApplyReason applyReason) {
            this.applyReason = applyReason;
            return this;
        }

        /**
         * bizClaimType.
         */
        public Builder bizClaimType(Integer bizClaimType) {
            this.bizClaimType = bizClaimType;
            return this;
        }

        /**
         * disputeCreateTime.
         */
        public Builder disputeCreateTime(String disputeCreateTime) {
            this.disputeCreateTime = disputeCreateTime;
            return this;
        }

        /**
         * disputeDesc.
         */
        public Builder disputeDesc(String disputeDesc) {
            this.disputeDesc = disputeDesc;
            return this;
        }

        /**
         * disputeEndTime.
         */
        public Builder disputeEndTime(String disputeEndTime) {
            this.disputeEndTime = disputeEndTime;
            return this;
        }

        /**
         * disputeId.
         */
        public Builder disputeId(String disputeId) {
            this.disputeId = disputeId;
            return this;
        }

        /**
         * disputeStatus.
         */
        public Builder disputeStatus(Integer disputeStatus) {
            this.disputeStatus = disputeStatus;
            return this;
        }

        /**
         * orderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
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
         * orderLogisticsStatus.
         */
        public Builder orderLogisticsStatus(Integer orderLogisticsStatus) {
            this.orderLogisticsStatus = orderLogisticsStatus;
            return this;
        }

        /**
         * refundFee.
         */
        public Builder refundFee(Long refundFee) {
            this.refundFee = refundFee;
            return this;
        }

        /**
         * refundFeeData.
         */
        public Builder refundFeeData(RefundFeeData refundFeeData) {
            this.refundFeeData = refundFeeData;
            return this;
        }

        /**
         * refunderAddress.
         */
        public Builder refunderAddress(String refunderAddress) {
            this.refunderAddress = refunderAddress;
            return this;
        }

        /**
         * refunderName.
         */
        public Builder refunderName(String refunderName) {
            this.refunderName = refunderName;
            return this;
        }

        /**
         * refunderTel.
         */
        public Builder refunderTel(String refunderTel) {
            this.refunderTel = refunderTel;
            return this;
        }

        /**
         * refunderZipCode.
         */
        public Builder refunderZipCode(String refunderZipCode) {
            this.refunderZipCode = refunderZipCode;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * returnGoodLogisticsStatus.
         */
        public Builder returnGoodLogisticsStatus(Integer returnGoodLogisticsStatus) {
            this.returnGoodLogisticsStatus = returnGoodLogisticsStatus;
            return this;
        }

        /**
         * sellerAgreeMsg.
         */
        public Builder sellerAgreeMsg(String sellerAgreeMsg) {
            this.sellerAgreeMsg = sellerAgreeMsg;
            return this;
        }

        /**
         * sellerRefuseAgreementMessage.
         */
        public Builder sellerRefuseAgreementMessage(String sellerRefuseAgreementMessage) {
            this.sellerRefuseAgreementMessage = sellerRefuseAgreementMessage;
            return this;
        }

        /**
         * sellerRefuseReason.
         */
        public Builder sellerRefuseReason(String sellerRefuseReason) {
            this.sellerRefuseReason = sellerRefuseReason;
            return this;
        }

        public RefundResult build() {
            return new RefundResult(this);
        } 

    } 

}
