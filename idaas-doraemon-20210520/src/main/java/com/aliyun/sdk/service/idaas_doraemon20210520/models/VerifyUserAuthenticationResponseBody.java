// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.idaas_doraemon20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyUserAuthenticationResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyUserAuthenticationResponseBody</p>
 */
public class VerifyUserAuthenticationResponseBody extends TeaModel {
    @NameInMap("AuthenticateResultInfo")
    private AuthenticateResultInfo authenticateResultInfo;

    @NameInMap("EtasSDKString")
    private String etasSDKString;

    @NameInMap("IdToken")
    private String idToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VerifyResult")
    private Boolean verifyResult;

    private VerifyUserAuthenticationResponseBody(Builder builder) {
        this.authenticateResultInfo = builder.authenticateResultInfo;
        this.etasSDKString = builder.etasSDKString;
        this.idToken = builder.idToken;
        this.requestId = builder.requestId;
        this.verifyResult = builder.verifyResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyUserAuthenticationResponseBody create() {
        return builder().build();
    }

    /**
     * @return authenticateResultInfo
     */
    public AuthenticateResultInfo getAuthenticateResultInfo() {
        return this.authenticateResultInfo;
    }

    /**
     * @return etasSDKString
     */
    public String getEtasSDKString() {
        return this.etasSDKString;
    }

    /**
     * @return idToken
     */
    public String getIdToken() {
        return this.idToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return verifyResult
     */
    public Boolean getVerifyResult() {
        return this.verifyResult;
    }

    public static final class Builder {
        private AuthenticateResultInfo authenticateResultInfo; 
        private String etasSDKString; 
        private String idToken; 
        private String requestId; 
        private Boolean verifyResult; 

        /**
         * AuthenticateResultInfo.
         */
        public Builder authenticateResultInfo(AuthenticateResultInfo authenticateResultInfo) {
            this.authenticateResultInfo = authenticateResultInfo;
            return this;
        }

        /**
         * EtasSDKString.
         */
        public Builder etasSDKString(String etasSDKString) {
            this.etasSDKString = etasSDKString;
            return this;
        }

        /**
         * IdToken.
         */
        public Builder idToken(String idToken) {
            this.idToken = idToken;
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
         * VerifyResult.
         */
        public Builder verifyResult(Boolean verifyResult) {
            this.verifyResult = verifyResult;
            return this;
        }

        public VerifyUserAuthenticationResponseBody build() {
            return new VerifyUserAuthenticationResponseBody(this);
        } 

    } 

    public static class AuthenticateResultInfo extends TeaModel {
        @NameInMap("BindHashBase64")
        private String bindHashBase64;

        @NameInMap("CredentialId")
        private String credentialId;

        @NameInMap("UserId")
        private String userId;

        private AuthenticateResultInfo(Builder builder) {
            this.bindHashBase64 = builder.bindHashBase64;
            this.credentialId = builder.credentialId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthenticateResultInfo create() {
            return builder().build();
        }

        /**
         * @return bindHashBase64
         */
        public String getBindHashBase64() {
            return this.bindHashBase64;
        }

        /**
         * @return credentialId
         */
        public String getCredentialId() {
            return this.credentialId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String bindHashBase64; 
            private String credentialId; 
            private String userId; 

            /**
             * BindHashBase64.
             */
            public Builder bindHashBase64(String bindHashBase64) {
                this.bindHashBase64 = bindHashBase64;
                return this;
            }

            /**
             * CredentialId.
             */
            public Builder credentialId(String credentialId) {
                this.credentialId = credentialId;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public AuthenticateResultInfo build() {
                return new AuthenticateResultInfo(this);
            } 

        } 

    }
}
