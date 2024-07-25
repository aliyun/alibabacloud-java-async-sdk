// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUploadTokenResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUploadTokenResponseBody</p>
 */
public class DescribeUploadTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeUploadTokenResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUploadTokenResponseBody create() {
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
     * @return msg
     */
    public String getMsg() {
        return this.msg;
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
        private String msg; 
        private String requestId; 

        /**
         * The returned HTTP status code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The message that is returned in response to the request.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUploadTokenResponseBody build() {
            return new DescribeUploadTokenResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKeyId")
        private String accessKeyId;

        @com.aliyun.core.annotation.NameInMap("AccessKeySecret")
        private String accessKeySecret;

        @com.aliyun.core.annotation.NameInMap("BucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("Expiration")
        private Integer expiration;

        @com.aliyun.core.annotation.NameInMap("FileNamePrefix")
        private String fileNamePrefix;

        @com.aliyun.core.annotation.NameInMap("OssInternalEndPoint")
        private String ossInternalEndPoint;

        @com.aliyun.core.annotation.NameInMap("OssInternetEndPoint")
        private String ossInternetEndPoint;

        @com.aliyun.core.annotation.NameInMap("SecurityToken")
        private String securityToken;

        private Data(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.accessKeySecret = builder.accessKeySecret;
            this.bucketName = builder.bucketName;
            this.expiration = builder.expiration;
            this.fileNamePrefix = builder.fileNamePrefix;
            this.ossInternalEndPoint = builder.ossInternalEndPoint;
            this.ossInternetEndPoint = builder.ossInternetEndPoint;
            this.securityToken = builder.securityToken;
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
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return expiration
         */
        public Integer getExpiration() {
            return this.expiration;
        }

        /**
         * @return fileNamePrefix
         */
        public String getFileNamePrefix() {
            return this.fileNamePrefix;
        }

        /**
         * @return ossInternalEndPoint
         */
        public String getOssInternalEndPoint() {
            return this.ossInternalEndPoint;
        }

        /**
         * @return ossInternetEndPoint
         */
        public String getOssInternetEndPoint() {
            return this.ossInternetEndPoint;
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
            private String bucketName; 
            private Integer expiration; 
            private String fileNamePrefix; 
            private String ossInternalEndPoint; 
            private String ossInternetEndPoint; 
            private String securityToken; 

            /**
             * The AccessKey ID.
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * The AccessKey secret.
             */
            public Builder accessKeySecret(String accessKeySecret) {
                this.accessKeySecret = accessKeySecret;
                return this;
            }

            /**
             * The bucket name.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * The time when the file sharing link expires.
             */
            public Builder expiration(Integer expiration) {
                this.expiration = expiration;
                return this;
            }

            /**
             * The file prefix.
             */
            public Builder fileNamePrefix(String fileNamePrefix) {
                this.fileNamePrefix = fileNamePrefix;
                return this;
            }

            /**
             * the oss intranet point.
             */
            public Builder ossInternalEndPoint(String ossInternalEndPoint) {
                this.ossInternalEndPoint = ossInternalEndPoint;
                return this;
            }

            /**
             * the oss internet point.
             */
            public Builder ossInternetEndPoint(String ossInternetEndPoint) {
                this.ossInternetEndPoint = ossInternetEndPoint;
                return this;
            }

            /**
             * The security token.
             */
            public Builder securityToken(String securityToken) {
                this.securityToken = securityToken;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
