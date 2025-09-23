// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

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
 * {@link TempAccessTokenIntlResponseBody} extends {@link TeaModel}
 *
 * <p>TempAccessTokenIntlResponseBody</p>
 */
public class TempAccessTokenIntlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private TempAccessTokenIntlResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TempAccessTokenIntlResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(TempAccessTokenIntlResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>86C40EC3-5940-5F47-995C-BFE90B70E540</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public TempAccessTokenIntlResponseBody build() {
            return new TempAccessTokenIntlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TempAccessTokenIntlResponseBody} extends {@link TeaModel}
     *
     * <p>TempAccessTokenIntlResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKeyId")
        private String accessKeyId;

        @com.aliyun.core.annotation.NameInMap("AccessKeySecret")
        private String accessKeySecret;

        @com.aliyun.core.annotation.NameInMap("BucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("FileNamePrefix")
        private String fileNamePrefix;

        @com.aliyun.core.annotation.NameInMap("OssEndPoint")
        private String ossEndPoint;

        @com.aliyun.core.annotation.NameInMap("SecurityToken")
        private String securityToken;

        private Data(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.accessKeySecret = builder.accessKeySecret;
            this.bucketName = builder.bucketName;
            this.fileNamePrefix = builder.fileNamePrefix;
            this.ossEndPoint = builder.ossEndPoint;
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
         * @return fileNamePrefix
         */
        public String getFileNamePrefix() {
            return this.fileNamePrefix;
        }

        /**
         * @return ossEndPoint
         */
        public String getOssEndPoint() {
            return this.ossEndPoint;
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
            private String fileNamePrefix; 
            private String ossEndPoint; 
            private String securityToken; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accessKeyId = model.accessKeyId;
                this.accessKeySecret = model.accessKeySecret;
                this.bucketName = model.bucketName;
                this.fileNamePrefix = model.fileNamePrefix;
                this.ossEndPoint = model.ossEndPoint;
                this.securityToken = model.securityToken;
            } 

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
             * FileNamePrefix.
             */
            public Builder fileNamePrefix(String fileNamePrefix) {
                this.fileNamePrefix = fileNamePrefix;
                return this;
            }

            /**
             * <p>OssEndPoint。</p>
             * 
             * <strong>example:</strong>
             * <p>ossEndPoint</p>
             */
            public Builder ossEndPoint(String ossEndPoint) {
                this.ossEndPoint = ossEndPoint;
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
