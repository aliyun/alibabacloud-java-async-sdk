// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTrainingJobRequest} extends {@link RequestModel}
 *
 * <p>CreateTrainingJobRequest</p>
 */
public class CreateTrainingJobRequest extends Request {
    @Body
    @NameInMap("AlgorithmName")
    private String algorithmName;

    @Body
    @NameInMap("AlgorithmProvider")
    private String algorithmProvider;

    @Body
    @NameInMap("AlgorithmSpec")
    private AlgorithmSpec algorithmSpec;

    @Body
    @NameInMap("AlgorithmVersion")
    private String algorithmVersion;

    @Body
    @NameInMap("CodeDir")
    private Location codeDir;

    @Body
    @NameInMap("ComputeResource")
    private ComputeResource computeResource;

    @Body
    @NameInMap("HyperParameters")
    private java.util.List < HyperParameters> hyperParameters;

    @Body
    @NameInMap("InputChannels")
    private java.util.List < InputChannels> inputChannels;

    @Body
    @NameInMap("Labels")
    private java.util.List < Labels> labels;

    @Body
    @NameInMap("OutputChannels")
    private java.util.List < OutputChannels> outputChannels;

    @Body
    @NameInMap("RoleArn")
    private String roleArn;

    @Body
    @NameInMap("Scheduler")
    private Scheduler scheduler;

    @Body
    @NameInMap("TrainingJobDescription")
    private String trainingJobDescription;

    @Body
    @NameInMap("TrainingJobName")
    @Validation(required = true)
    private String trainingJobName;

    @Body
    @NameInMap("UserVpc")
    private UserVpc userVpc;

    @Body
    @NameInMap("WorkspaceId")
    @Validation(required = true)
    private String workspaceId;

    private CreateTrainingJobRequest(Builder builder) {
        super(builder);
        this.algorithmName = builder.algorithmName;
        this.algorithmProvider = builder.algorithmProvider;
        this.algorithmSpec = builder.algorithmSpec;
        this.algorithmVersion = builder.algorithmVersion;
        this.codeDir = builder.codeDir;
        this.computeResource = builder.computeResource;
        this.hyperParameters = builder.hyperParameters;
        this.inputChannels = builder.inputChannels;
        this.labels = builder.labels;
        this.outputChannels = builder.outputChannels;
        this.roleArn = builder.roleArn;
        this.scheduler = builder.scheduler;
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
        private java.util.List < HyperParameters> hyperParameters; 
        private java.util.List < InputChannels> inputChannels; 
        private java.util.List < Labels> labels; 
        private java.util.List < OutputChannels> outputChannels; 
        private String roleArn; 
        private Scheduler scheduler; 
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
            this.hyperParameters = request.hyperParameters;
            this.inputChannels = request.inputChannels;
            this.labels = request.labels;
            this.outputChannels = request.outputChannels;
            this.roleArn = request.roleArn;
            this.scheduler = request.scheduler;
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
         * TrainingJobDescription.
         */
        public Builder trainingJobDescription(String trainingJobDescription) {
            this.putBodyParameter("TrainingJobDescription", trainingJobDescription);
            this.trainingJobDescription = trainingJobDescription;
            return this;
        }

        /**
         * TrainingJobName.
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
         * WorkspaceId.
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
    public static class UserVpc extends TeaModel {
        @NameInMap("ExtendedCIDRs")
        private java.util.List < String > extendedCIDRs;

        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("SwitchId")
        private String switchId;

        @NameInMap("VpcId")
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
}
