// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetExternalSAMLIdentityProviderResponseBody model) {
            this.requestId = model.requestId;
            this.SAMLIdentityProviderConfiguration = model.SAMLIdentityProviderConfiguration;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>96D1E5FF-0301-5636-8D33-071E033CFB82</p>
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

        public GetExternalSAMLIdentityProviderResponseBody build() {
            return new GetExternalSAMLIdentityProviderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetExternalSAMLIdentityProviderResponseBody} extends {@link TeaModel}
     *
     * <p>GetExternalSAMLIdentityProviderResponseBody</p>
     */
    public static class SAMLIdentityProviderConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindingType")
        private String bindingType;

        @com.aliyun.core.annotation.NameInMap("CertificateIds")
        private java.util.List<String> certificateIds;

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
        public java.util.List<String> getCertificateIds() {
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
            private java.util.List<String> certificateIds; 
            private String createTime; 
            private String directoryId; 
            private String encodedMetadataDocument; 
            private String entityId; 
            private String loginUrl; 
            private String SSOStatus; 
            private String updateTime; 
            private Boolean wantRequestSigned; 

            private Builder() {
            } 

            private Builder(SAMLIdentityProviderConfiguration model) {
                this.bindingType = model.bindingType;
                this.certificateIds = model.certificateIds;
                this.createTime = model.createTime;
                this.directoryId = model.directoryId;
                this.encodedMetadataDocument = model.encodedMetadataDocument;
                this.entityId = model.entityId;
                this.loginUrl = model.loginUrl;
                this.SSOStatus = model.SSOStatus;
                this.updateTime = model.updateTime;
                this.wantRequestSigned = model.wantRequestSigned;
            } 

            /**
             * <p>The binding for sending SAML requests. Valid values:</p>
             * <ul>
             * <li>Post: HTTP Post bindings.</li>
             * <li>Redirect: HTTP Redirect bindings.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Post</p>
             */
            public Builder bindingType(String bindingType) {
                this.bindingType = bindingType;
                return this;
            }

            /**
             * <p>The SAML signing certificates.</p>
             */
            public Builder certificateIds(java.util.List<String> certificateIds) {
                this.certificateIds = certificateIds;
                return this;
            }

            /**
             * <p>The time when the IdP was configured for the first time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-09T09:30:13Z</p>
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
             * <p>The ID of the IdP.</p>
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
             * <p>Indicates whether SSO is enabled. Valid values:</p>
             * <ul>
             * <li>Enabled</li>
             * <li>Disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder SSOStatus(String SSOStatus) {
                this.SSOStatus = SSOStatus;
                return this;
            }

            /**
             * <p>The time when the IdP configurations were last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-09T09:30:22Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>Indicates whether CloudSSO needs to sign SAML requests. The requests are sent when users log on to the CloudSSO user portal to initiate SAML-based SSO. Valid values:</p>
             * <ul>
             * <li>true:</li>
             * <li>false (default)</li>
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
