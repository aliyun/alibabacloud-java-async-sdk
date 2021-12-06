// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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

    public static final class Builder extends Request.Builder {
        private String directoryId; 
        private String encodedMetadataDocument; 
        private String entityId; 
        private String loginUrl; 
        private String SSOStatus; 
        private Boolean wantRequestSigned; 
        private String x509Certificate; 

        /**
         * <p>DirectoryId.</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>EncodedMetadataDocument.</p>
         */
        public Builder encodedMetadataDocument(String encodedMetadataDocument) {
            this.putQueryParameter("EncodedMetadataDocument", encodedMetadataDocument);
            this.encodedMetadataDocument = encodedMetadataDocument;
            return this;
        }

        /**
         * <p>EntityId.</p>
         */
        public Builder entityId(String entityId) {
            this.putQueryParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        /**
         * <p>LoginUrl.</p>
         */
        public Builder loginUrl(String loginUrl) {
            this.putQueryParameter("LoginUrl", loginUrl);
            this.loginUrl = loginUrl;
            return this;
        }

        /**
         * <p>SSOStatus.</p>
         */
        public Builder SSOStatus(String SSOStatus) {
            this.putQueryParameter("SSOStatus", SSOStatus);
            this.SSOStatus = SSOStatus;
            return this;
        }

        /**
         * <p>WantRequestSigned.</p>
         */
        public Builder wantRequestSigned(Boolean wantRequestSigned) {
            this.putQueryParameter("WantRequestSigned", wantRequestSigned);
            this.wantRequestSigned = wantRequestSigned;
            return this;
        }

        /**
         * <p>X509Certificate.</p>
         */
        public Builder x509Certificate(String x509Certificate) {
            this.putQueryParameter("X509Certificate", x509Certificate);
            this.x509Certificate = x509Certificate;
            return this;
        }

        public SetExternalSAMLIdentityProviderRequest build() {
            return new SetExternalSAMLIdentityProviderRequest(this);
        } 

    } 

}
