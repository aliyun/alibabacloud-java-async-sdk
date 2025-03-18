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
 * {@link DescribeVSwitchAttributesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVSwitchAttributesResponseBody</p>
 */
public class DescribeVSwitchAttributesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvailableIpAddressCount")
    private Long availableIpAddressCount;

    @com.aliyun.core.annotation.NameInMap("CidrBlock")
    private String cidrBlock;

    @com.aliyun.core.annotation.NameInMap("CreatedTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    private String ensRegionId;

    @com.aliyun.core.annotation.NameInMap("HaVipIds")
    private HaVipIds haVipIds;

    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private InstanceIds instanceIds;

    @com.aliyun.core.annotation.NameInMap("LoadBalancerIds")
    private LoadBalancerIds loadBalancerIds;

    @com.aliyun.core.annotation.NameInMap("NatGatewayIds")
    private NatGatewayIds natGatewayIds;

    @com.aliyun.core.annotation.NameInMap("NetworkId")
    private String networkId;

    @com.aliyun.core.annotation.NameInMap("NetworkInterfaceIds")
    private NetworkInterfaceIds networkInterfaceIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.NameInMap("VSwitchName")
    private String vSwitchName;

    private DescribeVSwitchAttributesResponseBody(Builder builder) {
        this.availableIpAddressCount = builder.availableIpAddressCount;
        this.cidrBlock = builder.cidrBlock;
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.ensRegionId = builder.ensRegionId;
        this.haVipIds = builder.haVipIds;
        this.instanceIds = builder.instanceIds;
        this.loadBalancerIds = builder.loadBalancerIds;
        this.natGatewayIds = builder.natGatewayIds;
        this.networkId = builder.networkId;
        this.networkInterfaceIds = builder.networkInterfaceIds;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.vSwitchId = builder.vSwitchId;
        this.vSwitchName = builder.vSwitchName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVSwitchAttributesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return availableIpAddressCount
     */
    public Long getAvailableIpAddressCount() {
        return this.availableIpAddressCount;
    }

    /**
     * @return cidrBlock
     */
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return haVipIds
     */
    public HaVipIds getHaVipIds() {
        return this.haVipIds;
    }

    /**
     * @return instanceIds
     */
    public InstanceIds getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return loadBalancerIds
     */
    public LoadBalancerIds getLoadBalancerIds() {
        return this.loadBalancerIds;
    }

    /**
     * @return natGatewayIds
     */
    public NatGatewayIds getNatGatewayIds() {
        return this.natGatewayIds;
    }

    /**
     * @return networkId
     */
    public String getNetworkId() {
        return this.networkId;
    }

    /**
     * @return networkInterfaceIds
     */
    public NetworkInterfaceIds getNetworkInterfaceIds() {
        return this.networkInterfaceIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    /**
     * @return vSwitchName
     */
    public String getVSwitchName() {
        return this.vSwitchName;
    }

    public static final class Builder {
        private Long availableIpAddressCount; 
        private String cidrBlock; 
        private String createdTime; 
        private String description; 
        private String ensRegionId; 
        private HaVipIds haVipIds; 
        private InstanceIds instanceIds; 
        private LoadBalancerIds loadBalancerIds; 
        private NatGatewayIds natGatewayIds; 
        private String networkId; 
        private NetworkInterfaceIds networkInterfaceIds; 
        private String requestId; 
        private String status; 
        private String vSwitchId; 
        private String vSwitchName; 

        private Builder() {
        } 

        private Builder(DescribeVSwitchAttributesResponseBody model) {
            this.availableIpAddressCount = model.availableIpAddressCount;
            this.cidrBlock = model.cidrBlock;
            this.createdTime = model.createdTime;
            this.description = model.description;
            this.ensRegionId = model.ensRegionId;
            this.haVipIds = model.haVipIds;
            this.instanceIds = model.instanceIds;
            this.loadBalancerIds = model.loadBalancerIds;
            this.natGatewayIds = model.natGatewayIds;
            this.networkId = model.networkId;
            this.networkInterfaceIds = model.networkInterfaceIds;
            this.requestId = model.requestId;
            this.status = model.status;
            this.vSwitchId = model.vSwitchId;
            this.vSwitchName = model.vSwitchName;
        } 

        /**
         * AvailableIpAddressCount.
         */
        public Builder availableIpAddressCount(Long availableIpAddressCount) {
            this.availableIpAddressCount = availableIpAddressCount;
            return this;
        }

        /**
         * CidrBlock.
         */
        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * CreatedTime.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * EnsRegionId.
         */
        public Builder ensRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * HaVipIds.
         */
        public Builder haVipIds(HaVipIds haVipIds) {
            this.haVipIds = haVipIds;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(InstanceIds instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * LoadBalancerIds.
         */
        public Builder loadBalancerIds(LoadBalancerIds loadBalancerIds) {
            this.loadBalancerIds = loadBalancerIds;
            return this;
        }

        /**
         * NatGatewayIds.
         */
        public Builder natGatewayIds(NatGatewayIds natGatewayIds) {
            this.natGatewayIds = natGatewayIds;
            return this;
        }

        /**
         * NetworkId.
         */
        public Builder networkId(String networkId) {
            this.networkId = networkId;
            return this;
        }

        /**
         * NetworkInterfaceIds.
         */
        public Builder networkInterfaceIds(NetworkInterfaceIds networkInterfaceIds) {
            this.networkInterfaceIds = networkInterfaceIds;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * VSwitchName.
         */
        public Builder vSwitchName(String vSwitchName) {
            this.vSwitchName = vSwitchName;
            return this;
        }

        public DescribeVSwitchAttributesResponseBody build() {
            return new DescribeVSwitchAttributesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVSwitchAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVSwitchAttributesResponseBody</p>
     */
    public static class HaVipIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HaVipId")
        private java.util.List<String> haVipId;

        private HaVipIds(Builder builder) {
            this.haVipId = builder.haVipId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HaVipIds create() {
            return builder().build();
        }

        /**
         * @return haVipId
         */
        public java.util.List<String> getHaVipId() {
            return this.haVipId;
        }

        public static final class Builder {
            private java.util.List<String> haVipId; 

            private Builder() {
            } 

            private Builder(HaVipIds model) {
                this.haVipId = model.haVipId;
            } 

            /**
             * HaVipId.
             */
            public Builder haVipId(java.util.List<String> haVipId) {
                this.haVipId = haVipId;
                return this;
            }

            public HaVipIds build() {
                return new HaVipIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVSwitchAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVSwitchAttributesResponseBody</p>
     */
    public static class InstanceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private java.util.List<String> instanceId;

        private InstanceIds(Builder builder) {
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceIds create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public java.util.List<String> getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private java.util.List<String> instanceId; 

            private Builder() {
            } 

            private Builder(InstanceIds model) {
                this.instanceId = model.instanceId;
            } 

            /**
             * InstanceId.
             */
            public Builder instanceId(java.util.List<String> instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public InstanceIds build() {
                return new InstanceIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVSwitchAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVSwitchAttributesResponseBody</p>
     */
    public static class LoadBalancerIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
        private java.util.List<String> loadBalancerId;

        private LoadBalancerIds(Builder builder) {
            this.loadBalancerId = builder.loadBalancerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancerIds create() {
            return builder().build();
        }

        /**
         * @return loadBalancerId
         */
        public java.util.List<String> getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public static final class Builder {
            private java.util.List<String> loadBalancerId; 

            private Builder() {
            } 

            private Builder(LoadBalancerIds model) {
                this.loadBalancerId = model.loadBalancerId;
            } 

            /**
             * LoadBalancerId.
             */
            public Builder loadBalancerId(java.util.List<String> loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            public LoadBalancerIds build() {
                return new LoadBalancerIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVSwitchAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVSwitchAttributesResponseBody</p>
     */
    public static class NatGatewayIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NatGatewayId")
        private java.util.List<String> natGatewayId;

        private NatGatewayIds(Builder builder) {
            this.natGatewayId = builder.natGatewayId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NatGatewayIds create() {
            return builder().build();
        }

        /**
         * @return natGatewayId
         */
        public java.util.List<String> getNatGatewayId() {
            return this.natGatewayId;
        }

        public static final class Builder {
            private java.util.List<String> natGatewayId; 

            private Builder() {
            } 

            private Builder(NatGatewayIds model) {
                this.natGatewayId = model.natGatewayId;
            } 

            /**
             * NatGatewayId.
             */
            public Builder natGatewayId(java.util.List<String> natGatewayId) {
                this.natGatewayId = natGatewayId;
                return this;
            }

            public NatGatewayIds build() {
                return new NatGatewayIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVSwitchAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVSwitchAttributesResponseBody</p>
     */
    public static class NetworkInterfaceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
        private java.util.List<String> networkInterfaceId;

        private NetworkInterfaceIds(Builder builder) {
            this.networkInterfaceId = builder.networkInterfaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInterfaceIds create() {
            return builder().build();
        }

        /**
         * @return networkInterfaceId
         */
        public java.util.List<String> getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public static final class Builder {
            private java.util.List<String> networkInterfaceId; 

            private Builder() {
            } 

            private Builder(NetworkInterfaceIds model) {
                this.networkInterfaceId = model.networkInterfaceId;
            } 

            /**
             * NetworkInterfaceId.
             */
            public Builder networkInterfaceId(java.util.List<String> networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            public NetworkInterfaceIds build() {
                return new NetworkInterfaceIds(this);
            } 

        } 

    }
}
