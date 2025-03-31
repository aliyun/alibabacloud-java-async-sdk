// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link ScheduledAction} extends {@link TeaModel}
 *
 * <p>ScheduledAction</p>
 */
public class ScheduledAction extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("scheduleExpression")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scheduleExpression;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("target")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long target;

    @com.aliyun.core.annotation.NameInMap("timeZone")
    private String timeZone;

    private ScheduledAction(Builder builder) {
        this.endTime = builder.endTime;
        this.name = builder.name;
        this.scheduleExpression = builder.scheduleExpression;
        this.startTime = builder.startTime;
        this.target = builder.target;
        this.timeZone = builder.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScheduledAction create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return scheduleExpression
     */
    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return target
     */
    public Long getTarget() {
        return this.target;
    }

    /**
     * @return timeZone
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    public static final class Builder {
        private String endTime; 
        private String name; 
        private String scheduleExpression; 
        private String startTime; 
        private Long target; 
        private String timeZone; 

        private Builder() {
        } 

        private Builder(ScheduledAction model) {
            this.endTime = model.endTime;
            this.name = model.name;
            this.scheduleExpression = model.scheduleExpression;
            this.startTime = model.startTime;
            this.target = model.target;
            this.timeZone = model.timeZone;
        } 

        /**
         * endTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_1</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cron(0 0 22 * * *)</p>
         */
        public Builder scheduleExpression(String scheduleExpression) {
            this.scheduleExpression = scheduleExpression;
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
         * <p>50</p>
         */
        public Builder target(Long target) {
            this.target = target;
            return this;
        }

        /**
         * timeZone.
         */
        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public ScheduledAction build() {
            return new ScheduledAction(this);
        } 

    } 

}
