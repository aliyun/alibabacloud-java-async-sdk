// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>GetApplicationResponseBody</p>
 */
public class GetApplicationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Application")
    private Application application;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * The details of the application.
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

    public static class Application extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiInvokeStatus")
        private String apiInvokeStatus;

        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("ApplicationName")
        private String applicationName;

        @com.aliyun.core.annotation.NameInMap("ApplicationSourceType")
        private String applicationSourceType;

        @com.aliyun.core.annotation.NameInMap("ApplicationTemplateId")
        private String applicationTemplateId;

        @com.aliyun.core.annotation.NameInMap("AuthorizationType")
        private String authorizationType;

        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Features")
        private String features;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LogoUrl")
        private String logoUrl;

        @com.aliyun.core.annotation.NameInMap("ManagedServiceCode")
        private String managedServiceCode;

        @com.aliyun.core.annotation.NameInMap("ServiceManaged")
        private Boolean serviceManaged;

        @com.aliyun.core.annotation.NameInMap("SsoType")
        private String ssoType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private Application(Builder builder) {
            this.apiInvokeStatus = builder.apiInvokeStatus;
            this.applicationId = builder.applicationId;
            this.applicationName = builder.applicationName;
            this.applicationSourceType = builder.applicationSourceType;
            this.applicationTemplateId = builder.applicationTemplateId;
            this.authorizationType = builder.authorizationType;
            this.clientId = builder.clientId;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.features = builder.features;
            this.instanceId = builder.instanceId;
            this.logoUrl = builder.logoUrl;
            this.managedServiceCode = builder.managedServiceCode;
            this.serviceManaged = builder.serviceManaged;
            this.ssoType = builder.ssoType;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Application create() {
            return builder().build();
        }

        /**
         * @return apiInvokeStatus
         */
        public String getApiInvokeStatus() {
            return this.apiInvokeStatus;
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return applicationName
         */
        public String getApplicationName() {
            return this.applicationName;
        }

        /**
         * @return applicationSourceType
         */
        public String getApplicationSourceType() {
            return this.applicationSourceType;
        }

        /**
         * @return applicationTemplateId
         */
        public String getApplicationTemplateId() {
            return this.applicationTemplateId;
        }

        /**
         * @return authorizationType
         */
        public String getAuthorizationType() {
            return this.authorizationType;
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return features
         */
        public String getFeatures() {
            return this.features;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return logoUrl
         */
        public String getLogoUrl() {
            return this.logoUrl;
        }

        /**
         * @return managedServiceCode
         */
        public String getManagedServiceCode() {
            return this.managedServiceCode;
        }

        /**
         * @return serviceManaged
         */
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        /**
         * @return ssoType
         */
        public String getSsoType() {
            return this.ssoType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String apiInvokeStatus; 
            private String applicationId; 
            private String applicationName; 
            private String applicationSourceType; 
            private String applicationTemplateId; 
            private String authorizationType; 
            private String clientId; 
            private Long createTime; 
            private String description; 
            private String features; 
            private String instanceId; 
            private String logoUrl; 
            private String managedServiceCode; 
            private Boolean serviceManaged; 
            private String ssoType; 
            private String status; 
            private Long updateTime; 

            /**
             * The status of the Developer API feature. Valid values:
             * <p>
             * 
             * *   Enabled: The Developer API feature is enabled.
             * *   Disabled: The Developer API feature is disabled.
             */
            public Builder apiInvokeStatus(String apiInvokeStatus) {
                this.apiInvokeStatus = apiInvokeStatus;
                return this;
            }

            /**
             * The ID of the application.
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * The name of the application.
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * The origin of the application. Valid values:
             * <p>
             * 
             * *   urn:alibaba:idaas:app:source:template: The application is created based on a template.
             * *   urn:alibaba:idaas: The application is created based on the standard protocol.
             */
            public Builder applicationSourceType(String applicationSourceType) {
                this.applicationSourceType = applicationSourceType;
                return this;
            }

            /**
             * The ID of the template based on which the application is created. This parameter is returned only if the application is created based on a template.
             */
            public Builder applicationTemplateId(String applicationTemplateId) {
                this.applicationTemplateId = applicationTemplateId;
                return this;
            }

            /**
             * The authorization type of the EIAM application. Valid values:
             * <p>
             * 
             * *   authorize_required: Only the user with explicit authorization can access the application.
             * *   default_all: By default, all users can access the application.
             */
            public Builder authorizationType(String authorizationType) {
                this.authorizationType = authorizationType;
                return this;
            }

            /**
             * The client ID of the application.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * The time when the application was created. The value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the application.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The features that are supported by the application. The value is a JSON array. Valid values:
             * <p>
             * 
             * *   sso: The application supports SSO.
             * *   provision: The application supports account synchronization.
             * *   api_invoke: The application supports custom APIs.
             */
            public Builder features(String features) {
                this.features = features;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The URL of the application icon.
             */
            public Builder logoUrl(String logoUrl) {
                this.logoUrl = logoUrl;
                return this;
            }

            /**
             * The service code of the cloud service that manages the application template.
             */
            public Builder managedServiceCode(String managedServiceCode) {
                this.managedServiceCode = managedServiceCode;
                return this;
            }

            /**
             * Indicates whether the application template is managed by a cloud service.
             */
            public Builder serviceManaged(Boolean serviceManaged) {
                this.serviceManaged = serviceManaged;
                return this;
            }

            /**
             * The type of the single sign-on (SSO) protocol. Valid values:
             * <p>
             * 
             * *   saml2: the Security Assertion Markup Language (SAML) 2.0 protocol.
             * *   oidc: the OpenID Connect (OIDC) protocol.
             */
            public Builder ssoType(String ssoType) {
                this.ssoType = ssoType;
                return this;
            }

            /**
             * The status of the application. Valid values:
             * <p>
             * 
             * *   Enabled: The application is enabled.
             * *   Disabled: The application is disabled.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The time when the application was last updated. The value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Application build() {
                return new Application(this);
            } 

        } 

    }
}
