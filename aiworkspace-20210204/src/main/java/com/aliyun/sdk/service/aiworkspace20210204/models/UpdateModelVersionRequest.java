// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateModelVersionRequest} extends {@link RequestModel}
 *
 * <p>UpdateModelVersionRequest</p>
 */
public class UpdateModelVersionRequest extends Request {
    @Path
    @NameInMap("ModelId")
    @Validation(required = true)
    private String modelId;

    @Path
    @NameInMap("VersionName")
    @Validation(required = true)
    private String versionName;

    @Body
    @NameInMap("ApprovalStatus")
    private String approvalStatus;

    @Body
    @NameInMap("InferenceSpec")
    private java.util.Map < String, ? > inferenceSpec;

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
    @NameInMap("VersionDescription")
    private String versionDescription;

    private UpdateModelVersionRequest(Builder builder) {
        super(builder);
        this.modelId = builder.modelId;
        this.versionName = builder.versionName;
        this.approvalStatus = builder.approvalStatus;
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
     * @return inferenceSpec
     */
    public java.util.Map < String, ? > getInferenceSpec() {
        return this.inferenceSpec;
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
     * @return versionDescription
     */
    public String getVersionDescription() {
        return this.versionDescription;
    }

    public static final class Builder extends Request.Builder<UpdateModelVersionRequest, Builder> {
        private String modelId; 
        private String versionName; 
        private String approvalStatus; 
        private java.util.Map < String, ? > inferenceSpec; 
        private java.util.Map < String, ? > metrics; 
        private String options; 
        private String sourceId; 
        private String sourceType; 
        private java.util.Map < String, ? > trainingSpec; 
        private String versionDescription; 

        private Builder() {
            super();
        } 

        private Builder(UpdateModelVersionRequest request) {
            super(request);
            this.modelId = request.modelId;
            this.versionName = request.versionName;
            this.approvalStatus = request.approvalStatus;
            this.inferenceSpec = request.inferenceSpec;
            this.metrics = request.metrics;
            this.options = request.options;
            this.sourceId = request.sourceId;
            this.sourceType = request.sourceType;
            this.trainingSpec = request.trainingSpec;
            this.versionDescription = request.versionDescription;
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
         * VersionName.
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
         * InferenceSpec.
         */
        public Builder inferenceSpec(java.util.Map < String, ? > inferenceSpec) {
            this.putBodyParameter("InferenceSpec", inferenceSpec);
            this.inferenceSpec = inferenceSpec;
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
