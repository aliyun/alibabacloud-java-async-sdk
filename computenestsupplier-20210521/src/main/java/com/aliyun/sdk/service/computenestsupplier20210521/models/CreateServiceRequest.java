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
    @com.aliyun.core.annotation.NameInMap("ComplianceMetadata")
    private ComplianceMetadata complianceMetadata;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeployMetadata")
    private String deployMetadata;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeployType")
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceInfo")
    private java.util.List<ServiceInfo> serviceInfo;

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
    private java.util.List<Tag> tag;

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
    public java.util.List<Tag> getTag() {
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
        private String resourceGroupId; 
        private String serviceId; 
        private java.util.List<ServiceInfo> serviceInfo; 
        private String serviceType; 
        private String shareType; 
        private String sourceServiceId; 
        private String sourceServiceVersion; 
        private java.util.List<Tag> tag; 
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
         * <p>The alert configurations of the service.</p>
         * <blockquote>
         * <p> This parameter takes effect only when you specify an alert policy for <strong>PolicyNames</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;TemplateUrl&quot;: &quot;<a href="http://template.file.url">http://template.file.url</a>&quot;,
         *   // 应用分组级别告警元数据
         *   &quot;ApplicationGroups&quot;: [
         *     {
         *       &quot;Name&quot;: &quot;applicationGroup1&quot;,
         *       &quot;TemplateUrl&quot;: &quot;url1&quot;
         *     },
         *     {
         *       &quot;Name&quot;: &quot;applicationGroup2&quot;,
         *       &quot;TemplateUrl&quot;: &quot;url2&quot;
         *     }
         *   ]
         * }</p>
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
         * <p>The parameters for building the service</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;ServiceTemplateId&quot;: &quot;st-xxxxx&quot;}</p>
         */
        public Builder buildParameters(String buildParameters) {
            this.putQueryParameter("BuildParameters", buildParameters);
            this.buildParameters = buildParameters;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>10CM943JP0EN9D51H</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * <p>The storage configurations of the service. The format in which the deployment information of a service is stored varies based on the deployment type of the service. In this case, the deployment information is stored in the JSON string format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;TemplateConfigs&quot;:[{&quot;Name&quot;:&quot;模板1&quot;,&quot;Url&quot;:&quot;oss://computenest-test/template&quot; 
         *             + &quot;.json?RegionId=cn-beijing&quot;,&quot;PredefinedParameters&quot;:[{&quot;Name&quot;:&quot;低配版&quot;,&quot; 
         *             + &quot;&quot;Parameters&quot;:{&quot;InstanceType&quot;:&quot;ecs.g5.large&quot;,&quot;DataDiskSize&quot;:40}},{&quot;Name&quot;:&quot;高配版&quot;,&quot; 
         *             + &quot;&quot;Parameters&quot;:{&quot;InstanceType&quot;:&quot;ecs.g5.large&quot;,&quot;DataDiskSize&quot;:200}}]}]}</p>
         */
        public Builder deployMetadata(String deployMetadata) {
            this.putQueryParameter("DeployMetadata", deployMetadata);
            this.deployMetadata = deployMetadata;
            return this;
        }

        /**
         * <p>The deployment type of the service. Valid values:</p>
         * <ul>
         * <li>ros: The service is deployed by using Resource Orchestration Service (ROS).</li>
         * <li>terraform: The service is deployed by using Terraform.</li>
         * <li>ack: The service is deployed by using Container Service for Kubernetes (ACK).</li>
         * <li>spi: The service is deployed by calling a service provider interface (SPI).</li>
         * <li>operation: The service is deployed by using a hosted O&amp;M service.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>Specifies whether to perform only a dry run for the request to check information. Valid values:</p>
         * <ul>
         * <li>true: performs a dry run for the request, but does not create a service.</li>
         * <li>false: performs a dry run for the request, and create a service if the request passes the dry run.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>0</p>
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
         * <p>{&quot;RetentionDays&quot;:3}</p>
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
         * <p>{ &quot;Logstores&quot;: [ { &quot;LogstoreName&quot;: &quot;access-log&quot;, &quot;LogPath&quot;: &quot;/home/admin/app/logs&quot;, # This parameter is not required for containers. Configure the parameter in the YAML file. &quot;FilePattern&quot;: &quot;access.log*&quot; # This parameter is not required for containers. Configure the parameter in the YAML file. } ] }</p>
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
         * <p>{&quot;PrometheusConfigMap&quot;:{&quot;New_Vpc_Ack_And_Jumpserver&quot;:{}}}</p>
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
         * <p>The region ID.</p>
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
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek25refu7r3opq</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>service-0e6fca6a51a544xxxxxx</p>
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
         * <li>poc: The service is a trial service.</li>
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
         * <p>The source service ID for resell。</p>
         * 
         * <strong>example:</strong>
         * <p>service-70a3b15bb62643xxxxxx</p>
         */
        public Builder sourceServiceId(String sourceServiceId) {
            this.putQueryParameter("SourceServiceId", sourceServiceId);
            this.sourceServiceId = sourceServiceId;
            return this;
        }

        /**
         * <p>The source service version for resell。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sourceServiceVersion(String sourceServiceVersion) {
            this.putQueryParameter("SourceServiceVersion", sourceServiceVersion);
            this.sourceServiceVersion = sourceServiceVersion;
            return this;
        }

        /**
         * <p>The custom tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
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
        public Builder trialDuration(Long trialDuration) {
            this.putQueryParameter("TrialDuration", trialDuration);
            this.trialDuration = trialDuration;
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
        public CreateServiceRequest build() {
            return new CreateServiceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateServiceRequest} extends {@link TeaModel}
     *
     * <p>CreateServiceRequest</p>
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
             * <p>The compliance package selected.</p>
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
     * {@link CreateServiceRequest} extends {@link TeaModel}
     *
     * <p>CreateServiceRequest</p>
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
     * {@link CreateServiceRequest} extends {@link TeaModel}
     *
     * <p>CreateServiceRequest</p>
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
     * {@link CreateServiceRequest} extends {@link TeaModel}
     *
     * <p>CreateServiceRequest</p>
     */
    public static class ServiceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Agreements")
        private java.util.List<Agreements> agreements;

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
             * <p>This parameter is required.</p>
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>TiDB Database</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The description of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>TiDB是A公司自主设计、研发的开源分布式关系型数据库。</p>
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
     * {@link CreateServiceRequest} extends {@link TeaModel}
     *
     * <p>CreateServiceRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>Usage</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>Web</p>
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
