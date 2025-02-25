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
 * {@link RefundApplyResponseBody} extends {@link TeaModel}
 *
 * <p>RefundApplyResponseBody</p>
 */
public class RefundApplyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("error_code")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("error_data")
    private Object errorData;

    @com.aliyun.core.annotation.NameInMap("error_msg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("status")
    private Integer status;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private RefundApplyResponseBody(Builder builder) {
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

    public static RefundApplyResponseBody create() {
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
    public Object getErrorData() {
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
        private Object errorData; 
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
        public Builder errorData(Object errorData) {
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

        public RefundApplyResponseBody build() {
            return new RefundApplyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RefundApplyResponseBody} extends {@link TeaModel}
     *
     * <p>RefundApplyResponseBody</p>
     */
    public static class RefundPassengers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("document")
        private String document;

        @com.aliyun.core.annotation.NameInMap("first_name")
        private String firstName;

        @com.aliyun.core.annotation.NameInMap("last_name")
        private String lastName;

        private RefundPassengers(Builder builder) {
            this.document = builder.document;
            this.firstName = builder.firstName;
            this.lastName = builder.lastName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundPassengers create() {
            return builder().build();
        }

        /**
         * @return document
         */
        public String getDocument() {
            return this.document;
        }

        /**
         * @return firstName
         */
        public String getFirstName() {
            return this.firstName;
        }

        /**
         * @return lastName
         */
        public String getLastName() {
            return this.lastName;
        }

        public static final class Builder {
            private String document; 
            private String firstName; 
            private String lastName; 

            /**
             * <p>credential number</p>
             * 
             * <strong>example:</strong>
             * <p>411***********4411</p>
             */
            public Builder document(String document) {
                this.document = document;
                return this;
            }

            /**
             * <p>first name</p>
             * 
             * <strong>example:</strong>
             * <p>SAN</p>
             */
            public Builder firstName(String firstName) {
                this.firstName = firstName;
                return this;
            }

            /**
             * <p>last name</p>
             * 
             * <strong>example:</strong>
             * <p>ZHANG</p>
             */
            public Builder lastName(String lastName) {
                this.lastName = lastName;
                return this;
            }

            public RefundPassengers build() {
                return new RefundPassengers(this);
            } 

        } 

    }
    /**
     * 
     * {@link RefundApplyResponseBody} extends {@link TeaModel}
     *
     * <p>RefundApplyResponseBody</p>
     */
    public static class RefundResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fail_reason")
        private String failReason;

        @com.aliyun.core.annotation.NameInMap("refund_order_num")
        private Long refundOrderNum;

        @com.aliyun.core.annotation.NameInMap("refund_passengers")
        private java.util.List<RefundPassengers> refundPassengers;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        private RefundResults(Builder builder) {
            this.failReason = builder.failReason;
            this.refundOrderNum = builder.refundOrderNum;
            this.refundPassengers = builder.refundPassengers;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundResults create() {
            return builder().build();
        }

        /**
         * @return failReason
         */
        public String getFailReason() {
            return this.failReason;
        }

        /**
         * @return refundOrderNum
         */
        public Long getRefundOrderNum() {
            return this.refundOrderNum;
        }

        /**
         * @return refundPassengers
         */
        public java.util.List<RefundPassengers> getRefundPassengers() {
            return this.refundPassengers;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String failReason; 
            private Long refundOrderNum; 
            private java.util.List<RefundPassengers> refundPassengers; 
            private Integer status; 

            /**
             * <p>reason for refund application failure</p>
             * 
             * <strong>example:</strong>
             * <p>desc reason</p>
             */
            public Builder failReason(String failReason) {
                this.failReason = failReason;
                return this;
            }

            /**
             * <p>refund order number</p>
             * 
             * <strong>example:</strong>
             * <p>4966***617202</p>
             */
            public Builder refundOrderNum(Long refundOrderNum) {
                this.refundOrderNum = refundOrderNum;
                return this;
            }

            /**
             * <p>passengers of current refund order</p>
             */
            public Builder refundPassengers(java.util.List<RefundPassengers> refundPassengers) {
                this.refundPassengers = refundPassengers;
                return this;
            }

            /**
             * <p>refund order status </p>
             * <p>0: refund order created successfully</p>
             * <p>1: refund order creation failed</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public RefundResults build() {
                return new RefundResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link RefundApplyResponseBody} extends {@link TeaModel}
     *
     * <p>RefundApplyResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("order_num")
        private Long orderNum;

        @com.aliyun.core.annotation.NameInMap("refund_results")
        private java.util.List<RefundResults> refundResults;

        private Data(Builder builder) {
            this.orderNum = builder.orderNum;
            this.refundResults = builder.refundResults;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return orderNum
         */
        public Long getOrderNum() {
            return this.orderNum;
        }

        /**
         * @return refundResults
         */
        public java.util.List<RefundResults> getRefundResults() {
            return this.refundResults;
        }

        public static final class Builder {
            private Long orderNum; 
            private java.util.List<RefundResults> refundResults; 

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

            /**
             * <p>refund results</p>
             */
            public Builder refundResults(java.util.List<RefundResults> refundResults) {
                this.refundResults = refundResults;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
