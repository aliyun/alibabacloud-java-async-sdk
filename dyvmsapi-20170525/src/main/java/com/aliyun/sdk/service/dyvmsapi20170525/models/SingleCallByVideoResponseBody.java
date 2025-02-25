// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SingleCallByVideoResponseBody} extends {@link TeaModel}
 *
 * <p>SingleCallByVideoResponseBody</p>
 */
public class SingleCallByVideoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CallId")
    private String callId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SingleCallByVideoResponseBody(Builder builder) {
        this.callId = builder.callId;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SingleCallByVideoResponseBody create() {
        return builder().build();
    }

    /**
     * @return callId
     */
    public String getCallId() {
        return this.callId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
        private String callId; 
        private String code; 
        private String message; 
        private String requestId; 

        /**
         * CallId.
         */
        public Builder callId(String callId) {
            this.callId = callId;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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

        public SingleCallByVideoResponseBody build() {
            return new SingleCallByVideoResponseBody(this);
        } 

    } 

}
