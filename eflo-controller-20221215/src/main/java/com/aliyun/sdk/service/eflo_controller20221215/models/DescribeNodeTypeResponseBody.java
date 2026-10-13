// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link DescribeNodeTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNodeTypeResponseBody</p>
 */
public class DescribeNodeTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DiskQuantity")
    private Integer diskQuantity;

    @com.aliyun.core.annotation.NameInMap("EniHighDenseQuantity")
    private Integer eniHighDenseQuantity;

    @com.aliyun.core.annotation.NameInMap("EniIpv6AddressQuantity")
    private Integer eniIpv6AddressQuantity;

    @com.aliyun.core.annotation.NameInMap("EniPrivateIpAddressQuantity")
    private Integer eniPrivateIpAddressQuantity;

    @com.aliyun.core.annotation.NameInMap("EniQuantity")
    private Integer eniQuantity;

    @com.aliyun.core.annotation.NameInMap("EriQuantity")
    private Integer eriQuantity;

    @com.aliyun.core.annotation.NameInMap("NetworkCardQuantity")
    private Integer networkCardQuantity;

    @com.aliyun.core.annotation.NameInMap("NetworkCards")
    private java.util.List<NetworkCards> networkCards;

    @com.aliyun.core.annotation.NameInMap("PrimaryEniQueueNumber")
    private Integer primaryEniQueueNumber;

    @com.aliyun.core.annotation.NameInMap("QueuePairNumber")
    private Integer queuePairNumber;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecondaryEniQueueNumber")
    private Integer secondaryEniQueueNumber;

    @com.aliyun.core.annotation.NameInMap("TotalEniQueueQuantity")
    private Integer totalEniQueueQuantity;

    private DescribeNodeTypeResponseBody(Builder builder) {
        this.diskQuantity = builder.diskQuantity;
        this.eniHighDenseQuantity = builder.eniHighDenseQuantity;
        this.eniIpv6AddressQuantity = builder.eniIpv6AddressQuantity;
        this.eniPrivateIpAddressQuantity = builder.eniPrivateIpAddressQuantity;
        this.eniQuantity = builder.eniQuantity;
        this.eriQuantity = builder.eriQuantity;
        this.networkCardQuantity = builder.networkCardQuantity;
        this.networkCards = builder.networkCards;
        this.primaryEniQueueNumber = builder.primaryEniQueueNumber;
        this.queuePairNumber = builder.queuePairNumber;
        this.requestId = builder.requestId;
        this.secondaryEniQueueNumber = builder.secondaryEniQueueNumber;
        this.totalEniQueueQuantity = builder.totalEniQueueQuantity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNodeTypeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return diskQuantity
     */
    public Integer getDiskQuantity() {
        return this.diskQuantity;
    }

    /**
     * @return eniHighDenseQuantity
     */
    public Integer getEniHighDenseQuantity() {
        return this.eniHighDenseQuantity;
    }

    /**
     * @return eniIpv6AddressQuantity
     */
    public Integer getEniIpv6AddressQuantity() {
        return this.eniIpv6AddressQuantity;
    }

    /**
     * @return eniPrivateIpAddressQuantity
     */
    public Integer getEniPrivateIpAddressQuantity() {
        return this.eniPrivateIpAddressQuantity;
    }

    /**
     * @return eniQuantity
     */
    public Integer getEniQuantity() {
        return this.eniQuantity;
    }

    /**
     * @return eriQuantity
     */
    public Integer getEriQuantity() {
        return this.eriQuantity;
    }

    /**
     * @return networkCardQuantity
     */
    public Integer getNetworkCardQuantity() {
        return this.networkCardQuantity;
    }

    /**
     * @return networkCards
     */
    public java.util.List<NetworkCards> getNetworkCards() {
        return this.networkCards;
    }

    /**
     * @return primaryEniQueueNumber
     */
    public Integer getPrimaryEniQueueNumber() {
        return this.primaryEniQueueNumber;
    }

    /**
     * @return queuePairNumber
     */
    public Integer getQueuePairNumber() {
        return this.queuePairNumber;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return secondaryEniQueueNumber
     */
    public Integer getSecondaryEniQueueNumber() {
        return this.secondaryEniQueueNumber;
    }

    /**
     * @return totalEniQueueQuantity
     */
    public Integer getTotalEniQueueQuantity() {
        return this.totalEniQueueQuantity;
    }

    public static final class Builder {
        private Integer diskQuantity; 
        private Integer eniHighDenseQuantity; 
        private Integer eniIpv6AddressQuantity; 
        private Integer eniPrivateIpAddressQuantity; 
        private Integer eniQuantity; 
        private Integer eriQuantity; 
        private Integer networkCardQuantity; 
        private java.util.List<NetworkCards> networkCards; 
        private Integer primaryEniQueueNumber; 
        private Integer queuePairNumber; 
        private String requestId; 
        private Integer secondaryEniQueueNumber; 
        private Integer totalEniQueueQuantity; 

        private Builder() {
        } 

        private Builder(DescribeNodeTypeResponseBody model) {
            this.diskQuantity = model.diskQuantity;
            this.eniHighDenseQuantity = model.eniHighDenseQuantity;
            this.eniIpv6AddressQuantity = model.eniIpv6AddressQuantity;
            this.eniPrivateIpAddressQuantity = model.eniPrivateIpAddressQuantity;
            this.eniQuantity = model.eniQuantity;
            this.eriQuantity = model.eriQuantity;
            this.networkCardQuantity = model.networkCardQuantity;
            this.networkCards = model.networkCards;
            this.primaryEniQueueNumber = model.primaryEniQueueNumber;
            this.queuePairNumber = model.queuePairNumber;
            this.requestId = model.requestId;
            this.secondaryEniQueueNumber = model.secondaryEniQueueNumber;
            this.totalEniQueueQuantity = model.totalEniQueueQuantity;
        } 

        /**
         * <p>The maximum number of cloud disks that can be mounted.</p>
         * 
         * <strong>example:</strong>
         * <p>17</p>
         */
        public Builder diskQuantity(Integer diskQuantity) {
            this.diskQuantity = diskQuantity;
            return this;
        }

        /**
         * <p>The maximum number of network interface controllers (NICs) in high-density mode.</p>
         * 
         * <strong>example:</strong>
         * <p>63</p>
         */
        public Builder eniHighDenseQuantity(Integer eniHighDenseQuantity) {
            this.eniHighDenseQuantity = eniHighDenseQuantity;
            return this;
        }

        /**
         * <p>The maximum number of IPv6 addresses supported by a NIC.</p>
         * 
         * <strong>example:</strong>
         * <p>256</p>
         */
        public Builder eniIpv6AddressQuantity(Integer eniIpv6AddressQuantity) {
            this.eniIpv6AddressQuantity = eniIpv6AddressQuantity;
            return this;
        }

        /**
         * <p>The maximum number of IPv4 addresses supported by a NIC.</p>
         * 
         * <strong>example:</strong>
         * <p>256</p>
         */
        public Builder eniPrivateIpAddressQuantity(Integer eniPrivateIpAddressQuantity) {
            this.eniPrivateIpAddressQuantity = eniPrivateIpAddressQuantity;
            return this;
        }

        /**
         * <p>The maximum number of elastic network interfaces (ENIs) supported, including primary and secondary ENIs.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        public Builder eniQuantity(Integer eniQuantity) {
            this.eniQuantity = eniQuantity;
            return this;
        }

        /**
         * <p>The number of Elastic RDMA Interfaces (ERIs) for the current specification.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        public Builder eriQuantity(Integer eriQuantity) {
            this.eriQuantity = eriQuantity;
            return this;
        }

        /**
         * <p>The number of physical network interface controllers (NICs) supported by the instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder networkCardQuantity(Integer networkCardQuantity) {
            this.networkCardQuantity = networkCardQuantity;
            return this;
        }

        /**
         * <p>The list of physical network interface controllers (NICs), including the details of each physical NIC.</p>
         */
        public Builder networkCards(java.util.List<NetworkCards> networkCards) {
            this.networkCards = networkCards;
            return this;
        }

        /**
         * <p>The default number of queues for the primary NIC.</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        public Builder primaryEniQueueNumber(Integer primaryEniQueueNumber) {
            this.primaryEniQueueNumber = primaryEniQueueNumber;
            return this;
        }

        /**
         * <p>The number of queue pairs (QPs) for all Elastic RDMA Interfaces (ERIs) of the current specification.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder queuePairNumber(Integer queuePairNumber) {
            this.queuePairNumber = queuePairNumber;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4FD06DF0-9167-5C6F-A145-F30CA4A15D54</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The default number of queues for secondary elastic network interfaces (ENIs).</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        public Builder secondaryEniQueueNumber(Integer secondaryEniQueueNumber) {
            this.secondaryEniQueueNumber = secondaryEniQueueNumber;
            return this;
        }

        /**
         * <p>The total queue quota for elastic network interface controllers (NICs) of the current specification.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        public Builder totalEniQueueQuantity(Integer totalEniQueueQuantity) {
            this.totalEniQueueQuantity = totalEniQueueQuantity;
            return this;
        }

        public DescribeNodeTypeResponseBody build() {
            return new DescribeNodeTypeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNodeTypeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNodeTypeResponseBody</p>
     */
    public static class NetworkCards extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetworkCardIndex")
        private Integer networkCardIndex;

        private NetworkCards(Builder builder) {
            this.networkCardIndex = builder.networkCardIndex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkCards create() {
            return builder().build();
        }

        /**
         * @return networkCardIndex
         */
        public Integer getNetworkCardIndex() {
            return this.networkCardIndex;
        }

        public static final class Builder {
            private Integer networkCardIndex; 

            private Builder() {
            } 

            private Builder(NetworkCards model) {
                this.networkCardIndex = model.networkCardIndex;
            } 

            /**
             * <p>The index of the physical network interface controller (NIC), starting from 0. You can specify this index to attach elastic network interfaces (ENIs) to different underlying physical network interface controllers (NICs).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder networkCardIndex(Integer networkCardIndex) {
                this.networkCardIndex = networkCardIndex;
                return this;
            }

            public NetworkCards build() {
                return new NetworkCards(this);
            } 

        } 

    }
}
