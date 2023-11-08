// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFineTuneJobRequest} extends {@link RequestModel}
 *
 * <p>CreateFineTuneJobRequest</p>
 */
public class CreateFineTuneJobRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Body
    @NameInMap("BaseModel")
    @Validation(required = true)
    private String baseModel;

    @Body
    @NameInMap("HyperParameters")
    private HyperParameters hyperParameters;

    @Body
    @NameInMap("ModelName")
    private String modelName;

    @Body
    @NameInMap("TrainingFiles")
    private java.util.List < String > trainingFiles;

    @Body
    @NameInMap("TrainingType")
    private String trainingType;

    @Body
    @NameInMap("ValidationFiles")
    private java.util.List < String > validationFiles;

    private CreateFineTuneJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.baseModel = builder.baseModel;
        this.hyperParameters = builder.hyperParameters;
        this.modelName = builder.modelName;
        this.trainingFiles = builder.trainingFiles;
        this.trainingType = builder.trainingType;
        this.validationFiles = builder.validationFiles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFineTuneJobRequest create() {
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
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return baseModel
     */
    public String getBaseModel() {
        return this.baseModel;
    }

    /**
     * @return hyperParameters
     */
    public HyperParameters getHyperParameters() {
        return this.hyperParameters;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return trainingFiles
     */
    public java.util.List < String > getTrainingFiles() {
        return this.trainingFiles;
    }

    /**
     * @return trainingType
     */
    public String getTrainingType() {
        return this.trainingType;
    }

    /**
     * @return validationFiles
     */
    public java.util.List < String > getValidationFiles() {
        return this.validationFiles;
    }

    public static final class Builder extends Request.Builder<CreateFineTuneJobRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private String baseModel; 
        private HyperParameters hyperParameters; 
        private String modelName; 
        private java.util.List < String > trainingFiles; 
        private String trainingType; 
        private java.util.List < String > validationFiles; 

        private Builder() {
            super();
        } 

        private Builder(CreateFineTuneJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.baseModel = request.baseModel;
            this.hyperParameters = request.hyperParameters;
            this.modelName = request.modelName;
            this.trainingFiles = request.trainingFiles;
            this.trainingType = request.trainingType;
            this.validationFiles = request.validationFiles;
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
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * BaseModel.
         */
        public Builder baseModel(String baseModel) {
            this.putBodyParameter("BaseModel", baseModel);
            this.baseModel = baseModel;
            return this;
        }

        /**
         * HyperParameters.
         */
        public Builder hyperParameters(HyperParameters hyperParameters) {
            String hyperParametersShrink = shrink(hyperParameters, "HyperParameters", "json");
            this.putBodyParameter("HyperParameters", hyperParametersShrink);
            this.hyperParameters = hyperParameters;
            return this;
        }

        /**
         * ModelName.
         */
        public Builder modelName(String modelName) {
            this.putBodyParameter("ModelName", modelName);
            this.modelName = modelName;
            return this;
        }

        /**
         * TrainingFiles.
         */
        public Builder trainingFiles(java.util.List < String > trainingFiles) {
            String trainingFilesShrink = shrink(trainingFiles, "TrainingFiles", "json");
            this.putBodyParameter("TrainingFiles", trainingFilesShrink);
            this.trainingFiles = trainingFiles;
            return this;
        }

        /**
         * TrainingType.
         */
        public Builder trainingType(String trainingType) {
            this.putBodyParameter("TrainingType", trainingType);
            this.trainingType = trainingType;
            return this;
        }

        /**
         * ValidationFiles.
         */
        public Builder validationFiles(java.util.List < String > validationFiles) {
            String validationFilesShrink = shrink(validationFiles, "ValidationFiles", "json");
            this.putBodyParameter("ValidationFiles", validationFilesShrink);
            this.validationFiles = validationFiles;
            return this;
        }

        @Override
        public CreateFineTuneJobRequest build() {
            return new CreateFineTuneJobRequest(this);
        } 

    } 

    public static class HyperParameters extends TeaModel {
        @NameInMap("BatchSize")
        private Integer batchSize;

        @NameInMap("Epochs")
        private Integer epochs;

        @NameInMap("LearningRate")
        private String learningRate;

        @NameInMap("PromptLossWeight")
        private Double promptLossWeight;

        private HyperParameters(Builder builder) {
            this.batchSize = builder.batchSize;
            this.epochs = builder.epochs;
            this.learningRate = builder.learningRate;
            this.promptLossWeight = builder.promptLossWeight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HyperParameters create() {
            return builder().build();
        }

        /**
         * @return batchSize
         */
        public Integer getBatchSize() {
            return this.batchSize;
        }

        /**
         * @return epochs
         */
        public Integer getEpochs() {
            return this.epochs;
        }

        /**
         * @return learningRate
         */
        public String getLearningRate() {
            return this.learningRate;
        }

        /**
         * @return promptLossWeight
         */
        public Double getPromptLossWeight() {
            return this.promptLossWeight;
        }

        public static final class Builder {
            private Integer batchSize; 
            private Integer epochs; 
            private String learningRate; 
            private Double promptLossWeight; 

            /**
             * BatchSize.
             */
            public Builder batchSize(Integer batchSize) {
                this.batchSize = batchSize;
                return this;
            }

            /**
             * Epochs.
             */
            public Builder epochs(Integer epochs) {
                this.epochs = epochs;
                return this;
            }

            /**
             * LearningRate.
             */
            public Builder learningRate(String learningRate) {
                this.learningRate = learningRate;
                return this;
            }

            /**
             * PromptLossWeight.
             */
            public Builder promptLossWeight(Double promptLossWeight) {
                this.promptLossWeight = promptLossWeight;
                return this;
            }

            public HyperParameters build() {
                return new HyperParameters(this);
            } 

        } 

    }
}
