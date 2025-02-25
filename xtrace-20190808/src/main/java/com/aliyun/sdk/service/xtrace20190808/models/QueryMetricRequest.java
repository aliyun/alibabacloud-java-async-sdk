// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtrace20190808.models;

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
 * {@link QueryMetricRequest} extends {@link RequestModel}
 *
 * <p>QueryMetricRequest</p>
 */
public class QueryMetricRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

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
    private Integer intervalInSec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Integer limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Measures")
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.NameInMap("ProxyUserId")
    private String proxyUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private QueryMetricRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dimensions = builder.dimensions;
        this.endTime = builder.endTime;
        this.filters = builder.filters;
        this.intervalInSec = builder.intervalInSec;
        this.limit = builder.limit;
        this.measures = builder.measures;
        this.metric = builder.metric;
        this.order = builder.order;
        this.orderBy = builder.orderBy;
        this.proxyUserId = builder.proxyUserId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMetricRequest create() {
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
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
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
     * @return proxyUserId
     */
    public String getProxyUserId() {
        return this.proxyUserId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<QueryMetricRequest, Builder> {
        private String regionId; 
        private java.util.List<String> dimensions; 
        private Long endTime; 
        private java.util.List<Filters> filters; 
        private Integer intervalInSec; 
        private Integer limit; 
        private java.util.List<String> measures; 
        private String metric; 
        private String order; 
        private String orderBy; 
        private String proxyUserId; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(QueryMetricRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dimensions = request.dimensions;
            this.endTime = request.endTime;
            this.filters = request.filters;
            this.intervalInSec = request.intervalInSec;
            this.limit = request.limit;
            this.measures = request.measures;
            this.metric = request.metric;
            this.order = request.order;
            this.orderBy = request.orderBy;
            this.proxyUserId = request.proxyUserId;
            this.startTime = request.startTime;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The dimensions of the metric that you want to query.</p>
         * 
         * <strong>example:</strong>
         * <p>RT</p>
         */
        public Builder dimensions(java.util.List<String> dimensions) {
            this.putQueryParameter("Dimensions", dimensions);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * <p>The end of the time range to query. The value is a timestamp that is accurate to milliseconds.</p>
         * <blockquote>
         * <p> The value of this parameter is of the LONG type. Precision loss may occur during serialization or deserialization. The value must be less than or equal to 9007199254740991.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1575622455686</p>
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
         * <p>The time interval at which you want to query metric data. Unit: milliseconds. Minimum value: 60000. </p>
         * <blockquote>
         * <p>If you set this parameter to 2147483647, all data in the specified time interval is returned.</p>
         * </blockquote>
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
         * <p>The maximum number of entries that you want to return.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The measures of the metric that you want to query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>count</p>
         */
        public Builder measures(java.util.List<String> measures) {
            this.putQueryParameter("Measures", measures);
            this.measures = measures;
            return this;
        }

        /**
         * <p>The name of the metric. Valid values:</p>
         * <ul>
         * <li><code>appstat.incall</code>: trace statistics </li>
         * <li><code>appstat.sql</code>: SQL statistics</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>appstat.incall</p>
         */
        public Builder metric(String metric) {
            this.putQueryParameter("Metric", metric);
            this.metric = metric;
            return this;
        }

        /**
         * <p>The order in which you want to sort the returned entries. Valid values:</p>
         * <ul>
         * <li>ASC: ascending order </li>
         * <li>DESC: descending order</li>
         * </ul>
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
         * <p>The field based on which you want to sort the returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>count</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The ID of the proxy user.</p>
         * 
         * <strong>example:</strong>
         * <p>testefgag12</p>
         */
        public Builder proxyUserId(String proxyUserId) {
            this.putQueryParameter("ProxyUserId", proxyUserId);
            this.proxyUserId = proxyUserId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The value is a timestamp that is accurate to milliseconds.</p>
         * <blockquote>
         * <p> The value of this parameter is of the LONG type. Precision loss may occur during serialization or deserialization. The value must be less than or equal to 9007199254740991.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1575561600000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public QueryMetricRequest build() {
            return new QueryMetricRequest(this);
        } 

    } 

    /**
     * 
     * {@link QueryMetricRequest} extends {@link TeaModel}
     *
     * <p>QueryMetricRequest</p>
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
             * <p>The key of the field that you want to use to filter the returned entries.</p>
             * 
             * <strong>example:</strong>
             * <p>http.status_code</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the field that you want to use to filter the returned entries.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
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
