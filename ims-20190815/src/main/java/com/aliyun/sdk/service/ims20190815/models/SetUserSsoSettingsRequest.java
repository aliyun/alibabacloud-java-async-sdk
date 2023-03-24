// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetUserSsoSettingsRequest} extends {@link RequestModel}
 *
 * <p>SetUserSsoSettingsRequest</p>
 */
public class SetUserSsoSettingsRequest extends Request {
    @Query
    @NameInMap("AuxiliaryDomain")
    private String auxiliaryDomain;

    @Query
    @NameInMap("MetadataDocument")
    private String metadataDocument;

    @Query
    @NameInMap("SsoEnabled")
    private Boolean ssoEnabled;

    private SetUserSsoSettingsRequest(Builder builder) {
        super(builder);
        this.auxiliaryDomain = builder.auxiliaryDomain;
        this.metadataDocument = builder.metadataDocument;
        this.ssoEnabled = builder.ssoEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetUserSsoSettingsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auxiliaryDomain
     */
    public String getAuxiliaryDomain() {
        return this.auxiliaryDomain;
    }

    /**
     * @return metadataDocument
     */
    public String getMetadataDocument() {
        return this.metadataDocument;
    }

    /**
     * @return ssoEnabled
     */
    public Boolean getSsoEnabled() {
        return this.ssoEnabled;
    }

    public static final class Builder extends Request.Builder<SetUserSsoSettingsRequest, Builder> {
        private String auxiliaryDomain; 
        private String metadataDocument; 
        private Boolean ssoEnabled; 

        private Builder() {
            super();
        } 

        private Builder(SetUserSsoSettingsRequest request) {
            super(request);
            this.auxiliaryDomain = request.auxiliaryDomain;
            this.metadataDocument = request.metadataDocument;
            this.ssoEnabled = request.ssoEnabled;
        } 

        /**
         * The auxiliary domain name.
         */
        public Builder auxiliaryDomain(String auxiliaryDomain) {
            this.putQueryParameter("AuxiliaryDomain", auxiliaryDomain);
            this.auxiliaryDomain = auxiliaryDomain;
            return this;
        }

        /**
         * The metadata file, which is Base64-encoded.
         * <p>
         * 
         * The file is provided by an IdP that supports SAML 2.0.
         */
        public Builder metadataDocument(String metadataDocument) {
            this.putQueryParameter("MetadataDocument", metadataDocument);
            this.metadataDocument = metadataDocument;
            return this;
        }

        /**
         * Specifies whether to enable SSO for the RAM user. Default value: false. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder ssoEnabled(Boolean ssoEnabled) {
            this.putQueryParameter("SsoEnabled", ssoEnabled);
            this.ssoEnabled = ssoEnabled;
            return this;
        }

        @Override
        public SetUserSsoSettingsRequest build() {
            return new SetUserSsoSettingsRequest(this);
        } 

    } 

}
