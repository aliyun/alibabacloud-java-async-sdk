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
 * {@link ListDeployGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListDeployGroupResponseBody</p>
 */
public class ListDeployGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("DeployGroupList")
    private DeployGroupList deployGroupList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListDeployGroupResponseBody model) {
            this.code = model.code;
            this.deployGroupList = model.deployGroupList;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status code of the request or a POP error code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * DeployGroupList.
         */
        public Builder deployGroupList(DeployGroupList deployGroupList) {
            this.deployGroupList = deployGroupList;
            return this;
        }

        /**
         * <p>The returned message.</p>
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
         * <p>3FDE-DS9R-*********************</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDeployGroupResponseBody build() {
            return new ListDeployGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDeployGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListDeployGroupResponseBody</p>
     */
    public static class DeployGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppVersionId")
        private String appVersionId;

        @com.aliyun.core.annotation.NameInMap("BaseComponentMetaName")
        private String baseComponentMetaName;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("CpuLimit")
        private String cpuLimit;

        @com.aliyun.core.annotation.NameInMap("CpuRequest")
        private String cpuRequest;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CsClusterId")
        private String csClusterId;

        @com.aliyun.core.annotation.NameInMap("DeploymentName")
        private String deploymentName;

        @com.aliyun.core.annotation.NameInMap("Env")
        private String env;

        @com.aliyun.core.annotation.NameInMap("EphemeralStorageLimit")
        private String ephemeralStorageLimit;

        @com.aliyun.core.annotation.NameInMap("EphemeralStorageRequest")
        private String ephemeralStorageRequest;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("GroupType")
        private Integer groupType;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private String labels;

        @com.aliyun.core.annotation.NameInMap("LastUpdateTime")
        private Long lastUpdateTime;

        @com.aliyun.core.annotation.NameInMap("MemoryLimit")
        private String memoryLimit;

        @com.aliyun.core.annotation.NameInMap("MemoryRequest")
        private String memoryRequest;

        @com.aliyun.core.annotation.NameInMap("NameSpace")
        private String nameSpace;

        @com.aliyun.core.annotation.NameInMap("PackagePublicUrl")
        private String packagePublicUrl;

        @com.aliyun.core.annotation.NameInMap("PackageUrl")
        private String packageUrl;

        @com.aliyun.core.annotation.NameInMap("PackageVersion")
        private String packageVersion;

        @com.aliyun.core.annotation.NameInMap("PackageVersionId")
        private String packageVersionId;

        @com.aliyun.core.annotation.NameInMap("PostStart")
        private String postStart;

        @com.aliyun.core.annotation.NameInMap("PreStop")
        private String preStop;

        @com.aliyun.core.annotation.NameInMap("Reversion")
        private String reversion;

        @com.aliyun.core.annotation.NameInMap("Selector")
        private String selector;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Strategy")
        private String strategy;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("VExtServerGroupId")
        private String vExtServerGroupId;

        @com.aliyun.core.annotation.NameInMap("VServerGroupId")
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

            private Builder() {
            } 

            private Builder(DeployGroup model) {
                this.appId = model.appId;
                this.appVersionId = model.appVersionId;
                this.baseComponentMetaName = model.baseComponentMetaName;
                this.clusterId = model.clusterId;
                this.clusterName = model.clusterName;
                this.cpuLimit = model.cpuLimit;
                this.cpuRequest = model.cpuRequest;
                this.createTime = model.createTime;
                this.csClusterId = model.csClusterId;
                this.deploymentName = model.deploymentName;
                this.env = model.env;
                this.ephemeralStorageLimit = model.ephemeralStorageLimit;
                this.ephemeralStorageRequest = model.ephemeralStorageRequest;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.groupType = model.groupType;
                this.labels = model.labels;
                this.lastUpdateTime = model.lastUpdateTime;
                this.memoryLimit = model.memoryLimit;
                this.memoryRequest = model.memoryRequest;
                this.nameSpace = model.nameSpace;
                this.packagePublicUrl = model.packagePublicUrl;
                this.packageUrl = model.packageUrl;
                this.packageVersion = model.packageVersion;
                this.packageVersionId = model.packageVersionId;
                this.postStart = model.postStart;
                this.preStop = model.preStop;
                this.reversion = model.reversion;
                this.selector = model.selector;
                this.status = model.status;
                this.strategy = model.strategy;
                this.updateTime = model.updateTime;
                this.vExtServerGroupId = model.vExtServerGroupId;
                this.vServerGroupId = model.vServerGroupId;
            } 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppVersionId.
             */
            public Builder appVersionId(String appVersionId) {
                this.appVersionId = appVersionId;
                return this;
            }

            /**
             * BaseComponentMetaName.
             */
            public Builder baseComponentMetaName(String baseComponentMetaName) {
                this.baseComponentMetaName = baseComponentMetaName;
                return this;
            }

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * ClusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * CpuLimit.
             */
            public Builder cpuLimit(String cpuLimit) {
                this.cpuLimit = cpuLimit;
                return this;
            }

            /**
             * CpuRequest.
             */
            public Builder cpuRequest(String cpuRequest) {
                this.cpuRequest = cpuRequest;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CsClusterId.
             */
            public Builder csClusterId(String csClusterId) {
                this.csClusterId = csClusterId;
                return this;
            }

            /**
             * DeploymentName.
             */
            public Builder deploymentName(String deploymentName) {
                this.deploymentName = deploymentName;
                return this;
            }

            /**
             * Env.
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * EphemeralStorageLimit.
             */
            public Builder ephemeralStorageLimit(String ephemeralStorageLimit) {
                this.ephemeralStorageLimit = ephemeralStorageLimit;
                return this;
            }

            /**
             * EphemeralStorageRequest.
             */
            public Builder ephemeralStorageRequest(String ephemeralStorageRequest) {
                this.ephemeralStorageRequest = ephemeralStorageRequest;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * GroupType.
             */
            public Builder groupType(Integer groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * Labels.
             */
            public Builder labels(String labels) {
                this.labels = labels;
                return this;
            }

            /**
             * LastUpdateTime.
             */
            public Builder lastUpdateTime(Long lastUpdateTime) {
                this.lastUpdateTime = lastUpdateTime;
                return this;
            }

            /**
             * MemoryLimit.
             */
            public Builder memoryLimit(String memoryLimit) {
                this.memoryLimit = memoryLimit;
                return this;
            }

            /**
             * MemoryRequest.
             */
            public Builder memoryRequest(String memoryRequest) {
                this.memoryRequest = memoryRequest;
                return this;
            }

            /**
             * NameSpace.
             */
            public Builder nameSpace(String nameSpace) {
                this.nameSpace = nameSpace;
                return this;
            }

            /**
             * PackagePublicUrl.
             */
            public Builder packagePublicUrl(String packagePublicUrl) {
                this.packagePublicUrl = packagePublicUrl;
                return this;
            }

            /**
             * PackageUrl.
             */
            public Builder packageUrl(String packageUrl) {
                this.packageUrl = packageUrl;
                return this;
            }

            /**
             * PackageVersion.
             */
            public Builder packageVersion(String packageVersion) {
                this.packageVersion = packageVersion;
                return this;
            }

            /**
             * PackageVersionId.
             */
            public Builder packageVersionId(String packageVersionId) {
                this.packageVersionId = packageVersionId;
                return this;
            }

            /**
             * PostStart.
             */
            public Builder postStart(String postStart) {
                this.postStart = postStart;
                return this;
            }

            /**
             * PreStop.
             */
            public Builder preStop(String preStop) {
                this.preStop = preStop;
                return this;
            }

            /**
             * Reversion.
             */
            public Builder reversion(String reversion) {
                this.reversion = reversion;
                return this;
            }

            /**
             * Selector.
             */
            public Builder selector(String selector) {
                this.selector = selector;
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
             * Strategy.
             */
            public Builder strategy(String strategy) {
                this.strategy = strategy;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * VExtServerGroupId.
             */
            public Builder vExtServerGroupId(String vExtServerGroupId) {
                this.vExtServerGroupId = vExtServerGroupId;
                return this;
            }

            /**
             * VServerGroupId.
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
    /**
     * 
     * {@link ListDeployGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListDeployGroupResponseBody</p>
     */
    public static class DeployGroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeployGroup")
        private java.util.List<DeployGroup> deployGroup;

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
        public java.util.List<DeployGroup> getDeployGroup() {
            return this.deployGroup;
        }

        public static final class Builder {
            private java.util.List<DeployGroup> deployGroup; 

            private Builder() {
            } 

            private Builder(DeployGroupList model) {
                this.deployGroup = model.deployGroup;
            } 

            /**
             * DeployGroup.
             */
            public Builder deployGroup(java.util.List<DeployGroup> deployGroup) {
                this.deployGroup = deployGroup;
                return this;
            }

            public DeployGroupList build() {
                return new DeployGroupList(this);
            } 

        } 

    }
}
