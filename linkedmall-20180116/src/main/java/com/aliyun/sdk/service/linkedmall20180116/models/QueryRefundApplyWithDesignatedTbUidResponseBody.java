// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRefundApplyWithDesignatedTbUidResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRefundApplyWithDesignatedTbUidResponseBody</p>
 */
public class QueryRefundApplyWithDesignatedTbUidResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("LogsId")
    private String logsId;

    @NameInMap("Message")
    private String message;

    @NameInMap("Model")
    private Model model;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SubCode")
    private String subCode;

    @NameInMap("SubMessage")
    private String subMessage;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    private QueryRefundApplyWithDesignatedTbUidResponseBody(Builder builder) {
        this.code = builder.code;
        this.logsId = builder.logsId;
        this.message = builder.message;
        this.model = builder.model;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.subCode = builder.subCode;
        this.subMessage = builder.subMessage;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRefundApplyWithDesignatedTbUidResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return logsId
     */
    public String getLogsId() {
        return this.logsId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public Model getModel() {
        return this.model;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subCode
     */
    public String getSubCode() {
        return this.subCode;
    }

    /**
     * @return subMessage
     */
    public String getSubMessage() {
        return this.subMessage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String logsId; 
        private String message; 
        private Model model; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private String subCode; 
        private String subMessage; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * LogsId.
         */
        public Builder logsId(String logsId) {
            this.logsId = logsId;
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
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
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
         * SubCode.
         */
        public Builder subCode(String subCode) {
            this.subCode = subCode;
            return this;
        }

        /**
         * SubMessage.
         */
        public Builder subMessage(String subMessage) {
            this.subMessage = subMessage;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryRefundApplyWithDesignatedTbUidResponseBody build() {
            return new QueryRefundApplyWithDesignatedTbUidResponseBody(this);
        } 

    } 

    public static class ApplyReasonText extends TeaModel {
        @NameInMap("ProofRequired")
        private Boolean proofRequired;

        @NameInMap("ReasonTextId")
        private Long reasonTextId;

        @NameInMap("ReasonTips")
        private String reasonTips;

        @NameInMap("RefundDescRequired")
        private Boolean refundDescRequired;

        private ApplyReasonText(Builder builder) {
            this.proofRequired = builder.proofRequired;
            this.reasonTextId = builder.reasonTextId;
            this.reasonTips = builder.reasonTips;
            this.refundDescRequired = builder.refundDescRequired;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplyReasonText create() {
            return builder().build();
        }

        /**
         * @return proofRequired
         */
        public Boolean getProofRequired() {
            return this.proofRequired;
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

        /**
         * @return refundDescRequired
         */
        public Boolean getRefundDescRequired() {
            return this.refundDescRequired;
        }

        public static final class Builder {
            private Boolean proofRequired; 
            private Long reasonTextId; 
            private String reasonTips; 
            private Boolean refundDescRequired; 

            /**
             * ProofRequired.
             */
            public Builder proofRequired(Boolean proofRequired) {
                this.proofRequired = proofRequired;
                return this;
            }

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

            /**
             * RefundDescRequired.
             */
            public Builder refundDescRequired(Boolean refundDescRequired) {
                this.refundDescRequired = refundDescRequired;
                return this;
            }

            public ApplyReasonText build() {
                return new ApplyReasonText(this);
            } 

        } 

    }
    public static class MaxRefundFeeData extends TeaModel {
        @NameInMap("MaxRefundFee")
        private Long maxRefundFee;

        @NameInMap("MinRefundFee")
        private Long minRefundFee;

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
             * MaxRefundFee.
             */
            public Builder maxRefundFee(Long maxRefundFee) {
                this.maxRefundFee = maxRefundFee;
                return this;
            }

            /**
             * MinRefundFee.
             */
            public Builder minRefundFee(Long minRefundFee) {
                this.minRefundFee = minRefundFee;
                return this;
            }

            public MaxRefundFeeData build() {
                return new MaxRefundFeeData(this);
            } 

        } 

    }
    public static class Model extends TeaModel {
        @NameInMap("ApplyDisputeDesc")
        private String applyDisputeDesc;

        @NameInMap("ApplyReasonText")
        private ApplyReasonText applyReasonText;

        @NameInMap("BizClaimType")
        private Integer bizClaimType;

        @NameInMap("DisputeCreateTime")
        private String disputeCreateTime;

        @NameInMap("DisputeDesc")
        private String disputeDesc;

        @NameInMap("DisputeEndTime")
        private String disputeEndTime;

        @NameInMap("DisputeId")
        private Long disputeId;

        @NameInMap("DisputeStatus")
        private Integer disputeStatus;

        @NameInMap("DisputeType")
        private Integer disputeType;

        @NameInMap("LmOrderId")
        private String lmOrderId;

        @NameInMap("MaxRefundFeeData")
        private MaxRefundFeeData maxRefundFeeData;

        @NameInMap("OrderLogisticsStatus")
        private Integer orderLogisticsStatus;

        @NameInMap("RealRefundFee")
        private Long realRefundFee;

        @NameInMap("RefundFee")
        private Long refundFee;

        @NameInMap("RefunderAddress")
        private String refunderAddress;

        @NameInMap("RefunderName")
        private String refunderName;

        @NameInMap("RefunderTel")
        private String refunderTel;

        @NameInMap("RefunderZipCode")
        private String refunderZipCode;

        @NameInMap("ReturnGoodCount")
        private Integer returnGoodCount;

        @NameInMap("ReturnGoodLogisticsStatus")
        private Integer returnGoodLogisticsStatus;

        @NameInMap("SellerAgreeMsg")
        private String sellerAgreeMsg;

        @NameInMap("SellerRefuseAgreementMessage")
        private String sellerRefuseAgreementMessage;

        @NameInMap("SellerRefuseReason")
        private String sellerRefuseReason;

        @NameInMap("SubLmOrderId")
        private String subLmOrderId;

        private Model(Builder builder) {
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

        public static Model create() {
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

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
