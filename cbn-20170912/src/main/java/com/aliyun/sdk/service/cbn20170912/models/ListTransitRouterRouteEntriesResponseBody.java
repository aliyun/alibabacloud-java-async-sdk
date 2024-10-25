// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListTransitRouterRouteEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTransitRouterRouteEntriesResponseBody</p>
 */
public class ListTransitRouterRouteEntriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TransitRouterRouteEntries")
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
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
         * <li>If a value is returned for <strong>NextToken</strong>, the value is the token that determines the start point of the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>fce19****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C3835E5E-1504-4344-B1BB-98A4110F1079</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>A list of route entries.</p>
         */
        public Builder transitRouterRouteEntries(java.util.List < TransitRouterRouteEntries> transitRouterRouteEntries) {
            this.transitRouterRouteEntries = transitRouterRouteEntries;
            return this;
        }

        public ListTransitRouterRouteEntriesResponseBody build() {
            return new ListTransitRouterRouteEntriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTransitRouterRouteEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTransitRouterRouteEntriesResponseBody</p>
     */
    public static class PathAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsPaths")
        private java.util.List < String > asPaths;

        @com.aliyun.core.annotation.NameInMap("Communities")
        private java.util.List < String > communities;

        @com.aliyun.core.annotation.NameInMap("OriginInstanceId")
        private String originInstanceId;

        @com.aliyun.core.annotation.NameInMap("OriginInstanceType")
        private String originInstanceType;

        @com.aliyun.core.annotation.NameInMap("OriginRouteType")
        private String originRouteType;

        @com.aliyun.core.annotation.NameInMap("Preference")
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
             * <p>The route AS path.</p>
             */
            public Builder asPaths(java.util.List < String > asPaths) {
                this.asPaths = asPaths;
                return this;
            }

            /**
             * <p>The route community.</p>
             */
            public Builder communities(java.util.List < String > communities) {
                this.communities = communities;
                return this;
            }

            /**
             * <p>The source instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vbr-m5ent6du8deaq5*****</p>
             */
            public Builder originInstanceId(String originInstanceId) {
                this.originInstanceId = originInstanceId;
                return this;
            }

            /**
             * <p>The source instance type. Valid values:</p>
             * <ul>
             * <li><strong>VPC</strong></li>
             * <li><strong>VBR</strong></li>
             * <li><strong>TR</strong></li>
             * <li><strong>VPN</strong></li>
             * <li><strong>CCN</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VBR</p>
             */
            public Builder originInstanceType(String originInstanceType) {
                this.originInstanceType = originInstanceType;
                return this;
            }

            /**
             * <p>The route type. Valid values:</p>
             * <ul>
             * <li><strong>System</strong></li>
             * <li><strong>Custom</strong></li>
             * <li><strong>static</strong></li>
             * <li><strong>BGP</strong></li>
             * <li><strong>BlackHole</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BGP</p>
             */
            public Builder originRouteType(String originRouteType) {
                this.originRouteType = originRouteType;
                return this;
            }

            /**
             * <p>The route priority.</p>
             * <p>A smaller value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
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
    /**
     * 
     * {@link ListTransitRouterRouteEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTransitRouterRouteEntriesResponseBody</p>
     */
    public static class TransitRouterRouteEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("OperationalMode")
        private Boolean operationalMode;

        @com.aliyun.core.annotation.NameInMap("PathAttributes")
        private PathAttributes pathAttributes;

        @com.aliyun.core.annotation.NameInMap("PrefixListId")
        private String prefixListId;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("TransitRouterRouteEntryDescription")
        private String transitRouterRouteEntryDescription;

        @com.aliyun.core.annotation.NameInMap("TransitRouterRouteEntryDestinationCidrBlock")
        private String transitRouterRouteEntryDestinationCidrBlock;

        @com.aliyun.core.annotation.NameInMap("TransitRouterRouteEntryId")
        private String transitRouterRouteEntryId;

        @com.aliyun.core.annotation.NameInMap("TransitRouterRouteEntryName")
        private String transitRouterRouteEntryName;

        @com.aliyun.core.annotation.NameInMap("TransitRouterRouteEntryNextHopId")
        private String transitRouterRouteEntryNextHopId;

        @com.aliyun.core.annotation.NameInMap("TransitRouterRouteEntryNextHopResourceId")
        private String transitRouterRouteEntryNextHopResourceId;

        @com.aliyun.core.annotation.NameInMap("TransitRouterRouteEntryNextHopResourceType")
        private String transitRouterRouteEntryNextHopResourceType;

        @com.aliyun.core.annotation.NameInMap("TransitRouterRouteEntryNextHopType")
        private String transitRouterRouteEntryNextHopType;

        @com.aliyun.core.annotation.NameInMap("TransitRouterRouteEntryOriginResourceId")
        private String transitRouterRouteEntryOriginResourceId;

        @com.aliyun.core.annotation.NameInMap("TransitRouterRouteEntryOriginResourceType")
        private String transitRouterRouteEntryOriginResourceType;

        @com.aliyun.core.annotation.NameInMap("TransitRouterRouteEntryStatus")
        private String transitRouterRouteEntryStatus;

        @com.aliyun.core.annotation.NameInMap("TransitRouterRouteEntryType")
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
             * <p>The time when the route entry was created.</p>
             * <p>The time follows the ISO8601 standard in the YYYY-MM-DDThh:mmZ format. The time is displayed in UTC.</p>
             * <blockquote>
             * <p> This parameter is returned only for static routes.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2021-06-15T07:01Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Indicates whether the route can be managed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The route can be managed. You can delete the route.</li>
             * <li><strong>false</strong>: The route cannot be managed because it is automatically generated by the system.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder operationalMode(Boolean operationalMode) {
                this.operationalMode = operationalMode;
                return this;
            }

            /**
             * <p>The route attributes.</p>
             */
            public Builder pathAttributes(PathAttributes pathAttributes) {
                this.pathAttributes = pathAttributes;
                return this;
            }

            /**
             * <p>The prefix list ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pl-k1ainl66z3527773d****</p>
             */
            public Builder prefixListId(String prefixListId) {
                this.prefixListId = prefixListId;
                return this;
            }

            /**
             * <p>The route tag.</p>
             * <p>Only <strong>PermitVbr</strong> may be returned, which indicates that the route is advertised only to the route tables of the virtual border routers (VBRs) that are connected to the transit router.</p>
             * <blockquote>
             * <p> This parameter is returned only for routes whose CIDR blocks are automatically generated by the system.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>PermitVbr</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The route description.</p>
             * <blockquote>
             * <p> This parameter is returned only for static routes.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>CidrRoute</p>
             */
            public Builder transitRouterRouteEntryDescription(String transitRouterRouteEntryDescription) {
                this.transitRouterRouteEntryDescription = transitRouterRouteEntryDescription;
                return this;
            }

            /**
             * <p>The destination CIDR block of the route entry. An IPv4 or IPv6 CIDR block is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.0/24</p>
             */
            public Builder transitRouterRouteEntryDestinationCidrBlock(String transitRouterRouteEntryDestinationCidrBlock) {
                this.transitRouterRouteEntryDestinationCidrBlock = transitRouterRouteEntryDestinationCidrBlock;
                return this;
            }

            /**
             * <p>The route ID.</p>
             * <blockquote>
             * <p> This parameter is returned only for static routes.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>rte-oklkgwmj97z6dn****</p>
             */
            public Builder transitRouterRouteEntryId(String transitRouterRouteEntryId) {
                this.transitRouterRouteEntryId = transitRouterRouteEntryId;
                return this;
            }

            /**
             * <p>The route name.</p>
             * <blockquote>
             * <p> This parameter is returned only for static routes.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>testname</p>
             */
            public Builder transitRouterRouteEntryName(String transitRouterRouteEntryName) {
                this.transitRouterRouteEntryName = transitRouterRouteEntryName;
                return this;
            }

            /**
             * <p>The next hop ID. This parameter is not returned if the route is a blackhole route.</p>
             * 
             * <strong>example:</strong>
             * <p>tr-attach-vx6iwhjr1x1j78****</p>
             */
            public Builder transitRouterRouteEntryNextHopId(String transitRouterRouteEntryNextHopId) {
                this.transitRouterRouteEntryNextHopId = transitRouterRouteEntryNextHopId;
                return this;
            }

            /**
             * <p>The next hop ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-m5ent6du8deaq5*****</p>
             */
            public Builder transitRouterRouteEntryNextHopResourceId(String transitRouterRouteEntryNextHopResourceId) {
                this.transitRouterRouteEntryNextHopResourceId = transitRouterRouteEntryNextHopResourceId;
                return this;
            }

            /**
             * <p>The next hop type. Valid values:</p>
             * <ul>
             * <li><strong>VPC</strong></li>
             * <li><strong>VBR</strong></li>
             * <li><strong>TR</strong></li>
             * <li><strong>VPN</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder transitRouterRouteEntryNextHopResourceType(String transitRouterRouteEntryNextHopResourceType) {
                this.transitRouterRouteEntryNextHopResourceType = transitRouterRouteEntryNextHopResourceType;
                return this;
            }

            /**
             * <p>The next hop type. Valid values:</p>
             * <ul>
             * <li><strong>BlackHole</strong>: a blackhole route. Packets destined for the destination CIDR block of the route are dropped.</li>
             * <li><strong>Attachment</strong>: a network instance connection. Packets destined for the destination CIDR block of the route are forwarded to the specified network instance connection.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BlackHole</p>
             */
            public Builder transitRouterRouteEntryNextHopType(String transitRouterRouteEntryNextHopType) {
                this.transitRouterRouteEntryNextHopType = transitRouterRouteEntryNextHopType;
                return this;
            }

            /**
             * <p>The source instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-m5ent6du8deaq5*****</p>
             */
            public Builder transitRouterRouteEntryOriginResourceId(String transitRouterRouteEntryOriginResourceId) {
                this.transitRouterRouteEntryOriginResourceId = transitRouterRouteEntryOriginResourceId;
                return this;
            }

            /**
             * <p>The source instance type. Valid values:</p>
             * <ul>
             * <li><strong>VPC</strong></li>
             * <li><strong>VBR</strong></li>
             * <li><strong>TR</strong></li>
             * <li><strong>VPN</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder transitRouterRouteEntryOriginResourceType(String transitRouterRouteEntryOriginResourceType) {
                this.transitRouterRouteEntryOriginResourceType = transitRouterRouteEntryOriginResourceType;
                return this;
            }

            /**
             * <p>The route status. Valid values:</p>
             * <ul>
             * <li><strong>Active</strong></li>
             * <li><strong>Rejected</strong></li>
             * <li><strong>Prohibited</strong></li>
             * <li><strong>Standby</strong></li>
             * <li><strong>Candidate</strong></li>
             * <li><strong>Creating</strong></li>
             * <li><strong>Deleting</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder transitRouterRouteEntryStatus(String transitRouterRouteEntryStatus) {
                this.transitRouterRouteEntryStatus = transitRouterRouteEntryStatus;
                return this;
            }

            /**
             * <p>The type of the route. Valid values:</p>
             * <ul>
             * <li><strong>Static</strong>: static routes.</li>
             * <li><strong>Propagated</strong>: automatically learned by the route table.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Static</p>
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
