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
 * {@link QueryRefundApplicationDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRefundApplicationDetailResponseBody</p>
 */
public class QueryRefundApplicationDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RefundApplicationDetail")
    private RefundApplicationDetail refundApplicationDetail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryRefundApplicationDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.refundApplicationDetail = builder.refundApplicationDetail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRefundApplicationDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return refundApplicationDetail
     */
    public RefundApplicationDetail getRefundApplicationDetail() {
        return this.refundApplicationDetail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private RefundApplicationDetail refundApplicationDetail; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RefundApplicationDetail.
         */
        public Builder refundApplicationDetail(RefundApplicationDetail refundApplicationDetail) {
            this.refundApplicationDetail = refundApplicationDetail;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryRefundApplicationDetailResponseBody build() {
            return new QueryRefundApplicationDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryRefundApplicationDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryRefundApplicationDetailResponseBody</p>
     */
    public static class ApplyReasonText extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReasonTextId")
        private Long reasonTextId;

        @com.aliyun.core.annotation.NameInMap("ReasonTips")
        private String reasonTips;

        private ApplyReasonText(Builder builder) {
            this.reasonTextId = builder.reasonTextId;
            this.reasonTips = builder.reasonTips;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplyReasonText create() {
            return builder().build();
        }

        /**
         * @return reasonTextId
         */
        public Long getReasonTextId() {
            return this.reasonTextId;
        }

        /**
         * @return reasonTips
         */
        public String getReasonTips() {
            return this.reasonTips;
        }

        public static final class Builder {
            private Long reasonTextId; 
            private String reasonTips; 

            /**
             * ReasonTextId.
             */
            public Builder reasonTextId(Long reasonTextId) {
                this.reasonTextId = reasonTextId;
                return this;
            }

            /**
             * ReasonTips.
             */
            public Builder reasonTips(String reasonTips) {
                this.reasonTips = reasonTips;
                return this;
            }

            public ApplyReasonText build() {
                return new ApplyReasonText(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryRefundApplicationDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryRefundApplicationDetailResponseBody</p>
     */
    public static class MaxRefundFeeData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxRefundFee")
        private Integer maxRefundFee;

        @com.aliyun.core.annotation.NameInMap("MinRefundFee")
        private Integer minRefundFee;

        private MaxRefundFeeData(Builder builder) {
            this.maxRefundFee = builder.maxRefundFee;
            this.minRefundFee = builder.minRefundFee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MaxRefundFeeData create() {
            return builder().build();
        }

        /**
         * @return maxRefundFee
         */
        public Integer getMaxRefundFee() {
            return this.maxRefundFee;
        }

        /**
         * @return minRefundFee
         */
        public Integer getMinRefundFee() {
            return this.minRefundFee;
        }

        public static final class Builder {
            private Integer maxRefundFee; 
            private Integer minRefundFee; 

            /**
             * MaxRefundFee.
             */
            public Builder maxRefundFee(Integer maxRefundFee) {
                this.maxRefundFee = maxRefundFee;
                return this;
            }

            /**
             * MinRefundFee.
             */
            public Builder minRefundFee(Integer minRefundFee) {
                this.minRefundFee = minRefundFee;
                return this;
            }

            public MaxRefundFeeData build() {
                return new MaxRefundFeeData(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryRefundApplicationDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryRefundApplicationDetailResponseBody</p>
     */
    public static class RefundApplicationDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplyDisputeDesc")
        private String applyDisputeDesc;

        @com.aliyun.core.annotation.NameInMap("ApplyReasonText")
        private ApplyReasonText applyReasonText;

        @com.aliyun.core.annotation.NameInMap("BizClaimType")
        private Integer bizClaimType;

        @com.aliyun.core.annotation.NameInMap("DisputeCreateTime")
        private String disputeCreateTime;

        @com.aliyun.core.annotation.NameInMap("DisputeDesc")
        private String disputeDesc;

        @com.aliyun.core.annotation.NameInMap("DisputeEndTime")
        private String disputeEndTime;

        @com.aliyun.core.annotation.NameInMap("DisputeId")
        private Long disputeId;

        @com.aliyun.core.annotation.NameInMap("DisputeStatus")
        private Integer disputeStatus;

        @com.aliyun.core.annotation.NameInMap("DisputeType")
        private Integer disputeType;

        @com.aliyun.core.annotation.NameInMap("LmOrderId")
        private String lmOrderId;

        @com.aliyun.core.annotation.NameInMap("MaxRefundFeeData")
        private MaxRefundFeeData maxRefundFeeData;

        @com.aliyun.core.annotation.NameInMap("OrderLogisticsStatus")
        private Integer orderLogisticsStatus;

        @com.aliyun.core.annotation.NameInMap("RealRefundFee")
        private Long realRefundFee;

        @com.aliyun.core.annotation.NameInMap("RefundFee")
        private Long refundFee;

        @com.aliyun.core.annotation.NameInMap("RefunderAddress")
        private String refunderAddress;

        @com.aliyun.core.annotation.NameInMap("RefunderName")
        private String refunderName;

        @com.aliyun.core.annotation.NameInMap("RefunderTel")
        private String refunderTel;

        @com.aliyun.core.annotation.NameInMap("RefunderZipCode")
        private String refunderZipCode;

        @com.aliyun.core.annotation.NameInMap("ReturnGoodCount")
        private Integer returnGoodCount;

        @com.aliyun.core.annotation.NameInMap("ReturnGoodLogisticsStatus")
        private Integer returnGoodLogisticsStatus;

        @com.aliyun.core.annotation.NameInMap("SellerAgreeMsg")
        private String sellerAgreeMsg;

        @com.aliyun.core.annotation.NameInMap("SellerRefuseAgreementMessage")
        private String sellerRefuseAgreementMessage;

        @com.aliyun.core.annotation.NameInMap("SellerRefuseReason")
        private String sellerRefuseReason;

        @com.aliyun.core.annotation.NameInMap("SubLmOrderId")
        private String subLmOrderId;

        private RefundApplicationDetail(Builder builder) {
            this.applyDisputeDesc = builder.applyDisputeDesc;
            this.applyReasonText = builder.applyReasonText;
            this.bizClaimType = builder.bizClaimType;
            this.disputeCreateTime = builder.disputeCreateTime;
            this.disputeDesc = builder.disputeDesc;
            this.disputeEndTime = builder.disputeEndTime;
            this.disputeId = builder.disputeId;
            this.disputeStatus = builder.disputeStatus;
            this.disputeType = builder.disputeType;
            this.lmOrderId = builder.lmOrderId;
            this.maxRefundFeeData = builder.maxRefundFeeData;
            this.orderLogisticsStatus = builder.orderLogisticsStatus;
            this.realRefundFee = builder.realRefundFee;
            this.refundFee = builder.refundFee;
            this.refunderAddress = builder.refunderAddress;
            this.refunderName = builder.refunderName;
            this.refunderTel = builder.refunderTel;
            this.refunderZipCode = builder.refunderZipCode;
            this.returnGoodCount = builder.returnGoodCount;
            this.returnGoodLogisticsStatus = builder.returnGoodLogisticsStatus;
            this.sellerAgreeMsg = builder.sellerAgreeMsg;
            this.sellerRefuseAgreementMessage = builder.sellerRefuseAgreementMessage;
            this.sellerRefuseReason = builder.sellerRefuseReason;
            this.subLmOrderId = builder.subLmOrderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundApplicationDetail create() {
            return builder().build();
        }

        /**
         * @return applyDisputeDesc
         */
        public String getApplyDisputeDesc() {
            return this.applyDisputeDesc;
        }

        /**
         * @return applyReasonText
         */
        public ApplyReasonText getApplyReasonText() {
            return this.applyReasonText;
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
        public Long getDisputeId() {
            return this.disputeId;
        }

        /**
         * @return disputeStatus
         */
        public Integer getDisputeStatus() {
            return this.disputeStatus;
        }

        /**
         * @return disputeType
         */
        public Integer getDisputeType() {
            return this.disputeType;
        }

        /**
         * @return lmOrderId
         */
        public String getLmOrderId() {
            return this.lmOrderId;
        }

        /**
         * @return maxRefundFeeData
         */
        public MaxRefundFeeData getMaxRefundFeeData() {
            return this.maxRefundFeeData;
        }

        /**
         * @return orderLogisticsStatus
         */
        public Integer getOrderLogisticsStatus() {
            return this.orderLogisticsStatus;
        }

        /**
         * @return realRefundFee
         */
        public Long getRealRefundFee() {
            return this.realRefundFee;
        }

        /**
         * @return refundFee
         */
        public Long getRefundFee() {
            return this.refundFee;
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
         * @return returnGoodCount
         */
        public Integer getReturnGoodCount() {
            return this.returnGoodCount;
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

        /**
         * @return subLmOrderId
         */
        public String getSubLmOrderId() {
            return this.subLmOrderId;
        }

        public static final class Builder {
            private String applyDisputeDesc; 
            private ApplyReasonText applyReasonText; 
            private Integer bizClaimType; 
            private String disputeCreateTime; 
            private String disputeDesc; 
            private String disputeEndTime; 
            private Long disputeId; 
            private Integer disputeStatus; 
            private Integer disputeType; 
            private String lmOrderId; 
            private MaxRefundFeeData maxRefundFeeData; 
            private Integer orderLogisticsStatus; 
            private Long realRefundFee; 
            private Long refundFee; 
            private String refunderAddress; 
            private String refunderName; 
            private String refunderTel; 
            private String refunderZipCode; 
            private Integer returnGoodCount; 
            private Integer returnGoodLogisticsStatus; 
            private String sellerAgreeMsg; 
            private String sellerRefuseAgreementMessage; 
            private String sellerRefuseReason; 
            private String subLmOrderId; 

            /**
             * ApplyDisputeDesc.
             */
            public Builder applyDisputeDesc(String applyDisputeDesc) {
                this.applyDisputeDesc = applyDisputeDesc;
                return this;
            }

            /**
             * ApplyReasonText.
             */
            public Builder applyReasonText(ApplyReasonText applyReasonText) {
                this.applyReasonText = applyReasonText;
                return this;
            }

            /**
             * BizClaimType.
             */
            public Builder bizClaimType(Integer bizClaimType) {
                this.bizClaimType = bizClaimType;
                return this;
            }

            /**
             * DisputeCreateTime.
             */
            public Builder disputeCreateTime(String disputeCreateTime) {
                this.disputeCreateTime = disputeCreateTime;
                return this;
            }

            /**
             * DisputeDesc.
             */
            public Builder disputeDesc(String disputeDesc) {
                this.disputeDesc = disputeDesc;
                return this;
            }

            /**
             * DisputeEndTime.
             */
            public Builder disputeEndTime(String disputeEndTime) {
                this.disputeEndTime = disputeEndTime;
                return this;
            }

            /**
             * DisputeId.
             */
            public Builder disputeId(Long disputeId) {
                this.disputeId = disputeId;
                return this;
            }

            /**
             * DisputeStatus.
             */
            public Builder disputeStatus(Integer disputeStatus) {
                this.disputeStatus = disputeStatus;
                return this;
            }

            /**
             * DisputeType.
             */
            public Builder disputeType(Integer disputeType) {
                this.disputeType = disputeType;
                return this;
            }

            /**
             * LmOrderId.
             */
            public Builder lmOrderId(String lmOrderId) {
                this.lmOrderId = lmOrderId;
                return this;
            }

            /**
             * MaxRefundFeeData.
             */
            public Builder maxRefundFeeData(MaxRefundFeeData maxRefundFeeData) {
                this.maxRefundFeeData = maxRefundFeeData;
                return this;
            }

            /**
             * OrderLogisticsStatus.
             */
            public Builder orderLogisticsStatus(Integer orderLogisticsStatus) {
                this.orderLogisticsStatus = orderLogisticsStatus;
                return this;
            }

            /**
             * RealRefundFee.
             */
            public Builder realRefundFee(Long realRefundFee) {
                this.realRefundFee = realRefundFee;
                return this;
            }

            /**
             * RefundFee.
             */
            public Builder refundFee(Long refundFee) {
                this.refundFee = refundFee;
                return this;
            }

            /**
             * RefunderAddress.
             */
            public Builder refunderAddress(String refunderAddress) {
                this.refunderAddress = refunderAddress;
                return this;
            }

            /**
             * RefunderName.
             */
            public Builder refunderName(String refunderName) {
                this.refunderName = refunderName;
                return this;
            }

            /**
             * RefunderTel.
             */
            public Builder refunderTel(String refunderTel) {
                this.refunderTel = refunderTel;
                return this;
            }

            /**
             * RefunderZipCode.
             */
            public Builder refunderZipCode(String refunderZipCode) {
                this.refunderZipCode = refunderZipCode;
                return this;
            }

            /**
             * ReturnGoodCount.
             */
            public Builder returnGoodCount(Integer returnGoodCount) {
                this.returnGoodCount = returnGoodCount;
                return this;
            }

            /**
             * ReturnGoodLogisticsStatus.
             */
            public Builder returnGoodLogisticsStatus(Integer returnGoodLogisticsStatus) {
                this.returnGoodLogisticsStatus = returnGoodLogisticsStatus;
                return this;
            }

            /**
             * SellerAgreeMsg.
             */
            public Builder sellerAgreeMsg(String sellerAgreeMsg) {
                this.sellerAgreeMsg = sellerAgreeMsg;
                return this;
            }

            /**
             * SellerRefuseAgreementMessage.
             */
            public Builder sellerRefuseAgreementMessage(String sellerRefuseAgreementMessage) {
                this.sellerRefuseAgreementMessage = sellerRefuseAgreementMessage;
                return this;
            }

            /**
             * SellerRefuseReason.
             */
            public Builder sellerRefuseReason(String sellerRefuseReason) {
                this.sellerRefuseReason = sellerRefuseReason;
                return this;
            }

            /**
             * SubLmOrderId.
             */
            public Builder subLmOrderId(String subLmOrderId) {
                this.subLmOrderId = subLmOrderId;
                return this;
            }

            public RefundApplicationDetail build() {
                return new RefundApplicationDetail(this);
            } 

        } 

    }
}
