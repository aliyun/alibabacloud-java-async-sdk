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
            this.spotPriceLimit = request.spotPriceLimit;
            this.spotStrategy = request.spotStrategy;
            this.timeout = request.timeout;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * ArrayProperties.
         */
        public Builder arrayProperties(ArrayProperties arrayProperties) {
            String arrayPropertiesShrink = shrink(arrayProperties, "ArrayProperties", "json");
            this.putQueryParameter("ArrayProperties", arrayPropertiesShrink);
            this.arrayProperties = arrayProperties;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Container.
         */
        public Builder container(Container container) {
            String containerShrink = shrink(container, "Container", "json");
            this.putQueryParameter("Container", containerShrink);
            this.container = container;
            return this;
        }

        /**
         * Cpu.
         */
        public Builder cpu(Float cpu) {
            this.putQueryParameter("Cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * DependsOn.
         */
        public Builder dependsOn(java.util.List < DependsOn> dependsOn) {
            String dependsOnShrink = shrink(dependsOn, "DependsOn", "json");
            this.putQueryParameter("DependsOn", dependsOnShrink);
            this.dependsOn = dependsOn;
            return this;
        }

        /**
         * EphemeralStorage.
         */
        public Builder ephemeralStorage(Integer ephemeralStorage) {
            this.putQueryParameter("EphemeralStorage", ephemeralStorage);
            this.ephemeralStorage = ephemeralStorage;
            return this;
        }

        /**
         * InstanceType.
         */
        public Builder instanceType(java.util.List < String > instanceType) {
            String instanceTypeShrink = shrink(instanceType, "InstanceType", "simple");
            this.putQueryParameter("InstanceType", instanceTypeShrink);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * JobName.
         */
        public Builder jobName(String jobName) {
            this.putQueryParameter("JobName", jobName);
            this.jobName = jobName;
            return this;
        }

        /**
         * JobPriority.
         */
        public Builder jobPriority(Long jobPriority) {
            this.putQueryParameter("JobPriority", jobPriority);
            this.jobPriority = jobPriority;
            return this;
        }

        /**
         * Memory.
         */
        public Builder memory(Float memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * RamRoleName.
         */
        public Builder ramRoleName(String ramRoleName) {
            this.putQueryParameter("RamRoleName", ramRoleName);
            this.ramRoleName = ramRoleName;
            return this;
        }

        /**
         * SpotPriceLimit.
         */
        public Builder spotPriceLimit(Float spotPriceLimit) {
            this.putQueryParameter("SpotPriceLimit", spotPriceLimit);
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }

        /**
         * SpotStrategy.
         */
        public Builder spotStrategy(String spotStrategy) {
            this.putQueryParameter("SpotStrategy", spotStrategy);
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * Timeout.
         */
        public Builder timeout(Long timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(java.util.List < String > vSwitchId) {
            String vSwitchIdShrink = shrink(vSwitchId, "VSwitchId", "simple");
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
             * IndexEnd.
             */
            public Builder indexEnd(Long indexEnd) {
                this.indexEnd = indexEnd;
                return this;
            }

            /**
             * IndexStart.
             */
            public Builder indexStart(Long indexStart) {
                this.indexStart = indexStart;
                return this;
            }

            /**
             * IndexStep.
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
             * FlexVolumeDriver.
             */
            public Builder flexVolumeDriver(String flexVolumeDriver) {
                this.flexVolumeDriver = flexVolumeDriver;
                return this;
            }

            /**
             * FlexVolumeOptions.
             */
            public Builder flexVolumeOptions(String flexVolumeOptions) {
                this.flexVolumeOptions = flexVolumeOptions;
                return this;
            }

            /**
             * MountPath.
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
             * Arg.
             */
            public Builder arg(java.util.List < String > arg) {
                this.arg = arg;
                return this;
            }

            /**
             * Command.
             */
            public Builder command(java.util.List < String > command) {
                this.command = command;
                return this;
            }

            /**
             * EnvironmentVar.
             */
            public Builder environmentVar(java.util.List < EnvironmentVar> environmentVar) {
                this.environmentVar = environmentVar;
                return this;
            }

            /**
             * Gpu.
             */
            public Builder gpu(Integer gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * Image.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * VolumeMount.
             */
            public Builder volumeMount(java.util.List < VolumeMount> volumeMount) {
                this.volumeMount = volumeMount;
                return this;
            }

            /**
             * WorkingDir.
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
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * Type.
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
}
