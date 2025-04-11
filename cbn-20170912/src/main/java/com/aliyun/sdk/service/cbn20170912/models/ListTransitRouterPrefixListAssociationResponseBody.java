// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link ListTransitRouterPrefixListAssociationResponseBody} extends {@link TeaModel}
 *
 * <p>ListTransitRouterPrefixListAssociationResponseBody</p>
 */
public class ListTransitRouterPrefixListAssociationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PrefixLists")
    private java.util.List<PrefixLists> prefixLists;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<PrefixLists> getPrefixLists() {
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
        private java.util.List<PrefixLists> prefixLists; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListTransitRouterPrefixListAssociationResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.prefixLists = model.prefixLists;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>A list of prefix lists.</p>
         */
        public Builder prefixLists(java.util.List<PrefixLists> prefixLists) {
            this.prefixLists = prefixLists;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6005CA94-676E-1FEE-985E-7602EFAADD6A</p>
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

        public ListTransitRouterPrefixListAssociationResponseBody build() {
            return new ListTransitRouterPrefixListAssociationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTransitRouterPrefixListAssociationResponseBody} extends {@link TeaModel}
     *
     * <p>ListTransitRouterPrefixListAssociationResponseBody</p>
     */
    public static class PrefixLists extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NextHop")
        private String nextHop;

        @com.aliyun.core.annotation.NameInMap("NextHopInstanceId")
        private String nextHopInstanceId;

        @com.aliyun.core.annotation.NameInMap("NextHopType")
        private String nextHopType;

        @com.aliyun.core.annotation.NameInMap("OwnerUid")
        private Long ownerUid;

        @com.aliyun.core.annotation.NameInMap("PrefixListId")
        private String prefixListId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TransitRouterId")
        private String transitRouterId;

        @com.aliyun.core.annotation.NameInMap("TransitRouterTableId")
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

            private Builder() {
            } 

            private Builder(PrefixLists model) {
                this.nextHop = model.nextHop;
                this.nextHopInstanceId = model.nextHopInstanceId;
                this.nextHopType = model.nextHopType;
                this.ownerUid = model.ownerUid;
                this.prefixListId = model.prefixListId;
                this.status = model.status;
                this.transitRouterId = model.transitRouterId;
                this.transitRouterTableId = model.transitRouterTableId;
            } 

            /**
             * <p>The ID of the next hop.</p>
             * <blockquote>
             * <p>A value of <strong>BlackHole</strong> indicates that all the CIDR blocks in the prefix list are blackhole routes. Packets destined for the CIDR blocks are dropped.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>tr-attach-flbq507rg2ckrj****</p>
             */
            public Builder nextHop(String nextHop) {
                this.nextHop = nextHop;
                return this;
            }

            /**
             * <p>The ID of the network instance associated with the next hop connection.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-6eh7fp9hdqa2wv85t****</p>
             */
            public Builder nextHopInstanceId(String nextHopInstanceId) {
                this.nextHopInstanceId = nextHopInstanceId;
                return this;
            }

            /**
             * <p>The type of the next hop. Valid values:</p>
             * <ul>
             * <li><strong>BlackHole</strong>: All the CIDR blocks in the prefix list are blackhole routes. Packets destined for the CIDR blocks are dropped.</li>
             * <li><strong>VPC</strong>: The next hop of the CIDR blocks in the prefix list is a VPC connection.</li>
             * <li><strong>VBR</strong>: The next hop of the CIDR blocks in the prefix list is a VBR connection.</li>
             * <li><strong>TR</strong>: The next hop of the CIDR blocks in the prefix list is an inter-region connection.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder nextHopType(String nextHopType) {
                this.nextHopType = nextHopType;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the prefix list belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1210123456123456</p>
             */
            public Builder ownerUid(Long ownerUid) {
                this.ownerUid = ownerUid;
                return this;
            }

            /**
             * <p>The ID of the prefix list.</p>
             * 
             * <strong>example:</strong>
             * <p>pl-6ehtn5kqxgeyy08fi****</p>
             */
            public Builder prefixListId(String prefixListId) {
                this.prefixListId = prefixListId;
                return this;
            }

            /**
             * <p>The status of the prefix list. Valid values:</p>
             * <ul>
             * <li><strong>Active</strong>: The prefix list is effective.</li>
             * <li><strong>Updating</strong>: The prefix list is being updated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the transit router.</p>
             * 
             * <strong>example:</strong>
             * <p>tr-6ehx7q2jze8ch5ji0****</p>
             */
            public Builder transitRouterId(String transitRouterId) {
                this.transitRouterId = transitRouterId;
                return this;
            }

            /**
             * <p>The ID of the route table of the transit router.</p>
             * 
             * <strong>example:</strong>
             * <p>vtb-6ehgc262hr170qgyc****</p>
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
