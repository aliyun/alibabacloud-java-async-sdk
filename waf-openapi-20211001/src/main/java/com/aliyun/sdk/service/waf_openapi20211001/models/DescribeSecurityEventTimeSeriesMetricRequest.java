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
 * {@link DescribeSecurityEventTimeSeriesMetricRequest} extends {@link RequestModel}
 *
 * <p>DescribeSecurityEventTimeSeriesMetricRequest</p>
 */
public class DescribeSecurityEventTimeSeriesMetricRequest extends Request {
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

    private DescribeSecurityEventTimeSeriesMetricRequest(Builder builder) {
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

    public static DescribeSecurityEventTimeSeriesMetricRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeSecurityEventTimeSeriesMetricRequest, Builder> {
        private Filter filter; 
        private String instanceId; 
        private String metric; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSecurityEventTimeSeriesMetricRequest request) {
            super(request);
            this.filter = request.filter;
            this.instanceId = request.instanceId;
            this.metric = request.metric;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
        } 

        /**
         * <p>The filter conditions for the query. Multiple filter conditions have a logical AND relationship.</p>
         * <p>This parameter is required.</p>
         */
        public Builder filter(Filter filter) {
            String filterShrink = shrink(filter, "Filter", "json");
            this.putQueryParameter("Filter", filterShrink);
            this.filter = filter;
            return this;
        }

        /**
         * <p>The ID of the Web Application Firewall (WAF) instance.</p>
         * <blockquote>
         * <p>Call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of the WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf-cn-tl32ast****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Specifies the content of the returned data. Different metrics correspond to different data content. This operation supports the following metrics:</p>
         * <ul>
         * <li><p>mitigated_requests: Returns the time series statistics of blocked requests.</p>
         * </li>
         * <li><p>monitored_requests: Returns the time series statistics of requests that hit only observation-type rules.</p>
         * </li>
         * <li><p>mitigated_requests_group_by_defense_scene: Returns data grouped by module. It records a time series graph of the hit count for each module. A single request may hit multiple modules. Therefore, the hit count returned by this metric may not be consistent with the number of requests.</p>
         * </li>
         * <li><p>mitigated_requests_group_by_block_defense_scene: Returns data grouped by module. It records a time series graph of the number of blocked requests for each module. A single request is blocked by only one module. Therefore, the count returned by this metric is consistent with the number of requests.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mitigated_requests</p>
         */
        public Builder metric(String metric) {
            this.putQueryParameter("Metric", metric);
            this.metric = metric;
            return this;
        }

        /**
         * <p>The region where the WAF instance resides. Valid values:</p>
         * <ul>
         * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
         * </li>
         * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud resource group.</p>
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
        public DescribeSecurityEventTimeSeriesMetricRequest build() {
            return new DescribeSecurityEventTimeSeriesMetricRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSecurityEventTimeSeriesMetricRequest} extends {@link TeaModel}
     *
     * <p>DescribeSecurityEventTimeSeriesMetricRequest</p>
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
             * <p>The name of the field to filter. This operation supports all fields.</p>
             * 
             * <strong>example:</strong>
             * <p>matched_host</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The operator.</p>
             * 
             * <strong>example:</strong>
             * <p>eq</p>
             */
            public Builder opValue(String opValue) {
                this.opValue = opValue;
                return this;
            }

            /**
             * <p>The filter value.</p>
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
     * {@link DescribeSecurityEventTimeSeriesMetricRequest} extends {@link TeaModel}
     *
     * <p>DescribeSecurityEventTimeSeriesMetricRequest</p>
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
             * <p>The end time of the query. This is a UNIX timestamp. Unit: seconds.</p>
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
             * <p>You can query data from the last 30 days. The start time of the query. This is a UNIX timestamp. Unit: seconds.</p>
             * <blockquote>
             * <h2>The start time must be within the last 30 days.</h2>
             * </blockquote>
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
     * {@link DescribeSecurityEventTimeSeriesMetricRequest} extends {@link TeaModel}
     *
     * <p>DescribeSecurityEventTimeSeriesMetricRequest</p>
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
             * <p>A list of filter conditions. Each node describes one filter condition.</p>
             */
            public Builder conditions(java.util.List<Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * <p>The time range to query.</p>
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
