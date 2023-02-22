// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link Schedule} extends {@link TeaModel}
 *
 * <p>Schedule</p>
 */
public class Schedule extends TeaModel {
    @NameInMap("cronExpression")
    private String cronExpression;

    @NameInMap("dayOfWeek")
    private Long dayOfWeek;

    @NameInMap("hour")
    private Long hour;

    @NameInMap("interval")
    private String interval;

    @NameInMap("runImmediately")
    private Boolean runImmediately;

    @NameInMap("type")
    @Validation(required = true)
    private String type;

    private Schedule(Builder builder) {
        this.cronExpression = builder.cronExpression;
        this.dayOfWeek = builder.dayOfWeek;
        this.hour = builder.hour;
        this.interval = builder.interval;
        this.runImmediately = builder.runImmediately;
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
     * @return dayOfWeek
     */
    public Long getDayOfWeek() {
        return this.dayOfWeek;
    }

    /**
     * @return hour
     */
    public Long getHour() {
        return this.hour;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String cronExpression; 
        private Long dayOfWeek; 
        private Long hour; 
        private String interval; 
        private Boolean runImmediately; 
        private String type; 

        /**
         * Cron表达式，最小精度为分钟，24小时制。例如0 0/1 * * *，表示从00:00开始，每隔1小时检查一次。
         */
        public Builder cronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }

        /**
         * dayOfWeek
         */
        public Builder dayOfWeek(Long dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            return this;
        }

        /**
         * 可取值为0~23，分别表示每个小时。
         */
        public Builder hour(Long hour) {
            this.hour = hour;
            return this;
        }

        /**
         * 时间间隔，例如5m、1h。
         */
        public Builder interval(String interval) {
            this.interval = interval;
            return this;
        }

        /**
         * 创建告警监控规则后，是否立即执行。
         */
        public Builder runImmediately(Boolean runImmediately) {
            this.runImmediately = runImmediately;
            return this;
        }

        /**
         * 检查频率类型
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
