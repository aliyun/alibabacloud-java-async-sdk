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
         * The number of entries returned on each page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that determines the start point of the query. Valid values:
         * <p>
         * 
         * *   If **NextToken** was not returned in the previous query, it indicates that no additional results exist.
         * *   If **NextToken** was returned in the previous query, specify the value to obtain the next set of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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

        /**
         * A list of routes.
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

        @NameInMap("OperationalMode")
        private Boolean operationalMode;

        @NameInMap("PrefixListId")
        private String prefixListId;

        @NameInMap("Tag")
        private String tag;

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

        @NameInMap("TransitRouterRouteEntryNextHopResourceId")
        private String transitRouterRouteEntryNextHopResourceId;

        @NameInMap("TransitRouterRouteEntryNextHopResourceType")
        private String transitRouterRouteEntryNextHopResourceType;

        @NameInMap("TransitRouterRouteEntryNextHopType")
        private String transitRouterRouteEntryNextHopType;

        @NameInMap("TransitRouterRouteEntryOriginResourceId")
        private String transitRouterRouteEntryOriginResourceId;

        @NameInMap("TransitRouterRouteEntryOriginResourceType")
        private String transitRouterRouteEntryOriginResourceType;

        @NameInMap("TransitRouterRouteEntryStatus")
        private String transitRouterRouteEntryStatus;

        @NameInMap("TransitRouterRouteEntryType")
        private String transitRouterRouteEntryType;

        private TransitRouterRouteEntries(Builder builder) {
            this.createTime = builder.createTime;
            this.operationalMode = builder.operationalMode;
            this.prefixListId = builder.prefixListId;
            this.tag = builder.tag;
            this.transitRouterRouteEntryDescription = builder.transitRouterRouteEntryDescription;
            this.transitRouterRouteEntryDestinationCidrBlock = builder.transitRouterRouteEntryDestinationCidrBlock;
            this.transitRouterRouteEntryId = builder.transitRouterRouteEntryId;
            this.transitRouterRouteEntryName = builder.transitRouterRouteEntryName;
            this.transitRouterRouteEntryNextHopId = builder.transitRouterRouteEntryNextHopId;
            this.transitRouterRouteEntryNextHopResourceId = builder.transitRouterRouteEntryNextHopResourceId;
            this.transitRouterRouteEntryNextHopResourceType = builder.transitRouterRouteEntryNextHopResourceType;
            this.transitRouterRouteEntryNextHopType = builder.transitRouterRouteEntryNextHopType;
            this.transitRouterRouteEntryOriginResourceId = builder.transitRouterRouteEntryOriginResourceId;
            this.transitRouterRouteEntryOriginResourceType = builder.transitRouterRouteEntryOriginResourceType;
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
         * @return operationalMode
         */
        public Boolean getOperationalMode() {
            return this.operationalMode;
        }

        /**
         * @return prefixListId
         */
        public String getPrefixListId() {
            return this.prefixListId;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
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
         * @return transitRouterRouteEntryNextHopResourceId
         */
        public String getTransitRouterRouteEntryNextHopResourceId() {
            return this.transitRouterRouteEntryNextHopResourceId;
        }

        /**
         * @return transitRouterRouteEntryNextHopResourceType
         */
        public String getTransitRouterRouteEntryNextHopResourceType() {
            return this.transitRouterRouteEntryNextHopResourceType;
        }

        /**
         * @return transitRouterRouteEntryNextHopType
         */
        public String getTransitRouterRouteEntryNextHopType() {
            return this.transitRouterRouteEntryNextHopType;
        }

        /**
         * @return transitRouterRouteEntryOriginResourceId
         */
        public String getTransitRouterRouteEntryOriginResourceId() {
            return this.transitRouterRouteEntryOriginResourceId;
        }

        /**
         * @return transitRouterRouteEntryOriginResourceType
         */
        public String getTransitRouterRouteEntryOriginResourceType() {
            return this.transitRouterRouteEntryOriginResourceType;
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
            private Boolean operationalMode; 
            private String prefixListId; 
            private String tag; 
            private String transitRouterRouteEntryDescription; 
            private String transitRouterRouteEntryDestinationCidrBlock; 
            private String transitRouterRouteEntryId; 
            private String transitRouterRouteEntryName; 
            private String transitRouterRouteEntryNextHopId; 
            private String transitRouterRouteEntryNextHopResourceId; 
            private String transitRouterRouteEntryNextHopResourceType; 
            private String transitRouterRouteEntryNextHopType; 
            private String transitRouterRouteEntryOriginResourceId; 
            private String transitRouterRouteEntryOriginResourceType; 
            private String transitRouterRouteEntryStatus; 
            private String transitRouterRouteEntryType; 

            /**
             * The time when the route entry was created.
             * <p>
             * 
             * The time follows the ISO8601 standard in the YYYY-MM-DDThh:mmZ format. The time is displayed in UTC.
             * 
             * >  This parameter is returned only for static routes.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Indicates whether the route can be managed. Valid values: 
             * <p>
             * 
             * - **true**: The route can be managed. You can delete the route.
             * - **false**: The route cannot be managed because it is automatically generated by the system.
             */
            public Builder operationalMode(Boolean operationalMode) {
                this.operationalMode = operationalMode;
                return this;
            }

            /**
             * PrefixListId.
             */
            public Builder prefixListId(String prefixListId) {
                this.prefixListId = prefixListId;
                return this;
            }

            /**
             * The tag of the route. 
             * <p>
             * 
             * Valid value: **PermitVbr**, which indicates that the rote is advertised only to the route table of the virtual border router (VBR) that is connected to the transit router.  
             * 
             * >  This parameter is returned only for routes that are automatically generated by the system and use IP addresses from the CIDR block of the transit router.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * The description of the route.
             * <p>
             * 
             * >  This parameter is returned only for static routes.
             */
            public Builder transitRouterRouteEntryDescription(String transitRouterRouteEntryDescription) {
                this.transitRouterRouteEntryDescription = transitRouterRouteEntryDescription;
                return this;
            }

            /**
             * The destination CIDR block of the route.
             */
            public Builder transitRouterRouteEntryDestinationCidrBlock(String transitRouterRouteEntryDestinationCidrBlock) {
                this.transitRouterRouteEntryDestinationCidrBlock = transitRouterRouteEntryDestinationCidrBlock;
                return this;
            }

            /**
             * The ID of the route entry.
             * <p>
             * 
             * >  This parameter is returned only for static routes.
             */
            public Builder transitRouterRouteEntryId(String transitRouterRouteEntryId) {
                this.transitRouterRouteEntryId = transitRouterRouteEntryId;
                return this;
            }

            /**
             * The name of the route.
             * <p>
             * 
             * >  This parameter is returned only for static routes.
             */
            public Builder transitRouterRouteEntryName(String transitRouterRouteEntryName) {
                this.transitRouterRouteEntryName = transitRouterRouteEntryName;
                return this;
            }

            /**
             * The ID of the next hop.
             */
            public Builder transitRouterRouteEntryNextHopId(String transitRouterRouteEntryNextHopId) {
                this.transitRouterRouteEntryNextHopId = transitRouterRouteEntryNextHopId;
                return this;
            }

            /**
             * TransitRouterRouteEntryNextHopResourceId.
             */
            public Builder transitRouterRouteEntryNextHopResourceId(String transitRouterRouteEntryNextHopResourceId) {
                this.transitRouterRouteEntryNextHopResourceId = transitRouterRouteEntryNextHopResourceId;
                return this;
            }

            /**
             * TransitRouterRouteEntryNextHopResourceType.
             */
            public Builder transitRouterRouteEntryNextHopResourceType(String transitRouterRouteEntryNextHopResourceType) {
                this.transitRouterRouteEntryNextHopResourceType = transitRouterRouteEntryNextHopResourceType;
                return this;
            }

            /**
             * The type of next hop. Valid values:
             * <p>
             * 
             * *   **BlackHole**: a blackhole route. Packets destined for the destination CIDR block of the route are dropped.
             * *   **Attachment**: a network instance connection. Packets destined for the destination CIDR block of the route entry are forwarded to the specified network instance connection.
             */
            public Builder transitRouterRouteEntryNextHopType(String transitRouterRouteEntryNextHopType) {
                this.transitRouterRouteEntryNextHopType = transitRouterRouteEntryNextHopType;
                return this;
            }

            /**
             * TransitRouterRouteEntryOriginResourceId.
             */
            public Builder transitRouterRouteEntryOriginResourceId(String transitRouterRouteEntryOriginResourceId) {
                this.transitRouterRouteEntryOriginResourceId = transitRouterRouteEntryOriginResourceId;
                return this;
            }

            /**
             * TransitRouterRouteEntryOriginResourceType.
             */
            public Builder transitRouterRouteEntryOriginResourceType(String transitRouterRouteEntryOriginResourceType) {
                this.transitRouterRouteEntryOriginResourceType = transitRouterRouteEntryOriginResourceType;
                return this;
            }

            /**
             * The status of the route. Valid values: 
             * <p>
             * 
             * - **Creating**: The route is being created.
             * - **Active**: The rule is available.
             * - **Deleting**: The rule is being deleted.
             */
            public Builder transitRouterRouteEntryStatus(String transitRouterRouteEntryStatus) {
                this.transitRouterRouteEntryStatus = transitRouterRouteEntryStatus;
                return this;
            }

            /**
             * The type of the route. Valid values: 
             * <p>
             * 
             * - **Static**: a static route
             * - **Propagated**: an automatically learned route
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
