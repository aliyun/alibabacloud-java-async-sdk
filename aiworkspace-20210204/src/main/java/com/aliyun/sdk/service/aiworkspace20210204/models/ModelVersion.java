// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link ModelVersion} extends {@link TeaModel}
 *
 * <p>ModelVersion</p>
 */
public class ModelVersion extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApprovalStatus")
    private String approvalStatus;

    @com.aliyun.core.annotation.NameInMap("CompressionSpec")
    private java.util.Map<String, ?> compressionSpec;

    @com.aliyun.core.annotation.NameInMap("DistillationSpec")
    private java.util.Map<String, ?> distillationSpec;

    @com.aliyun.core.annotation.NameInMap("EvaluationSpec")
    private java.util.Map<String, ?> evaluationSpec;

    @com.aliyun.core.annotation.NameInMap("ExtraInfo")
    private java.util.Map<String, ?> extraInfo;

    @com.aliyun.core.annotation.NameInMap("FormatType")
    private String formatType;

    @com.aliyun.core.annotation.NameInMap("FrameworkType")
    private String frameworkType;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("InferenceSpec")
    private java.util.Map<String, ?> inferenceSpec;

    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Labels> labels;

    @com.aliyun.core.annotation.NameInMap("Metrics")
    private java.util.Map<String, ?> metrics;

    @com.aliyun.core.annotation.NameInMap("Options")
    private String options;

    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.NameInMap("SourceId")
    private String sourceId;

    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.NameInMap("TrainingSpec")
    private java.util.Map<String, ?> trainingSpec;

    @com.aliyun.core.annotation.NameInMap("Uri")
    private String uri;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("VersionDescription")
    private String versionDescription;

    @com.aliyun.core.annotation.NameInMap("VersionName")
    private String versionName;

    private ModelVersion(Builder builder) {
        this.approvalStatus = builder.approvalStatus;
        this.compressionSpec = builder.compressionSpec;
        this.distillationSpec = builder.distillationSpec;
        this.evaluationSpec = builder.evaluationSpec;
        this.extraInfo = builder.extraInfo;
        this.formatType = builder.formatType;
        this.frameworkType = builder.frameworkType;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.inferenceSpec = builder.inferenceSpec;
        this.labels = builder.labels;
        this.metrics = builder.metrics;
        this.options = builder.options;
        this.ownerId = builder.ownerId;
        this.sourceId = builder.sourceId;
        this.sourceType = builder.sourceType;
        this.trainingSpec = builder.trainingSpec;
        this.uri = builder.uri;
        this.userId = builder.userId;
        this.versionDescription = builder.versionDescription;
        this.versionName = builder.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelVersion create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return approvalStatus
     */
    public String getApprovalStatus() {
        return this.approvalStatus;
    }

    /**
     * @return compressionSpec
     */
    public java.util.Map<String, ?> getCompressionSpec() {
        return this.compressionSpec;
    }

    /**
     * @return distillationSpec
     */
    public java.util.Map<String, ?> getDistillationSpec() {
        return this.distillationSpec;
    }

    /**
     * @return evaluationSpec
     */
    public java.util.Map<String, ?> getEvaluationSpec() {
        return this.evaluationSpec;
    }

    /**
     * @return extraInfo
     */
    public java.util.Map<String, ?> getExtraInfo() {
        return this.extraInfo;
    }

    /**
     * @return formatType
     */
    public String getFormatType() {
        return this.formatType;
    }

    /**
     * @return frameworkType
     */
    public String getFrameworkType() {
        return this.frameworkType;
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
     * @return inferenceSpec
     */
    public java.util.Map<String, ?> getInferenceSpec() {
        return this.inferenceSpec;
    }

    /**
     * @return labels
     */
    public java.util.List<Labels> getLabels() {
        return this.labels;
    }

    /**
     * @return metrics
     */
    public java.util.Map<String, ?> getMetrics() {
        return this.metrics;
    }

    /**
     * @return options
     */
    public String getOptions() {
        return this.options;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return trainingSpec
     */
    public java.util.Map<String, ?> getTrainingSpec() {
        return this.trainingSpec;
    }

    /**
     * @return uri
     */
    public String getUri() {
        return this.uri;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return versionDescription
     */
    public String getVersionDescription() {
        return this.versionDescription;
    }

    /**
     * @return versionName
     */
    public String getVersionName() {
        return this.versionName;
    }

    public static final class Builder {
        private String approvalStatus; 
        private java.util.Map<String, ?> compressionSpec; 
        private java.util.Map<String, ?> distillationSpec; 
        private java.util.Map<String, ?> evaluationSpec; 
        private java.util.Map<String, ?> extraInfo; 
        private String formatType; 
        private String frameworkType; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private java.util.Map<String, ?> inferenceSpec; 
        private java.util.List<Labels> labels; 
        private java.util.Map<String, ?> metrics; 
        private String options; 
        private String ownerId; 
        private String sourceId; 
        private String sourceType; 
        private java.util.Map<String, ?> trainingSpec; 
        private String uri; 
        private String userId; 
        private String versionDescription; 
        private String versionName; 

        private Builder() {
        } 

        private Builder(ModelVersion model) {
            this.approvalStatus = model.approvalStatus;
            this.compressionSpec = model.compressionSpec;
            this.distillationSpec = model.distillationSpec;
            this.evaluationSpec = model.evaluationSpec;
            this.extraInfo = model.extraInfo;
            this.formatType = model.formatType;
            this.frameworkType = model.frameworkType;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.inferenceSpec = model.inferenceSpec;
            this.labels = model.labels;
            this.metrics = model.metrics;
            this.options = model.options;
            this.ownerId = model.ownerId;
            this.sourceId = model.sourceId;
            this.sourceType = model.sourceType;
            this.trainingSpec = model.trainingSpec;
            this.uri = model.uri;
            this.userId = model.userId;
            this.versionDescription = model.versionDescription;
            this.versionName = model.versionName;
        } 

        /**
         * ApprovalStatus.
         */
        public Builder approvalStatus(String approvalStatus) {
            this.approvalStatus = approvalStatus;
            return this;
        }

        /**
         * CompressionSpec.
         */
        public Builder compressionSpec(java.util.Map<String, ?> compressionSpec) {
            this.compressionSpec = compressionSpec;
            return this;
        }

        /**
         * DistillationSpec.
         */
        public Builder distillationSpec(java.util.Map<String, ?> distillationSpec) {
            this.distillationSpec = distillationSpec;
            return this;
        }

        /**
         * EvaluationSpec.
         */
        public Builder evaluationSpec(java.util.Map<String, ?> evaluationSpec) {
            this.evaluationSpec = evaluationSpec;
            return this;
        }

        /**
         * ExtraInfo.
         */
        public Builder extraInfo(java.util.Map<String, ?> extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }

        /**
         * FormatType.
         */
        public Builder formatType(String formatType) {
            this.formatType = formatType;
            return this;
        }

        /**
         * FrameworkType.
         */
        public Builder frameworkType(String frameworkType) {
            this.frameworkType = frameworkType;
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
         * InferenceSpec.
         */
        public Builder inferenceSpec(java.util.Map<String, ?> inferenceSpec) {
            this.inferenceSpec = inferenceSpec;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.List<Labels> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * Metrics.
         */
        public Builder metrics(java.util.Map<String, ?> metrics) {
            this.metrics = metrics;
            return this;
        }

        /**
         * Options.
         */
        public Builder options(String options) {
            this.options = options;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * SourceId.
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * TrainingSpec.
         */
        public Builder trainingSpec(java.util.Map<String, ?> trainingSpec) {
            this.trainingSpec = trainingSpec;
            return this;
        }

        /**
         * Uri.
         */
        public Builder uri(String uri) {
            this.uri = uri;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * VersionDescription.
         */
        public Builder versionDescription(String versionDescription) {
            this.versionDescription = versionDescription;
            return this;
        }

        /**
         * VersionName.
         */
        public Builder versionName(String versionName) {
            this.versionName = versionName;
            return this;
        }

        public ModelVersion build() {
            return new ModelVersion(this);
        } 

    } 

    /**
     * 
     * {@link ModelVersion} extends {@link TeaModel}
     *
     * <p>ModelVersion</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Labels(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Labels model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
}
