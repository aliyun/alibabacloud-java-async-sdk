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
 * {@link ResumePipelineResponseBody} extends {@link TeaModel}
 *
 * <p>ResumePipelineResponseBody</p>
 */
public class ResumePipelineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentSpaceName")
    private String agentSpaceName;

    @com.aliyun.core.annotation.NameInMap("committedWatermark")
    private Long committedWatermark;

    @com.aliyun.core.annotation.NameInMap("nextTriggerTime")
    private Long nextTriggerTime;

    @com.aliyun.core.annotation.NameInMap("pipelineName")
    private String pipelineName;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("scheduleStatus")
    private String scheduleStatus;

    private ResumePipelineResponseBody(Builder builder) {
        this.agentSpaceName = builder.agentSpaceName;
        this.committedWatermark = builder.committedWatermark;
        this.nextTriggerTime = builder.nextTriggerTime;
        this.pipelineName = builder.pipelineName;
        this.requestId = builder.requestId;
        this.scheduleStatus = builder.scheduleStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResumePipelineResponseBody create() {
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
     * @return committedWatermark
     */
    public Long getCommittedWatermark() {
        return this.committedWatermark;
    }

    /**
     * @return nextTriggerTime
     */
    public Long getNextTriggerTime() {
        return this.nextTriggerTime;
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
        private Long committedWatermark; 
        private Long nextTriggerTime; 
        private String pipelineName; 
        private String requestId; 
        private String scheduleStatus; 

        private Builder() {
        } 

        private Builder(ResumePipelineResponseBody model) {
            this.agentSpaceName = model.agentSpaceName;
            this.committedWatermark = model.committedWatermark;
            this.nextTriggerTime = model.nextTriggerTime;
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
         * committedWatermark.
         */
        public Builder committedWatermark(Long committedWatermark) {
            this.committedWatermark = committedWatermark;
            return this;
        }

        /**
         * nextTriggerTime.
         */
        public Builder nextTriggerTime(Long nextTriggerTime) {
            this.nextTriggerTime = nextTriggerTime;
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

        public ResumePipelineResponseBody build() {
            return new ResumePipelineResponseBody(this);
        } 

    } 

}
