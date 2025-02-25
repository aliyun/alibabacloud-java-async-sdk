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
 * {@link TicketingResponseBody} extends {@link TeaModel}
 *
 * <p>TicketingResponseBody</p>
 */
public class TicketingResponseBody extends TeaModel {
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

    private TicketingResponseBody(Builder builder) {
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

    public static TicketingResponseBody create() {
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

        public TicketingResponseBody build() {
            return new TicketingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TicketingResponseBody} extends {@link TeaModel}
     *
     * <p>TicketingResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("order_num")
        private Long orderNum;

        @com.aliyun.core.annotation.NameInMap("transaction_no")
        private String transactionNo;

        private Data(Builder builder) {
            this.orderNum = builder.orderNum;
            this.transactionNo = builder.transactionNo;
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
         * @return transactionNo
         */
        public String getTransactionNo() {
            return this.transactionNo;
        }

        public static final class Builder {
            private Long orderNum; 
            private String transactionNo; 

            /**
             * <p>order number</p>
             * 
             * <strong>example:</strong>
             * <p>496***2617111</p>
             */
            public Builder orderNum(Long orderNum) {
                this.orderNum = orderNum;
                return this;
            }

            /**
             * <p>transaction serial number</p>
             * 
             * <strong>example:</strong>
             * <p>hkduendkd-2023-dj0</p>
             */
            public Builder transactionNo(String transactionNo) {
                this.transactionNo = transactionNo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
