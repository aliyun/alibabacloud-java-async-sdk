// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link GetApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>GetApplicationResponseBody</p>
 */
public class GetApplicationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Application")
    private Application application;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetApplicationResponseBody model) {
            this.application = model.application;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The application information.</p>
         */
        public Builder application(Application application) {
            this.application = application;
            return this;
        }

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The additional information.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F8DFGED-K98***************</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetApplicationResponseBody build() {
            return new GetApplicationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationResponseBody</p>
     */
    public static class Application extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppPhase")
        private String appPhase;

        @com.aliyun.core.annotation.NameInMap("ApplicationType")
        private String applicationType;

        @com.aliyun.core.annotation.NameInMap("BuildPackageId")
        private Long buildPackageId;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterType")
        private String clusterType;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Dockerize")
        private Boolean dockerize;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("EnablePortCheck")
        private Boolean enablePortCheck;

        @com.aliyun.core.annotation.NameInMap("EnableUrlCheck")
        private Boolean enableUrlCheck;

        @com.aliyun.core.annotation.NameInMap("ExtSlbId")
        private String extSlbId;

        @com.aliyun.core.annotation.NameInMap("ExtSlbIp")
        private String extSlbIp;

        @com.aliyun.core.annotation.NameInMap("ExtSlbName")
        private String extSlbName;

        @com.aliyun.core.annotation.NameInMap("HaveManageAccess")
        private String haveManageAccess;

        @com.aliyun.core.annotation.NameInMap("HealthCheckUrl")
        private String healthCheckUrl;

        @com.aliyun.core.annotation.NameInMap("InstanceCount")
        private Integer instanceCount;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Integer memory;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NameSpace")
        private String nameSpace;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("RunningInstanceCount")
        private Integer runningInstanceCount;

        @com.aliyun.core.annotation.NameInMap("SlbId")
        private String slbId;

        @com.aliyun.core.annotation.NameInMap("SlbInfo")
        private String slbInfo;

        @com.aliyun.core.annotation.NameInMap("SlbIp")
        private String slbIp;

        @com.aliyun.core.annotation.NameInMap("SlbName")
        private String slbName;

        @com.aliyun.core.annotation.NameInMap("SlbPort")
        private Integer slbPort;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("WorkloadType")
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

            private Builder() {
            } 

            private Builder(Application model) {
                this.appId = model.appId;
                this.appPhase = model.appPhase;
                this.applicationType = model.applicationType;
                this.buildPackageId = model.buildPackageId;
                this.clusterId = model.clusterId;
                this.clusterType = model.clusterType;
                this.cpu = model.cpu;
                this.createTime = model.createTime;
                this.description = model.description;
                this.dockerize = model.dockerize;
                this.email = model.email;
                this.enablePortCheck = model.enablePortCheck;
                this.enableUrlCheck = model.enableUrlCheck;
                this.extSlbId = model.extSlbId;
                this.extSlbIp = model.extSlbIp;
                this.extSlbName = model.extSlbName;
                this.haveManageAccess = model.haveManageAccess;
                this.healthCheckUrl = model.healthCheckUrl;
                this.instanceCount = model.instanceCount;
                this.memory = model.memory;
                this.name = model.name;
                this.nameSpace = model.nameSpace;
                this.owner = model.owner;
                this.port = model.port;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.runningInstanceCount = model.runningInstanceCount;
                this.slbId = model.slbId;
                this.slbInfo = model.slbInfo;
                this.slbIp = model.slbIp;
                this.slbName = model.slbName;
                this.slbPort = model.slbPort;
                this.userId = model.userId;
                this.workloadType = model.workloadType;
            } 

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cfac****-847e-4325-ad56-b5c2bc54****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The current phase of the Kubernetes application. This helps determine if the application is stable. Configuration operations are prohibited when the application is in an unstable state.</p>
             * <ul>
             * <li><p>ready: The application is ready and can be changed.</p>
             * </li>
             * <li><p>progressing: The application is being changed.</p>
             * </li>
             * <li><p>pending: The application change is blocked.</p>
             * </li>
             * <li><p>failed: The application change failed.</p>
             * </li>
             * </ul>
             * <p>The ready phase is stable. Other phases are unstable.</p>
             * 
             * <strong>example:</strong>
             * <p>ready</p>
             */
            public Builder appPhase(String appPhase) {
                this.appPhase = appPhase;
                return this;
            }

            /**
             * <p>The deployment type of the application:</p>
             * <ul>
             * <li><p>War: The application is deployed from a WAR package.</p>
             * </li>
             * <li><p>FatJar: The application is deployed from a JAR package.</p>
             * </li>
             * <li><p>Empty: The application is not deployed.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FatJar</p>
             */
            public Builder applicationType(String applicationType) {
                this.applicationType = applicationType;
                return this;
            }

            /**
             * <p>The ID of the container version.</p>
             * 
             * <strong>example:</strong>
             * <p>59</p>
             */
            public Builder buildPackageId(Long buildPackageId) {
                this.buildPackageId = buildPackageId;
                return this;
            }

            /**
             * <p>The ID of the ECS cluster where the application is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>5ffc5895-<strong><strong>-b03a-c223c6c3</strong></strong></p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The type of the application cluster:</p>
             * <ul>
             * <li><p>0: A regular Docker cluster.</p>
             * </li>
             * <li><p>1: A Swarm cluster.</p>
             * </li>
             * <li><p>2: An ECS cluster.</p>
             * </li>
             * <li><p>3: A Kubernetes cluster.</p>
             * </li>
             * <li><p>4: A Pandora application cluster that supports automatic registration.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * <p>The number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The UNIX timestamp when the application was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1610550324226</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the application is a Docker application:</p>
             * <ul>
             * <li><p>false: The application is not a Docker application.</p>
             * </li>
             * <li><p>true: The application is a Docker application.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder dockerize(Boolean dockerize) {
                this.dockerize = dockerize;
                return this;
            }

            /**
             * <p>The email address.</p>
             * 
             * <strong>example:</strong>
             * <p>****@***.com</p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>Indicates whether the port health check is enabled:</p>
             * <ul>
             * <li><p>true: Enabled.</p>
             * </li>
             * <li><p>false: Disabled.</p>
             * </li>
             * </ul>
             * <p>If enabled, EDAS checks if the port is in use during application startup. If the port is in use, the application is considered started.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enablePortCheck(Boolean enablePortCheck) {
                this.enablePortCheck = enablePortCheck;
                return this;
            }

            /**
             * <p>Indicates whether the URL health check is enabled:</p>
             * <ul>
             * <li><p>true: Enabled.</p>
             * </li>
             * <li><p>false: Disabled.</p>
             * </li>
             * </ul>
             * <p>If enabled, EDAS probes the specified URL during application startup. If the URL is accessible, the application is considered started.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableUrlCheck(Boolean enableUrlCheck) {
                this.enableUrlCheck = enableUrlCheck;
                return this;
            }

            /**
             * <p>The ID of the public-facing SLB instance attached to the application.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-bp1vceck3s3b9xs6x****</p>
             */
            public Builder extSlbId(String extSlbId) {
                this.extSlbId = extSlbId;
                return this;
            }

            /**
             * <p>The public IP address of the SLB instance attached to the application.</p>
             * 
             * <strong>example:</strong>
             * <p>47.114.xxx.xx</p>
             */
            public Builder extSlbIp(String extSlbIp) {
                this.extSlbIp = extSlbIp;
                return this;
            }

            /**
             * <p>The name of the public-facing SLB instance attached to the application.</p>
             * 
             * <strong>example:</strong>
             * <p>aa8eee383db084f42aebc4d9f52c****</p>
             */
            public Builder extSlbName(String extSlbName) {
                this.extSlbName = extSlbName;
                return this;
            }

            /**
             * <p>Indicates whether the current user has management permissions on the application. This parameter is available only in RAM authentication mode.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder haveManageAccess(String haveManageAccess) {
                this.haveManageAccess = haveManageAccess;
                return this;
            }

            /**
             * <p>The health check URL of the application.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://127.0.0.1:8080/xyz.html">http://127.0.0.1:8080/xyz.html</a></p>
             */
            public Builder healthCheckUrl(String healthCheckUrl) {
                this.healthCheckUrl = healthCheckUrl;
                return this;
            }

            /**
             * <p>The number of instances in the application.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * <p>The memory size for the application instance, in MB.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace to which the application belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>doc-test</p>
             */
            public Builder nameSpace(String nameSpace) {
                this.nameSpace = nameSpace;
                return this;
            }

            /**
             * <p>The creator of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>ouou@117274586608****</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The service port of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the region where the application is located.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aekz****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The number of running application instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder runningInstanceCount(Integer runningInstanceCount) {
                this.runningInstanceCount = runningInstanceCount;
                return this;
            }

            /**
             * <p>The ID of the internal-facing SLB instance attached to the application.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-bp<strong><strong>ck3s3b9xs6x</strong></strong></p>
             */
            public Builder slbId(String slbId) {
                this.slbId = slbId;
                return this;
            }

            /**
             * <p>Information about the internal-facing SLB instance attached to the application.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder slbInfo(String slbInfo) {
                this.slbInfo = slbInfo;
                return this;
            }

            /**
             * <p>The IP address of the internal-facing SLB instance attached to the application.</p>
             * 
             * <strong>example:</strong>
             * <p>192.<em><strong>.</strong></em>.***</p>
             */
            public Builder slbIp(String slbIp) {
                this.slbIp = slbIp;
                return this;
            }

            /**
             * <p>The name of the internal-facing SLB instance attached to the application.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder slbName(String slbName) {
                this.slbName = slbName;
                return this;
            }

            /**
             * <p>The port of the internal-facing SLB instance attached to the application.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder slbPort(Integer slbPort) {
                this.slbPort = slbPort;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>test@dd******</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The workload type used to create the application. Supported types are Deployment and StatefulSet. This parameter does not apply to ECS applications.</p>
             * 
             * <strong>example:</strong>
             * <p>StatefulSet</p>
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
