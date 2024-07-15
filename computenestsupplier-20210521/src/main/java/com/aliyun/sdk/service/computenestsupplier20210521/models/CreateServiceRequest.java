// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceRequest</p>
 */
public class CreateServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlarmMetadata")
    private String alarmMetadata;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApprovalType")
    private String approvalType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BuildParameters")
    private String buildParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeployMetadata")
    private String deployMetadata;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeployType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deployType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Duration")
    private Long duration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsSupportOperated")
    private Boolean isSupportOperated;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LicenseMetadata")
    private String licenseMetadata;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogMetadata")
    private String logMetadata;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationMetadata")
    private String operationMetadata;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyNames")
    private String policyNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resellable")
    private Boolean resellable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceInfo")
    private java.util.List < ServiceInfo> serviceInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceType")
    private String serviceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShareType")
    private String shareType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceServiceId")
    private String sourceServiceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceServiceVersion")
    private String sourceServiceVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TenantType")
    private String tenantType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrialDuration")
    private Long trialDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpgradeMetadata")
    private String upgradeMetadata;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionName")
    private String versionName;

    private CreateServiceRequest(Builder builder) {
        super(builder);
        this.alarmMetadata = builder.alarmMetadata;
        this.approvalType = builder.approvalType;
        this.buildParameters = builder.buildParameters;
        this.clientToken = builder.clientToken;
        this.deployMetadata = builder.deployMetadata;
        this.deployType = builder.deployType;
        this.duration = builder.duration;
        this.isSupportOperated = builder.isSupportOperated;
        this.licenseMetadata = builder.licenseMetadata;
        this.logMetadata = builder.logMetadata;
        this.operationMetadata = builder.operationMetadata;
        this.policyNames = builder.policyNames;
        this.regionId = builder.regionId;
        this.resellable = builder.resellable;
        this.resourceGroupId = builder.resourceGroupId;
        this.serviceId = builder.serviceId;
        this.serviceInfo = builder.serviceInfo;
        this.serviceType = builder.serviceType;
        this.shareType = builder.shareType;
        this.sourceServiceId = builder.sourceServiceId;
        this.sourceServiceVersion = builder.sourceServiceVersion;
        this.tag = builder.tag;
        this.tenantType = builder.tenantType;
        this.trialDuration = builder.trialDuration;
        this.upgradeMetadata = builder.upgradeMetadata;
        this.versionName = builder.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmMetadata
     */
    public String getAlarmMetadata() {
        return this.alarmMetadata;
    }

    /**
     * @return approvalType
     */
    public String getApprovalType() {
        return this.approvalType;
    }

    /**
     * @return buildParameters
     */
    public String getBuildParameters() {
        return this.buildParameters;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return deployMetadata
     */
    public String getDeployMetadata() {
        return this.deployMetadata;
    }

    /**
     * @return deployType
     */
    public String getDeployType() {
        return this.deployType;
    }

    /**
     * @return duration
     */
    public Long getDuration() {
        return this.duration;
    }

    /**
     * @return isSupportOperated
     */
    public Boolean getIsSupportOperated() {
        return this.isSupportOperated;
    }

    /**
     * @return licenseMetadata
     */
    public String getLicenseMetadata() {
        return this.licenseMetadata;
    }

    /**
     * @return logMetadata
     */
    public String getLogMetadata() {
        return this.logMetadata;
    }

    /**
     * @return operationMetadata
     */
    public String getOperationMetadata() {
        return this.operationMetadata;
    }

    /**
     * @return policyNames
     */
    public String getPolicyNames() {
        return this.policyNames;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resellable
     */
    public Boolean getResellable() {
        return this.resellable;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return serviceInfo
     */
    public java.util.List < ServiceInfo> getServiceInfo() {
        return this.serviceInfo;
    }

    /**
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * @return shareType
     */
    public String getShareType() {
        return this.shareType;
    }

    /**
     * @return sourceServiceId
     */
    public String getSourceServiceId() {
        return this.sourceServiceId;
    }

    /**
     * @return sourceServiceVersion
     */
    public String getSourceServiceVersion() {
        return this.sourceServiceVersion;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return tenantType
     */
    public String getTenantType() {
        return this.tenantType;
    }

    /**
     * @return trialDuration
     */
    public Long getTrialDuration() {
        return this.trialDuration;
    }

    /**
     * @return upgradeMetadata
     */
    public String getUpgradeMetadata() {
        return this.upgradeMetadata;
    }

    /**
     * @return versionName
     */
    public String getVersionName() {
        return this.versionName;
    }

    public static final class Builder extends Request.Builder<CreateServiceRequest, Builder> {
        private String alarmMetadata; 
        private String approvalType; 
        private String buildParameters; 
        private String clientToken; 
        private String deployMetadata; 
        private String deployType; 
        private Long duration; 
        private Boolean isSupportOperated; 
        private String licenseMetadata; 
        private String logMetadata; 
        private String operationMetadata; 
        private String policyNames; 
        private String regionId; 
        private Boolean resellable; 
        private String resourceGroupId; 
        private String serviceId; 
        private java.util.List < ServiceInfo> serviceInfo; 
        private String serviceType; 
        private String shareType; 
        private String sourceServiceId; 
        private String sourceServiceVersion; 
        private java.util.List < Tag> tag; 
        private String tenantType; 
        private Long trialDuration; 
        private String upgradeMetadata; 
        private String versionName; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceRequest request) {
            super(request);
            this.alarmMetadata = request.alarmMetadata;
            this.approvalType = request.approvalType;
            this.buildParameters = request.buildParameters;
            this.clientToken = request.clientToken;
            this.deployMetadata = request.deployMetadata;
            this.deployType = request.deployType;
            this.duration = request.duration;
            this.isSupportOperated = request.isSupportOperated;
            this.licenseMetadata = request.licenseMetadata;
            this.logMetadata = request.logMetadata;
            this.operationMetadata = request.operationMetadata;
            this.policyNames = request.policyNames;
            this.regionId = request.regionId;
            this.resellable = request.resellable;
            this.resourceGroupId = request.resourceGroupId;
            this.serviceId = request.serviceId;
            this.serviceInfo = request.serviceInfo;
            this.serviceType = request.serviceType;
            this.shareType = request.shareType;
            this.sourceServiceId = request.sourceServiceId;
            this.sourceServiceVersion = request.sourceServiceVersion;
            this.tag = request.tag;
            this.tenantType = request.tenantType;
            this.trialDuration = request.trialDuration;
            this.upgradeMetadata = request.upgradeMetadata;
            this.versionName = request.versionName;
        } 

        /**
         * The alert configurations of the service.
         * <p>
         * 
         * >  This parameter takes effect only when you specify an alert policy for **PolicyNames**.
         */
        public Builder alarmMetadata(String alarmMetadata) {
            this.putQueryParameter("AlarmMetadata", alarmMetadata);
            this.alarmMetadata = alarmMetadata;
            return this;
        }

        /**
         * The approval type of the service usage application. Valid values:
         * <p>
         * 
         * *   Manual: The application is manually approved.
         * *   AutoPass: The application is automatically approved.
         */
        public Builder approvalType(String approvalType) {
            this.putQueryParameter("ApprovalType", approvalType);
            this.approvalType = approvalType;
            return this;
        }

        /**
         * The parameters for building the service
         */
        public Builder buildParameters(String buildParameters) {
            this.putQueryParameter("BuildParameters", buildParameters);
            this.buildParameters = buildParameters;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The storage configurations of the service. The format in which the deployment information of a service is stored varies based on the deployment type of the service. In this case, the deployment information is stored in the JSON string format.
         */
        public Builder deployMetadata(String deployMetadata) {
            this.putQueryParameter("DeployMetadata", deployMetadata);
            this.deployMetadata = deployMetadata;
            return this;
        }

        /**
         * The deployment type of the service. Valid values:
         * <p>
         * 
         * *   ros: The service is deployed by using Resource Orchestration Service (ROS).
         * *   terraform: The service is deployed by using Terraform.
         * *   ack: The service is deployed by using Container Service for Kubernetes (ACK).
         * *   spi: The service is deployed by calling a service provider interface (SPI).
         * *   operation: The service is deployed by using a hosted O\&M service.
         */
        public Builder deployType(String deployType) {
            this.putQueryParameter("DeployType", deployType);
            this.deployType = deployType;
            return this;
        }

        /**
         * The duration for which hosted O\&M is implemented. Unit: seconds.
         */
        public Builder duration(Long duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * Specifies whether to enable the hosted O\&M feature for the service. Default value: false. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         * 
         * >  This parameter is required if you set **ServiceType** to **private**.
         */
        public Builder isSupportOperated(Boolean isSupportOperated) {
            this.putQueryParameter("IsSupportOperated", isSupportOperated);
            this.isSupportOperated = isSupportOperated;
            return this;
        }

        /**
         * The license metadata.
         */
        public Builder licenseMetadata(String licenseMetadata) {
            this.putQueryParameter("LicenseMetadata", licenseMetadata);
            this.licenseMetadata = licenseMetadata;
            return this;
        }

        /**
         * The logging configurations.
         */
        public Builder logMetadata(String logMetadata) {
            this.putQueryParameter("LogMetadata", logMetadata);
            this.logMetadata = logMetadata;
            return this;
        }

        /**
         * The hosted O\&M configurations.
         */
        public Builder operationMetadata(String operationMetadata) {
            this.putQueryParameter("OperationMetadata", operationMetadata);
            this.operationMetadata = operationMetadata;
            return this;
        }

        /**
         * The policy name. The name can be up to 128 characters in length. Separate multiple names with commas (,). Only hosted O\&M policies are supported.
         */
        public Builder policyNames(String policyNames) {
            this.putQueryParameter("PolicyNames", policyNames);
            this.policyNames = policyNames;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Whether resell is supported.
         */
        public Builder resellable(Boolean resellable) {
            this.putQueryParameter("Resellable", resellable);
            this.resellable = resellable;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The service ID.
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * The service details.
         */
        public Builder serviceInfo(java.util.List < ServiceInfo> serviceInfo) {
            this.putQueryParameter("ServiceInfo", serviceInfo);
            this.serviceInfo = serviceInfo;
            return this;
        }

        /**
         * The service type. Valid values:
         * <p>
         * 
         * *   private: The service is a private service and is deployed within the account of a customer.
         * *   managed: The service is a fully managed service and is deployed within the account of a service provider.
         * *   operation: The service is a hosted O\&M service.
         * *   poc: The service is a trial service.
         */
        public Builder serviceType(String serviceType) {
            this.putQueryParameter("ServiceType", serviceType);
            this.serviceType = serviceType;
            return this;
        }

        /**
         * The permission type of the deployment URL. Valid values:
         * <p>
         * 
         * *   Public: All users can go to the URL to create a service instance or a trial service instance.
         * *   Restricted: Only users in the whitelist can go to the URL to create a service instance or a trial service instance.
         * *   OnlyFormalRestricted: Only users in the whitelist can go to the URL to create a service instance.
         * *   OnlyTrailRestricted: Only users in the whitelist can go to the URL to create a trial service instance.
         * *   Hidden: Users not in the whitelist cannot see the service details page when they go to the URL and cannot request deployment permissions.
         */
        public Builder shareType(String shareType) {
            this.putQueryParameter("ShareType", shareType);
            this.shareType = shareType;
            return this;
        }

        /**
         * The source service ID for resell。
         */
        public Builder sourceServiceId(String sourceServiceId) {
            this.putQueryParameter("SourceServiceId", sourceServiceId);
            this.sourceServiceId = sourceServiceId;
            return this;
        }

        /**
         * The source service version for resell。
         */
        public Builder sourceServiceVersion(String sourceServiceVersion) {
            this.putQueryParameter("SourceServiceVersion", sourceServiceVersion);
            this.sourceServiceVersion = sourceServiceVersion;
            return this;
        }

        /**
         * The custom tags.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The type of the tenant. Valid values:
         * <p>
         * 
         * *   SingleTenant
         * *   MultiTenant
         */
        public Builder tenantType(String tenantType) {
            this.putQueryParameter("TenantType", tenantType);
            this.tenantType = tenantType;
            return this;
        }

        /**
         * The trial duration. Unit: day. The maximum trial duration cannot exceed 30 days.
         */
        public Builder trialDuration(Long trialDuration) {
            this.putQueryParameter("TrialDuration", trialDuration);
            this.trialDuration = trialDuration;
            return this;
        }

        /**
         * The metadata about the upgrade.
         */
        public Builder upgradeMetadata(String upgradeMetadata) {
            this.putQueryParameter("UpgradeMetadata", upgradeMetadata);
            this.upgradeMetadata = upgradeMetadata;
            return this;
        }

        /**
         * The version name.
         */
        public Builder versionName(String versionName) {
            this.putQueryParameter("VersionName", versionName);
            this.versionName = versionName;
            return this;
        }

        @Override
        public CreateServiceRequest build() {
            return new CreateServiceRequest(this);
        } 

    } 

    public static class Agreements extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Agreements(Builder builder) {
            this.name = builder.name;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Agreements create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String name; 
            private String url; 

            /**
             * Protocol name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Protocol url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Agreements build() {
                return new Agreements(this);
            } 

        } 

    }
    public static class ServiceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Agreements")
        private java.util.List < Agreements> agreements;

        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("Locale")
        @com.aliyun.core.annotation.Validation(required = true)
        private String locale;

        @com.aliyun.core.annotation.NameInMap("LongDescriptionUrl")
        private String longDescriptionUrl;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("ShortDescription")
        private String shortDescription;

        private ServiceInfo(Builder builder) {
            this.agreements = builder.agreements;
            this.image = builder.image;
            this.locale = builder.locale;
            this.longDescriptionUrl = builder.longDescriptionUrl;
            this.name = builder.name;
            this.shortDescription = builder.shortDescription;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceInfo create() {
            return builder().build();
        }

        /**
         * @return agreements
         */
        public java.util.List < Agreements> getAgreements() {
            return this.agreements;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return locale
         */
        public String getLocale() {
            return this.locale;
        }

        /**
         * @return longDescriptionUrl
         */
        public String getLongDescriptionUrl() {
            return this.longDescriptionUrl;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return shortDescription
         */
        public String getShortDescription() {
            return this.shortDescription;
        }

        public static final class Builder {
            private java.util.List < Agreements> agreements; 
            private String image; 
            private String locale; 
            private String longDescriptionUrl; 
            private String name; 
            private String shortDescription; 

            /**
             * Protocol document information about the service.
             */
            public Builder agreements(java.util.List < Agreements> agreements) {
                this.agreements = agreements;
                return this;
            }

            /**
             * The URL of the service icon.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * The language of the service. Valid values:
             * <p>
             * 
             * *   zh-CN: Chinese
             * *   en-US: English
             */
            public Builder locale(String locale) {
                this.locale = locale;
                return this;
            }

            /**
             * The URL of the detailed description of the service.
             */
            public Builder longDescriptionUrl(String longDescriptionUrl) {
                this.longDescriptionUrl = longDescriptionUrl;
                return this;
            }

            /**
             * The service name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The description of the service.
             */
            public Builder shortDescription(String shortDescription) {
                this.shortDescription = shortDescription;
                return this;
            }

            public ServiceInfo build() {
                return new ServiceInfo(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
