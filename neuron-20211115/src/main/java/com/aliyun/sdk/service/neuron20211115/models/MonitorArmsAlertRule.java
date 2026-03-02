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
 * {@link MonitorArmsAlertRule} extends {@link TeaModel}
 *
 * <p>MonitorArmsAlertRule</p>
 */
public class MonitorArmsAlertRule extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("metricKey")
    private String metricKey;

    @com.aliyun.core.annotation.NameInMap("metricType")
    private String metricType;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("triggerAggregate")
    private String triggerAggregate;

    @com.aliyun.core.annotation.NameInMap("triggerInterval")
    private Long triggerInterval;

    @com.aliyun.core.annotation.NameInMap("triggerOperator")
    private String triggerOperator;

    @com.aliyun.core.annotation.NameInMap("triggerThreshold")
    private Long triggerThreshold;

    private MonitorArmsAlertRule(Builder builder) {
        this.id = builder.id;
        this.metricKey = builder.metricKey;
        this.metricType = builder.metricType;
        this.name = builder.name;
        this.triggerAggregate = builder.triggerAggregate;
        this.triggerInterval = builder.triggerInterval;
        this.triggerOperator = builder.triggerOperator;
        this.triggerThreshold = builder.triggerThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MonitorArmsAlertRule create() {
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
     * @return metricKey
     */
    public String getMetricKey() {
        return this.metricKey;
    }

    /**
     * @return metricType
     */
    public String getMetricType() {
        return this.metricType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return triggerAggregate
     */
    public String getTriggerAggregate() {
        return this.triggerAggregate;
    }

    /**
     * @return triggerInterval
     */
    public Long getTriggerInterval() {
        return this.triggerInterval;
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

    public static final class Builder {
        private Long id; 
        private String metricKey; 
        private String metricType; 
        private String name; 
        private String triggerAggregate; 
        private Long triggerInterval; 
        private String triggerOperator; 
        private Long triggerThreshold; 

        private Builder() {
        } 

        private Builder(MonitorArmsAlertRule model) {
            this.id = model.id;
            this.metricKey = model.metricKey;
            this.metricType = model.metricType;
            this.name = model.name;
            this.triggerAggregate = model.triggerAggregate;
            this.triggerInterval = model.triggerInterval;
            this.triggerOperator = model.triggerOperator;
            this.triggerThreshold = model.triggerThreshold;
        } 

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * metricKey.
         */
        public Builder metricKey(String metricKey) {
            this.metricKey = metricKey;
            return this;
        }

        /**
         * metricType.
         */
        public Builder metricType(String metricType) {
            this.metricType = metricType;
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
         * triggerAggregate.
         */
        public Builder triggerAggregate(String triggerAggregate) {
            this.triggerAggregate = triggerAggregate;
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

        public MonitorArmsAlertRule build() {
            return new MonitorArmsAlertRule(this);
        } 

    } 

}
