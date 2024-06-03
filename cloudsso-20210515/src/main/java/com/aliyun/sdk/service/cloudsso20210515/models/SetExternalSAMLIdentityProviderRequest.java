// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetExternalSAMLIdentityProviderRequest} extends {@link RequestModel}
 *
 * <p>SetExternalSAMLIdentityProviderRequest</p>
 */
public class SetExternalSAMLIdentityProviderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncodedMetadataDocument")
    private String encodedMetadataDocument;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityId")
    private String entityId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginUrl")
    private String loginUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SSOStatus")
    private String SSOStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WantRequestSigned")
    private Boolean wantRequestSigned;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("X509Certificate")
    private String x509Certificate;

    private SetExternalSAMLIdentityProviderRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.encodedMetadataDocument = builder.encodedMetadataDocument;
        this.entityId = builder.entityId;
        this.loginUrl = builder.loginUrl;
        this.SSOStatus = builder.SSOStatus;
        this.wantRequestSigned = builder.wantRequestSigned;
        this.x509Certificate = builder.x509Certificate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetExternalSAMLIdentityProviderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return wantRequestSigned
     */
    public Boolean getWantRequestSigned() {
        return this.wantRequestSigned;
    }

    /**
     * @return x509Certificate
     */
    public String getX509Certificate() {
        return this.x509Certificate;
    }

    public static final class Builder extends Request.Builder<SetExternalSAMLIdentityProviderRequest, Builder> {
        private String directoryId; 
        private String encodedMetadataDocument; 
        private String entityId; 
        private String loginUrl; 
        private String SSOStatus; 
        private Boolean wantRequestSigned; 
        private String x509Certificate; 

        private Builder() {
            super();
        } 

        private Builder(SetExternalSAMLIdentityProviderRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.encodedMetadataDocument = request.encodedMetadataDocument;
            this.entityId = request.entityId;
            this.loginUrl = request.loginUrl;
            this.SSOStatus = request.SSOStatus;
            this.wantRequestSigned = request.wantRequestSigned;
            this.x509Certificate = request.x509Certificate;
        } 

        /**
         * The ID of the directory.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * The metadata file of the IdP. The value of this parameter is Base64-encoded.
         * <p>
         * 
         * The file is provided by the IdP that supports SAML 2.0.
         */
        public Builder encodedMetadataDocument(String encodedMetadataDocument) {
            this.putQueryParameter("EncodedMetadataDocument", encodedMetadataDocument);
            this.encodedMetadataDocument = encodedMetadataDocument;
            return this;
        }

        /**
         * The entity ID of the IdP.
         */
        public Builder entityId(String entityId) {
            this.putQueryParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        /**
         * The logon URL of the IdP.
         */
        public Builder loginUrl(String loginUrl) {
            this.putQueryParameter("LoginUrl", loginUrl);
            this.loginUrl = loginUrl;
            return this;
        }

        /**
         * The status of SSO logon. Valid values:
         * <p>
         * 
         * *   Enabled
         * *   Disabled (default)
         */
        public Builder SSOStatus(String SSOStatus) {
            this.putQueryParameter("SSOStatus", SSOStatus);
            this.SSOStatus = SSOStatus;
            return this;
        }

        /**
         * Specifies whether CloudSSO needs to sign SAML requests. The requests are sent when users log on to the CloudSSO user portal to initiate SAML-based SSO. Valid values:
         * <p>
         * 
         * *   true: yes
         * *   false: no (default)
         */
        public Builder wantRequestSigned(Boolean wantRequestSigned) {
            this.putQueryParameter("WantRequestSigned", wantRequestSigned);
            this.wantRequestSigned = wantRequestSigned;
            return this;
        }

        /**
         * The X.509 certificate in the PEM format. If you specify this parameter, all existing certificates are replaced.
         */
        public Builder x509Certificate(String x509Certificate) {
            this.putQueryParameter("X509Certificate", x509Certificate);
            this.x509Certificate = x509Certificate;
            return this;
        }

        @Override
        public SetExternalSAMLIdentityProviderRequest build() {
            return new SetExternalSAMLIdentityProviderRequest(this);
        } 

    } 

}
