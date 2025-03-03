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
 * {@link UpdateModelVersionRequest} extends {@link RequestModel}
 *
 * <p>UpdateModelVersionRequest</p>
 */
public class UpdateModelVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ModelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("VersionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String versionName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApprovalStatus")
    private String approvalStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CompressionSpec")
    private java.util.Map<String, ?> compressionSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EvaluationSpec")
    private java.util.Map<String, ?> evaluationSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExtraInfo")
    private java.util.Map<String, ?> extraInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InferenceSpec")
    private java.util.Map<String, ?> inferenceSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Metrics")
    private java.util.Map<String, ?> metrics;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Options")
    private String options;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceId")
    private String sourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TrainingSpec")
    private java.util.Map<String, ?> trainingSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VersionDescription")
    private String versionDescription;

    private UpdateModelVersionRequest(Builder builder) {
        super(builder);
        this.modelId = builder.modelId;
        this.versionName = builder.versionName;
        this.approvalStatus = builder.approvalStatus;
        this.compressionSpec = builder.compressionSpec;
        this.evaluationSpec = builder.evaluationSpec;
        this.extraInfo = builder.extraInfo;
        this.inferenceSpec = builder.inferenceSpec;
        this.metrics = builder.metrics;
        this.options = builder.options;
        this.sourceId = builder.sourceId;
        this.sourceType = builder.sourceType;
        this.trainingSpec = builder.trainingSpec;
        this.versionDescription = builder.versionDescription;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateModelVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return versionName
     */
    public String getVersionName() {
        return this.versionName;
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
     * @return inferenceSpec
     */
    public java.util.Map<String, ?> getInferenceSpec() {
        return this.inferenceSpec;
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
     * @return versionDescription
     */
    public String getVersionDescription() {
        return this.versionDescription;
    }

    public static final class Builder extends Request.Builder<UpdateModelVersionRequest, Builder> {
        private String modelId; 
        private String versionName; 
        private String approvalStatus; 
        private java.util.Map<String, ?> compressionSpec; 
        private java.util.Map<String, ?> evaluationSpec; 
        private java.util.Map<String, ?> extraInfo; 
        private java.util.Map<String, ?> inferenceSpec; 
        private java.util.Map<String, ?> metrics; 
        private String options; 
        private String sourceId; 
        private String sourceType; 
        private java.util.Map<String, ?> trainingSpec; 
        private String versionDescription; 

        private Builder() {
            super();
        } 

        private Builder(UpdateModelVersionRequest request) {
            super(request);
            this.modelId = request.modelId;
            this.versionName = request.versionName;
            this.approvalStatus = request.approvalStatus;
            this.compressionSpec = request.compressionSpec;
            this.evaluationSpec = request.evaluationSpec;
            this.extraInfo = request.extraInfo;
            this.inferenceSpec = request.inferenceSpec;
            this.metrics = request.metrics;
            this.options = request.options;
            this.sourceId = request.sourceId;
            this.sourceType = request.sourceType;
            this.trainingSpec = request.trainingSpec;
            this.versionDescription = request.versionDescription;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>model-dfs1****5c</p>
         */
        public Builder modelId(String modelId) {
            this.putPathParameter("ModelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1.0</p>
         */
        public Builder versionName(String versionName) {
            this.putPathParameter("VersionName", versionName);
            this.versionName = versionName;
            return this;
        }

        /**
         * ApprovalStatus.
         */
        public Builder approvalStatus(String approvalStatus) {
            this.putBodyParameter("ApprovalStatus", approvalStatus);
            this.approvalStatus = approvalStatus;
            return this;
        }

        /**
         * CompressionSpec.
         */
        public Builder compressionSpec(java.util.Map<String, ?> compressionSpec) {
            this.putBodyParameter("CompressionSpec", compressionSpec);
            this.compressionSpec = compressionSpec;
            return this;
        }

        /**
         * EvaluationSpec.
         */
        public Builder evaluationSpec(java.util.Map<String, ?> evaluationSpec) {
            this.putBodyParameter("EvaluationSpec", evaluationSpec);
            this.evaluationSpec = evaluationSpec;
            return this;
        }

        /**
         * ExtraInfo.
         */
        public Builder extraInfo(java.util.Map<String, ?> extraInfo) {
            this.putBodyParameter("ExtraInfo", extraInfo);
            this.extraInfo = extraInfo;
            return this;
        }

        /**
         * InferenceSpec.
         */
        public Builder inferenceSpec(java.util.Map<String, ?> inferenceSpec) {
            this.putBodyParameter("InferenceSpec", inferenceSpec);
            this.inferenceSpec = inferenceSpec;
            return this;
        }

        /**
         * Metrics.
         */
        public Builder metrics(java.util.Map<String, ?> metrics) {
            this.putBodyParameter("Metrics", metrics);
            this.metrics = metrics;
            return this;
        }

        /**
         * Options.
         */
        public Builder options(String options) {
            this.putBodyParameter("Options", options);
            this.options = options;
            return this;
        }

        /**
         * SourceId.
         */
        public Builder sourceId(String sourceId) {
            this.putBodyParameter("SourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putBodyParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * TrainingSpec.
         */
        public Builder trainingSpec(java.util.Map<String, ?> trainingSpec) {
            this.putBodyParameter("TrainingSpec", trainingSpec);
            this.trainingSpec = trainingSpec;
            return this;
        }

        /**
         * VersionDescription.
         */
        public Builder versionDescription(String versionDescription) {
            this.putBodyParameter("VersionDescription", versionDescription);
            this.versionDescription = versionDescription;
            return this;
        }

        @Override
        public UpdateModelVersionRequest build() {
            return new UpdateModelVersionRequest(this);
        } 

    } 

}
