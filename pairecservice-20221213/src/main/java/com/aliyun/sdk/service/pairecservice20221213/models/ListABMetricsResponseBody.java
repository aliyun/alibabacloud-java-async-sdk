// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ListABMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>ListABMetricsResponseBody</p>
 */
public class ListABMetricsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ABMetrics")
    private java.util.List<ABMetrics> ABMetrics;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListABMetricsResponseBody(Builder builder) {
        this.ABMetrics = builder.ABMetrics;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListABMetricsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ABMetrics
     */
    public java.util.List<ABMetrics> getABMetrics() {
        return this.ABMetrics;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<ABMetrics> ABMetrics; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListABMetricsResponseBody model) {
            this.ABMetrics = model.ABMetrics;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of AB test metrics.</p>
         */
        public Builder ABMetrics(java.util.List<ABMetrics> ABMetrics) {
            this.ABMetrics = ABMetrics;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F7AC05FF-EDE7-5C2B-B9AE-33D6DF4178BA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListABMetricsResponseBody build() {
            return new ListABMetricsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListABMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>ListABMetricsResponseBody</p>
     */
    public static class ABMetrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ABMetricId")
        private String ABMetricId;

        @com.aliyun.core.annotation.NameInMap("AggregationByUser")
        private Boolean aggregationByUser;

        @com.aliyun.core.annotation.NameInMap("Definition")
        private String definition;

        @com.aliyun.core.annotation.NameInMap("Denominator")
        private String denominator;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("IsBinomialDistribution")
        private Boolean isBinomialDistribution;

        @com.aliyun.core.annotation.NameInMap("LeftMetricId")
        private String leftMetricId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NeedSignificance")
        private Boolean needSignificance;

        @com.aliyun.core.annotation.NameInMap("Numerator")
        private String numerator;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Realtime")
        private String realtime;

        @com.aliyun.core.annotation.NameInMap("ResultResourceId")
        private String resultResourceId;

        @com.aliyun.core.annotation.NameInMap("ResultTableMetaId")
        private String resultTableMetaId;

        @com.aliyun.core.annotation.NameInMap("RightMetricId")
        private String rightMetricId;

        @com.aliyun.core.annotation.NameInMap("SceneId")
        private String sceneId;

        @com.aliyun.core.annotation.NameInMap("SceneName")
        private String sceneName;

        @com.aliyun.core.annotation.NameInMap("StatisticsCycle")
        private Integer statisticsCycle;

        @com.aliyun.core.annotation.NameInMap("TableMetaId")
        private String tableMetaId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ABMetrics(Builder builder) {
            this.ABMetricId = builder.ABMetricId;
            this.aggregationByUser = builder.aggregationByUser;
            this.definition = builder.definition;
            this.denominator = builder.denominator;
            this.description = builder.description;
            this.isBinomialDistribution = builder.isBinomialDistribution;
            this.leftMetricId = builder.leftMetricId;
            this.name = builder.name;
            this.needSignificance = builder.needSignificance;
            this.numerator = builder.numerator;
            this.operator = builder.operator;
            this.realtime = builder.realtime;
            this.resultResourceId = builder.resultResourceId;
            this.resultTableMetaId = builder.resultTableMetaId;
            this.rightMetricId = builder.rightMetricId;
            this.sceneId = builder.sceneId;
            this.sceneName = builder.sceneName;
            this.statisticsCycle = builder.statisticsCycle;
            this.tableMetaId = builder.tableMetaId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ABMetrics create() {
            return builder().build();
        }

        /**
         * @return ABMetricId
         */
        public String getABMetricId() {
            return this.ABMetricId;
        }

        /**
         * @return aggregationByUser
         */
        public Boolean getAggregationByUser() {
            return this.aggregationByUser;
        }

        /**
         * @return definition
         */
        public String getDefinition() {
            return this.definition;
        }

        /**
         * @return denominator
         */
        public String getDenominator() {
            return this.denominator;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return isBinomialDistribution
         */
        public Boolean getIsBinomialDistribution() {
            return this.isBinomialDistribution;
        }

        /**
         * @return leftMetricId
         */
        public String getLeftMetricId() {
            return this.leftMetricId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return needSignificance
         */
        public Boolean getNeedSignificance() {
            return this.needSignificance;
        }

        /**
         * @return numerator
         */
        public String getNumerator() {
            return this.numerator;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return realtime
         */
        public String getRealtime() {
            return this.realtime;
        }

        /**
         * @return resultResourceId
         */
        public String getResultResourceId() {
            return this.resultResourceId;
        }

        /**
         * @return resultTableMetaId
         */
        public String getResultTableMetaId() {
            return this.resultTableMetaId;
        }

        /**
         * @return rightMetricId
         */
        public String getRightMetricId() {
            return this.rightMetricId;
        }

        /**
         * @return sceneId
         */
        public String getSceneId() {
            return this.sceneId;
        }

        /**
         * @return sceneName
         */
        public String getSceneName() {
            return this.sceneName;
        }

        /**
         * @return statisticsCycle
         */
        public Integer getStatisticsCycle() {
            return this.statisticsCycle;
        }

        /**
         * @return tableMetaId
         */
        public String getTableMetaId() {
            return this.tableMetaId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String ABMetricId; 
            private Boolean aggregationByUser; 
            private String definition; 
            private String denominator; 
            private String description; 
            private Boolean isBinomialDistribution; 
            private String leftMetricId; 
            private String name; 
            private Boolean needSignificance; 
            private String numerator; 
            private String operator; 
            private String realtime; 
            private String resultResourceId; 
            private String resultTableMetaId; 
            private String rightMetricId; 
            private String sceneId; 
            private String sceneName; 
            private Integer statisticsCycle; 
            private String tableMetaId; 
            private String type; 

            private Builder() {
            } 

            private Builder(ABMetrics model) {
                this.ABMetricId = model.ABMetricId;
                this.aggregationByUser = model.aggregationByUser;
                this.definition = model.definition;
                this.denominator = model.denominator;
                this.description = model.description;
                this.isBinomialDistribution = model.isBinomialDistribution;
                this.leftMetricId = model.leftMetricId;
                this.name = model.name;
                this.needSignificance = model.needSignificance;
                this.numerator = model.numerator;
                this.operator = model.operator;
                this.realtime = model.realtime;
                this.resultResourceId = model.resultResourceId;
                this.resultTableMetaId = model.resultTableMetaId;
                this.rightMetricId = model.rightMetricId;
                this.sceneId = model.sceneId;
                this.sceneName = model.sceneName;
                this.statisticsCycle = model.statisticsCycle;
                this.tableMetaId = model.tableMetaId;
                this.type = model.type;
            } 

            /**
             * <p>The ID of the AB test metric.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ABMetricId(String ABMetricId) {
                this.ABMetricId = ABMetricId;
                return this;
            }

            /**
             * <p>Specifies whether to calculate significance based on the user dimension. The calculation can be based on users or samples.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder aggregationByUser(Boolean aggregationByUser) {
                this.aggregationByUser = aggregationByUser;
                return this;
            }

            /**
             * <p>The metric definition.</p>
             * 
             * <strong>example:</strong>
             * <p>sum(click_cnt)</p>
             */
            public Builder definition(String definition) {
                this.definition = definition;
                return this;
            }

            /**
             * <p>The denominator used for significance calculation.</p>
             * 
             * <strong>example:</strong>
             * <p>pv</p>
             */
            public Builder denominator(String denominator) {
                this.denominator = denominator;
                return this;
            }

            /**
             * <p>The metric description.</p>
             * 
             * <strong>example:</strong>
             * <p>PV metric</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Specifies whether the current metric conforms to a binomial distribution when the metric type is a derived metric. If yes, the mean and variance of the metric are calculated based on the binomial distribution.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isBinomialDistribution(Boolean isBinomialDistribution) {
                this.isBinomialDistribution = isBinomialDistribution;
                return this;
            }

            /**
             * <p>The ID of the left metric for the derived metric.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder leftMetricId(String leftMetricId) {
                this.leftMetricId = leftMetricId;
                return this;
            }

            /**
             * <p>The metric name.</p>
             * 
             * <strong>example:</strong>
             * <p>pv</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Specifies whether to calculate significance.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needSignificance(Boolean needSignificance) {
                this.needSignificance = needSignificance;
                return this;
            }

            /**
             * <p>The numerator used for significance calculation.</p>
             * 
             * <strong>example:</strong>
             * <p>click</p>
             */
            public Builder numerator(String numerator) {
                this.numerator = numerator;
                return this;
            }

            /**
             * <p>The operator used to calculate the derived metric. Valid values:</p>
             * <ul>
             * <li><p>Plus: Addition.</p>
             * </li>
             * <li><p>Minus: Subtraction.</p>
             * </li>
             * <li><p>Multiplication: Multiplication.</p>
             * </li>
             * <li><p>Division: Division.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Division</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>Specifies whether the metric is a real-time metric. Valid values:</p>
             * <ul>
             * <li><p>true: Yes.</p>
             * </li>
             * <li><p>false: No.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder realtime(String realtime) {
                this.realtime = realtime;
                return this;
            }

            /**
             * <p>The ID of the data source for the write-back data table.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder resultResourceId(String resultResourceId) {
                this.resultResourceId = resultResourceId;
                return this;
            }

            /**
             * <p>The ID of the data table to which data is written back.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder resultTableMetaId(String resultTableMetaId) {
                this.resultTableMetaId = resultTableMetaId;
                return this;
            }

            /**
             * <p>The ID of the right metric for the derived metric.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder rightMetricId(String rightMetricId) {
                this.rightMetricId = rightMetricId;
                return this;
            }

            /**
             * <p>The scene ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * <p>The scene name.</p>
             * 
             * <strong>example:</strong>
             * <p>home_feed</p>
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * <p>The statistical period.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder statisticsCycle(Integer statisticsCycle) {
                this.statisticsCycle = statisticsCycle;
                return this;
            }

            /**
             * <p>The ID of the data table.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder tableMetaId(String tableMetaId) {
                this.tableMetaId = tableMetaId;
                return this;
            }

            /**
             * <p>The metric type. Valid values:</p>
             * <ul>
             * <li><p>Single: Single metric.</p>
             * </li>
             * <li><p>Derived: Derived metric.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Single</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ABMetrics build() {
                return new ABMetrics(this);
            } 

        } 

    }
}
