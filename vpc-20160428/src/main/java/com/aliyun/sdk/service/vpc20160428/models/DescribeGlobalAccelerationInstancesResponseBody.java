// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeGlobalAccelerationInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGlobalAccelerationInstancesResponseBody</p>
 */
public class DescribeGlobalAccelerationInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GlobalAccelerationInstances")
    private GlobalAccelerationInstances globalAccelerationInstances;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeGlobalAccelerationInstancesResponseBody(Builder builder) {
        this.globalAccelerationInstances = builder.globalAccelerationInstances;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGlobalAccelerationInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return globalAccelerationInstances
     */
    public GlobalAccelerationInstances getGlobalAccelerationInstances() {
        return this.globalAccelerationInstances;
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
        private GlobalAccelerationInstances globalAccelerationInstances; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The details of the GA instances.</p>
         */
        public Builder globalAccelerationInstances(GlobalAccelerationInstances globalAccelerationInstances) {
            this.globalAccelerationInstances = globalAccelerationInstances;
            return this;
        }

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
         * <p>6B4EE38D-C75B-4E1F-844E-863A94430676</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        public DescribeGlobalAccelerationInstancesResponseBody build() {
            return new DescribeGlobalAccelerationInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGlobalAccelerationInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGlobalAccelerationInstancesResponseBody</p>
     */
    public static class BackendServer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ServerId")
        private String serverId;

        @com.aliyun.core.annotation.NameInMap("ServerIpAddress")
        private String serverIpAddress;

        @com.aliyun.core.annotation.NameInMap("ServerType")
        private String serverType;

        private BackendServer(Builder builder) {
            this.regionId = builder.regionId;
            this.serverId = builder.serverId;
            this.serverIpAddress = builder.serverIpAddress;
            this.serverType = builder.serverType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackendServer create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return serverId
         */
        public String getServerId() {
            return this.serverId;
        }

        /**
         * @return serverIpAddress
         */
        public String getServerIpAddress() {
            return this.serverIpAddress;
        }

        /**
         * @return serverType
         */
        public String getServerType() {
            return this.serverType;
        }

        public static final class Builder {
            private String regionId; 
            private String serverId; 
            private String serverIpAddress; 
            private String serverType; 

            /**
             * <p>The region where the backend servers are deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the backend server.</p>
             * 
             * <strong>example:</strong>
             * <p>i-2zeg83zvn5d4ed4y****</p>
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * <p>The IP address of the backend server.</p>
             * 
             * <strong>example:</strong>
             * <p>172.xx.xx.109</p>
             */
            public Builder serverIpAddress(String serverIpAddress) {
                this.serverIpAddress = serverIpAddress;
                return this;
            }

            /**
             * <p>The type of the backend server.</p>
             * <ul>
             * <li><strong>EcsInstance</strong>: Elastic Compute Service (ECS) instance</li>
             * <li><strong>SlbInstance</strong>: Server Load Balancer (SLB) instance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EcsInstance</p>
             */
            public Builder serverType(String serverType) {
                this.serverType = serverType;
                return this;
            }

            public BackendServer build() {
                return new BackendServer(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGlobalAccelerationInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGlobalAccelerationInstancesResponseBody</p>
     */
    public static class BackendServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackendServer")
        private java.util.List < BackendServer> backendServer;

        private BackendServers(Builder builder) {
            this.backendServer = builder.backendServer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackendServers create() {
            return builder().build();
        }

        /**
         * @return backendServer
         */
        public java.util.List < BackendServer> getBackendServer() {
            return this.backendServer;
        }

        public static final class Builder {
            private java.util.List < BackendServer> backendServer; 

            /**
             * BackendServer.
             */
            public Builder backendServer(java.util.List < BackendServer> backendServer) {
                this.backendServer = backendServer;
                return this;
            }

            public BackendServers build() {
                return new BackendServers(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGlobalAccelerationInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGlobalAccelerationInstancesResponseBody</p>
     */
    public static class PublicIpAddress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocationId")
        private String allocationId;

        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private String ipAddress;

        private PublicIpAddress(Builder builder) {
            this.allocationId = builder.allocationId;
            this.ipAddress = builder.ipAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublicIpAddress create() {
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

        public static final class Builder {
            private String allocationId; 
            private String ipAddress; 

            /**
             * <p>The ID of the public IP address of the GA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>eip-bp19yqraac4w3y0jd****</p>
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * <p>The public IP address of the GA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>12.xx.xx.78</p>
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            public PublicIpAddress build() {
                return new PublicIpAddress(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGlobalAccelerationInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGlobalAccelerationInstancesResponseBody</p>
     */
    public static class PublicIpAddresses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PublicIpAddress")
        private java.util.List < PublicIpAddress> publicIpAddress;

        private PublicIpAddresses(Builder builder) {
            this.publicIpAddress = builder.publicIpAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublicIpAddresses create() {
            return builder().build();
        }

        /**
         * @return publicIpAddress
         */
        public java.util.List < PublicIpAddress> getPublicIpAddress() {
            return this.publicIpAddress;
        }

        public static final class Builder {
            private java.util.List < PublicIpAddress> publicIpAddress; 

            /**
             * PublicIpAddress.
             */
            public Builder publicIpAddress(java.util.List < PublicIpAddress> publicIpAddress) {
                this.publicIpAddress = publicIpAddress;
                return this;
            }

            public PublicIpAddresses build() {
                return new PublicIpAddresses(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGlobalAccelerationInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGlobalAccelerationInstancesResponseBody</p>
     */
    public static class GlobalAccelerationInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccelerationLocation")
        private String accelerationLocation;

        @com.aliyun.core.annotation.NameInMap("BackendServers")
        private BackendServers backendServers;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private String bandwidth;

        @com.aliyun.core.annotation.NameInMap("BandwidthType")
        private String bandwidthType;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("GlobalAccelerationInstanceId")
        private String globalAccelerationInstanceId;

        @com.aliyun.core.annotation.NameInMap("InternetChargeType")
        private String internetChargeType;

        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private String ipAddress;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PublicIpAddresses")
        private PublicIpAddresses publicIpAddresses;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ServiceLocation")
        private String serviceLocation;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private GlobalAccelerationInstance(Builder builder) {
            this.accelerationLocation = builder.accelerationLocation;
            this.backendServers = builder.backendServers;
            this.bandwidth = builder.bandwidth;
            this.bandwidthType = builder.bandwidthType;
            this.chargeType = builder.chargeType;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.expiredTime = builder.expiredTime;
            this.globalAccelerationInstanceId = builder.globalAccelerationInstanceId;
            this.internetChargeType = builder.internetChargeType;
            this.ipAddress = builder.ipAddress;
            this.name = builder.name;
            this.publicIpAddresses = builder.publicIpAddresses;
            this.regionId = builder.regionId;
            this.serviceLocation = builder.serviceLocation;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GlobalAccelerationInstance create() {
            return builder().build();
        }

        /**
         * @return accelerationLocation
         */
        public String getAccelerationLocation() {
            return this.accelerationLocation;
        }

        /**
         * @return backendServers
         */
        public BackendServers getBackendServers() {
            return this.backendServers;
        }

        /**
         * @return bandwidth
         */
        public String getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return bandwidthType
         */
        public String getBandwidthType() {
            return this.bandwidthType;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return globalAccelerationInstanceId
         */
        public String getGlobalAccelerationInstanceId() {
            return this.globalAccelerationInstanceId;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return publicIpAddresses
         */
        public PublicIpAddresses getPublicIpAddresses() {
            return this.publicIpAddresses;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return serviceLocation
         */
        public String getServiceLocation() {
            return this.serviceLocation;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String accelerationLocation; 
            private BackendServers backendServers; 
            private String bandwidth; 
            private String bandwidthType; 
            private String chargeType; 
            private String creationTime; 
            private String description; 
            private String expiredTime; 
            private String globalAccelerationInstanceId; 
            private String internetChargeType; 
            private String ipAddress; 
            private String name; 
            private PublicIpAddresses publicIpAddresses; 
            private String regionId; 
            private String serviceLocation; 
            private String status; 

            /**
             * <p>The acceleration area of the GA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>china-mainland</p>
             */
            public Builder accelerationLocation(String accelerationLocation) {
                this.accelerationLocation = accelerationLocation;
                return this;
            }

            /**
             * <p>The details about the backend servers of the GA instance.</p>
             */
            public Builder backendServers(BackendServers backendServers) {
                this.backendServers = backendServers;
                return this;
            }

            /**
             * <p>The maximum bandwidth of the GA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder bandwidth(String bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The bandwidth type of the GA instance.</p>
             * <ul>
             * <li><strong>Sharing</strong></li>
             * <li><strong>Exclusive</strong> (default)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Exclusive</p>
             */
            public Builder bandwidthType(String bandwidthType) {
                this.bandwidthType = bandwidthType;
                return this;
            }

            /**
             * <p>The billing method of the GA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>PrePaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The time when the GA instance was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-07-05T03:39:31Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the GA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>apiDescription</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the instance expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-08-05T16:00Z</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The ID of the GA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ga-bp1x99kj7kl1ziw5x****</p>
             */
            public Builder globalAccelerationInstanceId(String globalAccelerationInstanceId) {
                this.globalAccelerationInstanceId = globalAccelerationInstanceId;
                return this;
            }

            /**
             * <p>The billing method of the GA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>PayByBandwidth</p>
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * <p>The public IP address of the dedicated GA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>47.xx.xx.99</p>
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * <p>The name of the GA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>instanceName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The public IP address.</p>
             */
            public Builder publicIpAddresses(PublicIpAddresses publicIpAddresses) {
                this.publicIpAddresses = publicIpAddresses;
                return this;
            }

            /**
             * <p>The region ID of the GA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The service area of the GA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>china-mainland</p>
             */
            public Builder serviceLocation(String serviceLocation) {
                this.serviceLocation = serviceLocation;
                return this;
            }

            /**
             * <p>The status of the GA instance.</p>
             * <ul>
             * <li><strong>Available</strong></li>
             * <li><strong>Inuse</strong></li>
             * <li><strong>Associating</strong></li>
             * <li><strong>Unassociating</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>InUse</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public GlobalAccelerationInstance build() {
                return new GlobalAccelerationInstance(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGlobalAccelerationInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGlobalAccelerationInstancesResponseBody</p>
     */
    public static class GlobalAccelerationInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GlobalAccelerationInstance")
        private java.util.List < GlobalAccelerationInstance> globalAccelerationInstance;

        private GlobalAccelerationInstances(Builder builder) {
            this.globalAccelerationInstance = builder.globalAccelerationInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GlobalAccelerationInstances create() {
            return builder().build();
        }

        /**
         * @return globalAccelerationInstance
         */
        public java.util.List < GlobalAccelerationInstance> getGlobalAccelerationInstance() {
            return this.globalAccelerationInstance;
        }

        public static final class Builder {
            private java.util.List < GlobalAccelerationInstance> globalAccelerationInstance; 

            /**
             * GlobalAccelerationInstance.
             */
            public Builder globalAccelerationInstance(java.util.List < GlobalAccelerationInstance> globalAccelerationInstance) {
                this.globalAccelerationInstance = globalAccelerationInstance;
                return this;
            }

            public GlobalAccelerationInstances build() {
                return new GlobalAccelerationInstances(this);
            } 

        } 

    }
}
