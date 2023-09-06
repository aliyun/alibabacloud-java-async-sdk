// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitServerlessJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitServerlessJobRequest</p>
 */
public class SubmitServerlessJobRequest extends Request {
    @Query
    @NameInMap("ArrayProperties")
    private ArrayProperties arrayProperties;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Container")
    @Validation(required = true)
    private Container container;

    @Query
    @NameInMap("Cpu")
    private Float cpu;

    @Query
    @NameInMap("DependsOn")
    private java.util.List < DependsOn> dependsOn;

    @Query
    @NameInMap("EphemeralStorage")
    private Integer ephemeralStorage;

    @Query
    @NameInMap("InstanceType")
    private java.util.List < String > instanceType;

    @Query
    @NameInMap("JobName")
    @Validation(required = true)
    private String jobName;

    @Query
    @NameInMap("JobPriority")
    private Long jobPriority;

    @Query
    @NameInMap("Memory")
    private Float memory;

    @Query
    @NameInMap("RamRoleName")
    private String ramRoleName;

    @Query
    @NameInMap("RetryStrategy")
    private RetryStrategy retryStrategy;

    @Query
    @NameInMap("SpotPriceLimit")
    private Float spotPriceLimit;

    @Query
    @NameInMap("SpotStrategy")
    private String spotStrategy;

    @Query
    @NameInMap("Timeout")
    private Long timeout;

    @Query
    @NameInMap("VSwitchId")
    private java.util.List < String > vSwitchId;

