// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeProductsOfActiveMetricRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProductsOfActiveMetricRuleResponseBody</p>
 */
public class DescribeProductsOfActiveMetricRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AllProductInitMetricRuleList")
    private AllProductInitMetricRuleList allProductInitMetricRuleList;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Datapoints")
    private String datapoints;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeProductsOfActiveMetricRuleResponseBody(Builder builder) {
        this.allProductInitMetricRuleList = builder.allProductInitMetricRuleList;
        this.code = builder.code;
        this.datapoints = builder.datapoints;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProductsOfActiveMetricRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return allProductInitMetricRuleList
     */
    public AllProductInitMetricRuleList getAllProductInitMetricRuleList() {
        return this.allProductInitMetricRuleList;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return datapoints
     */
    public String getDatapoints() {
        return this.datapoints;
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

    public static final class Builder {
        private AllProductInitMetricRuleList allProductInitMetricRuleList; 
        private Integer code; 
        private String datapoints; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The information about the services for which one-click alert is enabled.</p>
         */
        public Builder allProductInitMetricRuleList(AllProductInitMetricRuleList allProductInitMetricRuleList) {
            this.allProductInitMetricRuleList = allProductInitMetricRuleList;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * <blockquote>
         * <p> The status code 200 indicates that the request was successful.</p>
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
         * <p>The information about the services for which one-click alert is enabled. Services are separated with commas (,). Valid values:</p>
         * <ul>
         * <li>ecs: Elastic Compute Service (ECS)</li>
         * <li>rds: ApsaraDB RDS</li>
         * <li>slb: Server Load Balancer (SLB)</li>
         * <li>redis_standard: ApsaraDB for Redis of the standard architecture</li>
         * <li>redis_sharding: ApsaraDB for Redis of the cluster architecture</li>
         * <li>redis_splitrw: ApsaraDB for Redis of the read/write splitting architecture</li>
         * <li>mongodb: ApsaraDB for MongoDB of the replica set architecture</li>
         * <li>mongodb_sharding: ApsaraDB for MongoDB of the sharded cluster architecture</li>
         * <li>hbase: ApsaraDB for HBase</li>
         * <li>elasticsearch: Elasticsearch</li>
         * <li>opensearch: OpenSearch</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ecs,rds</p>
         */
        public Builder datapoints(String datapoints) {
            this.datapoints = datapoints;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The Request is not authorization.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F82E6667-7811-4BA0-842F-5B2DC42BBAAD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeProductsOfActiveMetricRuleResponseBody build() {
            return new DescribeProductsOfActiveMetricRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeProductsOfActiveMetricRuleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProductsOfActiveMetricRuleResponseBody</p>
     */
    public static class AlertInitConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("EvaluationCount")
        private String evaluationCount;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("Period")
        private String period;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private String threshold;

        private AlertInitConfig(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
            this.evaluationCount = builder.evaluationCount;
            this.level = builder.level;
            this.metricName = builder.metricName;
            this.namespace = builder.namespace;
            this.period = builder.period;
            this.statistics = builder.statistics;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertInitConfig create() {
            return builder().build();
        }

        /**
         * @return comparisonOperator
         */
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        /**
         * @return evaluationCount
         */
        public String getEvaluationCount() {
            return this.evaluationCount;
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
            private String evaluationCount; 
            private String level; 
            private String metricName; 
            private String namespace; 
            private String period; 
            private String statistics; 
            private String threshold; 

            /**
             * <p>The operator that is used to compare the metric value with the threshold for Warn-level alerts.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>LessThanThreshold: less than the threshold</p>
             * </li>
             * <li><p>GreaterThanLastWeek: greater than the metric value at the same time last week</p>
             * </li>
             * <li><p>LessThanOrEqualToThreshold: less than or equal to the threshold</p>
             * </li>
             * <li><p>NotEqualToThreshold: does not equal to the threshold</p>
             * </li>
             * <li><p>GreaterThanLastPeriod: greater than the metric value in the last monitoring cycle</p>
             * </li>
             * <li><p>GreaterThanYesterday: greater than the metric value at the same time yesterday</p>
             * </li>
             * <li><p>LessThanYesterday: less than the metric value at the same time yesterday</p>
             * </li>
             * <li><p>LessThanLastWeek: less than the metric value at the same time last week</p>
             * </li>
             * <li><p>GreaterThanOrEqualToThreshold: greater than or equal to the threshold</p>
             * </li>
             * <li><p>GreaterThanThreshold: greater than the threshold</p>
             * </li>
             * <li><p>LessThanLastPeriod: less than the metric value in the last monitoring cycle</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>GreaterThanOrEqualToThreshold</p>
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
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
             * <p>The alert level.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>INFO</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>WARN</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>CRITICAL</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CRITICAL</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The metric name. For more information, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>cpu_total</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The namespace of the service. For more information, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>acs_rds_dashboard</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The aggregation period of monitoring data. Unit: minutes. For more information, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>1m</p>
             */
            public Builder period(String period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The method used to calculate metric values that trigger alerts. For more information, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>Average</p>
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * <p>The alert threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder threshold(String threshold) {
                this.threshold = threshold;
                return this;
            }

            public AlertInitConfig build() {
                return new AlertInitConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeProductsOfActiveMetricRuleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProductsOfActiveMetricRuleResponseBody</p>
     */
    public static class AlertInitConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertInitConfig")
        private java.util.List < AlertInitConfig> alertInitConfig;

        private AlertInitConfigList(Builder builder) {
            this.alertInitConfig = builder.alertInitConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertInitConfigList create() {
            return builder().build();
        }

        /**
         * @return alertInitConfig
         */
        public java.util.List < AlertInitConfig> getAlertInitConfig() {
            return this.alertInitConfig;
        }

        public static final class Builder {
            private java.util.List < AlertInitConfig> alertInitConfig; 

            /**
             * AlertInitConfig.
             */
            public Builder alertInitConfig(java.util.List < AlertInitConfig> alertInitConfig) {
                this.alertInitConfig = alertInitConfig;
                return this;
            }

            public AlertInitConfigList build() {
                return new AlertInitConfigList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeProductsOfActiveMetricRuleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProductsOfActiveMetricRuleResponseBody</p>
     */
    public static class AllProductInitMetricRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertInitConfigList")
        private AlertInitConfigList alertInitConfigList;

        @com.aliyun.core.annotation.NameInMap("Product")
        private String product;

        private AllProductInitMetricRule(Builder builder) {
            this.alertInitConfigList = builder.alertInitConfigList;
            this.product = builder.product;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AllProductInitMetricRule create() {
            return builder().build();
        }

        /**
         * @return alertInitConfigList
         */
        public AlertInitConfigList getAlertInitConfigList() {
            return this.alertInitConfigList;
        }

        /**
         * @return product
         */
        public String getProduct() {
            return this.product;
        }

        public static final class Builder {
            private AlertInitConfigList alertInitConfigList; 
            private String product; 

            /**
             * <p>The initial alert rules that are generated after one-click alert is enabled for a service.</p>
             */
            public Builder alertInitConfigList(AlertInitConfigList alertInitConfigList) {
                this.alertInitConfigList = alertInitConfigList;
                return this;
            }

            /**
             * <p>The abbreviation of the service name.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            public AllProductInitMetricRule build() {
                return new AllProductInitMetricRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeProductsOfActiveMetricRuleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProductsOfActiveMetricRuleResponseBody</p>
     */
    public static class AllProductInitMetricRuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllProductInitMetricRule")
        private java.util.List < AllProductInitMetricRule> allProductInitMetricRule;

        private AllProductInitMetricRuleList(Builder builder) {
            this.allProductInitMetricRule = builder.allProductInitMetricRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AllProductInitMetricRuleList create() {
            return builder().build();
        }

        /**
         * @return allProductInitMetricRule
         */
        public java.util.List < AllProductInitMetricRule> getAllProductInitMetricRule() {
            return this.allProductInitMetricRule;
        }

        public static final class Builder {
            private java.util.List < AllProductInitMetricRule> allProductInitMetricRule; 

            /**
             * AllProductInitMetricRule.
             */
            public Builder allProductInitMetricRule(java.util.List < AllProductInitMetricRule> allProductInitMetricRule) {
                this.allProductInitMetricRule = allProductInitMetricRule;
                return this;
            }

            public AllProductInitMetricRuleList build() {
                return new AllProductInitMetricRuleList(this);
            } 

        } 

    }
}
