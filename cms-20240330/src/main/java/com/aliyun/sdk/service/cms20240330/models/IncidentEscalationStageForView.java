// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link IncidentEscalationStageForView} extends {@link TeaModel}
 *
 * <p>IncidentEscalationStageForView</p>
 */
public class IncidentEscalationStageForView extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cycleNotifyCount")
    private Integer cycleNotifyCount;

    @com.aliyun.core.annotation.NameInMap("cycleNotifyInterval")
    private Integer cycleNotifyInterval;

    @com.aliyun.core.annotation.NameInMap("effectTimeRange")
    private EffectTimeRange effectTimeRange;

    @com.aliyun.core.annotation.NameInMap("index")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer index;

    @com.aliyun.core.annotation.NameInMap("notifyChannels")
    private java.util.List<NotifyChannel> notifyChannels;

    @com.aliyun.core.annotation.NameInMap("targetIncidentState")
    private String targetIncidentState;

    @com.aliyun.core.annotation.NameInMap("triggerDelay")
    private Integer triggerDelay;

    private IncidentEscalationStageForView(Builder builder) {
        this.cycleNotifyCount = builder.cycleNotifyCount;
        this.cycleNotifyInterval = builder.cycleNotifyInterval;
        this.effectTimeRange = builder.effectTimeRange;
        this.index = builder.index;
        this.notifyChannels = builder.notifyChannels;
        this.targetIncidentState = builder.targetIncidentState;
        this.triggerDelay = builder.triggerDelay;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IncidentEscalationStageForView create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cycleNotifyCount
     */
    public Integer getCycleNotifyCount() {
        return this.cycleNotifyCount;
    }

    /**
     * @return cycleNotifyInterval
     */
    public Integer getCycleNotifyInterval() {
        return this.cycleNotifyInterval;
    }

    /**
     * @return effectTimeRange
     */
    public EffectTimeRange getEffectTimeRange() {
        return this.effectTimeRange;
    }

    /**
     * @return index
     */
    public Integer getIndex() {
        return this.index;
    }

    /**
     * @return notifyChannels
     */
    public java.util.List<NotifyChannel> getNotifyChannels() {
        return this.notifyChannels;
    }

    /**
     * @return targetIncidentState
     */
    public String getTargetIncidentState() {
        return this.targetIncidentState;
    }

    /**
     * @return triggerDelay
     */
    public Integer getTriggerDelay() {
        return this.triggerDelay;
    }

    public static final class Builder {
        private Integer cycleNotifyCount; 
        private Integer cycleNotifyInterval; 
        private EffectTimeRange effectTimeRange; 
        private Integer index; 
        private java.util.List<NotifyChannel> notifyChannels; 
        private String targetIncidentState; 
        private Integer triggerDelay; 

        private Builder() {
        } 

        private Builder(IncidentEscalationStageForView model) {
            this.cycleNotifyCount = model.cycleNotifyCount;
            this.cycleNotifyInterval = model.cycleNotifyInterval;
            this.effectTimeRange = model.effectTimeRange;
            this.index = model.index;
            this.notifyChannels = model.notifyChannels;
            this.targetIncidentState = model.targetIncidentState;
            this.triggerDelay = model.triggerDelay;
        } 

        /**
         * cycleNotifyCount.
         */
        public Builder cycleNotifyCount(Integer cycleNotifyCount) {
            this.cycleNotifyCount = cycleNotifyCount;
            return this;
        }

        /**
         * cycleNotifyInterval.
         */
        public Builder cycleNotifyInterval(Integer cycleNotifyInterval) {
            this.cycleNotifyInterval = cycleNotifyInterval;
            return this;
        }

        /**
         * effectTimeRange.
         */
        public Builder effectTimeRange(EffectTimeRange effectTimeRange) {
            this.effectTimeRange = effectTimeRange;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder index(Integer index) {
            this.index = index;
            return this;
        }

        /**
         * notifyChannels.
         */
        public Builder notifyChannels(java.util.List<NotifyChannel> notifyChannels) {
            this.notifyChannels = notifyChannels;
            return this;
        }

        /**
         * targetIncidentState.
         */
        public Builder targetIncidentState(String targetIncidentState) {
            this.targetIncidentState = targetIncidentState;
            return this;
        }

        /**
         * triggerDelay.
         */
        public Builder triggerDelay(Integer triggerDelay) {
            this.triggerDelay = triggerDelay;
            return this;
        }

        public IncidentEscalationStageForView build() {
            return new IncidentEscalationStageForView(this);
        } 

    } 

}
