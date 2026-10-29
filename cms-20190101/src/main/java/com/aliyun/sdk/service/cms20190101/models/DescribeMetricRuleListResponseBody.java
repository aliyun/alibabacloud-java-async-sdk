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
 * {@link DescribeMetricRuleListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMetricRuleListResponseBody</p>
 */
public class DescribeMetricRuleListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Alarms")
    private Alarms alarms;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private String total;

    private DescribeMetricRuleListResponseBody(Builder builder) {
        this.alarms = builder.alarms;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetricRuleListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarms
     */
    public Alarms getAlarms() {
        return this.alarms;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public String getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Alarms alarms; 
        private Integer code; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String total; 

        private Builder() {
        } 

        private Builder(DescribeMetricRuleListResponseBody model) {
            this.alarms = model.alarms;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * Alarms.
         */
        public Builder alarms(Alarms alarms) {
            this.alarms = alarms;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * <blockquote>
         * <p>200 indicates success.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified resource is not found.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>386C6712-335F-5054-930A-CC92B851ECBA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful. Valid values:</p>
         * <ul>
         * <li><p>true: Successful.</p>
         * </li>
         * <li><p>false: Failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(String total) {
            this.total = total;
            return this;
        }

        public DescribeMetricRuleListResponseBody build() {
            return new DescribeMetricRuleListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMetricRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricRuleListResponseBody</p>
     */
    public static class ExpressionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Period")
        private Integer period;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        private ExpressionList(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
            this.metricName = builder.metricName;
            this.period = builder.period;
            this.statistics = builder.statistics;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExpressionList create() {
            return builder().build();
        }

        /**
         * @return comparisonOperator
         */
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
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

        public static final class Builder {
            private String comparisonOperator; 
            private String metricName; 
            private Integer period; 
            private String statistics; 
            private String threshold; 

            private Builder() {
            } 

            private Builder(ExpressionList model) {
                this.comparisonOperator = model.comparisonOperator;
                this.metricName = model.metricName;
                this.period = model.period;
                this.statistics = model.statistics;
                this.threshold = model.threshold;
            } 

            /**
             * ComparisonOperator.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
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
             * Period.
             */
            public Builder period(Integer period) {
                this.period = period;
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

            public ExpressionList build() {
                return new ExpressionList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMetricRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricRuleListResponseBody</p>
     */
    public static class CompositeExpressionExpressionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpressionList")
        private java.util.List<ExpressionList> expressionList;

        private CompositeExpressionExpressionList(Builder builder) {
            this.expressionList = builder.expressionList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CompositeExpressionExpressionList create() {
            return builder().build();
        }

        /**
         * @return expressionList
         */
        public java.util.List<ExpressionList> getExpressionList() {
            return this.expressionList;
        }

        public static final class Builder {
            private java.util.List<ExpressionList> expressionList; 

            private Builder() {
            } 

            private Builder(CompositeExpressionExpressionList model) {
                this.expressionList = model.expressionList;
            } 

            /**
             * ExpressionList.
             */
            public Builder expressionList(java.util.List<ExpressionList> expressionList) {
                this.expressionList = expressionList;
                return this;
            }

            public CompositeExpressionExpressionList build() {
                return new CompositeExpressionExpressionList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMetricRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricRuleListResponseBody</p>
     */
    public static class CompositeExpression extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpressionList")
        private CompositeExpressionExpressionList expressionList;

        @com.aliyun.core.annotation.NameInMap("ExpressionListJoin")
        private String expressionListJoin;

        @com.aliyun.core.annotation.NameInMap("ExpressionRaw")
        private String expressionRaw;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Times")
        private Integer times;

        private CompositeExpression(Builder builder) {
            this.expressionList = builder.expressionList;
            this.expressionListJoin = builder.expressionListJoin;
            this.expressionRaw = builder.expressionRaw;
            this.level = builder.level;
            this.times = builder.times;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CompositeExpression create() {
            return builder().build();
        }

        /**
         * @return expressionList
         */
        public CompositeExpressionExpressionList getExpressionList() {
            return this.expressionList;
        }

        /**
         * @return expressionListJoin
         */
        public String getExpressionListJoin() {
            return this.expressionListJoin;
        }

        /**
         * @return expressionRaw
         */
        public String getExpressionRaw() {
            return this.expressionRaw;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return times
         */
        public Integer getTimes() {
            return this.times;
        }

        public static final class Builder {
            private CompositeExpressionExpressionList expressionList; 
            private String expressionListJoin; 
            private String expressionRaw; 
            private String level; 
            private Integer times; 

            private Builder() {
            } 

            private Builder(CompositeExpression model) {
                this.expressionList = model.expressionList;
                this.expressionListJoin = model.expressionListJoin;
                this.expressionRaw = model.expressionRaw;
                this.level = model.level;
                this.times = model.times;
            } 

            /**
             * ExpressionList.
             */
            public Builder expressionList(CompositeExpressionExpressionList expressionList) {
                this.expressionList = expressionList;
                return this;
            }

            /**
             * ExpressionListJoin.
             */
            public Builder expressionListJoin(String expressionListJoin) {
                this.expressionListJoin = expressionListJoin;
                return this;
            }

            /**
             * ExpressionRaw.
             */
            public Builder expressionRaw(String expressionRaw) {
                this.expressionRaw = expressionRaw;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * Times.
             */
            public Builder times(Integer times) {
                this.times = times;
                return this;
            }

            public CompositeExpression build() {
                return new CompositeExpression(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMetricRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricRuleListResponseBody</p>
     */
    public static class Critical extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

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
            private String preCondition; 
            private String statistics; 
            private String threshold; 
            private Integer times; 

            private Builder() {
            } 

            private Builder(Critical model) {
                this.comparisonOperator = model.comparisonOperator;
                this.preCondition = model.preCondition;
                this.statistics = model.statistics;
                this.threshold = model.threshold;
                this.times = model.times;
            } 

            /**
             * ComparisonOperator.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
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
    /**
     * 
     * {@link DescribeMetricRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricRuleListResponseBody</p>
     */
    public static class Info extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

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
            private String preCondition; 
            private String statistics; 
            private String threshold; 
            private Integer times; 

            private Builder() {
            } 

            private Builder(Info model) {
                this.comparisonOperator = model.comparisonOperator;
                this.preCondition = model.preCondition;
                this.statistics = model.statistics;
                this.threshold = model.threshold;
                this.times = model.times;
            } 

            /**
             * ComparisonOperator.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
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
    /**
     * 
     * {@link DescribeMetricRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricRuleListResponseBody</p>
     */
    public static class Warn extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

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
            private String preCondition; 
            private String statistics; 
            private String threshold; 
            private Integer times; 

            private Builder() {
            } 

            private Builder(Warn model) {
                this.comparisonOperator = model.comparisonOperator;
                this.preCondition = model.preCondition;
                this.statistics = model.statistics;
                this.threshold = model.threshold;
                this.times = model.times;
            } 

            /**
             * ComparisonOperator.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
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
    /**
     * 
     * {@link DescribeMetricRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricRuleListResponseBody</p>
     */
    public static class Escalations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Critical")
        private Critical critical;

        @com.aliyun.core.annotation.NameInMap("Info")
        private Info info;

        @com.aliyun.core.annotation.NameInMap("Warn")
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
     * {@link DescribeMetricRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricRuleListResponseBody</p>
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
    /**
     * 
     * {@link DescribeMetricRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricRuleListResponseBody</p>
     */
    public static class AlarmLabels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List<Labels> labels;

        private AlarmLabels(Builder builder) {
            this.labels = builder.labels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlarmLabels create() {
            return builder().build();
        }

        /**
         * @return labels
         */
        public java.util.List<Labels> getLabels() {
            return this.labels;
        }

        public static final class Builder {
            private java.util.List<Labels> labels; 

            private Builder() {
            } 

            private Builder(AlarmLabels model) {
                this.labels = model.labels;
            } 

            /**
             * Labels.
             */
            public Builder labels(java.util.List<Labels> labels) {
                this.labels = labels;
                return this;
            }

            public AlarmLabels build() {
                return new AlarmLabels(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMetricRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricRuleListResponseBody</p>
     */
    public static class Annotations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Annotations(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Annotations create() {
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

            private Builder(Annotations model) {
                this.key = model.key;
                this.value = model.value;
            } 

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

            public Annotations build() {
                return new Annotations(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMetricRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricRuleListResponseBody</p>
     */
    public static class PrometheusAnnotations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Annotations")
        private java.util.List<Annotations> annotations;

        private PrometheusAnnotations(Builder builder) {
            this.annotations = builder.annotations;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrometheusAnnotations create() {
            return builder().build();
        }

        /**
         * @return annotations
         */
        public java.util.List<Annotations> getAnnotations() {
            return this.annotations;
        }

        public static final class Builder {
            private java.util.List<Annotations> annotations; 

            private Builder() {
            } 

            private Builder(PrometheusAnnotations model) {
                this.annotations = model.annotations;
            } 

            /**
             * Annotations.
             */
            public Builder annotations(java.util.List<Annotations> annotations) {
                this.annotations = annotations;
                return this;
            }

            public PrometheusAnnotations build() {
                return new PrometheusAnnotations(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMetricRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricRuleListResponseBody</p>
     */
    public static class Prometheus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Annotations")
        private PrometheusAnnotations annotations;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("PromQL")
        private String promQL;

        @com.aliyun.core.annotation.NameInMap("Times")
        private Long times;

        private Prometheus(Builder builder) {
            this.annotations = builder.annotations;
            this.level = builder.level;
            this.promQL = builder.promQL;
            this.times = builder.times;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Prometheus create() {
            return builder().build();
        }

        /**
         * @return annotations
         */
        public PrometheusAnnotations getAnnotations() {
            return this.annotations;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return promQL
         */
        public String getPromQL() {
            return this.promQL;
        }

        /**
         * @return times
         */
        public Long getTimes() {
            return this.times;
        }

        public static final class Builder {
            private PrometheusAnnotations annotations; 
            private String level; 
            private String promQL; 
            private Long times; 

            private Builder() {
            } 

            private Builder(Prometheus model) {
                this.annotations = model.annotations;
                this.level = model.level;
                this.promQL = model.promQL;
                this.times = model.times;
            } 

            /**
             * Annotations.
             */
            public Builder annotations(PrometheusAnnotations annotations) {
                this.annotations = annotations;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * PromQL.
             */
            public Builder promQL(String promQL) {
                this.promQL = promQL;
                return this;
            }

            /**
             * Times.
             */
            public Builder times(Long times) {
                this.times = times;
                return this;
            }

            public Prometheus build() {
                return new Prometheus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMetricRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricRuleListResponseBody</p>
     */
    public static class Alarm extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertState")
        private String alertState;

        @com.aliyun.core.annotation.NameInMap("CompositeExpression")
        private CompositeExpression compositeExpression;

        @com.aliyun.core.annotation.NameInMap("ContactGroups")
        private String contactGroups;

        @com.aliyun.core.annotation.NameInMap("Dimensions")
        private String dimensions;

        @com.aliyun.core.annotation.NameInMap("EffectiveInterval")
        private String effectiveInterval;

        @com.aliyun.core.annotation.NameInMap("EnableState")
        private Boolean enableState;

        @com.aliyun.core.annotation.NameInMap("Escalations")
        private Escalations escalations;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtUpdate")
        private String gmtUpdate;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private AlarmLabels labels;

        @com.aliyun.core.annotation.NameInMap("MailSubject")
        private String mailSubject;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("NoDataPolicy")
        private String noDataPolicy;

        @com.aliyun.core.annotation.NameInMap("NoEffectiveInterval")
        private String noEffectiveInterval;

        @com.aliyun.core.annotation.NameInMap("Period")
        private String period;

        @com.aliyun.core.annotation.NameInMap("ProductCategory")
        private String productCategory;

        @com.aliyun.core.annotation.NameInMap("Prometheus")
        private Prometheus prometheus;

        @com.aliyun.core.annotation.NameInMap("Resources")
        private String resources;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("SendOK")
        private Boolean sendOK;

        @com.aliyun.core.annotation.NameInMap("SilenceTime")
        private Integer silenceTime;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("Webhook")
        private String webhook;

        private Alarm(Builder builder) {
            this.alertState = builder.alertState;
            this.compositeExpression = builder.compositeExpression;
            this.contactGroups = builder.contactGroups;
            this.dimensions = builder.dimensions;
            this.effectiveInterval = builder.effectiveInterval;
            this.enableState = builder.enableState;
            this.escalations = builder.escalations;
            this.gmtCreate = builder.gmtCreate;
            this.gmtUpdate = builder.gmtUpdate;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.labels = builder.labels;
            this.mailSubject = builder.mailSubject;
            this.metricName = builder.metricName;
            this.namespace = builder.namespace;
            this.noDataPolicy = builder.noDataPolicy;
            this.noEffectiveInterval = builder.noEffectiveInterval;
            this.period = builder.period;
            this.productCategory = builder.productCategory;
            this.prometheus = builder.prometheus;
            this.resources = builder.resources;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.sendOK = builder.sendOK;
            this.silenceTime = builder.silenceTime;
            this.sourceType = builder.sourceType;
            this.webhook = builder.webhook;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Alarm create() {
            return builder().build();
        }

        /**
         * @return alertState
         */
        public String getAlertState() {
            return this.alertState;
        }

        /**
         * @return compositeExpression
         */
        public CompositeExpression getCompositeExpression() {
            return this.compositeExpression;
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
         * @return enableState
         */
        public Boolean getEnableState() {
            return this.enableState;
        }

        /**
         * @return escalations
         */
        public Escalations getEscalations() {
            return this.escalations;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtUpdate
         */
        public String getGmtUpdate() {
            return this.gmtUpdate;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return labels
         */
        public AlarmLabels getLabels() {
            return this.labels;
        }

        /**
         * @return mailSubject
         */
        public String getMailSubject() {
            return this.mailSubject;
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
         * @return productCategory
         */
        public String getProductCategory() {
            return this.productCategory;
        }

        /**
         * @return prometheus
         */
        public Prometheus getPrometheus() {
            return this.prometheus;
        }

        /**
         * @return resources
         */
        public String getResources() {
            return this.resources;
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
         * @return sendOK
         */
        public Boolean getSendOK() {
            return this.sendOK;
        }

        /**
         * @return silenceTime
         */
        public Integer getSilenceTime() {
            return this.silenceTime;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return webhook
         */
        public String getWebhook() {
            return this.webhook;
        }

        public static final class Builder {
            private String alertState; 
            private CompositeExpression compositeExpression; 
            private String contactGroups; 
            private String dimensions; 
            private String effectiveInterval; 
            private Boolean enableState; 
            private Escalations escalations; 
            private Long gmtCreate; 
            private String gmtUpdate; 
            private String groupId; 
            private String groupName; 
            private AlarmLabels labels; 
            private String mailSubject; 
            private String metricName; 
            private String namespace; 
            private String noDataPolicy; 
            private String noEffectiveInterval; 
            private String period; 
            private String productCategory; 
            private Prometheus prometheus; 
            private String resources; 
            private String ruleId; 
            private String ruleName; 
            private Boolean sendOK; 
            private Integer silenceTime; 
            private String sourceType; 
            private String webhook; 

            private Builder() {
            } 

            private Builder(Alarm model) {
                this.alertState = model.alertState;
                this.compositeExpression = model.compositeExpression;
                this.contactGroups = model.contactGroups;
                this.dimensions = model.dimensions;
                this.effectiveInterval = model.effectiveInterval;
                this.enableState = model.enableState;
                this.escalations = model.escalations;
                this.gmtCreate = model.gmtCreate;
                this.gmtUpdate = model.gmtUpdate;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.labels = model.labels;
                this.mailSubject = model.mailSubject;
                this.metricName = model.metricName;
                this.namespace = model.namespace;
                this.noDataPolicy = model.noDataPolicy;
                this.noEffectiveInterval = model.noEffectiveInterval;
                this.period = model.period;
                this.productCategory = model.productCategory;
                this.prometheus = model.prometheus;
                this.resources = model.resources;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.sendOK = model.sendOK;
                this.silenceTime = model.silenceTime;
                this.sourceType = model.sourceType;
                this.webhook = model.webhook;
            } 

            /**
             * AlertState.
             */
            public Builder alertState(String alertState) {
                this.alertState = alertState;
                return this;
            }

            /**
             * CompositeExpression.
             */
            public Builder compositeExpression(CompositeExpression compositeExpression) {
                this.compositeExpression = compositeExpression;
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
             * EnableState.
             */
            public Builder enableState(Boolean enableState) {
                this.enableState = enableState;
                return this;
            }

            /**
             * Escalations.
             */
            public Builder escalations(Escalations escalations) {
                this.escalations = escalations;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtUpdate.
             */
            public Builder gmtUpdate(String gmtUpdate) {
                this.gmtUpdate = gmtUpdate;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * Labels.
             */
            public Builder labels(AlarmLabels labels) {
                this.labels = labels;
                return this;
            }

            /**
             * MailSubject.
             */
            public Builder mailSubject(String mailSubject) {
                this.mailSubject = mailSubject;
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
             * ProductCategory.
             */
            public Builder productCategory(String productCategory) {
                this.productCategory = productCategory;
                return this;
            }

            /**
             * Prometheus.
             */
            public Builder prometheus(Prometheus prometheus) {
                this.prometheus = prometheus;
                return this;
            }

            /**
             * Resources.
             */
            public Builder resources(String resources) {
                this.resources = resources;
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
             * <p>是否关闭恢复告警。取值：true（是）、false（否）。</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder sendOK(Boolean sendOK) {
                this.sendOK = sendOK;
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
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * Webhook.
             */
            public Builder webhook(String webhook) {
                this.webhook = webhook;
                return this;
            }

            public Alarm build() {
                return new Alarm(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMetricRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricRuleListResponseBody</p>
     */
    public static class Alarms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alarm")
        private java.util.List<Alarm> alarm;

        private Alarms(Builder builder) {
            this.alarm = builder.alarm;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Alarms create() {
            return builder().build();
        }

        /**
         * @return alarm
         */
        public java.util.List<Alarm> getAlarm() {
            return this.alarm;
        }

        public static final class Builder {
            private java.util.List<Alarm> alarm; 

            private Builder() {
            } 

            private Builder(Alarms model) {
                this.alarm = model.alarm;
            } 

            /**
             * Alarm.
             */
            public Builder alarm(java.util.List<Alarm> alarm) {
                this.alarm = alarm;
                return this;
            }

            public Alarms build() {
                return new Alarms(this);
            } 

        } 

    }
}
