// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link NotifyStrategyForModify} extends {@link TeaModel}
 *
 * <p>NotifyStrategyForModify</p>
 */
public class NotifyStrategyForModify extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("customTemplateEntries")
    private java.util.List < CustomTemplateEntries> customTemplateEntries;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("groupingSetting")
    @com.aliyun.core.annotation.Validation(required = true)
    private GroupingSetting groupingSetting;

    @com.aliyun.core.annotation.NameInMap("ignoreRestoredNotification")
    private Boolean ignoreRestoredNotification;

    @com.aliyun.core.annotation.NameInMap("notifyStrategyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String notifyStrategyName;

    @com.aliyun.core.annotation.NameInMap("routes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Routes> routes;

    private NotifyStrategyForModify(Builder builder) {
        this.customTemplateEntries = builder.customTemplateEntries;
        this.description = builder.description;
        this.groupingSetting = builder.groupingSetting;
        this.ignoreRestoredNotification = builder.ignoreRestoredNotification;
        this.notifyStrategyName = builder.notifyStrategyName;
        this.routes = builder.routes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NotifyStrategyForModify create() {
        return builder().build();
    }

    /**
     * @return customTemplateEntries
     */
    public java.util.List < CustomTemplateEntries> getCustomTemplateEntries() {
        return this.customTemplateEntries;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return groupingSetting
     */
    public GroupingSetting getGroupingSetting() {
        return this.groupingSetting;
    }

    /**
     * @return ignoreRestoredNotification
     */
    public Boolean getIgnoreRestoredNotification() {
        return this.ignoreRestoredNotification;
    }

    /**
     * @return notifyStrategyName
     */
    public String getNotifyStrategyName() {
        return this.notifyStrategyName;
    }

    /**
     * @return routes
     */
    public java.util.List < Routes> getRoutes() {
        return this.routes;
    }

    public static final class Builder {
        private java.util.List < CustomTemplateEntries> customTemplateEntries; 
        private String description; 
        private GroupingSetting groupingSetting; 
        private Boolean ignoreRestoredNotification; 
        private String notifyStrategyName; 
        private java.util.List < Routes> routes; 

        /**
         * customTemplateEntries.
         */
        public Builder customTemplateEntries(java.util.List < CustomTemplateEntries> customTemplateEntries) {
            this.customTemplateEntries = customTemplateEntries;
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
         * <p>This parameter is required.</p>
         */
        public Builder groupingSetting(GroupingSetting groupingSetting) {
            this.groupingSetting = groupingSetting;
            return this;
        }

        /**
         * ignoreRestoredNotification.
         */
        public Builder ignoreRestoredNotification(Boolean ignoreRestoredNotification) {
            this.ignoreRestoredNotification = ignoreRestoredNotification;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder notifyStrategyName(String notifyStrategyName) {
            this.notifyStrategyName = notifyStrategyName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder routes(java.util.List < Routes> routes) {
            this.routes = routes;
            return this;
        }

        public NotifyStrategyForModify build() {
            return new NotifyStrategyForModify(this);
        } 

    } 

    /**
     * 
     * {@link NotifyStrategyForModify} extends {@link TeaModel}
     *
     * <p>NotifyStrategyForModify</p>
     */
    public static class CustomTemplateEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("targetType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("templateUuid")
        @com.aliyun.core.annotation.Validation(required = true)
        private String templateUuid;

        private CustomTemplateEntries(Builder builder) {
            this.targetType = builder.targetType;
            this.templateUuid = builder.templateUuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomTemplateEntries create() {
            return builder().build();
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return templateUuid
         */
        public String getTemplateUuid() {
            return this.templateUuid;
        }

        public static final class Builder {
            private String targetType; 
            private String templateUuid; 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder templateUuid(String templateUuid) {
                this.templateUuid = templateUuid;
                return this;
            }

            public CustomTemplateEntries build() {
                return new CustomTemplateEntries(this);
            } 

        } 

    }
    /**
     * 
     * {@link NotifyStrategyForModify} extends {@link TeaModel}
     *
     * <p>NotifyStrategyForModify</p>
     */
    public static class GroupingSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("groupingKeys")
        private java.util.List < String > groupingKeys;

        @com.aliyun.core.annotation.NameInMap("periodMin")
        private Integer periodMin;

        @com.aliyun.core.annotation.NameInMap("silenceSec")
        private Integer silenceSec;

        @com.aliyun.core.annotation.NameInMap("times")
        private Integer times;

        private GroupingSetting(Builder builder) {
            this.groupingKeys = builder.groupingKeys;
            this.periodMin = builder.periodMin;
            this.silenceSec = builder.silenceSec;
            this.times = builder.times;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupingSetting create() {
            return builder().build();
        }

        /**
         * @return groupingKeys
         */
        public java.util.List < String > getGroupingKeys() {
            return this.groupingKeys;
        }

        /**
         * @return periodMin
         */
        public Integer getPeriodMin() {
            return this.periodMin;
        }

        /**
         * @return silenceSec
         */
        public Integer getSilenceSec() {
            return this.silenceSec;
        }

        /**
         * @return times
         */
        public Integer getTimes() {
            return this.times;
        }

        public static final class Builder {
            private java.util.List < String > groupingKeys; 
            private Integer periodMin; 
            private Integer silenceSec; 
            private Integer times; 

            /**
             * groupingKeys.
             */
            public Builder groupingKeys(java.util.List < String > groupingKeys) {
                this.groupingKeys = groupingKeys;
                return this;
            }

            /**
             * periodMin.
             */
            public Builder periodMin(Integer periodMin) {
                this.periodMin = periodMin;
                return this;
            }

            /**
             * silenceSec.
             */
            public Builder silenceSec(Integer silenceSec) {
                this.silenceSec = silenceSec;
                return this;
            }

            /**
             * times.
             */
            public Builder times(Integer times) {
                this.times = times;
                return this;
            }

            public GroupingSetting build() {
                return new GroupingSetting(this);
            } 

        } 

    }
    /**
     * 
     * {@link NotifyStrategyForModify} extends {@link TeaModel}
     *
     * <p>NotifyStrategyForModify</p>
     */
    public static class Channels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("channelType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String channelType;

        @com.aliyun.core.annotation.NameInMap("enabledSubChannels")
        private java.util.List < String > enabledSubChannels;

        @com.aliyun.core.annotation.NameInMap("receivers")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < String > receivers;

        private Channels(Builder builder) {
            this.channelType = builder.channelType;
            this.enabledSubChannels = builder.enabledSubChannels;
            this.receivers = builder.receivers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Channels create() {
            return builder().build();
        }

        /**
         * @return channelType
         */
        public String getChannelType() {
            return this.channelType;
        }

        /**
         * @return enabledSubChannels
         */
        public java.util.List < String > getEnabledSubChannels() {
            return this.enabledSubChannels;
        }

        /**
         * @return receivers
         */
        public java.util.List < String > getReceivers() {
            return this.receivers;
        }

        public static final class Builder {
            private String channelType; 
            private java.util.List < String > enabledSubChannels; 
            private java.util.List < String > receivers; 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder channelType(String channelType) {
                this.channelType = channelType;
                return this;
            }

            /**
             * enabledSubChannels.
             */
            public Builder enabledSubChannels(java.util.List < String > enabledSubChannels) {
                this.enabledSubChannels = enabledSubChannels;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder receivers(java.util.List < String > receivers) {
                this.receivers = receivers;
                return this;
            }

            public Channels build() {
                return new Channels(this);
            } 

        } 

    }
    /**
     * 
     * {@link NotifyStrategyForModify} extends {@link TeaModel}
     *
     * <p>NotifyStrategyForModify</p>
     */
    public static class EffectTimeRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dayInWeek")
        private java.util.List < Integer > dayInWeek;

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
        public java.util.List < Integer > getDayInWeek() {
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
            private java.util.List < Integer > dayInWeek; 
            private Integer endTimeInMinute; 
            private Integer startTimeInMinute; 
            private String timeZone; 

            /**
             * dayInWeek.
             */
            public Builder dayInWeek(java.util.List < Integer > dayInWeek) {
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
    /**
     * 
     * {@link NotifyStrategyForModify} extends {@link TeaModel}
     *
     * <p>NotifyStrategyForModify</p>
     */
    public static class Routes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("channels")
        private java.util.List < Channels> channels;

        @com.aliyun.core.annotation.NameInMap("effectTimeRange")
        private EffectTimeRange effectTimeRange;

        @com.aliyun.core.annotation.NameInMap("filterSetting")
        private FilterSetting filterSetting;

        @com.aliyun.core.annotation.NameInMap("severities")
        private java.util.List < String > severities;

        private Routes(Builder builder) {
            this.channels = builder.channels;
            this.effectTimeRange = builder.effectTimeRange;
            this.filterSetting = builder.filterSetting;
            this.severities = builder.severities;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Routes create() {
            return builder().build();
        }

        /**
         * @return channels
         */
        public java.util.List < Channels> getChannels() {
            return this.channels;
        }

        /**
         * @return effectTimeRange
         */
        public EffectTimeRange getEffectTimeRange() {
            return this.effectTimeRange;
        }

        /**
         * @return filterSetting
         */
        public FilterSetting getFilterSetting() {
            return this.filterSetting;
        }

        /**
         * @return severities
         */
        public java.util.List < String > getSeverities() {
            return this.severities;
        }

        public static final class Builder {
            private java.util.List < Channels> channels; 
            private EffectTimeRange effectTimeRange; 
            private FilterSetting filterSetting; 
            private java.util.List < String > severities; 

            /**
             * channels.
             */
            public Builder channels(java.util.List < Channels> channels) {
                this.channels = channels;
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
             * filterSetting.
             */
            public Builder filterSetting(FilterSetting filterSetting) {
                this.filterSetting = filterSetting;
                return this;
            }

            /**
             * severities.
             */
            public Builder severities(java.util.List < String > severities) {
                this.severities = severities;
                return this;
            }

            public Routes build() {
                return new Routes(this);
            } 

        } 

    }
}
