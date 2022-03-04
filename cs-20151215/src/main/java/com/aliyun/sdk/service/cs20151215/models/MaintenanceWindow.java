// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MaintenanceWindow} extends {@link TeaModel}
 *
 * <p>MaintenanceWindow</p>
 */
public class MaintenanceWindow extends TeaModel {
    @NameInMap("enable")
    private Boolean enable;

    @NameInMap("maintenance_time")
    private String maintenanceTime;

    @NameInMap("duration")
    private String duration;

    @NameInMap("weekly_period")
    private String weeklyPeriod;

    private MaintenanceWindow(Builder builder) {
        this.enable = builder.enable;
        this.maintenanceTime = builder.maintenanceTime;
        this.duration = builder.duration;
        this.weeklyPeriod = builder.weeklyPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MaintenanceWindow create() {
        return builder().build();
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
     * @return duration
     */
    public String getDuration() {
        return this.duration;
    }

    /**
     * @return weeklyPeriod
     */
    public String getWeeklyPeriod() {
        return this.weeklyPeriod;
    }

    public static final class Builder {
        private Boolean enable; 
        private String maintenanceTime; 
        private String duration; 
        private String weeklyPeriod; 

        /**
         * Specifies whether to enable the maintenance window. Default value: false.
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * The start time of maintenance. Golang standard time format "15:04:05Z".
         */
        public Builder maintenanceTime(String maintenanceTime) {
            this.maintenanceTime = maintenanceTime;
            return this;
        }

        /**
         * The maintenance duration. Valid values: 1 to 24. Unit: hour. Default value: 3h.
         */
        public Builder duration(String duration) {
            this.duration = duration;
            return this;
        }

        /**
         * The maintenance cycle. Valid values: Monday to Sunday. Separate multiple values with commas (,). Default value: Thursday.
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
