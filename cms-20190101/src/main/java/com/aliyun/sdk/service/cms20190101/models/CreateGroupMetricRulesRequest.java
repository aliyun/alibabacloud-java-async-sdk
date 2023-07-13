// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGroupMetricRulesRequest} extends {@link RequestModel}
 *
 * <p>CreateGroupMetricRulesRequest</p>
 */
public class CreateGroupMetricRulesRequest extends Request {
    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private Long groupId;

    @Query
    @NameInMap("GroupMetricRules")
    private java.util.List < GroupMetricRules> groupMetricRules;

    private CreateGroupMetricRulesRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.groupMetricRules = builder.groupMetricRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGroupMetricRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupMetricRules
     */
    public java.util.List < GroupMetricRules> getGroupMetricRules() {
        return this.groupMetricRules;
    }

    public static final class Builder extends Request.Builder<CreateGroupMetricRulesRequest, Builder> {
        private Long groupId; 
        private java.util.List < GroupMetricRules> groupMetricRules; 

        private Builder() {
            super();
        } 

        private Builder(CreateGroupMetricRulesRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.groupMetricRules = request.groupMetricRules;
        } 

        /**
         * GroupId.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * GroupMetricRules.
         */
        public Builder groupMetricRules(java.util.List < GroupMetricRules> groupMetricRules) {
            this.putQueryParameter("GroupMetricRules", groupMetricRules);
            this.groupMetricRules = groupMetricRules;
            return this;
        }

        @Override
        public CreateGroupMetricRulesRequest build() {
            return new CreateGroupMetricRulesRequest(this);
        } 

    } 

    public static class Critical extends TeaModel {
        @NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @NameInMap("N")
        private String n;

        @NameInMap("PreCondition")
        private String preCondition;

        @NameInMap("Statistics")
        private String statistics;

        @NameInMap("Threshold")
        private String threshold;

        @NameInMap("Times")
        private Integer times;

        private Critical(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
            this.n = builder.n;
            this.preCondition = builder.preCondition;
            this.statistics = builder.statistics;
            this.threshold = builder.threshold;
            this.times = builder.times;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Critical create() {
            return builder().build();
        }

        /**
         * @return comparisonOperator
         */
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        /**
         * @return n
         */
        public String getN() {
            return this.n;
        }

        /**
         * @return preCondition
         */
        public String getPreCondition() {
            return this.preCondition;
        }

        /**
         * @return statistics
         */
        public String getStatistics() {
            return this.statistics;
        }

        /**
         * @return threshold
         */
        public String getThreshold() {
            return this.threshold;
        }

        /**
         * @return times
         */
        public Integer getTimes() {
            return this.times;
        }

        public static final class Builder {
            private String comparisonOperator; 
            private String n; 
            private String preCondition; 
            private String statistics; 
            private String threshold; 
            private Integer times; 

            /**
             * ComparisonOperator.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * N.
             */
            public Builder n(String n) {
                this.n = n;
                return this;
            }

            /**
             * PreCondition.
             */
            public Builder preCondition(String preCondition) {
                this.preCondition = preCondition;
                return this;
            }

            /**
             * Statistics.
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * Threshold.
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * Times.
             */
            public Builder times(Integer times) {
                this.times = times;
                return this;
            }

            public Critical build() {
                return new Critical(this);
            } 

        } 

    }
    public static class Info extends TeaModel {
        @NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @NameInMap("N")
        private String n;

        @NameInMap("PreCondition")
        private String preCondition;

        @NameInMap("Statistics")
        private String statistics;

        @NameInMap("Threshold")
        private String threshold;

        @NameInMap("Times")
        private Integer times;

        private Info(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
            this.n = builder.n;
            this.preCondition = builder.preCondition;
            this.statistics = builder.statistics;
            this.threshold = builder.threshold;
            this.times = builder.times;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Info create() {
            return builder().build();
        }

        /**
         * @return comparisonOperator
         */
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        /**
         * @return n
         */
        public String getN() {
            return this.n;
        }

        /**
         * @return preCondition
         */
        public String getPreCondition() {
            return this.preCondition;
        }

        /**
         * @return statistics
         */
        public String getStatistics() {
            return this.statistics;
        }

        /**
         * @return threshold
         */
        public String getThreshold() {
            return this.threshold;
        }

        /**
         * @return times
         */
        public Integer getTimes() {
            return this.times;
        }

        public static final class Builder {
            private String comparisonOperator; 
            private String n; 
            private String preCondition; 
            private String statistics; 
            private String threshold; 
            private Integer times; 

            /**
             * ComparisonOperator.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * N.
             */
            public Builder n(String n) {
                this.n = n;
                return this;
            }

            /**
             * PreCondition.
             */
            public Builder preCondition(String preCondition) {
                this.preCondition = preCondition;
                return this;
            }

            /**
             * Statistics.
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * Threshold.
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * Times.
             */
            public Builder times(Integer times) {
                this.times = times;
                return this;
            }

            public Info build() {
                return new Info(this);
            } 

        } 

    }
    public static class Warn extends TeaModel {
        @NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @NameInMap("N")
        private String n;

