// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateStsTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateStsTokenResponseBody</p>
 */
public class GenerateStsTokenResponseBody extends TeaModel {
    @NameInMap("AccessKeyId")
    private String accessKeyId;

    @NameInMap("AccessKeySecret")
    private String accessKeySecret;

    @NameInMap("Code")
    private String code;

    @NameInMap("Environment")
    private String environment;

    @NameInMap("Expiration")
    private String expiration;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityToken")
    private String securityToken;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("SupportBundleTarget")
    private String supportBundleTarget;

    private GenerateStsTokenResponseBody(Builder builder) {
        this.accessKeyId = builder.accessKeyId;
        this.accessKeySecret = builder.accessKeySecret;
        this.code = builder.code;
        this.environment = builder.environment;
        this.expiration = builder.expiration;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.securityToken = builder.securityToken;
        this.success = builder.success;
        this.supportBundleTarget = builder.supportBundleTarget;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateStsTokenResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessKeyId
     */
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * @return accessKeySecret
     */
    public String getAccessKeySecret() {
        return this.accessKeySecret;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return environment
     */
    public String getEnvironment() {
        return this.environment;
    }

    /**
     * @return expiration
     */
    public String getExpiration() {
        return this.expiration;
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return supportBundleTarget
     */
    public String getSupportBundleTarget() {
        return this.supportBundleTarget;
    }

    public static final class Builder {
        private String accessKeyId; 
        private String accessKeySecret; 
        private String code; 
        private String environment; 
        private String expiration; 
        private String message; 
        private String requestId; 
        private String securityToken; 
        private Boolean success; 
        private String supportBundleTarget; 

        /**
         * AccessKeyId.
         */
        public Builder accessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }

        /**
         * AccessKeySecret.
         */
        public Builder accessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
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
         * Environment.
         */
        public Builder environment(String environment) {
            this.environment = environment;
            return this;
        }

        /**
         * Expiration.
         */
        public Builder expiration(String expiration) {
            this.expiration = expiration;
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * SupportBundleTarget.
         */
        public Builder supportBundleTarget(String supportBundleTarget) {
            this.supportBundleTarget = supportBundleTarget;
            return this;
        }

        public GenerateStsTokenResponseBody build() {
            return new GenerateStsTokenResponseBody(this);
        } 

    } 

}
