// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link ListTrainingJobOutputModelsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTrainingJobOutputModelsResponseBody</p>
 */
public class ListTrainingJobOutputModelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OutputModels")
    private java.util.List<OutputModels> outputModels;

    private ListTrainingJobOutputModelsResponseBody(Builder builder) {
        this.outputModels = builder.outputModels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrainingJobOutputModelsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return outputModels
     */
    public java.util.List<OutputModels> getOutputModels() {
        return this.outputModels;
    }

    public static final class Builder {
        private java.util.List<OutputModels> outputModels; 

        private Builder() {
        } 

        private Builder(ListTrainingJobOutputModelsResponseBody model) {
            this.outputModels = model.outputModels;
        } 

        /**
         * OutputModels.
         */
        public Builder outputModels(java.util.List<OutputModels> outputModels) {
            this.outputModels = outputModels;
            return this;
        }

        public ListTrainingJobOutputModelsResponseBody build() {
            return new ListTrainingJobOutputModelsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTrainingJobOutputModelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTrainingJobOutputModelsResponseBody</p>
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
    /**
     * 
     * {@link ListTrainingJobOutputModelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTrainingJobOutputModelsResponseBody</p>
     */
    public static class OutputModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompressionSpec")
        private java.util.Map<String, ?> compressionSpec;

        @com.aliyun.core.annotation.NameInMap("EvaluationSpec")
        private java.util.Map<String, ?> evaluationSpec;

        @com.aliyun.core.annotation.NameInMap("InferenceSpec")
        private java.util.Map<String, ?> inferenceSpec;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List<Labels> labels;

        @com.aliyun.core.annotation.NameInMap("Metrics")
        private java.util.Map<String, ?> metrics;

        @com.aliyun.core.annotation.NameInMap("OutputChannelName")
        private String outputChannelName;

        @com.aliyun.core.annotation.NameInMap("SourceId")
        private String sourceId;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("TrainingSpec")
        private java.util.Map<String, ?> trainingSpec;

        @com.aliyun.core.annotation.NameInMap("Uri")
        private String uri;

        private OutputModels(Builder builder) {
            this.compressionSpec = builder.compressionSpec;
            this.evaluationSpec = builder.evaluationSpec;
            this.inferenceSpec = builder.inferenceSpec;
            this.labels = builder.labels;
            this.metrics = builder.metrics;
            this.outputChannelName = builder.outputChannelName;
            this.sourceId = builder.sourceId;
            this.sourceType = builder.sourceType;
            this.trainingSpec = builder.trainingSpec;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputModels create() {
            return builder().build();
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
         * @return outputChannelName
         */
        public String getOutputChannelName() {
            return this.outputChannelName;
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

        public static final class Builder {
            private java.util.Map<String, ?> compressionSpec; 
            private java.util.Map<String, ?> evaluationSpec; 
            private java.util.Map<String, ?> inferenceSpec; 
            private java.util.List<Labels> labels; 
            private java.util.Map<String, ?> metrics; 
            private String outputChannelName; 
            private String sourceId; 
            private String sourceType; 
            private java.util.Map<String, ?> trainingSpec; 
            private String uri; 

            private Builder() {
            } 

            private Builder(OutputModels model) {
                this.compressionSpec = model.compressionSpec;
                this.evaluationSpec = model.evaluationSpec;
                this.inferenceSpec = model.inferenceSpec;
                this.labels = model.labels;
                this.metrics = model.metrics;
                this.outputChannelName = model.outputChannelName;
                this.sourceId = model.sourceId;
                this.sourceType = model.sourceType;
                this.trainingSpec = model.trainingSpec;
                this.uri = model.uri;
            } 

            /**
             * CompressionSpec.
             */
            public Builder compressionSpec(java.util.Map<String, ?> compressionSpec) {
                this.compressionSpec = compressionSpec;
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
             * OutputChannelName.
             */
            public Builder outputChannelName(String outputChannelName) {
                this.outputChannelName = outputChannelName;
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

            public OutputModels build() {
                return new OutputModels(this);
            } 

        } 

    }
}
