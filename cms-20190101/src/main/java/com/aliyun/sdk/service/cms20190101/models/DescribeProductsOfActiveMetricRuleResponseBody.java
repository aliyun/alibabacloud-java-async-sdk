// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProductsOfActiveMetricRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProductsOfActiveMetricRuleResponseBody</p>
 */
public class DescribeProductsOfActiveMetricRuleResponseBody extends TeaModel {
    @NameInMap("AllProductInitMetricRuleList")
    private AllProductInitMetricRuleList allProductInitMetricRuleList;

    @NameInMap("Code")
    private Integer code;

    @NameInMap("Datapoints")
    private String datapoints;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * The information about the services for which one-click alert is enabled.
         */
        public Builder allProductInitMetricRuleList(AllProductInitMetricRuleList allProductInitMetricRuleList) {
            this.allProductInitMetricRuleList = allProductInitMetricRuleList;
            return this;
        }

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the request was successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The information about the services for which one-click alert is enabled. Services are separated with commas (,). Valid values:
         * <p>
         * 
         * *   ecs: Elastic Compute Service (ECS)
         * *   rds: ApsaraDB RDS
         * *   slb: Server Load Balancer (SLB)
         * *   redis_standard: ApsaraDB for Redis of the standard architecture
         * *   redis_sharding: ApsaraDB for Redis of the cluster architecture
         * *   redis_splitrw: ApsaraDB for Redis of the read/write splitting architecture
         * *   mongodb: ApsaraDB for MongoDB of the replica set architecture
         * *   mongodb_sharding: ApsaraDB for MongoDB of the sharded cluster architecture
         * *   hbase: ApsaraDB for HBase
         * *   elasticsearch: Elasticsearch
         * *   opensearch: OpenSearch
         */
        public Builder datapoints(String datapoints) {
            this.datapoints = datapoints;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true: The request was successful.
         * *   false: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeProductsOfActiveMetricRuleResponseBody build() {
            return new DescribeProductsOfActiveMetricRuleResponseBody(this);
        } 

    } 

    public static class AlertInitConfig extends TeaModel {
        @NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @NameInMap("EvaluationCount")
        private String evaluationCount;

        @NameInMap("Level")
        private String level;

        @NameInMap("MetricName")
        private String metricName;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("Period")
        private String period;

        @NameInMap("Statistics")
        private String statistics;

        @NameInMap("Threshold")
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
             * The operator that is used to compare the metric value with the threshold for Warn-level alerts.
             * <p>
             * 
             * Valid values:
             * 
             * *   LessThanThreshold: less than the threshold
             * 
             * *   GreaterThanLastWeek: greater than the metric value at the same time last week
             * 
             * *   LessThanOrEqualToThreshold: less than or equal to the threshold
             * 
             * *   NotEqualToThreshold: does not equal to the threshold
             * 
             * *   GreaterThanLastPeriod: greater than the metric value in the last monitoring cycle
             * 
             * *   GreaterThanYesterday: greater than the metric value at the same time yesterday
             * 
             * *   LessThanYesterday: less than the metric value at the same time yesterday
             * 
             * *   LessThanLastWeek: less than the metric value at the same time last week
             * 
             * *   GreaterThanOrEqualToThreshold: greater than or equal to the threshold
             * 
             * *   GreaterThanThreshold: greater than the threshold
             * 
             * *   LessThanLastPeriod: less than the metric value in the last monitoring cycle
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * The consecutive number of times for which the metric value meets the alert condition before an alert is triggered.
             */
            public Builder evaluationCount(String evaluationCount) {
                this.evaluationCount = evaluationCount;
                return this;
            }

            /**
             * The alert level.
             * <p>
             * 
             * Valid values:
             * 
             * *   INFO
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   WARN
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   CRITICAL
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * The metric name. For more information, see [Appendix 1: Metrics](~~163515~~).
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * The namespace of the service. For more information, see [Appendix 1: Metrics](~~163515~~).
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The aggregation period of monitoring data. Unit: minutes. For more information, see [Appendix 1: Metrics](~~163515~~).
             */
            public Builder period(String period) {
                this.period = period;
                return this;
            }

            /**
             * The method used to calculate metric values that trigger alerts. For more information, see [Appendix 1: Metrics](~~163515~~).
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * The alert threshold.
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
    public static class AlertInitConfigList extends TeaModel {
        @NameInMap("AlertInitConfig")
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
    public static class AllProductInitMetricRule extends TeaModel {
        @NameInMap("AlertInitConfigList")
        private AlertInitConfigList alertInitConfigList;

        @NameInMap("Product")
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
             * The initial alert rules that are generated after one-click alert is enabled for a service.
             */
            public Builder alertInitConfigList(AlertInitConfigList alertInitConfigList) {
                this.alertInitConfigList = alertInitConfigList;
                return this;
            }

            /**
             * The abbreviation of the service name.
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
    public static class AllProductInitMetricRuleList extends TeaModel {
        @NameInMap("AllProductInitMetricRule")
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
