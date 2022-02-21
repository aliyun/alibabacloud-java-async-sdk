// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendMicroCommandResponseBody} extends {@link TeaModel}
 *
 * <p>SendMicroCommandResponseBody</p>
 */
public class SendMicroCommandResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private SendMicroCommandResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendMicroCommandResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SendMicroCommandResponseBody build() {
            return new SendMicroCommandResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CustomerInfo")
        private String customerInfo;

        @NameInMap("InvokeCmdId")
        private String invokeCmdId;

        @NameInMap("InvokeCreateTime")
        private String invokeCreateTime;

        private Data(Builder builder) {
            this.customerInfo = builder.customerInfo;
            this.invokeCmdId = builder.invokeCmdId;
            this.invokeCreateTime = builder.invokeCreateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return customerInfo
         */
        public String getCustomerInfo() {
            return this.customerInfo;
        }

        /**
         * @return invokeCmdId
         */
        public String getInvokeCmdId() {
            return this.invokeCmdId;
        }

        /**
         * @return invokeCreateTime
         */
        public String getInvokeCreateTime() {
            return this.invokeCreateTime;
        }

        public static final class Builder {
            private String customerInfo; 
            private String invokeCmdId; 
            private String invokeCreateTime; 

            /**
             * CustomerInfo.
             */
            public Builder customerInfo(String customerInfo) {
                this.customerInfo = customerInfo;
                return this;
            }

            /**
             * InvokeCmdId.
             */
            public Builder invokeCmdId(String invokeCmdId) {
                this.invokeCmdId = invokeCmdId;
                return this;
            }

            /**
             * InvokeCreateTime.
             */
            public Builder invokeCreateTime(String invokeCreateTime) {
                this.invokeCreateTime = invokeCreateTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
