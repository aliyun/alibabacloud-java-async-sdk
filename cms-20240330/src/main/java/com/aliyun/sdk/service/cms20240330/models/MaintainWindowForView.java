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
 * {@link MaintainWindowForView} extends {@link TeaModel}
 *
 * <p>MaintainWindowForView</p>
 */
public class MaintainWindowForView extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("effectTimeRange")
    private EffectTimeRange effectTimeRange;

    @com.aliyun.core.annotation.NameInMap("effective")
    private String effective;

    @com.aliyun.core.annotation.NameInMap("enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("filterSetting")
    private FilterSetting filterSetting;

    @com.aliyun.core.annotation.NameInMap("maintainWindowId")
    private String maintainWindowId;

    @com.aliyun.core.annotation.NameInMap("maintainWindowName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String maintainWindowName;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private MaintainWindowForView(Builder builder) {
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.effectTimeRange = builder.effectTimeRange;
        this.effective = builder.effective;
        this.enable = builder.enable;
        this.endTime = builder.endTime;
        this.filterSetting = builder.filterSetting;
        this.maintainWindowId = builder.maintainWindowId;
        this.maintainWindowName = builder.maintainWindowName;
        this.startTime = builder.startTime;
        this.updateTime = builder.updateTime;
        this.userId = builder.userId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MaintainWindowForView create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
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
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
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
     * @return maintainWindowId
     */
    public String getMaintainWindowId() {
        return this.maintainWindowId;
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

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private String createTime; 
        private String description; 
        private EffectTimeRange effectTimeRange; 
        private String effective; 
        private Boolean enable; 
        private String endTime; 
        private FilterSetting filterSetting; 
        private String maintainWindowId; 
        private String maintainWindowName; 
        private String startTime; 
        private String updateTime; 
        private String userId; 
        private String workspace; 

        private Builder() {
        } 

        private Builder(MaintainWindowForView model) {
            this.createTime = model.createTime;
            this.description = model.description;
            this.effectTimeRange = model.effectTimeRange;
            this.effective = model.effective;
            this.enable = model.enable;
            this.endTime = model.endTime;
            this.filterSetting = model.filterSetting;
            this.maintainWindowId = model.maintainWindowId;
            this.maintainWindowName = model.maintainWindowName;
            this.startTime = model.startTime;
            this.updateTime = model.updateTime;
            this.userId = model.userId;
            this.workspace = model.workspace;
        } 

        /**
         * createTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
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
         * enable.
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
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
         * maintainWindowId.
         */
        public Builder maintainWindowId(String maintainWindowId) {
            this.maintainWindowId = maintainWindowId;
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

        /**
         * updateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public MaintainWindowForView build() {
            return new MaintainWindowForView(this);
        } 

    } 

    /**
     * 
     * {@link MaintainWindowForView} extends {@link TeaModel}
     *
     * <p>MaintainWindowForView</p>
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
