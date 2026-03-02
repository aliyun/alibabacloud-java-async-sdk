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
 * {@link MonitorSlsAlert} extends {@link TeaModel}
 *
 * <p>MonitorSlsAlert</p>
 */
public class MonitorSlsAlert extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("condition")
    private String condition;

    @com.aliyun.core.annotation.NameInMap("env")
    private String env;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("monitorNotifyStrategy")
    @com.aliyun.core.annotation.Validation(required = true)
    private MonitorNotifyStrategy monitorNotifyStrategy;

    @com.aliyun.core.annotation.NameInMap("monitorSlsAlertRules")
    private java.util.List<MonitorSlsAlertRule> monitorSlsAlertRules;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("pbcId")
    private String pbcId;

    @com.aliyun.core.annotation.NameInMap("remark")
    private String remark;

    @com.aliyun.core.annotation.NameInMap("serviceGroupId")
    private String serviceGroupId;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private MonitorSlsAlert(Builder builder) {
        this.condition = builder.condition;
        this.env = builder.env;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.monitorNotifyStrategy = builder.monitorNotifyStrategy;
        this.monitorSlsAlertRules = builder.monitorSlsAlertRules;
        this.name = builder.name;
        this.pbcId = builder.pbcId;
        this.remark = builder.remark;
        this.serviceGroupId = builder.serviceGroupId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MonitorSlsAlert create() {
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
     * @return env
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
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

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pbcId
     */
    public String getPbcId() {
        return this.pbcId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return serviceGroupId
     */
    public String getServiceGroupId() {
        return this.serviceGroupId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String condition; 
        private String env; 
        private String gmtCreate; 
        private String gmtModified; 
        private Long id; 
        private MonitorNotifyStrategy monitorNotifyStrategy; 
        private java.util.List<MonitorSlsAlertRule> monitorSlsAlertRules; 
        private String name; 
        private String pbcId; 
        private String remark; 
        private String serviceGroupId; 
        private String type; 

        private Builder() {
        } 

        private Builder(MonitorSlsAlert model) {
            this.condition = model.condition;
            this.env = model.env;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.id = model.id;
            this.monitorNotifyStrategy = model.monitorNotifyStrategy;
            this.monitorSlsAlertRules = model.monitorSlsAlertRules;
            this.name = model.name;
            this.pbcId = model.pbcId;
            this.remark = model.remark;
            this.serviceGroupId = model.serviceGroupId;
            this.type = model.type;
        } 

        /**
         * condition.
         */
        public Builder condition(String condition) {
            this.condition = condition;
            return this;
        }

        /**
         * env.
         */
        public Builder env(String env) {
            this.env = env;
            return this;
        }

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * gmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * pbcId.
         */
        public Builder pbcId(String pbcId) {
            this.pbcId = pbcId;
            return this;
        }

        /**
         * remark.
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        /**
         * serviceGroupId.
         */
        public Builder serviceGroupId(String serviceGroupId) {
            this.serviceGroupId = serviceGroupId;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public MonitorSlsAlert build() {
            return new MonitorSlsAlert(this);
        } 

    } 

}
