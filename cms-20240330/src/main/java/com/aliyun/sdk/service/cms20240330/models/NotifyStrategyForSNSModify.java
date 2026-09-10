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
 * {@link NotifyStrategyForSNSModify} extends {@link TeaModel}
 *
 * <p>NotifyStrategyForSNSModify</p>
 */
public class NotifyStrategyForSNSModify extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("customTemplateEntries")
    private java.util.List<CustomTemplateEntries> customTemplateEntries;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("enableIncidentManagement")
    private Boolean enableIncidentManagement;

    @com.aliyun.core.annotation.NameInMap("groupingSetting")
    @com.aliyun.core.annotation.Validation(required = true)
    private GroupingSetting groupingSetting;

    @com.aliyun.core.annotation.NameInMap("ignoreRestoredNotification")
    private Boolean ignoreRestoredNotification;

    @com.aliyun.core.annotation.NameInMap("routes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Routes> routes;

    private NotifyStrategyForSNSModify(Builder builder) {
        this.customTemplateEntries = builder.customTemplateEntries;
        this.description = builder.description;
        this.enableIncidentManagement = builder.enableIncidentManagement;
        this.groupingSetting = builder.groupingSetting;
        this.ignoreRestoredNotification = builder.ignoreRestoredNotification;
        this.routes = builder.routes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NotifyStrategyForSNSModify create() {
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
     * @return enableIncidentManagement
     */
    public Boolean getEnableIncidentManagement() {
        return this.enableIncidentManagement;
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
        private Boolean enableIncidentManagement; 
        private GroupingSetting groupingSetting; 
        private Boolean ignoreRestoredNotification; 
        private java.util.List<Routes> routes; 

        private Builder() {
        } 

        private Builder(NotifyStrategyForSNSModify model) {
            this.customTemplateEntries = model.customTemplateEntries;
            this.description = model.description;
            this.enableIncidentManagement = model.enableIncidentManagement;
            this.groupingSetting = model.groupingSetting;
            this.ignoreRestoredNotification = model.ignoreRestoredNotification;
            this.routes = model.routes;
        } 

        /**
         * <p>The notification channel templates.</p>
         */
        public Builder customTemplateEntries(java.util.List<CustomTemplateEntries> customTemplateEntries) {
            this.customTemplateEntries = customTemplateEntries;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to enable incident management.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableIncidentManagement(Boolean enableIncidentManagement) {
            this.enableIncidentManagement = enableIncidentManagement;
            return this;
        }

        /**
         * <p>The grouping settings.</p>
         * <p>This parameter is required.</p>
         */
        public Builder groupingSetting(GroupingSetting groupingSetting) {
            this.groupingSetting = groupingSetting;
            return this;
        }

        /**
         * <p>Specifies whether to send a notification when the alert is recovered.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ignoreRestoredNotification(Boolean ignoreRestoredNotification) {
            this.ignoreRestoredNotification = ignoreRestoredNotification;
            return this;
        }

        /**
         * <p>The notification channel routing settings.</p>
         * <p>This parameter is required.</p>
         */
        public Builder routes(java.util.List<Routes> routes) {
            this.routes = routes;
            return this;
        }

        public NotifyStrategyForSNSModify build() {
            return new NotifyStrategyForSNSModify(this);
        } 

    } 

    /**
     * 
     * {@link NotifyStrategyForSNSModify} extends {@link TeaModel}
     *
     * <p>NotifyStrategyForSNSModify</p>
     */
    public static class CustomTemplateEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("targetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("templateUuid")
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

            private Builder() {
            } 

            private Builder(CustomTemplateEntries model) {
                this.targetType = model.targetType;
                this.templateUuid = model.templateUuid;
            } 

            /**
             * <p><strong>[Deprecated]</strong> This parameter is deprecated and does not take effect. The actual purpose of the template is determined by the type field of the template object referenced by templateUuid.</p>
             * 
             * <strong>example:</strong>
             * <p>DING</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * <p>The UUID of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>adef12efca3f-8728-1928-eeaac12ef9ad92</p>
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
     * {@link NotifyStrategyForSNSModify} extends {@link TeaModel}
     *
     * <p>NotifyStrategyForSNSModify</p>
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
             * <p>The grouping keys.</p>
             */
            public Builder groupingKeys(java.util.List<String> groupingKeys) {
                this.groupingKeys = groupingKeys;
                return this;
            }

            /**
             * <p>The check period in minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder periodMin(Integer periodMin) {
                this.periodMin = periodMin;
                return this;
            }

            /**
             * <p>The silence duration in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder silenceSec(Integer silenceSec) {
                this.silenceSec = silenceSec;
                return this;
            }

            /**
             * <p>The number of times the condition is triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
     * {@link NotifyStrategyForSNSModify} extends {@link TeaModel}
     *
     * <p>NotifyStrategyForSNSModify</p>
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
             * <p>The channel type.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DING</p>
             */
            public Builder channelType(String channelType) {
                this.channelType = channelType;
                return this;
            }

            /**
             * <p>The enabled notification types.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;EMAIL&quot;,&quot;SMS&quot;]</p>
             */
            public Builder enabledSubChannels(java.util.List<String> enabledSubChannels) {
                this.enabledSubChannels = enabledSubChannels;
                return this;
            }

            /**
             * <p>The channel receivers.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;my-webhook-uuid&quot;]</p>
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
     * {@link NotifyStrategyForSNSModify} extends {@link TeaModel}
     *
     * <p>NotifyStrategyForSNSModify</p>
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
             * <p>The effective days of the week (Monday through Sunday).</p>
             * 
             * <strong>example:</strong>
             * <p>[0,1,2,3,4,5,6]</p>
             */
            public Builder dayInWeek(java.util.List<Integer> dayInWeek) {
                this.dayInWeek = dayInWeek;
                return this;
            }

            /**
             * <p>The end time in minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder endTimeInMinute(Integer endTimeInMinute) {
                this.endTimeInMinute = endTimeInMinute;
                return this;
            }

            /**
             * <p>The start time in minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>59</p>
             */
            public Builder startTimeInMinute(Integer startTimeInMinute) {
                this.startTimeInMinute = startTimeInMinute;
                return this;
            }

            /**
             * <p>The time zone.</p>
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
     * {@link NotifyStrategyForSNSModify} extends {@link TeaModel}
     *
     * <p>NotifyStrategyForSNSModify</p>
     */
    public static class Conditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("field")
        private String field;

        @com.aliyun.core.annotation.NameInMap("op")
        private String op;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Conditions(Builder builder) {
            this.field = builder.field;
            this.op = builder.op;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conditions create() {
            return builder().build();
        }

        /**
         * @return field
         */
        public String getField() {
            return this.field;
        }

        /**
         * @return op
         */
        public String getOp() {
            return this.op;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String field; 
            private String op; 
            private String value; 

            private Builder() {
            } 

            private Builder(Conditions model) {
                this.field = model.field;
                this.op = model.op;
                this.value = model.value;
            } 

            /**
             * <p>The JSON path of the field, such as labels._cms_rule_name.</p>
             * 
             * <strong>example:</strong>
             * <p>subject</p>
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * <p>The comparison operator.</p>
             * 
             * <strong>example:</strong>
             * <p>EQ</p>
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            /**
             * <p>The value.</p>
             * 
             * <strong>example:</strong>
             * <p>Pod OOM</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Conditions build() {
                return new Conditions(this);
            } 

        } 

    }
    /**
     * 
     * {@link NotifyStrategyForSNSModify} extends {@link TeaModel}
     *
     * <p>NotifyStrategyForSNSModify</p>
     */
    public static class FilterSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("conditions")
        private java.util.List<Conditions> conditions;

        @com.aliyun.core.annotation.NameInMap("expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("relation")
        private String relation;

        private FilterSetting(Builder builder) {
            this.conditions = builder.conditions;
            this.expression = builder.expression;
            this.relation = builder.relation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilterSetting create() {
            return builder().build();
        }

        /**
         * @return conditions
         */
        public java.util.List<Conditions> getConditions() {
            return this.conditions;
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        /**
         * @return relation
         */
        public String getRelation() {
            return this.relation;
        }

        public static final class Builder {
            private java.util.List<Conditions> conditions; 
            private String expression; 
            private String relation; 

            private Builder() {
            } 

            private Builder(FilterSetting model) {
                this.conditions = model.conditions;
                this.expression = model.expression;
                this.relation = model.relation;
            } 

            /**
             * <p>The subscription conditions.</p>
             */
            public Builder conditions(java.util.List<Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * <p>If expression is not empty, it takes precedence and relation is ignored. If expression is empty or not specified, the system uses relation (AND or OR) to perform a simple AND/OR operation on all conditions. Condition numbers correspond to the indexes of the conditions array (starting from 1). Each condition evaluates whether a single event field matches by using field (the event field path, which supports dot-separated nesting such as resource.tags.pod), op (the operator, such as CONTAIN, EQ, or IN), and value (the match value).</p>
             * 
             * <strong>example:</strong>
             * <p>(1 AND 2 )OR 3</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>The relationship between conditions. If an expression is configured, the expression takes higher precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>AND</p>
             */
            public Builder relation(String relation) {
                this.relation = relation;
                return this;
            }

            public FilterSetting build() {
                return new FilterSetting(this);
            } 

        } 

    }
    /**
     * 
     * {@link NotifyStrategyForSNSModify} extends {@link TeaModel}
     *
     * <p>NotifyStrategyForSNSModify</p>
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

        @com.aliyun.core.annotation.NameInMap("severities")
        private java.util.List<String> severities;

        private Routes(Builder builder) {
            this.channels = builder.channels;
            this.digitalEmployeeName = builder.digitalEmployeeName;
            this.effectTimeRange = builder.effectTimeRange;
            this.enableRca = builder.enableRca;
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

        /**
         * @return severities
         */
        public java.util.List<String> getSeverities() {
            return this.severities;
        }

        public static final class Builder {
            private java.util.List<Channels> channels; 
            private String digitalEmployeeName; 
            private EffectTimeRange effectTimeRange; 
            private Boolean enableRca; 
            private FilterSetting filterSetting; 
            private java.util.List<String> severities; 

            private Builder() {
            } 

            private Builder(Routes model) {
                this.channels = model.channels;
                this.digitalEmployeeName = model.digitalEmployeeName;
                this.effectTimeRange = model.effectTimeRange;
                this.enableRca = model.enableRca;
                this.filterSetting = model.filterSetting;
                this.severities = model.severities;
            } 

            /**
             * <p>The notification channels.</p>
             */
            public Builder channels(java.util.List<Channels> channels) {
                this.channels = channels;
                return this;
            }

            /**
             * <p>The digital employee name.</p>
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
             * <p>Specifies whether to enable root cause analysis (RCA).</p>
             */
            public Builder enableRca(Boolean enableRca) {
                this.enableRca = enableRca;
                return this;
            }

            /**
             * <p>The route-level filter. This is different from the top-level subscription.filterSetting.</p>
             */
            public Builder filterSetting(FilterSetting filterSetting) {
                this.filterSetting = filterSetting;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> This parameter is deprecated and does not take effect. Route matching only checks filterSetting and effectTimeRange.</p>
             */
            public Builder severities(java.util.List<String> severities) {
                this.severities = severities;
                return this;
            }

            public Routes build() {
                return new Routes(this);
            } 

        } 

    }
}
