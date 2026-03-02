// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link MonitorSlsAlertRule} extends {@link TeaModel}
 *
 * <p>MonitorSlsAlertRule</p>
 */
public class MonitorSlsAlertRule extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("queryCondition")
    private String queryCondition;

    @com.aliyun.core.annotation.NameInMap("triggerInterval")
    private Long triggerInterval;

    @com.aliyun.core.annotation.NameInMap("triggerIntervalUnit")
    private String triggerIntervalUnit;

    @com.aliyun.core.annotation.NameInMap("triggerOperator")
    private String triggerOperator;

    @com.aliyun.core.annotation.NameInMap("triggerThreshold")
    private Long triggerThreshold;

    @com.aliyun.core.annotation.NameInMap("triggerThresholdUpper")
    private Long triggerThresholdUpper;

    private MonitorSlsAlertRule(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.queryCondition = builder.queryCondition;
        this.triggerInterval = builder.triggerInterval;
        this.triggerIntervalUnit = builder.triggerIntervalUnit;
        this.triggerOperator = builder.triggerOperator;
        this.triggerThreshold = builder.triggerThreshold;
        this.triggerThresholdUpper = builder.triggerThresholdUpper;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MonitorSlsAlertRule create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return queryCondition
     */
    public String getQueryCondition() {
        return this.queryCondition;
    }

    /**
     * @return triggerInterval
     */
    public Long getTriggerInterval() {
        return this.triggerInterval;
    }

    /**
     * @return triggerIntervalUnit
     */
    public String getTriggerIntervalUnit() {
        return this.triggerIntervalUnit;
    }

    /**
     * @return triggerOperator
     */
    public String getTriggerOperator() {
        return this.triggerOperator;
    }

    /**
     * @return triggerThreshold
     */
    public Long getTriggerThreshold() {
        return this.triggerThreshold;
    }

    /**
     * @return triggerThresholdUpper
     */
    public Long getTriggerThresholdUpper() {
        return this.triggerThresholdUpper;
    }

    public static final class Builder {
        private Long id; 
        private String name; 
        private String queryCondition; 
        private Long triggerInterval; 
        private String triggerIntervalUnit; 
        private String triggerOperator; 
        private Long triggerThreshold; 
        private Long triggerThresholdUpper; 

        private Builder() {
        } 

        private Builder(MonitorSlsAlertRule model) {
            this.id = model.id;
            this.name = model.name;
            this.queryCondition = model.queryCondition;
            this.triggerInterval = model.triggerInterval;
            this.triggerIntervalUnit = model.triggerIntervalUnit;
            this.triggerOperator = model.triggerOperator;
            this.triggerThreshold = model.triggerThreshold;
            this.triggerThresholdUpper = model.triggerThresholdUpper;
        } 

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * queryCondition.
         */
        public Builder queryCondition(String queryCondition) {
            this.queryCondition = queryCondition;
            return this;
        }

        /**
         * triggerInterval.
         */
        public Builder triggerInterval(Long triggerInterval) {
            this.triggerInterval = triggerInterval;
            return this;
        }

        /**
         * triggerIntervalUnit.
         */
        public Builder triggerIntervalUnit(String triggerIntervalUnit) {
            this.triggerIntervalUnit = triggerIntervalUnit;
            return this;
        }

        /**
         * triggerOperator.
         */
        public Builder triggerOperator(String triggerOperator) {
            this.triggerOperator = triggerOperator;
            return this;
        }

        /**
         * triggerThreshold.
         */
        public Builder triggerThreshold(Long triggerThreshold) {
            this.triggerThreshold = triggerThreshold;
            return this;
        }

        /**
         * triggerThresholdUpper.
         */
        public Builder triggerThresholdUpper(Long triggerThresholdUpper) {
            this.triggerThresholdUpper = triggerThresholdUpper;
            return this;
        }

        public MonitorSlsAlertRule build() {
            return new MonitorSlsAlertRule(this);
        } 

    } 

}
