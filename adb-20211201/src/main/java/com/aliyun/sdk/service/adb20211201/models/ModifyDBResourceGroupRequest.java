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
 * {@link ModifyDBResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBResourceGroupRequest</p>
 */
public class ModifyDBResourceGroupRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("EngineParams")
    private java.util.Map<String, ?> engineParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GpuElasticPlan")
    private GpuElasticPlan gpuElasticPlan;

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
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetResourceGroupName")
    private String targetResourceGroupName;

    private ModifyDBResourceGroupRequest(Builder builder) {
        super(builder);
        this.autoStopInterval = builder.autoStopInterval;
        this.clusterMode = builder.clusterMode;
        this.clusterSizeResource = builder.clusterSizeResource;
        this.DBClusterId = builder.DBClusterId;
        this.enableSpot = builder.enableSpot;
        this.engineParams = builder.engineParams;
        this.gpuElasticPlan = builder.gpuElasticPlan;
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
        this.status = builder.status;
        this.targetResourceGroupName = builder.targetResourceGroupName;
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
     * @return engineParams
     */
    public java.util.Map<String, ?> getEngineParams() {
        return this.engineParams;
    }

    /**
     * @return gpuElasticPlan
     */
    public GpuElasticPlan getGpuElasticPlan() {
        return this.gpuElasticPlan;
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

    public static final class Builder extends Request.Builder<ModifyDBResourceGroupRequest, Builder> {
        private String autoStopInterval; 
        private String clusterMode; 
        private String clusterSizeResource; 
        private String DBClusterId; 
        private Boolean enableSpot; 
        private java.util.Map<String, ?> engineParams; 
        private GpuElasticPlan gpuElasticPlan; 
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
        private String status; 
        private String targetResourceGroupName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBResourceGroupRequest request) {
            super(request);
            this.autoStopInterval = request.autoStopInterval;
            this.clusterMode = request.clusterMode;
            this.clusterSizeResource = request.clusterSizeResource;
            this.DBClusterId = request.DBClusterId;
            this.enableSpot = request.enableSpot;
            this.engineParams = request.engineParams;
            this.gpuElasticPlan = request.gpuElasticPlan;
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
            this.status = request.status;
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
         * <p>amv-bp1r053byu48p****</p>
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
         * <p>true</p>
         */
        public Builder enableSpot(Boolean enableSpot) {
            this.putQueryParameter("EnableSpot", enableSpot);
            this.enableSpot = enableSpot;
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
         * GpuElasticPlan.
         */
        public Builder gpuElasticPlan(GpuElasticPlan gpuElasticPlan) {
            String gpuElasticPlanShrink = shrink(gpuElasticPlan, "GpuElasticPlan", "json");
            this.putQueryParameter("GpuElasticPlan", gpuElasticPlanShrink);
            this.gpuElasticPlan = gpuElasticPlan;
            return this;
        }

        /**
         * <p>The name of the resource group.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/459446.html">DescribeDBResourceGroup</a> operation to query the name of a resource group in a cluster.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
         * <p>For information about resource groups of Data Lakehouse Edition, see <a href="https://help.aliyun.com/document_detail/428610.html">Resource groups</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Interactive</p>
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
         * <p>The maximum amount of reserved computing resources.</p>
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
         * MaxGpuQuantity.
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
         * <p>The minimum amount of reserved computing resources.</p>
         * <ul>
         * <li>If the GroupType parameter is set to Interactive, set the value to 16ACU.</li>
         * <li>If GroupType is set to Job, set the value to 0ACU.</li>
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
         * MinGpuQuantity.
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
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/454314.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * SpecName.
         */
        public Builder specName(String specName) {
            this.putQueryParameter("SpecName", specName);
            this.specName = specName;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * TargetResourceGroupName.
         */
        public Builder targetResourceGroupName(String targetResourceGroupName) {
            this.putQueryParameter("TargetResourceGroupName", targetResourceGroupName);
            this.targetResourceGroupName = targetResourceGroupName;
            return this;
        }

        @Override
        public ModifyDBResourceGroupRequest build() {
            return new ModifyDBResourceGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyDBResourceGroupRequest} extends {@link TeaModel}
     *
     * <p>ModifyDBResourceGroupRequest</p>
     */
    public static class GpuElasticPlanRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndCronExpression")
        private String endCronExpression;

        @com.aliyun.core.annotation.NameInMap("StartCronExpression")
        private String startCronExpression;

        private GpuElasticPlanRules(Builder builder) {
            this.endCronExpression = builder.endCronExpression;
            this.startCronExpression = builder.startCronExpression;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GpuElasticPlanRules create() {
            return builder().build();
        }

        /**
         * @return endCronExpression
         */
        public String getEndCronExpression() {
            return this.endCronExpression;
        }

        /**
         * @return startCronExpression
         */
        public String getStartCronExpression() {
            return this.startCronExpression;
        }

        public static final class Builder {
            private String endCronExpression; 
            private String startCronExpression; 

            private Builder() {
            } 

            private Builder(GpuElasticPlanRules model) {
                this.endCronExpression = model.endCronExpression;
                this.startCronExpression = model.startCronExpression;
            } 

            /**
             * EndCronExpression.
             */
            public Builder endCronExpression(String endCronExpression) {
                this.endCronExpression = endCronExpression;
                return this;
            }

            /**
             * StartCronExpression.
             */
            public Builder startCronExpression(String startCronExpression) {
                this.startCronExpression = startCronExpression;
                return this;
            }

            public GpuElasticPlanRules build() {
                return new GpuElasticPlanRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyDBResourceGroupRequest} extends {@link TeaModel}
     *
     * <p>ModifyDBResourceGroupRequest</p>
     */
    public static class GpuElasticPlan extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List<GpuElasticPlanRules> rules;

        private GpuElasticPlan(Builder builder) {
            this.enabled = builder.enabled;
            this.rules = builder.rules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GpuElasticPlan create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return rules
         */
        public java.util.List<GpuElasticPlanRules> getRules() {
            return this.rules;
        }

        public static final class Builder {
            private Boolean enabled; 
            private java.util.List<GpuElasticPlanRules> rules; 

            private Builder() {
            } 

            private Builder(GpuElasticPlan model) {
                this.enabled = model.enabled;
                this.rules = model.rules;
            } 

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The job resubmission rules.</p>
             */
            public Builder rules(java.util.List<GpuElasticPlanRules> rules) {
                this.rules = rules;
                return this;
            }

            public GpuElasticPlan build() {
                return new GpuElasticPlan(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyDBResourceGroupRequest} extends {@link TeaModel}
     *
     * <p>ModifyDBResourceGroupRequest</p>
     */
    public static class ImageSelector extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("InferenceEngine")
        private String inferenceEngine;

        @com.aliyun.core.annotation.NameInMap("LlmModel")
        private String llmModel;

        private ImageSelector(Builder builder) {
            this.image = builder.image;
            this.inferenceEngine = builder.inferenceEngine;
            this.llmModel = builder.llmModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageSelector create() {
            return builder().build();
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return inferenceEngine
         */
        public String getInferenceEngine() {
            return this.inferenceEngine;
        }

        /**
         * @return llmModel
         */
        public String getLlmModel() {
            return this.llmModel;
        }

        public static final class Builder {
            private String image; 
            private String inferenceEngine; 
            private String llmModel; 

            private Builder() {
            } 

            private Builder(ImageSelector model) {
                this.image = model.image;
                this.inferenceEngine = model.inferenceEngine;
                this.llmModel = model.llmModel;
            } 

            /**
             * Image.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * InferenceEngine.
             */
            public Builder inferenceEngine(String inferenceEngine) {
                this.inferenceEngine = inferenceEngine;
                return this;
            }

            /**
             * LlmModel.
             */
            public Builder llmModel(String llmModel) {
                this.llmModel = llmModel;
                return this;
            }

            public ImageSelector build() {
                return new ImageSelector(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyDBResourceGroupRequest} extends {@link TeaModel}
     *
     * <p>ModifyDBResourceGroupRequest</p>
     */
    public static class AppConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppType")
        private String appType;

        @com.aliyun.core.annotation.NameInMap("ImageSelector")
        private ImageSelector imageSelector;

        private AppConfig(Builder builder) {
            this.appName = builder.appName;
            this.appType = builder.appType;
            this.imageSelector = builder.imageSelector;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppConfig create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return appType
         */
        public String getAppType() {
            return this.appType;
        }

        /**
         * @return imageSelector
         */
        public ImageSelector getImageSelector() {
            return this.imageSelector;
        }

        public static final class Builder {
            private String appName; 
            private String appType; 
            private ImageSelector imageSelector; 

            private Builder() {
            } 

            private Builder(AppConfig model) {
                this.appName = model.appName;
                this.appType = model.appType;
                this.imageSelector = model.imageSelector;
            } 

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * AppType.
             */
            public Builder appType(String appType) {
                this.appType = appType;
                return this;
            }

            /**
             * ImageSelector.
             */
            public Builder imageSelector(ImageSelector imageSelector) {
                this.imageSelector = imageSelector;
                return this;
            }

            public AppConfig build() {
                return new AppConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyDBResourceGroupRequest} extends {@link TeaModel}
     *
     * <p>ModifyDBResourceGroupRequest</p>
     */
    public static class StorageMounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("StorageId")
        private Long storageId;

        private StorageMounts(Builder builder) {
            this.mountPath = builder.mountPath;
            this.storageId = builder.storageId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageMounts create() {
            return builder().build();
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return storageId
         */
        public Long getStorageId() {
            return this.storageId;
        }

        public static final class Builder {
            private String mountPath; 
            private Long storageId; 

            private Builder() {
            } 

            private Builder(StorageMounts model) {
                this.mountPath = model.mountPath;
                this.storageId = model.storageId;
            } 

            /**
             * MountPath.
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * StorageId.
             */
            public Builder storageId(Long storageId) {
                this.storageId = storageId;
                return this;
            }

            public StorageMounts build() {
                return new StorageMounts(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyDBResourceGroupRequest} extends {@link TeaModel}
     *
     * <p>ModifyDBResourceGroupRequest</p>
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
             * <blockquote>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/459446.html">DescribeDBResourceGroup</a> operation to query the name of a resource group in a cluster.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
     * {@link ModifyDBResourceGroupRequest} extends {@link TeaModel}
     *
     * <p>ModifyDBResourceGroupRequest</p>
     */
    public static class RayConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppConfig")
        private AppConfig appConfig;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("EnableUserEni")
        private Boolean enableUserEni;

        @com.aliyun.core.annotation.NameInMap("HeadAllocateUnit")
        private String headAllocateUnit;

        @com.aliyun.core.annotation.NameInMap("HeadDiskCapacity")
        private String headDiskCapacity;

        @com.aliyun.core.annotation.NameInMap("HeadSpec")
        private String headSpec;

        @com.aliyun.core.annotation.NameInMap("HeadSpecType")
        private String headSpecType;

        @com.aliyun.core.annotation.NameInMap("StorageMounts")
        private java.util.List<StorageMounts> storageMounts;

        @com.aliyun.core.annotation.NameInMap("WorkerGroups")
        private java.util.List<WorkerGroups> workerGroups;

        private RayConfig(Builder builder) {
            this.appConfig = builder.appConfig;
            this.category = builder.category;
            this.enableUserEni = builder.enableUserEni;
            this.headAllocateUnit = builder.headAllocateUnit;
            this.headDiskCapacity = builder.headDiskCapacity;
            this.headSpec = builder.headSpec;
            this.headSpecType = builder.headSpecType;
            this.storageMounts = builder.storageMounts;
            this.workerGroups = builder.workerGroups;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RayConfig create() {
            return builder().build();
        }

        /**
         * @return appConfig
         */
        public AppConfig getAppConfig() {
            return this.appConfig;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return enableUserEni
         */
        public Boolean getEnableUserEni() {
            return this.enableUserEni;
        }

        /**
         * @return headAllocateUnit
         */
        public String getHeadAllocateUnit() {
            return this.headAllocateUnit;
        }

        /**
         * @return headDiskCapacity
         */
        public String getHeadDiskCapacity() {
            return this.headDiskCapacity;
        }

        /**
         * @return headSpec
         */
        public String getHeadSpec() {
            return this.headSpec;
        }

        /**
         * @return headSpecType
         */
        public String getHeadSpecType() {
            return this.headSpecType;
        }

        /**
         * @return storageMounts
         */
        public java.util.List<StorageMounts> getStorageMounts() {
            return this.storageMounts;
        }

        /**
         * @return workerGroups
         */
        public java.util.List<WorkerGroups> getWorkerGroups() {
            return this.workerGroups;
        }

        public static final class Builder {
            private AppConfig appConfig; 
            private String category; 
            private Boolean enableUserEni; 
            private String headAllocateUnit; 
            private String headDiskCapacity; 
            private String headSpec; 
            private String headSpecType; 
            private java.util.List<StorageMounts> storageMounts; 
            private java.util.List<WorkerGroups> workerGroups; 

            private Builder() {
            } 

            private Builder(RayConfig model) {
                this.appConfig = model.appConfig;
                this.category = model.category;
                this.enableUserEni = model.enableUserEni;
                this.headAllocateUnit = model.headAllocateUnit;
                this.headDiskCapacity = model.headDiskCapacity;
                this.headSpec = model.headSpec;
                this.headSpecType = model.headSpecType;
                this.storageMounts = model.storageMounts;
                this.workerGroups = model.workerGroups;
            } 

            /**
             * AppConfig.
             */
            public Builder appConfig(AppConfig appConfig) {
                this.appConfig = appConfig;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * EnableUserEni.
             */
            public Builder enableUserEni(Boolean enableUserEni) {
                this.enableUserEni = enableUserEni;
                return this;
            }

            /**
             * HeadAllocateUnit.
             */
            public Builder headAllocateUnit(String headAllocateUnit) {
                this.headAllocateUnit = headAllocateUnit;
                return this;
            }

            /**
             * HeadDiskCapacity.
             */
            public Builder headDiskCapacity(String headDiskCapacity) {
                this.headDiskCapacity = headDiskCapacity;
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
             * HeadSpecType.
             */
            public Builder headSpecType(String headSpecType) {
                this.headSpecType = headSpecType;
                return this;
            }

            /**
             * StorageMounts.
             */
            public Builder storageMounts(java.util.List<StorageMounts> storageMounts) {
                this.storageMounts = storageMounts;
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
     * {@link ModifyDBResourceGroupRequest} extends {@link TeaModel}
     *
     * <p>ModifyDBResourceGroupRequest</p>
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
}
