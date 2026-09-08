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
 * {@link ListTrainingJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTrainingJobsResponseBody</p>
 */
public class ListTrainingJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("TrainingJobs")
    private java.util.List<TrainingJobs> trainingJobs;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<TrainingJobs> getTrainingJobs() {
        return this.trainingJobs;
    }

    public static final class Builder {
        private String requestId; 
        private Long totalCount; 
        private java.util.List<TrainingJobs> trainingJobs; 

        private Builder() {
        } 

        private Builder(ListTrainingJobsResponseBody model) {
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.trainingJobs = model.trainingJobs;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of training jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The list of training job details.</p>
         */
        public Builder trainingJobs(java.util.List<TrainingJobs> trainingJobs) {
            this.trainingJobs = trainingJobs;
            return this;
        }

        public ListTrainingJobsResponseBody build() {
            return new ListTrainingJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTrainingJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTrainingJobsResponseBody</p>
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
             * <p>The number of CPU cores of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder CPU(String CPU) {
                this.CPU = CPU;
                return this;
            }

            /**
             * <p>The number of GPUs of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder GPU(String GPU) {
                this.GPU = GPU;
                return this;
            }

            /**
             * <p>The GPU type of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>V100</p>
             */
            public Builder GPUType(String GPUType) {
                this.GPUType = GPUType;
                return this;
            }

            /**
             * <p>The memory size of the instance. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The shared memory size of the instance. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
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
     * {@link ListTrainingJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTrainingJobsResponseBody</p>
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

        private ComputeResource(Builder builder) {
            this.ecsCount = builder.ecsCount;
            this.ecsSpec = builder.ecsSpec;
            this.instanceCount = builder.instanceCount;
            this.instanceSpec = builder.instanceSpec;
            this.resourceId = builder.resourceId;
            this.resourceName = builder.resourceName;
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

        public static final class Builder {
            private Long ecsCount; 
            private String ecsSpec; 
            private Long instanceCount; 
            private InstanceSpec instanceSpec; 
            private String resourceId; 
            private String resourceName; 

            private Builder() {
            } 

            private Builder(ComputeResource model) {
                this.ecsCount = model.ecsCount;
                this.ecsSpec = model.ecsSpec;
                this.instanceCount = model.instanceCount;
                this.instanceSpec = model.instanceSpec;
                this.resourceId = model.resourceId;
                this.resourceName = model.resourceName;
            } 

            /**
             * <p>The number of ECS instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ecsCount(Long ecsCount) {
                this.ecsCount = ecsCount;
                return this;
            }

            /**
             * <p>The ECS instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.gn5-c8g1.2xlarge</p>
             */
            public Builder ecsSpec(String ecsSpec) {
                this.ecsSpec = ecsSpec;
                return this;
            }

            /**
             * <p>The number of resource quota instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder instanceCount(Long instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * <p>The resource quota instance specification.</p>
             */
            public Builder instanceSpec(InstanceSpec instanceSpec) {
                this.instanceSpec = instanceSpec;
                return this;
            }

            /**
             * <p>The resource quota ID.</p>
             * 
             * <strong>example:</strong>
             * <p>quotam670lixikcl</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The resource quota name.</p>
             * 
             * <strong>example:</strong>
             * <p>quota</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            public ComputeResource build() {
                return new ComputeResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTrainingJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTrainingJobsResponseBody</p>
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
             * <p>The ID of the experiment associated with the training job.</p>
             * 
             * <strong>example:</strong>
             * <p>exp-ds9aefia90v</p>
             */
            public Builder experimentId(String experimentId) {
                this.experimentId = experimentId;
                return this;
            }

            /**
             * <p>The name of the experiment associated with the training job.</p>
             * 
             * <strong>example:</strong>
             * <p>large_language_model</p>
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
     * {@link ListTrainingJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTrainingJobsResponseBody</p>
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
             * <p>The parameter name.</p>
             * 
             * <strong>example:</strong>
             * <p>learning_rate</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The parameter value.</p>
             * 
             * <strong>example:</strong>
             * <p>0.001</p>
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
     * {@link ListTrainingJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTrainingJobsResponseBody</p>
     */
    public static class InputChannels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatasetId")
        private String datasetId;

        @com.aliyun.core.annotation.NameInMap("InputUri")
        private String inputUri;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RoleArn")
        private String roleArn;

        @com.aliyun.core.annotation.NameInMap("VersionName")
        private String versionName;

        private InputChannels(Builder builder) {
            this.datasetId = builder.datasetId;
            this.inputUri = builder.inputUri;
            this.name = builder.name;
            this.roleArn = builder.roleArn;
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
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
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
            private String roleArn; 
            private String versionName; 

            private Builder() {
            } 

            private Builder(InputChannels model) {
                this.datasetId = model.datasetId;
                this.inputUri = model.inputUri;
                this.name = model.name;
                this.roleArn = model.roleArn;
                this.versionName = model.versionName;
            } 

            /**
             * <p>The dataset ID.</p>
             * 
             * <strong>example:</strong>
             * <p>d-475megosidivjfgfq6</p>
             */
            public Builder datasetId(String datasetId) {
                this.datasetId = datasetId;
                return this;
            }

            /**
             * <p>The input data URI.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://test-bucket.oss-cn-hangzhou-internal.aliyuncs.com/path/to/input/channel/</p>
             */
            public Builder inputUri(String inputUri) {
                this.inputUri = inputUri;
                return this;
            }

            /**
             * <p>The input data name.</p>
             * 
             * <strong>example:</strong>
             * <p>model</p>
             */
            public Builder name(String name) {
                this.name = name;
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
     * {@link ListTrainingJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTrainingJobsResponseBody</p>
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
             * <p>The label key.</p>
             * 
             * <strong>example:</strong>
             * <p>CreatedBy</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The label value.</p>
             * 
             * <strong>example:</strong>
             * <p>QuickStart</p>
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
     * {@link ListTrainingJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTrainingJobsResponseBody</p>
     */
    public static class OutputChannels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatasetId")
        private String datasetId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OutputUri")
        private String outputUri;

        @com.aliyun.core.annotation.NameInMap("RoleArn")
        private String roleArn;

        @com.aliyun.core.annotation.NameInMap("VersionName")
        private String versionName;

        private OutputChannels(Builder builder) {
            this.datasetId = builder.datasetId;
            this.name = builder.name;
            this.outputUri = builder.outputUri;
            this.roleArn = builder.roleArn;
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
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
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
            private String roleArn; 
            private String versionName; 

            private Builder() {
            } 

            private Builder(OutputChannels model) {
                this.datasetId = model.datasetId;
                this.name = model.name;
                this.outputUri = model.outputUri;
                this.roleArn = model.roleArn;
                this.versionName = model.versionName;
            } 

            /**
             * <p>The dataset ID.</p>
             * 
             * <strong>example:</strong>
             * <p>d-8o0hh35po15ejcdq2p</p>
             */
            public Builder datasetId(String datasetId) {
                this.datasetId = datasetId;
                return this;
            }

            /**
             * <p>The output data name.</p>
             * 
             * <strong>example:</strong>
             * <p>model</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The output data URI.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://test-bucket.oss-cn-hangzhou-internal.aliyuncs.com/path/to/output/channel/</p>
             */
            public Builder outputUri(String outputUri) {
                this.outputUri = outputUri;
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
     * {@link ListTrainingJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTrainingJobsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Scheduler model) {
                this.maxRunningTimeInSeconds = model.maxRunningTimeInSeconds;
            } 

            /**
             * <p>The maximum training runtime in seconds. A value of 0 indicates no limit on the maximum runtime.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
     * {@link ListTrainingJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTrainingJobsResponseBody</p>
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
             * <p>The end time of the status.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-10T11:49:47Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The status code.</p>
             * 
             * <strong>example:</strong>
             * <p>TrainingJobSucceed</p>
             */
            public Builder reasonCode(String reasonCode) {
                this.reasonCode = reasonCode;
                return this;
            }

            /**
             * <p>The status update message.</p>
             * 
             * <strong>example:</strong>
             * <p>KubeDL job runs successfully</p>
             */
            public Builder reasonMessage(String reasonMessage) {
                this.reasonMessage = reasonMessage;
                return this;
            }

            /**
             * <p>The start time of the status.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-10T11:49:47Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the training job.</p>
             * 
             * <strong>example:</strong>
             * <p>Creating</p>
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
     * {@link ListTrainingJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTrainingJobsResponseBody</p>
     */
    public static class UserVpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultRoute")
        private String defaultRoute;

        @com.aliyun.core.annotation.NameInMap("ExtendedCIDRs")
        private java.util.List<String> extendedCIDRs;

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
            private String defaultRoute; 
            private java.util.List<String> extendedCIDRs; 
            private String securityGroupId; 
            private String switchId; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(UserVpc model) {
                this.defaultRoute = model.defaultRoute;
                this.extendedCIDRs = model.extendedCIDRs;
                this.securityGroupId = model.securityGroupId;
                this.switchId = model.switchId;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The default route.</p>
             * 
             * <strong>example:</strong>
             * <p>eth1</p>
             */
            public Builder defaultRoute(String defaultRoute) {
                this.defaultRoute = defaultRoute;
                return this;
            }

            /**
             * <p>The extended CIDR block configuration.</p>
             */
            public Builder extendedCIDRs(java.util.List<String> extendedCIDRs) {
                this.extendedCIDRs = extendedCIDRs;
                return this;
            }

            /**
             * <p>The security group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-abcdef****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vs-abcdef****</p>
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
    /**
     * 
     * {@link ListTrainingJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTrainingJobsResponseBody</p>
     */
    public static class TrainingJobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlgorithmName")
        private String algorithmName;

        @com.aliyun.core.annotation.NameInMap("AlgorithmProvider")
        private String algorithmProvider;

        @com.aliyun.core.annotation.NameInMap("AlgorithmVersion")
        private String algorithmVersion;

        @com.aliyun.core.annotation.NameInMap("AssignNodeSpec")
        private AssignNodeSpec assignNodeSpec;

        @com.aliyun.core.annotation.NameInMap("ComputeResource")
        private ComputeResource computeResource;

        @com.aliyun.core.annotation.NameInMap("CredentialConfig")
        private CredentialConfig credentialConfig;

        @com.aliyun.core.annotation.NameInMap("DlcJobId")
        private String dlcJobId;

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

        @com.aliyun.core.annotation.NameInMap("IsTempAlgo")
        private Boolean isTempAlgo;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List<Labels> labels;

        @com.aliyun.core.annotation.NameInMap("OutputChannels")
        private java.util.List<OutputChannels> outputChannels;

        @com.aliyun.core.annotation.NameInMap("PythonRequirements")
        private java.util.List<String> pythonRequirements;

        @com.aliyun.core.annotation.NameInMap("ReasonCode")
        private String reasonCode;

        @com.aliyun.core.annotation.NameInMap("ReasonMessage")
        private String reasonMessage;

        @com.aliyun.core.annotation.NameInMap("RoleArn")
        private String roleArn;

        @com.aliyun.core.annotation.NameInMap("Scheduler")
        private Scheduler scheduler;

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

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserVpc")
        private UserVpc userVpc;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private TrainingJobs(Builder builder) {
            this.algorithmName = builder.algorithmName;
            this.algorithmProvider = builder.algorithmProvider;
            this.algorithmVersion = builder.algorithmVersion;
            this.assignNodeSpec = builder.assignNodeSpec;
            this.computeResource = builder.computeResource;
            this.credentialConfig = builder.credentialConfig;
            this.dlcJobId = builder.dlcJobId;
            this.environments = builder.environments;
            this.experimentConfig = builder.experimentConfig;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.hyperParameters = builder.hyperParameters;
            this.inputChannels = builder.inputChannels;
            this.isTempAlgo = builder.isTempAlgo;
            this.labels = builder.labels;
            this.outputChannels = builder.outputChannels;
            this.pythonRequirements = builder.pythonRequirements;
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
         * @return assignNodeSpec
         */
        public AssignNodeSpec getAssignNodeSpec() {
            return this.assignNodeSpec;
        }

        /**
         * @return computeResource
         */
        public ComputeResource getComputeResource() {
            return this.computeResource;
        }

        /**
         * @return credentialConfig
         */
        public CredentialConfig getCredentialConfig() {
            return this.credentialConfig;
        }

        /**
         * @return dlcJobId
         */
        public String getDlcJobId() {
            return this.dlcJobId;
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
         * @return outputChannels
         */
        public java.util.List<OutputChannels> getOutputChannels() {
            return this.outputChannels;
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
            private AssignNodeSpec assignNodeSpec; 
            private ComputeResource computeResource; 
            private CredentialConfig credentialConfig; 
            private String dlcJobId; 
            private java.util.Map<String, String> environments; 
            private ExperimentConfig experimentConfig; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private java.util.List<HyperParameters> hyperParameters; 
            private java.util.List<InputChannels> inputChannels; 
            private Boolean isTempAlgo; 
            private java.util.List<Labels> labels; 
            private java.util.List<OutputChannels> outputChannels; 
            private java.util.List<String> pythonRequirements; 
            private String reasonCode; 
            private String reasonMessage; 
            private String roleArn; 
            private Scheduler scheduler; 
            private String status; 
            private java.util.List<StatusTransitions> statusTransitions; 
            private String trainingJobDescription; 
            private String trainingJobId; 
            private String trainingJobName; 
            private String userId; 
            private UserVpc userVpc; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(TrainingJobs model) {
                this.algorithmName = model.algorithmName;
                this.algorithmProvider = model.algorithmProvider;
                this.algorithmVersion = model.algorithmVersion;
                this.assignNodeSpec = model.assignNodeSpec;
                this.computeResource = model.computeResource;
                this.credentialConfig = model.credentialConfig;
                this.dlcJobId = model.dlcJobId;
                this.environments = model.environments;
                this.experimentConfig = model.experimentConfig;
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtModifiedTime = model.gmtModifiedTime;
                this.hyperParameters = model.hyperParameters;
                this.inputChannels = model.inputChannels;
                this.isTempAlgo = model.isTempAlgo;
                this.labels = model.labels;
                this.outputChannels = model.outputChannels;
                this.pythonRequirements = model.pythonRequirements;
                this.reasonCode = model.reasonCode;
                this.reasonMessage = model.reasonMessage;
                this.roleArn = model.roleArn;
                this.scheduler = model.scheduler;
                this.status = model.status;
                this.statusTransitions = model.statusTransitions;
                this.trainingJobDescription = model.trainingJobDescription;
                this.trainingJobId = model.trainingJobId;
                this.trainingJobName = model.trainingJobName;
                this.userId = model.userId;
                this.userVpc = model.userVpc;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The algorithm name.</p>
             * 
             * <strong>example:</strong>
             * <p>llm_train</p>
             */
            public Builder algorithmName(String algorithmName) {
                this.algorithmName = algorithmName;
                return this;
            }

            /**
             * <p>The algorithm provider.</p>
             * 
             * <strong>example:</strong>
             * <p>pai</p>
             */
            public Builder algorithmProvider(String algorithmProvider) {
                this.algorithmProvider = algorithmProvider;
                return this;
            }

            /**
             * <p>The algorithm version.</p>
             * 
             * <strong>example:</strong>
             * <p>v0.0.1</p>
             */
            public Builder algorithmVersion(String algorithmVersion) {
                this.algorithmVersion = algorithmVersion;
                return this;
            }

            /**
             * AssignNodeSpec.
             */
            public Builder assignNodeSpec(AssignNodeSpec assignNodeSpec) {
                this.assignNodeSpec = assignNodeSpec;
                return this;
            }

            /**
             * <p>The compute resource configuration.</p>
             */
            public Builder computeResource(ComputeResource computeResource) {
                this.computeResource = computeResource;
                return this;
            }

            /**
             * CredentialConfig.
             */
            public Builder credentialConfig(CredentialConfig credentialConfig) {
                this.credentialConfig = credentialConfig;
                return this;
            }

            /**
             * DlcJobId.
             */
            public Builder dlcJobId(String dlcJobId) {
                this.dlcJobId = dlcJobId;
                return this;
            }

            /**
             * <p>The list of environment variables.</p>
             */
            public Builder environments(java.util.Map<String, String> environments) {
                this.environments = environments;
                return this;
            }

            /**
             * <p>The experiment configuration associated with the training job.</p>
             */
            public Builder experimentConfig(ExperimentConfig experimentConfig) {
                this.experimentConfig = experimentConfig;
                return this;
            }

            /**
             * <p>The time when the training job was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-10T11:49:47Z</p>
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * <p>The time when the training job status was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-10T11:49:47Z</p>
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * <p>The hyperparameter settings for training.</p>
             */
            public Builder hyperParameters(java.util.List<HyperParameters> hyperParameters) {
                this.hyperParameters = hyperParameters;
                return this;
            }

            /**
             * <p>The input data configuration for training.</p>
             */
            public Builder inputChannels(java.util.List<InputChannels> inputChannels) {
                this.inputChannels = inputChannels;
                return this;
            }

            /**
             * <p>Indicates whether a temporary algorithm is used.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isTempAlgo(Boolean isTempAlgo) {
                this.isTempAlgo = isTempAlgo;
                return this;
            }

            /**
             * <p>The labels of the training job.</p>
             */
            public Builder labels(java.util.List<Labels> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The output data configuration for training.</p>
             */
            public Builder outputChannels(java.util.List<OutputChannels> outputChannels) {
                this.outputChannels = outputChannels;
                return this;
            }

            /**
             * <p>The Python package configuration for the training job.</p>
             */
            public Builder pythonRequirements(java.util.List<String> pythonRequirements) {
                this.pythonRequirements = pythonRequirements;
                return this;
            }

            /**
             * <p>The status code of the training job.</p>
             * 
             * <strong>example:</strong>
             * <p>TrainingJobSucceed</p>
             */
            public Builder reasonCode(String reasonCode) {
                this.reasonCode = reasonCode;
                return this;
            }

            /**
             * <p>The error message of the training job.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder reasonMessage(String reasonMessage) {
                this.reasonMessage = reasonMessage;
                return this;
            }

            /**
             * <p>The role ARN used for delegated authorization.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::{accountID}:role/{roleName}</p>
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * <p>The scheduling configuration of the training job.</p>
             */
            public Builder scheduler(Scheduler scheduler) {
                this.scheduler = scheduler;
                return this;
            }

            /**
             * <p>The job status.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The list of training job status transitions.</p>
             */
            public Builder statusTransitions(java.util.List<StatusTransitions> statusTransitions) {
                this.statusTransitions = statusTransitions;
                return this;
            }

            /**
             * <p>The description of the training job.</p>
             * 
             * <strong>example:</strong>
             * <p>Qwen2 large language model training.</p>
             */
            public Builder trainingJobDescription(String trainingJobDescription) {
                this.trainingJobDescription = trainingJobDescription;
                return this;
            }

            /**
             * <p>The training job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>train1layo6js8ra</p>
             */
            public Builder trainingJobId(String trainingJobId) {
                this.trainingJobId = trainingJobId;
                return this;
            }

            /**
             * <p>The name of the training job.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen2-7b</p>
             */
            public Builder trainingJobName(String trainingJobName) {
                this.trainingJobName = trainingJobName;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The user VPC configuration.</p>
             */
            public Builder userVpc(UserVpc userVpc) {
                this.userVpc = userVpc;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
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
