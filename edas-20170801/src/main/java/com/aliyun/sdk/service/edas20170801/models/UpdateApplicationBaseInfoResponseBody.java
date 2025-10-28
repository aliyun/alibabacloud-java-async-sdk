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
 * {@link UpdateApplicationBaseInfoResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateApplicationBaseInfoResponseBody</p>
 */
public class UpdateApplicationBaseInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Applcation")
    private Applcation applcation;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(UpdateApplicationBaseInfoResponseBody model) {
            this.applcation = model.applcation;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The applications that you want to modify.</p>
         */
        public Builder applcation(Applcation applcation) {
            this.applcation = applcation;
            return this;
        }

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D16979DC-4D42-**************</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateApplicationBaseInfoResponseBody build() {
            return new UpdateApplicationBaseInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateApplicationBaseInfoResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateApplicationBaseInfoResponseBody</p>
     */
    public static class Applcation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("ApplicationType")
        private String applicationType;

        @com.aliyun.core.annotation.NameInMap("BuildPackageId")
        private Long buildPackageId;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterType")
        private Integer clusterType;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Dockerize")
        private Boolean dockerize;

        @com.aliyun.core.annotation.NameInMap("ExtSlbId")
        private String extSlbId;

        @com.aliyun.core.annotation.NameInMap("ExtSlbIp")
        private String extSlbIp;

        @com.aliyun.core.annotation.NameInMap("ExtSlbName")
        private String extSlbName;

        @com.aliyun.core.annotation.NameInMap("HealthCheckUrl")
        private String healthCheckUrl;

        @com.aliyun.core.annotation.NameInMap("InstanceCount")
        private Integer instanceCount;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Integer memory;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RunningInstanceCount")
        private Integer runningInstanceCount;

        @com.aliyun.core.annotation.NameInMap("SlbId")
        private String slbId;

        @com.aliyun.core.annotation.NameInMap("SlbIp")
        private String slbIp;

        @com.aliyun.core.annotation.NameInMap("SlbName")
        private String slbName;

        @com.aliyun.core.annotation.NameInMap("SlbPort")
        private Integer slbPort;

        @com.aliyun.core.annotation.NameInMap("UserId")
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

            private Builder() {
            } 

            private Builder(Applcation model) {
                this.appId = model.appId;
                this.applicationType = model.applicationType;
                this.buildPackageId = model.buildPackageId;
                this.clusterId = model.clusterId;
                this.clusterType = model.clusterType;
                this.cpu = model.cpu;
                this.createTime = model.createTime;
                this.description = model.description;
                this.dockerize = model.dockerize;
                this.extSlbId = model.extSlbId;
                this.extSlbIp = model.extSlbIp;
                this.extSlbName = model.extSlbName;
                this.healthCheckUrl = model.healthCheckUrl;
                this.instanceCount = model.instanceCount;
                this.memory = model.memory;
                this.name = model.name;
                this.owner = model.owner;
                this.port = model.port;
                this.regionId = model.regionId;
                this.runningInstanceCount = model.runningInstanceCount;
                this.slbId = model.slbId;
                this.slbIp = model.slbIp;
                this.slbName = model.slbName;
                this.slbPort = model.slbPort;
                this.userId = model.userId;
            } 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>c627c157-560d-43ff-<strong><strong>-</strong></strong>********</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The deployment type of the application. Valid values:</p>
             * <ul>
             * <li>War: The application is deployed by using a WAR package.</li>
             * <li>FatJar: The application is deployed by using a JAR package.</li>
             * <li>Image: The application is deployed by using an image.</li>
             * <li>If this parameter is empty, the application is not deployed.</li>
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
             * <p>The build package number of Enterprise Distributed Application Service (EDAS) Container.</p>
             * 
             * <strong>example:</strong>
             * <p>58</p>
             */
            public Builder buildPackageId(Long buildPackageId) {
                this.buildPackageId = buildPackageId;
                return this;
            }

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>d7730a49-629a-47bd-<strong><strong>-f45eb01f</strong></strong></p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The type of the cluster. Valid values:</p>
             * <ul>
             * <li>0: normal Docker cluster</li>
             * <li>1: Swarm cluster</li>
             * <li>2: ECS cluster</li>
             * <li>3: self-managed Kubernetes cluster in EDAS</li>
             * <li>4: cluster in which Pandora automatically registers applications</li>
             * <li>5: Container Service for Kubernetes (ACK) clusters</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder clusterType(Integer clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * <p>The number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The time when the application was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1577259573911</p>
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
             * <p>Indicates whether the application is a Docker application.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder dockerize(Boolean dockerize) {
                this.dockerize = dockerize;
                return this;
            }

            /**
             * <p>The ID of the Internet-facing SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ace93*******</p>
             */
            public Builder extSlbId(String extSlbId) {
                this.extSlbId = extSlbId;
                return this;
            }

            /**
             * <p>The IP address of the Internet-facing Server Load Balancer (SLB) instance.</p>
             * 
             * <strong>example:</strong>
             * <p>39.97.XX.XX</p>
             */
            public Builder extSlbIp(String extSlbIp) {
                this.extSlbIp = extSlbIp;
                return this;
            }

            /**
             * <p>The name of the Internet-facing SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder extSlbName(String extSlbName) {
                this.extSlbName = extSlbName;
                return this;
            }

            /**
             * <p>The health check URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://127.0.XX.XX:8080/_etc.html">http://127.0.XX.XX:8080/_etc.html</a></p>
             */
            public Builder healthCheckUrl(String healthCheckUrl) {
                this.healthCheckUrl = healthCheckUrl;
                return this;
            }

            /**
             * <p>The number of application instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * <p>The size of memory configured for an application instance. Unit: MB.</p>
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
             * <p>The owner of the application.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:test@aliyun_XXX.com">test@aliyun_XXX.com</a></p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The port used by the application.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing:****</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
             * <p>The ID of the internal-facing SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>a3d4*******</p>
             */
            public Builder slbId(String slbId) {
                this.slbId = slbId;
                return this;
            }

            /**
             * <p>The IP address of the internal-facing SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder slbIp(String slbIp) {
                this.slbIp = slbIp;
                return this;
            }

            /**
             * <p>The name of the internal-facing SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder slbName(String slbName) {
                this.slbName = slbName;
                return this;
            }

            /**
             * <p>The port used by the internal-facing SLB instance.</p>
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
             * <p>edas_com***@****.***</p>
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
