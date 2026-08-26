// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link GetDataAgentThemeUploadSignatureResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataAgentThemeUploadSignatureResponseBody</p>
 */
public class GetDataAgentThemeUploadSignatureResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDataAgentThemeUploadSignatureResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataAgentThemeUploadSignatureResponseBody create() {
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
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetDataAgentThemeUploadSignatureResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDataAgentThemeUploadSignatureResponseBody build() {
            return new GetDataAgentThemeUploadSignatureResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataAgentThemeUploadSignatureResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataAgentThemeUploadSignatureResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("ObjectKey")
        private String objectKey;

        @com.aliyun.core.annotation.NameInMap("OssCredential")
        private String ossCredential;

        @com.aliyun.core.annotation.NameInMap("OssDate")
        private String ossDate;

        @com.aliyun.core.annotation.NameInMap("OssSecurityToken")
        private String ossSecurityToken;

        @com.aliyun.core.annotation.NameInMap("OssSignature")
        private String ossSignature;

        @com.aliyun.core.annotation.NameInMap("OssSignatureVersion")
        private String ossSignatureVersion;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("ThemeId")
        private String themeId;

        @com.aliyun.core.annotation.NameInMap("UploadDir")
        private String uploadDir;

        @com.aliyun.core.annotation.NameInMap("UploadHost")
        private String uploadHost;

        private Data(Builder builder) {
            this.expireTime = builder.expireTime;
            this.objectKey = builder.objectKey;
            this.ossCredential = builder.ossCredential;
            this.ossDate = builder.ossDate;
            this.ossSecurityToken = builder.ossSecurityToken;
            this.ossSignature = builder.ossSignature;
            this.ossSignatureVersion = builder.ossSignatureVersion;
            this.policy = builder.policy;
            this.themeId = builder.themeId;
            this.uploadDir = builder.uploadDir;
            this.uploadHost = builder.uploadHost;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return objectKey
         */
        public String getObjectKey() {
            return this.objectKey;
        }

        /**
         * @return ossCredential
         */
        public String getOssCredential() {
            return this.ossCredential;
        }

        /**
         * @return ossDate
         */
        public String getOssDate() {
            return this.ossDate;
        }

        /**
         * @return ossSecurityToken
         */
        public String getOssSecurityToken() {
            return this.ossSecurityToken;
        }

        /**
         * @return ossSignature
         */
        public String getOssSignature() {
            return this.ossSignature;
        }

        /**
         * @return ossSignatureVersion
         */
        public String getOssSignatureVersion() {
            return this.ossSignatureVersion;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return themeId
         */
        public String getThemeId() {
            return this.themeId;
        }

        /**
         * @return uploadDir
         */
        public String getUploadDir() {
            return this.uploadDir;
        }

        /**
         * @return uploadHost
         */
        public String getUploadHost() {
            return this.uploadHost;
        }

        public static final class Builder {
            private String expireTime; 
            private String objectKey; 
            private String ossCredential; 
            private String ossDate; 
            private String ossSecurityToken; 
            private String ossSignature; 
            private String ossSignatureVersion; 
            private String policy; 
            private String themeId; 
            private String uploadDir; 
            private String uploadHost; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.expireTime = model.expireTime;
                this.objectKey = model.objectKey;
                this.ossCredential = model.ossCredential;
                this.ossDate = model.ossDate;
                this.ossSecurityToken = model.ossSecurityToken;
                this.ossSignature = model.ossSignature;
                this.ossSignatureVersion = model.ossSignatureVersion;
                this.policy = model.policy;
                this.themeId = model.themeId;
                this.uploadDir = model.uploadDir;
                this.uploadHost = model.uploadHost;
            } 

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
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
             * OssCredential.
             */
            public Builder ossCredential(String ossCredential) {
                this.ossCredential = ossCredential;
                return this;
            }

            /**
             * OssDate.
             */
            public Builder ossDate(String ossDate) {
                this.ossDate = ossDate;
                return this;
            }

            /**
             * OssSecurityToken.
             */
            public Builder ossSecurityToken(String ossSecurityToken) {
                this.ossSecurityToken = ossSecurityToken;
                return this;
            }

            /**
             * OssSignature.
             */
            public Builder ossSignature(String ossSignature) {
                this.ossSignature = ossSignature;
                return this;
            }

            /**
             * OssSignatureVersion.
             */
            public Builder ossSignatureVersion(String ossSignatureVersion) {
                this.ossSignatureVersion = ossSignatureVersion;
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
             * ThemeId.
             */
            public Builder themeId(String themeId) {
                this.themeId = themeId;
                return this;
            }

            /**
             * UploadDir.
             */
            public Builder uploadDir(String uploadDir) {
                this.uploadDir = uploadDir;
                return this;
            }

            /**
             * UploadHost.
             */
            public Builder uploadHost(String uploadHost) {
                this.uploadHost = uploadHost;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
