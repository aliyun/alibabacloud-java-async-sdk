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
 * {@link QueryApplicationStatusResponseBody} extends {@link TeaModel}
 *
 * <p>QueryApplicationStatusResponseBody</p>
 */
public class QueryApplicationStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppInfo")
    private AppInfo appInfo;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QueryApplicationStatusResponseBody model) {
            this.appInfo = model.appInfo;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the application.</p>
         */
        public Builder appInfo(AppInfo appInfo) {
            this.appInfo = appInfo;
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
         * <p>The additional information that is returned.</p>
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
         * <p>D16979DC-4D42-********</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryApplicationStatusResponseBody build() {
            return new QueryApplicationStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryApplicationStatusResponseBody} extends {@link TeaModel}
     *
     * <p>QueryApplicationStatusResponseBody</p>
     */
    public static class Application extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("BuildPackageId")
        private Integer buildPackageId;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Dockerize")
        private Boolean dockerize;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("HealthCheckUrl")
        private String healthCheckUrl;

        @com.aliyun.core.annotation.NameInMap("InstanceCount")
        private Integer instanceCount;

        @com.aliyun.core.annotation.NameInMap("LaunchTime")
        private Long launchTime;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Integer memory;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RunningInstanceCount")
        private Integer runningInstanceCount;

        @com.aliyun.core.annotation.NameInMap("UserId")
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

            private Builder() {
            } 

            private Builder(Application model) {
                this.applicationId = model.applicationId;
                this.buildPackageId = model.buildPackageId;
                this.clusterId = model.clusterId;
                this.cpu = model.cpu;
                this.createTime = model.createTime;
                this.dockerize = model.dockerize;
                this.email = model.email;
                this.healthCheckUrl = model.healthCheckUrl;
                this.instanceCount = model.instanceCount;
                this.launchTime = model.launchTime;
                this.memory = model.memory;
                this.name = model.name;
                this.owner = model.owner;
                this.phone = model.phone;
                this.port = model.port;
                this.regionId = model.regionId;
                this.runningInstanceCount = model.runningInstanceCount;
                this.userId = model.userId;
            } 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>3616cdca-4f92-4413-<strong><strong>-</strong></strong>********</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>The build package number of Enterprise Distributed Application Service (EDAS) Container.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder buildPackageId(Integer buildPackageId) {
                this.buildPackageId = buildPackageId;
                return this;
            }

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>0d247b93-8d62-4e34-<strong><strong>-</strong></strong>********</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The number of CPU cores used by the application.</p>
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
             * <p>1573626207270</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
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
             * <p>The email address of the user who created the application.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:1234567@qq.com">1234567@qq.com</a></p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>The health check URL.</p>
             * 
             * <strong>example:</strong>
             * <p>“”</p>
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
             * <p>The time when the application was launched. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder launchTime(Long launchTime) {
                this.launchTime = launchTime;
                return this;
            }

            /**
             * <p>The memory size.</p>
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
             * <p>EDAS-scaled-cluster:default cluster</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the user who created the application.</p>
             * 
             * <strong>example:</strong>
             * <p>edas_com***_****@<em><em><strong><strong>-</strong></strong></em>.</em>**</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The mobile number of the user who created the application.</p>
             * 
             * <strong>example:</strong>
             * <p>1886666****</p>
             */
            public Builder phone(String phone) {
                this.phone = phone;
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
             * <p>The ID of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shenzhen:test</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The number of application instances that are running.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder runningInstanceCount(Integer runningInstanceCount) {
                this.runningInstanceCount = runningInstanceCount;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>edas_com***_****@<em><em><strong><strong>-</strong></strong></em>.</em>**</p>
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
    /**
     * 
     * {@link QueryApplicationStatusResponseBody} extends {@link TeaModel}
     *
     * <p>QueryApplicationStatusResponseBody</p>
     */
    public static class DeployRecord extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DeployRecordId")
        private String deployRecordId;

        @com.aliyun.core.annotation.NameInMap("EccId")
        private String eccId;

        @com.aliyun.core.annotation.NameInMap("EcuId")
        private String ecuId;

        @com.aliyun.core.annotation.NameInMap("PackageMd5")
        private String packageMd5;

        @com.aliyun.core.annotation.NameInMap("PackageVersionId")
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

            private Builder() {
            } 

            private Builder(DeployRecord model) {
                this.createTime = model.createTime;
                this.deployRecordId = model.deployRecordId;
                this.eccId = model.eccId;
                this.ecuId = model.ecuId;
                this.packageMd5 = model.packageMd5;
                this.packageVersionId = model.packageVersionId;
            } 

            /**
             * <p>The time when the deployment record was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1573626226691</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the deployment record.</p>
             * 
             * <strong>example:</strong>
             * <p>bbc6c0d5-d792-4907-<strong><strong>-</strong></strong>********</p>
             */
            public Builder deployRecordId(String deployRecordId) {
                this.deployRecordId = deployRecordId;
                return this;
            }

            /**
             * <p>The unique ID of the ECC.</p>
             * 
             * <strong>example:</strong>
             * <p>0cf49a6c-95a8-4aa8-<strong><strong>-</strong></strong>********</p>
             */
            public Builder eccId(String eccId) {
                this.eccId = eccId;
                return this;
            }

            /**
             * <p>The unique ID of the ECU.</p>
             * 
             * <strong>example:</strong>
             * <p>07bd417a-b863-477d-<strong><strong>-</strong></strong>********</p>
             */
            public Builder ecuId(String ecuId) {
                this.ecuId = ecuId;
                return this;
            }

            /**
             * <p>The MD5 hash value of the deployment package.</p>
             * 
             * <strong>example:</strong>
             * <p>d0db5bcb442e492104d0f00e10a03dd9</p>
             */
            public Builder packageMd5(String packageMd5) {
                this.packageMd5 = packageMd5;
                return this;
            }

            /**
             * <p>The version of the deployment package that was used to deploy an application in the instance group.</p>
             * 
             * <strong>example:</strong>
             * <p>441beb18-da42-44dc-<strong><strong>-</strong></strong>********</p>
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
    /**
     * 
     * {@link QueryApplicationStatusResponseBody} extends {@link TeaModel}
     *
     * <p>QueryApplicationStatusResponseBody</p>
     */
    public static class DeployRecordList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeployRecord")
        private java.util.List<DeployRecord> deployRecord;

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
        public java.util.List<DeployRecord> getDeployRecord() {
            return this.deployRecord;
        }

        public static final class Builder {
            private java.util.List<DeployRecord> deployRecord; 

            private Builder() {
            } 

            private Builder(DeployRecordList model) {
                this.deployRecord = model.deployRecord;
            } 

            /**
             * DeployRecord.
             */
            public Builder deployRecord(java.util.List<DeployRecord> deployRecord) {
                this.deployRecord = deployRecord;
                return this;
            }

            public DeployRecordList build() {
                return new DeployRecordList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryApplicationStatusResponseBody} extends {@link TeaModel}
     *
     * <p>QueryApplicationStatusResponseBody</p>
     */
    public static class Ecc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppState")
        private Integer appState;

        @com.aliyun.core.annotation.NameInMap("ContainerStatus")
        private String containerStatus;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("EccId")
        private String eccId;

        @com.aliyun.core.annotation.NameInMap("EcuId")
        private String ecuId;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("TaskState")
        private Integer taskState;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("VpcId")
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

            private Builder() {
            } 

            private Builder(Ecc model) {
                this.appId = model.appId;
                this.appState = model.appState;
                this.containerStatus = model.containerStatus;
                this.createTime = model.createTime;
                this.eccId = model.eccId;
                this.ecuId = model.ecuId;
                this.groupId = model.groupId;
                this.ip = model.ip;
                this.taskState = model.taskState;
                this.updateTime = model.updateTime;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>3616cdca-4f92-4413-<strong><strong>-</strong></strong>********</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The status of the application instance. Valid values:</p>
             * <ul>
             * <li>0: AGENT_OFF: indicates that the agent is offline.</li>
             * <li>1: STOPPED: indicates that the application is stopped.</li>
             * <li>3: RUNNING_BUT_URL_FAILED: indicates that the health check failed.</li>
             * <li>7: RUNNING: indicates that the application is running.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder appState(Integer appState) {
                this.appState = appState;
                return this;
            }

            /**
             * <p>The status of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>“”</p>
             */
            public Builder containerStatus(String containerStatus) {
                this.containerStatus = containerStatus;
                return this;
            }

            /**
             * <p>The time when the ECC was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1573626226691</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The unique ID of the ECC.</p>
             * 
             * <strong>example:</strong>
             * <p>0cf49a6c-95a8-4aa8-<strong><strong>-</strong></strong>********</p>
             */
            public Builder eccId(String eccId) {
                this.eccId = eccId;
                return this;
            }

            /**
             * <p>The unique ID of the ECU.</p>
             * 
             * <strong>example:</strong>
             * <p>07bd417a-b863-477d-<strong><strong>-</strong></strong>********</p>
             */
            public Builder ecuId(String ecuId) {
                this.ecuId = ecuId;
                return this;
            }

            /**
             * <p>The ID of the instance group.</p>
             * 
             * <strong>example:</strong>
             * <p>8123db90-880f-486f-<strong><strong>-</strong></strong>********</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The private IP address of the ECU.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.<em>.</em>**</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The state of the latest task initiated on the application instance. Valid values:</p>
             * <ul>
             * <li>0: UNKNOWN: indicates that the state of the latest task is unknown.</li>
             * <li>1: PROCESSING: indicates that the latest task is being processed.</li>
             * <li>2: SUCCESS: indicates that the latest task is executed.</li>
             * <li>3: FAILED: indicates that the latest task failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder taskState(Integer taskState) {
                this.taskState = taskState;
                return this;
            }

            /**
             * <p>The time when the ECC was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1573635952012</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-wz9b246zg************</p>
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
    /**
     * 
     * {@link QueryApplicationStatusResponseBody} extends {@link TeaModel}
     *
     * <p>QueryApplicationStatusResponseBody</p>
     */
    public static class EccList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ecc")
        private java.util.List<Ecc> ecc;

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
        public java.util.List<Ecc> getEcc() {
            return this.ecc;
        }

        public static final class Builder {
            private java.util.List<Ecc> ecc; 

            private Builder() {
            } 

            private Builder(EccList model) {
                this.ecc = model.ecc;
            } 

            /**
             * Ecc.
             */
            public Builder ecc(java.util.List<Ecc> ecc) {
                this.ecc = ecc;
                return this;
            }

            public EccList build() {
                return new EccList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryApplicationStatusResponseBody} extends {@link TeaModel}
     *
     * <p>QueryApplicationStatusResponseBody</p>
     */
    public static class Ecu extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableCpu")
        private Integer availableCpu;

        @com.aliyun.core.annotation.NameInMap("AvailableMem")
        private Integer availableMem;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DockerEnv")
        private Boolean dockerEnv;

        @com.aliyun.core.annotation.NameInMap("EcuId")
        private String ecuId;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("HeartbeatTime")
        private Long heartbeatTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("IpAddr")
        private String ipAddr;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Online")
        private Boolean online;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
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

            private Builder() {
            } 

            private Builder(Ecu model) {
                this.availableCpu = model.availableCpu;
                this.availableMem = model.availableMem;
                this.createTime = model.createTime;
                this.dockerEnv = model.dockerEnv;
                this.ecuId = model.ecuId;
                this.groupId = model.groupId;
                this.heartbeatTime = model.heartbeatTime;
                this.instanceId = model.instanceId;
                this.ipAddr = model.ipAddr;
                this.name = model.name;
                this.online = model.online;
                this.regionId = model.regionId;
                this.updateTime = model.updateTime;
                this.userId = model.userId;
                this.vpcId = model.vpcId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The number of available CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder availableCpu(Integer availableCpu) {
                this.availableCpu = availableCpu;
                return this;
            }

            /**
             * <p>The size of the available memory.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder availableMem(Integer availableMem) {
                this.availableMem = availableMem;
                return this;
            }

            /**
             * <p>The time when the ECU was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1573626207270</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Indicates whether Docker is installed.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder dockerEnv(Boolean dockerEnv) {
                this.dockerEnv = dockerEnv;
                return this;
            }

            /**
             * <p>The unique ID of the ECU. You can run the <code>dmidecode</code> command on the ECS instance to query the ECU ID.</p>
             * 
             * <strong>example:</strong>
             * <p>07bd417a-b863-477d-<strong><strong>-</strong></strong>********</p>
             */
            public Builder ecuId(String ecuId) {
                this.ecuId = ecuId;
                return this;
            }

            /**
             * <p>The ID of the group.</p>
             * 
             * <strong>example:</strong>
             * <p>8123db90-880f-486f-<strong><strong>-</strong></strong>********</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The time when the last heartbeat detection was performed. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1573635952012</p>
             */
            public Builder heartbeatTime(Long heartbeatTime) {
                this.heartbeatTime = heartbeatTime;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-wz9fp1ljg***********</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The private IP address of the ECU.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.<em>.</em>*</p>
             */
            public Builder ipAddr(String ipAddr) {
                this.ipAddr = ipAddr;
                return this;
            }

            /**
             * <p>The name of the ECU.</p>
             * 
             * <strong>example:</strong>
             * <p>EDAS-scaled-cluster: default cluster</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Indicates whether the ECU is online.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder online(Boolean online) {
                this.online = online;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shen****-*</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The time when the ECU was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1573635952012</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The ID of the user associated with the ECU.</p>
             * 
             * <strong>example:</strong>
             * <p>edas_com***_****@<em><em><strong><strong>-</strong></strong></em>.</em>**</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-wz9b246zg************</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The ID of the zone.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shen****-*</p>
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
    /**
     * 
     * {@link QueryApplicationStatusResponseBody} extends {@link TeaModel}
     *
     * <p>QueryApplicationStatusResponseBody</p>
     */
    public static class EcuList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ecu")
        private java.util.List<Ecu> ecu;

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
        public java.util.List<Ecu> getEcu() {
            return this.ecu;
        }

        public static final class Builder {
            private java.util.List<Ecu> ecu; 

            private Builder() {
            } 

            private Builder(EcuList model) {
                this.ecu = model.ecu;
            } 

            /**
             * Ecu.
             */
            public Builder ecu(java.util.List<Ecu> ecu) {
                this.ecu = ecu;
                return this;
            }

            public EcuList build() {
                return new EcuList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryApplicationStatusResponseBody} extends {@link TeaModel}
     *
     * <p>QueryApplicationStatusResponseBody</p>
     */
    public static class Group extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppVersionId")
        private String appVersionId;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("GroupType")
        private Integer groupType;

        @com.aliyun.core.annotation.NameInMap("PackageVersionId")
        private String packageVersionId;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
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

            private Builder() {
            } 

            private Builder(Group model) {
                this.appId = model.appId;
                this.appVersionId = model.appVersionId;
                this.clusterId = model.clusterId;
                this.createTime = model.createTime;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.groupType = model.groupType;
                this.packageVersionId = model.packageVersionId;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>3616cdca-4f92-4413-<strong><strong>-</strong></strong>********</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The ID of the change process for application deployment in the instance group.</p>
             * 
             * <strong>example:</strong>
             * <p>changeorder_a**_*******_**</p>
             */
            public Builder appVersionId(String appVersionId) {
                this.appVersionId = appVersionId;
                return this;
            }

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>0d247b93-8d62-4e34-<strong><strong>-</strong></strong>********</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The time when the instance group was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1573626155185</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the instance group.</p>
             * 
             * <strong>example:</strong>
             * <p>8123db90-880f-486f-<strong><strong>-</strong></strong>********</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the instance group.</p>
             * 
             * <strong>example:</strong>
             * <p>_DEFAULT_GROUP</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The type of the instance group. Valid values:</p>
             * <ul>
             * <li>0: default group</li>
             * <li>1: self-managed group</li>
             * <li>2: canary release group</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder groupType(Integer groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * <p>The version of the deployment package that was used to deploy an application in the instance group.</p>
             * 
             * <strong>example:</strong>
             * <p>441beb18-da42-44dc-<strong><strong>-</strong></strong>********</p>
             */
            public Builder packageVersionId(String packageVersionId) {
                this.packageVersionId = packageVersionId;
                return this;
            }

            /**
             * <p>The time when the instance group was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1573627441388</p>
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
    /**
     * 
     * {@link QueryApplicationStatusResponseBody} extends {@link TeaModel}
     *
     * <p>QueryApplicationStatusResponseBody</p>
     */
    public static class GroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Group")
        private java.util.List<Group> group;

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
        public java.util.List<Group> getGroup() {
            return this.group;
        }

        public static final class Builder {
            private java.util.List<Group> group; 

            private Builder() {
            } 

            private Builder(GroupList model) {
                this.group = model.group;
            } 

            /**
             * Group.
             */
            public Builder group(java.util.List<Group> group) {
                this.group = group;
                return this;
            }

            public GroupList build() {
                return new GroupList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryApplicationStatusResponseBody} extends {@link TeaModel}
     *
     * <p>QueryApplicationStatusResponseBody</p>
     */
    public static class AppInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Application")
        private Application application;

        @com.aliyun.core.annotation.NameInMap("DeployRecordList")
        private DeployRecordList deployRecordList;

        @com.aliyun.core.annotation.NameInMap("EccList")
        private EccList eccList;

        @com.aliyun.core.annotation.NameInMap("EcuList")
        private EcuList ecuList;

        @com.aliyun.core.annotation.NameInMap("GroupList")
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

            private Builder() {
            } 

            private Builder(AppInfo model) {
                this.application = model.application;
                this.deployRecordList = model.deployRecordList;
                this.eccList = model.eccList;
                this.ecuList = model.ecuList;
                this.groupList = model.groupList;
            } 

            /**
             * <p>The basic information about the application.</p>
             */
            public Builder application(Application application) {
                this.application = application;
                return this;
            }

            /**
             * <p>The information about deployment records.</p>
             */
            public Builder deployRecordList(DeployRecordList deployRecordList) {
                this.deployRecordList = deployRecordList;
                return this;
            }

            /**
             * <p>The information about elastic compute containers (ECCs).</p>
             */
            public Builder eccList(EccList eccList) {
                this.eccList = eccList;
                return this;
            }

            /**
             * <p>The information about elastic compute units (ECUs).</p>
             */
            public Builder ecuList(EcuList ecuList) {
                this.ecuList = ecuList;
                return this;
            }

            /**
             * <p>The information about the instance groups.</p>
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
