// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPackageStorageCredentialResponseBody} extends {@link TeaModel}
 *
 * <p>GetPackageStorageCredentialResponseBody</p>
 */
public class GetPackageStorageCredentialResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Credential")
    private Credential credential;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private GetPackageStorageCredentialResponseBody(Builder builder) {
        this.code = builder.code;
        this.credential = builder.credential;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPackageStorageCredentialResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return credential
     */
    public Credential getCredential() {
        return this.credential;
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

    public static final class Builder {
        private Integer code; 
        private Credential credential; 
        private String message; 
        private String requestId; 

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The STS credential.
         */
        public Builder credential(Credential credential) {
            this.credential = credential;
            return this;
        }

        /**
         * The message that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPackageStorageCredentialResponseBody build() {
            return new GetPackageStorageCredentialResponseBody(this);
        } 

    } 

    public static class Credential extends TeaModel {
        @NameInMap("AccessKeyId")
        private String accessKeyId;

        @NameInMap("AccessKeySecret")
        private String accessKeySecret;

        @NameInMap("Bucket")
        private String bucket;

        @NameInMap("Expiration")
        private String expiration;

        @NameInMap("KeyPrefix")
        private String keyPrefix;

        @NameInMap("OssInternalEndpoint")
        private String ossInternalEndpoint;

        @NameInMap("OssPublicEndpoint")
        private String ossPublicEndpoint;

        @NameInMap("OssVpcEndpoint")
        private String ossVpcEndpoint;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SecurityToken")
        private String securityToken;

        private Credential(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.accessKeySecret = builder.accessKeySecret;
            this.bucket = builder.bucket;
            this.expiration = builder.expiration;
            this.keyPrefix = builder.keyPrefix;
            this.ossInternalEndpoint = builder.ossInternalEndpoint;
            this.ossPublicEndpoint = builder.ossPublicEndpoint;
            this.ossVpcEndpoint = builder.ossVpcEndpoint;
            this.regionId = builder.regionId;
            this.securityToken = builder.securityToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Credential create() {
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
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return expiration
         */
        public String getExpiration() {
            return this.expiration;
        }

        /**
         * @return keyPrefix
         */
        public String getKeyPrefix() {
            return this.keyPrefix;
        }

        /**
         * @return ossInternalEndpoint
         */
        public String getOssInternalEndpoint() {
            return this.ossInternalEndpoint;
        }

        /**
         * @return ossPublicEndpoint
         */
        public String getOssPublicEndpoint() {
            return this.ossPublicEndpoint;
        }

        /**
         * @return ossVpcEndpoint
         */
        public String getOssVpcEndpoint() {
            return this.ossVpcEndpoint;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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
            private String bucket; 
            private String expiration; 
            private String keyPrefix; 
            private String ossInternalEndpoint; 
            private String ossPublicEndpoint; 
            private String ossVpcEndpoint; 
            private String regionId; 
            private String securityToken; 

            /**
             * The AccessKey ID of your account.
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * The AccessKey secret of your account.
             */
            public Builder accessKeySecret(String accessKeySecret) {
                this.accessKeySecret = accessKeySecret;
                return this;
            }

            /**
             * The name of the OSS bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * The time when the STS credential expires. Example: 2019-11-10T07:20:19Z.
             */
            public Builder expiration(String expiration) {
                this.expiration = expiration;
                return this;
            }

            /**
             * The object key prefix in Object Storage Service (OSS).
             */
            public Builder keyPrefix(String keyPrefix) {
                this.keyPrefix = keyPrefix;
                return this;
            }

            /**
             * The private endpoint of OSS.
             */
            public Builder ossInternalEndpoint(String ossInternalEndpoint) {
                this.ossInternalEndpoint = ossInternalEndpoint;
                return this;
            }

            /**
             * The public endpoint of OSS.
             */
            public Builder ossPublicEndpoint(String ossPublicEndpoint) {
                this.ossPublicEndpoint = ossPublicEndpoint;
                return this;
            }

            /**
             * The VPC endpoint of OSS.
             */
            public Builder ossVpcEndpoint(String ossVpcEndpoint) {
                this.ossVpcEndpoint = ossVpcEndpoint;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The security token issued by STS.
             */
            public Builder securityToken(String securityToken) {
                this.securityToken = securityToken;
                return this;
            }

            public Credential build() {
                return new Credential(this);
            } 

        } 

    }
}
