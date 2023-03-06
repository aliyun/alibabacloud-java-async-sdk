// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTransitRouterPrefixListAssociationResponseBody} extends {@link TeaModel}
 *
 * <p>ListTransitRouterPrefixListAssociationResponseBody</p>
 */
public class ListTransitRouterPrefixListAssociationResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("PrefixLists")
    private java.util.List < PrefixLists> prefixLists;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListTransitRouterPrefixListAssociationResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.prefixLists = builder.prefixLists;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTransitRouterPrefixListAssociationResponseBody create() {
        return builder().build();
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
     * @return prefixLists
     */
    public java.util.List < PrefixLists> getPrefixLists() {
        return this.prefixLists;
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
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List < PrefixLists> prefixLists; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The information about the prefix list.
         */
        public Builder prefixLists(java.util.List < PrefixLists> prefixLists) {
            this.prefixLists = prefixLists;
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
         * The number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTransitRouterPrefixListAssociationResponseBody build() {
            return new ListTransitRouterPrefixListAssociationResponseBody(this);
        } 

    } 

    public static class PrefixLists extends TeaModel {
        @NameInMap("NextHop")
        private String nextHop;

        @NameInMap("NextHopInstanceId")
        private String nextHopInstanceId;

        @NameInMap("NextHopType")
        private String nextHopType;

        @NameInMap("OwnerUid")
        private Long ownerUid;

        @NameInMap("PrefixListId")
        private String prefixListId;

        @NameInMap("Status")
        private String status;

        @NameInMap("TransitRouterId")
        private String transitRouterId;

        @NameInMap("TransitRouterTableId")
        private String transitRouterTableId;

        private PrefixLists(Builder builder) {
            this.nextHop = builder.nextHop;
            this.nextHopInstanceId = builder.nextHopInstanceId;
            this.nextHopType = builder.nextHopType;
            this.ownerUid = builder.ownerUid;
            this.prefixListId = builder.prefixListId;
            this.status = builder.status;
            this.transitRouterId = builder.transitRouterId;
            this.transitRouterTableId = builder.transitRouterTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrefixLists create() {
            return builder().build();
        }

        /**
         * @return nextHop
         */
        public String getNextHop() {
            return this.nextHop;
        }

        /**
         * @return nextHopInstanceId
         */
        public String getNextHopInstanceId() {
            return this.nextHopInstanceId;
        }

        /**
         * @return nextHopType
         */
        public String getNextHopType() {
            return this.nextHopType;
        }

        /**
         * @return ownerUid
         */
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        /**
         * @return prefixListId
         */
        public String getPrefixListId() {
            return this.prefixListId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return transitRouterId
         */
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

        /**
         * @return transitRouterTableId
         */
        public String getTransitRouterTableId() {
            return this.transitRouterTableId;
        }

        public static final class Builder {
            private String nextHop; 
            private String nextHopInstanceId; 
            private String nextHopType; 
            private Long ownerUid; 
            private String prefixListId; 
            private String status; 
            private String transitRouterId; 
            private String transitRouterTableId; 

            /**
             * The ID of the next hop.
             * <p>
             * 
             * >  If the value is **BlackHole**, all the CIDR blocks in the prefix list are blackhole routes. Packets destined for the CIDR blocks are dropped.
             */
            public Builder nextHop(String nextHop) {
                this.nextHop = nextHop;
                return this;
            }

            /**
             * The ID of the network instance associated with the next hop connection.
             */
            public Builder nextHopInstanceId(String nextHopInstanceId) {
                this.nextHopInstanceId = nextHopInstanceId;
                return this;
            }

            /**
             * The type of the next hop.
             * <p>
             * 
             * *   **BlackHole**: All the CIDR blocks in the prefix list are blackhole routes. Packets destined for the CIDR blocks are dropped.
             * *   **VPC**: The next hop of the CIDR blocks in the prefix list is a VPC connection.
             * *   **VBR**: The next hop of the CIDR blocks in the prefix list is a VBR connection.
             * *   **TR**: The next hop of the CIDR blocks in the prefix list is an inter-region connection.
             */
            public Builder nextHopType(String nextHopType) {
                this.nextHopType = nextHopType;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the prefix list belongs.
             */
            public Builder ownerUid(Long ownerUid) {
                this.ownerUid = ownerUid;
                return this;
            }

            /**
             * The ID of the prefix list.
             */
            public Builder prefixListId(String prefixListId) {
                this.prefixListId = prefixListId;
                return this;
            }

            /**
             * The status of the prefix list. Valid values:
             * <p>
             * 
             * *   **Active**: The prefix list is effective.
             * *   **Updating**: The prefix list is being updated.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the transit router.
             */
            public Builder transitRouterId(String transitRouterId) {
                this.transitRouterId = transitRouterId;
                return this;
            }

            /**
             * The ID of the route table of the transit router.
             */
            public Builder transitRouterTableId(String transitRouterTableId) {
                this.transitRouterTableId = transitRouterTableId;
                return this;
            }

            public PrefixLists build() {
                return new PrefixLists(this);
            } 

        } 

    }
}
