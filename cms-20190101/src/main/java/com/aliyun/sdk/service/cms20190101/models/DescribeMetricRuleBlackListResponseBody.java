// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMetricRuleBlackListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMetricRuleBlackListResponseBody</p>
 */
public class DescribeMetricRuleBlackListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DescribeMetricRuleBlackList")
    private java.util.List < DescribeMetricRuleBlackList> describeMetricRuleBlackList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private DescribeMetricRuleBlackListResponseBody(Builder builder) {
        this.code = builder.code;
        this.describeMetricRuleBlackList = builder.describeMetricRuleBlackList;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetricRuleBlackListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return describeMetricRuleBlackList
     */
    public java.util.List < DescribeMetricRuleBlackList> getDescribeMetricRuleBlackList() {
        return this.describeMetricRuleBlackList;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < DescribeMetricRuleBlackList> describeMetricRuleBlackList; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        /**
         * <p>The categories of the Alibaba Cloud service. For example, ApsaraDB for Redis includes the following categories: ApsaraDB for Redis (standard architecture), ApsaraDB for Redis (cluster architecture), and ApsaraDB for Redis (read/write splitting architecture). In this case, the valid values of this parameter for ApsaraDB for Redis include <code>kvstore_standard</code>, <code>kvstore_sharding</code>, and <code>kvstore_splitrw</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The queried blacklist policies.</p>
         */
        public Builder describeMetricRuleBlackList(java.util.List < DescribeMetricRuleBlackList> describeMetricRuleBlackList) {
            this.describeMetricRuleBlackList = describeMetricRuleBlackList;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The Request is not authorization.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The namespace of the cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>D63E76CB-29AA-5B9F-88CE-400A6F28D428</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The namespace of the cloud service.</p>
         * <p>For more information about the namespaces of different cloud services, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The timestamp when the blacklist policy was created.</p>
         * <p>Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeMetricRuleBlackListResponseBody build() {
            return new DescribeMetricRuleBlackListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMetricRuleBlackListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricRuleBlackListResponseBody</p>
     */
    public static class Metrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MetricName")
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
             * 
             * <strong>example:</strong>
             * <p>[{&quot;device&quot;:&quot;C:&quot;}]</p>
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
    /**
     * 
     * {@link DescribeMetricRuleBlackListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetricRuleBlackListResponseBody</p>
     */
    public static class DescribeMetricRuleBlackList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EffectiveTime")
        private String effectiveTime;

        @com.aliyun.core.annotation.NameInMap("EnableEndTime")
        private Long enableEndTime;

        @com.aliyun.core.annotation.NameInMap("EnableStartTime")
        private Long enableStartTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Instances")
        private java.util.List < String > instances;

        @com.aliyun.core.annotation.NameInMap("IsEnable")
        private Boolean isEnable;

        @com.aliyun.core.annotation.NameInMap("Metrics")
        private java.util.List < Metrics> metrics;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("ScopeType")
        private String scopeType;

        @com.aliyun.core.annotation.NameInMap("ScopeValue")
        private java.util.List < String > scopeValue;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private DescribeMetricRuleBlackList(Builder builder) {
            this.category = builder.category;
            this.createTime = builder.createTime;
            this.effectiveTime = builder.effectiveTime;
            this.enableEndTime = builder.enableEndTime;
            this.enableStartTime = builder.enableStartTime;
            this.id = builder.id;
            this.instances = builder.instances;
            this.isEnable = builder.isEnable;
            this.metrics = builder.metrics;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.scopeType = builder.scopeType;
            this.scopeValue = builder.scopeValue;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DescribeMetricRuleBlackList create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
        public Long getEnableEndTime() {
            return this.enableEndTime;
        }

        /**
         * @return enableStartTime
         */
        public Long getEnableStartTime() {
            return this.enableStartTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return instances
         */
        public java.util.List < String > getInstances() {
            return this.instances;
        }

        /**
         * @return isEnable
         */
        public Boolean getIsEnable() {
            return this.isEnable;
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
        public java.util.List < String > getScopeValue() {
            return this.scopeValue;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String category; 
            private String createTime; 
            private String effectiveTime; 
            private Long enableEndTime; 
            private Long enableStartTime; 
            private String id; 
            private java.util.List < String > instances; 
            private Boolean isEnable; 
            private java.util.List < Metrics> metrics; 
            private String name; 
            private String namespace; 
            private String scopeType; 
            private java.util.List < String > scopeValue; 
            private String updateTime; 

            /**
             * <p>The category of the cloud service. For example, ApsaraDB for Redis includes the following categories: ApsaraDB for Redis (standard architecture), ApsaraDB for Redis (cluster architecture), and ApsaraDB for Redis (read/write splitting architecture). In this case, the valid values of this parameter for ApsaraDB for Redis include <code>kvstore_standard</code>, <code>kvstore_sharding</code>, and <code>kvstore_splitrw</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The timestamp when the blacklist policy was created.</p>
             * <p>Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1665714561000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time range within which the blacklist policy is effective.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00-23:59</p>
             */
            public Builder effectiveTime(String effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * <p>The timestamp when the blacklist policy started to take effect.</p>
             * <p>Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1640608200000</p>
             */
            public Builder enableEndTime(Long enableEndTime) {
                this.enableEndTime = enableEndTime;
                return this;
            }

            /**
             * <p>The timestamp when the blacklist policy expired.</p>
             * <p>Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1640237400000</p>
             */
            public Builder enableStartTime(Long enableStartTime) {
                this.enableStartTime = enableStartTime;
                return this;
            }

            /**
             * <p>The ID of the blacklist policy.</p>
             * 
             * <strong>example:</strong>
             * <p>93514c96-ceb8-47d8-8ee3-93b6d98b****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The IDs of the instances that belong to the specified cloud service.</p>
             */
            public Builder instances(java.util.List < String > instances) {
                this.instances = instances;
                return this;
            }

            /**
             * <p>The status of the blacklist policy. Valid values:</p>
             * <ul>
             * <li>true: The blacklist policy is enabled.</li>
             * <li>false: The blacklist policy is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isEnable(Boolean isEnable) {
                this.isEnable = isEnable;
                return this;
            }

            /**
             * <p>The metrics of the instance.</p>
             */
            public Builder metrics(java.util.List < Metrics> metrics) {
                this.metrics = metrics;
                return this;
            }

            /**
             * <p>The name of the blacklist policy.</p>
             * 
             * <strong>example:</strong>
             * <p>Blacklist-01</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace of the cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>acs_ecs_dashboard</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The effective scope of the blacklist policy. Valid values:</p>
             * <ul>
             * <li>USER: The blacklist policy takes effect only within the current Alibaba Cloud account.</li>
             * <li>GROUP: The blacklist policy takes effect only within the specified application group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>USER</p>
             */
            public Builder scopeType(String scopeType) {
                this.scopeType = scopeType;
                return this;
            }

            /**
             * <p>The IDs of the application groups.</p>
             */
            public Builder scopeValue(java.util.List < String > scopeValue) {
                this.scopeValue = scopeValue;
                return this;
            }

            /**
             * <p>The timestamp when the blacklist policy was modified.</p>
             * <p>Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1665718373000</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public DescribeMetricRuleBlackList build() {
                return new DescribeMetricRuleBlackList(this);
            } 

        } 

    }
}
