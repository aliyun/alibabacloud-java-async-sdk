// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnsEipAddressesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEnsEipAddressesResponseBody</p>
 */
public class DescribeEnsEipAddressesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EipAddresses")
    private EipAddresses eipAddresses;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeEnsEipAddressesResponseBody(Builder builder) {
        this.eipAddresses = builder.eipAddresses;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnsEipAddressesResponseBody create() {
        return builder().build();
    }

    /**
     * @return eipAddresses
     */
    public EipAddresses getEipAddresses() {
        return this.eipAddresses;
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
        private EipAddresses eipAddresses; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Details about the EIP.
         */
        public Builder eipAddresses(EipAddresses eipAddresses) {
            this.eipAddresses = eipAddresses;
            return this;
        }

        /**
         * The page number. Valid values: an integer that is greater than 0. Default value: 1.
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

        public DescribeEnsEipAddressesResponseBody build() {
            return new DescribeEnsEipAddressesResponseBody(this);
        } 

    } 

    public static class EipAddress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocationId")
        private String allocationId;

        @com.aliyun.core.annotation.NameInMap("AllocationTime")
        private String allocationTime;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("InternetChargeType")
        private String internetChargeType;

        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private String ipAddress;

        @com.aliyun.core.annotation.NameInMap("IpStatus")
        private String ipStatus;

        @com.aliyun.core.annotation.NameInMap("Isp")
        private String isp;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Standby")
        private Boolean standby;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private EipAddress(Builder builder) {
            this.allocationId = builder.allocationId;
            this.allocationTime = builder.allocationTime;
            this.bandwidth = builder.bandwidth;
            this.chargeType = builder.chargeType;
            this.description = builder.description;
            this.ensRegionId = builder.ensRegionId;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.internetChargeType = builder.internetChargeType;
            this.ipAddress = builder.ipAddress;
            this.ipStatus = builder.ipStatus;
            this.isp = builder.isp;
            this.name = builder.name;
            this.standby = builder.standby;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EipAddress create() {
            return builder().build();
        }

        /**
         * @return allocationId
         */
        public String getAllocationId() {
            return this.allocationId;
        }

        /**
         * @return allocationTime
         */
        public String getAllocationTime() {
            return this.allocationTime;
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
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
         * @return internetChargeType
         */
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        /**
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return ipStatus
         */
        public String getIpStatus() {
            return this.ipStatus;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return standby
         */
        public Boolean getStandby() {
            return this.standby;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String allocationId; 
            private String allocationTime; 
            private Integer bandwidth; 
            private String chargeType; 
            private String description; 
            private String ensRegionId; 
            private String instanceId; 
            private String instanceType; 
            private String internetChargeType; 
            private String ipAddress; 
            private String ipStatus; 
            private String isp; 
            private String name; 
            private Boolean standby; 
            private String status; 

            /**
             * The ID of the EIP.
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * The time when the EIP was created.
             */
            public Builder allocationTime(String allocationTime) {
                this.allocationTime = allocationTime;
                return this;
            }

            /**
             * The peak bandwidth of the EIP. Default value: 5. Valid values: **5** to **10000**. Unit: Mbit/s.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The billing method of the EIP. Valid values:
             * <p>
             * 
             * *   **PrePaid**: subscription.
             * *   **PostPaid**: pay-as-you-go
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * The description of the EIP.
             */
            public Builder description(String description) {
                this.description = description;
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
             * The ID of the instance that is associated with the EIP.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The type of the instance that is associated with the EIP. Valid values:
             * <p>
             * 
             * *   **EnsInstance**: ENS instance in a VPC
             * *   **SlbInstance**: SLB instance
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The metering method of the EIP.
             * <p>
             * 
             * *   **95BandwidthByMonth**: Pay by monthly 95th percentile bandwidth
             * *   **PayByBandwidth**: Pay by bandwidth
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * The EIP.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * The running status of the EIP. This parameter is returned if the EIP is a secondary EIP. Valid values:
             * <p>
             * 
             * *   **Stopped**
             * *   **Running**
             * *   **Starting**
             * *   **Stopping**
             */
            public Builder ipStatus(String ipStatus) {
                this.ipStatus = ipStatus;
                return this;
            }

            /**
             * The Internet service provider (ISP). Valid values:
             * <p>
             * 
             * *   **cmcc**: China Mobile
             * *   **unicom**: China Unicom
             * *   **telecom**: China Telecom
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * The name of the EIP.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Indicates whether the EIP is a secondary EIP.
             */
            public Builder standby(Boolean standby) {
                this.standby = standby;
                return this;
            }

            /**
             * The status of the EIP. Valid values:
             * <p>
             * 
             * *   **Associating**
             * *   **Unassociating**
             * *   **InUse**
             * *   **Available**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public EipAddress build() {
                return new EipAddress(this);
            } 

        } 

    }
    public static class EipAddresses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EipAddress")
        private java.util.List < EipAddress> eipAddress;

        private EipAddresses(Builder builder) {
            this.eipAddress = builder.eipAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EipAddresses create() {
            return builder().build();
        }

        /**
         * @return eipAddress
         */
        public java.util.List < EipAddress> getEipAddress() {
            return this.eipAddress;
        }

        public static final class Builder {
            private java.util.List < EipAddress> eipAddress; 

            /**
             * EipAddress.
             */
            public Builder eipAddress(java.util.List < EipAddress> eipAddress) {
                this.eipAddress = eipAddress;
                return this;
            }

            public EipAddresses build() {
                return new EipAddresses(this);
            } 

        } 

    }
}
