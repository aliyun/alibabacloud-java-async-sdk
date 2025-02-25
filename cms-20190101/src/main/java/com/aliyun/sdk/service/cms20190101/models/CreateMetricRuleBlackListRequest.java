// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateMetricRuleBlackListRequest} extends {@link RequestModel}
 *
 * <p>CreateMetricRuleBlackListRequest</p>
 */
public class CreateMetricRuleBlackListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    @com.aliyun.core.annotation.Validation(required = true)
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveTime")
    private String effectiveTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableEndTime")
    private String enableEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableStartTime")
    private String enableStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Instances")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > instances;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Metrics")
    private java.util.List < Metrics> metrics;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScopeType")
    private String scopeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScopeValue")
    private String scopeValue;

    private CreateMetricRuleBlackListRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.effectiveTime = builder.effectiveTime;
        this.enableEndTime = builder.enableEndTime;
        this.enableStartTime = builder.enableStartTime;
        this.instances = builder.instances;
        this.metrics = builder.metrics;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.scopeType = builder.scopeType;
        this.scopeValue = builder.scopeValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMetricRuleBlackListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    /**
     * @return enableEndTime
     */
    public String getEnableEndTime() {
        return this.enableEndTime;
    }

    /**
     * @return enableStartTime
     */
    public String getEnableStartTime() {
        return this.enableStartTime;
    }

    /**
     * @return instances
     */
    public java.util.List < String > getInstances() {
        return this.instances;
    }

    /**
     * @return metrics
     */
    public java.util.List < Metrics> getMetrics() {
        return this.metrics;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return scopeType
     */
    public String getScopeType() {
        return this.scopeType;
    }

    /**
     * @return scopeValue
     */
    public String getScopeValue() {
        return this.scopeValue;
    }

    public static final class Builder extends Request.Builder<CreateMetricRuleBlackListRequest, Builder> {
        private String category; 
        private String effectiveTime; 
        private String enableEndTime; 
        private String enableStartTime; 
        private java.util.List < String > instances; 
        private java.util.List < Metrics> metrics; 
        private String name; 
        private String namespace; 
        private String scopeType; 
        private String scopeValue; 

        private Builder() {
            super();
        } 

        private Builder(CreateMetricRuleBlackListRequest request) {
            super(request);
            this.category = request.category;
            this.effectiveTime = request.effectiveTime;
            this.enableEndTime = request.enableEndTime;
            this.enableStartTime = request.enableStartTime;
            this.instances = request.instances;
            this.metrics = request.metrics;
            this.name = request.name;
            this.namespace = request.namespace;
            this.scopeType = request.scopeType;
            this.scopeValue = request.scopeValue;
        } 

        /**
         * <p>The category of the cloud service. For example, ApsaraDB for Redis includes the following categories: ApsaraDB for Redis (standard architecture), ApsaraDB for Redis (cluster architecture), and ApsaraDB for Redis (read/write splitting architecture). In this case, the valid values of this parameter for ApsaraDB for Redis include <code>kvstore_standard</code>, <code>kvstore_sharding</code>, and <code>kvstore_splitrw</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>The time range within which the blacklist policy is effective.</p>
         * <ul>
         * <li><p>If you do not configure this parameter, the blacklist policy is permanently effective.</p>
         * </li>
         * <li><p>If you configure this parameter, the blacklist policy is effective only within the specified time range. Examples:</p>
         * <ul>
         * <li><code>03:00-04:59</code>: The blacklist policy is effective from 03:00 to 05:00 local time. 05:00 local time is excluded.</li>
         * <li><code>03:00-04:59 UTC+0700</code>: The blacklist policy is effective from 03:00 to 05:00 (UTC+7). 05:00 (UTC+7) is excluded.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>03:00-04:59</p>
         */
        public Builder effectiveTime(String effectiveTime) {
            this.putQueryParameter("EffectiveTime", effectiveTime);
            this.effectiveTime = effectiveTime;
            return this;
        }

        /**
         * <p>The timestamp when the blacklist policy expires.</p>
         * <p>Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1640608200000</p>
         */
        public Builder enableEndTime(String enableEndTime) {
            this.putQueryParameter("EnableEndTime", enableEndTime);
            this.enableEndTime = enableEndTime;
            return this;
        }

        /**
         * <p>The timestamp when the blacklist policy starts to take effect.</p>
         * <p>Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1640237400000</p>
         */
        public Builder enableStartTime(String enableStartTime) {
            this.putQueryParameter("EnableStartTime", enableStartTime);
            this.enableStartTime = enableStartTime;
            return this;
        }

        /**
         * <p>The IDs of the instances that belong to the specified cloud service.</p>
         * <p>This parameter is required.</p>
         */
        public Builder instances(java.util.List < String > instances) {
            this.putQueryParameter("Instances", instances);
            this.instances = instances;
            return this;
        }

        /**
         * <p>The metrics of the instance.</p>
         * <ul>
         * <li>If you do not configure this parameter, the blacklist policy applies to all metrics of the specified cloud service.</li>
         * <li>If you configure this parameter, the blacklist policy applies only to the current metric.</li>
         * </ul>
         */
        public Builder metrics(java.util.List < Metrics> metrics) {
            this.putQueryParameter("Metrics", metrics);
            this.metrics = metrics;
            return this;
        }

        /**
         * <p>The name of the blacklist policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Blacklist-01</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The namespace of the cloud service.</p>
         * <p>For more information about the namespaces of different cloud services, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs_ecs_dashboard</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The effective scope of the blacklist policy. Valid values:</p>
         * <ul>
         * <li>USER (default): The blacklist policy takes effect only for the current Alibaba Cloud account.</li>
         * <li>GROUP: The blacklist policy takes effect only for the specified application group. For information about how to query the IDs of application groups, see <a href="https://help.aliyun.com/document_detail/115032.html">DescribeMonitorGroups</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        public Builder scopeType(String scopeType) {
            this.putQueryParameter("ScopeType", scopeType);
            this.scopeType = scopeType;
            return this;
        }

        /**
         * <p>The ID of the application group. The value of this parameter is a JSON array.</p>
         * <blockquote>
         * <p>This parameter must be specified when <code>ScopeType</code> is set to <code>GROUP</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[&quot;67****&quot;,&quot;78****&quot;]</p>
         */
        public Builder scopeValue(String scopeValue) {
            this.putQueryParameter("ScopeValue", scopeValue);
            this.scopeValue = scopeValue;
            return this;
        }

        @Override
        public CreateMetricRuleBlackListRequest build() {
            return new CreateMetricRuleBlackListRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateMetricRuleBlackListRequest} extends {@link TeaModel}
     *
     * <p>CreateMetricRuleBlackListRequest</p>
     */
    public static class Metrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MetricName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Resource")
        private String resource;

        private Metrics(Builder builder) {
            this.metricName = builder.metricName;
            this.resource = builder.resource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metrics create() {
            return builder().build();
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        public static final class Builder {
            private String metricName; 
            private String resource; 

            /**
             * <p>The metric name.</p>
             * <p>Valid values of N: 1 to 10.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>disk_utilization</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The extended dimension of the instance. For example, <code>{&quot;device&quot;:&quot;C:&quot;}</code> specifies that the blacklist policy is applied to all C disks of the specified Elastic Compute Service (ECS) instance.</p>
             * <p>Valid values of N: 1 to 10.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;device&quot;:&quot;C:&quot;}</p>
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            public Metrics build() {
                return new Metrics(this);
            } 

        } 

    }
}
