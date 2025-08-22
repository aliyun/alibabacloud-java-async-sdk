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
 * {@link ListApplicationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationsResponseBody</p>
 */
public class ListApplicationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Applications")
    private Applications applications;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListApplicationsResponseBody(Builder builder) {
        this.applications = builder.applications;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applications
     */
    public Applications getApplications() {
        return this.applications;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Applications applications; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListApplicationsResponseBody model) {
            this.applications = model.applications;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the application.</p>
         */
        public Builder applications(Applications applications) {
            this.applications = applications;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CE458B58-8C40-46F7-A9D4-CB85136B0C06</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListApplicationsResponseBody build() {
            return new ListApplicationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationsResponseBody</p>
     */
    public static class PredefinedScope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Required")
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

            private Builder() {
            } 

            private Builder(PredefinedScope model) {
                this.description = model.description;
                this.name = model.name;
                this.required = model.required;
            } 

            /**
             * <p>The description of the permission.</p>
             * 
             * <strong>example:</strong>
             * <p>Obtain the OpenID of the user. This is the default permission that you cannot remove.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the permission.</p>
             * 
             * <strong>example:</strong>
             * <p>openid</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Indicates whether the permission is automatically selected by default when you install the application. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * <p><code>openid</code> is required by default.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link ListApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationsResponseBody</p>
     */
    public static class PredefinedScopes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PredefinedScope")
        private java.util.List<PredefinedScope> predefinedScope;

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
        public java.util.List<PredefinedScope> getPredefinedScope() {
            return this.predefinedScope;
        }

        public static final class Builder {
            private java.util.List<PredefinedScope> predefinedScope; 

            private Builder() {
            } 

            private Builder(PredefinedScopes model) {
                this.predefinedScope = model.predefinedScope;
            } 

            /**
             * PredefinedScope.
             */
            public Builder predefinedScope(java.util.List<PredefinedScope> predefinedScope) {
                this.predefinedScope = predefinedScope;
                return this;
            }

            public PredefinedScopes build() {
                return new PredefinedScopes(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationsResponseBody</p>
     */
    public static class DelegatedScope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PredefinedScopes")
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

            private Builder() {
            } 

            private Builder(DelegatedScope model) {
                this.predefinedScopes = model.predefinedScopes;
            } 

            /**
             * <p>The information about the permissions that are granted on the application.</p>
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
    /**
     * 
     * {@link ListApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationsResponseBody</p>
     */
    public static class RedirectUris extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RedirectUri")
        private java.util.List<String> redirectUri;

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
        public java.util.List<String> getRedirectUri() {
            return this.redirectUri;
        }

        public static final class Builder {
            private java.util.List<String> redirectUri; 

            private Builder() {
            } 

            private Builder(RedirectUris model) {
                this.redirectUri = model.redirectUri;
            } 

            /**
             * RedirectUri.
             */
            public Builder redirectUri(java.util.List<String> redirectUri) {
                this.redirectUri = redirectUri;
                return this;
            }

            public RedirectUris build() {
                return new RedirectUris(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationsResponseBody</p>
     */
    public static class Application extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessTokenValidity")
        private Integer accessTokenValidity;

        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppType")
        private String appType;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("DelegatedScope")
        private DelegatedScope delegatedScope;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("IsMultiTenant")
        private Boolean isMultiTenant;

        @com.aliyun.core.annotation.NameInMap("ProtocolVersion")
        private String protocolVersion;

        @com.aliyun.core.annotation.NameInMap("RedirectUris")
        private RedirectUris redirectUris;

        @com.aliyun.core.annotation.NameInMap("RefreshTokenValidity")
        private Integer refreshTokenValidity;

        @com.aliyun.core.annotation.NameInMap("SecretRequired")
        private Boolean secretRequired;

        @com.aliyun.core.annotation.NameInMap("UpdateDate")
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
            this.protocolVersion = builder.protocolVersion;
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
         * @return protocolVersion
         */
        public String getProtocolVersion() {
            return this.protocolVersion;
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
            private String protocolVersion; 
            private RedirectUris redirectUris; 
            private Integer refreshTokenValidity; 
            private Boolean secretRequired; 
            private String updateDate; 

            private Builder() {
            } 

            private Builder(Application model) {
                this.accessTokenValidity = model.accessTokenValidity;
                this.accountId = model.accountId;
                this.appId = model.appId;
                this.appName = model.appName;
                this.appType = model.appType;
                this.createDate = model.createDate;
                this.delegatedScope = model.delegatedScope;
                this.displayName = model.displayName;
                this.isMultiTenant = model.isMultiTenant;
                this.protocolVersion = model.protocolVersion;
                this.redirectUris = model.redirectUris;
                this.refreshTokenValidity = model.refreshTokenValidity;
                this.secretRequired = model.secretRequired;
                this.updateDate = model.updateDate;
            } 

            /**
             * <p>The validity period of the access token. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder accessTokenValidity(Integer accessTokenValidity) {
                this.accessTokenValidity = accessTokenValidity;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the application belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>177242285274****</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>441442900344560****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>myapp</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The application type. Valid values:</p>
             * <ul>
             * <li>WebApp: a web application.</li>
             * <li>NativeApp: a native application that runs on an operating system, such as a desktop or mobile operating system.</li>
             * <li>ServerApp: an application that can access Alibaba Cloud services without the need for user logon. Only applications that synchronize user information based on the System for Cross-domain Identity Management (SCIM) protocol are supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>WebApp</p>
             */
            public Builder appType(String appType) {
                this.appType = appType;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-23T09:33:22Z</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The information about the permissions that are granted on the application.</p>
             */
            public Builder delegatedScope(DelegatedScope delegatedScope) {
                this.delegatedScope = delegatedScope;
                return this;
            }

            /**
             * <p>The display name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>myapp</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>Indicates whether the application can be installed by using other Alibaba Cloud accounts.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isMultiTenant(Boolean isMultiTenant) {
                this.isMultiTenant = isMultiTenant;
                return this;
            }

            /**
             * ProtocolVersion.
             */
            public Builder protocolVersion(String protocolVersion) {
                this.protocolVersion = protocolVersion;
                return this;
            }

            /**
             * <p>The callback URLs.</p>
             */
            public Builder redirectUris(RedirectUris redirectUris) {
                this.redirectUris = redirectUris;
                return this;
            }

            /**
             * <p>The validity period of the refresh token. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>7776000</p>
             */
            public Builder refreshTokenValidity(Integer refreshTokenValidity) {
                this.refreshTokenValidity = refreshTokenValidity;
                return this;
            }

            /**
             * <p>Indicates whether a secret is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder secretRequired(Boolean secretRequired) {
                this.secretRequired = secretRequired;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-23T09:33:22Z</p>
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
    /**
     * 
     * {@link ListApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationsResponseBody</p>
     */
    public static class Applications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Application")
        private java.util.List<Application> application;

        private Applications(Builder builder) {
            this.application = builder.application;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Applications create() {
            return builder().build();
        }

        /**
         * @return application
         */
        public java.util.List<Application> getApplication() {
            return this.application;
        }

        public static final class Builder {
            private java.util.List<Application> application; 

            private Builder() {
            } 

            private Builder(Applications model) {
                this.application = model.application;
            } 

            /**
             * Application.
             */
            public Builder application(java.util.List<Application> application) {
                this.application = application;
                return this;
            }

            public Applications build() {
                return new Applications(this);
            } 

        } 

    }
}
