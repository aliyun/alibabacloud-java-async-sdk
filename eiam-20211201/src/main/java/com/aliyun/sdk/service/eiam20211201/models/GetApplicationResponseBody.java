// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
         * Application.
         */
        public Builder application(Application application) {
            this.application = application;
            return this;
        }

        /**
         * 请求Id
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
        @NameInMap("ApiInvokeStatus")
        private String apiInvokeStatus;

        @NameInMap("ApplicationId")
        private String applicationId;

        @NameInMap("ApplicationName")
        private String applicationName;

        @NameInMap("ApplicationSourceType")
        private String applicationSourceType;

        @NameInMap("ApplicationTemplateId")
        private String applicationTemplateId;

        @NameInMap("AuthorizationType")
        private String authorizationType;

        @NameInMap("ClientId")
        private String clientId;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Features")
        private String features;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("LogoUrl")
        private String logoUrl;

        @NameInMap("ManagedServiceCode")
        private String managedServiceCode;

        @NameInMap("ServiceManaged")
        private Boolean serviceManaged;

        @NameInMap("SsoType")
        private String ssoType;

        @NameInMap("Status")
        private String status;

        @NameInMap("UpdateTime")
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
             * IDaaS EIAM 应用apiInvoke能力启用状态
             */
            public Builder apiInvokeStatus(String apiInvokeStatus) {
                this.apiInvokeStatus = apiInvokeStatus;
                return this;
            }

            /**
             * IDaaS EIAM 应用Id
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * IDaaS EIAM 应用名称
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * 创建应用的来源类型，标准协议 or 模板应用 or 自建应用
             */
            public Builder applicationSourceType(String applicationSourceType) {
                this.applicationSourceType = applicationSourceType;
                return this;
            }

            /**
             * 创建来源应用模板id。当且仅当创建来源为应用模板时才返回。
             */
            public Builder applicationTemplateId(String applicationTemplateId) {
                this.applicationTemplateId = applicationTemplateId;
                return this;
            }

            /**
             * IDaaS EIAM 应用授权类型，default or authorize_required
             */
            public Builder authorizationType(String authorizationType) {
                this.authorizationType = authorizationType;
                return this;
            }

            /**
             * IDaaS EIAM 客户端ID
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * IDaaS EIAM 应用创建时间
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * IDaaS EIAM 应用描述信息
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * IDaaS EIAM 应用支持的特性，provisioning、permission_system、api_invoke等
             */
            public Builder features(String features) {
                this.features = features;
                return this;
            }

            /**
             * IDaaS EIAM 实例Id
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * IDaaS EIAM 应用图标URL地址
             */
            public Builder logoUrl(String logoUrl) {
                this.logoUrl = logoUrl;
                return this;
            }

            /**
             * 托管应用模板的云产品ServiceCode。当且仅当ServiceManaged为true是返回。
             */
            public Builder managedServiceCode(String managedServiceCode) {
                this.managedServiceCode = managedServiceCode;
                return this;
            }

            /**
             * 应用模板是否被云产品托管。
             */
            public Builder serviceManaged(Boolean serviceManaged) {
                this.serviceManaged = serviceManaged;
                return this;
            }

            /**
             * IDaaS EIAM 应用支持的sso协议类型，oidc、saml2
             */
            public Builder ssoType(String ssoType) {
                this.ssoType = ssoType;
                return this;
            }

            /**
             * IDaaS EIAM 应用状态
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * IDaaS EIAM 应用最近更新时间
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
