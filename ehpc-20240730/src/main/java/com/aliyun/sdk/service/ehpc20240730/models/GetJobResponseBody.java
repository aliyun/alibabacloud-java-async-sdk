// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

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

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private GetJobResponseBody(Builder builder) {
        this.jobInfo = builder.jobInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
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

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private JobInfo jobInfo; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(GetJobResponseBody model) {
            this.jobInfo = model.jobInfo;
            this.requestId = model.requestId;
            this.success = model.success;
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
         * <p>04F0****-1335-<strong><strong>-A1D7-6C044FE7</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The request result. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
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
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cores")
        private String cores;

        @com.aliyun.core.annotation.NameInMap("Gpus")
        private String gpus;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private String memory;

        @com.aliyun.core.annotation.NameInMap("Nodes")
        private String nodes;

        private Resources(Builder builder) {
            this.cores = builder.cores;
            this.gpus = builder.gpus;
            this.memory = builder.memory;
            this.nodes = builder.nodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return cores
         */
        public String getCores() {
            return this.cores;
        }

        /**
         * @return gpus
         */
        public String getGpus() {
            return this.gpus;
        }

        /**
         * @return memory
         */
        public String getMemory() {
            return this.memory;
        }

        /**
         * @return nodes
         */
        public String getNodes() {
            return this.nodes;
        }

        public static final class Builder {
            private String cores; 
            private String gpus; 
            private String memory; 
            private String nodes; 

            private Builder() {
            } 

            private Builder(Resources model) {
                this.cores = model.cores;
                this.gpus = model.gpus;
                this.memory = model.memory;
                this.nodes = model.nodes;
            } 

            /**
             * <p>The number of vCPUs used by the job on each node.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cores(String cores) {
                this.cores = cores;
                return this;
            }

            /**
             * <p>The number of GPUs used by the job on each node.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder gpus(String gpus) {
                this.gpus = gpus;
                return this;
            }

            /**
             * <p>The memory size used by the job on each node.</p>
             * 
             * <strong>example:</strong>
             * <p>1gb</p>
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The number of nodes that are used to run the job.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder nodes(String nodes) {
                this.nodes = nodes;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobResponseBody</p>
     */
    public static class ResourcesUsed extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cores")
        private String cores;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private String memory;

        @com.aliyun.core.annotation.NameInMap("Nodes")
        private String nodes;

        private ResourcesUsed(Builder builder) {
            this.cores = builder.cores;
            this.memory = builder.memory;
            this.nodes = builder.nodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourcesUsed create() {
            return builder().build();
        }

        /**
         * @return cores
         */
        public String getCores() {
            return this.cores;
        }

        /**
         * @return memory
         */
        public String getMemory() {
            return this.memory;
        }

        /**
         * @return nodes
         */
        public String getNodes() {
            return this.nodes;
        }

        public static final class Builder {
            private String cores; 
            private String memory; 
            private String nodes; 

            private Builder() {
            } 

            private Builder(ResourcesUsed model) {
                this.cores = model.cores;
                this.memory = model.memory;
                this.nodes = model.nodes;
            } 

            /**
             * <p>The number of vCPUs used by the job on each node.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cores(String cores) {
                this.cores = cores;
                return this;
            }

            /**
             * <p>The memory size used by the job on each node.</p>
             * 
             * <strong>example:</strong>
             * <p>512mb</p>
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The number of nodes that are used to run the job.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder nodes(String nodes) {
                this.nodes = nodes;
                return this;
            }

            public ResourcesUsed build() {
                return new ResourcesUsed(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobResponseBody</p>
     */
    public static class Variables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Variables(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Variables create() {
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

            private Builder(Variables model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The name of the environment variable.</p>
             * 
             * <strong>example:</strong>
             * <p>ProxyIP</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the environment variable.</p>
             * 
             * <strong>example:</strong>
             * <p>10.x.x.x</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Variables build() {
                return new Variables(this);
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
        @com.aliyun.core.annotation.NameInMap("ArrayJobId")
        private String arrayJobId;

        @com.aliyun.core.annotation.NameInMap("ArrayJobSubId")
        private String arrayJobSubId;

        @com.aliyun.core.annotation.NameInMap("ArrayRequest")
        private String arrayRequest;

        @com.aliyun.core.annotation.NameInMap("CommandLine")
        private String commandLine;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ErrorLog")
        private String errorLog;

        @com.aliyun.core.annotation.NameInMap("ExtraInfo")
        private String extraInfo;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("JobQueue")
        private String jobQueue;

        @com.aliyun.core.annotation.NameInMap("LastModifyTime")
        private String lastModifyTime;

        @com.aliyun.core.annotation.NameInMap("NodeList")
        private String nodeList;

        @com.aliyun.core.annotation.NameInMap("OutputLog")
        private String outputLog;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private String priority;

        @com.aliyun.core.annotation.NameInMap("Resources")
        private Resources resources;

        @com.aliyun.core.annotation.NameInMap("ResourcesUsed")
        private ResourcesUsed resourcesUsed;

        @com.aliyun.core.annotation.NameInMap("RunasUser")
        private String runasUser;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Variables")
        private java.util.List<Variables> variables;

        private JobInfo(Builder builder) {
            this.arrayJobId = builder.arrayJobId;
            this.arrayJobSubId = builder.arrayJobSubId;
            this.arrayRequest = builder.arrayRequest;
            this.commandLine = builder.commandLine;
            this.createTime = builder.createTime;
            this.errorLog = builder.errorLog;
            this.extraInfo = builder.extraInfo;
            this.jobId = builder.jobId;
            this.jobName = builder.jobName;
            this.jobQueue = builder.jobQueue;
            this.lastModifyTime = builder.lastModifyTime;
            this.nodeList = builder.nodeList;
            this.outputLog = builder.outputLog;
            this.priority = builder.priority;
            this.resources = builder.resources;
            this.resourcesUsed = builder.resourcesUsed;
            this.runasUser = builder.runasUser;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.variables = builder.variables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobInfo create() {
            return builder().build();
        }

        /**
         * @return arrayJobId
         */
        public String getArrayJobId() {
            return this.arrayJobId;
        }

        /**
         * @return arrayJobSubId
         */
        public String getArrayJobSubId() {
            return this.arrayJobSubId;
        }

        /**
         * @return arrayRequest
         */
        public String getArrayRequest() {
            return this.arrayRequest;
        }

        /**
         * @return commandLine
         */
        public String getCommandLine() {
            return this.commandLine;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return errorLog
         */
        public String getErrorLog() {
            return this.errorLog;
        }

        /**
         * @return extraInfo
         */
        public String getExtraInfo() {
            return this.extraInfo;
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
         * @return jobQueue
         */
        public String getJobQueue() {
            return this.jobQueue;
        }

        /**
         * @return lastModifyTime
         */
        public String getLastModifyTime() {
            return this.lastModifyTime;
        }

        /**
         * @return nodeList
         */
        public String getNodeList() {
            return this.nodeList;
        }

        /**
         * @return outputLog
         */
        public String getOutputLog() {
            return this.outputLog;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return resources
         */
        public Resources getResources() {
            return this.resources;
        }

        /**
         * @return resourcesUsed
         */
        public ResourcesUsed getResourcesUsed() {
            return this.resourcesUsed;
        }

        /**
         * @return runasUser
         */
        public String getRunasUser() {
            return this.runasUser;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return variables
         */
        public java.util.List<Variables> getVariables() {
            return this.variables;
        }

        public static final class Builder {
            private String arrayJobId; 
            private String arrayJobSubId; 
            private String arrayRequest; 
            private String commandLine; 
            private String createTime; 
            private String errorLog; 
            private String extraInfo; 
            private String jobId; 
            private String jobName; 
            private String jobQueue; 
            private String lastModifyTime; 
            private String nodeList; 
            private String outputLog; 
            private String priority; 
            private Resources resources; 
            private ResourcesUsed resourcesUsed; 
            private String runasUser; 
            private String startTime; 
            private String state; 
            private java.util.List<Variables> variables; 

            private Builder() {
            } 

            private Builder(JobInfo model) {
                this.arrayJobId = model.arrayJobId;
                this.arrayJobSubId = model.arrayJobSubId;
                this.arrayRequest = model.arrayRequest;
                this.commandLine = model.commandLine;
                this.createTime = model.createTime;
                this.errorLog = model.errorLog;
                this.extraInfo = model.extraInfo;
                this.jobId = model.jobId;
                this.jobName = model.jobName;
                this.jobQueue = model.jobQueue;
                this.lastModifyTime = model.lastModifyTime;
                this.nodeList = model.nodeList;
                this.outputLog = model.outputLog;
                this.priority = model.priority;
                this.resources = model.resources;
                this.resourcesUsed = model.resourcesUsed;
                this.runasUser = model.runasUser;
                this.startTime = model.startTime;
                this.state = model.state;
                this.variables = model.variables;
            } 

            /**
             * <p>The parent job ID. If the return value is a non-empty string, the job is an array job.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder arrayJobId(String arrayJobId) {
                this.arrayJobId = arrayJobId;
                return this;
            }

            /**
             * <p>The sub-job ID. This parameter is valid when the ArrayJobId parameter is a non-empty string.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder arrayJobSubId(String arrayJobSubId) {
                this.arrayJobSubId = arrayJobSubId;
                return this;
            }

            /**
             * <p>The job queue. If the job is not in a queue, the output is empty.</p>
             * <p>The format is X-Y:Z. X indicates the first index, Y indicates the final index, and Z indicates the step size. For example, 2-7:2 indicates three sub-jobs numbered 2, 4, and 6.</p>
             * 
             * <strong>example:</strong>
             * <p>1-5:2</p>
             */
            public Builder arrayRequest(String arrayRequest) {
                this.arrayRequest = arrayRequest;
                return this;
            }

            /**
             * <p>The command that is used to run the job.</p>
             * 
             * <strong>example:</strong>
             * <p>/home/huangsf/ehpc/job_meta.pbs</p>
             */
            public Builder commandLine(String commandLine) {
                this.commandLine = commandLine;
                return this;
            }

            /**
             * <p>The time when the job was submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-08-16T10:52:48</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The error log file of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>/home/xxx/STDIN.e1</p>
             */
            public Builder errorLog(String errorLog) {
                this.errorLog = errorLog;
                return this;
            }

            /**
             * <p>Additional information.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder extraInfo(String extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1.manager</p>
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
             * <p>The queue to which the job belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>workq</p>
             */
            public Builder jobQueue(String jobQueue) {
                this.jobQueue = jobQueue;
                return this;
            }

            /**
             * <p>The time when the job was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-08-16T10:52:48</p>
             */
            public Builder lastModifyTime(String lastModifyTime) {
                this.lastModifyTime = lastModifyTime;
                return this;
            }

            /**
             * <p>The compute nodes that are used to run the job.</p>
             * 
             * <strong>example:</strong>
             * <p>compute000</p>
             */
            public Builder nodeList(String nodeList) {
                this.nodeList = nodeList;
                return this;
            }

            /**
             * <p>The standard output log file of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>/home/xxx/STDIN.o1</p>
             */
            public Builder outputLog(String outputLog) {
                this.outputLog = outputLog;
                return this;
            }

            /**
             * <p>The priority of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The resources that were requested when the job was submitted.</p>
             */
            public Builder resources(Resources resources) {
                this.resources = resources;
                return this;
            }

            /**
             * <p>The resources that are actually used by the job.</p>
             */
            public Builder resourcesUsed(ResourcesUsed resourcesUsed) {
                this.resourcesUsed = resourcesUsed;
                return this;
            }

            /**
             * <p>The user to which the job belongs or that is used to submit the job. This user is a cluster-side user.</p>
             * 
             * <strong>example:</strong>
             * <p>testuser</p>
             */
            public Builder runasUser(String runasUser) {
                this.runasUser = runasUser;
                return this;
            }

            /**
             * <p>The time when the job was started.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-08-16T10:52:48</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The job state.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The variables of the job.</p>
             */
            public Builder variables(java.util.List<Variables> variables) {
                this.variables = variables;
                return this;
            }

            public JobInfo build() {
                return new JobInfo(this);
            } 

        } 

    }
}
