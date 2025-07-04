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
         * ABMetrics.
         */
        public Builder ABMetrics(java.util.List<ABMetrics> ABMetrics) {
            this.ABMetrics = ABMetrics;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
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

        @com.aliyun.core.annotation.NameInMap("Definition")
        private String definition;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("LeftMetricId")
        private String leftMetricId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

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
            this.definition = builder.definition;
            this.description = builder.description;
            this.leftMetricId = builder.leftMetricId;
            this.name = builder.name;
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
         * @return definition
         */
        public String getDefinition() {
            return this.definition;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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
            private String definition; 
            private String description; 
            private String leftMetricId; 
            private String name; 
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
                this.definition = model.definition;
                this.description = model.description;
                this.leftMetricId = model.leftMetricId;
                this.name = model.name;
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
             * ABMetricId.
             */
            public Builder ABMetricId(String ABMetricId) {
                this.ABMetricId = ABMetricId;
                return this;
            }

            /**
             * Definition.
             */
            public Builder definition(String definition) {
                this.definition = definition;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * LeftMetricId.
             */
            public Builder leftMetricId(String leftMetricId) {
                this.leftMetricId = leftMetricId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * Realtime.
             */
            public Builder realtime(String realtime) {
                this.realtime = realtime;
                return this;
            }

            /**
             * ResultResourceId.
             */
            public Builder resultResourceId(String resultResourceId) {
                this.resultResourceId = resultResourceId;
                return this;
            }

            /**
             * ResultTableMetaId.
             */
            public Builder resultTableMetaId(String resultTableMetaId) {
                this.resultTableMetaId = resultTableMetaId;
                return this;
            }

            /**
             * RightMetricId.
             */
            public Builder rightMetricId(String rightMetricId) {
                this.rightMetricId = rightMetricId;
                return this;
            }

            /**
             * SceneId.
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * SceneName.
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * StatisticsCycle.
             */
            public Builder statisticsCycle(Integer statisticsCycle) {
                this.statisticsCycle = statisticsCycle;
                return this;
            }

            /**
             * TableMetaId.
             */
            public Builder tableMetaId(String tableMetaId) {
                this.tableMetaId = tableMetaId;
                return this;
            }

            /**
             * Type.
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
