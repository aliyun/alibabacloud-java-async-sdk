// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetExternalSAMLIdentityProviderResponseBody} extends {@link TeaModel}
 *
 * <p>GetExternalSAMLIdentityProviderResponseBody</p>
 */
public class GetExternalSAMLIdentityProviderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SAMLIdentityProviderConfiguration")
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
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>SAMLIdentityProviderConfiguration.</p>
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
             * <p>CertificateIds.</p>
             */
            public Builder certificateIds(java.util.List < String > certificateIds) {
                this.certificateIds = certificateIds;
                return this;
            }

            /**
             * <p>CreateTime.</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>DirectoryId.</p>
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * <p>EncodedMetadataDocument.</p>
             */
            public Builder encodedMetadataDocument(String encodedMetadataDocument) {
                this.encodedMetadataDocument = encodedMetadataDocument;
                return this;
            }

            /**
             * <p>EntityId.</p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>LoginUrl.</p>
             */
            public Builder loginUrl(String loginUrl) {
                this.loginUrl = loginUrl;
                return this;
            }

            /**
             * <p>SSOStatus.</p>
             */
            public Builder SSOStatus(String SSOStatus) {
                this.SSOStatus = SSOStatus;
                return this;
            }

            /**
             * <p>UpdateTime.</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>WantRequestSigned.</p>
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
