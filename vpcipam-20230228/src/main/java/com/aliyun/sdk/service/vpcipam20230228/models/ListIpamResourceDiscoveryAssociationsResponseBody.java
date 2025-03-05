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
 * {@link ListIpamResourceDiscoveryAssociationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIpamResourceDiscoveryAssociationsResponseBody</p>
 */
public class ListIpamResourceDiscoveryAssociationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("IpamResourceDiscoveryAssociations")
    private java.util.List<IpamResourceDiscoveryAssociations> ipamResourceDiscoveryAssociations;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListIpamResourceDiscoveryAssociationsResponseBody(Builder builder) {
        this.count = builder.count;
        this.ipamResourceDiscoveryAssociations = builder.ipamResourceDiscoveryAssociations;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIpamResourceDiscoveryAssociationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return ipamResourceDiscoveryAssociations
     */
    public java.util.List<IpamResourceDiscoveryAssociations> getIpamResourceDiscoveryAssociations() {
        return this.ipamResourceDiscoveryAssociations;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
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
        private Integer count; 
        private java.util.List<IpamResourceDiscoveryAssociations> ipamResourceDiscoveryAssociations; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * IpamResourceDiscoveryAssociations.
         */
        public Builder ipamResourceDiscoveryAssociations(java.util.List<IpamResourceDiscoveryAssociations> ipamResourceDiscoveryAssociations) {
            this.ipamResourceDiscoveryAssociations = ipamResourceDiscoveryAssociations;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
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

        public ListIpamResourceDiscoveryAssociationsResponseBody build() {
            return new ListIpamResourceDiscoveryAssociationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIpamResourceDiscoveryAssociationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIpamResourceDiscoveryAssociationsResponseBody</p>
     */
    public static class IpamResourceDiscoveryAssociations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpamId")
        private String ipamId;

        @com.aliyun.core.annotation.NameInMap("IpamResourceDiscoveryId")
        private String ipamResourceDiscoveryId;

        @com.aliyun.core.annotation.NameInMap("IpamResourceDiscoveryOwnerId")
        private String ipamResourceDiscoveryOwnerId;

        @com.aliyun.core.annotation.NameInMap("IpamResourceDiscoveryStatus")
        private String ipamResourceDiscoveryStatus;

        @com.aliyun.core.annotation.NameInMap("IpamResourceDiscoveryType")
        private String ipamResourceDiscoveryType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private IpamResourceDiscoveryAssociations(Builder builder) {
            this.ipamId = builder.ipamId;
            this.ipamResourceDiscoveryId = builder.ipamResourceDiscoveryId;
            this.ipamResourceDiscoveryOwnerId = builder.ipamResourceDiscoveryOwnerId;
            this.ipamResourceDiscoveryStatus = builder.ipamResourceDiscoveryStatus;
            this.ipamResourceDiscoveryType = builder.ipamResourceDiscoveryType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpamResourceDiscoveryAssociations create() {
            return builder().build();
        }

        /**
         * @return ipamId
         */
        public String getIpamId() {
            return this.ipamId;
        }

        /**
         * @return ipamResourceDiscoveryId
         */
        public String getIpamResourceDiscoveryId() {
            return this.ipamResourceDiscoveryId;
        }

        /**
         * @return ipamResourceDiscoveryOwnerId
         */
        public String getIpamResourceDiscoveryOwnerId() {
            return this.ipamResourceDiscoveryOwnerId;
        }

        /**
         * @return ipamResourceDiscoveryStatus
         */
        public String getIpamResourceDiscoveryStatus() {
            return this.ipamResourceDiscoveryStatus;
        }

        /**
         * @return ipamResourceDiscoveryType
         */
        public String getIpamResourceDiscoveryType() {
            return this.ipamResourceDiscoveryType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String ipamId; 
            private String ipamResourceDiscoveryId; 
            private String ipamResourceDiscoveryOwnerId; 
            private String ipamResourceDiscoveryStatus; 
            private String ipamResourceDiscoveryType; 
            private String status; 

            /**
             * IpamId.
             */
            public Builder ipamId(String ipamId) {
                this.ipamId = ipamId;
                return this;
            }

            /**
             * IpamResourceDiscoveryId.
             */
            public Builder ipamResourceDiscoveryId(String ipamResourceDiscoveryId) {
                this.ipamResourceDiscoveryId = ipamResourceDiscoveryId;
                return this;
            }

            /**
             * IpamResourceDiscoveryOwnerId.
             */
            public Builder ipamResourceDiscoveryOwnerId(String ipamResourceDiscoveryOwnerId) {
                this.ipamResourceDiscoveryOwnerId = ipamResourceDiscoveryOwnerId;
                return this;
            }

            /**
             * IpamResourceDiscoveryStatus.
             */
            public Builder ipamResourceDiscoveryStatus(String ipamResourceDiscoveryStatus) {
                this.ipamResourceDiscoveryStatus = ipamResourceDiscoveryStatus;
                return this;
            }

            /**
             * IpamResourceDiscoveryType.
             */
            public Builder ipamResourceDiscoveryType(String ipamResourceDiscoveryType) {
                this.ipamResourceDiscoveryType = ipamResourceDiscoveryType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public IpamResourceDiscoveryAssociations build() {
                return new IpamResourceDiscoveryAssociations(this);
            } 

        } 

    }
}
