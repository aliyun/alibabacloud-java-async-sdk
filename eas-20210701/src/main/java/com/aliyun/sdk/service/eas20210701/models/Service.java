// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link Service} extends {@link TeaModel}
 *
 * <p>Service</p>
 */
public class Service extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessToken")
    private String accessToken;

    @com.aliyun.core.annotation.NameInMap("AppConfig")
    private String appConfig;

    @com.aliyun.core.annotation.NameInMap("AppSpecName")
    private String appSpecName;

    @com.aliyun.core.annotation.NameInMap("AppType")
    private String appType;

    @com.aliyun.core.annotation.NameInMap("AppVersion")
    private String appVersion;

    @com.aliyun.core.annotation.NameInMap("AutoscalerEnabled")
    private Boolean autoscalerEnabled;

    @com.aliyun.core.annotation.NameInMap("CallerUid")
    private String callerUid;

    @com.aliyun.core.annotation.NameInMap("Cpu")
    private Integer cpu;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CronscalerEnabled")
    private Boolean cronscalerEnabled;

    @com.aliyun.core.annotation.NameInMap("CurrentVersion")
    private Integer currentVersion;

    @com.aliyun.core.annotation.NameInMap("ExtraData")
    private String extraData;

    @com.aliyun.core.annotation.NameInMap("GPUCorePercentage")
    private Integer GPUCorePercentage;

    @com.aliyun.core.annotation.NameInMap("GPUMemory")
    private Integer GPUMemory;

    @com.aliyun.core.annotation.NameInMap("Gateway")
    private String gateway;

    @com.aliyun.core.annotation.NameInMap("Gpu")
    private Integer gpu;

    @com.aliyun.core.annotation.NameInMap("Image")
    private String image;

    @com.aliyun.core.annotation.NameInMap("InstanceCountInResource")
    private InstanceCountInResource instanceCountInResource;

    @com.aliyun.core.annotation.NameInMap("InternetEndpoint")
    private String internetEndpoint;

    @com.aliyun.core.annotation.NameInMap("IntranetEndpoint")
    private String intranetEndpoint;

    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Labels> labels;

    @com.aliyun.core.annotation.NameInMap("LatestVersion")
    private Integer latestVersion;

    @com.aliyun.core.annotation.NameInMap("Memory")
    private Integer memory;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("ParentUid")
    private String parentUid;

    @com.aliyun.core.annotation.NameInMap("PendingInstance")
    private Integer pendingInstance;

    @com.aliyun.core.annotation.NameInMap("QuotaId")
    private String quotaId;

    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resource")
    private String resource;

    @com.aliyun.core.annotation.NameInMap("ResourceAlias")
    private String resourceAlias;

    @com.aliyun.core.annotation.NameInMap("ResourceBurstable")
    private Boolean resourceBurstable;

    @com.aliyun.core.annotation.NameInMap("Role")
    private String role;

    @com.aliyun.core.annotation.NameInMap("RoleAttrs")
    private String roleAttrs;

    @com.aliyun.core.annotation.NameInMap("RunningInstance")
    private Integer runningInstance;

    @com.aliyun.core.annotation.NameInMap("SafetyLock")
    private String safetyLock;

    @com.aliyun.core.annotation.NameInMap("SecondaryInternetEndpoint")
    private String secondaryInternetEndpoint;

    @com.aliyun.core.annotation.NameInMap("SecondaryIntranetEndpoint")
    private String secondaryIntranetEndpoint;

    @com.aliyun.core.annotation.NameInMap("ServiceConfig")
    private String serviceConfig;

    @com.aliyun.core.annotation.NameInMap("ServiceGroup")
    private String serviceGroup;

    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.NameInMap("ServiceUid")
    private String serviceUid;

    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TotalInstance")
    private Integer totalInstance;

    @com.aliyun.core.annotation.NameInMap("TrafficState")
    private String trafficState;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("Weight")
    private Integer weight;

    @com.aliyun.core.annotation.NameInMap("WorkloadType")
    private String workloadType;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private Service(Builder builder) {
        this.accessToken = builder.accessToken;
        this.appConfig = builder.appConfig;
        this.appSpecName = builder.appSpecName;
        this.appType = builder.appType;
        this.appVersion = builder.appVersion;
        this.autoscalerEnabled = builder.autoscalerEnabled;
        this.callerUid = builder.callerUid;
        this.cpu = builder.cpu;
        this.createTime = builder.createTime;
        this.cronscalerEnabled = builder.cronscalerEnabled;
        this.currentVersion = builder.currentVersion;
        this.extraData = builder.extraData;
        this.GPUCorePercentage = builder.GPUCorePercentage;
        this.GPUMemory = builder.GPUMemory;
        this.gateway = builder.gateway;
        this.gpu = builder.gpu;
        this.image = builder.image;
        this.instanceCountInResource = builder.instanceCountInResource;
        this.internetEndpoint = builder.internetEndpoint;
        this.intranetEndpoint = builder.intranetEndpoint;
        this.labels = builder.labels;
        this.latestVersion = builder.latestVersion;
        this.memory = builder.memory;
        this.message = builder.message;
        this.namespace = builder.namespace;
        this.parentUid = builder.parentUid;
        this.pendingInstance = builder.pendingInstance;
        this.quotaId = builder.quotaId;
        this.reason = builder.reason;
        this.region = builder.region;
        this.requestId = builder.requestId;
        this.resource = builder.resource;
        this.resourceAlias = builder.resourceAlias;
        this.resourceBurstable = builder.resourceBurstable;
        this.role = builder.role;
        this.roleAttrs = builder.roleAttrs;
        this.runningInstance = builder.runningInstance;
        this.safetyLock = builder.safetyLock;
        this.secondaryInternetEndpoint = builder.secondaryInternetEndpoint;
        this.secondaryIntranetEndpoint = builder.secondaryIntranetEndpoint;
        this.serviceConfig = builder.serviceConfig;
        this.serviceGroup = builder.serviceGroup;
        this.serviceId = builder.serviceId;
        this.serviceName = builder.serviceName;
        this.serviceUid = builder.serviceUid;
        this.source = builder.source;
        this.status = builder.status;
        this.totalInstance = builder.totalInstance;
        this.trafficState = builder.trafficState;
        this.updateTime = builder.updateTime;
        this.weight = builder.weight;
        this.workloadType = builder.workloadType;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Service create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return appConfig
     */
    public String getAppConfig() {
        return this.appConfig;
    }

    /**
     * @return appSpecName
     */
    public String getAppSpecName() {
        return this.appSpecName;
    }

    /**
     * @return appType
     */
    public String getAppType() {
        return this.appType;
    }

    /**
     * @return appVersion
     */
    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * @return autoscalerEnabled
     */
    public Boolean getAutoscalerEnabled() {
        return this.autoscalerEnabled;
    }

    /**
     * @return callerUid
     */
    public String getCallerUid() {
        return this.callerUid;
    }

    /**
     * @return cpu
     */
    public Integer getCpu() {
        return this.cpu;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return cronscalerEnabled
     */
    public Boolean getCronscalerEnabled() {
        return this.cronscalerEnabled;
    }

    /**
     * @return currentVersion
     */
    public Integer getCurrentVersion() {
        return this.currentVersion;
    }

    /**
     * @return extraData
     */
    public String getExtraData() {
        return this.extraData;
    }

    /**
     * @return GPUCorePercentage
     */
    public Integer getGPUCorePercentage() {
        return this.GPUCorePercentage;
    }

    /**
     * @return GPUMemory
     */
    public Integer getGPUMemory() {
        return this.GPUMemory;
    }

    /**
     * @return gateway
     */
    public String getGateway() {
        return this.gateway;
    }

    /**
     * @return gpu
     */
    public Integer getGpu() {
        return this.gpu;
    }

    /**
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    /**
     * @return instanceCountInResource
     */
    public InstanceCountInResource getInstanceCountInResource() {
        return this.instanceCountInResource;
    }

    /**
     * @return internetEndpoint
     */
    public String getInternetEndpoint() {
        return this.internetEndpoint;
    }

    /**
     * @return intranetEndpoint
     */
    public String getIntranetEndpoint() {
        return this.intranetEndpoint;
    }

    /**
     * @return labels
     */
    public java.util.List<Labels> getLabels() {
        return this.labels;
    }

    /**
     * @return latestVersion
     */
    public Integer getLatestVersion() {
        return this.latestVersion;
    }

    /**
     * @return memory
     */
    public Integer getMemory() {
        return this.memory;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return parentUid
     */
    public String getParentUid() {
        return this.parentUid;
    }

    /**
     * @return pendingInstance
     */
    public Integer getPendingInstance() {
        return this.pendingInstance;
    }

    /**
     * @return quotaId
     */
    public String getQuotaId() {
        return this.quotaId;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resource
     */
    public String getResource() {
        return this.resource;
    }

    /**
     * @return resourceAlias
     */
    public String getResourceAlias() {
        return this.resourceAlias;
    }

    /**
     * @return resourceBurstable
     */
    public Boolean getResourceBurstable() {
        return this.resourceBurstable;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return roleAttrs
     */
    public String getRoleAttrs() {
        return this.roleAttrs;
    }

    /**
     * @return runningInstance
     */
    public Integer getRunningInstance() {
        return this.runningInstance;
    }

    /**
     * @return safetyLock
     */
    public String getSafetyLock() {
        return this.safetyLock;
    }

    /**
     * @return secondaryInternetEndpoint
     */
    public String getSecondaryInternetEndpoint() {
        return this.secondaryInternetEndpoint;
    }

    /**
     * @return secondaryIntranetEndpoint
     */
    public String getSecondaryIntranetEndpoint() {
        return this.secondaryIntranetEndpoint;
    }

    /**
     * @return serviceConfig
     */
    public String getServiceConfig() {
        return this.serviceConfig;
    }

    /**
     * @return serviceGroup
     */
    public String getServiceGroup() {
        return this.serviceGroup;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return serviceUid
     */
    public String getServiceUid() {
        return this.serviceUid;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return totalInstance
     */
    public Integer getTotalInstance() {
        return this.totalInstance;
    }

    /**
     * @return trafficState
     */
    public String getTrafficState() {
        return this.trafficState;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return weight
     */
    public Integer getWeight() {
        return this.weight;
    }

    /**
     * @return workloadType
     */
    public String getWorkloadType() {
        return this.workloadType;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String accessToken; 
        private String appConfig; 
        private String appSpecName; 
        private String appType; 
        private String appVersion; 
        private Boolean autoscalerEnabled; 
        private String callerUid; 
        private Integer cpu; 
        private String createTime; 
        private Boolean cronscalerEnabled; 
        private Integer currentVersion; 
        private String extraData; 
        private Integer GPUCorePercentage; 
        private Integer GPUMemory; 
        private String gateway; 
        private Integer gpu; 
        private String image; 
        private InstanceCountInResource instanceCountInResource; 
        private String internetEndpoint; 
        private String intranetEndpoint; 
        private java.util.List<Labels> labels; 
        private Integer latestVersion; 
        private Integer memory; 
        private String message; 
        private String namespace; 
        private String parentUid; 
        private Integer pendingInstance; 
        private String quotaId; 
        private String reason; 
        private String region; 
        private String requestId; 
        private String resource; 
        private String resourceAlias; 
        private Boolean resourceBurstable; 
        private String role; 
        private String roleAttrs; 
        private Integer runningInstance; 
        private String safetyLock; 
        private String secondaryInternetEndpoint; 
        private String secondaryIntranetEndpoint; 
        private String serviceConfig; 
        private String serviceGroup; 
        private String serviceId; 
        private String serviceName; 
        private String serviceUid; 
        private String source; 
        private String status; 
        private Integer totalInstance; 
        private String trafficState; 
        private String updateTime; 
        private Integer weight; 
        private String workloadType; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(Service model) {
            this.accessToken = model.accessToken;
            this.appConfig = model.appConfig;
            this.appSpecName = model.appSpecName;
            this.appType = model.appType;
            this.appVersion = model.appVersion;
            this.autoscalerEnabled = model.autoscalerEnabled;
            this.callerUid = model.callerUid;
            this.cpu = model.cpu;
            this.createTime = model.createTime;
            this.cronscalerEnabled = model.cronscalerEnabled;
            this.currentVersion = model.currentVersion;
            this.extraData = model.extraData;
            this.GPUCorePercentage = model.GPUCorePercentage;
            this.GPUMemory = model.GPUMemory;
            this.gateway = model.gateway;
            this.gpu = model.gpu;
            this.image = model.image;
            this.instanceCountInResource = model.instanceCountInResource;
            this.internetEndpoint = model.internetEndpoint;
            this.intranetEndpoint = model.intranetEndpoint;
            this.labels = model.labels;
            this.latestVersion = model.latestVersion;
            this.memory = model.memory;
            this.message = model.message;
            this.namespace = model.namespace;
            this.parentUid = model.parentUid;
            this.pendingInstance = model.pendingInstance;
            this.quotaId = model.quotaId;
            this.reason = model.reason;
            this.region = model.region;
            this.requestId = model.requestId;
            this.resource = model.resource;
            this.resourceAlias = model.resourceAlias;
            this.resourceBurstable = model.resourceBurstable;
            this.role = model.role;
            this.roleAttrs = model.roleAttrs;
            this.runningInstance = model.runningInstance;
            this.safetyLock = model.safetyLock;
            this.secondaryInternetEndpoint = model.secondaryInternetEndpoint;
            this.secondaryIntranetEndpoint = model.secondaryIntranetEndpoint;
            this.serviceConfig = model.serviceConfig;
            this.serviceGroup = model.serviceGroup;
            this.serviceId = model.serviceId;
            this.serviceName = model.serviceName;
            this.serviceUid = model.serviceUid;
            this.source = model.source;
            this.status = model.status;
            this.totalInstance = model.totalInstance;
            this.trafficState = model.trafficState;
            this.updateTime = model.updateTime;
            this.weight = model.weight;
            this.workloadType = model.workloadType;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>The request token of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>MzJiMDI5MDliODc0MTlkYmI0ZDhlYmExYjczYTIyZTE3Zm********</p>
         */
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        /**
         * <p>The configuration information of the application service.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ModelStorage&quot;:&quot;oss&quot;}</p>
         */
        public Builder appConfig(String appConfig) {
            this.appConfig = appConfig;
            return this;
        }

        /**
         * <p>The specification name of the application service.</p>
         * 
         * <strong>example:</strong>
         * <p>llama_7b_fp16</p>
         */
        public Builder appSpecName(String appSpecName) {
            this.appSpecName = appSpecName;
            return this;
        }

        /**
         * <p>The type of the application service.</p>
         * 
         * <strong>example:</strong>
         * <p>LLM</p>
         */
        public Builder appType(String appType) {
            this.appType = appType;
            return this;
        }

        /**
         * <p>The version of the application service.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder appVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }

        /**
         * <p>Specifies whether elastic scaling is enabled for the service.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoscalerEnabled(Boolean autoscalerEnabled) {
            this.autoscalerEnabled = autoscalerEnabled;
            return this;
        }

        /**
         * <p>The UID of the account that created the service.</p>
         * 
         * <strong>example:</strong>
         * <p>20123*******</p>
         */
        public Builder callerUid(String callerUid) {
            this.callerUid = callerUid;
            return this;
        }

        /**
         * <p>The number of CPUs requested for each instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder cpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * <p>The time when the service was created. The time is displayed in UTC and follows the RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-29T11:13:20Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>Specifies whether scheduled scaling is enabled for the service.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder cronscalerEnabled(Boolean cronscalerEnabled) {
            this.cronscalerEnabled = cronscalerEnabled;
            return this;
        }

        /**
         * <p>The version of the model that is currently running.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentVersion(Integer currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }

        /**
         * <p>The extra information of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;blue_green_services&quot;:[&quot;test&quot;,&quot;testxxxx&quot;]}</p>
         */
        public Builder extraData(String extraData) {
            this.extraData = extraData;
            return this;
        }

        /**
         * <p>The GPU compute capacity requested by each instance after GPU sharing is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder GPUCorePercentage(Integer GPUCorePercentage) {
            this.GPUCorePercentage = GPUCorePercentage;
            return this;
        }

        /**
         * <p>The GPU memory size requested by each instance after GPU sharing is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder GPUMemory(Integer GPUMemory) {
            this.GPUMemory = GPUMemory;
            return this;
        }

        /**
         * <p>The dedicated gateway ID of the service. This information is available only for services bound to a dedicated gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-xxxxxx</p>
         */
        public Builder gateway(String gateway) {
            this.gateway = gateway;
            return this;
        }

        /**
         * <p>The number of GPUs requested for each instance.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder gpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }

        /**
         * <p>The data image of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.cn-shanghai.aliyuncs.com/eas/echo_cn-shanghai:v0.0.1-20210129111320</p>
         */
        public Builder image(String image) {
            this.image = image;
            return this;
        }

        /**
         * <p>The distribution of instances across different resource types.</p>
         */
        public Builder instanceCountInResource(InstanceCountInResource instanceCountInResource) {
            this.instanceCountInResource = instanceCountInResource;
            return this;
        }

        /**
         * <p>The public endpoint of the service. This field is returned only in the DescribeService operation.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://10123*****.cn-shanghai.aliyuncs.com/api/predict/echo">http://10123*****.cn-shanghai.aliyuncs.com/api/predict/echo</a></p>
         */
        public Builder internetEndpoint(String internetEndpoint) {
            this.internetEndpoint = internetEndpoint;
            return this;
        }

        /**
         * <p>The internal endpoint of the service. This field is returned only in the DescribeService operation.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://10123*****.vpc.cn-shanghai.aliyuncs.com/api/predict/echo">http://10123*****.vpc.cn-shanghai.aliyuncs.com/api/predict/echo</a></p>
         */
        public Builder intranetEndpoint(String intranetEndpoint) {
            this.intranetEndpoint = intranetEndpoint;
            return this;
        }

        /**
         * <p>The list of service labels.</p>
         */
        public Builder labels(java.util.List<Labels> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * <p>The latest version of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder latestVersion(Integer latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }

        /**
         * <p>The memory requested for each instance, in MB.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder memory(Integer memory) {
            this.memory = memory;
            return this;
        }

        /**
         * <p>The summary information of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>Service start successfully</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The namespace of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>echo</p>
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The UID of the primary account to which the account that created the service belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>11234*******</p>
         */
        public Builder parentUid(String parentUid) {
            this.parentUid = parentUid;
            return this;
        }

        /**
         * <p>The number of pending instances of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder pendingInstance(Integer pendingInstance) {
            this.pendingInstance = pendingInstance;
            return this;
        }

        /**
         * <p>The quota ID of the service. This information is available only for services deployed on Lingjun resource quotas.</p>
         * 
         * <strong>example:</strong>
         * <p>quotaxxxxx</p>
         */
        public Builder quotaId(String quotaId) {
            this.quotaId = quotaId;
            return this;
        }

        /**
         * <p>The reason for the service status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * <p>The region where the service is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40325405-579C-4D82********</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource group of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>eas-r-xxxxxxx</p>
         */
        public Builder resource(String resource) {
            this.resource = resource;
            return this;
        }

        /**
         * <p>The alias of the resource group to which the service belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>my_resource</p>
         */
        public Builder resourceAlias(String resourceAlias) {
            this.resourceAlias = resourceAlias;
            return this;
        }

        /**
         * <p>Specifies whether the elastic resource pool is enabled for the service.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder resourceBurstable(Boolean resourceBurstable) {
            this.resourceBurstable = resourceBurstable;
            return this;
        }

        /**
         * <p>The service role.</p>
         * 
         * <strong>example:</strong>
         * <p>Queue</p>
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * <p>The additional attributes of the service role. This field is returned only in the DescribeService operation.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ApproxMaxLength&quot;:null,&quot;Length&quot;:null,&quot;MaxPayloadBytes&quot;:null}</p>
         */
        public Builder roleAttrs(String roleAttrs) {
            this.roleAttrs = roleAttrs;
            return this;
        }

        /**
         * <p>The number of running instances of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder runningInstance(Integer runningInstance) {
            this.runningInstance = runningInstance;
            return this;
        }

        /**
         * <p>The service safety lock.</p>
         * 
         * <strong>example:</strong>
         * <p>dangerous</p>
         */
        public Builder safetyLock(String safetyLock) {
            this.safetyLock = safetyLock;
            return this;
        }

        /**
         * <p>The public endpoint for synchronous requests of asynchronous services. This field is returned only in the DescribeService operation.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://10123*****.cn-shanghai.aliyuncs.com/api/predict/async_path.echo">http://10123*****.cn-shanghai.aliyuncs.com/api/predict/async_path.echo</a></p>
         */
        public Builder secondaryInternetEndpoint(String secondaryInternetEndpoint) {
            this.secondaryInternetEndpoint = secondaryInternetEndpoint;
            return this;
        }

        /**
         * <p>The internal endpoint for synchronous requests of asynchronous services. This field is returned only in the DescribeService operation.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://10123*****.vpc.cn-shanghai.aliyuncs.com/api/predict/async_path.echo">http://10123*****.vpc.cn-shanghai.aliyuncs.com/api/predict/async_path.echo</a></p>
         */
        public Builder secondaryIntranetEndpoint(String secondaryIntranetEndpoint) {
            this.secondaryIntranetEndpoint = secondaryIntranetEndpoint;
            return this;
        }

        /**
         * <p>The configuration of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;metadata&quot;:{&quot;cpu&quot;:1,&quot;instance&quot;:1,&quot;memory&quot;:1024},&quot;name&quot;:&quot;echo&quot;,&quot;processor_entry&quot;:&quot;libecho.so&quot;,&quot;processor_path&quot;:&quot;<a href="http://oss-cn-hangzhou-zmf.aliyuncs.com/059247/echo_processor_release.tar.gz%22,%22processor_type%22:%22cpp%22%7D">http://oss-cn-hangzhou-zmf.aliyuncs.com/059247/echo_processor_release.tar.gz&quot;,&quot;processor_type&quot;:&quot;cpp&quot;}</a></p>
         */
        public Builder serviceConfig(String serviceConfig) {
            this.serviceConfig = serviceConfig;
            return this;
        }

        /**
         * <p>The group to which the service belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>my_group</p>
         */
        public Builder serviceGroup(String serviceGroup) {
            this.serviceGroup = serviceGroup;
            return this;
        }

        /**
         * <p>The unique ID of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>eas-m-xxasdat</p>
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The name of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>echo</p>
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The ID of the service. This value is the same as ServiceId.</p>
         * 
         * <strong>example:</strong>
         * <p>eas-m-xxasdat</p>
         */
        public Builder serviceUid(String serviceUid) {
            this.serviceUid = serviceUid;
            return this;
        }

        /**
         * <p>The deployment source of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>dsw</p>
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * <p>The status of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The total number of instances of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalInstance(Integer totalInstance) {
            this.totalInstance = totalInstance;
            return this;
        }

        /**
         * <p>The traffic status.</p>
         * 
         * <strong>example:</strong>
         * <p>standalone</p>
         */
        public Builder trafficState(String trafficState) {
            this.trafficState = trafficState;
            return this;
        }

        /**
         * <p>The time when the service was updated. The time is displayed in UTC and follows the RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-29T11:13:20Z</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * <p>The weight for the canary release of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder weight(Integer weight) {
            this.weight = weight;
            return this;
        }

        /**
         * <p>The workload type of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>stateless</p>
         */
        public Builder workloadType(String workloadType) {
            this.workloadType = workloadType;
            return this;
        }

        /**
         * <p>The workspace ID of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>123445</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public Service build() {
            return new Service(this);
        } 

    } 

    /**
     * 
     * {@link Service} extends {@link TeaModel}
     *
     * <p>Service</p>
     */
    public static class InstanceCountInResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dedicated")
        private Integer dedicated;

        @com.aliyun.core.annotation.NameInMap("Public")
        private Integer _public;

        @com.aliyun.core.annotation.NameInMap("Quota")
        private Integer quota;

        private InstanceCountInResource(Builder builder) {
            this.dedicated = builder.dedicated;
            this._public = builder._public;
            this.quota = builder.quota;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceCountInResource create() {
            return builder().build();
        }

        /**
         * @return dedicated
         */
        public Integer getDedicated() {
            return this.dedicated;
        }

        /**
         * @return _public
         */
        public Integer get_public() {
            return this._public;
        }

        /**
         * @return quota
         */
        public Integer getQuota() {
            return this.quota;
        }

        public static final class Builder {
            private Integer dedicated; 
            private Integer _public; 
            private Integer quota; 

            private Builder() {
            } 

            private Builder(InstanceCountInResource model) {
                this.dedicated = model.dedicated;
                this._public = model._public;
                this.quota = model.quota;
            } 

            /**
             * <p>The number of instances that use dedicated resource groups or self-managed resource groups.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder dedicated(Integer dedicated) {
                this.dedicated = dedicated;
                return this;
            }

            /**
             * <p>The number of instances that use public resource groups.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder _public(Integer _public) {
                this._public = _public;
                return this;
            }

            /**
             * <p>The number of instances that use Lingjun quotas.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder quota(Integer quota) {
                this.quota = quota;
                return this;
            }

            public InstanceCountInResource build() {
                return new InstanceCountInResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link Service} extends {@link TeaModel}
     *
     * <p>Service</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LabelKey")
        private String labelKey;

        @com.aliyun.core.annotation.NameInMap("LabelValue")
        private String labelValue;

        private Labels(Builder builder) {
            this.labelKey = builder.labelKey;
            this.labelValue = builder.labelValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return labelKey
         */
        public String getLabelKey() {
            return this.labelKey;
        }

        /**
         * @return labelValue
         */
        public String getLabelValue() {
            return this.labelValue;
        }

        public static final class Builder {
            private String labelKey; 
            private String labelValue; 

            private Builder() {
            } 

            private Builder(Labels model) {
                this.labelKey = model.labelKey;
                this.labelValue = model.labelValue;
            } 

            /**
             * <p>The key of the service label.</p>
             * 
             * <strong>example:</strong>
             * <p>key1</p>
             */
            public Builder labelKey(String labelKey) {
                this.labelKey = labelKey;
                return this;
            }

            /**
             * <p>The value of the service label.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
             */
            public Builder labelValue(String labelValue) {
                this.labelValue = labelValue;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
}
