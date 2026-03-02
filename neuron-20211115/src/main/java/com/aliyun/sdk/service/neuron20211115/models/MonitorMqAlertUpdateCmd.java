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
 * {@link MonitorMqAlertUpdateCmd} extends {@link TeaModel}
 *
 * <p>MonitorMqAlertUpdateCmd</p>
 */
public class MonitorMqAlertUpdateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("condition")
    private String condition;

    @com.aliyun.core.annotation.NameInMap("id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.NameInMap("monitorMqAlertRules")
    private java.util.List<MonitorMqAlertRule> monitorMqAlertRules;

    @com.aliyun.core.annotation.NameInMap("monitorNotifyStrategy")
    private MonitorNotifyStrategy monitorNotifyStrategy;

    private MonitorMqAlertUpdateCmd(Builder builder) {
        this.condition = builder.condition;
        this.id = builder.id;
        this.monitorMqAlertRules = builder.monitorMqAlertRules;
        this.monitorNotifyStrategy = builder.monitorNotifyStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MonitorMqAlertUpdateCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return condition
     */
    public String getCondition() {
        return this.condition;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return monitorMqAlertRules
     */
    public java.util.List<MonitorMqAlertRule> getMonitorMqAlertRules() {
        return this.monitorMqAlertRules;
    }

    /**
     * @return monitorNotifyStrategy
     */
    public MonitorNotifyStrategy getMonitorNotifyStrategy() {
        return this.monitorNotifyStrategy;
    }

    public static final class Builder {
        private String condition; 
        private Long id; 
        private java.util.List<MonitorMqAlertRule> monitorMqAlertRules; 
        private MonitorNotifyStrategy monitorNotifyStrategy; 

        private Builder() {
        } 

        private Builder(MonitorMqAlertUpdateCmd model) {
            this.condition = model.condition;
            this.id = model.id;
            this.monitorMqAlertRules = model.monitorMqAlertRules;
            this.monitorNotifyStrategy = model.monitorNotifyStrategy;
        } 

        /**
         * condition.
         */
        public Builder condition(String condition) {
            this.condition = condition;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * monitorMqAlertRules.
         */
        public Builder monitorMqAlertRules(java.util.List<MonitorMqAlertRule> monitorMqAlertRules) {
            this.monitorMqAlertRules = monitorMqAlertRules;
            return this;
        }

        /**
         * monitorNotifyStrategy.
         */
        public Builder monitorNotifyStrategy(MonitorNotifyStrategy monitorNotifyStrategy) {
            this.monitorNotifyStrategy = monitorNotifyStrategy;
            return this;
        }

        public MonitorMqAlertUpdateCmd build() {
            return new MonitorMqAlertUpdateCmd(this);
        } 

    } 

}
