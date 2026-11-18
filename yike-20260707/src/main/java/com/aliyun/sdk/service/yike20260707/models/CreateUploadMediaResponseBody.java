// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link CreateUploadMediaResponseBody} extends {@link TeaModel}
 *
 * <p>CreateUploadMediaResponseBody</p>
 */
public class CreateUploadMediaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FileURL")
    private String fileURL;

    @com.aliyun.core.annotation.NameInMap("MediaId")
    private String mediaId;

    @com.aliyun.core.annotation.NameInMap("ObjectKey")
    private String objectKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StorageLocation")
    private String storageLocation;

    @com.aliyun.core.annotation.NameInMap("TicketExpiration")
    private String ticketExpiration;

    @com.aliyun.core.annotation.NameInMap("UploadCredentials")
    private UploadCredentials uploadCredentials;

    @com.aliyun.core.annotation.NameInMap("UploadTicket")
    private String uploadTicket;

    private CreateUploadMediaResponseBody(Builder builder) {
        this.fileURL = builder.fileURL;
        this.mediaId = builder.mediaId;
        this.objectKey = builder.objectKey;
        this.requestId = builder.requestId;
        this.storageLocation = builder.storageLocation;
        this.ticketExpiration = builder.ticketExpiration;
        this.uploadCredentials = builder.uploadCredentials;
        this.uploadTicket = builder.uploadTicket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUploadMediaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileURL
     */
    public String getFileURL() {
        return this.fileURL;
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return objectKey
     */
    public String getObjectKey() {
        return this.objectKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return storageLocation
     */
    public String getStorageLocation() {
        return this.storageLocation;
    }

    /**
     * @return ticketExpiration
     */
    public String getTicketExpiration() {
        return this.ticketExpiration;
    }

    /**
     * @return uploadCredentials
     */
    public UploadCredentials getUploadCredentials() {
        return this.uploadCredentials;
    }

    /**
     * @return uploadTicket
     */
    public String getUploadTicket() {
        return this.uploadTicket;
    }

    public static final class Builder {
        private String fileURL; 
        private String mediaId; 
        private String objectKey; 
        private String requestId; 
        private String storageLocation; 
        private String ticketExpiration; 
        private UploadCredentials uploadCredentials; 
        private String uploadTicket; 

        private Builder() {
        } 

        private Builder(CreateUploadMediaResponseBody model) {
            this.fileURL = model.fileURL;
            this.mediaId = model.mediaId;
            this.objectKey = model.objectKey;
            this.requestId = model.requestId;
            this.storageLocation = model.storageLocation;
            this.ticketExpiration = model.ticketExpiration;
            this.uploadCredentials = model.uploadCredentials;
            this.uploadTicket = model.uploadTicket;
        } 

        /**
         * <p>The unsigned OSS URL of the file. The format is <code>oss://bucket/objectKey</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://yike-shared-ap-southeast-1-1/yike-v1/gi3dkn-gi3dkn/2026-11-18/08/video/b7e94fc0e1bf71f1bfa2f6e7c5486601aB3xYz01.mp4</p>
         */
        public Builder fileURL(String fileURL) {
            this.fileURL = fileURL;
            return this;
        }

        /**
         * <p>The media asset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>b7e94fc0e*****6e7c5486601</p>
         */
        public Builder mediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }

        /**
         * <p>The OSS object key. The format is <code>yike-v1/uid segment-ws segment/date/hour/type/mediaId+random string+source suffix.file name extension</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>yike-v1/gi3dkn-gi3dkn/2026-11-18/08/video/b7e94fc0e1bf71f1bfa2f6e7c5486601aB3xYz01.mp4</p>
         */
        public Builder objectKey(String objectKey) {
            this.objectKey = objectKey;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9B4C2E10-3F5A-4D6B-8C7D-1E2F3A4B5C6D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The storage location identifier. The format is <code>bucket.endpoint</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>yike-shared-ap-southeast-1-1.oss-ap-southeast-1.aliyuncs.com</p>
         */
        public Builder storageLocation(String storageLocation) {
            this.storageLocation = storageLocation;
            return this;
        }

        /**
         * <p>The expiration time of the ticket. The time is in UTC and follows the ISO 8601 standard. This field is returned when UPLOAD_TICKET is used.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-18T12:00:00Z</p>
         */
        public Builder ticketExpiration(String ticketExpiration) {
            this.ticketExpiration = ticketExpiration;
            return this;
        }

        /**
         * <p>The upload credentials. Some fields may be empty depending on the <code>CredentialType</code>.</p>
         */
        public Builder uploadCredentials(UploadCredentials uploadCredentials) {
            this.uploadCredentials = uploadCredentials;
            return this;
        }

        /**
         * <p>The upload ticket. This field is returned when UPLOAD_TICKET is used. The ticket is a 27-character string in the format of UT1+region code+random string+check digit. A real credential is issued based on this ticket during a ticket exchange.</p>
         * 
         * <strong>example:</strong>
         * <p>UT1SGK7M2QX9R4T6V8W0Y3Z5ABC</p>
         */
        public Builder uploadTicket(String uploadTicket) {
            this.uploadTicket = uploadTicket;
            return this;
        }

        public CreateUploadMediaResponseBody build() {
            return new CreateUploadMediaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateUploadMediaResponseBody} extends {@link TeaModel}
     *
     * <p>CreateUploadMediaResponseBody</p>
     */
    public static class UploadCredentials extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKeyId")
        private String accessKeyId;

        @com.aliyun.core.annotation.NameInMap("AccessKeySecret")
        private String accessKeySecret;

        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Expiration")
        private String expiration;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("PostAccessKeyId")
        private String postAccessKeyId;

        @com.aliyun.core.annotation.NameInMap("PostEndpoint")
        private String postEndpoint;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("SecurityToken")
        private String securityToken;

        @com.aliyun.core.annotation.NameInMap("Signature")
        private String signature;

        @com.aliyun.core.annotation.NameInMap("SignedUrl")
        private String signedUrl;

        private UploadCredentials(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.accessKeySecret = builder.accessKeySecret;
            this.bucket = builder.bucket;
            this.expiration = builder.expiration;
            this.policy = builder.policy;
            this.postAccessKeyId = builder.postAccessKeyId;
            this.postEndpoint = builder.postEndpoint;
            this.region = builder.region;
            this.securityToken = builder.securityToken;
            this.signature = builder.signature;
            this.signedUrl = builder.signedUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UploadCredentials create() {
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
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return postAccessKeyId
         */
        public String getPostAccessKeyId() {
            return this.postAccessKeyId;
        }

        /**
         * @return postEndpoint
         */
        public String getPostEndpoint() {
            return this.postEndpoint;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return securityToken
         */
        public String getSecurityToken() {
            return this.securityToken;
        }

        /**
         * @return signature
         */
        public String getSignature() {
            return this.signature;
        }

        /**
         * @return signedUrl
         */
        public String getSignedUrl() {
            return this.signedUrl;
        }

        public static final class Builder {
            private String accessKeyId; 
            private String accessKeySecret; 
            private String bucket; 
            private String expiration; 
            private String policy; 
            private String postAccessKeyId; 
            private String postEndpoint; 
            private String region; 
            private String securityToken; 
            private String signature; 
            private String signedUrl; 

            private Builder() {
            } 

            private Builder(UploadCredentials model) {
                this.accessKeyId = model.accessKeyId;
                this.accessKeySecret = model.accessKeySecret;
                this.bucket = model.bucket;
                this.expiration = model.expiration;
                this.policy = model.policy;
                this.postAccessKeyId = model.postAccessKeyId;
                this.postEndpoint = model.postEndpoint;
                this.region = model.region;
                this.securityToken = model.securityToken;
                this.signature = model.signature;
                this.signedUrl = model.signedUrl;
            } 

            /**
             * <p>The temporary STS <code>AccessKey ID</code>. This field is returned when <code>STS_TOKEN</code> is used.</p>
             * 
             * <strong>example:</strong>
             * <p>STS.NUgYrLnoC63mLqWeRtYuIoPaSdF</p>
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * <p>The temporary STS AccessKey secret. This field is returned when STS_TOKEN is used.</p>
             * 
             * <strong>example:</strong>
             * <p>CVwjCkNzTMupZ8nRtYeXwQaBcDfGhIjK</p>
             */
            public Builder accessKeySecret(String accessKeySecret) {
                this.accessKeySecret = accessKeySecret;
                return this;
            }

            /**
             * <p>The OSS bucket. This field is returned when STS_TOKEN, POST_POLICY, or PRESIGNED_URL is used.</p>
             * 
             * <strong>example:</strong>
             * <p>yike-shared-ap-southeast-1-1</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The expiration time of the credential. The time is in UTC and follows the ISO 8601 standard.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-18T12:00:00Z</p>
             */
            public Builder expiration(String expiration) {
                this.expiration = expiration;
                return this;
            }

            /**
             * <p>The Base64-encoded PostObject policy. This field is returned when POST_POLICY is used.</p>
             * 
             * <strong>example:</strong>
             * <p>eyJleHBpcmF0aW9uIjoiMjAyNi0xMS0xOFQxMjowMDowMFoiLCJjb25kaXRpb25zIjpbXX0=</p>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * <p>The AccessKey ID used for the signature. This field is returned when POST_POLICY is used.</p>
             * 
             * <strong>example:</strong>
             * <p>LTAI5tG8XkQmP2vR9wYzAbCd</p>
             */
            public Builder postAccessKeyId(String postAccessKeyId) {
                this.postAccessKeyId = postAccessKeyId;
                return this;
            }

            /**
             * <p>The target endpoint for the POST request. This field is returned when POST_POLICY is used.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://yike-shared-ap-southeast-1-1.oss-ap-southeast-1.aliyuncs.com">https://yike-shared-ap-southeast-1-1.oss-ap-southeast-1.aliyuncs.com</a></p>
             */
            public Builder postEndpoint(String postEndpoint) {
                this.postEndpoint = postEndpoint;
                return this;
            }

            /**
             * <p>The OSS region. This field is returned in all three credential modes.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-southeast-1</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The STS security token. This field is returned when STS_TOKEN is used.</p>
             * 
             * <strong>example:</strong>
             * <p>CAISjgJ1q6Ft5B2yfSjIr5DDEOTM2pZ6g7oIExampleToken</p>
             */
            public Builder securityToken(String securityToken) {
                this.securityToken = securityToken;
                return this;
            }

            /**
             * <p>The PostObject signature. This field is returned when POST_POLICY is used.</p>
             * 
             * <strong>example:</strong>
             * <p>vXkQ9dRt2mLpN8sYwZaBcDfEgHj=</p>
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            /**
             * <p>The pre-signed PUT URL. This field is returned when PRESIGNED_URL is used.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://yike-shared-ap-southeast-1-1.oss-ap-southeast-1.aliyuncs.com/yike-v1/.../demo.mp4?Expires=1763467200&OSSAccessKeyId=STS.xxx&Signature=xxx">https://yike-shared-ap-southeast-1-1.oss-ap-southeast-1.aliyuncs.com/yike-v1/.../demo.mp4?Expires=1763467200&amp;OSSAccessKeyId=STS.xxx&amp;Signature=xxx</a></p>
             */
            public Builder signedUrl(String signedUrl) {
                this.signedUrl = signedUrl;
                return this;
            }

            public UploadCredentials build() {
                return new UploadCredentials(this);
            } 

        } 

    }
}
