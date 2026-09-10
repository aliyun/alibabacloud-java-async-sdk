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
 * {@link EffectTimeRange} extends {@link TeaModel}
 *
 * <p>EffectTimeRange</p>
 */
public class EffectTimeRange extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("dayInWeek")
    private java.util.List<Integer> dayInWeek;

    @com.aliyun.core.annotation.NameInMap("endTimeInMinute")
    private Integer endTimeInMinute;

    @com.aliyun.core.annotation.NameInMap("startTimeInMinute")
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

    public Builder toBuilder() {
        return new Builder(this);
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
         * <p>The values 0 to 6 indicate Sunday to Saturday.</p>
         */
        public Builder dayInWeek(java.util.List<Integer> dayInWeek) {
            this.dayInWeek = dayInWeek;
            return this;
        }

        /**
         * <p>The end time in minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        public Builder endTimeInMinute(Integer endTimeInMinute) {
            this.endTimeInMinute = endTimeInMinute;
            return this;
        }

        /**
         * <p>The start time in minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>360</p>
         */
        public Builder startTimeInMinute(Integer startTimeInMinute) {
            this.startTimeInMinute = startTimeInMinute;
            return this;
        }

        /**
         * <p>The time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;Asia/Shanghai&quot;</p>
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
