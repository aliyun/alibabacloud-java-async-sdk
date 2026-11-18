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
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>job-bjxxxxxxxxxxxx</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The dependency type. Valid values:</p>
             * <ul>
             * <li>AfterSucceeded: All subtasks of the dependent job or array job run successfully (the exit code is 0).</li>
             * <li>AfterFailed: Any subtask of the dependent job or array job fails (the exit code is not 0).</li>
             * <li>AfterAny: The dependent job finishes running, regardless of success or failure.</li>
             * <li>AfterCorresponding: The corresponding subtask of the dependent array job runs successfully (the exit code is 0).</li>
             * </ul>
             * <p>Default value: AfterSucceeded.</p>
             * 
             * <strong>example:</strong>
             * <p>AfterSucceeded</p>
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
             * <p>The job dependencies. A maximum of 10 dependencies are supported.</p>
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
             * <p>Specifies whether the resource is created in the zone corresponding to the specified vSwitch parameter. Valid values:</p>
             * <ul>
             * <li><p>true: The resource is created in the zone corresponding to the specified vSwitch parameter.</p>
             * </li>
             * <li><p>false: The resource is created in any zone with available resources.</p>
             * </li>
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
             * <p>Specifies whether to create a public IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableExternalIpAddress(Boolean enableExternalIpAddress) {
                this.enableExternalIpAddress = enableExternalIpAddress;
                return this;
            }

            /**
             * <p>The vSwitch array.</p>
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
             * <p>The job tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The job tag value.</p>
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

        @com.aliyun.core.annotation.NameInMap("Pool")
        private String pool;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private DeploymentPolicy(Builder builder) {
            this.allocationSpec = builder.allocationSpec;
            this.level = builder.level;
            this.network = builder.network;
            this.pool = builder.pool;
            this.priority = builder.priority;
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
         * @return pool
         */
        public String getPool() {
            return this.pool;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
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
            private String pool; 
            private Integer priority; 
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(DeploymentPolicy model) {
                this.allocationSpec = model.allocationSpec;
                this.level = model.level;
                this.network = model.network;
                this.pool = model.pool;
                this.priority = model.priority;
                this.tags = model.tags;
            } 

            /**
             * <p>The resource type. Currently, only Dedicated is supported. You must be added to the whitelist to use this feature.</p>
             * 
             * <strong>example:</strong>
             * <p>Dedicated</p>
             */
            public Builder allocationSpec(String allocationSpec) {
                this.allocationSpec = allocationSpec;
                return this;
            }

            /**
             * <p>The computing power level. Valid values:</p>
             * <ul>
             * <li>General: General-purpose.</li>
             * <li>Performance: Performance-optimized.</li>
             * </ul>
             * <p>Default value: General.</p>
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
             * <p>The resource pool.</p>
             * 
             * <strong>example:</strong>
             * <p>testpool</p>
             */
            public Builder pool(String pool) {
                this.pool = pool;
                return this;
            }

            /**
             * <p>The priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
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
    public static class SecurityGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
        private java.util.List<String> securityGroupIds;

        private SecurityGroup(Builder builder) {
            this.securityGroupIds = builder.securityGroupIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityGroup create() {
            return builder().build();
        }

        /**
         * @return securityGroupIds
         */
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public static final class Builder {
            private java.util.List<String> securityGroupIds; 

            private Builder() {
            } 

            private Builder(SecurityGroup model) {
                this.securityGroupIds = model.securityGroupIds;
            } 

            /**
             * <p>The security group ID array.</p>
             */
            public Builder securityGroupIds(java.util.List<String> securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            public SecurityGroup build() {
                return new SecurityGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobResponseBody</p>
     */
    public static class SecurityPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityGroup")
        private SecurityGroup securityGroup;

        private SecurityPolicy(Builder builder) {
            this.securityGroup = builder.securityGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityPolicy create() {
            return builder().build();
        }

        /**
         * @return securityGroup
         */
        public SecurityGroup getSecurityGroup() {
            return this.securityGroup;
        }

        public static final class Builder {
            private SecurityGroup securityGroup; 

            private Builder() {
            } 

            private Builder(SecurityPolicy model) {
                this.securityGroup = model.securityGroup;
            } 

            /**
             * <p>The security group.</p>
             */
            public Builder securityGroup(SecurityGroup securityGroup) {
                this.securityGroup = securityGroup;
                return this;
            }

            public SecurityPolicy build() {
                return new SecurityPolicy(this);
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
             * <p>The start value of the array job index. Valid values: 0 to 4999.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder indexStart(Integer indexStart) {
                this.indexStart = indexStart;
                return this;
            }

            /**
             * <p>The step size of the array job index.</p>
             * <blockquote>
             * <p>If the array job attributes are IndexStart=1, IndexEnd=5, and IndexStep=2, the array job contains three subtasks with indexes 1, 3, and 5.</p>
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
             * <p>The array job details.</p>
             */
            public Builder arraySpec(ArraySpec arraySpec) {
                this.arraySpec = arraySpec;
                return this;
            }

            /**
             * <p>The maximum number of nodes for job execution.</p>
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
             * <p>The sub-job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder arrayId(Integer arrayId) {
                this.arrayId = arrayId;
                return this;
            }

            /**
             * <p>The time when the job was created. The example uses the YYYY-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-02-04 13:54:10</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the job ended. The example uses the YYYY-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-02-04 13:54:10</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The time when the job started. The example uses the YYYY-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-02-04 13:54:10</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
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
             * <p>The description of the status reason.</p>
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
             * <p>The cloud disk size.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The cloud disk type. Valid values:</p>
             * <ul>
             * <li>System: System cloud disk.</li>
             * <li>Data: Data cloud disk.</li>
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
             * <p>The number of CPUs used to run the job.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cores(Float cores) {
                this.cores = cores;
                return this;
            }

            /**
             * <p>The cloud disk array.</p>
             */
            public Builder disks(java.util.List<Disks> disks) {
                this.disks = disks;
                return this;
            }

            /**
             * <p>Specifies whether to enable hyper-threading for the runtime environment. Default value: true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableHT(Boolean enableHT) {
                this.enableHT = enableHT;
                return this;
            }

            /**
             * <p>The hostname prefix of the runtime environment. The limits are as follows:</p>
             * <ul>
             * <li>A period (.) and a hyphen (-) cannot be used as the first or last character, and cannot be used consecutively.</li>
             * <li>Windows environment: The length cannot exceed 10 characters. Periods (.) are not supported, and the name cannot contain only digits. Uppercase and lowercase letters, digits, and hyphens (-) are allowed.</li>
             * <li>Linux environment: The length cannot exceed 32 characters. Multiple periods (.) are supported. The string between periods is considered a segment, and each segment can contain uppercase and lowercase letters, digits, and hyphens (-).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>compute</p>
             */
            public Builder hostNamePrefix(String hostNamePrefix) {
                this.hostNamePrefix = hostNamePrefix;
                return this;
            }

            /**
             * <p>The instance types of the runtime environment. A maximum of 5 instance types are supported.</p>
             */
            public Builder instanceTypes(java.util.List<String> instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * <p>The total amount of memory resources. Unit: GiB.</p>
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
             * <p>The next action for the task. Valid values:</p>
             * <ul>
             * <li><p>Retry: The job starts a new retry when a specific exit code is matched.</p>
             * </li>
             * <li><p>Exit: The job exits when a specific exit code is matched.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Exit</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The task exit code, which is used together with Action to form a job retry rule. Valid values: 0 to 255.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
             * <p>The retry rules. A maximum of 10 rules are supported.</p>
             */
            public Builder exitCodeActions(java.util.List<ExitCodeActions> exitCodeActions) {
                this.exitCodeActions = exitCodeActions;
                return this;
            }

            /**
             * <p>The number of retries. Valid values: 1 to 10. Default value: 3.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
             * <p>The script used to run the job. Base64 encoding is required.</p>
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
             * <p>The ECS instance used.</p>
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

            private Builder() {
            } 

            private Builder(VolumeMount model) {
                this.mountOptions = model.mountOptions;
                this.mountPath = model.mountPath;
                this.volumeDriver = model.volumeDriver;
            } 

            /**
             * <p>The list of mount parameters for the data volume. The parameters are key-value pairs in JSON format.</p>
             * <ul>
             * <li><p>Format for mounting a NAS file system: {&quot;server&quot;:&quot;xxxxx-xxxxx.cn-heyuan.nas.aliyuncs.com&quot;,&quot;vers&quot;:&quot;3&quot;,&quot;path&quot;:&quot;/data&quot;,&quot;options&quot;:&quot;nolock,tcp,noresvport&quot;}</p>
             * <blockquote>
             * <p>server specifies the mount target address of the NAS file system. path specifies the subdirectory under the NAS path, which must start with / and must already exist. vers specifies the NFS protocol version used to mount the NAS file system. Use v3. options specifies the custom parameters used when mounting the NAS file system, in the format of &quot;xxx,xxx,xxx&quot;.</p>
             * </blockquote>
             * </li>
             * <li><p>Format for mounting an OSS bucket: {&quot;bucket&quot;:&quot;xxxxx&quot;, &quot;url&quot;:&quot;oss-cn-heyuan-internal.aliyuncs.com&quot;,&quot;path&quot;:&quot;/data&quot;,&quot;akId&quot;:&quot;xxxxx&quot;,&quot;akSecret&quot;:&quot;xxxxx&quot;}</p>
             * <blockquote>
             * <p>bucket specifies the name of the OSS bucket. url specifies the endpoint of the OSS bucket. You can log on to the OSS console and obtain the endpoint on the Overview page of the bucket. path specifies the directory structure relative to the root directory of the bucket when mounting. The default value is /, and the directory must already exist. akId specifies the AccessKey ID used for direct authorization with an AccessKey pair. akSecret specifies the AccessKey secret used for direct authorization with an AccessKey pair.</p>
             * </blockquote>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;bucket&quot;:&quot;demo-bucket&quot;,&quot;otherOpts&quot;:&quot;-o allow_other&quot;,&quot;url&quot;:&quot;oss-cn-hangzhou.aliyuncs.com&quot;}</p>
             */
            public Builder mountOptions(String mountOptions) {
                this.mountOptions = mountOptions;
                return this;
            }

            /**
             * <p>The directory where the data volume is mounted to the task.</p>
             * <blockquote>
             * <p>The content in the mount directory will be directly overwritten by the content of the volume. Use this parameter with caution.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>/cromwell_inputs/1234abcd</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>The supported data volume types. Valid values:</p>
             * <ul>
             * <li>alicloud/nas: Mount a NAS file system.</li>
             * <li>alicloud/oss: Mount an OSS bucket.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>alicloud/nas</p>
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

        @com.aliyun.core.annotation.NameInMap("VolumeMount")
        private java.util.List<VolumeMount> volumeMount;

        private TaskSpec(Builder builder) {
            this.resource = builder.resource;
            this.retryPolicy = builder.retryPolicy;
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

        /**
         * @return volumeMount
         */
        public java.util.List<VolumeMount> getVolumeMount() {
            return this.volumeMount;
        }

        public static final class Builder {
            private Resource resource; 
            private RetryPolicy retryPolicy; 
            private java.util.List<TaskExecutor> taskExecutor; 
            private java.util.List<VolumeMount> volumeMount; 

            private Builder() {
            } 

            private Builder(TaskSpec model) {
                this.resource = model.resource;
                this.retryPolicy = model.retryPolicy;
                this.taskExecutor = model.taskExecutor;
                this.volumeMount = model.volumeMount;
            } 

            /**
             * <p>The resource information.</p>
             */
            public Builder resource(Resource resource) {
                this.resource = resource;
                return this;
            }

            /**
             * <p>The task retry policy.</p>
             */
            public Builder retryPolicy(RetryPolicy retryPolicy) {
                this.retryPolicy = retryPolicy;
                return this;
            }

            /**
             * <p>The task execution configuration.</p>
             */
            public Builder taskExecutor(java.util.List<TaskExecutor> taskExecutor) {
                this.taskExecutor = taskExecutor;
                return this;
            }

            /**
             * <p>The list of data volumes mounted to the task. A maximum of 10 data volumes are supported.</p>
             */
            public Builder volumeMount(java.util.List<VolumeMount> volumeMount) {
                this.volumeMount = volumeMount;
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
             * <p>The task execution status.</p>
             */
            public Builder executorStatus(java.util.List<ExecutorStatus> executorStatus) {
                this.executorStatus = executorStatus;
                return this;
            }

            /**
             * <p>The task name.</p>
             * 
             * <strong>example:</strong>
             * <p>task0</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The task specification details.</p>
             */
            public Builder taskSpec(TaskSpec taskSpec) {
                this.taskSpec = taskSpec;
                return this;
            }

            /**
             * <p>Specifies whether the job is a long-running job.</p>
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

        @com.aliyun.core.annotation.NameInMap("SecurityPolicy")
        private SecurityPolicy securityPolicy;

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
            this.securityPolicy = builder.securityPolicy;
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
         * @return securityPolicy
         */
        public SecurityPolicy getSecurityPolicy() {
            return this.securityPolicy;
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
            private SecurityPolicy securityPolicy; 
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
                this.securityPolicy = model.securityPolicy;
                this.startTime = model.startTime;
                this.status = model.status;
                this.tasks = model.tasks;
            } 

            /**
             * <p>The additional application information.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;xxx\&quot;: \&quot;xxxxx\&quot;}</p>
             */
            public Builder appExtraInfo(String appExtraInfo) {
                this.appExtraInfo = appExtraInfo;
                return this;
            }

            /**
             * <p>The time when the job was submitted. The example uses the YYYY-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-05 20:00:46</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The dependency policy.</p>
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
             * <p>The time when the job ended. The example uses the YYYY-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-05 20:01:48</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The job description.</p>
             * 
             * <strong>example:</strong>
             * <p>Demo</p>
             */
            public Builder jobDescription(String jobDescription) {
                this.jobDescription = jobDescription;
                return this;
            }

            /**
             * <p>The job ID.</p>
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
             * JobScheduler.
             */
            public Builder jobScheduler(String jobScheduler) {
                this.jobScheduler = jobScheduler;
                return this;
            }

            /**
             * <p>The security policy.</p>
             */
            public Builder securityPolicy(SecurityPolicy securityPolicy) {
                this.securityPolicy = securityPolicy;
                return this;
            }

            /**
             * <p>The time when the job started. The example uses the YYYY-MM-DD HH:mm:ss format.</p>
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
             * <li>Pending: The job is queued.</li>
             * <li>Initing: The job is being initialized.</li>
             * <li>Succeed: The job ran successfully.</li>
             * <li>Failed: The job failed to run.</li>
             * <li>Running: The job is running.</li>
             * <li>Exception: A scheduling exception occurred.</li>
             * <li>Retrying: The job is being retried.</li>
             * <li>Expired: The job timed out.</li>
             * <li>Deleted: The job is deleted.</li>
             * <li>Suspended: The job is hibernated.</li>
             * <li>Restarting: The job is being restarted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Succeeded</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The task list. Currently, only one task is supported.</p>
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
