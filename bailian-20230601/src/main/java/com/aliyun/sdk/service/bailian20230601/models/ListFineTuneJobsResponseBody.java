// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFineTuneJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFineTuneJobsResponseBody</p>
 */
public class ListFineTuneJobsResponseBody extends TeaModel {
    @NameInMap("Jobs")
    private java.util.List < Jobs> jobs;

    @NameInMap("PageNo")
    private Integer pageNo;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Integer total;

    private ListFineTuneJobsResponseBody(Builder builder) {
        this.jobs = builder.jobs;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFineTuneJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobs
     */
    public java.util.List < Jobs> getJobs() {
        return this.jobs;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List < Jobs> jobs; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Integer total; 

        /**
         * Jobs.
         */
        public Builder jobs(java.util.List < Jobs> jobs) {
            this.jobs = jobs;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListFineTuneJobsResponseBody build() {
            return new ListFineTuneJobsResponseBody(this);
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
    public static class Jobs extends TeaModel {
        @NameInMap("BaseModel")
        private String baseModel;

        @NameInMap("FineTunedModel")
        private String fineTunedModel;

        @NameInMap("HyperParameters")
        private HyperParameters hyperParameters;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("Message")
        private String message;

        @NameInMap("ModelName")
        private String modelName;

        @NameInMap("Status")
        private String status;

        @NameInMap("TrainingFiles")
        private java.util.List < String > trainingFiles;

        @NameInMap("TrainingType")
        private String trainingType;

        @NameInMap("ValidationFiles")
        private java.util.List < String > validationFiles;

        private Jobs(Builder builder) {
            this.baseModel = builder.baseModel;
            this.fineTunedModel = builder.fineTunedModel;
            this.hyperParameters = builder.hyperParameters;
            this.jobId = builder.jobId;
            this.message = builder.message;
            this.modelName = builder.modelName;
            this.status = builder.status;
            this.trainingFiles = builder.trainingFiles;
            this.trainingType = builder.trainingType;
            this.validationFiles = builder.validationFiles;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Jobs create() {
            return builder().build();
        }

        /**
         * @return baseModel
         */
        public String getBaseModel() {
            return this.baseModel;
        }

        /**
         * @return fineTunedModel
         */
        public String getFineTunedModel() {
            return this.fineTunedModel;
        }

        /**
         * @return hyperParameters
         */
        public HyperParameters getHyperParameters() {
            return this.hyperParameters;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
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

        public static final class Builder {
            private String baseModel; 
            private String fineTunedModel; 
            private HyperParameters hyperParameters; 
            private String jobId; 
            private String message; 
            private String modelName; 
            private String status; 
            private java.util.List < String > trainingFiles; 
            private String trainingType; 
            private java.util.List < String > validationFiles; 

            /**
             * BaseModel.
             */
            public Builder baseModel(String baseModel) {
                this.baseModel = baseModel;
                return this;
            }

            /**
             * FineTunedModel.
             */
            public Builder fineTunedModel(String fineTunedModel) {
                this.fineTunedModel = fineTunedModel;
                return this;
            }

            /**
             * HyperParameters.
             */
            public Builder hyperParameters(HyperParameters hyperParameters) {
                this.hyperParameters = hyperParameters;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * ModelName.
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
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
             * TrainingFiles.
             */
            public Builder trainingFiles(java.util.List < String > trainingFiles) {
                this.trainingFiles = trainingFiles;
                return this;
            }

            /**
             * TrainingType.
             */
            public Builder trainingType(String trainingType) {
                this.trainingType = trainingType;
                return this;
            }

            /**
             * ValidationFiles.
             */
            public Builder validationFiles(java.util.List < String > validationFiles) {
                this.validationFiles = validationFiles;
                return this;
            }

            public Jobs build() {
                return new Jobs(this);
            } 

        } 

    }
}
