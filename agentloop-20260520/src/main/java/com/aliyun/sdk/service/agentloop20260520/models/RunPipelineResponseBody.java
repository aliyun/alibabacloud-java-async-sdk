// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link RunPipelineResponseBody} extends {@link TeaModel}
 *
 * <p>RunPipelineResponseBody</p>
 */
public class RunPipelineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentSpaceName")
    private String agentSpaceName;

    @com.aliyun.core.annotation.NameInMap("pipelineName")
    private String pipelineName;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("runId")
    private String runId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private RunPipelineResponseBody(Builder builder) {
        this.agentSpaceName = builder.agentSpaceName;
        this.pipelineName = builder.pipelineName;
        this.requestId = builder.requestId;
        this.runId = builder.runId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunPipelineResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentSpaceName
     */
    public String getAgentSpaceName() {
        return this.agentSpaceName;
    }

    /**
     * @return pipelineName
     */
    public String getPipelineName() {
        return this.pipelineName;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String agentSpaceName; 
        private String pipelineName; 
        private String requestId; 
        private String runId; 
        private String status; 

        private Builder() {
        } 

        private Builder(RunPipelineResponseBody model) {
            this.agentSpaceName = model.agentSpaceName;
            this.pipelineName = model.pipelineName;
            this.requestId = model.requestId;
            this.runId = model.runId;
            this.status = model.status;
        } 

        /**
         * <p>The name of the AgentSpace.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-space</p>
         */
        public Builder agentSpaceName(String agentSpaceName) {
            this.agentSpaceName = agentSpaceName;
            return this;
        }

        /**
         * <p>The pipeline name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-pipeline</p>
         */
        public Builder pipelineName(String pipelineName) {
            this.pipelineName = pipelineName;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The run ID created by this trigger.</p>
         * 
         * <strong>example:</strong>
         * <p>run-20260101-0001</p>
         */
        public Builder runId(String runId) {
            this.runId = runId;
            return this;
        }

        /**
         * <p>The current status of the run. The status is typically Pending after the run is queued.</p>
         * 
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public RunPipelineResponseBody build() {
            return new RunPipelineResponseBody(this);
        } 

    } 

}
