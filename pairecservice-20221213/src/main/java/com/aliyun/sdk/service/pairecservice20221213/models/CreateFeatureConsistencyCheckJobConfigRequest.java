// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFeatureConsistencyCheckJobConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateFeatureConsistencyCheckJobConfigRequest</p>
 */
public class CreateFeatureConsistencyCheckJobConfigRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("CompareFeature")
    @Validation(required = true)
    private Boolean compareFeature;

    @Body
    @NameInMap("EasServiceName")
    @Validation(required = true)
    private String easServiceName;

    @Body
    @NameInMap("EasyRecPackagePath")
    private String easyRecPackagePath;

    @Body
    @NameInMap("EasyRecVersion")
    private String easyRecVersion;

    @Body
    @NameInMap("FeatureDisplayExclude")
    private String featureDisplayExclude;

    @Body
    @NameInMap("FeatureLandingResourceId")
    @Validation(required = true)
    private String featureLandingResourceId;

    @Body
    @NameInMap("FeaturePriority")
    private String featurePriority;

    @Body
    @NameInMap("FeatureStoreItemId")
    private String featureStoreItemId;

    @Body
    @NameInMap("FeatureStoreModelId")
    private String featureStoreModelId;

    @Body
    @NameInMap("FeatureStoreProjectId")
    private String featureStoreProjectId;

    @Body
    @NameInMap("FeatureStoreProjectName")
    private String featureStoreProjectName;

    @Body
    @NameInMap("FeatureStoreSeqFeatureView")
    private String featureStoreSeqFeatureView;

    @Body
    @NameInMap("FeatureStoreUserId")
    private String featureStoreUserId;

    @Body
    @NameInMap("FgJarVersion")
    private String fgJarVersion;

    @Body
    @NameInMap("FgJsonFileName")
    @Validation(required = true)
    private String fgJsonFileName;

    @Body
    @NameInMap("GenerateZip")
    @Validation(required = true)
    private Boolean generateZip;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("ItemIdField")
    private String itemIdField;

    @Body
    @NameInMap("ItemTable")
    private String itemTable;

    @Body
    @NameInMap("ItemTablePartitionField")
    private String itemTablePartitionField;

    @Body
    @NameInMap("ItemTablePartitionFieldFormat")
    private String itemTablePartitionFieldFormat;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("OssResourceId")
    private String ossResourceId;

    @Body
    @NameInMap("SampleRate")
    @Validation(required = true)
    private Double sampleRate;

    @Body
    @NameInMap("SceneId")
    @Validation(required = true)
    private String sceneId;

    @Body
    @NameInMap("ServiceId")
    @Validation(required = true)
    private String serviceId;

    @Body
    @NameInMap("UseFeatureStore")
    @Validation(required = true)
    private Boolean useFeatureStore;

    @Body
    @NameInMap("UserIdField")
    private String userIdField;

    @Body
    @NameInMap("UserTable")
    private String userTable;

    @Body
    @NameInMap("UserTablePartitionField")
    private String userTablePartitionField;

    @Body
    @NameInMap("UserTablePartitionFieldFormat")
    private String userTablePartitionFieldFormat;

    @Body
    @NameInMap("WorkflowName")
    private String workflowName;

    private CreateFeatureConsistencyCheckJobConfigRequest(Builder builder) {
        super(builder);
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
        this.itemIdField = builder.itemIdField;
        this.itemTable = builder.itemTable;
        this.itemTablePartitionField = builder.itemTablePartitionField;
        this.itemTablePartitionFieldFormat = builder.itemTablePartitionFieldFormat;
        this.name = builder.name;
        this.ossResourceId = builder.ossResourceId;
        this.sampleRate = builder.sampleRate;
        this.sceneId = builder.sceneId;
        this.serviceId = builder.serviceId;
        this.useFeatureStore = builder.useFeatureStore;
        this.userIdField = builder.userIdField;
        this.userTable = builder.userTable;
        this.userTablePartitionField = builder.userTablePartitionField;
        this.userTablePartitionFieldFormat = builder.userTablePartitionFieldFormat;
        this.workflowName = builder.workflowName;
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
     * @return workflowName
     */
    public String getWorkflowName() {
        return this.workflowName;
    }

    public static final class Builder extends Request.Builder<CreateFeatureConsistencyCheckJobConfigRequest, Builder> {
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
        private String itemIdField; 
        private String itemTable; 
        private String itemTablePartitionField; 
        private String itemTablePartitionFieldFormat; 
        private String name; 
        private String ossResourceId; 
        private Double sampleRate; 
        private String sceneId; 
        private String serviceId; 
        private Boolean useFeatureStore; 
        private String userIdField; 
        private String userTable; 
        private String userTablePartitionField; 
        private String userTablePartitionFieldFormat; 
        private String workflowName; 

        private Builder() {
            super();
        } 

        private Builder(CreateFeatureConsistencyCheckJobConfigRequest request) {
            super(request);
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
            this.itemIdField = request.itemIdField;
            this.itemTable = request.itemTable;
            this.itemTablePartitionField = request.itemTablePartitionField;
            this.itemTablePartitionFieldFormat = request.itemTablePartitionFieldFormat;
            this.name = request.name;
            this.ossResourceId = request.ossResourceId;
            this.sampleRate = request.sampleRate;
            this.sceneId = request.sceneId;
            this.serviceId = request.serviceId;
            this.useFeatureStore = request.useFeatureStore;
            this.userIdField = request.userIdField;
            this.userTable = request.userTable;
            this.userTablePartitionField = request.userTablePartitionField;
            this.userTablePartitionFieldFormat = request.userTablePartitionFieldFormat;
            this.workflowName = request.workflowName;
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
         * UseFeatureStore.
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
         * WorkflowName.
         */
        public Builder workflowName(String workflowName) {
            this.putBodyParameter("WorkflowName", workflowName);
            this.workflowName = workflowName;
            return this;
        }

        @Override
        public CreateFeatureConsistencyCheckJobConfigRequest build() {
            return new CreateFeatureConsistencyCheckJobConfigRequest(this);
        } 

    } 

}
