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
 * {@link TicketQueryRefundOrderResponseBody} extends {@link TeaModel}
 *
 * <p>TicketQueryRefundOrderResponseBody</p>
 */
public class TicketQueryRefundOrderResponseBody extends TeaModel {
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

    private TicketQueryRefundOrderResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TicketQueryRefundOrderResponseBody create() {
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

        private Builder(TicketQueryRefundOrderResponseBody model) {
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

        public TicketQueryRefundOrderResponseBody build() {
            return new TicketQueryRefundOrderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TicketQueryRefundOrderResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryRefundOrderResponseBody</p>
     */
    public static class RefundOrders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FundStatus")
        private Integer fundStatus;

        @com.aliyun.core.annotation.NameInMap("OrderStatus")
        private Integer orderStatus;

        private RefundOrders(Builder builder) {
            this.fundStatus = builder.fundStatus;
            this.orderStatus = builder.orderStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundOrders create() {
            return builder().build();
        }

        /**
         * @return fundStatus
         */
        public Integer getFundStatus() {
            return this.fundStatus;
        }

        /**
         * @return orderStatus
         */
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public static final class Builder {
            private Integer fundStatus; 
            private Integer orderStatus; 

            private Builder() {
            } 

            private Builder(RefundOrders model) {
                this.fundStatus = model.fundStatus;
                this.orderStatus = model.orderStatus;
            } 

            /**
             * FundStatus.
             */
            public Builder fundStatus(Integer fundStatus) {
                this.fundStatus = fundStatus;
                return this;
            }

            /**
             * OrderStatus.
             */
            public Builder orderStatus(Integer orderStatus) {
                this.orderStatus = orderStatus;
                return this;
            }

            public RefundOrders build() {
                return new RefundOrders(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryRefundOrderResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryRefundOrderResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RefundOrders")
        private java.util.List<RefundOrders> refundOrders;

        private Data(Builder builder) {
            this.refundOrders = builder.refundOrders;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return refundOrders
         */
        public java.util.List<RefundOrders> getRefundOrders() {
            return this.refundOrders;
        }

        public static final class Builder {
            private java.util.List<RefundOrders> refundOrders; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.refundOrders = model.refundOrders;
            } 

            /**
             * RefundOrders.
             */
            public Builder refundOrders(java.util.List<RefundOrders> refundOrders) {
                this.refundOrders = refundOrders;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
