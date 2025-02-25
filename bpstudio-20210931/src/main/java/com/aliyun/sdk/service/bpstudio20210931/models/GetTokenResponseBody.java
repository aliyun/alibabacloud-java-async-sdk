// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GetTokenResponseBody</p>
 */
public class GetTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetTokenResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTokenResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The information about the token.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A07FFDF2-78FA-1B48-9E38-88E833A93187</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetTokenResponseBody build() {
            return new GetTokenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTokenResponseBody} extends {@link TeaModel}
     *
     * <p>GetTokenResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKeyId")
        private String accessKeyId;

        @com.aliyun.core.annotation.NameInMap("AccessKeySecret")
        private String accessKeySecret;

        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("SecurityToken")
        private String securityToken;

        @com.aliyun.core.annotation.NameInMap("SnapshotBucket")
        private String snapshotBucket;

        private Data(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.accessKeySecret = builder.accessKeySecret;
            this.bucket = builder.bucket;
            this.endpoint = builder.endpoint;
            this.securityToken = builder.securityToken;
            this.snapshotBucket = builder.snapshotBucket;
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
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return securityToken
         */
        public String getSecurityToken() {
            return this.securityToken;
        }

        /**
         * @return snapshotBucket
         */
        public String getSnapshotBucket() {
            return this.snapshotBucket;
        }

        public static final class Builder {
            private String accessKeyId; 
            private String accessKeySecret; 
            private String bucket; 
            private String endpoint; 
            private String securityToken; 
            private String snapshotBucket; 

            /**
             * <p>The AccessKey ID that is used to access OSS.</p>
             * 
             * <strong>example:</strong>
             * <p>STS.NTm*****8tu</p>
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * <p>The AccessKey secret used to access OSS.</p>
             * 
             * <strong>example:</strong>
             * <p>9NG*****K4X</p>
             */
            public Builder accessKeySecret(String accessKeySecret) {
                this.accessKeySecret = accessKeySecret;
                return this;
            }

            /**
             * <p>The OSS bucket that is used to store the architecture image.</p>
             * 
             * <strong>example:</strong>
             * <p>bucket-1</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The OSS endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://oss-cn-beijing.aliyuncs.com">https://oss-cn-beijing.aliyuncs.com</a></p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The token that is used to access the Object Storage Service (OSS) bucket that stores the architecture image.</p>
             * 
             * <strong>example:</strong>
             * <p>ABCD</p>
             */
            public Builder securityToken(String securityToken) {
                this.securityToken = securityToken;
                return this;
            }

            /**
             * <p>The OSS bucket that is used to save data snapshots.</p>
             * 
             * <strong>example:</strong>
             * <p>bucket-2</p>
             */
            public Builder snapshotBucket(String snapshotBucket) {
                this.snapshotBucket = snapshotBucket;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
