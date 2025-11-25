// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeSecurityProxyResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityProxyResourcesResponseBody</p>
 */
public class DescribeSecurityProxyResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceList")
    private java.util.List<ResourceList> resourceList;

    private DescribeSecurityProxyResourcesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceList = builder.resourceList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityProxyResourcesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceList
     */
    public java.util.List<ResourceList> getResourceList() {
        return this.resourceList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<ResourceList> resourceList; 

        private Builder() {
        } 

        private Builder(DescribeSecurityProxyResourcesResponseBody model) {
            this.requestId = model.requestId;
            this.resourceList = model.resourceList;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceList.
         */
        public Builder resourceList(java.util.List<ResourceList> resourceList) {
            this.resourceList = resourceList;
            return this;
        }

        public DescribeSecurityProxyResourcesResponseBody build() {
            return new DescribeSecurityProxyResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSecurityProxyResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityProxyResourcesResponseBody</p>
     */
    public static class NatRouteEntryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestinationCidr")
        private String destinationCidr;

        @com.aliyun.core.annotation.NameInMap("NextHopId")
        private String nextHopId;

        @com.aliyun.core.annotation.NameInMap("NextHopType")
        private String nextHopType;

        @com.aliyun.core.annotation.NameInMap("RouteTableId")
        private String routeTableId;

        private NatRouteEntryList(Builder builder) {
            this.destinationCidr = builder.destinationCidr;
            this.nextHopId = builder.nextHopId;
            this.nextHopType = builder.nextHopType;
            this.routeTableId = builder.routeTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NatRouteEntryList create() {
            return builder().build();
        }

        /**
         * @return destinationCidr
         */
        public String getDestinationCidr() {
            return this.destinationCidr;
        }

        /**
         * @return nextHopId
         */
        public String getNextHopId() {
            return this.nextHopId;
        }

        /**
         * @return nextHopType
         */
        public String getNextHopType() {
            return this.nextHopType;
        }

        /**
         * @return routeTableId
         */
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public static final class Builder {
            private String destinationCidr; 
            private String nextHopId; 
            private String nextHopType; 
            private String routeTableId; 

            private Builder() {
            } 

            private Builder(NatRouteEntryList model) {
                this.destinationCidr = model.destinationCidr;
                this.nextHopId = model.nextHopId;
                this.nextHopType = model.nextHopType;
                this.routeTableId = model.routeTableId;
            } 

            /**
             * DestinationCidr.
             */
            public Builder destinationCidr(String destinationCidr) {
                this.destinationCidr = destinationCidr;
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
             * NextHopType.
             */
            public Builder nextHopType(String nextHopType) {
                this.nextHopType = nextHopType;
                return this;
            }

            /**
             * RouteTableId.
             */
            public Builder routeTableId(String routeTableId) {
                this.routeTableId = routeTableId;
                return this;
            }

            public NatRouteEntryList build() {
                return new NatRouteEntryList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSecurityProxyResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityProxyResourcesResponseBody</p>
     */
    public static class NatGateways extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("NatGatewayId")
        private String natGatewayId;

        @com.aliyun.core.annotation.NameInMap("NatGatewayName")
        private String natGatewayName;

        @com.aliyun.core.annotation.NameInMap("NatRouteEntryList")
        private java.util.List<NatRouteEntryList> natRouteEntryList;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private NatGateways(Builder builder) {
            this.detail = builder.detail;
            this.natGatewayId = builder.natGatewayId;
            this.natGatewayName = builder.natGatewayName;
            this.natRouteEntryList = builder.natRouteEntryList;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NatGateways create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return natGatewayId
         */
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        /**
         * @return natGatewayName
         */
        public String getNatGatewayName() {
            return this.natGatewayName;
        }

        /**
         * @return natRouteEntryList
         */
        public java.util.List<NatRouteEntryList> getNatRouteEntryList() {
            return this.natRouteEntryList;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String detail; 
            private String natGatewayId; 
            private String natGatewayName; 
            private java.util.List<NatRouteEntryList> natRouteEntryList; 
            private String status; 

            private Builder() {
            } 

            private Builder(NatGateways model) {
                this.detail = model.detail;
                this.natGatewayId = model.natGatewayId;
                this.natGatewayName = model.natGatewayName;
                this.natRouteEntryList = model.natRouteEntryList;
                this.status = model.status;
            } 

            /**
             * Detail.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * NatGatewayId.
             */
            public Builder natGatewayId(String natGatewayId) {
                this.natGatewayId = natGatewayId;
                return this;
            }

            /**
             * NatGatewayName.
             */
            public Builder natGatewayName(String natGatewayName) {
                this.natGatewayName = natGatewayName;
                return this;
            }

            /**
             * NatRouteEntryList.
             */
            public Builder natRouteEntryList(java.util.List<NatRouteEntryList> natRouteEntryList) {
                this.natRouteEntryList = natRouteEntryList;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public NatGateways build() {
                return new NatGateways(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSecurityProxyResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityProxyResourcesResponseBody</p>
     */
    public static class VpcList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CidrBlock")
        private String cidrBlock;

        @com.aliyun.core.annotation.NameInMap("MemberUid")
        private String memberUid;

        @com.aliyun.core.annotation.NameInMap("NatGateways")
        private java.util.List<NatGateways> natGateways;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcName")
        private String vpcName;

        private VpcList(Builder builder) {
            this.cidrBlock = builder.cidrBlock;
            this.memberUid = builder.memberUid;
            this.natGateways = builder.natGateways;
            this.vpcId = builder.vpcId;
            this.vpcName = builder.vpcName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcList create() {
            return builder().build();
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return memberUid
         */
        public String getMemberUid() {
            return this.memberUid;
        }

        /**
         * @return natGateways
         */
        public java.util.List<NatGateways> getNatGateways() {
            return this.natGateways;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcName
         */
        public String getVpcName() {
            return this.vpcName;
        }

        public static final class Builder {
            private String cidrBlock; 
            private String memberUid; 
            private java.util.List<NatGateways> natGateways; 
            private String vpcId; 
            private String vpcName; 

            private Builder() {
            } 

            private Builder(VpcList model) {
                this.cidrBlock = model.cidrBlock;
                this.memberUid = model.memberUid;
                this.natGateways = model.natGateways;
                this.vpcId = model.vpcId;
                this.vpcName = model.vpcName;
            } 

            /**
             * CidrBlock.
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * MemberUid.
             */
            public Builder memberUid(String memberUid) {
                this.memberUid = memberUid;
                return this;
            }

            /**
             * NatGateways.
             */
            public Builder natGateways(java.util.List<NatGateways> natGateways) {
                this.natGateways = natGateways;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VpcName.
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            public VpcList build() {
                return new VpcList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSecurityProxyResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityProxyResourcesResponseBody</p>
     */
    public static class ResourceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("VpcList")
        private java.util.List<VpcList> vpcList;

        private ResourceList(Builder builder) {
            this.regionNo = builder.regionNo;
            this.vpcList = builder.vpcList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceList create() {
            return builder().build();
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        /**
         * @return vpcList
         */
        public java.util.List<VpcList> getVpcList() {
            return this.vpcList;
        }

        public static final class Builder {
            private String regionNo; 
            private java.util.List<VpcList> vpcList; 

            private Builder() {
            } 

            private Builder(ResourceList model) {
                this.regionNo = model.regionNo;
                this.vpcList = model.vpcList;
            } 

            /**
             * RegionNo.
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * VpcList.
             */
            public Builder vpcList(java.util.List<VpcList> vpcList) {
                this.vpcList = vpcList;
                return this;
            }

            public ResourceList build() {
                return new ResourceList(this);
            } 

        } 

    }
}
