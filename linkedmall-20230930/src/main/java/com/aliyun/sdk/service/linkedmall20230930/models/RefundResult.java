// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(RefundResult model) {
            this.applyDisputeDesc = model.applyDisputeDesc;
            this.applyReason = model.applyReason;
            this.bizClaimType = model.bizClaimType;
            this.disputeCreateTime = model.disputeCreateTime;
            this.disputeDesc = model.disputeDesc;
            this.disputeEndTime = model.disputeEndTime;
            this.disputeId = model.disputeId;
            this.disputeStatus = model.disputeStatus;
            this.orderId = model.orderId;
            this.orderLineId = model.orderLineId;
            this.orderLogisticsStatus = model.orderLogisticsStatus;
            this.refundFee = model.refundFee;
            this.refundFeeData = model.refundFeeData;
            this.refunderAddress = model.refunderAddress;
            this.refunderName = model.refunderName;
            this.refunderTel = model.refunderTel;
            this.refunderZipCode = model.refunderZipCode;
            this.requestId = model.requestId;
            this.returnGoodLogisticsStatus = model.returnGoodLogisticsStatus;
            this.sellerAgreeMsg = model.sellerAgreeMsg;
            this.sellerRefuseAgreementMessage = model.sellerRefuseAgreementMessage;
            this.sellerRefuseReason = model.sellerRefuseReason;
        } 

        /**
         * <p>Current buyer\&quot;s refund request description</p>
         * 
         * <strong>example:</strong>
         * <p>多拍不想要</p>
         */
        public Builder applyDisputeDesc(String applyDisputeDesc) {
            this.applyDisputeDesc = applyDisputeDesc;
            return this;
        }

        /**
         * <p>Request reason</p>
         */
        public Builder applyReason(ApplyReason applyReason) {
            this.applyReason = applyReason;
            return this;
        }

        /**
         * <p>Order return method<br>1 – identity indicates refund only<br>3 – identity indicates return and refund</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder bizClaimType(Integer bizClaimType) {
            this.bizClaimType = bizClaimType;
            return this;
        }

        /**
         * <p>Dispute creation time</p>
         * 
         * <strong>example:</strong>
         * <p>2023-09-02T00:00:00.000Z</p>
         */
        public Builder disputeCreateTime(String disputeCreateTime) {
            this.disputeCreateTime = disputeCreateTime;
            return this;
        }

        /**
         * <p>Reverse request description</p>
         * 
         * <strong>example:</strong>
         * <p>多拍不想要</p>
         */
        public Builder disputeDesc(String disputeDesc) {
            this.disputeDesc = disputeDesc;
            return this;
        }

        /**
         * <p>Reverse process end time</p>
         * 
         * <strong>example:</strong>
         * <p>2023-09-02T12:00:00.000Z</p>
         */
        public Builder disputeEndTime(String disputeEndTime) {
            this.disputeEndTime = disputeEndTime;
            return this;
        }

        /**
         * <p>Reverse order ID</p>
         * 
         * <strong>example:</strong>
         * <p>6693****4352</p>
         */
        public Builder disputeId(String disputeId) {
            this.disputeId = disputeId;
            return this;
        }

        /**
         * <p>Reverse order status<br>1 – Return pending<br>2 – Awaiting buyer return<br>3 – Awaiting merchant receipt<br>4 – Refund shutdown<br>5 – Refund succeeded<br>6 – Refund denied<br>17 – Canceling refund</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder disputeStatus(Integer disputeStatus) {
            this.disputeStatus = disputeStatus;
            return this;
        }

        /**
         * <p>Main order ID</p>
         * 
         * <strong>example:</strong>
         * <p>6692****5457</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>Sub-order ID</p>
         * 
         * <strong>example:</strong>
         * <p>6692****5458</p>
         */
        public Builder orderLineId(String orderLineId) {
            this.orderLineId = orderLineId;
            return this;
        }

        /**
         * <p>Order logistics status<br>1 – Not shipped → Awaiting seller shipment<br>2 – Shipped → Awaiting buyer confirmation of receipt<br>3 – Received → Transaction succeeded<br>6 – Partially shipping<br>8 – Logistics order not yet created</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder orderLogisticsStatus(Integer orderLogisticsStatus) {
            this.orderLogisticsStatus = orderLogisticsStatus;
            return this;
        }

        /**
         * <p>Refund amount</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder refundFee(Long refundFee) {
            this.refundFee = refundFee;
            return this;
        }

        /**
         * <p>Refund period</p>
         */
        public Builder refundFeeData(RefundFeeData refundFeeData) {
            this.refundFeeData = refundFeeData;
            return this;
        }

        /**
         * <p>Merchant return address (available when disputeStatus=2, indicating the status is pending buyer return; save the return address during this status if needed)</p>
         * 
         * <strong>example:</strong>
         * <p>阿里云云谷</p>
         */
        public Builder refunderAddress(String refunderAddress) {
            this.refunderAddress = refunderAddress;
            return this;
        }

        /**
         * <p>Return recipient name</p>
         * 
         * <strong>example:</strong>
         * <p>赵先生</p>
         */
        public Builder refunderName(String refunderName) {
            this.refunderName = refunderName;
            return this;
        }

        /**
         * <p>Return contact information</p>
         * 
         * <strong>example:</strong>
         * <p>182****1334</p>
         */
        public Builder refunderTel(String refunderTel) {
            this.refunderTel = refunderTel;
            return this;
        }

        /**
         * <p>Return address ZIP code</p>
         * 
         * <strong>example:</strong>
         * <p>331001</p>
         */
        public Builder refunderZipCode(String refunderZipCode) {
            this.refunderZipCode = refunderZipCode;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>841471F6-5D61-1331-8C38-2****B55</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return logistics status<br>0 – Return not initiated<br>1 – Awaiting pickup<br>2 – Package picked up<br>3 – In transit<br>4 – Out for delivery<br>5 – Delivered<br>6 – Delivery failed</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder returnGoodLogisticsStatus(Integer returnGoodLogisticsStatus) {
            this.returnGoodLogisticsStatus = returnGoodLogisticsStatus;
            return this;
        }

        /**
         * <p>Seller’s return approval message</p>
         * 
         * <strong>example:</strong>
         * <p>同意退款</p>
         */
        public Builder sellerAgreeMsg(String sellerAgreeMsg) {
            this.sellerAgreeMsg = sellerAgreeMsg;
            return this;
        }

        /**
         * <p>Merchant\&quot;s message explaining the denial</p>
         * 
         * <strong>example:</strong>
         * <p>不同意退款</p>
         */
        public Builder sellerRefuseAgreementMessage(String sellerRefuseAgreementMessage) {
            this.sellerRefuseAgreementMessage = sellerRefuseAgreementMessage;
            return this;
        }

        /**
         * <p>Merchant denial reason</p>
         * 
         * <strong>example:</strong>
         * <p>商品没问题，买家举证无效</p>
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
