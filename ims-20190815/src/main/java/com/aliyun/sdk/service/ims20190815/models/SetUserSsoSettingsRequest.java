// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link SetUserSsoSettingsRequest} extends {@link RequestModel}
 *
 * <p>SetUserSsoSettingsRequest</p>
 */
public class SetUserSsoSettingsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuxiliaryDomain")
    private String auxiliaryDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetadataDocument")
    private String metadataDocument;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SsoEnabled")
    private Boolean ssoEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SsoLoginWithDomain")
    private Boolean ssoLoginWithDomain;

    private SetUserSsoSettingsRequest(Builder builder) {
        super(builder);
        this.auxiliaryDomain = builder.auxiliaryDomain;
        this.metadataDocument = builder.metadataDocument;
        this.ssoEnabled = builder.ssoEnabled;
        this.ssoLoginWithDomain = builder.ssoLoginWithDomain;
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

    /**
     * @return ssoLoginWithDomain
     */
    public Boolean getSsoLoginWithDomain() {
        return this.ssoLoginWithDomain;
    }

    public static final class Builder extends Request.Builder<SetUserSsoSettingsRequest, Builder> {
        private String auxiliaryDomain; 
        private String metadataDocument; 
        private Boolean ssoEnabled; 
        private Boolean ssoLoginWithDomain; 

        private Builder() {
            super();
        } 

        private Builder(SetUserSsoSettingsRequest request) {
            super(request);
            this.auxiliaryDomain = request.auxiliaryDomain;
            this.metadataDocument = request.metadataDocument;
            this.ssoEnabled = request.ssoEnabled;
            this.ssoLoginWithDomain = request.ssoLoginWithDomain;
        } 

        /**
         * <p>The auxiliary domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder auxiliaryDomain(String auxiliaryDomain) {
            this.putQueryParameter("AuxiliaryDomain", auxiliaryDomain);
            this.auxiliaryDomain = auxiliaryDomain;
            return this;
        }

        /**
         * <p>The metadata file, which is Base64-encoded.</p>
         * <p>The file is provided by an identity provider (IdP) that supports Security Assertion Markup Language (SAML) 2.0.</p>
         * 
         * <strong>example:</strong>
         * <p>PD94bWwgdmVy****</p>
         */
        public Builder metadataDocument(String metadataDocument) {
            this.putQueryParameter("MetadataDocument", metadataDocument);
            this.metadataDocument = metadataDocument;
            return this;
        }

        /**
         * <p>Specifies whether to enable SSO for the RAM user. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ssoEnabled(Boolean ssoEnabled) {
            this.putQueryParameter("SsoEnabled", ssoEnabled);
            this.ssoEnabled = ssoEnabled;
            return this;
        }

        /**
         * <p>Specifies whether the SAML SSO requires a domain name in the <code>&lt;saml:NameID&gt;</code> element of the SAML response. If yes, the username specified by the IdP for SSO must have a domain name as the suffix.</p>
         * <ul>
         * <li>If the value of the parameter is <code>true</code>, the <code>&lt;saml:NameID&gt;</code> element <strong>must</strong> be in the <code>username@domain</code> format. You can set <code>domain</code> to the default domain name or the configured domain alias.</li>
         * <li>If the value of the parameter is <code>false</code>, the <code>&lt;saml:NameID&gt;</code> element <strong>must</strong> be in the <code>username</code> format and <strong>cannot</strong> contain the <code>domain</code> suffix.</li>
         * </ul>
         * <p>Set the value to the default <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ssoLoginWithDomain(Boolean ssoLoginWithDomain) {
            this.putQueryParameter("SsoLoginWithDomain", ssoLoginWithDomain);
            this.ssoLoginWithDomain = ssoLoginWithDomain;
            return this;
        }

        @Override
        public SetUserSsoSettingsRequest build() {
            return new SetUserSsoSettingsRequest(this);
        } 

    } 

}
