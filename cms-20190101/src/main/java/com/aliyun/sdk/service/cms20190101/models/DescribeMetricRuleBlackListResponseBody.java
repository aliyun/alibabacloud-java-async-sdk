// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMetricRuleBlackListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMetricRuleBlackListResponseBody</p>
 */
public class DescribeMetricRuleBlackListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DescribeMetricRuleBlackList")
    private java.util.List < DescribeMetricRuleBlackList> describeMetricRuleBlackList;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
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
         * The categories of the Alibaba Cloud service. For example, ApsaraDB for Redis includes the following categories: ApsaraDB for Redis (standard architecture), ApsaraDB for Redis (cluster architecture), and ApsaraDB for Redis (read/write splitting architecture). In this case, the valid values of this parameter for ApsaraDB for Redis include `kvstore_standard`, `kvstore_sharding`, and `kvstore_splitrw`.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The timestamp when the blacklist policy started to take effect.
         * <p>
         * 
         * Unit: milliseconds.
         */
        public Builder describeMetricRuleBlackList(java.util.List < DescribeMetricRuleBlackList> describeMetricRuleBlackList) {
            this.describeMetricRuleBlackList = describeMetricRuleBlackList;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The namespace of the cloud service.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The namespace of the cloud service.
         * <p>
         * 
         * For more information about the namespaces of different cloud services, see [Appendix 1: Metrics](~~163515~~).
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The timestamp when the blacklist policy was created.
         * <p>
         * 
         * Unit: milliseconds.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeMetricRuleBlackListResponseBody build() {
            return new DescribeMetricRuleBlackListResponseBody(this);
        } 

    } 

    public static class Metrics extends TeaModel {
        @NameInMap("MetricName")
        private String metricName;

        @NameInMap("Resource")
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
             * For more information about common request parameters, see [Common parameters](~~199331~~).
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * The ID of the request.
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
    public static class DescribeMetricRuleBlackList extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("EffectiveTime")
        private String effectiveTime;

        @NameInMap("EnableEndTime")
        private Long enableEndTime;

        @NameInMap("EnableStartTime")
        private Long enableStartTime;

        @NameInMap("Id")
        private String id;

        @NameInMap("Instances")
        private java.util.List < String > instances;

        @NameInMap("IsEnable")
        private Boolean isEnable;

        @NameInMap("Metrics")
        private java.util.List < Metrics> metrics;

        @NameInMap("Name")
        private String name;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("ScopeType")
        private String scopeType;

        @NameInMap("ScopeValue")
        private java.util.List < String > scopeValue;

        @NameInMap("UpdateTime")
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
             * The name of the blacklist policy.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The metrics of the instance.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The extended dimension of the instance. For example, `{"device":"C:"}` specifies that the blacklist policy is applied to all C disks of the specified Elastic Compute Service (ECS) instance.
             */
            public Builder effectiveTime(String effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * The number of entries to return on each page.
             * <p>
             * 
             * Default value: 10.
             */
            public Builder enableEndTime(Long enableEndTime) {
                this.enableEndTime = enableEndTime;
                return this;
            }

            /**
             * The ID of the application group. The value of this parameter is a JSON array.
             * <p>
             * 
             * >  This parameter is returned only if the `ScopeType` parameter is set to `GROUP`.
             */
            public Builder enableStartTime(Long enableStartTime) {
                this.enableStartTime = enableStartTime;
                return this;
            }

            /**
             * The timestamp when the blacklist policy was modified.
             * <p>
             * 
             * Unit: milliseconds.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Instances.
             */
            public Builder instances(java.util.List < String > instances) {
                this.instances = instances;
                return this;
            }

            /**
             * The total number of blacklist policies.
             */
            public Builder isEnable(Boolean isEnable) {
                this.isEnable = isEnable;
                return this;
            }

            /**
             * The method that is used to sort query results by time. Valid values:
             * <p>
             * 
             * *   DESC (default): descending order
             * *   ASC: ascending order
             */
            public Builder metrics(java.util.List < Metrics> metrics) {
                this.metrics = metrics;
                return this;
            }

            /**
             * The status of the blacklist policy. Valid values:
             * <p>
             * 
             * *   true: The blacklist policy is enabled.
             * *   false: The blacklist policy is disabled.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The number of the page to return.
             * <p>
             * 
             * Default value: 1.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The IDs of instances that belong to the specified cloud service.
             */
            public Builder scopeType(String scopeType) {
                this.scopeType = scopeType;
                return this;
            }

            /**
             * ScopeValue.
             */
            public Builder scopeValue(java.util.List < String > scopeValue) {
                this.scopeValue = scopeValue;
                return this;
            }

            /**
             * The ID of the blacklist policy.
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
