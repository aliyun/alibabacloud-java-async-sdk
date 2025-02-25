// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

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
 * {@link ListVpcEndpointZonesResponseBody} extends {@link TeaModel}
 *
 * <p>ListVpcEndpointZonesResponseBody</p>
 */
public class ListVpcEndpointZonesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("Zones")
    private java.util.List<Zones> zones;

    private ListVpcEndpointZonesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return zones
     */
    public java.util.List<Zones> getZones() {
        return this.zones;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<Zones> zones; 

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If no value is returned for <strong>NextToken</strong>, no next requests are performed.</li>
         * <li>If a value is returned for <strong>NextToken</strong>, the value can be used in the next request to retrieve a new page of results.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The information about the zones.</p>
         */
        public Builder zones(java.util.List<Zones> zones) {
            this.zones = zones;
            return this;
        }

        public ListVpcEndpointZonesResponseBody build() {
            return new ListVpcEndpointZonesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVpcEndpointZonesResponseBody} extends {@link TeaModel}
     *
     * <p>ListVpcEndpointZonesResponseBody</p>
     */
    public static class Zones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EniId")
        private String eniId;

        @com.aliyun.core.annotation.NameInMap("EniIp")
        private String eniIp;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneDomain")
        private String zoneDomain;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        @com.aliyun.core.annotation.NameInMap("ZoneIpv6Address")
        private String zoneIpv6Address;

        @com.aliyun.core.annotation.NameInMap("ZoneStatus")
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
             * <p>The ID of the endpoint ENI.</p>
             * 
             * <strong>example:</strong>
             * <p>eni-hp3c8qj1tyct8aqy****</p>
             */
            public Builder eniId(String eniId) {
                this.eniId = eniId;
                return this;
            }

            /**
             * <p>The IP address of the endpoint ENI.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.2.23</p>
             */
            public Builder eniIp(String eniIp) {
                this.eniIp = eniIp;
                return this;
            }

            /**
             * <p>The region ID of the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-huhehaote</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the vSwitch in the zone. The system automatically creates an endpoint elastic network interface (ENI) in the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-hjkshjvdkdvd****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The domain name of the zone.</p>
             * <p>After the endpoint in the zone is connected to the endpoint service, you can access the service resources of the endpoint service by using the domain name of the zone.</p>
             * 
             * <strong>example:</strong>
             * <p>ep-hp3f033dp24c5yc9****-cn-huhehaote.epsrv-hp3itcpowf37m3d5****.cn-huhehaote-a.privatelink.aliyuncs.com</p>
             */
            public Builder zoneDomain(String zoneDomain) {
                this.zoneDomain = zoneDomain;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-huhehaote-a</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * <p>Indicates whether the endpoint service supports IPv6. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong> (default)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder zoneIpv6Address(String zoneIpv6Address) {
                this.zoneIpv6Address = zoneIpv6Address;
                return this;
            }

            /**
             * <p>The state of the zone. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong>: The zone is being created.</li>
             * <li><strong>Wait</strong>: The zone is to be connected.</li>
             * <li><strong>Connected</strong>: The zone is connected.</li>
             * <li><strong>Deleting</strong>: The zone is being deleted.</li>
             * <li><strong>Disconnecting</strong>: The zone is being disconnected.</li>
             * <li><strong>Disconnected</strong>: The zone is disconnected.</li>
             * <li><strong>Connecting</strong>: The zone is being connected.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Wait</p>
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
