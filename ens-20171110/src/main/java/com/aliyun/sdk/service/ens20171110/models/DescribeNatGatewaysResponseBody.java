// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeNatGatewaysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNatGatewaysResponseBody</p>
 */
public class DescribeNatGatewaysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NatGateways")
    private java.util.List<NatGateways> natGateways;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeNatGatewaysResponseBody(Builder builder) {
        this.natGateways = builder.natGateways;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNatGatewaysResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return natGateways
     */
    public java.util.List<NatGateways> getNatGateways() {
        return this.natGateways;
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
        private java.util.List<NatGateways> natGateways; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeNatGatewaysResponseBody model) {
            this.natGateways = model.natGateways;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The details of the NAT gateways.</p>
         */
        public Builder natGateways(java.util.List<NatGateways> natGateways) {
            this.natGateways = natGateways;
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2818A8F4-5E2B-5611-8732-5ACF7B677059</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of NAT gateways that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>49</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeNatGatewaysResponseBody build() {
            return new DescribeNatGatewaysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNatGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNatGatewaysResponseBody</p>
     */
    public static class IpLists extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocationId")
        private String allocationId;

        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private String ipAddress;

        @com.aliyun.core.annotation.NameInMap("UsingStatus")
        private String usingStatus;

        private IpLists(Builder builder) {
            this.allocationId = builder.allocationId;
            this.ipAddress = builder.ipAddress;
            this.usingStatus = builder.usingStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpLists create() {
            return builder().build();
        }

        /**
         * @return allocationId
         */
        public String getAllocationId() {
            return this.allocationId;
        }

        /**
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return usingStatus
         */
        public String getUsingStatus() {
            return this.usingStatus;
        }

        public static final class Builder {
            private String allocationId; 
            private String ipAddress; 
            private String usingStatus; 

            private Builder() {
            } 

            private Builder(IpLists model) {
                this.allocationId = model.allocationId;
                this.ipAddress = model.ipAddress;
                this.usingStatus = model.usingStatus;
            } 

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>eip-50g****</p>
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * <p>The IP address of the EIP associated with the NAT gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>8.XX.XX.162</p>
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * <p>The association between the EIP and the Internet NAT gateway. Valid values:</p>
             * <ul>
             * <li><strong>UsedByForwardTable</strong>: The EIP is specified in a DNAT entry.</li>
             * <li><strong>UsedBySnatTable</strong>: The EIP is specified in an SNAT entry.</li>
             * <li><strong>UsedByForwardSnatTable</strong>: The EIP is specified in both an SNAT entry and a DNAT entry.</li>
             * <li><strong>Idle</strong>: The EIP is not specified in a DNAT or SNAT entry.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Idle</p>
             */
            public Builder usingStatus(String usingStatus) {
                this.usingStatus = usingStatus;
                return this;
            }

            public IpLists build() {
                return new IpLists(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNatGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNatGatewaysResponseBody</p>
     */
    public static class NatGateways extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("IpLists")
        private java.util.List<IpLists> ipLists;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NatGatewayId")
        private String natGatewayId;

        @com.aliyun.core.annotation.NameInMap("NetworkId")
        private String networkId;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        private NatGateways(Builder builder) {
            this.creationTime = builder.creationTime;
            this.ensRegionId = builder.ensRegionId;
            this.ipLists = builder.ipLists;
            this.name = builder.name;
            this.natGatewayId = builder.natGatewayId;
            this.networkId = builder.networkId;
            this.spec = builder.spec;
            this.status = builder.status;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NatGateways create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return ipLists
         */
        public java.util.List<IpLists> getIpLists() {
            return this.ipLists;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return natGatewayId
         */
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        /**
         * @return networkId
         */
        public String getNetworkId() {
            return this.networkId;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private String creationTime; 
            private String ensRegionId; 
            private java.util.List<IpLists> ipLists; 
            private String name; 
            private String natGatewayId; 
            private String networkId; 
            private String spec; 
            private String status; 
            private String vSwitchId; 

            private Builder() {
            } 

            private Builder(NatGateways model) {
                this.creationTime = model.creationTime;
                this.ensRegionId = model.ensRegionId;
                this.ipLists = model.ipLists;
                this.name = model.name;
                this.natGatewayId = model.natGatewayId;
                this.networkId = model.networkId;
                this.spec = model.spec;
                this.status = model.status;
                this.vSwitchId = model.vSwitchId;
            } 

            /**
             * <p>The time when the NAT gateway was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-22T07:03:32Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The ID of the ENS node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-xiangyang-5</p>
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * <p>The list of elastic IP addresses (EIPs) that are associated with the Internet NAT gateway.</p>
             */
            public Builder ipLists(java.util.List<IpLists> ipLists) {
                this.ipLists = ipLists;
                return this;
            }

            /**
             * <p>The name of the NAT gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>test0</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the NAT gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>nat-5t7nh1cfm6kxiszlttr38****</p>
             */
            public Builder natGatewayId(String natGatewayId) {
                this.natGatewayId = natGatewayId;
                return this;
            }

            /**
             * <p>The ID of the network.</p>
             * 
             * <strong>example:</strong>
             * <p>n-5s2ml1olj0kzaws9n1yrj****</p>
             */
            public Builder networkId(String networkId) {
                this.networkId = networkId;
                return this;
            }

            /**
             * <p>The type of the NAT gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>enat.default</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * <p>The status of the SNAT entry.</p>
             * <ul>
             * <li>Pending: The SNAT entry is being created or modified.</li>
             * <li>Available: The SNAT entry is available.</li>
             * <li>Deleting: The SNAT entry is being deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-5szpp1os9m55myirbflfw****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public NatGateways build() {
                return new NatGateways(this);
            } 

        } 

    }
}
