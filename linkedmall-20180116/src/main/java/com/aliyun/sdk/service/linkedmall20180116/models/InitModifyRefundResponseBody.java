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
 * {@link InitModifyRefundResponseBody} extends {@link TeaModel}
 *
 * <p>InitModifyRefundResponseBody</p>
 */
public class InitModifyRefundResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("InitApplyRefundData")
    private InitApplyRefundData initApplyRefundData;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubLmOrderId")
    private String subLmOrderId;

    private InitModifyRefundResponseBody(Builder builder) {
        this.code = builder.code;
        this.initApplyRefundData = builder.initApplyRefundData;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.subLmOrderId = builder.subLmOrderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitModifyRefundResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return initApplyRefundData
     */
    public InitApplyRefundData getInitApplyRefundData() {
        return this.initApplyRefundData;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subLmOrderId
     */
    public String getSubLmOrderId() {
        return this.subLmOrderId;
    }

    public static final class Builder {
        private String code; 
        private InitApplyRefundData initApplyRefundData; 
        private String message; 
        private String requestId; 
        private String subLmOrderId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * InitApplyRefundData.
         */
        public Builder initApplyRefundData(InitApplyRefundData initApplyRefundData) {
            this.initApplyRefundData = initApplyRefundData;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SubLmOrderId.
         */
        public Builder subLmOrderId(String subLmOrderId) {
            this.subLmOrderId = subLmOrderId;
            return this;
        }

        public InitModifyRefundResponseBody build() {
            return new InitModifyRefundResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link InitModifyRefundResponseBody} extends {@link TeaModel}
     *
     * <p>InitModifyRefundResponseBody</p>
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
     * {@link InitModifyRefundResponseBody} extends {@link TeaModel}
     *
     * <p>InitModifyRefundResponseBody</p>
     */
    public static class RefundReasonList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProofRequired")
        private Boolean proofRequired;

        @com.aliyun.core.annotation.NameInMap("ReasonTextId")
        private Long reasonTextId;

        @com.aliyun.core.annotation.NameInMap("ReasonTips")
        private String reasonTips;

        @com.aliyun.core.annotation.NameInMap("RefundDescRequired")
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

            public RefundReasonList build() {
                return new RefundReasonList(this);
            } 

        } 

    }
    /**
     * 
     * {@link InitModifyRefundResponseBody} extends {@link TeaModel}
     *
     * <p>InitModifyRefundResponseBody</p>
     */
    public static class InitApplyRefundDataRefundReasonList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RefundReasonList")
        private java.util.List<RefundReasonList> refundReasonList;

        private InitApplyRefundDataRefundReasonList(Builder builder) {
            this.refundReasonList = builder.refundReasonList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitApplyRefundDataRefundReasonList create() {
            return builder().build();
        }

        /**
         * @return refundReasonList
         */
        public java.util.List<RefundReasonList> getRefundReasonList() {
            return this.refundReasonList;
        }

        public static final class Builder {
            private java.util.List<RefundReasonList> refundReasonList; 

            /**
             * RefundReasonList.
             */
            public Builder refundReasonList(java.util.List<RefundReasonList> refundReasonList) {
                this.refundReasonList = refundReasonList;
                return this;
            }

            public InitApplyRefundDataRefundReasonList build() {
                return new InitApplyRefundDataRefundReasonList(this);
            } 

        } 

    }
    /**
     * 
     * {@link InitModifyRefundResponseBody} extends {@link TeaModel}
     *
     * <p>InitModifyRefundResponseBody</p>
     */
    public static class InitApplyRefundData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizClaimType")
        private Integer bizClaimType;

        @com.aliyun.core.annotation.NameInMap("MainOrderRefund")
        private Boolean mainOrderRefund;

        @com.aliyun.core.annotation.NameInMap("MaxRefundFeeData")
        private MaxRefundFeeData maxRefundFeeData;

        @com.aliyun.core.annotation.NameInMap("RefundReasonList")
        private InitApplyRefundDataRefundReasonList refundReasonList;

        private InitApplyRefundData(Builder builder) {
            this.bizClaimType = builder.bizClaimType;
            this.mainOrderRefund = builder.mainOrderRefund;
            this.maxRefundFeeData = builder.maxRefundFeeData;
            this.refundReasonList = builder.refundReasonList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InitApplyRefundData create() {
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
        public InitApplyRefundDataRefundReasonList getRefundReasonList() {
            return this.refundReasonList;
        }

        public static final class Builder {
            private Integer bizClaimType; 
            private Boolean mainOrderRefund; 
            private MaxRefundFeeData maxRefundFeeData; 
            private InitApplyRefundDataRefundReasonList refundReasonList; 

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
            public Builder refundReasonList(InitApplyRefundDataRefundReasonList refundReasonList) {
                this.refundReasonList = refundReasonList;
                return this;
            }

            public InitApplyRefundData build() {
                return new InitApplyRefundData(this);
            } 

        } 

    }
}
