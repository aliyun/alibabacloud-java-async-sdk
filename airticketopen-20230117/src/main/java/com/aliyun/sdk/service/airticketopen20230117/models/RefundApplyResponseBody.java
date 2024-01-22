// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefundApplyResponseBody} extends {@link TeaModel}
 *
 * <p>RefundApplyResponseBody</p>
 */
public class RefundApplyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("data")
    private Data data;

    @NameInMap("error_code")
    private String errorCode;

    @NameInMap("error_data")
    private Object errorData;

    @NameInMap("error_msg")
    private String errorMsg;

    @NameInMap("status")
    private Integer status;

    @NameInMap("success")
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
         * 请求 RequestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * error_code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * error_data.
         */
        public Builder errorData(Object errorData) {
            this.errorData = errorData;
            return this;
        }

        /**
         * error_msg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * status.
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public RefundApplyResponseBody build() {
            return new RefundApplyResponseBody(this);
        } 

    } 

    public static class RefundPassengers extends TeaModel {
        @NameInMap("document")
        private String document;

        @NameInMap("first_name")
        private String firstName;

        @NameInMap("last_name")
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
             * document.
             */
            public Builder document(String document) {
                this.document = document;
                return this;
            }

            /**
             * first_name.
             */
            public Builder firstName(String firstName) {
                this.firstName = firstName;
                return this;
            }

            /**
             * last_name.
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
    public static class RefundResults extends TeaModel {
        @NameInMap("fail_reason")
        private String failReason;

        @NameInMap("refund_order_num")
        private Long refundOrderNum;

        @NameInMap("refund_passengers")
        private java.util.List < RefundPassengers> refundPassengers;

        @NameInMap("status")
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
        public java.util.List < RefundPassengers> getRefundPassengers() {
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
            private java.util.List < RefundPassengers> refundPassengers; 
            private Integer status; 

            /**
             * fail_reason.
             */
            public Builder failReason(String failReason) {
                this.failReason = failReason;
                return this;
            }

            /**
             * refund_order_num.
             */
            public Builder refundOrderNum(Long refundOrderNum) {
                this.refundOrderNum = refundOrderNum;
                return this;
            }

            /**
             * refund_passengers.
             */
            public Builder refundPassengers(java.util.List < RefundPassengers> refundPassengers) {
                this.refundPassengers = refundPassengers;
                return this;
            }

            /**
             * status.
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
    public static class Data extends TeaModel {
        @NameInMap("order_num")
        private Long orderNum;

        @NameInMap("refund_results")
        private java.util.List < RefundResults> refundResults;

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
        public java.util.List < RefundResults> getRefundResults() {
            return this.refundResults;
        }

        public static final class Builder {
            private Long orderNum; 
            private java.util.List < RefundResults> refundResults; 

            /**
             * order_num.
             */
            public Builder orderNum(Long orderNum) {
                this.orderNum = orderNum;
                return this;
            }

            /**
             * refund_results.
             */
            public Builder refundResults(java.util.List < RefundResults> refundResults) {
                this.refundResults = refundResults;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
