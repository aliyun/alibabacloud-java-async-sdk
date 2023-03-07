// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListJobsResponseBody</p>
 */
public class ListJobsResponseBody extends TeaModel {
    @NameInMap("Jobs")
    private Jobs jobs;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListJobsResponseBody(Builder builder) {
        this.jobs = builder.jobs;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobs
     */
    public Jobs getJobs() {
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Jobs jobs; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The list of jobs.
         */
        public Builder jobs(Jobs jobs) {
            this.jobs = jobs;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListJobsResponseBody build() {
            return new ListJobsResponseBody(this);
        } 

    } 

    public static class Resources extends TeaModel {
        @NameInMap("Cores")
        private Integer cores;

        @NameInMap("Nodes")
        private Integer nodes;

        private Resources(Builder builder) {
            this.cores = builder.cores;
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
        public Integer getCores() {
            return this.cores;
        }

        /**
         * @return nodes
         */
        public Integer getNodes() {
            return this.nodes;
        }

        public static final class Builder {
            private Integer cores; 
            private Integer nodes; 

            /**
             * The number of CPUs that were used to run the job.
             */
            public Builder cores(Integer cores) {
                this.cores = cores;
                return this;
            }

            /**
             * The number of nodes that were used to run the job.
             */
            public Builder nodes(Integer nodes) {
                this.nodes = nodes;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
    public static class JobInfo extends TeaModel {
        @NameInMap("ArrayRequest")
        private String arrayRequest;

        @NameInMap("Comment")
        private String comment;

        @NameInMap("Id")
        private String id;

        @NameInMap("LastModifyTime")
        private String lastModifyTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("NodeList")
        private String nodeList;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("Priority")
        private String priority;

        @NameInMap("Resources")
        private Resources resources;

        @NameInMap("ShellPath")
        private String shellPath;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("State")
        private String state;

        @NameInMap("Stderr")
        private String stderr;

        @NameInMap("Stdout")
        private String stdout;

        @NameInMap("SubmitTime")
        private String submitTime;

        private JobInfo(Builder builder) {
            this.arrayRequest = builder.arrayRequest;
            this.comment = builder.comment;
            this.id = builder.id;
            this.lastModifyTime = builder.lastModifyTime;
            this.name = builder.name;
            this.nodeList = builder.nodeList;
            this.owner = builder.owner;
            this.priority = builder.priority;
            this.resources = builder.resources;
            this.shellPath = builder.shellPath;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.stderr = builder.stderr;
            this.stdout = builder.stdout;
            this.submitTime = builder.submitTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobInfo create() {
            return builder().build();
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
         * @return lastModifyTime
         */
        public String getLastModifyTime() {
            return this.lastModifyTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nodeList
         */
        public String getNodeList() {
            return this.nodeList;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
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
         * @return shellPath
         */
        public String getShellPath() {
            return this.shellPath;
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
         * @return stderr
         */
        public String getStderr() {
            return this.stderr;
        }

        /**
         * @return stdout
         */
        public String getStdout() {
            return this.stdout;
        }

        /**
         * @return submitTime
         */
        public String getSubmitTime() {
            return this.submitTime;
        }

        public static final class Builder {
            private String arrayRequest; 
            private String comment; 
            private String id; 
            private String lastModifyTime; 
            private String name; 
            private String nodeList; 
            private String owner; 
            private String priority; 
            private Resources resources; 
            private String shellPath; 
            private String startTime; 
            private String state; 
            private String stderr; 
            private String stdout; 
            private String submitTime; 

            /**
             * The job array. If the job is not in a queue, the output is empty.
             * <p>
             * 
             * Format: X-Y:Z. X is the minimum index value. Y is the maximum index value. Z is the step size. For example, 2-7:2 indicates that three jobs need to be run and their index values are 2, 4, and 6.
             */
            public Builder arrayRequest(String arrayRequest) {
                this.arrayRequest = arrayRequest;
                return this;
            }

            /**
             * The description of the job.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The ID of the job.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The time when the job was last modified.
             */
            public Builder lastModifyTime(String lastModifyTime) {
                this.lastModifyTime = lastModifyTime;
                return this;
            }

            /**
             * The name of the job.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The list of compute nodes that were used to run the job.
             */
            public Builder nodeList(String nodeList) {
                this.nodeList = nodeList;
                return this;
            }

            /**
             * The name of the user that runs the job.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The priority of the job. Valid values: 0 to 9. A large value indicates a high priority.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The resources that were used to run the job.
             */
            public Builder resources(Resources resources) {
                this.resources = resources;
                return this;
            }

            /**
             * The path that was used to run the job.
             */
            public Builder shellPath(String shellPath) {
                this.shellPath = shellPath;
                return this;
            }

            /**
             * The time when the job started to run.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The status of the job. Valid values: Valid values:
             * <p>
             * 
             * *   FINISHED: The job is completed
             * *   RUNNING: The job is running.
             * *   QUEUED: The job is pending in a queue.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The output file path of stderr.
             */
            public Builder stderr(String stderr) {
                this.stderr = stderr;
                return this;
            }

            /**
             * The output file path of stdout.
             */
            public Builder stdout(String stdout) {
                this.stdout = stdout;
                return this;
            }

            /**
             * The time when the job was submitted.
             */
            public Builder submitTime(String submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            public JobInfo build() {
                return new JobInfo(this);
            } 

        } 

    }
    public static class Jobs extends TeaModel {
        @NameInMap("JobInfo")
        private java.util.List < JobInfo> jobInfo;

        private Jobs(Builder builder) {
            this.jobInfo = builder.jobInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Jobs create() {
            return builder().build();
        }

        /**
         * @return jobInfo
         */
        public java.util.List < JobInfo> getJobInfo() {
            return this.jobInfo;
        }

        public static final class Builder {
            private java.util.List < JobInfo> jobInfo; 

            /**
             * JobInfo.
             */
            public Builder jobInfo(java.util.List < JobInfo> jobInfo) {
                this.jobInfo = jobInfo;
                return this;
            }

            public Jobs build() {
                return new Jobs(this);
            } 

        } 

    }
}
