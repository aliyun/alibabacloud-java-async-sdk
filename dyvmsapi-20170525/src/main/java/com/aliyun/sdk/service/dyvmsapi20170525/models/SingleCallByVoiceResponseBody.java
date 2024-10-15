// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SingleCallByVoiceResponseBody} extends {@link TeaModel}
 *
 * <p>SingleCallByVoiceResponseBody</p>
 */
public class SingleCallByVoiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CallId")
    private String callId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SingleCallByVoiceResponseBody(Builder builder) {
        this.callId = builder.callId;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SingleCallByVoiceResponseBody create() {
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
         * <p>The unique receipt ID for the call.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/393529.html">QueryCallDetailByCallId</a> operation to query the details of the call.</p>
         * 
         * <strong>example:</strong>
         * <p>116004767703^102806****</p>
         */
        public Builder callId(String callId) {
            this.callId = callId;
            return this;
        }

        /**
         * <p>The response code.</p>
         * <ul>
         * <li>The value OK indicates that the request was successful.****</li>
         * <li>For more information about other response codes, see <a href="https://help.aliyun.com/document_detail/112502.html">API error codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E50FFA85-0B79-4421-A7BD-00B0A271966F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SingleCallByVoiceResponseBody build() {
            return new SingleCallByVoiceResponseBody(this);
        } 

    } 

}
