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
 * {@link CreateJobRequest} extends {@link RequestModel}
 *
 * <p>CreateJobRequest</p>
 */
public class CreateJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DependencyPolicy")
    private DependencyPolicy dependencyPolicy;

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
    @com.aliyun.core.annotation.NameInMap("SecurityPolicy")
    private SecurityPolicy securityPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tasks")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Tasks> tasks;

    private CreateJobRequest(Builder builder) {
        super(builder);
        this.dependencyPolicy = builder.dependencyPolicy;
        this.deploymentPolicy = builder.deploymentPolicy;
        this.jobDescription = builder.jobDescription;
        this.jobName = builder.jobName;
        this.jobScheduler = builder.jobScheduler;
        this.securityPolicy = builder.securityPolicy;
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
     * @return securityPolicy
     */
    public SecurityPolicy getSecurityPolicy() {
        return this.securityPolicy;
    }

    /**
     * @return tasks
     */
    public java.util.List<Tasks> getTasks() {
        return this.tasks;
    }

    public static final class Builder extends Request.Builder<CreateJobRequest, Builder> {
        private DependencyPolicy dependencyPolicy; 
        private DeploymentPolicy deploymentPolicy; 
        private String jobDescription; 
        private String jobName; 
        private String jobScheduler; 
        private SecurityPolicy securityPolicy; 
        private java.util.List<Tasks> tasks; 

        private Builder() {
            super();
        } 

        private Builder(CreateJobRequest request) {
            super(request);
            this.dependencyPolicy = request.dependencyPolicy;
            this.deploymentPolicy = request.deploymentPolicy;
            this.jobDescription = request.jobDescription;
            this.jobName = request.jobName;
            this.jobScheduler = request.jobScheduler;
            this.securityPolicy = request.securityPolicy;
            this.tasks = request.tasks;
        } 

        /**
         * <p>Dependency policy.</p>
         */
        public Builder dependencyPolicy(DependencyPolicy dependencyPolicy) {
            String dependencyPolicyShrink = shrink(dependencyPolicy, "DependencyPolicy", "json");
            this.putQueryParameter("DependencyPolicy", dependencyPolicyShrink);
            this.dependencyPolicy = dependencyPolicy;
            return this;
        }

        /**
         * <p>The resource deployment policy.</p>
         */
        public Builder deploymentPolicy(DeploymentPolicy deploymentPolicy) {
            String deploymentPolicyShrink = shrink(deploymentPolicy, "DeploymentPolicy", "json");
            this.putQueryParameter("DeploymentPolicy", deploymentPolicyShrink);
            this.deploymentPolicy = deploymentPolicy;
            return this;
        }

        /**
         * <p>The description of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>Demo</p>
         */
        public Builder jobDescription(String jobDescription) {
            this.putQueryParameter("JobDescription", jobDescription);
            this.jobDescription = jobDescription;
            return this;
        }

        /**
         * <p>The job name. The name must be 2 to 64 characters in length and can contain letters, digits, and Chinese characters. It can contain hyphens (-) and underscores (_).</p>
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
         * <p>The type of the job scheduler.</p>
         * <ul>
         * <li>HPC</li>
         * <li>K8S</li>
         * </ul>
         * <p>Default value: HPC</p>
         * 
         * <strong>example:</strong>
         * <p>HPC</p>
         */
        public Builder jobScheduler(String jobScheduler) {
            this.putQueryParameter("JobScheduler", jobScheduler);
            this.jobScheduler = jobScheduler;
            return this;
        }

        /**
         * <p>The security policy.</p>
         */
        public Builder securityPolicy(SecurityPolicy securityPolicy) {
            String securityPolicyShrink = shrink(securityPolicy, "SecurityPolicy", "json");
            this.putQueryParameter("SecurityPolicy", securityPolicyShrink);
            this.securityPolicy = securityPolicy;
            return this;
        }

        /**
         * <p>The list of tasks. Only one task is supported.</p>
         * <p>This parameter is required.</p>
         */
        public Builder tasks(java.util.List<Tasks> tasks) {
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

    /**
     * 
     * {@link CreateJobRequest} extends {@link TeaModel}
     *
     * <p>CreateJobRequest</p>
     */
    public static class JobDependency extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobId")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The ID of the job.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>job-bjxxxxxxxxxxxx</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The type of the dependency. Valid values:</p>
             * <ul>
             * <li>AfterSucceeded: <strong>All subtasks</strong> of the dependent job or array job succeed. The exit code is 0.</li>
             * <li>AfterFailed: <strong>All subtasks</strong> of the dependent job or array job fail. The exit code is not 0.</li>
             * <li>AfterAny: The dependent job completes (succeeds or fails).</li>
             * <li>AfterCorresponding: The subtask corresponding to the dependent array job succeeds. The exit code is 0.</li>
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
     * {@link CreateJobRequest} extends {@link TeaModel}
     *
     * <p>CreateJobRequest</p>
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
             * <p>The job dependency. A maximum of 10 groups.</p>
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
     * {@link CreateJobRequest} extends {@link TeaModel}
     *
     * <p>CreateJobRequest</p>
     */
    public static class Network extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableExternalIpAddress")
        private Boolean enableExternalIpAddress;

        @com.aliyun.core.annotation.NameInMap("Vswitch")
        private java.util.List<String> vswitch;

        private Network(Builder builder) {
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
            private Boolean enableExternalIpAddress; 
            private java.util.List<String> vswitch; 

            private Builder() {
            } 

            private Builder(Network model) {
                this.enableExternalIpAddress = model.enableExternalIpAddress;
                this.vswitch = model.vswitch;
            } 

            /**
             * <p>Whether the job creates a public IP address.</p>
             * <ul>
             * <li>true: creates a public IP address.</li>
             * <li>false: does not create a public IP address.</li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
     * {@link CreateJobRequest} extends {@link TeaModel}
     *
     * <p>CreateJobRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the job tag. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot contain http:// or https://. The tag key cannot start with acs: or aliyun.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the job tag. You can specify empty strings as tag values. The tag value can be up to 128 characters in length and cannot contain http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateJobRequest} extends {@link TeaModel}
     *
     * <p>CreateJobRequest</p>
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

        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

        private DeploymentPolicy(Builder builder) {
            this.allocationSpec = builder.allocationSpec;
            this.level = builder.level;
            this.network = builder.network;
            this.pool = builder.pool;
            this.priority = builder.priority;
            this.tag = builder.tag;
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
         * @return tag
         */
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private String allocationSpec; 
            private String level; 
            private Network network; 
            private String pool; 
            private Integer priority; 
            private java.util.List<Tag> tag; 

            private Builder() {
            } 

            private Builder(DeploymentPolicy model) {
                this.allocationSpec = model.allocationSpec;
                this.level = model.level;
                this.network = model.network;
                this.pool = model.pool;
                this.priority = model.priority;
                this.tag = model.tag;
            } 

            /**
             * <p>The resource type,</p>
             * <ul>
             * <li>Standard</li>
             * <li>Dedicated: You must enable a whitelist for use.</li>
             * <li>Economic: You must enable a whitelist for use.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Dedicated</p>
             */
            public Builder allocationSpec(String allocationSpec) {
                this.allocationSpec = allocationSpec;
                return this;
            }

            /**
             * <p>The computing power level. This value is valid only when the resource type is Economic. The following disk categories are supported:</p>
             * <ul>
             * <li>General</li>
             * <li>Performance</li>
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
             * <p>The resource pool of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>compute</p>
             */
            public Builder pool(String pool) {
                this.pool = pool;
                return this;
            }

            /**
             * <p>The priorities of the jobs. A larger value indicates a higher job scheduling priority. Valid values: 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The tag information of the job. A maximum of 20 groups.</p>
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public DeploymentPolicy build() {
                return new DeploymentPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateJobRequest} extends {@link TeaModel}
     *
     * <p>CreateJobRequest</p>
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
             * <p>The array of security group IDs.</p>
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
     * {@link CreateJobRequest} extends {@link TeaModel}
     *
     * <p>CreateJobRequest</p>
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
             * <p>The security group ID.</p>
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
     * {@link CreateJobRequest} extends {@link TeaModel}
     *
     * <p>CreateJobRequest</p>
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
             * <p>If the array job property is IndexStart=1,IndexEnd=5, and IndexStep=2, the array job contains three sub-jobs. The index values of the sub-jobs are 1,3, and 5. You can access the sub-jobs by using environment variables.</p>
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
     * {@link CreateJobRequest} extends {@link TeaModel}
     *
     * <p>CreateJobRequest</p>
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
             * <p>The details of the array job. The index value of the sub-job is passed to the running environment through environment variables to support user business program reference. Environment variables include:</p>
             * <ul>
             * <li>EHPC_JOB_NAME: the name of the job. This parameter corresponds to the JobName parameter.</li>
             * <li>EHPC_JOB_ID: The ID of the job.</li>
             * <li>EHPC_TASK_NAME: the name of the task. This parameter corresponds to the TaskName parameter.</li>
             * <li>EHPC_EXECUTOR_ID: The ID of the execution unit.</li>
             * <li>EHPC_ARRAY_TASK_ID: the sub-job index value.</li>
             * <li>EHPC_ARRAY_TASK_COUNT: the total number of sub-jobs.</li>
             * <li>EHPC_ARRAY_TASK_MAX: the maximum sub-job index, which corresponds to the IndexStart parameter.</li>
             * <li>EHPC_ARRAY_TASK_MIN: the minimum value of the sub-job index, which corresponds to the IndexEnd parameter.</li>
             * <li>EHPC_ARRAY_TASK_STEP: the index step size of the sub-job, which corresponds to the IndexStep parameter.</li>
             * </ul>
             */
            public Builder arraySpec(ArraySpec arraySpec) {
                this.arraySpec = arraySpec;
                return this;
            }

            /**
             * <p>The maximum number of nodes to run the job.</p>
             * <blockquote>
             * <p>Follow the calculation formula: <code>MaxCount = (IndexEnd - IndexStart) / IndexStep +1</code></p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
     * {@link CreateJobRequest} extends {@link TeaModel}
     *
     * <p>CreateJobRequest</p>
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
             * <p>The size of the disk. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The type of the disk. Currently, only System is supported, which indicates the system disk.</p>
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
     * {@link CreateJobRequest} extends {@link TeaModel}
     *
     * <p>CreateJobRequest</p>
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
        private Float memory;

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
        public Float getMemory() {
            return this.memory;
        }

        public static final class Builder {
            private Float cores; 
            private java.util.List<Disks> disks; 
            private Boolean enableHT; 
            private String hostNamePrefix; 
            private java.util.List<String> instanceTypes; 
            private Float memory; 

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
             * <p>The number of CPUs in the running environment.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
             * <p>The instance type of the running environment. A maximum of 5 groups.</p>
             */
            public Builder instanceTypes(java.util.List<String> instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * <p>The memory size of the running environment. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
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
    /**
     * 
     * {@link CreateJobRequest} extends {@link TeaModel}
     *
     * <p>CreateJobRequest</p>
     */
    public static class ExitCodeActions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        @com.aliyun.core.annotation.Validation(required = true)
        private String action;

        @com.aliyun.core.annotation.NameInMap("ExitCode")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The next step behavior of the task.</p>
             * <ul>
             * <li>Retry: The job starts a retry when a specific exit code is hit.</li>
             * <li>Exit: The job exits when a specific exit code is hit.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Retry</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The task exit code, which is used together with the action to form a job retry rule. Valid values: 0 to 255.</p>
             * <p>This parameter is required.</p>
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
     * {@link CreateJobRequest} extends {@link TeaModel}
     *
     * <p>CreateJobRequest</p>
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
             * <p>The retry rule. A maximum of 10 groups.</p>
             */
            public Builder exitCodeActions(java.util.List<ExitCodeActions> exitCodeActions) {
                this.exitCodeActions = exitCodeActions;
                return this;
            }

            /**
             * <p>The maximum number of retries. Valid values: 1 to 10. Default value: 3.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
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
     * {@link CreateJobRequest} extends {@link TeaModel}
     *
     * <p>CreateJobRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(EnvironmentVars model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The name of the environment variable for the container. It can be 1 to 128 characters in length. Format requirement: [0-9a-zA-Z], and underscores, cannot start with a number.</p>
             * 
             * <strong>example:</strong>
             * <p>PATH</p>
             */
            public Builder name(String name) {
                this.name = name;
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

            public EnvironmentVars build() {
                return new EnvironmentVars(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateJobRequest} extends {@link TeaModel}
     *
     * <p>CreateJobRequest</p>
     */
    public static class Container extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("Arg")
        private java.util.List<String> arg;

        @com.aliyun.core.annotation.NameInMap("Command")
        private java.util.List<String> command;

        @com.aliyun.core.annotation.NameInMap("EnvironmentVars")
        private java.util.List<EnvironmentVars> environmentVars;

        @com.aliyun.core.annotation.NameInMap("Image")
        @com.aliyun.core.annotation.Validation(required = true)
        private String image;

        @com.aliyun.core.annotation.NameInMap("WorkingDir")
        private String workingDir;

        private Container(Builder builder) {
            this.appId = builder.appId;
            this.arg = builder.arg;
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
         * @return environmentVars
         */
        public java.util.List<EnvironmentVars> getEnvironmentVars() {
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
            private java.util.List<String> arg; 
            private java.util.List<String> command; 
            private java.util.List<EnvironmentVars> environmentVars; 
            private String image; 
            private String workingDir; 

            private Builder() {
            } 

            private Builder(Container model) {
                this.appId = model.appId;
                this.arg = model.arg;
                this.command = model.command;
                this.environmentVars = model.environmentVars;
                this.image = model.image;
                this.workingDir = model.workingDir;
            } 

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ci-vm-32k6LXAi3cOG</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The startup argument of the init container. A maximum of 10 groups.</p>
             */
            public Builder arg(java.util.List<String> arg) {
                this.arg = arg;
                return this;
            }

            /**
             * <p>The container startup commands. You can specify up to 20 commands. Each command can be up to 256 characters in length.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>If the start command contains spaces (for example, <code>sleep 60s</code> ), the input JSON format parameter is <code>[&quot;sleep&quot;, &quot;60s&quot;]</code>.</p>
             * </li>
             * <li><p>If the startup command is complex, the parameter format may be a combination of <code>Command: [&quot;/bin/bash&quot;]</code> and <code>Arg:[&quot;-c&quot;, &quot;&lt;customized command&gt;&quot;]</code>. The <code>&lt;customized command&gt;</code> is a user-defined combination of commands and can contain characters such as spaces.</p>
             * </li>
             * </ul>
             */
            public Builder command(java.util.List<String> command) {
                this.command = command;
                return this;
            }

            /**
             * <p>The environment variables of the container. A maximum of 20 groups.</p>
             */
            public Builder environmentVars(java.util.List<EnvironmentVars> environmentVars) {
                this.environmentVars = environmentVars;
                return this;
            }

            /**
             * <p>The image of the container.</p>
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
     * {@link CreateJobRequest} extends {@link TeaModel}
     *
     * <p>CreateJobRequest</p>
     */
    public static class Vm extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("Image")
        @com.aliyun.core.annotation.Validation(required = true)
        private String image;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("PrologScript")
        private String prologScript;

        @com.aliyun.core.annotation.NameInMap("Script")
        private String script;

        private Vm(Builder builder) {
            this.appId = builder.appId;
            this.image = builder.image;
            this.password = builder.password;
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
         * @return password
         */
        public String getPassword() {
            return this.password;
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
            private String password; 
            private String prologScript; 
            private String script; 

            private Builder() {
            } 

            private Builder(Vm model) {
                this.appId = model.appId;
                this.image = model.image;
                this.password = model.password;
                this.prologScript = model.prologScript;
                this.script = model.script;
            } 

            /**
             * <p>The ID of the virtual machine application.</p>
             * 
             * <strong>example:</strong>
             * <p>ci-vm-9jc58Pm5Leky</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The ID of the image.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>m-xxxx</p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The logon password of the virtual machine environment. The password must be 8 to 30 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The following special characters are supported:</p>
             * <p>()`~!@#$%^&amp;*-_+=|{}[]:;&quot;&lt;&gt;,.?/ In Windows, the password cannot contain a forward slash (/) as the first character.</p>
             * <blockquote>
             * <p>We recommend that you use HTTPS to send requests if you specify Password to avoid password leakage.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>EHPC@1234</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The pre-processing script. Base64 encoding is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ZWNobyBoZWxsbyBlY3Mh</p>
             */
            public Builder prologScript(String prologScript) {
                this.prologScript = prologScript;
                return this;
            }

            /**
             * <p>The running-job script. Base64 encoding is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ZWNobyBoZWxsbyBlY3Mh</p>
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
     * {@link CreateJobRequest} extends {@link TeaModel}
     *
     * <p>CreateJobRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(TaskExecutor model) {
                this.container = model.container;
                this.vm = model.vm;
            } 

            /**
             * <p>Use the container environment.</p>
             */
            public Builder container(Container container) {
                this.container = container;
                return this;
            }

            /**
             * <p>Use a virtual machine environment.</p>
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
     * {@link CreateJobRequest} extends {@link TeaModel}
     *
     * <p>CreateJobRequest</p>
     */
    public static class VolumeMount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MountOptions")
        private String mountOptions;

        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("ReadOnly")
        private Boolean readOnly;

        @com.aliyun.core.annotation.NameInMap("VolumeDriver")
        private String volumeDriver;

        private VolumeMount(Builder builder) {
            this.mountOptions = builder.mountOptions;
            this.mountPath = builder.mountPath;
            this.readOnly = builder.readOnly;
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
         * @return readOnly
         */
        public Boolean getReadOnly() {
            return this.readOnly;
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
            private Boolean readOnly; 
            private String volumeDriver; 

            private Builder() {
            } 

            private Builder(VolumeMount model) {
                this.mountOptions = model.mountOptions;
                this.mountPath = model.mountPath;
                this.readOnly = model.readOnly;
                this.volumeDriver = model.volumeDriver;
            } 

            /**
             * <p>The list of data volume mount parameters. Each option is a key-value pair in a JSON string.</p>
             * <ul>
             * <li>Format for mounting a NAS file system:{&quot;server&quot;:&quot;xxxxx-xxxxx.cn-heyuan.nas.aliyuncs.com&quot;,&quot;vers&quot;:&quot;3&quot;,&quot;path&quot;:&quot;/data&quot;,&quot;options&quot;:&quot;nolock,tcp,noresvport&quot;}</li>
             * </ul>
             * <blockquote>
             * <p>server indicates the address of the mount point of the NAS file system. path indicates the subdirectory of the NAS file system. The subdirectory must start with a (/) and must already exist. vers indicates the version number of the NFS protocol used to mount the file system. We recommend that you use v3. options indicates the custom parameters in the format of &quot;xxx,xxx,xxx&quot;.</p>
             * </blockquote>
             * <ul>
             * <li>OSS mount format:{&quot;bucket&quot;:&quot;xxxxx&quot;, &quot;url&quot;:&quot;oss-cn-heyuan-internal.aliyuncs.com&quot;,&quot;path&quot;:&quot;/data&quot;,&quot;akId&quot;:&quot;xxxxx&quot;,&quot;akSecret&quot;:&quot;xxxxx&quot;}</li>
             * </ul>
             * <blockquote>
             * <p>bucket indicates the name of the OSS bucket. url indicates the endpoint of the OSS bucket. You can log on to the OSS console and obtain the endpoint on the Overview page of the destination bucket. path indicates the directory structure of the root file of the bucket. The default value is /, which requires that the directory already exists. akId indicates the AccessKey ID. akSecret indicates the AccessKey secret.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{&quot;server&quot;:&quot;xxxxx-xxxxx.cn-heyuan.nas.aliyuncs.com&quot;,&quot;vers&quot;:&quot;3&quot;,&quot;path&quot;:&quot;/data&quot;,&quot;options&quot;:&quot;nolock,tcp,noresvport&quot;}</p>
             */
            public Builder mountOptions(String mountOptions) {
                this.mountOptions = mountOptions;
                return this;
            }

            /**
             * <p>The directory where the task mounts the data volume.</p>
             * <blockquote>
             * <p>The content of the mounted directory is overwritten by the content of the volume. Exercise caution when you use the directory.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>/mnt</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>Specifies whether the volume is read-only. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder readOnly(Boolean readOnly) {
                this.readOnly = readOnly;
                return this;
            }

            /**
             * <p>Currently supported data volume types.</p>
             * <ul>
             * <li>alicloud/nas: mounts NAS.</li>
             * <li>alicloud/oss: mounts OSS.</li>
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
     * {@link CreateJobRequest} extends {@link TeaModel}
     *
     * <p>CreateJobRequest</p>
     */
    public static class TaskSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Resource")
        private Resource resource;

        @com.aliyun.core.annotation.NameInMap("RetryPolicy")
        private RetryPolicy retryPolicy;

        @com.aliyun.core.annotation.NameInMap("TaskExecutor")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The resource information of the running environment.</p>
             */
            public Builder resource(Resource resource) {
                this.resource = resource;
                return this;
            }

            /**
             * <p>Task retry policy.</p>
             */
            public Builder retryPolicy(RetryPolicy retryPolicy) {
                this.retryPolicy = retryPolicy;
                return this;
            }

            /**
             * <p>The task execution configurations.</p>
             * <p>This parameter is required.</p>
             */
            public Builder taskExecutor(java.util.List<TaskExecutor> taskExecutor) {
                this.taskExecutor = taskExecutor;
                return this;
            }

            /**
             * <p>The list of data volumes mounted to the task. A maximum of 10 groups.</p>
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
     * {@link CreateJobRequest} extends {@link TeaModel}
     *
     * <p>CreateJobRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.executorPolicy = model.executorPolicy;
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
             * <p>The job name. It must be 2 to 32 characters in length and can contain letters, digits, and Chinese characters. It can contain hyphens (-) and underscores (_).</p>
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
             * <ul>
             * <li>true: background service the job.</li>
             * <li>false: batch jobs.</li>
             * </ul>
             * <p>Default value: false.</p>
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
}
