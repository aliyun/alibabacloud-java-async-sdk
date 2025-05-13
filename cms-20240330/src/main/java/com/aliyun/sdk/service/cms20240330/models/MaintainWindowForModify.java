// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link MaintainWindowForModify} extends {@link TeaModel}
 *
 * <p>MaintainWindowForModify</p>
 */
public class MaintainWindowForModify extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("effectTimeRange")
    private EffectTimeRange effectTimeRange;

    @com.aliyun.core.annotation.NameInMap("effective")
    private String effective;

    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("filterSetting")
    private FilterSetting filterSetting;

    @com.aliyun.core.annotation.NameInMap("maintainWindowName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String maintainWindowName;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    private MaintainWindowForModify(Builder builder) {
        this.description = builder.description;
        this.effectTimeRange = builder.effectTimeRange;
        this.effective = builder.effective;
        this.endTime = builder.endTime;
        this.filterSetting = builder.filterSetting;
        this.maintainWindowName = builder.maintainWindowName;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MaintainWindowForModify create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return effectTimeRange
     */
    public EffectTimeRange getEffectTimeRange() {
        return this.effectTimeRange;
    }

    /**
     * @return effective
     */
    public String getEffective() {
        return this.effective;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return filterSetting
     */
    public FilterSetting getFilterSetting() {
        return this.filterSetting;
    }

    /**
     * @return maintainWindowName
     */
    public String getMaintainWindowName() {
        return this.maintainWindowName;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private String description; 
        private EffectTimeRange effectTimeRange; 
        private String effective; 
        private String endTime; 
        private FilterSetting filterSetting; 
        private String maintainWindowName; 
        private String startTime; 

        private Builder() {
        } 

        private Builder(MaintainWindowForModify model) {
            this.description = model.description;
            this.effectTimeRange = model.effectTimeRange;
            this.effective = model.effective;
            this.endTime = model.endTime;
            this.filterSetting = model.filterSetting;
            this.maintainWindowName = model.maintainWindowName;
            this.startTime = model.startTime;
        } 

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * effectTimeRange.
         */
        public Builder effectTimeRange(EffectTimeRange effectTimeRange) {
            this.effectTimeRange = effectTimeRange;
            return this;
        }

        /**
         * effective.
         */
        public Builder effective(String effective) {
            this.effective = effective;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * filterSetting.
         */
        public Builder filterSetting(FilterSetting filterSetting) {
            this.filterSetting = filterSetting;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder maintainWindowName(String maintainWindowName) {
            this.maintainWindowName = maintainWindowName;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public MaintainWindowForModify build() {
            return new MaintainWindowForModify(this);
        } 

    } 

    /**
     * 
     * {@link MaintainWindowForModify} extends {@link TeaModel}
     *
     * <p>MaintainWindowForModify</p>
     */
    public static class EffectTimeRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dayInWeek")
        private java.util.List<Integer> dayInWeek;

        @com.aliyun.core.annotation.NameInMap("endTimeInMinute")
        @com.aliyun.core.annotation.Validation(maximum = 1439)
        private Integer endTimeInMinute;

        @com.aliyun.core.annotation.NameInMap("startTimeInMinute")
        @com.aliyun.core.annotation.Validation(maximum = 1438)
        private Integer startTimeInMinute;

        @com.aliyun.core.annotation.NameInMap("timeZone")
        private String timeZone;

        private EffectTimeRange(Builder builder) {
            this.dayInWeek = builder.dayInWeek;
            this.endTimeInMinute = builder.endTimeInMinute;
            this.startTimeInMinute = builder.startTimeInMinute;
            this.timeZone = builder.timeZone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EffectTimeRange create() {
            return builder().build();
        }

        /**
         * @return dayInWeek
         */
        public java.util.List<Integer> getDayInWeek() {
            return this.dayInWeek;
        }

        /**
         * @return endTimeInMinute
         */
        public Integer getEndTimeInMinute() {
            return this.endTimeInMinute;
        }

        /**
         * @return startTimeInMinute
         */
        public Integer getStartTimeInMinute() {
            return this.startTimeInMinute;
        }

        /**
         * @return timeZone
         */
        public String getTimeZone() {
            return this.timeZone;
        }

        public static final class Builder {
            private java.util.List<Integer> dayInWeek; 
            private Integer endTimeInMinute; 
            private Integer startTimeInMinute; 
            private String timeZone; 

            private Builder() {
            } 

            private Builder(EffectTimeRange model) {
                this.dayInWeek = model.dayInWeek;
                this.endTimeInMinute = model.endTimeInMinute;
                this.startTimeInMinute = model.startTimeInMinute;
                this.timeZone = model.timeZone;
            } 

            /**
             * dayInWeek.
             */
            public Builder dayInWeek(java.util.List<Integer> dayInWeek) {
                this.dayInWeek = dayInWeek;
                return this;
            }

            /**
             * endTimeInMinute.
             */
            public Builder endTimeInMinute(Integer endTimeInMinute) {
                this.endTimeInMinute = endTimeInMinute;
                return this;
            }

            /**
             * startTimeInMinute.
             */
            public Builder startTimeInMinute(Integer startTimeInMinute) {
                this.startTimeInMinute = startTimeInMinute;
                return this;
            }

            /**
             * timeZone.
             */
            public Builder timeZone(String timeZone) {
                this.timeZone = timeZone;
                return this;
            }

            public EffectTimeRange build() {
                return new EffectTimeRange(this);
            } 

        } 

    }
}
