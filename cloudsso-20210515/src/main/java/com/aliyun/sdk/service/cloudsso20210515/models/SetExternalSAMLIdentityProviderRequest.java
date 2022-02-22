// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetExternalSAMLIdentityProviderRequest} extends {@link RequestModel}
 *
 * <p>SetExternalSAMLIdentityProviderRequest</p>
 */
public class SetExternalSAMLIdentityProviderRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("EncodedMetadataDocument")
    private String encodedMetadataDocument;

    @Query
    @NameInMap("EntityId")
    private String entityId;

    @Query
    @NameInMap("LoginUrl")
    private String loginUrl;

    @Query
    @NameInMap("SSOStatus")
    private String SSOStatus;

    @Query
    @NameInMap("WantRequestSigned")
    private Boolean wantRequestSigned;

    @Query
    @NameInMap("X509Certificate")
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

        private Builder(SetExternalSAMLIdentityProviderRequest response) {
            super(response);
            this.directoryId = response.directoryId;
            this.encodedMetadataDocument = response.encodedMetadataDocument;
            this.entityId = response.entityId;
            this.loginUrl = response.loginUrl;
            this.SSOStatus = response.SSOStatus;
            this.wantRequestSigned = response.wantRequestSigned;
            this.x509Certificate = response.x509Certificate;
        } 

        /**
         * DirectoryId.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * EncodedMetadataDocument.
         */
        public Builder encodedMetadataDocument(String encodedMetadataDocument) {
            this.putQueryParameter("EncodedMetadataDocument", encodedMetadataDocument);
            this.encodedMetadataDocument = encodedMetadataDocument;
            return this;
        }

        /**
         * EntityId.
         */
        public Builder entityId(String entityId) {
            this.putQueryParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        /**
         * LoginUrl.
         */
        public Builder loginUrl(String loginUrl) {
            this.putQueryParameter("LoginUrl", loginUrl);
            this.loginUrl = loginUrl;
            return this;
        }

        /**
         * SSOStatus.
         */
        public Builder SSOStatus(String SSOStatus) {
            this.putQueryParameter("SSOStatus", SSOStatus);
            this.SSOStatus = SSOStatus;
            return this;
        }

        /**
         * WantRequestSigned.
         */
        public Builder wantRequestSigned(Boolean wantRequestSigned) {
            this.putQueryParameter("WantRequestSigned", wantRequestSigned);
            this.wantRequestSigned = wantRequestSigned;
            return this;
        }

        /**
         * X509Certificate.
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
