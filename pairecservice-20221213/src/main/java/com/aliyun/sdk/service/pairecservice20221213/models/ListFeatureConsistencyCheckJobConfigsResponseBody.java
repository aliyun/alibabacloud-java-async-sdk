// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFeatureConsistencyCheckJobConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFeatureConsistencyCheckJobConfigsResponseBody</p>
 */
public class ListFeatureConsistencyCheckJobConfigsResponseBody extends TeaModel {
    @NameInMap("FeatureConsistencyCheckConfigs")
    private java.util.List < FeatureConsistencyCheckConfigs> featureConsistencyCheckConfigs;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListFeatureConsistencyCheckJobConfigsResponseBody(Builder builder) {
        this.featureConsistencyCheckConfigs = builder.featureConsistencyCheckConfigs;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFeatureConsistencyCheckJobConfigsResponseBody create() {
        return builder().build();
    }

    /**
     * @return featureConsistencyCheckConfigs
     */
    public java.util.List < FeatureConsistencyCheckConfigs> getFeatureConsistencyCheckConfigs() {
        return this.featureConsistencyCheckConfigs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < FeatureConsistencyCheckConfigs> featureConsistencyCheckConfigs; 
        private String requestId; 
        private Long totalCount; 

        /**
         * FeatureConsistencyCheckConfigs.
         */
        public Builder featureConsistencyCheckConfigs(java.util.List < FeatureConsistencyCheckConfigs> featureConsistencyCheckConfigs) {
            this.featureConsistencyCheckConfigs = featureConsistencyCheckConfigs;
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListFeatureConsistencyCheckJobConfigsResponseBody build() {
            return new ListFeatureConsistencyCheckJobConfigsResponseBody(this);
        } 

    } 

    public static class FeatureConsistencyCheckConfigs extends TeaModel {
        @NameInMap("CompareFeature")
        private Boolean compareFeature;

        @NameInMap("EasServiceName")
        private String easServiceName;

        @NameInMap("EasyRecPackagePath")
        private String easyRecPackagePath;

        @NameInMap("EasyRecVersion")
        private String easyRecVersion;

        @NameInMap("FeatureConsistencyCheckJobConfigId")
        private String featureConsistencyCheckJobConfigId;

        @NameInMap("FeatureDisplayExclude")
        private String featureDisplayExclude;

        @NameInMap("FeatureLandingResourceId")
        private String featureLandingResourceId;

        @NameInMap("FeatureLandingResourceUri")
        private String featureLandingResourceUri;

        @NameInMap("FeaturePriority")
        private String featurePriority;

        @NameInMap("FgJarVersion")
        private String fgJarVersion;

        @NameInMap("FgJsonFileName")
        private String fgJsonFileName;

        @NameInMap("GenerateZip")
        private Boolean generateZip;

        @NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @NameInMap("ItemIdField")
        private String itemIdField;

        @NameInMap("ItemTable")
        private String itemTable;

        @NameInMap("ItemTablePartitionField")
        private String itemTablePartitionField;

        @NameInMap("ItemTablePartitionFieldFormat")
        private String itemTablePartitionFieldFormat;

        @NameInMap("LatestJobGmtSamplingEndTime")
        private String latestJobGmtSamplingEndTime;

        @NameInMap("LatestJobGmtSamplingStartTime")
        private String latestJobGmtSamplingStartTime;

        @NameInMap("LatestJobId")
        private String latestJobId;

        @NameInMap("Name")
        private String name;

        @NameInMap("OssBucket")
        private String ossBucket;

        @NameInMap("OssResourceId")
        private String ossResourceId;

        @NameInMap("SampleRate")
        private String sampleRate;

        @NameInMap("SceneId")
        private String sceneId;

        @NameInMap("SceneName")
        private String sceneName;

        @NameInMap("ServiceId")
        private String serviceId;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("Status")
        private String status;

        @NameInMap("UserIdField")
        private String userIdField;

        @NameInMap("UserTable")
        private String userTable;

        @NameInMap("UserTablePartitionField")
        private String userTablePartitionField;

        @NameInMap("UserTablePartitionFieldFormat")
        private String userTablePartitionFieldFormat;

        @NameInMap("WorkflowName")
        private String workflowName;

        private FeatureConsistencyCheckConfigs(Builder builder) {
            this.compareFeature = builder.compareFeature;
            this.easServiceName = builder.easServiceName;
            this.easyRecPackagePath = builder.easyRecPackagePath;
            this.easyRecVersion = builder.easyRecVersion;
            this.featureConsistencyCheckJobConfigId = builder.featureConsistencyCheckJobConfigId;
            this.featureDisplayExclude = builder.featureDisplayExclude;
            this.featureLandingResourceId = builder.featureLandingResourceId;
            this.featureLandingResourceUri = builder.featureLandingResourceUri;
            this.featurePriority = builder.featurePriority;
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
            this.sampleRate = builder.sampleRate;
            this.sceneId = builder.sceneId;
            this.sceneName = builder.sceneName;
            this.serviceId = builder.serviceId;
            this.serviceName = builder.serviceName;
            this.status = builder.status;
            this.userIdField = builder.userIdField;
            this.userTable = builder.userTable;
            this.userTablePartitionField = builder.userTablePartitionField;
            this.userTablePartitionFieldFormat = builder.userTablePartitionFieldFormat;
            this.workflowName = builder.workflowName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FeatureConsistencyCheckConfigs create() {
            return builder().build();
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
         * @return featureConsistencyCheckJobConfigId
         */
        public String getFeatureConsistencyCheckJobConfigId() {
            return this.featureConsistencyCheckJobConfigId;
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

        public static final class Builder {
            private Boolean compareFeature; 
            private String easServiceName; 
            private String easyRecPackagePath; 
            private String easyRecVersion; 
            private String featureConsistencyCheckJobConfigId; 
            private String featureDisplayExclude; 
            private String featureLandingResourceId; 
            private String featureLandingResourceUri; 
            private String featurePriority; 
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
            private String sampleRate; 
            private String sceneId; 
            private String sceneName; 
            private String serviceId; 
            private String serviceName; 
            private String status; 
            private String userIdField; 
            private String userTable; 
            private String userTablePartitionField; 
            private String userTablePartitionFieldFormat; 
            private String workflowName; 

            /**
             * CompareFeature.
             */
            public Builder compareFeature(Boolean compareFeature) {
                this.compareFeature = compareFeature;
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
             * FeatureConsistencyCheckJobConfigId.
             */
            public Builder featureConsistencyCheckJobConfigId(String featureConsistencyCheckJobConfigId) {
                this.featureConsistencyCheckJobConfigId = featureConsistencyCheckJobConfigId;
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
             * WorkflowName.
             */
            public Builder workflowName(String workflowName) {
                this.workflowName = workflowName;
                return this;
            }

            public FeatureConsistencyCheckConfigs build() {
                return new FeatureConsistencyCheckConfigs(this);
            } 

        } 

    }
}
