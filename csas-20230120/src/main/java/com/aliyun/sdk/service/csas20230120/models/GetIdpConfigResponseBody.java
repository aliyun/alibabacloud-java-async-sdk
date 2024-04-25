// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIdpConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetIdpConfigResponseBody</p>
 */
public class GetIdpConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
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

        public GetIdpConfigResponseBody build() {
            return new GetIdpConfigResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AccessKey")
        private String accessKey;

        @NameInMap("AccessKeySecret")
        private String accessKeySecret;

        @NameInMap("Description")
        private String description;

        @NameInMap("GetGroupUrl")
        private String getGroupUrl;

        @NameInMap("Id")
        private String id;

        @NameInMap("IdpMetadata")
        private String idpMetadata;

        @NameInMap("MfaConfigType")
        private String mfaConfigType;

        @NameInMap("MobileLoginType")
        private String mobileLoginType;

        @NameInMap("MobileMfaConfigType")
        private String mobileMfaConfigType;

        @NameInMap("MultiIdpInfo")
        private String multiIdpInfo;

        @NameInMap("Name")
        private String name;

        @NameInMap("PcLoginType")
        private String pcLoginType;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("VerifyAesKey")
        private String verifyAesKey;

        @NameInMap("VerifyToken")
        private String verifyToken;

        @NameInMap("VerifyUrl")
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

            /**
             * AccessKey ID
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * AccessKey Secret
             */
            public Builder accessKeySecret(String accessKeySecret) {
                this.accessKeySecret = accessKeySecret;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * GetGroupUrl.
             */
            public Builder getGroupUrl(String getGroupUrl) {
                this.getGroupUrl = getGroupUrl;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * IdpMetadata.
             */
            public Builder idpMetadata(String idpMetadata) {
                this.idpMetadata = idpMetadata;
                return this;
            }

            /**
             * MfaConfigType.
             */
            public Builder mfaConfigType(String mfaConfigType) {
                this.mfaConfigType = mfaConfigType;
                return this;
            }

            /**
             * MobileLoginType.
             */
            public Builder mobileLoginType(String mobileLoginType) {
                this.mobileLoginType = mobileLoginType;
                return this;
            }

            /**
             * MobileMfaConfigType.
             */
            public Builder mobileMfaConfigType(String mobileMfaConfigType) {
                this.mobileMfaConfigType = mobileMfaConfigType;
                return this;
            }

            /**
             * MultiIdpInfo.
             */
            public Builder multiIdpInfo(String multiIdpInfo) {
                this.multiIdpInfo = multiIdpInfo;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PcLoginType.
             */
            public Builder pcLoginType(String pcLoginType) {
                this.pcLoginType = pcLoginType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * VerifyAesKey.
             */
            public Builder verifyAesKey(String verifyAesKey) {
                this.verifyAesKey = verifyAesKey;
                return this;
            }

            /**
             * VerifyToken.
             */
            public Builder verifyToken(String verifyToken) {
                this.verifyToken = verifyToken;
                return this;
            }

            /**
             * VerifyUrl.
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
