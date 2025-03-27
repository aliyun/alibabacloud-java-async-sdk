// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeNetworkFlowTimeSeriesMetricRequest} extends {@link RequestModel}
 *
 * <p>DescribeNetworkFlowTimeSeriesMetricRequest</p>
 */
public class DescribeNetworkFlowTimeSeriesMetricRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    @com.aliyun.core.annotation.Validation(required = true)
    private Filter filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Metric")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metric;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    private DescribeNetworkFlowTimeSeriesMetricRequest(Builder builder) {
        super(builder);
        this.filter = builder.filter;
        this.instanceId = builder.instanceId;
        this.metric = builder.metric;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkFlowTimeSeriesMetricRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filter
     */
    public Filter getFilter() {
        return this.filter;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return metric
     */
    public String getMetric() {
        return this.metric;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public static final class Builder extends Request.Builder<DescribeNetworkFlowTimeSeriesMetricRequest, Builder> {
        private Filter filter; 
        private String instanceId; 
        private String metric; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNetworkFlowTimeSeriesMetricRequest request) {
            super(request);
            this.filter = request.filter;
            this.instanceId = request.instanceId;
            this.metric = request.metric;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
        } 

        /**
         * <p>Specifies filtering conditions. Multiple filter parameters use AND logic.</p>
         * <p>This parameter is required.</p>
         */
        public Builder filter(Filter filter) {
            String filterShrink = shrink(filter, "Filter", "json");
            this.putQueryParameter("Filter", filterShrink);
            this.filter = filter;
            return this;
        }

        /**
         * <p>The Web Application Firewall (WAF) instance ID.</p>
         * <blockquote>
         * <p> Call the <a href="https://help.aliyun.com/document_detail/140857.html">DescribeInstanceInfo</a> operation to get the WAF instance ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_cdnsdf3****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Specifies the type of data returned by each metric. Valid values:</p>
         * <ul>
         * <li>qps: Queries per second (QPS) of requests processed by WAF.</li>
         * <li>total_requests: Total number of requests processed by WAF.</li>
         * <li>top5_status: The top 5 HTTP status codes returned by WAF, along with their counts.</li>
         * <li>top 5_upstream_status: The top 5 HTTP status codes returned by the origin server, along with their counts.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>total_requests</p>
         */
        public Builder metric(String metric) {
            this.putQueryParameter("Metric", metric);
            this.metric = metric;
            return this;
        }

        /**
         * <p>The region ID of the WAF instance. Valid values:</p>
         * <ul>
         * <li><strong>cn-hangzhou</strong>: The Chinese mainland.</li>
         * <li><strong>ap-southeast-1</strong>: Outside the Chinese mainland.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ap-southeast-1</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm***q</p>
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        @Override
        public DescribeNetworkFlowTimeSeriesMetricRequest build() {
            return new DescribeNetworkFlowTimeSeriesMetricRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNetworkFlowTimeSeriesMetricRequest} extends {@link TeaModel}
     *
     * <p>DescribeNetworkFlowTimeSeriesMetricRequest</p>
     */
    public static class Conditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("OpValue")
        private String opValue;

        @com.aliyun.core.annotation.NameInMap("Values")
        private Object values;

        private Conditions(Builder builder) {
            this.key = builder.key;
            this.opValue = builder.opValue;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conditions create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return opValue
         */
        public String getOpValue() {
            return this.opValue;
        }

        /**
         * @return values
         */
        public Object getValues() {
            return this.values;
        }

        public static final class Builder {
            private String key; 
            private String opValue; 
            private Object values; 

            private Builder() {
            } 

            private Builder(Conditions model) {
                this.key = model.key;
                this.opValue = model.opValue;
                this.values = model.values;
            } 

            /**
             * <p>The filter field. Valid values:</p>
             * <ul>
             * <li>matched_host: The protected object.</li>
             * <li>cluster: The protected cluster.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>matched_host</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The filter operator.</p>
             * 
             * <strong>example:</strong>
             * <p>eq</p>
             */
            public Builder opValue(String opValue) {
                this.opValue = opValue;
                return this;
            }

            /**
             * <p>Specifies the values to filter by.</p>
             * 
             * <strong>example:</strong>
             * <p>test.waf-top</p>
             */
            public Builder values(Object values) {
                this.values = values;
                return this;
            }

            public Conditions build() {
                return new Conditions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkFlowTimeSeriesMetricRequest} extends {@link TeaModel}
     *
     * <p>DescribeNetworkFlowTimeSeriesMetricRequest</p>
     */
    public static class DateRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndDate")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long endDate;

        @com.aliyun.core.annotation.NameInMap("StartDate")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long startDate;

        private DateRange(Builder builder) {
            this.endDate = builder.endDate;
            this.startDate = builder.startDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DateRange create() {
            return builder().build();
        }

        /**
         * @return endDate
         */
        public Long getEndDate() {
            return this.endDate;
        }

        /**
         * @return startDate
         */
        public Long getStartDate() {
            return this.startDate;
        }

        public static final class Builder {
            private Long endDate; 
            private Long startDate; 

            private Builder() {
            } 

            private Builder(DateRange model) {
                this.endDate = model.endDate;
                this.startDate = model.startDate;
            } 

            /**
             * <p>End time of the query range (UNIX timestamp, seconds).</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1713888600</p>
             */
            public Builder endDate(Long endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * <p>Start time of the query range (UNIX timestamp, seconds).</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1713888000</p>
             */
            public Builder startDate(Long startDate) {
                this.startDate = startDate;
                return this;
            }

            public DateRange build() {
                return new DateRange(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNetworkFlowTimeSeriesMetricRequest} extends {@link TeaModel}
     *
     * <p>DescribeNetworkFlowTimeSeriesMetricRequest</p>
     */
    public static class Filter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Conditions")
        private java.util.List<Conditions> conditions;

        @com.aliyun.core.annotation.NameInMap("DateRange")
        @com.aliyun.core.annotation.Validation(required = true)
        private DateRange dateRange;

        private Filter(Builder builder) {
            this.conditions = builder.conditions;
            this.dateRange = builder.dateRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
            return builder().build();
        }

        /**
         * @return conditions
         */
        public java.util.List<Conditions> getConditions() {
            return this.conditions;
        }

        /**
         * @return dateRange
         */
        public DateRange getDateRange() {
            return this.dateRange;
        }

        public static final class Builder {
            private java.util.List<Conditions> conditions; 
            private DateRange dateRange; 

            private Builder() {
            } 

            private Builder(Filter model) {
                this.conditions = model.conditions;
                this.dateRange = model.dateRange;
            } 

            /**
             * <p>An array of filter conditions. Multiple filter parameters use AND logic.</p>
             */
            public Builder conditions(java.util.List<Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * <p>Specifies the date range for the query.</p>
             * <p>This parameter is required.</p>
             */
            public Builder dateRange(DateRange dateRange) {
                this.dateRange = dateRange;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
}
