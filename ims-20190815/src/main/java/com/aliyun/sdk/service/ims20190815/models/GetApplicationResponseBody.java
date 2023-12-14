// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>GetApplicationResponseBody</p>
 */
public class GetApplicationResponseBody extends TeaModel {
    @NameInMap("Application")
    private Application application;

    @NameInMap("RequestId")
    private String requestId;

    private GetApplicationResponseBody(Builder builder) {
        this.application = builder.application;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApplicationResponseBody create() {
        return builder().build();
    }

    /**
     * @return application
     */
    public Application getApplication() {
        return this.application;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Application application; 
        private String requestId; 

        /**
         * The configuration information about the application.
         */
        public Builder application(Application application) {
            this.application = application;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetApplicationResponseBody build() {
            return new GetApplicationResponseBody(this);
        } 

    } 

    public static class PredefinedScope extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Required")
        private Boolean required;

        private PredefinedScope(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.required = builder.required;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PredefinedScope create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return required
         */
        public Boolean getRequired() {
            return this.required;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private Boolean required; 

            /**
             * The description of the permission.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the permission.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Required.
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            public PredefinedScope build() {
                return new PredefinedScope(this);
            } 

        } 

    }
    public static class PredefinedScopes extends TeaModel {
        @NameInMap("PredefinedScope")
        private java.util.List < PredefinedScope> predefinedScope;

        private PredefinedScopes(Builder builder) {
            this.predefinedScope = builder.predefinedScope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PredefinedScopes create() {
            return builder().build();
        }

        /**
         * @return predefinedScope
         */
        public java.util.List < PredefinedScope> getPredefinedScope() {
            return this.predefinedScope;
        }

        public static final class Builder {
            private java.util.List < PredefinedScope> predefinedScope; 

            /**
             * PredefinedScope.
             */
            public Builder predefinedScope(java.util.List < PredefinedScope> predefinedScope) {
                this.predefinedScope = predefinedScope;
                return this;
            }

            public PredefinedScopes build() {
                return new PredefinedScopes(this);
            } 

        } 

    }
    public static class DelegatedScope extends TeaModel {
        @NameInMap("PredefinedScopes")
        private PredefinedScopes predefinedScopes;

        private DelegatedScope(Builder builder) {
            this.predefinedScopes = builder.predefinedScopes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DelegatedScope create() {
            return builder().build();
        }

        /**
         * @return predefinedScopes
         */
        public PredefinedScopes getPredefinedScopes() {
            return this.predefinedScopes;
        }

        public static final class Builder {
            private PredefinedScopes predefinedScopes; 

            /**
             * The information about the permissions that are granted on the application.
             */
            public Builder predefinedScopes(PredefinedScopes predefinedScopes) {
                this.predefinedScopes = predefinedScopes;
                return this;
            }

            public DelegatedScope build() {
                return new DelegatedScope(this);
            } 

        } 

    }
    public static class RedirectUris extends TeaModel {
        @NameInMap("RedirectUri")
        private java.util.List < String > redirectUri;

        private RedirectUris(Builder builder) {
            this.redirectUri = builder.redirectUri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RedirectUris create() {
            return builder().build();
        }

        /**
         * @return redirectUri
         */
        public java.util.List < String > getRedirectUri() {
            return this.redirectUri;
        }

        public static final class Builder {
            private java.util.List < String > redirectUri; 

            /**
             * RedirectUri.
             */
            public Builder redirectUri(java.util.List < String > redirectUri) {
                this.redirectUri = redirectUri;
                return this;
            }

            public RedirectUris build() {
                return new RedirectUris(this);
            } 

        } 

    }
    public static class Application extends TeaModel {
        @NameInMap("AccessTokenValidity")
        private Integer accessTokenValidity;

        @NameInMap("AccountId")
        private String accountId;

        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("AppType")
        private String appType;

        @NameInMap("CreateDate")
        private String createDate;

        @NameInMap("DelegatedScope")
        private DelegatedScope delegatedScope;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("IsMultiTenant")
        private Boolean isMultiTenant;

        @NameInMap("RedirectUris")
        private RedirectUris redirectUris;

        @NameInMap("RefreshTokenValidity")
        private Integer refreshTokenValidity;

        @NameInMap("SecretRequired")
        private Boolean secretRequired;

        @NameInMap("UpdateDate")
        private String updateDate;

        private Application(Builder builder) {
            this.accessTokenValidity = builder.accessTokenValidity;
            this.accountId = builder.accountId;
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.appType = builder.appType;
            this.createDate = builder.createDate;
            this.delegatedScope = builder.delegatedScope;
            this.displayName = builder.displayName;
            this.isMultiTenant = builder.isMultiTenant;
            this.redirectUris = builder.redirectUris;
            this.refreshTokenValidity = builder.refreshTokenValidity;
            this.secretRequired = builder.secretRequired;
            this.updateDate = builder.updateDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Application create() {
            return builder().build();
        }

        /**
         * @return accessTokenValidity
         */
        public Integer getAccessTokenValidity() {
            return this.accessTokenValidity;
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return appType
         */
        public String getAppType() {
            return this.appType;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return delegatedScope
         */
        public DelegatedScope getDelegatedScope() {
            return this.delegatedScope;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return isMultiTenant
         */
        public Boolean getIsMultiTenant() {
            return this.isMultiTenant;
        }

        /**
         * @return redirectUris
         */
        public RedirectUris getRedirectUris() {
            return this.redirectUris;
        }

        /**
         * @return refreshTokenValidity
         */
        public Integer getRefreshTokenValidity() {
            return this.refreshTokenValidity;
        }

        /**
         * @return secretRequired
         */
        public Boolean getSecretRequired() {
            return this.secretRequired;
        }

        /**
         * @return updateDate
         */
        public String getUpdateDate() {
            return this.updateDate;
        }

        public static final class Builder {
            private Integer accessTokenValidity; 
            private String accountId; 
            private String appId; 
            private String appName; 
            private String appType; 
            private String createDate; 
            private DelegatedScope delegatedScope; 
            private String displayName; 
            private Boolean isMultiTenant; 
            private RedirectUris redirectUris; 
            private Integer refreshTokenValidity; 
            private Boolean secretRequired; 
            private String updateDate; 

            /**
             * The validity period of the access token. Unit: seconds.
             */
            public Builder accessTokenValidity(Integer accessTokenValidity) {
                this.accessTokenValidity = accessTokenValidity;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the application belongs.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The name of the application.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * The type of the application. Valid values:
             * <p>
             * 
             * *   WebApp: a web application.
             * *   NativeApp: a native application that runs on an operating system, such as a desktop or mobile operating system.
             * *   ServerApp: an application that can access Alibaba Cloud services without the need for user logon. Only applications that synchronize user information based on the System for Cross-domain Identity Management (SCIM) protocol are supported.
             */
            public Builder appType(String appType) {
                this.appType = appType;
                return this;
            }

            /**
             * The creation time.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * The information about the permissions that are granted on the application.
             */
            public Builder delegatedScope(DelegatedScope delegatedScope) {
                this.delegatedScope = delegatedScope;
                return this;
            }

            /**
             * The display name of the application.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * Indicates whether the application can be installed by using other Alibaba Cloud accounts.
             */
            public Builder isMultiTenant(Boolean isMultiTenant) {
                this.isMultiTenant = isMultiTenant;
                return this;
            }

            /**
             * The callback URL.
             */
            public Builder redirectUris(RedirectUris redirectUris) {
                this.redirectUris = redirectUris;
                return this;
            }

            /**
             * The validity period of the refresh token. Unit: seconds.
             */
            public Builder refreshTokenValidity(Integer refreshTokenValidity) {
                this.refreshTokenValidity = refreshTokenValidity;
                return this;
            }

            /**
             * Indicates whether a secret is required.
             */
            public Builder secretRequired(Boolean secretRequired) {
                this.secretRequired = secretRequired;
                return this;
            }

            /**
             * The update time.
             */
            public Builder updateDate(String updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            public Application build() {
                return new Application(this);
            } 

        } 

    }
}
