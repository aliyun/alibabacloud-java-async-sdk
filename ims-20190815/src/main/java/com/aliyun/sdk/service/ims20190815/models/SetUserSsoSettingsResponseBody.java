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
 * {@link SetUserSsoSettingsResponseBody} extends {@link TeaModel}
 *
 * <p>SetUserSsoSettingsResponseBody</p>
 */
public class SetUserSsoSettingsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserSsoSettings")
    private UserSsoSettings userSsoSettings;

    private SetUserSsoSettingsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userSsoSettings = builder.userSsoSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetUserSsoSettingsResponseBody create() {
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
     * @return userSsoSettings
     */
    public UserSsoSettings getUserSsoSettings() {
        return this.userSsoSettings;
    }

    public static final class Builder {
        private String requestId; 
        private UserSsoSettings userSsoSettings; 

        private Builder() {
        } 

        private Builder(SetUserSsoSettingsResponseBody model) {
            this.requestId = model.requestId;
            this.userSsoSettings = model.userSsoSettings;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>87F2E3F6-28A0-43F3-A77F-F7760E62F61E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The configurations of user-based SSO.</p>
         */
        public Builder userSsoSettings(UserSsoSettings userSsoSettings) {
            this.userSsoSettings = userSsoSettings;
            return this;
        }

        public SetUserSsoSettingsResponseBody build() {
            return new SetUserSsoSettingsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SetUserSsoSettingsResponseBody} extends {@link TeaModel}
     *
     * <p>SetUserSsoSettingsResponseBody</p>
     */
    public static class UserSsoSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthnSignAlgo")
        private String authnSignAlgo;

        @com.aliyun.core.annotation.NameInMap("AuxiliaryDomain")
        private String auxiliaryDomain;

        @com.aliyun.core.annotation.NameInMap("MetadataDocument")
        private String metadataDocument;

        @com.aliyun.core.annotation.NameInMap("SsoEnabled")
        private Boolean ssoEnabled;

        @com.aliyun.core.annotation.NameInMap("SsoLoginWithDomain")
        private Boolean ssoLoginWithDomain;

        private UserSsoSettings(Builder builder) {
            this.authnSignAlgo = builder.authnSignAlgo;
            this.auxiliaryDomain = builder.auxiliaryDomain;
            this.metadataDocument = builder.metadataDocument;
            this.ssoEnabled = builder.ssoEnabled;
            this.ssoLoginWithDomain = builder.ssoLoginWithDomain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserSsoSettings create() {
            return builder().build();
        }

        /**
         * @return authnSignAlgo
         */
        public String getAuthnSignAlgo() {
            return this.authnSignAlgo;
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

        public static final class Builder {
            private String authnSignAlgo; 
            private String auxiliaryDomain; 
            private String metadataDocument; 
            private Boolean ssoEnabled; 
            private Boolean ssoLoginWithDomain; 

            private Builder() {
            } 

            private Builder(UserSsoSettings model) {
                this.authnSignAlgo = model.authnSignAlgo;
                this.auxiliaryDomain = model.auxiliaryDomain;
                this.metadataDocument = model.metadataDocument;
                this.ssoEnabled = model.ssoEnabled;
                this.ssoLoginWithDomain = model.ssoLoginWithDomain;
            } 

            /**
             * AuthnSignAlgo.
             */
            public Builder authnSignAlgo(String authnSignAlgo) {
                this.authnSignAlgo = authnSignAlgo;
                return this;
            }

            /**
             * <p>The auxiliary domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder auxiliaryDomain(String auxiliaryDomain) {
                this.auxiliaryDomain = auxiliaryDomain;
                return this;
            }

            /**
             * <p>The metadata file, which is Base64-encoded.</p>
             * 
             * <strong>example:</strong>
             * <p>PD94bWwgdmVy****</p>
             */
            public Builder metadataDocument(String metadataDocument) {
                this.metadataDocument = metadataDocument;
                return this;
            }

            /**
             * <p>Indicates whether user-based SSO is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ssoEnabled(Boolean ssoEnabled) {
                this.ssoEnabled = ssoEnabled;
                return this;
            }

            /**
             * <p>Indicates whether the SAML SSO requires a domain name in the <code>&lt;saml:NameID&gt;</code> element of the SAML response. If yes, the username specified by the IdP for SSO must have a domain name as the suffix.</p>
             * <ul>
             * <li>If the value of the parameter is <code>true</code>, the <code>&lt;saml:NameID&gt;</code> element <strong>must</strong> be in the <code>username@domain</code> format. You can set <code>domain</code> to the default domain name or the configured domain alias.</li>
             * <li>If the value of the parameter is <code>false</code>, the <code>&lt;saml:NameID&gt;</code> element <strong>must</strong> be in the <code>username</code> format and <strong>cannot</strong> contain the <code>domain</code> suffix.</li>
             * </ul>
             * <p>The default value is <code>true</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ssoLoginWithDomain(Boolean ssoLoginWithDomain) {
                this.ssoLoginWithDomain = ssoLoginWithDomain;
                return this;
            }

            public UserSsoSettings build() {
                return new UserSsoSettings(this);
            } 

        } 

    }
}
