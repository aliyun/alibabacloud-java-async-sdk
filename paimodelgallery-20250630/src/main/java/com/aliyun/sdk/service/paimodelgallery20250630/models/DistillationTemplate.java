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

    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

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
        this.templateId = builder.templateId;
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
        private String templateId; 
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
            this.templateId = model.templateId;
            this.templateName = model.templateName;
            this.trainingOptions = model.trainingOptions;
        } 

        /**
         * <p>The algorithm name.</p>
         * 
         * <strong>example:</strong>
         * <p>easydistill</p>
         */
        public Builder algorithmName(String algorithmName) {
            this.algorithmName = algorithmName;
            return this;
        }

        /**
         * <p>The algorithm provider.</p>
         * 
         * <strong>example:</strong>
         * <p>pai</p>
         */
        public Builder algorithmProvider(String algorithmProvider) {
            this.algorithmProvider = algorithmProvider;
            return this;
        }

        /**
         * <p>The algorithm version.</p>
         * 
         * <strong>example:</strong>
         * <p>v2.0.0</p>
         */
        public Builder algorithmVersion(String algorithmVersion) {
            this.algorithmVersion = algorithmVersion;
            return this;
        }

        /**
         * <p>The list of capability tags used for displaying scenario cards.</p>
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
         * <p>The raw YAML content of the EasyDistill default configurations. The frontend uses this content for rendering the configuration form and supports recovering to default configurations. The model and credential fields are intentionally left empty and are populated by the user in the form upon commit.</p>
         * 
         * <strong>example:</strong>
         * <p>job_type: advanced_cot_distill</p>
         */
        public Builder defaultConfig(String defaultConfig) {
            this.defaultConfig = defaultConfig;
            return this;
        }

        /**
         * <p>The template description, localized based on the requested language. The description specifies the applicable scenarios and outputs.</p>
         * 
         * <strong>example:</strong>
         * <p>Designed for scenarios that require multi-step reasoning such as math, logic, and code. Produces an SFT dataset</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether the input data must be an entire directory. If this parameter is set to true, only a directory can be selected on the form, not a single file. If this parameter is absent or set to false, either a file or a directory can be selected. This value is true when seed files reference other files in the same directory by relative path.</p>
         */
        public Builder inputDatasetMustBeDirectory(Boolean inputDatasetMustBeDirectory) {
            this.inputDatasetMustBeDirectory = inputDatasetMustBeDirectory;
            return this;
        }

        /**
         * <p>The OSS address of the sample input data, rendered based on the region. Users can download the sample and prepare their own data in the same format. An empty value indicates that the template does not provide a sample.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://pai-quickstart-cn-hangzhou.oss-cn-hangzhou-internal.aliyuncs.com/public_datasets/distillation_examples/advanced_cot_distill/input.jsonl</p>
         */
        public Builder inputExampleUri(String inputExampleUri) {
            this.inputExampleUri = inputExampleUri;
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
         * <p>The list of model slots that require user selection. The frontend uses this list to render the model selection form.</p>
         */
        public Builder modelSlots(java.util.List<ModelSlots> modelSlots) {
            this.modelSlots = modelSlots;
            return this;
        }

        /**
         * <p>The display order. A smaller value indicates a higher priority.</p>
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
         * <p>The content of the preset configuration card, displayed in order to show the key default configurations of the template.</p>
         */
        public Builder presetConfig(java.util.List<PresetConfig> presetConfig) {
            this.presetConfig = presetConfig;
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
         * <p>The template display name, localized based on the requested language.</p>
         * 
         * <strong>example:</strong>
         * <p>Chain-of-thought reasoning distillation</p>
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>The capability declaration for the second stage (training the student model with the distilled data). An empty value indicates that the template supports only the distillation stage.</p>
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
             * <p>The channel name of the PAI-Token gateway. The frontend uses this value to retrieve the list of available models for the channel. This value must be passed back as-is upon submission. This parameter is returned only when Type is pai_token.</p>
             * 
             * <strong>example:</strong>
             * <p>distillation</p>
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * <p>The model access method. pai_token indicates the PAI-Token gateway, where the user selects from the list of available models for the channel. pai_eas indicates the user\&quot;s own PAI-EAS service instance, which requires the service address and token.</p>
             * 
             * <strong>example:</strong>
             * <p>pai_token</p>
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
             * <p>The list of model access methods supported by this slot.</p>
             */
            public Builder backends(java.util.List<Backends> backends) {
                this.backends = backends;
                return this;
            }

            /**
             * <p>The slot description, localized based on the requested language.</p>
             * 
             * <strong>example:</strong>
             * <p>The teacher model used to generate distillation data. We recommend selecting a model with strong reasoning capabilities</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The slot identifier, which corresponds to the backend section name in the submitted configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>backend</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The slot display name, localized based on the requested language.</p>
             * 
             * <strong>example:</strong>
             * <p>Teacher model</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Specifies whether this slot is required. If this parameter is set to false, the user can skip the selection, and the algorithm falls back to other slots.</p>
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
             * <p>The stage description, localized based on the requested language.</p>
             * 
             * <strong>example:</strong>
             * <p>The teacher model generates responses with reasoning processes for each question</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The stage identifier, which corresponds to the value of pipeline[].stage in the algorithm configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>cot_distill</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The stage display name, localized based on the requested language.</p>
             * 
             * <strong>example:</strong>
             * <p>Generate chain of thought</p>
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
             * <p>The configuration item name, localized based on the requested language. Names are matched by position across languages, so the same row can have different names in different languages.</p>
             * 
             * <strong>example:</strong>
             * <p>Task type</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The configuration item value, localized based on the requested language.</p>
             * 
             * <strong>example:</strong>
             * <p>advanced_cot_distill</p>
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
             * <p>The range of Model Gallery tasks available for the student model.</p>
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
