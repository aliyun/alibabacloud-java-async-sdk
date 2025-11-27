// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpcinstant20230701.models;

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
 * {@link GetJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetJobResponseBody</p>
 */
public class GetJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobInfo")
    private JobInfo jobInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetJobResponseBody model) {
            this.jobInfo = model.jobInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The job details.</p>
         */
        public Builder jobInfo(JobInfo jobInfo) {
            this.jobInfo = jobInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>896D338C-E4F4-41EC-A154-D605E5DE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetJobResponseBody build() {
            return new GetJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobResponseBody</p>
     */
    public static class JobDependency extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private JobDependency(Builder builder) {
            this.jobId = builder.jobId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobDependency create() {
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

            private Builder(JobDependency model) {
                this.jobId = model.jobId;
                this.type = model.type;
            } 

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

            public JobDependency build() {
                return new JobDependency(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobResponseBody</p>
     */
    public static class DependencyPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobDependency")
        private java.util.List<JobDependency> jobDependency;

        private DependencyPolicy(Builder builder) {
            this.jobDependency = builder.jobDependency;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DependencyPolicy create() {
            return builder().build();
        }

        /**
         * @return jobDependency
         */
        public java.util.List<JobDependency> getJobDependency() {
            return this.jobDependency;
        }

        public static final class Builder {
            private java.util.List<JobDependency> jobDependency; 

            private Builder() {
            } 

            private Builder(DependencyPolicy model) {
                this.jobDependency = model.jobDependency;
            } 

            /**
             * JobDependency.
             */
            public Builder jobDependency(java.util.List<JobDependency> jobDependency) {
                this.jobDependency = jobDependency;
                return this;
            }

            public DependencyPolicy build() {
                return new DependencyPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobResponseBody</p>
     */
    public static class Network extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableENIMapping")
        private Boolean enableENIMapping;

        @com.aliyun.core.annotation.NameInMap("EnableExternalIpAddress")
        private Boolean enableExternalIpAddress;

        @com.aliyun.core.annotation.NameInMap("Vswitch")
        private java.util.List<String> vswitch;

        private Network(Builder builder) {
            this.enableENIMapping = builder.enableENIMapping;
            this.enableExternalIpAddress = builder.enableExternalIpAddress;
            this.vswitch = builder.vswitch;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Network create() {
            return builder().build();
        }

        /**
         * @return enableENIMapping
         */
        public Boolean getEnableENIMapping() {
            return this.enableENIMapping;
        }

        /**
         * @return enableExternalIpAddress
         */
        public Boolean getEnableExternalIpAddress() {
            return this.enableExternalIpAddress;
        }

        /**
         * @return vswitch
         */
        public java.util.List<String> getVswitch() {
            return this.vswitch;
        }

        public static final class Builder {
            private Boolean enableENIMapping; 
            private Boolean enableExternalIpAddress; 
            private java.util.List<String> vswitch; 

            private Builder() {
            } 

            private Builder(Network model) {
                this.enableENIMapping = model.enableENIMapping;
                this.enableExternalIpAddress = model.enableExternalIpAddress;
                this.vswitch = model.vswitch;
            } 

            /**
             * <p>Whether the resource is created in the zone corresponding to the passed-in VSwitch parameter.</p>
             * <ul>
             * <li>true: The resource is created in the zone corresponding to the passed-in VSwitch parameter.</li>
             * <li>false: The resource is created in any zone that has resources.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableENIMapping(Boolean enableENIMapping) {
                this.enableENIMapping = enableENIMapping;
                return this;
            }

            /**
             * <p>Whether to create a public IP address.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>false: false.</li>
             * <li>true: true.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableExternalIpAddress(Boolean enableExternalIpAddress) {
                this.enableExternalIpAddress = enableExternalIpAddress;
                return this;
            }

            /**
             * <p>The VSwitch array.</p>
             */
            public Builder vswitch(java.util.List<String> vswitch) {
                this.vswitch = vswitch;
                return this;
            }

            public Network build() {
                return new Network(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The key of the job tag.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The value of the job tag.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobResponseBody</p>
     */
    public static class DeploymentPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocationSpec")
        private String allocationSpec;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Network")
        private Network network;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private DeploymentPolicy(Builder builder) {
            this.allocationSpec = builder.allocationSpec;
            this.level = builder.level;
            this.network = builder.network;
            this.tags = builder.tags;
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
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return network
         */
        public Network getNetwork() {
            return this.network;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String allocationSpec; 
            private String level; 
            private Network network; 
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(DeploymentPolicy model) {
                this.allocationSpec = model.allocationSpec;
                this.level = model.level;
                this.network = model.network;
                this.tags = model.tags;
            } 

            /**
             * <p>The type of the resource. Only Dedicated is supported. You must enable a whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>Dedicated</p>
             */
            public Builder allocationSpec(String allocationSpec) {
                this.allocationSpec = allocationSpec;
                return this;
            }

            /**
             * <p>The computing power level. The following disk categories are supported:</p>
             * <ul>
             * <li>General</li>
             * <li>Performance</li>
             * </ul>
             * <p>Default value: General</p>
             * 
             * <strong>example:</strong>
             * <p>General</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The network configuration information.</p>
             */
            public Builder network(Network network) {
                this.network = network;
                return this;
            }

            /**
             * <p>The list of job tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public DeploymentPolicy build() {
                return new DeploymentPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ArraySpec model) {
                this.indexEnd = model.indexEnd;
                this.indexStart = model.indexStart;
                this.indexStep = model.indexStep;
            } 

            /**
             * <p>The end value of the array job index. Valid values: 0 to 4999. The value must be greater than or equal to the value of IndexStart.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder indexEnd(Integer indexEnd) {
                this.indexEnd = indexEnd;
                return this;
            }

            /**
             * <p>The starting value of the array job index. Valid values: 0 to 4999.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder indexStart(Integer indexStart) {
                this.indexStart = indexStart;
                return this;
            }

            /**
             * <p>The interval of the array job index.</p>
             * <blockquote>
             * <p>If the array job property is IndexStart=1,IndexEnd=5, and IndexStep=2, the array job contains three subtasks. The values of the subtask indexes are 1,3, and 5.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link GetJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ExecutorPolicy model) {
                this.arraySpec = model.arraySpec;
                this.maxCount = model.maxCount;
            } 

            /**
             * <p>The details of the array job.</p>
             */
            public Builder arraySpec(ArraySpec arraySpec) {
                this.arraySpec = arraySpec;
                return this;
            }

            /**
             * <p>The maximum number of nodes to run the job.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
    /**
     * 
     * {@link GetJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobResponseBody</p>
     */
    public static class ExecutorStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArrayId")
        private Integer arrayId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusReason")
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

            private Builder() {
            } 

            private Builder(ExecutorStatus model) {
                this.arrayId = model.arrayId;
                this.createTime = model.createTime;
                this.endTime = model.endTime;
                this.startTime = model.startTime;
                this.status = model.status;
                this.statusReason = model.statusReason;
            } 

            /**
             * <p>Sub-job ID</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder arrayId(Integer arrayId) {
                this.arrayId = arrayId;
                return this;
            }

            /**
             * <p>The time when the job was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-02-04 13:54:10</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The end time of the scaling plan job.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-02-04 13:54:10</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The start time of the scaling plan job.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-02-04 13:54:10</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The reason why the stack instance is in the OUTDATED state.</p>
             * 
             * <strong>example:</strong>
             * <p>Creating executor</p>
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
    /**
     * 
     * {@link GetJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Disks model) {
                this.size = model.size;
                this.type = model.type;
            } 

            /**
             * <p>The size of the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The type of the disk. The following disk categories are supported:</p>
             * <ul>
             * <li>System: system disk.</li>
             * <li>Data: data disk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>System</p>
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
    /**
     * 
     * {@link GetJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobResponseBody</p>
     */
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cores")
        private Float cores;

        @com.aliyun.core.annotation.NameInMap("Disks")
        private java.util.List<Disks> disks;

        @com.aliyun.core.annotation.NameInMap("EnableHT")
        private Boolean enableHT;

        @com.aliyun.core.annotation.NameInMap("HostNamePrefix")
        private String hostNamePrefix;

        @com.aliyun.core.annotation.NameInMap("InstanceTypes")
        private java.util.List<String> instanceTypes;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Integer memory;

        private Resource(Builder builder) {
            this.cores = builder.cores;
            this.disks = builder.disks;
            this.enableHT = builder.enableHT;
            this.hostNamePrefix = builder.hostNamePrefix;
            this.instanceTypes = builder.instanceTypes;
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
        public java.util.List<Disks> getDisks() {
            return this.disks;
        }

        /**
         * @return enableHT
         */
        public Boolean getEnableHT() {
            return this.enableHT;
        }

        /**
         * @return hostNamePrefix
         */
        public String getHostNamePrefix() {
            return this.hostNamePrefix;
        }

        /**
         * @return instanceTypes
         */
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        public static final class Builder {
            private Float cores; 
            private java.util.List<Disks> disks; 
            private Boolean enableHT; 
            private String hostNamePrefix; 
            private java.util.List<String> instanceTypes; 
            private Integer memory; 

            private Builder() {
            } 

            private Builder(Resource model) {
                this.cores = model.cores;
                this.disks = model.disks;
                this.enableHT = model.enableHT;
                this.hostNamePrefix = model.hostNamePrefix;
                this.instanceTypes = model.instanceTypes;
                this.memory = model.memory;
            } 

            /**
             * <p>The number of CPUs on which the job is run.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cores(Float cores) {
                this.cores = cores;
                return this;
            }

            /**
             * <p>The array of the disks.</p>
             */
            public Builder disks(java.util.List<Disks> disks) {
                this.disks = disks;
                return this;
            }

            /**
             * EnableHT.
             */
            public Builder enableHT(Boolean enableHT) {
                this.enableHT = enableHT;
                return this;
            }

            /**
             * HostNamePrefix.
             */
            public Builder hostNamePrefix(String hostNamePrefix) {
                this.hostNamePrefix = hostNamePrefix;
                return this;
            }

            /**
             * InstanceTypes.
             */
            public Builder instanceTypes(java.util.List<String> instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * <p>The memory capacity. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
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
    /**
     * 
     * {@link GetJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobResponseBody</p>
     */
    public static class ExitCodeActions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("ExitCode")
        private Long exitCode;

        private ExitCodeActions(Builder builder) {
            this.action = builder.action;
            this.exitCode = builder.exitCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExitCodeActions create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return exitCode
         */
        public Long getExitCode() {
            return this.exitCode;
        }

        public static final class Builder {
            private String action; 
            private Long exitCode; 

            private Builder() {
            } 

            private Builder(ExitCodeActions model) {
                this.action = model.action;
                this.exitCode = model.exitCode;
            } 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * ExitCode.
             */
            public Builder exitCode(Long exitCode) {
                this.exitCode = exitCode;
                return this;
            }

            public ExitCodeActions build() {
                return new ExitCodeActions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobResponseBody</p>
     */
    public static class RetryPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExitCodeActions")
        private java.util.List<ExitCodeActions> exitCodeActions;

        @com.aliyun.core.annotation.NameInMap("RetryCount")
        private Integer retryCount;

        private RetryPolicy(Builder builder) {
            this.exitCodeActions = builder.exitCodeActions;
            this.retryCount = builder.retryCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RetryPolicy create() {
            return builder().build();
        }

        /**
         * @return exitCodeActions
         */
        public java.util.List<ExitCodeActions> getExitCodeActions() {
            return this.exitCodeActions;
        }

        /**
         * @return retryCount
         */
        public Integer getRetryCount() {
            return this.retryCount;
        }

        public static final class Builder {
            private java.util.List<ExitCodeActions> exitCodeActions; 
            private Integer retryCount; 

            private Builder() {
            } 

            private Builder(RetryPolicy model) {
                this.exitCodeActions = model.exitCodeActions;
                this.retryCount = model.retryCount;
            } 

            /**
             * ExitCodeActions.
             */
            public Builder exitCodeActions(java.util.List<ExitCodeActions> exitCodeActions) {
                this.exitCodeActions = exitCodeActions;
                return this;
            }

            /**
             * RetryCount.
             */
            public Builder retryCount(Integer retryCount) {
                this.retryCount = retryCount;
                return this;
            }

            public RetryPolicy build() {
                return new RetryPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobResponseBody</p>
     */
    public static class Vm extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("PrologScript")
        private String prologScript;

        @com.aliyun.core.annotation.NameInMap("Script")
        private String script;

        private Vm(Builder builder) {
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
            private String image; 
            private String prologScript; 
            private String script; 

            private Builder() {
            } 

            private Builder(Vm model) {
                this.image = model.image;
                this.prologScript = model.prologScript;
                this.script = model.script;
            } 

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>m-xxxx</p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The pre-processing script. Base64 encoding is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ZWNobyAiMTIzNCIgPiBgZGF0ZSArJXNg</p>
             */
            public Builder prologScript(String prologScript) {
                this.prologScript = prologScript;
                return this;
            }

            /**
             * <p>The running-job script. Base64 encoding is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ZWNobyAiMTIzNCIgPiBgZGF0ZSArJXNg</p>
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
    /**
     * 
     * {@link GetJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobResponseBody</p>
     */
    public static class TaskExecutor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VM")
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

            private Builder() {
            } 

            private Builder(TaskExecutor model) {
                this.vm = model.vm;
            } 

            /**
             * <p>Use ECS instances.</p>
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
    /**
     * 
     * {@link GetJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobResponseBody</p>
     */
    public static class TaskSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Resource")
        private Resource resource;

        @com.aliyun.core.annotation.NameInMap("RetryPolicy")
        private RetryPolicy retryPolicy;

        @com.aliyun.core.annotation.NameInMap("TaskExecutor")
        private java.util.List<TaskExecutor> taskExecutor;

        private TaskSpec(Builder builder) {
            this.resource = builder.resource;
            this.retryPolicy = builder.retryPolicy;
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
         * @return retryPolicy
         */
        public RetryPolicy getRetryPolicy() {
            return this.retryPolicy;
        }

        /**
         * @return taskExecutor
         */
        public java.util.List<TaskExecutor> getTaskExecutor() {
            return this.taskExecutor;
        }

        public static final class Builder {
            private Resource resource; 
            private RetryPolicy retryPolicy; 
            private java.util.List<TaskExecutor> taskExecutor; 

            private Builder() {
            } 

            private Builder(TaskSpec model) {
                this.resource = model.resource;
                this.retryPolicy = model.retryPolicy;
                this.taskExecutor = model.taskExecutor;
            } 

            /**
             * <p>The resource information.</p>
             */
            public Builder resource(Resource resource) {
                this.resource = resource;
                return this;
            }

            /**
             * RetryPolicy.
             */
            public Builder retryPolicy(RetryPolicy retryPolicy) {
                this.retryPolicy = retryPolicy;
                return this;
            }

            /**
             * <p>The task execution configurations.</p>
             */
            public Builder taskExecutor(java.util.List<TaskExecutor> taskExecutor) {
                this.taskExecutor = taskExecutor;
                return this;
            }

            public TaskSpec build() {
                return new TaskSpec(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExecutorPolicy")
        private ExecutorPolicy executorPolicy;

        @com.aliyun.core.annotation.NameInMap("ExecutorStatus")
        private java.util.List<ExecutorStatus> executorStatus;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TaskSpec")
        private TaskSpec taskSpec;

        @com.aliyun.core.annotation.NameInMap("TaskSustainable")
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
        public java.util.List<ExecutorStatus> getExecutorStatus() {
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
            private java.util.List<ExecutorStatus> executorStatus; 
            private String taskName; 
            private TaskSpec taskSpec; 
            private Boolean taskSustainable; 

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.executorPolicy = model.executorPolicy;
                this.executorStatus = model.executorStatus;
                this.taskName = model.taskName;
                this.taskSpec = model.taskSpec;
                this.taskSustainable = model.taskSustainable;
            } 

            /**
             * <p>The task execution policy.</p>
             */
            public Builder executorPolicy(ExecutorPolicy executorPolicy) {
                this.executorPolicy = executorPolicy;
                return this;
            }

            /**
             * <p>The execution status of the task.</p>
             */
            public Builder executorStatus(java.util.List<ExecutorStatus> executorStatus) {
                this.executorStatus = executorStatus;
                return this;
            }

            /**
             * <p>The name of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>task0</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The details of the task specification.</p>
             */
            public Builder taskSpec(TaskSpec taskSpec) {
                this.taskSpec = taskSpec;
                return this;
            }

            /**
             * <p>Indicate whether the job is a long-running job.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link GetJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobResponseBody</p>
     */
    public static class JobInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppExtraInfo")
        private String appExtraInfo;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DependencyPolicy")
        private DependencyPolicy dependencyPolicy;

        @com.aliyun.core.annotation.NameInMap("DeploymentPolicy")
        private DeploymentPolicy deploymentPolicy;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("JobDescription")
        private String jobDescription;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("JobScheduler")
        private String jobScheduler;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tasks")
        private java.util.List<Tasks> tasks;

        private JobInfo(Builder builder) {
            this.appExtraInfo = builder.appExtraInfo;
            this.createTime = builder.createTime;
            this.dependencyPolicy = builder.dependencyPolicy;
            this.deploymentPolicy = builder.deploymentPolicy;
            this.endTime = builder.endTime;
            this.jobDescription = builder.jobDescription;
            this.jobId = builder.jobId;
            this.jobName = builder.jobName;
            this.jobScheduler = builder.jobScheduler;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.tasks = builder.tasks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobInfo create() {
            return builder().build();
        }

        /**
         * @return appExtraInfo
         */
        public String getAppExtraInfo() {
            return this.appExtraInfo;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dependencyPolicy
         */
        public DependencyPolicy getDependencyPolicy() {
            return this.dependencyPolicy;
        }

        /**
         * @return deploymentPolicy
         */
        public DeploymentPolicy getDeploymentPolicy() {
            return this.deploymentPolicy;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
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
         * @return jobScheduler
         */
        public String getJobScheduler() {
            return this.jobScheduler;
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
         * @return tasks
         */
        public java.util.List<Tasks> getTasks() {
            return this.tasks;
        }

        public static final class Builder {
            private String appExtraInfo; 
            private String createTime; 
            private DependencyPolicy dependencyPolicy; 
            private DeploymentPolicy deploymentPolicy; 
            private String endTime; 
            private String jobDescription; 
            private String jobId; 
            private String jobName; 
            private String jobScheduler; 
            private String startTime; 
            private String status; 
            private java.util.List<Tasks> tasks; 

            private Builder() {
            } 

            private Builder(JobInfo model) {
                this.appExtraInfo = model.appExtraInfo;
                this.createTime = model.createTime;
                this.dependencyPolicy = model.dependencyPolicy;
                this.deploymentPolicy = model.deploymentPolicy;
                this.endTime = model.endTime;
                this.jobDescription = model.jobDescription;
                this.jobId = model.jobId;
                this.jobName = model.jobName;
                this.jobScheduler = model.jobScheduler;
                this.startTime = model.startTime;
                this.status = model.status;
                this.tasks = model.tasks;
            } 

            /**
             * <p>The additional information about the application.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;xxx&quot;: &quot;xxxxx&quot;}</p>
             */
            public Builder appExtraInfo(String appExtraInfo) {
                this.appExtraInfo = appExtraInfo;
                return this;
            }

            /**
             * <p>The time when the job was submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-05 20:00:46</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DependencyPolicy.
             */
            public Builder dependencyPolicy(DependencyPolicy dependencyPolicy) {
                this.dependencyPolicy = dependencyPolicy;
                return this;
            }

            /**
             * <p>The resource deployment policy.</p>
             */
            public Builder deploymentPolicy(DeploymentPolicy deploymentPolicy) {
                this.deploymentPolicy = deploymentPolicy;
                return this;
            }

            /**
             * <p>The time when the job is complete.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-05 20:01:48</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The description of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>Demo</p>
             */
            public Builder jobDescription(String jobDescription) {
                this.jobDescription = jobDescription;
                return this;
            }

            /**
             * <p>The ID of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>job-xxxx</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The job name.</p>
             * 
             * <strong>example:</strong>
             * <p>testJob</p>
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * <p>The type of the job scheduler.</p>
             * 
             * <strong>example:</strong>
             * <p>HPC</p>
             */
            public Builder jobScheduler(String jobScheduler) {
                this.jobScheduler = jobScheduler;
                return this;
            }

            /**
             * <p>The time when the job started.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-05 20:00:48</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The job status. Valid values:</p>
             * <ul>
             * <li>Pending: The job is being queued.</li>
             * <li>Initing: The job is being initialized.</li>
             * <li>Succeed: The job is successfully run.</li>
             * <li>Failed: The job failed to run.</li>
             * <li>Running: The job is running.</li>
             * <li>Exception: scheduling exception</li>
             * <li>Retrying: The job is being retried.</li>
             * <li>Expired: The job timed out.</li>
             * <li>Deleted: The job is deleted.</li>
             * <li>Suspended: job hibernation</li>
             * <li>Restarting: The job is being restarted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Succeed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The list of tasks. Only one task is supported.</p>
             */
            public Builder tasks(java.util.List<Tasks> tasks) {
                this.tasks = tasks;
                return this;
            }

            public JobInfo build() {
                return new JobInfo(this);
            } 

        } 

    }
}
