// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCommercialUsageRequest} extends {@link RequestModel}
 *
 * <p>QueryCommercialUsageRequest</p>
 */
public class QueryCommercialUsageRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdvancedFilters")
    private java.util.List < AdvancedFilters> advancedFilters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dimensions")
    private java.util.List < String > dimensions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntervalInSec")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647)
    private Integer intervalInSec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Measures")
    private java.util.List < String > measures;

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
    @com.aliyun.core.annotation.NameInMap("QueryType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String queryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private QueryCommercialUsageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.advancedFilters = builder.advancedFilters;
        this.dimensions = builder.dimensions;
        this.endTime = builder.endTime;
        this.intervalInSec = builder.intervalInSec;
        this.measures = builder.measures;
        this.metric = builder.metric;
        this.order = builder.order;
        this.orderBy = builder.orderBy;
        this.queryType = builder.queryType;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCommercialUsageRequest create() {
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
     * @return advancedFilters
     */
    public java.util.List < AdvancedFilters> getAdvancedFilters() {
        return this.advancedFilters;
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
     * @return intervalInSec
     */
    public Integer getIntervalInSec() {
        return this.intervalInSec;
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
     * @return queryType
     */
    public String getQueryType() {
        return this.queryType;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<QueryCommercialUsageRequest, Builder> {
        private String regionId; 
        private java.util.List < AdvancedFilters> advancedFilters; 
        private java.util.List < String > dimensions; 
        private Long endTime; 
        private Integer intervalInSec; 
        private java.util.List < String > measures; 
        private String metric; 
        private String order; 
        private String orderBy; 
        private String queryType; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(QueryCommercialUsageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.advancedFilters = request.advancedFilters;
            this.dimensions = request.dimensions;
            this.endTime = request.endTime;
            this.intervalInSec = request.intervalInSec;
            this.measures = request.measures;
            this.metric = request.metric;
            this.order = request.order;
            this.orderBy = request.orderBy;
            this.queryType = request.queryType;
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
         * AdvancedFilters.
         */
        public Builder advancedFilters(java.util.List < AdvancedFilters> advancedFilters) {
            this.putQueryParameter("AdvancedFilters", advancedFilters);
            this.advancedFilters = advancedFilters;
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
         * IntervalInSec.
         */
        public Builder intervalInSec(Integer intervalInSec) {
            this.putQueryParameter("IntervalInSec", intervalInSec);
            this.intervalInSec = intervalInSec;
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
         * QueryType.
         */
        public Builder queryType(String queryType) {
            this.putQueryParameter("QueryType", queryType);
            this.queryType = queryType;
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
        public QueryCommercialUsageRequest build() {
            return new QueryCommercialUsageRequest(this);
        } 

    } 

    public static class AdvancedFilters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("OpType")
        private String opType;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private AdvancedFilters(Builder builder) {
            this.key = builder.key;
            this.opType = builder.opType;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdvancedFilters create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return opType
         */
        public String getOpType() {
            return this.opType;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String opType; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * OpType.
             */
            public Builder opType(String opType) {
                this.opType = opType;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public AdvancedFilters build() {
                return new AdvancedFilters(this);
            } 

        } 

    }
}
