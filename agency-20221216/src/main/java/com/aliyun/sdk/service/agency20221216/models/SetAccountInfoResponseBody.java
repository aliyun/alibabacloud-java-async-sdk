// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetAccountInfoResponseBody} extends {@link TeaModel}
 *
 * <p>SetAccountInfoResponseBody</p>
 */
public class SetAccountInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private SetAccountInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetAccountInfoResponseBody create() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Result Code:
         * <p>
         * *   200 OK
         * *   1109 System error
         * *   3030 Sub Account Nickname exceeds maximum length,  maximum length 150 bytes.
         * *   3031 Remark exceeds maximum length,  maximum length 3000 bytes.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message information
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Request ID, Alibaba Cloud will track errors with this.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Candidate Value: True/False, which indicates whether the current API call itself is successful. It does not guarantee the success of subsequent business operations.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SetAccountInfoResponseBody build() {
            return new SetAccountInfoResponseBody(this);
        } 

    } 

}
