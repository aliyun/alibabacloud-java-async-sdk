// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Service} extends {@link TeaModel}
 *
 * <p>Service</p>
 */
public class Service extends TeaModel {
    @NameInMap("AccessToken")
    private String accessToken;

    @NameInMap("AppConfig")
    private String appConfig;

    @NameInMap("AppSpecName")
    private String appSpecName;

    @NameInMap("AppType")
    private String appType;

    @NameInMap("AppVersion")
    private String appVersion;

    @NameInMap("CallerUid")
    private String callerUid;

    @NameInMap("Cpu")
    private Integer cpu;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("CurrentVersion")
    private Integer currentVersion;

    @NameInMap("ExtraData")
    private String extraData;

    @NameInMap("Gpu")
    private Integer gpu;

    @NameInMap("Image")
    private String image;

    @NameInMap("InternetEndpoint")
    private String internetEndpoint;

    @NameInMap("IntranetEndpoint")
    private String intranetEndpoint;

    @NameInMap("Labels")
    private java.util.List < Labels> labels;

    @NameInMap("LatestVersion")
    private Integer latestVersion;

    @NameInMap("Memory")
    private Integer memory;

    @NameInMap("Message")
    private String message;

    @NameInMap("Namespace")
    private String namespace;

    @NameInMap("ParentUid")
    private String parentUid;

    @NameInMap("PendingInstance")
    private Integer pendingInstance;

    @NameInMap("Reason")
    private String reason;

    @NameInMap("Region")
    private String region;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Resource")
    private String resource;

    @NameInMap("ResourceAlias")
    private String resourceAlias;

    @NameInMap("Role")
    private String role;

    @NameInMap("RoleAttrs")
    private String roleAttrs;

    @NameInMap("RunningInstance")
    private Integer runningInstance;

    @NameInMap("SafetyLock")
    private String safetyLock;

    @NameInMap("SecondaryInternetEndpoint")
    private String secondaryInternetEndpoint;

    @NameInMap("SecondaryIntranetEndpoint")
    private String secondaryIntranetEndpoint;

    @NameInMap("ServiceConfig")
    private String serviceConfig;

    @NameInMap("ServiceGroup")
    private String serviceGroup;

    @NameInMap("ServiceId")
    private String serviceId;

    @NameInMap("ServiceName")
    private String serviceName;

    @NameInMap("ServiceUid")
    private String serviceUid;

    @NameInMap("Source")
    private String source;

    @NameInMap("Status")
    private String status;

    @NameInMap("TotalInstance")
    private Integer totalInstance;

    @NameInMap("UpdateTime")
    private String updateTime;

    @NameInMap("Weight")
    private Integer weight;

    @NameInMap("WorkspaceId")
    private String workspaceId;

