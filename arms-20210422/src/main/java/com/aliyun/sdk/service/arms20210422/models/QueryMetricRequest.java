// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMetricRequest} extends {@link RequestModel}
 *
 * <p>QueryMetricRequest</p>
 */
public class QueryMetricRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ConsistencyDataKey")
    private String consistencyDataKey;

    @Query
    @NameInMap("ConsistencyQueryStrategy")
    private String consistencyQueryStrategy;

    @Query
    @NameInMap("Dimensions")
    private java.util.List < String > dimensions;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Query
    @NameInMap("Filters")
    private java.util.List < Filters> filters;

    @Query
    @NameInMap("IntervalInSec")
    private Integer intervalInSec;

    @Query
    @NameInMap("Limit")
    private Integer limit;

    @Query
    @NameInMap("Measures")
    @Validation(required = true)
    private java.util.List < String > measures;

    @Query
    @NameInMap("Metric")
    @Validation(required = true)
    private String metric;

    @Query
    @NameInMap("Order")
    private String order;

    @Query
    @NameInMap("OrderBy")
    private String orderBy;

    @Query
    @NameInMap("ProxyUserId")
    private String proxyUserId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    private QueryMetricRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.consistencyDataKey = builder.consistencyDataKey;
        this.consistencyQueryStrategy = builder.consistencyQueryStrategy;
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
     * @return consistencyDataKey
     */
    public String getConsistencyDataKey() {
        return this.consistencyDataKey;
    }

    /**
     * @return consistencyQueryStrategy
     */
    public String getConsistencyQueryStrategy() {
        return this.consistencyQueryStrategy;
    }

    /**
     * @return dimensions
     */
    public java.util.List < String > getDimensions() {
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
    public java.util.List < Filters> getFilters() {
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
    public java.util.List < String > getMeasures() {
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
        private String consistencyDataKey; 
        private String consistencyQueryStrategy; 
        private java.util.List < String > dimensions; 
        private Long endTime; 
        private java.util.List < Filters> filters; 
        private Integer intervalInSec; 
        private Integer limit; 
        private java.util.List < String > measures; 
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
            this.consistencyDataKey = request.consistencyDataKey;
            this.consistencyQueryStrategy = request.consistencyQueryStrategy;
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
         * ConsistencyDataKey.
         */
        public Builder consistencyDataKey(String consistencyDataKey) {
            this.putQueryParameter("ConsistencyDataKey", consistencyDataKey);
            this.consistencyDataKey = consistencyDataKey;
            return this;
        }

        /**
         * ConsistencyQueryStrategy.
         */
        public Builder consistencyQueryStrategy(String consistencyQueryStrategy) {
            this.putQueryParameter("ConsistencyQueryStrategy", consistencyQueryStrategy);
            this.consistencyQueryStrategy = consistencyQueryStrategy;
            return this;
        }

        /**
         * Dimensions.
         */
        public Builder dimensions(java.util.List < String > dimensions) {
            this.putQueryParameter("Dimensions", dimensions);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Filters.
         */
        public Builder filters(java.util.List < Filters> filters) {
            this.putQueryParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * IntervalInSec.
         */
        public Builder intervalInSec(Integer intervalInSec) {
            this.putQueryParameter("IntervalInSec", intervalInSec);
            this.intervalInSec = intervalInSec;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * Measures.
         */
        public Builder measures(java.util.List < String > measures) {
            this.putQueryParameter("Measures", measures);
            this.measures = measures;
            return this;
        }

        /**
         * Metric.
         */
        public Builder metric(String metric) {
            this.putQueryParameter("Metric", metric);
            this.metric = metric;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * OrderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * ProxyUserId.
         */
        public Builder proxyUserId(String proxyUserId) {
            this.putQueryParameter("ProxyUserId", proxyUserId);
            this.proxyUserId = proxyUserId;
            return this;
        }

        /**
         * StartTime.
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

    public static class Filters extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
