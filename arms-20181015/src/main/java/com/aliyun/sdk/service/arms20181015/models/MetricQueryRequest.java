// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20181015.models;

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
 * {@link MetricQueryRequest} extends {@link RequestModel}
 *
 * <p>MetricQueryRequest</p>
 */
public class MetricQueryRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("HackerUserId")
    private String hackerUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IintervalInSec")
    private Integer iintervalInSec;

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
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private MetricQueryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dimensions = builder.dimensions;
        this.endTime = builder.endTime;
        this.filters = builder.filters;
        this.hackerUserId = builder.hackerUserId;
        this.iintervalInSec = builder.iintervalInSec;
        this.limit = builder.limit;
        this.measures = builder.measures;
        this.metric = builder.metric;
        this.order = builder.order;
        this.orderBy = builder.orderBy;
        this.securityToken = builder.securityToken;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MetricQueryRequest create() {
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
     * @return hackerUserId
     */
    public String getHackerUserId() {
        return this.hackerUserId;
    }

    /**
     * @return iintervalInSec
     */
    public Integer getIintervalInSec() {
        return this.iintervalInSec;
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<MetricQueryRequest, Builder> {
        private String regionId; 
        private java.util.List<String> dimensions; 
        private Long endTime; 
        private java.util.List<Filters> filters; 
        private String hackerUserId; 
        private Integer iintervalInSec; 
        private Integer limit; 
        private java.util.List<String> measures; 
        private String metric; 
        private String order; 
        private String orderBy; 
        private String securityToken; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(MetricQueryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dimensions = request.dimensions;
            this.endTime = request.endTime;
            this.filters = request.filters;
            this.hackerUserId = request.hackerUserId;
            this.iintervalInSec = request.iintervalInSec;
            this.limit = request.limit;
            this.measures = request.measures;
            this.metric = request.metric;
            this.order = request.order;
            this.orderBy = request.orderBy;
            this.securityToken = request.securityToken;
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
         * Dimensions.
         */
        public Builder dimensions(java.util.List<String> dimensions) {
            this.putQueryParameter("Dimensions", dimensions);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Filters.
         */
        public Builder filters(java.util.List<Filters> filters) {
            this.putQueryParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * HackerUserId.
         */
        public Builder hackerUserId(String hackerUserId) {
            this.putQueryParameter("HackerUserId", hackerUserId);
            this.hackerUserId = hackerUserId;
            return this;
        }

        /**
         * IintervalInSec.
         */
        public Builder iintervalInSec(Integer iintervalInSec) {
            this.putQueryParameter("IintervalInSec", iintervalInSec);
            this.iintervalInSec = iintervalInSec;
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
         * <p>This parameter is required.</p>
         */
        public Builder measures(java.util.List<String> measures) {
            this.putQueryParameter("Measures", measures);
            this.measures = measures;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public MetricQueryRequest build() {
            return new MetricQueryRequest(this);
        } 

    } 

    /**
     * 
     * {@link MetricQueryRequest} extends {@link TeaModel}
     *
     * <p>MetricQueryRequest</p>
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

            private Builder() {
            } 

            private Builder(Filters model) {
                this.key = model.key;
                this.value = model.value;
            } 

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
