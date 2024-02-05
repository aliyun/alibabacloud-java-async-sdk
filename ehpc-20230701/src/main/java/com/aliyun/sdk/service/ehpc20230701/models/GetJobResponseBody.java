// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20230701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetJobResponseBody</p>
 */
public class GetJobResponseBody extends TeaModel {
    @NameInMap("JobInfo")
    private JobInfo jobInfo;

    @NameInMap("RequestId")
    private String requestId;

    private GetJobResponseBody(Builder builder) {
        this.jobInfo = builder.jobInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobInfo
     */
    public JobInfo getJobInfo() {
        return this.jobInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private JobInfo jobInfo; 
        private String requestId; 

        /**
         * JobInfo.
         */
        public Builder jobInfo(JobInfo jobInfo) {
            this.jobInfo = jobInfo;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetJobResponseBody build() {
            return new GetJobResponseBody(this);
        } 

    } 

    public static class Network extends TeaModel {
        @NameInMap("Vswitch")
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
        @NameInMap("AllocationSpec")
        private String allocationSpec;

        @NameInMap("Network")
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
        @NameInMap("IndexEnd")
        private Integer indexEnd;

        @NameInMap("IndexStart")
        private Integer indexStart;

        @NameInMap("IndexStep")
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
        @NameInMap("ArraySpec")
        private ArraySpec arraySpec;

        @NameInMap("MaxCount")
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
    public static class ExecutorStatus extends TeaModel {
        @NameInMap("ArrayId")
        private Integer arrayId;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusReason")
        private String statusReason;

        private ExecutorStatus(Builder builder) {
            this.arrayId = builder.arrayId;
            this.createTime = builder.createTime;
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.statusReason = builder.statusReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExecutorStatus create() {
            return builder().build();
        }

        /**
         * @return arrayId
         */
        public Integer getArrayId() {
            return this.arrayId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
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

        /**
         * @return statusReason
         */
        public String getStatusReason() {
            return this.statusReason;
        }

        public static final class Builder {
            private Integer arrayId; 
            private String createTime; 
            private String endTime; 
            private String startTime; 
            private String status; 
            private String statusReason; 

            /**
             * ArrayId.
             */
            public Builder arrayId(Integer arrayId) {
                this.arrayId = arrayId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
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

            /**
             * StatusReason.
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            public ExecutorStatus build() {
                return new ExecutorStatus(this);
            } 

        } 

    }
    public static class Disks extends TeaModel {
        @NameInMap("Size")
        private Integer size;

        @NameInMap("Type")
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
        @NameInMap("Cores")
        private Float cores;

        @NameInMap("Disks")
        private java.util.List < Disks> disks;

        @NameInMap("Memory")
        private Integer memory;

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
        public Integer getMemory() {
            return this.memory;
        }

        public static final class Builder {
            private Float cores; 
            private java.util.List < Disks> disks; 
            private Integer memory; 

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
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
    public static class Vm extends TeaModel {
        @NameInMap("Image")
        private String image;

        @NameInMap("PrologScript")
        private String prologScript;

        private Vm(Builder builder) {
            this.image = builder.image;
            this.prologScript = builder.prologScript;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vm create() {
            return builder().build();
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

        public static final class Builder {
            private String image; 
            private String prologScript; 

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

            public Vm build() {
                return new Vm(this);
            } 

        } 

    }
    public static class TaskExecutor extends TeaModel {
        @NameInMap("VM")
        private Vm vm;

        private TaskExecutor(Builder builder) {
            this.vm = builder.vm;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskExecutor create() {
            return builder().build();
        }

        /**
         * @return vm
         */
        public Vm getVm() {
            return this.vm;
        }

        public static final class Builder {
            private Vm vm; 

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
    public static class TaskSpec extends TeaModel {
        @NameInMap("Resource")
        private Resource resource;

        @NameInMap("TaskExecutor")
        private java.util.List < TaskExecutor> taskExecutor;

        private TaskSpec(Builder builder) {
            this.resource = builder.resource;
            this.taskExecutor = builder.taskExecutor;
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

        public static final class Builder {
            private Resource resource; 
            private java.util.List < TaskExecutor> taskExecutor; 

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

            public TaskSpec build() {
                return new TaskSpec(this);
            } 

        } 

    }
    public static class Tasks extends TeaModel {
        @NameInMap("ExecutorPolicy")
        private ExecutorPolicy executorPolicy;

        @NameInMap("ExecutorStatus")
        private java.util.List < ExecutorStatus> executorStatus;

        @NameInMap("TaskName")
        private String taskName;

        @NameInMap("TaskSpec")
        private TaskSpec taskSpec;

        @NameInMap("TaskSustainable")
        private Boolean taskSustainable;

        private Tasks(Builder builder) {
            this.executorPolicy = builder.executorPolicy;
            this.executorStatus = builder.executorStatus;
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
         * @return executorStatus
         */
        public java.util.List < ExecutorStatus> getExecutorStatus() {
            return this.executorStatus;
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
            private java.util.List < ExecutorStatus> executorStatus; 
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
             * ExecutorStatus.
             */
            public Builder executorStatus(java.util.List < ExecutorStatus> executorStatus) {
                this.executorStatus = executorStatus;
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
    public static class JobInfo extends TeaModel {
        @NameInMap("DeploymentPolicy")
        private DeploymentPolicy deploymentPolicy;

        @NameInMap("JobDescription")
        private String jobDescription;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("JobName")
        private String jobName;

        @NameInMap("Tasks")
        private java.util.List < Tasks> tasks;

        private JobInfo(Builder builder) {
            this.deploymentPolicy = builder.deploymentPolicy;
            this.jobDescription = builder.jobDescription;
            this.jobId = builder.jobId;
            this.jobName = builder.jobName;
            this.tasks = builder.tasks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobInfo create() {
            return builder().build();
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
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return tasks
         */
        public java.util.List < Tasks> getTasks() {
            return this.tasks;
        }

        public static final class Builder {
            private DeploymentPolicy deploymentPolicy; 
            private String jobDescription; 
            private String jobId; 
            private String jobName; 
            private java.util.List < Tasks> tasks; 

            /**
             * DeploymentPolicy.
             */
            public Builder deploymentPolicy(DeploymentPolicy deploymentPolicy) {
                this.deploymentPolicy = deploymentPolicy;
                return this;
            }

            /**
             * JobDescription.
             */
            public Builder jobDescription(String jobDescription) {
                this.jobDescription = jobDescription;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * JobName.
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * Tasks.
             */
            public Builder tasks(java.util.List < Tasks> tasks) {
                this.tasks = tasks;
                return this;
            }

            public JobInfo build() {
                return new JobInfo(this);
            } 

        } 

    }
}
