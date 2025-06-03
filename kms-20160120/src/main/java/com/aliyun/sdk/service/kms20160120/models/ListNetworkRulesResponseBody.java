// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListNetworkRulesResponseBody model) {
            this.networkRules = model.networkRules;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>A list of access control rules.</p>
         */
        public Builder networkRules(NetworkRules networkRules) {
            this.networkRules = networkRules;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>3bf02f7a-015b-4f34-be0f-cc043fda2d33</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListNetworkRulesResponseBody build() {
            return new ListNetworkRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNetworkRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNetworkRulesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(NetworkRule model) {
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>The name of the access control rule.</p>
             * 
             * <strong>example:</strong>
             * <p>networkrule_test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The network type. The value is fixed as Private. Self-managed applications can access KMS instances only over a private virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>Private</p>
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
    /**
     * 
     * {@link ListNetworkRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNetworkRulesResponseBody</p>
     */
    public static class NetworkRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetworkRule")
        private java.util.List<NetworkRule> networkRule;

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
        public java.util.List<NetworkRule> getNetworkRule() {
            return this.networkRule;
        }

        public static final class Builder {
            private java.util.List<NetworkRule> networkRule; 

            private Builder() {
            } 

            private Builder(NetworkRules model) {
                this.networkRule = model.networkRule;
            } 

            /**
             * NetworkRule.
             */
            public Builder networkRule(java.util.List<NetworkRule> networkRule) {
                this.networkRule = networkRule;
                return this;
            }

            public NetworkRules build() {
                return new NetworkRules(this);
            } 

        } 

    }
}
