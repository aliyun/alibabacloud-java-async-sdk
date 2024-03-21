// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStsByTaobaoUidResponseBody} extends {@link TeaModel}
 *
 * <p>GetStsByTaobaoUidResponseBody</p>
 */
public class GetStsByTaobaoUidResponseBody extends TeaModel {
    @NameInMap("AccessKeyId")
    private String accessKeyId;

    @NameInMap("AccessKeySecret")
    private String accessKeySecret;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("Expiration")
    private String expiration;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityToken")
    private String securityToken;

    @NameInMap("Success")
    private Boolean success;

    private GetStsByTaobaoUidResponseBody(Builder builder) {
        this.accessKeyId = builder.accessKeyId;
        this.accessKeySecret = builder.accessKeySecret;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.expiration = builder.expiration;
        this.requestId = builder.requestId;
        this.securityToken = builder.securityToken;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStsByTaobaoUidResponseBody create() {
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
     * @return expiration
     */
    public String getExpiration() {
        return this.expiration;
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

    public static final class Builder {
        private String accessKeyId; 
        private String accessKeySecret; 
        private String errorCode; 
        private String errorMessage; 
        private String expiration; 
        private String requestId; 
        private String securityToken; 
        private Boolean success; 

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
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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

        public GetStsByTaobaoUidResponseBody build() {
            return new GetStsByTaobaoUidResponseBody(this);
        } 

    } 

}
