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
 * {@link DistillationTemplate} extends {@link TeaModel}
 *
 * <p>DistillationTemplate</p>
 */
public class DistillationTemplate extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlgorithmName")
    private String algorithmName;

    @com.aliyun.core.annotation.NameInMap("AlgorithmProvider")
    private String algorithmProvider;

    @com.aliyun.core.annotation.NameInMap("AlgorithmVersion")
    private String algorithmVersion;

    @com.aliyun.core.annotation.NameInMap("CapabilityTags")
    private java.util.List<String> capabilityTags;

    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("DefaultConfig")
    private String defaultConfig;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("InputDatasetMustBeDirectory")
    private Boolean inputDatasetMustBeDirectory;

    @com.aliyun.core.annotation.NameInMap("InputExampleUri")
    private String inputExampleUri;

    @com.aliyun.core.annotation.NameInMap("JobType")
    private String jobType;

    @com.aliyun.core.annotation.NameInMap("ModelSlots")
    private java.util.List<ModelSlots> modelSlots;

    @com.aliyun.core.annotation.NameInMap("OrderNumber")
    private Integer orderNumber;

    @com.aliyun.core.annotation.NameInMap("PipelineStages")
    private java.util.List<PipelineStages> pipelineStages;

    @com.aliyun.core.annotation.NameInMap("PresetConfig")
    private java.util.List<PresetConfig> presetConfig;

    @com.aliyun.core.annotation.NameInMap("ProcessorExampleUri")
    private String processorExampleUri;

    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.NameInMap("TemplateKind")
    private String templateKind;

    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.NameInMap("TrainingOptions")
    private java.util.List<TrainingOptions> trainingOptions;

    private DistillationTemplate(Builder builder) {
        this.algorithmName = builder.algorithmName;
        this.algorithmProvider = builder.algorithmProvider;
        this.algorithmVersion = builder.algorithmVersion;
        this.capabilityTags = builder.capabilityTags;
        this.category = builder.category;
        this.defaultConfig = builder.defaultConfig;
        this.description = builder.description;
        this.inputDatasetMustBeDirectory = builder.inputDatasetMustBeDirectory;
        this.inputExampleUri = builder.inputExampleUri;
        this.jobType = builder.jobType;
        this.modelSlots = builder.modelSlots;
        this.orderNumber = builder.orderNumber;
        this.pipelineStages = builder.pipelineStages;
        this.presetConfig = builder.presetConfig;
        this.processorExampleUri = builder.processorExampleUri;
        this.templateId = builder.templateId;
        this.templateKind = builder.templateKind;
        this.templateName = builder.templateName;
        this.trainingOptions = builder.trainingOptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DistillationTemplate create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithmName
     */
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    /**
     * @return algorithmProvider
     */
    public String getAlgorithmProvider() {
        return this.algorithmProvider;
    }

    /**
     * @return algorithmVersion
     */
    public String getAlgorithmVersion() {
        return this.algorithmVersion;
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
     * @return defaultConfig
     */
    public String getDefaultConfig() {
        return this.defaultConfig;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return inputDatasetMustBeDirectory
     */
    public Boolean getInputDatasetMustBeDirectory() {
        return this.inputDatasetMustBeDirectory;
    }

    /**
     * @return inputExampleUri
     */
    public String getInputExampleUri() {
        return this.inputExampleUri;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return modelSlots
     */
    public java.util.List<ModelSlots> getModelSlots() {
        return this.modelSlots;
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
     * @return presetConfig
     */
    public java.util.List<PresetConfig> getPresetConfig() {
        return this.presetConfig;
    }

    /**
     * @return processorExampleUri
     */
    public String getProcessorExampleUri() {
        return this.processorExampleUri;
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
        private String algorithmName; 
        private String algorithmProvider; 
        private String algorithmVersion; 
        private java.util.List<String> capabilityTags; 
        private String category; 
        private String defaultConfig; 
        private String description; 
        private Boolean inputDatasetMustBeDirectory; 
        private String inputExampleUri; 
        private String jobType; 
        private java.util.List<ModelSlots> modelSlots; 
        private Integer orderNumber; 
        private java.util.List<PipelineStages> pipelineStages; 
        private java.util.List<PresetConfig> presetConfig; 
        private String processorExampleUri; 
        private String templateId; 
        private String templateKind; 
        private String templateName; 
        private java.util.List<TrainingOptions> trainingOptions; 

        private Builder() {
        } 

        private Builder(DistillationTemplate model) {
            this.algorithmName = model.algorithmName;
            this.algorithmProvider = model.algorithmProvider;
            this.algorithmVersion = model.algorithmVersion;
            this.capabilityTags = model.capabilityTags;
            this.category = model.category;
            this.defaultConfig = model.defaultConfig;
            this.description = model.description;
            this.inputDatasetMustBeDirectory = model.inputDatasetMustBeDirectory;
            this.inputExampleUri = model.inputExampleUri;
            this.jobType = model.jobType;
            this.modelSlots = model.modelSlots;
            this.orderNumber = model.orderNumber;
            this.pipelineStages = model.pipelineStages;
            this.presetConfig = model.presetConfig;
            this.processorExampleUri = model.processorExampleUri;
            this.templateId = model.templateId;
            this.templateKind = model.templateKind;
            this.templateName = model.templateName;
            this.trainingOptions = model.trainingOptions;
        } 

        /**
         * AlgorithmName.
         */
        public Builder algorithmName(String algorithmName) {
            this.algorithmName = algorithmName;
            return this;
        }

        /**
         * AlgorithmProvider.
         */
        public Builder algorithmProvider(String algorithmProvider) {
            this.algorithmProvider = algorithmProvider;
            return this;
        }

        /**
         * AlgorithmVersion.
         */
        public Builder algorithmVersion(String algorithmVersion) {
            this.algorithmVersion = algorithmVersion;
            return this;
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
         * DefaultConfig.
         */
        public Builder defaultConfig(String defaultConfig) {
            this.defaultConfig = defaultConfig;
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
         * InputDatasetMustBeDirectory.
         */
        public Builder inputDatasetMustBeDirectory(Boolean inputDatasetMustBeDirectory) {
            this.inputDatasetMustBeDirectory = inputDatasetMustBeDirectory;
            return this;
        }

        /**
         * InputExampleUri.
         */
        public Builder inputExampleUri(String inputExampleUri) {
            this.inputExampleUri = inputExampleUri;
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
         * ModelSlots.
         */
        public Builder modelSlots(java.util.List<ModelSlots> modelSlots) {
            this.modelSlots = modelSlots;
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
         * PresetConfig.
         */
        public Builder presetConfig(java.util.List<PresetConfig> presetConfig) {
            this.presetConfig = presetConfig;
            return this;
        }

        /**
         * ProcessorExampleUri.
         */
        public Builder processorExampleUri(String processorExampleUri) {
            this.processorExampleUri = processorExampleUri;
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

        public DistillationTemplate build() {
            return new DistillationTemplate(this);
        } 

    } 

    /**
     * 
     * {@link DistillationTemplate} extends {@link TeaModel}
     *
     * <p>DistillationTemplate</p>
     */
    public static class Backends extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Channel")
        private String channel;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Backends(Builder builder) {
            this.channel = builder.channel;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Backends create() {
            return builder().build();
        }

        /**
         * @return channel
         */
        public String getChannel() {
            return this.channel;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String channel; 
            private String type; 

            private Builder() {
            } 

            private Builder(Backends model) {
                this.channel = model.channel;
                this.type = model.type;
            } 

            /**
             * Channel.
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Backends build() {
                return new Backends(this);
            } 

        } 

    }
    /**
     * 
     * {@link DistillationTemplate} extends {@link TeaModel}
     *
     * <p>DistillationTemplate</p>
     */
    public static class ModelSlots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Backends")
        private java.util.List<Backends> backends;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Required")
        private Boolean required;

        private ModelSlots(Builder builder) {
            this.backends = builder.backends;
            this.description = builder.description;
            this.key = builder.key;
            this.name = builder.name;
            this.required = builder.required;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelSlots create() {
            return builder().build();
        }

        /**
         * @return backends
         */
        public java.util.List<Backends> getBackends() {
            return this.backends;
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

        /**
         * @return required
         */
        public Boolean getRequired() {
            return this.required;
        }

        public static final class Builder {
            private java.util.List<Backends> backends; 
            private String description; 
            private String key; 
            private String name; 
            private Boolean required; 

            private Builder() {
            } 

            private Builder(ModelSlots model) {
                this.backends = model.backends;
                this.description = model.description;
                this.key = model.key;
                this.name = model.name;
                this.required = model.required;
            } 

            /**
             * Backends.
             */
            public Builder backends(java.util.List<Backends> backends) {
                this.backends = backends;
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

            /**
             * Required.
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            public ModelSlots build() {
                return new ModelSlots(this);
            } 

        } 

    }
    /**
     * 
     * {@link DistillationTemplate} extends {@link TeaModel}
     *
     * <p>DistillationTemplate</p>
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
     * {@link DistillationTemplate} extends {@link TeaModel}
     *
     * <p>DistillationTemplate</p>
     */
    public static class PresetConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private PresetConfig(Builder builder) {
            this.label = builder.label;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PresetConfig create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String label; 
            private String value; 

            private Builder() {
            } 

            private Builder(PresetConfig model) {
                this.label = model.label;
                this.value = model.value;
            } 

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public PresetConfig build() {
                return new PresetConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DistillationTemplate} extends {@link TeaModel}
     *
     * <p>DistillationTemplate</p>
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
