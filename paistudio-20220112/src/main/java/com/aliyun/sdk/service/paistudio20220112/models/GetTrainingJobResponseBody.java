// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrainingJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetTrainingJobResponseBody</p>
 */
public class GetTrainingJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlgorithmId")
    private String algorithmId;

    @com.aliyun.core.annotation.NameInMap("AlgorithmName")
    private String algorithmName;

    @com.aliyun.core.annotation.NameInMap("AlgorithmProvider")
    private String algorithmProvider;

    @com.aliyun.core.annotation.NameInMap("AlgorithmSpec")
    private AlgorithmSpec algorithmSpec;

    @com.aliyun.core.annotation.NameInMap("AlgorithmVersion")
    private String algorithmVersion;

    @com.aliyun.core.annotation.NameInMap("ComputeResource")
    private ComputeResource computeResource;

    @com.aliyun.core.annotation.NameInMap("Duration")
    private Long duration;

    @com.aliyun.core.annotation.NameInMap("Environments")
    private java.util.Map < String, String > environments;

    @com.aliyun.core.annotation.NameInMap("ExperimentConfig")
    private ExperimentConfig experimentConfig;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("HyperParameters")
    private java.util.List < HyperParameters> hyperParameters;

    @com.aliyun.core.annotation.NameInMap("InputChannels")
    private java.util.List < InputChannels> inputChannels;

    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List < Instances> instances;

    @com.aliyun.core.annotation.NameInMap("IsTempAlgo")
    private Boolean isTempAlgo;

    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List < Labels> labels;

    @com.aliyun.core.annotation.NameInMap("LatestMetrics")
    private java.util.List < LatestMetrics> latestMetrics;

    @com.aliyun.core.annotation.NameInMap("LatestProgress")
    private LatestProgress latestProgress;

    @com.aliyun.core.annotation.NameInMap("OutputChannels")
    private java.util.List < OutputChannels> outputChannels;

    @com.aliyun.core.annotation.NameInMap("OutputModel")
    private OutputModel outputModel;

    @com.aliyun.core.annotation.NameInMap("PythonRequirements")
    private java.util.List < String > pythonRequirements;

    @com.aliyun.core.annotation.NameInMap("ReasonCode")
    private String reasonCode;

    @com.aliyun.core.annotation.NameInMap("ReasonMessage")
    private String reasonMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RoleArn")
    private String roleArn;

    @com.aliyun.core.annotation.NameInMap("Scheduler")
    private Scheduler scheduler;

    @com.aliyun.core.annotation.NameInMap("Settings")
    private Settings settings;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StatusTransitions")
    private java.util.List < StatusTransitions> statusTransitions;

    @com.aliyun.core.annotation.NameInMap("TrainingJobDescription")
    private String trainingJobDescription;

    @com.aliyun.core.annotation.NameInMap("TrainingJobId")
    private String trainingJobId;

    @com.aliyun.core.annotation.NameInMap("TrainingJobName")
    private String trainingJobName;

    @com.aliyun.core.annotation.NameInMap("TrainingJobUrl")
    private String trainingJobUrl;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("UserVpc")
    private UserVpc userVpc;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private GetTrainingJobResponseBody(Builder builder) {
        this.algorithmId = builder.algorithmId;
        this.algorithmName = builder.algorithmName;
        this.algorithmProvider = builder.algorithmProvider;
        this.algorithmSpec = builder.algorithmSpec;
        this.algorithmVersion = builder.algorithmVersion;
        this.computeResource = builder.computeResource;
        this.duration = builder.duration;
        this.environments = builder.environments;
        this.experimentConfig = builder.experimentConfig;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.hyperParameters = builder.hyperParameters;
        this.inputChannels = builder.inputChannels;
        this.instances = builder.instances;
        this.isTempAlgo = builder.isTempAlgo;
        this.labels = builder.labels;
        this.latestMetrics = builder.latestMetrics;
        this.latestProgress = builder.latestProgress;
        this.outputChannels = builder.outputChannels;
        this.outputModel = builder.outputModel;
        this.pythonRequirements = builder.pythonRequirements;
        this.reasonCode = builder.reasonCode;
        this.reasonMessage = builder.reasonMessage;
        this.requestId = builder.requestId;
        this.roleArn = builder.roleArn;
        this.scheduler = builder.scheduler;
        this.settings = builder.settings;
        this.status = builder.status;
        this.statusTransitions = builder.statusTransitions;
        this.trainingJobDescription = builder.trainingJobDescription;
        this.trainingJobId = builder.trainingJobId;
        this.trainingJobName = builder.trainingJobName;
        this.trainingJobUrl = builder.trainingJobUrl;
        this.userId = builder.userId;
        this.userVpc = builder.userVpc;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrainingJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return algorithmId
     */
    public String getAlgorithmId() {
        return this.algorithmId;
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
     * @return computeResource
     */
    public ComputeResource getComputeResource() {
        return this.computeResource;
    }

    /**
     * @return duration
     */
    public Long getDuration() {
        return this.duration;
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
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
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
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return isTempAlgo
     */
    public Boolean getIsTempAlgo() {
        return this.isTempAlgo;
    }

    /**
     * @return labels
     */
    public java.util.List < Labels> getLabels() {
        return this.labels;
    }

    /**
     * @return latestMetrics
     */
    public java.util.List < LatestMetrics> getLatestMetrics() {
        return this.latestMetrics;
    }

    /**
     * @return latestProgress
     */
    public LatestProgress getLatestProgress() {
        return this.latestProgress;
    }

    /**
     * @return outputChannels
     */
    public java.util.List < OutputChannels> getOutputChannels() {
        return this.outputChannels;
    }

    /**
     * @return outputModel
     */
    public OutputModel getOutputModel() {
        return this.outputModel;
    }

    /**
     * @return pythonRequirements
     */
    public java.util.List < String > getPythonRequirements() {
        return this.pythonRequirements;
    }

    /**
     * @return reasonCode
     */
    public String getReasonCode() {
        return this.reasonCode;
    }

    /**
     * @return reasonMessage
     */
    public String getReasonMessage() {
        return this.reasonMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
    public Settings getSettings() {
        return this.settings;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return statusTransitions
     */
    public java.util.List < StatusTransitions> getStatusTransitions() {
        return this.statusTransitions;
    }

    /**
     * @return trainingJobDescription
     */
    public String getTrainingJobDescription() {
        return this.trainingJobDescription;
    }

    /**
     * @return trainingJobId
     */
    public String getTrainingJobId() {
        return this.trainingJobId;
    }

    /**
     * @return trainingJobName
     */
    public String getTrainingJobName() {
        return this.trainingJobName;
    }

    /**
     * @return trainingJobUrl
     */
    public String getTrainingJobUrl() {
        return this.trainingJobUrl;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
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

    public static final class Builder {
        private String algorithmId; 
        private String algorithmName; 
        private String algorithmProvider; 
        private AlgorithmSpec algorithmSpec; 
        private String algorithmVersion; 
        private ComputeResource computeResource; 
        private Long duration; 
        private java.util.Map < String, String > environments; 
        private ExperimentConfig experimentConfig; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private java.util.List < HyperParameters> hyperParameters; 
        private java.util.List < InputChannels> inputChannels; 
        private java.util.List < Instances> instances; 
        private Boolean isTempAlgo; 
        private java.util.List < Labels> labels; 
        private java.util.List < LatestMetrics> latestMetrics; 
        private LatestProgress latestProgress; 
        private java.util.List < OutputChannels> outputChannels; 
        private OutputModel outputModel; 
        private java.util.List < String > pythonRequirements; 
        private String reasonCode; 
        private String reasonMessage; 
        private String requestId; 
        private String roleArn; 
        private Scheduler scheduler; 
        private Settings settings; 
        private String status; 
        private java.util.List < StatusTransitions> statusTransitions; 
        private String trainingJobDescription; 
        private String trainingJobId; 
        private String trainingJobName; 
        private String trainingJobUrl; 
        private String userId; 
        private UserVpc userVpc; 
        private String workspaceId; 

        /**
         * AlgorithmId.
         */
        public Builder algorithmId(String algorithmId) {
            this.algorithmId = algorithmId;
            return this;
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
         * AlgorithmSpec.
         */
        public Builder algorithmSpec(AlgorithmSpec algorithmSpec) {
            this.algorithmSpec = algorithmSpec;
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
         * ComputeResource.
         */
        public Builder computeResource(ComputeResource computeResource) {
            this.computeResource = computeResource;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(Long duration) {
            this.duration = duration;
            return this;
        }

        /**
         * Environments.
         */
        public Builder environments(java.util.Map < String, String > environments) {
            this.environments = environments;
            return this;
        }

        /**
         * ExperimentConfig.
         */
        public Builder experimentConfig(ExperimentConfig experimentConfig) {
            this.experimentConfig = experimentConfig;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * HyperParameters.
         */
        public Builder hyperParameters(java.util.List < HyperParameters> hyperParameters) {
            this.hyperParameters = hyperParameters;
            return this;
        }

        /**
         * InputChannels.
         */
        public Builder inputChannels(java.util.List < InputChannels> inputChannels) {
            this.inputChannels = inputChannels;
            return this;
        }

        /**
         * Instances.
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * IsTempAlgo.
         */
        public Builder isTempAlgo(Boolean isTempAlgo) {
            this.isTempAlgo = isTempAlgo;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.List < Labels> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * LatestMetrics.
         */
        public Builder latestMetrics(java.util.List < LatestMetrics> latestMetrics) {
            this.latestMetrics = latestMetrics;
            return this;
        }

        /**
         * LatestProgress.
         */
        public Builder latestProgress(LatestProgress latestProgress) {
            this.latestProgress = latestProgress;
            return this;
        }

        /**
         * OutputChannels.
         */
        public Builder outputChannels(java.util.List < OutputChannels> outputChannels) {
            this.outputChannels = outputChannels;
            return this;
        }

        /**
         * OutputModel.
         */
        public Builder outputModel(OutputModel outputModel) {
            this.outputModel = outputModel;
            return this;
        }

        /**
         * PythonRequirements.
         */
        public Builder pythonRequirements(java.util.List < String > pythonRequirements) {
            this.pythonRequirements = pythonRequirements;
            return this;
        }

        /**
         * ReasonCode.
         */
        public Builder reasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }

        /**
         * ReasonMessage.
         */
        public Builder reasonMessage(String reasonMessage) {
            this.reasonMessage = reasonMessage;
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
         * RoleArn.
         */
        public Builder roleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * Scheduler.
         */
        public Builder scheduler(Scheduler scheduler) {
            this.scheduler = scheduler;
            return this;
        }

        /**
         * Settings.
         */
        public Builder settings(Settings settings) {
            this.settings = settings;
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
         * StatusTransitions.
         */
        public Builder statusTransitions(java.util.List < StatusTransitions> statusTransitions) {
            this.statusTransitions = statusTransitions;
            return this;
        }

        /**
         * TrainingJobDescription.
         */
        public Builder trainingJobDescription(String trainingJobDescription) {
            this.trainingJobDescription = trainingJobDescription;
            return this;
        }

        /**
         * TrainingJobId.
         */
        public Builder trainingJobId(String trainingJobId) {
            this.trainingJobId = trainingJobId;
            return this;
        }

        /**
         * TrainingJobName.
         */
        public Builder trainingJobName(String trainingJobName) {
            this.trainingJobName = trainingJobName;
            return this;
        }

        /**
         * TrainingJobUrl.
         */
        public Builder trainingJobUrl(String trainingJobUrl) {
            this.trainingJobUrl = trainingJobUrl;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * UserVpc.
         */
        public Builder userVpc(UserVpc userVpc) {
            this.userVpc = userVpc;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public GetTrainingJobResponseBody build() {
            return new GetTrainingJobResponseBody(this);
        } 

    } 

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

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

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
            this.resourceName = builder.resourceName;
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
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
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
            private String resourceName; 
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
             * ResourceName.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
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
    public static class ExperimentConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExperimentId")
        private String experimentId;

        @com.aliyun.core.annotation.NameInMap("ExperimentName")
        private String experimentName;

        private ExperimentConfig(Builder builder) {
            this.experimentId = builder.experimentId;
            this.experimentName = builder.experimentName;
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

        /**
         * @return experimentName
         */
        public String getExperimentName() {
            return this.experimentName;
        }

        public static final class Builder {
            private String experimentId; 
            private String experimentName; 

            /**
             * ExperimentId.
             */
            public Builder experimentId(String experimentId) {
                this.experimentId = experimentId;
                return this;
            }

            /**
             * ExperimentName.
             */
            public Builder experimentName(String experimentName) {
                this.experimentName = experimentName;
                return this;
            }

            public ExperimentConfig build() {
                return new ExperimentConfig(this);
            } 

        } 

    }
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
    public static class InputChannels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatasetId")
        private String datasetId;

        @com.aliyun.core.annotation.NameInMap("InputUri")
        private String inputUri;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Options")
        private String options;

        private InputChannels(Builder builder) {
            this.datasetId = builder.datasetId;
            this.inputUri = builder.inputUri;
            this.name = builder.name;
            this.options = builder.options;
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

        public static final class Builder {
            private String datasetId; 
            private String inputUri; 
            private String name; 
            private String options; 

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

            public InputChannels build() {
                return new InputChannels(this);
            } 

        } 

    }
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Instances(Builder builder) {
            this.name = builder.name;
            this.role = builder.role;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String name; 
            private String role; 
            private String status; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
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
    public static class LatestMetrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Double value;

        private LatestMetrics(Builder builder) {
            this.name = builder.name;
            this.timestamp = builder.timestamp;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LatestMetrics create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return value
         */
        public Double getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String timestamp; 
            private Double value; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Double value) {
                this.value = value;
                return this;
            }

            public LatestMetrics build() {
                return new LatestMetrics(this);
            } 

        } 

    }
    public static class OverallProgress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private OverallProgress(Builder builder) {
            this.timestamp = builder.timestamp;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OverallProgress create() {
            return builder().build();
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String timestamp; 
            private Float value; 

            /**
             * Timestamp.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public OverallProgress build() {
                return new OverallProgress(this);
            } 

        } 

    }
    public static class RemainingTime extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private RemainingTime(Builder builder) {
            this.timestamp = builder.timestamp;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemainingTime create() {
            return builder().build();
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String timestamp; 
            private Long value; 

            /**
             * Timestamp.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public RemainingTime build() {
                return new RemainingTime(this);
            } 

        } 

    }
    public static class LatestProgress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OverallProgress")
        private OverallProgress overallProgress;

        @com.aliyun.core.annotation.NameInMap("RemainingTime")
        private RemainingTime remainingTime;

        private LatestProgress(Builder builder) {
            this.overallProgress = builder.overallProgress;
            this.remainingTime = builder.remainingTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LatestProgress create() {
            return builder().build();
        }

        /**
         * @return overallProgress
         */
        public OverallProgress getOverallProgress() {
            return this.overallProgress;
        }

        /**
         * @return remainingTime
         */
        public RemainingTime getRemainingTime() {
            return this.remainingTime;
        }

        public static final class Builder {
            private OverallProgress overallProgress; 
            private RemainingTime remainingTime; 

            /**
             * OverallProgress.
             */
            public Builder overallProgress(OverallProgress overallProgress) {
                this.overallProgress = overallProgress;
                return this;
            }

            /**
             * RemainingTime.
             */
            public Builder remainingTime(RemainingTime remainingTime) {
                this.remainingTime = remainingTime;
                return this;
            }

            public LatestProgress build() {
                return new LatestProgress(this);
            } 

        } 

    }
    public static class OutputChannels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatasetId")
        private String datasetId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OutputUri")
        private String outputUri;

        private OutputChannels(Builder builder) {
            this.datasetId = builder.datasetId;
            this.name = builder.name;
            this.outputUri = builder.outputUri;
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

        public static final class Builder {
            private String datasetId; 
            private String name; 
            private String outputUri; 

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

            public OutputChannels build() {
                return new OutputChannels(this);
            } 

        } 

    }
    public static class OutputModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OutputChannelName")
        private String outputChannelName;

        @com.aliyun.core.annotation.NameInMap("Uri")
        private String uri;

        private OutputModel(Builder builder) {
            this.outputChannelName = builder.outputChannelName;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputModel create() {
            return builder().build();
        }

        /**
         * @return outputChannelName
         */
        public String getOutputChannelName() {
            return this.outputChannelName;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        public static final class Builder {
            private String outputChannelName; 
            private String uri; 

            /**
             * OutputChannelName.
             */
            public Builder outputChannelName(String outputChannelName) {
                this.outputChannelName = outputChannelName;
                return this;
            }

            /**
             * Uri.
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public OutputModel build() {
                return new OutputModel(this);
            } 

        } 

    }
    public static class Scheduler extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxRunningTimeInSeconds")
        private Long maxRunningTimeInSeconds;

        private Scheduler(Builder builder) {
            this.maxRunningTimeInSeconds = builder.maxRunningTimeInSeconds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scheduler create() {
            return builder().build();
        }

        /**
         * @return maxRunningTimeInSeconds
         */
        public Long getMaxRunningTimeInSeconds() {
            return this.maxRunningTimeInSeconds;
        }

        public static final class Builder {
            private Long maxRunningTimeInSeconds; 

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
    public static class Settings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AIMasterType")
        private String AIMasterType;

        @com.aliyun.core.annotation.NameInMap("EnableErrorMonitoringInAIMaster")
        private Boolean enableErrorMonitoringInAIMaster;

        @com.aliyun.core.annotation.NameInMap("ErrorMonitoringArgs")
        private String errorMonitoringArgs;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        private Settings(Builder builder) {
            this.AIMasterType = builder.AIMasterType;
            this.enableErrorMonitoringInAIMaster = builder.enableErrorMonitoringInAIMaster;
            this.errorMonitoringArgs = builder.errorMonitoringArgs;
            this.priority = builder.priority;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Settings create() {
            return builder().build();
        }

        /**
         * @return AIMasterType
         */
        public String getAIMasterType() {
            return this.AIMasterType;
        }

        /**
         * @return enableErrorMonitoringInAIMaster
         */
        public Boolean getEnableErrorMonitoringInAIMaster() {
            return this.enableErrorMonitoringInAIMaster;
        }

        /**
         * @return errorMonitoringArgs
         */
        public String getErrorMonitoringArgs() {
            return this.errorMonitoringArgs;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        public static final class Builder {
            private String AIMasterType; 
            private Boolean enableErrorMonitoringInAIMaster; 
            private String errorMonitoringArgs; 
            private Integer priority; 

            /**
             * AIMasterType.
             */
            public Builder AIMasterType(String AIMasterType) {
                this.AIMasterType = AIMasterType;
                return this;
            }

            /**
             * EnableErrorMonitoringInAIMaster.
             */
            public Builder enableErrorMonitoringInAIMaster(Boolean enableErrorMonitoringInAIMaster) {
                this.enableErrorMonitoringInAIMaster = enableErrorMonitoringInAIMaster;
                return this;
            }

            /**
             * ErrorMonitoringArgs.
             */
            public Builder errorMonitoringArgs(String errorMonitoringArgs) {
                this.errorMonitoringArgs = errorMonitoringArgs;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            public Settings build() {
                return new Settings(this);
            } 

        } 

    }
    public static class StatusTransitions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ReasonCode")
        private String reasonCode;

        @com.aliyun.core.annotation.NameInMap("ReasonMessage")
        private String reasonMessage;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private StatusTransitions(Builder builder) {
            this.endTime = builder.endTime;
            this.reasonCode = builder.reasonCode;
            this.reasonMessage = builder.reasonMessage;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatusTransitions create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return reasonCode
         */
        public String getReasonCode() {
            return this.reasonCode;
        }

        /**
         * @return reasonMessage
         */
        public String getReasonMessage() {
            return this.reasonMessage;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String endTime; 
            private String reasonCode; 
            private String reasonMessage; 
            private String startTime; 
            private String status; 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ReasonCode.
             */
            public Builder reasonCode(String reasonCode) {
                this.reasonCode = reasonCode;
                return this;
            }

            /**
             * ReasonMessage.
             */
            public Builder reasonMessage(String reasonMessage) {
                this.reasonMessage = reasonMessage;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public StatusTransitions build() {
                return new StatusTransitions(this);
            } 

        } 

    }
    public static class UserVpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExtendedCIDRs")
        private java.util.List < String > extendedCIDRs;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("SwitchId")
        private String switchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private UserVpc(Builder builder) {
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
            private java.util.List < String > extendedCIDRs; 
            private String securityGroupId; 
            private String switchId; 
            private String vpcId; 

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
             * VPC ID。
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
