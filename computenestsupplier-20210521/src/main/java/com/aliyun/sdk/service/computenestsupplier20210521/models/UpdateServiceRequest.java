// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateServiceRequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceRequest</p>
 */
public class UpdateServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlarmMetadata")
    private String alarmMetadata;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApprovalType")
    private String approvalType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Commodity")
    private Commodity commodity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeployMetadata")
    private String deployMetadata;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeployType")
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
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceInfo")
    private java.util.List < ServiceInfo> serviceInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceType")
    private String serviceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceVersion")
    private String serviceVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShareType")
    private String shareType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TenantType")
    private String tenantType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrialDuration")
    private Integer trialDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateOption")
    private UpdateOption updateOption;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpgradeMetadata")
    private String upgradeMetadata;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionName")
    private String versionName;

    private UpdateServiceRequest(Builder builder) {
        super(builder);
        this.alarmMetadata = builder.alarmMetadata;
        this.approvalType = builder.approvalType;
        this.clientToken = builder.clientToken;
        this.commodity = builder.commodity;
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
        this.serviceId = builder.serviceId;
        this.serviceInfo = builder.serviceInfo;
        this.serviceType = builder.serviceType;
        this.serviceVersion = builder.serviceVersion;
        this.shareType = builder.shareType;
        this.tenantType = builder.tenantType;
        this.trialDuration = builder.trialDuration;
        this.updateOption = builder.updateOption;
        this.upgradeMetadata = builder.upgradeMetadata;
        this.versionName = builder.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServiceRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return commodity
     */
    public Commodity getCommodity() {
        return this.commodity;
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
     * @return serviceVersion
     */
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    /**
     * @return shareType
     */
    public String getShareType() {
        return this.shareType;
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
    public Integer getTrialDuration() {
        return this.trialDuration;
    }

    /**
     * @return updateOption
     */
    public UpdateOption getUpdateOption() {
        return this.updateOption;
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

    public static final class Builder extends Request.Builder<UpdateServiceRequest, Builder> {
        private String alarmMetadata; 
        private String approvalType; 
        private String clientToken; 
        private Commodity commodity; 
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
        private String serviceId; 
        private java.util.List < ServiceInfo> serviceInfo; 
        private String serviceType; 
        private String serviceVersion; 
        private String shareType; 
        private String tenantType; 
        private Integer trialDuration; 
        private UpdateOption updateOption; 
        private String upgradeMetadata; 
        private String versionName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServiceRequest request) {
            super(request);
            this.alarmMetadata = request.alarmMetadata;
            this.approvalType = request.approvalType;
            this.clientToken = request.clientToken;
            this.commodity = request.commodity;
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
            this.serviceId = request.serviceId;
            this.serviceInfo = request.serviceInfo;
            this.serviceType = request.serviceType;
            this.serviceVersion = request.serviceVersion;
            this.shareType = request.shareType;
            this.tenantType = request.tenantType;
            this.trialDuration = request.trialDuration;
            this.updateOption = request.updateOption;
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
         * - Manual: The application is manually approved.
         * - AutoPass: The application is automatically approved.
         */
        public Builder approvalType(String approvalType) {
            this.putQueryParameter("ApprovalType", approvalType);
            this.approvalType = approvalType;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Commodity.
         */
        public Builder commodity(Commodity commodity) {
            String commodityShrink = shrink(commodity, "Commodity", "json");
            this.putQueryParameter("Commodity", commodityShrink);
            this.commodity = commodity;
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
         * *   spi: The service is deployed by calling a service provider interface (SPI).
         * *   operation: The service is deployed by using a hosted O\&M service.
         * *   container: The service is deployed by using a container.
         * *   pkg: The service is deployed by using a package.
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
         * Specifies whether to support distribution. Valid values:
         * <p>
         * 
         * *   false
         * *   true
         */
        public Builder resellable(Boolean resellable) {
            this.putQueryParameter("Resellable", resellable);
            this.resellable = resellable;
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
         * The service version.
         */
        public Builder serviceVersion(String serviceVersion) {
            this.putQueryParameter("ServiceVersion", serviceVersion);
            this.serviceVersion = serviceVersion;
            return this;
        }

        /**
         * The permission type of the deployment URL. Valid values:
         * <p>
         * 
         * - Public: All users can go to the URL to create a service instance or a trial service instance.
         * - Restricted: Only users in the whitelist can go to the URL to create a service instance or a trial service instance.
         * - OnlyFormalRestricted: Only users in the whitelist can go to the URL to create a service instance.
         * - OnlyTrailRestricted: Only users in the whitelist can go to the URL to create a trial service instance.
         * - Hidden: Users not in the whitelist cannot see the service details page when they go to the URL and cannot request deployment permissions.
         */
        public Builder shareType(String shareType) {
            this.putQueryParameter("ShareType", shareType);
            this.shareType = shareType;
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
        public Builder trialDuration(Integer trialDuration) {
            this.putQueryParameter("TrialDuration", trialDuration);
            this.trialDuration = trialDuration;
            return this;
        }

        /**
         * The options for update the service.
         */
        public Builder updateOption(UpdateOption updateOption) {
            String updateOptionShrink = shrink(updateOption, "UpdateOption", "json");
            this.putQueryParameter("UpdateOption", updateOptionShrink);
            this.updateOption = updateOption;
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
        public UpdateServiceRequest build() {
            return new UpdateServiceRequest(this);
        } 

    } 

    public static class ComponentsMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Mappings")
        private String mappings;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        private ComponentsMappings(Builder builder) {
            this.mappings = builder.mappings;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComponentsMappings create() {
            return builder().build();
        }

        /**
         * @return mappings
         */
        public String getMappings() {
            return this.mappings;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        public static final class Builder {
            private String mappings; 
            private String templateName; 

            /**
             * Mappings.
             */
            public Builder mappings(String mappings) {
                this.mappings = mappings;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            public ComponentsMappings build() {
                return new ComponentsMappings(this);
            } 

        } 

    }
    public static class MeteringEntityExtraInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EntityId")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Promql")
        private String promql;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private MeteringEntityExtraInfos(Builder builder) {
            this.entityId = builder.entityId;
            this.metricName = builder.metricName;
            this.promql = builder.promql;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MeteringEntityExtraInfos create() {
            return builder().build();
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return promql
         */
        public String getPromql() {
            return this.promql;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String entityId; 
            private String metricName; 
            private String promql; 
            private String type; 

            /**
             * EntityId.
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * MetricName.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * Promql.
             */
            public Builder promql(String promql) {
                this.promql = promql;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public MeteringEntityExtraInfos build() {
                return new MeteringEntityExtraInfos(this);
            } 

        } 

    }
    public static class MeteringEntityMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EntityIds")
        private java.util.List < String > entityIds;

        @com.aliyun.core.annotation.NameInMap("SpecificationName")
        private String specificationName;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        private MeteringEntityMappings(Builder builder) {
            this.entityIds = builder.entityIds;
            this.specificationName = builder.specificationName;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MeteringEntityMappings create() {
            return builder().build();
        }

        /**
         * @return entityIds
         */
        public java.util.List < String > getEntityIds() {
            return this.entityIds;
        }

        /**
         * @return specificationName
         */
        public String getSpecificationName() {
            return this.specificationName;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        public static final class Builder {
            private java.util.List < String > entityIds; 
            private String specificationName; 
            private String templateName; 

            /**
             * EntityIds.
             */
            public Builder entityIds(java.util.List < String > entityIds) {
                this.entityIds = entityIds;
                return this;
            }

            /**
             * SpecificationName.
             */
            public Builder specificationName(String specificationName) {
                this.specificationName = specificationName;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            public MeteringEntityMappings build() {
                return new MeteringEntityMappings(this);
            } 

        } 

    }
    public static class SpecificationMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SpecificationCode")
        private String specificationCode;

        @com.aliyun.core.annotation.NameInMap("SpecificationName")
        private String specificationName;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        private SpecificationMappings(Builder builder) {
            this.specificationCode = builder.specificationCode;
            this.specificationName = builder.specificationName;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpecificationMappings create() {
            return builder().build();
        }

        /**
         * @return specificationCode
         */
        public String getSpecificationCode() {
            return this.specificationCode;
        }

        /**
         * @return specificationName
         */
        public String getSpecificationName() {
            return this.specificationName;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        public static final class Builder {
            private String specificationCode; 
            private String specificationName; 
            private String templateName; 

            /**
             * SpecificationCode.
             */
            public Builder specificationCode(String specificationCode) {
                this.specificationCode = specificationCode;
                return this;
            }

            /**
             * SpecificationName.
             */
            public Builder specificationName(String specificationName) {
                this.specificationName = specificationName;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            public SpecificationMappings build() {
                return new SpecificationMappings(this);
            } 

        } 

    }
    public static class Commodity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentsMappings")
        private java.util.List < ComponentsMappings> componentsMappings;

        @com.aliyun.core.annotation.NameInMap("MeteringEntityExtraInfos")
        private java.util.List < MeteringEntityExtraInfos> meteringEntityExtraInfos;

        @com.aliyun.core.annotation.NameInMap("MeteringEntityMappings")
        private java.util.List < MeteringEntityMappings> meteringEntityMappings;

        @com.aliyun.core.annotation.NameInMap("SaasBoostConfig")
        private String saasBoostConfig;

        @com.aliyun.core.annotation.NameInMap("SpecificationMappings")
        private java.util.List < SpecificationMappings> specificationMappings;

        private Commodity(Builder builder) {
            this.componentsMappings = builder.componentsMappings;
            this.meteringEntityExtraInfos = builder.meteringEntityExtraInfos;
            this.meteringEntityMappings = builder.meteringEntityMappings;
            this.saasBoostConfig = builder.saasBoostConfig;
            this.specificationMappings = builder.specificationMappings;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Commodity create() {
            return builder().build();
        }

        /**
         * @return componentsMappings
         */
        public java.util.List < ComponentsMappings> getComponentsMappings() {
            return this.componentsMappings;
        }

        /**
         * @return meteringEntityExtraInfos
         */
        public java.util.List < MeteringEntityExtraInfos> getMeteringEntityExtraInfos() {
            return this.meteringEntityExtraInfos;
        }

        /**
         * @return meteringEntityMappings
         */
        public java.util.List < MeteringEntityMappings> getMeteringEntityMappings() {
            return this.meteringEntityMappings;
        }

        /**
         * @return saasBoostConfig
         */
        public String getSaasBoostConfig() {
            return this.saasBoostConfig;
        }

        /**
         * @return specificationMappings
         */
        public java.util.List < SpecificationMappings> getSpecificationMappings() {
            return this.specificationMappings;
        }

        public static final class Builder {
            private java.util.List < ComponentsMappings> componentsMappings; 
            private java.util.List < MeteringEntityExtraInfos> meteringEntityExtraInfos; 
            private java.util.List < MeteringEntityMappings> meteringEntityMappings; 
            private String saasBoostConfig; 
            private java.util.List < SpecificationMappings> specificationMappings; 

            /**
             * ComponentsMappings.
             */
            public Builder componentsMappings(java.util.List < ComponentsMappings> componentsMappings) {
                this.componentsMappings = componentsMappings;
                return this;
            }

            /**
             * MeteringEntityExtraInfos.
             */
            public Builder meteringEntityExtraInfos(java.util.List < MeteringEntityExtraInfos> meteringEntityExtraInfos) {
                this.meteringEntityExtraInfos = meteringEntityExtraInfos;
                return this;
            }

            /**
             * MeteringEntityMappings.
             */
            public Builder meteringEntityMappings(java.util.List < MeteringEntityMappings> meteringEntityMappings) {
                this.meteringEntityMappings = meteringEntityMappings;
                return this;
            }

            /**
             * SaasBoostConfig.
             */
            public Builder saasBoostConfig(String saasBoostConfig) {
                this.saasBoostConfig = saasBoostConfig;
                return this;
            }

            /**
             * SpecificationMappings.
             */
            public Builder specificationMappings(java.util.List < SpecificationMappings> specificationMappings) {
                this.specificationMappings = specificationMappings;
                return this;
            }

            public Commodity build() {
                return new Commodity(this);
            } 

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
        private String locale;

        @com.aliyun.core.annotation.NameInMap("LongDescriptionUrl")
        private String longDescriptionUrl;

        @com.aliyun.core.annotation.NameInMap("Name")
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
    public static class UpdateOption extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UpdateFrom")
        private String updateFrom;

        private UpdateOption(Builder builder) {
            this.updateFrom = builder.updateFrom;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateOption create() {
            return builder().build();
        }

        /**
         * @return updateFrom
         */
        public String getUpdateFrom() {
            return this.updateFrom;
        }

        public static final class Builder {
            private String updateFrom; 

            /**
             * The options for update the service. Valid values:
             * <p>
             * - CODE
             * - PARAMETERS
             */
            public Builder updateFrom(String updateFrom) {
                this.updateFrom = updateFrom;
                return this;
            }

            public UpdateOption build() {
                return new UpdateOption(this);
            } 

        } 

    }
}
