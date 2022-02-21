// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTransitRouterRouteEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTransitRouterRouteEntriesResponseBody</p>
 */
public class ListTransitRouterRouteEntriesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("TransitRouterRouteEntries")
    private java.util.List < TransitRouterRouteEntries> transitRouterRouteEntries;

    private ListTransitRouterRouteEntriesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.transitRouterRouteEntries = builder.transitRouterRouteEntries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTransitRouterRouteEntriesResponseBody create() {
        return builder().build();
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return transitRouterRouteEntries
     */
    public java.util.List < TransitRouterRouteEntries> getTransitRouterRouteEntries() {
        return this.transitRouterRouteEntries;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < TransitRouterRouteEntries> transitRouterRouteEntries; 

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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TransitRouterRouteEntries.
         */
        public Builder transitRouterRouteEntries(java.util.List < TransitRouterRouteEntries> transitRouterRouteEntries) {
            this.transitRouterRouteEntries = transitRouterRouteEntries;
            return this;
        }

        public ListTransitRouterRouteEntriesResponseBody build() {
            return new ListTransitRouterRouteEntriesResponseBody(this);
        } 

    } 

    public static class TransitRouterRouteEntries extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("TransitRouterRouteEntryDescription")
        private String transitRouterRouteEntryDescription;

        @NameInMap("TransitRouterRouteEntryDestinationCidrBlock")
        private String transitRouterRouteEntryDestinationCidrBlock;

        @NameInMap("TransitRouterRouteEntryId")
        private String transitRouterRouteEntryId;

        @NameInMap("TransitRouterRouteEntryName")
        private String transitRouterRouteEntryName;

        @NameInMap("TransitRouterRouteEntryNextHopId")
        private String transitRouterRouteEntryNextHopId;

        @NameInMap("TransitRouterRouteEntryNextHopType")
        private String transitRouterRouteEntryNextHopType;

        @NameInMap("TransitRouterRouteEntryStatus")
        private String transitRouterRouteEntryStatus;

        @NameInMap("TransitRouterRouteEntryType")
        private String transitRouterRouteEntryType;

        private TransitRouterRouteEntries(Builder builder) {
            this.createTime = builder.createTime;
            this.transitRouterRouteEntryDescription = builder.transitRouterRouteEntryDescription;
            this.transitRouterRouteEntryDestinationCidrBlock = builder.transitRouterRouteEntryDestinationCidrBlock;
            this.transitRouterRouteEntryId = builder.transitRouterRouteEntryId;
            this.transitRouterRouteEntryName = builder.transitRouterRouteEntryName;
            this.transitRouterRouteEntryNextHopId = builder.transitRouterRouteEntryNextHopId;
            this.transitRouterRouteEntryNextHopType = builder.transitRouterRouteEntryNextHopType;
            this.transitRouterRouteEntryStatus = builder.transitRouterRouteEntryStatus;
            this.transitRouterRouteEntryType = builder.transitRouterRouteEntryType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransitRouterRouteEntries create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return transitRouterRouteEntryDescription
         */
        public String getTransitRouterRouteEntryDescription() {
            return this.transitRouterRouteEntryDescription;
        }

        /**
         * @return transitRouterRouteEntryDestinationCidrBlock
         */
        public String getTransitRouterRouteEntryDestinationCidrBlock() {
            return this.transitRouterRouteEntryDestinationCidrBlock;
        }

        /**
         * @return transitRouterRouteEntryId
         */
        public String getTransitRouterRouteEntryId() {
            return this.transitRouterRouteEntryId;
        }

        /**
         * @return transitRouterRouteEntryName
         */
        public String getTransitRouterRouteEntryName() {
            return this.transitRouterRouteEntryName;
        }

        /**
         * @return transitRouterRouteEntryNextHopId
         */
        public String getTransitRouterRouteEntryNextHopId() {
            return this.transitRouterRouteEntryNextHopId;
        }

        /**
         * @return transitRouterRouteEntryNextHopType
         */
        public String getTransitRouterRouteEntryNextHopType() {
            return this.transitRouterRouteEntryNextHopType;
        }

        /**
         * @return transitRouterRouteEntryStatus
         */
        public String getTransitRouterRouteEntryStatus() {
            return this.transitRouterRouteEntryStatus;
        }

        /**
         * @return transitRouterRouteEntryType
         */
        public String getTransitRouterRouteEntryType() {
            return this.transitRouterRouteEntryType;
        }

        public static final class Builder {
            private String createTime; 
            private String transitRouterRouteEntryDescription; 
            private String transitRouterRouteEntryDestinationCidrBlock; 
            private String transitRouterRouteEntryId; 
            private String transitRouterRouteEntryName; 
            private String transitRouterRouteEntryNextHopId; 
            private String transitRouterRouteEntryNextHopType; 
            private String transitRouterRouteEntryStatus; 
            private String transitRouterRouteEntryType; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * TransitRouterRouteEntryDescription.
             */
            public Builder transitRouterRouteEntryDescription(String transitRouterRouteEntryDescription) {
                this.transitRouterRouteEntryDescription = transitRouterRouteEntryDescription;
                return this;
            }

            /**
             * TransitRouterRouteEntryDestinationCidrBlock.
             */
            public Builder transitRouterRouteEntryDestinationCidrBlock(String transitRouterRouteEntryDestinationCidrBlock) {
                this.transitRouterRouteEntryDestinationCidrBlock = transitRouterRouteEntryDestinationCidrBlock;
                return this;
            }

            /**
             * TransitRouterRouteEntryId.
             */
            public Builder transitRouterRouteEntryId(String transitRouterRouteEntryId) {
                this.transitRouterRouteEntryId = transitRouterRouteEntryId;
                return this;
            }

            /**
             * TransitRouterRouteEntryName.
             */
            public Builder transitRouterRouteEntryName(String transitRouterRouteEntryName) {
                this.transitRouterRouteEntryName = transitRouterRouteEntryName;
                return this;
            }

            /**
             * TransitRouterRouteEntryNextHopId.
             */
            public Builder transitRouterRouteEntryNextHopId(String transitRouterRouteEntryNextHopId) {
                this.transitRouterRouteEntryNextHopId = transitRouterRouteEntryNextHopId;
                return this;
            }

            /**
             * TransitRouterRouteEntryNextHopType.
             */
            public Builder transitRouterRouteEntryNextHopType(String transitRouterRouteEntryNextHopType) {
                this.transitRouterRouteEntryNextHopType = transitRouterRouteEntryNextHopType;
                return this;
            }

            /**
             * TransitRouterRouteEntryStatus.
             */
            public Builder transitRouterRouteEntryStatus(String transitRouterRouteEntryStatus) {
                this.transitRouterRouteEntryStatus = transitRouterRouteEntryStatus;
                return this;
            }

            /**
             * TransitRouterRouteEntryType.
             */
            public Builder transitRouterRouteEntryType(String transitRouterRouteEntryType) {
                this.transitRouterRouteEntryType = transitRouterRouteEntryType;
                return this;
            }

            public TransitRouterRouteEntries build() {
                return new TransitRouterRouteEntries(this);
            } 

        } 

    }
}
