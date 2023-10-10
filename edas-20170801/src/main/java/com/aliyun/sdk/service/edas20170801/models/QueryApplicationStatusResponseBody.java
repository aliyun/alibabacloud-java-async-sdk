// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryApplicationStatusResponseBody} extends {@link TeaModel}
 *
 * <p>QueryApplicationStatusResponseBody</p>
 */
public class QueryApplicationStatusResponseBody extends TeaModel {
    @NameInMap("AppInfo")
    private AppInfo appInfo;

    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private QueryApplicationStatusResponseBody(Builder builder) {
        this.appInfo = builder.appInfo;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryApplicationStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return appInfo
     */
    public AppInfo getAppInfo() {
        return this.appInfo;
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
        private AppInfo appInfo; 
        private Integer code; 
        private String message; 
        private String requestId; 

        /**
         * The information about the application.
         */
        public Builder appInfo(AppInfo appInfo) {
            this.appInfo = appInfo;
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

        public QueryApplicationStatusResponseBody build() {
            return new QueryApplicationStatusResponseBody(this);
        } 

    } 

    public static class Application extends TeaModel {
        @NameInMap("ApplicationId")
        private String applicationId;

        @NameInMap("BuildPackageId")
        private Integer buildPackageId;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Dockerize")
        private Boolean dockerize;

        @NameInMap("Email")
        private String email;

        @NameInMap("HealthCheckUrl")
        private String healthCheckUrl;

        @NameInMap("InstanceCount")
        private Integer instanceCount;

        @NameInMap("LaunchTime")
        private Long launchTime;

        @NameInMap("Memory")
        private Integer memory;

        @NameInMap("Name")
        private String name;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("Phone")
        private String phone;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RunningInstanceCount")
        private Integer runningInstanceCount;

        @NameInMap("UserId")
        private String userId;

        private Application(Builder builder) {
            this.applicationId = builder.applicationId;
            this.buildPackageId = builder.buildPackageId;
            this.clusterId = builder.clusterId;
            this.cpu = builder.cpu;
            this.createTime = builder.createTime;
            this.dockerize = builder.dockerize;
            this.email = builder.email;
            this.healthCheckUrl = builder.healthCheckUrl;
            this.instanceCount = builder.instanceCount;
            this.launchTime = builder.launchTime;
            this.memory = builder.memory;
            this.name = builder.name;
            this.owner = builder.owner;
            this.phone = builder.phone;
            this.port = builder.port;
            this.regionId = builder.regionId;
            this.runningInstanceCount = builder.runningInstanceCount;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Application create() {
            return builder().build();
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return buildPackageId
         */
        public Integer getBuildPackageId() {
            return this.buildPackageId;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
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
         * @return launchTime
         */
        public Long getLaunchTime() {
            return this.launchTime;
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
         * @return phone
         */
        public String getPhone() {
            return this.phone;
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
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String applicationId; 
            private Integer buildPackageId; 
            private String clusterId; 
            private Integer cpu; 
            private Long createTime; 
            private Boolean dockerize; 
            private String email; 
            private String healthCheckUrl; 
            private Integer instanceCount; 
            private Long launchTime; 
            private Integer memory; 
            private String name; 
            private String owner; 
            private String phone; 
            private Integer port; 
            private String regionId; 
            private Integer runningInstanceCount; 
            private String userId; 

            /**
             * The ID of the application.
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * The build package number of Enterprise Distributed Application Service (EDAS) Container.
             */
            public Builder buildPackageId(Integer buildPackageId) {
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
             * The number of CPU cores used by the application.
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
             * Indicates whether the application is a Docker application.
             */
            public Builder dockerize(Boolean dockerize) {
                this.dockerize = dockerize;
                return this;
            }

            /**
             * The email address of the user who created the application.
             */
            public Builder email(String email) {
                this.email = email;
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
             * The time when the application was launched. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder launchTime(Long launchTime) {
                this.launchTime = launchTime;
                return this;
            }

            /**
             * The memory size.
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
             * The ID of the user who created the application.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The mobile number of the user who created the application.
             */
            public Builder phone(String phone) {
                this.phone = phone;
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
             * The ID of the namespace.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The number of application instances that are running.
             */
            public Builder runningInstanceCount(Integer runningInstanceCount) {
                this.runningInstanceCount = runningInstanceCount;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Application build() {
                return new Application(this);
            } 

        } 

    }
    public static class DeployRecord extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("DeployRecordId")
        private String deployRecordId;

        @NameInMap("EccId")
        private String eccId;

        @NameInMap("EcuId")
        private String ecuId;

        @NameInMap("PackageMd5")
        private String packageMd5;

        @NameInMap("PackageVersionId")
        private String packageVersionId;

        private DeployRecord(Builder builder) {
            this.createTime = builder.createTime;
            this.deployRecordId = builder.deployRecordId;
            this.eccId = builder.eccId;
            this.ecuId = builder.ecuId;
            this.packageMd5 = builder.packageMd5;
            this.packageVersionId = builder.packageVersionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeployRecord create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deployRecordId
         */
        public String getDeployRecordId() {
            return this.deployRecordId;
        }

        /**
         * @return eccId
         */
        public String getEccId() {
            return this.eccId;
        }

        /**
         * @return ecuId
         */
        public String getEcuId() {
            return this.ecuId;
        }

        /**
         * @return packageMd5
         */
        public String getPackageMd5() {
            return this.packageMd5;
        }

        /**
         * @return packageVersionId
         */
        public String getPackageVersionId() {
            return this.packageVersionId;
        }

        public static final class Builder {
            private Long createTime; 
            private String deployRecordId; 
            private String eccId; 
            private String ecuId; 
            private String packageMd5; 
            private String packageVersionId; 

            /**
             * The time when the deployment record was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the deployment record.
             */
            public Builder deployRecordId(String deployRecordId) {
                this.deployRecordId = deployRecordId;
                return this;
            }

            /**
             * The unique ID of the ECC.
             */
            public Builder eccId(String eccId) {
                this.eccId = eccId;
                return this;
            }

            /**
             * The unique ID of the ECU.
             */
            public Builder ecuId(String ecuId) {
                this.ecuId = ecuId;
                return this;
            }

            /**
             * The MD5 hash value of the deployment package.
             */
            public Builder packageMd5(String packageMd5) {
                this.packageMd5 = packageMd5;
                return this;
            }

            /**
             * The version of the deployment package that was used to deploy an application in the instance group.
             */
            public Builder packageVersionId(String packageVersionId) {
                this.packageVersionId = packageVersionId;
                return this;
            }

            public DeployRecord build() {
                return new DeployRecord(this);
            } 

        } 

    }
    public static class DeployRecordList extends TeaModel {
        @NameInMap("DeployRecord")
        private java.util.List < DeployRecord> deployRecord;

        private DeployRecordList(Builder builder) {
            this.deployRecord = builder.deployRecord;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeployRecordList create() {
            return builder().build();
        }

        /**
         * @return deployRecord
         */
        public java.util.List < DeployRecord> getDeployRecord() {
            return this.deployRecord;
        }

        public static final class Builder {
            private java.util.List < DeployRecord> deployRecord; 

            /**
             * DeployRecord.
             */
            public Builder deployRecord(java.util.List < DeployRecord> deployRecord) {
                this.deployRecord = deployRecord;
                return this;
            }

            public DeployRecordList build() {
                return new DeployRecordList(this);
            } 

        } 

    }
    public static class Ecc extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppState")
        private Integer appState;

        @NameInMap("ContainerStatus")
        private String containerStatus;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("EccId")
        private String eccId;

        @NameInMap("EcuId")
        private String ecuId;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("TaskState")
        private Integer taskState;

        @NameInMap("UpdateTime")
        private Long updateTime;

        @NameInMap("VpcId")
        private String vpcId;

        private Ecc(Builder builder) {
            this.appId = builder.appId;
            this.appState = builder.appState;
            this.containerStatus = builder.containerStatus;
            this.createTime = builder.createTime;
            this.eccId = builder.eccId;
            this.ecuId = builder.ecuId;
            this.groupId = builder.groupId;
            this.ip = builder.ip;
            this.taskState = builder.taskState;
            this.updateTime = builder.updateTime;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ecc create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appState
         */
        public Integer getAppState() {
            return this.appState;
        }

        /**
         * @return containerStatus
         */
        public String getContainerStatus() {
            return this.containerStatus;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return eccId
         */
        public String getEccId() {
            return this.eccId;
        }

        /**
         * @return ecuId
         */
        public String getEcuId() {
            return this.ecuId;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return taskState
         */
        public Integer getTaskState() {
            return this.taskState;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String appId; 
            private Integer appState; 
            private String containerStatus; 
            private Long createTime; 
            private String eccId; 
            private String ecuId; 
            private String groupId; 
            private String ip; 
            private Integer taskState; 
            private Long updateTime; 
            private String vpcId; 

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The status of the application instance. Valid values:
             * <p>
             * 
             * *   0: AGENT_OFF: indicates that the agent is offline.
             * *   1: STOPPED: indicates that the application is stopped.
             * *   3: RUNNING_BUT_URL_FAILED: indicates that the health check failed.
             * *   7: RUNNING: indicates that the application is running.
             */
            public Builder appState(Integer appState) {
                this.appState = appState;
                return this;
            }

            /**
             * The status of the container.
             */
            public Builder containerStatus(String containerStatus) {
                this.containerStatus = containerStatus;
                return this;
            }

            /**
             * The time when the ECC was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The unique ID of the ECC.
             */
            public Builder eccId(String eccId) {
                this.eccId = eccId;
                return this;
            }

            /**
             * The unique ID of the ECU.
             */
            public Builder ecuId(String ecuId) {
                this.ecuId = ecuId;
                return this;
            }

            /**
             * The ID of the instance group.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The private IP address of the ECU.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The state of the latest task initiated on the application instance. Valid values:
             * <p>
             * 
             * *   0: UNKNOWN: indicates that the state of the latest task is unknown.
             * *   1: PROCESSING: indicates that the latest task is being processed.
             * *   2: SUCCESS: indicates that the latest task is executed.
             * *   3: FAILED: indicates that the latest task failed.
             */
            public Builder taskState(Integer taskState) {
                this.taskState = taskState;
                return this;
            }

            /**
             * The time when the ECC was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The ID of the VPC.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Ecc build() {
                return new Ecc(this);
            } 

        } 

    }
    public static class EccList extends TeaModel {
        @NameInMap("Ecc")
        private java.util.List < Ecc> ecc;

        private EccList(Builder builder) {
            this.ecc = builder.ecc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EccList create() {
            return builder().build();
        }

        /**
         * @return ecc
         */
        public java.util.List < Ecc> getEcc() {
            return this.ecc;
        }

        public static final class Builder {
            private java.util.List < Ecc> ecc; 

            /**
             * Ecc.
             */
            public Builder ecc(java.util.List < Ecc> ecc) {
                this.ecc = ecc;
                return this;
            }

            public EccList build() {
                return new EccList(this);
            } 

        } 

    }
    public static class Ecu extends TeaModel {
        @NameInMap("AvailableCpu")
        private Integer availableCpu;

        @NameInMap("AvailableMem")
        private Integer availableMem;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("DockerEnv")
        private Boolean dockerEnv;

        @NameInMap("EcuId")
        private String ecuId;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("HeartbeatTime")
        private Long heartbeatTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("IpAddr")
        private String ipAddr;

        @NameInMap("Name")
        private String name;

        @NameInMap("Online")
        private Boolean online;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("UpdateTime")
        private Long updateTime;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("ZoneId")
        private String zoneId;

        private Ecu(Builder builder) {
            this.availableCpu = builder.availableCpu;
            this.availableMem = builder.availableMem;
            this.createTime = builder.createTime;
            this.dockerEnv = builder.dockerEnv;
            this.ecuId = builder.ecuId;
            this.groupId = builder.groupId;
            this.heartbeatTime = builder.heartbeatTime;
            this.instanceId = builder.instanceId;
            this.ipAddr = builder.ipAddr;
            this.name = builder.name;
            this.online = builder.online;
            this.regionId = builder.regionId;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ecu create() {
            return builder().build();
        }

        /**
         * @return availableCpu
         */
        public Integer getAvailableCpu() {
            return this.availableCpu;
        }

        /**
         * @return availableMem
         */
        public Integer getAvailableMem() {
            return this.availableMem;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dockerEnv
         */
        public Boolean getDockerEnv() {
            return this.dockerEnv;
        }

        /**
         * @return ecuId
         */
        public String getEcuId() {
            return this.ecuId;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return heartbeatTime
         */
        public Long getHeartbeatTime() {
            return this.heartbeatTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return ipAddr
         */
        public String getIpAddr() {
            return this.ipAddr;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return online
         */
        public Boolean getOnline() {
            return this.online;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Integer availableCpu; 
            private Integer availableMem; 
            private Long createTime; 
            private Boolean dockerEnv; 
            private String ecuId; 
            private String groupId; 
            private Long heartbeatTime; 
            private String instanceId; 
            private String ipAddr; 
            private String name; 
            private Boolean online; 
            private String regionId; 
            private Long updateTime; 
            private String userId; 
            private String vpcId; 
            private String zoneId; 

            /**
             * The number of available CPU cores.
             */
            public Builder availableCpu(Integer availableCpu) {
                this.availableCpu = availableCpu;
                return this;
            }

            /**
             * The size of the available memory.
             */
            public Builder availableMem(Integer availableMem) {
                this.availableMem = availableMem;
                return this;
            }

            /**
             * The time when the ECU was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Indicates whether Docker is installed.
             */
            public Builder dockerEnv(Boolean dockerEnv) {
                this.dockerEnv = dockerEnv;
                return this;
            }

            /**
             * The unique ID of the ECU. You can run the `dmidecode` command on the ECS instance to query the ECU ID.
             */
            public Builder ecuId(String ecuId) {
                this.ecuId = ecuId;
                return this;
            }

            /**
             * The ID of the group.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The time when the last heartbeat detection was performed. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder heartbeatTime(Long heartbeatTime) {
                this.heartbeatTime = heartbeatTime;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The private IP address of the ECU.
             */
            public Builder ipAddr(String ipAddr) {
                this.ipAddr = ipAddr;
                return this;
            }

            /**
             * The name of the ECU.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Indicates whether the ECU is online.
             */
            public Builder online(Boolean online) {
                this.online = online;
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
             * The time when the ECU was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The ID of the user associated with the ECU.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC).
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The ID of the zone.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Ecu build() {
                return new Ecu(this);
            } 

        } 

    }
    public static class EcuList extends TeaModel {
        @NameInMap("Ecu")
        private java.util.List < Ecu> ecu;

        private EcuList(Builder builder) {
            this.ecu = builder.ecu;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcuList create() {
            return builder().build();
        }

        /**
         * @return ecu
         */
        public java.util.List < Ecu> getEcu() {
            return this.ecu;
        }

        public static final class Builder {
            private java.util.List < Ecu> ecu; 

            /**
             * Ecu.
             */
            public Builder ecu(java.util.List < Ecu> ecu) {
                this.ecu = ecu;
                return this;
            }

            public EcuList build() {
                return new EcuList(this);
            } 

        } 

    }
    public static class Group extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppVersionId")
        private String appVersionId;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("GroupType")
        private Integer groupType;

        @NameInMap("PackageVersionId")
        private String packageVersionId;

        @NameInMap("UpdateTime")
        private Long updateTime;

        private Group(Builder builder) {
            this.appId = builder.appId;
            this.appVersionId = builder.appVersionId;
            this.clusterId = builder.clusterId;
            this.createTime = builder.createTime;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.groupType = builder.groupType;
            this.packageVersionId = builder.packageVersionId;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Group create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appVersionId
         */
        public String getAppVersionId() {
            return this.appVersionId;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return groupType
         */
        public Integer getGroupType() {
            return this.groupType;
        }

        /**
         * @return packageVersionId
         */
        public String getPackageVersionId() {
            return this.packageVersionId;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String appId; 
            private String appVersionId; 
            private String clusterId; 
            private Long createTime; 
            private String groupId; 
            private String groupName; 
            private Integer groupType; 
            private String packageVersionId; 
            private Long updateTime; 

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The ID of the change process for application deployment in the instance group.
             */
            public Builder appVersionId(String appVersionId) {
                this.appVersionId = appVersionId;
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
             * The time when the instance group was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the instance group.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The name of the instance group.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The type of the instance group. Valid values:
             * <p>
             * 
             * *   0: default group
             * *   1: self-managed group
             * *   2: canary release group
             */
            public Builder groupType(Integer groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * The version of the deployment package that was used to deploy an application in the instance group.
             */
            public Builder packageVersionId(String packageVersionId) {
                this.packageVersionId = packageVersionId;
                return this;
            }

            /**
             * The time when the instance group was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Group build() {
                return new Group(this);
            } 

        } 

    }
    public static class GroupList extends TeaModel {
        @NameInMap("Group")
        private java.util.List < Group> group;

        private GroupList(Builder builder) {
            this.group = builder.group;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupList create() {
            return builder().build();
        }

        /**
         * @return group
         */
        public java.util.List < Group> getGroup() {
            return this.group;
        }

        public static final class Builder {
            private java.util.List < Group> group; 

            /**
             * Group.
             */
            public Builder group(java.util.List < Group> group) {
                this.group = group;
                return this;
            }

            public GroupList build() {
                return new GroupList(this);
            } 

        } 

    }
    public static class AppInfo extends TeaModel {
        @NameInMap("Application")
        private Application application;

        @NameInMap("DeployRecordList")
        private DeployRecordList deployRecordList;

        @NameInMap("EccList")
        private EccList eccList;

        @NameInMap("EcuList")
        private EcuList ecuList;

        @NameInMap("GroupList")
        private GroupList groupList;

        private AppInfo(Builder builder) {
            this.application = builder.application;
            this.deployRecordList = builder.deployRecordList;
            this.eccList = builder.eccList;
            this.ecuList = builder.ecuList;
            this.groupList = builder.groupList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppInfo create() {
            return builder().build();
        }

        /**
         * @return application
         */
        public Application getApplication() {
            return this.application;
        }

        /**
         * @return deployRecordList
         */
        public DeployRecordList getDeployRecordList() {
            return this.deployRecordList;
        }

        /**
         * @return eccList
         */
        public EccList getEccList() {
            return this.eccList;
        }

        /**
         * @return ecuList
         */
        public EcuList getEcuList() {
            return this.ecuList;
        }

        /**
         * @return groupList
         */
        public GroupList getGroupList() {
            return this.groupList;
        }

        public static final class Builder {
            private Application application; 
            private DeployRecordList deployRecordList; 
            private EccList eccList; 
            private EcuList ecuList; 
            private GroupList groupList; 

            /**
             * The basic information about the application.
             */
            public Builder application(Application application) {
                this.application = application;
                return this;
            }

            /**
             * The information about deployment records.
             */
            public Builder deployRecordList(DeployRecordList deployRecordList) {
                this.deployRecordList = deployRecordList;
                return this;
            }

            /**
             * The information about elastic compute containers (ECCs).
             */
            public Builder eccList(EccList eccList) {
                this.eccList = eccList;
                return this;
            }

            /**
             * The information about elastic compute units (ECUs).
             */
            public Builder ecuList(EcuList ecuList) {
                this.ecuList = ecuList;
                return this;
            }

            /**
             * The information about the instance groups.
             */
            public Builder groupList(GroupList groupList) {
                this.groupList = groupList;
                return this;
            }

            public AppInfo build() {
                return new AppInfo(this);
            } 

        } 

    }
}
