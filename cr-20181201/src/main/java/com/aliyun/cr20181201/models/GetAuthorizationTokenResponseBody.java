// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetAuthorizationTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GetAuthorizationTokenResponseBody</p>
 */
public class GetAuthorizationTokenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ExpireTime")
    private Long expireTime;

    @NameInMap("Code")
    private String code;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("TempUsername")
    private String tempUsername;

    @NameInMap("AuthorizationToken")
    private String authorizationToken;


    private GetAuthorizationTokenResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.expireTime = builder.expireTime;
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.tempUsername = builder.tempUsername;
        this.authorizationToken = builder.authorizationToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuthorizationTokenResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return expireTime
     */
    public Long getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return tempUsername
     */
    public String getTempUsername() {
        return this.tempUsername;
    }

    /**
     * @return authorizationToken
     */
    public String getAuthorizationToken() {
        return this.authorizationToken;
    }

    public static final class Builder {
        private String requestId; 
        private Long expireTime; 
        private String code; 
        private Boolean isSuccess; 
        private String tempUsername; 
        private String authorizationToken; 

        /**
         * <p>Request ID</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The timestamp when the temporary Token expires. Unit: ms.</p>
         */
        public Builder expireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>Return value</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Successful</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>The username used to log on to the Registry.</p>
         */
        public Builder tempUsername(String tempUsername) {
            this.tempUsername = tempUsername;
            return this;
        }

        /**
         * <p>The password used to log on to the Registry.</p>
         */
        public Builder authorizationToken(String authorizationToken) {
            this.authorizationToken = authorizationToken;
            return this;
        }

        public GetAuthorizationTokenResponseBody build() {
            return new GetAuthorizationTokenResponseBody(this);
        } 

    } 

}
