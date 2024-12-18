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
 * {@link DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody</p>
 */
public class DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("VirtualBorderRouterForPhysicalConnectionSet")
    private VirtualBorderRouterForPhysicalConnectionSet virtualBorderRouterForPhysicalConnectionSet;

    private DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.virtualBorderRouterForPhysicalConnectionSet = builder.virtualBorderRouterForPhysicalConnectionSet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody create() {
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return virtualBorderRouterForPhysicalConnectionSet
     */
    public VirtualBorderRouterForPhysicalConnectionSet getVirtualBorderRouterForPhysicalConnectionSet() {
        return this.virtualBorderRouterForPhysicalConnectionSet;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private VirtualBorderRouterForPhysicalConnectionSet virtualBorderRouterForPhysicalConnectionSet; 

        /**
         * <p>The page number. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
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
         * <p>7C5AE8B3-A2D8-428D-A2FF-93A225C0821E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The information about VBRs.</p>
         */
        public Builder virtualBorderRouterForPhysicalConnectionSet(VirtualBorderRouterForPhysicalConnectionSet virtualBorderRouterForPhysicalConnectionSet) {
            this.virtualBorderRouterForPhysicalConnectionSet = virtualBorderRouterForPhysicalConnectionSet;
            return this;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody build() {
            return new DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody</p>
     */
    public static class VirtualBorderRouterForPhysicalConnectionType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivationTime")
        private String activationTime;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private String bandwidth;

        @com.aliyun.core.annotation.NameInMap("BandwidthStatus")
        private String bandwidthStatus;

        @com.aliyun.core.annotation.NameInMap("CircuitCode")
        private String circuitCode;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("EccId")
        private String eccId;

        @com.aliyun.core.annotation.NameInMap("EnableIpv6")
        private Boolean enableIpv6;

        @com.aliyun.core.annotation.NameInMap("LocalGatewayIp")
        private String localGatewayIp;

        @com.aliyun.core.annotation.NameInMap("LocalIpv6GatewayIp")
        private String localIpv6GatewayIp;

        @com.aliyun.core.annotation.NameInMap("PConnVbrBussinessStatus")
        private String pConnVbrBussinessStatus;

        @com.aliyun.core.annotation.NameInMap("PConnVbrChargeType")
        private String pConnVbrChargeType;

        @com.aliyun.core.annotation.NameInMap("PConnVbrExpireTime")
        private String pConnVbrExpireTime;

        @com.aliyun.core.annotation.NameInMap("PeerGatewayIp")
        private String peerGatewayIp;

        @com.aliyun.core.annotation.NameInMap("PeerIpv6GatewayIp")
        private String peerIpv6GatewayIp;

        @com.aliyun.core.annotation.NameInMap("PeeringIpv6SubnetMask")
        private String peeringIpv6SubnetMask;

        @com.aliyun.core.annotation.NameInMap("PeeringSubnetMask")
        private String peeringSubnetMask;

        @com.aliyun.core.annotation.NameInMap("RecoveryTime")
        private String recoveryTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TerminationTime")
        private String terminationTime;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("VbrId")
        private String vbrId;

        @com.aliyun.core.annotation.NameInMap("VbrOwnerUid")
        private Long vbrOwnerUid;

        @com.aliyun.core.annotation.NameInMap("VlanId")
        private Integer vlanId;

        private VirtualBorderRouterForPhysicalConnectionType(Builder builder) {
            this.activationTime = builder.activationTime;
            this.bandwidth = builder.bandwidth;
            this.bandwidthStatus = builder.bandwidthStatus;
            this.circuitCode = builder.circuitCode;
            this.creationTime = builder.creationTime;
            this.eccId = builder.eccId;
            this.enableIpv6 = builder.enableIpv6;
            this.localGatewayIp = builder.localGatewayIp;
            this.localIpv6GatewayIp = builder.localIpv6GatewayIp;
            this.pConnVbrBussinessStatus = builder.pConnVbrBussinessStatus;
            this.pConnVbrChargeType = builder.pConnVbrChargeType;
            this.pConnVbrExpireTime = builder.pConnVbrExpireTime;
            this.peerGatewayIp = builder.peerGatewayIp;
            this.peerIpv6GatewayIp = builder.peerIpv6GatewayIp;
            this.peeringIpv6SubnetMask = builder.peeringIpv6SubnetMask;
            this.peeringSubnetMask = builder.peeringSubnetMask;
            this.recoveryTime = builder.recoveryTime;
            this.status = builder.status;
            this.terminationTime = builder.terminationTime;
            this.type = builder.type;
            this.vbrId = builder.vbrId;
            this.vbrOwnerUid = builder.vbrOwnerUid;
            this.vlanId = builder.vlanId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VirtualBorderRouterForPhysicalConnectionType create() {
            return builder().build();
        }

        /**
         * @return activationTime
         */
        public String getActivationTime() {
            return this.activationTime;
        }

        /**
         * @return bandwidth
         */
        public String getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return bandwidthStatus
         */
        public String getBandwidthStatus() {
            return this.bandwidthStatus;
        }

        /**
         * @return circuitCode
         */
        public String getCircuitCode() {
            return this.circuitCode;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return eccId
         */
        public String getEccId() {
            return this.eccId;
        }

        /**
         * @return enableIpv6
         */
        public Boolean getEnableIpv6() {
            return this.enableIpv6;
        }

        /**
         * @return localGatewayIp
         */
        public String getLocalGatewayIp() {
            return this.localGatewayIp;
        }

        /**
         * @return localIpv6GatewayIp
         */
        public String getLocalIpv6GatewayIp() {
            return this.localIpv6GatewayIp;
        }

        /**
         * @return pConnVbrBussinessStatus
         */
        public String getPConnVbrBussinessStatus() {
            return this.pConnVbrBussinessStatus;
        }

        /**
         * @return pConnVbrChargeType
         */
        public String getPConnVbrChargeType() {
            return this.pConnVbrChargeType;
        }

        /**
         * @return pConnVbrExpireTime
         */
        public String getPConnVbrExpireTime() {
            return this.pConnVbrExpireTime;
        }

        /**
         * @return peerGatewayIp
         */
        public String getPeerGatewayIp() {
            return this.peerGatewayIp;
        }

        /**
         * @return peerIpv6GatewayIp
         */
        public String getPeerIpv6GatewayIp() {
            return this.peerIpv6GatewayIp;
        }

        /**
         * @return peeringIpv6SubnetMask
         */
        public String getPeeringIpv6SubnetMask() {
            return this.peeringIpv6SubnetMask;
        }

        /**
         * @return peeringSubnetMask
         */
        public String getPeeringSubnetMask() {
            return this.peeringSubnetMask;
        }

        /**
         * @return recoveryTime
         */
        public String getRecoveryTime() {
            return this.recoveryTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return terminationTime
         */
        public String getTerminationTime() {
            return this.terminationTime;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return vbrId
         */
        public String getVbrId() {
            return this.vbrId;
        }

        /**
         * @return vbrOwnerUid
         */
        public Long getVbrOwnerUid() {
            return this.vbrOwnerUid;
        }

        /**
         * @return vlanId
         */
        public Integer getVlanId() {
            return this.vlanId;
        }

        public static final class Builder {
            private String activationTime; 
            private String bandwidth; 
            private String bandwidthStatus; 
            private String circuitCode; 
            private String creationTime; 
            private String eccId; 
            private Boolean enableIpv6; 
            private String localGatewayIp; 
            private String localIpv6GatewayIp; 
            private String pConnVbrBussinessStatus; 
            private String pConnVbrChargeType; 
            private String pConnVbrExpireTime; 
            private String peerGatewayIp; 
            private String peerIpv6GatewayIp; 
            private String peeringIpv6SubnetMask; 
            private String peeringSubnetMask; 
            private String recoveryTime; 
            private String status; 
            private String terminationTime; 
            private String type; 
            private String vbrId; 
            private Long vbrOwnerUid; 
            private Integer vlanId; 

            /**
             * <p>The time when the VBR was first activated.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-08T12:20:55</p>
             */
            public Builder activationTime(String activationTime) {
                this.activationTime = activationTime;
                return this;
            }

            /**
             * <p>The bandwidth of the VBR that is associated with the Express Connect circuit. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder bandwidth(String bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The status of the bandwidth. Valid values:</p>
             * <ul>
             * <li><strong>Active</strong></li>
             * <li><strong>Inactive</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder bandwidthStatus(String bandwidthStatus) {
                this.bandwidthStatus = bandwidthStatus;
                return this;
            }

            /**
             * <p>The circuit code of the Express Connect circuit. The circuit code is provided by the connectivity provider.</p>
             * 
             * <strong>example:</strong>
             * <p>longtel0**</p>
             */
            public Builder circuitCode(String circuitCode) {
                this.circuitCode = circuitCode;
                return this;
            }

            /**
             * <p>The time when the VBR was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-08T12:20:55</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The ID of the ECC instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ecc-sjghe****</p>
             */
            public Builder eccId(String eccId) {
                this.eccId = eccId;
                return this;
            }

            /**
             * <p>Indicates whether IPv6 is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableIpv6(Boolean enableIpv6) {
                this.enableIpv6 = enableIpv6;
                return this;
            }

            /**
             * <p>The IPv4 address of the gateway device on the Alibaba Cloud side.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.X</p>
             */
            public Builder localGatewayIp(String localGatewayIp) {
                this.localGatewayIp = localGatewayIp;
                return this;
            }

            /**
             * <p>The IPv6 address of the gateway device on the Alibaba Cloud side.</p>
             * 
             * <strong>example:</strong>
             * <p>ipv6bw-uf6hcyzu65v98v3du****</p>
             */
            public Builder localIpv6GatewayIp(String localIpv6GatewayIp) {
                this.localIpv6GatewayIp = localIpv6GatewayIp;
                return this;
            }

            /**
             * <p>The status of the VBR associated with the Express Connect circuit. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong></li>
             * <li><strong>FinancialLocked</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder pConnVbrBussinessStatus(String pConnVbrBussinessStatus) {
                this.pConnVbrBussinessStatus = pConnVbrBussinessStatus;
                return this;
            }

            /**
             * <p>The billing method of the VBR. Valid values:</p>
             * <ul>
             * <li><strong>PrePaid</strong>: subscription. If you choose this billing method, make sure that your Apsara Stack account supports balance payments or credit payments.</li>
             * <li><strong>PostPaid</strong>: pay-as-you-go.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PrePaid</p>
             */
            public Builder pConnVbrChargeType(String pConnVbrChargeType) {
                this.pConnVbrChargeType = pConnVbrChargeType;
                return this;
            }

            /**
             * <p>The time when the VBR associated with the Express Connect circuit expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-10T12:20:55</p>
             */
            public Builder pConnVbrExpireTime(String pConnVbrExpireTime) {
                this.pConnVbrExpireTime = pConnVbrExpireTime;
                return this;
            }

            /**
             * <p>The IPv4 address of the gateway device on the user side.</p>
             * 
             * <strong>example:</strong>
             * <p>162.62.XX.XX</p>
             */
            public Builder peerGatewayIp(String peerGatewayIp) {
                this.peerGatewayIp = peerGatewayIp;
                return this;
            }

            /**
             * <p>The IPv6 address of the gateway device on the user side.</p>
             * <p>This parameter is required when you create a VBR for the owner of the Express Connect circuit. You can ignore this parameter when you create a VBR for another Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>2001:XXXX:3c4d:0015:0000:0000:0000:1a2b</p>
             */
            public Builder peerIpv6GatewayIp(String peerIpv6GatewayIp) {
                this.peerIpv6GatewayIp = peerIpv6GatewayIp;
                return this;
            }

            /**
             * <p>The subnet mask for the IPv6 addresses of the gateway devices on the Alibaba Cloud side and on the user side.</p>
             * <p>The two IPv6 addresses must fall within the same subnet.</p>
             * 
             * <strong>example:</strong>
             * <p>2408:4004:cc:400::/56</p>
             */
            public Builder peeringIpv6SubnetMask(String peeringIpv6SubnetMask) {
                this.peeringIpv6SubnetMask = peeringIpv6SubnetMask;
                return this;
            }

            /**
             * <p>The subnet mask of the IPv4 addresses configured on the user side and Alibaba Cloud side.</p>
             * <p>The two IPv4 addresses must fall within the same subnet.</p>
             * 
             * <strong>example:</strong>
             * <p>255.255.255.0</p>
             */
            public Builder peeringSubnetMask(String peeringSubnetMask) {
                this.peeringSubnetMask = peeringSubnetMask;
                return this;
            }

            /**
             * <p>The last time when the status of the VBR changed from Terminated to Active.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-08T12:20:55</p>
             */
            public Builder recoveryTime(String recoveryTime) {
                this.recoveryTime = recoveryTime;
                return this;
            }

            /**
             * <p>The status of the VBR. Valid values:</p>
             * <ul>
             * <li><strong>unconfirmed</strong></li>
             * <li><strong>active</strong></li>
             * <li><strong>terminating</strong></li>
             * <li><strong>terminated</strong></li>
             * <li><strong>recovering</strong></li>
             * <li><strong>deleting</strong></li>
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
             * <p>The last time when the VBR was disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-07T12:20:55</p>
             */
            public Builder terminationTime(String terminationTime) {
                this.terminationTime = terminationTime;
                return this;
            }

            /**
             * <p>The VBR type.</p>
             * 
             * <strong>example:</strong>
             * <p>pconnVBR</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The VBR ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vbr-bp16ksp61j7e0tk****</p>
             */
            public Builder vbrId(String vbrId) {
                this.vbrId = vbrId;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the VBR belongs.</p>
             * <p>If the owner of the VBR is the same as that of the Express Connect circuit, this parameter is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>253460731706911258</p>
             */
            public Builder vbrOwnerUid(Long vbrOwnerUid) {
                this.vbrOwnerUid = vbrOwnerUid;
                return this;
            }

            /**
             * <p>The VLAN ID of the VBR.</p>
             * 
             * <strong>example:</strong>
             * <p>1678</p>
             */
            public Builder vlanId(Integer vlanId) {
                this.vlanId = vlanId;
                return this;
            }

            public VirtualBorderRouterForPhysicalConnectionType build() {
                return new VirtualBorderRouterForPhysicalConnectionType(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVirtualBorderRoutersForPhysicalConnectionResponseBody</p>
     */
    public static class VirtualBorderRouterForPhysicalConnectionSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VirtualBorderRouterForPhysicalConnectionType")
        private java.util.List<VirtualBorderRouterForPhysicalConnectionType> virtualBorderRouterForPhysicalConnectionType;

        private VirtualBorderRouterForPhysicalConnectionSet(Builder builder) {
            this.virtualBorderRouterForPhysicalConnectionType = builder.virtualBorderRouterForPhysicalConnectionType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VirtualBorderRouterForPhysicalConnectionSet create() {
            return builder().build();
        }

        /**
         * @return virtualBorderRouterForPhysicalConnectionType
         */
        public java.util.List<VirtualBorderRouterForPhysicalConnectionType> getVirtualBorderRouterForPhysicalConnectionType() {
            return this.virtualBorderRouterForPhysicalConnectionType;
        }

        public static final class Builder {
            private java.util.List<VirtualBorderRouterForPhysicalConnectionType> virtualBorderRouterForPhysicalConnectionType; 

            /**
             * VirtualBorderRouterForPhysicalConnectionType.
             */
            public Builder virtualBorderRouterForPhysicalConnectionType(java.util.List<VirtualBorderRouterForPhysicalConnectionType> virtualBorderRouterForPhysicalConnectionType) {
                this.virtualBorderRouterForPhysicalConnectionType = virtualBorderRouterForPhysicalConnectionType;
                return this;
            }

            public VirtualBorderRouterForPhysicalConnectionSet build() {
                return new VirtualBorderRouterForPhysicalConnectionSet(this);
            } 

        } 

    }
}
