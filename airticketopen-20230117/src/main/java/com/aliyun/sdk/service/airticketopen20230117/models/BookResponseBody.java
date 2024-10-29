// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

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
    public static class OrderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("order_num")
        private Long orderNum;

        private OrderList(Builder builder) {
            this.orderNum = builder.orderNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderList create() {
            return builder().build();
        }

        /**
         * @return orderNum
         */
        public Long getOrderNum() {
            return this.orderNum;
        }

        public static final class Builder {
            private Long orderNum; 

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
        private java.util.List < OrderList> orderList;

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
        public java.util.List < OrderList> getOrderList() {
            return this.orderList;
        }

        public static final class Builder {
            private java.util.List < OrderList> orderList; 

            /**
             * <p>order information list</p>
             */
            public Builder orderList(java.util.List < OrderList> orderList) {
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
    public static class ErrorDataOrderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("order_num")
        private Long orderNum;

        private ErrorDataOrderList(Builder builder) {
            this.orderNum = builder.orderNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorDataOrderList create() {
            return builder().build();
        }

        /**
         * @return orderNum
         */
        public Long getOrderNum() {
            return this.orderNum;
        }

        public static final class Builder {
            private Long orderNum; 

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
        private java.util.List < ErrorDataOrderList> orderList;

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
        public java.util.List < ErrorDataOrderList> getOrderList() {
            return this.orderList;
        }

        public static final class Builder {
            private java.util.List < ErrorDataOrderList> orderList; 

            /**
             * <p>order information list. When the same input parameters are used to repeat a Book, if the booking has already been successful, the order number will be returned.</p>
             */
            public Builder orderList(java.util.List < ErrorDataOrderList> orderList) {
                this.orderList = orderList;
                return this;
            }

            public ErrorData build() {
                return new ErrorData(this);
            } 

        } 

    }
}
