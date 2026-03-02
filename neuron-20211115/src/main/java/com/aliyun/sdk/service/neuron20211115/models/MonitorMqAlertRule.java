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
 * {@link MonitorMqAlertRule} extends {@link TeaModel}
 *
 * <p>MonitorMqAlertRule</p>
 */
public class MonitorMqAlertRule extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("metricDimension")
    private String metricDimension;

    @com.aliyun.core.annotation.NameInMap("metricKey")
    private String metricKey;

    @com.aliyun.core.annotation.NameInMap("metricType")
    private String metricType;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("triggerInterval")
    private Long triggerInterval;

    @com.aliyun.core.annotation.NameInMap("triggerOperator")
    private String triggerOperator;

    @com.aliyun.core.annotation.NameInMap("triggerThreshold")
    private Long triggerThreshold;

    private MonitorMqAlertRule(Builder builder) {
        this.id = builder.id;
        this.metricDimension = builder.metricDimension;
        this.metricKey = builder.metricKey;
        this.metricType = builder.metricType;
        this.name = builder.name;
        this.triggerInterval = builder.triggerInterval;
        this.triggerOperator = builder.triggerOperator;
        this.triggerThreshold = builder.triggerThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MonitorMqAlertRule create() {
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
     * @return metricDimension
     */
    public String getMetricDimension() {
        return this.metricDimension;
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
        private String metricDimension; 
        private String metricKey; 
        private String metricType; 
        private String name; 
        private Long triggerInterval; 
        private String triggerOperator; 
        private Long triggerThreshold; 

        private Builder() {
        } 

        private Builder(MonitorMqAlertRule model) {
            this.id = model.id;
            this.metricDimension = model.metricDimension;
            this.metricKey = model.metricKey;
            this.metricType = model.metricType;
            this.name = model.name;
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
         * metricDimension.
         */
        public Builder metricDimension(String metricDimension) {
            this.metricDimension = metricDimension;
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

        public MonitorMqAlertRule build() {
            return new MonitorMqAlertRule(this);
        } 

    } 

}
