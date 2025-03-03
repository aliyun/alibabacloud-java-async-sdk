// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link CreateFeatureConsistencyCheckJobConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateFeatureConsistencyCheckJobConfigRequest</p>
 */
public class CreateFeatureConsistencyCheckJobConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CompareFeature")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean compareFeature;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    private String datasetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasetMountPath")
    private String datasetMountPath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasetName")
    private String datasetName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasetType")
    private String datasetType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasetUri")
    private String datasetUri;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DefaultRoute")
    private String defaultRoute;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EasServiceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String easServiceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EasyRecPackagePath")
    private String easyRecPackagePath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EasyRecVersion")
    private String easyRecVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FeatureDisplayExclude")
    private String featureDisplayExclude;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FeatureLandingResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String featureLandingResourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FeaturePriority")
    private String featurePriority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FeatureStoreItemId")
    private String featureStoreItemId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FeatureStoreModelId")
    private String featureStoreModelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FeatureStoreProjectId")
    private String featureStoreProjectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FeatureStoreProjectName")
    private String featureStoreProjectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FeatureStoreSeqFeatureView")
    private String featureStoreSeqFeatureView;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FeatureStoreUserId")
    private String featureStoreUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FgJarVersion")
    private String fgJarVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FgJsonFileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fgJsonFileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GenerateZip")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean generateZip;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemIdField")
    private String itemIdField;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemTable")
    private String itemTable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemTablePartitionField")
    private String itemTablePartitionField;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemTablePartitionFieldFormat")
    private String itemTablePartitionFieldFormat;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OssResourceId")
    private String ossResourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PredictWorkerCount")
    private Integer predictWorkerCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PredictWorkerCpu")
    private Integer predictWorkerCpu;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PredictWorkerMemory")
    private Integer predictWorkerMemory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SampleRate")
    @com.aliyun.core.annotation.Validation(required = true)
    private Double sampleRate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SceneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SwitchId")
    private String switchId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UseFeatureStore")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean useFeatureStore;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserIdField")
    private String userIdField;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserTable")
    private String userTable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserTablePartitionField")
    private String userTablePartitionField;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserTablePartitionFieldFormat")
    private String userTablePartitionFieldFormat;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkflowName")
    private String workflowName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateFeatureConsistencyCheckJobConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.compareFeature = builder.compareFeature;
        this.datasetId = builder.datasetId;
        this.datasetMountPath = builder.datasetMountPath;
        this.datasetName = builder.datasetName;
        this.datasetType = builder.datasetType;
        this.datasetUri = builder.datasetUri;
        this.defaultRoute = builder.defaultRoute;
        this.easServiceName = builder.easServiceName;
        this.easyRecPackagePath = builder.easyRecPackagePath;
        this.easyRecVersion = builder.easyRecVersion;
        this.featureDisplayExclude = builder.featureDisplayExclude;
        this.featureLandingResourceId = builder.featureLandingResourceId;
        this.featurePriority = builder.featurePriority;
        this.featureStoreItemId = builder.featureStoreItemId;
        this.featureStoreModelId = builder.featureStoreModelId;
        this.featureStoreProjectId = builder.featureStoreProjectId;
        this.featureStoreProjectName = builder.featureStoreProjectName;
        this.featureStoreSeqFeatureView = builder.featureStoreSeqFeatureView;
        this.featureStoreUserId = builder.featureStoreUserId;
        this.fgJarVersion = builder.fgJarVersion;
        this.fgJsonFileName = builder.fgJsonFileName;
        this.generateZip = builder.generateZip;
        this.instanceId = builder.instanceId;
        this.itemIdField = builder.itemIdField;
        this.itemTable = builder.itemTable;
        this.itemTablePartitionField = builder.itemTablePartitionField;
        this.itemTablePartitionFieldFormat = builder.itemTablePartitionFieldFormat;
        this.name = builder.name;
        this.ossResourceId = builder.ossResourceId;
        this.predictWorkerCount = builder.predictWorkerCount;
        this.predictWorkerCpu = builder.predictWorkerCpu;
        this.predictWorkerMemory = builder.predictWorkerMemory;
        this.sampleRate = builder.sampleRate;
        this.sceneId = builder.sceneId;
        this.securityGroupId = builder.securityGroupId;
        this.serviceId = builder.serviceId;
        this.switchId = builder.switchId;
        this.useFeatureStore = builder.useFeatureStore;
        this.userIdField = builder.userIdField;
        this.userTable = builder.userTable;
        this.userTablePartitionField = builder.userTablePartitionField;
        this.userTablePartitionFieldFormat = builder.userTablePartitionFieldFormat;
        this.vpcId = builder.vpcId;
        this.workflowName = builder.workflowName;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFeatureConsistencyCheckJobConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return compareFeature
     */
    public Boolean getCompareFeature() {
        return this.compareFeature;
    }

    /**
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return datasetMountPath
     */
    public String getDatasetMountPath() {
        return this.datasetMountPath;
    }

    /**
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * @return datasetType
     */
    public String getDatasetType() {
        return this.datasetType;
    }

    /**
     * @return datasetUri
     */
    public String getDatasetUri() {
        return this.datasetUri;
    }

    /**
     * @return defaultRoute
     */
    public String getDefaultRoute() {
        return this.defaultRoute;
    }

    /**
     * @return easServiceName
     */
    public String getEasServiceName() {
        return this.easServiceName;
    }

    /**
     * @return easyRecPackagePath
     */
    public String getEasyRecPackagePath() {
        return this.easyRecPackagePath;
    }

    /**
     * @return easyRecVersion
     */
    public String getEasyRecVersion() {
        return this.easyRecVersion;
    }

    /**
     * @return featureDisplayExclude
     */
    public String getFeatureDisplayExclude() {
        return this.featureDisplayExclude;
    }

    /**
     * @return featureLandingResourceId
     */
    public String getFeatureLandingResourceId() {
        return this.featureLandingResourceId;
    }

    /**
     * @return featurePriority
     */
    public String getFeaturePriority() {
        return this.featurePriority;
    }

    /**
     * @return featureStoreItemId
     */
    public String getFeatureStoreItemId() {
        return this.featureStoreItemId;
    }

    /**
     * @return featureStoreModelId
     */
    public String getFeatureStoreModelId() {
        return this.featureStoreModelId;
    }

    /**
     * @return featureStoreProjectId
     */
    public String getFeatureStoreProjectId() {
        return this.featureStoreProjectId;
    }

    /**
     * @return featureStoreProjectName
     */
    public String getFeatureStoreProjectName() {
        return this.featureStoreProjectName;
    }

    /**
     * @return featureStoreSeqFeatureView
     */
    public String getFeatureStoreSeqFeatureView() {
        return this.featureStoreSeqFeatureView;
    }

    /**
     * @return featureStoreUserId
     */
    public String getFeatureStoreUserId() {
        return this.featureStoreUserId;
    }

    /**
     * @return fgJarVersion
     */
    public String getFgJarVersion() {
        return this.fgJarVersion;
    }

    /**
     * @return fgJsonFileName
     */
    public String getFgJsonFileName() {
        return this.fgJsonFileName;
    }

    /**
     * @return generateZip
     */
    public Boolean getGenerateZip() {
        return this.generateZip;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return itemIdField
     */
    public String getItemIdField() {
        return this.itemIdField;
    }

    /**
     * @return itemTable
     */
    public String getItemTable() {
        return this.itemTable;
    }

    /**
     * @return itemTablePartitionField
     */
    public String getItemTablePartitionField() {
        return this.itemTablePartitionField;
    }

    /**
     * @return itemTablePartitionFieldFormat
     */
    public String getItemTablePartitionFieldFormat() {
        return this.itemTablePartitionFieldFormat;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ossResourceId
     */
    public String getOssResourceId() {
        return this.ossResourceId;
    }

    /**
     * @return predictWorkerCount
     */
    public Integer getPredictWorkerCount() {
        return this.predictWorkerCount;
    }

    /**
     * @return predictWorkerCpu
     */
    public Integer getPredictWorkerCpu() {
        return this.predictWorkerCpu;
    }

    /**
     * @return predictWorkerMemory
     */
    public Integer getPredictWorkerMemory() {
        return this.predictWorkerMemory;
    }

    /**
     * @return sampleRate
     */
    public Double getSampleRate() {
        return this.sampleRate;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return switchId
     */
    public String getSwitchId() {
        return this.switchId;
    }

    /**
     * @return useFeatureStore
     */
    public Boolean getUseFeatureStore() {
        return this.useFeatureStore;
    }

    /**
     * @return userIdField
     */
    public String getUserIdField() {
        return this.userIdField;
    }

    /**
     * @return userTable
     */
    public String getUserTable() {
        return this.userTable;
    }

    /**
     * @return userTablePartitionField
     */
    public String getUserTablePartitionField() {
        return this.userTablePartitionField;
    }

    /**
     * @return userTablePartitionFieldFormat
     */
    public String getUserTablePartitionFieldFormat() {
        return this.userTablePartitionFieldFormat;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return workflowName
     */
    public String getWorkflowName() {
        return this.workflowName;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateFeatureConsistencyCheckJobConfigRequest, Builder> {
        private String regionId; 
        private Boolean compareFeature; 
        private String datasetId; 
        private String datasetMountPath; 
        private String datasetName; 
        private String datasetType; 
        private String datasetUri; 
        private String defaultRoute; 
        private String easServiceName; 
        private String easyRecPackagePath; 
        private String easyRecVersion; 
        private String featureDisplayExclude; 
        private String featureLandingResourceId; 
        private String featurePriority; 
        private String featureStoreItemId; 
        private String featureStoreModelId; 
        private String featureStoreProjectId; 
        private String featureStoreProjectName; 
        private String featureStoreSeqFeatureView; 
        private String featureStoreUserId; 
        private String fgJarVersion; 
        private String fgJsonFileName; 
        private Boolean generateZip; 
        private String instanceId; 
        private String itemIdField; 
        private String itemTable; 
        private String itemTablePartitionField; 
        private String itemTablePartitionFieldFormat; 
        private String name; 
        private String ossResourceId; 
        private Integer predictWorkerCount; 
        private Integer predictWorkerCpu; 
        private Integer predictWorkerMemory; 
        private Double sampleRate; 
        private String sceneId; 
        private String securityGroupId; 
        private String serviceId; 
        private String switchId; 
        private Boolean useFeatureStore; 
        private String userIdField; 
        private String userTable; 
        private String userTablePartitionField; 
        private String userTablePartitionFieldFormat; 
        private String vpcId; 
        private String workflowName; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateFeatureConsistencyCheckJobConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.compareFeature = request.compareFeature;
            this.datasetId = request.datasetId;
            this.datasetMountPath = request.datasetMountPath;
            this.datasetName = request.datasetName;
            this.datasetType = request.datasetType;
            this.datasetUri = request.datasetUri;
            this.defaultRoute = request.defaultRoute;
            this.easServiceName = request.easServiceName;
            this.easyRecPackagePath = request.easyRecPackagePath;
            this.easyRecVersion = request.easyRecVersion;
            this.featureDisplayExclude = request.featureDisplayExclude;
            this.featureLandingResourceId = request.featureLandingResourceId;
            this.featurePriority = request.featurePriority;
            this.featureStoreItemId = request.featureStoreItemId;
            this.featureStoreModelId = request.featureStoreModelId;
            this.featureStoreProjectId = request.featureStoreProjectId;
            this.featureStoreProjectName = request.featureStoreProjectName;
            this.featureStoreSeqFeatureView = request.featureStoreSeqFeatureView;
            this.featureStoreUserId = request.featureStoreUserId;
            this.fgJarVersion = request.fgJarVersion;
            this.fgJsonFileName = request.fgJsonFileName;
            this.generateZip = request.generateZip;
            this.instanceId = request.instanceId;
            this.itemIdField = request.itemIdField;
            this.itemTable = request.itemTable;
            this.itemTablePartitionField = request.itemTablePartitionField;
            this.itemTablePartitionFieldFormat = request.itemTablePartitionFieldFormat;
            this.name = request.name;
            this.ossResourceId = request.ossResourceId;
            this.predictWorkerCount = request.predictWorkerCount;
            this.predictWorkerCpu = request.predictWorkerCpu;
            this.predictWorkerMemory = request.predictWorkerMemory;
            this.sampleRate = request.sampleRate;
            this.sceneId = request.sceneId;
            this.securityGroupId = request.securityGroupId;
            this.serviceId = request.serviceId;
            this.switchId = request.switchId;
            this.useFeatureStore = request.useFeatureStore;
            this.userIdField = request.userIdField;
            this.userTable = request.userTable;
            this.userTablePartitionField = request.userTablePartitionField;
            this.userTablePartitionFieldFormat = request.userTablePartitionFieldFormat;
            this.vpcId = request.vpcId;
            this.workflowName = request.workflowName;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder compareFeature(Boolean compareFeature) {
            this.putBodyParameter("CompareFeature", compareFeature);
            this.compareFeature = compareFeature;
            return this;
        }

        /**
         * DatasetId.
         */
        public Builder datasetId(String datasetId) {
            this.putBodyParameter("DatasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * DatasetMountPath.
         */
        public Builder datasetMountPath(String datasetMountPath) {
            this.putBodyParameter("DatasetMountPath", datasetMountPath);
            this.datasetMountPath = datasetMountPath;
            return this;
        }

        /**
         * DatasetName.
         */
        public Builder datasetName(String datasetName) {
            this.putBodyParameter("DatasetName", datasetName);
            this.datasetName = datasetName;
            return this;
        }

        /**
         * DatasetType.
         */
        public Builder datasetType(String datasetType) {
            this.putBodyParameter("DatasetType", datasetType);
            this.datasetType = datasetType;
            return this;
        }

        /**
         * DatasetUri.
         */
        public Builder datasetUri(String datasetUri) {
            this.putBodyParameter("DatasetUri", datasetUri);
            this.datasetUri = datasetUri;
            return this;
        }

        /**
         * DefaultRoute.
         */
        public Builder defaultRoute(String defaultRoute) {
            this.putBodyParameter("DefaultRoute", defaultRoute);
            this.defaultRoute = defaultRoute;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>service_123</p>
         */
        public Builder easServiceName(String easServiceName) {
            this.putBodyParameter("EasServiceName", easServiceName);
            this.easServiceName = easServiceName;
            return this;
        }

        /**
         * EasyRecPackagePath.
         */
        public Builder easyRecPackagePath(String easyRecPackagePath) {
            this.putBodyParameter("EasyRecPackagePath", easyRecPackagePath);
            this.easyRecPackagePath = easyRecPackagePath;
            return this;
        }

        /**
         * EasyRecVersion.
         */
        public Builder easyRecVersion(String easyRecVersion) {
            this.putBodyParameter("EasyRecVersion", easyRecVersion);
            this.easyRecVersion = easyRecVersion;
            return this;
        }

        /**
         * FeatureDisplayExclude.
         */
        public Builder featureDisplayExclude(String featureDisplayExclude) {
            this.putBodyParameter("FeatureDisplayExclude", featureDisplayExclude);
            this.featureDisplayExclude = featureDisplayExclude;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>reso-********</p>
         */
        public Builder featureLandingResourceId(String featureLandingResourceId) {
            this.putBodyParameter("FeatureLandingResourceId", featureLandingResourceId);
            this.featureLandingResourceId = featureLandingResourceId;
            return this;
        }

        /**
         * FeaturePriority.
         */
        public Builder featurePriority(String featurePriority) {
            this.putBodyParameter("FeaturePriority", featurePriority);
            this.featurePriority = featurePriority;
            return this;
        }

        /**
         * FeatureStoreItemId.
         */
        public Builder featureStoreItemId(String featureStoreItemId) {
            this.putBodyParameter("FeatureStoreItemId", featureStoreItemId);
            this.featureStoreItemId = featureStoreItemId;
            return this;
        }

        /**
         * FeatureStoreModelId.
         */
        public Builder featureStoreModelId(String featureStoreModelId) {
            this.putBodyParameter("FeatureStoreModelId", featureStoreModelId);
            this.featureStoreModelId = featureStoreModelId;
            return this;
        }

        /**
         * FeatureStoreProjectId.
         */
        public Builder featureStoreProjectId(String featureStoreProjectId) {
            this.putBodyParameter("FeatureStoreProjectId", featureStoreProjectId);
            this.featureStoreProjectId = featureStoreProjectId;
            return this;
        }

        /**
         * FeatureStoreProjectName.
         */
        public Builder featureStoreProjectName(String featureStoreProjectName) {
            this.putBodyParameter("FeatureStoreProjectName", featureStoreProjectName);
            this.featureStoreProjectName = featureStoreProjectName;
            return this;
        }

        /**
         * FeatureStoreSeqFeatureView.
         */
        public Builder featureStoreSeqFeatureView(String featureStoreSeqFeatureView) {
            this.putBodyParameter("FeatureStoreSeqFeatureView", featureStoreSeqFeatureView);
            this.featureStoreSeqFeatureView = featureStoreSeqFeatureView;
            return this;
        }

        /**
         * FeatureStoreUserId.
         */
        public Builder featureStoreUserId(String featureStoreUserId) {
            this.putBodyParameter("FeatureStoreUserId", featureStoreUserId);
            this.featureStoreUserId = featureStoreUserId;
            return this;
        }

        /**
         * FgJarVersion.
         */
        public Builder fgJarVersion(String fgJarVersion) {
            this.putBodyParameter("FgJarVersion", fgJarVersion);
            this.fgJarVersion = fgJarVersion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>file.json</p>
         */
        public Builder fgJsonFileName(String fgJsonFileName) {
            this.putBodyParameter("FgJsonFileName", fgJsonFileName);
            this.fgJsonFileName = fgJsonFileName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder generateZip(Boolean generateZip) {
            this.putBodyParameter("GenerateZip", generateZip);
            this.generateZip = generateZip;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pairec-cn-********</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ItemIdField.
         */
        public Builder itemIdField(String itemIdField) {
            this.putBodyParameter("ItemIdField", itemIdField);
            this.itemIdField = itemIdField;
            return this;
        }

        /**
         * ItemTable.
         */
        public Builder itemTable(String itemTable) {
            this.putBodyParameter("ItemTable", itemTable);
            this.itemTable = itemTable;
            return this;
        }

        /**
         * ItemTablePartitionField.
         */
        public Builder itemTablePartitionField(String itemTablePartitionField) {
            this.putBodyParameter("ItemTablePartitionField", itemTablePartitionField);
            this.itemTablePartitionField = itemTablePartitionField;
            return this;
        }

        /**
         * ItemTablePartitionFieldFormat.
         */
        public Builder itemTablePartitionFieldFormat(String itemTablePartitionFieldFormat) {
            this.putBodyParameter("ItemTablePartitionFieldFormat", itemTablePartitionFieldFormat);
            this.itemTablePartitionFieldFormat = itemTablePartitionFieldFormat;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>feature_consistency_check1</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OssResourceId.
         */
        public Builder ossResourceId(String ossResourceId) {
            this.putBodyParameter("OssResourceId", ossResourceId);
            this.ossResourceId = ossResourceId;
            return this;
        }

        /**
         * PredictWorkerCount.
         */
        public Builder predictWorkerCount(Integer predictWorkerCount) {
            this.putBodyParameter("PredictWorkerCount", predictWorkerCount);
            this.predictWorkerCount = predictWorkerCount;
            return this;
        }

        /**
         * PredictWorkerCpu.
         */
        public Builder predictWorkerCpu(Integer predictWorkerCpu) {
            this.putBodyParameter("PredictWorkerCpu", predictWorkerCpu);
            this.predictWorkerCpu = predictWorkerCpu;
            return this;
        }

        /**
         * PredictWorkerMemory.
         */
        public Builder predictWorkerMemory(Integer predictWorkerMemory) {
            this.putBodyParameter("PredictWorkerMemory", predictWorkerMemory);
            this.predictWorkerMemory = predictWorkerMemory;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.89</p>
         */
        public Builder sampleRate(Double sampleRate) {
            this.putBodyParameter("SampleRate", sampleRate);
            this.sampleRate = sampleRate;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder sceneId(String sceneId) {
            this.putBodyParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * SecurityGroupId.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putBodyParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder serviceId(String serviceId) {
            this.putBodyParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * SwitchId.
         */
        public Builder switchId(String switchId) {
            this.putBodyParameter("SwitchId", switchId);
            this.switchId = switchId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder useFeatureStore(Boolean useFeatureStore) {
            this.putBodyParameter("UseFeatureStore", useFeatureStore);
            this.useFeatureStore = useFeatureStore;
            return this;
        }

        /**
         * UserIdField.
         */
        public Builder userIdField(String userIdField) {
            this.putBodyParameter("UserIdField", userIdField);
            this.userIdField = userIdField;
            return this;
        }

        /**
         * UserTable.
         */
        public Builder userTable(String userTable) {
            this.putBodyParameter("UserTable", userTable);
            this.userTable = userTable;
            return this;
        }

        /**
         * UserTablePartitionField.
         */
        public Builder userTablePartitionField(String userTablePartitionField) {
            this.putBodyParameter("UserTablePartitionField", userTablePartitionField);
            this.userTablePartitionField = userTablePartitionField;
            return this;
        }

        /**
         * UserTablePartitionFieldFormat.
         */
        public Builder userTablePartitionFieldFormat(String userTablePartitionFieldFormat) {
            this.putBodyParameter("UserTablePartitionFieldFormat", userTablePartitionFieldFormat);
            this.userTablePartitionFieldFormat = userTablePartitionFieldFormat;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * WorkflowName.
         */
        public Builder workflowName(String workflowName) {
            this.putBodyParameter("WorkflowName", workflowName);
            this.workflowName = workflowName;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateFeatureConsistencyCheckJobConfigRequest build() {
            return new CreateFeatureConsistencyCheckJobConfigRequest(this);
        } 

    } 

}
