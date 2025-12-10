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
 * {@link GetJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetJobResponseBody</p>
 */
public class GetJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Arguments")
    private String arguments;

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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RunId")
    private String runId;

    @com.aliyun.core.annotation.NameInMap("RunInfo")
    private String runInfo;

    @com.aliyun.core.annotation.NameInMap("Snapshot")
    private String snapshot;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private GetJobResponseBody(Builder builder) {
        this.arguments = builder.arguments;
        this.creator = builder.creator;
        this.executeType = builder.executeType;
        this.experimentId = builder.experimentId;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.jobId = builder.jobId;
        this.nodeId = builder.nodeId;
        this.paiflowNodeId = builder.paiflowNodeId;
        this.requestId = builder.requestId;
        this.runId = builder.runId;
        this.runInfo = builder.runInfo;
        this.snapshot = builder.snapshot;
        this.status = builder.status;
        this.workspaceId = builder.workspaceId;
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
     * @return arguments
     */
    public String getArguments() {
        return this.arguments;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return runId
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * @return runInfo
     */
    public String getRunInfo() {
        return this.runInfo;
    }

    /**
     * @return snapshot
     */
    public String getSnapshot() {
        return this.snapshot;
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
        private String arguments; 
        private String creator; 
        private String executeType; 
        private String experimentId; 
        private String gmtCreateTime; 
        private String jobId; 
        private String nodeId; 
        private String paiflowNodeId; 
        private String requestId; 
        private String runId; 
        private String runInfo; 
        private String snapshot; 
        private String status; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(GetJobResponseBody model) {
            this.arguments = model.arguments;
            this.creator = model.creator;
            this.executeType = model.executeType;
            this.experimentId = model.experimentId;
            this.gmtCreateTime = model.gmtCreateTime;
            this.jobId = model.jobId;
            this.nodeId = model.nodeId;
            this.paiflowNodeId = model.paiflowNodeId;
            this.requestId = model.requestId;
            this.runId = model.runId;
            this.runInfo = model.runInfo;
            this.snapshot = model.snapshot;
            this.status = model.status;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * Arguments.
         */
        public Builder arguments(String arguments) {
            this.arguments = arguments;
            return this;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * RunInfo.
         */
        public Builder runInfo(String runInfo) {
            this.runInfo = runInfo;
            return this;
        }

        /**
         * Snapshot.
         */
        public Builder snapshot(String snapshot) {
            this.snapshot = snapshot;
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

        public GetJobResponseBody build() {
            return new GetJobResponseBody(this);
        } 

    } 

}
