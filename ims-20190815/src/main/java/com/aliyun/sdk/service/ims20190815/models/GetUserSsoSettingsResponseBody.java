// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The configurations of user-based SSO.
         */
        public Builder userSsoSettings(UserSsoSettings userSsoSettings) {
            this.userSsoSettings = userSsoSettings;
            return this;
        }

        public GetUserSsoSettingsResponseBody build() {
            return new GetUserSsoSettingsResponseBody(this);
        } 

    } 

    public static class UserSsoSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuxiliaryDomain")
        private String auxiliaryDomain;

        @com.aliyun.core.annotation.NameInMap("MetadataDocument")
        private String metadataDocument;

        @com.aliyun.core.annotation.NameInMap("SsoEnabled")
        private Boolean ssoEnabled;

        private UserSsoSettings(Builder builder) {
            this.auxiliaryDomain = builder.auxiliaryDomain;
            this.metadataDocument = builder.metadataDocument;
            this.ssoEnabled = builder.ssoEnabled;
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

        public static final class Builder {
            private String auxiliaryDomain; 
            private String metadataDocument; 
            private Boolean ssoEnabled; 

            /**
             * The auxiliary domain name.
             */
            public Builder auxiliaryDomain(String auxiliaryDomain) {
                this.auxiliaryDomain = auxiliaryDomain;
                return this;
            }

            /**
             * The metadata file, which is Base64-encoded.
             */
            public Builder metadataDocument(String metadataDocument) {
                this.metadataDocument = metadataDocument;
                return this;
            }

            /**
             * Indicates whether user-based SSO is enabled.
             */
            public Builder ssoEnabled(Boolean ssoEnabled) {
                this.ssoEnabled = ssoEnabled;
                return this;
            }

            public UserSsoSettings build() {
                return new UserSsoSettings(this);
            } 

        } 

    }
}
