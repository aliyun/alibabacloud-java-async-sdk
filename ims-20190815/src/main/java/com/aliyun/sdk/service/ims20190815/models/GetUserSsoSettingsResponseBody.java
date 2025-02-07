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
 * {@link GetUserSsoSettingsResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserSsoSettingsResponseBody</p>
 */
public class GetUserSsoSettingsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserSsoSettings")
    private UserSsoSettings userSsoSettings;

    private GetUserSsoSettingsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userSsoSettings = builder.userSsoSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserSsoSettingsResponseBody create() {
        return builder().build();
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

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>69FC3E5E-D3D9-434B-90CA-BBA8E0551A47</p>
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

        public GetUserSsoSettingsResponseBody build() {
            return new GetUserSsoSettingsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserSsoSettingsResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserSsoSettingsResponseBody</p>
     */
    public static class UserSsoSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuxiliaryDomain")
        private String auxiliaryDomain;

        @com.aliyun.core.annotation.NameInMap("MetadataDocument")
        private String metadataDocument;

        @com.aliyun.core.annotation.NameInMap("SsoEnabled")
        private Boolean ssoEnabled;

        @com.aliyun.core.annotation.NameInMap("SsoLoginWithDomain")
        private Boolean ssoLoginWithDomain;

        private UserSsoSettings(Builder builder) {
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
            private String auxiliaryDomain; 
            private String metadataDocument; 
            private Boolean ssoEnabled; 
            private Boolean ssoLoginWithDomain; 

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
             * <p>false</p>
             */
            public Builder ssoEnabled(Boolean ssoEnabled) {
                this.ssoEnabled = ssoEnabled;
                return this;
            }

            /**
             * <p>Indicates whether the Security Assertion Markup Language (SAML) SSO requires a domain name in the <code>&lt;saml:NameID&gt;</code> element of the SAML response. If yes, the username specified by the identity provider (IdP) for SSO must have a domain name as the suffix.</p>
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
