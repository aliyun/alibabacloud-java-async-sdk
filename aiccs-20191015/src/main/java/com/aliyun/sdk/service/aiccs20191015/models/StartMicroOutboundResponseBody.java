// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartMicroOutboundResponseBody} extends {@link TeaModel}
 *
 * <p>StartMicroOutboundResponseBody</p>
 */
public class StartMicroOutboundResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("CustomerInfo")
    private String customerInfo;

    @NameInMap("InvokeCmdId")
    private String invokeCmdId;

    @NameInMap("InvokeCreateTime")
    private String invokeCreateTime;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private StartMicroOutboundResponseBody(Builder builder) {
        this.code = builder.code;
        this.customerInfo = builder.customerInfo;
        this.invokeCmdId = builder.invokeCmdId;
        this.invokeCreateTime = builder.invokeCreateTime;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartMicroOutboundResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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

    public static final class Builder {
        private String code; 
        private String customerInfo; 
        private String invokeCmdId; 
        private String invokeCreateTime; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

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

        public StartMicroOutboundResponseBody build() {
            return new StartMicroOutboundResponseBody(this);
        } 

    } 

}
