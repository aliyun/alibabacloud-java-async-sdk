// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20220531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InitApplyRefund4DistributionResponseBody} extends {@link TeaModel}
 *
 * <p>InitApplyRefund4DistributionResponseBody</p>
 */
public class InitApplyRefund4DistributionResponseBody extends TeaModel {
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

    private InitApplyRefund4DistributionResponseBody(Builder builder) {
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

    public static InitApplyRefund4DistributionResponseBody create() {
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
         * pageSize
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

        public InitApplyRefund4DistributionResponseBody build() {
            return new InitApplyRefund4DistributionResponseBody(this);
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
    public static class RefundReasonList extends TeaModel {
        @NameInMap("ProofRequired")
        private Boolean proofRequired;

        @NameInMap("ReasonTextId")
        private String reasonTextId;

        @NameInMap("ReasonTips")
        private String reasonTips;

        @NameInMap("RefundDescRequired")
        private Boolean refundDescRequired;

        private RefundReasonList(Builder builder) {
            this.proofRequired = builder.proofRequired;
            this.reasonTextId = builder.reasonTextId;
            this.reasonTips = builder.reasonTips;
            this.refundDescRequired = builder.refundDescRequired;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundReasonList create() {
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
        public String getReasonTextId() {
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
            private String reasonTextId; 
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
            public Builder reasonTextId(String reasonTextId) {
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

            public RefundReasonList build() {
                return new RefundReasonList(this);
            } 

        } 

    }
    public static class Model extends TeaModel {
        @NameInMap("BizClaimType")
        private Integer bizClaimType;

        @NameInMap("MainOrderRefund")
        private Boolean mainOrderRefund;

        @NameInMap("MaxRefundFeeData")
        private MaxRefundFeeData maxRefundFeeData;

        @NameInMap("RefundReasonList")
        private java.util.List < RefundReasonList> refundReasonList;

        @NameInMap("SubDistributionOrderId")
        private String subDistributionOrderId;

        private Model(Builder builder) {
            this.bizClaimType = builder.bizClaimType;
            this.mainOrderRefund = builder.mainOrderRefund;
            this.maxRefundFeeData = builder.maxRefundFeeData;
            this.refundReasonList = builder.refundReasonList;
            this.subDistributionOrderId = builder.subDistributionOrderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return bizClaimType
         */
        public Integer getBizClaimType() {
            return this.bizClaimType;
        }

        /**
         * @return mainOrderRefund
         */
        public Boolean getMainOrderRefund() {
            return this.mainOrderRefund;
        }

        /**
         * @return maxRefundFeeData
         */
        public MaxRefundFeeData getMaxRefundFeeData() {
            return this.maxRefundFeeData;
        }

        /**
         * @return refundReasonList
         */
        public java.util.List < RefundReasonList> getRefundReasonList() {
            return this.refundReasonList;
        }

        /**
         * @return subDistributionOrderId
         */
        public String getSubDistributionOrderId() {
            return this.subDistributionOrderId;
        }

        public static final class Builder {
            private Integer bizClaimType; 
            private Boolean mainOrderRefund; 
            private MaxRefundFeeData maxRefundFeeData; 
            private java.util.List < RefundReasonList> refundReasonList; 
            private String subDistributionOrderId; 

            /**
             * BizClaimType.
             */
            public Builder bizClaimType(Integer bizClaimType) {
                this.bizClaimType = bizClaimType;
                return this;
            }

            /**
             * MainOrderRefund.
             */
            public Builder mainOrderRefund(Boolean mainOrderRefund) {
                this.mainOrderRefund = mainOrderRefund;
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
             * RefundReasonList.
             */
            public Builder refundReasonList(java.util.List < RefundReasonList> refundReasonList) {
                this.refundReasonList = refundReasonList;
                return this;
            }

            /**
             * SubDistributionOrderId.
             */
            public Builder subDistributionOrderId(String subDistributionOrderId) {
                this.subDistributionOrderId = subDistributionOrderId;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
