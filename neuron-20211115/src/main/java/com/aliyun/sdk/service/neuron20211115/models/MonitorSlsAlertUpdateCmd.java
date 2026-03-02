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
 * {@link MonitorSlsAlertUpdateCmd} extends {@link TeaModel}
 *
 * <p>MonitorSlsAlertUpdateCmd</p>
 */
public class MonitorSlsAlertUpdateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("condition")
    private String condition;

    @com.aliyun.core.annotation.NameInMap("id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.NameInMap("monitorNotifyStrategy")
    private MonitorNotifyStrategy monitorNotifyStrategy;

    @com.aliyun.core.annotation.NameInMap("monitorSlsAlertRules")
    private java.util.List<MonitorSlsAlertRule> monitorSlsAlertRules;

    private MonitorSlsAlertUpdateCmd(Builder builder) {
        this.condition = builder.condition;
        this.id = builder.id;
        this.monitorNotifyStrategy = builder.monitorNotifyStrategy;
        this.monitorSlsAlertRules = builder.monitorSlsAlertRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MonitorSlsAlertUpdateCmd create() {
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
     * @return monitorNotifyStrategy
     */
    public MonitorNotifyStrategy getMonitorNotifyStrategy() {
        return this.monitorNotifyStrategy;
    }

    /**
     * @return monitorSlsAlertRules
     */
    public java.util.List<MonitorSlsAlertRule> getMonitorSlsAlertRules() {
        return this.monitorSlsAlertRules;
    }

    public static final class Builder {
        private String condition; 
        private Long id; 
        private MonitorNotifyStrategy monitorNotifyStrategy; 
        private java.util.List<MonitorSlsAlertRule> monitorSlsAlertRules; 

        private Builder() {
        } 

        private Builder(MonitorSlsAlertUpdateCmd model) {
            this.condition = model.condition;
            this.id = model.id;
            this.monitorNotifyStrategy = model.monitorNotifyStrategy;
            this.monitorSlsAlertRules = model.monitorSlsAlertRules;
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
         * monitorNotifyStrategy.
         */
        public Builder monitorNotifyStrategy(MonitorNotifyStrategy monitorNotifyStrategy) {
            this.monitorNotifyStrategy = monitorNotifyStrategy;
            return this;
        }

        /**
         * monitorSlsAlertRules.
         */
        public Builder monitorSlsAlertRules(java.util.List<MonitorSlsAlertRule> monitorSlsAlertRules) {
            this.monitorSlsAlertRules = monitorSlsAlertRules;
            return this;
        }

        public MonitorSlsAlertUpdateCmd build() {
            return new MonitorSlsAlertUpdateCmd(this);
        } 

    } 

}
