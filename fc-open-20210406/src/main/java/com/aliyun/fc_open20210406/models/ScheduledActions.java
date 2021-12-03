// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ScheduledActions} extends {@link TeaModel}
 *
 * <p>ScheduledActions</p>
 */
public class ScheduledActions extends TeaModel {
    @NameInMap("endTime")
    private String endTime;

    @NameInMap("name")
    private String name;

    @NameInMap("scheduleExpression")
    private String scheduleExpression;

    @NameInMap("startTime")
    private String startTime;

    @NameInMap("target")
    private Long target;


    private ScheduledActions(Builder builder) {
        this.endTime = builder.endTime;
        this.name = builder.name;
        this.scheduleExpression = builder.scheduleExpression;
        this.startTime = builder.startTime;
        this.target = builder.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScheduledActions create() {
        return builder().build();
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

    public static final class Builder {
        private String endTime; 
        private String name; 
        private String scheduleExpression; 
        private String startTime; 
        private Long target; 

        /**
         * <p>endTime</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>name</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>scheduleExpression</p>
         */
        public Builder scheduleExpression(String scheduleExpression) {
            this.scheduleExpression = scheduleExpression;
            return this;
        }

        /**
         * <p>startTime</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>target</p>
         */
        public Builder target(Long target) {
            this.target = target;
            return this;
        }

        public ScheduledActions build() {
            return new ScheduledActions(this);
        } 

    } 

}
