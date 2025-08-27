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
 * {@link ScheduledPolicy} extends {@link TeaModel}
 *
 * <p>ScheduledPolicy</p>
 */
public class ScheduledPolicy extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("scheduleExpression")
    private String scheduleExpression;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("target")
    private Long target;

    @com.aliyun.core.annotation.NameInMap("timeZone")
    private String timeZone;

    private ScheduledPolicy(Builder builder) {
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

    public static ScheduledPolicy create() {
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

        private Builder(ScheduledPolicy model) {
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
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * scheduleExpression.
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
         * target.
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

        public ScheduledPolicy build() {
            return new ScheduledPolicy(this);
        } 

    } 

}
