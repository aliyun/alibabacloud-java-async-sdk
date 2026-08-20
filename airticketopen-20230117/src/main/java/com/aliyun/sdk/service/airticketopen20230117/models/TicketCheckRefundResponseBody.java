// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

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
 * {@link TicketCheckRefundResponseBody} extends {@link TeaModel}
 *
 * <p>TicketCheckRefundResponseBody</p>
 */
public class TicketCheckRefundResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private TicketCheckRefundResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TicketCheckRefundResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMsg; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(TicketCheckRefundResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMsg = model.errorMsg;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public TicketCheckRefundResponseBody build() {
            return new TicketCheckRefundResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TicketCheckRefundResponseBody} extends {@link TeaModel}
     *
     * <p>TicketCheckRefundResponseBody</p>
     */
    public static class RefundAmount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private Long amount;

        @com.aliyun.core.annotation.NameInMap("CurrencyCode")
        private String currencyCode;

        private RefundAmount(Builder builder) {
            this.amount = builder.amount;
            this.currencyCode = builder.currencyCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundAmount create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Long getAmount() {
            return this.amount;
        }

        /**
         * @return currencyCode
         */
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        public static final class Builder {
            private Long amount; 
            private String currencyCode; 

            private Builder() {
            } 

            private Builder(RefundAmount model) {
                this.amount = model.amount;
                this.currencyCode = model.currencyCode;
            } 

            /**
             * Amount.
             */
            public Builder amount(Long amount) {
                this.amount = amount;
                return this;
            }

            /**
             * CurrencyCode.
             */
            public Builder currencyCode(String currencyCode) {
                this.currencyCode = currencyCode;
                return this;
            }

            public RefundAmount build() {
                return new RefundAmount(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketCheckRefundResponseBody} extends {@link TeaModel}
     *
     * <p>TicketCheckRefundResponseBody</p>
     */
    public static class From extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Anchor")
        private Integer anchor;

        @com.aliyun.core.annotation.NameInMap("FixedTime")
        private String fixedTime;

        @com.aliyun.core.annotation.NameInMap("OffsetDayOfTime")
        private String offsetDayOfTime;

        @com.aliyun.core.annotation.NameInMap("OffsetUnit")
        private Integer offsetUnit;

        @com.aliyun.core.annotation.NameInMap("OffsetValue")
        private Integer offsetValue;

        private From(Builder builder) {
            this.anchor = builder.anchor;
            this.fixedTime = builder.fixedTime;
            this.offsetDayOfTime = builder.offsetDayOfTime;
            this.offsetUnit = builder.offsetUnit;
            this.offsetValue = builder.offsetValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static From create() {
            return builder().build();
        }

        /**
         * @return anchor
         */
        public Integer getAnchor() {
            return this.anchor;
        }

        /**
         * @return fixedTime
         */
        public String getFixedTime() {
            return this.fixedTime;
        }

        /**
         * @return offsetDayOfTime
         */
        public String getOffsetDayOfTime() {
            return this.offsetDayOfTime;
        }

        /**
         * @return offsetUnit
         */
        public Integer getOffsetUnit() {
            return this.offsetUnit;
        }

        /**
         * @return offsetValue
         */
        public Integer getOffsetValue() {
            return this.offsetValue;
        }

        public static final class Builder {
            private Integer anchor; 
            private String fixedTime; 
            private String offsetDayOfTime; 
            private Integer offsetUnit; 
            private Integer offsetValue; 

            private Builder() {
            } 

            private Builder(From model) {
                this.anchor = model.anchor;
                this.fixedTime = model.fixedTime;
                this.offsetDayOfTime = model.offsetDayOfTime;
                this.offsetUnit = model.offsetUnit;
                this.offsetValue = model.offsetValue;
            } 

            /**
             * Anchor.
             */
            public Builder anchor(Integer anchor) {
                this.anchor = anchor;
                return this;
            }

            /**
             * FixedTime.
             */
            public Builder fixedTime(String fixedTime) {
                this.fixedTime = fixedTime;
                return this;
            }

            /**
             * OffsetDayOfTime.
             */
            public Builder offsetDayOfTime(String offsetDayOfTime) {
                this.offsetDayOfTime = offsetDayOfTime;
                return this;
            }

            /**
             * OffsetUnit.
             */
            public Builder offsetUnit(Integer offsetUnit) {
                this.offsetUnit = offsetUnit;
                return this;
            }

            /**
             * OffsetValue.
             */
            public Builder offsetValue(Integer offsetValue) {
                this.offsetValue = offsetValue;
                return this;
            }

            public From build() {
                return new From(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketCheckRefundResponseBody} extends {@link TeaModel}
     *
     * <p>TicketCheckRefundResponseBody</p>
     */
    public static class To extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Anchor")
        private Integer anchor;

        @com.aliyun.core.annotation.NameInMap("FixedTime")
        private String fixedTime;

        @com.aliyun.core.annotation.NameInMap("OffsetDayOfTime")
        private String offsetDayOfTime;

        @com.aliyun.core.annotation.NameInMap("OffsetUnit")
        private Integer offsetUnit;

        @com.aliyun.core.annotation.NameInMap("OffsetValue")
        private Integer offsetValue;

        private To(Builder builder) {
            this.anchor = builder.anchor;
            this.fixedTime = builder.fixedTime;
            this.offsetDayOfTime = builder.offsetDayOfTime;
            this.offsetUnit = builder.offsetUnit;
            this.offsetValue = builder.offsetValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static To create() {
            return builder().build();
        }

        /**
         * @return anchor
         */
        public Integer getAnchor() {
            return this.anchor;
        }

        /**
         * @return fixedTime
         */
        public String getFixedTime() {
            return this.fixedTime;
        }

        /**
         * @return offsetDayOfTime
         */
        public String getOffsetDayOfTime() {
            return this.offsetDayOfTime;
        }

        /**
         * @return offsetUnit
         */
        public Integer getOffsetUnit() {
            return this.offsetUnit;
        }

        /**
         * @return offsetValue
         */
        public Integer getOffsetValue() {
            return this.offsetValue;
        }

        public static final class Builder {
            private Integer anchor; 
            private String fixedTime; 
            private String offsetDayOfTime; 
            private Integer offsetUnit; 
            private Integer offsetValue; 

            private Builder() {
            } 

            private Builder(To model) {
                this.anchor = model.anchor;
                this.fixedTime = model.fixedTime;
                this.offsetDayOfTime = model.offsetDayOfTime;
                this.offsetUnit = model.offsetUnit;
                this.offsetValue = model.offsetValue;
            } 

            /**
             * Anchor.
             */
            public Builder anchor(Integer anchor) {
                this.anchor = anchor;
                return this;
            }

            /**
             * FixedTime.
             */
            public Builder fixedTime(String fixedTime) {
                this.fixedTime = fixedTime;
                return this;
            }

            /**
             * OffsetDayOfTime.
             */
            public Builder offsetDayOfTime(String offsetDayOfTime) {
                this.offsetDayOfTime = offsetDayOfTime;
                return this;
            }

            /**
             * OffsetUnit.
             */
            public Builder offsetUnit(Integer offsetUnit) {
                this.offsetUnit = offsetUnit;
                return this;
            }

            /**
             * OffsetValue.
             */
            public Builder offsetValue(Integer offsetValue) {
                this.offsetValue = offsetValue;
                return this;
            }

            public To build() {
                return new To(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketCheckRefundResponseBody} extends {@link TeaModel}
     *
     * <p>TicketCheckRefundResponseBody</p>
     */
    public static class RefundStageRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Fee")
        private Double fee;

        @com.aliyun.core.annotation.NameInMap("FeeBase")
        private Integer feeBase;

        @com.aliyun.core.annotation.NameInMap("FeeType")
        private Integer feeType;

        @com.aliyun.core.annotation.NameInMap("From")
        private From from;

        @com.aliyun.core.annotation.NameInMap("To")
        private To to;

        private RefundStageRules(Builder builder) {
            this.fee = builder.fee;
            this.feeBase = builder.feeBase;
            this.feeType = builder.feeType;
            this.from = builder.from;
            this.to = builder.to;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundStageRules create() {
            return builder().build();
        }

        /**
         * @return fee
         */
        public Double getFee() {
            return this.fee;
        }

        /**
         * @return feeBase
         */
        public Integer getFeeBase() {
            return this.feeBase;
        }

        /**
         * @return feeType
         */
        public Integer getFeeType() {
            return this.feeType;
        }

        /**
         * @return from
         */
        public From getFrom() {
            return this.from;
        }

        /**
         * @return to
         */
        public To getTo() {
            return this.to;
        }

        public static final class Builder {
            private Double fee; 
            private Integer feeBase; 
            private Integer feeType; 
            private From from; 
            private To to; 

            private Builder() {
            } 

            private Builder(RefundStageRules model) {
                this.fee = model.fee;
                this.feeBase = model.feeBase;
                this.feeType = model.feeType;
                this.from = model.from;
                this.to = model.to;
            } 

            /**
             * Fee.
             */
            public Builder fee(Double fee) {
                this.fee = fee;
                return this;
            }

            /**
             * FeeBase.
             */
            public Builder feeBase(Integer feeBase) {
                this.feeBase = feeBase;
                return this;
            }

            /**
             * FeeType.
             */
            public Builder feeType(Integer feeType) {
                this.feeType = feeType;
                return this;
            }

            /**
             * From.
             */
            public Builder from(From from) {
                this.from = from;
                return this;
            }

            /**
             * To.
             */
            public Builder to(To to) {
                this.to = to;
                return this;
            }

            public RefundStageRules build() {
                return new RefundStageRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketCheckRefundResponseBody} extends {@link TeaModel}
     *
     * <p>TicketCheckRefundResponseBody</p>
     */
    public static class RefundRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RefundStageRules")
        private java.util.List<RefundStageRules> refundStageRules;

        @com.aliyun.core.annotation.NameInMap("RefundType")
        private Integer refundType;

        private RefundRule(Builder builder) {
            this.refundStageRules = builder.refundStageRules;
            this.refundType = builder.refundType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundRule create() {
            return builder().build();
        }

        /**
         * @return refundStageRules
         */
        public java.util.List<RefundStageRules> getRefundStageRules() {
            return this.refundStageRules;
        }

        /**
         * @return refundType
         */
        public Integer getRefundType() {
            return this.refundType;
        }

        public static final class Builder {
            private java.util.List<RefundStageRules> refundStageRules; 
            private Integer refundType; 

            private Builder() {
            } 

            private Builder(RefundRule model) {
                this.refundStageRules = model.refundStageRules;
                this.refundType = model.refundType;
            } 

            /**
             * RefundStageRules.
             */
            public Builder refundStageRules(java.util.List<RefundStageRules> refundStageRules) {
                this.refundStageRules = refundStageRules;
                return this;
            }

            /**
             * RefundType.
             */
            public Builder refundType(Integer refundType) {
                this.refundType = refundType;
                return this;
            }

            public RefundRule build() {
                return new RefundRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketCheckRefundResponseBody} extends {@link TeaModel}
     *
     * <p>TicketCheckRefundResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanRefund")
        private Boolean canRefund;

        @com.aliyun.core.annotation.NameInMap("RefundAmount")
        private RefundAmount refundAmount;

        @com.aliyun.core.annotation.NameInMap("RefundRule")
        private RefundRule refundRule;

        private Data(Builder builder) {
            this.canRefund = builder.canRefund;
            this.refundAmount = builder.refundAmount;
            this.refundRule = builder.refundRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return canRefund
         */
        public Boolean getCanRefund() {
            return this.canRefund;
        }

        /**
         * @return refundAmount
         */
        public RefundAmount getRefundAmount() {
            return this.refundAmount;
        }

        /**
         * @return refundRule
         */
        public RefundRule getRefundRule() {
            return this.refundRule;
        }

        public static final class Builder {
            private Boolean canRefund; 
            private RefundAmount refundAmount; 
            private RefundRule refundRule; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.canRefund = model.canRefund;
                this.refundAmount = model.refundAmount;
                this.refundRule = model.refundRule;
            } 

            /**
             * CanRefund.
             */
            public Builder canRefund(Boolean canRefund) {
                this.canRefund = canRefund;
                return this;
            }

            /**
             * RefundAmount.
             */
            public Builder refundAmount(RefundAmount refundAmount) {
                this.refundAmount = refundAmount;
                return this;
            }

            /**
             * RefundRule.
             */
            public Builder refundRule(RefundRule refundRule) {
                this.refundRule = refundRule;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
