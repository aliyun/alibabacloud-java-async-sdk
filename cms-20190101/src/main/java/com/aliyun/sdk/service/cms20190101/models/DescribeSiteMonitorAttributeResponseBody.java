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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeSiteMonitorAttributeResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.metricRules = model.metricRules;
            this.requestId = model.requestId;
            this.siteMonitors = model.siteMonitors;
            this.success = model.success;
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
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * MetricRules.
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
         * <p>The details of the monitoring task.</p>
         */
        public Builder siteMonitors(SiteMonitors siteMonitors) {
            this.siteMonitors = siteMonitors;
            return this;
        }

        /**
         * <p>Indicates whether the operation is successful. Valid values:</p>
         * <ul>
         * <li>true: Successful.</li>
         * <li>false: Failed.</li>
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

            private Builder() {
            } 

            private Builder(MetricRule model) {
                this.actionEnable = model.actionEnable;
                this.alarmActions = model.alarmActions;
                this.comparisonOperator = model.comparisonOperator;
                this.dimensions = model.dimensions;
                this.evaluationCount = model.evaluationCount;
                this.expression = model.expression;
                this.level = model.level;
                this.metricName = model.metricName;
                this.namespace = model.namespace;
                this.okActions = model.okActions;
                this.period = model.period;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.stateValue = model.stateValue;
                this.statistics = model.statistics;
                this.threshold = model.threshold;
            } 

            /**
             * ActionEnable.
             */
            public Builder actionEnable(String actionEnable) {
                this.actionEnable = actionEnable;
                return this;
            }

            /**
             * AlarmActions.
             */
            public Builder alarmActions(String alarmActions) {
                this.alarmActions = alarmActions;
                return this;
            }

            /**
             * ComparisonOperator.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
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
             * EvaluationCount.
             */
            public Builder evaluationCount(String evaluationCount) {
                this.evaluationCount = evaluationCount;
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
             * Level.
             */
            public Builder level(String level) {
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
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * OkActions.
             */
            public Builder okActions(String okActions) {
                this.okActions = okActions;
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
             * StateValue.
             */
            public Builder stateValue(String stateValue) {
                this.stateValue = stateValue;
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
        private java.util.List<MetricRule> metricRule;

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
        public java.util.List<MetricRule> getMetricRule() {
            return this.metricRule;
        }

        public static final class Builder {
            private java.util.List<MetricRule> metricRule; 

            private Builder() {
            } 

            private Builder(MetricRules model) {
                this.metricRule = model.metricRule;
            } 

            /**
             * MetricRule.
             */
            public Builder metricRule(java.util.List<MetricRule> metricRule) {
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
        private java.util.List<Integer> days;

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
        public java.util.List<Integer> getDays() {
            return this.days;
        }

        public static final class Builder {
            private java.util.List<Integer> days; 

            private Builder() {
            } 

            private Builder(Days model) {
                this.days = model.days;
            } 

            /**
             * days.
             */
            public Builder days(java.util.List<Integer> days) {
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

            private Builder() {
            } 

            private Builder(CustomSchedule model) {
                this.days = model.days;
                this.endHour = model.endHour;
                this.startHour = model.startHour;
                this.timeZone = model.timeZone;
            } 

            /**
             * days.
             */
            public Builder days(Days days) {
                this.days = days;
                return this;
            }

            /**
             * <p>The custom detection end time.
             * Unit: hours.</p>
             * 
             * <strong>example:</strong>
             * <p>18</p>
             */
            public Builder endHour(Integer endHour) {
                this.endHour = endHour;
                return this;
            }

            /**
             * <p>The custom detection start time.
             * Unit: hours.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder startHour(Integer startHour) {
                this.startHour = startHour;
                return this;
            }

            /**
             * <p>The time zone for the custom detection.</p>
             * 
             * <strong>example:</strong>
             * <p>local</p>
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

            private Builder() {
            } 

            private Builder(IspCity model) {
                this.city = model.city;
                this.cityName = model.cityName;
                this.isp = model.isp;
                this.ispName = model.ispName;
                this.type = model.type;
            } 

            /**
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * CityName.
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * Isp.
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * IspName.
             */
            public Builder ispName(String ispName) {
                this.ispName = ispName;
                return this;
            }

            /**
             * Type.
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
        private java.util.List<IspCity> ispCity;

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
        public java.util.List<IspCity> getIspCity() {
            return this.ispCity;
        }

        public static final class Builder {
            private java.util.List<IspCity> ispCity; 

            private Builder() {
            } 

            private Builder(IspCities model) {
                this.ispCity = model.ispCity;
            } 

            /**
             * IspCity.
             */
            public Builder ispCity(java.util.List<IspCity> ispCity) {
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

            private Builder() {
            } 

            private Builder(Assertions model) {
                this.operator = model.operator;
                this.property = model.property;
                this.target = model.target;
                this.type = model.type;
            } 

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
        private java.util.List<Assertions> assertions;

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
        public java.util.List<Assertions> getAssertions() {
            return this.assertions;
        }

        public static final class Builder {
            private java.util.List<Assertions> assertions; 

            private Builder() {
            } 

            private Builder(OptionJsonAssertions model) {
                this.assertions = model.assertions;
            } 

            /**
             * assertions.
             */
            public Builder assertions(java.util.List<Assertions> assertions) {
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
    public static class Scopes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("scopes")
        private java.util.List<String> scopes;

        private Scopes(Builder builder) {
            this.scopes = builder.scopes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scopes create() {
            return builder().build();
        }

        /**
         * @return scopes
         */
        public java.util.List<String> getScopes() {
            return this.scopes;
        }

        public static final class Builder {
            private java.util.List<String> scopes; 

            private Builder() {
            } 

            private Builder(Scopes model) {
                this.scopes = model.scopes;
            } 

            /**
             * scopes.
             */
            public Builder scopes(java.util.List<String> scopes) {
                this.scopes = scopes;
                return this;
            }

            public Scopes build() {
                return new Scopes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSiteMonitorAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteMonitorAttributeResponseBody</p>
     */
    public static class AuthInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("access_key_id")
        private String accessKeyId;

        @com.aliyun.core.annotation.NameInMap("access_key_secret")
        private String accessKeySecret;

        @com.aliyun.core.annotation.NameInMap("api_action")
        private String apiAction;

        @com.aliyun.core.annotation.NameInMap("api_version")
        private String apiVersion;

        @com.aliyun.core.annotation.NameInMap("auth_style")
        private String authStyle;

        @com.aliyun.core.annotation.NameInMap("client_id")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("client_secret")
        private String clientSecret;

        @com.aliyun.core.annotation.NameInMap("grant_type")
        private String grantType;

        @com.aliyun.core.annotation.NameInMap("password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("region_id")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("scopes")
        private Scopes scopes;

        @com.aliyun.core.annotation.NameInMap("service_name")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("session_token")
        private String sessionToken;

        @com.aliyun.core.annotation.NameInMap("token_url")
        private String tokenUrl;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("use_cookie_session_key")
        private Boolean useCookieSessionKey;

        @com.aliyun.core.annotation.NameInMap("username")
        private String username;

        @com.aliyun.core.annotation.NameInMap("with_addon_resources")
        private Boolean withAddonResources;

        private AuthInfo(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.accessKeySecret = builder.accessKeySecret;
            this.apiAction = builder.apiAction;
            this.apiVersion = builder.apiVersion;
            this.authStyle = builder.authStyle;
            this.clientId = builder.clientId;
            this.clientSecret = builder.clientSecret;
            this.grantType = builder.grantType;
            this.password = builder.password;
            this.regionId = builder.regionId;
            this.scopes = builder.scopes;
            this.serviceName = builder.serviceName;
            this.sessionToken = builder.sessionToken;
            this.tokenUrl = builder.tokenUrl;
            this.type = builder.type;
            this.useCookieSessionKey = builder.useCookieSessionKey;
            this.username = builder.username;
            this.withAddonResources = builder.withAddonResources;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthInfo create() {
            return builder().build();
        }

        /**
         * @return accessKeyId
         */
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        /**
         * @return accessKeySecret
         */
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        /**
         * @return apiAction
         */
        public String getApiAction() {
            return this.apiAction;
        }

        /**
         * @return apiVersion
         */
        public String getApiVersion() {
            return this.apiVersion;
        }

        /**
         * @return authStyle
         */
        public String getAuthStyle() {
            return this.authStyle;
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return clientSecret
         */
        public String getClientSecret() {
            return this.clientSecret;
        }

        /**
         * @return grantType
         */
        public String getGrantType() {
            return this.grantType;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return scopes
         */
        public Scopes getScopes() {
            return this.scopes;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return sessionToken
         */
        public String getSessionToken() {
            return this.sessionToken;
        }

        /**
         * @return tokenUrl
         */
        public String getTokenUrl() {
            return this.tokenUrl;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return useCookieSessionKey
         */
        public Boolean getUseCookieSessionKey() {
            return this.useCookieSessionKey;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        /**
         * @return withAddonResources
         */
        public Boolean getWithAddonResources() {
            return this.withAddonResources;
        }

        public static final class Builder {
            private String accessKeyId; 
            private String accessKeySecret; 
            private String apiAction; 
            private String apiVersion; 
            private String authStyle; 
            private String clientId; 
            private String clientSecret; 
            private String grantType; 
            private String password; 
            private String regionId; 
            private Scopes scopes; 
            private String serviceName; 
            private String sessionToken; 
            private String tokenUrl; 
            private String type; 
            private Boolean useCookieSessionKey; 
            private String username; 
            private Boolean withAddonResources; 

            private Builder() {
            } 

            private Builder(AuthInfo model) {
                this.accessKeyId = model.accessKeyId;
                this.accessKeySecret = model.accessKeySecret;
                this.apiAction = model.apiAction;
                this.apiVersion = model.apiVersion;
                this.authStyle = model.authStyle;
                this.clientId = model.clientId;
                this.clientSecret = model.clientSecret;
                this.grantType = model.grantType;
                this.password = model.password;
                this.regionId = model.regionId;
                this.scopes = model.scopes;
                this.serviceName = model.serviceName;
                this.sessionToken = model.sessionToken;
                this.tokenUrl = model.tokenUrl;
                this.type = model.type;
                this.useCookieSessionKey = model.useCookieSessionKey;
                this.username = model.username;
                this.withAddonResources = model.withAddonResources;
            } 

            /**
             * <p>Supported only in multi-step synthetic monitoring. The AccessKey ID used for Alibaba Cloud authentication. We recommend that you store it in an encrypted format.</p>
             * 
             * <strong>example:</strong>
             * <p>testAk</p>
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * <p>Supported only in multi-step synthetic monitoring. The AccessKey secret used for Alibaba Cloud authentication. We recommend that you store it in an encrypted format.</p>
             * 
             * <strong>example:</strong>
             * <p>testSk</p>
             */
            public Builder accessKeySecret(String accessKeySecret) {
                this.accessKeySecret = accessKeySecret;
                return this;
            }

            /**
             * <p>Supported only in multi-step synthetic monitoring. The API operation requested when using Alibaba Cloud operations.</p>
             * 
             * <strong>example:</strong>
             * <p>example_api</p>
             */
            public Builder apiAction(String apiAction) {
                this.apiAction = apiAction;
                return this;
            }

            /**
             * <p>Supported only in multi-step synthetic monitoring. The API version requested when using Alibaba Cloud operations.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-01-01</p>
             */
            public Builder apiVersion(String apiVersion) {
                this.apiVersion = apiVersion;
                return this;
            }

            /**
             * <p>The OAuth 2.0 authentication style. Valid values: ROA and RPC.</p>
             * 
             * <strong>example:</strong>
             * <p>ROA</p>
             */
            public Builder authStyle(String authStyle) {
                this.authStyle = authStyle;
                return this;
            }

            /**
             * <p>The client ID used for client authentication in OAuth 2.0.</p>
             * 
             * <strong>example:</strong>
             * <p>client_id</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The client secret used for client authentication in OAuth 2.0.</p>
             * 
             * <strong>example:</strong>
             * <p>client_secret</p>
             */
            public Builder clientSecret(String clientSecret) {
                this.clientSecret = clientSecret;
                return this;
            }

            /**
             * <p>The grant type used in OAuth 2.0 authentication. Valid values: client_credentials and password.</p>
             * 
             * <strong>example:</strong>
             * <p>password</p>
             */
            public Builder grantType(String grantType) {
                this.grantType = grantType;
                return this;
            }

            /**
             * <p>The password used for HTTP Basic Authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>test_password</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>Supported only in multi-step synthetic monitoring. The region ID requested when using Alibaba Cloud authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * scopes.
             */
            public Builder scopes(Scopes scopes) {
                this.scopes = scopes;
                return this;
            }

            /**
             * <p>The service name requested when using AWS authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>example_service_name</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The session token used for AWS authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>example_token</p>
             */
            public Builder sessionToken(String sessionToken) {
                this.sessionToken = sessionToken;
                return this;
            }

            /**
             * <p>The address of the authentication server in OAuth 2.0.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.example.com">https://www.example.com</a></p>
             */
            public Builder tokenUrl(String tokenUrl) {
                this.tokenUrl = tokenUrl;
                return this;
            }

            /**
             * <p>The authentication type. Currently, only HTTP Basic Authentication is supported. Valid value: basic.</p>
             * 
             * <strong>example:</strong>
             * <p>basic</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Specifies whether the key is stored in the client cookie during digest authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder useCookieSessionKey(Boolean useCookieSessionKey) {
                this.useCookieSessionKey = useCookieSessionKey;
                return this;
            }

            /**
             * <p>The username used for HTTP Basic Authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>test_username</p>
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            /**
             * <p>Supported only in multi-step synthetic monitoring. Specifies whether the operation involves additional resources when Alibaba Cloud authentication is used in this step.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder withAddonResources(Boolean withAddonResources) {
                this.withAddonResources = withAddonResources;
                return this;
            }

            public AuthInfo build() {
                return new AuthInfo(this);
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
        private java.util.List<String> blockedUrlList;

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
        public java.util.List<String> getBlockedUrlList() {
            return this.blockedUrlList;
        }

        public static final class Builder {
            private java.util.List<String> blockedUrlList; 

            private Builder() {
            } 

            private Builder(BlockedUrlList model) {
                this.blockedUrlList = model.blockedUrlList;
            } 

            /**
             * blocked_url_list.
             */
            public Builder blockedUrlList(java.util.List<String> blockedUrlList) {
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
        private java.util.List<java.util.Map<String, ?>> browserHeaders;

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
        public java.util.List<java.util.Map<String, ?>> getBrowserHeaders() {
            return this.browserHeaders;
        }

        public static final class Builder {
            private java.util.List<java.util.Map<String, ?>> browserHeaders; 

            private Builder() {
            } 

            private Builder(BrowserHeaders model) {
                this.browserHeaders = model.browserHeaders;
            } 

            /**
             * browser_headers.
             */
            public Builder browserHeaders(java.util.List<java.util.Map<String, ?>> browserHeaders) {
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
        private java.util.List<String> browserHosts;

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
        public java.util.List<String> getBrowserHosts() {
            return this.browserHosts;
        }

        public static final class Builder {
            private java.util.List<String> browserHosts; 

            private Builder() {
            } 

            private Builder(BrowserHosts model) {
                this.browserHosts = model.browserHosts;
            } 

            /**
             * browser_hosts.
             */
            public Builder browserHosts(java.util.List<String> browserHosts) {
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

            private Builder() {
            } 

            private Builder(BrowserInfo model) {
                this.browser = model.browser;
                this.device = model.device;
            } 

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
        private java.util.List<BrowserInfo> browserInfo;

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
        public java.util.List<BrowserInfo> getBrowserInfo() {
            return this.browserInfo;
        }

        public static final class Builder {
            private java.util.List<BrowserInfo> browserInfo; 

            private Builder() {
            } 

            private Builder(OptionJsonBrowserInfo model) {
                this.browserInfo = model.browserInfo;
            } 

            /**
             * browser_info.
             */
            public Builder browserInfo(java.util.List<BrowserInfo> browserInfo) {
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
    public static class ConfigVariables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("secure")
        private Boolean secure;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private ConfigVariables(Builder builder) {
            this.name = builder.name;
            this.secure = builder.secure;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigVariables create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return secure
         */
        public Boolean getSecure() {
            return this.secure;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private Boolean secure; 
            private String value; 

            private Builder() {
            } 

            private Builder(ConfigVariables model) {
                this.name = model.name;
                this.secure = model.secure;
                this.value = model.value;
            } 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * secure.
             */
            public Builder secure(Boolean secure) {
                this.secure = secure;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ConfigVariables build() {
                return new ConfigVariables(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSiteMonitorAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteMonitorAttributeResponseBody</p>
     */
    public static class OptionJsonConfigVariables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("config_variables")
        private java.util.List<ConfigVariables> configVariables;

        private OptionJsonConfigVariables(Builder builder) {
            this.configVariables = builder.configVariables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OptionJsonConfigVariables create() {
            return builder().build();
        }

        /**
         * @return configVariables
         */
        public java.util.List<ConfigVariables> getConfigVariables() {
            return this.configVariables;
        }

        public static final class Builder {
            private java.util.List<ConfigVariables> configVariables; 

            private Builder() {
            } 

            private Builder(OptionJsonConfigVariables model) {
                this.configVariables = model.configVariables;
            } 

            /**
             * config_variables.
             */
            public Builder configVariables(java.util.List<ConfigVariables> configVariables) {
                this.configVariables = configVariables;
                return this;
            }

            public OptionJsonConfigVariables build() {
                return new OptionJsonConfigVariables(this);
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
        private java.util.List<String> expectExistString;

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
        public java.util.List<String> getExpectExistString() {
            return this.expectExistString;
        }

        public static final class Builder {
            private java.util.List<String> expectExistString; 

            private Builder() {
            } 

            private Builder(ExpectExistString model) {
                this.expectExistString = model.expectExistString;
            } 

            /**
             * expect_exist_string.
             */
            public Builder expectExistString(java.util.List<String> expectExistString) {
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
        private java.util.List<String> expectNonExistString;

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
        public java.util.List<String> getExpectNonExistString() {
            return this.expectNonExistString;
        }

        public static final class Builder {
            private java.util.List<String> expectNonExistString; 

            private Builder() {
            } 

            private Builder(ExpectNonExistString model) {
                this.expectNonExistString = model.expectNonExistString;
            } 

            /**
             * expect_non_exist_string.
             */
            public Builder expectNonExistString(java.util.List<String> expectNonExistString) {
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
        private java.util.List<String> quicTarget;

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
        public java.util.List<String> getQuicTarget() {
            return this.quicTarget;
        }

        public static final class Builder {
            private java.util.List<String> quicTarget; 

            private Builder() {
            } 

            private Builder(QuicTarget model) {
                this.quicTarget = model.quicTarget;
            } 

            /**
             * quic_target.
             */
            public Builder quicTarget(java.util.List<String> quicTarget) {
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
    public static class Parser extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("parser_type")
        private String parserType;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Parser(Builder builder) {
            this.parserType = builder.parserType;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parser create() {
            return builder().build();
        }

        /**
         * @return parserType
         */
        public String getParserType() {
            return this.parserType;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String parserType; 
            private String value; 

            private Builder() {
            } 

            private Builder(Parser model) {
                this.parserType = model.parserType;
                this.value = model.value;
            } 

            /**
             * parser_type.
             */
            public Builder parserType(String parserType) {
                this.parserType = parserType;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Parser build() {
                return new Parser(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSiteMonitorAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteMonitorAttributeResponseBody</p>
     */
    public static class ExtractedVariables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("extracted_type")
        private String extractedType;

        @com.aliyun.core.annotation.NameInMap("field")
        private String field;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("parser")
        private Parser parser;

        private ExtractedVariables(Builder builder) {
            this.extractedType = builder.extractedType;
            this.field = builder.field;
            this.name = builder.name;
            this.parser = builder.parser;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtractedVariables create() {
            return builder().build();
        }

        /**
         * @return extractedType
         */
        public String getExtractedType() {
            return this.extractedType;
        }

        /**
         * @return field
         */
        public String getField() {
            return this.field;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parser
         */
        public Parser getParser() {
            return this.parser;
        }

        public static final class Builder {
            private String extractedType; 
            private String field; 
            private String name; 
            private Parser parser; 

            private Builder() {
            } 

            private Builder(ExtractedVariables model) {
                this.extractedType = model.extractedType;
                this.field = model.field;
                this.name = model.name;
                this.parser = model.parser;
            } 

            /**
             * extracted_type.
             */
            public Builder extractedType(String extractedType) {
                this.extractedType = extractedType;
                return this;
            }

            /**
             * field.
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * parser.
             */
            public Builder parser(Parser parser) {
                this.parser = parser;
                return this;
            }

            public ExtractedVariables build() {
                return new ExtractedVariables(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSiteMonitorAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteMonitorAttributeResponseBody</p>
     */
    public static class StepsExtractedVariables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("extracted_variables")
        private java.util.List<ExtractedVariables> extractedVariables;

        private StepsExtractedVariables(Builder builder) {
            this.extractedVariables = builder.extractedVariables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StepsExtractedVariables create() {
            return builder().build();
        }

        /**
         * @return extractedVariables
         */
        public java.util.List<ExtractedVariables> getExtractedVariables() {
            return this.extractedVariables;
        }

        public static final class Builder {
            private java.util.List<ExtractedVariables> extractedVariables; 

            private Builder() {
            } 

            private Builder(StepsExtractedVariables model) {
                this.extractedVariables = model.extractedVariables;
            } 

            /**
             * extracted_variables.
             */
            public Builder extractedVariables(java.util.List<ExtractedVariables> extractedVariables) {
                this.extractedVariables = extractedVariables;
                return this;
            }

            public StepsExtractedVariables build() {
                return new StepsExtractedVariables(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSiteMonitorAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteMonitorAttributeResponseBody</p>
     */
    public static class Steps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("allow_failure")
        private Boolean allowFailure;

        @com.aliyun.core.annotation.NameInMap("auto_extract_cookie")
        private Boolean autoExtractCookie;

        @com.aliyun.core.annotation.NameInMap("extracted_variables")
        private StepsExtractedVariables extractedVariables;

        @com.aliyun.core.annotation.NameInMap("is_critical")
        private Boolean isCritical;

        @com.aliyun.core.annotation.NameInMap("name")
        @Deprecated
        private String name;

        @com.aliyun.core.annotation.NameInMap("option")
        private String option;

        @com.aliyun.core.annotation.NameInMap("step_name")
        private String stepName;

        @com.aliyun.core.annotation.NameInMap("step_type")
        private String stepType;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("use_generated_cookie")
        private Boolean useGeneratedCookie;

        @com.aliyun.core.annotation.NameInMap("wait_time_in_secs")
        private Integer waitTimeInSecs;

        private Steps(Builder builder) {
            this.allowFailure = builder.allowFailure;
            this.autoExtractCookie = builder.autoExtractCookie;
            this.extractedVariables = builder.extractedVariables;
            this.isCritical = builder.isCritical;
            this.name = builder.name;
            this.option = builder.option;
            this.stepName = builder.stepName;
            this.stepType = builder.stepType;
            this.url = builder.url;
            this.useGeneratedCookie = builder.useGeneratedCookie;
            this.waitTimeInSecs = builder.waitTimeInSecs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Steps create() {
            return builder().build();
        }

        /**
         * @return allowFailure
         */
        public Boolean getAllowFailure() {
            return this.allowFailure;
        }

        /**
         * @return autoExtractCookie
         */
        public Boolean getAutoExtractCookie() {
            return this.autoExtractCookie;
        }

        /**
         * @return extractedVariables
         */
        public StepsExtractedVariables getExtractedVariables() {
            return this.extractedVariables;
        }

        /**
         * @return isCritical
         */
        public Boolean getIsCritical() {
            return this.isCritical;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return option
         */
        public String getOption() {
            return this.option;
        }

        /**
         * @return stepName
         */
        public String getStepName() {
            return this.stepName;
        }

        /**
         * @return stepType
         */
        public String getStepType() {
            return this.stepType;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return useGeneratedCookie
         */
        public Boolean getUseGeneratedCookie() {
            return this.useGeneratedCookie;
        }

        /**
         * @return waitTimeInSecs
         */
        public Integer getWaitTimeInSecs() {
            return this.waitTimeInSecs;
        }

        public static final class Builder {
            private Boolean allowFailure; 
            private Boolean autoExtractCookie; 
            private StepsExtractedVariables extractedVariables; 
            private Boolean isCritical; 
            private String name; 
            private String option; 
            private String stepName; 
            private String stepType; 
            private String url; 
            private Boolean useGeneratedCookie; 
            private Integer waitTimeInSecs; 

            private Builder() {
            } 

            private Builder(Steps model) {
                this.allowFailure = model.allowFailure;
                this.autoExtractCookie = model.autoExtractCookie;
                this.extractedVariables = model.extractedVariables;
                this.isCritical = model.isCritical;
                this.name = model.name;
                this.option = model.option;
                this.stepName = model.stepName;
                this.stepType = model.stepType;
                this.url = model.url;
                this.useGeneratedCookie = model.useGeneratedCookie;
                this.waitTimeInSecs = model.waitTimeInSecs;
            } 

            /**
             * allow_failure.
             */
            public Builder allowFailure(Boolean allowFailure) {
                this.allowFailure = allowFailure;
                return this;
            }

            /**
             * auto_extract_cookie.
             */
            public Builder autoExtractCookie(Boolean autoExtractCookie) {
                this.autoExtractCookie = autoExtractCookie;
                return this;
            }

            /**
             * extracted_variables.
             */
            public Builder extractedVariables(StepsExtractedVariables extractedVariables) {
                this.extractedVariables = extractedVariables;
                return this;
            }

            /**
             * is_critical.
             */
            public Builder isCritical(Boolean isCritical) {
                this.isCritical = isCritical;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * option.
             */
            public Builder option(String option) {
                this.option = option;
                return this;
            }

            /**
             * step_name.
             */
            public Builder stepName(String stepName) {
                this.stepName = stepName;
                return this;
            }

            /**
             * step_type.
             */
            public Builder stepType(String stepType) {
                this.stepType = stepType;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * use_generated_cookie.
             */
            public Builder useGeneratedCookie(Boolean useGeneratedCookie) {
                this.useGeneratedCookie = useGeneratedCookie;
                return this;
            }

            /**
             * wait_time_in_secs.
             */
            public Builder waitTimeInSecs(Integer waitTimeInSecs) {
                this.waitTimeInSecs = waitTimeInSecs;
                return this;
            }

            public Steps build() {
                return new Steps(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSiteMonitorAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteMonitorAttributeResponseBody</p>
     */
    public static class OptionJsonSteps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("steps")
        private java.util.List<Steps> steps;

        private OptionJsonSteps(Builder builder) {
            this.steps = builder.steps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OptionJsonSteps create() {
            return builder().build();
        }

        /**
         * @return steps
         */
        public java.util.List<Steps> getSteps() {
            return this.steps;
        }

        public static final class Builder {
            private java.util.List<Steps> steps; 

            private Builder() {
            } 

            private Builder(OptionJsonSteps model) {
                this.steps = model.steps;
            } 

            /**
             * steps.
             */
            public Builder steps(java.util.List<Steps> steps) {
                this.steps = steps;
                return this;
            }

            public OptionJsonSteps build() {
                return new OptionJsonSteps(this);
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
        private java.util.List<String> trafficHijackElementBlacklist;

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
        public java.util.List<String> getTrafficHijackElementBlacklist() {
            return this.trafficHijackElementBlacklist;
        }

        public static final class Builder {
            private java.util.List<String> trafficHijackElementBlacklist; 

            private Builder() {
            } 

            private Builder(TrafficHijackElementBlacklist model) {
                this.trafficHijackElementBlacklist = model.trafficHijackElementBlacklist;
            } 

            /**
             * traffic_hijack_element_blacklist.
             */
            public Builder trafficHijackElementBlacklist(java.util.List<String> trafficHijackElementBlacklist) {
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
        private java.util.List<String> trafficHijackElementWhitelist;

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
        public java.util.List<String> getTrafficHijackElementWhitelist() {
            return this.trafficHijackElementWhitelist;
        }

        public static final class Builder {
            private java.util.List<String> trafficHijackElementWhitelist; 

            private Builder() {
            } 

            private Builder(TrafficHijackElementWhitelist model) {
                this.trafficHijackElementWhitelist = model.trafficHijackElementWhitelist;
            } 

            /**
             * traffic_hijack_element_whitelist.
             */
            public Builder trafficHijackElementWhitelist(java.util.List<String> trafficHijackElementWhitelist) {
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

        @com.aliyun.core.annotation.NameInMap("auth_info")
        private AuthInfo authInfo;

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

        @com.aliyun.core.annotation.NameInMap("config_variables")
        private OptionJsonConfigVariables configVariables;

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

        @com.aliyun.core.annotation.NameInMap("enable_packet_capture")
        private Boolean enablePacketCapture;

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

        @com.aliyun.core.annotation.NameInMap("hops")
        private Integer hops;

        @com.aliyun.core.annotation.NameInMap("host_binding")
        private String hostBinding;

        @com.aliyun.core.annotation.NameInMap("host_binding_type")
        private Integer hostBindingType;

        @com.aliyun.core.annotation.NameInMap("http_method")
        private String httpMethod;

        @com.aliyun.core.annotation.NameInMap("icmp_timeout_millis")
        private Integer icmpTimeoutMillis;

        @com.aliyun.core.annotation.NameInMap("ip_network")
        private String ipNetwork;

        @com.aliyun.core.annotation.NameInMap("isBase64Encode")
        private String isBase64Encode;

        @com.aliyun.core.annotation.NameInMap("match_rule")
        private Integer matchRule;

        @com.aliyun.core.annotation.NameInMap("max_tls_version")
        private String maxTlsVersion;

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

        @com.aliyun.core.annotation.NameInMap("private_crt_file_name")
        private String privateCrtFileName;

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

        @com.aliyun.core.annotation.NameInMap("safe_link")
        private Integer safeLink;

        @com.aliyun.core.annotation.NameInMap("screen_shot")
        private Boolean screenShot;

        @com.aliyun.core.annotation.NameInMap("scroll_end")
        private Boolean scrollEnd;

        @com.aliyun.core.annotation.NameInMap("server_name")
        private String serverName;

        @com.aliyun.core.annotation.NameInMap("sse")
        private Boolean sse;

        @com.aliyun.core.annotation.NameInMap("steps")
        private OptionJsonSteps steps;

        @com.aliyun.core.annotation.NameInMap("strict_mode")
        private Boolean strictMode;

        @com.aliyun.core.annotation.NameInMap("supported_cipher_suits")
        private String supportedCipherSuits;

        @com.aliyun.core.annotation.NameInMap("time_out")
        private Long timeOut;

        @com.aliyun.core.annotation.NameInMap("trace_region")
        private String traceRegion;

        @com.aliyun.core.annotation.NameInMap("trace_type")
        private String traceType;

        @com.aliyun.core.annotation.NameInMap("traffic_hijack_element_blacklist")
        private TrafficHijackElementBlacklist trafficHijackElementBlacklist;

        @com.aliyun.core.annotation.NameInMap("traffic_hijack_element_count")
        private Integer trafficHijackElementCount;

        @com.aliyun.core.annotation.NameInMap("traffic_hijack_element_whitelist")
        private TrafficHijackElementWhitelist trafficHijackElementWhitelist;

        @com.aliyun.core.annotation.NameInMap("use_private_crt")
        private Boolean usePrivateCrt;

        @com.aliyun.core.annotation.NameInMap("use_ssl")
        private Boolean useSsl;

        @com.aliyun.core.annotation.NameInMap("username")
        private String username;

        @com.aliyun.core.annotation.NameInMap("waitTime_after_completion")
        private Integer waitTimeAfterCompletion;

        private OptionJson(Builder builder) {
            this.assertions = builder.assertions;
            this.attempts = builder.attempts;
            this.authInfo = builder.authInfo;
            this.blockedUrlList = builder.blockedUrlList;
            this.browserHeaders = builder.browserHeaders;
            this.browserHosts = builder.browserHosts;
            this.browserInfo = builder.browserInfo;
            this.browserInsecure = builder.browserInsecure;
            this.browserTaskVersion = builder.browserTaskVersion;
            this.configVariables = builder.configVariables;
            this.cookie = builder.cookie;
            this.diagnosisMtr = builder.diagnosisMtr;
            this.diagnosisPing = builder.diagnosisPing;
            this.dnsHijackWhitelist = builder.dnsHijackWhitelist;
            this.dnsMatchRule = builder.dnsMatchRule;
            this.dnsServer = builder.dnsServer;
            this.dnsType = builder.dnsType;
            this.emptyMessage = builder.emptyMessage;
            this.enablePacketCapture = builder.enablePacketCapture;
            this.expectExistString = builder.expectExistString;
            this.expectNonExistString = builder.expectNonExistString;
            this.expectValue = builder.expectValue;
            this.failureRate = builder.failureRate;
            this.header = builder.header;
            this.hops = builder.hops;
            this.hostBinding = builder.hostBinding;
            this.hostBindingType = builder.hostBindingType;
            this.httpMethod = builder.httpMethod;
            this.icmpTimeoutMillis = builder.icmpTimeoutMillis;
            this.ipNetwork = builder.ipNetwork;
            this.isBase64Encode = builder.isBase64Encode;
            this.matchRule = builder.matchRule;
            this.maxTlsVersion = builder.maxTlsVersion;
            this.minTlsVersion = builder.minTlsVersion;
            this.password = builder.password;
            this.pingNum = builder.pingNum;
            this.pingPort = builder.pingPort;
            this.pingType = builder.pingType;
            this.port = builder.port;
            this.privateCrtFileName = builder.privateCrtFileName;
            this.protocol = builder.protocol;
            this.quicEnabled = builder.quicEnabled;
            this.quicTarget = builder.quicTarget;
            this.requestContent = builder.requestContent;
            this.requestFormat = builder.requestFormat;
            this.responseContent = builder.responseContent;
            this.responseFormat = builder.responseFormat;
            this.retryDelay = builder.retryDelay;
            this.safeLink = builder.safeLink;
            this.screenShot = builder.screenShot;
            this.scrollEnd = builder.scrollEnd;
            this.serverName = builder.serverName;
            this.sse = builder.sse;
            this.steps = builder.steps;
            this.strictMode = builder.strictMode;
            this.supportedCipherSuits = builder.supportedCipherSuits;
            this.timeOut = builder.timeOut;
            this.traceRegion = builder.traceRegion;
            this.traceType = builder.traceType;
            this.trafficHijackElementBlacklist = builder.trafficHijackElementBlacklist;
            this.trafficHijackElementCount = builder.trafficHijackElementCount;
            this.trafficHijackElementWhitelist = builder.trafficHijackElementWhitelist;
            this.usePrivateCrt = builder.usePrivateCrt;
            this.useSsl = builder.useSsl;
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
         * @return authInfo
         */
        public AuthInfo getAuthInfo() {
            return this.authInfo;
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
         * @return configVariables
         */
        public OptionJsonConfigVariables getConfigVariables() {
            return this.configVariables;
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
         * @return enablePacketCapture
         */
        public Boolean getEnablePacketCapture() {
            return this.enablePacketCapture;
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
         * @return hops
         */
        public Integer getHops() {
            return this.hops;
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
         * @return icmpTimeoutMillis
         */
        public Integer getIcmpTimeoutMillis() {
            return this.icmpTimeoutMillis;
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
         * @return maxTlsVersion
         */
        public String getMaxTlsVersion() {
            return this.maxTlsVersion;
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
         * @return privateCrtFileName
         */
        public String getPrivateCrtFileName() {
            return this.privateCrtFileName;
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
         * @return safeLink
         */
        public Integer getSafeLink() {
            return this.safeLink;
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
         * @return serverName
         */
        public String getServerName() {
            return this.serverName;
        }

        /**
         * @return sse
         */
        public Boolean getSse() {
            return this.sse;
        }

        /**
         * @return steps
         */
        public OptionJsonSteps getSteps() {
            return this.steps;
        }

        /**
         * @return strictMode
         */
        public Boolean getStrictMode() {
            return this.strictMode;
        }

        /**
         * @return supportedCipherSuits
         */
        public String getSupportedCipherSuits() {
            return this.supportedCipherSuits;
        }

        /**
         * @return timeOut
         */
        public Long getTimeOut() {
            return this.timeOut;
        }

        /**
         * @return traceRegion
         */
        public String getTraceRegion() {
            return this.traceRegion;
        }

        /**
         * @return traceType
         */
        public String getTraceType() {
            return this.traceType;
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
         * @return usePrivateCrt
         */
        public Boolean getUsePrivateCrt() {
            return this.usePrivateCrt;
        }

        /**
         * @return useSsl
         */
        public Boolean getUseSsl() {
            return this.useSsl;
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
            private AuthInfo authInfo; 
            private BlockedUrlList blockedUrlList; 
            private BrowserHeaders browserHeaders; 
            private BrowserHosts browserHosts; 
            private OptionJsonBrowserInfo browserInfo; 
            private Boolean browserInsecure; 
            private String browserTaskVersion; 
            private OptionJsonConfigVariables configVariables; 
            private String cookie; 
            private Boolean diagnosisMtr; 
            private Boolean diagnosisPing; 
            private String dnsHijackWhitelist; 
            private String dnsMatchRule; 
            private String dnsServer; 
            private String dnsType; 
            private Boolean emptyMessage; 
            private Boolean enablePacketCapture; 
            private ExpectExistString expectExistString; 
            private ExpectNonExistString expectNonExistString; 
            private String expectValue; 
            private Float failureRate; 
            private String header; 
            private Integer hops; 
            private String hostBinding; 
            private Integer hostBindingType; 
            private String httpMethod; 
            private Integer icmpTimeoutMillis; 
            private String ipNetwork; 
            private String isBase64Encode; 
            private Integer matchRule; 
            private String maxTlsVersion; 
            private String minTlsVersion; 
            private String password; 
            private Integer pingNum; 
            private Integer pingPort; 
            private String pingType; 
            private Integer port; 
            private String privateCrtFileName; 
            private String protocol; 
            private Boolean quicEnabled; 
            private QuicTarget quicTarget; 
            private String requestContent; 
            private String requestFormat; 
            private String responseContent; 
            private String responseFormat; 
            private Integer retryDelay; 
            private Integer safeLink; 
            private Boolean screenShot; 
            private Boolean scrollEnd; 
            private String serverName; 
            private Boolean sse; 
            private OptionJsonSteps steps; 
            private Boolean strictMode; 
            private String supportedCipherSuits; 
            private Long timeOut; 
            private String traceRegion; 
            private String traceType; 
            private TrafficHijackElementBlacklist trafficHijackElementBlacklist; 
            private Integer trafficHijackElementCount; 
            private TrafficHijackElementWhitelist trafficHijackElementWhitelist; 
            private Boolean usePrivateCrt; 
            private Boolean useSsl; 
            private String username; 
            private Integer waitTimeAfterCompletion; 

            private Builder() {
            } 

            private Builder(OptionJson model) {
                this.assertions = model.assertions;
                this.attempts = model.attempts;
                this.authInfo = model.authInfo;
                this.blockedUrlList = model.blockedUrlList;
                this.browserHeaders = model.browserHeaders;
                this.browserHosts = model.browserHosts;
                this.browserInfo = model.browserInfo;
                this.browserInsecure = model.browserInsecure;
                this.browserTaskVersion = model.browserTaskVersion;
                this.configVariables = model.configVariables;
                this.cookie = model.cookie;
                this.diagnosisMtr = model.diagnosisMtr;
                this.diagnosisPing = model.diagnosisPing;
                this.dnsHijackWhitelist = model.dnsHijackWhitelist;
                this.dnsMatchRule = model.dnsMatchRule;
                this.dnsServer = model.dnsServer;
                this.dnsType = model.dnsType;
                this.emptyMessage = model.emptyMessage;
                this.enablePacketCapture = model.enablePacketCapture;
                this.expectExistString = model.expectExistString;
                this.expectNonExistString = model.expectNonExistString;
                this.expectValue = model.expectValue;
                this.failureRate = model.failureRate;
                this.header = model.header;
                this.hops = model.hops;
                this.hostBinding = model.hostBinding;
                this.hostBindingType = model.hostBindingType;
                this.httpMethod = model.httpMethod;
                this.icmpTimeoutMillis = model.icmpTimeoutMillis;
                this.ipNetwork = model.ipNetwork;
                this.isBase64Encode = model.isBase64Encode;
                this.matchRule = model.matchRule;
                this.maxTlsVersion = model.maxTlsVersion;
                this.minTlsVersion = model.minTlsVersion;
                this.password = model.password;
                this.pingNum = model.pingNum;
                this.pingPort = model.pingPort;
                this.pingType = model.pingType;
                this.port = model.port;
                this.privateCrtFileName = model.privateCrtFileName;
                this.protocol = model.protocol;
                this.quicEnabled = model.quicEnabled;
                this.quicTarget = model.quicTarget;
                this.requestContent = model.requestContent;
                this.requestFormat = model.requestFormat;
                this.responseContent = model.responseContent;
                this.responseFormat = model.responseFormat;
                this.retryDelay = model.retryDelay;
                this.safeLink = model.safeLink;
                this.screenShot = model.screenShot;
                this.scrollEnd = model.scrollEnd;
                this.serverName = model.serverName;
                this.sse = model.sse;
                this.steps = model.steps;
                this.strictMode = model.strictMode;
                this.supportedCipherSuits = model.supportedCipherSuits;
                this.timeOut = model.timeOut;
                this.traceRegion = model.traceRegion;
                this.traceType = model.traceType;
                this.trafficHijackElementBlacklist = model.trafficHijackElementBlacklist;
                this.trafficHijackElementCount = model.trafficHijackElementCount;
                this.trafficHijackElementWhitelist = model.trafficHijackElementWhitelist;
                this.usePrivateCrt = model.usePrivateCrt;
                this.useSsl = model.useSsl;
                this.username = model.username;
                this.waitTimeAfterCompletion = model.waitTimeAfterCompletion;
            } 

            /**
             * assertions.
             */
            public Builder assertions(OptionJsonAssertions assertions) {
                this.assertions = assertions;
                return this;
            }

            /**
             * <p>The number of retries after a DNS failure.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder attempts(Long attempts) {
                this.attempts = attempts;
                return this;
            }

            /**
             * <p>The authentication information.</p>
             */
            public Builder authInfo(AuthInfo authInfo) {
                this.authInfo = authInfo;
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
             * <p>Specifies whether to ignore certificate errors. Valid values:</p>
             * <ul>
             * <li>false: Certificate errors are not ignored.</li>
             * <li>true: Certificate errors are ignored.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder browserInsecure(Boolean browserInsecure) {
                this.browserInsecure = browserInsecure;
                return this;
            }

            /**
             * <p>The browser monitoring version. Valid values:</p>
             * <ul>
             * <li>1: Single-page monitoring.</li>
             * <li>2: Multi-page monitoring.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder browserTaskVersion(String browserTaskVersion) {
                this.browserTaskVersion = browserTaskVersion;
                return this;
            }

            /**
             * config_variables.
             */
            public Builder configVariables(OptionJsonConfigVariables configVariables) {
                this.configVariables = configVariables;
                return this;
            }

            /**
             * <p>The cookie sent in the HTTP request.</p>
             * 
             * <strong>example:</strong>
             * <p>lang=en</p>
             */
            public Builder cookie(String cookie) {
                this.cookie = cookie;
                return this;
            }

            /**
             * <p>Specifies whether to enable automatic MTR network diagnostics after a task fails. Valid values:</p>
             * <ul>
             * <li>false: Automatic MTR network diagnostics are disabled.</li>
             * <li>true: Automatic MTR network diagnostics are enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder diagnosisMtr(Boolean diagnosisMtr) {
                this.diagnosisMtr = diagnosisMtr;
                return this;
            }

            /**
             * <p>Specifies whether to enable automatic ping network latency detection after a task fails. Valid values:</p>
             * <ul>
             * <li>false: Automatic ping network latency detection is disabled.</li>
             * <li>true: Automatic ping network latency detection is enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder diagnosisPing(Boolean diagnosisPing) {
                this.diagnosisPing = diagnosisPing;
                return this;
            }

            /**
             * <p>The DNS hijacking whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.taobao.com:www.taobao.com.danuoyi.tbcache.com">www.taobao.com:www.taobao.com.danuoyi.tbcache.com</a></p>
             */
            public Builder dnsHijackWhitelist(String dnsHijackWhitelist) {
                this.dnsHijackWhitelist = dnsHijackWhitelist;
                return this;
            }

            /**
             * <p>The DNS matching rule. Valid values:</p>
             * <ul>
             * <li>IN_DNS: The expected aliases or IP addresses are all included in the DNS response.</li>
             * <li>DNS_IN: All DNS responses are included in the expected aliases or IP addresses.</li>
             * <li>EQUAL: The DNS response is exactly the same as the expected aliases or IP addresses.</li>
             * <li>ANY: The DNS response and the expected aliases or IP addresses have an intersection.</li>
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
             * <p>This parameter applies only to DNS monitoring.</p>
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
             * <p>The DNS record type. This parameter applies only to DNS monitoring. Valid values:</p>
             * <ul>
             * <li>A: Specifies the IP address that corresponds to a hostname or domain name.</li>
             * <li>CNAME: Maps multiple domain names to another domain name.</li>
             * <li>NS: Specifies the DNS server that resolves a domain name.</li>
             * <li>MX: Points a domain name to a mail server address.</li>
             * <li>TXT: Provides a description of a hostname or domain name. The text length is limited to 512 bytes. It is typically used as a Sender Policy Framework (SPF) record for anti-spam purposes.</li>
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
             * <p>Specifies whether to allow a WebSocket task to return no message or an empty message. Valid values:</p>
             * <ul>
             * <li>false (default): No.</li>
             * <li>true: Yes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder emptyMessage(Boolean emptyMessage) {
                this.emptyMessage = emptyMessage;
                return this;
            }

            /**
             * <p>Specifies whether to enable packet capture for the task.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enablePacketCapture(Boolean enablePacketCapture) {
                this.enablePacketCapture = enablePacketCapture;
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
             * <p>The alias or address to be resolved.</p>
             * <blockquote>
             * <p>This parameter applies only to DNS monitoring.</p>
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
             * <p>This parameter applies only to ping monitoring.</p>
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
             * <p>The HTTP request headers.</p>
             * 
             * <strong>example:</strong>
             * <p>testKey:testValue</p>
             */
            public Builder header(String header) {
                this.header = header;
                return this;
            }

            /**
             * <p>The number of hops for traceroute diagnostics when a ping task fails.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder hops(Integer hops) {
                this.hops = hops;
                return this;
            }

            /**
             * <p>The custom host for an HTTP task. The format is <code>ip1,ip2:address</code>. You can configure multiple lines of mappings. The left side of the colon contains the A records or CNAMEs to which the domain name can be resolved, separated by commas. The right side of the colon is the domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>127.0.0.1:<a href="http://www.aliyun.com">www.aliyun.com</a></p>
             */
            public Builder hostBinding(String hostBinding) {
                this.hostBinding = hostBinding;
                return this;
            }

            /**
             * <p>The effective method of the custom host. Valid values:</p>
             * <ul>
             * <li>0: Random.</li>
             * <li>1: Round-robin.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder hostBindingType(Integer hostBindingType) {
                this.hostBindingType = hostBindingType;
                return this;
            }

            /**
             * <p>The HTTP request method. Valid values:</p>
             * <ul>
             * <li>get </li>
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
             * <p>The timeout period for a single ping in a ping task that uses the ICMP protocol. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3000</p>
             */
            public Builder icmpTimeoutMillis(Integer icmpTimeoutMillis) {
                this.icmpTimeoutMillis = icmpTimeoutMillis;
                return this;
            }

            /**
             * <p>The network type of the task. Valid values:</p>
             * <ul>
             * <li>v4</li>
             * <li>v6</li>
             * <li>auto
             * Default value: v4.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>v4</p>
             */
            public Builder ipNetwork(String ipNetwork) {
                this.ipNetwork = ipNetwork;
                return this;
            }

            /**
             * <p>Specifies whether to decode and store the password in Base64. Valid values:</p>
             * <ul>
             * <li>true: The password is decoded and stored in Base64.</li>
             * <li>false: The password is not decoded and stored in Base64.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isBase64Encode(String isBase64Encode) {
                this.isBase64Encode = isBase64Encode;
                return this;
            }

            /**
             * <p>Specifies whether to include alert rules. Valid values:</p>
             * <ul>
             * <li>0: Yes.</li>
             * <li>1: No.</li>
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
             * <p>The maximum TLS version.</p>
             * 
             * <strong>example:</strong>
             * <p>tlsv1.3</p>
             */
            public Builder maxTlsVersion(String maxTlsVersion) {
                this.maxTlsVersion = maxTlsVersion;
                return this;
            }

            /**
             * <p>The minimum TLS version. By default, TLS 1.2 and later versions are supported. TLS 1.0 and 1.1 are disabled. You can modify the configuration if you still need to support them.</p>
             * 
             * <strong>example:</strong>
             * <p>tlsv1.2</p>
             */
            public Builder minTlsVersion(String minTlsVersion) {
                this.minTlsVersion = minTlsVersion;
                return this;
            }

            /**
             * <p>The password for SMTP, POP3, or FTP monitoring.</p>
             * 
             * <strong>example:</strong>
             * <p>123****</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The number of pings for ping monitoring.</p>
             * 
             * <strong>example:</strong>
             * <p>29</p>
             */
            public Builder pingNum(Integer pingNum) {
                this.pingNum = pingNum;
                return this;
            }

            /**
             * <p>The ping port. This parameter applies to TCP ping.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder pingPort(Integer pingPort) {
                this.pingPort = pingPort;
                return this;
            }

            /**
             * <p>The ping protocol type. Valid values:</p>
             * <ul>
             * <li>icmp</li>
             * <li>tcp</li>
             * <li>udp</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>icmp</p>
             */
            public Builder pingType(String pingType) {
                this.pingType = pingType;
                return this;
            }

            /**
             * <p>The port for TCP, UDP, SMTP, or POP3 monitoring.</p>
             * 
             * <strong>example:</strong>
             * <p>110</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The name of the private certificate file.</p>
             * 
             * <strong>example:</strong>
             * <p>cert.pem</p>
             */
            public Builder privateCrtFileName(String privateCrtFileName) {
                this.privateCrtFileName = privateCrtFileName;
                return this;
            }

            /**
             * <p>The monitoring protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>Specifies whether to use the QUIC protocol for browser monitoring. Valid values:</p>
             * <ul>
             * <li>true: The QUIC protocol is used.</li>
             * <li>false: The QUIC protocol is not used.
             * Default value: false.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder quicEnabled(Boolean quicEnabled) {
                this.quicEnabled = quicEnabled;
                return this;
            }

            /**
             * quic_target.
             */
            public Builder quicTarget(QuicTarget quicTarget) {
                this.quicTarget = quicTarget;
                return this;
            }

            /**
             * <p>The request content for HTTP monitoring.</p>
             * 
             * <strong>example:</strong>
             * <p>aa=bb</p>
             */
            public Builder requestContent(String requestContent) {
                this.requestContent = requestContent;
                return this;
            }

            /**
             * <p>The format of the HTTP request content. Valid values:</p>
             * <ul>
             * <li>hex: Hexadecimal format.</li>
             * <li>txt: Text format.</li>
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
             * <p>The expected response content to match.</p>
             * 
             * <strong>example:</strong>
             * <p>txt</p>
             */
            public Builder responseContent(String responseContent) {
                this.responseContent = responseContent;
                return this;
            }

            /**
             * <p>The format of the HTTP response content. Valid values:</p>
             * <ul>
             * <li>hex: Hexadecimal format.</li>
             * <li>txt: Text format.</li>
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
             * <p>The number of retries after a monitoring task fails.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder retryDelay(Integer retryDelay) {
                this.retryDelay = retryDelay;
                return this;
            }

            /**
             * <p>Applies to SMTP tasks. A value of 1 indicates that a secure connection is used. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder safeLink(Integer safeLink) {
                this.safeLink = safeLink;
                return this;
            }

            /**
             * <p>Specifies whether to enable page screenshots.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder screenShot(Boolean screenShot) {
                this.screenShot = screenShot;
                return this;
            }

            /**
             * <p>Specifies whether to scroll to the bottom of the page after the page is opened in a browser monitoring task.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder scrollEnd(Boolean scrollEnd) {
                this.scrollEnd = scrollEnd;
                return this;
            }

            /**
             * <p>The Server Name Indication (SNI).</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
             */
            public Builder serverName(String serverName) {
                this.serverName = serverName;
                return this;
            }

            /**
             * <p>Specifies whether to enable Server-Sent Events (SSE) monitoring.</p>
             */
            public Builder sse(Boolean sse) {
                this.sse = sse;
                return this;
            }

            /**
             * steps.
             */
            public Builder steps(OptionJsonSteps steps) {
                this.steps = steps;
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
             * <p>The supported cipher suites.</p>
             * 
             * <strong>example:</strong>
             * <p>TLS_AES_256_GCM_SHA384</p>
             */
            public Builder supportedCipherSuits(String supportedCipherSuits) {
                this.supportedCipherSuits = supportedCipherSuits;
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
             * <p>The deployment region of the target application when integrating with the OpenTelemetry edition of Managed Service for Observability.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder traceRegion(String traceRegion) {
                this.traceRegion = traceRegion;
                return this;
            }

            /**
             * <p>The tracing protocol used for integration with the OpenTelemetry edition of Tracing Analysis. Valid values:</p>
             * <ul>
             * <li>OpenTelemetry</li>
             * <li>Zipkin</li>
             * <li>Jaeger</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OpenTelemetry</p>
             */
            public Builder traceType(String traceType) {
                this.traceType = traceType;
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
             * <p>When a redirect occurs, traffic hijacking is detected if the number of resources loaded by the browser exceeds this value. If this value is set to 0, no verification is performed. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
             * <p>Specifies whether to use a private certificate.</p>
             */
            public Builder usePrivateCrt(Boolean usePrivateCrt) {
                this.usePrivateCrt = usePrivateCrt;
                return this;
            }

            /**
             * <p>Specifies whether to establish an SSL connection when executing a TCP task.</p>
             * 
             * <strong>example:</strong>
             * <p>tlsv1.0</p>
             */
            public Builder useSsl(Boolean useSsl) {
                this.useSsl = useSsl;
                return this;
            }

            /**
             * <p>The username for FTP, SMTP, or POP3.</p>
             * 
             * <strong>example:</strong>
             * <p>testUser</p>
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            /**
             * <p>The additional wait time after a page is opened in a browser probing task.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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

            private Builder() {
            } 

            private Builder(VpcConfig model) {
                this.region = model.region;
                this.securityGroupId = model.securityGroupId;
                this.vpcId = model.vpcId;
                this.vswitchId = model.vswitchId;
            } 

            /**
             * <p>The region where the target site of the internal network probing task is located.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The ID of the security group applied to the internal network probing task.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-xxxxxx</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The ID of the VPC associated with the internal network probing task.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-xxxxxx</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The ID of the vSwitch associated with the internal network probing task.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-xxxxxx</p>
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

            private Builder() {
            } 

            private Builder(SiteMonitors model) {
                this.address = model.address;
                this.agentGroup = model.agentGroup;
                this.customSchedule = model.customSchedule;
                this.interval = model.interval;
                this.ispCities = model.ispCities;
                this.optionJson = model.optionJson;
                this.taskId = model.taskId;
                this.taskName = model.taskName;
                this.taskState = model.taskState;
                this.taskType = model.taskType;
                this.vpcConfig = model.vpcConfig;
            } 

            /**
             * <p>The detection address of the monitoring task.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://aliyun.com">https://aliyun.com</a></p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>The type of the detection point. Default value: PC. Valid values:</p>
             * <ul>
             * <li>PC: Fixed-line network.</li>
             * <li>MOBILE: Mobile network.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PC</p>
             */
            public Builder agentGroup(String agentGroup) {
                this.agentGroup = agentGroup;
                return this;
            }

            /**
             * <p>The custom detection period. You can only select a specific time range from Monday to Sunday for detection.</p>
             */
            public Builder customSchedule(CustomSchedule customSchedule) {
                this.customSchedule = customSchedule;
                return this;
            }

            /**
             * <p>The interval of the monitoring task. Unit: minutes. Valid values: 1, 5, 15, 30, and 60.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder interval(String interval) {
                this.interval = interval;
                return this;
            }

            /**
             * IspCities.
             */
            public Builder ispCities(IspCities ispCities) {
                this.ispCities = ispCities;
                return this;
            }

            /**
             * <p>The extended options. Each detection type has different extended options. For more information, see <a href="https://help.aliyun.com/document_detail/115048.html">CreateSiteMonitor</a>.</p>
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
             * <p>The name of the monitoring task.</p>
             * 
             * <strong>example:</strong>
             * <p>test123</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The status of the monitoring task. Valid values:</p>
             * <ul>
             * <li>1: Enabled.</li>
             * <li>2: Disabled.</li>
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
             * <p>The type of the monitoring task. Site monitoring tasks support the following types: HTTP(S), PING, TCP, UDP, DNS, SMTP, POP3, and FTP.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>The VPC configuration for the internal network probing task.</p>
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
