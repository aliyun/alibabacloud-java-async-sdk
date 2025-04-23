// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link GetCloudMetricLogsRequest} extends {@link RequestModel}
 *
 * <p>GetCloudMetricLogsRequest</p>
 */
public class GetCloudMetricLogsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AggregationInterval")
    private Integer aggregationInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AggregationType")
    private String aggregationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private String filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricCategories")
    private String metricCategories;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricScope")
    private String metricScope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reverse")
    private Boolean reverse;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("To")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(GetCloudMetricLogsRequest request) {
            super(request);
            this.aggregationInterval = request.aggregationInterval;
            this.aggregationType = request.aggregationType;
            this.clusterId = request.clusterId;
            this.filter = request.filter;
            this.from = request.from;
            this.metricCategories = request.metricCategories;
            this.metricScope = request.metricScope;
            this.reverse = request.reverse;
            this.to = request.to;
        } 

        /**
         * <p>The data aggregation interval. Unit: seconds.</p>
         * <p>Valid values: 1, 10, 60, 600, and 3600.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder aggregationInterval(Integer aggregationInterval) {
            this.putQueryParameter("AggregationInterval", aggregationInterval);
            this.aggregationInterval = aggregationInterval;
            return this;
        }

        /**
         * <p>The data aggregation type. Valid values:</p>
         * <ul>
         * <li>sum: the sum of the data</li>
         * <li>avg: the average value</li>
         * <li>max: the maximum value</li>
         * <li>min: the minimum value</li>
         * </ul>
         * <p>Aggregation is disabled by default.</p>
         * 
         * <strong>example:</strong>
         * <p>avg</p>
         */
        public Builder aggregationType(String aggregationType) {
            this.putQueryParameter("AggregationType", aggregationType);
            this.aggregationType = aggregationType;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-jeJki6****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The filter conditions. A JSON-formatted string that contains several key-value pairs. Valid values of the key:</p>
         * <ul>
         * <li>InstanceId: the ID of the node</li>
         * <li>Hostname: the hostname of the node</li>
         * <li>NetworkInterface: the name of the network interface</li>
         * <li>DiskDevice: the name of the disk</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Hostname&quot;:&quot;compute000&quot;}</p>
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The time is a timestamp. This value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1583907780</p>
         */
        public Builder from(Integer from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>The category of the output performance metrics. Separate multiple metrics with commas (,). Valid values:</p>
         * <ul>
         * <li>cpu</li>
         * <li>memory</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cpu</p>
         */
        public Builder metricCategories(String metricCategories) {
            this.putQueryParameter("MetricCategories", metricCategories);
            this.metricCategories = metricCategories;
            return this;
        }

        /**
         * <p>The dimensions of the performance metric. Valid values:</p>
         * <ul>
         * <li>machine</li>
         * <li>process</li>
         * <li>network</li>
         * <li>disk</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>network</p>
         */
        public Builder metricScope(String metricScope) {
            this.putQueryParameter("MetricScope", metricScope);
            this.metricScope = metricScope;
            return this;
        }

        /**
         * <p>Specifies whether to return logs in reverse order of timestamps. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder reverse(Boolean reverse) {
            this.putQueryParameter("Reverse", reverse);
            this.reverse = reverse;
            return this;
        }

        /**
         * <p>The end of the time range to query. The time is a timestamp. This value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1583907790</p>
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
