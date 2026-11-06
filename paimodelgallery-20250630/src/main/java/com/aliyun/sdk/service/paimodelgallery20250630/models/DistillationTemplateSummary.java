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

    @com.aliyun.core.annotation.NameInMap("TemplateKind")
    private String templateKind;

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
        this.templateKind = builder.templateKind;
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
     * @return templateKind
     */
    public String getTemplateKind() {
        return this.templateKind;
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
        private String templateKind; 
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
            this.templateKind = model.templateKind;
            this.templateName = model.templateName;
            this.trainingOptions = model.trainingOptions;
        } 

        /**
         * CapabilityTags.
         */
        public Builder capabilityTags(java.util.List<String> capabilityTags) {
            this.capabilityTags = capabilityTags;
            return this;
        }

        /**
         * Category.
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * JobType.
         */
        public Builder jobType(String jobType) {
            this.jobType = jobType;
            return this;
        }

        /**
         * OrderNumber.
         */
        public Builder orderNumber(Integer orderNumber) {
            this.orderNumber = orderNumber;
            return this;
        }

        /**
         * PipelineStages.
         */
        public Builder pipelineStages(java.util.List<PipelineStages> pipelineStages) {
            this.pipelineStages = pipelineStages;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * TemplateKind.
         */
        public Builder templateKind(String templateKind) {
            this.templateKind = templateKind;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        /**
         * TrainingOptions.
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Name.
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
             * ModelTasks.
             */
            public Builder modelTasks(java.util.List<String> modelTasks) {
                this.modelTasks = modelTasks;
                return this;
            }

            /**
             * TrainingMethods.
             */
            public Builder trainingMethods(java.util.List<String> trainingMethods) {
                this.trainingMethods = trainingMethods;
                return this;
            }

            /**
             * TrainingType.
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
