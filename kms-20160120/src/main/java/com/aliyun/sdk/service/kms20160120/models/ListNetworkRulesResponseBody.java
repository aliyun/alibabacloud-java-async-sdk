// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNetworkRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListNetworkRulesResponseBody</p>
 */
public class ListNetworkRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkRules")
    private NetworkRules networkRules;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListNetworkRulesResponseBody(Builder builder) {
        this.networkRules = builder.networkRules;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNetworkRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return networkRules
     */
    public NetworkRules getNetworkRules() {
        return this.networkRules;
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
        private NetworkRules networkRules; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * A list of access control rules.
         */
        public Builder networkRules(NetworkRules networkRules) {
            this.networkRules = networkRules;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
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

        public ListNetworkRulesResponseBody build() {
            return new ListNetworkRulesResponseBody(this);
        } 

    } 

    public static class NetworkRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private NetworkRule(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkRule create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private String type; 

            /**
             * The name of the access control rule.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The network type. The value is fixed as Private. Self-managed applications can access KMS instances only over a private virtual private cloud (VPC).
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public NetworkRule build() {
                return new NetworkRule(this);
            } 

        } 

    }
    public static class NetworkRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetworkRule")
        private java.util.List < NetworkRule> networkRule;

        private NetworkRules(Builder builder) {
            this.networkRule = builder.networkRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkRules create() {
            return builder().build();
        }

        /**
         * @return networkRule
         */
        public java.util.List < NetworkRule> getNetworkRule() {
            return this.networkRule;
        }

        public static final class Builder {
            private java.util.List < NetworkRule> networkRule; 

            /**
             * NetworkRule.
             */
            public Builder networkRule(java.util.List < NetworkRule> networkRule) {
                this.networkRule = networkRule;
                return this;
            }

            public NetworkRules build() {
                return new NetworkRules(this);
            } 

        } 

    }
}
