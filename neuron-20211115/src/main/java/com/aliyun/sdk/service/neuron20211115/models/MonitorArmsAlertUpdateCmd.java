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
 * {@link MonitorArmsAlertUpdateCmd} extends {@link TeaModel}
 *
 * <p>MonitorArmsAlertUpdateCmd</p>
 */
public class MonitorArmsAlertUpdateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("condition")
    private String condition;

    @com.aliyun.core.annotation.NameInMap("id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.NameInMap("monitorArmsAlertRules")
    private java.util.List<MonitorArmsAlertRule> monitorArmsAlertRules;

    @com.aliyun.core.annotation.NameInMap("monitorNotifyStrategy")
    private MonitorNotifyStrategy monitorNotifyStrategy;

    private MonitorArmsAlertUpdateCmd(Builder builder) {
        this.condition = builder.condition;
        this.id = builder.id;
        this.monitorArmsAlertRules = builder.monitorArmsAlertRules;
        this.monitorNotifyStrategy = builder.monitorNotifyStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MonitorArmsAlertUpdateCmd create() {
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
     * @return monitorArmsAlertRules
     */
    public java.util.List<MonitorArmsAlertRule> getMonitorArmsAlertRules() {
        return this.monitorArmsAlertRules;
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
        private java.util.List<MonitorArmsAlertRule> monitorArmsAlertRules; 
        private MonitorNotifyStrategy monitorNotifyStrategy; 

        private Builder() {
        } 

        private Builder(MonitorArmsAlertUpdateCmd model) {
            this.condition = model.condition;
            this.id = model.id;
            this.monitorArmsAlertRules = model.monitorArmsAlertRules;
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
         * monitorArmsAlertRules.
         */
        public Builder monitorArmsAlertRules(java.util.List<MonitorArmsAlertRule> monitorArmsAlertRules) {
            this.monitorArmsAlertRules = monitorArmsAlertRules;
            return this;
        }

        /**
         * monitorNotifyStrategy.
         */
        public Builder monitorNotifyStrategy(MonitorNotifyStrategy monitorNotifyStrategy) {
            this.monitorNotifyStrategy = monitorNotifyStrategy;
            return this;
        }

        public MonitorArmsAlertUpdateCmd build() {
            return new MonitorArmsAlertUpdateCmd(this);
        } 

    } 

}
