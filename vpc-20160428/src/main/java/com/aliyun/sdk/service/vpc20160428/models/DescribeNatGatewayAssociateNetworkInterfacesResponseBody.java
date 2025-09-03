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
 * {@link DescribeNatGatewayAssociateNetworkInterfacesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNatGatewayAssociateNetworkInterfacesResponseBody</p>
 */
public class DescribeNatGatewayAssociateNetworkInterfacesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssociateNetworkInterfaces")
    private AssociateNetworkInterfaces associateNetworkInterfaces;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    private String natGatewayId;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeNatGatewayAssociateNetworkInterfacesResponseBody(Builder builder) {
        this.associateNetworkInterfaces = builder.associateNetworkInterfaces;
        this.count = builder.count;
        this.maxResults = builder.maxResults;
        this.natGatewayId = builder.natGatewayId;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNatGatewayAssociateNetworkInterfacesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return associateNetworkInterfaces
     */
    public AssociateNetworkInterfaces getAssociateNetworkInterfaces() {
        return this.associateNetworkInterfaces;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
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

    public static final class Builder {
        private AssociateNetworkInterfaces associateNetworkInterfaces; 
        private Integer count; 
        private Integer maxResults; 
        private String natGatewayId; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeNatGatewayAssociateNetworkInterfacesResponseBody model) {
            this.associateNetworkInterfaces = model.associateNetworkInterfaces;
            this.count = model.count;
            this.maxResults = model.maxResults;
            this.natGatewayId = model.natGatewayId;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * AssociateNetworkInterfaces.
         */
        public Builder associateNetworkInterfaces(AssociateNetworkInterfaces associateNetworkInterfaces) {
            this.associateNetworkInterfaces = associateNetworkInterfaces;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
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
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeNatGatewayAssociateNetworkInterfacesResponseBody build() {
            return new DescribeNatGatewayAssociateNetworkInterfacesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNatGatewayAssociateNetworkInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNatGatewayAssociateNetworkInterfacesResponseBody</p>
     */
    public static class IPv4Set extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IPv4Address")
        private String iPv4Address;

        @com.aliyun.core.annotation.NameInMap("Primary")
        private Boolean primary;

        private IPv4Set(Builder builder) {
            this.iPv4Address = builder.iPv4Address;
            this.primary = builder.primary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IPv4Set create() {
            return builder().build();
        }

        /**
         * @return iPv4Address
         */
        public String getIPv4Address() {
            return this.iPv4Address;
        }

        /**
         * @return primary
         */
        public Boolean getPrimary() {
            return this.primary;
        }

        public static final class Builder {
            private String iPv4Address; 
            private Boolean primary; 

            private Builder() {
            } 

            private Builder(IPv4Set model) {
                this.iPv4Address = model.iPv4Address;
                this.primary = model.primary;
            } 

            /**
             * IPv4Address.
             */
            public Builder iPv4Address(String iPv4Address) {
                this.iPv4Address = iPv4Address;
                return this;
            }

            /**
             * Primary.
             */
            public Builder primary(Boolean primary) {
                this.primary = primary;
                return this;
            }

            public IPv4Set build() {
                return new IPv4Set(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNatGatewayAssociateNetworkInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNatGatewayAssociateNetworkInterfacesResponseBody</p>
     */
    public static class IPv4Sets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IPv4Set")
        private java.util.List<IPv4Set> iPv4Set;

        private IPv4Sets(Builder builder) {
            this.iPv4Set = builder.iPv4Set;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IPv4Sets create() {
            return builder().build();
        }

        /**
         * @return iPv4Set
         */
        public java.util.List<IPv4Set> getIPv4Set() {
            return this.iPv4Set;
        }

        public static final class Builder {
            private java.util.List<IPv4Set> iPv4Set; 

            private Builder() {
            } 

            private Builder(IPv4Sets model) {
                this.iPv4Set = model.iPv4Set;
            } 

            /**
             * IPv4Set.
             */
            public Builder iPv4Set(java.util.List<IPv4Set> iPv4Set) {
                this.iPv4Set = iPv4Set;
                return this;
            }

            public IPv4Sets build() {
                return new IPv4Sets(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNatGatewayAssociateNetworkInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNatGatewayAssociateNetworkInterfacesResponseBody</p>
     */
    public static class AssociateNetworkInterface extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IPv4Sets")
        private IPv4Sets iPv4Sets;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
        private String resourceOwnerId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("ResourceVpcId")
        private String resourceVpcId;

        @com.aliyun.core.annotation.NameInMap("TunnelIndex")
        private String tunnelIndex;

        private AssociateNetworkInterface(Builder builder) {
            this.iPv4Sets = builder.iPv4Sets;
            this.networkInterfaceId = builder.networkInterfaceId;
            this.resourceId = builder.resourceId;
            this.resourceOwnerId = builder.resourceOwnerId;
            this.resourceType = builder.resourceType;
            this.resourceVpcId = builder.resourceVpcId;
            this.tunnelIndex = builder.tunnelIndex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssociateNetworkInterface create() {
            return builder().build();
        }

        /**
         * @return iPv4Sets
         */
        public IPv4Sets getIPv4Sets() {
            return this.iPv4Sets;
        }

        /**
         * @return networkInterfaceId
         */
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceOwnerId
         */
        public String getResourceOwnerId() {
            return this.resourceOwnerId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return resourceVpcId
         */
        public String getResourceVpcId() {
            return this.resourceVpcId;
        }

        /**
         * @return tunnelIndex
         */
        public String getTunnelIndex() {
            return this.tunnelIndex;
        }

        public static final class Builder {
            private IPv4Sets iPv4Sets; 
            private String networkInterfaceId; 
            private String resourceId; 
            private String resourceOwnerId; 
            private String resourceType; 
            private String resourceVpcId; 
            private String tunnelIndex; 

            private Builder() {
            } 

            private Builder(AssociateNetworkInterface model) {
                this.iPv4Sets = model.iPv4Sets;
                this.networkInterfaceId = model.networkInterfaceId;
                this.resourceId = model.resourceId;
                this.resourceOwnerId = model.resourceOwnerId;
                this.resourceType = model.resourceType;
                this.resourceVpcId = model.resourceVpcId;
                this.tunnelIndex = model.tunnelIndex;
            } 

            /**
             * IPv4Sets.
             */
            public Builder iPv4Sets(IPv4Sets iPv4Sets) {
                this.iPv4Sets = iPv4Sets;
                return this;
            }

            /**
             * NetworkInterfaceId.
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceOwnerId.
             */
            public Builder resourceOwnerId(String resourceOwnerId) {
                this.resourceOwnerId = resourceOwnerId;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * ResourceVpcId.
             */
            public Builder resourceVpcId(String resourceVpcId) {
                this.resourceVpcId = resourceVpcId;
                return this;
            }

            /**
             * TunnelIndex.
             */
            public Builder tunnelIndex(String tunnelIndex) {
                this.tunnelIndex = tunnelIndex;
                return this;
            }

            public AssociateNetworkInterface build() {
                return new AssociateNetworkInterface(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNatGatewayAssociateNetworkInterfacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNatGatewayAssociateNetworkInterfacesResponseBody</p>
     */
    public static class AssociateNetworkInterfaces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociateNetworkInterface")
        private java.util.List<AssociateNetworkInterface> associateNetworkInterface;

        private AssociateNetworkInterfaces(Builder builder) {
            this.associateNetworkInterface = builder.associateNetworkInterface;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssociateNetworkInterfaces create() {
            return builder().build();
        }

        /**
         * @return associateNetworkInterface
         */
        public java.util.List<AssociateNetworkInterface> getAssociateNetworkInterface() {
            return this.associateNetworkInterface;
        }

        public static final class Builder {
            private java.util.List<AssociateNetworkInterface> associateNetworkInterface; 

            private Builder() {
            } 

            private Builder(AssociateNetworkInterfaces model) {
                this.associateNetworkInterface = model.associateNetworkInterface;
            } 

            /**
             * AssociateNetworkInterface.
             */
            public Builder associateNetworkInterface(java.util.List<AssociateNetworkInterface> associateNetworkInterface) {
                this.associateNetworkInterface = associateNetworkInterface;
                return this;
            }

            public AssociateNetworkInterfaces build() {
                return new AssociateNetworkInterfaces(this);
            } 

        } 

    }
}
