// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeDBResourceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBResourceGroupResponseBody</p>
 */
public class DescribeDBResourceGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GroupsInfo")
    private java.util.List<GroupsInfo> groupsInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBResourceGroupResponseBody(Builder builder) {
        this.groupsInfo = builder.groupsInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBResourceGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupsInfo
     */
    public java.util.List<GroupsInfo> getGroupsInfo() {
        return this.groupsInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<GroupsInfo> groupsInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDBResourceGroupResponseBody model) {
            this.groupsInfo = model.groupsInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The queried resource groups.</p>
         */
        public Builder groupsInfo(java.util.List<GroupsInfo> groupsInfo) {
            this.groupsInfo = groupsInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A94B6C02-7BD4-5D67-9776-3AC8317E8DD3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBResourceGroupResponseBody build() {
            return new DescribeDBResourceGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBResourceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBResourceGroupResponseBody</p>
     */
    public static class WorkerGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocateUnit")
        private String allocateUnit;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("MaxWorkerQuantity")
        private Integer maxWorkerQuantity;

        @com.aliyun.core.annotation.NameInMap("MinWorkerQuantity")
        private Integer minWorkerQuantity;

        @com.aliyun.core.annotation.NameInMap("WorkerDiskCapacity")
        private String workerDiskCapacity;

        @com.aliyun.core.annotation.NameInMap("WorkerSpecName")
        private String workerSpecName;

        @com.aliyun.core.annotation.NameInMap("WorkerSpecType")
        private String workerSpecType;

        private WorkerGroups(Builder builder) {
            this.allocateUnit = builder.allocateUnit;
            this.groupName = builder.groupName;
            this.maxWorkerQuantity = builder.maxWorkerQuantity;
            this.minWorkerQuantity = builder.minWorkerQuantity;
            this.workerDiskCapacity = builder.workerDiskCapacity;
            this.workerSpecName = builder.workerSpecName;
            this.workerSpecType = builder.workerSpecType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkerGroups create() {
            return builder().build();
        }

        /**
         * @return allocateUnit
         */
        public String getAllocateUnit() {
            return this.allocateUnit;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return maxWorkerQuantity
         */
        public Integer getMaxWorkerQuantity() {
            return this.maxWorkerQuantity;
        }

        /**
         * @return minWorkerQuantity
         */
        public Integer getMinWorkerQuantity() {
            return this.minWorkerQuantity;
        }

        /**
         * @return workerDiskCapacity
         */
        public String getWorkerDiskCapacity() {
            return this.workerDiskCapacity;
        }

        /**
         * @return workerSpecName
         */
        public String getWorkerSpecName() {
            return this.workerSpecName;
        }

        /**
         * @return workerSpecType
         */
        public String getWorkerSpecType() {
            return this.workerSpecType;
        }

        public static final class Builder {
            private String allocateUnit; 
            private String groupName; 
            private Integer maxWorkerQuantity; 
            private Integer minWorkerQuantity; 
            private String workerDiskCapacity; 
            private String workerSpecName; 
            private String workerSpecType; 

            private Builder() {
            } 

            private Builder(WorkerGroups model) {
                this.allocateUnit = model.allocateUnit;
                this.groupName = model.groupName;
                this.maxWorkerQuantity = model.maxWorkerQuantity;
                this.minWorkerQuantity = model.minWorkerQuantity;
                this.workerDiskCapacity = model.workerDiskCapacity;
                this.workerSpecName = model.workerSpecName;
                this.workerSpecType = model.workerSpecType;
            } 

            /**
             * AllocateUnit.
             */
            public Builder allocateUnit(String allocateUnit) {
                this.allocateUnit = allocateUnit;
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
             * MaxWorkerQuantity.
             */
            public Builder maxWorkerQuantity(Integer maxWorkerQuantity) {
                this.maxWorkerQuantity = maxWorkerQuantity;
                return this;
            }

            /**
             * MinWorkerQuantity.
             */
            public Builder minWorkerQuantity(Integer minWorkerQuantity) {
                this.minWorkerQuantity = minWorkerQuantity;
                return this;
            }

            /**
             * WorkerDiskCapacity.
             */
            public Builder workerDiskCapacity(String workerDiskCapacity) {
                this.workerDiskCapacity = workerDiskCapacity;
                return this;
            }

            /**
             * WorkerSpecName.
             */
            public Builder workerSpecName(String workerSpecName) {
                this.workerSpecName = workerSpecName;
                return this;
            }

            /**
             * WorkerSpecType.
             */
            public Builder workerSpecType(String workerSpecType) {
                this.workerSpecType = workerSpecType;
                return this;
            }

            public WorkerGroups build() {
                return new WorkerGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBResourceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBResourceGroupResponseBody</p>
     */
    public static class RayConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("HeadSpec")
        private String headSpec;

        @com.aliyun.core.annotation.NameInMap("RayClusterAddress")
        private String rayClusterAddress;

        @com.aliyun.core.annotation.NameInMap("RayDashboardAddress")
        private String rayDashboardAddress;

        @com.aliyun.core.annotation.NameInMap("RayGrafanaAddress")
        private String rayGrafanaAddress;

        @com.aliyun.core.annotation.NameInMap("WorkerGroups")
        private java.util.List<WorkerGroups> workerGroups;

        private RayConfig(Builder builder) {
            this.category = builder.category;
            this.headSpec = builder.headSpec;
            this.rayClusterAddress = builder.rayClusterAddress;
            this.rayDashboardAddress = builder.rayDashboardAddress;
            this.rayGrafanaAddress = builder.rayGrafanaAddress;
            this.workerGroups = builder.workerGroups;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RayConfig create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return headSpec
         */
        public String getHeadSpec() {
            return this.headSpec;
        }

        /**
         * @return rayClusterAddress
         */
        public String getRayClusterAddress() {
            return this.rayClusterAddress;
        }

        /**
         * @return rayDashboardAddress
         */
        public String getRayDashboardAddress() {
            return this.rayDashboardAddress;
        }

        /**
         * @return rayGrafanaAddress
         */
        public String getRayGrafanaAddress() {
            return this.rayGrafanaAddress;
        }

        /**
         * @return workerGroups
         */
        public java.util.List<WorkerGroups> getWorkerGroups() {
            return this.workerGroups;
        }

        public static final class Builder {
            private String category; 
            private String headSpec; 
            private String rayClusterAddress; 
            private String rayDashboardAddress; 
            private String rayGrafanaAddress; 
            private java.util.List<WorkerGroups> workerGroups; 

            private Builder() {
            } 

            private Builder(RayConfig model) {
                this.category = model.category;
                this.headSpec = model.headSpec;
                this.rayClusterAddress = model.rayClusterAddress;
                this.rayDashboardAddress = model.rayDashboardAddress;
                this.rayGrafanaAddress = model.rayGrafanaAddress;
                this.workerGroups = model.workerGroups;
            } 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * HeadSpec.
             */
            public Builder headSpec(String headSpec) {
                this.headSpec = headSpec;
                return this;
            }

            /**
             * RayClusterAddress.
             */
            public Builder rayClusterAddress(String rayClusterAddress) {
                this.rayClusterAddress = rayClusterAddress;
                return this;
            }

            /**
             * RayDashboardAddress.
             */
            public Builder rayDashboardAddress(String rayDashboardAddress) {
                this.rayDashboardAddress = rayDashboardAddress;
                return this;
            }

            /**
             * RayGrafanaAddress.
             */
            public Builder rayGrafanaAddress(String rayGrafanaAddress) {
                this.rayGrafanaAddress = rayGrafanaAddress;
                return this;
            }

            /**
             * WorkerGroups.
             */
            public Builder workerGroups(java.util.List<WorkerGroups> workerGroups) {
                this.workerGroups = workerGroups;
                return this;
            }

            public RayConfig build() {
                return new RayConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBResourceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBResourceGroupResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("QueryTime")
        private String queryTime;

        @com.aliyun.core.annotation.NameInMap("TargetGroupName")
        private String targetGroupName;

        private Rules(Builder builder) {
            this.groupName = builder.groupName;
            this.queryTime = builder.queryTime;
            this.targetGroupName = builder.targetGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return queryTime
         */
        public String getQueryTime() {
            return this.queryTime;
        }

        /**
         * @return targetGroupName
         */
        public String getTargetGroupName() {
            return this.targetGroupName;
        }

        public static final class Builder {
            private String groupName; 
            private String queryTime; 
            private String targetGroupName; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.groupName = model.groupName;
                this.queryTime = model.queryTime;
                this.targetGroupName = model.targetGroupName;
            } 

            /**
             * <p>The name of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>user_default</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The execution duration of the query. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>180000</p>
             */
            public Builder queryTime(String queryTime) {
                this.queryTime = queryTime;
                return this;
            }

            /**
             * <p>The name of the destination resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>job</p>
             */
            public Builder targetGroupName(String targetGroupName) {
                this.targetGroupName = targetGroupName;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBResourceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBResourceGroupResponseBody</p>
     */
    public static class GroupsInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoStopInterval")
        private String autoStopInterval;

        @com.aliyun.core.annotation.NameInMap("ClusterMode")
        private String clusterMode;

        @com.aliyun.core.annotation.NameInMap("ClusterSizeResource")
        private String clusterSizeResource;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ElasticMinComputeResource")
        private String elasticMinComputeResource;

        @com.aliyun.core.annotation.NameInMap("EnableSpot")
        private String enableSpot;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineParams")
        private java.util.Map<String, ?> engineParams;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("GroupType")
        private String groupType;

        @com.aliyun.core.annotation.NameInMap("GroupUsers")
        private String groupUsers;

        @com.aliyun.core.annotation.NameInMap("MaxClusterCount")
        private Integer maxClusterCount;

        @com.aliyun.core.annotation.NameInMap("MaxComputeResource")
        private String maxComputeResource;

        @com.aliyun.core.annotation.NameInMap("MaxGpuQuantity")
        private Integer maxGpuQuantity;

        @com.aliyun.core.annotation.NameInMap("Message")
        @com.aliyun.core.annotation.Validation(required = true)
        private String message;

        @com.aliyun.core.annotation.NameInMap("MinClusterCount")
        private Integer minClusterCount;

        @com.aliyun.core.annotation.NameInMap("MinComputeResource")
        private String minComputeResource;

        @com.aliyun.core.annotation.NameInMap("MinGpuQuantity")
        private Integer minGpuQuantity;

        @com.aliyun.core.annotation.NameInMap("RayConfig")
        private RayConfig rayConfig;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List<Rules> rules;

        @com.aliyun.core.annotation.NameInMap("RunningClusterCount")
        private Integer runningClusterCount;

        @com.aliyun.core.annotation.NameInMap("SpecName")
        private String specName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TargetResourceGroupName")
        private String targetResourceGroupName;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private GroupsInfo(Builder builder) {
            this.autoStopInterval = builder.autoStopInterval;
            this.clusterMode = builder.clusterMode;
            this.clusterSizeResource = builder.clusterSizeResource;
            this.createTime = builder.createTime;
            this.elasticMinComputeResource = builder.elasticMinComputeResource;
            this.enableSpot = builder.enableSpot;
            this.engine = builder.engine;
            this.engineParams = builder.engineParams;
            this.groupName = builder.groupName;
            this.groupType = builder.groupType;
            this.groupUsers = builder.groupUsers;
            this.maxClusterCount = builder.maxClusterCount;
            this.maxComputeResource = builder.maxComputeResource;
            this.maxGpuQuantity = builder.maxGpuQuantity;
            this.message = builder.message;
            this.minClusterCount = builder.minClusterCount;
            this.minComputeResource = builder.minComputeResource;
            this.minGpuQuantity = builder.minGpuQuantity;
            this.rayConfig = builder.rayConfig;
            this.rules = builder.rules;
            this.runningClusterCount = builder.runningClusterCount;
            this.specName = builder.specName;
            this.status = builder.status;
            this.targetResourceGroupName = builder.targetResourceGroupName;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupsInfo create() {
            return builder().build();
        }

        /**
         * @return autoStopInterval
         */
        public String getAutoStopInterval() {
            return this.autoStopInterval;
        }

        /**
         * @return clusterMode
         */
        public String getClusterMode() {
            return this.clusterMode;
        }

        /**
         * @return clusterSizeResource
         */
        public String getClusterSizeResource() {
            return this.clusterSizeResource;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return elasticMinComputeResource
         */
        public String getElasticMinComputeResource() {
            return this.elasticMinComputeResource;
        }

        /**
         * @return enableSpot
         */
        public String getEnableSpot() {
            return this.enableSpot;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return engineParams
         */
        public java.util.Map<String, ?> getEngineParams() {
            return this.engineParams;
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
        public String getGroupType() {
            return this.groupType;
        }

        /**
         * @return groupUsers
         */
        public String getGroupUsers() {
            return this.groupUsers;
        }

        /**
         * @return maxClusterCount
         */
        public Integer getMaxClusterCount() {
            return this.maxClusterCount;
        }

        /**
         * @return maxComputeResource
         */
        public String getMaxComputeResource() {
            return this.maxComputeResource;
        }

        /**
         * @return maxGpuQuantity
         */
        public Integer getMaxGpuQuantity() {
            return this.maxGpuQuantity;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return minClusterCount
         */
        public Integer getMinClusterCount() {
            return this.minClusterCount;
        }

        /**
         * @return minComputeResource
         */
        public String getMinComputeResource() {
            return this.minComputeResource;
        }

        /**
         * @return minGpuQuantity
         */
        public Integer getMinGpuQuantity() {
            return this.minGpuQuantity;
        }

        /**
         * @return rayConfig
         */
        public RayConfig getRayConfig() {
            return this.rayConfig;
        }

        /**
         * @return rules
         */
        public java.util.List<Rules> getRules() {
            return this.rules;
        }

        /**
         * @return runningClusterCount
         */
        public Integer getRunningClusterCount() {
            return this.runningClusterCount;
        }

        /**
         * @return specName
         */
        public String getSpecName() {
            return this.specName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return targetResourceGroupName
         */
        public String getTargetResourceGroupName() {
            return this.targetResourceGroupName;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String autoStopInterval; 
            private String clusterMode; 
            private String clusterSizeResource; 
            private String createTime; 
            private String elasticMinComputeResource; 
            private String enableSpot; 
            private String engine; 
            private java.util.Map<String, ?> engineParams; 
            private String groupName; 
            private String groupType; 
            private String groupUsers; 
            private Integer maxClusterCount; 
            private String maxComputeResource; 
            private Integer maxGpuQuantity; 
            private String message; 
            private Integer minClusterCount; 
            private String minComputeResource; 
            private Integer minGpuQuantity; 
            private RayConfig rayConfig; 
            private java.util.List<Rules> rules; 
            private Integer runningClusterCount; 
            private String specName; 
            private String status; 
            private String targetResourceGroupName; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(GroupsInfo model) {
                this.autoStopInterval = model.autoStopInterval;
                this.clusterMode = model.clusterMode;
                this.clusterSizeResource = model.clusterSizeResource;
                this.createTime = model.createTime;
                this.elasticMinComputeResource = model.elasticMinComputeResource;
                this.enableSpot = model.enableSpot;
                this.engine = model.engine;
                this.engineParams = model.engineParams;
                this.groupName = model.groupName;
                this.groupType = model.groupType;
                this.groupUsers = model.groupUsers;
                this.maxClusterCount = model.maxClusterCount;
                this.maxComputeResource = model.maxComputeResource;
                this.maxGpuQuantity = model.maxGpuQuantity;
                this.message = model.message;
                this.minClusterCount = model.minClusterCount;
                this.minComputeResource = model.minComputeResource;
                this.minGpuQuantity = model.minGpuQuantity;
                this.rayConfig = model.rayConfig;
                this.rules = model.rules;
                this.runningClusterCount = model.runningClusterCount;
                this.specName = model.specName;
                this.status = model.status;
                this.targetResourceGroupName = model.targetResourceGroupName;
                this.updateTime = model.updateTime;
            } 

            /**
             * AutoStopInterval.
             */
            public Builder autoStopInterval(String autoStopInterval) {
                this.autoStopInterval = autoStopInterval;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>N/A</p>
             */
            public Builder clusterMode(String clusterMode) {
                this.clusterMode = clusterMode;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>N/A</p>
             */
            public Builder clusterSizeResource(String clusterSizeResource) {
                this.clusterSizeResource = clusterSizeResource;
                return this;
            }

            /**
             * <p>The time when the resource group was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-29T03:34:30Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The minimum amount of elastic computing resources.</p>
             * 
             * <strong>example:</strong>
             * <p>16ACU</p>
             */
            public Builder elasticMinComputeResource(String elasticMinComputeResource) {
                this.elasticMinComputeResource = elasticMinComputeResource;
                return this;
            }

            /**
             * <p>Indicates whether the preemptible instance feature is enabled for the resource group. After the preemptible instance feature is enabled, you are charged for resources at a lower unit price but the resources are probably released. Valid values:</p>
             * <ul>
             * <li><strong>True</strong></li>
             * <li><strong>False</strong></li>
             * </ul>
             * <p>The True value is returned only for job resource groups.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder enableSpot(String enableSpot) {
                this.enableSpot = enableSpot;
                return this;
            }

            /**
             * Engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * EngineParams.
             */
            public Builder engineParams(java.util.Map<String, ?> engineParams) {
                this.engineParams = engineParams;
                return this;
            }

            /**
             * <p>The name of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>test1</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The type of the resource group. Valid values:</p>
             * <ul>
             * <li><strong>Interactive</strong></li>
             * <li><strong>Job</strong></li>
             * </ul>
             * <blockquote>
             * <p> For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/428610.html">Resource groups</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Job</p>
             */
            public Builder groupType(String groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * <p>The Resource Access Management (RAM) user that is associated with the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>testb,testc</p>
             */
            public Builder groupUsers(String groupUsers) {
                this.groupUsers = groupUsers;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>N/A</p>
             */
            public Builder maxClusterCount(Integer maxClusterCount) {
                this.maxClusterCount = maxClusterCount;
                return this;
            }

            /**
             * <p>The maximum amount of reserved computing resources.</p>
             * 
             * <strong>example:</strong>
             * <p>512ACU</p>
             */
            public Builder maxComputeResource(String maxComputeResource) {
                this.maxComputeResource = maxComputeResource;
                return this;
            }

            /**
             * MaxGpuQuantity.
             */
            public Builder maxGpuQuantity(Integer maxGpuQuantity) {
                this.maxGpuQuantity = maxGpuQuantity;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>N/A</p>
             */
            public Builder minClusterCount(Integer minClusterCount) {
                this.minClusterCount = minClusterCount;
                return this;
            }

            /**
             * <p>The minimum amount of reserved computing resources.</p>
             * 
             * <strong>example:</strong>
             * <p>0ACU</p>
             */
            public Builder minComputeResource(String minComputeResource) {
                this.minComputeResource = minComputeResource;
                return this;
            }

            /**
             * MinGpuQuantity.
             */
            public Builder minGpuQuantity(Integer minGpuQuantity) {
                this.minGpuQuantity = minGpuQuantity;
                return this;
            }

            /**
             * RayConfig.
             */
            public Builder rayConfig(RayConfig rayConfig) {
                this.rayConfig = rayConfig;
                return this;
            }

            /**
             * <p>The job resubmission rules.</p>
             */
            public Builder rules(java.util.List<Rules> rules) {
                this.rules = rules;
                return this;
            }

            /**
             * <p>A reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>N/A</p>
             */
            public Builder runningClusterCount(Integer runningClusterCount) {
                this.runningClusterCount = runningClusterCount;
                return this;
            }

            /**
             * SpecName.
             */
            public Builder specName(String specName) {
                this.specName = specName;
                return this;
            }

            /**
             * <p>The status of the resource group. Valid values:</p>
             * <ul>
             * <li><strong>creating</strong>: The resource group is being created.</li>
             * <li><strong>ok</strong>: The resource group is created.</li>
             * <li><strong>pendingdelete</strong>: The resource group is pending to be deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ok</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TargetResourceGroupName.
             */
            public Builder targetResourceGroupName(String targetResourceGroupName) {
                this.targetResourceGroupName = targetResourceGroupName;
                return this;
            }

            /**
             * <p>The time when the resource group was updated. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-31T03:34:30Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public GroupsInfo build() {
                return new GroupsInfo(this);
            } 

        } 

    }
}
