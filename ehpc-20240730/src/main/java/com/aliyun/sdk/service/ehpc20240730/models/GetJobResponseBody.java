// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

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

        /**
         * JobInfo.
         */
        public Builder jobInfo(JobInfo jobInfo) {
            this.jobInfo = jobInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
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

            /**
             * Cores.
             */
            public Builder cores(String cores) {
                this.cores = cores;
                return this;
            }

            /**
             * Gpus.
             */
            public Builder gpus(String gpus) {
                this.gpus = gpus;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * Nodes.
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

            /**
             * Cores.
             */
            public Builder cores(String cores) {
                this.cores = cores;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * Nodes.
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
        private java.util.List < Variables> variables;

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
        public java.util.List < Variables> getVariables() {
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
            private java.util.List < Variables> variables; 

            /**
             * ArrayJobId.
             */
            public Builder arrayJobId(String arrayJobId) {
                this.arrayJobId = arrayJobId;
                return this;
            }

            /**
             * ArrayJobSubId.
             */
            public Builder arrayJobSubId(String arrayJobSubId) {
                this.arrayJobSubId = arrayJobSubId;
                return this;
            }

            /**
             * ArrayRequest.
             */
            public Builder arrayRequest(String arrayRequest) {
                this.arrayRequest = arrayRequest;
                return this;
            }

            /**
             * CommandLine.
             */
            public Builder commandLine(String commandLine) {
                this.commandLine = commandLine;
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
             * ErrorLog.
             */
            public Builder errorLog(String errorLog) {
                this.errorLog = errorLog;
                return this;
            }

            /**
             * ExtraInfo.
             */
            public Builder extraInfo(String extraInfo) {
                this.extraInfo = extraInfo;
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
             * JobQueue.
             */
            public Builder jobQueue(String jobQueue) {
                this.jobQueue = jobQueue;
                return this;
            }

            /**
             * LastModifyTime.
             */
            public Builder lastModifyTime(String lastModifyTime) {
                this.lastModifyTime = lastModifyTime;
                return this;
            }

            /**
             * NodeList.
             */
            public Builder nodeList(String nodeList) {
                this.nodeList = nodeList;
                return this;
            }

            /**
             * OutputLog.
             */
            public Builder outputLog(String outputLog) {
                this.outputLog = outputLog;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * Resources.
             */
            public Builder resources(Resources resources) {
                this.resources = resources;
                return this;
            }

            /**
             * ResourcesUsed.
             */
            public Builder resourcesUsed(ResourcesUsed resourcesUsed) {
                this.resourcesUsed = resourcesUsed;
                return this;
            }

            /**
             * RunasUser.
             */
            public Builder runasUser(String runasUser) {
                this.runasUser = runasUser;
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
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Variables.
             */
            public Builder variables(java.util.List < Variables> variables) {
                this.variables = variables;
                return this;
            }

            public JobInfo build() {
                return new JobInfo(this);
            } 

        } 

    }
}
