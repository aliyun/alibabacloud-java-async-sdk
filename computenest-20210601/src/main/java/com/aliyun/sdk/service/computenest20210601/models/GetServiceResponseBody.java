// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link GetServiceResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceResponseBody</p>
 */
public class GetServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlarmMetadata")
    private String alarmMetadata;

    @com.aliyun.core.annotation.NameInMap("Categories")
    private String categories;

    @com.aliyun.core.annotation.NameInMap("Commodity")
    private Commodity commodity;

    @com.aliyun.core.annotation.NameInMap("DeployFrom")
    private String deployFrom;

    @com.aliyun.core.annotation.NameInMap("DeployMetadata")
    private String deployMetadata;

    @com.aliyun.core.annotation.NameInMap("DeployType")
    private String deployType;

    @com.aliyun.core.annotation.NameInMap("Duration")
    private Long duration;

    @com.aliyun.core.annotation.NameInMap("InstanceRoleInfos")
    private java.util.List<InstanceRoleInfos> instanceRoleInfos;

    @com.aliyun.core.annotation.NameInMap("IsSupportOperated")
    private Boolean isSupportOperated;

    @com.aliyun.core.annotation.NameInMap("LicenseMetadata")
    private String licenseMetadata;

    @com.aliyun.core.annotation.NameInMap("LogMetadata")
    private String logMetadata;

    @com.aliyun.core.annotation.NameInMap("OperationMetadata")
    private String operationMetadata;

    @com.aliyun.core.annotation.NameInMap("Permission")
    private String permission;

    @com.aliyun.core.annotation.NameInMap("PolicyNames")
    private String policyNames;

    @com.aliyun.core.annotation.NameInMap("PublishTime")
    private String publishTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceDocumentInfos")
    private java.util.List<ServiceDocumentInfos> serviceDocumentInfos;

    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    @com.aliyun.core.annotation.NameInMap("ServiceInfos")
    private java.util.List<ServiceInfos> serviceInfos;

    @com.aliyun.core.annotation.NameInMap("ServiceProductUrl")
    private String serviceProductUrl;

    @com.aliyun.core.annotation.NameInMap("ServiceType")
    private String serviceType;

    @com.aliyun.core.annotation.NameInMap("ShareType")
    private String shareType;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SupplierDesc")
    private String supplierDesc;

    @com.aliyun.core.annotation.NameInMap("SupplierLogo")
    private String supplierLogo;

    @com.aliyun.core.annotation.NameInMap("SupplierName")
    private String supplierName;

    @com.aliyun.core.annotation.NameInMap("SupplierUid")
    private Long supplierUid;

    @com.aliyun.core.annotation.NameInMap("SupplierUrl")
    private String supplierUrl;

    @com.aliyun.core.annotation.NameInMap("SupportContacts")
    private java.util.List<SupportContacts> supportContacts;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.NameInMap("TenantType")
    private String tenantType;

    @com.aliyun.core.annotation.NameInMap("TrialDuration")
    private Long trialDuration;

    @com.aliyun.core.annotation.NameInMap("TrialType")
    private String trialType;

    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    @com.aliyun.core.annotation.NameInMap("VersionName")
    private String versionName;

    private GetServiceResponseBody(Builder builder) {
        this.alarmMetadata = builder.alarmMetadata;
        this.categories = builder.categories;
        this.commodity = builder.commodity;
        this.deployFrom = builder.deployFrom;
        this.deployMetadata = builder.deployMetadata;
        this.deployType = builder.deployType;
        this.duration = builder.duration;
        this.instanceRoleInfos = builder.instanceRoleInfos;
        this.isSupportOperated = builder.isSupportOperated;
        this.licenseMetadata = builder.licenseMetadata;
        this.logMetadata = builder.logMetadata;
        this.operationMetadata = builder.operationMetadata;
        this.permission = builder.permission;
        this.policyNames = builder.policyNames;
        this.publishTime = builder.publishTime;
        this.requestId = builder.requestId;
        this.serviceDocumentInfos = builder.serviceDocumentInfos;
        this.serviceId = builder.serviceId;
        this.serviceInfos = builder.serviceInfos;
        this.serviceProductUrl = builder.serviceProductUrl;
        this.serviceType = builder.serviceType;
        this.shareType = builder.shareType;
        this.status = builder.status;
        this.supplierDesc = builder.supplierDesc;
        this.supplierLogo = builder.supplierLogo;
        this.supplierName = builder.supplierName;
        this.supplierUid = builder.supplierUid;
        this.supplierUrl = builder.supplierUrl;
        this.supportContacts = builder.supportContacts;
        this.tags = builder.tags;
        this.tenantType = builder.tenantType;
        this.trialDuration = builder.trialDuration;
        this.trialType = builder.trialType;
        this.version = builder.version;
        this.versionName = builder.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceResponseBody create() {
        return builder().build();
    }

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
     * @return categories
     */
    public String getCategories() {
        return this.categories;
    }

    /**
     * @return commodity
     */
    public Commodity getCommodity() {
        return this.commodity;
    }

    /**
     * @return deployFrom
     */
    public String getDeployFrom() {
        return this.deployFrom;
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
     * @return instanceRoleInfos
     */
    public java.util.List<InstanceRoleInfos> getInstanceRoleInfos() {
        return this.instanceRoleInfos;
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
     * @return permission
     */
    public String getPermission() {
        return this.permission;
    }

    /**
     * @return policyNames
     */
    public String getPolicyNames() {
        return this.policyNames;
    }

    /**
     * @return publishTime
     */
    public String getPublishTime() {
        return this.publishTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceDocumentInfos
     */
    public java.util.List<ServiceDocumentInfos> getServiceDocumentInfos() {
        return this.serviceDocumentInfos;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return serviceInfos
     */
    public java.util.List<ServiceInfos> getServiceInfos() {
        return this.serviceInfos;
    }

    /**
     * @return serviceProductUrl
     */
    public String getServiceProductUrl() {
        return this.serviceProductUrl;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return supplierDesc
     */
    public String getSupplierDesc() {
        return this.supplierDesc;
    }

    /**
     * @return supplierLogo
     */
    public String getSupplierLogo() {
        return this.supplierLogo;
    }

    /**
     * @return supplierName
     */
    public String getSupplierName() {
        return this.supplierName;
    }

    /**
     * @return supplierUid
     */
    public Long getSupplierUid() {
        return this.supplierUid;
    }

    /**
     * @return supplierUrl
     */
    public String getSupplierUrl() {
        return this.supplierUrl;
    }

    /**
     * @return supportContacts
     */
    public java.util.List<SupportContacts> getSupportContacts() {
        return this.supportContacts;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
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
     * @return trialType
     */
    public String getTrialType() {
        return this.trialType;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * @return versionName
     */
    public String getVersionName() {
        return this.versionName;
    }

    public static final class Builder {
        private String alarmMetadata; 
        private String categories; 
        private Commodity commodity; 
        private String deployFrom; 
        private String deployMetadata; 
        private String deployType; 
        private Long duration; 
        private java.util.List<InstanceRoleInfos> instanceRoleInfos; 
        private Boolean isSupportOperated; 
        private String licenseMetadata; 
        private String logMetadata; 
        private String operationMetadata; 
        private String permission; 
        private String policyNames; 
        private String publishTime; 
        private String requestId; 
        private java.util.List<ServiceDocumentInfos> serviceDocumentInfos; 
        private String serviceId; 
        private java.util.List<ServiceInfos> serviceInfos; 
        private String serviceProductUrl; 
        private String serviceType; 
        private String shareType; 
        private String status; 
        private String supplierDesc; 
        private String supplierLogo; 
        private String supplierName; 
        private Long supplierUid; 
        private String supplierUrl; 
        private java.util.List<SupportContacts> supportContacts; 
        private java.util.List<Tags> tags; 
        private String tenantType; 
        private Long trialDuration; 
        private String trialType; 
        private String version; 
        private String versionName; 

        private Builder() {
        } 

        private Builder(GetServiceResponseBody model) {
            this.alarmMetadata = model.alarmMetadata;
            this.categories = model.categories;
            this.commodity = model.commodity;
            this.deployFrom = model.deployFrom;
            this.deployMetadata = model.deployMetadata;
            this.deployType = model.deployType;
            this.duration = model.duration;
            this.instanceRoleInfos = model.instanceRoleInfos;
            this.isSupportOperated = model.isSupportOperated;
            this.licenseMetadata = model.licenseMetadata;
            this.logMetadata = model.logMetadata;
            this.operationMetadata = model.operationMetadata;
            this.permission = model.permission;
            this.policyNames = model.policyNames;
            this.publishTime = model.publishTime;
            this.requestId = model.requestId;
            this.serviceDocumentInfos = model.serviceDocumentInfos;
            this.serviceId = model.serviceId;
            this.serviceInfos = model.serviceInfos;
            this.serviceProductUrl = model.serviceProductUrl;
            this.serviceType = model.serviceType;
            this.shareType = model.shareType;
            this.status = model.status;
            this.supplierDesc = model.supplierDesc;
            this.supplierLogo = model.supplierLogo;
            this.supplierName = model.supplierName;
            this.supplierUid = model.supplierUid;
            this.supplierUrl = model.supplierUrl;
            this.supportContacts = model.supportContacts;
            this.tags = model.tags;
            this.tenantType = model.tenantType;
            this.trialDuration = model.trialDuration;
            this.trialType = model.trialType;
            this.version = model.version;
            this.versionName = model.versionName;
        } 

        /**
         * <p>The alert configurations of the service.</p>
         * <blockquote>
         * <p> This parameter takes effect only when you specify an alert policy for <strong>PolicyNames</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;TemplateUrl&quot;: &quot;<a href="http://template.file.url">http://template.file.url</a>&quot;, &quot;ApplicationGroups&quot;: [ { &quot;Name&quot;: &quot;applicationGroup1&quot;, &quot;TemplateUrl&quot;: &quot;url1&quot; }, { &quot;Name&quot;: &quot;applicationGroup2&quot;, &quot;TemplateUrl&quot;: &quot;url2&quot; } ] }</p>
         */
        public Builder alarmMetadata(String alarmMetadata) {
            this.alarmMetadata = alarmMetadata;
            return this;
        }

        /**
         * <p>The categories of the Flow.</p>
         * 
         * <strong>example:</strong>
         * <p>AI</p>
         */
        public Builder categories(String categories) {
            this.categories = categories;
            return this;
        }

        /**
         * <p>The information about the order placed in Alibaba Cloud Marketplace.</p>
         */
        public Builder commodity(Commodity commodity) {
            this.commodity = commodity;
            return this;
        }

        /**
         * <p>Service deployment approach, Valid values：</p>
         * <ul>
         * <li>NoWhere</li>
         * <li>Marketplace</li>
         * <li>ComputeNest</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Marketplace</p>
         */
        public Builder deployFrom(String deployFrom) {
            this.deployFrom = deployFrom;
            return this;
        }

        /**
         * <p>The storage configurations of the service. The format in which the deployment information of a service is stored varies based on the deployment type of the service. In this case, the deployment information is stored in the JSON string format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;TemplateUrl&quot;: &quot;<a href="http://tidbRosFile%5C%22%7D">http://tidbRosFile\&quot;}</a></p>
         */
        public Builder deployMetadata(String deployMetadata) {
            this.deployMetadata = deployMetadata;
            return this;
        }

        /**
         * <p>The deployment type of the service. Valid values:</p>
         * <ul>
         * <li>ros: The service is deployed by using Resource Orchestration Service (ROS).</li>
         * <li>terraform: The service is deployed by using Terraform.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ros</p>
         */
        public Builder deployType(String deployType) {
            this.deployType = deployType;
            return this;
        }

        /**
         * <p>The duration for which hosted O&amp;M is implemented. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>259200</p>
         */
        public Builder duration(Long duration) {
            this.duration = duration;
            return this;
        }

        /**
         * <p>Information about the ram role created in the service template.</p>
         */
        public Builder instanceRoleInfos(java.util.List<InstanceRoleInfos> instanceRoleInfos) {
            this.instanceRoleInfos = instanceRoleInfos;
            return this;
        }

        /**
         * <p>Indicates whether the hosted O&amp;M feature is enabled for the service. Default value: false. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is returned if you set <strong>ServiceType</strong> to <strong>private</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isSupportOperated(Boolean isSupportOperated) {
            this.isSupportOperated = isSupportOperated;
            return this;
        }

        /**
         * <p>The license metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;PayType&quot;:&quot;CustomFixTime&quot;,&quot;DefaultLicenseDays&quot;:7,&quot;CustomMetadata&quot;:[{&quot;TemplateName&quot;:&quot;ECS&quot;,&quot;SpecificationName&quot;:&quot;bandwith-0&quot;,&quot;CustomData&quot;:&quot;1&quot;}]}</p>
         */
        public Builder licenseMetadata(String licenseMetadata) {
            this.licenseMetadata = licenseMetadata;
            return this;
        }

        /**
         * <p>The logging configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Logstores&quot;:[]}</p>
         */
        public Builder logMetadata(String logMetadata) {
            this.logMetadata = logMetadata;
            return this;
        }

        /**
         * <p>The operation metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;PrometheusConfigMap&quot;:{&quot;New_Vpc_Ack_And_Jumpserver&quot;:{}}}</p>
         */
        public Builder operationMetadata(String operationMetadata) {
            this.operationMetadata = operationMetadata;
            return this;
        }

        /**
         * <p>The permissions on the service. Valid values:</p>
         * <ul>
         * <li>Deployable: Permissions to deploy the service.</li>
         * <li>Accessible: Permissions to access the service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Deployable</p>
         */
        public Builder permission(String permission) {
            this.permission = permission;
            return this;
        }

        /**
         * <p>The policy name. The name can be up to 128 characters in length. Separate multiple names with commas (,). Only hosted O&amp;M policies are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>policyName1, policyName2</p>
         */
        public Builder policyNames(String policyNames) {
            this.policyNames = policyNames;
            return this;
        }

        /**
         * <p>The time when the service was published.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-21T00:00:00Z</p>
         */
        public Builder publishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>06BF8F22-02DC-4750-83DF-3FFC11C065EA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Service document information.</p>
         */
        public Builder serviceDocumentInfos(java.util.List<ServiceDocumentInfos> serviceDocumentInfos) {
            this.serviceDocumentInfos = serviceDocumentInfos;
            return this;
        }

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>service-0e6fca6a51a544xxxxxx</p>
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The information about the service.</p>
         */
        public Builder serviceInfos(java.util.List<ServiceInfos> serviceInfos) {
            this.serviceInfos = serviceInfos;
            return this;
        }

        /**
         * <p>The URL of the service page.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example1.com">http://example1.com</a></p>
         */
        public Builder serviceProductUrl(String serviceProductUrl) {
            this.serviceProductUrl = serviceProductUrl;
            return this;
        }

        /**
         * <p>The type of the service. Valid values:</p>
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
            this.shareType = shareType;
            return this;
        }

        /**
         * <p>The deploy status of the service. Valid values:</p>
         * <ul>
         * <li>Draft</li>
         * <li>Beta</li>
         * <li>Submitted</li>
         * <li>Approved</li>
         * <li>Launching</li>
         * <li>Online</li>
         * <li>Offline</li>
         * <li>Creating</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Online</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The description of service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>Computing Nest Community service</p>
         */
        public Builder supplierDesc(String supplierDesc) {
            this.supplierDesc = supplierDesc;
            return this;
        }

        /**
         * <p>The Logo of service provider.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://service-info-public.oss-cn-hangzhou.aliyuncs.com/xxx/service-image/xxx.png">https://service-info-public.oss-cn-hangzhou.aliyuncs.com/xxx/service-image/xxx.png</a></p>
         */
        public Builder supplierLogo(String supplierLogo) {
            this.supplierLogo = supplierLogo;
            return this;
        }

        /**
         * <p>The name of the service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud</p>
         */
        public Builder supplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID of the service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>158927391332*****</p>
         */
        public Builder supplierUid(Long supplierUid) {
            this.supplierUid = supplierUid;
            return this;
        }

        /**
         * <p>The URL of the service provider.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com">http://example.com</a></p>
         */
        public Builder supplierUrl(String supplierUrl) {
            this.supplierUrl = supplierUrl;
            return this;
        }

        /**
         * SupportContacts.
         */
        public Builder supportContacts(java.util.List<SupportContacts> supportContacts) {
            this.supportContacts = supportContacts;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
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
            this.trialDuration = trialDuration;
            return this;
        }

        /**
         * <p>The trial policy. Valid values:</p>
         * <ul>
         * <li>Trial: Trials are supported.</li>
         * <li>NotTrial: Trials are not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Trial</p>
         */
        public Builder trialType(String trialType) {
            this.trialType = trialType;
            return this;
        }

        /**
         * <p>The service version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * <p>The version name.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder versionName(String versionName) {
            this.versionName = versionName;
            return this;
        }

        public GetServiceResponseBody build() {
            return new GetServiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceResponseBody</p>
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
             * <p>The mappings.</p>
             */
            public Builder mappings(java.util.Map<String, String> mappings) {
                this.mappings = mappings;
                return this;
            }

            /**
             * <p>The template name.</p>
             * 
             * <strong>example:</strong>
             * <p>Template one.</p>
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
     * {@link GetServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceResponseBody</p>
     */
    public static class CssMetadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentsMappings")
        private java.util.List<ComponentsMappings> componentsMappings;

        private CssMetadata(Builder builder) {
            this.componentsMappings = builder.componentsMappings;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CssMetadata create() {
            return builder().build();
        }

        /**
         * @return componentsMappings
         */
        public java.util.List<ComponentsMappings> getComponentsMappings() {
            return this.componentsMappings;
        }

        public static final class Builder {
            private java.util.List<ComponentsMappings> componentsMappings; 

            private Builder() {
            } 

            private Builder(CssMetadata model) {
                this.componentsMappings = model.componentsMappings;
            } 

            /**
             * <p>The mapping information about the billing items.</p>
             */
            public Builder componentsMappings(java.util.List<ComponentsMappings> componentsMappings) {
                this.componentsMappings = componentsMappings;
                return this;
            }

            public CssMetadata build() {
                return new CssMetadata(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceResponseBody</p>
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
             * <p>The specification code of the service in Alibaba Cloud Marketplace.</p>
             * 
             * <strong>example:</strong>
             * <p>cmjj00****</p>
             */
            public Builder specificationCode(String specificationCode) {
                this.specificationCode = specificationCode;
                return this;
            }

            /**
             * <p>The package name.</p>
             * 
             * <strong>example:</strong>
             * <p>Package one.</p>
             */
            public Builder specificationName(String specificationName) {
                this.specificationName = specificationName;
                return this;
            }

            /**
             * <p>The template name.</p>
             * 
             * <strong>example:</strong>
             * <p>Template one.</p>
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
     * {@link GetServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceResponseBody</p>
     */
    public static class MarketplaceMetadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SpecificationMappings")
        private java.util.List<SpecificationMappings> specificationMappings;

        private MarketplaceMetadata(Builder builder) {
            this.specificationMappings = builder.specificationMappings;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MarketplaceMetadata create() {
            return builder().build();
        }

        /**
         * @return specificationMappings
         */
        public java.util.List<SpecificationMappings> getSpecificationMappings() {
            return this.specificationMappings;
        }

        public static final class Builder {
            private java.util.List<SpecificationMappings> specificationMappings; 

            private Builder() {
            } 

            private Builder(MarketplaceMetadata model) {
                this.specificationMappings = model.specificationMappings;
            } 

            /**
             * <p>The mappings between the service specifications and the template or package.</p>
             */
            public Builder specificationMappings(java.util.List<SpecificationMappings> specificationMappings) {
                this.specificationMappings = specificationMappings;
                return this;
            }

            public MarketplaceMetadata build() {
                return new MarketplaceMetadata(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceResponseBody</p>
     */
    public static class Specifications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Times")
        private java.util.List<String> times;

        private Specifications(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
            this.times = builder.times;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Specifications create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return times
         */
        public java.util.List<String> getTimes() {
            return this.times;
        }

        public static final class Builder {
            private String code; 
            private String name; 
            private java.util.List<String> times; 

            private Builder() {
            } 

            private Builder(Specifications model) {
                this.code = model.code;
                this.name = model.name;
                this.times = model.times;
            } 

            /**
             * <p>The commodity code.</p>
             * 
             * <strong>example:</strong>
             * <p>cmjj00****</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The specification name.</p>
             * 
             * <strong>example:</strong>
             * <p>specifications1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The subscription duration. Unit: week or year.</p>
             */
            public Builder times(java.util.List<String> times) {
                this.times = times;
                return this;
            }

            public Specifications build() {
                return new Specifications(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceResponseBody</p>
     */
    public static class Commodity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("CssMetadata")
        private CssMetadata cssMetadata;

        @com.aliyun.core.annotation.NameInMap("DeployPage")
        private String deployPage;

        @com.aliyun.core.annotation.NameInMap("MarketplaceMetadata")
        private MarketplaceMetadata marketplaceMetadata;

        @com.aliyun.core.annotation.NameInMap("OrderTime")
        private java.util.Map<String, java.util.List<String>> orderTime;

        @com.aliyun.core.annotation.NameInMap("SaasBoostMetadata")
        private String saasBoostMetadata;

        @com.aliyun.core.annotation.NameInMap("Specifications")
        private java.util.List<Specifications> specifications;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Commodity(Builder builder) {
            this.chargeType = builder.chargeType;
            this.commodityCode = builder.commodityCode;
            this.cssMetadata = builder.cssMetadata;
            this.deployPage = builder.deployPage;
            this.marketplaceMetadata = builder.marketplaceMetadata;
            this.orderTime = builder.orderTime;
            this.saasBoostMetadata = builder.saasBoostMetadata;
            this.specifications = builder.specifications;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Commodity create() {
            return builder().build();
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return cssMetadata
         */
        public CssMetadata getCssMetadata() {
            return this.cssMetadata;
        }

        /**
         * @return deployPage
         */
        public String getDeployPage() {
            return this.deployPage;
        }

        /**
         * @return marketplaceMetadata
         */
        public MarketplaceMetadata getMarketplaceMetadata() {
            return this.marketplaceMetadata;
        }

        /**
         * @return orderTime
         */
        public java.util.Map<String, java.util.List<String>> getOrderTime() {
            return this.orderTime;
        }

        /**
         * @return saasBoostMetadata
         */
        public String getSaasBoostMetadata() {
            return this.saasBoostMetadata;
        }

        /**
         * @return specifications
         */
        public java.util.List<Specifications> getSpecifications() {
            return this.specifications;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String chargeType; 
            private String commodityCode; 
            private CssMetadata cssMetadata; 
            private String deployPage; 
            private MarketplaceMetadata marketplaceMetadata; 
            private java.util.Map<String, java.util.List<String>> orderTime; 
            private String saasBoostMetadata; 
            private java.util.List<Specifications> specifications; 
            private String type; 

            private Builder() {
            } 

            private Builder(Commodity model) {
                this.chargeType = model.chargeType;
                this.commodityCode = model.commodityCode;
                this.cssMetadata = model.cssMetadata;
                this.deployPage = model.deployPage;
                this.marketplaceMetadata = model.marketplaceMetadata;
                this.orderTime = model.orderTime;
                this.saasBoostMetadata = model.saasBoostMetadata;
                this.specifications = model.specifications;
                this.type = model.type;
            } 

            /**
             * <p>The billing method of the service. Valid values:</p>
             * <ul>
             * <li><strong>PREPAY</strong> (default): subscription.</li>
             * <li><strong>POSTPAY</strong>: pay-as-you-go.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>POSTPAY</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The commodity code of the service in Alibaba Cloud Marketplace.</p>
             * 
             * <strong>example:</strong>
             * <p>cmjj00****</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>The configuration metadata related to Lingxiao.</p>
             */
            public Builder cssMetadata(CssMetadata cssMetadata) {
                this.cssMetadata = cssMetadata;
                return this;
            }

            /**
             * <p>The deploy page.</p>
             * 
             * <strong>example:</strong>
             * <p>Order： Order page
             * Detail： Detail page</p>
             */
            public Builder deployPage(String deployPage) {
                this.deployPage = deployPage;
                return this;
            }

            /**
             * <p>The metadata of Alibaba Cloud Marketplace.</p>
             */
            public Builder marketplaceMetadata(MarketplaceMetadata marketplaceMetadata) {
                this.marketplaceMetadata = marketplaceMetadata;
                return this;
            }

            /**
             * <p>The order time.</p>
             */
            public Builder orderTime(java.util.Map<String, java.util.List<String>> orderTime) {
                this.orderTime = orderTime;
                return this;
            }

            /**
             * <p>The configuration metadata related to Saas Boost.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;Enabled&quot;:false    &quot;PublicAccessUrl&quot;:&quot;<a href="https://example.com">https://example.com</a>&quot;
             * }</p>
             */
            public Builder saasBoostMetadata(String saasBoostMetadata) {
                this.saasBoostMetadata = saasBoostMetadata;
                return this;
            }

            /**
             * <p>The specification details of the service in Alibaba Cloud Marketplace.</p>
             */
            public Builder specifications(java.util.List<Specifications> specifications) {
                this.specifications = specifications;
                return this;
            }

            /**
             * <p>The service type. Valid values:</p>
             * <ul>
             * <li>marketplace: Alibaba Cloud Marketplace.</li>
             * <li>Css: Lingxiao.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Marketplace</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Commodity build() {
                return new Commodity(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceResponseBody</p>
     */
    public static class InstanceRoleInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PolicyDocument")
        private String policyDocument;

        @com.aliyun.core.annotation.NameInMap("Principals")
        private java.util.List<String> principals;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        private InstanceRoleInfos(Builder builder) {
            this.policyDocument = builder.policyDocument;
            this.principals = builder.principals;
            this.roleName = builder.roleName;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceRoleInfos create() {
            return builder().build();
        }

        /**
         * @return policyDocument
         */
        public String getPolicyDocument() {
            return this.policyDocument;
        }

        /**
         * @return principals
         */
        public java.util.List<String> getPrincipals() {
            return this.principals;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        public static final class Builder {
            private String policyDocument; 
            private java.util.List<String> principals; 
            private String roleName; 
            private String templateName; 

            private Builder() {
            } 

            private Builder(InstanceRoleInfos model) {
                this.policyDocument = model.policyDocument;
                this.principals = model.principals;
                this.roleName = model.roleName;
                this.templateName = model.templateName;
            } 

            /**
             * <p>The content of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>{\n  &quot;Version&quot;: &quot;1&quot;,\n  &quot;Statement&quot;: [\n    {\n      &quot;Effect&quot;: &quot;Allow&quot;,\n      &quot;Action&quot;: &quot;<em>&quot;,\n      &quot;Principal&quot;: &quot;</em>&quot;,\n      &quot;Resource&quot;: &quot;*&quot;\n    }\n  ]\n}</p>
             */
            public Builder policyDocument(String policyDocument) {
                this.policyDocument = policyDocument;
                return this;
            }

            /**
             * <p>The information of the RAM entity.</p>
             */
            public Builder principals(java.util.List<String> principals) {
                this.principals = principals;
                return this;
            }

            /**
             * <p>The ram role name.</p>
             * 
             * <strong>example:</strong>
             * <p>ram-for-dts</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * <p>The template name.</p>
             * 
             * <strong>example:</strong>
             * <p>Template one.</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            public InstanceRoleInfos build() {
                return new InstanceRoleInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceResponseBody</p>
     */
    public static class ServiceDocumentInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DocumentUrl")
        private String documentUrl;

        @com.aliyun.core.annotation.NameInMap("Locale")
        private String locale;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        private ServiceDocumentInfos(Builder builder) {
            this.documentUrl = builder.documentUrl;
            this.locale = builder.locale;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceDocumentInfos create() {
            return builder().build();
        }

        /**
         * @return documentUrl
         */
        public String getDocumentUrl() {
            return this.documentUrl;
        }

        /**
         * @return locale
         */
        public String getLocale() {
            return this.locale;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        public static final class Builder {
            private String documentUrl; 
            private String locale; 
            private String templateName; 

            private Builder() {
            } 

            private Builder(ServiceDocumentInfos model) {
                this.documentUrl = model.documentUrl;
                this.locale = model.locale;
                this.templateName = model.templateName;
            } 

            /**
             * <p>The URL that is used to access the document.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://help.aliyun.com/zh/compute-nest/use-cases/deploy-an-sd-painting-service-instance?spm=a2c4g.11186623.0.i2">https://help.aliyun.com/zh/compute-nest/use-cases/deploy-an-sd-painting-service-instance?spm=a2c4g.11186623.0.i2</a></p>
             */
            public Builder documentUrl(String documentUrl) {
                this.documentUrl = documentUrl;
                return this;
            }

            /**
             * <p>The language that you use for the query. Valid values: zh-CN and en-US.</p>
             * 
             * <strong>example:</strong>
             * <p>zh-CN</p>
             */
            public Builder locale(String locale) {
                this.locale = locale;
                return this;
            }

            /**
             * <p>The template name.</p>
             * 
             * <strong>example:</strong>
             * <p>Template one.</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            public ServiceDocumentInfos build() {
                return new ServiceDocumentInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceResponseBody</p>
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
             * <p>The agreement name.</p>
             * 
             * <strong>example:</strong>
             * <p>User agreement</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The agreement URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://url">https://url</a></p>
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
     * {@link GetServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceResponseBody</p>
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
             * <p>The name of the Software.</p>
             * 
             * <strong>example:</strong>
             * <p>wordpress</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The version of the software.</p>
             * 
             * <strong>example:</strong>
             * <p>6.0.1</p>
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
     * {@link GetServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceResponseBody</p>
     */
    public static class ServiceInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Agreements")
        private java.util.List<Agreements> agreements;

        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("Locale")
        private String locale;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ShortDescription")
        private String shortDescription;

        @com.aliyun.core.annotation.NameInMap("Softwares")
        private java.util.List<Softwares> softwares;

        private ServiceInfos(Builder builder) {
            this.agreements = builder.agreements;
            this.image = builder.image;
            this.locale = builder.locale;
            this.name = builder.name;
            this.shortDescription = builder.shortDescription;
            this.softwares = builder.softwares;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceInfos create() {
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
            private String name; 
            private String shortDescription; 
            private java.util.List<Softwares> softwares; 

            private Builder() {
            } 

            private Builder(ServiceInfos model) {
                this.agreements = model.agreements;
                this.image = model.image;
                this.locale = model.locale;
                this.name = model.name;
                this.shortDescription = model.shortDescription;
                this.softwares = model.softwares;
            } 

            /**
             * <p>The agreement information about the service.</p>
             */
            public Builder agreements(java.util.List<Agreements> agreements) {
                this.agreements = agreements;
                return this;
            }

            /**
             * <p>The URL of the service icon.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/service-image/c1c4a559-cc60-4af1-b976-98f356602462.png">https://example.com/service-image/c1c4a559-cc60-4af1-b976-98f356602462.png</a></p>
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
             * <p>The service name.</p>
             * 
             * <strong>example:</strong>
             * <p>Service document information.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The description of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>Docker Community Edition (CE) is a free version of the Docker project, aimed at developers, enthusiasts, and individuals and organizations who want to use container technology.</p>
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

            public ServiceInfos build() {
                return new ServiceInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceResponseBody</p>
     */
    public static class SupportContacts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SupportContacts(Builder builder) {
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportContacts create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(SupportContacts model) {
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The service type. Valid values:</p>
             * <ul>
             * <li>marketplace: Alibaba Cloud Marketplace.</li>
             * <li>Css: Lingxiao.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Marketplace</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SupportContacts build() {
                return new SupportContacts(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>key1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
