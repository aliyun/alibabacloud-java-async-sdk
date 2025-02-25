// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SingleCallByTtsResponseBody} extends {@link TeaModel}
 *
 * <p>SingleCallByTtsResponseBody</p>
 */
public class SingleCallByTtsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CallId")
    private String callId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SingleCallByTtsResponseBody(Builder builder) {
        this.callId = builder.callId;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SingleCallByTtsResponseBody create() {
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
         * <p>The unique receipt ID of the call.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/393529.html">QueryCallDetailByCallId</a> operation to query the details of the call based on the receipt ID.</p>
         * 
         * <strong>example:</strong>
         * <p>116012354148^10281378****</p>
         */
        public Builder callId(String callId) {
            this.callId = callId;
            return this;
        }

        /**
         * <p>The response code.</p>
         * <ul>
         * <li>The value OK indicates that the request was successful.</li>
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
         * <p>D9CB3933-9FE3-4870-BA8E-2BEE91B69D23</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SingleCallByTtsResponseBody build() {
            return new SingleCallByTtsResponseBody(this);
        } 

    } 

}
