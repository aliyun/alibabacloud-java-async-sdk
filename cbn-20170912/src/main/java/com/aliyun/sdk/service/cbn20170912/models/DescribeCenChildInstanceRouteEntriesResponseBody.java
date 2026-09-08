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
 * {@link DescribeCenChildInstanceRouteEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCenChildInstanceRouteEntriesResponseBody</p>
 */
public class DescribeCenChildInstanceRouteEntriesResponseBody extends TeaModel {
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

    private DescribeCenChildInstanceRouteEntriesResponseBody(Builder builder) {
        this.cenRouteEntries = builder.cenRouteEntries;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCenChildInstanceRouteEntriesResponseBody create() {
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

        private Builder(DescribeCenChildInstanceRouteEntriesResponseBody model) {
            this.cenRouteEntries = model.cenRouteEntries;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * CenRouteEntries.
         */
        public Builder cenRouteEntries(CenRouteEntries cenRouteEntries) {
            this.cenRouteEntries = cenRouteEntries;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page for paging queries.</p>
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
         * <p>17A57456-EF48-419D-9AE6-9B03D9996018</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCenChildInstanceRouteEntriesResponseBody build() {
            return new DescribeCenChildInstanceRouteEntriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCenChildInstanceRouteEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenChildInstanceRouteEntriesResponseBody</p>
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
     * {@link DescribeCenChildInstanceRouteEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenChildInstanceRouteEntriesResponseBody</p>
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
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * RouteMapId.
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
     * {@link DescribeCenChildInstanceRouteEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenChildInstanceRouteEntriesResponseBody</p>
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
     * {@link DescribeCenChildInstanceRouteEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenChildInstanceRouteEntriesResponseBody</p>
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
     * {@link DescribeCenChildInstanceRouteEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenChildInstanceRouteEntriesResponseBody</p>
     */
    public static class Conflict extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Conflict(Builder builder) {
            this.destinationCidrBlock = builder.destinationCidrBlock;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.regionId = builder.regionId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conflict create() {
            return builder().build();
        }

        /**
         * @return destinationCidrBlock
         */
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String destinationCidrBlock; 
            private String instanceId; 
            private String instanceType; 
            private String regionId; 
            private String status; 

            private Builder() {
            } 

            private Builder(Conflict model) {
                this.destinationCidrBlock = model.destinationCidrBlock;
                this.instanceId = model.instanceId;
                this.instanceType = model.instanceType;
                this.regionId = model.regionId;
                this.status = model.status;
            } 

            /**
             * DestinationCidrBlock.
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Conflict build() {
                return new Conflict(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCenChildInstanceRouteEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenChildInstanceRouteEntriesResponseBody</p>
     */
    public static class Conflicts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Conflict")
        private java.util.List<Conflict> conflict;

        private Conflicts(Builder builder) {
            this.conflict = builder.conflict;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conflicts create() {
            return builder().build();
        }

        /**
         * @return conflict
         */
        public java.util.List<Conflict> getConflict() {
            return this.conflict;
        }

        public static final class Builder {
            private java.util.List<Conflict> conflict; 

            private Builder() {
            } 

            private Builder(Conflicts model) {
                this.conflict = model.conflict;
            } 

            /**
             * Conflict.
             */
            public Builder conflict(java.util.List<Conflict> conflict) {
                this.conflict = conflict;
                return this;
            }

            public Conflicts build() {
                return new Conflicts(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCenChildInstanceRouteEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenChildInstanceRouteEntriesResponseBody</p>
     */
    public static class CenRouteEntry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsPaths")
        private AsPaths asPaths;

        @com.aliyun.core.annotation.NameInMap("CenRouteMapRecords")
        private CenRouteMapRecords cenRouteMapRecords;

        @com.aliyun.core.annotation.NameInMap("Communities")
        private Communities communities;

        @com.aliyun.core.annotation.NameInMap("Conflicts")
        private Conflicts conflicts;

        @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @com.aliyun.core.annotation.NameInMap("NextHopInstanceId")
        private String nextHopInstanceId;

        @com.aliyun.core.annotation.NameInMap("NextHopRegionId")
        private String nextHopRegionId;

        @com.aliyun.core.annotation.NameInMap("NextHopType")
        private String nextHopType;

        @com.aliyun.core.annotation.NameInMap("OperationalMode")
        private Boolean operationalMode;

        @com.aliyun.core.annotation.NameInMap("PublishStatus")
        private String publishStatus;

        @com.aliyun.core.annotation.NameInMap("RouteTableId")
        private String routeTableId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private CenRouteEntry(Builder builder) {
            this.asPaths = builder.asPaths;
            this.cenRouteMapRecords = builder.cenRouteMapRecords;
            this.communities = builder.communities;
            this.conflicts = builder.conflicts;
            this.destinationCidrBlock = builder.destinationCidrBlock;
            this.nextHopInstanceId = builder.nextHopInstanceId;
            this.nextHopRegionId = builder.nextHopRegionId;
            this.nextHopType = builder.nextHopType;
            this.operationalMode = builder.operationalMode;
            this.publishStatus = builder.publishStatus;
            this.routeTableId = builder.routeTableId;
            this.status = builder.status;
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
         * @return conflicts
         */
        public Conflicts getConflicts() {
            return this.conflicts;
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
         * @return operationalMode
         */
        public Boolean getOperationalMode() {
            return this.operationalMode;
        }

        /**
         * @return publishStatus
         */
        public String getPublishStatus() {
            return this.publishStatus;
        }

        /**
         * @return routeTableId
         */
        public String getRouteTableId() {
            return this.routeTableId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private AsPaths asPaths; 
            private CenRouteMapRecords cenRouteMapRecords; 
            private Communities communities; 
            private Conflicts conflicts; 
            private String destinationCidrBlock; 
            private String nextHopInstanceId; 
            private String nextHopRegionId; 
            private String nextHopType; 
            private Boolean operationalMode; 
            private String publishStatus; 
            private String routeTableId; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(CenRouteEntry model) {
                this.asPaths = model.asPaths;
                this.cenRouteMapRecords = model.cenRouteMapRecords;
                this.communities = model.communities;
                this.conflicts = model.conflicts;
                this.destinationCidrBlock = model.destinationCidrBlock;
                this.nextHopInstanceId = model.nextHopInstanceId;
                this.nextHopRegionId = model.nextHopRegionId;
                this.nextHopType = model.nextHopType;
                this.operationalMode = model.operationalMode;
                this.publishStatus = model.publishStatus;
                this.routeTableId = model.routeTableId;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * AsPaths.
             */
            public Builder asPaths(AsPaths asPaths) {
                this.asPaths = asPaths;
                return this;
            }

            /**
             * CenRouteMapRecords.
             */
            public Builder cenRouteMapRecords(CenRouteMapRecords cenRouteMapRecords) {
                this.cenRouteMapRecords = cenRouteMapRecords;
                return this;
            }

            /**
             * Communities.
             */
            public Builder communities(Communities communities) {
                this.communities = communities;
                return this;
            }

            /**
             * Conflicts.
             */
            public Builder conflicts(Conflicts conflicts) {
                this.conflicts = conflicts;
                return this;
            }

            /**
             * DestinationCidrBlock.
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * NextHopInstanceId.
             */
            public Builder nextHopInstanceId(String nextHopInstanceId) {
                this.nextHopInstanceId = nextHopInstanceId;
                return this;
            }

            /**
             * NextHopRegionId.
             */
            public Builder nextHopRegionId(String nextHopRegionId) {
                this.nextHopRegionId = nextHopRegionId;
                return this;
            }

            /**
             * NextHopType.
             */
            public Builder nextHopType(String nextHopType) {
                this.nextHopType = nextHopType;
                return this;
            }

            /**
             * OperationalMode.
             */
            public Builder operationalMode(Boolean operationalMode) {
                this.operationalMode = operationalMode;
                return this;
            }

            /**
             * PublishStatus.
             */
            public Builder publishStatus(String publishStatus) {
                this.publishStatus = publishStatus;
                return this;
            }

            /**
             * RouteTableId.
             */
            public Builder routeTableId(String routeTableId) {
                this.routeTableId = routeTableId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
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
     * {@link DescribeCenChildInstanceRouteEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenChildInstanceRouteEntriesResponseBody</p>
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
