// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20210202.models;

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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListJobsResponseBody(Builder builder) {
        this.jobs = builder.jobs;
        this.requestId = builder.requestId;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Jobs> jobs; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListJobsResponseBody model) {
            this.jobs = model.jobs;
            this.requestId = model.requestId;
        } 

        /**
         * Jobs.
         */
        public Builder jobs(java.util.List<Jobs> jobs) {
            this.jobs = jobs;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
    public static class Jobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("ExecuteType")
        private String executeType;

        @com.aliyun.core.annotation.NameInMap("ExperimentId")
        private String experimentId;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("PaiflowNodeId")
        private String paiflowNodeId;

        @com.aliyun.core.annotation.NameInMap("RunId")
        private String runId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private Jobs(Builder builder) {
            this.creator = builder.creator;
            this.executeType = builder.executeType;
            this.experimentId = builder.experimentId;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.jobId = builder.jobId;
            this.nodeId = builder.nodeId;
            this.paiflowNodeId = builder.paiflowNodeId;
            this.runId = builder.runId;
            this.status = builder.status;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Jobs create() {
            return builder().build();
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return executeType
         */
        public String getExecuteType() {
            return this.executeType;
        }

        /**
         * @return experimentId
         */
        public String getExperimentId() {
            return this.experimentId;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return paiflowNodeId
         */
        public String getPaiflowNodeId() {
            return this.paiflowNodeId;
        }

        /**
         * @return runId
         */
        public String getRunId() {
            return this.runId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String creator; 
            private String executeType; 
            private String experimentId; 
            private String gmtCreateTime; 
            private String jobId; 
            private String nodeId; 
            private String paiflowNodeId; 
            private String runId; 
            private String status; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Jobs model) {
                this.creator = model.creator;
                this.executeType = model.executeType;
                this.experimentId = model.experimentId;
                this.gmtCreateTime = model.gmtCreateTime;
                this.jobId = model.jobId;
                this.nodeId = model.nodeId;
                this.paiflowNodeId = model.paiflowNodeId;
                this.runId = model.runId;
                this.status = model.status;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * ExecuteType.
             */
            public Builder executeType(String executeType) {
                this.executeType = executeType;
                return this;
            }

            /**
             * ExperimentId.
             */
            public Builder experimentId(String experimentId) {
                this.experimentId = experimentId;
                return this;
            }

            /**
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
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
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * PaiflowNodeId.
             */
            public Builder paiflowNodeId(String paiflowNodeId) {
                this.paiflowNodeId = paiflowNodeId;
                return this;
            }

            /**
             * RunId.
             */
            public Builder runId(String runId) {
                this.runId = runId;
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
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Jobs build() {
                return new Jobs(this);
            } 

        } 

    }
}
