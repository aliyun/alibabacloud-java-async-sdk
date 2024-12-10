// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateTrainingJobRequest} extends {@link RequestModel}
 *
 * <p>CreateTrainingJobRequest</p>
 */
public class CreateTrainingJobRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlgorithmName")
    private String algorithmName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlgorithmProvider")
    private String algorithmProvider;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlgorithmSpec")
    private AlgorithmSpec algorithmSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlgorithmVersion")
    private String algorithmVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CodeDir")
    private Location codeDir;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ComputeResource")
    private ComputeResource computeResource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Environments")
    private java.util.Map < String, String > environments;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExperimentConfig")
    private ExperimentConfig experimentConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HyperParameters")
    private java.util.List < HyperParameters> hyperParameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InputChannels")
    private java.util.List < InputChannels> inputChannels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List < Labels> labels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OutputChannels")
    private java.util.List < OutputChannels> outputChannels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PythonRequirements")
    private java.util.List < String > pythonRequirements;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleArn")
    private String roleArn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Scheduler")
    private Scheduler scheduler;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Settings")
    private JobSettings settings;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TrainingJobDescription")
    private String trainingJobDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TrainingJobName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trainingJobName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserVpc")
    private UserVpc userVpc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CreateTrainingJobRequest(Builder builder) {
        super(builder);
        this.algorithmName = builder.algorithmName;
        this.algorithmProvider = builder.algorithmProvider;
        this.algorithmSpec = builder.algorithmSpec;
        this.algorithmVersion = builder.algorithmVersion;
        this.codeDir = builder.codeDir;
        this.computeResource = builder.computeResource;
        this.environments = builder.environments;
        this.experimentConfig = builder.experimentConfig;
        this.hyperParameters = builder.hyperParameters;
        this.inputChannels = builder.inputChannels;
        this.labels = builder.labels;
        this.outputChannels = builder.outputChannels;
        this.priority = builder.priority;
        this.pythonRequirements = builder.pythonRequirements;
        this.roleArn = builder.roleArn;
        this.scheduler = builder.scheduler;
        this.settings = builder.settings;
        this.trainingJobDescription = builder.trainingJobDescription;
        this.trainingJobName = builder.trainingJobName;
        this.userVpc = builder.userVpc;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTrainingJobRequest create() {
        return builder().build();
    }

    @Override
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
     * @return algorithmSpec
     */
    public AlgorithmSpec getAlgorithmSpec() {
        return this.algorithmSpec;
    }

    /**
     * @return algorithmVersion
     */
    public String getAlgorithmVersion() {
        return this.algorithmVersion;
    }

    /**
     * @return codeDir
     */
    public Location getCodeDir() {
        return this.codeDir;
    }

    /**
     * @return computeResource
     */
    public ComputeResource getComputeResource() {
        return this.computeResource;
    }

    /**
     * @return environments
     */
    public java.util.Map < String, String > getEnvironments() {
        return this.environments;
    }

    /**
     * @return experimentConfig
     */
    public ExperimentConfig getExperimentConfig() {
        return this.experimentConfig;
    }

    /**
     * @return hyperParameters
     */
    public java.util.List < HyperParameters> getHyperParameters() {
        return this.hyperParameters;
    }

    /**
     * @return inputChannels
     */
    public java.util.List < InputChannels> getInputChannels() {
        return this.inputChannels;
    }

    /**
     * @return labels
     */
    public java.util.List < Labels> getLabels() {
        return this.labels;
    }

    /**
     * @return outputChannels
     */
    public java.util.List < OutputChannels> getOutputChannels() {
        return this.outputChannels;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return pythonRequirements
     */
    public java.util.List < String > getPythonRequirements() {
        return this.pythonRequirements;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return scheduler
     */
    public Scheduler getScheduler() {
        return this.scheduler;
    }

    /**
     * @return settings
     */
    public JobSettings getSettings() {
        return this.settings;
    }

    /**
     * @return trainingJobDescription
     */
    public String getTrainingJobDescription() {
        return this.trainingJobDescription;
    }

    /**
     * @return trainingJobName
     */
    public String getTrainingJobName() {
        return this.trainingJobName;
    }

    /**
     * @return userVpc
     */
    public UserVpc getUserVpc() {
        return this.userVpc;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateTrainingJobRequest, Builder> {
        private String algorithmName; 
        private String algorithmProvider; 
        private AlgorithmSpec algorithmSpec; 
        private String algorithmVersion; 
        private Location codeDir; 
        private ComputeResource computeResource; 
        private java.util.Map < String, String > environments; 
        private ExperimentConfig experimentConfig; 
        private java.util.List < HyperParameters> hyperParameters; 
        private java.util.List < InputChannels> inputChannels; 
        private java.util.List < Labels> labels; 
        private java.util.List < OutputChannels> outputChannels; 
        private Integer priority; 
        private java.util.List < String > pythonRequirements; 
        private String roleArn; 
        private Scheduler scheduler; 
        private JobSettings settings; 
        private String trainingJobDescription; 
        private String trainingJobName; 
        private UserVpc userVpc; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateTrainingJobRequest request) {
            super(request);
            this.algorithmName = request.algorithmName;
            this.algorithmProvider = request.algorithmProvider;
            this.algorithmSpec = request.algorithmSpec;
            this.algorithmVersion = request.algorithmVersion;
            this.codeDir = request.codeDir;
            this.computeResource = request.computeResource;
            this.environments = request.environments;
            this.experimentConfig = request.experimentConfig;
            this.hyperParameters = request.hyperParameters;
            this.inputChannels = request.inputChannels;
            this.labels = request.labels;
            this.outputChannels = request.outputChannels;
            this.priority = request.priority;
            this.pythonRequirements = request.pythonRequirements;
            this.roleArn = request.roleArn;
            this.scheduler = request.scheduler;
            this.settings = request.settings;
            this.trainingJobDescription = request.trainingJobDescription;
            this.trainingJobName = request.trainingJobName;
            this.userVpc = request.userVpc;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * AlgorithmName.
         */
        public Builder algorithmName(String algorithmName) {
            this.putBodyParameter("AlgorithmName", algorithmName);
            this.algorithmName = algorithmName;
            return this;
        }

        /**
         * AlgorithmProvider.
         */
        public Builder algorithmProvider(String algorithmProvider) {
            this.putBodyParameter("AlgorithmProvider", algorithmProvider);
            this.algorithmProvider = algorithmProvider;
            return this;
        }

        /**
         * AlgorithmSpec.
         */
        public Builder algorithmSpec(AlgorithmSpec algorithmSpec) {
            this.putBodyParameter("AlgorithmSpec", algorithmSpec);
            this.algorithmSpec = algorithmSpec;
            return this;
        }

        /**
         * AlgorithmVersion.
         */
        public Builder algorithmVersion(String algorithmVersion) {
            this.putBodyParameter("AlgorithmVersion", algorithmVersion);
            this.algorithmVersion = algorithmVersion;
            return this;
        }

        /**
         * CodeDir.
         */
        public Builder codeDir(Location codeDir) {
            this.putBodyParameter("CodeDir", codeDir);
            this.codeDir = codeDir;
            return this;
        }

        /**
         * ComputeResource.
         */
        public Builder computeResource(ComputeResource computeResource) {
            this.putBodyParameter("ComputeResource", computeResource);
            this.computeResource = computeResource;
            return this;
        }

        /**
         * Environments.
         */
        public Builder environments(java.util.Map < String, String > environments) {
            this.putBodyParameter("Environments", environments);
            this.environments = environments;
            return this;
        }

        /**
         * ExperimentConfig.
         */
        public Builder experimentConfig(ExperimentConfig experimentConfig) {
            this.putBodyParameter("ExperimentConfig", experimentConfig);
            this.experimentConfig = experimentConfig;
            return this;
        }

        /**
         * HyperParameters.
         */
        public Builder hyperParameters(java.util.List < HyperParameters> hyperParameters) {
            this.putBodyParameter("HyperParameters", hyperParameters);
            this.hyperParameters = hyperParameters;
            return this;
        }

        /**
         * InputChannels.
         */
        public Builder inputChannels(java.util.List < InputChannels> inputChannels) {
            this.putBodyParameter("InputChannels", inputChannels);
            this.inputChannels = inputChannels;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.List < Labels> labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * OutputChannels.
         */
        public Builder outputChannels(java.util.List < OutputChannels> outputChannels) {
            this.putBodyParameter("OutputChannels", outputChannels);
            this.outputChannels = outputChannels;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(Integer priority) {
            this.putBodyParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * PythonRequirements.
         */
        public Builder pythonRequirements(java.util.List < String > pythonRequirements) {
            this.putBodyParameter("PythonRequirements", pythonRequirements);
            this.pythonRequirements = pythonRequirements;
            return this;
        }

        /**
         * RoleArn.
         */
        public Builder roleArn(String roleArn) {
            this.putBodyParameter("RoleArn", roleArn);
            this.roleArn = roleArn;
            return this;
        }

        /**
         * Scheduler.
         */
        public Builder scheduler(Scheduler scheduler) {
            this.putBodyParameter("Scheduler", scheduler);
            this.scheduler = scheduler;
            return this;
        }

        /**
         * Settings.
         */
        public Builder settings(JobSettings settings) {
            this.putBodyParameter("Settings", settings);
            this.settings = settings;
            return this;
        }

        /**
         * TrainingJobDescription.
         */
        public Builder trainingJobDescription(String trainingJobDescription) {
            this.putBodyParameter("TrainingJobDescription", trainingJobDescription);
            this.trainingJobDescription = trainingJobDescription;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen_llm</p>
         */
        public Builder trainingJobName(String trainingJobName) {
            this.putBodyParameter("TrainingJobName", trainingJobName);
            this.trainingJobName = trainingJobName;
            return this;
        }

        /**
         * UserVpc.
         */
        public Builder userVpc(UserVpc userVpc) {
            this.putBodyParameter("UserVpc", userVpc);
            this.userVpc = userVpc;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateTrainingJobRequest build() {
            return new CreateTrainingJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateTrainingJobRequest} extends {@link TeaModel}
     *
     * <p>CreateTrainingJobRequest</p>
     */
    public static class InstanceSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CPU")
        private String CPU;

        @com.aliyun.core.annotation.NameInMap("GPU")
        private String GPU;

        @com.aliyun.core.annotation.NameInMap("GPUType")
        private String GPUType;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private String memory;

        @com.aliyun.core.annotation.NameInMap("SharedMemory")
        private String sharedMemory;

        private InstanceSpec(Builder builder) {
            this.CPU = builder.CPU;
            this.GPU = builder.GPU;
            this.GPUType = builder.GPUType;
            this.memory = builder.memory;
            this.sharedMemory = builder.sharedMemory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceSpec create() {
            return builder().build();
        }

        /**
         * @return CPU
         */
        public String getCPU() {
            return this.CPU;
        }

        /**
         * @return GPU
         */
        public String getGPU() {
            return this.GPU;
        }

        /**
         * @return GPUType
         */
        public String getGPUType() {
            return this.GPUType;
        }

        /**
         * @return memory
         */
        public String getMemory() {
            return this.memory;
        }

        /**
         * @return sharedMemory
         */
        public String getSharedMemory() {
            return this.sharedMemory;
        }

        public static final class Builder {
            private String CPU; 
            private String GPU; 
            private String GPUType; 
            private String memory; 
            private String sharedMemory; 

            /**
             * CPU.
             */
            public Builder CPU(String CPU) {
                this.CPU = CPU;
                return this;
            }

            /**
             * GPU.
             */
            public Builder GPU(String GPU) {
                this.GPU = GPU;
                return this;
            }

            /**
             * GPUType.
             */
            public Builder GPUType(String GPUType) {
                this.GPUType = GPUType;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * SharedMemory.
             */
            public Builder sharedMemory(String sharedMemory) {
                this.sharedMemory = sharedMemory;
                return this;
            }

            public InstanceSpec build() {
                return new InstanceSpec(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTrainingJobRequest} extends {@link TeaModel}
     *
     * <p>CreateTrainingJobRequest</p>
     */
    public static class SpotSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SpotDiscountLimit")
        private Float spotDiscountLimit;

        @com.aliyun.core.annotation.NameInMap("SpotStrategy")
        private String spotStrategy;

        private SpotSpec(Builder builder) {
            this.spotDiscountLimit = builder.spotDiscountLimit;
            this.spotStrategy = builder.spotStrategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpotSpec create() {
            return builder().build();
        }

        /**
         * @return spotDiscountLimit
         */
        public Float getSpotDiscountLimit() {
            return this.spotDiscountLimit;
        }

        /**
         * @return spotStrategy
         */
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public static final class Builder {
            private Float spotDiscountLimit; 
            private String spotStrategy; 

            /**
             * SpotDiscountLimit.
             */
            public Builder spotDiscountLimit(Float spotDiscountLimit) {
                this.spotDiscountLimit = spotDiscountLimit;
                return this;
            }

            /**
             * SpotStrategy.
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            public SpotSpec build() {
                return new SpotSpec(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTrainingJobRequest} extends {@link TeaModel}
     *
     * <p>CreateTrainingJobRequest</p>
     */
    public static class ComputeResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EcsCount")
        private Long ecsCount;

        @com.aliyun.core.annotation.NameInMap("EcsSpec")
        private String ecsSpec;

        @com.aliyun.core.annotation.NameInMap("InstanceCount")
        private Long instanceCount;

        @com.aliyun.core.annotation.NameInMap("InstanceSpec")
        private InstanceSpec instanceSpec;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("SpotSpec")
        private SpotSpec spotSpec;

        @com.aliyun.core.annotation.NameInMap("UseSpotInstance")
        private Boolean useSpotInstance;

        private ComputeResource(Builder builder) {
            this.ecsCount = builder.ecsCount;
            this.ecsSpec = builder.ecsSpec;
            this.instanceCount = builder.instanceCount;
            this.instanceSpec = builder.instanceSpec;
            this.resourceId = builder.resourceId;
            this.spotSpec = builder.spotSpec;
            this.useSpotInstance = builder.useSpotInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComputeResource create() {
            return builder().build();
        }

        /**
         * @return ecsCount
         */
        public Long getEcsCount() {
            return this.ecsCount;
        }

        /**
         * @return ecsSpec
         */
        public String getEcsSpec() {
            return this.ecsSpec;
        }

        /**
         * @return instanceCount
         */
        public Long getInstanceCount() {
            return this.instanceCount;
        }

        /**
         * @return instanceSpec
         */
        public InstanceSpec getInstanceSpec() {
            return this.instanceSpec;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return spotSpec
         */
        public SpotSpec getSpotSpec() {
            return this.spotSpec;
        }

        /**
         * @return useSpotInstance
         */
        public Boolean getUseSpotInstance() {
            return this.useSpotInstance;
        }

        public static final class Builder {
            private Long ecsCount; 
            private String ecsSpec; 
            private Long instanceCount; 
            private InstanceSpec instanceSpec; 
            private String resourceId; 
            private SpotSpec spotSpec; 
            private Boolean useSpotInstance; 

            /**
             * EcsCount.
             */
            public Builder ecsCount(Long ecsCount) {
                this.ecsCount = ecsCount;
                return this;
            }

            /**
             * EcsSpec.
             */
            public Builder ecsSpec(String ecsSpec) {
                this.ecsSpec = ecsSpec;
                return this;
            }

            /**
             * InstanceCount.
             */
            public Builder instanceCount(Long instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * InstanceSpec.
             */
            public Builder instanceSpec(InstanceSpec instanceSpec) {
                this.instanceSpec = instanceSpec;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * SpotSpec.
             */
            public Builder spotSpec(SpotSpec spotSpec) {
                this.spotSpec = spotSpec;
                return this;
            }

            /**
             * UseSpotInstance.
             */
            public Builder useSpotInstance(Boolean useSpotInstance) {
                this.useSpotInstance = useSpotInstance;
                return this;
            }

            public ComputeResource build() {
                return new ComputeResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTrainingJobRequest} extends {@link TeaModel}
     *
     * <p>CreateTrainingJobRequest</p>
     */
    public static class ExperimentConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExperimentId")
        private String experimentId;

        private ExperimentConfig(Builder builder) {
            this.experimentId = builder.experimentId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExperimentConfig create() {
            return builder().build();
        }

        /**
         * @return experimentId
         */
        public String getExperimentId() {
            return this.experimentId;
        }

        public static final class Builder {
            private String experimentId; 

            /**
             * ExperimentId.
             */
            public Builder experimentId(String experimentId) {
                this.experimentId = experimentId;
                return this;
            }

            public ExperimentConfig build() {
                return new ExperimentConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTrainingJobRequest} extends {@link TeaModel}
     *
     * <p>CreateTrainingJobRequest</p>
     */
    public static class HyperParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private HyperParameters(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HyperParameters create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public HyperParameters build() {
                return new HyperParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTrainingJobRequest} extends {@link TeaModel}
     *
     * <p>CreateTrainingJobRequest</p>
     */
    public static class InputChannels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatasetId")
        private String datasetId;

        @com.aliyun.core.annotation.NameInMap("InputUri")
        private String inputUri;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Options")
        private String options;

        @com.aliyun.core.annotation.NameInMap("VersionName")
        private String versionName;

        private InputChannels(Builder builder) {
            this.datasetId = builder.datasetId;
            this.inputUri = builder.inputUri;
            this.name = builder.name;
            this.options = builder.options;
            this.versionName = builder.versionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputChannels create() {
            return builder().build();
        }

        /**
         * @return datasetId
         */
        public String getDatasetId() {
            return this.datasetId;
        }

        /**
         * @return inputUri
         */
        public String getInputUri() {
            return this.inputUri;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return options
         */
        public String getOptions() {
            return this.options;
        }

        /**
         * @return versionName
         */
        public String getVersionName() {
            return this.versionName;
        }

        public static final class Builder {
            private String datasetId; 
            private String inputUri; 
            private String name; 
            private String options; 
            private String versionName; 

            /**
             * DatasetId.
             */
            public Builder datasetId(String datasetId) {
                this.datasetId = datasetId;
                return this;
            }

            /**
             * InputUri.
             */
            public Builder inputUri(String inputUri) {
                this.inputUri = inputUri;
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
             * Options.
             */
            public Builder options(String options) {
                this.options = options;
                return this;
            }

            /**
             * VersionName.
             */
            public Builder versionName(String versionName) {
                this.versionName = versionName;
                return this;
            }

            public InputChannels build() {
                return new InputChannels(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTrainingJobRequest} extends {@link TeaModel}
     *
     * <p>CreateTrainingJobRequest</p>
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
     * {@link CreateTrainingJobRequest} extends {@link TeaModel}
     *
     * <p>CreateTrainingJobRequest</p>
     */
    public static class OutputChannels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatasetId")
        private String datasetId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OutputUri")
        private String outputUri;

        @com.aliyun.core.annotation.NameInMap("VersionName")
        private String versionName;

        private OutputChannels(Builder builder) {
            this.datasetId = builder.datasetId;
            this.name = builder.name;
            this.outputUri = builder.outputUri;
            this.versionName = builder.versionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputChannels create() {
            return builder().build();
        }

        /**
         * @return datasetId
         */
        public String getDatasetId() {
            return this.datasetId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outputUri
         */
        public String getOutputUri() {
            return this.outputUri;
        }

        /**
         * @return versionName
         */
        public String getVersionName() {
            return this.versionName;
        }

        public static final class Builder {
            private String datasetId; 
            private String name; 
            private String outputUri; 
            private String versionName; 

            /**
             * DatasetId.
             */
            public Builder datasetId(String datasetId) {
                this.datasetId = datasetId;
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
             * OutputUri.
             */
            public Builder outputUri(String outputUri) {
                this.outputUri = outputUri;
                return this;
            }

            /**
             * VersionName.
             */
            public Builder versionName(String versionName) {
                this.versionName = versionName;
                return this;
            }

            public OutputChannels build() {
                return new OutputChannels(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTrainingJobRequest} extends {@link TeaModel}
     *
     * <p>CreateTrainingJobRequest</p>
     */
    public static class Scheduler extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxRunningTimeInMinutes")
        private Long maxRunningTimeInMinutes;

        @com.aliyun.core.annotation.NameInMap("MaxRunningTimeInSeconds")
        private Long maxRunningTimeInSeconds;

        private Scheduler(Builder builder) {
            this.maxRunningTimeInMinutes = builder.maxRunningTimeInMinutes;
            this.maxRunningTimeInSeconds = builder.maxRunningTimeInSeconds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scheduler create() {
            return builder().build();
        }

        /**
         * @return maxRunningTimeInMinutes
         */
        public Long getMaxRunningTimeInMinutes() {
            return this.maxRunningTimeInMinutes;
        }

        /**
         * @return maxRunningTimeInSeconds
         */
        public Long getMaxRunningTimeInSeconds() {
            return this.maxRunningTimeInSeconds;
        }

        public static final class Builder {
            private Long maxRunningTimeInMinutes; 
            private Long maxRunningTimeInSeconds; 

            /**
             * MaxRunningTimeInMinutes.
             */
            public Builder maxRunningTimeInMinutes(Long maxRunningTimeInMinutes) {
                this.maxRunningTimeInMinutes = maxRunningTimeInMinutes;
                return this;
            }

            /**
             * MaxRunningTimeInSeconds.
             */
            public Builder maxRunningTimeInSeconds(Long maxRunningTimeInSeconds) {
                this.maxRunningTimeInSeconds = maxRunningTimeInSeconds;
                return this;
            }

            public Scheduler build() {
                return new Scheduler(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTrainingJobRequest} extends {@link TeaModel}
     *
     * <p>CreateTrainingJobRequest</p>
     */
    public static class UserVpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultRoute")
        private String defaultRoute;

        @com.aliyun.core.annotation.NameInMap("ExtendedCIDRs")
        private java.util.List < String > extendedCIDRs;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("SwitchId")
        private String switchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private UserVpc(Builder builder) {
            this.defaultRoute = builder.defaultRoute;
            this.extendedCIDRs = builder.extendedCIDRs;
            this.securityGroupId = builder.securityGroupId;
            this.switchId = builder.switchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserVpc create() {
            return builder().build();
        }

        /**
         * @return defaultRoute
         */
        public String getDefaultRoute() {
            return this.defaultRoute;
        }

        /**
         * @return extendedCIDRs
         */
        public java.util.List < String > getExtendedCIDRs() {
            return this.extendedCIDRs;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return switchId
         */
        public String getSwitchId() {
            return this.switchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String defaultRoute; 
            private java.util.List < String > extendedCIDRs; 
            private String securityGroupId; 
            private String switchId; 
            private String vpcId; 

            /**
             * DefaultRoute.
             */
            public Builder defaultRoute(String defaultRoute) {
                this.defaultRoute = defaultRoute;
                return this;
            }

            /**
             * ExtendedCIDRs.
             */
            public Builder extendedCIDRs(java.util.List < String > extendedCIDRs) {
                this.extendedCIDRs = extendedCIDRs;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * SwitchId.
             */
            public Builder switchId(String switchId) {
                this.switchId = switchId;
                return this;
            }

            /**
             * <p>VPC ID。</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-dxiflssjx978sl</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public UserVpc build() {
                return new UserVpc(this);
            } 

        } 

    }
}
