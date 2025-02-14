// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
         * <p>The details of the application.</p>
         */
        public Builder application(Application application) {
            this.application = application;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetApplicationResponseBody build() {
            return new GetApplicationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationResponseBody</p>
     */
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

        @com.aliyun.core.annotation.NameInMap("ApplicationVisibility")
        private java.util.List<String> applicationVisibility;

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

        @com.aliyun.core.annotation.NameInMap("M2MClientStatus")
        private String m2MClientStatus;

        @com.aliyun.core.annotation.NameInMap("ManagedServiceCode")
        private String managedServiceCode;

        @com.aliyun.core.annotation.NameInMap("ResourceServerIdentifier")
        private String resourceServerIdentifier;

        @com.aliyun.core.annotation.NameInMap("ResourceServerStatus")
        private String resourceServerStatus;

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
            this.applicationVisibility = builder.applicationVisibility;
            this.authorizationType = builder.authorizationType;
            this.clientId = builder.clientId;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.features = builder.features;
            this.instanceId = builder.instanceId;
            this.logoUrl = builder.logoUrl;
            this.m2MClientStatus = builder.m2MClientStatus;
            this.managedServiceCode = builder.managedServiceCode;
            this.resourceServerIdentifier = builder.resourceServerIdentifier;
            this.resourceServerStatus = builder.resourceServerStatus;
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
         * @return applicationVisibility
         */
        public java.util.List<String> getApplicationVisibility() {
            return this.applicationVisibility;
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
         * @return m2MClientStatus
         */
        public String getM2MClientStatus() {
            return this.m2MClientStatus;
        }

        /**
         * @return managedServiceCode
         */
        public String getManagedServiceCode() {
            return this.managedServiceCode;
        }

        /**
         * @return resourceServerIdentifier
         */
        public String getResourceServerIdentifier() {
            return this.resourceServerIdentifier;
        }

        /**
         * @return resourceServerStatus
         */
        public String getResourceServerStatus() {
            return this.resourceServerStatus;
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
            private java.util.List<String> applicationVisibility; 
            private String authorizationType; 
            private String clientId; 
            private Long createTime; 
            private String description; 
            private String features; 
            private String instanceId; 
            private String logoUrl; 
            private String m2MClientStatus; 
            private String managedServiceCode; 
            private String resourceServerIdentifier; 
            private String resourceServerStatus; 
            private Boolean serviceManaged; 
            private String ssoType; 
            private String status; 
            private Long updateTime; 

            /**
             * <p>The status of the Developer API feature. Valid values:</p>
             * <ul>
             * <li>Enabled: The Developer API feature is enabled.</li>
             * <li>Disabled: The Developer API feature is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder apiInvokeStatus(String apiInvokeStatus) {
                this.apiInvokeStatus = apiInvokeStatus;
                return this;
            }

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>SAML Application</p>
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * <p>The origin of the application. Valid values:</p>
             * <ul>
             * <li>urn:alibaba:idaas:app:source:template: The application is created based on a template.</li>
             * <li>urn:alibaba:idaas: The application is created based on the standard protocol.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>urn:alibaba:idaas:app:source:template</p>
             */
            public Builder applicationSourceType(String applicationSourceType) {
                this.applicationSourceType = applicationSourceType;
                return this;
            }

            /**
             * <p>The ID of the template based on which the application is created. This parameter is returned only if the application is created based on a template.</p>
             * 
             * <strong>example:</strong>
             * <p>apt_rpa_tdsxxx</p>
             */
            public Builder applicationTemplateId(String applicationTemplateId) {
                this.applicationTemplateId = applicationTemplateId;
                return this;
            }

            /**
             * ApplicationVisibility.
             */
            public Builder applicationVisibility(java.util.List<String> applicationVisibility) {
                this.applicationVisibility = applicationVisibility;
                return this;
            }

            /**
             * <p>The authorization type of the EIAM application. Valid values:</p>
             * <ul>
             * <li>authorize_required: Only the user with explicit authorization can access the application.</li>
             * <li>default_all: By default, all users can access the application.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>authorize_required</p>
             */
            public Builder authorizationType(String authorizationType) {
                this.authorizationType = authorizationType;
                return this;
            }

            /**
             * <p>The client ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The time when the application was created. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1649830226000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>The application is applicable to the test environment.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The features that are supported by the application. The value is a JSON array. Valid values:</p>
             * <ul>
             * <li>sso: The application supports SSO.</li>
             * <li>provision: The application supports account synchronization.</li>
             * <li>api_invoke: The application supports custom APIs.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[&quot;sso&quot;, &quot;provision&quot;]</p>
             */
            public Builder features(String features) {
                this.features = features;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The URL of the application icon.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://img.alicdn.com/imgextra/i4/O1CN01lvYwpv1aGowQXDML9_!!6000000003303-0-tps-580-580.jpg">https://img.alicdn.com/imgextra/i4/O1CN01lvYwpv1aGowQXDML9_!!6000000003303-0-tps-580-580.jpg</a></p>
             */
            public Builder logoUrl(String logoUrl) {
                this.logoUrl = logoUrl;
                return this;
            }

            /**
             * M2MClientStatus.
             */
            public Builder m2MClientStatus(String m2MClientStatus) {
                this.m2MClientStatus = m2MClientStatus;
                return this;
            }

            /**
             * <p>The service code of the cloud service that manages the application template.</p>
             * 
             * <strong>example:</strong>
             * <p>rpa</p>
             */
            public Builder managedServiceCode(String managedServiceCode) {
                this.managedServiceCode = managedServiceCode;
                return this;
            }

            /**
             * ResourceServerIdentifier.
             */
            public Builder resourceServerIdentifier(String resourceServerIdentifier) {
                this.resourceServerIdentifier = resourceServerIdentifier;
                return this;
            }

            /**
             * ResourceServerStatus.
             */
            public Builder resourceServerStatus(String resourceServerStatus) {
                this.resourceServerStatus = resourceServerStatus;
                return this;
            }

            /**
             * <p>Indicates whether the application template is managed by a cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder serviceManaged(Boolean serviceManaged) {
                this.serviceManaged = serviceManaged;
                return this;
            }

            /**
             * <p>The type of the single sign-on (SSO) protocol. Valid values:</p>
             * <ul>
             * <li>saml2: the Security Assertion Markup Language (SAML) 2.0 protocol.</li>
             * <li>oidc: the OpenID Connect (OIDC) protocol.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>saml2</p>
             */
            public Builder ssoType(String ssoType) {
                this.ssoType = ssoType;
                return this;
            }

            /**
             * <p>The status of the application. Valid values:</p>
             * <ul>
             * <li>Enabled: The application is enabled.</li>
             * <li>Disabled: The application is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the application was last updated. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1649830226000</p>
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
