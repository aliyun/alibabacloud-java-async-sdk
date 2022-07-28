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

    @NameInMap("CallerUid")
    private String callerUid;

    @NameInMap("Cpu")
    private Integer cpu;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("CurrentVersion")
    private Integer currentVersion;

    @NameInMap("Gpu")
    private Integer gpu;

    @NameInMap("Image")
    private String image;

    @NameInMap("InternetEndpoint")
    private String internetEndpoint;

    @NameInMap("IntranetEndpoint")
    private String intranetEndpoint;

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

    @NameInMap("RunningInstance")
    private Integer runningInstance;

    @NameInMap("ServiceConfig")
    private String serviceConfig;

    @NameInMap("ServiceId")
    private String serviceId;

    @NameInMap("ServiceName")
    private String serviceName;

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

    private Service(Builder builder) {
        this.accessToken = builder.accessToken;
        this.callerUid = builder.callerUid;
        this.cpu = builder.cpu;
        this.createTime = builder.createTime;
        this.currentVersion = builder.currentVersion;
        this.gpu = builder.gpu;
        this.image = builder.image;
        this.internetEndpoint = builder.internetEndpoint;
        this.intranetEndpoint = builder.intranetEndpoint;
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
        this.runningInstance = builder.runningInstance;
        this.serviceConfig = builder.serviceConfig;
        this.serviceId = builder.serviceId;
        this.serviceName = builder.serviceName;
        this.source = builder.source;
        this.status = builder.status;
        this.totalInstance = builder.totalInstance;
        this.updateTime = builder.updateTime;
        this.weight = builder.weight;
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
     * @return runningInstance
     */
    public Integer getRunningInstance() {
        return this.runningInstance;
    }

    /**
     * @return serviceConfig
     */
    public String getServiceConfig() {
        return this.serviceConfig;
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

    public static final class Builder {
        private String accessToken; 
        private String callerUid; 
        private Integer cpu; 
        private String createTime; 
        private Integer currentVersion; 
        private Integer gpu; 
        private String image; 
        private String internetEndpoint; 
        private String intranetEndpoint; 
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
        private Integer runningInstance; 
        private String serviceConfig; 
        private String serviceId; 
        private String serviceName; 
        private String source; 
        private String status; 
        private Integer totalInstance; 
        private String updateTime; 
        private Integer weight; 

        /**
         * 服务的请求Token
         */
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        /**
         * 服务创建账号的UID
         */
        public Builder callerUid(String callerUid) {
            this.callerUid = callerUid;
            return this;
        }

        /**
         * 每个实例申请的cpu
         */
        public Builder cpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * 服务的创建时间
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * 当前运行的模型版本
         */
        public Builder currentVersion(Integer currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }

        /**
         * 每个实例申请的gpu
         */
        public Builder gpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }

        /**
         * 服务的数据镜像
         */
        public Builder image(String image) {
            this.image = image;
            return this;
        }

        /**
         * 服务的公网endpoint
         */
        public Builder internetEndpoint(String internetEndpoint) {
            this.internetEndpoint = internetEndpoint;
            return this;
        }

        /**
         * 服务内网endpoint
         */
        public Builder intranetEndpoint(String intranetEndpoint) {
            this.intranetEndpoint = intranetEndpoint;
            return this;
        }

        /**
         * 服务最新版本号
         */
        public Builder latestVersion(Integer latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }

        /**
         * 每个worker需要的内存大小，单位为M
         */
        public Builder memory(Integer memory) {
            this.memory = memory;
            return this;
        }

        /**
         * 服务的摘要信息
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 服务所在的命名空间
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * 服务创建账号的主账号UID
         */
        public Builder parentUid(String parentUid) {
            this.parentUid = parentUid;
            return this;
        }

        /**
         * 被挂起的服务的实例个数
         */
        public Builder pendingInstance(Integer pendingInstance) {
            this.pendingInstance = pendingInstance;
            return this;
        }

        /**
         * 服务的状态信息
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * 服务所在的区域
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 服务所在的资源组
         */
        public Builder resource(String resource) {
            this.resource = resource;
            return this;
        }

        /**
         * 正在运行的服务的实例个数
         */
        public Builder runningInstance(Integer runningInstance) {
            this.runningInstance = runningInstance;
            return this;
        }

        /**
         * 服务的配置信息
         */
        public Builder serviceConfig(String serviceConfig) {
            this.serviceConfig = serviceConfig;
            return this;
        }

        /**
         * 服务ID
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * 服务的名字
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * 服务的部署来源
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * 服务的状态
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * 服务的所有实例总个数
         */
        public Builder totalInstance(Integer totalInstance) {
            this.totalInstance = totalInstance;
            return this;
        }

        /**
         * 服务的更新时间
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * 服务灰度发布的权重值
         */
        public Builder weight(Integer weight) {
            this.weight = weight;
            return this;
        }

        public Service build() {
            return new Service(this);
        } 

    } 

}
