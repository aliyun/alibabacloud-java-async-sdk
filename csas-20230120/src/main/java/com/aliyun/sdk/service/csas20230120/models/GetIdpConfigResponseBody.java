// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link GetIdpConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetIdpConfigResponseBody</p>
 */
public class GetIdpConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetIdpConfigResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIdpConfigResponseBody create() {
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

        private Builder(GetIdpConfigResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Identity provider configuration.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>ID of this request.</p>
         * 
         * <strong>example:</strong>
         * <p>58D6B23E-E5DA-5418-8F61-******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetIdpConfigResponseBody build() {
            return new GetIdpConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetIdpConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdpConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKey")
        private String accessKey;

        @com.aliyun.core.annotation.NameInMap("AccessKeySecret")
        private String accessKeySecret;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GetGroupUrl")
        private String getGroupUrl;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IdpMetadata")
        private String idpMetadata;

        @com.aliyun.core.annotation.NameInMap("MfaConfigType")
        private String mfaConfigType;

        @com.aliyun.core.annotation.NameInMap("MobileLoginType")
        private String mobileLoginType;

        @com.aliyun.core.annotation.NameInMap("MobileMfaConfigType")
        private String mobileMfaConfigType;

        @com.aliyun.core.annotation.NameInMap("MultiIdpInfo")
        private String multiIdpInfo;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PcLoginType")
        private String pcLoginType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("VerifyAesKey")
        private String verifyAesKey;

        @com.aliyun.core.annotation.NameInMap("VerifyToken")
        private String verifyToken;

        @com.aliyun.core.annotation.NameInMap("VerifyUrl")
        private String verifyUrl;

        private Data(Builder builder) {
            this.accessKey = builder.accessKey;
            this.accessKeySecret = builder.accessKeySecret;
            this.description = builder.description;
            this.getGroupUrl = builder.getGroupUrl;
            this.id = builder.id;
            this.idpMetadata = builder.idpMetadata;
            this.mfaConfigType = builder.mfaConfigType;
            this.mobileLoginType = builder.mobileLoginType;
            this.mobileMfaConfigType = builder.mobileMfaConfigType;
            this.multiIdpInfo = builder.multiIdpInfo;
            this.name = builder.name;
            this.pcLoginType = builder.pcLoginType;
            this.status = builder.status;
            this.type = builder.type;
            this.updateTime = builder.updateTime;
            this.verifyAesKey = builder.verifyAesKey;
            this.verifyToken = builder.verifyToken;
            this.verifyUrl = builder.verifyUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accessKey
         */
        public String getAccessKey() {
            return this.accessKey;
        }

        /**
         * @return accessKeySecret
         */
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return getGroupUrl
         */
        public String getGetGroupUrl() {
            return this.getGroupUrl;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return idpMetadata
         */
        public String getIdpMetadata() {
            return this.idpMetadata;
        }

        /**
         * @return mfaConfigType
         */
        public String getMfaConfigType() {
            return this.mfaConfigType;
        }

        /**
         * @return mobileLoginType
         */
        public String getMobileLoginType() {
            return this.mobileLoginType;
        }

        /**
         * @return mobileMfaConfigType
         */
        public String getMobileMfaConfigType() {
            return this.mobileMfaConfigType;
        }

        /**
         * @return multiIdpInfo
         */
        public String getMultiIdpInfo() {
            return this.multiIdpInfo;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pcLoginType
         */
        public String getPcLoginType() {
            return this.pcLoginType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return verifyAesKey
         */
        public String getVerifyAesKey() {
            return this.verifyAesKey;
        }

        /**
         * @return verifyToken
         */
        public String getVerifyToken() {
            return this.verifyToken;
        }

        /**
         * @return verifyUrl
         */
        public String getVerifyUrl() {
            return this.verifyUrl;
        }

        public static final class Builder {
            private String accessKey; 
            private String accessKeySecret; 
            private String description; 
            private String getGroupUrl; 
            private String id; 
            private String idpMetadata; 
            private String mfaConfigType; 
            private String mobileLoginType; 
            private String mobileMfaConfigType; 
            private String multiIdpInfo; 
            private String name; 
            private String pcLoginType; 
            private String status; 
            private String type; 
            private String updateTime; 
            private String verifyAesKey; 
            private String verifyToken; 
            private String verifyUrl; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accessKey = model.accessKey;
                this.accessKeySecret = model.accessKeySecret;
                this.description = model.description;
                this.getGroupUrl = model.getGroupUrl;
                this.id = model.id;
                this.idpMetadata = model.idpMetadata;
                this.mfaConfigType = model.mfaConfigType;
                this.mobileLoginType = model.mobileLoginType;
                this.mobileMfaConfigType = model.mobileMfaConfigType;
                this.multiIdpInfo = model.multiIdpInfo;
                this.name = model.name;
                this.pcLoginType = model.pcLoginType;
                this.status = model.status;
                this.type = model.type;
                this.updateTime = model.updateTime;
                this.verifyAesKey = model.verifyAesKey;
                this.verifyToken = model.verifyToken;
                this.verifyUrl = model.verifyUrl;
            } 

            /**
             * <p>AccessKey ID for the IDaaS identity provider.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * <p>AccessKey for the IDaaS identity provider.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder accessKeySecret(String accessKeySecret) {
                this.accessKeySecret = accessKeySecret;
                return this;
            }

            /**
             * <p>Description of the identity provider configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>示例身份源</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>URL to query the organizational structure from a custom identity provider.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://172.10.XX.XX:4321/getGroup?name=%s&pass=%s">https://172.10.XX.XX:4321/getGroup?name=%s&amp;pass=%s</a></p>
             */
            public Builder getGroupUrl(String getGroupUrl) {
                this.getGroupUrl = getGroupUrl;
                return this;
            }

            /**
             * <p>ID of the identity provider configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>idp-cfg68956d86e********</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Metadata of the identity provider (IdP).</p>
             * 
             * <strong>example:</strong>
             * <?xml version="1.0" encoding="utf-8"?><hr>
             */
            public Builder idpMetadata(String idpMetadata) {
                this.idpMetadata = idpMetadata;
                return this;
            }

            /**
             * <p>Type of multi-factor authentication (MFA) configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>totp</p>
             */
            public Builder mfaConfigType(String mfaConfigType) {
                this.mfaConfigType = mfaConfigType;
                return this;
            }

            /**
             * <p>Login type for mobile clients.</p>
             * 
             * <strong>example:</strong>
             * <p>password</p>
             */
            public Builder mobileLoginType(String mobileLoginType) {
                this.mobileLoginType = mobileLoginType;
                return this;
            }

            /**
             * <p>Type of MFA configuration for mobile clients.</p>
             * 
             * <strong>example:</strong>
             * <p>totp</p>
             */
            public Builder mobileMfaConfigType(String mobileMfaConfigType) {
                this.mobileMfaConfigType = mobileMfaConfigType;
                return this;
            }

            /**
             * <p>List of IDs for multiple identity providers.</p>
             * 
             * <strong>example:</strong>
             * <p>1482,1355</p>
             */
            public Builder multiIdpInfo(String multiIdpInfo) {
                this.multiIdpInfo = multiIdpInfo;
                return this;
            }

            /**
             * <p>Name of the identity provider configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>示例身份源</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Login type for PC clients.</p>
             * 
             * <strong>example:</strong>
             * <p>password</p>
             */
            public Builder pcLoginType(String pcLoginType) {
                this.pcLoginType = pcLoginType;
                return this;
            }

            /**
             * <p>Status of the identity provider configuration. Valid values:</p>
             * <ul>
             * <li><p><strong>Enabled</strong>: Enabled.</p>
             * </li>
             * <li><p><strong>Disabled</strong>: Disabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Type of the identity provider configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>CSAS</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Time when the configuration was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-02-26T02:02:42Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>AES key used to encrypt requests to a custom MFA service.</p>
             * 
             * <strong>example:</strong>
             * <p>QVhaU0RDR0JIWV****</p>
             */
            public Builder verifyAesKey(String verifyAesKey) {
                this.verifyAesKey = verifyAesKey;
                return this;
            }

            /**
             * <p>Token used to verify signatures in requests to a custom MFA service.</p>
             * 
             * <strong>example:</strong>
             * <p>7JAr3fYtn****</p>
             */
            public Builder verifyToken(String verifyToken) {
                this.verifyToken = verifyToken;
                return this;
            }

            /**
             * <p>URL used to verify one-time passwords with a custom MFA service.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://172.10.XX.XX:1234/otp_verify">http://172.10.XX.XX:1234/otp_verify</a></p>
             */
            public Builder verifyUrl(String verifyUrl) {
                this.verifyUrl = verifyUrl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
