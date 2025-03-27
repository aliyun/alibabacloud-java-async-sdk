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
 * {@link DescribeSecurityEventTopNMetricRequest} extends {@link RequestModel}
 *
 * <p>DescribeSecurityEventTopNMetricRequest</p>
 */
public class DescribeSecurityEventTopNMetricRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    @com.aliyun.core.annotation.Validation(required = true)
    private Filter filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long limit;

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

    private DescribeSecurityEventTopNMetricRequest(Builder builder) {
        super(builder);
        this.filter = builder.filter;
        this.instanceId = builder.instanceId;
        this.limit = builder.limit;
        this.metric = builder.metric;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityEventTopNMetricRequest create() {
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
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
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

    public static final class Builder extends Request.Builder<DescribeSecurityEventTopNMetricRequest, Builder> {
        private Filter filter; 
        private String instanceId; 
        private Long limit; 
        private String metric; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSecurityEventTopNMetricRequest request) {
            super(request);
            this.filter = request.filter;
            this.instanceId = request.instanceId;
            this.limit = request.limit;
            this.metric = request.metric;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
        } 

        /**
         * <p>The filter parameters for the query. Multiple parameters are evaluated by using a logical AND.</p>
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
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/140857.html">DescribeInstanceInfo</a> operation to query the ID of the WAF instance.</p>
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
         * <p>The number of data entries that can be returned. Data entries are sorted in descending order before they are returned. Maximum value: 10.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder limit(Long limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The metric whose top N data entries you want to return. The following metrics are supported:</p>
         * <blockquote>
         * <p> For more information about attack requests, see the &quot;Usage notes&quot; section of this topic.</p>
         * </blockquote>
         * <ul>
         * <li>real_client_ip: The system aggregates the source IP addresses of attack requests to collect statistics, sorts the statistical results in descending order, and returns top N data entries.</li>
         * <li>http_user_agent: The system aggregates the User-Agent header field of attack requests to collect statistics, sorts the statistical results in descending order, and returns top N data entries.</li>
         * <li>matched_host: The system aggregates the protected objects that are matched by attack requests to collect statistics, sorts the statistical results in descending order, and returns top N data entries.</li>
         * <li>remote_region_id: The system aggregates the countries to which the source IP addresses of attack requests belong to collect statistics, sorts the statistical results in descending order, and returns top N data entries.</li>
         * <li>request_path: The system aggregates the URLs of attack requests to collect statistics, sorts the statistical results in descending order, and returns top N data entries. The URLs exclude query strings.</li>
         * <li>block_defense_scene: The system aggregates the protection modules that block attack requests to collect statistics, sorts the statistical results in descending order, and returns top N data entries. The requests match protection rules whose actions are not set to Monitor.</li>
         * <li>defense_scene: The system aggregates the protection modules that are matched by attack requests to collect statistics, sorts the statistical results in descending order, and returns top N data entries.</li>
         * <li>defense_scene_rule_id: The system returns the IDs of top N protection rules that are matched by attack requests and also the related protection modules. Only protection rules whose actions are not set to Monitor are counted. The system returns the value in the following format:<br><code>{ &quot;Attribute&quot;: &quot;waf_base&quot;, &quot;Value&quot;: 140, &quot;Name&quot;: &quot;111034&quot; }</code></li>
         * <li>defense_scene_with_rule_id: The system returns the IDs of top N protection rules that are matched by attack requests and also the related protection modules. The IDs and protection modules are connected by using hyphens (-). Protection rules whose actions are set to Monitor and Block are counted. The system returns the value in the following format:<br><code>{ &quot;Attribute&quot;: &quot;&quot;, &quot;Value&quot;: 1, &quot;Name&quot;: &quot;120075-waf_base&quot; }</code></li>
         * <li>defense_scene_top_rule_id: The system returns top N matched protection rules of a specific protection module. You can specify Conditions in Filter to configure filter conditions. For example, you can use the following condition to query top N matched protection rules of the custom rule module:<br><code>{ &quot;Key&quot;: &quot;defense_scene_map&quot;, &quot;OpValue&quot;: &quot;contain&quot;, &quot;Values&quot;: &quot;custom_acl&quot; }</code></li>
         * <li>defense_scene_rule_type: The system returns top N matched protection rules of the core web protection module. This metric is supported only by the core web protection module because only this module supports subtypes of protection rules. You must specify Conditions in Filter to configure filter conditions. Example:<br><code>{ &quot;Key&quot;: &quot;defense_scene&quot;, &quot;OpValue&quot;: &quot;eq&quot;, &quot;Values&quot;: &quot;waf_base&quot; }</code></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>real_client_ip</p>
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
        public DescribeSecurityEventTopNMetricRequest build() {
            return new DescribeSecurityEventTopNMetricRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSecurityEventTopNMetricRequest} extends {@link TeaModel}
     *
     * <p>DescribeSecurityEventTopNMetricRequest</p>
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
             * <p>The field name. This operation supports all fields.</p>
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
             * <p>The field content.</p>
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
     * {@link DescribeSecurityEventTopNMetricRequest} extends {@link TeaModel}
     *
     * <p>DescribeSecurityEventTopNMetricRequest</p>
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
             * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
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
             * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
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
     * {@link DescribeSecurityEventTopNMetricRequest} extends {@link TeaModel}
     *
     * <p>DescribeSecurityEventTopNMetricRequest</p>
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
             * <p>The filter conditions. Multiple conditions are evaluated by using a logical AND.</p>
             */
            public Builder conditions(java.util.List<Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * <p>The time range for the query.</p>
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
