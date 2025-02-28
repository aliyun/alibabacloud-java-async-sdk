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
 * {@link GetFeatureConsistencyCheckJobConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetFeatureConsistencyCheckJobConfigResponseBody</p>
 */
public class GetFeatureConsistencyCheckJobConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CompareFeature")
    private Boolean compareFeature;

    @com.aliyun.core.annotation.NameInMap("DatasetId")
    private String datasetId;

    @com.aliyun.core.annotation.NameInMap("DatasetMountPath")
    private String datasetMountPath;

    @com.aliyun.core.annotation.NameInMap("DatasetName")
    private String datasetName;

    @com.aliyun.core.annotation.NameInMap("DatasetType")
    private String datasetType;

    @com.aliyun.core.annotation.NameInMap("DatasetUri")
    private String datasetUri;

    @com.aliyun.core.annotation.NameInMap("DefaultRoute")
    private String defaultRoute;

    @com.aliyun.core.annotation.NameInMap("EasServiceName")
    private String easServiceName;

    @com.aliyun.core.annotation.NameInMap("EasyRecPackagePath")
    private String easyRecPackagePath;

    @com.aliyun.core.annotation.NameInMap("EasyRecVersion")
    private String easyRecVersion;

    @com.aliyun.core.annotation.NameInMap("FeatureDisplayExclude")
    private String featureDisplayExclude;

    @com.aliyun.core.annotation.NameInMap("FeatureLandingResourceId")
    private String featureLandingResourceId;

    @com.aliyun.core.annotation.NameInMap("FeatureLandingResourceUri")
    private String featureLandingResourceUri;

    @com.aliyun.core.annotation.NameInMap("FeaturePriority")
    private String featurePriority;

    @com.aliyun.core.annotation.NameInMap("FeatureStoreItemId")
    private String featureStoreItemId;

    @com.aliyun.core.annotation.NameInMap("FeatureStoreModelId")
    private String featureStoreModelId;

    @com.aliyun.core.annotation.NameInMap("FeatureStoreProjectId")
    private String featureStoreProjectId;

    @com.aliyun.core.annotation.NameInMap("FeatureStoreProjectName")
    private String featureStoreProjectName;

    @com.aliyun.core.annotation.NameInMap("FeatureStoreSeqFeatureView")
    private String featureStoreSeqFeatureView;

    @com.aliyun.core.annotation.NameInMap("FeatureStoreUserId")
    private String featureStoreUserId;

    @com.aliyun.core.annotation.NameInMap("FgJarVersion")
    private String fgJarVersion;

    @com.aliyun.core.annotation.NameInMap("FgJsonFileName")
    private String fgJsonFileName;

    @com.aliyun.core.annotation.NameInMap("GenerateZip")
    private Boolean generateZip;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("ItemIdField")
    private String itemIdField;

    @com.aliyun.core.annotation.NameInMap("ItemTable")
    private String itemTable;

    @com.aliyun.core.annotation.NameInMap("ItemTablePartitionField")
    private String itemTablePartitionField;

    @com.aliyun.core.annotation.NameInMap("ItemTablePartitionFieldFormat")
    private String itemTablePartitionFieldFormat;

    @com.aliyun.core.annotation.NameInMap("LatestJobGmtSamplingEndTime")
    private String latestJobGmtSamplingEndTime;

    @com.aliyun.core.annotation.NameInMap("LatestJobGmtSamplingStartTime")
    private String latestJobGmtSamplingStartTime;

    @com.aliyun.core.annotation.NameInMap("LatestJobId")
    private String latestJobId;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("OssBucket")
    private String ossBucket;

    @com.aliyun.core.annotation.NameInMap("OssResourceId")
    private String ossResourceId;

    @com.aliyun.core.annotation.NameInMap("PredictWorkerCount")
    private Integer predictWorkerCount;

    @com.aliyun.core.annotation.NameInMap("PredictWorkerCpu")
    private Integer predictWorkerCpu;

    @com.aliyun.core.annotation.NameInMap("PredictWorkerMemory")
    private Integer predictWorkerMemory;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SampleRate")
    private String sampleRate;

    @com.aliyun.core.annotation.NameInMap("SceneId")
    private String sceneId;

    @com.aliyun.core.annotation.NameInMap("SceneName")
    private String sceneName;

    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SwitchId")
    private String switchId;

    @com.aliyun.core.annotation.NameInMap("UseFeatureStore")
    private Boolean useFeatureStore;

    @com.aliyun.core.annotation.NameInMap("UserIdField")
    private String userIdField;

    @com.aliyun.core.annotation.NameInMap("UserTable")
    private String userTable;

    @com.aliyun.core.annotation.NameInMap("UserTablePartitionField")
    private String userTablePartitionField;

    @com.aliyun.core.annotation.NameInMap("UserTablePartitionFieldFormat")
    private String userTablePartitionFieldFormat;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.NameInMap("WorkflowName")
    private String workflowName;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private GetFeatureConsistencyCheckJobConfigResponseBody(Builder builder) {
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
        this.featureLandingResourceUri = builder.featureLandingResourceUri;
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
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.itemIdField = builder.itemIdField;
        this.itemTable = builder.itemTable;
        this.itemTablePartitionField = builder.itemTablePartitionField;
        this.itemTablePartitionFieldFormat = builder.itemTablePartitionFieldFormat;
        this.latestJobGmtSamplingEndTime = builder.latestJobGmtSamplingEndTime;
        this.latestJobGmtSamplingStartTime = builder.latestJobGmtSamplingStartTime;
        this.latestJobId = builder.latestJobId;
        this.name = builder.name;
        this.ossBucket = builder.ossBucket;
        this.ossResourceId = builder.ossResourceId;
        this.predictWorkerCount = builder.predictWorkerCount;
        this.predictWorkerCpu = builder.predictWorkerCpu;
        this.predictWorkerMemory = builder.predictWorkerMemory;
        this.requestId = builder.requestId;
        this.sampleRate = builder.sampleRate;
        this.sceneId = builder.sceneId;
        this.sceneName = builder.sceneName;
        this.securityGroupId = builder.securityGroupId;
        this.serviceId = builder.serviceId;
        this.serviceName = builder.serviceName;
        this.status = builder.status;
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

    public static GetFeatureConsistencyCheckJobConfigResponseBody create() {
        return builder().build();
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
     * @return featureLandingResourceUri
     */
    public String getFeatureLandingResourceUri() {
        return this.featureLandingResourceUri;
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
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
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
     * @return latestJobGmtSamplingEndTime
     */
    public String getLatestJobGmtSamplingEndTime() {
        return this.latestJobGmtSamplingEndTime;
    }

    /**
     * @return latestJobGmtSamplingStartTime
     */
    public String getLatestJobGmtSamplingStartTime() {
        return this.latestJobGmtSamplingStartTime;
    }

    /**
     * @return latestJobId
     */
    public String getLatestJobId() {
        return this.latestJobId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ossBucket
     */
    public String getOssBucket() {
        return this.ossBucket;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sampleRate
     */
    public String getSampleRate() {
        return this.sampleRate;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * @return sceneName
     */
    public String getSceneName() {
        return this.sceneName;
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
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
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

    public static final class Builder {
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
        private String featureLandingResourceUri; 
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
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private String itemIdField; 
        private String itemTable; 
        private String itemTablePartitionField; 
        private String itemTablePartitionFieldFormat; 
        private String latestJobGmtSamplingEndTime; 
        private String latestJobGmtSamplingStartTime; 
        private String latestJobId; 
        private String name; 
        private String ossBucket; 
        private String ossResourceId; 
        private Integer predictWorkerCount; 
        private Integer predictWorkerCpu; 
        private Integer predictWorkerMemory; 
        private String requestId; 
        private String sampleRate; 
        private String sceneId; 
        private String sceneName; 
        private String securityGroupId; 
        private String serviceId; 
        private String serviceName; 
        private String status; 
        private String switchId; 
        private Boolean useFeatureStore; 
        private String userIdField; 
        private String userTable; 
        private String userTablePartitionField; 
        private String userTablePartitionFieldFormat; 
        private String vpcId; 
        private String workflowName; 
        private String workspaceId; 

        /**
         * CompareFeature.
         */
        public Builder compareFeature(Boolean compareFeature) {
            this.compareFeature = compareFeature;
            return this;
        }

        /**
         * DatasetId.
         */
        public Builder datasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }

        /**
         * DatasetMountPath.
         */
        public Builder datasetMountPath(String datasetMountPath) {
            this.datasetMountPath = datasetMountPath;
            return this;
        }

        /**
         * DatasetName.
         */
        public Builder datasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }

        /**
         * DatasetType.
         */
        public Builder datasetType(String datasetType) {
            this.datasetType = datasetType;
            return this;
        }

        /**
         * DatasetUri.
         */
        public Builder datasetUri(String datasetUri) {
            this.datasetUri = datasetUri;
            return this;
        }

        /**
         * DefaultRoute.
         */
        public Builder defaultRoute(String defaultRoute) {
            this.defaultRoute = defaultRoute;
            return this;
        }

        /**
         * EasServiceName.
         */
        public Builder easServiceName(String easServiceName) {
            this.easServiceName = easServiceName;
            return this;
        }

        /**
         * EasyRecPackagePath.
         */
        public Builder easyRecPackagePath(String easyRecPackagePath) {
            this.easyRecPackagePath = easyRecPackagePath;
            return this;
        }

        /**
         * EasyRecVersion.
         */
        public Builder easyRecVersion(String easyRecVersion) {
            this.easyRecVersion = easyRecVersion;
            return this;
        }

        /**
         * FeatureDisplayExclude.
         */
        public Builder featureDisplayExclude(String featureDisplayExclude) {
            this.featureDisplayExclude = featureDisplayExclude;
            return this;
        }

        /**
         * FeatureLandingResourceId.
         */
        public Builder featureLandingResourceId(String featureLandingResourceId) {
            this.featureLandingResourceId = featureLandingResourceId;
            return this;
        }

        /**
         * FeatureLandingResourceUri.
         */
        public Builder featureLandingResourceUri(String featureLandingResourceUri) {
            this.featureLandingResourceUri = featureLandingResourceUri;
            return this;
        }

        /**
         * FeaturePriority.
         */
        public Builder featurePriority(String featurePriority) {
            this.featurePriority = featurePriority;
            return this;
        }

        /**
         * FeatureStoreItemId.
         */
        public Builder featureStoreItemId(String featureStoreItemId) {
            this.featureStoreItemId = featureStoreItemId;
            return this;
        }

        /**
         * FeatureStoreModelId.
         */
        public Builder featureStoreModelId(String featureStoreModelId) {
            this.featureStoreModelId = featureStoreModelId;
            return this;
        }

        /**
         * FeatureStoreProjectId.
         */
        public Builder featureStoreProjectId(String featureStoreProjectId) {
            this.featureStoreProjectId = featureStoreProjectId;
            return this;
        }

        /**
         * FeatureStoreProjectName.
         */
        public Builder featureStoreProjectName(String featureStoreProjectName) {
            this.featureStoreProjectName = featureStoreProjectName;
            return this;
        }

        /**
         * FeatureStoreSeqFeatureView.
         */
        public Builder featureStoreSeqFeatureView(String featureStoreSeqFeatureView) {
            this.featureStoreSeqFeatureView = featureStoreSeqFeatureView;
            return this;
        }

        /**
         * FeatureStoreUserId.
         */
        public Builder featureStoreUserId(String featureStoreUserId) {
            this.featureStoreUserId = featureStoreUserId;
            return this;
        }

        /**
         * FgJarVersion.
         */
        public Builder fgJarVersion(String fgJarVersion) {
            this.fgJarVersion = fgJarVersion;
            return this;
        }

        /**
         * FgJsonFileName.
         */
        public Builder fgJsonFileName(String fgJsonFileName) {
            this.fgJsonFileName = fgJsonFileName;
            return this;
        }

        /**
         * GenerateZip.
         */
        public Builder generateZip(Boolean generateZip) {
            this.generateZip = generateZip;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * ItemIdField.
         */
        public Builder itemIdField(String itemIdField) {
            this.itemIdField = itemIdField;
            return this;
        }

        /**
         * ItemTable.
         */
        public Builder itemTable(String itemTable) {
            this.itemTable = itemTable;
            return this;
        }

        /**
         * ItemTablePartitionField.
         */
        public Builder itemTablePartitionField(String itemTablePartitionField) {
            this.itemTablePartitionField = itemTablePartitionField;
            return this;
        }

        /**
         * ItemTablePartitionFieldFormat.
         */
        public Builder itemTablePartitionFieldFormat(String itemTablePartitionFieldFormat) {
            this.itemTablePartitionFieldFormat = itemTablePartitionFieldFormat;
            return this;
        }

        /**
         * LatestJobGmtSamplingEndTime.
         */
        public Builder latestJobGmtSamplingEndTime(String latestJobGmtSamplingEndTime) {
            this.latestJobGmtSamplingEndTime = latestJobGmtSamplingEndTime;
            return this;
        }

        /**
         * LatestJobGmtSamplingStartTime.
         */
        public Builder latestJobGmtSamplingStartTime(String latestJobGmtSamplingStartTime) {
            this.latestJobGmtSamplingStartTime = latestJobGmtSamplingStartTime;
            return this;
        }

        /**
         * LatestJobId.
         */
        public Builder latestJobId(String latestJobId) {
            this.latestJobId = latestJobId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * OssBucket.
         */
        public Builder ossBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }

        /**
         * OssResourceId.
         */
        public Builder ossResourceId(String ossResourceId) {
            this.ossResourceId = ossResourceId;
            return this;
        }

        /**
         * PredictWorkerCount.
         */
        public Builder predictWorkerCount(Integer predictWorkerCount) {
            this.predictWorkerCount = predictWorkerCount;
            return this;
        }

        /**
         * PredictWorkerCpu.
         */
        public Builder predictWorkerCpu(Integer predictWorkerCpu) {
            this.predictWorkerCpu = predictWorkerCpu;
            return this;
        }

        /**
         * PredictWorkerMemory.
         */
        public Builder predictWorkerMemory(Integer predictWorkerMemory) {
            this.predictWorkerMemory = predictWorkerMemory;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SampleRate.
         */
        public Builder sampleRate(String sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }

        /**
         * SceneId.
         */
        public Builder sceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }

        /**
         * SceneName.
         */
        public Builder sceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }

        /**
         * SecurityGroupId.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * ServiceId.
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
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
         * SwitchId.
         */
        public Builder switchId(String switchId) {
            this.switchId = switchId;
            return this;
        }

        /**
         * UseFeatureStore.
         */
        public Builder useFeatureStore(Boolean useFeatureStore) {
            this.useFeatureStore = useFeatureStore;
            return this;
        }

        /**
         * UserIdField.
         */
        public Builder userIdField(String userIdField) {
            this.userIdField = userIdField;
            return this;
        }

        /**
         * UserTable.
         */
        public Builder userTable(String userTable) {
            this.userTable = userTable;
            return this;
        }

        /**
         * UserTablePartitionField.
         */
        public Builder userTablePartitionField(String userTablePartitionField) {
            this.userTablePartitionField = userTablePartitionField;
            return this;
        }

        /**
         * UserTablePartitionFieldFormat.
         */
        public Builder userTablePartitionFieldFormat(String userTablePartitionFieldFormat) {
            this.userTablePartitionFieldFormat = userTablePartitionFieldFormat;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * WorkflowName.
         */
        public Builder workflowName(String workflowName) {
            this.workflowName = workflowName;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public GetFeatureConsistencyCheckJobConfigResponseBody build() {
            return new GetFeatureConsistencyCheckJobConfigResponseBody(this);
        } 

    } 

}
