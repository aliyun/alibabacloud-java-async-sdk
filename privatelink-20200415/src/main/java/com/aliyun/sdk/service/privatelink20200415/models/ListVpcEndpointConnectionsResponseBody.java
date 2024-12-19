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
 * {@link ListVpcEndpointConnectionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListVpcEndpointConnectionsResponseBody</p>
 */
public class ListVpcEndpointConnectionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Connections")
    private java.util.List<Connections> connections;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
    public java.util.List<Connections> getConnections() {
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
        private java.util.List<Connections> connections; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private String totalCount; 

        /**
         * <p>The endpoint connections.</p>
         */
        public Builder connections(java.util.List<Connections> connections) {
            this.connections = connections;
            return this;
        }

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
         * <p>1</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListVpcEndpointConnectionsResponseBody build() {
            return new ListVpcEndpointConnectionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVpcEndpointConnectionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListVpcEndpointConnectionsResponseBody</p>
     */
    public static class Zones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EniId")
        private String eniId;

        @com.aliyun.core.annotation.NameInMap("ReplacedEniId")
        private String replacedEniId;

        @com.aliyun.core.annotation.NameInMap("ReplacedResourceId")
        private String replacedResourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneDomain")
        private String zoneDomain;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        @com.aliyun.core.annotation.NameInMap("ZoneStatus")
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
             * <p>The endpoint ENI ID.</p>
             * 
             * <strong>example:</strong>
             * <p>eni-hp32lk0pyv6o94hs****</p>
             */
            public Builder eniId(String eniId) {
                this.eniId = eniId;
                return this;
            }

            /**
             * <p>The ID of the replaced endpoint ENI in smooth migration scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>eni-hp32lk0pyv6o94hs****</p>
             */
            public Builder replacedEniId(String replacedEniId) {
                this.replacedEniId = replacedEniId;
                return this;
            }

            /**
             * <p>The ID of the replaced service resource in smooth migration scenarios.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-hp32z1wp5peaoox2q****</p>
             */
            public Builder replacedResourceId(String replacedResourceId) {
                this.replacedResourceId = replacedResourceId;
                return this;
            }

            /**
             * <p>The service resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-hp32z1wp5peaoox2q****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The ID of the vSwitch to which the endpoint belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-hp3uf6045ljdhd5zr****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The domain name of the zone.</p>
             * 
             * <strong>example:</strong>
             * <p>ep-hp34jaz8ykl0exwt****-cn-huhehaote.epsrv-hp3vpx8yqxblby3i****.cn-huhehaote-b.privatelink.aliyuncs.com</p>
             */
            public Builder zoneDomain(String zoneDomain) {
                this.zoneDomain = zoneDomain;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-huhehaote-b</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
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
             * <li><strong>Migrating</strong>: The zone is being migrated.</li>
             * <li><strong>Migrated</strong>: The zone is migrated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Connected</p>
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
    /**
     * 
     * {@link ListVpcEndpointConnectionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListVpcEndpointConnectionsResponseBody</p>
     */
    public static class Connections extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("ConnectionStatus")
        private String connectionStatus;

        @com.aliyun.core.annotation.NameInMap("EndpointId")
        private String endpointId;

        @com.aliyun.core.annotation.NameInMap("EndpointOwnerId")
        private Long endpointOwnerId;

        @com.aliyun.core.annotation.NameInMap("EndpointVpcId")
        private String endpointVpcId;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceOwner")
        private Boolean resourceOwner;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("Zones")
        private java.util.List<Zones> zones;

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
        public java.util.List<Zones> getZones() {
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
            private java.util.List<Zones> zones; 

            /**
             * <p>The bandwidth of the endpoint connection. Valid values: <strong>1024 to 10240</strong>. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The state of the endpoint connection. Valid values:</p>
             * <ul>
             * <li><strong>Pending</strong>: The connection is being modified.</li>
             * <li><strong>Connecting</strong>: The connection is being established.</li>
             * <li><strong>Connected</strong>: The connection is established.</li>
             * <li><strong>Disconnecting</strong>: The endpoint is being disconnected from the endpoint service.</li>
             * <li><strong>Disconnected</strong>: The endpoint is disconnected from the endpoint service.</li>
             * <li><strong>Deleting</strong>: The connection is being deleted.</li>
             * <li><strong>ServiceDeleted</strong>: The corresponding endpoint service has been deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Disconnected</p>
             */
            public Builder connectionStatus(String connectionStatus) {
                this.connectionStatus = connectionStatus;
                return this;
            }

            /**
             * <p>The endpoint ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ep-hp33b2e43fays7s8****</p>
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the endpoint belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>25346073170691****</p>
             */
            public Builder endpointOwnerId(Long endpointOwnerId) {
                this.endpointOwnerId = endpointOwnerId;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC) to which the endpoint belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-hp356stwkxg3fn2xe****</p>
             */
            public Builder endpointVpcId(String endpointVpcId) {
                this.endpointVpcId = endpointVpcId;
                return this;
            }

            /**
             * <p>The time when the endpoint connection was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-28T10:34:46Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the endpoint belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmw353z35v***</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>Indicates whether the endpoint and the endpoint service belong to the same Alibaba Cloud account. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder resourceOwner(Boolean resourceOwner) {
                this.resourceOwner = resourceOwner;
                return this;
            }

            /**
             * <p>The endpoint service ID.</p>
             * 
             * <strong>example:</strong>
             * <p>epsrv-hp3vpx8yqxblby3i****</p>
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>The zones.</p>
             */
            public Builder zones(java.util.List<Zones> zones) {
                this.zones = zones;
                return this;
            }

            public Connections build() {
                return new Connections(this);
            } 

        } 

    }
}
