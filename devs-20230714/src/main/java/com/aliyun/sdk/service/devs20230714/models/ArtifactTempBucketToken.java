// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link ArtifactTempBucketToken} extends {@link TeaModel}
 *
 * <p>ArtifactTempBucketToken</p>
 */
public class ArtifactTempBucketToken extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("credentials")
    private Credentials credentials;

    @com.aliyun.core.annotation.NameInMap("ossBucketName")
    private String ossBucketName;

    @com.aliyun.core.annotation.NameInMap("ossObjectName")
    private String ossObjectName;

    @com.aliyun.core.annotation.NameInMap("ossRegion")
    private String ossRegion;

    private ArtifactTempBucketToken(Builder builder) {
        this.credentials = builder.credentials;
        this.ossBucketName = builder.ossBucketName;
        this.ossObjectName = builder.ossObjectName;
        this.ossRegion = builder.ossRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ArtifactTempBucketToken create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return credentials
     */
    public Credentials getCredentials() {
        return this.credentials;
    }

    /**
     * @return ossBucketName
     */
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    /**
     * @return ossObjectName
     */
    public String getOssObjectName() {
        return this.ossObjectName;
    }

    /**
     * @return ossRegion
     */
    public String getOssRegion() {
        return this.ossRegion;
    }

    public static final class Builder {
        private Credentials credentials; 
        private String ossBucketName; 
        private String ossObjectName; 
        private String ossRegion; 

        private Builder() {
        } 

        private Builder(ArtifactTempBucketToken model) {
            this.credentials = model.credentials;
            this.ossBucketName = model.ossBucketName;
            this.ossObjectName = model.ossObjectName;
            this.ossRegion = model.ossRegion;
        } 

        /**
         * credentials.
         */
        public Builder credentials(Credentials credentials) {
            this.credentials = credentials;
            return this;
        }

        /**
         * ossBucketName.
         */
        public Builder ossBucketName(String ossBucketName) {
            this.ossBucketName = ossBucketName;
            return this;
        }

        /**
         * ossObjectName.
         */
        public Builder ossObjectName(String ossObjectName) {
            this.ossObjectName = ossObjectName;
            return this;
        }

        /**
         * ossRegion.
         */
        public Builder ossRegion(String ossRegion) {
            this.ossRegion = ossRegion;
            return this;
        }

        public ArtifactTempBucketToken build() {
            return new ArtifactTempBucketToken(this);
        } 

    } 

    /**
     * 
     * {@link ArtifactTempBucketToken} extends {@link TeaModel}
     *
     * <p>ArtifactTempBucketToken</p>
     */
    public static class Credentials extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessKeyId")
        private String accessKeyId;

        @com.aliyun.core.annotation.NameInMap("accessKeySecret")
        private String accessKeySecret;

        @com.aliyun.core.annotation.NameInMap("securityToken")
        private String securityToken;

        private Credentials(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.accessKeySecret = builder.accessKeySecret;
            this.securityToken = builder.securityToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Credentials create() {
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
         * @return securityToken
         */
        public String getSecurityToken() {
            return this.securityToken;
        }

        public static final class Builder {
            private String accessKeyId; 
            private String accessKeySecret; 
            private String securityToken; 

            private Builder() {
            } 

            private Builder(Credentials model) {
                this.accessKeyId = model.accessKeyId;
                this.accessKeySecret = model.accessKeySecret;
                this.securityToken = model.securityToken;
            } 

            /**
             * accessKeyId.
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * accessKeySecret.
             */
            public Builder accessKeySecret(String accessKeySecret) {
                this.accessKeySecret = accessKeySecret;
                return this;
            }

            /**
             * securityToken.
             */
            public Builder securityToken(String securityToken) {
                this.securityToken = securityToken;
                return this;
            }

            public Credentials build() {
                return new Credentials(this);
            } 

        } 

    }
}
