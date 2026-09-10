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
 * {@link NotifyStrategyConfig} extends {@link TeaModel}
 *
 * <p>NotifyStrategyConfig</p>
 */
public class NotifyStrategyConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("customTemplateEntries")
    private java.util.List<CustomTemplateEntries> customTemplateEntries;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("groupingSetting")
    @com.aliyun.core.annotation.Validation(required = true)
    private GroupingSetting groupingSetting;

    @com.aliyun.core.annotation.NameInMap("ignoreRestoredNotification")
    private Boolean ignoreRestoredNotification;

    @com.aliyun.core.annotation.NameInMap("routes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Routes> routes;

    private NotifyStrategyConfig(Builder builder) {
        this.customTemplateEntries = builder.customTemplateEntries;
        this.description = builder.description;
        this.groupingSetting = builder.groupingSetting;
        this.ignoreRestoredNotification = builder.ignoreRestoredNotification;
        this.routes = builder.routes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NotifyStrategyConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customTemplateEntries
     */
    public java.util.List<CustomTemplateEntries> getCustomTemplateEntries() {
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
     * @return routes
     */
    public java.util.List<Routes> getRoutes() {
        return this.routes;
    }

    public static final class Builder {
        private java.util.List<CustomTemplateEntries> customTemplateEntries; 
        private String description; 
        private GroupingSetting groupingSetting; 
        private Boolean ignoreRestoredNotification; 
        private java.util.List<Routes> routes; 

        private Builder() {
        } 

        private Builder(NotifyStrategyConfig model) {
            this.customTemplateEntries = model.customTemplateEntries;
            this.description = model.description;
            this.groupingSetting = model.groupingSetting;
            this.ignoreRestoredNotification = model.ignoreRestoredNotification;
            this.routes = model.routes;
        } 

        /**
         * <p>The list of custom notification templates.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder customTemplateEntries(java.util.List<CustomTemplateEntries> customTemplateEntries) {
            this.customTemplateEntries = customTemplateEntries;
            return this;
        }

        /**
         * <p>The description of the notification policy.</p>
         * 
         * <strong>example:</strong>
         * <p>生产环境告警通知策略</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The noise reduction settings.</p>
         * <p>This parameter is required.</p>
         */
        public Builder groupingSetting(GroupingSetting groupingSetting) {
            this.groupingSetting = groupingSetting;
            return this;
        }

        /**
         * <p>Specifies whether to ignore notifications for recovery events. A value of true indicates that recovery notifications are not sent.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ignoreRestoredNotification(Boolean ignoreRestoredNotification) {
            this.ignoreRestoredNotification = ignoreRestoredNotification;
            return this;
        }

        /**
         * <p>The list of notification channel routing settings.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder routes(java.util.List<Routes> routes) {
            this.routes = routes;
            return this;
        }

        public NotifyStrategyConfig build() {
            return new NotifyStrategyConfig(this);
        } 

    } 

    /**
     * 
     * {@link NotifyStrategyConfig} extends {@link TeaModel}
     *
     * <p>NotifyStrategyConfig</p>
     */
    public static class CustomTemplateEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("templateUuid")
        private String templateUuid;

        private CustomTemplateEntries(Builder builder) {
            this.templateUuid = builder.templateUuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomTemplateEntries create() {
            return builder().build();
        }

        /**
         * @return templateUuid
         */
        public String getTemplateUuid() {
            return this.templateUuid;
        }

        public static final class Builder {
            private String templateUuid; 

            private Builder() {
            } 

            private Builder(CustomTemplateEntries model) {
                this.templateUuid = model.templateUuid;
            } 

            /**
             * <p>The UUID of the notification template.</p>
             * 
             * <strong>example:</strong>
             * <p>template-uuid-xxx</p>
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
     * {@link NotifyStrategyConfig} extends {@link TeaModel}
     *
     * <p>NotifyStrategyConfig</p>
     */
    public static class GroupingSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("groupingKeys")
        private java.util.List<String> groupingKeys;

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
        public java.util.List<String> getGroupingKeys() {
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
            private java.util.List<String> groupingKeys; 
            private Integer periodMin; 
            private Integer silenceSec; 
            private Integer times; 

            private Builder() {
            } 

            private Builder(GroupingSetting model) {
                this.groupingKeys = model.groupingKeys;
                this.periodMin = model.periodMin;
                this.silenceSec = model.silenceSec;
                this.times = model.times;
            } 

            /**
             * <p>The event fields by which events are grouped. Events in the same group are merged into a single notification. An empty array indicates no grouping.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;alertname&quot;]</p>
             */
            public Builder groupingKeys(java.util.List<String> groupingKeys) {
                this.groupingKeys = groupingKeys;
                return this;
            }

            /**
             * <p>This parameter does not take effect for this operation. You do not need to set this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder periodMin(Integer periodMin) {
                this.periodMin = periodMin;
                return this;
            }

            /**
             * <p>This parameter does not take effect for this operation. You do not need to set this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder silenceSec(Integer silenceSec) {
                this.silenceSec = silenceSec;
                return this;
            }

            /**
             * <p>This parameter does not take effect for this operation. You do not need to set this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
     * {@link NotifyStrategyConfig} extends {@link TeaModel}
     *
     * <p>NotifyStrategyConfig</p>
     */
    public static class Channels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("channelType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String channelType;

        @com.aliyun.core.annotation.NameInMap("enabledSubChannels")
        private java.util.List<String> enabledSubChannels;

        @com.aliyun.core.annotation.NameInMap("receivers")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> receivers;

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
        public java.util.List<String> getEnabledSubChannels() {
            return this.enabledSubChannels;
        }

        /**
         * @return receivers
         */
        public java.util.List<String> getReceivers() {
            return this.receivers;
        }

        public static final class Builder {
            private String channelType; 
            private java.util.List<String> enabledSubChannels; 
            private java.util.List<String> receivers; 

            private Builder() {
            } 

            private Builder(Channels model) {
                this.channelType = model.channelType;
                this.enabledSubChannels = model.enabledSubChannels;
                this.receivers = model.receivers;
            } 

            /**
             * <p>The channel type. Valid values: DING, WEIXIN, FEISHU, SLACK, TEAMS, WEBHOOK, CONTACT, GROUP, DUTY, and DING_COOL_APP. Lowercase values are not supported. For email, text message, or phone call notifications, use CONTACT with enabledSubChannels.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>WEBHOOK</p>
             */
            public Builder channelType(String channelType) {
                this.channelType = channelType;
                return this;
            }

            /**
             * <p>Required only for CONTACT, GROUP, or DUTY. The sub-channel types in uppercase. Valid values: EMAIL, SMS, VOICE, DING, WEIXIN, FEISHU, and WEBHOOK.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;EMAIL&quot;,&quot;SMS&quot;]</p>
             */
            public Builder enabledSubChannels(java.util.List<String> enabledSubChannels) {
                this.enabledSubChannels = enabledSubChannels;
                return this;
            }

            /**
             * <p>The list of receiver identifiers. At least one receiver is required. Specify a webhook UUID for WEBHOOK, a robot UUID for chatbots, or a contact ID for CONTACT.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;webhook-uuid-xxx&quot;]</p>
             */
            public Builder receivers(java.util.List<String> receivers) {
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
     * {@link NotifyStrategyConfig} extends {@link TeaModel}
     *
     * <p>NotifyStrategyConfig</p>
     */
    public static class EffectTimeRange extends TeaModel {
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
             * <p>The effective days. Valid values: 0 to 6 (0 = Sunday, 6 = Saturday). The value 7 is not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>[0,1,2,3,4,5,6]</p>
             */
            public Builder dayInWeek(java.util.List<Integer> dayInWeek) {
                this.dayInWeek = dayInWeek;
                return this;
            }

            /**
             * <p>The end time of the day in minutes. Valid values: 0 to 1439.</p>
             * 
             * <strong>example:</strong>
             * <p>1439</p>
             */
            public Builder endTimeInMinute(Integer endTimeInMinute) {
                this.endTimeInMinute = endTimeInMinute;
                return this;
            }

            /**
             * <p>The start time of the day in minutes. Valid values: 0 to 1438.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder startTimeInMinute(Integer startTimeInMinute) {
                this.startTimeInMinute = startTimeInMinute;
                return this;
            }

            /**
             * <p>The IANA time zone identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>Asia/Shanghai</p>
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
     * {@link NotifyStrategyConfig} extends {@link TeaModel}
     *
     * <p>NotifyStrategyConfig</p>
     */
    public static class Routes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("channels")
        private java.util.List<Channels> channels;

        @com.aliyun.core.annotation.NameInMap("digitalEmployeeName")
        private String digitalEmployeeName;

        @com.aliyun.core.annotation.NameInMap("effectTimeRange")
        private EffectTimeRange effectTimeRange;

        @com.aliyun.core.annotation.NameInMap("enableRca")
        private Boolean enableRca;

        @com.aliyun.core.annotation.NameInMap("filterSetting")
        private FilterSetting filterSetting;

        private Routes(Builder builder) {
            this.channels = builder.channels;
            this.digitalEmployeeName = builder.digitalEmployeeName;
            this.effectTimeRange = builder.effectTimeRange;
            this.enableRca = builder.enableRca;
            this.filterSetting = builder.filterSetting;
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
        public java.util.List<Channels> getChannels() {
            return this.channels;
        }

        /**
         * @return digitalEmployeeName
         */
        public String getDigitalEmployeeName() {
            return this.digitalEmployeeName;
        }

        /**
         * @return effectTimeRange
         */
        public EffectTimeRange getEffectTimeRange() {
            return this.effectTimeRange;
        }

        /**
         * @return enableRca
         */
        public Boolean getEnableRca() {
            return this.enableRca;
        }

        /**
         * @return filterSetting
         */
        public FilterSetting getFilterSetting() {
            return this.filterSetting;
        }

        public static final class Builder {
            private java.util.List<Channels> channels; 
            private String digitalEmployeeName; 
            private EffectTimeRange effectTimeRange; 
            private Boolean enableRca; 
            private FilterSetting filterSetting; 

            private Builder() {
            } 

            private Builder(Routes model) {
                this.channels = model.channels;
                this.digitalEmployeeName = model.digitalEmployeeName;
                this.effectTimeRange = model.effectTimeRange;
                this.enableRca = model.enableRca;
                this.filterSetting = model.filterSetting;
            } 

            /**
             * <p>The list of notification channels.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder channels(java.util.List<Channels> channels) {
                this.channels = channels;
                return this;
            }

            /**
             * <p>The digital employee name. Required when enableRca is set to true.</p>
             * 
             * <strong>example:</strong>
             * <p>数字员工名</p>
             */
            public Builder digitalEmployeeName(String digitalEmployeeName) {
                this.digitalEmployeeName = digitalEmployeeName;
                return this;
            }

            /**
             * <p>The effective time range.</p>
             */
            public Builder effectTimeRange(EffectTimeRange effectTimeRange) {
                this.effectTimeRange = effectTimeRange;
                return this;
            }

            /**
             * <p>Specifies whether to enable Root Cause Analysis (RCA).</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableRca(Boolean enableRca) {
                this.enableRca = enableRca;
                return this;
            }

            /**
             * <p>The route-level event filter conditions.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder filterSetting(FilterSetting filterSetting) {
                this.filterSetting = filterSetting;
                return this;
            }

            public Routes build() {
                return new Routes(this);
            } 

        } 

    }
}