        @NameInMap("PreCondition")
        private String preCondition;

        @NameInMap("Statistics")
        private String statistics;

        @NameInMap("Threshold")
        private String threshold;

        @NameInMap("Times")
        private Integer times;

        private Warn(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
            this.n = builder.n;
            this.preCondition = builder.preCondition;
            this.statistics = builder.statistics;
            this.threshold = builder.threshold;
            this.times = builder.times;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Warn create() {
            return builder().build();
        }

        /**
         * @return comparisonOperator
         */
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        /**
         * @return n
         */
        public String getN() {
            return this.n;
        }

        /**
         * @return preCondition
         */
        public String getPreCondition() {
            return this.preCondition;
        }

        /**
         * @return statistics
         */
        public String getStatistics() {
            return this.statistics;
        }

        /**
         * @return threshold
         */
        public String getThreshold() {
            return this.threshold;
        }

        /**
         * @return times
         */
        public Integer getTimes() {
            return this.times;
        }

        public static final class Builder {
            private String comparisonOperator; 
            private String n; 
            private String preCondition; 
            private String statistics; 
            private String threshold; 
            private Integer times; 

            /**
             * ComparisonOperator.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * N.
             */
            public Builder n(String n) {
                this.n = n;
                return this;
            }

            /**
             * PreCondition.
             */
            public Builder preCondition(String preCondition) {
                this.preCondition = preCondition;
                return this;
            }

            /**
             * Statistics.
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * Threshold.
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * Times.
             */
            public Builder times(Integer times) {
                this.times = times;
                return this;
            }

            public Warn build() {
                return new Warn(this);
            } 

        } 

    }
    public static class Escalations extends TeaModel {
        @NameInMap("Critical")
        @Validation(required = true)
        private Critical critical;

        @NameInMap("Info")
        @Validation(required = true)
        private Info info;

        @NameInMap("Warn")
        @Validation(required = true)
        private Warn warn;