    private SubmitServerlessJobRequest(Builder builder) {
        super(builder);
        this.arrayProperties = builder.arrayProperties;
        this.clusterId = builder.clusterId;
        this.container = builder.container;
        this.cpu = builder.cpu;
        this.dependsOn = builder.dependsOn;
        this.ephemeralStorage = builder.ephemeralStorage;
        this.instanceType = builder.instanceType;
        this.jobName = builder.jobName;
        this.jobPriority = builder.jobPriority;
        this.memory = builder.memory;
        this.ramRoleName = builder.ramRoleName;
        this.retryStrategy = builder.retryStrategy;
        this.spotPriceLimit = builder.spotPriceLimit;
        this.spotStrategy = builder.spotStrategy;
        this.timeout = builder.timeout;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitServerlessJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return arrayProperties
     */
    public ArrayProperties getArrayProperties() {
        return this.arrayProperties;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return container
     */
    public Container getContainer() {
        return this.container;
    }

    /**
     * @return cpu
     */
    public Float getCpu() {
        return this.cpu;
    }

    /**
     * @return dependsOn
     */
    public java.util.List < DependsOn> getDependsOn() {
        return this.dependsOn;
    }

    /**
     * @return ephemeralStorage
     */
    public Integer getEphemeralStorage() {
        return this.ephemeralStorage;
    }

    /**
     * @return instanceType
     */
    public java.util.List < String > getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return jobName
     */
    public String getJobName() {
        return this.jobName;
    }

    /**
     * @return jobPriority
     */
    public Long getJobPriority() {
        return this.jobPriority;
    }

    /**
     * @return memory
     */
    public Float getMemory() {
        return this.memory;
    }

    /**
     * @return ramRoleName
     */
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    /**
     * @return retryStrategy
     */
    public RetryStrategy getRetryStrategy() {
        return this.retryStrategy;
    }

    /**
     * @return spotPriceLimit
     */
    public Float getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    /**
     * @return spotStrategy
     */
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    /**
     * @return timeout
     */
    public Long getTimeout() {
        return this.timeout;
    }

    /**
     * @return vSwitchId
     */
    public java.util.List < String > getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<SubmitServerlessJobRequest, Builder> {
        private ArrayProperties arrayProperties; 
        private String clusterId; 
        private Container container; 
        private Float cpu; 
        private java.util.List < DependsOn> dependsOn; 
        private Integer ephemeralStorage; 
        private java.util.List < String > instanceType; 
        private String jobName; 
        private Long jobPriority; 
        private Float memory; 
        private String ramRoleName; 
        private RetryStrategy retryStrategy; 
        private Float spotPriceLimit; 
        private String spotStrategy; 
        private Long timeout; 
        private java.util.List < String > vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitServerlessJobRequest request) {
            super(request);
            this.arrayProperties = request.arrayProperties;
            this.clusterId = request.clusterId;
            this.container = request.container;
            this.cpu = request.cpu;
            this.dependsOn = request.dependsOn;
            this.ephemeralStorage = request.ephemeralStorage;
            this.instanceType = request.instanceType;
            this.jobName = request.jobName;
            this.jobPriority = request.jobPriority;
            this.memory = request.memory;
            this.ramRoleName = request.ramRoleName;
            this.retryStrategy = request.retryStrategy;
            this.spotPriceLimit = request.spotPriceLimit;
            this.spotStrategy = request.spotStrategy;
            this.timeout = request.timeout;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * The configuration of the array job.
         * <p>
         * 
         * > 
         * 
         * *   The index value of an array job is passed to the serverless job container by using the environment variable **EHPC_JOB_ARRAY_INDEX** to allow access to the array job from business programs.
         */
        public Builder arrayProperties(ArrayProperties arrayProperties) {
            String arrayPropertiesShrink = shrink(arrayProperties, "ArrayProperties", "json");
            this.putQueryParameter("ArrayProperties", arrayPropertiesShrink);
            this.arrayProperties = arrayProperties;
            return this;
        }

        /**
         * The ID of the E-HPC cluster.
         * <p>
         * 
         * You can call the [ListClusters](~~87116~~) operation to query the cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The properties of the serverless job container.
         */
        public Builder container(Container container) {
            String containerShrink = shrink(container, "Container", "json");
            this.putQueryParameter("Container", containerShrink);
            this.container = container;
            return this;
        }

        /**
         * The vCPU size of the serverless job container. Unit: cores.
         */
        public Builder cpu(Float cpu) {
            this.putQueryParameter("Cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * The serverless job dependencies.
         */
        public Builder dependsOn(java.util.List < DependsOn> dependsOn) {
            String dependsOnShrink = shrink(dependsOn, "DependsOn", "json");
            this.putQueryParameter("DependsOn", dependsOnShrink);
            this.dependsOn = dependsOn;
            return this;
        }

        /**
         * The size of the temporary storage that is added to the serverless job container. Unit: GiB.
         * <p>
         * 
         * >  By default, the serverless job container provides 30 GiB of free storage quota. If you require storage of more than 30 GiB, you can use this parameter to specify the temporary storage to add to the job container.
         */
        public Builder ephemeralStorage(Integer ephemeralStorage) {
            this.putQueryParameter("EphemeralStorage", ephemeralStorage);
            this.ephemeralStorage = ephemeralStorage;
            return this;
        }

        /**
         * The ECS instance types used by the serverless job container.
         */
        public Builder instanceType(java.util.List < String > instanceType) {
            String instanceTypeShrink = shrink(instanceType, "InstanceType", "json");
            this.putQueryParameter("InstanceType", instanceTypeShrink);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The name of the serverless job.
         */
        public Builder jobName(String jobName) {
            this.putQueryParameter("JobName", jobName);
            this.jobName = jobName;
            return this;
        }

        /**
         * The scheduling priority of the serverless job. Valid values: 0 to 999. A greater value indicates a higher priority.
         */
        public Builder jobPriority(Long jobPriority) {
            this.putQueryParameter("JobPriority", jobPriority);
            this.jobPriority = jobPriority;
            return this;
        }

        /**
         * The memory size of the serverless job container. Unit: GiB.
         */
        public Builder memory(Float memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * The name of the RAM role that is associated with the serverless job container.
         */
        public Builder ramRoleName(String ramRoleName) {
            this.putQueryParameter("RamRoleName", ramRoleName);
            this.ramRoleName = ramRoleName;
            return this;
        }

        /**
         * RetryStrategy.
         */
        public Builder retryStrategy(RetryStrategy retryStrategy) {
            String retryStrategyShrink = shrink(retryStrategy, "RetryStrategy", "json");
            this.putQueryParameter("RetryStrategy", retryStrategyShrink);
            this.retryStrategy = retryStrategy;
            return this;
        }

        /**
         * The maximum hourly price of the preemptible instance. The value can contain up to three decimal places.
         * <p>
         * 
         * If you set SpotStrategy to SpotWithPriceLimit, you must specify the SpotPriceLimit parameter.
         */
        public Builder spotPriceLimit(Float spotPriceLimit) {
            this.putQueryParameter("SpotPriceLimit", spotPriceLimit);
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }

        /**
         * The bidding policy for the instance. Valid values:
         * <p>
         * 
         * *   NoSpot: The instance is created as a pay-as-you-go instance.
         * *   SpotWithPriceLimit: The instance is created as a preemptible instance with a user-defined maximum hourly price.
         * *   SpotAsPriceGo: The instance is created as a preemptible instance for which the market price at the time of purchase is used as the bid price.
         * 
         * Default value: NoSpot.
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * The validity period of the serverless job. After the validity period expires, the job is forcibly terminated. Unit: seconds.
         */
        public Builder timeout(Long timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * The IDs of the vSwitches to which the serverless job container belongs.
         */
        public Builder vSwitchId(java.util.List < String > vSwitchId) {
            String vSwitchIdShrink = shrink(vSwitchId, "VSwitchId", "json");
            this.putQueryParameter("VSwitchId", vSwitchIdShrink);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public SubmitServerlessJobRequest build() {
            return new SubmitServerlessJobRequest(this);
        } 

    } 

    public static class ArrayProperties extends TeaModel {
        @NameInMap("IndexEnd")
        private Long indexEnd;

        @NameInMap("IndexStart")
        private Long indexStart;

        @NameInMap("IndexStep")
        private Long indexStep;

        private ArrayProperties(Builder builder) {
            this.indexEnd = builder.indexEnd;
            this.indexStart = builder.indexStart;
            this.indexStep = builder.indexStep;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ArrayProperties create() {
            return builder().build();
        }

        /**
         * @return indexEnd
         */
        public Long getIndexEnd() {
            return this.indexEnd;
        }

        /**
         * @return indexStart
         */
        public Long getIndexStart() {
            return this.indexStart;
        }

        /**
         * @return indexStep
         */
        public Long getIndexStep() {
            return this.indexStep;
        }

        public static final class Builder {
            private Long indexEnd; 
            private Long indexStart; 
            private Long indexStep; 

            /**
             * The end value of the array job index. Valid values: 0 to 4999. The value must be greater than or equal to the value of IndexStart.
             */
            public Builder indexEnd(Long indexEnd) {
                this.indexEnd = indexEnd;
                return this;
            }

            /**
             * The starting value of the array job index. Valid values: 0 to 4999.
             */
            public Builder indexStart(Long indexStart) {
                this.indexStart = indexStart;
                return this;
            }

            /**
             * The interval of the array job index.
             * <p>
             * 
             * >  If the IndexStart of the array job is set to 1, IndexEnd is set to 5, and IndexStep is set to 2, the array job contains three subtasks. The subtask indexes are 1, 3, and 5.
             */
            public Builder indexStep(Long indexStep) {
                this.indexStep = indexStep;
                return this;
            }

            public ArrayProperties build() {
                return new ArrayProperties(this);
            } 

        } 

    }
    public static class EnvironmentVar extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private EnvironmentVar(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnvironmentVar create() {
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
             * 环境变量名。长度为1~128位。格式要求：[0-9a-zA-Z]，以及下划线，不能以数字开头。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the environment variable for the container. The value must be 0 to 256 characters in length.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public EnvironmentVar build() {
                return new EnvironmentVar(this);
            } 

        } 

    }
    public static class VolumeMount extends TeaModel {
        @NameInMap("FlexVolumeDriver")
        private String flexVolumeDriver;

        @NameInMap("FlexVolumeOptions")
        private String flexVolumeOptions;

        @NameInMap("MountPath")
        private String mountPath;

        private VolumeMount(Builder builder) {
            this.flexVolumeDriver = builder.flexVolumeDriver;
            this.flexVolumeOptions = builder.flexVolumeOptions;
            this.mountPath = builder.mountPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VolumeMount create() {
            return builder().build();
        }

        /**
         * @return flexVolumeDriver
         */
        public String getFlexVolumeDriver() {
            return this.flexVolumeDriver;
        }

        /**
         * @return flexVolumeOptions
         */
        public String getFlexVolumeOptions() {
            return this.flexVolumeOptions;
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        public static final class Builder {
            private String flexVolumeDriver; 
            private String flexVolumeOptions; 
            private String mountPath; 

            /**
             * 使用FlexVolume插件挂载数据卷时的驱动类型。取值范围如下：
             * <p>
             * 
             * alicloud/nas：挂载NAS。
             * 
             * alicloud/oss：挂载OSS。
             */
            public Builder flexVolumeDriver(String flexVolumeDriver) {
                this.flexVolumeDriver = flexVolumeDriver;
                return this;
            }

            /**
             * FlexVolume对象选项列表。为KV形式，采用JSON传递。
             */
            public Builder flexVolumeOptions(String flexVolumeOptions) {
                this.flexVolumeOptions = flexVolumeOptions;
                return this;
            }

            /**
             * The directory to which the volume is mounted.
             * <p>
             * 
             * > The data stored in this directory is overwritten by the data on the volume. Specify this parameter with caution.
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            public VolumeMount build() {
                return new VolumeMount(this);
            } 

        } 

    }
    public static class Container extends TeaModel {
        @NameInMap("Arg")
        private java.util.List < String > arg;

        @NameInMap("Command")
        private java.util.List < String > command;

        @NameInMap("EnvironmentVar")
        private java.util.List < EnvironmentVar> environmentVar;

        @NameInMap("Gpu")
        private Integer gpu;

        @NameInMap("Image")
        @Validation(required = true)
        private String image;

        @NameInMap("VolumeMount")
        private java.util.List < VolumeMount> volumeMount;

        @NameInMap("WorkingDir")
        private String workingDir;

        private Container(Builder builder) {
            this.arg = builder.arg;
            this.command = builder.command;
            this.environmentVar = builder.environmentVar;
            this.gpu = builder.gpu;
            this.image = builder.image;
            this.volumeMount = builder.volumeMount;
            this.workingDir = builder.workingDir;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Container create() {
            return builder().build();
        }

        /**
         * @return arg
         */
        public java.util.List < String > getArg() {
            return this.arg;
        }

        /**
         * @return command
         */
        public java.util.List < String > getCommand() {
            return this.command;
        }

        /**
         * @return environmentVar
         */
        public java.util.List < EnvironmentVar> getEnvironmentVar() {
            return this.environmentVar;
        }

        /**
         * @return gpu
         */
        public Integer getGpu() {
            return this.gpu;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return volumeMount
         */
        public java.util.List < VolumeMount> getVolumeMount() {
            return this.volumeMount;
        }

        /**
         * @return workingDir
         */
        public String getWorkingDir() {
            return this.workingDir;
        }

        public static final class Builder {
            private java.util.List < String > arg; 
            private java.util.List < String > command; 
            private java.util.List < EnvironmentVar> environmentVar; 
            private Integer gpu; 
            private String image; 
            private java.util.List < VolumeMount> volumeMount; 
            private String workingDir; 

            /**
             * The arguments of the container startup command. You can specify up to 10 arguments.
             */
            public Builder arg(java.util.List < String > arg) {
                this.arg = arg;
                return this;
            }

            /**
             * The container startup commands.
             */
            public Builder command(java.util.List < String > command) {
                this.command = command;
                return this;
            }

            /**
             * The environment variable of the container.
             */
            public Builder environmentVar(java.util.List < EnvironmentVar> environmentVar) {
                this.environmentVar = environmentVar;
                return this;
            }

            /**
             * The number of GPUs of the container.
             */
            public Builder gpu(Integer gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * The image of the container.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * The data volumes mounted to the container.
             */
            public Builder volumeMount(java.util.List < VolumeMount> volumeMount) {
                this.volumeMount = volumeMount;
                return this;
            }

            /**
             * The working directory of the container.
             */
            public Builder workingDir(String workingDir) {
                this.workingDir = workingDir;
                return this;
            }

            public Container build() {
                return new Container(this);
            } 

        } 

    }
    public static class DependsOn extends TeaModel {
        @NameInMap("JobId")
        private String jobId;

        @NameInMap("Type")
        private String type;

        private DependsOn(Builder builder) {
            this.jobId = builder.jobId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DependsOn create() {
            return builder().build();
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String jobId; 
            private String type; 

            /**
             * The ID of the dependent job.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * The type of the dependency. Valid values:
             * <p>
             * 
             * *   AfterSucceeded: **All subtasks** of the array job or the dependent job are successfully run. The exit code is 0.
             * *   AfterFailed: **Any subtask** of the array job or the dependent job fails. The exit code is not 0.
             * *   AfterAny: The dependent job completes.
             * *   AfterCorresponding: The subtasks of the array job is successfully run. The exit code is 0.
             * 
             * Default value: AfterSucceeded.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DependsOn build() {
                return new DependsOn(this);
            } 

        } 

    }
    public static class EvaluateOnExit extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("OnExitCode")
        private String onExitCode;

        private EvaluateOnExit(Builder builder) {
            this.action = builder.action;
            this.onExitCode = builder.onExitCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EvaluateOnExit create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return onExitCode
         */
        public String getOnExitCode() {
            return this.onExitCode;
        }

        public static final class Builder {
            private String action; 
            private String onExitCode; 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * OnExitCode.
             */
            public Builder onExitCode(String onExitCode) {
                this.onExitCode = onExitCode;
                return this;
            }

            public EvaluateOnExit build() {
                return new EvaluateOnExit(this);
            } 

        } 

    }
    public static class RetryStrategy extends TeaModel {
        @NameInMap("Attempts")
        @Validation(maximum = 10, minimum = 1)
        private Integer attempts;

        @NameInMap("EvaluateOnExit")
        private java.util.List < EvaluateOnExit> evaluateOnExit;

        private RetryStrategy(Builder builder) {
            this.attempts = builder.attempts;
            this.evaluateOnExit = builder.evaluateOnExit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RetryStrategy create() {
            return builder().build();
        }

        /**
         * @return attempts
         */
        public Integer getAttempts() {
            return this.attempts;
        }

        /**
         * @return evaluateOnExit
         */
        public java.util.List < EvaluateOnExit> getEvaluateOnExit() {
            return this.evaluateOnExit;
        }

        public static final class Builder {
            private Integer attempts; 
            private java.util.List < EvaluateOnExit> evaluateOnExit; 

            /**
             * Attempts.
             */
            public Builder attempts(Integer attempts) {
                this.attempts = attempts;
                return this;
            }

            /**
             * EvaluateOnExit.
             */
            public Builder evaluateOnExit(java.util.List < EvaluateOnExit> evaluateOnExit) {
                this.evaluateOnExit = evaluateOnExit;
                return this;
            }

            public RetryStrategy build() {
                return new RetryStrategy(this);
            } 

        } 

    }
}
