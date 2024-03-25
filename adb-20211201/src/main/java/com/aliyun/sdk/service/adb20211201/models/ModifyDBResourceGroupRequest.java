// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBResourceGroupRequest</p>
 */
public class ModifyDBResourceGroupRequest extends Request {
    @Query
    @NameInMap("ClusterMode")
    private String clusterMode;

    @Query
    @NameInMap("ClusterSizeResource")
    private String clusterSizeResource;

    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("EnableSpot")
    private Boolean enableSpot;

    @Query
    @NameInMap("GroupName")
    @Validation(required = true)
    private String groupName;

    @Query
    @NameInMap("GroupType")
    @Validation(required = true)
    private String groupType;

    @Query
    @NameInMap("MaxClusterCount")
    private Integer maxClusterCount;

    @Query
    @NameInMap("MaxComputeResource")
    private String maxComputeResource;

    @Query
    @NameInMap("MinClusterCount")
    private Integer minClusterCount;

    @Query
    @NameInMap("MinComputeResource")
    private String minComputeResource;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Rules")
    private java.util.List < Rules> rules;

    private ModifyDBResourceGroupRequest(Builder builder) {
        super(builder);
        this.clusterMode = builder.clusterMode;
        this.clusterSizeResource = builder.clusterSizeResource;
        this.DBClusterId = builder.DBClusterId;
        this.enableSpot = builder.enableSpot;
        this.groupName = builder.groupName;
        this.groupType = builder.groupType;
        this.maxClusterCount = builder.maxClusterCount;
        this.maxComputeResource = builder.maxComputeResource;
        this.minClusterCount = builder.minClusterCount;
        this.minComputeResource = builder.minComputeResource;
        this.regionId = builder.regionId;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBResourceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return rules
     */
    public java.util.List < Rules> getRules() {
        return this.rules;
    }

    public static final class Builder extends Request.Builder<ModifyDBResourceGroupRequest, Builder> {
        private String clusterMode; 
        private String clusterSizeResource; 
        private String DBClusterId; 
        private Boolean enableSpot; 
        private String groupName; 
        private String groupType; 
        private Integer maxClusterCount; 
        private String maxComputeResource; 
        private Integer minClusterCount; 
        private String minComputeResource; 
        private String regionId; 
        private java.util.List < Rules> rules; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBResourceGroupRequest request) {
            super(request);
            this.clusterMode = request.clusterMode;
            this.clusterSizeResource = request.clusterSizeResource;
            this.DBClusterId = request.DBClusterId;
            this.enableSpot = request.enableSpot;
            this.groupName = request.groupName;
            this.groupType = request.groupType;
            this.maxClusterCount = request.maxClusterCount;
            this.maxComputeResource = request.maxComputeResource;
            this.minClusterCount = request.minClusterCount;
            this.minComputeResource = request.minComputeResource;
            this.regionId = request.regionId;
            this.rules = request.rules;
        } 

        /**
         * A reserved parameter.
         */
        public Builder clusterMode(String clusterMode) {
            this.putQueryParameter("ClusterMode", clusterMode);
            this.clusterMode = clusterMode;
            return this;
        }

        /**
         * A reserved parameter.
         */
        public Builder clusterSizeResource(String clusterSizeResource) {
            this.putQueryParameter("ClusterSizeResource", clusterSizeResource);
            this.clusterSizeResource = clusterSizeResource;
            return this;
        }

        /**
         * The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * Specifies whether to enable the preemptible instance feature for the resource group. This feature can be enabled only for job resource groups. Valid values:
         * <p>
         * 
         * *   **True**
         * *   **False**
         */
        public Builder enableSpot(Boolean enableSpot) {
            this.putQueryParameter("EnableSpot", enableSpot);
            this.enableSpot = enableSpot;
            return this;
        }

        /**
         * The name of the resource group.
         * <p>
         * 
         * > You can call the [DescribeDBResourceGroup](~~459446~~) operation to query the name of a resource group in a cluster.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * The type of the resource group. Valid values:
         * <p>
         * 
         * *   **Interactive**
         * *   **Job**
         * 
         * > For information about resource groups of Data Lakehouse Edition, see [Resource groups](~~428610~~).
         */
        public Builder groupType(String groupType) {
            this.putQueryParameter("GroupType", groupType);
            this.groupType = groupType;
            return this;
        }

        /**
         * A reserved parameter.
         */
        public Builder maxClusterCount(Integer maxClusterCount) {
            this.putQueryParameter("MaxClusterCount", maxClusterCount);
            this.maxClusterCount = maxClusterCount;
            return this;
        }

        /**
         * The maximum amount of reserved computing resources. Unit: ACU.
         * <p>
         * 
         * *   If GroupType is set to Interactive, the maximum amount of reserved computing resources refers to the amount of resources that are not allocated in the cluster. Set this parameter to a value in increments of 16 ACUs.
         * *   If GroupType is set to Job, the maximum amount of reserved computing resources refers to the amount of resources that are not allocated in the cluster. Set this parameter to a value in increments of 8 ACUs.
         */
        public Builder maxComputeResource(String maxComputeResource) {
            this.putQueryParameter("MaxComputeResource", maxComputeResource);
            this.maxComputeResource = maxComputeResource;
            return this;
        }

        /**
         * A reserved parameter.
         */
        public Builder minClusterCount(Integer minClusterCount) {
            this.putQueryParameter("MinClusterCount", minClusterCount);
            this.minClusterCount = minClusterCount;
            return this;
        }

        /**
         * The minimum amount of reserved computing resources. Unit: AnalyticDB compute units (ACUs).
         * <p>
         * 
         * *   If the GroupType parameter is set to Interactive, set the value to 16ACU.
         * *   If GroupType is set to Job, set the value to 0ACU.
         */
        public Builder minComputeResource(String minComputeResource) {
            this.putQueryParameter("MinComputeResource", minComputeResource);
            this.minComputeResource = minComputeResource;
            return this;
        }

        /**
         * The region ID of the cluster.
         * <p>
         * 
         * >  You can call the [DescribeRegions](~~454314~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Rules.
         */
        public Builder rules(java.util.List < Rules> rules) {
            String rulesShrink = shrink(rules, "Rules", "json");
            this.putQueryParameter("Rules", rulesShrink);
            this.rules = rules;
            return this;
        }

        @Override
        public ModifyDBResourceGroupRequest build() {
            return new ModifyDBResourceGroupRequest(this);
        } 

    } 

    public static class Rules extends TeaModel {
        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("QueryTime")
        private String queryTime;

        @NameInMap("TargetGroupName")
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

            /**
             * The name of the resource group.
             * <p>
             * 
             * > You can call the [DescribeDBResourceGroup](~~459446~~) operation to query the name of a resource group in a cluster.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * QueryTime.
             */
            public Builder queryTime(String queryTime) {
                this.queryTime = queryTime;
                return this;
            }

            /**
             * TargetGroupName.
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
