// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paimodelgallery20250630.models;

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
 * {@link DistillationTemplateSummary} extends {@link TeaModel}
 *
 * <p>DistillationTemplateSummary</p>
 */
public class DistillationTemplateSummary extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CapabilityTags")
    private java.util.List<String> capabilityTags;

    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("JobType")
    private String jobType;

    @com.aliyun.core.annotation.NameInMap("OrderNumber")
    private Integer orderNumber;

    @com.aliyun.core.annotation.NameInMap("PipelineStages")
    private java.util.List<PipelineStages> pipelineStages;

    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.NameInMap("TrainingOptions")
    private java.util.List<TrainingOptions> trainingOptions;

    private DistillationTemplateSummary(Builder builder) {
        this.capabilityTags = builder.capabilityTags;
        this.category = builder.category;
        this.description = builder.description;
        this.jobType = builder.jobType;
        this.orderNumber = builder.orderNumber;
        this.pipelineStages = builder.pipelineStages;
        this.templateId = builder.templateId;
        this.templateName = builder.templateName;
        this.trainingOptions = builder.trainingOptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DistillationTemplateSummary create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return capabilityTags
     */
    public java.util.List<String> getCapabilityTags() {
        return this.capabilityTags;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return orderNumber
     */
    public Integer getOrderNumber() {
        return this.orderNumber;
    }

    /**
     * @return pipelineStages
     */
    public java.util.List<PipelineStages> getPipelineStages() {
        return this.pipelineStages;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return trainingOptions
     */
    public java.util.List<TrainingOptions> getTrainingOptions() {
        return this.trainingOptions;
    }

    public static final class Builder {
        private java.util.List<String> capabilityTags; 
        private String category; 
        private String description; 
        private String jobType; 
        private Integer orderNumber; 
        private java.util.List<PipelineStages> pipelineStages; 
        private String templateId; 
        private String templateName; 
        private java.util.List<TrainingOptions> trainingOptions; 

        private Builder() {
        } 

        private Builder(DistillationTemplateSummary model) {
            this.capabilityTags = model.capabilityTags;
            this.category = model.category;
            this.description = model.description;
            this.jobType = model.jobType;
            this.orderNumber = model.orderNumber;
            this.pipelineStages = model.pipelineStages;
            this.templateId = model.templateId;
            this.templateName = model.templateName;
            this.trainingOptions = model.trainingOptions;
        } 

        /**
         * <p>The list of capability tags, used for scenario card display.</p>
         */
        public Builder capabilityTags(java.util.List<String> capabilityTags) {
            this.capabilityTags = capabilityTags;
            return this;
        }

        /**
         * <p>The template category. The frontend uses this value to filter scenario cards.</p>
         * 
         * <strong>example:</strong>
         * <p>reasoning</p>
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * <p>The template description, localized based on the language specified in the request. The description specifies applicable scenarios and outputs.</p>
         * 
         * <strong>example:</strong>
         * <p>Designed for scenarios that require multi-step reasoning, such as math, logic, and code. Produces an SFT dataset</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The algorithm job type. The value is the same as TemplateId.</p>
         * 
         * <strong>example:</strong>
         * <p>advanced_cot_distill</p>
         */
        public Builder jobType(String jobType) {
            this.jobType = jobType;
            return this;
        }

        /**
         * <p>The display order. A smaller value indicates a higher position.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder orderNumber(Integer orderNumber) {
            this.orderNumber = orderNumber;
            return this;
        }

        /**
         * <p>The list of pipeline stages. The order of the stages represents the execution order.</p>
         */
        public Builder pipelineStages(java.util.List<PipelineStages> pipelineStages) {
            this.pipelineStages = pipelineStages;
            return this;
        }

        /**
         * <p>The distillation template ID, which is the same as the algorithm job_type. Pass this value as TemplateId when creating a task plan.</p>
         * 
         * <strong>example:</strong>
         * <p>advanced_cot_distill</p>
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The template display name, localized based on the language specified in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>Chain-of-Thought Reasoning Distillation</p>
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>The capability declaration for the second stage, in which the distilled data is used to train the student model. An empty value indicates that the template supports only the distillation stage.</p>
         */
        public Builder trainingOptions(java.util.List<TrainingOptions> trainingOptions) {
            this.trainingOptions = trainingOptions;
            return this;
        }

        public DistillationTemplateSummary build() {
            return new DistillationTemplateSummary(this);
        } 

    } 

    /**
     * 
     * {@link DistillationTemplateSummary} extends {@link TeaModel}
     *
     * <p>DistillationTemplateSummary</p>
     */
    public static class PipelineStages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private PipelineStages(Builder builder) {
            this.description = builder.description;
            this.key = builder.key;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PipelineStages create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String description; 
            private String key; 
            private String name; 

            private Builder() {
            } 

            private Builder(PipelineStages model) {
                this.description = model.description;
                this.key = model.key;
                this.name = model.name;
            } 

            /**
             * <p>The stage description, localized based on the language specified in the request.</p>
             * 
             * <strong>example:</strong>
             * <p>The teacher model generates reasoning-augmented responses for each question</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The stage identifier, which corresponds to the pipeline[].stage value in the algorithm configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>cot_distill</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The stage display name, localized based on the language specified in the request.</p>
             * 
             * <strong>example:</strong>
             * <p>Generate Chain-of-Thought</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public PipelineStages build() {
                return new PipelineStages(this);
            } 

        } 

    }
    /**
     * 
     * {@link DistillationTemplateSummary} extends {@link TeaModel}
     *
     * <p>DistillationTemplateSummary</p>
     */
    public static class TrainingOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModelTasks")
        private java.util.List<String> modelTasks;

        @com.aliyun.core.annotation.NameInMap("TrainingMethods")
        private java.util.List<String> trainingMethods;

        @com.aliyun.core.annotation.NameInMap("TrainingType")
        private String trainingType;

        private TrainingOptions(Builder builder) {
            this.modelTasks = builder.modelTasks;
            this.trainingMethods = builder.trainingMethods;
            this.trainingType = builder.trainingType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrainingOptions create() {
            return builder().build();
        }

        /**
         * @return modelTasks
         */
        public java.util.List<String> getModelTasks() {
            return this.modelTasks;
        }

        /**
         * @return trainingMethods
         */
        public java.util.List<String> getTrainingMethods() {
            return this.trainingMethods;
        }

        /**
         * @return trainingType
         */
        public String getTrainingType() {
            return this.trainingType;
        }

        public static final class Builder {
            private java.util.List<String> modelTasks; 
            private java.util.List<String> trainingMethods; 
            private String trainingType; 

            private Builder() {
            } 

            private Builder(TrainingOptions model) {
                this.modelTasks = model.modelTasks;
                this.trainingMethods = model.trainingMethods;
                this.trainingType = model.trainingType;
            } 

            /**
             * <p>The available Model Gallery Task values for the student model.</p>
             */
            public Builder modelTasks(java.util.List<String> modelTasks) {
                this.modelTasks = modelTasks;
                return this;
            }

            /**
             * <p>The list of supported training method families.</p>
             */
            public Builder trainingMethods(java.util.List<String> trainingMethods) {
                this.trainingMethods = trainingMethods;
                return this;
            }

            /**
             * <p>The training type. The frontend uses this value to select the training workflow and display text.</p>
             * 
             * <strong>example:</strong>
             * <p>sft</p>
             */
            public Builder trainingType(String trainingType) {
                this.trainingType = trainingType;
                return this;
            }

            public TrainingOptions build() {
                return new TrainingOptions(this);
            } 

        } 

    }
}
