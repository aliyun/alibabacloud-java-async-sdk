// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpcinstant20230701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateJobRequest} extends {@link RequestModel}
 *
 * <p>CreateJobRequest</p>
 */
public class CreateJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeploymentPolicy")
    private DeploymentPolicy deploymentPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobDescription")
    private String jobDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobScheduler")
    private String jobScheduler;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tasks")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Tasks> tasks;

    private CreateJobRequest(Builder builder) {
        super(builder);
        this.deploymentPolicy = builder.deploymentPolicy;
        this.jobDescription = builder.jobDescription;
        this.jobName = builder.jobName;
        this.jobScheduler = builder.jobScheduler;
        this.tasks = builder.tasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deploymentPolicy
     */
    public DeploymentPolicy getDeploymentPolicy() {
        return this.deploymentPolicy;
    }

    /**
     * @return jobDescription
     */
    public String getJobDescription() {
        return this.jobDescription;
    }

    /**
     * @return jobName
     */
    public String getJobName() {
        return this.jobName;
    }

    /**
     * @return jobScheduler
     */
    public String getJobScheduler() {
        return this.jobScheduler;
    }

    /**
     * @return tasks
     */
    public java.util.List < Tasks> getTasks() {
        return this.tasks;
    }

    public static final class Builder extends Request.Builder<CreateJobRequest, Builder> {
        private DeploymentPolicy deploymentPolicy; 
        private String jobDescription; 
        private String jobName; 
        private String jobScheduler; 
        private java.util.List < Tasks> tasks; 

        private Builder() {
            super();
        } 

        private Builder(CreateJobRequest request) {
            super(request);
            this.deploymentPolicy = request.deploymentPolicy;
            this.jobDescription = request.jobDescription;
            this.jobName = request.jobName;
            this.jobScheduler = request.jobScheduler;
            this.tasks = request.tasks;
        } 

        /**
         * DeploymentPolicy.
         */
        public Builder deploymentPolicy(DeploymentPolicy deploymentPolicy) {
            String deploymentPolicyShrink = shrink(deploymentPolicy, "DeploymentPolicy", "json");
            this.putQueryParameter("DeploymentPolicy", deploymentPolicyShrink);
            this.deploymentPolicy = deploymentPolicy;
            return this;
        }

        /**
         * JobDescription.
         */
        public Builder jobDescription(String jobDescription) {
            this.putQueryParameter("JobDescription", jobDescription);
            this.jobDescription = jobDescription;
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
         * JobScheduler.
         */
        public Builder jobScheduler(String jobScheduler) {
            this.putQueryParameter("JobScheduler", jobScheduler);
            this.jobScheduler = jobScheduler;
            return this;
        }

        /**
         * Tasks.
         */
        public Builder tasks(java.util.List < Tasks> tasks) {
            String tasksShrink = shrink(tasks, "Tasks", "json");
            this.putQueryParameter("Tasks", tasksShrink);
            this.tasks = tasks;
            return this;
        }

        @Override
        public CreateJobRequest build() {
            return new CreateJobRequest(this);
        } 

    } 

    public static class Network extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Vswitch")
        private java.util.List < String > vswitch;

        private Network(Builder builder) {
            this.vswitch = builder.vswitch;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Network create() {
            return builder().build();
        }

        /**
         * @return vswitch
         */
        public java.util.List < String > getVswitch() {
            return this.vswitch;
        }

        public static final class Builder {
            private java.util.List < String > vswitch; 

            /**
             * Vswitch.
             */
            public Builder vswitch(java.util.List < String > vswitch) {
                this.vswitch = vswitch;
                return this;
            }

            public Network build() {
                return new Network(this);
            } 

        } 

    }
    public static class DeploymentPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocationSpec")
        private String allocationSpec;

        @com.aliyun.core.annotation.NameInMap("Network")
        private Network network;

        private DeploymentPolicy(Builder builder) {
            this.allocationSpec = builder.allocationSpec;
            this.network = builder.network;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeploymentPolicy create() {
            return builder().build();
        }

        /**
         * @return allocationSpec
         */
        public String getAllocationSpec() {
            return this.allocationSpec;
        }

        /**
         * @return network
         */
        public Network getNetwork() {
            return this.network;
        }

        public static final class Builder {
            private String allocationSpec; 
            private Network network; 

            /**
             * AllocationSpec.
             */
            public Builder allocationSpec(String allocationSpec) {
                this.allocationSpec = allocationSpec;
                return this;
            }

            /**
             * Network.
             */
            public Builder network(Network network) {
                this.network = network;
                return this;
            }

            public DeploymentPolicy build() {
                return new DeploymentPolicy(this);
            } 

        } 

    }
    public static class ArraySpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IndexEnd")
        private Integer indexEnd;

        @com.aliyun.core.annotation.NameInMap("IndexStart")
        private Integer indexStart;

        @com.aliyun.core.annotation.NameInMap("IndexStep")
        private Integer indexStep;

        private ArraySpec(Builder builder) {
            this.indexEnd = builder.indexEnd;
            this.indexStart = builder.indexStart;
            this.indexStep = builder.indexStep;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ArraySpec create() {
            return builder().build();
        }

        /**
         * @return indexEnd
         */
        public Integer getIndexEnd() {
            return this.indexEnd;
        }

        /**
         * @return indexStart
         */
        public Integer getIndexStart() {
            return this.indexStart;
        }

        /**
         * @return indexStep
         */
        public Integer getIndexStep() {
            return this.indexStep;
        }

        public static final class Builder {
            private Integer indexEnd; 
            private Integer indexStart; 
            private Integer indexStep; 

            /**
             * IndexEnd.
             */
            public Builder indexEnd(Integer indexEnd) {
                this.indexEnd = indexEnd;
                return this;
            }

            /**
             * IndexStart.
             */
            public Builder indexStart(Integer indexStart) {
                this.indexStart = indexStart;
                return this;
            }

            /**
             * IndexStep.
             */
            public Builder indexStep(Integer indexStep) {
                this.indexStep = indexStep;
                return this;
            }

            public ArraySpec build() {
                return new ArraySpec(this);
            } 

        } 

    }
    public static class ExecutorPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArraySpec")
        private ArraySpec arraySpec;

        @com.aliyun.core.annotation.NameInMap("MaxCount")
        private Integer maxCount;

        private ExecutorPolicy(Builder builder) {
            this.arraySpec = builder.arraySpec;
            this.maxCount = builder.maxCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExecutorPolicy create() {
            return builder().build();
        }

        /**
         * @return arraySpec
         */
        public ArraySpec getArraySpec() {
            return this.arraySpec;
        }

        /**
         * @return maxCount
         */
        public Integer getMaxCount() {
            return this.maxCount;
        }

        public static final class Builder {
            private ArraySpec arraySpec; 
            private Integer maxCount; 

            /**
             * ArraySpec.
             */
            public Builder arraySpec(ArraySpec arraySpec) {
                this.arraySpec = arraySpec;
                return this;
            }

            /**
             * MaxCount.
             */
            public Builder maxCount(Integer maxCount) {
                this.maxCount = maxCount;
                return this;
            }

            public ExecutorPolicy build() {
                return new ExecutorPolicy(this);
            } 

        } 

    }
    public static class Disks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Disks(Builder builder) {
            this.size = builder.size;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Disks create() {
            return builder().build();
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer size; 
            private String type; 

            /**
             * Size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Disks build() {
                return new Disks(this);
            } 

        } 

    }
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cores")
        private Float cores;

        @com.aliyun.core.annotation.NameInMap("Disks")
        private java.util.List < Disks> disks;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Float memory;

        private Resource(Builder builder) {
            this.cores = builder.cores;
            this.disks = builder.disks;
            this.memory = builder.memory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return cores
         */
        public Float getCores() {
            return this.cores;
        }

        /**
         * @return disks
         */
        public java.util.List < Disks> getDisks() {
            return this.disks;
        }

        /**
         * @return memory
         */
        public Float getMemory() {
            return this.memory;
        }

        public static final class Builder {
            private Float cores; 
            private java.util.List < Disks> disks; 
            private Float memory; 

            /**
             * Cores.
             */
            public Builder cores(Float cores) {
                this.cores = cores;
                return this;
            }

            /**
             * Disks.
             */
            public Builder disks(java.util.List < Disks> disks) {
                this.disks = disks;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Float memory) {
                this.memory = memory;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
    public static class EnvironmentVars extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private EnvironmentVars(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnvironmentVars create() {
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

            public EnvironmentVars build() {
                return new EnvironmentVars(this);
            } 

        } 

    }
    public static class Container extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("Command")
        private java.util.List < String > command;

        @com.aliyun.core.annotation.NameInMap("EnvironmentVars")
        private java.util.List < EnvironmentVars> environmentVars;

        @com.aliyun.core.annotation.NameInMap("Image")
        @com.aliyun.core.annotation.Validation(required = true)
        private String image;

        @com.aliyun.core.annotation.NameInMap("WorkingDir")
        private String workingDir;

        private Container(Builder builder) {
            this.appId = builder.appId;
            this.command = builder.command;
            this.environmentVars = builder.environmentVars;
            this.image = builder.image;
            this.workingDir = builder.workingDir;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Container create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return command
         */
        public java.util.List < String > getCommand() {
            return this.command;
        }

        /**
         * @return environmentVars
         */
        public java.util.List < EnvironmentVars> getEnvironmentVars() {
            return this.environmentVars;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return workingDir
         */
        public String getWorkingDir() {
            return this.workingDir;
        }

        public static final class Builder {
            private String appId; 
            private java.util.List < String > command; 
            private java.util.List < EnvironmentVars> environmentVars; 
            private String image; 
            private String workingDir; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
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
             * EnvironmentVars.
             */
            public Builder environmentVars(java.util.List < EnvironmentVars> environmentVars) {
                this.environmentVars = environmentVars;
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
    public static class Vm extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("Image")
        @com.aliyun.core.annotation.Validation(required = true)
        private String image;

        @com.aliyun.core.annotation.NameInMap("PrologScript")
        private String prologScript;

        @com.aliyun.core.annotation.NameInMap("Script")
        private String script;

        private Vm(Builder builder) {
            this.appId = builder.appId;
            this.image = builder.image;
            this.prologScript = builder.prologScript;
            this.script = builder.script;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vm create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return prologScript
         */
        public String getPrologScript() {
            return this.prologScript;
        }

        /**
         * @return script
         */
        public String getScript() {
            return this.script;
        }

        public static final class Builder {
            private String appId; 
            private String image; 
            private String prologScript; 
            private String script; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
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
             * PrologScript.
             */
            public Builder prologScript(String prologScript) {
                this.prologScript = prologScript;
                return this;
            }

            /**
             * Script.
             */
            public Builder script(String script) {
                this.script = script;
                return this;
            }

            public Vm build() {
                return new Vm(this);
            } 

        } 

    }
    public static class TaskExecutor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Container")
        private Container container;

        @com.aliyun.core.annotation.NameInMap("VM")
        private Vm vm;

        private TaskExecutor(Builder builder) {
            this.container = builder.container;
            this.vm = builder.vm;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskExecutor create() {
            return builder().build();
        }

        /**
         * @return container
         */
        public Container getContainer() {
            return this.container;
        }

        /**
         * @return vm
         */
        public Vm getVm() {
            return this.vm;
        }

        public static final class Builder {
            private Container container; 
            private Vm vm; 

            /**
             * Container.
             */
            public Builder container(Container container) {
                this.container = container;
                return this;
            }

            /**
             * VM.
             */
            public Builder vm(Vm vm) {
                this.vm = vm;
                return this;
            }

            public TaskExecutor build() {
                return new TaskExecutor(this);
            } 

        } 

    }
    public static class VolumeMount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MountOptions")
        private String mountOptions;

        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("VolumeDriver")
        private String volumeDriver;

        private VolumeMount(Builder builder) {
            this.mountOptions = builder.mountOptions;
            this.mountPath = builder.mountPath;
            this.volumeDriver = builder.volumeDriver;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VolumeMount create() {
            return builder().build();
        }

        /**
         * @return mountOptions
         */
        public String getMountOptions() {
            return this.mountOptions;
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return volumeDriver
         */
        public String getVolumeDriver() {
            return this.volumeDriver;
        }

        public static final class Builder {
            private String mountOptions; 
            private String mountPath; 
            private String volumeDriver; 

            /**
             * MountOptions.
             */
            public Builder mountOptions(String mountOptions) {
                this.mountOptions = mountOptions;
                return this;
            }

            /**
             * MountPath.
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * VolumeDriver.
             */
            public Builder volumeDriver(String volumeDriver) {
                this.volumeDriver = volumeDriver;
                return this;
            }

            public VolumeMount build() {
                return new VolumeMount(this);
            } 

        } 

    }
    public static class TaskSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Resource")
        private Resource resource;

        @com.aliyun.core.annotation.NameInMap("TaskExecutor")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < TaskExecutor> taskExecutor;

        @com.aliyun.core.annotation.NameInMap("VolumeMount")
        private java.util.List < VolumeMount> volumeMount;

        private TaskSpec(Builder builder) {
            this.resource = builder.resource;
            this.taskExecutor = builder.taskExecutor;
            this.volumeMount = builder.volumeMount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskSpec create() {
            return builder().build();
        }

        /**
         * @return resource
         */
        public Resource getResource() {
            return this.resource;
        }

        /**
         * @return taskExecutor
         */
        public java.util.List < TaskExecutor> getTaskExecutor() {
            return this.taskExecutor;
        }

        /**
         * @return volumeMount
         */
        public java.util.List < VolumeMount> getVolumeMount() {
            return this.volumeMount;
        }

        public static final class Builder {
            private Resource resource; 
            private java.util.List < TaskExecutor> taskExecutor; 
            private java.util.List < VolumeMount> volumeMount; 

            /**
             * Resource.
             */
            public Builder resource(Resource resource) {
                this.resource = resource;
                return this;
            }

            /**
             * TaskExecutor.
             */
            public Builder taskExecutor(java.util.List < TaskExecutor> taskExecutor) {
                this.taskExecutor = taskExecutor;
                return this;
            }

            /**
             * VolumeMount.
             */
            public Builder volumeMount(java.util.List < VolumeMount> volumeMount) {
                this.volumeMount = volumeMount;
                return this;
            }

            public TaskSpec build() {
                return new TaskSpec(this);
            } 

        } 

    }
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExecutorPolicy")
        private ExecutorPolicy executorPolicy;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TaskSpec")
        private TaskSpec taskSpec;

        @com.aliyun.core.annotation.NameInMap("TaskSustainable")
        private Boolean taskSustainable;

        private Tasks(Builder builder) {
            this.executorPolicy = builder.executorPolicy;
            this.taskName = builder.taskName;
            this.taskSpec = builder.taskSpec;
            this.taskSustainable = builder.taskSustainable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return executorPolicy
         */
        public ExecutorPolicy getExecutorPolicy() {
            return this.executorPolicy;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskSpec
         */
        public TaskSpec getTaskSpec() {
            return this.taskSpec;
        }

        /**
         * @return taskSustainable
         */
        public Boolean getTaskSustainable() {
            return this.taskSustainable;
        }

        public static final class Builder {
            private ExecutorPolicy executorPolicy; 
            private String taskName; 
            private TaskSpec taskSpec; 
            private Boolean taskSustainable; 

            /**
             * ExecutorPolicy.
             */
            public Builder executorPolicy(ExecutorPolicy executorPolicy) {
                this.executorPolicy = executorPolicy;
                return this;
            }

            /**
             * TaskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * TaskSpec.
             */
            public Builder taskSpec(TaskSpec taskSpec) {
                this.taskSpec = taskSpec;
                return this;
            }

            /**
             * TaskSustainable.
             */
            public Builder taskSustainable(Boolean taskSustainable) {
                this.taskSustainable = taskSustainable;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
