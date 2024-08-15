// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateProblemPictureUploadSignResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateProblemPictureUploadSignResponseBody</p>
 */
public class GenerateProblemPictureUploadSignResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GenerateProblemPictureUploadSignResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateProblemPictureUploadSignResponseBody create() {
        return builder().build();
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

        /**
         * data
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenerateProblemPictureUploadSignResponseBody build() {
            return new GenerateProblemPictureUploadSignResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessKeyId")
        private String accessKeyId;

        @com.aliyun.core.annotation.NameInMap("bucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("signature")
        private String signature;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private Data(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.bucketName = builder.bucketName;
            this.key = builder.key;
            this.policy = builder.policy;
            this.signature = builder.signature;
            this.url = builder.url;
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
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return signature
         */
        public String getSignature() {
            return this.signature;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String accessKeyId; 
            private String bucketName; 
            private String key; 
            private String policy; 
            private String signature; 
            private String url; 

            /**
             * ossaccessKeyId
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * oss bucket name
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * oss key
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * policy
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * signature
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            /**
             * url
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
