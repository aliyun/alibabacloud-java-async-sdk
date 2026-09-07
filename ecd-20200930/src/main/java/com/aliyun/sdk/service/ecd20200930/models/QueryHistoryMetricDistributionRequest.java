// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link QueryHistoryMetricDistributionRequest} extends {@link RequestModel}
 *
 * <p>QueryHistoryMetricDistributionRequest</p>
 */
public class QueryHistoryMetricDistributionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricName")
    private String metricName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ranges")
    private java.util.List<Ranges> ranges;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    private QueryHistoryMetricDistributionRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.metricName = builder.metricName;
        this.ranges = builder.ranges;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryHistoryMetricDistributionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return ranges
     */
    public java.util.List<Ranges> getRanges() {
        return this.ranges;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<QueryHistoryMetricDistributionRequest, Builder> {
        private String endDate; 
        private String metricName; 
        private java.util.List<Ranges> ranges; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(QueryHistoryMetricDistributionRequest request) {
            super(request);
            this.endDate = request.endDate;
            this.metricName = request.metricName;
            this.ranges = request.ranges;
            this.startDate = request.startDate;
        } 

        /**
         * <p>The end date for statistics. Format: &quot;YYYY-MM-DD&quot;. Default value: T-1.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-01</p>
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The monitoring metrics type.</p>
         * 
         * <strong>example:</strong>
         * <p>LOAD_SCORE</p>
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * <p>The custom value ranges.</p>
         */
        public Builder ranges(java.util.List<Ranges> ranges) {
            this.putQueryParameter("Ranges", ranges);
            this.ranges = ranges;
            return this;
        }

        /**
         * <p>The start date for statistics. Format: &quot;YYYY-MM-DD&quot;. Default value: T-1.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-01</p>
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public QueryHistoryMetricDistributionRequest build() {
            return new QueryHistoryMetricDistributionRequest(this);
        } 

    } 

    /**
     * 
     * {@link QueryHistoryMetricDistributionRequest} extends {@link TeaModel}
     *
     * <p>QueryHistoryMetricDistributionRequest</p>
     */
    public static class Ranges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IncludeMax")
        private Boolean includeMax;

        @com.aliyun.core.annotation.NameInMap("IncludeMin")
        private Boolean includeMin;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Max")
        private Float max;

        @com.aliyun.core.annotation.NameInMap("Min")
        private Float min;

        private Ranges(Builder builder) {
            this.includeMax = builder.includeMax;
            this.includeMin = builder.includeMin;
            this.label = builder.label;
            this.max = builder.max;
            this.min = builder.min;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ranges create() {
            return builder().build();
        }

        /**
         * @return includeMax
         */
        public Boolean getIncludeMax() {
            return this.includeMax;
        }

        /**
         * @return includeMin
         */
        public Boolean getIncludeMin() {
            return this.includeMin;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return max
         */
        public Float getMax() {
            return this.max;
        }

        /**
         * @return min
         */
        public Float getMin() {
            return this.min;
        }

        public static final class Builder {
            private Boolean includeMax; 
            private Boolean includeMin; 
            private String label; 
            private Float max; 
            private Float min; 

            private Builder() {
            } 

            private Builder(Ranges model) {
                this.includeMax = model.includeMax;
                this.includeMin = model.includeMin;
                this.label = model.label;
                this.max = model.max;
                this.min = model.min;
            } 

            /**
             * <p>Specifies whether to include the maximum value. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder includeMax(Boolean includeMax) {
                this.includeMax = includeMax;
                return this;
            }

            /**
             * <p>Specifies whether to include the minimum value. Default value: true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder includeMin(Boolean includeMin) {
                this.includeMin = includeMin;
                return this;
            }

            /**
             * <p>The range label, which is used in the response.</p>
             * 
             * <strong>example:</strong>
             * <p>label-02\&quot;</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The maximum value.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder max(Float max) {
                this.max = max;
                return this;
            }

            /**
             * <p>The minimum value.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder min(Float min) {
                this.min = min;
                return this;
            }

            public Ranges build() {
                return new Ranges(this);
            } 

        } 

    }
}
