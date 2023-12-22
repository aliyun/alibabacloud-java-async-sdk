// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUploadTokenResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUploadTokenResponseBody</p>
 */
public class DescribeUploadTokenResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Msg")
    private String msg;

    @NameInMap("RequestId")
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
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("AccessKeyId")
        private String accessKeyId;

        @NameInMap("AccessKeySecret")
        private String accessKeySecret;

        @NameInMap("BucketName")
        private String bucketName;

        @NameInMap("Expiration")
        private Integer expiration;

        @NameInMap("FileNamePrefix")
        private String fileNamePrefix;

        @NameInMap("OssInternalEndPoint")
        private String ossInternalEndPoint;

        @NameInMap("OssInternetEndPoint")
        private String ossInternetEndPoint;

        @NameInMap("SecurityToken")
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
             * AccessKeyId.
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * AccessKeySecret.
             */
            public Builder accessKeySecret(String accessKeySecret) {
                this.accessKeySecret = accessKeySecret;
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
            public Builder expiration(Integer expiration) {
                this.expiration = expiration;
                return this;
            }

            /**
             * FileNamePrefix.
             */
            public Builder fileNamePrefix(String fileNamePrefix) {
                this.fileNamePrefix = fileNamePrefix;
                return this;
            }

            /**
             * OssInternalEndPoint.
             */
            public Builder ossInternalEndPoint(String ossInternalEndPoint) {
                this.ossInternalEndPoint = ossInternalEndPoint;
                return this;
            }

            /**
             * OssInternetEndPoint.
             */
            public Builder ossInternetEndPoint(String ossInternetEndPoint) {
                this.ossInternetEndPoint = ossInternetEndPoint;
                return this;
            }

            /**
             * SecurityToken.
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
