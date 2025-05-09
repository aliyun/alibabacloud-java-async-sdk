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
    private java.util.Map<String, String> environments;

    @com.aliyun.core.annotation.NameInMap("ExperimentConfig")
    private ExperimentConfig experimentConfig;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("HyperParameters")
    private java.util.List<HyperParameters> hyperParameters;

    @com.aliyun.core.annotation.NameInMap("InputChannels")
    private java.util.List<InputChannels> inputChannels;

    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List<Instances> instances;

    @com.aliyun.core.annotation.NameInMap("IsTempAlgo")
    private Boolean isTempAlgo;

    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Labels> labels;

    @com.aliyun.core.annotation.NameInMap("LatestMetrics")
    private java.util.List<LatestMetrics> latestMetrics;

    @com.aliyun.core.annotation.NameInMap("LatestProgress")
    private LatestProgress latestProgress;

    @com.aliyun.core.annotation.NameInMap("OutputChannels")
    private java.util.List<OutputChannels> outputChannels;

    @com.aliyun.core.annotation.NameInMap("OutputModel")
    private OutputModel outputModel;

    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.NameInMap("PythonRequirements")
    private java.util.List<String> pythonRequirements;

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
    private JobSettings settings;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StatusTransitions")
    private java.util.List<StatusTransitions> statusTransitions;

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
        this.priority = builder.priority;
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.Map<String, String> getEnvironments() {
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
    public java.util.List<HyperParameters> getHyperParameters() {
        return this.hyperParameters;
    }

    /**
     * @return inputChannels
     */
    public java.util.List<InputChannels> getInputChannels() {
        return this.inputChannels;
    }

    /**
     * @return instances
     */
    public java.util.List<Instances> getInstances() {
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
    public java.util.List<Labels> getLabels() {
        return this.labels;
    }

    /**
     * @return latestMetrics
     */
    public java.util.List<LatestMetrics> getLatestMetrics() {
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
    public java.util.List<OutputChannels> getOutputChannels() {
        return this.outputChannels;
    }

    /**
     * @return outputModel
     */
    public OutputModel getOutputModel() {
        return this.outputModel;
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
    public java.util.List<String> getPythonRequirements() {
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
    public JobSettings getSettings() {
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
    public java.util.List<StatusTransitions> getStatusTransitions() {
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
        private java.util.Map<String, String> environments; 
        private ExperimentConfig experimentConfig; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private java.util.List<HyperParameters> hyperParameters; 
        private java.util.List<InputChannels> inputChannels; 
        private java.util.List<Instances> instances; 
        private Boolean isTempAlgo; 
        private java.util.List<Labels> labels; 
        private java.util.List<LatestMetrics> latestMetrics; 
        private LatestProgress latestProgress; 
        private java.util.List<OutputChannels> outputChannels; 
        private OutputModel outputModel; 
        private Integer priority; 
        private java.util.List<String> pythonRequirements; 
        private String reasonCode; 
        private String reasonMessage; 
        private String requestId; 
        private String roleArn; 
        private Scheduler scheduler; 
        private JobSettings settings; 
        private String status; 
        private java.util.List<StatusTransitions> statusTransitions; 
        private String trainingJobDescription; 
        private String trainingJobId; 
        private String trainingJobName; 
        private String trainingJobUrl; 
        private String userId; 
        private UserVpc userVpc; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(GetTrainingJobResponseBody model) {
            this.algorithmId = model.algorithmId;
            this.algorithmName = model.algorithmName;
            this.algorithmProvider = model.algorithmProvider;
            this.algorithmSpec = model.algorithmSpec;
            this.algorithmVersion = model.algorithmVersion;
            this.computeResource = model.computeResource;
            this.duration = model.duration;
            this.environments = model.environments;
            this.experimentConfig = model.experimentConfig;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.hyperParameters = model.hyperParameters;
            this.inputChannels = model.inputChannels;
            this.instances = model.instances;
            this.isTempAlgo = model.isTempAlgo;
            this.labels = model.labels;
            this.latestMetrics = model.latestMetrics;
            this.latestProgress = model.latestProgress;
            this.outputChannels = model.outputChannels;
            this.outputModel = model.outputModel;
            this.priority = model.priority;
            this.pythonRequirements = model.pythonRequirements;
            this.reasonCode = model.reasonCode;
            this.reasonMessage = model.reasonMessage;
            this.requestId = model.requestId;
            this.roleArn = model.roleArn;
            this.scheduler = model.scheduler;
            this.settings = model.settings;
            this.status = model.status;
            this.statusTransitions = model.statusTransitions;
            this.trainingJobDescription = model.trainingJobDescription;
            this.trainingJobId = model.trainingJobId;
            this.trainingJobName = model.trainingJobName;
            this.trainingJobUrl = model.trainingJobUrl;
            this.userId = model.userId;
            this.userVpc = model.userVpc;
            this.workspaceId = model.workspaceId;
        } 

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
        public Builder environments(java.util.Map<String, String> environments) {
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
        public Builder hyperParameters(java.util.List<HyperParameters> hyperParameters) {
            this.hyperParameters = hyperParameters;
            return this;
        }

        /**
         * InputChannels.
         */
        public Builder inputChannels(java.util.List<InputChannels> inputChannels) {
            this.inputChannels = inputChannels;
            return this;
        }

        /**
         * Instances.
         */
        public Builder instances(java.util.List<Instances> instances) {
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
        public Builder labels(java.util.List<Labels> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * LatestMetrics.
         */
        public Builder latestMetrics(java.util.List<LatestMetrics> latestMetrics) {
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
        public Builder outputChannels(java.util.List<OutputChannels> outputChannels) {
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
         * Priority.
         */
        public Builder priority(Integer priority) {
            this.priority = priority;
            return this;
        }

        /**
         * PythonRequirements.
         */
        public Builder pythonRequirements(java.util.List<String> pythonRequirements) {
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
        public Builder settings(JobSettings settings) {
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
        public Builder statusTransitions(java.util.List<StatusTransitions> statusTransitions) {
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

    /**
     * 
     * {@link GetTrainingJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTrainingJobResponseBody</p>
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

            private Builder() {
            } 

            private Builder(InstanceSpec model) {
                this.CPU = model.CPU;
                this.GPU = model.GPU;
                this.GPUType = model.GPUType;
                this.memory = model.memory;
                this.sharedMemory = model.sharedMemory;
            } 

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
     * {@link GetTrainingJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTrainingJobResponseBody</p>
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

            private Builder() {
            } 

            private Builder(SpotSpec model) {
                this.spotDiscountLimit = model.spotDiscountLimit;
                this.spotStrategy = model.spotStrategy;
            } 

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
     * {@link GetTrainingJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTrainingJobResponseBody</p>
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

            private Builder() {
            } 

            private Builder(ComputeResource model) {
                this.ecsCount = model.ecsCount;
                this.ecsSpec = model.ecsSpec;
                this.instanceCount = model.instanceCount;
                this.instanceSpec = model.instanceSpec;
                this.resourceId = model.resourceId;
                this.resourceName = model.resourceName;
                this.spotSpec = model.spotSpec;
                this.useSpotInstance = model.useSpotInstance;
            } 

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
    /**
     * 
     * {@link GetTrainingJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTrainingJobResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ExperimentConfig model) {
                this.experimentId = model.experimentId;
                this.experimentName = model.experimentName;
            } 

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
    /**
     * 
     * {@link GetTrainingJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTrainingJobResponseBody</p>
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

            private Builder() {
            } 

            private Builder(HyperParameters model) {
                this.name = model.name;
                this.value = model.value;
            } 

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
     * {@link GetTrainingJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTrainingJobResponseBody</p>
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

            private Builder() {
            } 

            private Builder(InputChannels model) {
                this.datasetId = model.datasetId;
                this.inputUri = model.inputUri;
                this.name = model.name;
                this.options = model.options;
                this.versionName = model.versionName;
            } 

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
     * {@link GetTrainingJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTrainingJobResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Instances model) {
                this.name = model.name;
                this.role = model.role;
                this.status = model.status;
            } 

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
    /**
     * 
     * {@link GetTrainingJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTrainingJobResponseBody</p>
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
     * {@link GetTrainingJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTrainingJobResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(LatestMetrics model) {
                this.name = model.name;
                this.timestamp = model.timestamp;
                this.value = model.value;
            } 

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
    /**
     * 
     * {@link GetTrainingJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTrainingJobResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(OverallProgress model) {
                this.timestamp = model.timestamp;
                this.value = model.value;
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
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public OverallProgress build() {
                return new OverallProgress(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTrainingJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTrainingJobResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(RemainingTime model) {
                this.timestamp = model.timestamp;
                this.value = model.value;
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
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public RemainingTime build() {
                return new RemainingTime(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTrainingJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTrainingJobResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(LatestProgress model) {
                this.overallProgress = model.overallProgress;
                this.remainingTime = model.remainingTime;
            } 

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
    /**
     * 
     * {@link GetTrainingJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTrainingJobResponseBody</p>
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

            private Builder() {
            } 

            private Builder(OutputChannels model) {
                this.datasetId = model.datasetId;
                this.name = model.name;
                this.outputUri = model.outputUri;
                this.versionName = model.versionName;
            } 

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
     * {@link GetTrainingJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTrainingJobResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(OutputModel model) {
                this.outputChannelName = model.outputChannelName;
                this.uri = model.uri;
            } 

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
    /**
     * 
     * {@link GetTrainingJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTrainingJobResponseBody</p>
     */
    public static class Scheduler extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxRunningTimeInMinutes")
        private String maxRunningTimeInMinutes;

        @com.aliyun.core.annotation.NameInMap("MaxRunningTimeInSeconds")
        private String maxRunningTimeInSeconds;

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
        public String getMaxRunningTimeInMinutes() {
            return this.maxRunningTimeInMinutes;
        }

        /**
         * @return maxRunningTimeInSeconds
         */
        public String getMaxRunningTimeInSeconds() {
            return this.maxRunningTimeInSeconds;
        }

        public static final class Builder {
            private String maxRunningTimeInMinutes; 
            private String maxRunningTimeInSeconds; 

            private Builder() {
            } 

            private Builder(Scheduler model) {
                this.maxRunningTimeInMinutes = model.maxRunningTimeInMinutes;
                this.maxRunningTimeInSeconds = model.maxRunningTimeInSeconds;
            } 

            /**
             * MaxRunningTimeInMinutes.
             */
            public Builder maxRunningTimeInMinutes(String maxRunningTimeInMinutes) {
                this.maxRunningTimeInMinutes = maxRunningTimeInMinutes;
                return this;
            }

            /**
             * MaxRunningTimeInSeconds.
             */
            public Builder maxRunningTimeInSeconds(String maxRunningTimeInSeconds) {
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
     * {@link GetTrainingJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTrainingJobResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(StatusTransitions model) {
                this.endTime = model.endTime;
                this.reasonCode = model.reasonCode;
                this.reasonMessage = model.reasonMessage;
                this.startTime = model.startTime;
                this.status = model.status;
            } 

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
    /**
     * 
     * {@link GetTrainingJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetTrainingJobResponseBody</p>
     */
    public static class UserVpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExtendedCIDRs")
        private java.util.List<String> extendedCIDRs;

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
        public java.util.List<String> getExtendedCIDRs() {
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
            private java.util.List<String> extendedCIDRs; 
            private String securityGroupId; 
            private String switchId; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(UserVpc model) {
                this.extendedCIDRs = model.extendedCIDRs;
                this.securityGroupId = model.securityGroupId;
                this.switchId = model.switchId;
                this.vpcId = model.vpcId;
            } 

            /**
             * ExtendedCIDRs.
             */
            public Builder extendedCIDRs(java.util.List<String> extendedCIDRs) {
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
             * <p>vpc-abcdef****</p>
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
