// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
 * {@link CreateGroupMetricRulesRequest} extends {@link RequestModel}
 *
 * <p>CreateGroupMetricRulesRequest</p>
 */
public class CreateGroupMetricRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupMetricRules")
    private java.util.List<GroupMetricRules> groupMetricRules;

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
    public java.util.List<GroupMetricRules> getGroupMetricRules() {
        return this.groupMetricRules;
    }

    public static final class Builder extends Request.Builder<CreateGroupMetricRulesRequest, Builder> {
        private Long groupId; 
        private java.util.List<GroupMetricRules> groupMetricRules; 

        private Builder() {
            super();
        } 

        private Builder(CreateGroupMetricRulesRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.groupMetricRules = request.groupMetricRules;
        } 

        /**
         * <p>The ID of the application group.</p>
         * <p>For information about how to obtain the application group ID, see <a href="https://help.aliyun.com/document_detail/115032.html">DescribeMonitorGroups</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3607****</p>
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The list of metric-based alert rules for the application group.</p>
         */
        public Builder groupMetricRules(java.util.List<GroupMetricRules> groupMetricRules) {
            this.putQueryParameter("GroupMetricRules", groupMetricRules);
            this.groupMetricRules = groupMetricRules;
            return this;
        }

        @Override
        public CreateGroupMetricRulesRequest build() {
            return new CreateGroupMetricRulesRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateGroupMetricRulesRequest} extends {@link TeaModel}
     *
     * <p>CreateGroupMetricRulesRequest</p>
     */
    public static class Critical extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("N")
        private String n;

        @com.aliyun.core.annotation.NameInMap("PreCondition")
        private String preCondition;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        @com.aliyun.core.annotation.NameInMap("Times")
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

            private Builder() {
            } 

            private Builder(Critical model) {
                this.comparisonOperator = model.comparisonOperator;
                this.n = model.n;
                this.preCondition = model.preCondition;
                this.statistics = model.statistics;
                this.threshold = model.threshold;
                this.times = model.times;
            } 

            /**
             * <p>The comparison operator for Critical-level alerts. Valid values:</p>
             * <ul>
             * <li>GreaterThanOrEqualToThreshold: greater than or equal to the threshold. </li>
             * <li>GreaterThanThreshold: greater than the threshold. </li>
             * <li>LessThanOrEqualToThreshold: less than or equal to the threshold. </li>
             * <li>LessThanThreshold: less than the threshold. </li>
             * <li>NotEqualToThreshold: not equal to the threshold. </li>
             * <li>GreaterThanYesterday: greater than the value at the same time yesterday. </li>
             * <li>LessThanYesterday: less than the value at the same time yesterday. </li>
             * <li>GreaterThanLastWeek: greater than the value at the same time last week. </li>
             * <li>LessThanLastWeek: less than the value at the same time last week. </li>
             * <li>GreaterThanLastPeriod: greater than the value in the last period. </li>
             * <li>LessThanLastPeriod: less than the value in the last period.</li>
             * </ul>
             * <p>Valid values of N: 1 to 200.</p>
             * <blockquote>
             * <p>Set at least one of the alert severity levels Critical, Warn, or Info. For each specified alert severity level, you must set all of the following parameters: Statistics, ComparisonOperator, Threshold, and Times.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>GreaterThanOrEqualToThreshold</p>
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
             * <p>The statistical method for Critical-level alerts.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * <p>The valid values of this parameter are determined by the <code>Statistics</code> column corresponding to the <code>MetricName</code> of the specified Alibaba Cloud service, such as Maximum, Minimum, and Average. For information about how to obtain the valid values, see <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service monitoring</a>.</p>
             * <blockquote>
             * <p>Set at least one of the alert severity levels Critical, Warn, or Info. For each specified alert severity level, you must set all of the following parameters: Statistics, ComparisonOperator, Threshold, and Times.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Average</p>
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * <p>The threshold that triggers Critical-level alert notifications.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * <blockquote>
             * <p>Set at least one of the alert severity levels Critical, Warn, or Info. For each specified alert severity level, you must set all of the following parameters: Statistics, ComparisonOperator, Threshold, and Times.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * <p>The number of times that the monitoring metric must reach the alert threshold before a Critical-level alert notification is sent.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * <blockquote>
             * <p>Settings for at least one of the alert severity levels Critical, Warn (warning), or Info must be specified. For each specified alert severity level, you must set all of the following parameters: Statistics, ComparisonOperator, Threshold, and Times.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
    /**
     * 
     * {@link CreateGroupMetricRulesRequest} extends {@link TeaModel}
     *
     * <p>CreateGroupMetricRulesRequest</p>
     */
    public static class Info extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("N")
        private String n;

        @com.aliyun.core.annotation.NameInMap("PreCondition")
        private String preCondition;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        @com.aliyun.core.annotation.NameInMap("Times")
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

            private Builder() {
            } 

            private Builder(Info model) {
                this.comparisonOperator = model.comparisonOperator;
                this.n = model.n;
                this.preCondition = model.preCondition;
                this.statistics = model.statistics;
                this.threshold = model.threshold;
                this.times = model.times;
            } 

            /**
             * <p>The comparison operator for Info-level alerts. Valid values:</p>
             * <ul>
             * <li>GreaterThanOrEqualToThreshold: greater than or equal to the threshold. </li>
             * <li>GreaterThanThreshold: greater than the threshold. </li>
             * <li>LessThanOrEqualToThreshold: less than or equal to the threshold. </li>
             * <li>LessThanThreshold: less than the threshold. </li>
             * <li>NotEqualToThreshold: not equal to the threshold. </li>
             * <li>GreaterThanYesterday: greater than the value at the same time yesterday. </li>
             * <li>LessThanYesterday: less than the value at the same time yesterday. </li>
             * <li>GreaterThanLastWeek: greater than the value at the same time last week. </li>
             * <li>LessThanLastWeek: less than the value at the same time last week. </li>
             * <li>GreaterThanLastPeriod: greater than the value in the last period. </li>
             * <li>LessThanLastPeriod: less than the value in the last period.</li>
             * </ul>
             * <p>Valid values of N: 1 to 200.</p>
             * <blockquote>
             * <p>Set at least one of the alert severity levels Critical, Warn, or Info. For each specified alert severity level, you must set all of the following parameters: Statistics, ComparisonOperator, Threshold, and Times.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>GreaterThanOrEqualToThreshold</p>
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
             * <p>The statistical method for Info-level alerts.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * <p>The valid values of this parameter are determined by the <code>Statistics</code> column corresponding to the <code>MetricName</code> of the specified Alibaba Cloud service, such as Maximum, Minimum, and Average. For information about how to obtain the valid values, see <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service monitoring</a>.</p>
             * <blockquote>
             * <p>Set at least one of the alert severity levels Critical, Warn, or Info. For each specified alert severity level, you must set all of the following parameters: Statistics, ComparisonOperator, Threshold, and Times.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Average</p>
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * <p>The threshold for Info-level alerts.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * <blockquote>
             * <p>Set at least one of the alert severity levels Critical, Warn, or Info. For each specified alert severity level, you must set all of the following parameters: Statistics, ComparisonOperator, Threshold, and Times.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * <p>The number of times that the monitoring metric must reach the alert threshold before an Info-level alert notification is sent.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * <blockquote>
             * <p>Settings for at least one of the alert severity levels Critical, Warn (warning), or Info must be specified. For each specified alert severity level, you must set all of the following parameters: Statistics, ComparisonOperator, Threshold, and Times.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link CreateGroupMetricRulesRequest} extends {@link TeaModel}
     *
     * <p>CreateGroupMetricRulesRequest</p>
     */
    public static class Warn extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("N")
        private String n;

        @com.aliyun.core.annotation.NameInMap("PreCondition")
        private String preCondition;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        @com.aliyun.core.annotation.NameInMap("Times")
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

            private Builder() {
            } 

            private Builder(Warn model) {
                this.comparisonOperator = model.comparisonOperator;
                this.n = model.n;
                this.preCondition = model.preCondition;
                this.statistics = model.statistics;
                this.threshold = model.threshold;
                this.times = model.times;
            } 

            /**
             * <p>The comparison operator for Warn-level alerts. Valid values:</p>
             * <ul>
             * <li>GreaterThanOrEqualToThreshold: greater than or equal to the threshold. </li>
             * <li>GreaterThanThreshold: greater than the threshold. </li>
             * <li>LessThanOrEqualToThreshold: less than or equal to the threshold. </li>
             * <li>LessThanThreshold: less than the threshold. </li>
             * <li>NotEqualToThreshold: not equal to the threshold. </li>
             * <li>GreaterThanYesterday: greater than the value at the same time yesterday. </li>
             * <li>LessThanYesterday: less than the value at the same time yesterday. </li>
             * <li>GreaterThanLastWeek: greater than the value at the same time last week. </li>
             * <li>LessThanLastWeek: less than the value at the same time last week. </li>
             * <li>GreaterThanLastPeriod: greater than the value in the last period. </li>
             * <li>LessThanLastPeriod: less than the value in the last period.</li>
             * </ul>
             * <p>Valid values of N: 1 to 200.</p>
             * <blockquote>
             * <p>Set at least one of the alert severity levels Critical, Warn, or Info. For each specified alert severity level, you must set all of the following parameters: Statistics, ComparisonOperator, Threshold, and Times.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>GreaterThanOrEqualToThreshold</p>
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
             * <p>The statistical method for Warn-level alerts.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * <p>The valid values of this parameter are determined by the <code>Statistics</code> column corresponding to the <code>MetricName</code> of the specified Alibaba Cloud service, such as Maximum, Minimum, and Average. For information about how to obtain the valid values, see <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service monitoring</a>.</p>
             * <blockquote>
             * <p>Set at least one of the alert severity levels Critical, Warn, or Info. For each specified alert severity level, you must set all of the following parameters: Statistics, ComparisonOperator, Threshold, and Times.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Average</p>
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * <p>The threshold for Warn-level alerts.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * <blockquote>
             * <p>Set at least one of the alert severity levels Critical, Warn, or Info. For each specified alert severity level, you must set all of the following parameters: Statistics, ComparisonOperator, Threshold, and Times.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * <p>The number of times that the monitoring metric must reach the alert threshold before a Warn-level alert notification is sent.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * <blockquote>
             * <p>Settings for at least one of the alert severity levels Critical, Warn (warning), or Info must be specified. For each specified alert severity level, you must set all of the following parameters: Statistics, ComparisonOperator, Threshold, and Times.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
    /**
     * 
     * {@link CreateGroupMetricRulesRequest} extends {@link TeaModel}
     *
     * <p>CreateGroupMetricRulesRequest</p>
     */
    public static class Escalations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Critical")
        @com.aliyun.core.annotation.Validation(required = true)
        private Critical critical;

        @com.aliyun.core.annotation.NameInMap("Info")
        @com.aliyun.core.annotation.Validation(required = true)
        private Info info;

        @com.aliyun.core.annotation.NameInMap("Warn")
        @com.aliyun.core.annotation.Validation(required = true)
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

            private Builder() {
            } 

            private Builder(Escalations model) {
                this.critical = model.critical;
                this.info = model.info;
                this.warn = model.warn;
            } 

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
    /**
     * 
     * {@link CreateGroupMetricRulesRequest} extends {@link TeaModel}
     *
     * <p>CreateGroupMetricRulesRequest</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Labels model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the alert rule. The tag is included in alert notifications.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * 
             * <strong>example:</strong>
             * <p>key1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the alert rule. The tag is included in alert notifications.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
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
    /**
     * 
     * {@link CreateGroupMetricRulesRequest} extends {@link TeaModel}
     *
     * <p>CreateGroupMetricRulesRequest</p>
     */
    public static class GroupMetricRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Escalations")
        private Escalations escalations;

        @com.aliyun.core.annotation.NameInMap("Category")
        @com.aliyun.core.annotation.Validation(required = true)
        private String category;

        @com.aliyun.core.annotation.NameInMap("ContactGroups")
        private String contactGroups;

        @com.aliyun.core.annotation.NameInMap("Dimensions")
        private String dimensions;

        @com.aliyun.core.annotation.NameInMap("EffectiveInterval")
        private String effectiveInterval;

        @com.aliyun.core.annotation.NameInMap("EmailSubject")
        private String emailSubject;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private String interval;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List<Labels> labels;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        @com.aliyun.core.annotation.Validation(required = true)
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("NoDataPolicy")
        private String noDataPolicy;

        @com.aliyun.core.annotation.NameInMap("NoEffectiveInterval")
        private String noEffectiveInterval;

        @com.aliyun.core.annotation.NameInMap("Options")
        private String options;

        @com.aliyun.core.annotation.NameInMap("Period")
        private String period;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("SilenceTime")
        private Integer silenceTime;

        @com.aliyun.core.annotation.NameInMap("Webhook")
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
            this.options = builder.options;
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
        public java.util.List<Labels> getLabels() {
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
         * @return options
         */
        public String getOptions() {
            return this.options;
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
            private java.util.List<Labels> labels; 
            private String metricName; 
            private String namespace; 
            private String noDataPolicy; 
            private String noEffectiveInterval; 
            private String options; 
            private String period; 
            private String ruleId; 
            private String ruleName; 
            private Integer silenceTime; 
            private String webhook; 

            private Builder() {
            } 

            private Builder(GroupMetricRules model) {
                this.escalations = model.escalations;
                this.category = model.category;
                this.contactGroups = model.contactGroups;
                this.dimensions = model.dimensions;
                this.effectiveInterval = model.effectiveInterval;
                this.emailSubject = model.emailSubject;
                this.interval = model.interval;
                this.labels = model.labels;
                this.metricName = model.metricName;
                this.namespace = model.namespace;
                this.noDataPolicy = model.noDataPolicy;
                this.noEffectiveInterval = model.noEffectiveInterval;
                this.options = model.options;
                this.period = model.period;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.silenceTime = model.silenceTime;
                this.webhook = model.webhook;
            } 

            /**
             * Escalations.
             */
            public Builder escalations(Escalations escalations) {
                this.escalations = escalations;
                return this;
            }

            /**
             * <p>The abbreviation of the Alibaba Cloud service name.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * <p>For information about how to obtain the abbreviation, see the <code>metricCategory</code> tag in the <code>Labels</code> response parameter of the <a href="https://help.aliyun.com/document_detail/114916.html">DescribeProjectMeta</a> operation.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The alert contact group.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * <p>For information about how to obtain the alert contact group, see <a href="https://help.aliyun.com/document_detail/114922.html">DescribeContactGroupList</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS_Group</p>
             */
            public Builder contactGroups(String contactGroups) {
                this.contactGroups = contactGroups;
                return this;
            }

            /**
             * <p>The monitoring dimensions of the specified resource.</p>
             * <p>The value is a collection of <code>key:value</code> pairs, such as <code>{&quot;userId&quot;:&quot;120886317861****&quot;}</code> and <code>{&quot;instanceId&quot;:&quot;i-2ze2d6j5uhg20x47****&quot;}</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;instanceId&quot;:&quot;i-m5e1qg6uo38rztr4****&quot;}]</p>
             */
            public Builder dimensions(String dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * <p>The effective period of the alert rule. Valid values of N: 1 to 200.</p>
             * 
             * <strong>example:</strong>
             * <p>05:31-23:59</p>
             */
            public Builder effectiveInterval(String effectiveInterval) {
                this.effectiveInterval = effectiveInterval;
                return this;
            }

            /**
             * <p>The subject of the alert notification email.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS instance</p>
             */
            public Builder emailSubject(String emailSubject) {
                this.emailSubject = emailSubject;
                return this;
            }

            /**
             * <p>The detection period of the alert rule.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * <p>Unit: seconds. The default value is the minimum reporting frequency of the metric.</p>
             * <blockquote>
             * <p>Keep the detection period of the alert rule consistent with the data reporting period. If the detection period is shorter than the data reporting period, alerts may not be triggered due to insufficient data.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder interval(String interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The tag keys of the alert rule.</p>
             */
            public Builder labels(java.util.List<Labels> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * <p>For information about how to obtain the metric name, see <a href="https://help.aliyun.com/document_detail/98846.html">DescribeMetricMetaList</a> or <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service monitoring</a>.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cpu_total</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The namespace of the Alibaba Cloud service.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * <p>For information about how to obtain the namespace of an Alibaba Cloud service, see <a href="https://help.aliyun.com/document_detail/98846.html">DescribeMetricMetaList</a> or <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service monitoring</a>.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>acs_ecs_dashboard</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The processing method when no monitoring data is found. Valid values:</p>
             * <ul>
             * <li>KEEP_LAST_STATE (default): No action is performed.</li>
             * <li>INSUFFICIENT_DATA: An alert whose content is &quot;Insufficient Data&quot; is triggered.</li>
             * <li>OK: The status is considered normal.</li>
             * </ul>
             * <p>Valid values of N: 1 to 200.</p>
             * 
             * <strong>example:</strong>
             * <p>KEEP_LAST_STATE</p>
             */
            public Builder noDataPolicy(String noDataPolicy) {
                this.noDataPolicy = noDataPolicy;
                return this;
            }

            /**
             * <p>The time period during which the alert rule is ineffective. Valid values of N: 1 to 200.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00-05:30</p>
             */
            public Builder noEffectiveInterval(String noEffectiveInterval) {
                this.noEffectiveInterval = noEffectiveInterval;
                return this;
            }

            /**
             * <p>The advanced settings.</p>
             * <p>Format: {&quot;key1&quot;:&quot;value1&quot;,&quot;key2&quot;:&quot;value2&quot;}. For example, {&quot;NotSendOK&quot;:true} specifies whether to send an alert recovery notification. The key is NotSendOK, and the value is true (do not send) or false (send, which is the default).</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *       &quot;NotSendOK&quot;: true
             * }</p>
             */
            public Builder options(String options) {
                this.options = options;
                return this;
            }

            /**
             * <p>The reporting period of monitoring data.</p>
             * <p>Valid values of N: 1 to 200. </p>
             * <p>The value of <code>Period</code> must be 60 or a multiple of 60. Unit: seconds. Default value: 300.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder period(String period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The ID of the alert rule.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>456789</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the alert rule.</p>
             * <p>Valid values of N: 1 to 200.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS_Rule1</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The mute period of the alert notification. Valid values of N: 1 to 200.</p>
             * <p>Unit: seconds. Default value: 86400. Minimum value: 3600.</p>
             * 
             * <strong>example:</strong>
             * <p>86400</p>
             */
            public Builder silenceTime(Integer silenceTime) {
                this.silenceTime = silenceTime;
                return this;
            }

            /**
             * <p>The callback URL to which an alert notification is sent. Valid values of N: 1 to 200.</p>
             * <p>Specify a publicly accessible URL. CloudMonitor sends a POST request to push alert information to this URL. Only the HTTP protocol is supported.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
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
