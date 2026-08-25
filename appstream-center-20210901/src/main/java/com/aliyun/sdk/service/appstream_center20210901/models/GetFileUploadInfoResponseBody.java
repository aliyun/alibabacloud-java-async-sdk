// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link GetFileUploadInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetFileUploadInfoResponseBody</p>
 */
public class GetFileUploadInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetFileUploadInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileUploadInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetFileUploadInfoResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFileUploadInfoResponseBody build() {
            return new GetFileUploadInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFileUploadInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileUploadInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKeyId")
        private String accessKeyId;

        @com.aliyun.core.annotation.NameInMap("BucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("Expiration")
        private String expiration;

        @com.aliyun.core.annotation.NameInMap("FilePath")
        private String filePath;

        @com.aliyun.core.annotation.NameInMap("MaxFileSize")
        private Long maxFileSize;

        @com.aliyun.core.annotation.NameInMap("OssPoint")
        private String ossPoint;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("Signature")
        private String signature;

        @com.aliyun.core.annotation.NameInMap("StsToken")
        private String stsToken;

        private Data(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.bucketName = builder.bucketName;
            this.expiration = builder.expiration;
            this.filePath = builder.filePath;
            this.maxFileSize = builder.maxFileSize;
            this.ossPoint = builder.ossPoint;
            this.policy = builder.policy;
            this.requestId = builder.requestId;
            this.signature = builder.signature;
            this.stsToken = builder.stsToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accessKeyId
         */
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return expiration
         */
        public String getExpiration() {
            return this.expiration;
        }

        /**
         * @return filePath
         */
        public String getFilePath() {
            return this.filePath;
        }

        /**
         * @return maxFileSize
         */
        public Long getMaxFileSize() {
            return this.maxFileSize;
        }

        /**
         * @return ossPoint
         */
        public String getOssPoint() {
            return this.ossPoint;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return signature
         */
        public String getSignature() {
            return this.signature;
        }

        /**
         * @return stsToken
         */
        public String getStsToken() {
            return this.stsToken;
        }

        public static final class Builder {
            private String accessKeyId; 
            private String bucketName; 
            private String expiration; 
            private String filePath; 
            private Long maxFileSize; 
            private String ossPoint; 
            private String policy; 
            private String requestId; 
            private String signature; 
            private String stsToken; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accessKeyId = model.accessKeyId;
                this.bucketName = model.bucketName;
                this.expiration = model.expiration;
                this.filePath = model.filePath;
                this.maxFileSize = model.maxFileSize;
                this.ossPoint = model.ossPoint;
                this.policy = model.policy;
                this.requestId = model.requestId;
                this.signature = model.signature;
                this.stsToken = model.stsToken;
            } 

            /**
             * AccessKeyId.
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * BucketName.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
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
             * FilePath.
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * MaxFileSize.
             */
            public Builder maxFileSize(Long maxFileSize) {
                this.maxFileSize = maxFileSize;
                return this;
            }

            /**
             * OssPoint.
             */
            public Builder ossPoint(String ossPoint) {
                this.ossPoint = ossPoint;
                return this;
            }

            /**
             * Policy.
             */
            public Builder policy(String policy) {
                this.policy = policy;
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
             * Signature.
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            /**
             * StsToken.
             */
            public Builder stsToken(String stsToken) {
                this.stsToken = stsToken;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
