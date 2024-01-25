// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateRamPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateRamPolicyResponseBody</p>
 */
public class GenerateRamPolicyResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PolicyDocument")
    private String policyDocument;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GenerateRamPolicyResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.policyDocument = builder.policyDocument;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateRamPolicyResponseBody create() {
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
     * @return policyDocument
     */
    public String getPolicyDocument() {
        return this.policyDocument;
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
        private String policyDocument; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code. The status code 200 indicates that the call is successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The message that is returned. If the call is successful, "successful" is returned. If the call fails, an error message is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The content of the policy.
         */
        public Builder policyDocument(String policyDocument) {
            this.policyDocument = policyDocument;
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
         * Indicates whether the call is successful.
         * <p>
         * 
         * *   true: The call is successful.
         * *   false: The call fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GenerateRamPolicyResponseBody build() {
            return new GenerateRamPolicyResponseBody(this);
        } 

    } 

}
