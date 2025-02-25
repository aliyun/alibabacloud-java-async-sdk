// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetExternalSAMLIdentityProviderResponseBody} extends {@link TeaModel}
 *
 * <p>SetExternalSAMLIdentityProviderResponseBody</p>
 */
public class SetExternalSAMLIdentityProviderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SAMLIdentityProviderConfiguration")
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>63160579-2E1B-57B0-8273-B27427172385</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The configurations of the IdP.</p>
         */
        public Builder SAMLIdentityProviderConfiguration(SAMLIdentityProviderConfiguration SAMLIdentityProviderConfiguration) {
            this.SAMLIdentityProviderConfiguration = SAMLIdentityProviderConfiguration;
            return this;
        }

        public SetExternalSAMLIdentityProviderResponseBody build() {
            return new SetExternalSAMLIdentityProviderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SetExternalSAMLIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>SetExternalSAMLIdentityProviderResponseBody</p>
     */
    public static class SAMLIdentityProviderConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindingType")
        private String bindingType;

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
            this.bindingType = builder.bindingType;
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
         * @return bindingType
         */
        public String getBindingType() {
            return this.bindingType;
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
            private String bindingType; 
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
             * <p>The Binding method for initiating a SAML request. Values:</p>
             * <ul>
             * <li>Post: Initiate the SAML request using the Post method. </li>
             * <li>Redirect: Initiate the SAML request using the Redirect method.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Redirect</p>
             */
            public Builder bindingType(String bindingType) {
                this.bindingType = bindingType;
                return this;
            }

            /**
             * <p>The ID of the SAML signing certificate.</p>
             */
            public Builder certificateIds(java.util.List < String > certificateIds) {
                this.certificateIds = certificateIds;
                return this;
            }

            /**
             * <p>The time when the IdP was configured for the first time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-10T02:57:16Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the directory.</p>
             * 
             * <strong>example:</strong>
             * <p>d-00fc2p61****</p>
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * <p>The metadata file of the IdP. The value of this parameter is Base64-encoded.</p>
             * 
             * <strong>example:</strong>
             * <p>PD94bWwgdmVyc2lvbj0iMS4****</p>
             */
            public Builder encodedMetadataDocument(String encodedMetadataDocument) {
                this.encodedMetadataDocument = encodedMetadataDocument;
                return this;
            }

            /**
             * <p>The entity ID of the IdP.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.okta.com/exk3qwgtjhetR2Od">http://www.okta.com/exk3qwgtjhetR2Od</a>****</p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>The logon URL of the IdP.</p>
             */
            public Builder loginUrl(String loginUrl) {
                this.loginUrl = loginUrl;
                return this;
            }

            /**
             * <p>The status of SSO logon. Valid values:</p>
             * <ul>
             * <li>Enabled</li>
             * <li>Disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Disabled</p>
             */
            public Builder SSOStatus(String SSOStatus) {
                this.SSOStatus = SSOStatus;
                return this;
            }

            /**
             * <p>The time when the IdP configurations were last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-10T02:57:16Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>Indicates whether CloudSSO needs to sign SAML requests. The requests are sent when users log on to the CloudSSO user portal to initiate SAML-based SSO. Valid values:</p>
             * <ul>
             * <li>true: yes</li>
             * <li>false: no (default)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
