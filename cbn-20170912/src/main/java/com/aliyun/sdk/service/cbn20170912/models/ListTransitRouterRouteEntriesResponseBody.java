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
         * The number of entries per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   If **NextToken** is empty, no next page exists.
         * *   If a value is returned for **NextToken**, the value is the token that determines the start point of the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
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
         * A list of route entries.
         */
        public Builder transitRouterRouteEntries(java.util.List < TransitRouterRouteEntries> transitRouterRouteEntries) {
            this.transitRouterRouteEntries = transitRouterRouteEntries;
            return this;
        }

        public ListTransitRouterRouteEntriesResponseBody build() {
            return new ListTransitRouterRouteEntriesResponseBody(this);
        } 

    } 

    public static class PathAttributes extends TeaModel {
        @NameInMap("AsPaths")
        private java.util.List < String > asPaths;

        @NameInMap("Communities")
        private java.util.List < String > communities;

        @NameInMap("OriginInstanceId")
        private String originInstanceId;

        @NameInMap("OriginInstanceType")
        private String originInstanceType;

        @NameInMap("OriginRouteType")
        private String originRouteType;

        @NameInMap("Preference")
        private Integer preference;

        private PathAttributes(Builder builder) {
            this.asPaths = builder.asPaths;
            this.communities = builder.communities;
            this.originInstanceId = builder.originInstanceId;
            this.originInstanceType = builder.originInstanceType;
            this.originRouteType = builder.originRouteType;
            this.preference = builder.preference;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PathAttributes create() {
            return builder().build();
        }

        /**
         * @return asPaths
         */
        public java.util.List < String > getAsPaths() {
            return this.asPaths;
        }

        /**
         * @return communities
         */
        public java.util.List < String > getCommunities() {
            return this.communities;
        }

        /**
         * @return originInstanceId
         */
        public String getOriginInstanceId() {
            return this.originInstanceId;
        }

        /**
         * @return originInstanceType
         */
        public String getOriginInstanceType() {
            return this.originInstanceType;
        }

        /**
         * @return originRouteType
         */
        public String getOriginRouteType() {
            return this.originRouteType;
        }

        /**
         * @return preference
         */
        public Integer getPreference() {
            return this.preference;
        }

        public static final class Builder {
            private java.util.List < String > asPaths; 
            private java.util.List < String > communities; 
            private String originInstanceId; 
            private String originInstanceType; 
            private String originRouteType; 
            private Integer preference; 

            /**
             * The route AS path.
             */
            public Builder asPaths(java.util.List < String > asPaths) {
                this.asPaths = asPaths;
                return this;
            }

            /**
             * The route community.
             */
            public Builder communities(java.util.List < String > communities) {
                this.communities = communities;
                return this;
            }

            /**
             * The source instance ID.
             */
            public Builder originInstanceId(String originInstanceId) {
                this.originInstanceId = originInstanceId;
                return this;
            }

            /**
             * The source instance type. Valid values:
             * <p>
             * 
             * *   **VPC**
             * *   **VBR**
             * *   **TR**
             * *   **VPN**
             * *   **CCN**
             */
            public Builder originInstanceType(String originInstanceType) {
                this.originInstanceType = originInstanceType;
                return this;
            }

            /**
             * The route type. Valid values:
             * <p>
             * 
             * *   **System**
             * *   **Custom**
             * *   **static**
             * *   **BGP**
             * *   **BlackHole**
             */
            public Builder originRouteType(String originRouteType) {
                this.originRouteType = originRouteType;
                return this;
            }

            /**
             * The route priority.
             * <p>
             * 
             * A smaller value indicates a higher priority.
             */
            public Builder preference(Integer preference) {
                this.preference = preference;
                return this;
            }

            public PathAttributes build() {
                return new PathAttributes(this);
            } 

        } 

    }
    public static class TransitRouterRouteEntries extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("OperationalMode")
        private Boolean operationalMode;

        @NameInMap("PathAttributes")
        private PathAttributes pathAttributes;

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
            this.pathAttributes = builder.pathAttributes;
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
         * @return pathAttributes
         */
        public PathAttributes getPathAttributes() {
            return this.pathAttributes;
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
            private PathAttributes pathAttributes; 
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
             * *   **true**: The route can be managed. You can delete the route.
             * *   **false**: The route cannot be managed because it is automatically generated by the system.
             */
            public Builder operationalMode(Boolean operationalMode) {
                this.operationalMode = operationalMode;
                return this;
            }

            /**
             * The route attributes.
             */
            public Builder pathAttributes(PathAttributes pathAttributes) {
                this.pathAttributes = pathAttributes;
                return this;
            }

            /**
             * The prefix list ID.
             */
            public Builder prefixListId(String prefixListId) {
                this.prefixListId = prefixListId;
                return this;
            }

            /**
             * The route tag.
             * <p>
             * 
             * Only **PermitVbr** may be returned, which indicates that the route is advertised only to the route tables of the virtual border routers (VBRs) that are connected to the transit router.
             * 
             * >  This parameter is returned only for routes whose CIDR blocks are automatically generated by the system.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * The route description.
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
             * The route ID.
             * <p>
             * 
             * >  This parameter is returned only for static routes.
             */
            public Builder transitRouterRouteEntryId(String transitRouterRouteEntryId) {
                this.transitRouterRouteEntryId = transitRouterRouteEntryId;
                return this;
            }

            /**
             * The route name.
             * <p>
             * 
             * >  This parameter is returned only for static routes.
             */
            public Builder transitRouterRouteEntryName(String transitRouterRouteEntryName) {
                this.transitRouterRouteEntryName = transitRouterRouteEntryName;
                return this;
            }

            /**
             * The next hop ID. This parameter is not returned if the route is a blackhole route.
             */
            public Builder transitRouterRouteEntryNextHopId(String transitRouterRouteEntryNextHopId) {
                this.transitRouterRouteEntryNextHopId = transitRouterRouteEntryNextHopId;
                return this;
            }

            /**
             * The next hop ID.
             */
            public Builder transitRouterRouteEntryNextHopResourceId(String transitRouterRouteEntryNextHopResourceId) {
                this.transitRouterRouteEntryNextHopResourceId = transitRouterRouteEntryNextHopResourceId;
                return this;
            }

            /**
             * The next hop type. Valid values:
             * <p>
             * 
             * *   **VPC**
             * *   **VBR**
             * *   **TR**
             * *   **VPN**
             */
            public Builder transitRouterRouteEntryNextHopResourceType(String transitRouterRouteEntryNextHopResourceType) {
                this.transitRouterRouteEntryNextHopResourceType = transitRouterRouteEntryNextHopResourceType;
                return this;
            }

            /**
             * The next hop type. Valid values:
             * <p>
             * 
             * *   **BlackHole**: a blackhole route. Packets destined for the destination CIDR block of the route are dropped.
             * *   **Attachment**: a network instance connection. Packets destined for the destination CIDR block of the route are forwarded to the specified network instance connection.
             */
            public Builder transitRouterRouteEntryNextHopType(String transitRouterRouteEntryNextHopType) {
                this.transitRouterRouteEntryNextHopType = transitRouterRouteEntryNextHopType;
                return this;
            }

            /**
             * The source instance ID.
             */
            public Builder transitRouterRouteEntryOriginResourceId(String transitRouterRouteEntryOriginResourceId) {
                this.transitRouterRouteEntryOriginResourceId = transitRouterRouteEntryOriginResourceId;
                return this;
            }

            /**
             * The source instance type. Valid values:
             * <p>
             * 
             * *   **VPC**
             * *   **VBR**
             * *   **TR**
             * *   **VPN**
             */
            public Builder transitRouterRouteEntryOriginResourceType(String transitRouterRouteEntryOriginResourceType) {
                this.transitRouterRouteEntryOriginResourceType = transitRouterRouteEntryOriginResourceType;
                return this;
            }

            /**
             * The route status. Valid values:
             * <p>
             * 
             * *   **Active**
             * *   **Rejected**
             * *   **Prohibited**
             * *   **Standby**
             * *   **Candidate**
             * *   **Creating**
             * *   **Deleting**
             */
            public Builder transitRouterRouteEntryStatus(String transitRouterRouteEntryStatus) {
                this.transitRouterRouteEntryStatus = transitRouterRouteEntryStatus;
                return this;
            }

            /**
             * The type of the route. Valid values:
             * <p>
             * 
             * *   **Static**: static routes.
             * *   **Propagated**: automatically learned by the route table.
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
