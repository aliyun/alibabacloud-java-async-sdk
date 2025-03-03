// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emas_appmonitor20190611.models;

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
 * {@link EventRule} extends {@link TeaModel}
 *
 * <p>EventRule</p>
 */
public class EventRule extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Conditional")
    private java.util.List<ConditionalRule> conditional;

    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("EventId")
    private String eventId;

    @com.aliyun.core.annotation.NameInMap("ModifyTime")
    private String modifyTime;

    @com.aliyun.core.annotation.NameInMap("Operator")
    private String operator;

    @com.aliyun.core.annotation.NameInMap("SampleRate")
    private Float sampleRate;

    private EventRule(Builder builder) {
        this.conditional = builder.conditional;
        this.enable = builder.enable;
        this.eventId = builder.eventId;
        this.modifyTime = builder.modifyTime;
        this.operator = builder.operator;
        this.sampleRate = builder.sampleRate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EventRule create() {
        return builder().build();
    }

    /**
     * @return conditional
     */
    public java.util.List<ConditionalRule> getConditional() {
        return this.conditional;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return modifyTime
     */
    public String getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return sampleRate
     */
    public Float getSampleRate() {
        return this.sampleRate;
    }

    public static final class Builder {
        private java.util.List<ConditionalRule> conditional; 
        private Boolean enable; 
        private String eventId; 
        private String modifyTime; 
        private String operator; 
        private Float sampleRate; 

        /**
         * Conditional.
         */
        public Builder conditional(java.util.List<ConditionalRule> conditional) {
            this.conditional = conditional;
            return this;
        }

        /**
         * Enable.
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * EventId.
         */
        public Builder eventId(String eventId) {
            this.eventId = eventId;
            return this;
        }

        /**
         * ModifyTime.
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * Operator.
         */
        public Builder operator(String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * SampleRate.
         */
        public Builder sampleRate(Float sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }

        public EventRule build() {
            return new EventRule(this);
        } 

    } 

}
