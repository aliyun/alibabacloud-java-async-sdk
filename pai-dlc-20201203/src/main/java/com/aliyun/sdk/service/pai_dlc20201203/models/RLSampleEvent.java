// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link RLSampleEvent} extends {@link TeaModel}
 *
 * <p>RLSampleEvent</p>
 */
public class RLSampleEvent extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Detail")
    private String detail;

    @com.aliyun.core.annotation.NameInMap("From")
    private String from;

    @com.aliyun.core.annotation.NameInMap("GlobalStep")
    private String globalStep;

    @com.aliyun.core.annotation.NameInMap("Stage")
    private String stage;

    @com.aliyun.core.annotation.NameInMap("TimestampMs")
    private Long timestampMs;

    @com.aliyun.core.annotation.NameInMap("To")
    private String to;

    private RLSampleEvent(Builder builder) {
        this.detail = builder.detail;
        this.from = builder.from;
        this.globalStep = builder.globalStep;
        this.stage = builder.stage;
        this.timestampMs = builder.timestampMs;
        this.to = builder.to;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLSampleEvent create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return detail
     */
    public String getDetail() {
        return this.detail;
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return globalStep
     */
    public String getGlobalStep() {
        return this.globalStep;
    }

    /**
     * @return stage
     */
    public String getStage() {
        return this.stage;
    }

    /**
     * @return timestampMs
     */
    public Long getTimestampMs() {
        return this.timestampMs;
    }

    /**
     * @return to
     */
    public String getTo() {
        return this.to;
    }

    public static final class Builder {
        private String detail; 
        private String from; 
        private String globalStep; 
        private String stage; 
        private Long timestampMs; 
        private String to; 

        private Builder() {
        } 

        private Builder(RLSampleEvent model) {
            this.detail = model.detail;
            this.from = model.from;
            this.globalStep = model.globalStep;
            this.stage = model.stage;
            this.timestampMs = model.timestampMs;
            this.to = model.to;
        } 

        /**
         * <p>The details. For Megatron rows, the value is rank=..,global_step=..,ppo_epoch=..</p>
         * 
         * <strong>example:</strong>
         * <p>uid_generated</p>
         */
        public Builder detail(String detail) {
            this.detail = detail;
            return this;
        }

        /**
         * <p>The event source component. For Megatron rows, the value is &quot;{phase} {status}&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>DataLoader</p>
         */
        public Builder from(String from) {
            this.from = from;
            return this;
        }

        /**
         * <p>The training step to which the event belongs (raw string). For Megatron rows, this is empty because the step is included in Detail.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder globalStep(String globalStep) {
            this.globalStep = globalStep;
            return this;
        }

        /**
         * <p>The stage. For Megatron rows, this is normalized to TRAIN.</p>
         * 
         * <strong>example:</strong>
         * <p>DATA_PREPROCESS</p>
         */
        public Builder stage(String stage) {
            this.stage = stage;
            return this;
        }

        /**
         * <p>The millisecond timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1787293208012</p>
         */
        public Builder timestampMs(Long timestampMs) {
            this.timestampMs = timestampMs;
            return this;
        }

        /**
         * <p>The event target component. For Megatron rows, the value is the function name.</p>
         * 
         * <strong>example:</strong>
         * <p>PPOTrainerV1</p>
         */
        public Builder to(String to) {
            this.to = to;
            return this;
        }

        public RLSampleEvent build() {
            return new RLSampleEvent(this);
        } 

    } 

}
