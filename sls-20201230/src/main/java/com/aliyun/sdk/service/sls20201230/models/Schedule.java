// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link Schedule} extends {@link TeaModel}
 *
 * <p>Schedule</p>
 */
public class Schedule extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cronExpression")
    private String cronExpression;

    @com.aliyun.core.annotation.NameInMap("delay")
    private Integer delay;

    @com.aliyun.core.annotation.NameInMap("interval")
    private String interval;

    @com.aliyun.core.annotation.NameInMap("runImmediately")
    private Boolean runImmediately;

    @com.aliyun.core.annotation.NameInMap("timeZone")
    private String timeZone;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private Schedule(Builder builder) {
        this.cronExpression = builder.cronExpression;
        this.delay = builder.delay;
        this.interval = builder.interval;
        this.runImmediately = builder.runImmediately;
        this.timeZone = builder.timeZone;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Schedule create() {
        return builder().build();
    }

    /**
     * @return cronExpression
     */
    public String getCronExpression() {
        return this.cronExpression;
    }

    /**
     * @return delay
     */
    public Integer getDelay() {
        return this.delay;
    }

    /**
     * @return interval
     */
    public String getInterval() {
        return this.interval;
    }

    /**
     * @return runImmediately
     */
    public Boolean getRunImmediately() {
        return this.runImmediately;
    }

    /**
     * @return timeZone
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String cronExpression; 
        private Integer delay; 
        private String interval; 
        private Boolean runImmediately; 
        private String timeZone; 
        private String type; 

        /**
         * cronExpression.
         */
        public Builder cronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }

        /**
         * delay.
         */
        public Builder delay(Integer delay) {
            this.delay = delay;
            return this;
        }

        /**
         * interval.
         */
        public Builder interval(String interval) {
            this.interval = interval;
            return this;
        }

        /**
         * runImmediately.
         */
        public Builder runImmediately(Boolean runImmediately) {
            this.runImmediately = runImmediately;
            return this;
        }

        /**
         * timeZone.
         */
        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FixedRate</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Schedule build() {
            return new Schedule(this);
        } 

    } 

}
