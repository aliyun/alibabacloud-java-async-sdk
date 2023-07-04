// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGlobalAccelerationInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGlobalAccelerationInstancesResponseBody</p>
 */
public class DescribeGlobalAccelerationInstancesResponseBody extends TeaModel {
    @NameInMap("GlobalAccelerationInstances")
    private GlobalAccelerationInstances globalAccelerationInstances;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * The details of the GA instances.
         */
        public Builder globalAccelerationInstances(GlobalAccelerationInstances globalAccelerationInstances) {
            this.globalAccelerationInstances = globalAccelerationInstances;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
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

        public DescribeGlobalAccelerationInstancesResponseBody build() {
            return new DescribeGlobalAccelerationInstancesResponseBody(this);
        } 

    } 

    public static class BackendServer extends TeaModel {
        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ServerId")
        private String serverId;

        @NameInMap("ServerIpAddress")
        private String serverIpAddress;

        @NameInMap("ServerType")
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
             * The region where the backend servers are deployed.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the backend server.
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * The IP address of the backend server.
             */
            public Builder serverIpAddress(String serverIpAddress) {
                this.serverIpAddress = serverIpAddress;
                return this;
            }

            /**
             * The type of the backend server.
             * <p>
             * 
             * *   **EcsInstance**: Elastic Compute Service (ECS) instance
             * *   **SlbInstance**: Server Load Balancer (SLB) instance
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
    public static class BackendServers extends TeaModel {
        @NameInMap("BackendServer")
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
    public static class PublicIpAddress extends TeaModel {
        @NameInMap("AllocationId")
        private String allocationId;

        @NameInMap("IpAddress")
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
             * The ID of the public IP address of the GA instance.
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * The public IP address of the GA instance.
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
    public static class PublicIpAddresses extends TeaModel {
        @NameInMap("PublicIpAddress")
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
    public static class GlobalAccelerationInstance extends TeaModel {
        @NameInMap("AccelerationLocation")
        private String accelerationLocation;

        @NameInMap("BackendServers")
        private BackendServers backendServers;

        @NameInMap("Bandwidth")
        private String bandwidth;

        @NameInMap("BandwidthType")
        private String bandwidthType;

        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("GlobalAccelerationInstanceId")
        private String globalAccelerationInstanceId;

        @NameInMap("InternetChargeType")
        private String internetChargeType;

        @NameInMap("IpAddress")
        private String ipAddress;

        @NameInMap("Name")
        private String name;

        @NameInMap("PublicIpAddresses")
        private PublicIpAddresses publicIpAddresses;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ServiceLocation")
        private String serviceLocation;

        @NameInMap("Status")
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
             * The acceleration area of the GA instance.
             */
            public Builder accelerationLocation(String accelerationLocation) {
                this.accelerationLocation = accelerationLocation;
                return this;
            }

            /**
             * The details about the backend servers of the GA instance.
             */
            public Builder backendServers(BackendServers backendServers) {
                this.backendServers = backendServers;
                return this;
            }

            /**
             * The maximum bandwidth of the GA instance.
             */
            public Builder bandwidth(String bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The bandwidth type of the GA instance.
             * <p>
             * 
             * *   **Sharing**
             * *   **Exclusive** (default)
             */
            public Builder bandwidthType(String bandwidthType) {
                this.bandwidthType = bandwidthType;
                return this;
            }

            /**
             * The billing method of the GA instance.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * The time when the GA instance was created. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description of the GA instance.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The time when the instance expires.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The ID of the GA instance.
             */
            public Builder globalAccelerationInstanceId(String globalAccelerationInstanceId) {
                this.globalAccelerationInstanceId = globalAccelerationInstanceId;
                return this;
            }

            /**
             * The billing method of the GA instance.
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * The public IP address of the dedicated GA instance.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * The name of the GA instance.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The public IP address.
             */
            public Builder publicIpAddresses(PublicIpAddresses publicIpAddresses) {
                this.publicIpAddresses = publicIpAddresses;
                return this;
            }

            /**
             * The region ID of the GA instance.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The service area of the GA instance.
             */
            public Builder serviceLocation(String serviceLocation) {
                this.serviceLocation = serviceLocation;
                return this;
            }

            /**
             * The status of the GA instance.
             * <p>
             * 
             * *   **Available**
             * *   **Inuse**
             * *   **Associating**
             * *   **Unassociating**
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
    public static class GlobalAccelerationInstances extends TeaModel {
        @NameInMap("GlobalAccelerationInstance")
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
