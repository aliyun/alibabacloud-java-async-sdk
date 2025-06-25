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
 * {@link CreateDBResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateDBResourceGroupRequest</p>
 */
public class CreateDBResourceGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoStopInterval")
    private String autoStopInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterMode")
    private String clusterMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterSizeResource")
    private String clusterSizeResource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableSpot")
    private Boolean enableSpot;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineParams")
    private java.util.Map<String, ?> engineParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxClusterCount")
    private Integer maxClusterCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxComputeResource")
    private String maxComputeResource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxGpuQuantity")
    private Integer maxGpuQuantity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinClusterCount")
    private Integer minClusterCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinComputeResource")
    private String minComputeResource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinGpuQuantity")
    private Integer minGpuQuantity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RayConfig")
    private RayConfig rayConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List<Rules> rules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpecName")
    private String specName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetResourceGroupName")
    private String targetResourceGroupName;

    private CreateDBResourceGroupRequest(Builder builder) {
        super(builder);
        this.autoStopInterval = builder.autoStopInterval;
        this.clusterMode = builder.clusterMode;
        this.clusterSizeResource = builder.clusterSizeResource;
        this.DBClusterId = builder.DBClusterId;
        this.enableSpot = builder.enableSpot;
        this.engine = builder.engine;
        this.engineParams = builder.engineParams;
        this.groupName = builder.groupName;
        this.groupType = builder.groupType;
        this.maxClusterCount = builder.maxClusterCount;
        this.maxComputeResource = builder.maxComputeResource;
        this.maxGpuQuantity = builder.maxGpuQuantity;
        this.minClusterCount = builder.minClusterCount;
        this.minComputeResource = builder.minComputeResource;
        this.minGpuQuantity = builder.minGpuQuantity;
        this.rayConfig = builder.rayConfig;
        this.regionId = builder.regionId;
        this.rules = builder.rules;
        this.specName = builder.specName;
        this.targetResourceGroupName = builder.targetResourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBResourceGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return enableSpot
     */
    public Boolean getEnableSpot() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return rules
     */
    public java.util.List<Rules> getRules() {
        return this.rules;
    }

    /**
     * @return specName
     */
    public String getSpecName() {
        return this.specName;
    }

    /**
     * @return targetResourceGroupName
     */
    public String getTargetResourceGroupName() {
        return this.targetResourceGroupName;
    }

    public static final class Builder extends Request.Builder<CreateDBResourceGroupRequest, Builder> {
        private String autoStopInterval; 
        private String clusterMode; 
        private String clusterSizeResource; 
        private String DBClusterId; 
        private Boolean enableSpot; 
        private String engine; 
        private java.util.Map<String, ?> engineParams; 
        private String groupName; 
        private String groupType; 
        private Integer maxClusterCount; 
        private String maxComputeResource; 
        private Integer maxGpuQuantity; 
        private Integer minClusterCount; 
        private String minComputeResource; 
        private Integer minGpuQuantity; 
        private RayConfig rayConfig; 
        private String regionId; 
        private java.util.List<Rules> rules; 
        private String specName; 
        private String targetResourceGroupName; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBResourceGroupRequest request) {
            super(request);
            this.autoStopInterval = request.autoStopInterval;
            this.clusterMode = request.clusterMode;
            this.clusterSizeResource = request.clusterSizeResource;
            this.DBClusterId = request.DBClusterId;
            this.enableSpot = request.enableSpot;
            this.engine = request.engine;
            this.engineParams = request.engineParams;
            this.groupName = request.groupName;
            this.groupType = request.groupType;
            this.maxClusterCount = request.maxClusterCount;
            this.maxComputeResource = request.maxComputeResource;
            this.maxGpuQuantity = request.maxGpuQuantity;
            this.minClusterCount = request.minClusterCount;
            this.minComputeResource = request.minComputeResource;
            this.minGpuQuantity = request.minGpuQuantity;
            this.rayConfig = request.rayConfig;
            this.regionId = request.regionId;
            this.rules = request.rules;
            this.specName = request.specName;
            this.targetResourceGroupName = request.targetResourceGroupName;
        } 

        /**
         * AutoStopInterval.
         */
        public Builder autoStopInterval(String autoStopInterval) {
            this.putQueryParameter("AutoStopInterval", autoStopInterval);
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
            this.putQueryParameter("ClusterMode", clusterMode);
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
            this.putQueryParameter("ClusterSizeResource", clusterSizeResource);
            this.clusterSizeResource = clusterSizeResource;
            return this;
        }

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp11q28kvl688****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the spot instance feature for the resource group. After you enable the spot instance feature, you are charged for resources at a lower unit price but the resources are probably released. You can enable the spot instance feature only for job resource groups. Valid values:</p>
         * <ul>
         * <li><strong>True</strong></li>
         * <li><strong>False</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder enableSpot(Boolean enableSpot) {
            this.putQueryParameter("EnableSpot", enableSpot);
            this.enableSpot = enableSpot;
            return this;
        }

        /**
         * Engine.
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * EngineParams.
         */
        public Builder engineParams(java.util.Map<String, ?> engineParams) {
            String engineParamsShrink = shrink(engineParams, "EngineParams", "json");
            this.putQueryParameter("EngineParams", engineParamsShrink);
            this.engineParams = engineParams;
            return this;
        }

        /**
         * <p>The name of the resource group.</p>
         * <ul>
         * <li>The name can be up to 255 characters in length.</li>
         * <li>The name must start with a letter or a digit.</li>
         * <li>The name can contain letters, digits, hyphens (<em>), and underscores (</em>).</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_group</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
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
         * <p> For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/428610.html">Resource group overview</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Job</p>
         */
        public Builder groupType(String groupType) {
            this.putQueryParameter("GroupType", groupType);
            this.groupType = groupType;
            return this;
        }

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        public Builder maxClusterCount(Integer maxClusterCount) {
            this.putQueryParameter("MaxClusterCount", maxClusterCount);
            this.maxClusterCount = maxClusterCount;
            return this;
        }

        /**
         * <p>The maximum reserved computing resources.</p>
         * <ul>
         * <li>If GroupType is set to Interactive, the maximum amount of reserved computing resources refers to the amount of resources that are not allocated in the cluster. Set this parameter to a value in increments of 16ACU.</li>
         * <li>If GroupType is set to Job, the maximum amount of reserved computing resources refers to the amount of resources that are not allocated in the cluster. Set this parameter to a value in increments of 8ACU.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>48ACU</p>
         */
        public Builder maxComputeResource(String maxComputeResource) {
            this.putQueryParameter("MaxComputeResource", maxComputeResource);
            this.maxComputeResource = maxComputeResource;
            return this;
        }

        /**
         * <p>A reserved parameter.</p>
         */
        public Builder maxGpuQuantity(Integer maxGpuQuantity) {
            this.putQueryParameter("MaxGpuQuantity", maxGpuQuantity);
            this.maxGpuQuantity = maxGpuQuantity;
            return this;
        }

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        public Builder minClusterCount(Integer minClusterCount) {
            this.putQueryParameter("MinClusterCount", minClusterCount);
            this.minClusterCount = minClusterCount;
            return this;
        }

        /**
         * <p>The minimum reserved computing resources.</p>
         * <ul>
         * <li>When GroupType is set to Interactive, set this parameter to 16ACU.</li>
         * <li>When GroupType is set to Job, set this parameter to 0ACU.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0ACU</p>
         */
        public Builder minComputeResource(String minComputeResource) {
            this.putQueryParameter("MinComputeResource", minComputeResource);
            this.minComputeResource = minComputeResource;
            return this;
        }

        /**
         * <p>A reserved parameter.</p>
         */
        public Builder minGpuQuantity(Integer minGpuQuantity) {
            this.putQueryParameter("MinGpuQuantity", minGpuQuantity);
            this.minGpuQuantity = minGpuQuantity;
            return this;
        }

        /**
         * RayConfig.
         */
        public Builder rayConfig(RayConfig rayConfig) {
            String rayConfigShrink = shrink(rayConfig, "RayConfig", "json");
            this.putQueryParameter("RayConfig", rayConfigShrink);
            this.rayConfig = rayConfig;
            return this;
        }

        /**
         * <p>The region ID of the cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/612393.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The job resubmission rules.</p>
         */
        public Builder rules(java.util.List<Rules> rules) {
            String rulesShrink = shrink(rules, "Rules", "json");
            this.putQueryParameter("Rules", rulesShrink);
            this.rules = rules;
            return this;
        }

        /**
         * <p>A reserved parameter.</p>
         */
        public Builder specName(String specName) {
            this.putQueryParameter("SpecName", specName);
            this.specName = specName;
            return this;
        }

        /**
         * <p>A reserved parameter.</p>
         */
        public Builder targetResourceGroupName(String targetResourceGroupName) {
            this.putQueryParameter("TargetResourceGroupName", targetResourceGroupName);
            this.targetResourceGroupName = targetResourceGroupName;
            return this;
        }

        @Override
        public CreateDBResourceGroupRequest build() {
            return new CreateDBResourceGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDBResourceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateDBResourceGroupRequest</p>
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
             * <p>The name of the resource group.</p>
             * <ul>
             * <li>The name can be up to 255 characters in length.</li>
             * <li>The name must start with a letter or a digit.</li>
             * <li>The name can contain letters, digits, hyphens (<em>), and underscores (</em>).</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test_group</p>
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
     * {@link CreateDBResourceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateDBResourceGroupRequest</p>
     */
    public static class RayConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("HeadSpec")
        private String headSpec;

        @com.aliyun.core.annotation.NameInMap("WorkerGroups")
        private java.util.List<WorkerGroups> workerGroups;

        private RayConfig(Builder builder) {
            this.category = builder.category;
            this.headSpec = builder.headSpec;
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
         * @return workerGroups
         */
        public java.util.List<WorkerGroups> getWorkerGroups() {
            return this.workerGroups;
        }

        public static final class Builder {
            private String category; 
            private String headSpec; 
            private java.util.List<WorkerGroups> workerGroups; 

            private Builder() {
            } 

            private Builder(RayConfig model) {
                this.category = model.category;
                this.headSpec = model.headSpec;
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
     * {@link CreateDBResourceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateDBResourceGroupRequest</p>
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
             * <ul>
             * <li>The name can be up to 255 characters in length.</li>
             * <li>The name must start with a letter or digit.</li>
             * <li>The name can contain letters, digits, hyphens (-), and underscores (_).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>test_group</p>
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
             * <p>The name of the resource group to which you want to resubmit the query job.</p>
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
}
