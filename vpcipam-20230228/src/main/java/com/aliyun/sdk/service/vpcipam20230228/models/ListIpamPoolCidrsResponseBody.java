// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcipam20230228.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListIpamPoolCidrsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIpamPoolCidrsResponseBody</p>
 */
public class ListIpamPoolCidrsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("IpamPoolCidrs")
    private java.util.List < IpamPoolCidrs> ipamPoolCidrs;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListIpamPoolCidrsResponseBody(Builder builder) {
        this.count = builder.count;
        this.ipamPoolCidrs = builder.ipamPoolCidrs;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIpamPoolCidrsResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return ipamPoolCidrs
     */
    public java.util.List < IpamPoolCidrs> getIpamPoolCidrs() {
        return this.ipamPoolCidrs;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long count; 
        private java.util.List < IpamPoolCidrs> ipamPoolCidrs; 
        private Long maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Count.
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * IpamPoolCidrs.
         */
        public Builder ipamPoolCidrs(java.util.List < IpamPoolCidrs> ipamPoolCidrs) {
            this.ipamPoolCidrs = ipamPoolCidrs;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListIpamPoolCidrsResponseBody build() {
            return new ListIpamPoolCidrsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIpamPoolCidrsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIpamPoolCidrsResponseBody</p>
     */
    public static class IpamPoolCidrs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cidr")
        private String cidr;

        @com.aliyun.core.annotation.NameInMap("IpamPoolId")
        private String ipamPoolId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private IpamPoolCidrs(Builder builder) {
            this.cidr = builder.cidr;
            this.ipamPoolId = builder.ipamPoolId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpamPoolCidrs create() {
            return builder().build();
        }

        /**
         * @return cidr
         */
        public String getCidr() {
            return this.cidr;
        }

        /**
         * @return ipamPoolId
         */
        public String getIpamPoolId() {
            return this.ipamPoolId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String cidr; 
            private String ipamPoolId; 
            private String status; 

            /**
             * Cidr.
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * IpamPoolId.
             */
            public Builder ipamPoolId(String ipamPoolId) {
                this.ipamPoolId = ipamPoolId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public IpamPoolCidrs build() {
                return new IpamPoolCidrs(this);
            } 

        } 

    }
}
