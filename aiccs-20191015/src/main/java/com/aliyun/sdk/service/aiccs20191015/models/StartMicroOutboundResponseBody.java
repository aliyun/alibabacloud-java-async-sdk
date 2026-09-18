// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link StartMicroOutboundResponseBody} extends {@link TeaModel}
 *
 * <p>StartMicroOutboundResponseBody</p>
 */
public class StartMicroOutboundResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CustomerInfo")
    private String customerInfo;

    @com.aliyun.core.annotation.NameInMap("InvokeCmdId")
    private String invokeCmdId;

    @com.aliyun.core.annotation.NameInMap("InvokeCreateTime")
    private String invokeCreateTime;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(StartMicroOutboundResponseBody model) {
            this.code = model.code;
            this.customerInfo = model.customerInfo;
            this.invokeCmdId = model.invokeCmdId;
            this.invokeCreateTime = model.invokeCreateTime;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Status code. A return value of 200 indicates that the request succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Customer information.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;caseId\&quot;:2323****}</p>
         */
        public Builder customerInfo(String customerInfo) {
            this.customerInfo = customerInfo;
            return this;
        }

        /**
         * <p>Command ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8883f165-4a0d-4da2-a2d2</p>
         */
        public Builder invokeCmdId(String invokeCmdId) {
            this.invokeCmdId = invokeCmdId;
            return this;
        }

        /**
         * <p>Creation Time</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-23 17:30:32.525</p>
         */
        public Builder invokeCreateTime(String invokeCreateTime) {
            this.invokeCreateTime = invokeCreateTime;
            return this;
        }

        /**
         * <p>Description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EE338D98-9BD3-4413-B165</p>
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
