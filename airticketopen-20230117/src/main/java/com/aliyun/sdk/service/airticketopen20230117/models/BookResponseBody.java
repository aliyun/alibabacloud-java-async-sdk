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
 * {@link BookResponseBody} extends {@link TeaModel}
 *
 * <p>BookResponseBody</p>
 */
public class BookResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("error_code")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("error_data")
    private ErrorData errorData;

    @com.aliyun.core.annotation.NameInMap("error_msg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("status")
    private Integer status;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private BookResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorData = builder.errorData;
        this.errorMsg = builder.errorMsg;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BookResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return errorData
     */
    public ErrorData getErrorData() {
        return this.errorData;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Data data; 
        private String errorCode; 
        private ErrorData errorData; 
        private String errorMsg; 
        private Integer status; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(BookResponseBody model) {
            this.requestId = model.requestId;
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorData = model.errorData;
            this.errorMsg = model.errorMsg;
            this.status = model.status;
            this.success = model.success;
        } 

        /**
         * <p>request ID</p>
         * 
         * <strong>example:</strong>
         * <p>51593418-8C73-5E47-8BA8-3F1D4A00CC0B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>data</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>error code</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>error data</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder errorData(ErrorData errorData) {
            this.errorData = errorData;
            return this;
        }

        /**
         * <p>error message</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>http reqeust has been processed successfully，status code is 200</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * <p>true represents success, false represents failure</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public BookResponseBody build() {
            return new BookResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BookResponseBody} extends {@link TeaModel}
     *
     * <p>BookResponseBody</p>
     */
    public static class AbaPayLockRateInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("pay_intended_amount")
        private String payIntendedAmount;

        @com.aliyun.core.annotation.NameInMap("pay_intended_currency_code")
        private String payIntendedCurrencyCode;

        @com.aliyun.core.annotation.NameInMap("quotation_currency_code")
        private String quotationCurrencyCode;

        @com.aliyun.core.annotation.NameInMap("to_pay_currency_rate")
        private String toPayCurrencyRate;

        private AbaPayLockRateInfo(Builder builder) {
            this.payIntendedAmount = builder.payIntendedAmount;
            this.payIntendedCurrencyCode = builder.payIntendedCurrencyCode;
            this.quotationCurrencyCode = builder.quotationCurrencyCode;
            this.toPayCurrencyRate = builder.toPayCurrencyRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AbaPayLockRateInfo create() {
            return builder().build();
        }

        /**
         * @return payIntendedAmount
         */
        public String getPayIntendedAmount() {
            return this.payIntendedAmount;
        }

        /**
         * @return payIntendedCurrencyCode
         */
        public String getPayIntendedCurrencyCode() {
            return this.payIntendedCurrencyCode;
        }

        /**
         * @return quotationCurrencyCode
         */
        public String getQuotationCurrencyCode() {
            return this.quotationCurrencyCode;
        }

        /**
         * @return toPayCurrencyRate
         */
        public String getToPayCurrencyRate() {
            return this.toPayCurrencyRate;
        }

        public static final class Builder {
            private String payIntendedAmount; 
            private String payIntendedCurrencyCode; 
            private String quotationCurrencyCode; 
            private String toPayCurrencyRate; 

            private Builder() {
            } 

            private Builder(AbaPayLockRateInfo model) {
                this.payIntendedAmount = model.payIntendedAmount;
                this.payIntendedCurrencyCode = model.payIntendedCurrencyCode;
                this.quotationCurrencyCode = model.quotationCurrencyCode;
                this.toPayCurrencyRate = model.toPayCurrencyRate;
            } 

            /**
             * pay_intended_amount.
             */
            public Builder payIntendedAmount(String payIntendedAmount) {
                this.payIntendedAmount = payIntendedAmount;
                return this;
            }

            /**
             * pay_intended_currency_code.
             */
            public Builder payIntendedCurrencyCode(String payIntendedCurrencyCode) {
                this.payIntendedCurrencyCode = payIntendedCurrencyCode;
                return this;
            }

            /**
             * quotation_currency_code.
             */
            public Builder quotationCurrencyCode(String quotationCurrencyCode) {
                this.quotationCurrencyCode = quotationCurrencyCode;
                return this;
            }

            /**
             * to_pay_currency_rate.
             */
            public Builder toPayCurrencyRate(String toPayCurrencyRate) {
                this.toPayCurrencyRate = toPayCurrencyRate;
                return this;
            }

            public AbaPayLockRateInfo build() {
                return new AbaPayLockRateInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link BookResponseBody} extends {@link TeaModel}
     *
     * <p>BookResponseBody</p>
     */
    public static class OrderAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("aba_pay_lock_rate_info")
        private AbaPayLockRateInfo abaPayLockRateInfo;

        private OrderAttribute(Builder builder) {
            this.abaPayLockRateInfo = builder.abaPayLockRateInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderAttribute create() {
            return builder().build();
        }

        /**
         * @return abaPayLockRateInfo
         */
        public AbaPayLockRateInfo getAbaPayLockRateInfo() {
            return this.abaPayLockRateInfo;
        }

        public static final class Builder {
            private AbaPayLockRateInfo abaPayLockRateInfo; 

            private Builder() {
            } 

            private Builder(OrderAttribute model) {
                this.abaPayLockRateInfo = model.abaPayLockRateInfo;
            } 

            /**
             * aba_pay_lock_rate_info.
             */
            public Builder abaPayLockRateInfo(AbaPayLockRateInfo abaPayLockRateInfo) {
                this.abaPayLockRateInfo = abaPayLockRateInfo;
                return this;
            }

            public OrderAttribute build() {
                return new OrderAttribute(this);
            } 

        } 

    }
    /**
     * 
     * {@link BookResponseBody} extends {@link TeaModel}
     *
     * <p>BookResponseBody</p>
     */
    public static class OrderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("order_attribute")
        private OrderAttribute orderAttribute;

        @com.aliyun.core.annotation.NameInMap("order_num")
        private Long orderNum;

        private OrderList(Builder builder) {
            this.orderAttribute = builder.orderAttribute;
            this.orderNum = builder.orderNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderList create() {
            return builder().build();
        }

        /**
         * @return orderAttribute
         */
        public OrderAttribute getOrderAttribute() {
            return this.orderAttribute;
        }

        /**
         * @return orderNum
         */
        public Long getOrderNum() {
            return this.orderNum;
        }

        public static final class Builder {
            private OrderAttribute orderAttribute; 
            private Long orderNum; 

            private Builder() {
            } 

            private Builder(OrderList model) {
                this.orderAttribute = model.orderAttribute;
                this.orderNum = model.orderNum;
            } 

            /**
             * order_attribute.
             */
            public Builder orderAttribute(OrderAttribute orderAttribute) {
                this.orderAttribute = orderAttribute;
                return this;
            }

            /**
             * <p>order number</p>
             * 
             * <strong>example:</strong>
             * <p>4966***617111</p>
             */
            public Builder orderNum(Long orderNum) {
                this.orderNum = orderNum;
                return this;
            }

            public OrderList build() {
                return new OrderList(this);
            } 

        } 

    }
    /**
     * 
     * {@link BookResponseBody} extends {@link TeaModel}
     *
     * <p>BookResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("order_list")
        private java.util.List<OrderList> orderList;

        private Data(Builder builder) {
            this.orderList = builder.orderList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return orderList
         */
        public java.util.List<OrderList> getOrderList() {
            return this.orderList;
        }

        public static final class Builder {
            private java.util.List<OrderList> orderList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.orderList = model.orderList;
            } 

            /**
             * <p>order information list</p>
             */
            public Builder orderList(java.util.List<OrderList> orderList) {
                this.orderList = orderList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link BookResponseBody} extends {@link TeaModel}
     *
     * <p>BookResponseBody</p>
     */
    public static class OrderAttributeAbaPayLockRateInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("pay_intended_amount")
        private String payIntendedAmount;

        @com.aliyun.core.annotation.NameInMap("pay_intended_currency_code")
        private String payIntendedCurrencyCode;

        @com.aliyun.core.annotation.NameInMap("quotation_currency_code")
        private String quotationCurrencyCode;

        @com.aliyun.core.annotation.NameInMap("to_pay_currency_rate")
        private String toPayCurrencyRate;

        private OrderAttributeAbaPayLockRateInfo(Builder builder) {
            this.payIntendedAmount = builder.payIntendedAmount;
            this.payIntendedCurrencyCode = builder.payIntendedCurrencyCode;
            this.quotationCurrencyCode = builder.quotationCurrencyCode;
            this.toPayCurrencyRate = builder.toPayCurrencyRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderAttributeAbaPayLockRateInfo create() {
            return builder().build();
        }

        /**
         * @return payIntendedAmount
         */
        public String getPayIntendedAmount() {
            return this.payIntendedAmount;
        }

        /**
         * @return payIntendedCurrencyCode
         */
        public String getPayIntendedCurrencyCode() {
            return this.payIntendedCurrencyCode;
        }

        /**
         * @return quotationCurrencyCode
         */
        public String getQuotationCurrencyCode() {
            return this.quotationCurrencyCode;
        }

        /**
         * @return toPayCurrencyRate
         */
        public String getToPayCurrencyRate() {
            return this.toPayCurrencyRate;
        }

        public static final class Builder {
            private String payIntendedAmount; 
            private String payIntendedCurrencyCode; 
            private String quotationCurrencyCode; 
            private String toPayCurrencyRate; 

            private Builder() {
            } 

            private Builder(OrderAttributeAbaPayLockRateInfo model) {
                this.payIntendedAmount = model.payIntendedAmount;
                this.payIntendedCurrencyCode = model.payIntendedCurrencyCode;
                this.quotationCurrencyCode = model.quotationCurrencyCode;
                this.toPayCurrencyRate = model.toPayCurrencyRate;
            } 

            /**
             * pay_intended_amount.
             */
            public Builder payIntendedAmount(String payIntendedAmount) {
                this.payIntendedAmount = payIntendedAmount;
                return this;
            }

            /**
             * pay_intended_currency_code.
             */
            public Builder payIntendedCurrencyCode(String payIntendedCurrencyCode) {
                this.payIntendedCurrencyCode = payIntendedCurrencyCode;
                return this;
            }

            /**
             * quotation_currency_code.
             */
            public Builder quotationCurrencyCode(String quotationCurrencyCode) {
                this.quotationCurrencyCode = quotationCurrencyCode;
                return this;
            }

            /**
             * to_pay_currency_rate.
             */
            public Builder toPayCurrencyRate(String toPayCurrencyRate) {
                this.toPayCurrencyRate = toPayCurrencyRate;
                return this;
            }

            public OrderAttributeAbaPayLockRateInfo build() {
                return new OrderAttributeAbaPayLockRateInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link BookResponseBody} extends {@link TeaModel}
     *
     * <p>BookResponseBody</p>
     */
    public static class OrderListOrderAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("aba_pay_lock_rate_info")
        private OrderAttributeAbaPayLockRateInfo abaPayLockRateInfo;

        private OrderListOrderAttribute(Builder builder) {
            this.abaPayLockRateInfo = builder.abaPayLockRateInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderListOrderAttribute create() {
            return builder().build();
        }

        /**
         * @return abaPayLockRateInfo
         */
        public OrderAttributeAbaPayLockRateInfo getAbaPayLockRateInfo() {
            return this.abaPayLockRateInfo;
        }

        public static final class Builder {
            private OrderAttributeAbaPayLockRateInfo abaPayLockRateInfo; 

            private Builder() {
            } 

            private Builder(OrderListOrderAttribute model) {
                this.abaPayLockRateInfo = model.abaPayLockRateInfo;
            } 

            /**
             * aba_pay_lock_rate_info.
             */
            public Builder abaPayLockRateInfo(OrderAttributeAbaPayLockRateInfo abaPayLockRateInfo) {
                this.abaPayLockRateInfo = abaPayLockRateInfo;
                return this;
            }

            public OrderListOrderAttribute build() {
                return new OrderListOrderAttribute(this);
            } 

        } 

    }
    /**
     * 
     * {@link BookResponseBody} extends {@link TeaModel}
     *
     * <p>BookResponseBody</p>
     */
    public static class ErrorDataOrderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("order_attribute")
        private OrderListOrderAttribute orderAttribute;

        @com.aliyun.core.annotation.NameInMap("order_num")
        private Long orderNum;

        private ErrorDataOrderList(Builder builder) {
            this.orderAttribute = builder.orderAttribute;
            this.orderNum = builder.orderNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorDataOrderList create() {
            return builder().build();
        }

        /**
         * @return orderAttribute
         */
        public OrderListOrderAttribute getOrderAttribute() {
            return this.orderAttribute;
        }

        /**
         * @return orderNum
         */
        public Long getOrderNum() {
            return this.orderNum;
        }

        public static final class Builder {
            private OrderListOrderAttribute orderAttribute; 
            private Long orderNum; 

            private Builder() {
            } 

            private Builder(ErrorDataOrderList model) {
                this.orderAttribute = model.orderAttribute;
                this.orderNum = model.orderNum;
            } 

            /**
             * order_attribute.
             */
            public Builder orderAttribute(OrderListOrderAttribute orderAttribute) {
                this.orderAttribute = orderAttribute;
                return this;
            }

            /**
             * <p>order number</p>
             * 
             * <strong>example:</strong>
             * <p>4966***617111</p>
             */
            public Builder orderNum(Long orderNum) {
                this.orderNum = orderNum;
                return this;
            }

            public ErrorDataOrderList build() {
                return new ErrorDataOrderList(this);
            } 

        } 

    }
    /**
     * 
     * {@link BookResponseBody} extends {@link TeaModel}
     *
     * <p>BookResponseBody</p>
     */
    public static class ErrorData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("order_list")
        private java.util.List<ErrorDataOrderList> orderList;

        private ErrorData(Builder builder) {
            this.orderList = builder.orderList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorData create() {
            return builder().build();
        }

        /**
         * @return orderList
         */
        public java.util.List<ErrorDataOrderList> getOrderList() {
            return this.orderList;
        }

        public static final class Builder {
            private java.util.List<ErrorDataOrderList> orderList; 

            private Builder() {
            } 

            private Builder(ErrorData model) {
                this.orderList = model.orderList;
            } 

            /**
             * <p>order information list. When the same input parameters are used to repeat a Book, if the booking has already been successful, the order number will be returned.</p>
             */
            public Builder orderList(java.util.List<ErrorDataOrderList> orderList) {
                this.orderList = orderList;
                return this;
            }

            public ErrorData build() {
                return new ErrorData(this);
            } 

        } 

    }
}
