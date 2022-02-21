// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAuthorizationTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GetAuthorizationTokenResponseBody</p>
 */
public class GetAuthorizationTokenResponseBody extends TeaModel {
    @NameInMap("AuthorizationToken")
    private String authorizationToken;

    @NameInMap("Code")
    private String code;

    @NameInMap("ExpireTime")
    private Long expireTime;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TempUsername")
    private String tempUsername;

    private GetAuthorizationTokenResponseBody(Builder builder) {
        this.authorizationToken = builder.authorizationToken;
        this.code = builder.code;
        this.expireTime = builder.expireTime;
        this.isSuccess = builder.isSuccess;
        this.requestId = builder.requestId;
        this.tempUsername = builder.tempUsername;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuthorizationTokenResponseBody create() {
        return builder().build();
    }

    /**
     * @return authorizationToken
     */
    public String getAuthorizationToken() {
        return this.authorizationToken;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return expireTime
     */
    public Long getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tempUsername
     */
    public String getTempUsername() {
        return this.tempUsername;
    }

    public static final class Builder {
        private String authorizationToken; 
        private String code; 
        private Long expireTime; 
        private Boolean isSuccess; 
        private String requestId; 
        private String tempUsername; 

        /**
         * AuthorizationToken.
         */
        public Builder authorizationToken(String authorizationToken) {
            this.authorizationToken = authorizationToken;
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
         * ExpireTime.
         */
        public Builder expireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * IsSuccess.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
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
         * TempUsername.
         */
        public Builder tempUsername(String tempUsername) {
            this.tempUsername = tempUsername;
            return this;
        }

        public GetAuthorizationTokenResponseBody build() {
            return new GetAuthorizationTokenResponseBody(this);
        } 

    } 

}
