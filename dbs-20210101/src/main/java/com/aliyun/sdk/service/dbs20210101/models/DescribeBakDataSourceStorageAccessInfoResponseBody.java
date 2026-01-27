// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

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
 * {@link DescribeBakDataSourceStorageAccessInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBakDataSourceStorageAccessInfoResponseBody</p>
 */
public class DescribeBakDataSourceStorageAccessInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private DescribeBakDataSourceStorageAccessInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBakDataSourceStorageAccessInfoResponseBody create() {
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
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
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

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errCode; 
        private String errMessage; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(DescribeBakDataSourceStorageAccessInfoResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
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
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeBakDataSourceStorageAccessInfoResponseBody build() {
            return new DescribeBakDataSourceStorageAccessInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBakDataSourceStorageAccessInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBakDataSourceStorageAccessInfoResponseBody</p>
     */
    public static class OssAccessInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKeyId")
        private String accessKeyId;

        @com.aliyun.core.annotation.NameInMap("AccessKeySecret")
        private String accessKeySecret;

        @com.aliyun.core.annotation.NameInMap("BucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("ObjectKey")
        private String objectKey;

        @com.aliyun.core.annotation.NameInMap("OssEndpoint")
        private String ossEndpoint;

        @com.aliyun.core.annotation.NameInMap("OssInternalEndpoint")
        private String ossInternalEndpoint;

        @com.aliyun.core.annotation.NameInMap("OssRegion")
        private String ossRegion;

        @com.aliyun.core.annotation.NameInMap("SecurityToken")
        private String securityToken;

        private OssAccessInfo(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.accessKeySecret = builder.accessKeySecret;
            this.bucketName = builder.bucketName;
            this.expiredTime = builder.expiredTime;
            this.objectKey = builder.objectKey;
            this.ossEndpoint = builder.ossEndpoint;
            this.ossInternalEndpoint = builder.ossInternalEndpoint;
            this.ossRegion = builder.ossRegion;
            this.securityToken = builder.securityToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssAccessInfo create() {
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
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return objectKey
         */
        public String getObjectKey() {
            return this.objectKey;
        }

        /**
         * @return ossEndpoint
         */
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        /**
         * @return ossInternalEndpoint
         */
        public String getOssInternalEndpoint() {
            return this.ossInternalEndpoint;
        }

        /**
         * @return ossRegion
         */
        public String getOssRegion() {
            return this.ossRegion;
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
            private String expiredTime; 
            private String objectKey; 
            private String ossEndpoint; 
            private String ossInternalEndpoint; 
            private String ossRegion; 
            private String securityToken; 

            private Builder() {
            } 

            private Builder(OssAccessInfo model) {
                this.accessKeyId = model.accessKeyId;
                this.accessKeySecret = model.accessKeySecret;
                this.bucketName = model.bucketName;
                this.expiredTime = model.expiredTime;
                this.objectKey = model.objectKey;
                this.ossEndpoint = model.ossEndpoint;
                this.ossInternalEndpoint = model.ossInternalEndpoint;
                this.ossRegion = model.ossRegion;
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
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * ObjectKey.
             */
            public Builder objectKey(String objectKey) {
                this.objectKey = objectKey;
                return this;
            }

            /**
             * OssEndpoint.
             */
            public Builder ossEndpoint(String ossEndpoint) {
                this.ossEndpoint = ossEndpoint;
                return this;
            }

            /**
             * OssInternalEndpoint.
             */
            public Builder ossInternalEndpoint(String ossInternalEndpoint) {
                this.ossInternalEndpoint = ossInternalEndpoint;
                return this;
            }

            /**
             * OssRegion.
             */
            public Builder ossRegion(String ossRegion) {
                this.ossRegion = ossRegion;
                return this;
            }

            /**
             * SecurityToken.
             */
            public Builder securityToken(String securityToken) {
                this.securityToken = securityToken;
                return this;
            }

            public OssAccessInfo build() {
                return new OssAccessInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBakDataSourceStorageAccessInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBakDataSourceStorageAccessInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OssAccessInfo")
        private OssAccessInfo ossAccessInfo;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        private Data(Builder builder) {
            this.ossAccessInfo = builder.ossAccessInfo;
            this.storageType = builder.storageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return ossAccessInfo
         */
        public OssAccessInfo getOssAccessInfo() {
            return this.ossAccessInfo;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        public static final class Builder {
            private OssAccessInfo ossAccessInfo; 
            private String storageType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.ossAccessInfo = model.ossAccessInfo;
                this.storageType = model.storageType;
            } 

            /**
             * OssAccessInfo.
             */
            public Builder ossAccessInfo(OssAccessInfo ossAccessInfo) {
                this.ossAccessInfo = ossAccessInfo;
                return this;
            }

            /**
             * StorageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
