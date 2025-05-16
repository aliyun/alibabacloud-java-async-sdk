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
 * {@link ListJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListJobsResponseBody</p>
 */
public class ListJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Jobs")
    private java.util.List<Jobs> jobs;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListJobsResponseBody(Builder builder) {
        this.jobs = builder.jobs;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobs
     */
    public java.util.List<Jobs> getJobs() {
        return this.jobs;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Jobs> jobs; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListJobsResponseBody model) {
            this.jobs = model.jobs;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The jobs.</p>
         */
        public Builder jobs(java.util.List<Jobs> jobs) {
            this.jobs = jobs;
            return this;
        }

        /**
         * <p>The page number. Default value: 1</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EABFBD93-58BE-53F3-BBFE-8654BB2E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListJobsResponseBody build() {
            return new ListJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobsResponseBody</p>
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
             * <p>The number of vCPUs that were used to run the job.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder cores(String cores) {
                this.cores = cores;
                return this;
            }

            /**
             * <p>The number of GPUs that were used to run the job.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder gpus(String gpus) {
                this.gpus = gpus;
                return this;
            }

            /**
             * <p>The size of memory that was used to run the job.</p>
             * 
             * <strong>example:</strong>
             * <p>1536MB</p>
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The number of compute nodes that were used to run the job.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
     * {@link ListJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobsResponseBody</p>
     */
    public static class ResourcesActualOccupied extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cores")
        private String cores;

        @com.aliyun.core.annotation.NameInMap("Gpus")
        private String gpus;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private String memory;

        @com.aliyun.core.annotation.NameInMap("Nodes")
        private String nodes;

        private ResourcesActualOccupied(Builder builder) {
            this.cores = builder.cores;
            this.gpus = builder.gpus;
            this.memory = builder.memory;
            this.nodes = builder.nodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourcesActualOccupied create() {
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

            private Builder(ResourcesActualOccupied model) {
                this.cores = model.cores;
                this.gpus = model.gpus;
                this.memory = model.memory;
                this.nodes = model.nodes;
            } 

            /**
             * <p>Number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder cores(String cores) {
                this.cores = cores;
                return this;
            }

            /**
             * <p>Number of CPUs</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder gpus(String gpus) {
                this.gpus = gpus;
                return this;
            }

            /**
             * <p>Number of memory.</p>
             * 
             * <strong>example:</strong>
             * <p>982MB</p>
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>Number of compute nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder nodes(String nodes) {
                this.nodes = nodes;
                return this;
            }

            public ResourcesActualOccupied build() {
                return new ResourcesActualOccupied(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobsResponseBody</p>
     */
    public static class JobSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArrayJobId")
        private String arrayJobId;

        @com.aliyun.core.annotation.NameInMap("ArrayJobSubId")
        private String arrayJobSubId;

        @com.aliyun.core.annotation.NameInMap("ArrayRequest")
        private String arrayRequest;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("JobQueue")
        private String jobQueue;

        @com.aliyun.core.annotation.NameInMap("LastModifyTime")
        private String lastModifyTime;

        @com.aliyun.core.annotation.NameInMap("NodeList")
        private String nodeList;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private String priority;

        @com.aliyun.core.annotation.NameInMap("Resources")
        private Resources resources;

        @com.aliyun.core.annotation.NameInMap("ResourcesActualOccupied")
        private ResourcesActualOccupied resourcesActualOccupied;

        @com.aliyun.core.annotation.NameInMap("RunasUser")
        private String runasUser;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("StderrPath")
        private String stderrPath;

        @com.aliyun.core.annotation.NameInMap("StdoutPath")
        private String stdoutPath;

        @com.aliyun.core.annotation.NameInMap("SubmitTime")
        private String submitTime;

        @com.aliyun.core.annotation.NameInMap("Variables")
        private String variables;

        private JobSpec(Builder builder) {
            this.arrayJobId = builder.arrayJobId;
            this.arrayJobSubId = builder.arrayJobSubId;
            this.arrayRequest = builder.arrayRequest;
            this.comment = builder.comment;
            this.id = builder.id;
            this.jobQueue = builder.jobQueue;
            this.lastModifyTime = builder.lastModifyTime;
            this.nodeList = builder.nodeList;
            this.priority = builder.priority;
            this.resources = builder.resources;
            this.resourcesActualOccupied = builder.resourcesActualOccupied;
            this.runasUser = builder.runasUser;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.stderrPath = builder.stderrPath;
            this.stdoutPath = builder.stdoutPath;
            this.submitTime = builder.submitTime;
            this.variables = builder.variables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobSpec create() {
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
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
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
         * @return resourcesActualOccupied
         */
        public ResourcesActualOccupied getResourcesActualOccupied() {
            return this.resourcesActualOccupied;
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
         * @return stderrPath
         */
        public String getStderrPath() {
            return this.stderrPath;
        }

        /**
         * @return stdoutPath
         */
        public String getStdoutPath() {
            return this.stdoutPath;
        }

        /**
         * @return submitTime
         */
        public String getSubmitTime() {
            return this.submitTime;
        }

        /**
         * @return variables
         */
        public String getVariables() {
            return this.variables;
        }

        public static final class Builder {
            private String arrayJobId; 
            private String arrayJobSubId; 
            private String arrayRequest; 
            private String comment; 
            private String id; 
            private String jobQueue; 
            private String lastModifyTime; 
            private String nodeList; 
            private String priority; 
            private Resources resources; 
            private ResourcesActualOccupied resourcesActualOccupied; 
            private String runasUser; 
            private String startTime; 
            private String state; 
            private String stderrPath; 
            private String stdoutPath; 
            private String submitTime; 
            private String variables; 

            private Builder() {
            } 

            private Builder(JobSpec model) {
                this.arrayJobId = model.arrayJobId;
                this.arrayJobSubId = model.arrayJobSubId;
                this.arrayRequest = model.arrayRequest;
                this.comment = model.comment;
                this.id = model.id;
                this.jobQueue = model.jobQueue;
                this.lastModifyTime = model.lastModifyTime;
                this.nodeList = model.nodeList;
                this.priority = model.priority;
                this.resources = model.resources;
                this.resourcesActualOccupied = model.resourcesActualOccupied;
                this.runasUser = model.runasUser;
                this.startTime = model.startTime;
                this.state = model.state;
                this.stderrPath = model.stderrPath;
                this.stdoutPath = model.stdoutPath;
                this.submitTime = model.submitTime;
                this.variables = model.variables;
            } 

            /**
             * <p>The array job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder arrayJobId(String arrayJobId) {
                this.arrayJobId = arrayJobId;
                return this;
            }

            /**
             * <p>The ID of the job in the array.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder arrayJobSubId(String arrayJobSubId) {
                this.arrayJobSubId = arrayJobSubId;
                return this;
            }

            /**
             * <p>The queue format of the job.</p>
             * <ul>
             * <li>If the job is not in a queue, the output is empty.</li>
             * <li>The format is X-Y:Z. X indicates the first index, Y indicates the final index, and Z indicates the step size. For example, 2-7:2 indicates three sub-jobs numbered 2, 4, and 6.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1-5:2</p>
             */
            public Builder arrayRequest(String arrayRequest) {
                this.arrayRequest = arrayRequest;
                return this;
            }

            /**
             * <p>The job description.</p>
             * 
             * <strong>example:</strong>
             * <p>jobDescription</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The queue name.</p>
             * 
             * <strong>example:</strong>
             * <p>comp</p>
             */
            public Builder jobQueue(String jobQueue) {
                this.jobQueue = jobQueue;
                return this;
            }

            /**
             * <p>The time when the job was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1724123085</p>
             */
            public Builder lastModifyTime(String lastModifyTime) {
                this.lastModifyTime = lastModifyTime;
                return this;
            }

            /**
             * <p>The compute nodes that were used to run the job.</p>
             * 
             * <strong>example:</strong>
             * <p>compute[002,005,003]</p>
             */
            public Builder nodeList(String nodeList) {
                this.nodeList = nodeList;
                return this;
            }

            /**
             * <p>The job priority. Valid values: 0 to 9. A larger value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The information about the resources required to run the job.</p>
             */
            public Builder resources(Resources resources) {
                this.resources = resources;
                return this;
            }

            /**
             * <p>Actual resource usage of the job program</p>
             */
            public Builder resourcesActualOccupied(ResourcesActualOccupied resourcesActualOccupied) {
                this.resourcesActualOccupied = resourcesActualOccupied;
                return this;
            }

            /**
             * <p>The user that ran the job.</p>
             * 
             * <strong>example:</strong>
             * <p>testuser1</p>
             */
            public Builder runasUser(String runasUser) {
                this.runasUser = runasUser;
                return this;
            }

            /**
             * <p>Job start time.</p>
             * 
             * <strong>example:</strong>
             * <p>1724122486</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The job state. Valid values: (PBS cluster and Slurm cluster)</p>
             * <ul>
             * <li>FINISHED/Completed</li>
             * <li>RUNNING/Running</li>
             * <li>QUEUED/Pending</li>
             * <li>FAILED/Failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The error output path.</p>
             * 
             * <strong>example:</strong>
             * <p>./Temp</p>
             */
            public Builder stderrPath(String stderrPath) {
                this.stderrPath = stderrPath;
                return this;
            }

            /**
             * <p>The standard output path.</p>
             * 
             * <strong>example:</strong>
             * <p>./Temp</p>
             */
            public Builder stdoutPath(String stdoutPath) {
                this.stdoutPath = stdoutPath;
                return this;
            }

            /**
             * <p>The time when the job was submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>1724122486</p>
             */
            public Builder submitTime(String submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            /**
             * <p>The variables of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;PBS_O_SHELL&quot;:&quot;/bin/bash&quot;, 	&quot;PBS_O_HOST&quot;:&quot;manager&quot;, 	&quot;PBS_O_SYSTEM&quot;:&quot;Linux&quot;, 	&quot;PBS_O_LANG&quot;:&quot;en_US.UTF-8&quot;, 	&quot;PBS_O_QUEUE&quot;:&quot;workq&quot;}</p>
             */
            public Builder variables(String variables) {
                this.variables = variables;
                return this;
            }

            public JobSpec build() {
                return new JobSpec(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobsResponseBody</p>
     */
    public static class Jobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("JobSpec")
        private JobSpec jobSpec;

        private Jobs(Builder builder) {
            this.jobName = builder.jobName;
            this.jobSpec = builder.jobSpec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Jobs create() {
            return builder().build();
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return jobSpec
         */
        public JobSpec getJobSpec() {
            return this.jobSpec;
        }

        public static final class Builder {
            private String jobName; 
            private JobSpec jobSpec; 

            private Builder() {
            } 

            private Builder(Jobs model) {
                this.jobName = model.jobName;
                this.jobSpec = model.jobSpec;
            } 

            /**
             * <p>The job name.</p>
             * 
             * <strong>example:</strong>
             * <p>testjob</p>
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * <p>The job configurations.</p>
             */
            public Builder jobSpec(JobSpec jobSpec) {
                this.jobSpec = jobSpec;
                return this;
            }

            public Jobs build() {
                return new Jobs(this);
            } 

        } 

    }
}
