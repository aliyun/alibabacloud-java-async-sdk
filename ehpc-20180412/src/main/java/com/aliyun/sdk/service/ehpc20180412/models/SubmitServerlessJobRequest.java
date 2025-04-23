// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link SubmitServerlessJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitServerlessJobRequest</p>
 */
public class SubmitServerlessJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArrayProperties")
    private ArrayProperties arrayProperties;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Container")
    @com.aliyun.core.annotation.Validation(required = true)
    private Container container;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cpu")
    private Float cpu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DependsOn")
    private java.util.List<DependsOn> dependsOn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EphemeralStorage")
    private Integer ephemeralStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private java.util.List<String> instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobPriority")
    private Long jobPriority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Memory")
    private Float memory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RamRoleName")
    private String ramRoleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetryStrategy")
    private RetryStrategy retryStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotPriceLimit")
    private Float spotPriceLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotStrategy")
    private String spotStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timeout")
    private Long timeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private java.util.List<String> vSwitchId;

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
    public java.util.List<DependsOn> getDependsOn() {
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
    public java.util.List<String> getInstanceType() {
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
    public java.util.List<String> getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<SubmitServerlessJobRequest, Builder> {
        private ArrayProperties arrayProperties; 
        private String clusterId; 
        private Container container; 
        private Float cpu; 
        private java.util.List<DependsOn> dependsOn; 
        private Integer ephemeralStorage; 
        private java.util.List<String> instanceType; 
        private String jobName; 
        private Long jobPriority; 
        private Float memory; 
        private String ramRoleName; 
        private RetryStrategy retryStrategy; 
        private Float spotPriceLimit; 
        private String spotStrategy; 
        private Long timeout; 
        private java.util.List<String> vSwitchId; 

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
         * <p>The configuration of the array job.</p>
         * <blockquote>
         * <p> The value of an array job index is passed to a serverless job container through the environment variable <code>EHPC_ARRAY_TASK_ID</code>. Users can access the container from business programs.</p>
         * </blockquote>
         */
        public Builder arrayProperties(ArrayProperties arrayProperties) {
            String arrayPropertiesShrink = shrink(arrayProperties, "ArrayProperties", "json");
            this.putQueryParameter("ArrayProperties", arrayPropertiesShrink);
            this.arrayProperties = arrayProperties;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-FYUr32****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The properties of the Serverless job container.</p>
         * <p>This parameter is required.</p>
         */
        public Builder container(Container container) {
            String containerShrink = shrink(container, "Container", "json");
            this.putQueryParameter("Container", containerShrink);
            this.container = container;
            return this;
        }

        /**
         * <p>The vCPU size of the serverless job container. Unit: cores.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder cpu(Float cpu) {
            this.putQueryParameter("Cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * <p>The dependencies of the serverless job.</p>
         */
        public Builder dependsOn(java.util.List<DependsOn> dependsOn) {
            String dependsOnShrink = shrink(dependsOn, "DependsOn", "json");
            this.putQueryParameter("DependsOn", dependsOnShrink);
            this.dependsOn = dependsOn;
            return this;
        }

        /**
         * <p>The size of the temporary storage space added to the serverless job container. Unit: GiB.</p>
         * <blockquote>
         * <p> By default, a space of 30 GiB is provided free of charge. If you require a larger space, you can pass this parameter to specify your required space size.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder ephemeralStorage(Integer ephemeralStorage) {
            this.putQueryParameter("EphemeralStorage", ephemeralStorage);
            this.ephemeralStorage = ephemeralStorage;
            return this;
        }

        /**
         * <p>The Elastic Compute Service (ECS) instance types used by the serverless job container.</p>
         */
        public Builder instanceType(java.util.List<String> instanceType) {
            String instanceTypeShrink = shrink(instanceType, "InstanceType", "json");
            this.putQueryParameter("InstanceType", instanceTypeShrink);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The name of the serverless job.</p>
         * <blockquote>
         * <p> The name can contain lowercase letters, digits, and hyphens (-). It cannot start or end with a hyphen.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testjob</p>
         */
        public Builder jobName(String jobName) {
            this.putQueryParameter("JobName", jobName);
            this.jobName = jobName;
            return this;
        }

        /**
         * <p>The scheduling priority of the serverless job. Valid values: 0 to 999. A greater value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder jobPriority(Long jobPriority) {
            this.putQueryParameter("JobPriority", jobPriority);
            this.jobPriority = jobPriority;
            return this;
        }

        /**
         * <p>The memory size of the serverless job container. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder memory(Float memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * <p>The Resource Access Manamement (RAM) role that is associated with the Serverless job container.</p>
         * 
         * <strong>example:</strong>
         * <p>testRamRoleName</p>
         */
        public Builder ramRoleName(String ramRoleName) {
            this.putQueryParameter("RamRoleName", ramRoleName);
            this.ramRoleName = ramRoleName;
            return this;
        }

        /**
         * <p>The retry policy of the serverless job.</p>
         */
        public Builder retryStrategy(RetryStrategy retryStrategy) {
            String retryStrategyShrink = shrink(retryStrategy, "RetryStrategy", "json");
            this.putQueryParameter("RetryStrategy", retryStrategyShrink);
            this.retryStrategy = retryStrategy;
            return this;
        }

        /**
         * <p>The maximum hourly price of the preemptible elastic container instance. The value can be accurate to three decimal places.</p>
         * <p>If you set SpotStrategy to SpotWithPriceLimit, you must specify the SpotPriceLimit parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>0.062</p>
         */
        public Builder spotPriceLimit(Float spotPriceLimit) {
            this.putQueryParameter("SpotPriceLimit", spotPriceLimit);
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }

        /**
         * <p>The bidding policy of the ECS instances. Valid values:</p>
         * <ul>
         * <li>NoSpot: The instance is created as a pay-as-you-go instance.</li>
         * <li>SpotWithPriceLimit: The instance is created as a preemptible instance for which you specify the maximum hourly price.</li>
         * <li>SpotAsPriceGo: The instance is created as a preemptible instance for which the market price at the time of purchase is automatically used as the bid price.</li>
         * </ul>
         * <p>Default value: NoSpot.</p>
         * 
         * <strong>example:</strong>
         * <p>SpotWithPriceLimit</p>
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * <p>The validity period of the serverless job. After the validity period expires, the job is forcibly terminated. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder timeout(Long timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * <p>The IDs of the vSwitches to which the serverless job container belongs.</p>
         */
        public Builder vSwitchId(java.util.List<String> vSwitchId) {
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

    /**
     * 
     * {@link SubmitServerlessJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitServerlessJobRequest</p>
     */
    public static class ArrayProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IndexEnd")
        private Long indexEnd;

        @com.aliyun.core.annotation.NameInMap("IndexStart")
        private Long indexStart;

        @com.aliyun.core.annotation.NameInMap("IndexStep")
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

            private Builder() {
            } 

            private Builder(ArrayProperties model) {
                this.indexEnd = model.indexEnd;
                this.indexStart = model.indexStart;
                this.indexStep = model.indexStep;
            } 

            /**
             * <p>The end value of the array job index. Valid values: 0 to 4999. The value must be greater than or equal to the value of IndexStart.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder indexEnd(Long indexEnd) {
                this.indexEnd = indexEnd;
                return this;
            }

            /**
             * <p>The starting value of the array job index. Valid values: 0 to 4999.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder indexStart(Long indexStart) {
                this.indexStart = indexStart;
                return this;
            }

            /**
             * <p>The interval of the array job index.</p>
             * <blockquote>
             * <p> If the array job property is IndexStart=1,IndexEnd=5, and IndexStep=2, the array job contains three subtasks. The values of the subtask indexes are 1,3, and 5.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
    /**
     * 
     * {@link SubmitServerlessJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitServerlessJobRequest</p>
     */
    public static class EnvironmentVar extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(EnvironmentVar model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The name of the environment variable for the container. The name can be 1 to 128 characters in length and can contain letters, digits, and underscores (_). The name cannot start with a digit. Specify the name in the [0-9a-zA-Z] format.</p>
             * 
             * <strong>example:</strong>
             * <p>PATH</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the environment variable for the container. The value must be 0 to 256 bits in length.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/local/bin</p>
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
    /**
     * 
     * {@link SubmitServerlessJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitServerlessJobRequest</p>
     */
    public static class VolumeMount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FlexVolumeDriver")
        private String flexVolumeDriver;

        @com.aliyun.core.annotation.NameInMap("FlexVolumeOptions")
        private String flexVolumeOptions;

        @com.aliyun.core.annotation.NameInMap("MountPath")
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

            private Builder() {
            } 

            private Builder(VolumeMount model) {
                this.flexVolumeDriver = model.flexVolumeDriver;
                this.flexVolumeOptions = model.flexVolumeOptions;
                this.mountPath = model.mountPath;
            } 

            /**
             * <p>The driver type when you use the FlexVolume plug-in to mount a volume. Valid values:</p>
             * <ul>
             * <li>alicloud/nas: a NAS driver.</li>
             * <li>alicloud/oss: an OSS driver.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>alicloud/oss</p>
             */
            public Builder flexVolumeDriver(String flexVolumeDriver) {
                this.flexVolumeDriver = flexVolumeDriver;
                return this;
            }

            /**
             * <p>The options of the FlexVolume object. Each option is a key-value pair in a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;bucket&quot;:&quot;hpctest&quot;,&quot;url&quot;: &quot;oss-cn-hangzhou-internal.aliyuncs.com
             * &quot;,&quot;path&quot;:&quot;/data&quot;,&quot;ramRole&quot;:&quot;AliyunECSInstanceForEHPCRole&quot;}</p>
             */
            public Builder flexVolumeOptions(String flexVolumeOptions) {
                this.flexVolumeOptions = flexVolumeOptions;
                return this;
            }

            /**
             * <p>The directory to which the volume is mounted.</p>
             * <blockquote>
             * <p> The data stored in this directory is overwritten by the data on the volume. Exercise caution when you specify this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>/data</p>
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
    /**
     * 
     * {@link SubmitServerlessJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitServerlessJobRequest</p>
     */
    public static class Container extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arg")
        private java.util.List<String> arg;

        @com.aliyun.core.annotation.NameInMap("Command")
        private java.util.List<String> command;

        @com.aliyun.core.annotation.NameInMap("EnvironmentVar")
        private java.util.List<EnvironmentVar> environmentVar;

        @com.aliyun.core.annotation.NameInMap("Gpu")
        private Integer gpu;

        @com.aliyun.core.annotation.NameInMap("Image")
        @com.aliyun.core.annotation.Validation(required = true)
        private String image;

        @com.aliyun.core.annotation.NameInMap("VolumeMount")
        private java.util.List<VolumeMount> volumeMount;

        @com.aliyun.core.annotation.NameInMap("WorkingDir")
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
        public java.util.List<String> getArg() {
            return this.arg;
        }

        /**
         * @return command
         */
        public java.util.List<String> getCommand() {
            return this.command;
        }

        /**
         * @return environmentVar
         */
        public java.util.List<EnvironmentVar> getEnvironmentVar() {
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
        public java.util.List<VolumeMount> getVolumeMount() {
            return this.volumeMount;
        }

        /**
         * @return workingDir
         */
        public String getWorkingDir() {
            return this.workingDir;
        }

        public static final class Builder {
            private java.util.List<String> arg; 
            private java.util.List<String> command; 
            private java.util.List<EnvironmentVar> environmentVar; 
            private Integer gpu; 
            private String image; 
            private java.util.List<VolumeMount> volumeMount; 
            private String workingDir; 

            private Builder() {
            } 

            private Builder(Container model) {
                this.arg = model.arg;
                this.command = model.command;
                this.environmentVar = model.environmentVar;
                this.gpu = model.gpu;
                this.image = model.image;
                this.volumeMount = model.volumeMount;
                this.workingDir = model.workingDir;
            } 

            /**
             * <p>The arguments of the container startup command. You can specify up to 10 arguments.</p>
             */
            public Builder arg(java.util.List<String> arg) {
                this.arg = arg;
                return this;
            }

            /**
             * <p>The container startup commands.</p>
             */
            public Builder command(java.util.List<String> command) {
                this.command = command;
                return this;
            }

            /**
             * <p>The value of the environment variable for the container.</p>
             */
            public Builder environmentVar(java.util.List<EnvironmentVar> environmentVar) {
                this.environmentVar = environmentVar;
                return this;
            }

            /**
             * <p>The number of GPUs used by the container.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder gpu(Integer gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * <p>The container image.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>registry-vpc.cn-hangzhou.aliyuncs.com/ehpc/hpl:latest</p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The data volumes that are mounted to the container.</p>
             */
            public Builder volumeMount(java.util.List<VolumeMount> volumeMount) {
                this.volumeMount = volumeMount;
                return this;
            }

            /**
             * <p>The working directory of the container.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/local/</p>
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
    /**
     * 
     * {@link SubmitServerlessJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitServerlessJobRequest</p>
     */
    public static class DependsOn extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Type")
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

            private Builder() {
            } 

            private Builder(DependsOn model) {
                this.jobId = model.jobId;
                this.type = model.type;
            } 

            /**
             * <p>The ID of the dependent job.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The dependency type. Valid values:</p>
             * <ul>
             * <li>AfterSucceeded: <strong>All subtasks</strong> of the dependent job or array job succeed. The exit code is 0.</li>
             * <li>AfterFailed: <strong>All subtasks</strong> of the dependent job or array job fail. The exit code is not 0.</li>
             * <li>AfterAny: The dependent job completes (succeeds or fails).</li>
             * <li>AfterCorresponding: The subtask corresponding to the dependent array job succeeds. The exit code is 0.</li>
             * </ul>
             * <p>Default value: AfterSucceeded.</p>
             * 
             * <strong>example:</strong>
             * <p>AfterAny</p>
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
    /**
     * 
     * {@link SubmitServerlessJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitServerlessJobRequest</p>
     */
    public static class EvaluateOnExit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("OnExitCode")
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

            private Builder() {
            } 

            private Builder(EvaluateOnExit model) {
                this.action = model.action;
                this.onExitCode = model.onExitCode;
            } 

            /**
             * <p>The job action. Valid values:</p>
             * <ul>
             * <li>Retry: The job starts a retry when a specific exit code is hit.</li>
             * <li>Exit: The job exits when a specific exit code is hit.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Retry</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The job exit code, which is used together with Action to form a job retry rule. Valid values: 0 to 255.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
    /**
     * 
     * {@link SubmitServerlessJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitServerlessJobRequest</p>
     */
    public static class RetryStrategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attempts")
        @com.aliyun.core.annotation.Validation(maximum = 10, minimum = 1)
        private Integer attempts;

        @com.aliyun.core.annotation.NameInMap("EvaluateOnExit")
        private java.util.List<EvaluateOnExit> evaluateOnExit;

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
        public java.util.List<EvaluateOnExit> getEvaluateOnExit() {
            return this.evaluateOnExit;
        }

        public static final class Builder {
            private Integer attempts; 
            private java.util.List<EvaluateOnExit> evaluateOnExit; 

            private Builder() {
            } 

            private Builder(RetryStrategy model) {
                this.attempts = model.attempts;
                this.evaluateOnExit = model.evaluateOnExit;
            } 

            /**
             * <p>The number of retries for the serverless job. Valid values: 1 to 10.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder attempts(Integer attempts) {
                this.attempts = attempts;
                return this;
            }

            /**
             * <p>The retry rules for the serverless job. You can specify up to 10 rules.</p>
             */
            public Builder evaluateOnExit(java.util.List<EvaluateOnExit> evaluateOnExit) {
                this.evaluateOnExit = evaluateOnExit;
                return this;
            }

            public RetryStrategy build() {
                return new RetryStrategy(this);
            } 

        } 

    }
}
