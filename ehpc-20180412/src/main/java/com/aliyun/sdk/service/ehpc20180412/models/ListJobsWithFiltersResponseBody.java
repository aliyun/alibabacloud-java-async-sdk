// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJobsWithFiltersResponseBody} extends {@link TeaModel}
 *
 * <p>ListJobsWithFiltersResponseBody</p>
 */
public class ListJobsWithFiltersResponseBody extends TeaModel {
    @NameInMap("Jobs")
    private java.util.List < Jobs> jobs;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListJobsWithFiltersResponseBody(Builder builder) {
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

    public static ListJobsWithFiltersResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobs
     */
    public java.util.List < Jobs> getJobs() {
        return this.jobs;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
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
        private java.util.List < Jobs> jobs; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * Jobs
         */
        public Builder jobs(java.util.List < Jobs> jobs) {
            this.jobs = jobs;
            return this;
        }

        /**
         * PageNumber
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount本次请求条件下的数据总量，此参数为可选参数，默认可不返回
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListJobsWithFiltersResponseBody build() {
            return new ListJobsWithFiltersResponseBody(this);
        } 

    } 

    public static class Resources extends TeaModel {
        @NameInMap("Cores")
        private Long cores;

        @NameInMap("Nodes")
        private Long nodes;

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
        public Long getCores() {
            return this.cores;
        }

        /**
         * @return nodes
         */
        public Long getNodes() {
            return this.nodes;
        }

        public static final class Builder {
            private Long cores; 
            private Long nodes; 

            /**
             * Cores.
             */
            public Builder cores(Long cores) {
                this.cores = cores;
                return this;
            }

            /**
             * Nodes.
             */
            public Builder nodes(Long nodes) {
                this.nodes = nodes;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
    public static class Jobs extends TeaModel {
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

        @NameInMap("Queue")
        private String queue;

        @NameInMap("Rerunable")
        private Boolean rerunable;

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

        @NameInMap("VariableList")
        private String variableList;

        private Jobs(Builder builder) {
            this.arrayRequest = builder.arrayRequest;
            this.comment = builder.comment;
            this.id = builder.id;
            this.lastModifyTime = builder.lastModifyTime;
            this.name = builder.name;
            this.nodeList = builder.nodeList;
            this.owner = builder.owner;
            this.priority = builder.priority;
            this.queue = builder.queue;
            this.rerunable = builder.rerunable;
            this.resources = builder.resources;
            this.shellPath = builder.shellPath;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.stderr = builder.stderr;
            this.stdout = builder.stdout;
            this.submitTime = builder.submitTime;
            this.variableList = builder.variableList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Jobs create() {
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
         * @return queue
         */
        public String getQueue() {
            return this.queue;
        }

        /**
         * @return rerunable
         */
        public Boolean getRerunable() {
            return this.rerunable;
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

        /**
         * @return variableList
         */
        public String getVariableList() {
            return this.variableList;
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
            private String queue; 
            private Boolean rerunable; 
            private Resources resources; 
            private String shellPath; 
            private String startTime; 
            private String state; 
            private String stderr; 
            private String stdout; 
            private String submitTime; 
            private String variableList; 

            /**
             * ArrayRequest.
             */
            public Builder arrayRequest(String arrayRequest) {
                this.arrayRequest = arrayRequest;
                return this;
            }

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
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
             * Queue.
             */
            public Builder queue(String queue) {
                this.queue = queue;
                return this;
            }

            /**
             * Rerunable.
             */
            public Builder rerunable(Boolean rerunable) {
                this.rerunable = rerunable;
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
             * ShellPath.
             */
            public Builder shellPath(String shellPath) {
                this.shellPath = shellPath;
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
             * Stderr.
             */
            public Builder stderr(String stderr) {
                this.stderr = stderr;
                return this;
            }

            /**
             * Stdout.
             */
            public Builder stdout(String stdout) {
                this.stdout = stdout;
                return this;
            }

            /**
             * SubmitTime.
             */
            public Builder submitTime(String submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            /**
             * VariableList.
             */
            public Builder variableList(String variableList) {
                this.variableList = variableList;
                return this;
            }

            public Jobs build() {
                return new Jobs(this);
            } 

        } 

    }
}
