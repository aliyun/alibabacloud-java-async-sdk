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
 * {@link TerminatePipelineResponseBody} extends {@link TeaModel}
 *
 * <p>TerminatePipelineResponseBody</p>
 */
public class TerminatePipelineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentSpaceName")
    private String agentSpaceName;

    @com.aliyun.core.annotation.NameInMap("pipelineName")
    private String pipelineName;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("scheduleStatus")
    private String scheduleStatus;

    @com.aliyun.core.annotation.NameInMap("terminateTime")
    private String terminateTime;

    @com.aliyun.core.annotation.NameInMap("terminatedReason")
    private String terminatedReason;

    private TerminatePipelineResponseBody(Builder builder) {
        this.agentSpaceName = builder.agentSpaceName;
        this.pipelineName = builder.pipelineName;
        this.requestId = builder.requestId;
        this.scheduleStatus = builder.scheduleStatus;
        this.terminateTime = builder.terminateTime;
        this.terminatedReason = builder.terminatedReason;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TerminatePipelineResponseBody create() {
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
     * @return scheduleStatus
     */
    public String getScheduleStatus() {
        return this.scheduleStatus;
    }

    /**
     * @return terminateTime
     */
    public String getTerminateTime() {
        return this.terminateTime;
    }

    /**
     * @return terminatedReason
     */
    public String getTerminatedReason() {
        return this.terminatedReason;
    }

    public static final class Builder {
        private String agentSpaceName; 
        private String pipelineName; 
        private String requestId; 
        private String scheduleStatus; 
        private String terminateTime; 
        private String terminatedReason; 

        private Builder() {
        } 

        private Builder(TerminatePipelineResponseBody model) {
            this.agentSpaceName = model.agentSpaceName;
            this.pipelineName = model.pipelineName;
            this.requestId = model.requestId;
            this.scheduleStatus = model.scheduleStatus;
            this.terminateTime = model.terminateTime;
            this.terminatedReason = model.terminatedReason;
        } 

        /**
         * <p>The name of the AgentSpace where the pipeline is located.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-space</p>
         */
        public Builder agentSpaceName(String agentSpaceName) {
            this.agentSpaceName = agentSpaceName;
            return this;
        }

        /**
         * <p>The name of the pipeline.</p>
         * 
         * <strong>example:</strong>
         * <p>my-pipeline</p>
         */
        public Builder pipelineName(String pipelineName) {
            this.pipelineName = pipelineName;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate the request during troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The scheduling status. The value is fixed to Terminated, which is an irreversible desired state.</p>
         * 
         * <strong>example:</strong>
         * <p>Terminated</p>
         */
        public Builder scheduleStatus(String scheduleStatus) {
            this.scheduleStatus = scheduleStatus;
            return this;
        }

        /**
         * <p>The termination time in ISO 8601 UTC format.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00.000Z</p>
         */
        public Builder terminateTime(String terminateTime) {
            this.terminateTime = terminateTime;
            return this;
        }

        /**
         * <p>The reason for termination.</p>
         * 
         * <strong>example:</strong>
         * <p>project deprecated</p>
         */
        public Builder terminatedReason(String terminatedReason) {
            this.terminatedReason = terminatedReason;
            return this;
        }

        public TerminatePipelineResponseBody build() {
            return new TerminatePipelineResponseBody(this);
        } 

    } 

}
