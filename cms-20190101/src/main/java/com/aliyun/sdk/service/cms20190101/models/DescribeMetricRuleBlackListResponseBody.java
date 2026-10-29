// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
 * {@link DescribeMetricRuleBlackListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMetricRuleBlackListResponseBody</p>
 */
public class DescribeMetricRuleBlackListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DescribeMetricRuleBlackList")
    private java.util.List<DescribeMetricRuleBlackList> describeMetricRuleBlackList;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<DescribeMetricRuleBlackList> getDescribeMetricRuleBlackList() {
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
        private java.util.List<DescribeMetricRuleBlackList> describeMetricRuleBlackList; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(DescribeMetricRuleBlackListResponseBody model) {
            this.code = model.code;
            this.describeMetricRuleBlackList = model.describeMetricRuleBlackList;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * <p>The status code.</p>
         * <blockquote>
         * <p>The value 200 indicates success.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The list of alert blacklist policies.</p>
         */
        public Builder describeMetricRuleBlackList(java.util.List<DescribeMetricRuleBlackList> describeMetricRuleBlackList) {
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D63E76CB-29AA-5B9F-88CE-400A6F28D428</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful. Valid values:</p>
         * <ul>
         * <li><p>true: Successful.</p>
         * </li>
         * <li><p>false: Failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of alert blacklist policies.</p>
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

            private Builder() {
            } 

            private Builder(Metrics model) {
                this.metricName = model.metricName;
                this.resource = model.resource;
            } 

            /**
             * <p>The name of the monitoring metrics.</p>
             * 
             * <strong>example:</strong>
             * <p>disk_utilization</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The extension dimension information of the instance. For example, <code>{&quot;device&quot;:&quot;C:&quot;}</code> indicates that the blacklist policy is applied to all C drives of the ECS instance under the Alibaba Cloud service.</p>
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
        private java.util.List<String> instances;

        @com.aliyun.core.annotation.NameInMap("IsEnable")
        private Boolean isEnable;

        @com.aliyun.core.annotation.NameInMap("Metrics")
        private java.util.List<Metrics> metrics;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("ScopeType")
        private String scopeType;

        @com.aliyun.core.annotation.NameInMap("ScopeValue")
        private java.util.List<String> scopeValue;

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
        public java.util.List<String> getInstances() {
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
        public java.util.List<Metrics> getMetrics() {
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
        public java.util.List<String> getScopeValue() {
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
            private java.util.List<String> instances; 
            private Boolean isEnable; 
            private java.util.List<Metrics> metrics; 
            private String name; 
            private String namespace; 
            private String scopeType; 
            private java.util.List<String> scopeValue; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(DescribeMetricRuleBlackList model) {
                this.category = model.category;
                this.createTime = model.createTime;
                this.effectiveTime = model.effectiveTime;
                this.enableEndTime = model.enableEndTime;
                this.enableStartTime = model.enableStartTime;
                this.id = model.id;
                this.instances = model.instances;
                this.isEnable = model.isEnable;
                this.metrics = model.metrics;
                this.name = model.name;
                this.namespace = model.namespace;
                this.scopeType = model.scopeType;
                this.scopeValue = model.scopeValue;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The category of the Alibaba Cloud service. For example, ApsaraDB for Redis has <code>kvstore_standard</code> (Standard Edition), <code>kvstore_sharding</code> (Cluster Edition), and <code>kvstore_splitrw</code> (read/write splitting Edition).</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The timestamp when the alert blacklist policy was created.</p>
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
             * <p>The effective period of the alert blacklist policy.</p>
             * <p>The value is in the HH:mm-HH:mm format (24-hour clock). The default time zone is UTC+8. For example, &quot;00:00-23:59&quot; indicates that the policy takes effect all day.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00-23:59</p>
             */
            public Builder effectiveTime(String effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * <p>The start timestamp of the alert blacklist policy.</p>
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
             * <p>The end timestamp of the alert blacklist policy.</p>
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
             * <p>The ID of the alert blacklist policy.</p>
             * 
             * <strong>example:</strong>
             * <p>93514c96-ceb8-47d8-8ee3-93b6d98b****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The instances of the specified Alibaba Cloud service in the alert blacklist policy.</p>
             */
            public Builder instances(java.util.List<String> instances) {
                this.instances = instances;
                return this;
            }

            /**
             * <p>The status of the alert blacklist policy. Valid values:</p>
             * <ul>
             * <li><p>true: Enabled.</p>
             * </li>
             * <li><p>false: Disabled.</p>
             * </li>
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
             * <p>The monitoring metrics of the instances.</p>
             */
            public Builder metrics(java.util.List<Metrics> metrics) {
                this.metrics = metrics;
                return this;
            }

            /**
             * <p>The name of the alert blacklist policy.</p>
             * 
             * <strong>example:</strong>
             * <p>Blacklist-01</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace of the Alibaba Cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>acs_ecs_dashboard</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The effective scope of the alert blacklist policy. Valid values:</p>
             * <ul>
             * <li><p>USER: The alert blacklist policy takes effect only within the current Alibaba Cloud account.</p>
             * </li>
             * <li><p>GROUP: The alert blacklist policy takes effect in the specified application groups.</p>
             * </li>
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
            public Builder scopeValue(java.util.List<String> scopeValue) {
                this.scopeValue = scopeValue;
                return this;
            }

            /**
             * <p>The timestamp when the alert blacklist policy was last modified.</p>
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
