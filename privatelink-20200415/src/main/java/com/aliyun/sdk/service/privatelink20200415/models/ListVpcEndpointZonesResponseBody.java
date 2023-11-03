// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpcEndpointZonesResponseBody} extends {@link TeaModel}
 *
 * <p>ListVpcEndpointZonesResponseBody</p>
 */
public class ListVpcEndpointZonesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Zones")
    private java.util.List < Zones> zones;

    private ListVpcEndpointZonesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.zones = builder.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpcEndpointZonesResponseBody create() {
        return builder().build();
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
     * @return zones
     */
    public java.util.List < Zones> getZones() {
        return this.zones;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < Zones> zones; 

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
         * The zones.
         */
        public Builder zones(java.util.List < Zones> zones) {
            this.zones = zones;
            return this;
        }

        public ListVpcEndpointZonesResponseBody build() {
            return new ListVpcEndpointZonesResponseBody(this);
        } 

    } 

    public static class Zones extends TeaModel {
        @NameInMap("EniId")
        private String eniId;

        @NameInMap("EniIp")
        private String eniIp;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("ZoneDomain")
        private String zoneDomain;

        @NameInMap("ZoneId")
        private String zoneId;

        @NameInMap("ZoneIpv6Address")
        private String zoneIpv6Address;

        @NameInMap("ZoneStatus")
        private String zoneStatus;

        private Zones(Builder builder) {
            this.eniId = builder.eniId;
            this.eniIp = builder.eniIp;
            this.regionId = builder.regionId;
            this.vSwitchId = builder.vSwitchId;
            this.zoneDomain = builder.zoneDomain;
            this.zoneId = builder.zoneId;
            this.zoneIpv6Address = builder.zoneIpv6Address;
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
         * @return eniIp
         */
        public String getEniIp() {
            return this.eniIp;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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
         * @return zoneIpv6Address
         */
        public String getZoneIpv6Address() {
            return this.zoneIpv6Address;
        }

        /**
         * @return zoneStatus
         */
        public String getZoneStatus() {
            return this.zoneStatus;
        }

        public static final class Builder {
            private String eniId; 
            private String eniIp; 
            private String regionId; 
            private String vSwitchId; 
            private String zoneDomain; 
            private String zoneId; 
            private String zoneIpv6Address; 
            private String zoneStatus; 

            /**
             * The endpoint ENI ID.
             */
            public Builder eniId(String eniId) {
                this.eniId = eniId;
                return this;
            }

            /**
             * The IP address of the endpoint ENI.
             */
            public Builder eniIp(String eniIp) {
                this.eniIp = eniIp;
                return this;
            }

            /**
             * The region ID of the endpoint.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the vSwitch in the zone. The system automatically creates an endpoint elastic network interface (ENI) in the vSwitch.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The domain name of the zone.
             * <p>
             * 
             * After the endpoint is connected to the endpoint service, you can access the service resources in the endpoint service by using the domain name of the zone.
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
             * Indicates whether IPv6 is enabled for the endpoint service. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false** (default)
             */
            public Builder zoneIpv6Address(String zoneIpv6Address) {
                this.zoneIpv6Address = zoneIpv6Address;
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
}
