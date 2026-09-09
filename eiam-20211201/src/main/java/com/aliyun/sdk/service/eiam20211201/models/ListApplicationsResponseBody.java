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
 * {@link ListApplicationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationsResponseBody</p>
 */
public class ListApplicationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Applications")
    private java.util.List<Applications> applications;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListApplicationsResponseBody(Builder builder) {
        this.applications = builder.applications;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
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
    public java.util.List<Applications> getApplications() {
        return this.applications;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Applications> applications; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListApplicationsResponseBody model) {
            this.applications = model.applications;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of application information.</p>
         */
        public Builder applications(java.util.List<Applications> applications) {
            this.applications = applications;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
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
    public static class Applications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationCreationType")
        private String applicationCreationType;

        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("ApplicationIdentityType")
        private String applicationIdentityType;

        @com.aliyun.core.annotation.NameInMap("ApplicationName")
        private String applicationName;

        @com.aliyun.core.annotation.NameInMap("ApplicationSourceType")
        private String applicationSourceType;

        @com.aliyun.core.annotation.NameInMap("ApplicationTemplateId")
        private String applicationTemplateId;

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

        @com.aliyun.core.annotation.NameInMap("ResourceServerIdentifier")
        private String resourceServerIdentifier;

        @com.aliyun.core.annotation.NameInMap("ResourceServerSourceType")
        private String resourceServerSourceType;

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

        private Applications(Builder builder) {
            this.applicationCreationType = builder.applicationCreationType;
            this.applicationId = builder.applicationId;
            this.applicationIdentityType = builder.applicationIdentityType;
            this.applicationName = builder.applicationName;
            this.applicationSourceType = builder.applicationSourceType;
            this.applicationTemplateId = builder.applicationTemplateId;
            this.clientId = builder.clientId;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.features = builder.features;
            this.instanceId = builder.instanceId;
            this.logoUrl = builder.logoUrl;
            this.managedServiceCode = builder.managedServiceCode;
            this.resourceServerIdentifier = builder.resourceServerIdentifier;
            this.resourceServerSourceType = builder.resourceServerSourceType;
            this.resourceServerStatus = builder.resourceServerStatus;
            this.serviceManaged = builder.serviceManaged;
            this.ssoType = builder.ssoType;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Applications create() {
            return builder().build();
        }

        /**
         * @return applicationCreationType
         */
        public String getApplicationCreationType() {
            return this.applicationCreationType;
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return applicationIdentityType
         */
        public String getApplicationIdentityType() {
            return this.applicationIdentityType;
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
         * @return resourceServerIdentifier
         */
        public String getResourceServerIdentifier() {
            return this.resourceServerIdentifier;
        }

        /**
         * @return resourceServerSourceType
         */
        public String getResourceServerSourceType() {
            return this.resourceServerSourceType;
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
            private String applicationCreationType; 
            private String applicationId; 
            private String applicationIdentityType; 
            private String applicationName; 
            private String applicationSourceType; 
            private String applicationTemplateId; 
            private String clientId; 
            private Long createTime; 
            private String description; 
            private String features; 
            private String instanceId; 
            private String logoUrl; 
            private String managedServiceCode; 
            private String resourceServerIdentifier; 
            private String resourceServerSourceType; 
            private String resourceServerStatus; 
            private Boolean serviceManaged; 
            private String ssoType; 
            private String status; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(Applications model) {
                this.applicationCreationType = model.applicationCreationType;
                this.applicationId = model.applicationId;
                this.applicationIdentityType = model.applicationIdentityType;
                this.applicationName = model.applicationName;
                this.applicationSourceType = model.applicationSourceType;
                this.applicationTemplateId = model.applicationTemplateId;
                this.clientId = model.clientId;
                this.createTime = model.createTime;
                this.description = model.description;
                this.features = model.features;
                this.instanceId = model.instanceId;
                this.logoUrl = model.logoUrl;
                this.managedServiceCode = model.managedServiceCode;
                this.resourceServerIdentifier = model.resourceServerIdentifier;
                this.resourceServerSourceType = model.resourceServerSourceType;
                this.resourceServerStatus = model.resourceServerStatus;
                this.serviceManaged = model.serviceManaged;
                this.ssoType = model.ssoType;
                this.status = model.status;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The application creation type.</p>
             * 
             * <strong>example:</strong>
             * <p>user_custom</p>
             */
            public Builder applicationCreationType(String applicationCreationType) {
                this.applicationCreationType = applicationCreationType;
                return this;
            }

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>The application identity type.</p>
             * 
             * <strong>example:</strong>
             * <p>application</p>
             */
            public Builder applicationIdentityType(String applicationIdentityType) {
                this.applicationIdentityType = applicationIdentityType;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>SAML Application</p>
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * <p>The application creation source. Valid values:</p>
             * <ul>
             * <li>urn:alibaba:idaas:app:source:template: Application template.</li>
             * <li>urn:alibaba:idaas:app:source:standard: Standard protocol.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>urn:alibaba:idaas:app:source:standard</p>
             */
            public Builder applicationSourceType(String applicationSourceType) {
                this.applicationSourceType = applicationSourceType;
                return this;
            }

            /**
             * <p>The application template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>apt_xxx_xxx</p>
             */
            public Builder applicationTemplateId(String applicationTemplateId) {
                this.applicationTemplateId = applicationTemplateId;
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
             * <p>The application creation time, in UNIX timestamp format. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1649830226000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The application description.</p>
             * 
             * <strong>example:</strong>
             * <p>A test application</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The features supported by the application, returned as a JSON array string. Valid values:</p>
             * <ul>
             * <li>sso: Single sign-on.</li>
             * <li>slo: Single logout.</li>
             * <li>provision: Account synchronization.</li>
             * <li>api_invoke: API access. </li>
             * <li>m2m_client: M2M Client capability.</li>
             * <li>resource_server: API service capability.</li>
             * <li>other: Fallback.</li>
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
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The URL of the application logo.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://img.alicdn.com/imgextra/i4/O1CN01lvYwpv1aGowQXDML9_!!6000000003303-0-tps-580-580.jpg">https://img.alicdn.com/imgextra/i4/O1CN01lvYwpv1aGowQXDML9_!!6000000003303-0-tps-580-580.jpg</a></p>
             */
            public Builder logoUrl(String logoUrl) {
                this.logoUrl = logoUrl;
                return this;
            }

            /**
             * <p>The ServiceCode of the cloud service that manages the application template.</p>
             * 
             * <strong>example:</strong>
             * <p>rpa</p>
             */
            public Builder managedServiceCode(String managedServiceCode) {
                this.managedServiceCode = managedServiceCode;
                return this;
            }

            /**
             * <p>The unique identifier of the ResourceServer.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com">https://example.com</a></p>
             */
            public Builder resourceServerIdentifier(String resourceServerIdentifier) {
                this.resourceServerIdentifier = resourceServerIdentifier;
                return this;
            }

            /**
             * <p>The resource server source type.</p>
             * 
             * <strong>example:</strong>
             * <p>urn:cloud:idaas:resourceserver:source:custom</p>
             */
            public Builder resourceServerSourceType(String resourceServerSourceType) {
                this.resourceServerSourceType = resourceServerSourceType;
                return this;
            }

            /**
             * <p>The resource server status.</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder resourceServerStatus(String resourceServerStatus) {
                this.resourceServerStatus = resourceServerStatus;
                return this;
            }

            /**
             * <p>Specifies whether the application template is managed by a cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder serviceManaged(Boolean serviceManaged) {
                this.serviceManaged = serviceManaged;
                return this;
            }

            /**
             * <p>The single sign-on protocol. Valid values:</p>
             * <ul>
             * <li>saml2: SAML 2.0 protocol.</li>
             * <li>oidc: OpenID Connect protocol.</li>
             * <li>oauth2/m2m: OAuth 2.0 protocol.</li>
             * <li>oidc+oauth2/m2m: OpenID Connect and OAuth 2.0 protocols.</li>
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
             * <p>The application status. Valid values:</p>
             * <ul>
             * <li>enabled: Enabled.</li>
             * <li>disabled: Disabled.</li>
             * <li>deleted: Soft deleted.</li>
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
             * <p>The time when the application was last updated, in UNIX timestamp format. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1649830226000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Applications build() {
                return new Applications(this);
            } 

        } 

    }
}
