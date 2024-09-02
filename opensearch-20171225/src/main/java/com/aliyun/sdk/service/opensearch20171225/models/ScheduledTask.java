// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScheduledTask} extends {@link TeaModel}
 *
 * <p>ScheduledTask</p>
 */
public class ScheduledTask extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("autoSwitch")
    private Boolean autoSwitch;

    @com.aliyun.core.annotation.NameInMap("cron")
    private String cron;

    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("filter")
    private Filter filter;

    @com.aliyun.core.annotation.NameInMap("forkedAppId")
    private String forkedAppId;

    @com.aliyun.core.annotation.NameInMap("permanent")
    private Boolean permanent;

    @com.aliyun.core.annotation.NameInMap("runNow")
    private Boolean runNow;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    private ScheduledTask(Builder builder) {
        this.autoSwitch = builder.autoSwitch;
        this.cron = builder.cron;
        this.enabled = builder.enabled;
        this.filter = builder.filter;
        this.forkedAppId = builder.forkedAppId;
        this.permanent = builder.permanent;
        this.runNow = builder.runNow;
        this.type = builder.type;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScheduledTask create() {
        return builder().build();
    }

    /**
     * @return autoSwitch
     */
    public Boolean getAutoSwitch() {
        return this.autoSwitch;
    }

    /**
     * @return cron
     */
    public String getCron() {
        return this.cron;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return filter
     */
    public Filter getFilter() {
        return this.filter;
    }

    /**
     * @return forkedAppId
     */
    public String getForkedAppId() {
        return this.forkedAppId;
    }

    /**
     * @return permanent
     */
    public Boolean getPermanent() {
        return this.permanent;
    }

    /**
     * @return runNow
     */
    public Boolean getRunNow() {
        return this.runNow;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private Boolean autoSwitch; 
        private String cron; 
        private Boolean enabled; 
        private Filter filter; 
        private String forkedAppId; 
        private Boolean permanent; 
        private Boolean runNow; 
        private String type; 
        private String version; 

        /**
         * autoSwitch.
         */
        public Builder autoSwitch(Boolean autoSwitch) {
            this.autoSwitch = autoSwitch;
            return this;
        }

        /**
         * cron.
         */
        public Builder cron(String cron) {
            this.cron = cron;
            return this;
        }

        /**
         * enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * filter.
         */
        public Builder filter(Filter filter) {
            this.filter = filter;
            return this;
        }

        /**
         * forkedAppId.
         */
        public Builder forkedAppId(String forkedAppId) {
            this.forkedAppId = forkedAppId;
            return this;
        }

        /**
         * permanent.
         */
        public Builder permanent(Boolean permanent) {
            this.permanent = permanent;
            return this;
        }

        /**
         * runNow.
         */
        public Builder runNow(Boolean runNow) {
            this.runNow = runNow;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public ScheduledTask build() {
            return new ScheduledTask(this);
        } 

    } 

    public static class Filter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("days")
        private Integer days;

        @com.aliyun.core.annotation.NameInMap("expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("field")
        private String field;

        @com.aliyun.core.annotation.NameInMap("unit")
        private String unit;

        private Filter(Builder builder) {
            this.days = builder.days;
            this.expression = builder.expression;
            this.field = builder.field;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
            return builder().build();
        }

        /**
         * @return days
         */
        public Integer getDays() {
            return this.days;
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        /**
         * @return field
         */
        public String getField() {
            return this.field;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private Integer days; 
            private String expression; 
            private String field; 
            private String unit; 

            /**
             * days.
             */
            public Builder days(Integer days) {
                this.days = days;
                return this;
            }

            /**
             * expression.
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * field.
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
}
