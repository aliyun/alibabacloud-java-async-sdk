// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link QueryMetricByPageRequest} extends {@link RequestModel}
 *
 * <p>QueryMetricByPageRequest</p>
 */
public class QueryMetricByPageRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647, minimum = 1)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomFilters")
    private java.util.List<String> customFilters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dimensions")
    private java.util.List<String> dimensions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filters")
    private java.util.List<Filters> filters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntervalInSec")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647)
    private Integer intervalInSec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Measures")
    private java.util.List<String> measures;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Metric")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metric;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private QueryMetricByPageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.currentPage = builder.currentPage;
        this.customFilters = builder.customFilters;
        this.dimensions = builder.dimensions;
        this.endTime = builder.endTime;
        this.filters = builder.filters;
        this.intervalInSec = builder.intervalInSec;
        this.measures = builder.measures;
        this.metric = builder.metric;
        this.order = builder.order;
        this.orderBy = builder.orderBy;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMetricByPageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return customFilters
     */
    public java.util.List<String> getCustomFilters() {
        return this.customFilters;
    }

    /**
     * @return dimensions
     */
    public java.util.List<String> getDimensions() {
        return this.dimensions;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return filters
     */
    public java.util.List<Filters> getFilters() {
        return this.filters;
    }

    /**
     * @return intervalInSec
     */
    public Integer getIntervalInSec() {
        return this.intervalInSec;
    }

    /**
     * @return measures
     */
    public java.util.List<String> getMeasures() {
        return this.measures;
    }

    /**
     * @return metric
     */
    public String getMetric() {
        return this.metric;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<QueryMetricByPageRequest, Builder> {
        private String regionId; 
        private Integer currentPage; 
        private java.util.List<String> customFilters; 
        private java.util.List<String> dimensions; 
        private Long endTime; 
        private java.util.List<Filters> filters; 
        private Integer intervalInSec; 
        private java.util.List<String> measures; 
        private String metric; 
        private String order; 
        private String orderBy; 
        private Integer pageSize; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(QueryMetricByPageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.currentPage = request.currentPage;
            this.customFilters = request.customFilters;
            this.dimensions = request.dimensions;
            this.endTime = request.endTime;
            this.filters = request.filters;
            this.intervalInSec = request.intervalInSec;
            this.measures = request.measures;
            this.metric = request.metric;
            this.order = request.order;
            this.orderBy = request.orderBy;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The page number. Default value: <code>1</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Custom filter conditions.</p>
         */
        public Builder customFilters(java.util.List<String> customFilters) {
            this.putQueryParameter("CustomFilters", customFilters);
            this.customFilters = customFilters;
            return this;
        }

        /**
         * <p>The dimensions of the metric that you want to query.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;detector_browser&quot;,&quot;detector_device&quot;]</p>
         */
        public Builder dimensions(java.util.List<String> dimensions) {
            this.putQueryParameter("Dimensions", dimensions);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * <p>The end of the time range to query. Unit: milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1667546895000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The filter conditions.</p>
         */
        public Builder filters(java.util.List<Filters> filters) {
            this.putQueryParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * <p>The time interval at which you want to query metric data. Unit: milliseconds. Minimum value: 60000.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        public Builder intervalInSec(Integer intervalInSec) {
            this.putQueryParameter("IntervalInSec", intervalInSec);
            this.intervalInSec = intervalInSec;
            return this;
        }

        /**
         * <p>The measures of the metric that you want to query.</p>
         * 
         * <strong>example:</strong>
         * <p>pv</p>
         */
        public Builder measures(java.util.List<String> measures) {
            this.putQueryParameter("Measures", measures);
            this.measures = measures;
            return this;
        }

        /**
         * <p>The metric that you want to query. You cannot specify a custom metric. For more information, see the &quot;Application monitoring metrics that can be queried&quot; section.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>appstat.host</p>
         */
        public Builder metric(String metric) {
            this.putQueryParameter("Metric", metric);
            this.metric = metric;
            return this;
        }

        /**
         * <p>The order in which measures are sorted. Valid values:</p>
         * <ul>
         * <li><code>ASC</code>: ascending order</li>
         * <li><code>DESC</code>: descending order</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify the parameter, data is not sorted.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ASC</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The dimension from which metrics are sorted. You can set this parameter to a supported dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>pid</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>This parameter is no longer supported. The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The start of the time range to query. Unit: milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1667287695000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public QueryMetricByPageRequest build() {
            return new QueryMetricByPageRequest(this);
        } 

    } 

    /**
     * 
     * {@link QueryMetricByPageRequest} extends {@link TeaModel}
     *
     * <p>QueryMetricByPageRequest</p>
     */
    public static class Filters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Filters(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filters create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The key of the filter condition. You must set the key to <code>pid</code> or <code>regionId</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>pid</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the filter condition. You must set the value of the <code>pid</code> or <code>regionId</code> condition. For information about how to obtain the <code>pid</code>, see the &quot;Obtain the PID of an application&quot; section.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx@74xxx</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Filters build() {
                return new Filters(this);
            } 

        } 

    }
}
