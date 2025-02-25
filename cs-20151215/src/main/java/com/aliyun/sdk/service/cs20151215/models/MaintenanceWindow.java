// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link MaintenanceWindow} extends {@link TeaModel}
 *
 * <p>MaintenanceWindow</p>
 */
public class MaintenanceWindow extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("duration")
    private String duration;

    @com.aliyun.core.annotation.NameInMap("enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("maintenance_time")
    private String maintenanceTime;

    @com.aliyun.core.annotation.NameInMap("recurrence")
    private String recurrence;

    @com.aliyun.core.annotation.NameInMap("weekly_period")
    private String weeklyPeriod;

    private MaintenanceWindow(Builder builder) {
        this.duration = builder.duration;
        this.enable = builder.enable;
        this.maintenanceTime = builder.maintenanceTime;
        this.recurrence = builder.recurrence;
        this.weeklyPeriod = builder.weeklyPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MaintenanceWindow create() {
        return builder().build();
    }

    /**
     * @return duration
     */
    public String getDuration() {
        return this.duration;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return maintenanceTime
     */
    public String getMaintenanceTime() {
        return this.maintenanceTime;
    }

    /**
     * @return recurrence
     */
    public String getRecurrence() {
        return this.recurrence;
    }

    /**
     * @return weeklyPeriod
     */
    public String getWeeklyPeriod() {
        return this.weeklyPeriod;
    }

    public static final class Builder {
        private String duration; 
        private Boolean enable; 
        private String maintenanceTime; 
        private String recurrence; 
        private String weeklyPeriod; 

        /**
         * duration.
         */
        public Builder duration(String duration) {
            this.duration = duration;
            return this;
        }

        /**
         * enable.
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * maintenance_time.
         */
        public Builder maintenanceTime(String maintenanceTime) {
            this.maintenanceTime = maintenanceTime;
            return this;
        }

        /**
         * recurrence.
         */
        public Builder recurrence(String recurrence) {
            this.recurrence = recurrence;
            return this;
        }

        /**
         * weekly_period.
         */
        public Builder weeklyPeriod(String weeklyPeriod) {
            this.weeklyPeriod = weeklyPeriod;
            return this;
        }

        public MaintenanceWindow build() {
            return new MaintenanceWindow(this);
        } 

    } 

}
