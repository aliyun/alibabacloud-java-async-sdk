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
 * {@link LlmSmartCallResponseBody} extends {@link TeaModel}
 *
 * <p>LlmSmartCallResponseBody</p>
 */
public class LlmSmartCallResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CallId")
    private String callId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private LlmSmartCallResponseBody(Builder builder) {
        this.callId = builder.callId;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LlmSmartCallResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(LlmSmartCallResponseBody model) {
            this.callId = model.callId;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Unique receipt ID for this call.</p>
         * 
         * <strong>example:</strong>
         * <p>125165515<em><strong>^11195613</strong></em>*</p>
         */
        public Builder callId(String callId) {
            this.callId = callId;
            return this;
        }

        /**
         * <p>Request status code. A return value of &quot;OK&quot; indicates that the request succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>D6A51251-F7C4-596A-9F45-3C3219A5450D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public LlmSmartCallResponseBody build() {
            return new LlmSmartCallResponseBody(this);
        } 

    } 

}
