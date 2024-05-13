// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InspectProxyAccessSecretResponseBody} extends {@link TeaModel}
 *
 * <p>InspectProxyAccessSecretResponseBody</p>
 */
public class InspectProxyAccessSecretResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessSecret")
    private String accessSecret;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private InspectProxyAccessSecretResponseBody(Builder builder) {
        this.accessSecret = builder.accessSecret;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InspectProxyAccessSecretResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessSecret
     */
    public String getAccessSecret() {
        return this.accessSecret;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private String accessSecret; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * The authorization password of the security protection agent.
         */
        public Builder accessSecret(String accessSecret) {
            this.accessSecret = accessSecret;
            return this;
        }

        /**
         * The error code returned to the query task.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message that is returned.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Indicates whether the call was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public InspectProxyAccessSecretResponseBody build() {
            return new InspectProxyAccessSecretResponseBody(this);
        } 

    } 

}
