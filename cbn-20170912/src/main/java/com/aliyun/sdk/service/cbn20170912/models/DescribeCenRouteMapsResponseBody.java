// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCenRouteMapsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCenRouteMapsResponseBody</p>
 */
public class DescribeCenRouteMapsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouteMaps")
    private RouteMaps routeMaps;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeCenRouteMapsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.routeMaps = builder.routeMaps;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCenRouteMapsResponseBody create() {
        return builder().build();
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
     * @return routeMaps
     */
    public RouteMaps getRouteMaps() {
        return this.routeMaps;
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
        private String requestId; 
        private RouteMaps routeMaps; 
        private Integer totalCount; 

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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>24CE1987-D1D1-5324-9BAD-2750B60E6ABB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the routing policy.</p>
         */
        public Builder routeMaps(RouteMaps routeMaps) {
            this.routeMaps = routeMaps;
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

        public DescribeCenRouteMapsResponseBody build() {
            return new DescribeCenRouteMapsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCenRouteMapsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenRouteMapsResponseBody</p>
     */
    public static class DestinationChildInstanceTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestinationChildInstanceType")
        private java.util.List < String > destinationChildInstanceType;

        private DestinationChildInstanceTypes(Builder builder) {
            this.destinationChildInstanceType = builder.destinationChildInstanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DestinationChildInstanceTypes create() {
            return builder().build();
        }

        /**
         * @return destinationChildInstanceType
         */
        public java.util.List < String > getDestinationChildInstanceType() {
            return this.destinationChildInstanceType;
        }

        public static final class Builder {
            private java.util.List < String > destinationChildInstanceType; 

            /**
             * DestinationChildInstanceType.
             */
            public Builder destinationChildInstanceType(java.util.List < String > destinationChildInstanceType) {
                this.destinationChildInstanceType = destinationChildInstanceType;
                return this;
            }

            public DestinationChildInstanceTypes build() {
                return new DestinationChildInstanceTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCenRouteMapsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenRouteMapsResponseBody</p>
     */
    public static class DestinationCidrBlocks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
        private java.util.List < String > destinationCidrBlock;

        private DestinationCidrBlocks(Builder builder) {
            this.destinationCidrBlock = builder.destinationCidrBlock;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DestinationCidrBlocks create() {
            return builder().build();
        }

        /**
         * @return destinationCidrBlock
         */
        public java.util.List < String > getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public static final class Builder {
            private java.util.List < String > destinationCidrBlock; 

            /**
             * DestinationCidrBlock.
             */
            public Builder destinationCidrBlock(java.util.List < String > destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            public DestinationCidrBlocks build() {
                return new DestinationCidrBlocks(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCenRouteMapsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenRouteMapsResponseBody</p>
     */
    public static class DestinationInstanceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestinationInstanceId")
        private java.util.List < String > destinationInstanceId;

        private DestinationInstanceIds(Builder builder) {
            this.destinationInstanceId = builder.destinationInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DestinationInstanceIds create() {
            return builder().build();
        }

        /**
         * @return destinationInstanceId
         */
        public java.util.List < String > getDestinationInstanceId() {
            return this.destinationInstanceId;
        }

        public static final class Builder {
            private java.util.List < String > destinationInstanceId; 

            /**
             * DestinationInstanceId.
             */
            public Builder destinationInstanceId(java.util.List < String > destinationInstanceId) {
                this.destinationInstanceId = destinationInstanceId;
                return this;
            }

            public DestinationInstanceIds build() {
                return new DestinationInstanceIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCenRouteMapsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenRouteMapsResponseBody</p>
     */
    public static class DestinationRegionIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestinationRegionId")
        private java.util.List < String > destinationRegionId;

        private DestinationRegionIds(Builder builder) {
            this.destinationRegionId = builder.destinationRegionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DestinationRegionIds create() {
            return builder().build();
        }

        /**
         * @return destinationRegionId
         */
        public java.util.List < String > getDestinationRegionId() {
            return this.destinationRegionId;
        }

        public static final class Builder {
            private java.util.List < String > destinationRegionId; 

            /**
             * DestinationRegionId.
             */
            public Builder destinationRegionId(java.util.List < String > destinationRegionId) {
                this.destinationRegionId = destinationRegionId;
                return this;
            }

            public DestinationRegionIds build() {
                return new DestinationRegionIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCenRouteMapsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenRouteMapsResponseBody</p>
     */
    public static class DestinationRouteTableIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestinationRouteTableId")
        private java.util.List < String > destinationRouteTableId;

        private DestinationRouteTableIds(Builder builder) {
            this.destinationRouteTableId = builder.destinationRouteTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DestinationRouteTableIds create() {
            return builder().build();
        }

        /**
         * @return destinationRouteTableId
         */
        public java.util.List < String > getDestinationRouteTableId() {
            return this.destinationRouteTableId;
        }

        public static final class Builder {
            private java.util.List < String > destinationRouteTableId; 

            /**
             * DestinationRouteTableId.
             */
            public Builder destinationRouteTableId(java.util.List < String > destinationRouteTableId) {
                this.destinationRouteTableId = destinationRouteTableId;
                return this;
            }

            public DestinationRouteTableIds build() {
                return new DestinationRouteTableIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCenRouteMapsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenRouteMapsResponseBody</p>
     */
    public static class MatchAsns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MatchAsn")
        private java.util.List < String > matchAsn;

        private MatchAsns(Builder builder) {
            this.matchAsn = builder.matchAsn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MatchAsns create() {
            return builder().build();
        }

        /**
         * @return matchAsn
         */
        public java.util.List < String > getMatchAsn() {
            return this.matchAsn;
        }

        public static final class Builder {
            private java.util.List < String > matchAsn; 

            /**
             * MatchAsn.
             */
            public Builder matchAsn(java.util.List < String > matchAsn) {
                this.matchAsn = matchAsn;
                return this;
            }

            public MatchAsns build() {
                return new MatchAsns(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCenRouteMapsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenRouteMapsResponseBody</p>
     */
    public static class MatchCommunitySet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MatchCommunity")
        private java.util.List < String > matchCommunity;

        private MatchCommunitySet(Builder builder) {
            this.matchCommunity = builder.matchCommunity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MatchCommunitySet create() {
            return builder().build();
        }

        /**
         * @return matchCommunity
         */
        public java.util.List < String > getMatchCommunity() {
            return this.matchCommunity;
        }

        public static final class Builder {
            private java.util.List < String > matchCommunity; 

            /**
             * MatchCommunity.
             */
            public Builder matchCommunity(java.util.List < String > matchCommunity) {
                this.matchCommunity = matchCommunity;
                return this;
            }

            public MatchCommunitySet build() {
                return new MatchCommunitySet(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCenRouteMapsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenRouteMapsResponseBody</p>
     */
    public static class OperateCommunitySet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OperateCommunity")
        private java.util.List < String > operateCommunity;

        private OperateCommunitySet(Builder builder) {
            this.operateCommunity = builder.operateCommunity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperateCommunitySet create() {
            return builder().build();
        }

        /**
         * @return operateCommunity
         */
        public java.util.List < String > getOperateCommunity() {
            return this.operateCommunity;
        }

        public static final class Builder {
            private java.util.List < String > operateCommunity; 

            /**
             * OperateCommunity.
             */
            public Builder operateCommunity(java.util.List < String > operateCommunity) {
                this.operateCommunity = operateCommunity;
                return this;
            }

            public OperateCommunitySet build() {
                return new OperateCommunitySet(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCenRouteMapsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenRouteMapsResponseBody</p>
     */
    public static class PrependAsPath extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsPath")
        private java.util.List < String > asPath;

        private PrependAsPath(Builder builder) {
            this.asPath = builder.asPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrependAsPath create() {
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
             * AsPath.
             */
            public Builder asPath(java.util.List < String > asPath) {
                this.asPath = asPath;
                return this;
            }

            public PrependAsPath build() {
                return new PrependAsPath(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCenRouteMapsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenRouteMapsResponseBody</p>
     */
    public static class RouteTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RouteType")
        private java.util.List < String > routeType;

        private RouteTypes(Builder builder) {
            this.routeType = builder.routeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteTypes create() {
            return builder().build();
        }

        /**
         * @return routeType
         */
        public java.util.List < String > getRouteType() {
            return this.routeType;
        }

        public static final class Builder {
            private java.util.List < String > routeType; 

            /**
             * RouteType.
             */
            public Builder routeType(java.util.List < String > routeType) {
                this.routeType = routeType;
                return this;
            }

            public RouteTypes build() {
                return new RouteTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCenRouteMapsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenRouteMapsResponseBody</p>
     */
    public static class SourceChildInstanceTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceChildInstanceType")
        private java.util.List < String > sourceChildInstanceType;

        private SourceChildInstanceTypes(Builder builder) {
            this.sourceChildInstanceType = builder.sourceChildInstanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceChildInstanceTypes create() {
            return builder().build();
        }

        /**
         * @return sourceChildInstanceType
         */
        public java.util.List < String > getSourceChildInstanceType() {
            return this.sourceChildInstanceType;
        }

        public static final class Builder {
            private java.util.List < String > sourceChildInstanceType; 

            /**
             * SourceChildInstanceType.
             */
            public Builder sourceChildInstanceType(java.util.List < String > sourceChildInstanceType) {
                this.sourceChildInstanceType = sourceChildInstanceType;
                return this;
            }

            public SourceChildInstanceTypes build() {
                return new SourceChildInstanceTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCenRouteMapsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenRouteMapsResponseBody</p>
     */
    public static class SourceInstanceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceInstanceId")
        private java.util.List < String > sourceInstanceId;

        private SourceInstanceIds(Builder builder) {
            this.sourceInstanceId = builder.sourceInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceInstanceIds create() {
            return builder().build();
        }

        /**
         * @return sourceInstanceId
         */
        public java.util.List < String > getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        public static final class Builder {
            private java.util.List < String > sourceInstanceId; 

            /**
             * SourceInstanceId.
             */
            public Builder sourceInstanceId(java.util.List < String > sourceInstanceId) {
                this.sourceInstanceId = sourceInstanceId;
                return this;
            }

            public SourceInstanceIds build() {
                return new SourceInstanceIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCenRouteMapsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenRouteMapsResponseBody</p>
     */
    public static class SourceRegionIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceRegionId")
        private java.util.List < String > sourceRegionId;

        private SourceRegionIds(Builder builder) {
            this.sourceRegionId = builder.sourceRegionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceRegionIds create() {
            return builder().build();
        }

        /**
         * @return sourceRegionId
         */
        public java.util.List < String > getSourceRegionId() {
            return this.sourceRegionId;
        }

        public static final class Builder {
            private java.util.List < String > sourceRegionId; 

            /**
             * SourceRegionId.
             */
            public Builder sourceRegionId(java.util.List < String > sourceRegionId) {
                this.sourceRegionId = sourceRegionId;
                return this;
            }

            public SourceRegionIds build() {
                return new SourceRegionIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCenRouteMapsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenRouteMapsResponseBody</p>
     */
    public static class SourceRouteTableIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceRouteTableId")
        private java.util.List < String > sourceRouteTableId;

        private SourceRouteTableIds(Builder builder) {
            this.sourceRouteTableId = builder.sourceRouteTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceRouteTableIds create() {
            return builder().build();
        }

        /**
         * @return sourceRouteTableId
         */
        public java.util.List < String > getSourceRouteTableId() {
            return this.sourceRouteTableId;
        }

        public static final class Builder {
            private java.util.List < String > sourceRouteTableId; 

            /**
             * SourceRouteTableId.
             */
            public Builder sourceRouteTableId(java.util.List < String > sourceRouteTableId) {
                this.sourceRouteTableId = sourceRouteTableId;
                return this;
            }

            public SourceRouteTableIds build() {
                return new SourceRouteTableIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCenRouteMapsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenRouteMapsResponseBody</p>
     */
    public static class RouteMap extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsPathMatchMode")
        private String asPathMatchMode;

        @com.aliyun.core.annotation.NameInMap("CenId")
        private String cenId;

        @com.aliyun.core.annotation.NameInMap("CenRegionId")
        private String cenRegionId;

        @com.aliyun.core.annotation.NameInMap("CidrMatchMode")
        private String cidrMatchMode;

        @com.aliyun.core.annotation.NameInMap("CommunityMatchMode")
        private String communityMatchMode;

        @com.aliyun.core.annotation.NameInMap("CommunityOperateMode")
        private String communityOperateMode;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DestinationChildInstanceTypes")
        private DestinationChildInstanceTypes destinationChildInstanceTypes;

        @com.aliyun.core.annotation.NameInMap("DestinationCidrBlocks")
        private DestinationCidrBlocks destinationCidrBlocks;

        @com.aliyun.core.annotation.NameInMap("DestinationInstanceIds")
        private DestinationInstanceIds destinationInstanceIds;

        @com.aliyun.core.annotation.NameInMap("DestinationInstanceIdsReverseMatch")
        private Boolean destinationInstanceIdsReverseMatch;

        @com.aliyun.core.annotation.NameInMap("DestinationRegionIds")
        private DestinationRegionIds destinationRegionIds;

        @com.aliyun.core.annotation.NameInMap("DestinationRouteTableIds")
        private DestinationRouteTableIds destinationRouteTableIds;

        @com.aliyun.core.annotation.NameInMap("MapResult")
        private String mapResult;

        @com.aliyun.core.annotation.NameInMap("MatchAddressType")
        private String matchAddressType;

        @com.aliyun.core.annotation.NameInMap("MatchAsns")
        private MatchAsns matchAsns;

        @com.aliyun.core.annotation.NameInMap("MatchCommunitySet")
        private MatchCommunitySet matchCommunitySet;

        @com.aliyun.core.annotation.NameInMap("NextPriority")
        private Integer nextPriority;

        @com.aliyun.core.annotation.NameInMap("OperateCommunitySet")
        private OperateCommunitySet operateCommunitySet;

        @com.aliyun.core.annotation.NameInMap("Preference")
        private Integer preference;

        @com.aliyun.core.annotation.NameInMap("PrependAsPath")
        private PrependAsPath prependAsPath;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("RouteMapId")
        private String routeMapId;

        @com.aliyun.core.annotation.NameInMap("RouteTypes")
        private RouteTypes routeTypes;

        @com.aliyun.core.annotation.NameInMap("SourceChildInstanceTypes")
        private SourceChildInstanceTypes sourceChildInstanceTypes;

        @com.aliyun.core.annotation.NameInMap("SourceInstanceIds")
        private SourceInstanceIds sourceInstanceIds;

        @com.aliyun.core.annotation.NameInMap("SourceInstanceIdsReverseMatch")
        private Boolean sourceInstanceIdsReverseMatch;

        @com.aliyun.core.annotation.NameInMap("SourceRegionIds")
        private SourceRegionIds sourceRegionIds;

        @com.aliyun.core.annotation.NameInMap("SourceRouteTableIds")
        private SourceRouteTableIds sourceRouteTableIds;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TransitRouterRouteTableId")
        private String transitRouterRouteTableId;

        @com.aliyun.core.annotation.NameInMap("TransmitDirection")
        private String transmitDirection;

        private RouteMap(Builder builder) {
            this.asPathMatchMode = builder.asPathMatchMode;
            this.cenId = builder.cenId;
            this.cenRegionId = builder.cenRegionId;
            this.cidrMatchMode = builder.cidrMatchMode;
            this.communityMatchMode = builder.communityMatchMode;
            this.communityOperateMode = builder.communityOperateMode;
            this.description = builder.description;
            this.destinationChildInstanceTypes = builder.destinationChildInstanceTypes;
            this.destinationCidrBlocks = builder.destinationCidrBlocks;
            this.destinationInstanceIds = builder.destinationInstanceIds;
            this.destinationInstanceIdsReverseMatch = builder.destinationInstanceIdsReverseMatch;
            this.destinationRegionIds = builder.destinationRegionIds;
            this.destinationRouteTableIds = builder.destinationRouteTableIds;
            this.mapResult = builder.mapResult;
            this.matchAddressType = builder.matchAddressType;
            this.matchAsns = builder.matchAsns;
            this.matchCommunitySet = builder.matchCommunitySet;
            this.nextPriority = builder.nextPriority;
            this.operateCommunitySet = builder.operateCommunitySet;
            this.preference = builder.preference;
            this.prependAsPath = builder.prependAsPath;
            this.priority = builder.priority;
            this.routeMapId = builder.routeMapId;
            this.routeTypes = builder.routeTypes;
            this.sourceChildInstanceTypes = builder.sourceChildInstanceTypes;
            this.sourceInstanceIds = builder.sourceInstanceIds;
            this.sourceInstanceIdsReverseMatch = builder.sourceInstanceIdsReverseMatch;
            this.sourceRegionIds = builder.sourceRegionIds;
            this.sourceRouteTableIds = builder.sourceRouteTableIds;
            this.status = builder.status;
            this.transitRouterRouteTableId = builder.transitRouterRouteTableId;
            this.transmitDirection = builder.transmitDirection;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteMap create() {
            return builder().build();
        }

        /**
         * @return asPathMatchMode
         */
        public String getAsPathMatchMode() {
            return this.asPathMatchMode;
        }

        /**
         * @return cenId
         */
        public String getCenId() {
            return this.cenId;
        }

        /**
         * @return cenRegionId
         */
        public String getCenRegionId() {
            return this.cenRegionId;
        }

        /**
         * @return cidrMatchMode
         */
        public String getCidrMatchMode() {
            return this.cidrMatchMode;
        }

        /**
         * @return communityMatchMode
         */
        public String getCommunityMatchMode() {
            return this.communityMatchMode;
        }

        /**
         * @return communityOperateMode
         */
        public String getCommunityOperateMode() {
            return this.communityOperateMode;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return destinationChildInstanceTypes
         */
        public DestinationChildInstanceTypes getDestinationChildInstanceTypes() {
            return this.destinationChildInstanceTypes;
        }

        /**
         * @return destinationCidrBlocks
         */
        public DestinationCidrBlocks getDestinationCidrBlocks() {
            return this.destinationCidrBlocks;
        }

        /**
         * @return destinationInstanceIds
         */
        public DestinationInstanceIds getDestinationInstanceIds() {
            return this.destinationInstanceIds;
        }

        /**
         * @return destinationInstanceIdsReverseMatch
         */
        public Boolean getDestinationInstanceIdsReverseMatch() {
            return this.destinationInstanceIdsReverseMatch;
        }

        /**
         * @return destinationRegionIds
         */
        public DestinationRegionIds getDestinationRegionIds() {
            return this.destinationRegionIds;
        }

        /**
         * @return destinationRouteTableIds
         */
        public DestinationRouteTableIds getDestinationRouteTableIds() {
            return this.destinationRouteTableIds;
        }

        /**
         * @return mapResult
         */
        public String getMapResult() {
            return this.mapResult;
        }

        /**
         * @return matchAddressType
         */
        public String getMatchAddressType() {
            return this.matchAddressType;
        }

        /**
         * @return matchAsns
         */
        public MatchAsns getMatchAsns() {
            return this.matchAsns;
        }

        /**
         * @return matchCommunitySet
         */
        public MatchCommunitySet getMatchCommunitySet() {
            return this.matchCommunitySet;
        }

        /**
         * @return nextPriority
         */
        public Integer getNextPriority() {
            return this.nextPriority;
        }

        /**
         * @return operateCommunitySet
         */
        public OperateCommunitySet getOperateCommunitySet() {
            return this.operateCommunitySet;
        }

        /**
         * @return preference
         */
        public Integer getPreference() {
            return this.preference;
        }

        /**
         * @return prependAsPath
         */
        public PrependAsPath getPrependAsPath() {
            return this.prependAsPath;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return routeMapId
         */
        public String getRouteMapId() {
            return this.routeMapId;
        }

        /**
         * @return routeTypes
         */
        public RouteTypes getRouteTypes() {
            return this.routeTypes;
        }

        /**
         * @return sourceChildInstanceTypes
         */
        public SourceChildInstanceTypes getSourceChildInstanceTypes() {
            return this.sourceChildInstanceTypes;
        }

        /**
         * @return sourceInstanceIds
         */
        public SourceInstanceIds getSourceInstanceIds() {
            return this.sourceInstanceIds;
        }

        /**
         * @return sourceInstanceIdsReverseMatch
         */
        public Boolean getSourceInstanceIdsReverseMatch() {
            return this.sourceInstanceIdsReverseMatch;
        }

        /**
         * @return sourceRegionIds
         */
        public SourceRegionIds getSourceRegionIds() {
            return this.sourceRegionIds;
        }

        /**
         * @return sourceRouteTableIds
         */
        public SourceRouteTableIds getSourceRouteTableIds() {
            return this.sourceRouteTableIds;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return transitRouterRouteTableId
         */
        public String getTransitRouterRouteTableId() {
            return this.transitRouterRouteTableId;
        }

        /**
         * @return transmitDirection
         */
        public String getTransmitDirection() {
            return this.transmitDirection;
        }

        public static final class Builder {
            private String asPathMatchMode; 
            private String cenId; 
            private String cenRegionId; 
            private String cidrMatchMode; 
            private String communityMatchMode; 
            private String communityOperateMode; 
            private String description; 
            private DestinationChildInstanceTypes destinationChildInstanceTypes; 
            private DestinationCidrBlocks destinationCidrBlocks; 
            private DestinationInstanceIds destinationInstanceIds; 
            private Boolean destinationInstanceIdsReverseMatch; 
            private DestinationRegionIds destinationRegionIds; 
            private DestinationRouteTableIds destinationRouteTableIds; 
            private String mapResult; 
            private String matchAddressType; 
            private MatchAsns matchAsns; 
            private MatchCommunitySet matchCommunitySet; 
            private Integer nextPriority; 
            private OperateCommunitySet operateCommunitySet; 
            private Integer preference; 
            private PrependAsPath prependAsPath; 
            private Integer priority; 
            private String routeMapId; 
            private RouteTypes routeTypes; 
            private SourceChildInstanceTypes sourceChildInstanceTypes; 
            private SourceInstanceIds sourceInstanceIds; 
            private Boolean sourceInstanceIdsReverseMatch; 
            private SourceRegionIds sourceRegionIds; 
            private SourceRouteTableIds sourceRouteTableIds; 
            private String status; 
            private String transitRouterRouteTableId; 
            private String transmitDirection; 

            /**
             * <p>The match method that is used to match routes based on the AS path.</p>
             * <ul>
             * <li><strong>Include</strong>: fuzzy match. A route is a match if the AS path of the route overlaps with the AS path specified in the match condition.</li>
             * <li><strong>Complete</strong>: exact match. A route is a match only if the AS path of the route is the same as an AS path specified in the match condition.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Include</p>
             */
            public Builder asPathMatchMode(String asPathMatchMode) {
                this.asPathMatchMode = asPathMatchMode;
                return this;
            }

            /**
             * <p>The CEN instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cen-wx12mmlt17ld82****</p>
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * <p>The region ID of the routing policy.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder cenRegionId(String cenRegionId) {
                this.cenRegionId = cenRegionId;
                return this;
            }

            /**
             * <p>The match method that is used to evaluate routes based on the prefix. Valid values:</p>
             * <ul>
             * <li><strong>Include</strong>: fuzzy match. A route is a match if the route prefix is included in the match conditions.</li>
             * </ul>
             * <p>For example, if you set the match condition to 10.10.0.0/16 and fuzzy match is applied, the route whose prefix is 10.10.1.0/24 meets the match condition.</p>
             * <ul>
             * <li><strong>Complete</strong>: exact match. A route is a match only if the route prefix is the same as the prefix specified in the match condition.</li>
             * </ul>
             * <p>For example, if you set the match condition to 10.10.0.0/16 and exact match is enabled, a route is a match only if the prefix is 10.10.0.0/16.</p>
             * 
             * <strong>example:</strong>
             * <p>Include</p>
             */
            public Builder cidrMatchMode(String cidrMatchMode) {
                this.cidrMatchMode = cidrMatchMode;
                return this;
            }

            /**
             * <p>The match method that is used to match routes against the community.</p>
             * <ul>
             * <li><strong>Include</strong>: fuzzy match. A route is a match if the community of the route overlaps with the community specified in the match condition.</li>
             * <li><strong>Complete</strong>: exact match. A route meets the match condition only if the community of the route is the same as the community specified in the match condition.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Include</p>
             */
            public Builder communityMatchMode(String communityMatchMode) {
                this.communityMatchMode = communityMatchMode;
                return this;
            }

            /**
             * <p>The action that is performed on the community of the route.</p>
             * <ul>
             * <li><strong>Additive</strong>: adds the community to the route.</li>
             * <li><strong>Replace</strong>: replaces the original community of the route.</li>
             * </ul>
             * <p>This parameter specifies the action to be performed when a route meets the match condition.</p>
             * 
             * <strong>example:</strong>
             * <p>Additive</p>
             */
            public Builder communityOperateMode(String communityOperateMode) {
                this.communityOperateMode = communityOperateMode;
                return this;
            }

            /**
             * <p>The description of the routing policy.</p>
             * 
             * <strong>example:</strong>
             * <p>desctest</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The types of destination network instances to which the routes belong.</p>
             * <ul>
             * <li><strong>VPC</strong></li>
             * <li><strong>VBR</strong></li>
             * <li><strong>CCN</strong></li>
             * <li><strong>VPN</strong></li>
             * </ul>
             * <blockquote>
             * <p> The destination route tables take effect only if the routing policy is applied to the egress gateway direction, and the type of the destination route tables is the same as that of the network instance in the current region.</p>
             * </blockquote>
             */
            public Builder destinationChildInstanceTypes(DestinationChildInstanceTypes destinationChildInstanceTypes) {
                this.destinationChildInstanceTypes = destinationChildInstanceTypes;
                return this;
            }

            /**
             * <p>The prefix list against which routes are matched.</p>
             * <p>IPv4 and IPv6 addresses are supported.</p>
             */
            public Builder destinationCidrBlocks(DestinationCidrBlocks destinationCidrBlocks) {
                this.destinationCidrBlocks = destinationCidrBlocks;
                return this;
            }

            /**
             * <p>The IDs of the destination network instances to which the routes point.</p>
             * <blockquote>
             * <p> The destination route tables take effect only if the routing policy is applied to the egress gateway direction, and the ID the destination instance is the same as that of the network instance in the current region.</p>
             * </blockquote>
             */
            public Builder destinationInstanceIds(DestinationInstanceIds destinationInstanceIds) {
                this.destinationInstanceIds = destinationInstanceIds;
                return this;
            }

            /**
             * <p>Indicates whether the destination network instance IDs are excluded.</p>
             * <ul>
             * <li><strong>false</strong> (default): A route is a match if its destination network instance ID is in the list specified by <strong>DestinationInstanceIds.N</strong>.</li>
             * <li><strong>true</strong>: A route is a match if its destination network instance ID is not in the list specified by <strong>DestinationInstanceIds.N</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder destinationInstanceIdsReverseMatch(Boolean destinationInstanceIdsReverseMatch) {
                this.destinationInstanceIdsReverseMatch = destinationInstanceIdsReverseMatch;
                return this;
            }

            /**
             * <p>The IDs of the destination regions for the routing policy.</p>
             */
            public Builder destinationRegionIds(DestinationRegionIds destinationRegionIds) {
                this.destinationRegionIds = destinationRegionIds;
                return this;
            }

            /**
             * <p>The IDs of the destination route tables to which the routes belong. You can enter at most 32 route table IDs.</p>
             * <blockquote>
             * <p> The destination route tables take effect only if the routing policy is applied to the egress gateway direction, and the destination route table IDs are in the current region.</p>
             * </blockquote>
             */
            public Builder destinationRouteTableIds(DestinationRouteTableIds destinationRouteTableIds) {
                this.destinationRouteTableIds = destinationRouteTableIds;
                return this;
            }

            /**
             * <p>The action performed on a route that meets the match conditions.</p>
             * <ul>
             * <li><strong>Permit</strong>: the route is permitted.</li>
             * <li><strong>Deny</strong>: the route is denied.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Deny</p>
             */
            public Builder mapResult(String mapResult) {
                this.mapResult = mapResult;
                return this;
            }

            /**
             * <p>The type of IP address to be matched against the match condition. Valid values:</p>
             * <ul>
             * <li><strong>IPv4</strong>: IPv4 addresses</li>
             * <li><strong>IPv6</strong>: IPv6 addresses</li>
             * <li>If no value is returned, both IPv4 and IPv6 addresses are matched against the match condition.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IPv4</p>
             */
            public Builder matchAddressType(String matchAddressType) {
                this.matchAddressType = matchAddressType;
                return this;
            }

            /**
             * <p>The AS paths against which routes are matched.</p>
             */
            public Builder matchAsns(MatchAsns matchAsns) {
                this.matchAsns = matchAsns;
                return this;
            }

            /**
             * <p>The community set against which routes are matched.</p>
             */
            public Builder matchCommunitySet(MatchCommunitySet matchCommunitySet) {
                this.matchCommunitySet = matchCommunitySet;
                return this;
            }

            /**
             * <p>The priority of the routing policy that you want to associate with the current one.</p>
             * 
             * <strong>example:</strong>
             * <p>33</p>
             */
            public Builder nextPriority(Integer nextPriority) {
                this.nextPriority = nextPriority;
                return this;
            }

            /**
             * <p>The community set on which actions are performed.</p>
             */
            public Builder operateCommunitySet(OperateCommunitySet operateCommunitySet) {
                this.operateCommunitySet = operateCommunitySet;
                return this;
            }

            /**
             * <p>The new priority of the route.</p>
             * <p>A smaller value indicates a higher priority.</p>
             * <p>This parameter indicates the action to be performed when a route meets the match condition.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder preference(Integer preference) {
                this.preference = preference;
                return this;
            }

            /**
             * <p>The AS paths that are prepended by using an action statement when regional gateways receive or advertise routes.</p>
             * <p>This parameter indicates the action to be performed when a route meets the match condition.</p>
             */
            public Builder prependAsPath(PrependAsPath prependAsPath) {
                this.prependAsPath = prependAsPath;
                return this;
            }

            /**
             * <p>The priority of the routing policy. A smaller value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>5000</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The routing policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cenrmap-y40mxdvf7joc12****</p>
             */
            public Builder routeMapId(String routeMapId) {
                this.routeMapId = routeMapId;
                return this;
            }

            /**
             * <p>The type of route that is compared. Valid values:</p>
             * <ul>
             * <li><strong>System</strong>: system routes that are automatically generated by the system.</li>
             * <li><strong>Custom</strong>: custom routes that are manually added.</li>
             * <li><strong>BGP</strong>: routes that are advertised over BGP.</li>
             * </ul>
             */
            public Builder routeTypes(RouteTypes routeTypes) {
                this.routeTypes = routeTypes;
                return this;
            }

            /**
             * <p>The types of source network instances to which the routes belong.</p>
             * <ul>
             * <li><strong>VPC</strong></li>
             * <li><strong>VBR</strong></li>
             * <li><strong>CCN</strong></li>
             * <li><strong>VPN</strong></li>
             * </ul>
             */
            public Builder sourceChildInstanceTypes(SourceChildInstanceTypes sourceChildInstanceTypes) {
                this.sourceChildInstanceTypes = sourceChildInstanceTypes;
                return this;
            }

            /**
             * <p>The IDs of the source network instances to which the routes belong.</p>
             */
            public Builder sourceInstanceIds(SourceInstanceIds sourceInstanceIds) {
                this.sourceInstanceIds = sourceInstanceIds;
                return this;
            }

            /**
             * <p>Indicates whether the source network instance IDs are excluded.</p>
             * <ul>
             * <li><strong>false</strong> (default): A route is a match if its source network instance ID is in the list specified by <strong>SourceInstanceIds.N</strong>.</li>
             * <li><strong>true</strong>: A route is match if its source network instance ID is not in the list specified by <strong>SourceInstanceIds.N</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder sourceInstanceIdsReverseMatch(Boolean sourceInstanceIdsReverseMatch) {
                this.sourceInstanceIdsReverseMatch = sourceInstanceIdsReverseMatch;
                return this;
            }

            /**
             * <p>The IDs of the source regions to which the routes belong.</p>
             */
            public Builder sourceRegionIds(SourceRegionIds sourceRegionIds) {
                this.sourceRegionIds = sourceRegionIds;
                return this;
            }

            /**
             * <p>The IDs of the source route tables to which the routes belong.</p>
             */
            public Builder sourceRouteTableIds(SourceRouteTableIds sourceRouteTableIds) {
                this.sourceRouteTableIds = sourceRouteTableIds;
                return this;
            }

            /**
             * <p>The status of the routing policy. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong></li>
             * <li><strong>Active</strong></li>
             * <li><strong>Deleting</strong></li>
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
             * <p>The route table ID of the transit router with which the routing policy is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>vtb-gw8nx3515m1mbd1z1****</p>
             */
            public Builder transitRouterRouteTableId(String transitRouterRouteTableId) {
                this.transitRouterRouteTableId = transitRouterRouteTableId;
                return this;
            }

            /**
             * <p>The direction in which the routing policy is applied.</p>
             * 
             * <strong>example:</strong>
             * <p>RegionOut</p>
             */
            public Builder transmitDirection(String transmitDirection) {
                this.transmitDirection = transmitDirection;
                return this;
            }

            public RouteMap build() {
                return new RouteMap(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCenRouteMapsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenRouteMapsResponseBody</p>
     */
    public static class RouteMaps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RouteMap")
        private java.util.List < RouteMap> routeMap;

        private RouteMaps(Builder builder) {
            this.routeMap = builder.routeMap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteMaps create() {
            return builder().build();
        }

        /**
         * @return routeMap
         */
        public java.util.List < RouteMap> getRouteMap() {
            return this.routeMap;
        }

        public static final class Builder {
            private java.util.List < RouteMap> routeMap; 

            /**
             * RouteMap.
             */
            public Builder routeMap(java.util.List < RouteMap> routeMap) {
                this.routeMap = routeMap;
                return this;
            }

            public RouteMaps build() {
                return new RouteMaps(this);
            } 

        } 

    }
}
