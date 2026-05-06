// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetAutomaticFrequencyControlConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetAutomaticFrequencyControlConfigResponseBody</p>
 */
public class GetAutomaticFrequencyControlConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActionType")
    private String actionType;

    @com.aliyun.core.annotation.NameInMap("Enable")
    private String enable;

    @com.aliyun.core.annotation.NameInMap("Interval")
    private Integer interval;

    @com.aliyun.core.annotation.NameInMap("Level")
    private String level;

    @com.aliyun.core.annotation.NameInMap("PunishTime")
    private Integer punishTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleId")
    private Long ruleId;

    @com.aliyun.core.annotation.NameInMap("Threshold")
    private Integer threshold;

    private GetAutomaticFrequencyControlConfigResponseBody(Builder builder) {
        this.actionType = builder.actionType;
        this.enable = builder.enable;
        this.interval = builder.interval;
        this.level = builder.level;
        this.punishTime = builder.punishTime;
        this.requestId = builder.requestId;
        this.ruleId = builder.ruleId;
        this.threshold = builder.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAutomaticFrequencyControlConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionType
     */
    public String getActionType() {
        return this.actionType;
    }

    /**
     * @return enable
     */
    public String getEnable() {
        return this.enable;
    }

    /**
     * @return interval
     */
    public Integer getInterval() {
        return this.interval;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return punishTime
     */
    public Integer getPunishTime() {
        return this.punishTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    /**
     * @return threshold
     */
    public Integer getThreshold() {
        return this.threshold;
    }

    public static final class Builder {
        private String actionType; 
        private String enable; 
        private Integer interval; 
        private String level; 
        private Integer punishTime; 
        private String requestId; 
        private Long ruleId; 
        private Integer threshold; 

        private Builder() {
        } 

        private Builder(GetAutomaticFrequencyControlConfigResponseBody model) {
            this.actionType = model.actionType;
            this.enable = model.enable;
            this.interval = model.interval;
            this.level = model.level;
            this.punishTime = model.punishTime;
            this.requestId = model.requestId;
            this.ruleId = model.ruleId;
            this.threshold = model.threshold;
        } 

        /**
         * ActionType.
         */
        public Builder actionType(String actionType) {
            this.actionType = actionType;
            return this;
        }

        /**
         * Enable.
         */
        public Builder enable(String enable) {
            this.enable = enable;
            return this;
        }

        /**
         * Interval.
         */
        public Builder interval(Integer interval) {
            this.interval = interval;
            return this;
        }

        /**
         * Level.
         */
        public Builder level(String level) {
            this.level = level;
            return this;
        }

        /**
         * PunishTime.
         */
        public Builder punishTime(Integer punishTime) {
            this.punishTime = punishTime;
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
         * RuleId.
         */
        public Builder ruleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }

        /**
         * Threshold.
         */
        public Builder threshold(Integer threshold) {
            this.threshold = threshold;
            return this;
        }

        public GetAutomaticFrequencyControlConfigResponseBody build() {
            return new GetAutomaticFrequencyControlConfigResponseBody(this);
        } 

    } 

}
