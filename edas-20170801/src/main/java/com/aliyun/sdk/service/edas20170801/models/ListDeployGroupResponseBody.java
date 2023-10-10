// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeployGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListDeployGroupResponseBody</p>
 */
public class ListDeployGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("DeployGroupList")
    private DeployGroupList deployGroupList;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ListDeployGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.deployGroupList = builder.deployGroupList;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeployGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return deployGroupList
     */
    public DeployGroupList getDeployGroupList() {
        return this.deployGroupList;
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
        private Integer code; 
        private DeployGroupList deployGroupList; 
        private String message; 
        private String requestId; 

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The information about the instance group in which the application is deployed.
         */
        public Builder deployGroupList(DeployGroupList deployGroupList) {
            this.deployGroupList = deployGroupList;
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

        public ListDeployGroupResponseBody build() {
            return new ListDeployGroupResponseBody(this);
        } 

    } 

    public static class DeployGroup extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppVersionId")
        private String appVersionId;

        @NameInMap("BaseComponentMetaName")
        private String baseComponentMetaName;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("CpuLimit")
        private String cpuLimit;

        @NameInMap("CpuRequest")
        private String cpuRequest;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("CsClusterId")
        private String csClusterId;

        @NameInMap("DeploymentName")
        private String deploymentName;

        @NameInMap("Env")
        private String env;

        @NameInMap("EphemeralStorageLimit")
        private String ephemeralStorageLimit;

        @NameInMap("EphemeralStorageRequest")
        private String ephemeralStorageRequest;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("GroupType")
        private Integer groupType;

        @NameInMap("Labels")
        private String labels;

        @NameInMap("LastUpdateTime")
        private Long lastUpdateTime;

        @NameInMap("MemoryLimit")
        private String memoryLimit;

        @NameInMap("MemoryRequest")
        private String memoryRequest;

        @NameInMap("NameSpace")
        private String nameSpace;

        @NameInMap("PackagePublicUrl")
        private String packagePublicUrl;

        @NameInMap("PackageUrl")
        private String packageUrl;

        @NameInMap("PackageVersion")
        private String packageVersion;

        @NameInMap("PackageVersionId")
        private String packageVersionId;

        @NameInMap("PostStart")
        private String postStart;

        @NameInMap("PreStop")
        private String preStop;

        @NameInMap("Reversion")
        private String reversion;

        @NameInMap("Selector")
        private String selector;

        @NameInMap("Status")
        private String status;

        @NameInMap("Strategy")
        private String strategy;

        @NameInMap("UpdateTime")
        private Long updateTime;

        @NameInMap("VExtServerGroupId")
        private String vExtServerGroupId;

        @NameInMap("VServerGroupId")
        private String vServerGroupId;

        private DeployGroup(Builder builder) {
            this.appId = builder.appId;
            this.appVersionId = builder.appVersionId;
            this.baseComponentMetaName = builder.baseComponentMetaName;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.cpuLimit = builder.cpuLimit;
            this.cpuRequest = builder.cpuRequest;
            this.createTime = builder.createTime;
            this.csClusterId = builder.csClusterId;
            this.deploymentName = builder.deploymentName;
            this.env = builder.env;
            this.ephemeralStorageLimit = builder.ephemeralStorageLimit;
            this.ephemeralStorageRequest = builder.ephemeralStorageRequest;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.groupType = builder.groupType;
            this.labels = builder.labels;
            this.lastUpdateTime = builder.lastUpdateTime;
            this.memoryLimit = builder.memoryLimit;
            this.memoryRequest = builder.memoryRequest;
            this.nameSpace = builder.nameSpace;
            this.packagePublicUrl = builder.packagePublicUrl;
            this.packageUrl = builder.packageUrl;
            this.packageVersion = builder.packageVersion;
            this.packageVersionId = builder.packageVersionId;
            this.postStart = builder.postStart;
            this.preStop = builder.preStop;
            this.reversion = builder.reversion;
            this.selector = builder.selector;
            this.status = builder.status;
            this.strategy = builder.strategy;
            this.updateTime = builder.updateTime;
            this.vExtServerGroupId = builder.vExtServerGroupId;
            this.vServerGroupId = builder.vServerGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeployGroup create() {
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
         * @return baseComponentMetaName
         */
        public String getBaseComponentMetaName() {
            return this.baseComponentMetaName;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return cpuLimit
         */
        public String getCpuLimit() {
            return this.cpuLimit;
        }

        /**
         * @return cpuRequest
         */
        public String getCpuRequest() {
            return this.cpuRequest;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return csClusterId
         */
        public String getCsClusterId() {
            return this.csClusterId;
        }

        /**
         * @return deploymentName
         */
        public String getDeploymentName() {
            return this.deploymentName;
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return ephemeralStorageLimit
         */
        public String getEphemeralStorageLimit() {
            return this.ephemeralStorageLimit;
        }

        /**
         * @return ephemeralStorageRequest
         */
        public String getEphemeralStorageRequest() {
            return this.ephemeralStorageRequest;
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
         * @return labels
         */
        public String getLabels() {
            return this.labels;
        }

        /**
         * @return lastUpdateTime
         */
        public Long getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        /**
         * @return memoryLimit
         */
        public String getMemoryLimit() {
            return this.memoryLimit;
        }

        /**
         * @return memoryRequest
         */
        public String getMemoryRequest() {
            return this.memoryRequest;
        }

        /**
         * @return nameSpace
         */
        public String getNameSpace() {
            return this.nameSpace;
        }

        /**
         * @return packagePublicUrl
         */
        public String getPackagePublicUrl() {
            return this.packagePublicUrl;
        }

        /**
         * @return packageUrl
         */
        public String getPackageUrl() {
            return this.packageUrl;
        }

        /**
         * @return packageVersion
         */
        public String getPackageVersion() {
            return this.packageVersion;
        }

        /**
         * @return packageVersionId
         */
        public String getPackageVersionId() {
            return this.packageVersionId;
        }

        /**
         * @return postStart
         */
        public String getPostStart() {
            return this.postStart;
        }

        /**
         * @return preStop
         */
        public String getPreStop() {
            return this.preStop;
        }

        /**
         * @return reversion
         */
        public String getReversion() {
            return this.reversion;
        }

        /**
         * @return selector
         */
        public String getSelector() {
            return this.selector;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return strategy
         */
        public String getStrategy() {
            return this.strategy;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return vExtServerGroupId
         */
        public String getVExtServerGroupId() {
            return this.vExtServerGroupId;
        }

        /**
         * @return vServerGroupId
         */
        public String getVServerGroupId() {
            return this.vServerGroupId;
        }

        public static final class Builder {
            private String appId; 
            private String appVersionId; 
            private String baseComponentMetaName; 
            private String clusterId; 
            private String clusterName; 
            private String cpuLimit; 
            private String cpuRequest; 
            private Long createTime; 
            private String csClusterId; 
            private String deploymentName; 
            private String env; 
            private String ephemeralStorageLimit; 
            private String ephemeralStorageRequest; 
            private String groupId; 
            private String groupName; 
            private Integer groupType; 
            private String labels; 
            private Long lastUpdateTime; 
            private String memoryLimit; 
            private String memoryRequest; 
            private String nameSpace; 
            private String packagePublicUrl; 
            private String packageUrl; 
            private String packageVersion; 
            private String packageVersionId; 
            private String postStart; 
            private String preStop; 
            private String reversion; 
            private String selector; 
            private String status; 
            private String strategy; 
            private Long updateTime; 
            private String vExtServerGroupId; 
            private String vServerGroupId; 

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
             * The name of the basic component.
             */
            public Builder baseComponentMetaName(String baseComponentMetaName) {
                this.baseComponentMetaName = baseComponentMetaName;
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
             * The name of the cluster.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * The maximum number of CPU cores allowed for each application instance when the application is running.
             */
            public Builder cpuLimit(String cpuLimit) {
                this.cpuLimit = cpuLimit;
                return this;
            }

            /**
             * The number of CPU cores requested for each application instance when the application is running. Unit: cores. Value 0 indicates that no limit is set on CPU cores.
             */
            public Builder cpuRequest(String cpuRequest) {
                this.cpuRequest = cpuRequest;
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
             * The ID of the Container Service for Kubernetes (ACK) cluster.
             */
            public Builder csClusterId(String csClusterId) {
                this.csClusterId = csClusterId;
                return this;
            }

            /**
             * The name of the deployment.
             */
            public Builder deploymentName(String deploymentName) {
                this.deploymentName = deploymentName;
                return this;
            }

            /**
             * The ID of the ACK cluster.
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * The maximum size of space required by ephemeral storage. Unit: GB. Value 0 indicates that no limit is set on the space size.
             */
            public Builder ephemeralStorageLimit(String ephemeralStorageLimit) {
                this.ephemeralStorageLimit = ephemeralStorageLimit;
                return this;
            }

            /**
             * The minimum size of space required by ephemeral storage. Unit: GB. Value 0 indicates that no limit is set on the space size.
             */
            public Builder ephemeralStorageRequest(String ephemeralStorageRequest) {
                this.ephemeralStorageRequest = ephemeralStorageRequest;
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
             * *   0: default group.
             * *   1: Canary release is disabled for traffic management.
             * *   2: Canary release is enabled for traffic management.
             */
            public Builder groupType(Integer groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * The tag.
             */
            public Builder labels(String labels) {
                this.labels = labels;
                return this;
            }

            /**
             * The time when the application was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder lastUpdateTime(Long lastUpdateTime) {
                this.lastUpdateTime = lastUpdateTime;
                return this;
            }

            /**
             * The maximum size of memory allowed for each application instance when the application is running. Unit: MB. Value 0 indicates that no limit is set on the memory size.
             */
            public Builder memoryLimit(String memoryLimit) {
                this.memoryLimit = memoryLimit;
                return this;
            }

            /**
             * The size of memory requested for each application instance when the application is running. Unit: MB. Value 0 indicates that no limit is set on the memory size.
             */
            public Builder memoryRequest(String memoryRequest) {
                this.memoryRequest = memoryRequest;
                return this;
            }

            /**
             * The namespace.
             */
            public Builder nameSpace(String nameSpace) {
                this.nameSpace = nameSpace;
                return this;
            }

            /**
             * The external download URL of the deployment package.
             */
            public Builder packagePublicUrl(String packagePublicUrl) {
                this.packagePublicUrl = packagePublicUrl;
                return this;
            }

            /**
             * The URL of the deployment package.
             */
            public Builder packageUrl(String packageUrl) {
                this.packageUrl = packageUrl;
                return this;
            }

            /**
             * The version of the deployment package.
             */
            public Builder packageVersion(String packageVersion) {
                this.packageVersion = packageVersion;
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
             * The post-start script.
             */
            public Builder postStart(String postStart) {
                this.postStart = postStart;
                return this;
            }

            /**
             * The pre-stop script.
             */
            public Builder preStop(String preStop) {
                this.preStop = preStop;
                return this;
            }

            /**
             * The version of the application. The value progressively increases in the range of 0 to 7.
             */
            public Builder reversion(String reversion) {
                this.reversion = reversion;
                return this;
            }

            /**
             * The ID of the application deployed in the ACK cluster in Enterprise Distributed Application Service (EDAS).
             */
            public Builder selector(String selector) {
                this.selector = selector;
                return this;
            }

            /**
             * The state of the application instance group. Valid values:
             * <p>
             * 
             * *   0: ready
             * *   1: in progress
             * *   2: successful
             * *   3: failed
             * *   6: terminated
             * *   10: failed due to a system exception
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The throttling policy. This parameter is reserved.
             */
            public Builder strategy(String strategy) {
                this.strategy = strategy;
                return this;
            }

            /**
             * The time when the application was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The ID of the vServer group of the Internet-facing SLB instance associated with the instance group.
             */
            public Builder vExtServerGroupId(String vExtServerGroupId) {
                this.vExtServerGroupId = vExtServerGroupId;
                return this;
            }

            /**
             * The ID of the vServer group of the internal-facing Server Load Balancer (SLB) instance associated with the instance group.
             */
            public Builder vServerGroupId(String vServerGroupId) {
                this.vServerGroupId = vServerGroupId;
                return this;
            }

            public DeployGroup build() {
                return new DeployGroup(this);
            } 

        } 

    }
    public static class DeployGroupList extends TeaModel {
        @NameInMap("DeployGroup")
        private java.util.List < DeployGroup> deployGroup;

        private DeployGroupList(Builder builder) {
            this.deployGroup = builder.deployGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeployGroupList create() {
            return builder().build();
        }

        /**
         * @return deployGroup
         */
        public java.util.List < DeployGroup> getDeployGroup() {
            return this.deployGroup;
        }

        public static final class Builder {
            private java.util.List < DeployGroup> deployGroup; 

            /**
             * DeployGroup.
             */
            public Builder deployGroup(java.util.List < DeployGroup> deployGroup) {
                this.deployGroup = deployGroup;
                return this;
            }

            public DeployGroupList build() {
                return new DeployGroupList(this);
            } 

        } 

    }
}
