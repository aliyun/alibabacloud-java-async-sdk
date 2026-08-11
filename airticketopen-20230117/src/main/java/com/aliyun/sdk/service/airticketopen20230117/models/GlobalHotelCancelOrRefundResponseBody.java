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
 * {@link GlobalHotelCancelOrRefundResponseBody} extends {@link TeaModel}
 *
 * <p>GlobalHotelCancelOrRefundResponseBody</p>
 */
public class GlobalHotelCancelOrRefundResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("TracerId")
    private String tracerId;

    private GlobalHotelCancelOrRefundResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tracerId = builder.tracerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GlobalHotelCancelOrRefundResponseBody create() {
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

    /**
     * @return tracerId
     */
    public String getTracerId() {
        return this.tracerId;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMsg; 
        private String requestId; 
        private Boolean success; 
        private String tracerId; 

        private Builder() {
        } 

        private Builder(GlobalHotelCancelOrRefundResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMsg = model.errorMsg;
            this.requestId = model.requestId;
            this.success = model.success;
            this.tracerId = model.tracerId;
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

        /**
         * <p>TraceId</p>
         * 
         * <strong>example:</strong>
         * <p>TraceId</p>
         */
        public Builder tracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }

        public GlobalHotelCancelOrRefundResponseBody build() {
            return new GlobalHotelCancelOrRefundResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GlobalHotelCancelOrRefundResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelCancelOrRefundResponseBody</p>
     */
    public static class TotalPenaltyAmount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private String amount;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("TracerId")
        private String tracerId;

        private TotalPenaltyAmount(Builder builder) {
            this.amount = builder.amount;
            this.currency = builder.currency;
            this.tracerId = builder.tracerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalPenaltyAmount create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public String getAmount() {
            return this.amount;
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return tracerId
         */
        public String getTracerId() {
            return this.tracerId;
        }

        public static final class Builder {
            private String amount; 
            private String currency; 
            private String tracerId; 

            private Builder() {
            } 

            private Builder(TotalPenaltyAmount model) {
                this.amount = model.amount;
                this.currency = model.currency;
                this.tracerId = model.tracerId;
            } 

            /**
             * Amount.
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * Currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>TraceId</p>
             * 
             * <strong>example:</strong>
             * <p>TraceId</p>
             */
            public Builder tracerId(String tracerId) {
                this.tracerId = tracerId;
                return this;
            }

            public TotalPenaltyAmount build() {
                return new TotalPenaltyAmount(this);
            } 

        } 

    }
    /**
     * 
     * {@link GlobalHotelCancelOrRefundResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelCancelOrRefundResponseBody</p>
     */
    public static class TotalRefundAmount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private String amount;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("TracerId")
        private String tracerId;

        private TotalRefundAmount(Builder builder) {
            this.amount = builder.amount;
            this.currency = builder.currency;
            this.tracerId = builder.tracerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalRefundAmount create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public String getAmount() {
            return this.amount;
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return tracerId
         */
        public String getTracerId() {
            return this.tracerId;
        }

        public static final class Builder {
            private String amount; 
            private String currency; 
            private String tracerId; 

            private Builder() {
            } 

            private Builder(TotalRefundAmount model) {
                this.amount = model.amount;
                this.currency = model.currency;
                this.tracerId = model.tracerId;
            } 

            /**
             * Amount.
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * Currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>TraceId</p>
             * 
             * <strong>example:</strong>
             * <p>TraceId</p>
             */
            public Builder tracerId(String tracerId) {
                this.tracerId = tracerId;
                return this;
            }

            public TotalRefundAmount build() {
                return new TotalRefundAmount(this);
            } 

        } 

    }
    /**
     * 
     * {@link GlobalHotelCancelOrRefundResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelCancelOrRefundResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RefundOrderNo")
        private String refundOrderNo;

        @com.aliyun.core.annotation.NameInMap("TotalPenaltyAmount")
        private TotalPenaltyAmount totalPenaltyAmount;

        @com.aliyun.core.annotation.NameInMap("TotalRefundAmount")
        private TotalRefundAmount totalRefundAmount;

        @com.aliyun.core.annotation.NameInMap("TracerId")
        private String tracerId;

        private Data(Builder builder) {
            this.refundOrderNo = builder.refundOrderNo;
            this.totalPenaltyAmount = builder.totalPenaltyAmount;
            this.totalRefundAmount = builder.totalRefundAmount;
            this.tracerId = builder.tracerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return refundOrderNo
         */
        public String getRefundOrderNo() {
            return this.refundOrderNo;
        }

        /**
         * @return totalPenaltyAmount
         */
        public TotalPenaltyAmount getTotalPenaltyAmount() {
            return this.totalPenaltyAmount;
        }

        /**
         * @return totalRefundAmount
         */
        public TotalRefundAmount getTotalRefundAmount() {
            return this.totalRefundAmount;
        }

        /**
         * @return tracerId
         */
        public String getTracerId() {
            return this.tracerId;
        }

        public static final class Builder {
            private String refundOrderNo; 
            private TotalPenaltyAmount totalPenaltyAmount; 
            private TotalRefundAmount totalRefundAmount; 
            private String tracerId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.refundOrderNo = model.refundOrderNo;
                this.totalPenaltyAmount = model.totalPenaltyAmount;
                this.totalRefundAmount = model.totalRefundAmount;
                this.tracerId = model.tracerId;
            } 

            /**
             * RefundOrderNo.
             */
            public Builder refundOrderNo(String refundOrderNo) {
                this.refundOrderNo = refundOrderNo;
                return this;
            }

            /**
             * TotalPenaltyAmount.
             */
            public Builder totalPenaltyAmount(TotalPenaltyAmount totalPenaltyAmount) {
                this.totalPenaltyAmount = totalPenaltyAmount;
                return this;
            }

            /**
             * TotalRefundAmount.
             */
            public Builder totalRefundAmount(TotalRefundAmount totalRefundAmount) {
                this.totalRefundAmount = totalRefundAmount;
                return this;
            }

            /**
             * <p>TraceId</p>
             * 
             * <strong>example:</strong>
             * <p>TraceId</p>
             */
            public Builder tracerId(String tracerId) {
                this.tracerId = tracerId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
