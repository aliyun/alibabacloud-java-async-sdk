// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCloudMetricLogsRequest} extends {@link RequestModel}
 *
 * <p>GetCloudMetricLogsRequest</p>
 */
public class GetCloudMetricLogsRequest extends Request {
    @Query
    @NameInMap("AggregationInterval")
    private Integer aggregationInterval;

    @Query
    @NameInMap("AggregationType")
    private String aggregationType;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Filter")
    private String filter;

    @Query
    @NameInMap("From")
    @Validation(required = true)
    private Integer from;

    @Query
    @NameInMap("MetricCategories")
    private String metricCategories;

    @Query
    @NameInMap("MetricScope")
    private String metricScope;

    @Query
    @NameInMap("Reverse")
    private Boolean reverse;

    @Query
    @NameInMap("To")
    @Validation(required = true)
    private Integer to;

    private GetCloudMetricLogsRequest(Builder builder) {
        super(builder);
        this.aggregationInterval = builder.aggregationInterval;
        this.aggregationType = builder.aggregationType;
        this.clusterId = builder.clusterId;
        this.filter = builder.filter;
        this.from = builder.from;
        this.metricCategories = builder.metricCategories;
        this.metricScope = builder.metricScope;
        this.reverse = builder.reverse;
        this.to = builder.to;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCloudMetricLogsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregationInterval
     */
    public Integer getAggregationInterval() {
        return this.aggregationInterval;
    }

    /**
     * @return aggregationType
     */
    public String getAggregationType() {
        return this.aggregationType;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return filter
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * @return from
     */
    public Integer getFrom() {
        return this.from;
    }

    /**
     * @return metricCategories
     */
    public String getMetricCategories() {
        return this.metricCategories;
    }

    /**
     * @return metricScope
     */
    public String getMetricScope() {
        return this.metricScope;
    }

    /**
     * @return reverse
     */
    public Boolean getReverse() {
        return this.reverse;
    }

    /**
     * @return to
     */
    public Integer getTo() {
        return this.to;
    }

    public static final class Builder extends Request.Builder<GetCloudMetricLogsRequest, Builder> {
        private Integer aggregationInterval; 
        private String aggregationType; 
        private String clusterId; 
        private String filter; 
        private Integer from; 
        private String metricCategories; 
        private String metricScope; 
        private Boolean reverse; 
        private Integer to; 

        private Builder() {
            super();
        } 

        private Builder(GetCloudMetricLogsRequest response) {
            super(response);
            this.aggregationInterval = response.aggregationInterval;
            this.aggregationType = response.aggregationType;
            this.clusterId = response.clusterId;
            this.filter = response.filter;
            this.from = response.from;
            this.metricCategories = response.metricCategories;
            this.metricScope = response.metricScope;
            this.reverse = response.reverse;
            this.to = response.to;
        } 

        /**
         * AggregationInterval.
         */
        public Builder aggregationInterval(Integer aggregationInterval) {
            this.putQueryParameter("AggregationInterval", aggregationInterval);
            this.aggregationInterval = aggregationInterval;
            return this;
        }

        /**
         * AggregationType.
         */
        public Builder aggregationType(String aggregationType) {
            this.putQueryParameter("AggregationType", aggregationType);
            this.aggregationType = aggregationType;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Filter.
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * From.
         */
        public Builder from(Integer from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * MetricCategories.
         */
        public Builder metricCategories(String metricCategories) {
            this.putQueryParameter("MetricCategories", metricCategories);
            this.metricCategories = metricCategories;
            return this;
        }

        /**
         * MetricScope.
         */
        public Builder metricScope(String metricScope) {
            this.putQueryParameter("MetricScope", metricScope);
            this.metricScope = metricScope;
            return this;
        }

        /**
         * Reverse.
         */
        public Builder reverse(Boolean reverse) {
            this.putQueryParameter("Reverse", reverse);
            this.reverse = reverse;
            return this;
        }

        /**
         * To.
         */
        public Builder to(Integer to) {
            this.putQueryParameter("To", to);
            this.to = to;
            return this;
        }

        @Override
        public GetCloudMetricLogsRequest build() {
            return new GetCloudMetricLogsRequest(this);
        } 

    } 

}
