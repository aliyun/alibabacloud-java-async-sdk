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
 * {@link MonitorAlertHistory} extends {@link TeaModel}
 *
 * <p>MonitorAlertHistory</p>
 */
public class MonitorAlertHistory extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("eventState")
    private String eventState;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("ruleDesc")
    private String ruleDesc;

    @com.aliyun.core.annotation.NameInMap("ruleName")
    private String ruleName;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.NameInMap("uuid")
    private String uuid;

    private MonitorAlertHistory(Builder builder) {
        this.endTime = builder.endTime;
        this.eventState = builder.eventState;
        this.id = builder.id;
        this.name = builder.name;
        this.ruleDesc = builder.ruleDesc;
        this.ruleName = builder.ruleName;
        this.startTime = builder.startTime;
        this.type = builder.type;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MonitorAlertHistory create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return eventState
     */
    public String getEventState() {
        return this.eventState;
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
     * @return ruleDesc
     */
    public String getRuleDesc() {
        return this.ruleDesc;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder {
        private String endTime; 
        private String eventState; 
        private Long id; 
        private String name; 
        private String ruleDesc; 
        private String ruleName; 
        private String startTime; 
        private String type; 
        private String uuid; 

        private Builder() {
        } 

        private Builder(MonitorAlertHistory model) {
            this.endTime = model.endTime;
            this.eventState = model.eventState;
            this.id = model.id;
            this.name = model.name;
            this.ruleDesc = model.ruleDesc;
            this.ruleName = model.ruleName;
            this.startTime = model.startTime;
            this.type = model.type;
            this.uuid = model.uuid;
        } 

        /**
         * endTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * eventState.
         */
        public Builder eventState(String eventState) {
            this.eventState = eventState;
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
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * ruleDesc.
         */
        public Builder ruleDesc(String ruleDesc) {
            this.ruleDesc = ruleDesc;
            return this;
        }

        /**
         * ruleName.
         */
        public Builder ruleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>日志</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * uuid.
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        public MonitorAlertHistory build() {
            return new MonitorAlertHistory(this);
        } 

    } 

}
