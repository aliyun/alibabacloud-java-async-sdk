// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeCenRegionDomainRouteEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCenRegionDomainRouteEntriesResponseBody</p>
 */
public class DescribeCenRegionDomainRouteEntriesResponseBody extends TeaModel {
    @NameInMap("CenRouteEntries")
    private CenRouteEntries cenRouteEntries;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

        /**
         * <p>CenRouteEntries.</p>
         */
        public Builder cenRouteEntries(CenRouteEntries cenRouteEntries) {
            this.cenRouteEntries = cenRouteEntries;
            return this;
        }

        /**
         * <p>PageNumber.</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>PageSize.</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>TotalCount.</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCenRegionDomainRouteEntriesResponseBody build() {
            return new DescribeCenRegionDomainRouteEntriesResponseBody(this);
        } 

    } 

    public static class AsPaths extends TeaModel {
        @NameInMap("AsPath")
        private java.util.List < String > asPath;


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
        public java.util.List < String > getAsPath() {
            return this.asPath;
        }

        public static final class Builder {
            private java.util.List < String > asPath; 

            /**
             * <p>AsPath.</p>
             */
            public Builder asPath(java.util.List < String > asPath) {
                this.asPath = asPath;
                return this;
            }

            public AsPaths build() {
                return new AsPaths(this);
            } 

        } 

    }
    public static class CenOutRouteMapRecord extends TeaModel {
        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RouteMapId")
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

            /**
             * <p>RegionId.</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>RouteMapId.</p>
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
    public static class CenOutRouteMapRecords extends TeaModel {
        @NameInMap("CenOutRouteMapRecord")
        private java.util.List < CenOutRouteMapRecord> cenOutRouteMapRecord;


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
        public java.util.List < CenOutRouteMapRecord> getCenOutRouteMapRecord() {
            return this.cenOutRouteMapRecord;
        }

        public static final class Builder {
            private java.util.List < CenOutRouteMapRecord> cenOutRouteMapRecord; 

            /**
             * <p>CenOutRouteMapRecord.</p>
             */
            public Builder cenOutRouteMapRecord(java.util.List < CenOutRouteMapRecord> cenOutRouteMapRecord) {
                this.cenOutRouteMapRecord = cenOutRouteMapRecord;
                return this;
            }

            public CenOutRouteMapRecords build() {
                return new CenOutRouteMapRecords(this);
            } 

        } 

    }
    public static class CenRouteMapRecord extends TeaModel {
        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RouteMapId")
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

            /**
             * <p>RegionId.</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>RouteMapId.</p>
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
    public static class CenRouteMapRecords extends TeaModel {
        @NameInMap("CenRouteMapRecord")
        private java.util.List < CenRouteMapRecord> cenRouteMapRecord;


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
        public java.util.List < CenRouteMapRecord> getCenRouteMapRecord() {
            return this.cenRouteMapRecord;
        }

        public static final class Builder {
            private java.util.List < CenRouteMapRecord> cenRouteMapRecord; 

            /**
             * <p>CenRouteMapRecord.</p>
             */
            public Builder cenRouteMapRecord(java.util.List < CenRouteMapRecord> cenRouteMapRecord) {
                this.cenRouteMapRecord = cenRouteMapRecord;
                return this;
            }

            public CenRouteMapRecords build() {
                return new CenRouteMapRecords(this);
            } 

        } 

    }
    public static class Communities extends TeaModel {
        @NameInMap("Community")
        private java.util.List < String > community;


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
        public java.util.List < String > getCommunity() {
            return this.community;
        }

        public static final class Builder {
            private java.util.List < String > community; 

            /**
             * <p>Community.</p>
             */
            public Builder community(java.util.List < String > community) {
                this.community = community;
                return this;
            }

            public Communities build() {
                return new Communities(this);
            } 

        } 

    }
    public static class CenRouteEntry extends TeaModel {
        @NameInMap("AsPaths")
        private AsPaths asPaths;

        @NameInMap("CenOutRouteMapRecords")
        private CenOutRouteMapRecords cenOutRouteMapRecords;

        @NameInMap("CenRouteMapRecords")
        private CenRouteMapRecords cenRouteMapRecords;

        @NameInMap("Communities")
        private Communities communities;

        @NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @NameInMap("NextHopInstanceId")
        private String nextHopInstanceId;

        @NameInMap("NextHopRegionId")
        private String nextHopRegionId;

        @NameInMap("NextHopType")
        private String nextHopType;

        @NameInMap("Preference")
        private Integer preference;

        @NameInMap("Status")
        private String status;

        @NameInMap("ToOtherRegionStatus")
        private String toOtherRegionStatus;

        @NameInMap("Type")
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

            /**
             * <p>AsPaths.</p>
             */
            public Builder asPaths(AsPaths asPaths) {
                this.asPaths = asPaths;
                return this;
            }

            /**
             * <p>CenOutRouteMapRecords.</p>
             */
            public Builder cenOutRouteMapRecords(CenOutRouteMapRecords cenOutRouteMapRecords) {
                this.cenOutRouteMapRecords = cenOutRouteMapRecords;
                return this;
            }

            /**
             * <p>CenRouteMapRecords.</p>
             */
            public Builder cenRouteMapRecords(CenRouteMapRecords cenRouteMapRecords) {
                this.cenRouteMapRecords = cenRouteMapRecords;
                return this;
            }

            /**
             * <p>Communities.</p>
             */
            public Builder communities(Communities communities) {
                this.communities = communities;
                return this;
            }

            /**
             * <p>DestinationCidrBlock.</p>
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * <p>NextHopInstanceId.</p>
             */
            public Builder nextHopInstanceId(String nextHopInstanceId) {
                this.nextHopInstanceId = nextHopInstanceId;
                return this;
            }

            /**
             * <p>NextHopRegionId.</p>
             */
            public Builder nextHopRegionId(String nextHopRegionId) {
                this.nextHopRegionId = nextHopRegionId;
                return this;
            }

            /**
             * <p>NextHopType.</p>
             */
            public Builder nextHopType(String nextHopType) {
                this.nextHopType = nextHopType;
                return this;
            }

            /**
             * <p>Preference.</p>
             */
            public Builder preference(Integer preference) {
                this.preference = preference;
                return this;
            }

            /**
             * <p>Status.</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>ToOtherRegionStatus.</p>
             */
            public Builder toOtherRegionStatus(String toOtherRegionStatus) {
                this.toOtherRegionStatus = toOtherRegionStatus;
                return this;
            }

            /**
             * <p>Type.</p>
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
    public static class CenRouteEntries extends TeaModel {
        @NameInMap("CenRouteEntry")
        private java.util.List < CenRouteEntry> cenRouteEntry;


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
        public java.util.List < CenRouteEntry> getCenRouteEntry() {
            return this.cenRouteEntry;
        }

        public static final class Builder {
            private java.util.List < CenRouteEntry> cenRouteEntry; 

            /**
             * <p>CenRouteEntry.</p>
             */
            public Builder cenRouteEntry(java.util.List < CenRouteEntry> cenRouteEntry) {
                this.cenRouteEntry = cenRouteEntry;
                return this;
            }

            public CenRouteEntries build() {
                return new CenRouteEntries(this);
            } 

        } 

    }
}
