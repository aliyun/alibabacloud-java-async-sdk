// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcipam20230228.models;

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
 * {@link ListIpamPoolCidrsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIpamPoolCidrsResponseBody</p>
 */
public class ListIpamPoolCidrsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("IpamPoolCidrs")
    private java.util.List<IpamPoolCidrs> ipamPoolCidrs;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<IpamPoolCidrs> getIpamPoolCidrs() {
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
        private java.util.List<IpamPoolCidrs> ipamPoolCidrs; 
        private Long maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListIpamPoolCidrsResponseBody model) {
            this.count = model.count;
            this.ipamPoolCidrs = model.ipamPoolCidrs;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The IDs of IPAM pools.</p>
         */
        public Builder ipamPoolCidrs(java.util.List<IpamPoolCidrs> ipamPoolCidrs) {
            this.ipamPoolCidrs = ipamPoolCidrs;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
         * <li>If a value of <strong>NextToken</strong> is returned, the value indicates the token that is used for the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9E7CCB95-62E0-534D-9B9A-71F27E8B71B1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
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

            private Builder() {
            } 

            private Builder(IpamPoolCidrs model) {
                this.cidr = model.cidr;
                this.ipamPoolId = model.ipamPoolId;
                this.status = model.status;
            } 

            /**
             * <p>The provisioned CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.0/24</p>
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * <p>The ID of the IPAM pool.</p>
             * 
             * <strong>example:</strong>
             * <p>ipam-pool-6rcq3tobayc20t****</p>
             */
            public Builder ipamPoolId(String ipamPoolId) {
                this.ipamPoolId = ipamPoolId;
                return this;
            }

            /**
             * <p>The status of the CIDR block provisioned to the IPAM pool. Valid values:</p>
             * <ul>
             * <li><strong>Created</strong></li>
             * <li><strong>Deleted</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Created</p>
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
