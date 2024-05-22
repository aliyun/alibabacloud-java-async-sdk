// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLoadBalancersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLoadBalancersResponseBody</p>
 */
public class DescribeLoadBalancersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LoadBalancers")
    private LoadBalancers loadBalancers;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeLoadBalancersResponseBody(Builder builder) {
        this.loadBalancers = builder.loadBalancers;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLoadBalancersResponseBody create() {
        return builder().build();
    }

    /**
     * @return loadBalancers
     */
    public LoadBalancers getLoadBalancers() {
        return this.loadBalancers;
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
        private LoadBalancers loadBalancers; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The returned ELB instances.
         */
        public Builder loadBalancers(LoadBalancers loadBalancers) {
            this.loadBalancers = loadBalancers;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Default value: 10. Valid values: **10** to **100**.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeLoadBalancersResponseBody build() {
            return new DescribeLoadBalancersResponseBody(this);
        } 

    } 

    public static class LoadBalancer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("AddressIPVersion")
        private String addressIPVersion;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerName")
        private String loadBalancerName;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerStatus")
        private String loadBalancerStatus;

        @com.aliyun.core.annotation.NameInMap("NetworkId")
        private String networkId;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        private LoadBalancer(Builder builder) {
            this.address = builder.address;
            this.addressIPVersion = builder.addressIPVersion;
            this.createTime = builder.createTime;
            this.ensRegionId = builder.ensRegionId;
            this.loadBalancerId = builder.loadBalancerId;
            this.loadBalancerName = builder.loadBalancerName;
            this.loadBalancerStatus = builder.loadBalancerStatus;
            this.networkId = builder.networkId;
            this.payType = builder.payType;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancer create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return addressIPVersion
         */
        public String getAddressIPVersion() {
            return this.addressIPVersion;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        /**
         * @return loadBalancerName
         */
        public String getLoadBalancerName() {
            return this.loadBalancerName;
        }

        /**
         * @return loadBalancerStatus
         */
        public String getLoadBalancerStatus() {
            return this.loadBalancerStatus;
        }

        /**
         * @return networkId
         */
        public String getNetworkId() {
            return this.networkId;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private String address; 
            private String addressIPVersion; 
            private String createTime; 
            private String ensRegionId; 
            private String loadBalancerId; 
            private String loadBalancerName; 
            private String loadBalancerStatus; 
            private String networkId; 
            private String payType; 
            private String vSwitchId; 

            /**
             * The IP address that the ELB instance uses to provide services.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * The version of the IP address. Valid values: ipv4 and ipv6.
             */
            public Builder addressIPVersion(String addressIPVersion) {
                this.addressIPVersion = addressIPVersion;
                return this;
            }

            /**
             * The time when the ELB instance was created. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the ENS node.
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * The ID of the ELB instance.
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * The name of the ELB instance.
             */
            public Builder loadBalancerName(String loadBalancerName) {
                this.loadBalancerName = loadBalancerName;
                return this;
            }

            /**
             * The status of the ELB instance. Valid values:
             * <p>
             * 
             * *   **Active** (default): The listener for the instance can forward the received traffic based on the rule.
             * *   **InActive**: The listener for the instance does not forward the received traffic.
             */
            public Builder loadBalancerStatus(String loadBalancerStatus) {
                this.loadBalancerStatus = loadBalancerStatus;
                return this;
            }

            /**
             * The ID of the network.
             */
            public Builder networkId(String networkId) {
                this.networkId = networkId;
                return this;
            }

            /**
             * The billing method. Valid values:
             * <p>
             * 
             * *   **PrePaid**: subscription.
             * *   **PostPaid**: pay-as-you-go. Only this billing method is supported.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * The ID of the vSwitch.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public LoadBalancer build() {
                return new LoadBalancer(this);
            } 

        } 

    }
    public static class LoadBalancers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LoadBalancer")
        private java.util.List < LoadBalancer> loadBalancer;

        private LoadBalancers(Builder builder) {
            this.loadBalancer = builder.loadBalancer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancers create() {
            return builder().build();
        }

        /**
         * @return loadBalancer
         */
        public java.util.List < LoadBalancer> getLoadBalancer() {
            return this.loadBalancer;
        }

        public static final class Builder {
            private java.util.List < LoadBalancer> loadBalancer; 

            /**
             * LoadBalancer.
             */
            public Builder loadBalancer(java.util.List < LoadBalancer> loadBalancer) {
                this.loadBalancer = loadBalancer;
                return this;
            }

            public LoadBalancers build() {
                return new LoadBalancers(this);
            } 

        } 

    }
}
