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
 * {@link PausePipelineResponseBody} extends {@link TeaModel}
 *
 * <p>PausePipelineResponseBody</p>
 */
public class PausePipelineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentSpaceName")
    private String agentSpaceName;

    @com.aliyun.core.annotation.NameInMap("pauseTime")
    private String pauseTime;

    @com.aliyun.core.annotation.NameInMap("pausedReason")
    private String pausedReason;

    @com.aliyun.core.annotation.NameInMap("pipelineName")
    private String pipelineName;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("scheduleStatus")
    private String scheduleStatus;

    private PausePipelineResponseBody(Builder builder) {
        this.agentSpaceName = builder.agentSpaceName;
        this.pauseTime = builder.pauseTime;
        this.pausedReason = builder.pausedReason;
        this.pipelineName = builder.pipelineName;
        this.requestId = builder.requestId;
        this.scheduleStatus = builder.scheduleStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PausePipelineResponseBody create() {
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
     * @return pauseTime
     */
    public String getPauseTime() {
        return this.pauseTime;
    }

    /**
     * @return pausedReason
     */
    public String getPausedReason() {
        return this.pausedReason;
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

    public static final class Builder {
        private String agentSpaceName; 
        private String pauseTime; 
        private String pausedReason; 
        private String pipelineName; 
        private String requestId; 
        private String scheduleStatus; 

        private Builder() {
        } 

        private Builder(PausePipelineResponseBody model) {
            this.agentSpaceName = model.agentSpaceName;
            this.pauseTime = model.pauseTime;
            this.pausedReason = model.pausedReason;
            this.pipelineName = model.pipelineName;
            this.requestId = model.requestId;
            this.scheduleStatus = model.scheduleStatus;
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
         * <p>The time when the pipeline was paused, in ISO 8601 UTC format.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00.000Z</p>
         */
        public Builder pauseTime(String pauseTime) {
            this.pauseTime = pauseTime;
            return this;
        }

        /**
         * <p>The reason for pausing the pipeline.</p>
         * 
         * <strong>example:</strong>
         * <p>manual maintenance</p>
         */
        public Builder pausedReason(String pausedReason) {
            this.pausedReason = pausedReason;
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
         * <p>The scheduling status. The value is fixed as Paused.</p>
         * 
         * <strong>example:</strong>
         * <p>Paused</p>
         */
        public Builder scheduleStatus(String scheduleStatus) {
            this.scheduleStatus = scheduleStatus;
            return this;
        }

        public PausePipelineResponseBody build() {
            return new PausePipelineResponseBody(this);
        } 

    } 

}
