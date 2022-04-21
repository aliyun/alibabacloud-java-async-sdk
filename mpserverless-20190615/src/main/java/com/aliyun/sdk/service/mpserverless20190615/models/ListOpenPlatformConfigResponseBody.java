// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOpenPlatformConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ListOpenPlatformConfigResponseBody</p>
 */
public class ListOpenPlatformConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecretList")
    private java.util.List < SecretList> secretList;

    private ListOpenPlatformConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.secretList = builder.secretList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOpenPlatformConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return secretList
     */
    public java.util.List < SecretList> getSecretList() {
        return this.secretList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SecretList> secretList; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SecretList.
         */
        public Builder secretList(java.util.List < SecretList> secretList) {
            this.secretList = secretList;
            return this;
        }

        public ListOpenPlatformConfigResponseBody build() {
            return new ListOpenPlatformConfigResponseBody(this);
        } 

    } 

    public static class SecretList extends TeaModel {
        @NameInMap("AppCert")
        private String appCert;

        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppSecret")
        private String appSecret;

        @NameInMap("Platform")
        private String platform;

        @NameInMap("PrivateKey")
        private String privateKey;

        @NameInMap("PublicCert")
        private String publicCert;

        @NameInMap("PublicKey")
        private String publicKey;

        @NameInMap("RootCert")
        private String rootCert;

        @NameInMap("SignMode")
        private String signMode;

        @NameInMap("SpaceId")
        private String spaceId;

        private SecretList(Builder builder) {
            this.appCert = builder.appCert;
            this.appId = builder.appId;
            this.appSecret = builder.appSecret;
            this.platform = builder.platform;
            this.privateKey = builder.privateKey;
            this.publicCert = builder.publicCert;
            this.publicKey = builder.publicKey;
            this.rootCert = builder.rootCert;
            this.signMode = builder.signMode;
            this.spaceId = builder.spaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecretList create() {
            return builder().build();
        }

        /**
         * @return appCert
         */
        public String getAppCert() {
            return this.appCert;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appSecret
         */
        public String getAppSecret() {
            return this.appSecret;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return privateKey
         */
        public String getPrivateKey() {
            return this.privateKey;
        }

        /**
         * @return publicCert
         */
        public String getPublicCert() {
            return this.publicCert;
        }

        /**
         * @return publicKey
         */
        public String getPublicKey() {
            return this.publicKey;
        }

        /**
         * @return rootCert
         */
        public String getRootCert() {
            return this.rootCert;
        }

        /**
         * @return signMode
         */
        public String getSignMode() {
            return this.signMode;
        }

        /**
         * @return spaceId
         */
        public String getSpaceId() {
            return this.spaceId;
        }

        public static final class Builder {
            private String appCert; 
            private String appId; 
            private String appSecret; 
            private String platform; 
            private String privateKey; 
            private String publicCert; 
            private String publicKey; 
            private String rootCert; 
            private String signMode; 
            private String spaceId; 

            /**
             * AppCert.
             */
            public Builder appCert(String appCert) {
                this.appCert = appCert;
                return this;
            }

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppSecret.
             */
            public Builder appSecret(String appSecret) {
                this.appSecret = appSecret;
                return this;
            }

            /**
             * Platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * PrivateKey.
             */
            public Builder privateKey(String privateKey) {
                this.privateKey = privateKey;
                return this;
            }

            /**
             * PublicCert.
             */
            public Builder publicCert(String publicCert) {
                this.publicCert = publicCert;
                return this;
            }

            /**
             * PublicKey.
             */
            public Builder publicKey(String publicKey) {
                this.publicKey = publicKey;
                return this;
            }

            /**
             * RootCert.
             */
            public Builder rootCert(String rootCert) {
                this.rootCert = rootCert;
                return this;
            }

            /**
             * SignMode.
             */
            public Builder signMode(String signMode) {
                this.signMode = signMode;
                return this;
            }

            /**
             * SpaceId.
             */
            public Builder spaceId(String spaceId) {
                this.spaceId = spaceId;
                return this;
            }

            public SecretList build() {
                return new SecretList(this);
            } 

        } 

    }
}
