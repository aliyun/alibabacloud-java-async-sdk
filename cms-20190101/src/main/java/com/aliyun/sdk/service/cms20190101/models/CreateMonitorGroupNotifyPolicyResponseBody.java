// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMonitorGroupNotifyPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMonitorGroupNotifyPolicyResponseBody</p>
 */
public class CreateMonitorGroupNotifyPolicyResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Integer result;

    @NameInMap("Success")
    private String success;

    private CreateMonitorGroupNotifyPolicyResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMonitorGroupNotifyPolicyResponseBody create() {
        return builder().build();
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

    /**
     * @return result
     */
    public Integer getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Integer result; 
        private String success; 

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The HTTP status code 200 indicates that the call succeeds.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of entries that are returned.
         */
        public Builder result(Integer result) {
            this.result = result;
            return this;
        }

        /**
         * Indicates whether the call succeeds. Valid values:
         * <p>
         * 
         * *   true: The call succeeds.
         * *   false: The call fails.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public CreateMonitorGroupNotifyPolicyResponseBody build() {
            return new CreateMonitorGroupNotifyPolicyResponseBody(this);
        } 

    } 

}
