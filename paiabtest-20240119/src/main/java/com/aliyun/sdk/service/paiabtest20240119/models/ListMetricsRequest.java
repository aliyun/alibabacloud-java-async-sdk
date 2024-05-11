// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMetricsRequest} extends {@link RequestModel}
 *
 * <p>ListMetricsRequest</p>
 */
public class ListMetricsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("All")
    private String all;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricGroupId")
    private String metricGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricId")
    private String metricId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricName")
    private String metricName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    private ListMetricsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.all = builder.all;
        this.metricGroupId = builder.metricGroupId;
        this.metricId = builder.metricId;
        this.metricName = builder.metricName;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.sortBy = builder.sortBy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMetricsRequest create() {
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
     * @return all
     */
    public String getAll() {
        return this.all;
    }

    /**
     * @return metricGroupId
     */
    public String getMetricGroupId() {
        return this.metricGroupId;
    }

    /**
     * @return metricId
     */
    public String getMetricId() {
        return this.metricId;
    }

    /**
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    public static final class Builder extends Request.Builder<ListMetricsRequest, Builder> {
        private String regionId; 
        private String all; 
        private String metricGroupId; 
        private String metricId; 
        private String metricName; 
        private String order; 
        private String pageNumber; 
        private String pageSize; 
        private String sortBy; 

        private Builder() {
            super();
        } 

        private Builder(ListMetricsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.all = request.all;
            this.metricGroupId = request.metricGroupId;
            this.metricId = request.metricId;
            this.metricName = request.metricName;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.sortBy = request.sortBy;
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
         * All.
         */
        public Builder all(String all) {
            this.putQueryParameter("All", all);
            this.all = all;
            return this;
        }

        /**
         * MetricGroupId.
         */
        public Builder metricGroupId(String metricGroupId) {
            this.putQueryParameter("MetricGroupId", metricGroupId);
            this.metricGroupId = metricGroupId;
            return this;
        }

        /**
         * MetricId.
         */
        public Builder metricId(String metricId) {
            this.putQueryParameter("MetricId", metricId);
            this.metricId = metricId;
            return this;
        }

        /**
         * MetricName.
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
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
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        @Override
        public ListMetricsRequest build() {
            return new ListMetricsRequest(this);
        } 

    } 

}