        private Escalations(Builder builder) {
            this.critical = builder.critical;
            this.info = builder.info;
            this.warn = builder.warn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Escalations create() {
            return builder().build();
        }

        /**
         * @return critical
         */
        public Critical getCritical() {
            return this.critical;
        }

        /**
         * @return info
         */
        public Info getInfo() {
            return this.info;
        }

        /**
         * @return warn
         */
        public Warn getWarn() {
            return this.warn;
        }

        public static final class Builder {
            private Critical critical; 
            private Info info; 
            private Warn warn; 

            /**
             * Critical.
             */
            public Builder critical(Critical critical) {
                this.critical = critical;
                return this;
            }

            /**
             * Info.
             */
            public Builder info(Info info) {
                this.info = info;
                return this;
            }

            /**
             * Warn.
             */
            public Builder warn(Warn warn) {
                this.warn = warn;
                return this;
            }

            public Escalations build() {
                return new Escalations(this);
            } 

        } 

    }
    public static class Labels extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Labels(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
    public static class GroupMetricRules extends TeaModel {
        @NameInMap("Escalations")
        @Validation(required = true)
        private Escalations escalations;

        @NameInMap("Category")
        @Validation(required = true)
        private String category;

        @NameInMap("ContactGroups")
        private String contactGroups;

        @NameInMap("Dimensions")
        private String dimensions;

        @NameInMap("EffectiveInterval")
        private String effectiveInterval;

        @NameInMap("EmailSubject")
        private String emailSubject;

        @NameInMap("Interval")
        private String interval;

        @NameInMap("Labels")
        private java.util.List < Labels> labels;

        @NameInMap("MetricName")
        @Validation(required = true)
        private String metricName;

        @NameInMap("Namespace")
        @Validation(required = true)
        private String namespace;

        @NameInMap("NoDataPolicy")
        private String noDataPolicy;

        @NameInMap("NoEffectiveInterval")
        private String noEffectiveInterval;

        @NameInMap("Period")
        private String period;

        @NameInMap("RuleId")
        @Validation(required = true)
        private String ruleId;

        @NameInMap("RuleName")
        @Validation(required = true)
        private String ruleName;

        @NameInMap("SilenceTime")
        private Integer silenceTime;

        @NameInMap("Webhook")
        private String webhook;

        private GroupMetricRules(Builder builder) {
            this.escalations = builder.escalations;
            this.category = builder.category;
            this.contactGroups = builder.contactGroups;
            this.dimensions = builder.dimensions;
            this.effectiveInterval = builder.effectiveInterval;
            this.emailSubject = builder.emailSubject;
            this.interval = builder.interval;
            this.labels = builder.labels;
            this.metricName = builder.metricName;
            this.namespace = builder.namespace;
            this.noDataPolicy = builder.noDataPolicy;
            this.noEffectiveInterval = builder.noEffectiveInterval;
            this.period = builder.period;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.silenceTime = builder.silenceTime;
            this.webhook = builder.webhook;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupMetricRules create() {
            return builder().build();
        }

        /**
         * @return escalations
         */
        public Escalations getEscalations() {
            return this.escalations;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return contactGroups
         */
        public String getContactGroups() {
            return this.contactGroups;
        }

        /**
         * @return dimensions
         */
        public String getDimensions() {
            return this.dimensions;
        }

        /**
         * @return effectiveInterval
         */
        public String getEffectiveInterval() {
            return this.effectiveInterval;
        }

        /**
         * @return emailSubject
         */
        public String getEmailSubject() {
            return this.emailSubject;
        }

        /**
         * @return interval
         */
        public String getInterval() {
            return this.interval;
        }

        /**
         * @return labels
         */
        public java.util.List < Labels> getLabels() {
            return this.labels;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return noDataPolicy
         */
        public String getNoDataPolicy() {
            return this.noDataPolicy;
        }

        /**
         * @return noEffectiveInterval
         */
        public String getNoEffectiveInterval() {
            return this.noEffectiveInterval;
        }

        /**
         * @return period
         */
        public String getPeriod() {
            return this.period;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return silenceTime
         */
        public Integer getSilenceTime() {
            return this.silenceTime;
        }

        /**
         * @return webhook
         */
        public String getWebhook() {
            return this.webhook;
        }

        public static final class Builder {
            private Escalations escalations; 
            private String category; 
            private String contactGroups; 
            private String dimensions; 
            private String effectiveInterval; 
            private String emailSubject; 
            private String interval; 
            private java.util.List < Labels> labels; 
            private String metricName; 
            private String namespace; 
            private String noDataPolicy; 
            private String noEffectiveInterval; 
            private String period; 
            private String ruleId; 
            private String ruleName; 
            private Integer silenceTime; 
            private String webhook; 

            /**
             * Escalations.
             */
            public Builder escalations(Escalations escalations) {
                this.escalations = escalations;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * ContactGroups.
             */
            public Builder contactGroups(String contactGroups) {
                this.contactGroups = contactGroups;
                return this;
            }

            /**
             * Dimensions.
             */
            public Builder dimensions(String dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * EffectiveInterval.
             */
            public Builder effectiveInterval(String effectiveInterval) {
                this.effectiveInterval = effectiveInterval;
                return this;
            }

            /**
             * EmailSubject.
             */
            public Builder emailSubject(String emailSubject) {
                this.emailSubject = emailSubject;
                return this;
            }

            /**
             * Interval.
             */
            public Builder interval(String interval) {
                this.interval = interval;
                return this;
            }

            /**
             * Labels.
             */
            public Builder labels(java.util.List < Labels> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * MetricName.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * NoDataPolicy.
             */
            public Builder noDataPolicy(String noDataPolicy) {
                this.noDataPolicy = noDataPolicy;
                return this;
            }

            /**
             * NoEffectiveInterval.
             */
            public Builder noEffectiveInterval(String noEffectiveInterval) {
                this.noEffectiveInterval = noEffectiveInterval;
                return this;
            }

            /**
             * Period.
             */
            public Builder period(String period) {
                this.period = period;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * SilenceTime.
             */
            public Builder silenceTime(Integer silenceTime) {
                this.silenceTime = silenceTime;
                return this;
            }

            /**
             * Webhook.
             */
            public Builder webhook(String webhook) {
                this.webhook = webhook;
                return this;
            }

            public GroupMetricRules build() {
                return new GroupMetricRules(this);
            } 

        } 

    }
}
