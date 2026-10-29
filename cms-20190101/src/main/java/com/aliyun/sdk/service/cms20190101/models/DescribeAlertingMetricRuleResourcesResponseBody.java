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
 * {@link DescribeAlertingMetricRuleResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAlertingMetricRuleResourcesResponseBody</p>
 */
public class DescribeAlertingMetricRuleResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resources")
    private Resources resources;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private DescribeAlertingMetricRuleResourcesResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resources = builder.resources;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlertingMetricRuleResourcesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return resources
     */
    public Resources getResources() {
        return this.resources;
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
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private Resources resources; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(DescribeAlertingMetricRuleResourcesResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.resources = model.resources;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * <p>The status code.</p>
         * <blockquote>
         * <p>A value of 200 indicates success.</p>
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
         * <p>The request processing has failed due to some unknown error.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0724011B-D9E0-4B2F-8C51-F17A894CC42C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Resources.
         */
        public Builder resources(Resources resources) {
            this.resources = resources;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful. Valid values:</p>
         * <ul>
         * <li><p>true: The operation was successful.</p>
         * </li>
         * <li><p>false: The operation failed.</p>
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
         * <p>2</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeAlertingMetricRuleResourcesResponseBody build() {
            return new DescribeAlertingMetricRuleResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAlertingMetricRuleResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertingMetricRuleResourcesResponseBody</p>
     */
    public static class ExpressionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Period")
        private String period;

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
        public String getPeriod() {
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
            private String period; 
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
            public Builder period(String period) {
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
     * {@link DescribeAlertingMetricRuleResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertingMetricRuleResourcesResponseBody</p>
     */
    public static class ResourceExpressionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpressionList")
        private java.util.List<ExpressionList> expressionList;

        private ResourceExpressionList(Builder builder) {
            this.expressionList = builder.expressionList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceExpressionList create() {
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

            private Builder(ResourceExpressionList model) {
                this.expressionList = model.expressionList;
            } 

            /**
             * ExpressionList.
             */
            public Builder expressionList(java.util.List<ExpressionList> expressionList) {
                this.expressionList = expressionList;
                return this;
            }

            public ResourceExpressionList build() {
                return new ResourceExpressionList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAlertingMetricRuleResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertingMetricRuleResourcesResponseBody</p>
     */
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("Expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("ExpressionList")
        private ResourceExpressionList expressionList;

        @com.aliyun.core.annotation.NameInMap("ExpressionListJoin")
        private String expressionListJoin;

        @com.aliyun.core.annotation.NameInMap("ExpressionRaw")
        private String expressionRaw;

        @com.aliyun.core.annotation.NameInMap("Level")
        private Integer level;

        @com.aliyun.core.annotation.NameInMap("PreCondition")
        private String preCondition;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        @com.aliyun.core.annotation.NameInMap("Times")
        private Integer times;

        private Resource(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
            this.expression = builder.expression;
            this.expressionList = builder.expressionList;
            this.expressionListJoin = builder.expressionListJoin;
            this.expressionRaw = builder.expressionRaw;
            this.level = builder.level;
            this.preCondition = builder.preCondition;
            this.tag = builder.tag;
            this.threshold = builder.threshold;
            this.times = builder.times;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return comparisonOperator
         */
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        /**
         * @return expressionList
         */
        public ResourceExpressionList getExpressionList() {
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
        public Integer getLevel() {
            return this.level;
        }

        /**
         * @return preCondition
         */
        public String getPreCondition() {
            return this.preCondition;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
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
            private String expression; 
            private ResourceExpressionList expressionList; 
            private String expressionListJoin; 
            private String expressionRaw; 
            private Integer level; 
            private String preCondition; 
            private String tag; 
            private String threshold; 
            private Integer times; 

            private Builder() {
            } 

            private Builder(Resource model) {
                this.comparisonOperator = model.comparisonOperator;
                this.expression = model.expression;
                this.expressionList = model.expressionList;
                this.expressionListJoin = model.expressionListJoin;
                this.expressionRaw = model.expressionRaw;
                this.level = model.level;
                this.preCondition = model.preCondition;
                this.tag = model.tag;
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
             * Expression.
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * ExpressionList.
             */
            public Builder expressionList(ResourceExpressionList expressionList) {
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
            public Builder level(Integer level) {
                this.level = level;
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
             * Tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
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

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAlertingMetricRuleResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertingMetricRuleResourcesResponseBody</p>
     */
    public static class Escalation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Resource")
        private java.util.List<Resource> resource;

        private Escalation(Builder builder) {
            this.resource = builder.resource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Escalation create() {
            return builder().build();
        }

        /**
         * @return resource
         */
        public java.util.List<Resource> getResource() {
            return this.resource;
        }

        public static final class Builder {
            private java.util.List<Resource> resource; 

            private Builder() {
            } 

            private Builder(Escalation model) {
                this.resource = model.resource;
            } 

            /**
             * Resource.
             */
            public Builder resource(java.util.List<Resource> resource) {
                this.resource = resource;
                return this;
            }

            public Escalation build() {
                return new Escalation(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAlertingMetricRuleResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertingMetricRuleResourcesResponseBody</p>
     */
    public static class ResourcesResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dimensions")
        private String dimensions;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private String enable;

        @com.aliyun.core.annotation.NameInMap("Escalation")
        private Escalation escalation;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("LastAlertTime")
        private String lastAlertTime;

        @com.aliyun.core.annotation.NameInMap("LastModifyTime")
        private String lastModifyTime;

        @com.aliyun.core.annotation.NameInMap("Level")
        private Integer level;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("MetricValues")
        private String metricValues;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("ProductCategory")
        private String productCategory;

        @com.aliyun.core.annotation.NameInMap("Resource")
        private String resource;

        @com.aliyun.core.annotation.NameInMap("RetryTimes")
        private String retryTimes;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        private ResourcesResource(Builder builder) {
            this.dimensions = builder.dimensions;
            this.enable = builder.enable;
            this.escalation = builder.escalation;
            this.groupId = builder.groupId;
            this.lastAlertTime = builder.lastAlertTime;
            this.lastModifyTime = builder.lastModifyTime;
            this.level = builder.level;
            this.metricName = builder.metricName;
            this.metricValues = builder.metricValues;
            this.namespace = builder.namespace;
            this.productCategory = builder.productCategory;
            this.resource = builder.resource;
            this.retryTimes = builder.retryTimes;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.startTime = builder.startTime;
            this.statistics = builder.statistics;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourcesResource create() {
            return builder().build();
        }

        /**
         * @return dimensions
         */
        public String getDimensions() {
            return this.dimensions;
        }

        /**
         * @return enable
         */
        public String getEnable() {
            return this.enable;
        }

        /**
         * @return escalation
         */
        public Escalation getEscalation() {
            return this.escalation;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return lastAlertTime
         */
        public String getLastAlertTime() {
            return this.lastAlertTime;
        }

        /**
         * @return lastModifyTime
         */
        public String getLastModifyTime() {
            return this.lastModifyTime;
        }

        /**
         * @return level
         */
        public Integer getLevel() {
            return this.level;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return metricValues
         */
        public String getMetricValues() {
            return this.metricValues;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return productCategory
         */
        public String getProductCategory() {
            return this.productCategory;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        /**
         * @return retryTimes
         */
        public String getRetryTimes() {
            return this.retryTimes;
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
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
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
            private String dimensions; 
            private String enable; 
            private Escalation escalation; 
            private String groupId; 
            private String lastAlertTime; 
            private String lastModifyTime; 
            private Integer level; 
            private String metricName; 
            private String metricValues; 
            private String namespace; 
            private String productCategory; 
            private String resource; 
            private String retryTimes; 
            private String ruleId; 
            private String ruleName; 
            private String startTime; 
            private String statistics; 
            private String threshold; 

            private Builder() {
            } 

            private Builder(ResourcesResource model) {
                this.dimensions = model.dimensions;
                this.enable = model.enable;
                this.escalation = model.escalation;
                this.groupId = model.groupId;
                this.lastAlertTime = model.lastAlertTime;
                this.lastModifyTime = model.lastModifyTime;
                this.level = model.level;
                this.metricName = model.metricName;
                this.metricValues = model.metricValues;
                this.namespace = model.namespace;
                this.productCategory = model.productCategory;
                this.resource = model.resource;
                this.retryTimes = model.retryTimes;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.startTime = model.startTime;
                this.statistics = model.statistics;
                this.threshold = model.threshold;
            } 

            /**
             * Dimensions.
             */
            public Builder dimensions(String dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(String enable) {
                this.enable = enable;
                return this;
            }

            /**
             * Escalation.
             */
            public Builder escalation(Escalation escalation) {
                this.escalation = escalation;
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
             * LastAlertTime.
             */
            public Builder lastAlertTime(String lastAlertTime) {
                this.lastAlertTime = lastAlertTime;
                return this;
            }

            /**
             * LastModifyTime.
             */
            public Builder lastModifyTime(String lastModifyTime) {
                this.lastModifyTime = lastModifyTime;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(Integer level) {
                this.level = level;
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
             * MetricValues.
             */
            public Builder metricValues(String metricValues) {
                this.metricValues = metricValues;
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
             * ProductCategory.
             */
            public Builder productCategory(String productCategory) {
                this.productCategory = productCategory;
                return this;
            }

            /**
             * Resource.
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * RetryTimes.
             */
            public Builder retryTimes(String retryTimes) {
                this.retryTimes = retryTimes;
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
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
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

            public ResourcesResource build() {
                return new ResourcesResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAlertingMetricRuleResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertingMetricRuleResourcesResponseBody</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Resource")
        private java.util.List<ResourcesResource> resource;

        private Resources(Builder builder) {
            this.resource = builder.resource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return resource
         */
        public java.util.List<ResourcesResource> getResource() {
            return this.resource;
        }

        public static final class Builder {
            private java.util.List<ResourcesResource> resource; 

            private Builder() {
            } 

            private Builder(Resources model) {
                this.resource = model.resource;
            } 

            /**
             * Resource.
             */
            public Builder resource(java.util.List<ResourcesResource> resource) {
                this.resource = resource;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
}
