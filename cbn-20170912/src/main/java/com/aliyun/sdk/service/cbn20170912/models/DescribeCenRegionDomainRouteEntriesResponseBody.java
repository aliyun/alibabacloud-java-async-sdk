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
 * {@link DescribeCenRegionDomainRouteEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCenRegionDomainRouteEntriesResponseBody</p>
 */
public class DescribeCenRegionDomainRouteEntriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CenRouteEntries")
    private CenRouteEntries cenRouteEntries;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeCenRegionDomainRouteEntriesResponseBody(Builder builder) {
        this.cenRouteEntries = builder.cenRouteEntries;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCenRegionDomainRouteEntriesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cenRouteEntries
     */
    public CenRouteEntries getCenRouteEntries() {
        return this.cenRouteEntries;
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
        private CenRouteEntries cenRouteEntries; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeCenRegionDomainRouteEntriesResponseBody model) {
            this.cenRouteEntries = model.cenRouteEntries;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>A list of route entries.</p>
         */
        public Builder cenRouteEntries(CenRouteEntries cenRouteEntries) {
            this.cenRouteEntries = cenRouteEntries;
            return this;
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>004E99FB-E996-5777-888E-BA1D8F215407</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCenRegionDomainRouteEntriesResponseBody build() {
            return new DescribeCenRegionDomainRouteEntriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCenRegionDomainRouteEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenRegionDomainRouteEntriesResponseBody</p>
     */
    public static class AsPaths extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsPath")
        private java.util.List<String> asPath;

        private AsPaths(Builder builder) {
            this.asPath = builder.asPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AsPaths create() {
            return builder().build();
        }

        /**
         * @return asPath
         */
        public java.util.List<String> getAsPath() {
            return this.asPath;
        }

        public static final class Builder {
            private java.util.List<String> asPath; 

            private Builder() {
            } 

            private Builder(AsPaths model) {
                this.asPath = model.asPath;
            } 

            /**
             * AsPath.
             */
            public Builder asPath(java.util.List<String> asPath) {
                this.asPath = asPath;
                return this;
            }

            public AsPaths build() {
                return new AsPaths(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCenRegionDomainRouteEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenRegionDomainRouteEntriesResponseBody</p>
     */
    public static class CenOutRouteMapRecord extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RouteMapId")
        private String routeMapId;

        private CenOutRouteMapRecord(Builder builder) {
            this.regionId = builder.regionId;
            this.routeMapId = builder.routeMapId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CenOutRouteMapRecord create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return routeMapId
         */
        public String getRouteMapId() {
            return this.routeMapId;
        }

        public static final class Builder {
            private String regionId; 
            private String routeMapId; 

            private Builder() {
            } 

            private Builder(CenOutRouteMapRecord model) {
                this.regionId = model.regionId;
                this.routeMapId = model.routeMapId;
            } 

            /**
             * <p>The ID of the region where the routing policy is applied.</p>
             * 
             * <strong>example:</strong>
             * <p>ccn-cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the routing policy.</p>
             * 
             * <strong>example:</strong>
             * <p>cenrmap-dbarzidzp7ek4k****</p>
             */
            public Builder routeMapId(String routeMapId) {
                this.routeMapId = routeMapId;
                return this;
            }

            public CenOutRouteMapRecord build() {
                return new CenOutRouteMapRecord(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCenRegionDomainRouteEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenRegionDomainRouteEntriesResponseBody</p>
     */
    public static class CenOutRouteMapRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CenOutRouteMapRecord")
        private java.util.List<CenOutRouteMapRecord> cenOutRouteMapRecord;

        private CenOutRouteMapRecords(Builder builder) {
            this.cenOutRouteMapRecord = builder.cenOutRouteMapRecord;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CenOutRouteMapRecords create() {
            return builder().build();
        }

        /**
         * @return cenOutRouteMapRecord
         */
        public java.util.List<CenOutRouteMapRecord> getCenOutRouteMapRecord() {
            return this.cenOutRouteMapRecord;
        }

        public static final class Builder {
            private java.util.List<CenOutRouteMapRecord> cenOutRouteMapRecord; 

            private Builder() {
            } 

            private Builder(CenOutRouteMapRecords model) {
                this.cenOutRouteMapRecord = model.cenOutRouteMapRecord;
            } 

            /**
             * CenOutRouteMapRecord.
             */
            public Builder cenOutRouteMapRecord(java.util.List<CenOutRouteMapRecord> cenOutRouteMapRecord) {
                this.cenOutRouteMapRecord = cenOutRouteMapRecord;
                return this;
            }

            public CenOutRouteMapRecords build() {
                return new CenOutRouteMapRecords(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCenRegionDomainRouteEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenRegionDomainRouteEntriesResponseBody</p>
     */
    public static class CenRouteMapRecord extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RouteMapId")
        private String routeMapId;

        private CenRouteMapRecord(Builder builder) {
            this.regionId = builder.regionId;
            this.routeMapId = builder.routeMapId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CenRouteMapRecord create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return routeMapId
         */
        public String getRouteMapId() {
            return this.routeMapId;
        }

        public static final class Builder {
            private String regionId; 
            private String routeMapId; 

            private Builder() {
            } 

            private Builder(CenRouteMapRecord model) {
                this.regionId = model.regionId;
                this.routeMapId = model.routeMapId;
            } 

            /**
             * <p>The ID of the region where the routing policy is applied.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the routing policy.</p>
             * 
             * <strong>example:</strong>
             * <p>cenrmap-cz5axczdxb7yfu****</p>
             */
            public Builder routeMapId(String routeMapId) {
                this.routeMapId = routeMapId;
                return this;
            }

            public CenRouteMapRecord build() {
                return new CenRouteMapRecord(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCenRegionDomainRouteEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenRegionDomainRouteEntriesResponseBody</p>
     */
    public static class CenRouteMapRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CenRouteMapRecord")
        private java.util.List<CenRouteMapRecord> cenRouteMapRecord;

        private CenRouteMapRecords(Builder builder) {
            this.cenRouteMapRecord = builder.cenRouteMapRecord;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CenRouteMapRecords create() {
            return builder().build();
        }

        /**
         * @return cenRouteMapRecord
         */
        public java.util.List<CenRouteMapRecord> getCenRouteMapRecord() {
            return this.cenRouteMapRecord;
        }

        public static final class Builder {
            private java.util.List<CenRouteMapRecord> cenRouteMapRecord; 

            private Builder() {
            } 

            private Builder(CenRouteMapRecords model) {
                this.cenRouteMapRecord = model.cenRouteMapRecord;
            } 

            /**
             * CenRouteMapRecord.
             */
            public Builder cenRouteMapRecord(java.util.List<CenRouteMapRecord> cenRouteMapRecord) {
                this.cenRouteMapRecord = cenRouteMapRecord;
                return this;
            }

            public CenRouteMapRecords build() {
                return new CenRouteMapRecords(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCenRegionDomainRouteEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenRegionDomainRouteEntriesResponseBody</p>
     */
    public static class Communities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Community")
        private java.util.List<String> community;

        private Communities(Builder builder) {
            this.community = builder.community;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Communities create() {
            return builder().build();
        }

        /**
         * @return community
         */
        public java.util.List<String> getCommunity() {
            return this.community;
        }

        public static final class Builder {
            private java.util.List<String> community; 

            private Builder() {
            } 

            private Builder(Communities model) {
                this.community = model.community;
            } 

            /**
             * Community.
             */
            public Builder community(java.util.List<String> community) {
                this.community = community;
                return this;
            }

            public Communities build() {
                return new Communities(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCenRegionDomainRouteEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenRegionDomainRouteEntriesResponseBody</p>
     */
    public static class CenRouteEntry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsPaths")
        private AsPaths asPaths;

        @com.aliyun.core.annotation.NameInMap("CenOutRouteMapRecords")
        private CenOutRouteMapRecords cenOutRouteMapRecords;

        @com.aliyun.core.annotation.NameInMap("CenRouteMapRecords")
        private CenRouteMapRecords cenRouteMapRecords;

        @com.aliyun.core.annotation.NameInMap("Communities")
        private Communities communities;

        @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @com.aliyun.core.annotation.NameInMap("NextHopInstanceId")
        private String nextHopInstanceId;

        @com.aliyun.core.annotation.NameInMap("NextHopRegionId")
        private String nextHopRegionId;

        @com.aliyun.core.annotation.NameInMap("NextHopType")
        private String nextHopType;

        @com.aliyun.core.annotation.NameInMap("Preference")
        private Integer preference;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("ToOtherRegionStatus")
        private String toOtherRegionStatus;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private CenRouteEntry(Builder builder) {
            this.asPaths = builder.asPaths;
            this.cenOutRouteMapRecords = builder.cenOutRouteMapRecords;
            this.cenRouteMapRecords = builder.cenRouteMapRecords;
            this.communities = builder.communities;
            this.destinationCidrBlock = builder.destinationCidrBlock;
            this.nextHopInstanceId = builder.nextHopInstanceId;
            this.nextHopRegionId = builder.nextHopRegionId;
            this.nextHopType = builder.nextHopType;
            this.preference = builder.preference;
            this.status = builder.status;
            this.toOtherRegionStatus = builder.toOtherRegionStatus;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CenRouteEntry create() {
            return builder().build();
        }

        /**
         * @return asPaths
         */
        public AsPaths getAsPaths() {
            return this.asPaths;
        }

        /**
         * @return cenOutRouteMapRecords
         */
        public CenOutRouteMapRecords getCenOutRouteMapRecords() {
            return this.cenOutRouteMapRecords;
        }

        /**
         * @return cenRouteMapRecords
         */
        public CenRouteMapRecords getCenRouteMapRecords() {
            return this.cenRouteMapRecords;
        }

        /**
         * @return communities
         */
        public Communities getCommunities() {
            return this.communities;
        }

        /**
         * @return destinationCidrBlock
         */
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        /**
         * @return nextHopInstanceId
         */
        public String getNextHopInstanceId() {
            return this.nextHopInstanceId;
        }

        /**
         * @return nextHopRegionId
         */
        public String getNextHopRegionId() {
            return this.nextHopRegionId;
        }

        /**
         * @return nextHopType
         */
        public String getNextHopType() {
            return this.nextHopType;
        }

        /**
         * @return preference
         */
        public Integer getPreference() {
            return this.preference;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return toOtherRegionStatus
         */
        public String getToOtherRegionStatus() {
            return this.toOtherRegionStatus;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private AsPaths asPaths; 
            private CenOutRouteMapRecords cenOutRouteMapRecords; 
            private CenRouteMapRecords cenRouteMapRecords; 
            private Communities communities; 
            private String destinationCidrBlock; 
            private String nextHopInstanceId; 
            private String nextHopRegionId; 
            private String nextHopType; 
            private Integer preference; 
            private String status; 
            private String toOtherRegionStatus; 
            private String type; 

            private Builder() {
            } 

            private Builder(CenRouteEntry model) {
                this.asPaths = model.asPaths;
                this.cenOutRouteMapRecords = model.cenOutRouteMapRecords;
                this.cenRouteMapRecords = model.cenRouteMapRecords;
                this.communities = model.communities;
                this.destinationCidrBlock = model.destinationCidrBlock;
                this.nextHopInstanceId = model.nextHopInstanceId;
                this.nextHopRegionId = model.nextHopRegionId;
                this.nextHopType = model.nextHopType;
                this.preference = model.preference;
                this.status = model.status;
                this.toOtherRegionStatus = model.toOtherRegionStatus;
                this.type = model.type;
            } 

            /**
             * <p>The AS paths of the route.</p>
             */
            public Builder asPaths(AsPaths asPaths) {
                this.asPaths = asPaths;
                return this;
            }

            /**
             * <p>The routing policy that the routes match in the outbound direction.</p>
             */
            public Builder cenOutRouteMapRecords(CenOutRouteMapRecords cenOutRouteMapRecords) {
                this.cenOutRouteMapRecords = cenOutRouteMapRecords;
                return this;
            }

            /**
             * <p>The routing policy that the routes match in the inbound direction.</p>
             */
            public Builder cenRouteMapRecords(CenRouteMapRecords cenRouteMapRecords) {
                this.cenRouteMapRecords = cenRouteMapRecords;
                return this;
            }

            /**
             * <p>The communities of the route.</p>
             */
            public Builder communities(Communities communities) {
                this.communities = communities;
                return this;
            }

            /**
             * <p>The destination CIDR block of the route.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.0/24</p>
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * <p>The ID of the instance specified as the next hop in the route.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1j8728mm6pweeod****</p>
             */
            public Builder nextHopInstanceId(String nextHopInstanceId) {
                this.nextHopInstanceId = nextHopInstanceId;
                return this;
            }

            /**
             * <p>The ID of the region to which the network instance specified as the next hop in the route belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder nextHopRegionId(String nextHopRegionId) {
                this.nextHopRegionId = nextHopRegionId;
                return this;
            }

            /**
             * <p>The type of the instance specified as the next hop in the route. Valid values:</p>
             * <ul>
             * <li><strong>VPC</strong>: virtual private cloud (VPC)</li>
             * <li><strong>VBR</strong>: virtual border router (VBR)</li>
             * <li><strong>CCN</strong>: Cloud Connect Network (CCN) instance</li>
             * <li><strong>local_service</strong>: system route. No next hop is specified.</li>
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

            /**
             * <p>The route status. Valid values:</p>
             * <ul>
             * <li><strong>Active</strong>: available</li>
             * <li><strong>Candidate</strong>: standby</li>
             * <li><strong>Rejected</strong>: rejected</li>
             * <li><strong>Prohibited</strong>: prohibited</li>
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
             * <p>Indicates whether the route can be advertised to other regions. Valid values:</p>
             * <ul>
             * <li><strong>Active</strong>: The route can be advertised to other regions.</li>
             * <li><strong>Prohibited</strong>: The route cannot be advertised to other regions.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder toOtherRegionStatus(String toOtherRegionStatus) {
                this.toOtherRegionStatus = toOtherRegionStatus;
                return this;
            }

            /**
             * <p>The route type. Valid values:</p>
             * <ul>
             * <li><strong>CEN</strong>: route that is advertised through CEN</li>
             * <li><strong>Custom</strong>: custom route</li>
             * <li><strong>System</strong>: system route</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CEN</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public CenRouteEntry build() {
                return new CenRouteEntry(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCenRegionDomainRouteEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenRegionDomainRouteEntriesResponseBody</p>
     */
    public static class CenRouteEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CenRouteEntry")
        private java.util.List<CenRouteEntry> cenRouteEntry;

        private CenRouteEntries(Builder builder) {
            this.cenRouteEntry = builder.cenRouteEntry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CenRouteEntries create() {
            return builder().build();
        }

        /**
         * @return cenRouteEntry
         */
        public java.util.List<CenRouteEntry> getCenRouteEntry() {
            return this.cenRouteEntry;
        }

        public static final class Builder {
            private java.util.List<CenRouteEntry> cenRouteEntry; 

            private Builder() {
            } 

            private Builder(CenRouteEntries model) {
                this.cenRouteEntry = model.cenRouteEntry;
            } 

            /**
             * CenRouteEntry.
             */
            public Builder cenRouteEntry(java.util.List<CenRouteEntry> cenRouteEntry) {
                this.cenRouteEntry = cenRouteEntry;
                return this;
            }

            public CenRouteEntries build() {
                return new CenRouteEntries(this);
            } 

        } 

    }
}