    private Service(Builder builder) {
        this.accessToken = builder.accessToken;
        this.appConfig = builder.appConfig;
        this.appSpecName = builder.appSpecName;
        this.appType = builder.appType;
        this.appVersion = builder.appVersion;
        this.callerUid = builder.callerUid;
        this.cpu = builder.cpu;
        this.createTime = builder.createTime;
        this.currentVersion = builder.currentVersion;
        this.extraData = builder.extraData;
        this.gpu = builder.gpu;
        this.image = builder.image;
        this.internetEndpoint = builder.internetEndpoint;
        this.intranetEndpoint = builder.intranetEndpoint;
        this.labels = builder.labels;
        this.latestVersion = builder.latestVersion;
        this.memory = builder.memory;
        this.message = builder.message;
        this.namespace = builder.namespace;
        this.parentUid = builder.parentUid;
        this.pendingInstance = builder.pendingInstance;
        this.reason = builder.reason;
        this.region = builder.region;
        this.requestId = builder.requestId;
        this.resource = builder.resource;
        this.resourceAlias = builder.resourceAlias;
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
        this.updateTime = builder.updateTime;
        this.weight = builder.weight;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Service create() {
        return builder().build();
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
    public java.util.List < Labels> getLabels() {
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
        private String callerUid; 
        private Integer cpu; 
        private String createTime; 
        private Integer currentVersion; 
        private String extraData; 
        private Integer gpu; 
        private String image; 
        private String internetEndpoint; 
        private String intranetEndpoint; 
        private java.util.List < Labels> labels; 
        private Integer latestVersion; 
        private Integer memory; 
        private String message; 
        private String namespace; 
        private String parentUid; 
        private Integer pendingInstance; 
        private String reason; 
        private String region; 
        private String requestId; 
        private String resource; 
        private String resourceAlias; 
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
        private String updateTime; 
        private Integer weight; 
        private String workspaceId; 

        /**
         * AccessToken.
         */
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        /**
         * AppConfig.
         */
        public Builder appConfig(String appConfig) {
            this.appConfig = appConfig;
            return this;
        }

        /**
         * AppSpecName.
         */
        public Builder appSpecName(String appSpecName) {
            this.appSpecName = appSpecName;
            return this;
        }

        /**
         * AppType.
         */
        public Builder appType(String appType) {
            this.appType = appType;
            return this;
        }

        /**
         * AppVersion.
         */
        public Builder appVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }

        /**
         * CallerUid.
         */
        public Builder callerUid(String callerUid) {
            this.callerUid = callerUid;
            return this;
        }

        /**
         * Cpu.
         */
        public Builder cpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * CurrentVersion.
         */
        public Builder currentVersion(Integer currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }

        /**
         * ExtraData.
         */
        public Builder extraData(String extraData) {
            this.extraData = extraData;
            return this;
        }

        /**
         * Gpu.
         */
        public Builder gpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }

        /**
         * Image.
         */
        public Builder image(String image) {
            this.image = image;
            return this;
        }

        /**
         * InternetEndpoint.
         */
        public Builder internetEndpoint(String internetEndpoint) {
            this.internetEndpoint = internetEndpoint;
            return this;
        }

        /**
         * IntranetEndpoint.
         */
        public Builder intranetEndpoint(String intranetEndpoint) {
            this.intranetEndpoint = intranetEndpoint;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.List < Labels> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * LatestVersion.
         */
        public Builder latestVersion(Integer latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }

        /**
         * Memory.
         */
        public Builder memory(Integer memory) {
            this.memory = memory;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * ParentUid.
         */
        public Builder parentUid(String parentUid) {
            this.parentUid = parentUid;
            return this;
        }

        /**
         * PendingInstance.
         */
        public Builder pendingInstance(Integer pendingInstance) {
            this.pendingInstance = pendingInstance;
            return this;
        }

        /**
         * Reason.
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Resource.
         */
        public Builder resource(String resource) {
            this.resource = resource;
            return this;
        }

        /**
         * ResourceAlias.
         */
        public Builder resourceAlias(String resourceAlias) {
            this.resourceAlias = resourceAlias;
            return this;
        }

        /**
         * Role.
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * RoleAttrs.
         */
        public Builder roleAttrs(String roleAttrs) {
            this.roleAttrs = roleAttrs;
            return this;
        }

        /**
         * RunningInstance.
         */
        public Builder runningInstance(Integer runningInstance) {
            this.runningInstance = runningInstance;
            return this;
        }

        /**
         * SafetyLock.
         */
        public Builder safetyLock(String safetyLock) {
            this.safetyLock = safetyLock;
            return this;
        }

        /**
         * SecondaryInternetEndpoint.
         */
        public Builder secondaryInternetEndpoint(String secondaryInternetEndpoint) {
            this.secondaryInternetEndpoint = secondaryInternetEndpoint;
            return this;
        }

        /**
         * SecondaryIntranetEndpoint.
         */
        public Builder secondaryIntranetEndpoint(String secondaryIntranetEndpoint) {
            this.secondaryIntranetEndpoint = secondaryIntranetEndpoint;
            return this;
        }

        /**
         * ServiceConfig.
         */
        public Builder serviceConfig(String serviceConfig) {
            this.serviceConfig = serviceConfig;
            return this;
        }

        /**
         * ServiceGroup.
         */
        public Builder serviceGroup(String serviceGroup) {
            this.serviceGroup = serviceGroup;
            return this;
        }

        /**
         * ServiceId.
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * ServiceUid.
         */
        public Builder serviceUid(String serviceUid) {
            this.serviceUid = serviceUid;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * TotalInstance.
         */
        public Builder totalInstance(Integer totalInstance) {
            this.totalInstance = totalInstance;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * Weight.
         */
        public Builder weight(Integer weight) {
            this.weight = weight;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public Service build() {
            return new Service(this);
        } 

    } 

    public static class Labels extends TeaModel {
        @NameInMap("LabelKey")
        private String labelKey;

        @NameInMap("LabelValue")
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

            /**
             * LabelKey.
             */
            public Builder labelKey(String labelKey) {
                this.labelKey = labelKey;
                return this;
            }

            /**
             * LabelValue.
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
