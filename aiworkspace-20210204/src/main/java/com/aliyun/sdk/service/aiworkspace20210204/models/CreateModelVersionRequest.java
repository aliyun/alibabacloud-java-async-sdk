// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateModelVersionRequest} extends {@link RequestModel}
 *
 * <p>CreateModelVersionRequest</p>
 */
public class CreateModelVersionRequest extends Request {
    @Path
    @NameInMap("ModelId")
    @Validation(required = true)
    private String modelId;

    @Body
    @NameInMap("ApprovalStatus")
    private String approvalStatus;

    @Body
    @NameInMap("EvaluationSpec")
    private java.util.Map < String, ? > evaluationSpec;

    @Body
    @NameInMap("ExtraInfo")
    private java.util.Map < String, ? > extraInfo;

    @Body
    @NameInMap("FormatType")
    private String formatType;

    @Body
    @NameInMap("FrameworkType")
    private String frameworkType;

    @Body
    @NameInMap("InferenceSpec")
    private java.util.Map < String, ? > inferenceSpec;

    @Body
    @NameInMap("Labels")
    private java.util.List < Label > labels;

    @Body
    @NameInMap("Metrics")
    private java.util.Map < String, ? > metrics;

    @Body
    @NameInMap("Options")
    private String options;

    @Body
    @NameInMap("SourceId")
    private String sourceId;

    @Body
    @NameInMap("SourceType")
    private String sourceType;

    @Body
    @NameInMap("TrainingSpec")
    private java.util.Map < String, ? > trainingSpec;

    @Body
    @NameInMap("Uri")
    @Validation(required = true)
    private String uri;

    @Body
    @NameInMap("VersionDescription")
    private String versionDescription;

    @Body
    @NameInMap("VersionName")
    private String versionName;

    private CreateModelVersionRequest(Builder builder) {
        super(builder);
        this.modelId = builder.modelId;
        this.approvalStatus = builder.approvalStatus;
        this.evaluationSpec = builder.evaluationSpec;
        this.extraInfo = builder.extraInfo;
        this.formatType = builder.formatType;
        this.frameworkType = builder.frameworkType;
        this.inferenceSpec = builder.inferenceSpec;
        this.labels = builder.labels;
        this.metrics = builder.metrics;
        this.options = builder.options;
        this.sourceId = builder.sourceId;
        this.sourceType = builder.sourceType;
        this.trainingSpec = builder.trainingSpec;
        this.uri = builder.uri;
        this.versionDescription = builder.versionDescription;
        this.versionName = builder.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelVersionRequest create() {
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
     * @return approvalStatus
     */
    public String getApprovalStatus() {
        return this.approvalStatus;
    }

    /**
     * @return evaluationSpec
     */
    public java.util.Map < String, ? > getEvaluationSpec() {
        return this.evaluationSpec;
    }

    /**
     * @return extraInfo
     */
    public java.util.Map < String, ? > getExtraInfo() {
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
     * @return inferenceSpec
     */
    public java.util.Map < String, ? > getInferenceSpec() {
        return this.inferenceSpec;
    }

    /**
     * @return labels
     */
    public java.util.List < Label > getLabels() {
        return this.labels;
    }

    /**
     * @return metrics
     */
    public java.util.Map < String, ? > getMetrics() {
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
    public java.util.Map < String, ? > getTrainingSpec() {
        return this.trainingSpec;
    }

    /**
     * @return uri
     */
    public String getUri() {
        return this.uri;
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

    public static final class Builder extends Request.Builder<CreateModelVersionRequest, Builder> {
        private String modelId; 
        private String approvalStatus; 
        private java.util.Map < String, ? > evaluationSpec; 
        private java.util.Map < String, ? > extraInfo; 
        private String formatType; 
        private String frameworkType; 
        private java.util.Map < String, ? > inferenceSpec; 
        private java.util.List < Label > labels; 
        private java.util.Map < String, ? > metrics; 
        private String options; 
        private String sourceId; 
        private String sourceType; 
        private java.util.Map < String, ? > trainingSpec; 
        private String uri; 
        private String versionDescription; 
        private String versionName; 

        private Builder() {
            super();
        } 

        private Builder(CreateModelVersionRequest request) {
            super(request);
            this.modelId = request.modelId;
            this.approvalStatus = request.approvalStatus;
            this.evaluationSpec = request.evaluationSpec;
            this.extraInfo = request.extraInfo;
            this.formatType = request.formatType;
            this.frameworkType = request.frameworkType;
            this.inferenceSpec = request.inferenceSpec;
            this.labels = request.labels;
            this.metrics = request.metrics;
            this.options = request.options;
            this.sourceId = request.sourceId;
            this.sourceType = request.sourceType;
            this.trainingSpec = request.trainingSpec;
            this.uri = request.uri;
            this.versionDescription = request.versionDescription;
            this.versionName = request.versionName;
        } 

        /**
         * ModelId.
         */
        public Builder modelId(String modelId) {
            this.putPathParameter("ModelId", modelId);
            this.modelId = modelId;
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
         * EvaluationSpec.
         */
        public Builder evaluationSpec(java.util.Map < String, ? > evaluationSpec) {
            this.putBodyParameter("EvaluationSpec", evaluationSpec);
            this.evaluationSpec = evaluationSpec;
            return this;
        }

        /**
         * ExtraInfo.
         */
        public Builder extraInfo(java.util.Map < String, ? > extraInfo) {
            this.putBodyParameter("ExtraInfo", extraInfo);
            this.extraInfo = extraInfo;
            return this;
        }

        /**
         * FormatType.
         */
        public Builder formatType(String formatType) {
            this.putBodyParameter("FormatType", formatType);
            this.formatType = formatType;
            return this;
        }

        /**
         * FrameworkType.
         */
        public Builder frameworkType(String frameworkType) {
            this.putBodyParameter("FrameworkType", frameworkType);
            this.frameworkType = frameworkType;
            return this;
        }

        /**
         * InferenceSpec.
         */
        public Builder inferenceSpec(java.util.Map < String, ? > inferenceSpec) {
            this.putBodyParameter("InferenceSpec", inferenceSpec);
            this.inferenceSpec = inferenceSpec;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.List < Label > labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * Metrics.
         */
        public Builder metrics(java.util.Map < String, ? > metrics) {
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
        public Builder trainingSpec(java.util.Map < String, ? > trainingSpec) {
            this.putBodyParameter("TrainingSpec", trainingSpec);
            this.trainingSpec = trainingSpec;
            return this;
        }

        /**
         * Uri.
         */
        public Builder uri(String uri) {
            this.putBodyParameter("Uri", uri);
            this.uri = uri;
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

        /**
         * VersionName.
         */
        public Builder versionName(String versionName) {
            this.putBodyParameter("VersionName", versionName);
            this.versionName = versionName;
            return this;
        }

        @Override
        public CreateModelVersionRequest build() {
            return new CreateModelVersionRequest(this);
        } 

    } 

}
