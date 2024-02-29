// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTrainingJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTrainingJobsResponseBody</p>
 */
public class ListTrainingJobsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    @NameInMap("TrainingJobs")
    private java.util.List < TrainingJobs> trainingJobs;

    private ListTrainingJobsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.trainingJobs = builder.trainingJobs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrainingJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return trainingJobs
     */
    public java.util.List < TrainingJobs> getTrainingJobs() {
        return this.trainingJobs;
    }

    public static final class Builder {
        private String requestId; 
        private Long totalCount; 
        private java.util.List < TrainingJobs> trainingJobs; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TrainingJobs.
         */
        public Builder trainingJobs(java.util.List < TrainingJobs> trainingJobs) {
            this.trainingJobs = trainingJobs;
            return this;
        }

        public ListTrainingJobsResponseBody build() {
            return new ListTrainingJobsResponseBody(this);
        } 

    } 

    public static class InstanceSpec extends TeaModel {
        @NameInMap("CPU")
        private String CPU;

        @NameInMap("GPU")
        private String GPU;

        @NameInMap("GPUType")
        private String GPUType;

        @NameInMap("Memory")
        private String memory;

        @NameInMap("SharedMemory")
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
    public static class ComputeResource extends TeaModel {
        @NameInMap("EcsCount")
        private Long ecsCount;

        @NameInMap("EcsSpec")
        private String ecsSpec;

        @NameInMap("InstanceCount")
        private Long instanceCount;

        @NameInMap("InstanceSpec")
        private InstanceSpec instanceSpec;

        @NameInMap("ResourceId")
        private String resourceId;

        private ComputeResource(Builder builder) {
            this.ecsCount = builder.ecsCount;
            this.ecsSpec = builder.ecsSpec;
            this.instanceCount = builder.instanceCount;
            this.instanceSpec = builder.instanceSpec;
            this.resourceId = builder.resourceId;
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

        public static final class Builder {
            private Long ecsCount; 
            private String ecsSpec; 
            private Long instanceCount; 
            private InstanceSpec instanceSpec; 
            private String resourceId; 

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

            public ComputeResource build() {
                return new ComputeResource(this);
            } 

        } 

    }
    public static class ExperimentConfig extends TeaModel {
        @NameInMap("ExperimentId")
        private String experimentId;

        @NameInMap("ExperimentName")
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
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
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
        @NameInMap("DatasetId")
        private String datasetId;

        @NameInMap("InputUri")
        private String inputUri;

        @NameInMap("Name")
        private String name;

        private InputChannels(Builder builder) {
            this.datasetId = builder.datasetId;
            this.inputUri = builder.inputUri;
            this.name = builder.name;
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

        public static final class Builder {
            private String datasetId; 
            private String inputUri; 
            private String name; 

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

            public InputChannels build() {
                return new InputChannels(this);
            } 

        } 

    }
    public static class Labels extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
    public static class OutputChannels extends TeaModel {
        @NameInMap("DatasetId")
        private String datasetId;

        @NameInMap("Name")
        private String name;

        @NameInMap("OutputUri")
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
    public static class Scheduler extends TeaModel {
        @NameInMap("MaxRunningTimeInSeconds")
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
    public static class StatusTransitions extends TeaModel {
        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("ReasonCode")
        private String reasonCode;

        @NameInMap("ReasonMessage")
        private String reasonMessage;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
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
        @NameInMap("DefaultRoute")
        private String defaultRoute;

        @NameInMap("ExtendedCIDRs")
        private java.util.List < String > extendedCIDRs;

        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("SwitchId")
        private String switchId;

        @NameInMap("VpcId")
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
             * VpcId.
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
    public static class TrainingJobs extends TeaModel {
        @NameInMap("AlgorithmName")
        private String algorithmName;

        @NameInMap("AlgorithmProvider")
        private String algorithmProvider;

        @NameInMap("AlgorithmVersion")
        private String algorithmVersion;

        @NameInMap("ComputeResource")
        private ComputeResource computeResource;

        @NameInMap("ExperimentConfig")
        private ExperimentConfig experimentConfig;

        @NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @NameInMap("HyperParameters")
        private java.util.List < HyperParameters> hyperParameters;

        @NameInMap("InputChannels")
        private java.util.List < InputChannels> inputChannels;

        @NameInMap("IsTempAlgo")
        private Boolean isTempAlgo;

        @NameInMap("Labels")
        private java.util.List < Labels> labels;

        @NameInMap("OutputChannels")
        private java.util.List < OutputChannels> outputChannels;

        @NameInMap("ReasonCode")
        private String reasonCode;

        @NameInMap("ReasonMessage")
        private String reasonMessage;

        @NameInMap("RoleArn")
        private String roleArn;

        @NameInMap("Scheduler")
        private Scheduler scheduler;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusTransitions")
        private java.util.List < StatusTransitions> statusTransitions;

        @NameInMap("TrainingJobDescription")
        private String trainingJobDescription;

        @NameInMap("TrainingJobId")
        private String trainingJobId;

        @NameInMap("TrainingJobName")
        private String trainingJobName;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("UserVpc")
        private UserVpc userVpc;

        @NameInMap("WorkspaceId")
        private String workspaceId;

        private TrainingJobs(Builder builder) {
            this.algorithmName = builder.algorithmName;
            this.algorithmProvider = builder.algorithmProvider;
            this.algorithmVersion = builder.algorithmVersion;
            this.computeResource = builder.computeResource;
            this.experimentConfig = builder.experimentConfig;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.hyperParameters = builder.hyperParameters;
            this.inputChannels = builder.inputChannels;
            this.isTempAlgo = builder.isTempAlgo;
            this.labels = builder.labels;
            this.outputChannels = builder.outputChannels;
            this.reasonCode = builder.reasonCode;
            this.reasonMessage = builder.reasonMessage;
            this.roleArn = builder.roleArn;
            this.scheduler = builder.scheduler;
            this.status = builder.status;
            this.statusTransitions = builder.statusTransitions;
            this.trainingJobDescription = builder.trainingJobDescription;
            this.trainingJobId = builder.trainingJobId;
            this.trainingJobName = builder.trainingJobName;
            this.userId = builder.userId;
            this.userVpc = builder.userVpc;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrainingJobs create() {
            return builder().build();
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
         * @return computeResource
         */
        public ComputeResource getComputeResource() {
            return this.computeResource;
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
         * @return outputChannels
         */
        public java.util.List < OutputChannels> getOutputChannels() {
            return this.outputChannels;
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
            private String algorithmName; 
            private String algorithmProvider; 
            private String algorithmVersion; 
            private ComputeResource computeResource; 
            private ExperimentConfig experimentConfig; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private java.util.List < HyperParameters> hyperParameters; 
            private java.util.List < InputChannels> inputChannels; 
            private Boolean isTempAlgo; 
            private java.util.List < Labels> labels; 
            private java.util.List < OutputChannels> outputChannels; 
            private String reasonCode; 
            private String reasonMessage; 
            private String roleArn; 
            private Scheduler scheduler; 
            private String status; 
            private java.util.List < StatusTransitions> statusTransitions; 
            private String trainingJobDescription; 
            private String trainingJobId; 
            private String trainingJobName; 
            private String userId; 
            private UserVpc userVpc; 
            private String workspaceId; 

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
             * ComputeResource.
             */
            public Builder computeResource(ComputeResource computeResource) {
                this.computeResource = computeResource;
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
             * OutputChannels.
             */
            public Builder outputChannels(java.util.List < OutputChannels> outputChannels) {
                this.outputChannels = outputChannels;
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

            public TrainingJobs build() {
                return new TrainingJobs(this);
            } 

        } 

    }
}
