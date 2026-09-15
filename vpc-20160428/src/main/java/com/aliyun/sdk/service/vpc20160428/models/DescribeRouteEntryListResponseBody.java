// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link DescribeRouteEntryListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRouteEntryListResponseBody</p>
 */
public class DescribeRouteEntryListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouteEntrys")
    private RouteEntrys routeEntrys;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeRouteEntryListResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.routeEntrys = builder.routeEntrys;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRouteEntryListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return routeEntrys
     */
    public RouteEntrys getRouteEntrys() {
        return this.routeEntrys;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private RouteEntrys routeEntrys; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeRouteEntryListResponseBody model) {
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.routeEntrys = model.routeEntrys;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no subsequent request exists.</li>
         * <li>If <strong>NextToken</strong> is returned, the value indicates the token for the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>14A07460-EBE7-47CA-9757-12CC4761D47A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RouteEntrys.
         */
        public Builder routeEntrys(RouteEntrys routeEntrys) {
            this.routeEntrys = routeEntrys;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRouteEntryListResponseBody build() {
            return new DescribeRouteEntryListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRouteEntryListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRouteEntryListResponseBody</p>
     */
    public static class NextHopRelatedInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private NextHopRelatedInfo(Builder builder) {
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NextHopRelatedInfo create() {
            return builder().build();
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

        public static final class Builder {
            private String instanceId; 
            private String instanceType; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(NextHopRelatedInfo model) {
                this.instanceId = model.instanceId;
                this.instanceType = model.instanceType;
                this.regionId = model.regionId;
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

            public NextHopRelatedInfo build() {
                return new NextHopRelatedInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRouteEntryListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRouteEntryListResponseBody</p>
     */
    public static class NextHop extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Integer enabled;

        @com.aliyun.core.annotation.NameInMap("NextHopId")
        private String nextHopId;

        @com.aliyun.core.annotation.NameInMap("NextHopRegionId")
        private String nextHopRegionId;

        @com.aliyun.core.annotation.NameInMap("NextHopRelatedInfo")
        private NextHopRelatedInfo nextHopRelatedInfo;

        @com.aliyun.core.annotation.NameInMap("NextHopType")
        private String nextHopType;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private NextHop(Builder builder) {
            this.enabled = builder.enabled;
            this.nextHopId = builder.nextHopId;
            this.nextHopRegionId = builder.nextHopRegionId;
            this.nextHopRelatedInfo = builder.nextHopRelatedInfo;
            this.nextHopType = builder.nextHopType;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NextHop create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Integer getEnabled() {
            return this.enabled;
        }

        /**
         * @return nextHopId
         */
        public String getNextHopId() {
            return this.nextHopId;
        }

        /**
         * @return nextHopRegionId
         */
        public String getNextHopRegionId() {
            return this.nextHopRegionId;
        }

        /**
         * @return nextHopRelatedInfo
         */
        public NextHopRelatedInfo getNextHopRelatedInfo() {
            return this.nextHopRelatedInfo;
        }

        /**
         * @return nextHopType
         */
        public String getNextHopType() {
            return this.nextHopType;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private Integer enabled; 
            private String nextHopId; 
            private String nextHopRegionId; 
            private NextHopRelatedInfo nextHopRelatedInfo; 
            private String nextHopType; 
            private Integer weight; 

            private Builder() {
            } 

            private Builder(NextHop model) {
                this.enabled = model.enabled;
                this.nextHopId = model.nextHopId;
                this.nextHopRegionId = model.nextHopRegionId;
                this.nextHopRelatedInfo = model.nextHopRelatedInfo;
                this.nextHopType = model.nextHopType;
                this.weight = model.weight;
            } 

            /**
             * Enabled.
             */
            public Builder enabled(Integer enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * NextHopId.
             */
            public Builder nextHopId(String nextHopId) {
                this.nextHopId = nextHopId;
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
             * NextHopRelatedInfo.
             */
            public Builder nextHopRelatedInfo(NextHopRelatedInfo nextHopRelatedInfo) {
                this.nextHopRelatedInfo = nextHopRelatedInfo;
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
             * Weight.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public NextHop build() {
                return new NextHop(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRouteEntryListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRouteEntryListResponseBody</p>
     */
    public static class NextHops extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NextHop")
        private java.util.List<NextHop> nextHop;

        private NextHops(Builder builder) {
            this.nextHop = builder.nextHop;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NextHops create() {
            return builder().build();
        }

        /**
         * @return nextHop
         */
        public java.util.List<NextHop> getNextHop() {
            return this.nextHop;
        }

        public static final class Builder {
            private java.util.List<NextHop> nextHop; 

            private Builder() {
            } 

            private Builder(NextHops model) {
                this.nextHop = model.nextHop;
            } 

            /**
             * NextHop.
             */
            public Builder nextHop(java.util.List<NextHop> nextHop) {
                this.nextHop = nextHop;
                return this;
            }

            public NextHops build() {
                return new NextHops(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRouteEntryListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRouteEntryListResponseBody</p>
     */
    public static class RouteEntry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("IpVersion")
        private String ipVersion;

        @com.aliyun.core.annotation.NameInMap("NextHops")
        private NextHops nextHops;

        @com.aliyun.core.annotation.NameInMap("Origin")
        private String origin;

        @com.aliyun.core.annotation.NameInMap("RouteEntryId")
        private String routeEntryId;

        @com.aliyun.core.annotation.NameInMap("RouteEntryName")
        private String routeEntryName;

        @com.aliyun.core.annotation.NameInMap("RouteTableId")
        private String routeTableId;

        @com.aliyun.core.annotation.NameInMap("ServiceType")
        private String serviceType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private RouteEntry(Builder builder) {
            this.description = builder.description;
            this.destinationCidrBlock = builder.destinationCidrBlock;
            this.gmtModified = builder.gmtModified;
            this.ipVersion = builder.ipVersion;
            this.nextHops = builder.nextHops;
            this.origin = builder.origin;
            this.routeEntryId = builder.routeEntryId;
            this.routeEntryName = builder.routeEntryName;
            this.routeTableId = builder.routeTableId;
            this.serviceType = builder.serviceType;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteEntry create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return destinationCidrBlock
         */
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return ipVersion
         */
        public String getIpVersion() {
            return this.ipVersion;
        }

        /**
         * @return nextHops
         */
        public NextHops getNextHops() {
            return this.nextHops;
        }

        /**
         * @return origin
         */
        public String getOrigin() {
            return this.origin;
        }

        /**
         * @return routeEntryId
         */
        public String getRouteEntryId() {
            return this.routeEntryId;
        }

        /**
         * @return routeEntryName
         */
        public String getRouteEntryName() {
            return this.routeEntryName;
        }

        /**
         * @return routeTableId
         */
        public String getRouteTableId() {
            return this.routeTableId;
        }

        /**
         * @return serviceType
         */
        public String getServiceType() {
            return this.serviceType;
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
            private String description; 
            private String destinationCidrBlock; 
            private String gmtModified; 
            private String ipVersion; 
            private NextHops nextHops; 
            private String origin; 
            private String routeEntryId; 
            private String routeEntryName; 
            private String routeTableId; 
            private String serviceType; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(RouteEntry model) {
                this.description = model.description;
                this.destinationCidrBlock = model.destinationCidrBlock;
                this.gmtModified = model.gmtModified;
                this.ipVersion = model.ipVersion;
                this.nextHops = model.nextHops;
                this.origin = model.origin;
                this.routeEntryId = model.routeEntryId;
                this.routeEntryName = model.routeEntryName;
                this.routeTableId = model.routeTableId;
                this.serviceType = model.serviceType;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * IpVersion.
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * NextHops.
             */
            public Builder nextHops(NextHops nextHops) {
                this.nextHops = nextHops;
                return this;
            }

            /**
             * Origin.
             */
            public Builder origin(String origin) {
                this.origin = origin;
                return this;
            }

            /**
             * RouteEntryId.
             */
            public Builder routeEntryId(String routeEntryId) {
                this.routeEntryId = routeEntryId;
                return this;
            }

            /**
             * RouteEntryName.
             */
            public Builder routeEntryName(String routeEntryName) {
                this.routeEntryName = routeEntryName;
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
             * ServiceType.
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
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

            public RouteEntry build() {
                return new RouteEntry(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRouteEntryListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRouteEntryListResponseBody</p>
     */
    public static class RouteEntrys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RouteEntry")
        private java.util.List<RouteEntry> routeEntry;

        private RouteEntrys(Builder builder) {
            this.routeEntry = builder.routeEntry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteEntrys create() {
            return builder().build();
        }

        /**
         * @return routeEntry
         */
        public java.util.List<RouteEntry> getRouteEntry() {
            return this.routeEntry;
        }

        public static final class Builder {
            private java.util.List<RouteEntry> routeEntry; 

            private Builder() {
            } 

            private Builder(RouteEntrys model) {
                this.routeEntry = model.routeEntry;
            } 

            /**
             * RouteEntry.
             */
            public Builder routeEntry(java.util.List<RouteEntry> routeEntry) {
                this.routeEntry = routeEntry;
                return this;
            }

            public RouteEntrys build() {
                return new RouteEntrys(this);
            } 

        } 

    }
}
