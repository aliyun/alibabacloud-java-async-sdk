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
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Datapoints.
         */
        public Builder datapoints(String datapoints) {
            this.datapoints = datapoints;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call was successful. Valid values:
         * <p>
         * 
         * *   true: The call was successful.
         * *   false: The call failed.
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
        @NameInMap("EvaluationCount")
        private String evaluationCount;

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
            this.evaluationCount = builder.evaluationCount;
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
         * @return evaluationCount
         */
        public String getEvaluationCount() {
            return this.evaluationCount;
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
            private String evaluationCount; 
            private String metricName; 
            private String namespace; 
            private String period; 
            private String statistics; 
            private String threshold; 

            /**
             * The consecutive number of times for which the metric value is measured before an alert is triggered.
             */
            public Builder evaluationCount(String evaluationCount) {
                this.evaluationCount = evaluationCount;
                return this;
            }

            /**
             * The name of the metric. For more information, see [Appendix 1: Metrics](~~163515~~).
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
             * The aggregation period of the monitoring data. Unit: minutes. For more information, see [Appendix 1: Metrics](~~163515~~).
             */
            public Builder period(String period) {
                this.period = period;
                return this;
            }

            /**
             * The statistical aggregation method that is used to calculate metric values that trigger alerts. For more information, see [Appendix 1: Metrics](~~163515~~).
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * The threshold of the metric value.
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
             * Product.
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
