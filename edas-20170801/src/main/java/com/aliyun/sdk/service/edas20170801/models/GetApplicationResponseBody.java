// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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

    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private GetApplicationResponseBody(Builder builder) {
        this.application = builder.application;
        this.code = builder.code;
        this.message = builder.message;
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
        private Application application; 
        private Integer code; 
        private String message; 
        private String requestId; 

        /**
         * The details of the application.
         */
        public Builder application(Application application) {
            this.application = application;
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
         * The additional information that is returned.
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

        public GetApplicationResponseBody build() {
            return new GetApplicationResponseBody(this);
        } 

    } 

    public static class Application extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppPhase")
        private String appPhase;

        @NameInMap("ApplicationType")
        private String applicationType;

        @NameInMap("BuildPackageId")
        private Long buildPackageId;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterType")
        private String clusterType;

        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Dockerize")
        private Boolean dockerize;

        @NameInMap("Email")
        private String email;

        @NameInMap("EnablePortCheck")
        private Boolean enablePortCheck;

        @NameInMap("EnableUrlCheck")
        private Boolean enableUrlCheck;

        @NameInMap("ExtSlbId")
        private String extSlbId;

        @NameInMap("ExtSlbIp")
        private String extSlbIp;

        @NameInMap("ExtSlbName")
        private String extSlbName;

        @NameInMap("HaveManageAccess")
        private String haveManageAccess;

        @NameInMap("HealthCheckUrl")
        private String healthCheckUrl;

        @NameInMap("InstanceCount")
        private Integer instanceCount;

        @NameInMap("Memory")
        private Integer memory;

        @NameInMap("Name")
        private String name;

        @NameInMap("NameSpace")
        private String nameSpace;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("RunningInstanceCount")
        private Integer runningInstanceCount;

        @NameInMap("SlbId")
        private String slbId;

        @NameInMap("SlbInfo")
        private String slbInfo;

        @NameInMap("SlbIp")
        private String slbIp;

        @NameInMap("SlbName")
        private String slbName;

        @NameInMap("SlbPort")
        private Integer slbPort;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("WorkloadType")
        private String workloadType;

        private Application(Builder builder) {
            this.appId = builder.appId;
            this.appPhase = builder.appPhase;
            this.applicationType = builder.applicationType;
            this.buildPackageId = builder.buildPackageId;
            this.clusterId = builder.clusterId;
            this.clusterType = builder.clusterType;
            this.cpu = builder.cpu;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.dockerize = builder.dockerize;
            this.email = builder.email;
            this.enablePortCheck = builder.enablePortCheck;
            this.enableUrlCheck = builder.enableUrlCheck;
            this.extSlbId = builder.extSlbId;
            this.extSlbIp = builder.extSlbIp;
            this.extSlbName = builder.extSlbName;
            this.haveManageAccess = builder.haveManageAccess;
            this.healthCheckUrl = builder.healthCheckUrl;
            this.instanceCount = builder.instanceCount;
            this.memory = builder.memory;
            this.name = builder.name;
            this.nameSpace = builder.nameSpace;
            this.owner = builder.owner;
            this.port = builder.port;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.runningInstanceCount = builder.runningInstanceCount;
            this.slbId = builder.slbId;
            this.slbInfo = builder.slbInfo;
            this.slbIp = builder.slbIp;
            this.slbName = builder.slbName;
            this.slbPort = builder.slbPort;
            this.userId = builder.userId;
            this.workloadType = builder.workloadType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Application create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appPhase
         */
        public String getAppPhase() {
            return this.appPhase;
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
        public String getClusterType() {
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
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return enablePortCheck
         */
        public Boolean getEnablePortCheck() {
            return this.enablePortCheck;
        }

        /**
         * @return enableUrlCheck
         */
        public Boolean getEnableUrlCheck() {
            return this.enableUrlCheck;
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
         * @return haveManageAccess
         */
        public String getHaveManageAccess() {
            return this.haveManageAccess;
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
         * @return nameSpace
         */
        public String getNameSpace() {
            return this.nameSpace;
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
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
         * @return slbInfo
         */
        public String getSlbInfo() {
            return this.slbInfo;
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

        /**
         * @return workloadType
         */
        public String getWorkloadType() {
            return this.workloadType;
        }

        public static final class Builder {
            private String appId; 
            private String appPhase; 
            private String applicationType; 
            private Long buildPackageId; 
            private String clusterId; 
            private String clusterType; 
            private Integer cpu; 
            private Long createTime; 
            private String description; 
            private Boolean dockerize; 
            private String email; 
            private Boolean enablePortCheck; 
            private Boolean enableUrlCheck; 
            private String extSlbId; 
            private String extSlbIp; 
            private String extSlbName; 
            private String haveManageAccess; 
            private String healthCheckUrl; 
            private Integer instanceCount; 
            private Integer memory; 
            private String name; 
            private String nameSpace; 
            private String owner; 
            private Integer port; 
            private String regionId; 
            private String resourceGroupId; 
            private Integer runningInstanceCount; 
            private String slbId; 
            private String slbInfo; 
            private String slbIp; 
            private String slbName; 
            private Integer slbPort; 
            private String userId; 
            private String workloadType; 

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The current status of the Kubernetes application, which is used to determine whether the application is in a stable state. If the application is in an unstable state, related configuration operations are prohibited. Valid values:
             * <p>
             * 
             * *   ready: The application is in the ready state and can be changed.
             * *   progressive: The application is being changed.
             * *   pending: The application change is blocked.
             * *   failed: The application fails to be changed.
             * 
             * In these states, ready is a stable state and other states are unstable.
             */
            public Builder appPhase(String appPhase) {
                this.appPhase = appPhase;
                return this;
            }

            /**
             * The deployment type of the application. Valid values:
             * <p>
             * 
             * *   War: The application is deployed by using a WAR package.
             * *   FatJar: The application is deployed by using a JAR package.
             * *   Empty: The application is not deployed.
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
             * The ID of the ECS cluster in which the application is deployed.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The type of the cluster. Valid values:
             * <p>
             * 
             * *   0: regular Docker cluster
             * *   1: Swarm cluster
             * *   2: ECS cluster
             * *   3: Kubernetes cluster
             * *   4: cluster in which Pandora automatically registers applications
             */
            public Builder clusterType(String clusterType) {
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
             * Indicates whether the application is a Docker application. Valid values:
             * <p>
             * 
             * *   false: The application is not a Docker application.
             * *   true: The application is a Docker application.
             */
            public Builder dockerize(Boolean dockerize) {
                this.dockerize = dockerize;
                return this;
            }

            /**
             * The email address of the account.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * Indicates whether the port health check is enabled. Valid values:
             * <p>
             * 
             * *   true: The port health check is enabled.
             * *   false: The port health check is disabled.
             * 
             * If the port health check is enabled, EDAS checks whether a port exists during application startup. If the port exists, the application is considered to have started.
             */
            public Builder enablePortCheck(Boolean enablePortCheck) {
                this.enablePortCheck = enablePortCheck;
                return this;
            }

            /**
             * Indicates whether the URL health check is enabled. Valid values:
             * <p>
             * 
             * *   true: The URL health check is enabled.
             * *   false: The URL health check is disabled.
             * 
             * If the URL health check is enabled, EDAS attempts to detect the specified URL during application startup. If EDAS detects the specified URL, the application is considered to have started.
             */
            public Builder enableUrlCheck(Boolean enableUrlCheck) {
                this.enableUrlCheck = enableUrlCheck;
                return this;
            }

            /**
             * The ID of the Internet-facing SLB instance that is bound to the application.
             */
            public Builder extSlbId(String extSlbId) {
                this.extSlbId = extSlbId;
                return this;
            }

            /**
             * The IP address of the Internet-facing Server Load Balancer (SLB) instance that is bound to the application.
             */
            public Builder extSlbIp(String extSlbIp) {
                this.extSlbIp = extSlbIp;
                return this;
            }

            /**
             * The name of the Internet-facing SLB instance that is bound to the application.
             */
            public Builder extSlbName(String extSlbName) {
                this.extSlbName = extSlbName;
                return this;
            }

            /**
             * HaveManageAccess.
             */
            public Builder haveManageAccess(String haveManageAccess) {
                this.haveManageAccess = haveManageAccess;
                return this;
            }

            /**
             * The health check URL of the application.
             */
            public Builder healthCheckUrl(String healthCheckUrl) {
                this.healthCheckUrl = healthCheckUrl;
                return this;
            }

            /**
             * The number of instances deployed with the application.
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * The memory size of the application instance. Unit: MB.
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
             * The namespace to which the application belongs.
             */
            public Builder nameSpace(String nameSpace) {
                this.nameSpace = nameSpace;
                return this;
            }

            /**
             * The ID of the user who created the application.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The service port of the application.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The ID of the region in which the application is deployed.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The number of running instances for the application.
             */
            public Builder runningInstanceCount(Integer runningInstanceCount) {
                this.runningInstanceCount = runningInstanceCount;
                return this;
            }

            /**
             * The ID of the internal-facing SLB instance that is bound to the application.
             */
            public Builder slbId(String slbId) {
                this.slbId = slbId;
                return this;
            }

            /**
             * The information about the internal-facing SLB instance that is bound to the application.
             */
            public Builder slbInfo(String slbInfo) {
                this.slbInfo = slbInfo;
                return this;
            }

            /**
             * The IP address of the internal-facing SLB instance that is bound to the application.
             */
            public Builder slbIp(String slbIp) {
                this.slbIp = slbIp;
                return this;
            }

            /**
             * The name of the internal-facing SLB instance that is bound to the application.
             */
            public Builder slbName(String slbName) {
                this.slbName = slbName;
                return this;
            }

            /**
             * The port of the internal-facing SLB instance that is bound to the application.
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

            /**
             * WorkloadType.
             */
            public Builder workloadType(String workloadType) {
                this.workloadType = workloadType;
                return this;
            }

            public Application build() {
                return new Application(this);
            } 

        } 

    }
}
