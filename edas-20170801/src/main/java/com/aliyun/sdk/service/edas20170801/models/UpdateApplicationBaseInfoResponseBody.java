// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateApplicationBaseInfoResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateApplicationBaseInfoResponseBody</p>
 */
public class UpdateApplicationBaseInfoResponseBody extends TeaModel {
    @NameInMap("Applcation")
    private Applcation applcation;

    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateApplicationBaseInfoResponseBody(Builder builder) {
        this.applcation = builder.applcation;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApplicationBaseInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return applcation
     */
    public Applcation getApplcation() {
        return this.applcation;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Applcation applcation; 
        private Integer code; 
        private String message; 
        private String requestId; 

        /**
         * The applications that you want to modify.
         */
        public Builder applcation(Applcation applcation) {
            this.applcation = applcation;
            return this;
        }

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The message that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateApplicationBaseInfoResponseBody build() {
            return new UpdateApplicationBaseInfoResponseBody(this);
        } 

    } 

    public static class Applcation extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("ApplicationType")
        private String applicationType;

        @NameInMap("BuildPackageId")
        private Long buildPackageId;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterType")
        private Integer clusterType;

        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Dockerize")
        private Boolean dockerize;

        @NameInMap("ExtSlbId")
        private String extSlbId;

        @NameInMap("ExtSlbIp")
        private String extSlbIp;

        @NameInMap("ExtSlbName")
        private String extSlbName;

        @NameInMap("HealthCheckUrl")
        private String healthCheckUrl;

        @NameInMap("InstanceCount")
        private Integer instanceCount;

        @NameInMap("Memory")
        private Integer memory;

        @NameInMap("Name")
        private String name;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RunningInstanceCount")
        private Integer runningInstanceCount;

        @NameInMap("SlbId")
        private String slbId;

        @NameInMap("SlbIp")
        private String slbIp;

        @NameInMap("SlbName")
        private String slbName;

        @NameInMap("SlbPort")
        private Integer slbPort;

        @NameInMap("UserId")
        private String userId;

        private Applcation(Builder builder) {
            this.appId = builder.appId;
            this.applicationType = builder.applicationType;
            this.buildPackageId = builder.buildPackageId;
            this.clusterId = builder.clusterId;
            this.clusterType = builder.clusterType;
            this.cpu = builder.cpu;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.dockerize = builder.dockerize;
            this.extSlbId = builder.extSlbId;
            this.extSlbIp = builder.extSlbIp;
            this.extSlbName = builder.extSlbName;
            this.healthCheckUrl = builder.healthCheckUrl;
            this.instanceCount = builder.instanceCount;
            this.memory = builder.memory;
            this.name = builder.name;
            this.owner = builder.owner;
            this.port = builder.port;
            this.regionId = builder.regionId;
            this.runningInstanceCount = builder.runningInstanceCount;
            this.slbId = builder.slbId;
            this.slbIp = builder.slbIp;
            this.slbName = builder.slbName;
            this.slbPort = builder.slbPort;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Applcation create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return applicationType
         */
        public String getApplicationType() {
            return this.applicationType;
        }

        /**
         * @return buildPackageId
         */
        public Long getBuildPackageId() {
            return this.buildPackageId;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterType
         */
        public Integer getClusterType() {
            return this.clusterType;
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
         * @return dockerize
         */
        public Boolean getDockerize() {
            return this.dockerize;
        }

        /**
         * @return extSlbId
         */
        public String getExtSlbId() {
            return this.extSlbId;
        }

        /**
         * @return extSlbIp
         */
        public String getExtSlbIp() {
            return this.extSlbIp;
        }

        /**
         * @return extSlbName
         */
        public String getExtSlbName() {
            return this.extSlbName;
        }

        /**
         * @return healthCheckUrl
         */
        public String getHealthCheckUrl() {
            return this.healthCheckUrl;
        }

        /**
         * @return instanceCount
         */
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return runningInstanceCount
         */
        public Integer getRunningInstanceCount() {
            return this.runningInstanceCount;
        }

        /**
         * @return slbId
         */
        public String getSlbId() {
            return this.slbId;
        }

        /**
         * @return slbIp
         */
        public String getSlbIp() {
            return this.slbIp;
        }

        /**
         * @return slbName
         */
        public String getSlbName() {
            return this.slbName;
        }

        /**
         * @return slbPort
         */
        public Integer getSlbPort() {
            return this.slbPort;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String appId; 
            private String applicationType; 
            private Long buildPackageId; 
            private String clusterId; 
            private Integer clusterType; 
            private Integer cpu; 
            private Long createTime; 
            private String description; 
            private Boolean dockerize; 
            private String extSlbId; 
            private String extSlbIp; 
            private String extSlbName; 
            private String healthCheckUrl; 
            private Integer instanceCount; 
            private Integer memory; 
            private String name; 
            private String owner; 
            private Integer port; 
            private String regionId; 
            private Integer runningInstanceCount; 
            private String slbId; 
            private String slbIp; 
            private String slbName; 
            private Integer slbPort; 
            private String userId; 

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The deployment type of the application. Valid values:
             * <p>
             * 
             * *   War: The application is deployed by using a WAR package.
             * *   FatJar: The application is deployed by using a JAR package.
             * *   Image: The application is deployed by using an image.
             * *   If this parameter is empty, the application is not deployed.
             */
            public Builder applicationType(String applicationType) {
                this.applicationType = applicationType;
                return this;
            }

            /**
             * The build package number of Enterprise Distributed Application Service (EDAS) Container.
             */
            public Builder buildPackageId(Long buildPackageId) {
                this.buildPackageId = buildPackageId;
                return this;
            }

            /**
             * The ID of the cluster.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The type of the cluster. Valid values:
             * <p>
             * 
             * *   0: normal Docker cluster
             * *   1: Swarm cluster
             * *   2: ECS cluster
             * *   3: self-managed Kubernetes cluster in EDAS
             * *   4: cluster in which Pandora automatically registers applications
             * *   5: Container Service for Kubernetes (ACK) clusters
             */
            public Builder clusterType(Integer clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * The number of CPU cores.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The time when the application was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the application.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Indicates whether the application is a Docker application.
             */
            public Builder dockerize(Boolean dockerize) {
                this.dockerize = dockerize;
                return this;
            }

            /**
             * The ID of the Internet-facing SLB instance.
             */
            public Builder extSlbId(String extSlbId) {
                this.extSlbId = extSlbId;
                return this;
            }

            /**
             * The IP address of the Internet-facing Server Load Balancer (SLB) instance.
             */
            public Builder extSlbIp(String extSlbIp) {
                this.extSlbIp = extSlbIp;
                return this;
            }

            /**
             * The name of the Internet-facing SLB instance.
             */
            public Builder extSlbName(String extSlbName) {
                this.extSlbName = extSlbName;
                return this;
            }

            /**
             * The health check URL.
             */
            public Builder healthCheckUrl(String healthCheckUrl) {
                this.healthCheckUrl = healthCheckUrl;
                return this;
            }

            /**
             * The number of application instances.
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * The size of memory configured for an application instance. Unit: MB.
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * The name of the application.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The owner of the application.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The port used by the application.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The number of running application instances.
             */
            public Builder runningInstanceCount(Integer runningInstanceCount) {
                this.runningInstanceCount = runningInstanceCount;
                return this;
            }

            /**
             * The ID of the internal-facing SLB instance.
             */
            public Builder slbId(String slbId) {
                this.slbId = slbId;
                return this;
            }

            /**
             * The IP address of the internal-facing SLB instance.
             */
            public Builder slbIp(String slbIp) {
                this.slbIp = slbIp;
                return this;
            }

            /**
             * The name of the internal-facing SLB instance.
             */
            public Builder slbName(String slbName) {
                this.slbName = slbName;
                return this;
            }

            /**
             * The port used by the internal-facing SLB instance.
             */
            public Builder slbPort(Integer slbPort) {
                this.slbPort = slbPort;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Applcation build() {
                return new Applcation(this);
            } 

        } 

    }
}
