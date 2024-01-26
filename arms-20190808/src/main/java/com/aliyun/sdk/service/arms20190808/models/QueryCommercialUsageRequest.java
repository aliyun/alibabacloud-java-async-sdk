// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCommercialUsageRequest} extends {@link RequestModel}
 *
 * <p>QueryCommercialUsageRequest</p>
 */
public class QueryCommercialUsageRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AdvancedFilters")
    private java.util.List < AdvancedFilters> advancedFilters;

    @Query
    @NameInMap("Dimensions")
    private java.util.List < String > dimensions;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Query
    @NameInMap("IntervalInSec")
    @Validation(maximum = 2147483647)
    private Integer intervalInSec;

    @Query
    @NameInMap("Measures")
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
    @NameInMap("QueryType")
    @Validation(required = true)
    private String queryType;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
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
        @NameInMap("Key")
        private String key;

        @NameInMap("OpType")
        private String opType;

        @NameInMap("Value")
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
