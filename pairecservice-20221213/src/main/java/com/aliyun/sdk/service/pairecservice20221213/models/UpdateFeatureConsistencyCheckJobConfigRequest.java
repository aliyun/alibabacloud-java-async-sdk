// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFeatureConsistencyCheckJobConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateFeatureConsistencyCheckJobConfigRequest</p>
 */
public class UpdateFeatureConsistencyCheckJobConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("FeatureConsistencyCheckJobConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String featureConsistencyCheckJobConfigId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CompareFeature")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean compareFeature;

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
    @com.aliyun.core.annotation.NameInMap("IsUseFeatureStore")
    private Boolean isUseFeatureStore;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemIdField")
    @com.aliyun.core.annotation.Validation(required = true)
    private String itemIdField;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemTable")
    @com.aliyun.core.annotation.Validation(required = true)
    private String itemTable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemTablePartitionField")
    @com.aliyun.core.annotation.Validation(required = true)
    private String itemTablePartitionField;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemTablePartitionFieldFormat")
    @com.aliyun.core.annotation.Validation(required = true)
    private String itemTablePartitionFieldFormat;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OssResourceId")
    private String ossResourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SampleRate")
    @com.aliyun.core.annotation.Validation(required = true)
    private Double sampleRate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SceneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserIdField")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userIdField;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserTable")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userTable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserTablePartitionField")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userTablePartitionField;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserTablePartitionFieldFormat")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userTablePartitionFieldFormat;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkflowName")
    private String workflowName;

    private UpdateFeatureConsistencyCheckJobConfigRequest(Builder builder) {
        super(builder);
        this.featureConsistencyCheckJobConfigId = builder.featureConsistencyCheckJobConfigId;
        this.regionId = builder.regionId;
        this.compareFeature = builder.compareFeature;
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
        this.isUseFeatureStore = builder.isUseFeatureStore;
        this.itemIdField = builder.itemIdField;
        this.itemTable = builder.itemTable;
        this.itemTablePartitionField = builder.itemTablePartitionField;
        this.itemTablePartitionFieldFormat = builder.itemTablePartitionFieldFormat;
        this.name = builder.name;
        this.ossResourceId = builder.ossResourceId;
        this.sampleRate = builder.sampleRate;
        this.sceneId = builder.sceneId;
        this.serviceId = builder.serviceId;
        this.userIdField = builder.userIdField;
        this.userTable = builder.userTable;
        this.userTablePartitionField = builder.userTablePartitionField;
        this.userTablePartitionFieldFormat = builder.userTablePartitionFieldFormat;
        this.workflowName = builder.workflowName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFeatureConsistencyCheckJobConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return featureConsistencyCheckJobConfigId
     */
    public String getFeatureConsistencyCheckJobConfigId() {
        return this.featureConsistencyCheckJobConfigId;
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
     * @return isUseFeatureStore
     */
    public Boolean getIsUseFeatureStore() {
        return this.isUseFeatureStore;
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
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
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
     * @return workflowName
     */
    public String getWorkflowName() {
        return this.workflowName;
    }

    public static final class Builder extends Request.Builder<UpdateFeatureConsistencyCheckJobConfigRequest, Builder> {
        private String featureConsistencyCheckJobConfigId; 
        private String regionId; 
        private Boolean compareFeature; 
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
        private Boolean isUseFeatureStore; 
        private String itemIdField; 
        private String itemTable; 
        private String itemTablePartitionField; 
        private String itemTablePartitionFieldFormat; 
        private String name; 
        private String ossResourceId; 
        private Double sampleRate; 
        private String sceneId; 
        private String serviceId; 
        private String userIdField; 
        private String userTable; 
        private String userTablePartitionField; 
        private String userTablePartitionFieldFormat; 
        private String workflowName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFeatureConsistencyCheckJobConfigRequest request) {
            super(request);
            this.featureConsistencyCheckJobConfigId = request.featureConsistencyCheckJobConfigId;
            this.regionId = request.regionId;
            this.compareFeature = request.compareFeature;
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
            this.isUseFeatureStore = request.isUseFeatureStore;
            this.itemIdField = request.itemIdField;
            this.itemTable = request.itemTable;
            this.itemTablePartitionField = request.itemTablePartitionField;
            this.itemTablePartitionFieldFormat = request.itemTablePartitionFieldFormat;
            this.name = request.name;
            this.ossResourceId = request.ossResourceId;
            this.sampleRate = request.sampleRate;
            this.sceneId = request.sceneId;
            this.serviceId = request.serviceId;
            this.userIdField = request.userIdField;
            this.userTable = request.userTable;
            this.userTablePartitionField = request.userTablePartitionField;
            this.userTablePartitionFieldFormat = request.userTablePartitionFieldFormat;
            this.workflowName = request.workflowName;
        } 

        /**
         * FeatureConsistencyCheckJobConfigId.
         */
        public Builder featureConsistencyCheckJobConfigId(String featureConsistencyCheckJobConfigId) {
            this.putPathParameter("FeatureConsistencyCheckJobConfigId", featureConsistencyCheckJobConfigId);
            this.featureConsistencyCheckJobConfigId = featureConsistencyCheckJobConfigId;
            return this;
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
         * CompareFeature.
         */
        public Builder compareFeature(Boolean compareFeature) {
            this.putBodyParameter("CompareFeature", compareFeature);
            this.compareFeature = compareFeature;
            return this;
        }

        /**
         * EasServiceName.
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
         * FeatureLandingResourceId.
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
         * FgJsonFileName.
         */
        public Builder fgJsonFileName(String fgJsonFileName) {
            this.putBodyParameter("FgJsonFileName", fgJsonFileName);
            this.fgJsonFileName = fgJsonFileName;
            return this;
        }

        /**
         * GenerateZip.
         */
        public Builder generateZip(Boolean generateZip) {
            this.putBodyParameter("GenerateZip", generateZip);
            this.generateZip = generateZip;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IsUseFeatureStore.
         */
        public Builder isUseFeatureStore(Boolean isUseFeatureStore) {
            this.putBodyParameter("IsUseFeatureStore", isUseFeatureStore);
            this.isUseFeatureStore = isUseFeatureStore;
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
         * Name.
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
         * SampleRate.
         */
        public Builder sampleRate(Double sampleRate) {
            this.putBodyParameter("SampleRate", sampleRate);
            this.sampleRate = sampleRate;
            return this;
        }

        /**
         * SceneId.
         */
        public Builder sceneId(String sceneId) {
            this.putBodyParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * ServiceId.
         */
        public Builder serviceId(String serviceId) {
            this.putBodyParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
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
         * WorkflowName.
         */
        public Builder workflowName(String workflowName) {
            this.putBodyParameter("WorkflowName", workflowName);
            this.workflowName = workflowName;
            return this;
        }

        @Override
        public UpdateFeatureConsistencyCheckJobConfigRequest build() {
            return new UpdateFeatureConsistencyCheckJobConfigRequest(this);
        } 

    } 

}
