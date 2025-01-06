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
         * <p>The information about the route.</p>
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>17A57456-EF48-419D-9AE6-9B03D9996018</p>
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

            /**
             * <p>The region ID of the routing policy.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The routing policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cenrmap-w4yf7toozfol3q****</p>
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

            /**
             * <p>The destination CIDR block of the overlapping route.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.0/24</p>
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * <p>The ID of the peer network instance on which the overlapping routes are found.</p>
             * 
             * <strong>example:</strong>
             * <p>ccn-0q3b7oviikmm9h****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The type of the peer network instance on which the overlapping routes are found. Valid values:</p>
             * <ul>
             * <li><strong>VPC</strong>: VPC</li>
             * <li><strong>VBR</strong>: VBR</li>
             * <li><strong>CCN</strong>: CCN instance</li>
             * <li><strong>ECR</strong>: ECR</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CCN</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The region ID of the peer network instance on which the overlapping routes are found.</p>
             * 
             * <strong>example:</strong>
             * <p>ccn-cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The cause of the route error. Valid values:</p>
             * <ul>
             * <li><strong>conflict</strong>: The routes have the same destination CIDR block.</li>
             * <li><strong>overflow</strong>: The number of routes in the route table configured on another network instance has reached the upper limit.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>conflict</p>
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

            /**
             * <p>The AS paths of the routes.</p>
             */
            public Builder asPaths(AsPaths asPaths) {
                this.asPaths = asPaths;
                return this;
            }

            /**
             * <p>The routing policy that the routes match.</p>
             */
            public Builder cenRouteMapRecords(CenRouteMapRecords cenRouteMapRecords) {
                this.cenRouteMapRecords = cenRouteMapRecords;
                return this;
            }

            /**
             * <p>The community attributes of the route entries.</p>
             */
            public Builder communities(Communities communities) {
                this.communities = communities;
                return this;
            }

            /**
             * <p>A list of overlapping routes.</p>
             */
            public Builder conflicts(Conflicts conflicts) {
                this.conflicts = conflicts;
                return this;
            }

            /**
             * <p>The destination CIDR block of the route.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/24</p>
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * <p>The ID of the instance specified as the next hop in the route.</p>
             * 
             * <strong>example:</strong>
             * <p>vbr-bp13gtbhdp0pfqg6s****</p>
             */
            public Builder nextHopInstanceId(String nextHopInstanceId) {
                this.nextHopInstanceId = nextHopInstanceId;
                return this;
            }

            /**
             * <p>The region ID of the instance specified as the next hop in the route.</p>
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
             * <li><strong>Instance</strong>: an ECS instance</li>
             * <li><strong>HaVip</strong>: an HAVIP</li>
             * <li><strong>RouterInterface</strong>: a router interface</li>
             * <li><strong>NetworkInterface</strong>: an ENI</li>
             * <li><strong>VpnGateway</strong>: a VPN gateway</li>
             * <li><strong>IPv6Gateway</strong>: an IPv6 gateway</li>
             * <li><strong>Ipv4Gateway</strong>: an IPv4 gateway</li>
             * <li><strong>NatGateway</strong>: a NAT gateway</li>
             * <li><strong>Attachment</strong>: a network instance connection</li>
             * <li><strong>service</strong>: a cloud service</li>
             * <li><strong>VBR</strong>: a VBR</li>
             * <li><strong>CCN</strong>: a CCN instance</li>
             * <li><strong>VPC</strong>: a VPC</li>
             * <li><strong>local</strong>: a system route (no next hop is specified)</li>
             * <li><strong>TR</strong>: a transit router</li>
             * <li><strong>BlackHole</strong>: a blackhole route (no next hop is specified)</li>
             * <li><strong>EcRouterInterface</strong>: a router interface for Express Connect</li>
             * <li><strong>HealthCheck</strong>: a health check</li>
             * <li><strong>AS</strong>: an access gateway for CCN</li>
             * <li><strong>classic</strong>: a classic network-type instance</li>
             * <li><strong>GatewayEndpoint</strong>: a gateway endpoint</li>
             * <li><strong>CPE</strong>: a data center connected to a VBR</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VBR</p>
             */
            public Builder nextHopType(String nextHopType) {
                this.nextHopType = nextHopType;
                return this;
            }

            /**
             * <p>Indicates whether the route is allowed to be advertised to or withdrawn from the CEN instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder operationalMode(Boolean operationalMode) {
                this.operationalMode = operationalMode;
                return this;
            }

            /**
             * <p>Indicates whether the route is advertised to the CEN instance. Valid values:</p>
             * <ul>
             * <li><strong>Published</strong></li>
             * <li><strong>NonPublished</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Published</p>
             */
            public Builder publishStatus(String publishStatus) {
                this.publishStatus = publishStatus;
                return this;
            }

            /**
             * <p>The route table ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vtb-bp1r9pvl4xen8s9ju****</p>
             */
            public Builder routeTableId(String routeTableId) {
                this.routeTableId = routeTableId;
                return this;
            }

            /**
             * <p>The route status. Valid values:</p>
             * <ul>
             * <li><strong>Active</strong>: available routes</li>
             * <li><strong>Candidate</strong>: standby routes</li>
             * <li><strong>Rejected</strong>: rejected routes</li>
             * <li><strong>Prohibited</strong>: prohibited routes</li>
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
             * <p>The route type. Valid values:</p>
             * <ul>
             * <li><strong>CEN</strong>: route that is advertised through CEN</li>
             * <li><strong>System</strong>: system route</li>
             * <li><strong>Custom</strong>: custom route</li>
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
