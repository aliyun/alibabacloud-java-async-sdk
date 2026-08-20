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
 * {@link TicketQueryOrderResponseBody} extends {@link TeaModel}
 *
 * <p>TicketQueryOrderResponseBody</p>
 */
public class TicketQueryOrderResponseBody extends TeaModel {
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

    private TicketQueryOrderResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TicketQueryOrderResponseBody create() {
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

        private Builder(TicketQueryOrderResponseBody model) {
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

        public TicketQueryOrderResponseBody build() {
            return new TicketQueryOrderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TicketQueryOrderResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryOrderResponseBody</p>
     */
    public static class Order extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FundStatus")
        private Integer fundStatus;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("OrderStatus")
        private Integer orderStatus;

        private Order(Builder builder) {
            this.fundStatus = builder.fundStatus;
            this.orderId = builder.orderId;
            this.orderStatus = builder.orderStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Order create() {
            return builder().build();
        }

        /**
         * @return fundStatus
         */
        public Integer getFundStatus() {
            return this.fundStatus;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return orderStatus
         */
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public static final class Builder {
            private Integer fundStatus; 
            private String orderId; 
            private Integer orderStatus; 

            private Builder() {
            } 

            private Builder(Order model) {
                this.fundStatus = model.fundStatus;
                this.orderId = model.orderId;
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
             * OrderId.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * OrderStatus.
             */
            public Builder orderStatus(Integer orderStatus) {
                this.orderStatus = orderStatus;
                return this;
            }

            public Order build() {
                return new Order(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryOrderResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryOrderResponseBody</p>
     */
    public static class Vouchers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("TotalTimes")
        private Integer totalTimes;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Vouchers(Builder builder) {
            this.code = builder.code;
            this.totalTimes = builder.totalTimes;
            this.type = builder.type;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vouchers create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return totalTimes
         */
        public Integer getTotalTimes() {
            return this.totalTimes;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String code; 
            private Integer totalTimes; 
            private Integer type; 
            private String url; 

            private Builder() {
            } 

            private Builder(Vouchers model) {
                this.code = model.code;
                this.totalTimes = model.totalTimes;
                this.type = model.type;
                this.url = model.url;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * TotalTimes.
             */
            public Builder totalTimes(Integer totalTimes) {
                this.totalTimes = totalTimes;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Vouchers build() {
                return new Vouchers(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryOrderResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryOrderResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Order")
        private Order order;

        @com.aliyun.core.annotation.NameInMap("Vouchers")
        private java.util.List<Vouchers> vouchers;

        private Data(Builder builder) {
            this.order = builder.order;
            this.vouchers = builder.vouchers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return order
         */
        public Order getOrder() {
            return this.order;
        }

        /**
         * @return vouchers
         */
        public java.util.List<Vouchers> getVouchers() {
            return this.vouchers;
        }

        public static final class Builder {
            private Order order; 
            private java.util.List<Vouchers> vouchers; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.order = model.order;
                this.vouchers = model.vouchers;
            } 

            /**
             * Order.
             */
            public Builder order(Order order) {
                this.order = order;
                return this;
            }

            /**
             * Vouchers.
             */
            public Builder vouchers(java.util.List<Vouchers> vouchers) {
                this.vouchers = vouchers;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
