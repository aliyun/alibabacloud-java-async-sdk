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
    private String maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    private ListVpcEndpointConnectionsResponseBody(Builder builder) {
        this.connections = builder.connections;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
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
    public String getMaxResults() {
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

    public static final class Builder {
        private java.util.List < Connections> connections; 
        private String maxResults; 
        private String nextToken; 
        private String requestId; 

        /**
         * Connections.
         */
        public Builder connections(java.util.List < Connections> connections) {
            this.connections = connections;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(String maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
             * EniId.
             */
            public Builder eniId(String eniId) {
                this.eniId = eniId;
                return this;
            }

            /**
             * ReplacedEniId.
             */
            public Builder replacedEniId(String replacedEniId) {
                this.replacedEniId = replacedEniId;
                return this;
            }

            /**
             * ReplacedResourceId.
             */
            public Builder replacedResourceId(String replacedResourceId) {
                this.replacedResourceId = replacedResourceId;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
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
             * ZoneDomain.
             */
            public Builder zoneDomain(String zoneDomain) {
                this.zoneDomain = zoneDomain;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * ZoneStatus.
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
            private Boolean resourceOwner; 
            private String serviceId; 
            private java.util.List < Zones> zones; 

            /**
             * Bandwidth.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * ConnectionStatus.
             */
            public Builder connectionStatus(String connectionStatus) {
                this.connectionStatus = connectionStatus;
                return this;
            }

            /**
             * EndpointId.
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * EndpointOwnerId.
             */
            public Builder endpointOwnerId(Long endpointOwnerId) {
                this.endpointOwnerId = endpointOwnerId;
                return this;
            }

            /**
             * EndpointVpcId.
             */
            public Builder endpointVpcId(String endpointVpcId) {
                this.endpointVpcId = endpointVpcId;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * ResourceOwner.
             */
            public Builder resourceOwner(Boolean resourceOwner) {
                this.resourceOwner = resourceOwner;
                return this;
            }

            /**
             * ServiceId.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * Zones.
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
