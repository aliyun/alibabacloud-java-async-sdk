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

    @com.aliyun.core.annotation.NameInMap("exclusions")
    private java.util.List<Exclusions> exclusions;

    @com.aliyun.core.annotation.NameInMap("maintenance_time")
    private String maintenanceTime;

    @com.aliyun.core.annotation.NameInMap("recurrence")
    private String recurrence;

    @com.aliyun.core.annotation.NameInMap("weekly_period")
    private String weeklyPeriod;

    private MaintenanceWindow(Builder builder) {
        this.duration = builder.duration;
        this.enable = builder.enable;
        this.exclusions = builder.exclusions;
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

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return exclusions
     */
    public java.util.List<Exclusions> getExclusions() {
        return this.exclusions;
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
        private java.util.List<Exclusions> exclusions; 
        private String maintenanceTime; 
        private String recurrence; 
        private String weeklyPeriod; 

        private Builder() {
        } 

        private Builder(MaintenanceWindow model) {
            this.duration = model.duration;
            this.enable = model.enable;
            this.exclusions = model.exclusions;
            this.maintenanceTime = model.maintenanceTime;
            this.recurrence = model.recurrence;
            this.weeklyPeriod = model.weeklyPeriod;
        } 

        /**
         * <p>The maintenance duration. Valid values: 1 to 24. Unit: hours.</p>
         * <p>Default value: 3h.</p>
         * 
         * <strong>example:</strong>
         * <p>3h</p>
         */
        public Builder duration(String duration) {
            this.duration = duration;
            return this;
        }

        /**
         * <p>Specifies whether to enable the maintenance window. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Enables the maintenance window.</li>
         * <li><code>false</code>: Does not enable the maintenance window.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * <p>The list of exclusions for the maintenance window. A maximum of 10 exclusions are supported. Exclusions take precedence over the maintenance window. If an active exclusion covers an O&amp;M type, the O&amp;M operation is not performed even if the current time is within the maintenance window. If multiple exclusions are active at the same time, the union of the exclusions is applied. The total number of NoOperations and NoUpgrades exclusions cannot exceed 3. Only one-time periods are supported. Periodic configurations are not supported.</p>
         */
        public Builder exclusions(java.util.List<Exclusions> exclusions) {
            this.exclusions = exclusions;
            return this;
        }

        /**
         * <p>The start time of the maintenance window. The time must be in the RFC 3339 standard format.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-15T12:31:00.000+08:00</p>
         */
        public Builder maintenanceTime(String maintenanceTime) {
            this.maintenanceTime = maintenanceTime;
            return this;
        }

        /**
         * <p>The recurrence rule for the maintenance window, defined by using the RFC 5545 Recurrence Rule syntax. Only FREQ=WEEKLY is supported. COUNT and UNTIL are not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>FREQ=WEEKLY;INTERVAL=4;BYDAY=MO,TU</p>
         */
        public Builder recurrence(String recurrence) {
            this.recurrence = recurrence;
            return this;
        }

        /**
         * <p>The weekly maintenance period. Separate multiple values with commas (,). Valid values: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, and Sunday.</p>
         * <p>Default value: <code>Thursday</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Monday,Thursday</p>
         */
        public Builder weeklyPeriod(String weeklyPeriod) {
            this.weeklyPeriod = weeklyPeriod;
            return this;
        }

        public MaintenanceWindow build() {
            return new MaintenanceWindow(this);
        } 

    } 

    /**
     * 
     * {@link MaintenanceWindow} extends {@link TeaModel}
     *
     * <p>MaintenanceWindow</p>
     */
    public static class Exclusions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("end_time")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("start_time")
        private String startTime;

        private Exclusions(Builder builder) {
            this.description = builder.description;
            this.endTime = builder.endTime;
            this.name = builder.name;
            this.scope = builder.scope;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Exclusions create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String description; 
            private String endTime; 
            private String name; 
            private String scope; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(Exclusions model) {
                this.description = model.description;
                this.endTime = model.endTime;
                this.name = model.name;
                this.scope = model.scope;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The description of the exclusion. The description can be up to 128 characters in length and does not support 4-byte characters such as emojis.</p>
             * 
             * <strong>example:</strong>
             * <p>No changes are allowed during the change freeze period</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The end time of the exclusion. The time must be in the RFC 3339 standard format, later than the start_time, and later than the current time. Maximum duration for a single exclusion: 30 days for NoOperations, NoUpgrades, and NoCVEPatch, and 180 days for NoMinorUpgrades.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-15T00:00:00+08:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The name of the exclusion. The name must be 1 to 63 characters in length and can contain digits, underscores (_), and hyphens (-). It must start with an uppercase or lowercase letter, a Chinese character, or a digit. The name must be unique within the same maintenance window. If you do not specify this parameter, a default name in the format of exclusion-{random string} is generated.</p>
             * 
             * <strong>example:</strong>
             * <p>exclusion-holiday</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The scope of the exclusion, which specifies the proactive O&amp;M types that are prohibited during this time period. Valid values (case-sensitive):</p>
             * <ul>
             * <li>NoOperations: Prohibits all proactive O&amp;M operations, including cluster upgrades, component upgrades, CVE patching, and OS image updates.</li>
             * <li>NoUpgrades: Prohibits cluster upgrades and component upgrades, but still allows CVE patching and responses to scheduled ECS events.</li>
             * <li>NoMinorUpgrades: Prohibits only minor version upgrades for clusters, but still allows patch upgrades, component upgrades, and CVE patching.</li>
             * <li>NoCVEPatch: Prohibits automatic CVE patching.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NoOperations</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The start time of the exclusion. The time must be in the RFC 3339 standard format and use the same time zone offset as the end_time and maintenance_time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-01T00:00:00+08:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public Exclusions build() {
                return new Exclusions(this);
            } 

        } 

    }
}
