// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNetworkInterfacesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNetworkInterfacesResponseBody</p>
 */
public class DescribeNetworkInterfacesResponseBody extends TeaModel {
    @NameInMap("NetworkInterfaceSets")
    private NetworkInterfaceSets networkInterfaceSets;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeNetworkInterfacesResponseBody(Builder builder) {
        this.networkInterfaceSets = builder.networkInterfaceSets;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkInterfacesResponseBody create() {
        return builder().build();
    }

    /**
     * @return networkInterfaceSets
     */
    public NetworkInterfaceSets getNetworkInterfaceSets() {
        return this.networkInterfaceSets;
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
        private NetworkInterfaceSets networkInterfaceSets; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * NetworkInterfaceSets.
         */
        public Builder networkInterfaceSets(NetworkInterfaceSets networkInterfaceSets) {
            this.networkInterfaceSets = networkInterfaceSets;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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

        public DescribeNetworkInterfacesResponseBody build() {
            return new DescribeNetworkInterfacesResponseBody(this);
        } 

    } 

    public static class NetworkInterfaceSet extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("EnsRegionId")
        private String ensRegionId;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("MacAddress")
        private String macAddress;

        @NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        @NameInMap("PrimaryIp")
        private String primaryIp;

        @NameInMap("PrimaryIpType")
        private String primaryIpType;

        @NameInMap("Status")
        private String status;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        private NetworkInterfaceSet(Builder builder) {
            this.creationTime = builder.creationTime;
            this.ensRegionId = builder.ensRegionId;
            this.instanceId = builder.instanceId;
            this.macAddress = builder.macAddress;
            this.networkInterfaceId = builder.networkInterfaceId;
            this.primaryIp = builder.primaryIp;
            this.primaryIpType = builder.primaryIpType;
            this.status = builder.status;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInterfaceSet create() {
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
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return macAddress
         */
        public String getMacAddress() {
            return this.macAddress;
        }

        /**
         * @return networkInterfaceId
         */
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        /**
         * @return primaryIp
         */
        public String getPrimaryIp() {
            return this.primaryIp;
        }

        /**
         * @return primaryIpType
         */
        public String getPrimaryIpType() {
            return this.primaryIpType;
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
            private String instanceId; 
            private String macAddress; 
            private String networkInterfaceId; 
            private String primaryIp; 
            private String primaryIpType; 
            private String status; 
            private String vSwitchId; 

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * MacAddress.
             */
            public Builder macAddress(String macAddress) {
                this.macAddress = macAddress;
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
             * PrimaryIp.
             */
            public Builder primaryIp(String primaryIp) {
                this.primaryIp = primaryIp;
                return this;
            }

            /**
             * PrimaryIpType.
             */
            public Builder primaryIpType(String primaryIpType) {
                this.primaryIpType = primaryIpType;
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

            public NetworkInterfaceSet build() {
                return new NetworkInterfaceSet(this);
            } 

        } 

    }
    public static class NetworkInterfaceSets extends TeaModel {
        @NameInMap("NetworkInterfaceSet")
        private java.util.List < NetworkInterfaceSet> networkInterfaceSet;

        private NetworkInterfaceSets(Builder builder) {
            this.networkInterfaceSet = builder.networkInterfaceSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInterfaceSets create() {
            return builder().build();
        }

        /**
         * @return networkInterfaceSet
         */
        public java.util.List < NetworkInterfaceSet> getNetworkInterfaceSet() {
            return this.networkInterfaceSet;
        }

        public static final class Builder {
            private java.util.List < NetworkInterfaceSet> networkInterfaceSet; 

            /**
             * NetworkInterfaceSet.
             */
            public Builder networkInterfaceSet(java.util.List < NetworkInterfaceSet> networkInterfaceSet) {
                this.networkInterfaceSet = networkInterfaceSet;
                return this;
            }

            public NetworkInterfaceSets build() {
                return new NetworkInterfaceSets(this);
            } 

        } 

    }
}
