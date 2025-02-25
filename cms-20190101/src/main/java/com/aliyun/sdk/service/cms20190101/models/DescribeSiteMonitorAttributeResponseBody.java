// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSiteMonitorAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSiteMonitorAttributeResponseBody</p>
 */
public class DescribeSiteMonitorAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("MetricRules")
    private MetricRules metricRules;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SiteMonitors")
    private SiteMonitors siteMonitors;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeSiteMonitorAttributeResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.metricRules = builder.metricRules;
        this.requestId = builder.requestId;
        this.siteMonitors = builder.siteMonitors;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSiteMonitorAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return metricRules
     */
    public MetricRules getMetricRules() {
        return this.metricRules;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return siteMonitors
     */
    public SiteMonitors getSiteMonitors() {
        return this.siteMonitors;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private MetricRules metricRules; 
        private String requestId; 
        private SiteMonitors siteMonitors; 
        private Boolean success; 

        /**
         * <p>The response code.</p>
         * <blockquote>
         * <p> The status code 200 indicates that the request was successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The information of the alert rules that are configured for the site monitoring task.</p>
         */
        public Builder metricRules(MetricRules metricRules) {
            this.metricRules = metricRules;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D17DF650-7EBD-54D0-903A-1D4E624D7402</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the site monitoring task.</p>
         */
        public Builder siteMonitors(SiteMonitors siteMonitors) {
            this.siteMonitors = siteMonitors;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeSiteMonitorAttributeResponseBody build() {
            return new DescribeSiteMonitorAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSiteMonitorAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteMonitorAttributeResponseBody</p>
     */
    public static class MetricRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionEnable")
        private String actionEnable;

        @com.aliyun.core.annotation.NameInMap("AlarmActions")
        private String alarmActions;

        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("Dimensions")
        private String dimensions;

        @com.aliyun.core.annotation.NameInMap("EvaluationCount")
        private String evaluationCount;

        @com.aliyun.core.annotation.NameInMap("Expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("OkActions")
        private String okActions;

        @com.aliyun.core.annotation.NameInMap("Period")
        private String period;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("StateValue")
        private String stateValue;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        private MetricRule(Builder builder) {
            this.actionEnable = builder.actionEnable;
            this.alarmActions = builder.alarmActions;
            this.comparisonOperator = builder.comparisonOperator;
            this.dimensions = builder.dimensions;
            this.evaluationCount = builder.evaluationCount;
            this.expression = builder.expression;
            this.level = builder.level;
            this.metricName = builder.metricName;
            this.namespace = builder.namespace;
            this.okActions = builder.okActions;
            this.period = builder.period;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.stateValue = builder.stateValue;
            this.statistics = builder.statistics;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetricRule create() {
            return builder().build();
        }

        /**
         * @return actionEnable
         */
        public String getActionEnable() {
            return this.actionEnable;
        }

        /**
         * @return alarmActions
         */
        public String getAlarmActions() {
            return this.alarmActions;
        }

        /**
         * @return comparisonOperator
         */
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        /**
         * @return dimensions
         */
        public String getDimensions() {
            return this.dimensions;
        }

        /**
         * @return evaluationCount
         */
        public String getEvaluationCount() {
            return this.evaluationCount;
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
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
         * @return okActions
         */
        public String getOkActions() {
            return this.okActions;
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
         * @return stateValue
         */
        public String getStateValue() {
            return this.stateValue;
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
            private String actionEnable; 
            private String alarmActions; 
            private String comparisonOperator; 
            private String dimensions; 
            private String evaluationCount; 
            private String expression; 
            private String level; 
            private String metricName; 
            private String namespace; 
            private String okActions; 
            private String period; 
            private String ruleId; 
            private String ruleName; 
            private String stateValue; 
            private String statistics; 
            private String threshold; 

            /**
             * <p>Indicates whether the alert rule is enabled. Valid values:</p>
             * <ul>
             * <li>true: The alert rule is enabled.</li>
             * <li>false: The alert rule is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder actionEnable(String actionEnable) {
                this.actionEnable = actionEnable;
                return this;
            }

            /**
             * <p>The alert contact group to which alert notifications are sent.</p>
             * 
             * <strong>example:</strong>
             * <p>CloudMonitor</p>
             */
            public Builder alarmActions(String alarmActions) {
                this.alarmActions = alarmActions;
                return this;
            }

            /**
             * <p>The operator that is used to compare the metric value with the threshold in the alert rule. Valid values:</p>
             * <ul>
             * <li><code>&gt;=</code></li>
             * <li><code>&gt;</code></li>
             * <li><code>&lt;=</code></li>
             * <li><code>&lt;</code></li>
             * <li><code>=</code></li>
             * <li><code>!=</code></li>
             * <li>GreaterThanYesterday: greater than the metric value at the same time yesterday</li>
             * <li>LessThanYesterday: less than the metric value at the same time yesterday</li>
             * <li>GreaterThanLastWeek: greater than the metric value at the same time last week</li>
             * <li>LessThanLastWeek: less than the metric value at the same time last week</li>
             * <li>GreaterThanLastPeriod: greater than the metric value in the last monitoring cycle</li>
             * <li>LessThanLastPeriod: less than the metric value in the last monitoring cycle</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>GreaterThanYesterday</p>
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * <p>The dimension of the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;taskId&quot;: &quot;cc641dff-c19d-45f3-ad0a-818a0c4f****&quot; }]</p>
             */
            public Builder dimensions(String dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * <p>The consecutive number of times for which the metric value meets the alert condition before an alert is triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder evaluationCount(String evaluationCount) {
                this.evaluationCount = evaluationCount;
                return this;
            }

            /**
             * <p>The expression that is used to trigger alerts.</p>
             * 
             * <strong>example:</strong>
             * <p>$Availability=30</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>The alert severity. Valid values:</p>
             * <ul>
             * <li>1: critical</li>
             * <li>2: warning</li>
             * <li>3: information</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The metric name.</p>
             * 
             * <strong>example:</strong>
             * <p>Availability</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The namespace of the cloud service.</p>
             * <p>The value is in the following format: acs_service name.</p>
             * 
             * <strong>example:</strong>
             * <p>acs_networkmonitor</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The alert contact group that receives alert notifications.</p>
             * 
             * <strong>example:</strong>
             * <p>[ &quot;CloudMonitor&quot;]</p>
             */
            public Builder okActions(String okActions) {
                this.okActions = okActions;
                return this;
            }

            /**
             * <p>The time interval. The value is the same as the interval at which metric data is reported. Unit: seconds.</p>
             * <blockquote>
             * <p> If you specify a statistical period for the alert rule, data is queried based on the statistical period.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>15s</p>
             */
            public Builder period(String period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The ID of the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>bf071ae_7b7aec3817b0fdf****</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>rule1</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The alert status. Valid values:</p>
             * <ul>
             * <li>OK: The alert rule has no active alerts.</li>
             * <li>ALARM: The alert rule has active alerts.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder stateValue(String stateValue) {
                this.stateValue = stateValue;
                return this;
            }

            /**
             * <p>The statistical method of the alert rule. Valid values:</p>
             * <ul>
             * <li>Availability: the percentage of available detection points</li>
             * <li>AvailableNumber: the number of available detection points</li>
             * <li>ErrorCodeMaximum: a status code for an alert</li>
             * <li>ErrorCodeMinimum: all status codes for a set of alerts</li>
             * <li>Average: response time</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Availability</p>
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * <p>The alert threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            public MetricRule build() {
                return new MetricRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSiteMonitorAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteMonitorAttributeResponseBody</p>
     */
    public static class MetricRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MetricRule")
        private java.util.List < MetricRule> metricRule;

        private MetricRules(Builder builder) {
            this.metricRule = builder.metricRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetricRules create() {
            return builder().build();
        }

        /**
         * @return metricRule
         */
        public java.util.List < MetricRule> getMetricRule() {
            return this.metricRule;
        }

        public static final class Builder {
            private java.util.List < MetricRule> metricRule; 

            /**
             * MetricRule.
             */
            public Builder metricRule(java.util.List < MetricRule> metricRule) {
                this.metricRule = metricRule;
                return this;
            }

            public MetricRules build() {
                return new MetricRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSiteMonitorAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteMonitorAttributeResponseBody</p>
     */
    public static class Days extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("days")
        private java.util.List < Integer > days;

        private Days(Builder builder) {
            this.days = builder.days;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Days create() {
            return builder().build();
        }

        /**
         * @return days
         */
        public java.util.List < Integer > getDays() {
            return this.days;
        }

        public static final class Builder {
            private java.util.List < Integer > days; 

            /**
             * days.
             */
            public Builder days(java.util.List < Integer > days) {
                this.days = days;
                return this;
            }

            public Days build() {
                return new Days(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSiteMonitorAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteMonitorAttributeResponseBody</p>
     */
    public static class CustomSchedule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("days")
        private Days days;

        @com.aliyun.core.annotation.NameInMap("end_hour")
        private Integer endHour;

        @com.aliyun.core.annotation.NameInMap("start_hour")
        private Integer startHour;

        @com.aliyun.core.annotation.NameInMap("time_zone")
        private String timeZone;

        private CustomSchedule(Builder builder) {
            this.days = builder.days;
            this.endHour = builder.endHour;
            this.startHour = builder.startHour;
            this.timeZone = builder.timeZone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomSchedule create() {
            return builder().build();
        }

        /**
         * @return days
         */
        public Days getDays() {
            return this.days;
        }

        /**
         * @return endHour
         */
        public Integer getEndHour() {
            return this.endHour;
        }

        /**
         * @return startHour
         */
        public Integer getStartHour() {
            return this.startHour;
        }

        /**
         * @return timeZone
         */
        public String getTimeZone() {
            return this.timeZone;
        }

        public static final class Builder {
            private Days days; 
            private Integer endHour; 
            private Integer startHour; 
            private String timeZone; 

            /**
             * days.
             */
            public Builder days(Days days) {
                this.days = days;
                return this;
            }

            /**
             * end_hour.
             */
            public Builder endHour(Integer endHour) {
                this.endHour = endHour;
                return this;
            }

            /**
             * start_hour.
             */
            public Builder startHour(Integer startHour) {
                this.startHour = startHour;
                return this;
            }

            /**
             * time_zone.
             */
            public Builder timeZone(String timeZone) {
                this.timeZone = timeZone;
                return this;
            }

            public CustomSchedule build() {
                return new CustomSchedule(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSiteMonitorAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteMonitorAttributeResponseBody</p>
     */
    public static class IspCity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("CityName")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("Isp")
        private String isp;

        @com.aliyun.core.annotation.NameInMap("IspName")
        private String ispName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private IspCity(Builder builder) {
            this.city = builder.city;
            this.cityName = builder.cityName;
            this.isp = builder.isp;
            this.ispName = builder.ispName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IspCity create() {
            return builder().build();
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return cityName
         */
        public String getCityName() {
            return this.cityName;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        /**
         * @return ispName
         */
        public String getIspName() {
            return this.ispName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String city; 
            private String cityName; 
            private String isp; 
            private String ispName; 
            private String type; 

            /**
             * <p>The city ID.</p>
             * 
             * <strong>example:</strong>
             * <p>738</p>
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * <p>The city name.</p>
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * <p>The carrier ID.</p>
             * 
             * <strong>example:</strong>
             * <p>465</p>
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * <p>The carrier name.</p>
             */
            public Builder ispName(String ispName) {
                this.ispName = ispName;
                return this;
            }

            /**
             * <p>探测点网络类型。取值：
             * IDC: IDC机房
             * LASTMILE: 网民家宽
             * MOBILE: 移动蜂窝网</p>
             * 
             * <strong>example:</strong>
             * <p>IDC</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public IspCity build() {
                return new IspCity(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSiteMonitorAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteMonitorAttributeResponseBody</p>
     */
    public static class IspCities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IspCity")
        private java.util.List < IspCity> ispCity;

        private IspCities(Builder builder) {
            this.ispCity = builder.ispCity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IspCities create() {
            return builder().build();
        }

        /**
         * @return ispCity
         */
        public java.util.List < IspCity> getIspCity() {
            return this.ispCity;
        }

        public static final class Builder {
            private java.util.List < IspCity> ispCity; 

            /**
             * IspCity.
             */
            public Builder ispCity(java.util.List < IspCity> ispCity) {
                this.ispCity = ispCity;
                return this;
            }

            public IspCities build() {
                return new IspCities(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSiteMonitorAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteMonitorAttributeResponseBody</p>
     */
    public static class Assertions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("property")
        private String property;

        @com.aliyun.core.annotation.NameInMap("target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Assertions(Builder builder) {
            this.operator = builder.operator;
            this.property = builder.property;
            this.target = builder.target;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Assertions create() {
            return builder().build();
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return property
         */
        public String getProperty() {
            return this.property;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String operator; 
            private String property; 
            private String target; 
            private String type; 

            /**
             * operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * property.
             */
            public Builder property(String property) {
                this.property = property;
                return this;
            }

            /**
             * target.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Assertions build() {
                return new Assertions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSiteMonitorAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteMonitorAttributeResponseBody</p>
     */
    public static class OptionJsonAssertions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("assertions")
        private java.util.List < Assertions> assertions;

        private OptionJsonAssertions(Builder builder) {
            this.assertions = builder.assertions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OptionJsonAssertions create() {
            return builder().build();
        }

        /**
         * @return assertions
         */
        public java.util.List < Assertions> getAssertions() {
            return this.assertions;
        }

        public static final class Builder {
            private java.util.List < Assertions> assertions; 

            /**
             * assertions.
             */
            public Builder assertions(java.util.List < Assertions> assertions) {
                this.assertions = assertions;
                return this;
            }

            public OptionJsonAssertions build() {
                return new OptionJsonAssertions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSiteMonitorAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteMonitorAttributeResponseBody</p>
     */
    public static class BlockedUrlList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("blocked_url_list")
        private java.util.List < String > blockedUrlList;

        private BlockedUrlList(Builder builder) {
            this.blockedUrlList = builder.blockedUrlList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockedUrlList create() {
            return builder().build();
        }

        /**
         * @return blockedUrlList
         */
        public java.util.List < String > getBlockedUrlList() {
            return this.blockedUrlList;
        }

        public static final class Builder {
            private java.util.List < String > blockedUrlList; 

            /**
             * blocked_url_list.
             */
            public Builder blockedUrlList(java.util.List < String > blockedUrlList) {
                this.blockedUrlList = blockedUrlList;
                return this;
            }

            public BlockedUrlList build() {
                return new BlockedUrlList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSiteMonitorAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteMonitorAttributeResponseBody</p>
     */
    public static class BrowserHeaders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("browser_headers")
        private java.util.List < java.util.Map<String, ?>> browserHeaders;

        private BrowserHeaders(Builder builder) {
            this.browserHeaders = builder.browserHeaders;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BrowserHeaders create() {
            return builder().build();
        }

        /**
         * @return browserHeaders
         */
        public java.util.List < java.util.Map<String, ?>> getBrowserHeaders() {
            return this.browserHeaders;
        }

        public static final class Builder {
            private java.util.List < java.util.Map<String, ?>> browserHeaders; 

            /**
             * browser_headers.
             */
            public Builder browserHeaders(java.util.List < java.util.Map<String, ?>> browserHeaders) {
                this.browserHeaders = browserHeaders;
                return this;
            }

            public BrowserHeaders build() {
                return new BrowserHeaders(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSiteMonitorAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteMonitorAttributeResponseBody</p>
     */
    public static class BrowserHosts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("browser_hosts")
        private java.util.List < String > browserHosts;

        private BrowserHosts(Builder builder) {
            this.browserHosts = builder.browserHosts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BrowserHosts create() {
            return builder().build();
        }

        /**
         * @return browserHosts
         */
        public java.util.List < String > getBrowserHosts() {
            return this.browserHosts;
        }

        public static final class Builder {
            private java.util.List < String > browserHosts; 

            /**
             * browser_hosts.
             */
            public Builder browserHosts(java.util.List < String > browserHosts) {
                this.browserHosts = browserHosts;
                return this;
            }

            public BrowserHosts build() {
                return new BrowserHosts(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSiteMonitorAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteMonitorAttributeResponseBody</p>
     */
    public static class BrowserInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("browser")
        private String browser;

        @com.aliyun.core.annotation.NameInMap("device")
        private String device;

        private BrowserInfo(Builder builder) {
            this.browser = builder.browser;
            this.device = builder.device;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BrowserInfo create() {
            return builder().build();
        }

        /**
         * @return browser
         */
        public String getBrowser() {
            return this.browser;
        }

        /**
         * @return device
         */
        public String getDevice() {
            return this.device;
        }

        public static final class Builder {
            private String browser; 
            private String device; 

            /**
             * browser.
             */
            public Builder browser(String browser) {
                this.browser = browser;
                return this;
            }

            /**
             * device.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            public BrowserInfo build() {
                return new BrowserInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSiteMonitorAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteMonitorAttributeResponseBody</p>
     */
    public static class OptionJsonBrowserInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("browser_info")
        private java.util.List < BrowserInfo> browserInfo;

        private OptionJsonBrowserInfo(Builder builder) {
            this.browserInfo = builder.browserInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OptionJsonBrowserInfo create() {
            return builder().build();
        }

        /**
         * @return browserInfo
         */
        public java.util.List < BrowserInfo> getBrowserInfo() {
            return this.browserInfo;
        }

        public static final class Builder {
            private java.util.List < BrowserInfo> browserInfo; 

            /**
             * browser_info.
             */
            public Builder browserInfo(java.util.List < BrowserInfo> browserInfo) {
                this.browserInfo = browserInfo;
                return this;
            }

            public OptionJsonBrowserInfo build() {
                return new OptionJsonBrowserInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSiteMonitorAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteMonitorAttributeResponseBody</p>
     */
    public static class ExpectExistString extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("expect_exist_string")
        private java.util.List < String > expectExistString;

        private ExpectExistString(Builder builder) {
            this.expectExistString = builder.expectExistString;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExpectExistString create() {
            return builder().build();
        }

        /**
         * @return expectExistString
         */
        public java.util.List < String > getExpectExistString() {
            return this.expectExistString;
        }

        public static final class Builder {
            private java.util.List < String > expectExistString; 

            /**
             * expect_exist_string.
             */
            public Builder expectExistString(java.util.List < String > expectExistString) {
                this.expectExistString = expectExistString;
                return this;
            }

            public ExpectExistString build() {
                return new ExpectExistString(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSiteMonitorAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteMonitorAttributeResponseBody</p>
     */
    public static class ExpectNonExistString extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("expect_non_exist_string")
        private java.util.List < String > expectNonExistString;

        private ExpectNonExistString(Builder builder) {
            this.expectNonExistString = builder.expectNonExistString;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExpectNonExistString create() {
            return builder().build();
        }

        /**
         * @return expectNonExistString
         */
        public java.util.List < String > getExpectNonExistString() {
            return this.expectNonExistString;
        }

        public static final class Builder {
            private java.util.List < String > expectNonExistString; 

            /**
             * expect_non_exist_string.
             */
            public Builder expectNonExistString(java.util.List < String > expectNonExistString) {
                this.expectNonExistString = expectNonExistString;
                return this;
            }

            public ExpectNonExistString build() {
                return new ExpectNonExistString(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSiteMonitorAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteMonitorAttributeResponseBody</p>
     */
    public static class QuicTarget extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("quic_target")
        private java.util.List < String > quicTarget;

        private QuicTarget(Builder builder) {
            this.quicTarget = builder.quicTarget;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuicTarget create() {
            return builder().build();
        }

        /**
         * @return quicTarget
         */
        public java.util.List < String > getQuicTarget() {
            return this.quicTarget;
        }

        public static final class Builder {
            private java.util.List < String > quicTarget; 

            /**
             * quic_target.
             */
            public Builder quicTarget(java.util.List < String > quicTarget) {
                this.quicTarget = quicTarget;
                return this;
            }

            public QuicTarget build() {
                return new QuicTarget(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSiteMonitorAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteMonitorAttributeResponseBody</p>
     */
    public static class TrafficHijackElementBlacklist extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("traffic_hijack_element_blacklist")
        private java.util.List < String > trafficHijackElementBlacklist;

        private TrafficHijackElementBlacklist(Builder builder) {
            this.trafficHijackElementBlacklist = builder.trafficHijackElementBlacklist;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficHijackElementBlacklist create() {
            return builder().build();
        }

        /**
         * @return trafficHijackElementBlacklist
         */
        public java.util.List < String > getTrafficHijackElementBlacklist() {
            return this.trafficHijackElementBlacklist;
        }

        public static final class Builder {
            private java.util.List < String > trafficHijackElementBlacklist; 

            /**
             * traffic_hijack_element_blacklist.
             */
            public Builder trafficHijackElementBlacklist(java.util.List < String > trafficHijackElementBlacklist) {
                this.trafficHijackElementBlacklist = trafficHijackElementBlacklist;
                return this;
            }

            public TrafficHijackElementBlacklist build() {
                return new TrafficHijackElementBlacklist(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSiteMonitorAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteMonitorAttributeResponseBody</p>
     */
    public static class TrafficHijackElementWhitelist extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("traffic_hijack_element_whitelist")
        private java.util.List < String > trafficHijackElementWhitelist;

        private TrafficHijackElementWhitelist(Builder builder) {
            this.trafficHijackElementWhitelist = builder.trafficHijackElementWhitelist;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficHijackElementWhitelist create() {
            return builder().build();
        }

        /**
         * @return trafficHijackElementWhitelist
         */
        public java.util.List < String > getTrafficHijackElementWhitelist() {
            return this.trafficHijackElementWhitelist;
        }

        public static final class Builder {
            private java.util.List < String > trafficHijackElementWhitelist; 

            /**
             * traffic_hijack_element_whitelist.
             */
            public Builder trafficHijackElementWhitelist(java.util.List < String > trafficHijackElementWhitelist) {
                this.trafficHijackElementWhitelist = trafficHijackElementWhitelist;
                return this;
            }

            public TrafficHijackElementWhitelist build() {
                return new TrafficHijackElementWhitelist(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSiteMonitorAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteMonitorAttributeResponseBody</p>
     */
    public static class OptionJson extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("assertions")
        private OptionJsonAssertions assertions;

        @com.aliyun.core.annotation.NameInMap("attempts")
        private Long attempts;

        @com.aliyun.core.annotation.NameInMap("authentication")
        private Integer authentication;

        @com.aliyun.core.annotation.NameInMap("blocked_url_list")
        private BlockedUrlList blockedUrlList;

        @com.aliyun.core.annotation.NameInMap("browser_headers")
        private BrowserHeaders browserHeaders;

        @com.aliyun.core.annotation.NameInMap("browser_hosts")
        private BrowserHosts browserHosts;

        @com.aliyun.core.annotation.NameInMap("browser_info")
        private OptionJsonBrowserInfo browserInfo;

        @com.aliyun.core.annotation.NameInMap("browser_insecure")
        private Boolean browserInsecure;

        @com.aliyun.core.annotation.NameInMap("browser_task_version")
        private String browserTaskVersion;

        @com.aliyun.core.annotation.NameInMap("cookie")
        private String cookie;

        @com.aliyun.core.annotation.NameInMap("diagnosis_mtr")
        private Boolean diagnosisMtr;

        @com.aliyun.core.annotation.NameInMap("diagnosis_ping")
        private Boolean diagnosisPing;

        @com.aliyun.core.annotation.NameInMap("dns_hijack_whitelist")
        private String dnsHijackWhitelist;

        @com.aliyun.core.annotation.NameInMap("dns_match_rule")
        private String dnsMatchRule;

        @com.aliyun.core.annotation.NameInMap("dns_server")
        private String dnsServer;

        @com.aliyun.core.annotation.NameInMap("dns_type")
        private String dnsType;

        @com.aliyun.core.annotation.NameInMap("empty_message")
        private Boolean emptyMessage;

        @com.aliyun.core.annotation.NameInMap("expect_exist_string")
        private ExpectExistString expectExistString;

        @com.aliyun.core.annotation.NameInMap("expect_non_exist_string")
        private ExpectNonExistString expectNonExistString;

        @com.aliyun.core.annotation.NameInMap("expect_value")
        private String expectValue;

        @com.aliyun.core.annotation.NameInMap("failure_rate")
        private Float failureRate;

        @com.aliyun.core.annotation.NameInMap("header")
        private String header;

        @com.aliyun.core.annotation.NameInMap("host_binding")
        private String hostBinding;

        @com.aliyun.core.annotation.NameInMap("host_binding_type")
        private Integer hostBindingType;

        @com.aliyun.core.annotation.NameInMap("http_method")
        private String httpMethod;

        @com.aliyun.core.annotation.NameInMap("ip_network")
        private String ipNetwork;

        @com.aliyun.core.annotation.NameInMap("isBase64Encode")
        private String isBase64Encode;

        @com.aliyun.core.annotation.NameInMap("match_rule")
        private Integer matchRule;

        @com.aliyun.core.annotation.NameInMap("min_tls_version")
        private String minTlsVersion;

        @com.aliyun.core.annotation.NameInMap("password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("ping_num")
        private Integer pingNum;

        @com.aliyun.core.annotation.NameInMap("ping_port")
        private Integer pingPort;

        @com.aliyun.core.annotation.NameInMap("ping_type")
        private String pingType;

        @com.aliyun.core.annotation.NameInMap("port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("quic_enabled")
        private Boolean quicEnabled;

        @com.aliyun.core.annotation.NameInMap("quic_target")
        private QuicTarget quicTarget;

        @com.aliyun.core.annotation.NameInMap("request_content")
        private String requestContent;

        @com.aliyun.core.annotation.NameInMap("request_format")
        private String requestFormat;

        @com.aliyun.core.annotation.NameInMap("response_content")
        private String responseContent;

        @com.aliyun.core.annotation.NameInMap("response_format")
        private String responseFormat;

        @com.aliyun.core.annotation.NameInMap("retry_delay")
        private Integer retryDelay;

        @com.aliyun.core.annotation.NameInMap("screen_shot")
        private Boolean screenShot;

        @com.aliyun.core.annotation.NameInMap("scroll_end")
        private Boolean scrollEnd;

        @com.aliyun.core.annotation.NameInMap("strict_mode")
        private Boolean strictMode;

        @com.aliyun.core.annotation.NameInMap("time_out")
        private Long timeOut;

        @com.aliyun.core.annotation.NameInMap("traffic_hijack_element_blacklist")
        private TrafficHijackElementBlacklist trafficHijackElementBlacklist;

        @com.aliyun.core.annotation.NameInMap("traffic_hijack_element_count")
        private Integer trafficHijackElementCount;

        @com.aliyun.core.annotation.NameInMap("traffic_hijack_element_whitelist")
        private TrafficHijackElementWhitelist trafficHijackElementWhitelist;

        @com.aliyun.core.annotation.NameInMap("username")
        private String username;

        @com.aliyun.core.annotation.NameInMap("waitTime_after_completion")
        private Integer waitTimeAfterCompletion;

        private OptionJson(Builder builder) {
            this.assertions = builder.assertions;
            this.attempts = builder.attempts;
            this.authentication = builder.authentication;
            this.blockedUrlList = builder.blockedUrlList;
            this.browserHeaders = builder.browserHeaders;
            this.browserHosts = builder.browserHosts;
            this.browserInfo = builder.browserInfo;
            this.browserInsecure = builder.browserInsecure;
            this.browserTaskVersion = builder.browserTaskVersion;
            this.cookie = builder.cookie;
            this.diagnosisMtr = builder.diagnosisMtr;
            this.diagnosisPing = builder.diagnosisPing;
            this.dnsHijackWhitelist = builder.dnsHijackWhitelist;
            this.dnsMatchRule = builder.dnsMatchRule;
            this.dnsServer = builder.dnsServer;
            this.dnsType = builder.dnsType;
            this.emptyMessage = builder.emptyMessage;
            this.expectExistString = builder.expectExistString;
            this.expectNonExistString = builder.expectNonExistString;
            this.expectValue = builder.expectValue;
            this.failureRate = builder.failureRate;
            this.header = builder.header;
            this.hostBinding = builder.hostBinding;
            this.hostBindingType = builder.hostBindingType;
            this.httpMethod = builder.httpMethod;
            this.ipNetwork = builder.ipNetwork;
            this.isBase64Encode = builder.isBase64Encode;
            this.matchRule = builder.matchRule;
            this.minTlsVersion = builder.minTlsVersion;
            this.password = builder.password;
            this.pingNum = builder.pingNum;
            this.pingPort = builder.pingPort;
            this.pingType = builder.pingType;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.quicEnabled = builder.quicEnabled;
            this.quicTarget = builder.quicTarget;
            this.requestContent = builder.requestContent;
            this.requestFormat = builder.requestFormat;
            this.responseContent = builder.responseContent;
            this.responseFormat = builder.responseFormat;
            this.retryDelay = builder.retryDelay;
            this.screenShot = builder.screenShot;
            this.scrollEnd = builder.scrollEnd;
            this.strictMode = builder.strictMode;
            this.timeOut = builder.timeOut;
            this.trafficHijackElementBlacklist = builder.trafficHijackElementBlacklist;
            this.trafficHijackElementCount = builder.trafficHijackElementCount;
            this.trafficHijackElementWhitelist = builder.trafficHijackElementWhitelist;
            this.username = builder.username;
            this.waitTimeAfterCompletion = builder.waitTimeAfterCompletion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OptionJson create() {
            return builder().build();
        }

        /**
         * @return assertions
         */
        public OptionJsonAssertions getAssertions() {
            return this.assertions;
        }

        /**
         * @return attempts
         */
        public Long getAttempts() {
            return this.attempts;
        }

        /**
         * @return authentication
         */
        public Integer getAuthentication() {
            return this.authentication;
        }

        /**
         * @return blockedUrlList
         */
        public BlockedUrlList getBlockedUrlList() {
            return this.blockedUrlList;
        }

        /**
         * @return browserHeaders
         */
        public BrowserHeaders getBrowserHeaders() {
            return this.browserHeaders;
        }

        /**
         * @return browserHosts
         */
        public BrowserHosts getBrowserHosts() {
            return this.browserHosts;
        }

        /**
         * @return browserInfo
         */
        public OptionJsonBrowserInfo getBrowserInfo() {
            return this.browserInfo;
        }

        /**
         * @return browserInsecure
         */
        public Boolean getBrowserInsecure() {
            return this.browserInsecure;
        }

        /**
         * @return browserTaskVersion
         */
        public String getBrowserTaskVersion() {
            return this.browserTaskVersion;
        }

        /**
         * @return cookie
         */
        public String getCookie() {
            return this.cookie;
        }

        /**
         * @return diagnosisMtr
         */
        public Boolean getDiagnosisMtr() {
            return this.diagnosisMtr;
        }

        /**
         * @return diagnosisPing
         */
        public Boolean getDiagnosisPing() {
            return this.diagnosisPing;
        }

        /**
         * @return dnsHijackWhitelist
         */
        public String getDnsHijackWhitelist() {
            return this.dnsHijackWhitelist;
        }

        /**
         * @return dnsMatchRule
         */
        public String getDnsMatchRule() {
            return this.dnsMatchRule;
        }

        /**
         * @return dnsServer
         */
        public String getDnsServer() {
            return this.dnsServer;
        }

        /**
         * @return dnsType
         */
        public String getDnsType() {
            return this.dnsType;
        }

        /**
         * @return emptyMessage
         */
        public Boolean getEmptyMessage() {
            return this.emptyMessage;
        }

        /**
         * @return expectExistString
         */
        public ExpectExistString getExpectExistString() {
            return this.expectExistString;
        }

        /**
         * @return expectNonExistString
         */
        public ExpectNonExistString getExpectNonExistString() {
            return this.expectNonExistString;
        }

        /**
         * @return expectValue
         */
        public String getExpectValue() {
            return this.expectValue;
        }

        /**
         * @return failureRate
         */
        public Float getFailureRate() {
            return this.failureRate;
        }

        /**
         * @return header
         */
        public String getHeader() {
            return this.header;
        }

        /**
         * @return hostBinding
         */
        public String getHostBinding() {
            return this.hostBinding;
        }

        /**
         * @return hostBindingType
         */
        public Integer getHostBindingType() {
            return this.hostBindingType;
        }

        /**
         * @return httpMethod
         */
        public String getHttpMethod() {
            return this.httpMethod;
        }

        /**
         * @return ipNetwork
         */
        public String getIpNetwork() {
            return this.ipNetwork;
        }

        /**
         * @return isBase64Encode
         */
        public String getIsBase64Encode() {
            return this.isBase64Encode;
        }

        /**
         * @return matchRule
         */
        public Integer getMatchRule() {
            return this.matchRule;
        }

        /**
         * @return minTlsVersion
         */
        public String getMinTlsVersion() {
            return this.minTlsVersion;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return pingNum
         */
        public Integer getPingNum() {
            return this.pingNum;
        }

        /**
         * @return pingPort
         */
        public Integer getPingPort() {
            return this.pingPort;
        }

        /**
         * @return pingType
         */
        public String getPingType() {
            return this.pingType;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return quicEnabled
         */
        public Boolean getQuicEnabled() {
            return this.quicEnabled;
        }

        /**
         * @return quicTarget
         */
        public QuicTarget getQuicTarget() {
            return this.quicTarget;
        }

        /**
         * @return requestContent
         */
        public String getRequestContent() {
            return this.requestContent;
        }

        /**
         * @return requestFormat
         */
        public String getRequestFormat() {
            return this.requestFormat;
        }

        /**
         * @return responseContent
         */
        public String getResponseContent() {
            return this.responseContent;
        }

        /**
         * @return responseFormat
         */
        public String getResponseFormat() {
            return this.responseFormat;
        }

        /**
         * @return retryDelay
         */
        public Integer getRetryDelay() {
            return this.retryDelay;
        }

        /**
         * @return screenShot
         */
        public Boolean getScreenShot() {
            return this.screenShot;
        }

        /**
         * @return scrollEnd
         */
        public Boolean getScrollEnd() {
            return this.scrollEnd;
        }

        /**
         * @return strictMode
         */
        public Boolean getStrictMode() {
            return this.strictMode;
        }

        /**
         * @return timeOut
         */
        public Long getTimeOut() {
            return this.timeOut;
        }

        /**
         * @return trafficHijackElementBlacklist
         */
        public TrafficHijackElementBlacklist getTrafficHijackElementBlacklist() {
            return this.trafficHijackElementBlacklist;
        }

        /**
         * @return trafficHijackElementCount
         */
        public Integer getTrafficHijackElementCount() {
            return this.trafficHijackElementCount;
        }

        /**
         * @return trafficHijackElementWhitelist
         */
        public TrafficHijackElementWhitelist getTrafficHijackElementWhitelist() {
            return this.trafficHijackElementWhitelist;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        /**
         * @return waitTimeAfterCompletion
         */
        public Integer getWaitTimeAfterCompletion() {
            return this.waitTimeAfterCompletion;
        }

        public static final class Builder {
            private OptionJsonAssertions assertions; 
            private Long attempts; 
            private Integer authentication; 
            private BlockedUrlList blockedUrlList; 
            private BrowserHeaders browserHeaders; 
            private BrowserHosts browserHosts; 
            private OptionJsonBrowserInfo browserInfo; 
            private Boolean browserInsecure; 
            private String browserTaskVersion; 
            private String cookie; 
            private Boolean diagnosisMtr; 
            private Boolean diagnosisPing; 
            private String dnsHijackWhitelist; 
            private String dnsMatchRule; 
            private String dnsServer; 
            private String dnsType; 
            private Boolean emptyMessage; 
            private ExpectExistString expectExistString; 
            private ExpectNonExistString expectNonExistString; 
            private String expectValue; 
            private Float failureRate; 
            private String header; 
            private String hostBinding; 
            private Integer hostBindingType; 
            private String httpMethod; 
            private String ipNetwork; 
            private String isBase64Encode; 
            private Integer matchRule; 
            private String minTlsVersion; 
            private String password; 
            private Integer pingNum; 
            private Integer pingPort; 
            private String pingType; 
            private Integer port; 
            private String protocol; 
            private Boolean quicEnabled; 
            private QuicTarget quicTarget; 
            private String requestContent; 
            private String requestFormat; 
            private String responseContent; 
            private String responseFormat; 
            private Integer retryDelay; 
            private Boolean screenShot; 
            private Boolean scrollEnd; 
            private Boolean strictMode; 
            private Long timeOut; 
            private TrafficHijackElementBlacklist trafficHijackElementBlacklist; 
            private Integer trafficHijackElementCount; 
            private TrafficHijackElementWhitelist trafficHijackElementWhitelist; 
            private String username; 
            private Integer waitTimeAfterCompletion; 

            /**
             * assertions.
             */
            public Builder assertions(OptionJsonAssertions assertions) {
                this.assertions = assertions;
                return this;
            }

            /**
             * <p>The number of retries after a DNS failure occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder attempts(Long attempts) {
                this.attempts = attempts;
                return this;
            }

            /**
             * <p>Indicates whether the security authentication feature is enabled. Valid values:</p>
             * <ul>
             * <li>0: The feature is disabled.</li>
             * <li>1: The feature is enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder authentication(Integer authentication) {
                this.authentication = authentication;
                return this;
            }

            /**
             * blocked_url_list.
             */
            public Builder blockedUrlList(BlockedUrlList blockedUrlList) {
                this.blockedUrlList = blockedUrlList;
                return this;
            }

            /**
             * browser_headers.
             */
            public Builder browserHeaders(BrowserHeaders browserHeaders) {
                this.browserHeaders = browserHeaders;
                return this;
            }

            /**
             * browser_hosts.
             */
            public Builder browserHosts(BrowserHosts browserHosts) {
                this.browserHosts = browserHosts;
                return this;
            }

            /**
             * browser_info.
             */
            public Builder browserInfo(OptionJsonBrowserInfo browserInfo) {
                this.browserInfo = browserInfo;
                return this;
            }

            /**
             * browser_insecure.
             */
            public Builder browserInsecure(Boolean browserInsecure) {
                this.browserInsecure = browserInsecure;
                return this;
            }

            /**
             * browser_task_version.
             */
            public Builder browserTaskVersion(String browserTaskVersion) {
                this.browserTaskVersion = browserTaskVersion;
                return this;
            }

            /**
             * <p>The cookie of the HTTP request.</p>
             * 
             * <strong>example:</strong>
             * <p>lang=en</p>
             */
            public Builder cookie(String cookie) {
                this.cookie = cookie;
                return this;
            }

            /**
             * diagnosis_mtr.
             */
            public Builder diagnosisMtr(Boolean diagnosisMtr) {
                this.diagnosisMtr = diagnosisMtr;
                return this;
            }

            /**
             * diagnosis_ping.
             */
            public Builder diagnosisPing(Boolean diagnosisPing) {
                this.diagnosisPing = diagnosisPing;
                return this;
            }

            /**
             * dns_hijack_whitelist.
             */
            public Builder dnsHijackWhitelist(String dnsHijackWhitelist) {
                this.dnsHijackWhitelist = dnsHijackWhitelist;
                return this;
            }

            /**
             * <p>The relationship between the list of expected aliases or IP addresses and the list of DNS results. Valid values:</p>
             * <ul>
             * <li>IN_DNS: The list of expected values is a subset of the list of DNS results.</li>
             * <li>DNS_IN: The list of DNS results is a subset of the list of expected values.</li>
             * <li>EQUAL: The list of DNS results is the same as the list of expected values.</li>
             * <li>ANY: The list of DNS results intersects with the list of expected values.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IN_DNS</p>
             */
            public Builder dnsMatchRule(String dnsMatchRule) {
                this.dnsMatchRule = dnsMatchRule;
                return this;
            }

            /**
             * <p>The IP address of the DNS server.</p>
             * <blockquote>
             * <p> This parameter is returned only if the TaskType parameter is set to DNS.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder dnsServer(String dnsServer) {
                this.dnsServer = dnsServer;
                return this;
            }

            /**
             * <p>The type of the DNS record. This parameter is returned only if the TaskType parameter is set to DNS. Valid values:</p>
             * <ul>
             * <li>A (default): a record that specifies an IP address related to the specified host name or domain name.</li>
             * <li>CNAME: a record that maps multiple domain names to a domain name.</li>
             * <li>NS: a record that specifies a DNS server used to parse domain names.</li>
             * <li>MX: a record that links domain names to the address of a mail server.</li>
             * <li>TXT: a record that stores the text information of host name or domain names. The text must be 1 to 512 bytes in length. The TXT record serves as a Sender Policy Framework (SPF) record to fight against spam.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>A</p>
             */
            public Builder dnsType(String dnsType) {
                this.dnsType = dnsType;
                return this;
            }

            /**
             * empty_message.
             */
            public Builder emptyMessage(Boolean emptyMessage) {
                this.emptyMessage = emptyMessage;
                return this;
            }

            /**
             * expect_exist_string.
             */
            public Builder expectExistString(ExpectExistString expectExistString) {
                this.expectExistString = expectExistString;
                return this;
            }

            /**
             * expect_non_exist_string.
             */
            public Builder expectNonExistString(ExpectNonExistString expectNonExistString) {
                this.expectNonExistString = expectNonExistString;
                return this;
            }

            /**
             * <p>The domain name or alias to be parsed.</p>
             * <blockquote>
             * <p> This parameter is returned only if the TaskType parameter is set to DNS.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>dns_server</p>
             */
            public Builder expectValue(String expectValue) {
                this.expectValue = expectValue;
                return this;
            }

            /**
             * <p>The packet loss rate.</p>
             * <blockquote>
             * <p> This parameter is returned only if the TaskType parameter is set to PING.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0.4</p>
             */
            public Builder failureRate(Float failureRate) {
                this.failureRate = failureRate;
                return this;
            }

            /**
             * <p>The header of the HTTP request.</p>
             * 
             * <strong>example:</strong>
             * <p>testKey:testValue</p>
             */
            public Builder header(String header) {
                this.header = header;
                return this;
            }

            /**
             * host_binding.
             */
            public Builder hostBinding(String hostBinding) {
                this.hostBinding = hostBinding;
                return this;
            }

            /**
             * host_binding_type.
             */
            public Builder hostBindingType(Integer hostBindingType) {
                this.hostBindingType = hostBindingType;
                return this;
            }

            /**
             * <p>The HTTP request method. Valid values:</p>
             * <ul>
             * <li>get</li>
             * <li>post</li>
             * <li>head</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>get</p>
             */
            public Builder httpMethod(String httpMethod) {
                this.httpMethod = httpMethod;
                return this;
            }

            /**
             * <p>ip_network indicates the network type of the task. Valid values: v4, v6, and auto. Default value: v4.</p>
             * 
             * <strong>example:</strong>
             * <p>v4</p>
             */
            public Builder ipNetwork(String ipNetwork) {
                this.ipNetwork = ipNetwork;
                return this;
            }

            /**
             * isBase64Encode.
             */
            public Builder isBase64Encode(String isBase64Encode) {
                this.isBase64Encode = isBase64Encode;
                return this;
            }

            /**
             * <p>Indicates whether the alert rule is included. Valid values:</p>
             * <ul>
             * <li>0: The alert rule is included.</li>
             * <li>1: The alert rule is excluded.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder matchRule(Integer matchRule) {
                this.matchRule = matchRule;
                return this;
            }

            /**
             * min_tls_version.
             */
            public Builder minTlsVersion(String minTlsVersion) {
                this.minTlsVersion = minTlsVersion;
                return this;
            }

            /**
             * <p>The password of the SMTP, POP3, or FTP protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>123****</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The heartbeat of the PING protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>29</p>
             */
            public Builder pingNum(Integer pingNum) {
                this.pingNum = pingNum;
                return this;
            }

            /**
             * ping_port.
             */
            public Builder pingPort(Integer pingPort) {
                this.pingPort = pingPort;
                return this;
            }

            /**
             * <p>The PING protocol type. Valid values:</p>
             * <ul>
             * <li>icmp</li>
             * <li>tcp</li>
             * <li>udp</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>icmp,tcp,udp</p>
             */
            public Builder pingType(String pingType) {
                this.pingType = pingType;
                return this;
            }

            /**
             * <p>The port number of the TCP, UDP, SMTP, or POP3 protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>110</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol that is used to send the request.</p>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>Indicates whether the Quick UDP Internet Connections (QUIC) protocol is used for browser detection. Valid values: true false Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder quicEnabled(Boolean quicEnabled) {
                this.quicEnabled = quicEnabled;
                return this;
            }

            /**
             * <p>The sites for which the QUIC protocol is forcibly used.</p>
             */
            public Builder quicTarget(QuicTarget quicTarget) {
                this.quicTarget = quicTarget;
                return this;
            }

            /**
             * <p>The content of the HTTP request.</p>
             * 
             * <strong>example:</strong>
             * <p>aa=bb</p>
             */
            public Builder requestContent(String requestContent) {
                this.requestContent = requestContent;
                return this;
            }

            /**
             * <p>The format of the HTTP request. Valid values:</p>
             * <ul>
             * <li>hex: hexadecimal</li>
             * <li>txt: text</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>txt</p>
             */
            public Builder requestFormat(String requestFormat) {
                this.requestFormat = requestFormat;
                return this;
            }

            /**
             * <p>The response to the HTTP request.</p>
             * 
             * <strong>example:</strong>
             * <p>txt</p>
             */
            public Builder responseContent(String responseContent) {
                this.responseContent = responseContent;
                return this;
            }

            /**
             * <p>The format of the HTTP response. Valid values:</p>
             * <ul>
             * <li>hex: hexadecimal</li>
             * <li>txt: text</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>txt</p>
             */
            public Builder responseFormat(String responseFormat) {
                this.responseFormat = responseFormat;
                return this;
            }

            /**
             * retry_delay.
             */
            public Builder retryDelay(Integer retryDelay) {
                this.retryDelay = retryDelay;
                return this;
            }

            /**
             * <p>是否开启页面截图</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder screenShot(Boolean screenShot) {
                this.screenShot = screenShot;
                return this;
            }

            /**
             * scroll_end.
             */
            public Builder scrollEnd(Boolean scrollEnd) {
                this.scrollEnd = scrollEnd;
                return this;
            }

            /**
             * strict_mode.
             */
            public Builder strictMode(Boolean strictMode) {
                this.strictMode = strictMode;
                return this;
            }

            /**
             * <p>The timeout period. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder timeOut(Long timeOut) {
                this.timeOut = timeOut;
                return this;
            }

            /**
             * traffic_hijack_element_blacklist.
             */
            public Builder trafficHijackElementBlacklist(TrafficHijackElementBlacklist trafficHijackElementBlacklist) {
                this.trafficHijackElementBlacklist = trafficHijackElementBlacklist;
                return this;
            }

            /**
             * traffic_hijack_element_count.
             */
            public Builder trafficHijackElementCount(Integer trafficHijackElementCount) {
                this.trafficHijackElementCount = trafficHijackElementCount;
                return this;
            }

            /**
             * traffic_hijack_element_whitelist.
             */
            public Builder trafficHijackElementWhitelist(TrafficHijackElementWhitelist trafficHijackElementWhitelist) {
                this.trafficHijackElementWhitelist = trafficHijackElementWhitelist;
                return this;
            }

            /**
             * <p>The username of the FTP, SMTP, or POP3 protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>testUser</p>
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            /**
             * waitTime_after_completion.
             */
            public Builder waitTimeAfterCompletion(Integer waitTimeAfterCompletion) {
                this.waitTimeAfterCompletion = waitTimeAfterCompletion;
                return this;
            }

            public OptionJson build() {
                return new OptionJson(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSiteMonitorAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteMonitorAttributeResponseBody</p>
     */
    public static class VpcConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VswitchId")
        private String vswitchId;

        private VpcConfig(Builder builder) {
            this.region = builder.region;
            this.securityGroupId = builder.securityGroupId;
            this.vpcId = builder.vpcId;
            this.vswitchId = builder.vswitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcConfig create() {
            return builder().build();
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        public static final class Builder {
            private String region; 
            private String securityGroupId; 
            private String vpcId; 
            private String vswitchId; 

            /**
             * <p>内网拨测任务的目标站点所在地域。</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VswitchId.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            public VpcConfig build() {
                return new VpcConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSiteMonitorAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteMonitorAttributeResponseBody</p>
     */
    public static class SiteMonitors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("AgentGroup")
        private String agentGroup;

        @com.aliyun.core.annotation.NameInMap("CustomSchedule")
        private CustomSchedule customSchedule;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private String interval;

        @com.aliyun.core.annotation.NameInMap("IspCities")
        private IspCities ispCities;

        @com.aliyun.core.annotation.NameInMap("OptionJson")
        private OptionJson optionJson;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TaskState")
        private String taskState;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("VpcConfig")
        private VpcConfig vpcConfig;

        private SiteMonitors(Builder builder) {
            this.address = builder.address;
            this.agentGroup = builder.agentGroup;
            this.customSchedule = builder.customSchedule;
            this.interval = builder.interval;
            this.ispCities = builder.ispCities;
            this.optionJson = builder.optionJson;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
            this.taskState = builder.taskState;
            this.taskType = builder.taskType;
            this.vpcConfig = builder.vpcConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SiteMonitors create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return agentGroup
         */
        public String getAgentGroup() {
            return this.agentGroup;
        }

        /**
         * @return customSchedule
         */
        public CustomSchedule getCustomSchedule() {
            return this.customSchedule;
        }

        /**
         * @return interval
         */
        public String getInterval() {
            return this.interval;
        }

        /**
         * @return ispCities
         */
        public IspCities getIspCities() {
            return this.ispCities;
        }

        /**
         * @return optionJson
         */
        public OptionJson getOptionJson() {
            return this.optionJson;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskState
         */
        public String getTaskState() {
            return this.taskState;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return vpcConfig
         */
        public VpcConfig getVpcConfig() {
            return this.vpcConfig;
        }

        public static final class Builder {
            private String address; 
            private String agentGroup; 
            private CustomSchedule customSchedule; 
            private String interval; 
            private IspCities ispCities; 
            private OptionJson optionJson; 
            private String taskId; 
            private String taskName; 
            private String taskState; 
            private String taskType; 
            private VpcConfig vpcConfig; 

            /**
             * <p>The URL that is monitored by the site monitoring task.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://aliyun.com">https://aliyun.com</a></p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * AgentGroup.
             */
            public Builder agentGroup(String agentGroup) {
                this.agentGroup = agentGroup;
                return this;
            }

            /**
             * CustomSchedule.
             */
            public Builder customSchedule(CustomSchedule customSchedule) {
                this.customSchedule = customSchedule;
                return this;
            }

            /**
             * <p>The interval at which the site monitoring task is executed. Unit: minutes. Valid values: 1, 5, 15, 30, and 60.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder interval(String interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The information of detection points. The information includes the carriers that provide the detection points and the cities where the detection points reside.</p>
             */
            public Builder ispCities(IspCities ispCities) {
                this.ispCities = ispCities;
                return this;
            }

            /**
             * <p>The extended options of the site monitoring task. The options vary based on the specified protocol. For more information, see <a href="https://help.aliyun.com/document_detail/115048.html">CreateSiteMonitor</a>.</p>
             */
            public Builder optionJson(OptionJson optionJson) {
                this.optionJson = optionJson;
                return this;
            }

            /**
             * <p>The ID of the site monitoring task.</p>
             * 
             * <strong>example:</strong>
             * <p>cc641dff-c19d-45f3-ad0a-818a0c4f****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The name of the site monitoring task.</p>
             * 
             * <strong>example:</strong>
             * <p>test123</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The status of the site monitoring task. Valid values:</p>
             * <ul>
             * <li>1: The task is enabled.</li>
             * <li>2: The task is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder taskState(String taskState) {
                this.taskState = taskState;
                return this;
            }

            /**
             * <p>The protocol that is used by the site monitoring task. Valid values: HTTP, HTTPS, PING, TCP, UDP, DNS, SMTP, POP3, and FTP.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * VpcConfig.
             */
            public Builder vpcConfig(VpcConfig vpcConfig) {
                this.vpcConfig = vpcConfig;
                return this;
            }

            public SiteMonitors build() {
                return new SiteMonitors(this);
            } 

        } 

    }
}
