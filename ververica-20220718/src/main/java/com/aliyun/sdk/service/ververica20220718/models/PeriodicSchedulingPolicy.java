// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PeriodicSchedulingPolicy} extends {@link TeaModel}
 *
 * <p>PeriodicSchedulingPolicy</p>
 */
public class PeriodicSchedulingPolicy extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("isFinished")
    private Boolean isFinished;

    @com.aliyun.core.annotation.NameInMap("onlyOnceTriggerTime")
    private Long onlyOnceTriggerTime;

    @com.aliyun.core.annotation.NameInMap("onlyOnceTriggerTimeIsExpired")
    private Boolean onlyOnceTriggerTimeIsExpired;

    @com.aliyun.core.annotation.NameInMap("periodicSchedulingLevel")
    private String periodicSchedulingLevel;

    @com.aliyun.core.annotation.NameInMap("periodicSchedulingValues")
    private java.util.List < Integer > periodicSchedulingValues;

    @com.aliyun.core.annotation.NameInMap("periodicTriggerTime")
    private Long periodicTriggerTime;

    @com.aliyun.core.annotation.NameInMap("resourceSetting")
    private BriefResourceSetting resourceSetting;

    private PeriodicSchedulingPolicy(Builder builder) {
        this.isFinished = builder.isFinished;
        this.onlyOnceTriggerTime = builder.onlyOnceTriggerTime;
        this.onlyOnceTriggerTimeIsExpired = builder.onlyOnceTriggerTimeIsExpired;
        this.periodicSchedulingLevel = builder.periodicSchedulingLevel;
        this.periodicSchedulingValues = builder.periodicSchedulingValues;
        this.periodicTriggerTime = builder.periodicTriggerTime;
        this.resourceSetting = builder.resourceSetting;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PeriodicSchedulingPolicy create() {
        return builder().build();
    }

    /**
     * @return isFinished
     */
    public Boolean getIsFinished() {
        return this.isFinished;
    }

    /**
     * @return onlyOnceTriggerTime
     */
    public Long getOnlyOnceTriggerTime() {
        return this.onlyOnceTriggerTime;
    }

    /**
     * @return onlyOnceTriggerTimeIsExpired
     */
    public Boolean getOnlyOnceTriggerTimeIsExpired() {
        return this.onlyOnceTriggerTimeIsExpired;
    }

    /**
     * @return periodicSchedulingLevel
     */
    public String getPeriodicSchedulingLevel() {
        return this.periodicSchedulingLevel;
    }

    /**
     * @return periodicSchedulingValues
     */
    public java.util.List < Integer > getPeriodicSchedulingValues() {
        return this.periodicSchedulingValues;
    }

    /**
     * @return periodicTriggerTime
     */
    public Long getPeriodicTriggerTime() {
        return this.periodicTriggerTime;
    }

    /**
     * @return resourceSetting
     */
    public BriefResourceSetting getResourceSetting() {
        return this.resourceSetting;
    }

    public static final class Builder {
        private Boolean isFinished; 
        private Long onlyOnceTriggerTime; 
        private Boolean onlyOnceTriggerTimeIsExpired; 
        private String periodicSchedulingLevel; 
        private java.util.List < Integer > periodicSchedulingValues; 
        private Long periodicTriggerTime; 
        private BriefResourceSetting resourceSetting; 

        /**
         * isFinished.
         */
        public Builder isFinished(Boolean isFinished) {
            this.isFinished = isFinished;
            return this;
        }

        /**
         * onlyOnceTriggerTime.
         */
        public Builder onlyOnceTriggerTime(Long onlyOnceTriggerTime) {
            this.onlyOnceTriggerTime = onlyOnceTriggerTime;
            return this;
        }

        /**
         * onlyOnceTriggerTimeIsExpired.
         */
        public Builder onlyOnceTriggerTimeIsExpired(Boolean onlyOnceTriggerTimeIsExpired) {
            this.onlyOnceTriggerTimeIsExpired = onlyOnceTriggerTimeIsExpired;
            return this;
        }

        /**
         * periodicSchedulingLevel.
         */
        public Builder periodicSchedulingLevel(String periodicSchedulingLevel) {
            this.periodicSchedulingLevel = periodicSchedulingLevel;
            return this;
        }

        /**
         * periodicSchedulingValues.
         */
        public Builder periodicSchedulingValues(java.util.List < Integer > periodicSchedulingValues) {
            this.periodicSchedulingValues = periodicSchedulingValues;
            return this;
        }

        /**
         * periodicTriggerTime.
         */
        public Builder periodicTriggerTime(Long periodicTriggerTime) {
            this.periodicTriggerTime = periodicTriggerTime;
            return this;
        }

        /**
         * resourceSetting.
         */
        public Builder resourceSetting(BriefResourceSetting resourceSetting) {
            this.resourceSetting = resourceSetting;
            return this;
        }

        public PeriodicSchedulingPolicy build() {
            return new PeriodicSchedulingPolicy(this);
        } 

    } 

}
