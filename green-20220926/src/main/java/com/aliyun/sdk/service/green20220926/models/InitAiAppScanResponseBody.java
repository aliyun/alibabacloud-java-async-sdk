// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link InitAiAppScanResponseBody} extends {@link TeaModel}
 *
 * <p>InitAiAppScanResponseBody</p>
 */
public class InitAiAppScanResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthInfo")
    private AuthInfo authInfo;

    @com.aliyun.core.annotation.NameInMap("AuthInfoConfig")
    private java.util.Map<String, AuthInfoConfigValue> authInfoConfig;

    @com.aliyun.core.annotation.NameInMap("AuthStatus")
    private String authStatus;

    @com.aliyun.core.annotation.NameInMap("OpenStatus")
    private String openStatus;

    @com.aliyun.core.annotation.NameInMap("ReadyStatus")
    private String readyStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private InitAiAppScanResponseBody(Builder builder) {
        this.authInfo = builder.authInfo;
        this.authInfoConfig = builder.authInfoConfig;
        this.authStatus = builder.authStatus;
        this.openStatus = builder.openStatus;
        this.readyStatus = builder.readyStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitAiAppScanResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authInfo
     */
    public AuthInfo getAuthInfo() {
        return this.authInfo;
    }

    /**
     * @return authInfoConfig
     */
    public java.util.Map<String, AuthInfoConfigValue> getAuthInfoConfig() {
        return this.authInfoConfig;
    }

    /**
     * @return authStatus
     */
    public String getAuthStatus() {
        return this.authStatus;
    }

    /**
     * @return openStatus
     */
    public String getOpenStatus() {
        return this.openStatus;
    }

    /**
     * @return readyStatus
     */
    public String getReadyStatus() {
        return this.readyStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AuthInfo authInfo; 
        private java.util.Map<String, AuthInfoConfigValue> authInfoConfig; 
        private String authStatus; 
        private String openStatus; 
        private String readyStatus; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(InitAiAppScanResponseBody model) {
            this.authInfo = model.authInfo;
            this.authInfoConfig = model.authInfoConfig;
            this.authStatus = model.authStatus;
            this.openStatus = model.openStatus;
            this.readyStatus = model.readyStatus;
            this.requestId = model.requestId;
        } 

        /**
         * AuthInfo.
         */
        public Builder authInfo(AuthInfo authInfo) {
            this.authInfo = authInfo;
            return this;
        }

        /**
         * AuthInfoConfig.
         */
        public Builder authInfoConfig(java.util.Map<String, AuthInfoConfigValue> authInfoConfig) {
            this.authInfoConfig = authInfoConfig;
            return this;
        }

        /**
         * AuthStatus.
         */
        public Builder authStatus(String authStatus) {
            this.authStatus = authStatus;
            return this;
        }

        /**
         * OpenStatus.
         */
        public Builder openStatus(String openStatus) {
            this.openStatus = openStatus;
            return this;
        }

        /**
         * ReadyStatus.
         */
        public Builder readyStatus(String readyStatus) {
            this.readyStatus = readyStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public InitAiAppScanResponseBody build() {
            return new InitAiAppScanResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link InitAiAppScanResponseBody} extends {@link TeaModel}
     *
     * <p>InitAiAppScanResponseBody</p>
     */
    public static class AuthInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthToken")
        private String authToken;

        @com.aliyun.core.annotation.NameInMap("PrivateDomain")
        private String privateDomain;

        @com.aliyun.core.annotation.NameInMap("Project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("PublicDomain")
        private String publicDomain;

        private AuthInfo(Builder builder) {
            this.authToken = builder.authToken;
            this.privateDomain = builder.privateDomain;
            this.project = builder.project;
            this.publicDomain = builder.publicDomain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthInfo create() {
            return builder().build();
        }

        /**
         * @return authToken
         */
        public String getAuthToken() {
            return this.authToken;
        }

        /**
         * @return privateDomain
         */
        public String getPrivateDomain() {
            return this.privateDomain;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return publicDomain
         */
        public String getPublicDomain() {
            return this.publicDomain;
        }

        public static final class Builder {
            private String authToken; 
            private String privateDomain; 
            private String project; 
            private String publicDomain; 

            private Builder() {
            } 

            private Builder(AuthInfo model) {
                this.authToken = model.authToken;
                this.privateDomain = model.privateDomain;
                this.project = model.project;
                this.publicDomain = model.publicDomain;
            } 

            /**
             * AuthToken.
             */
            public Builder authToken(String authToken) {
                this.authToken = authToken;
                return this;
            }

            /**
             * PrivateDomain.
             */
            public Builder privateDomain(String privateDomain) {
                this.privateDomain = privateDomain;
                return this;
            }

            /**
             * Project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * PublicDomain.
             */
            public Builder publicDomain(String publicDomain) {
                this.publicDomain = publicDomain;
                return this;
            }

            public AuthInfo build() {
                return new AuthInfo(this);
            } 

        } 

    }
}
