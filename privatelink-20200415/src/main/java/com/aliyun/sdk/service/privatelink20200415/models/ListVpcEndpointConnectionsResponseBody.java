// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpcEndpointConnectionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListVpcEndpointConnectionsResponseBody</p>
 */
public class ListVpcEndpointConnectionsResponseBody extends TeaModel {
    @NameInMap("Connections")
    private java.util.List < Connections> connections;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private String totalCount;

    private ListVpcEndpointConnectionsResponseBody(Builder builder) {
        this.connections = builder.connections;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpcEndpointConnectionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return connections
     */
    public java.util.List < Connections> getConnections() {
        return this.connections;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Connections> connections; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private String totalCount; 

        /**
         * The endpoint connections.
         */
        public Builder connections(java.util.List < Connections> connections) {
            this.connections = connections;
            return this;
        }

        /**
         * The number of entries returned on each page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   If no value is returned for **NextToken**, no next requests are performed.
         * *   If a value is returned for **NextToken**, the value can be used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListVpcEndpointConnectionsResponseBody build() {
            return new ListVpcEndpointConnectionsResponseBody(this);
        } 

    } 

    public static class Zones extends TeaModel {
        @NameInMap("EniId")
        private String eniId;

        @NameInMap("ReplacedEniId")
        private String replacedEniId;

        @NameInMap("ReplacedResourceId")
        private String replacedResourceId;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("ZoneDomain")
        private String zoneDomain;

        @NameInMap("ZoneId")
        private String zoneId;

        @NameInMap("ZoneStatus")
        private String zoneStatus;

        private Zones(Builder builder) {
            this.eniId = builder.eniId;
            this.replacedEniId = builder.replacedEniId;
            this.replacedResourceId = builder.replacedResourceId;
            this.resourceId = builder.resourceId;
            this.vSwitchId = builder.vSwitchId;
            this.zoneDomain = builder.zoneDomain;
            this.zoneId = builder.zoneId;
            this.zoneStatus = builder.zoneStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Zones create() {
            return builder().build();
        }

        /**
         * @return eniId
         */
        public String getEniId() {
            return this.eniId;
        }

        /**
         * @return replacedEniId
         */
        public String getReplacedEniId() {
            return this.replacedEniId;
        }

        /**
         * @return replacedResourceId
         */
        public String getReplacedResourceId() {
            return this.replacedResourceId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return zoneDomain
         */
        public String getZoneDomain() {
            return this.zoneDomain;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return zoneStatus
         */
        public String getZoneStatus() {
            return this.zoneStatus;
        }

        public static final class Builder {
            private String eniId; 
            private String replacedEniId; 
            private String replacedResourceId; 
            private String resourceId; 
            private String vSwitchId; 
            private String zoneDomain; 
            private String zoneId; 
            private String zoneStatus; 

            /**
             * The endpoint ENI ID.
             */
            public Builder eniId(String eniId) {
                this.eniId = eniId;
                return this;
            }

            /**
             * The ID of the replaced endpoint ENI in smooth migration scenarios.
             */
            public Builder replacedEniId(String replacedEniId) {
                this.replacedEniId = replacedEniId;
                return this;
            }

            /**
             * The ID of the replaced service resource in smooth migration scenarios.
             */
            public Builder replacedResourceId(String replacedResourceId) {
                this.replacedResourceId = replacedResourceId;
                return this;
            }

            /**
             * The service resource ID.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The ID of the vSwitch to which the endpoint belongs.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The domain name of the zone.
             */
            public Builder zoneDomain(String zoneDomain) {
                this.zoneDomain = zoneDomain;
                return this;
            }

            /**
             * The zone ID.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * The state of the zone. Valid values:
             * <p>
             * 
             * *   **Creating**: The zone is being created.
             * *   **Wait**: The zone is to be connected.
             * *   **Connected**: The zone is connected.
             * *   **Deleting**: The zone is being deleted.
             * *   **Disconnecting**: The zone is being disconnected.
             * *   **Disconnected**: The zone is disconnected.
             * *   **Connecting**: The zone is being connected.
             * *   **Migrating**: The zone is being migrated.
             * *   **Migrated**: The zone is migrated.
             */
            public Builder zoneStatus(String zoneStatus) {
                this.zoneStatus = zoneStatus;
                return this;
            }

            public Zones build() {
                return new Zones(this);
            } 

        } 

    }
    public static class Connections extends TeaModel {
        @NameInMap("Bandwidth")
        private Integer bandwidth;

        @NameInMap("ConnectionStatus")
        private String connectionStatus;

        @NameInMap("EndpointId")
        private String endpointId;

        @NameInMap("EndpointOwnerId")
        private Long endpointOwnerId;

        @NameInMap("EndpointVpcId")
        private String endpointVpcId;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("ResourceOwner")
        private Boolean resourceOwner;

        @NameInMap("ServiceId")
        private String serviceId;

        @NameInMap("Zones")
        private java.util.List < Zones> zones;

        private Connections(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.connectionStatus = builder.connectionStatus;
            this.endpointId = builder.endpointId;
            this.endpointOwnerId = builder.endpointOwnerId;
            this.endpointVpcId = builder.endpointVpcId;
            this.modifiedTime = builder.modifiedTime;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceOwner = builder.resourceOwner;
            this.serviceId = builder.serviceId;
            this.zones = builder.zones;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Connections create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return connectionStatus
         */
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        /**
         * @return endpointId
         */
        public String getEndpointId() {
            return this.endpointId;
        }

        /**
         * @return endpointOwnerId
         */
        public Long getEndpointOwnerId() {
            return this.endpointOwnerId;
        }

        /**
         * @return endpointVpcId
         */
        public String getEndpointVpcId() {
            return this.endpointVpcId;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceOwner
         */
        public Boolean getResourceOwner() {
            return this.resourceOwner;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return zones
         */
        public java.util.List < Zones> getZones() {
            return this.zones;
        }

        public static final class Builder {
            private Integer bandwidth; 
            private String connectionStatus; 
            private String endpointId; 
            private Long endpointOwnerId; 
            private String endpointVpcId; 
            private String modifiedTime; 
            private String resourceGroupId; 
            private Boolean resourceOwner; 
            private String serviceId; 
            private java.util.List < Zones> zones; 

            /**
             * The bandwidth of the endpoint connection. Valid values: **1024 to 10240**. Unit: Mbit/s.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The state of the endpoint connection. Valid values:
             * <p>
             * 
             * *   **Pending**: The connection is being modified.
             * *   **Connecting**: The connection is being established.
             * *   **Connected**: The connection is established.
             * *   **Disconnecting**: The endpoint is being disconnected from the endpoint service.
             * *   **Disconnected**: The endpoint is disconnected from the endpoint service.
             * *   **Deleting**: The connection is being deleted.
             * *   **ServiceDeleted**: The corresponding endpoint service has been deleted.
             */
            public Builder connectionStatus(String connectionStatus) {
                this.connectionStatus = connectionStatus;
                return this;
            }

            /**
             * The endpoint ID.
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the endpoint belongs.
             */
            public Builder endpointOwnerId(Long endpointOwnerId) {
                this.endpointOwnerId = endpointOwnerId;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC) to which the endpoint belongs.
             */
            public Builder endpointVpcId(String endpointVpcId) {
                this.endpointVpcId = endpointVpcId;
                return this;
            }

            /**
             * The time when the endpoint connection was modified.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * The ID of the resource group to which the endpoint belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Indicates whether the endpoint and the endpoint service belong to the same Alibaba Cloud account. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder resourceOwner(Boolean resourceOwner) {
                this.resourceOwner = resourceOwner;
                return this;
            }

            /**
             * The endpoint service ID.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * The zones.
             */
            public Builder zones(java.util.List < Zones> zones) {
                this.zones = zones;
                return this;
            }

            public Connections build() {
                return new Connections(this);
            } 

        } 

    }
}
