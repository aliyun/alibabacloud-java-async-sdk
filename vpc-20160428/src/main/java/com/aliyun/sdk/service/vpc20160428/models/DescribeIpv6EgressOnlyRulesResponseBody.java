// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIpv6EgressOnlyRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIpv6EgressOnlyRulesResponseBody</p>
 */
public class DescribeIpv6EgressOnlyRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Ipv6EgressOnlyRules")
    private Ipv6EgressOnlyRules ipv6EgressOnlyRules;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeIpv6EgressOnlyRulesResponseBody(Builder builder) {
        this.ipv6EgressOnlyRules = builder.ipv6EgressOnlyRules;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpv6EgressOnlyRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipv6EgressOnlyRules
     */
    public Ipv6EgressOnlyRules getIpv6EgressOnlyRules() {
        return this.ipv6EgressOnlyRules;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Ipv6EgressOnlyRules ipv6EgressOnlyRules; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The details about the egress-only rules.
         */
        public Builder ipv6EgressOnlyRules(Ipv6EgressOnlyRules ipv6EgressOnlyRules) {
            this.ipv6EgressOnlyRules = ipv6EgressOnlyRules;
            return this;
        }

        /**
         * The number of the returned page. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page. Maximum value: **50**. Default value: **10**.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeIpv6EgressOnlyRulesResponseBody build() {
            return new DescribeIpv6EgressOnlyRulesResponseBody(this);
        } 

    } 

    public static class Ipv6EgressOnlyRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Ipv6EgressOnlyRuleId")
        private String ipv6EgressOnlyRuleId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Ipv6EgressOnlyRule(Builder builder) {
            this.description = builder.description;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.ipv6EgressOnlyRuleId = builder.ipv6EgressOnlyRuleId;
            this.name = builder.name;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6EgressOnlyRule create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return ipv6EgressOnlyRuleId
         */
        public String getIpv6EgressOnlyRuleId() {
            return this.ipv6EgressOnlyRuleId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String description; 
            private String instanceId; 
            private String instanceType; 
            private String ipv6EgressOnlyRuleId; 
            private String name; 
            private String status; 

            /**
             * The description of the egress-only rule.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the instance to which the egress-only rule applies.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The type of the instance to which the egress-only rule applies.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The ID of the egress-only rule.
             */
            public Builder ipv6EgressOnlyRuleId(String ipv6EgressOnlyRuleId) {
                this.ipv6EgressOnlyRuleId = ipv6EgressOnlyRuleId;
                return this;
            }

            /**
             * The name of the egress-only rule.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The status of the egress-only rule.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Ipv6EgressOnlyRule build() {
                return new Ipv6EgressOnlyRule(this);
            } 

        } 

    }
    public static class Ipv6EgressOnlyRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv6EgressOnlyRule")
        private java.util.List < Ipv6EgressOnlyRule> ipv6EgressOnlyRule;

        private Ipv6EgressOnlyRules(Builder builder) {
            this.ipv6EgressOnlyRule = builder.ipv6EgressOnlyRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6EgressOnlyRules create() {
            return builder().build();
        }

        /**
         * @return ipv6EgressOnlyRule
         */
        public java.util.List < Ipv6EgressOnlyRule> getIpv6EgressOnlyRule() {
            return this.ipv6EgressOnlyRule;
        }

        public static final class Builder {
            private java.util.List < Ipv6EgressOnlyRule> ipv6EgressOnlyRule; 

            /**
             * Ipv6EgressOnlyRule.
             */
            public Builder ipv6EgressOnlyRule(java.util.List < Ipv6EgressOnlyRule> ipv6EgressOnlyRule) {
                this.ipv6EgressOnlyRule = ipv6EgressOnlyRule;
                return this;
            }

            public Ipv6EgressOnlyRules build() {
                return new Ipv6EgressOnlyRules(this);
            } 

        } 

    }
}
