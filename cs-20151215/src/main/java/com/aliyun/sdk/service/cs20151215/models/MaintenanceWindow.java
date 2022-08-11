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
    @NameInMap("duration")
    private String duration;

    @NameInMap("enable")
    private Boolean enable;

    @NameInMap("maintenance_time")
    private String maintenanceTime;

    @NameInMap("weekly_period")
    private String weeklyPeriod;

    private MaintenanceWindow(Builder builder) {
        this.duration = builder.duration;
        this.enable = builder.enable;
        this.maintenanceTime = builder.maintenanceTime;
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
     * @return weeklyPeriod
     */
    public String getWeeklyPeriod() {
        return this.weeklyPeriod;
    }

    public static final class Builder {
        private String duration; 
        private Boolean enable; 
        private String maintenanceTime; 
        private String weeklyPeriod; 

        /**
         * 维护时长。取值范围1～24，单位为小时。 默认值：3h。
         */
        public Builder duration(String duration) {
            this.duration = duration;
            return this;
        }

        /**
         * 是否开启维护窗口。默认值false。
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * 维护起始时间。Golang标准时间格式"15:04:05Z"。
         */
        public Builder maintenanceTime(String maintenanceTime) {
            this.maintenanceTime = maintenanceTime;
            return this;
        }

        /**
         * 维护周期。取值范围为:Monday~Sunday，多个值用逗号分隔。 默认值：Thursday。
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
