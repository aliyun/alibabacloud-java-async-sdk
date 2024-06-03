// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetExternalSAMLIdentityProviderResponseBody} extends {@link TeaModel}
 *
 * <p>GetExternalSAMLIdentityProviderResponseBody</p>
 */
public class GetExternalSAMLIdentityProviderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SAMLIdentityProviderConfiguration")
    private SAMLIdentityProviderConfiguration SAMLIdentityProviderConfiguration;

    private GetExternalSAMLIdentityProviderResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.SAMLIdentityProviderConfiguration = builder.SAMLIdentityProviderConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExternalSAMLIdentityProviderResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The configurations of the IdP.
         */
        public Builder SAMLIdentityProviderConfiguration(SAMLIdentityProviderConfiguration SAMLIdentityProviderConfiguration) {
            this.SAMLIdentityProviderConfiguration = SAMLIdentityProviderConfiguration;
            return this;
        }

        public GetExternalSAMLIdentityProviderResponseBody build() {
            return new GetExternalSAMLIdentityProviderResponseBody(this);
        } 

    } 

    public static class SAMLIdentityProviderConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertificateIds")
        private java.util.List < String > certificateIds;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DirectoryId")
        private String directoryId;

        @com.aliyun.core.annotation.NameInMap("EncodedMetadataDocument")
        private String encodedMetadataDocument;

        @com.aliyun.core.annotation.NameInMap("EntityId")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("LoginUrl")
        private String loginUrl;

        @com.aliyun.core.annotation.NameInMap("SSOStatus")
        private String SSOStatus;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("WantRequestSigned")
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
             * The ID of the SAML signing certificate.
             */
            public Builder certificateIds(java.util.List < String > certificateIds) {
                this.certificateIds = certificateIds;
                return this;
            }

            /**
             * The time when the IdP was configured for the first time.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the directory.
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * The metadata file of the IdP. The value of this parameter is Base64-encoded.
             */
            public Builder encodedMetadataDocument(String encodedMetadataDocument) {
                this.encodedMetadataDocument = encodedMetadataDocument;
                return this;
            }

            /**
             * The entity ID of the IdP.
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * The logon URL of the IdP.
             */
            public Builder loginUrl(String loginUrl) {
                this.loginUrl = loginUrl;
                return this;
            }

            /**
             * The status of SSO logon. Valid values:
             * <p>
             * 
             * *   Enabled
             * *   Disabled
             */
            public Builder SSOStatus(String SSOStatus) {
                this.SSOStatus = SSOStatus;
                return this;
            }

            /**
             * The time when the IdP configurations were last modified.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * Indicates whether CloudSSO needs to sign SAML requests. The requests are sent when users log on to the CloudSSO user portal to initiate SAML-based SSO. Valid values:
             * <p>
             * 
             * *   true: yes
             * *   false: no (default)
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
