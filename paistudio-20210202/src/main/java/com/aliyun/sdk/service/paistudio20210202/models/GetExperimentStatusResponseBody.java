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
 * {@link GetExperimentStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetExperimentStatusResponseBody</p>
 */
public class GetExperimentStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Nodes")
    private java.util.List<Nodes> nodes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private GetExperimentStatusResponseBody(Builder builder) {
        this.nodes = builder.nodes;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExperimentStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nodes
     */
    public java.util.List<Nodes> getNodes() {
        return this.nodes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private java.util.List<Nodes> nodes; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(GetExperimentStatusResponseBody model) {
            this.nodes = model.nodes;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * Nodes.
         */
        public Builder nodes(java.util.List<Nodes> nodes) {
            this.nodes = nodes;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetExperimentStatusResponseBody build() {
            return new GetExperimentStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetExperimentStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetExperimentStatusResponseBody</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FinishedAt")
        private String finishedAt;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("RunId")
        private String runId;

        @com.aliyun.core.annotation.NameInMap("RunNodeId")
        private String runNodeId;

        @com.aliyun.core.annotation.NameInMap("StartedAt")
        private String startedAt;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Nodes(Builder builder) {
            this.finishedAt = builder.finishedAt;
            this.jobId = builder.jobId;
            this.nodeId = builder.nodeId;
            this.runId = builder.runId;
            this.runNodeId = builder.runNodeId;
            this.startedAt = builder.startedAt;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return finishedAt
         */
        public String getFinishedAt() {
            return this.finishedAt;
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
         * @return runId
         */
        public String getRunId() {
            return this.runId;
        }

        /**
         * @return runNodeId
         */
        public String getRunNodeId() {
            return this.runNodeId;
        }

        /**
         * @return startedAt
         */
        public String getStartedAt() {
            return this.startedAt;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String finishedAt; 
            private String jobId; 
            private String nodeId; 
            private String runId; 
            private String runNodeId; 
            private String startedAt; 
            private String status; 

            private Builder() {
            } 

            private Builder(Nodes model) {
                this.finishedAt = model.finishedAt;
                this.jobId = model.jobId;
                this.nodeId = model.nodeId;
                this.runId = model.runId;
                this.runNodeId = model.runNodeId;
                this.startedAt = model.startedAt;
                this.status = model.status;
            } 

            /**
             * FinishedAt.
             */
            public Builder finishedAt(String finishedAt) {
                this.finishedAt = finishedAt;
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
             * RunId.
             */
            public Builder runId(String runId) {
                this.runId = runId;
                return this;
            }

            /**
             * RunNodeId.
             */
            public Builder runNodeId(String runNodeId) {
                this.runNodeId = runNodeId;
                return this;
            }

            /**
             * StartedAt.
             */
            public Builder startedAt(String startedAt) {
                this.startedAt = startedAt;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
}
