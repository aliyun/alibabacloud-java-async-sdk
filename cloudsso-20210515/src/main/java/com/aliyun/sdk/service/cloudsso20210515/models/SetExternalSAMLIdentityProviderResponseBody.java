// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetExternalSAMLIdentityProviderResponseBody} extends {@link TeaModel}
 *
 * <p>SetExternalSAMLIdentityProviderResponseBody</p>
 */
public class SetExternalSAMLIdentityProviderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SAMLIdentityProviderConfiguration")
    private SAMLIdentityProviderConfiguration SAMLIdentityProviderConfiguration;

    private SetExternalSAMLIdentityProviderResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.SAMLIdentityProviderConfiguration = builder.SAMLIdentityProviderConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetExternalSAMLIdentityProviderResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return SAMLIdentityProviderConfiguration
     */
    public SAMLIdentityProviderConfiguration getSAMLIdentityProviderConfiguration() {
        return this.SAMLIdentityProviderConfiguration;
    }

    public static final class Builder {
        private String requestId; 
        private SAMLIdentityProviderConfiguration SAMLIdentityProviderConfiguration; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SAMLIdentityProviderConfiguration.
         */
        public Builder SAMLIdentityProviderConfiguration(SAMLIdentityProviderConfiguration SAMLIdentityProviderConfiguration) {
            this.SAMLIdentityProviderConfiguration = SAMLIdentityProviderConfiguration;
            return this;
        }

        public SetExternalSAMLIdentityProviderResponseBody build() {
            return new SetExternalSAMLIdentityProviderResponseBody(this);
        } 

    } 

    public static class SAMLIdentityProviderConfiguration extends TeaModel {
        @NameInMap("CertificateIds")
        private java.util.List < String > certificateIds;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DirectoryId")
        private String directoryId;

        @NameInMap("EncodedMetadataDocument")
        private String encodedMetadataDocument;

        @NameInMap("EntityId")
        private String entityId;

        @NameInMap("LoginUrl")
        private String loginUrl;

        @NameInMap("SSOStatus")
        private String SSOStatus;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("WantRequestSigned")
        private Boolean wantRequestSigned;

        private SAMLIdentityProviderConfiguration(Builder builder) {
            this.certificateIds = builder.certificateIds;
            this.createTime = builder.createTime;
            this.directoryId = builder.directoryId;
            this.encodedMetadataDocument = builder.encodedMetadataDocument;
            this.entityId = builder.entityId;
            this.loginUrl = builder.loginUrl;
            this.SSOStatus = builder.SSOStatus;
            this.updateTime = builder.updateTime;
            this.wantRequestSigned = builder.wantRequestSigned;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SAMLIdentityProviderConfiguration create() {
            return builder().build();
        }

        /**
         * @return certificateIds
         */
        public java.util.List < String > getCertificateIds() {
            return this.certificateIds;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return directoryId
         */
        public String getDirectoryId() {
            return this.directoryId;
        }

        /**
         * @return encodedMetadataDocument
         */
        public String getEncodedMetadataDocument() {
            return this.encodedMetadataDocument;
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return loginUrl
         */
        public String getLoginUrl() {
            return this.loginUrl;
        }

        /**
         * @return SSOStatus
         */
        public String getSSOStatus() {
            return this.SSOStatus;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return wantRequestSigned
         */
        public Boolean getWantRequestSigned() {
            return this.wantRequestSigned;
        }

        public static final class Builder {
            private java.util.List < String > certificateIds; 
            private String createTime; 
            private String directoryId; 
            private String encodedMetadataDocument; 
            private String entityId; 
            private String loginUrl; 
            private String SSOStatus; 
            private String updateTime; 
            private Boolean wantRequestSigned; 

            /**
             * CertificateIds.
             */
            public Builder certificateIds(java.util.List < String > certificateIds) {
                this.certificateIds = certificateIds;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DirectoryId.
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * EncodedMetadataDocument.
             */
            public Builder encodedMetadataDocument(String encodedMetadataDocument) {
                this.encodedMetadataDocument = encodedMetadataDocument;
                return this;
            }

            /**
             * EntityId.
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * LoginUrl.
             */
            public Builder loginUrl(String loginUrl) {
                this.loginUrl = loginUrl;
                return this;
            }

            /**
             * SSOStatus.
             */
            public Builder SSOStatus(String SSOStatus) {
                this.SSOStatus = SSOStatus;
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
             * WantRequestSigned.
             */
            public Builder wantRequestSigned(Boolean wantRequestSigned) {
                this.wantRequestSigned = wantRequestSigned;
                return this;
            }

            public SAMLIdentityProviderConfiguration build() {
                return new SAMLIdentityProviderConfiguration(this);
            } 

        } 

    }
}
