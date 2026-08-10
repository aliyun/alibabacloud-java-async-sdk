// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link GetAiAppStatsResponseBody} extends {@link TeaModel}
 *
 * <p>GetAiAppStatsResponseBody</p>
 */
public class GetAiAppStatsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAiAppStatsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAiAppStatsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAiAppStatsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAiAppStatsResponseBody build() {
            return new GetAiAppStatsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAiAppStatsResponseBody} extends {@link TeaModel}
     *
     * <p>GetAiAppStatsResponseBody</p>
     */
    public static class TreeChart extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private TreeChart(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TreeChart create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(TreeChart model) {
                this.description = model.description;
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TreeChart build() {
                return new TreeChart(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAiAppStatsResponseBody} extends {@link TeaModel}
     *
     * <p>GetAiAppStatsResponseBody</p>
     */
    public static class LabelStatChart extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TreeChart")
        private java.util.List<TreeChart> treeChart;

        private LabelStatChart(Builder builder) {
            this.treeChart = builder.treeChart;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LabelStatChart create() {
            return builder().build();
        }

        /**
         * @return treeChart
         */
        public java.util.List<TreeChart> getTreeChart() {
            return this.treeChart;
        }

        public static final class Builder {
            private java.util.List<TreeChart> treeChart; 

            private Builder() {
            } 

            private Builder(LabelStatChart model) {
                this.treeChart = model.treeChart;
            } 

            /**
             * TreeChart.
             */
            public Builder treeChart(java.util.List<TreeChart> treeChart) {
                this.treeChart = treeChart;
                return this;
            }

            public LabelStatChart build() {
                return new LabelStatChart(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAiAppStatsResponseBody} extends {@link TeaModel}
     *
     * <p>GetAiAppStatsResponseBody</p>
     */
    public static class Y extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Long> data;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Y(Builder builder) {
            this.data = builder.data;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Y create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Long> getData() {
            return this.data;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List<Long> data; 
            private String name; 

            private Builder() {
            } 

            private Builder(Y model) {
                this.data = model.data;
                this.name = model.name;
            } 

            /**
             * Data.
             */
            public Builder data(java.util.List<Long> data) {
                this.data = data;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Y build() {
                return new Y(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAiAppStatsResponseBody} extends {@link TeaModel}
     *
     * <p>GetAiAppStatsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LabelStatChart")
        private java.util.List<LabelStatChart> labelStatChart;

        @com.aliyun.core.annotation.NameInMap("TotalStat")
        private java.util.Map<String, DataTotalStatValue> totalStat;

        @com.aliyun.core.annotation.NameInMap("X")
        private java.util.List<String> x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private java.util.List<Y> y;

        private Data(Builder builder) {
            this.labelStatChart = builder.labelStatChart;
            this.totalStat = builder.totalStat;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return labelStatChart
         */
        public java.util.List<LabelStatChart> getLabelStatChart() {
            return this.labelStatChart;
        }

        /**
         * @return totalStat
         */
        public java.util.Map<String, DataTotalStatValue> getTotalStat() {
            return this.totalStat;
        }

        /**
         * @return x
         */
        public java.util.List<String> getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public java.util.List<Y> getY() {
            return this.y;
        }

        public static final class Builder {
            private java.util.List<LabelStatChart> labelStatChart; 
            private java.util.Map<String, DataTotalStatValue> totalStat; 
            private java.util.List<String> x; 
            private java.util.List<Y> y; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.labelStatChart = model.labelStatChart;
                this.totalStat = model.totalStat;
                this.x = model.x;
                this.y = model.y;
            } 

            /**
             * LabelStatChart.
             */
            public Builder labelStatChart(java.util.List<LabelStatChart> labelStatChart) {
                this.labelStatChart = labelStatChart;
                return this;
            }

            /**
             * TotalStat.
             */
            public Builder totalStat(java.util.Map<String, DataTotalStatValue> totalStat) {
                this.totalStat = totalStat;
                return this;
            }

            /**
             * X.
             */
            public Builder x(java.util.List<String> x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(java.util.List<Y> y) {
                this.y = y;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
