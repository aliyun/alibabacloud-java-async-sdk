// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
    @com.aliyun.core.annotation.NameInMap("BuildParameters")
    private String buildParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Commodity")
    private Commodity commodity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComplianceMetadata")
    private ComplianceMetadata complianceMetadata;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeployMetadata")
    private String deployMetadata;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeployType")
    private String deployType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

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
    private java.util.List<ServiceInfo> serviceInfo;

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
        this.buildParameters = builder.buildParameters;
        this.clientToken = builder.clientToken;
        this.commodity = builder.commodity;
        this.complianceMetadata = builder.complianceMetadata;
        this.deployMetadata = builder.deployMetadata;
        this.deployType = builder.deployType;
        this.dryRun = builder.dryRun;
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
     * @return commodity
     */
    public Commodity getCommodity() {
        return this.commodity;
    }

    /**
     * @return complianceMetadata
     */
    public ComplianceMetadata getComplianceMetadata() {
        return this.complianceMetadata;
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
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
    public java.util.List<ServiceInfo> getServiceInfo() {
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
        private String buildParameters; 
        private String clientToken; 
        private Commodity commodity; 
        private ComplianceMetadata complianceMetadata; 
        private String deployMetadata; 
        private String deployType; 
        private Boolean dryRun; 
        private Long duration; 
        private Boolean isSupportOperated; 
        private String licenseMetadata; 
        private String logMetadata; 
        private String operationMetadata; 
        private String policyNames; 
        private String regionId; 
        private Boolean resellable; 
        private String serviceId; 
        private java.util.List<ServiceInfo> serviceInfo; 
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
            this.buildParameters = request.buildParameters;
            this.clientToken = request.clientToken;
            this.commodity = request.commodity;
            this.complianceMetadata = request.complianceMetadata;
            this.deployMetadata = request.deployMetadata;
            this.deployType = request.deployType;
            this.dryRun = request.dryRun;
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
         * <p>The alert configurations of the service.</p>
         * <blockquote>
         * <p> This parameter takes effect only when you specify an alert policy for <strong>PolicyNames</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;CmsTemplateId&quot;:1162921,&quot;TemplateUrl&quot;:&quot;<a href="https://service-info-private.oss-cn-hangzhou.aliyuncs.com/1760465342xxxxxx/template/c072ef50-6c03-4d9c-8f0e-d1c440xxxxxx.json%5C%22%7D">https://service-info-private.oss-cn-hangzhou.aliyuncs.com/1760465342xxxxxx/template/c072ef50-6c03-4d9c-8f0e-d1c440xxxxxx.json\&quot;}</a></p>
         */
        public Builder alarmMetadata(String alarmMetadata) {
            this.putQueryParameter("AlarmMetadata", alarmMetadata);
            this.alarmMetadata = alarmMetadata;
            return this;
        }

        /**
         * <p>The approval type of the service usage application. Valid values:</p>
         * <ul>
         * <li>Manual: The application is manually approved.</li>
         * <li>AutoPass: The application is automatically approved.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        public Builder approvalType(String approvalType) {
            this.putQueryParameter("ApprovalType", approvalType);
            this.approvalType = approvalType;
            return this;
        }

        /**
         * BuildParameters.
         */
        public Builder buildParameters(String buildParameters) {
            this.putQueryParameter("BuildParameters", buildParameters);
            this.buildParameters = buildParameters;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>788E7CP0EN9D51P</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The commodity details.</p>
         */
        public Builder commodity(Commodity commodity) {
            String commodityShrink = shrink(commodity, "Commodity", "json");
            this.putQueryParameter("Commodity", commodityShrink);
            this.commodity = commodity;
            return this;
        }

        /**
         * <p>Compliance check metadata.</p>
         */
        public Builder complianceMetadata(ComplianceMetadata complianceMetadata) {
            String complianceMetadataShrink = shrink(complianceMetadata, "ComplianceMetadata", "json");
            this.putQueryParameter("ComplianceMetadata", complianceMetadataShrink);
            this.complianceMetadata = complianceMetadata;
            return this;
        }

        /**
         * <p>The deployment configurations of the service. The format in which the deployment information of a service is stored varies based on the deployment type of the service. In this case, the deployment information is stored in the JSON string format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;EstimateTime&quot;:null,&quot;SupplierDeployMetadata&quot;:{&quot;DeployTimeout&quot;:7200},&quot;EnableVnc&quot;:false}</p>
         */
        public Builder deployMetadata(String deployMetadata) {
            this.putQueryParameter("DeployMetadata", deployMetadata);
            this.deployMetadata = deployMetadata;
            return this;
        }

        /**
         * <p>The deployment type of the service. Valid values:</p>
         * <p>ros: The service is deployed by using Resource Orchestration Service (ROS).
         * terraform: The service is deployed by using Terraform.
         * ack: The service is deployed by using Container Service for Kubernetes (ACK).
         * spi: The service is deployed by calling a service provider interface (SPI).
         * operation: The service is deployed by using a hosted O&amp;M service.</p>
         * 
         * <strong>example:</strong>
         * <p>ros</p>
         */
        public Builder deployType(String deployType) {
            this.putQueryParameter("DeployType", deployType);
            this.deployType = deployType;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run for the request to check information such as the permissions and instance status. Valid values:</p>
         * <ul>
         * <li>true: performs a dry run for the request, but does not update a service.</li>
         * <li>false: performs a dry run for the request, and update a service if the request passes the dry run.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The duration for which hosted O&amp;M is implemented. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>259200</p>
         */
        public Builder duration(Long duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * <p>Specifies whether to enable the hosted O&amp;M feature for the service. Default value: false. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is required if you set <strong>ServiceType</strong> to <strong>private</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isSupportOperated(Boolean isSupportOperated) {
            this.putQueryParameter("IsSupportOperated", isSupportOperated);
            this.isSupportOperated = isSupportOperated;
            return this;
        }

        /**
         * <p>The license metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>Metering Item Configuration Information (Cloud Marketplace - Pay-As-You-Go Use)</p>
         */
        public Builder licenseMetadata(String licenseMetadata) {
            this.putQueryParameter("LicenseMetadata", licenseMetadata);
            this.licenseMetadata = licenseMetadata;
            return this;
        }

        /**
         * <p>The logging configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>Specifies whether to support distribution. Valid values:</p>
         * <ul>
         * <li>false</li>
         * <li>true</li>
         * </ul>
         */
        public Builder logMetadata(String logMetadata) {
            this.putQueryParameter("LogMetadata", logMetadata);
            this.logMetadata = logMetadata;
            return this;
        }

        /**
         * <p>The hosted O&amp;M configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;PrometheusConfigMap&quot;:{&quot;Custom_Image_Ecs&quot;:{&quot;EnablePrometheus&quot;:false}}}</p>
         */
        public Builder operationMetadata(String operationMetadata) {
            this.putQueryParameter("OperationMetadata", operationMetadata);
            this.operationMetadata = operationMetadata;
            return this;
        }

        /**
         * <p>The policy name. The name can be up to 128 characters in length. Separate multiple names with commas (,). Only hosted O&amp;M policies are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>policyName1, policyName2</p>
         */
        public Builder policyNames(String policyNames) {
            this.putQueryParameter("PolicyNames", policyNames);
            this.policyNames = policyNames;
            return this;
        }

        /**
         * <p>Region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Whether resell is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder resellable(Boolean resellable) {
            this.putQueryParameter("Resellable", resellable);
            this.resellable = resellable;
            return this;
        }

        /**
         * <p>The service ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>service-1dda29c3eca648xxxxxx</p>
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The service details.</p>
         */
        public Builder serviceInfo(java.util.List<ServiceInfo> serviceInfo) {
            this.putQueryParameter("ServiceInfo", serviceInfo);
            this.serviceInfo = serviceInfo;
            return this;
        }

        /**
         * <p>The service type. Valid values:</p>
         * <ul>
         * <li>private: The service is a private service and is deployed within the account of a customer.</li>
         * <li>managed: The service is a fully managed service and is deployed within the account of a service provider.</li>
         * <li>operation: The service is a hosted O&amp;M service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        public Builder serviceType(String serviceType) {
            this.putQueryParameter("ServiceType", serviceType);
            this.serviceType = serviceType;
            return this;
        }

        /**
         * <p>The service version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder serviceVersion(String serviceVersion) {
            this.putQueryParameter("ServiceVersion", serviceVersion);
            this.serviceVersion = serviceVersion;
            return this;
        }

        /**
         * <p>The permission type of the deployment URL. Valid values:</p>
         * <ul>
         * <li>Public: All users can go to the URL to create a service instance or a trial service instance.</li>
         * <li>Restricted: Only users in the whitelist can go to the URL to create a service instance or a trial service instance.</li>
         * <li>OnlyFormalRestricted: Only users in the whitelist can go to the URL to create a service instance.</li>
         * <li>OnlyTrailRestricted: Only users in the whitelist can go to the URL to create a trial service instance.</li>
         * <li>Hidden: Users not in the whitelist cannot see the service details page when they go to the URL and cannot request deployment permissions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Public</p>
         */
        public Builder shareType(String shareType) {
            this.putQueryParameter("ShareType", shareType);
            this.shareType = shareType;
            return this;
        }

        /**
         * <p>The type of the tenant. Valid values:</p>
         * <ul>
         * <li>SingleTenant</li>
         * <li>MultiTenant</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SingleTenant</p>
         */
        public Builder tenantType(String tenantType) {
            this.putQueryParameter("TenantType", tenantType);
            this.tenantType = tenantType;
            return this;
        }

        /**
         * <p>The trial duration. Unit: day. The maximum trial duration cannot exceed 30 days.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder trialDuration(Integer trialDuration) {
            this.putQueryParameter("TrialDuration", trialDuration);
            this.trialDuration = trialDuration;
            return this;
        }

        /**
         * <p>The update option.</p>
         */
        public Builder updateOption(UpdateOption updateOption) {
            String updateOptionShrink = shrink(updateOption, "UpdateOption", "json");
            this.putQueryParameter("UpdateOption", updateOptionShrink);
            this.updateOption = updateOption;
            return this;
        }

        /**
         * <p>The metadata about the upgrade.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Description&quot;:&quot;xxx&quot;,&quot;SupportRollback&quot;:true,&quot;SupportUpgradeFromVersions&quot;:[],&quot;UpgradeComponents&quot;:[&quot;Configuration&quot;]}</p>
         */
        public Builder upgradeMetadata(String upgradeMetadata) {
            this.putQueryParameter("UpgradeMetadata", upgradeMetadata);
            this.upgradeMetadata = upgradeMetadata;
            return this;
        }

        /**
         * <p>The version name.</p>
         * 
         * <strong>example:</strong>
         * <p>Draft</p>
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

    /**
     * 
     * {@link UpdateServiceRequest} extends {@link TeaModel}
     *
     * <p>UpdateServiceRequest</p>
     */
    public static class ComponentsMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Mappings")
        private java.util.Map<String, String> mappings;

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
        public java.util.Map<String, String> getMappings() {
            return this.mappings;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        public static final class Builder {
            private java.util.Map<String, String> mappings; 
            private String templateName; 

            private Builder() {
            } 

            private Builder(ComponentsMappings model) {
                this.mappings = model.mappings;
                this.templateName = model.templateName;
            } 

            /**
             * <p>This parameter is not available to the public.</p>
             */
            public Builder mappings(java.util.Map<String, String> mappings) {
                this.mappings = mappings;
                return this;
            }

            /**
             * <p>This parameter is not available to the public.</p>
             * 
             * <strong>example:</strong>
             * <p>This parameter is not available to the public.</p>
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
    /**
     * 
     * {@link UpdateServiceRequest} extends {@link TeaModel}
     *
     * <p>UpdateServiceRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(MeteringEntityExtraInfos model) {
                this.entityId = model.entityId;
                this.metricName = model.metricName;
                this.promql = model.promql;
                this.type = model.type;
            } 

            /**
             * <p>Metering entity ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cmgj0006xxxx-Memory-1</p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>Metric name, required when type is ComputeNestBill or ComputeNestPrometheus.</p>
             * 
             * <strong>example:</strong>
             * <p>VirtualCpu/ecs.InstanceType</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>Promql statement.</p>
             * 
             * <strong>example:</strong>
             * <p>avg_over_time(sum(rate(container_cpu_usage_seconds_total{namespace=~&quot;ALIYUN::StackName&quot;}[2m]))[1h:10s])</p>
             */
            public Builder promql(String promql) {
                this.promql = promql;
                return this;
            }

            /**
             * <p>Type. Valid values:</p>
             * <ul>
             * <li>Custom</li>
             * <li>ComputeNestBill</li>
             * <li>ComputeNestPrometheus</li>
             * <li>ComputeNestTime</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Custom</p>
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
    /**
     * 
     * {@link UpdateServiceRequest} extends {@link TeaModel}
     *
     * <p>UpdateServiceRequest</p>
     */
    public static class MeteringEntityMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EntityIds")
        private java.util.List<String> entityIds;

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
        public java.util.List<String> getEntityIds() {
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
            private java.util.List<String> entityIds; 
            private String specificationName; 
            private String templateName; 

            private Builder() {
            } 

            private Builder(MeteringEntityMappings model) {
                this.entityIds = model.entityIds;
                this.specificationName = model.specificationName;
                this.templateName = model.templateName;
            } 

            /**
             * <p>Metering entity IDs.</p>
             */
            public Builder entityIds(java.util.List<String> entityIds) {
                this.entityIds = entityIds;
                return this;
            }

            /**
             * <p>The specification name.</p>
             * 
             * <strong>example:</strong>
             * <p>This parameter is not publicly accessible.</p>
             */
            public Builder specificationName(String specificationName) {
                this.specificationName = specificationName;
                return this;
            }

            /**
             * <p>The template name.</p>
             * 
             * <strong>example:</strong>
             * <p>The service ID.</p>
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
    /**
     * 
     * {@link UpdateServiceRequest} extends {@link TeaModel}
     *
     * <p>UpdateServiceRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(SpecificationMappings model) {
                this.specificationCode = model.specificationCode;
                this.specificationName = model.specificationName;
                this.templateName = model.templateName;
            } 

            /**
             * <p>Specification code.</p>
             * 
             * <strong>example:</strong>
             * <p>yuncode5767800001</p>
             */
            public Builder specificationCode(String specificationCode) {
                this.specificationCode = specificationCode;
                return this;
            }

            /**
             * <p>The name of the package specification.</p>
             * 
             * <strong>example:</strong>
             * <p>Type, value：</p>
             * <ul>
             * <li><strong>Custom</strong></li>
             * <li><strong>ComputeNestBill</strong></li>
             * <li><strong>ComputeNestPrometheus</strong></li>
             * <li><strong>ComputeNestTime</strong></li>
             * </ul>
             */
            public Builder specificationName(String specificationName) {
                this.specificationName = specificationName;
                return this;
            }

            /**
             * <p>The template name.</p>
             * 
             * <strong>example:</strong>
             * <p>Product Specifications and Template/specification mapping Relationships (Cloud Marketplace - Subscription/Permanent Use)</p>
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
    /**
     * 
     * {@link UpdateServiceRequest} extends {@link TeaModel}
     *
     * <p>UpdateServiceRequest</p>
     */
    public static class Commodity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentsMappings")
        private java.util.List<ComponentsMappings> componentsMappings;

        @com.aliyun.core.annotation.NameInMap("MeteringEntityExtraInfos")
        private java.util.List<MeteringEntityExtraInfos> meteringEntityExtraInfos;

        @com.aliyun.core.annotation.NameInMap("MeteringEntityMappings")
        private java.util.List<MeteringEntityMappings> meteringEntityMappings;

        @com.aliyun.core.annotation.NameInMap("SaasBoostConfig")
        private String saasBoostConfig;

        @com.aliyun.core.annotation.NameInMap("SpecificationMappings")
        private java.util.List<SpecificationMappings> specificationMappings;

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
        public java.util.List<ComponentsMappings> getComponentsMappings() {
            return this.componentsMappings;
        }

        /**
         * @return meteringEntityExtraInfos
         */
        public java.util.List<MeteringEntityExtraInfos> getMeteringEntityExtraInfos() {
            return this.meteringEntityExtraInfos;
        }

        /**
         * @return meteringEntityMappings
         */
        public java.util.List<MeteringEntityMappings> getMeteringEntityMappings() {
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
        public java.util.List<SpecificationMappings> getSpecificationMappings() {
            return this.specificationMappings;
        }

        public static final class Builder {
            private java.util.List<ComponentsMappings> componentsMappings; 
            private java.util.List<MeteringEntityExtraInfos> meteringEntityExtraInfos; 
            private java.util.List<MeteringEntityMappings> meteringEntityMappings; 
            private String saasBoostConfig; 
            private java.util.List<SpecificationMappings> specificationMappings; 

            private Builder() {
            } 

            private Builder(Commodity model) {
                this.componentsMappings = model.componentsMappings;
                this.meteringEntityExtraInfos = model.meteringEntityExtraInfos;
                this.meteringEntityMappings = model.meteringEntityMappings;
                this.saasBoostConfig = model.saasBoostConfig;
                this.specificationMappings = model.specificationMappings;
            } 

            /**
             * <p>This parameter is not available to the public.</p>
             */
            public Builder componentsMappings(java.util.List<ComponentsMappings> componentsMappings) {
                this.componentsMappings = componentsMappings;
                return this;
            }

            /**
             * <p>Metering entity extra information.</p>
             */
            public Builder meteringEntityExtraInfos(java.util.List<MeteringEntityExtraInfos> meteringEntityExtraInfos) {
                this.meteringEntityExtraInfos = meteringEntityExtraInfos;
                return this;
            }

            /**
             * <p>Binding relationship between templates/specifications and metering dimensions (marketplace - PayAsYouGo)</p>
             */
            public Builder meteringEntityMappings(java.util.List<MeteringEntityMappings> meteringEntityMappings) {
                this.meteringEntityMappings = meteringEntityMappings;
                return this;
            }

            /**
             * <p>SaaS Boost configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder saasBoostConfig(String saasBoostConfig) {
                this.saasBoostConfig = saasBoostConfig;
                return this;
            }

            /**
             * <p>Product specifications and template/package mappings (Used in marketplace - subscription scenario)</p>
             */
            public Builder specificationMappings(java.util.List<SpecificationMappings> specificationMappings) {
                this.specificationMappings = specificationMappings;
                return this;
            }

            public Commodity build() {
                return new Commodity(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateServiceRequest} extends {@link TeaModel}
     *
     * <p>UpdateServiceRequest</p>
     */
    public static class ComplianceMetadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompliancePacks")
        private java.util.List<String> compliancePacks;

        private ComplianceMetadata(Builder builder) {
            this.compliancePacks = builder.compliancePacks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComplianceMetadata create() {
            return builder().build();
        }

        /**
         * @return compliancePacks
         */
        public java.util.List<String> getCompliancePacks() {
            return this.compliancePacks;
        }

        public static final class Builder {
            private java.util.List<String> compliancePacks; 

            private Builder() {
            } 

            private Builder(ComplianceMetadata model) {
                this.compliancePacks = model.compliancePacks;
            } 

            /**
             * <p>The compliance pack.</p>
             */
            public Builder compliancePacks(java.util.List<String> compliancePacks) {
                this.compliancePacks = compliancePacks;
                return this;
            }

            public ComplianceMetadata build() {
                return new ComplianceMetadata(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateServiceRequest} extends {@link TeaModel}
     *
     * <p>UpdateServiceRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(Agreements model) {
                this.name = model.name;
                this.url = model.url;
            } 

            /**
             * <p>Protocol name.</p>
             * 
             * <strong>example:</strong>
             * <p>Name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Protocol url.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://aliyun.com/xxxxxxxx.html">https://aliyun.com/xxxxxxxx.html</a></p>
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
    /**
     * 
     * {@link UpdateServiceRequest} extends {@link TeaModel}
     *
     * <p>UpdateServiceRequest</p>
     */
    public static class Softwares extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Softwares(Builder builder) {
            this.name = builder.name;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Softwares create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String name; 
            private String version; 

            private Builder() {
            } 

            private Builder(Softwares model) {
                this.name = model.name;
                this.version = model.version;
            } 

            /**
             * <p>The name of the software.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The version of the software.</p>
             * 
             * <strong>example:</strong>
             * <p>5.7</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Softwares build() {
                return new Softwares(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateServiceRequest} extends {@link TeaModel}
     *
     * <p>UpdateServiceRequest</p>
     */
    public static class ServiceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Agreements")
        private java.util.List<Agreements> agreements;

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

        @com.aliyun.core.annotation.NameInMap("Softwares")
        private java.util.List<Softwares> softwares;

        private ServiceInfo(Builder builder) {
            this.agreements = builder.agreements;
            this.image = builder.image;
            this.locale = builder.locale;
            this.longDescriptionUrl = builder.longDescriptionUrl;
            this.name = builder.name;
            this.shortDescription = builder.shortDescription;
            this.softwares = builder.softwares;
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
        public java.util.List<Agreements> getAgreements() {
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

        /**
         * @return softwares
         */
        public java.util.List<Softwares> getSoftwares() {
            return this.softwares;
        }

        public static final class Builder {
            private java.util.List<Agreements> agreements; 
            private String image; 
            private String locale; 
            private String longDescriptionUrl; 
            private String name; 
            private String shortDescription; 
            private java.util.List<Softwares> softwares; 

            private Builder() {
            } 

            private Builder(ServiceInfo model) {
                this.agreements = model.agreements;
                this.image = model.image;
                this.locale = model.locale;
                this.longDescriptionUrl = model.longDescriptionUrl;
                this.name = model.name;
                this.shortDescription = model.shortDescription;
                this.softwares = model.softwares;
            } 

            /**
             * <p>Protocol document information about the service.</p>
             */
            public Builder agreements(java.util.List<Agreements> agreements) {
                this.agreements = agreements;
                return this;
            }

            /**
             * <p>The URL of the service icon.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://img.tidb.oss.url">http://img.tidb.oss.url</a></p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The language of the service. Valid values:</p>
             * <ul>
             * <li>zh-CN: Chinese</li>
             * <li>en-US: English</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>zh-CN</p>
             */
            public Builder locale(String locale) {
                this.locale = locale;
                return this;
            }

            /**
             * <p>The URL of the detailed description of the service.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://description.tidb.oss.url">http://description.tidb.oss.url</a></p>
             */
            public Builder longDescriptionUrl(String longDescriptionUrl) {
                this.longDescriptionUrl = longDescriptionUrl;
                return this;
            }

            /**
             * <p>The service name.</p>
             * 
             * <strong>example:</strong>
             * <p>Metric Name, filled in when Type is ComputeNestBill or ComputeNestPrometheus</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The description of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>The URL of the detailed description of the service.</p>
             */
            public Builder shortDescription(String shortDescription) {
                this.shortDescription = shortDescription;
                return this;
            }

            /**
             * <p>The list of the software in the service.</p>
             */
            public Builder softwares(java.util.List<Softwares> softwares) {
                this.softwares = softwares;
                return this;
            }

            public ServiceInfo build() {
                return new ServiceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateServiceRequest} extends {@link TeaModel}
     *
     * <p>UpdateServiceRequest</p>
     */
    public static class UpdateOption extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UpdateArtifact")
        private Boolean updateArtifact;

        @com.aliyun.core.annotation.NameInMap("UpdateFrom")
        private String updateFrom;

        private UpdateOption(Builder builder) {
            this.updateArtifact = builder.updateArtifact;
            this.updateFrom = builder.updateFrom;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateOption create() {
            return builder().build();
        }

        /**
         * @return updateArtifact
         */
        public Boolean getUpdateArtifact() {
            return this.updateArtifact;
        }

        /**
         * @return updateFrom
         */
        public String getUpdateFrom() {
            return this.updateFrom;
        }

        public static final class Builder {
            private Boolean updateArtifact; 
            private String updateFrom; 

            private Builder() {
            } 

            private Builder(UpdateOption model) {
                this.updateArtifact = model.updateArtifact;
                this.updateFrom = model.updateFrom;
            } 

            /**
             * <p>Whether to update artifact.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder updateArtifact(Boolean updateArtifact) {
                this.updateArtifact = updateArtifact;
                return this;
            }

            /**
             * <p>Update from. Valid values:</p>
             * <ul>
             * <li>CODE</li>
             * <li>PARAMETERS</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PARAMETERS</p>
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
