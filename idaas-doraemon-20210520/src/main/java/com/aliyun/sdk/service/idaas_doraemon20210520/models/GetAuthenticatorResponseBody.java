// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.idaas_doraemon20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAuthenticatorResponseBody} extends {@link TeaModel}
 *
 * <p>GetAuthenticatorResponseBody</p>
 */
public class GetAuthenticatorResponseBody extends TeaModel {
    @NameInMap("Authenticator")
    private Authenticator authenticator;

    @NameInMap("RequestId")
    private String requestId;

    private GetAuthenticatorResponseBody(Builder builder) {
        this.authenticator = builder.authenticator;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuthenticatorResponseBody create() {
        return builder().build();
    }

    /**
     * @return authenticator
     */
    public Authenticator getAuthenticator() {
        return this.authenticator;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Authenticator authenticator; 
        private String requestId; 

        /**
         * Authenticator.
         */
        public Builder authenticator(Authenticator authenticator) {
            this.authenticator = authenticator;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAuthenticatorResponseBody build() {
            return new GetAuthenticatorResponseBody(this);
        } 

    } 

    public static class Authenticator extends TeaModel {
        @NameInMap("AuthenticatorName")
        private String authenticatorName;

        @NameInMap("AuthenticatorUuid")
        private String authenticatorUuid;

        @NameInMap("CredentialId")
        private String credentialId;

        @NameInMap("CustomAuthenticator")
        private String customAuthenticator;

        @NameInMap("LastVerifySourceIp")
        private String lastVerifySourceIp;

        @NameInMap("LastVerifyTime")
        private Long lastVerifyTime;

        @NameInMap("LastVerifyUserAgent")
        private String lastVerifyUserAgent;

        @NameInMap("RegisterSourceIp")
        private String registerSourceIp;

        @NameInMap("RegisterTime")
        private Long registerTime;

        @NameInMap("Type")
        private String type;

        private Authenticator(Builder builder) {
            this.authenticatorName = builder.authenticatorName;
            this.authenticatorUuid = builder.authenticatorUuid;
            this.credentialId = builder.credentialId;
            this.customAuthenticator = builder.customAuthenticator;
            this.lastVerifySourceIp = builder.lastVerifySourceIp;
            this.lastVerifyTime = builder.lastVerifyTime;
            this.lastVerifyUserAgent = builder.lastVerifyUserAgent;
            this.registerSourceIp = builder.registerSourceIp;
            this.registerTime = builder.registerTime;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Authenticator create() {
            return builder().build();
        }

        /**
         * @return authenticatorName
         */
        public String getAuthenticatorName() {
            return this.authenticatorName;
        }

        /**
         * @return authenticatorUuid
         */
        public String getAuthenticatorUuid() {
            return this.authenticatorUuid;
        }

        /**
         * @return credentialId
         */
        public String getCredentialId() {
            return this.credentialId;
        }

        /**
         * @return customAuthenticator
         */
        public String getCustomAuthenticator() {
            return this.customAuthenticator;
        }

        /**
         * @return lastVerifySourceIp
         */
        public String getLastVerifySourceIp() {
            return this.lastVerifySourceIp;
        }

        /**
         * @return lastVerifyTime
         */
        public Long getLastVerifyTime() {
            return this.lastVerifyTime;
        }

        /**
         * @return lastVerifyUserAgent
         */
        public String getLastVerifyUserAgent() {
            return this.lastVerifyUserAgent;
        }

        /**
         * @return registerSourceIp
         */
        public String getRegisterSourceIp() {
            return this.registerSourceIp;
        }

        /**
         * @return registerTime
         */
        public Long getRegisterTime() {
            return this.registerTime;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String authenticatorName; 
            private String authenticatorUuid; 
            private String credentialId; 
            private String customAuthenticator; 
            private String lastVerifySourceIp; 
            private Long lastVerifyTime; 
            private String lastVerifyUserAgent; 
            private String registerSourceIp; 
            private Long registerTime; 
            private String type; 

            /**
             * AuthenticatorName.
             */
            public Builder authenticatorName(String authenticatorName) {
                this.authenticatorName = authenticatorName;
                return this;
            }

            /**
             * AuthenticatorUuid.
             */
            public Builder authenticatorUuid(String authenticatorUuid) {
                this.authenticatorUuid = authenticatorUuid;
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
             * CustomAuthenticator.
             */
            public Builder customAuthenticator(String customAuthenticator) {
                this.customAuthenticator = customAuthenticator;
                return this;
            }

            /**
             * LastVerifySourceIp.
             */
            public Builder lastVerifySourceIp(String lastVerifySourceIp) {
                this.lastVerifySourceIp = lastVerifySourceIp;
                return this;
            }

            /**
             * LastVerifyTime.
             */
            public Builder lastVerifyTime(Long lastVerifyTime) {
                this.lastVerifyTime = lastVerifyTime;
                return this;
            }

            /**
             * LastVerifyUserAgent.
             */
            public Builder lastVerifyUserAgent(String lastVerifyUserAgent) {
                this.lastVerifyUserAgent = lastVerifyUserAgent;
                return this;
            }

            /**
             * RegisterSourceIp.
             */
            public Builder registerSourceIp(String registerSourceIp) {
                this.registerSourceIp = registerSourceIp;
                return this;
            }

            /**
             * RegisterTime.
             */
            public Builder registerTime(Long registerTime) {
                this.registerTime = registerTime;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Authenticator build() {
                return new Authenticator(this);
            } 

        } 

    }
}
