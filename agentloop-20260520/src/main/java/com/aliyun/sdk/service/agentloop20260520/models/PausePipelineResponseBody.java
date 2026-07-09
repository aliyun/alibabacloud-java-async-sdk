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
         * agentSpaceName.
         */
        public Builder agentSpaceName(String agentSpaceName) {
            this.agentSpaceName = agentSpaceName;
            return this;
        }

        /**
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
         * pausedReason.
         */
        public Builder pausedReason(String pausedReason) {
            this.pausedReason = pausedReason;
            return this;
        }

        /**
         * pipelineName.
         */
        public Builder pipelineName(String pipelineName) {
            this.pipelineName = pipelineName;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * scheduleStatus.
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
