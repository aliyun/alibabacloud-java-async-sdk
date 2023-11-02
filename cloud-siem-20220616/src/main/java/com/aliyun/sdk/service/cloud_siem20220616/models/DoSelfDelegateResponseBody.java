// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DoSelfDelegateResponseBody} extends {@link TeaModel}
 *
 * <p>DoSelfDelegateResponseBody</p>
 */
public class DoSelfDelegateResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Boolean data;

    @NameInMap("DyCode")
    private String dyCode;

    @NameInMap("DyMessage")
    private String dyMessage;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DoSelfDelegateResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.dyCode = builder.dyCode;
        this.dyMessage = builder.dyMessage;
        this.errCode = builder.errCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DoSelfDelegateResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Boolean getData() {
        return this.data;
    }

    /**
     * @return dyCode
     */
    public String getDyCode() {
        return this.dyCode;
    }

    /**
     * @return dyMessage
     */
    public String getDyMessage() {
        return this.dyMessage;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
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
        private Integer code; 
        private Boolean data; 
        private String dyCode; 
        private String dyMessage; 
        private String errCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Boolean data) {
            this.data = data;
            return this;
        }

        /**
         * DyCode.
         */
        public Builder dyCode(String dyCode) {
            this.dyCode = dyCode;
            return this;
        }

        /**
         * DyMessage.
         */
        public Builder dyMessage(String dyMessage) {
            this.dyMessage = dyMessage;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
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

        public DoSelfDelegateResponseBody build() {
            return new DoSelfDelegateResponseBody(this);
        } 

    } 

}
