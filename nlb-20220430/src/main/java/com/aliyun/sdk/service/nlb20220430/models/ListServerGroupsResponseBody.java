// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServerGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListServerGroupsResponseBody</p>
 */
public class ListServerGroupsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServerGroups")
    private java.util.List < ServerGroups> serverGroups;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListServerGroupsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.serverGroups = builder.serverGroups;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServerGroupsResponseBody create() {
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
     * @return serverGroups
     */
    public java.util.List < ServerGroups> getServerGroups() {
        return this.serverGroups;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < ServerGroups> serverGroups; 
        private Integer totalCount; 

        /**
         * The number of entries per page. Valid values: **1** to **100**.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   If **NextToken** is empty, no next page exists.
         * *   If a value is returned for **NextToken**, the value is the token that determines the start point of the next query.
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
         * A list of server groups.
         */
        public Builder serverGroups(java.util.List < ServerGroups> serverGroups) {
            this.serverGroups = serverGroups;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListServerGroupsResponseBody build() {
            return new ListServerGroupsResponseBody(this);
        } 

    } 

    public static class HealthCheck extends TeaModel {
        @NameInMap("HealthCheckConnectPort")
        private Integer healthCheckConnectPort;

        @NameInMap("HealthCheckConnectTimeout")
        private Integer healthCheckConnectTimeout;

        @NameInMap("HealthCheckDomain")
        private String healthCheckDomain;

        @NameInMap("HealthCheckEnabled")
        private Boolean healthCheckEnabled;

        @NameInMap("HealthCheckHttpCode")
        private java.util.List < String > healthCheckHttpCode;

        @NameInMap("HealthCheckInterval")
        private Integer healthCheckInterval;

        @NameInMap("HealthCheckType")
        private String healthCheckType;

        @NameInMap("HealthCheckUrl")
        private String healthCheckUrl;

        @NameInMap("HealthyThreshold")
        private Integer healthyThreshold;

        @NameInMap("HttpCheckMethod")
        private String httpCheckMethod;

        @NameInMap("UnhealthyThreshold")
        private Integer unhealthyThreshold;

        private HealthCheck(Builder builder) {
            this.healthCheckConnectPort = builder.healthCheckConnectPort;
            this.healthCheckConnectTimeout = builder.healthCheckConnectTimeout;
            this.healthCheckDomain = builder.healthCheckDomain;
            this.healthCheckEnabled = builder.healthCheckEnabled;
            this.healthCheckHttpCode = builder.healthCheckHttpCode;
            this.healthCheckInterval = builder.healthCheckInterval;
            this.healthCheckType = builder.healthCheckType;
            this.healthCheckUrl = builder.healthCheckUrl;
            this.healthyThreshold = builder.healthyThreshold;
            this.httpCheckMethod = builder.httpCheckMethod;
            this.unhealthyThreshold = builder.unhealthyThreshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HealthCheck create() {
            return builder().build();
        }

        /**
         * @return healthCheckConnectPort
         */
        public Integer getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        /**
         * @return healthCheckConnectTimeout
         */
        public Integer getHealthCheckConnectTimeout() {
            return this.healthCheckConnectTimeout;
        }

        /**
         * @return healthCheckDomain
         */
        public String getHealthCheckDomain() {
            return this.healthCheckDomain;
        }

        /**
         * @return healthCheckEnabled
         */
        public Boolean getHealthCheckEnabled() {
            return this.healthCheckEnabled;
        }

        /**
         * @return healthCheckHttpCode
         */
        public java.util.List < String > getHealthCheckHttpCode() {
            return this.healthCheckHttpCode;
        }

        /**
         * @return healthCheckInterval
         */
        public Integer getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        /**
         * @return healthCheckType
         */
        public String getHealthCheckType() {
            return this.healthCheckType;
        }

        /**
         * @return healthCheckUrl
         */
        public String getHealthCheckUrl() {
            return this.healthCheckUrl;
        }

        /**
         * @return healthyThreshold
         */
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        /**
         * @return httpCheckMethod
         */
        public String getHttpCheckMethod() {
            return this.httpCheckMethod;
        }

        /**
         * @return unhealthyThreshold
         */
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

        public static final class Builder {
            private Integer healthCheckConnectPort; 
            private Integer healthCheckConnectTimeout; 
            private String healthCheckDomain; 
            private Boolean healthCheckEnabled; 
            private java.util.List < String > healthCheckHttpCode; 
            private Integer healthCheckInterval; 
            private String healthCheckType; 
            private String healthCheckUrl; 
            private Integer healthyThreshold; 
            private String httpCheckMethod; 
            private Integer unhealthyThreshold; 

            /**
             * The backend port that is used for health checks.
             * <p>
             * 
             * Valid values: **0** to **65535**.
             * 
             * A value of **0** indicates that the port on a backend server is used for health checks.
             */
            public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
                this.healthCheckConnectPort = healthCheckConnectPort;
                return this;
            }

            /**
             * The maximum timeout period of a health check. Unit: seconds. Valid values: **1** to **300**.
             */
            public Builder healthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
                this.healthCheckConnectTimeout = healthCheckConnectTimeout;
                return this;
            }

            /**
             * The domain name that you want to use for health checks. Valid values:
             * <p>
             * 
             * *   **$SERVER_IP**: the private IP address of a backend server.
             * *   **domain**: a specified domain name. The domain name must be 1 to 80 characters in length, and can contain lowercase letters, digits, hyphens (-), and periods (.).
             * 
             * > This parameter takes effect only when **HealthCheckType** is set to **HTTP**.
             */
            public Builder healthCheckDomain(String healthCheckDomain) {
                this.healthCheckDomain = healthCheckDomain;
                return this;
            }

            /**
             * Indicates whether the health check feature is enabled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder healthCheckEnabled(Boolean healthCheckEnabled) {
                this.healthCheckEnabled = healthCheckEnabled;
                return this;
            }

            /**
             * The HTTP status codes returned for health checks. Multiple HTTP status codes are separated by commas (,). Valid values: **http\_2xx**, **http\_3xx**, **http\_4xx**, and **http\_5xx**.
             * <p>
             * 
             * > This parameter takes effect only when **HealthCheckType** is set to **HTTP**.
             */
            public Builder healthCheckHttpCode(java.util.List < String > healthCheckHttpCode) {
                this.healthCheckHttpCode = healthCheckHttpCode;
                return this;
            }

            /**
             * The interval at which health checks are performed. Unit: seconds.
             * <p>
             * 
             * Valid values: **5** to **50**.
             */
            public Builder healthCheckInterval(Integer healthCheckInterval) {
                this.healthCheckInterval = healthCheckInterval;
                return this;
            }

            /**
             * The protocol that is used for health checks. Valid values: **TCP** and **HTTP**.
             */
            public Builder healthCheckType(String healthCheckType) {
                this.healthCheckType = healthCheckType;
                return this;
            }

            /**
             * The path to which health check probes are sent.
             * <p>
             * 
             * > This parameter takes effect only when **HealthCheckType** is set to **HTTP**.
             */
            public Builder healthCheckUrl(String healthCheckUrl) {
                this.healthCheckUrl = healthCheckUrl;
                return this;
            }

            /**
             * The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status changes from **fail** to **success**.
             * <p>
             * 
             * Valid values: **2** to **10**.
             */
            public Builder healthyThreshold(Integer healthyThreshold) {
                this.healthyThreshold = healthyThreshold;
                return this;
            }

            /**
             * The HTTP method that is used for health checks. Valid values: **GET** and **HEAD**.
             * <p>
             * 
             * > This parameter takes effect only when **HealthCheckType** is set to **HTTP**.
             */
            public Builder httpCheckMethod(String httpCheckMethod) {
                this.httpCheckMethod = httpCheckMethod;
                return this;
            }

            /**
             * The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status changes from **success** to **fail**.
             * <p>
             * 
             * Valid values: **2** to **10**.
             */
            public Builder unhealthyThreshold(Integer unhealthyThreshold) {
                this.unhealthyThreshold = unhealthyThreshold;
                return this;
            }

            public HealthCheck build() {
                return new HealthCheck(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key. At most 10 tag keys are returned.
             * <p>
             * 
             * The tag key can be up to 64 characters in length, and cannot contain `http://` or `https://`. It cannot start with `aliyun` or `acs:`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value. At most 10 tag values are returned.
             * <p>
             * 
             * The tag value can be up to 128 characters in length, and cannot contain `http://` or `https://`. It cannot start with `aliyun` or `acs:`.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class ServerGroups extends TeaModel {
        @NameInMap("AddressIPVersion")
        private String addressIPVersion;

        @NameInMap("AliUid")
        private Long aliUid;

        @NameInMap("AnyPortEnabled")
        private Boolean anyPortEnabled;

        @NameInMap("ConnectionDrainEnabled")
        private Boolean connectionDrainEnabled;

        @NameInMap("ConnectionDrainTimeout")
        private Integer connectionDrainTimeout;

        @NameInMap("HealthCheck")
        private HealthCheck healthCheck;

        @NameInMap("PreserveClientIpEnabled")
        private Boolean preserveClientIpEnabled;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("QuicVersion")
        private String quicVersion;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RelatedLoadBalancerIds")
        private java.util.List < String > relatedLoadBalancerIds;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Scheduler")
        private String scheduler;

        @NameInMap("ServerCount")
        private Integer serverCount;

        @NameInMap("ServerGroupId")
        private String serverGroupId;

        @NameInMap("ServerGroupName")
        private String serverGroupName;

        @NameInMap("ServerGroupStatus")
        private String serverGroupStatus;

        @NameInMap("ServerGroupType")
        private String serverGroupType;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("VpcId")
        private String vpcId;

        private ServerGroups(Builder builder) {
            this.addressIPVersion = builder.addressIPVersion;
            this.aliUid = builder.aliUid;
            this.anyPortEnabled = builder.anyPortEnabled;
            this.connectionDrainEnabled = builder.connectionDrainEnabled;
            this.connectionDrainTimeout = builder.connectionDrainTimeout;
            this.healthCheck = builder.healthCheck;
            this.preserveClientIpEnabled = builder.preserveClientIpEnabled;
            this.protocol = builder.protocol;
            this.quicVersion = builder.quicVersion;
            this.regionId = builder.regionId;
            this.relatedLoadBalancerIds = builder.relatedLoadBalancerIds;
            this.resourceGroupId = builder.resourceGroupId;
            this.scheduler = builder.scheduler;
            this.serverCount = builder.serverCount;
            this.serverGroupId = builder.serverGroupId;
            this.serverGroupName = builder.serverGroupName;
            this.serverGroupStatus = builder.serverGroupStatus;
            this.serverGroupType = builder.serverGroupType;
            this.tags = builder.tags;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerGroups create() {
            return builder().build();
        }

        /**
         * @return addressIPVersion
         */
        public String getAddressIPVersion() {
            return this.addressIPVersion;
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return anyPortEnabled
         */
        public Boolean getAnyPortEnabled() {
            return this.anyPortEnabled;
        }

        /**
         * @return connectionDrainEnabled
         */
        public Boolean getConnectionDrainEnabled() {
            return this.connectionDrainEnabled;
        }

        /**
         * @return connectionDrainTimeout
         */
        public Integer getConnectionDrainTimeout() {
            return this.connectionDrainTimeout;
        }

        /**
         * @return healthCheck
         */
        public HealthCheck getHealthCheck() {
            return this.healthCheck;
        }

        /**
         * @return preserveClientIpEnabled
         */
        public Boolean getPreserveClientIpEnabled() {
            return this.preserveClientIpEnabled;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return quicVersion
         */
        public String getQuicVersion() {
            return this.quicVersion;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return relatedLoadBalancerIds
         */
        public java.util.List < String > getRelatedLoadBalancerIds() {
            return this.relatedLoadBalancerIds;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return scheduler
         */
        public String getScheduler() {
            return this.scheduler;
        }

        /**
         * @return serverCount
         */
        public Integer getServerCount() {
            return this.serverCount;
        }

        /**
         * @return serverGroupId
         */
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        /**
         * @return serverGroupName
         */
        public String getServerGroupName() {
            return this.serverGroupName;
        }

        /**
         * @return serverGroupStatus
         */
        public String getServerGroupStatus() {
            return this.serverGroupStatus;
        }

        /**
         * @return serverGroupType
         */
        public String getServerGroupType() {
            return this.serverGroupType;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String addressIPVersion; 
            private Long aliUid; 
            private Boolean anyPortEnabled; 
            private Boolean connectionDrainEnabled; 
            private Integer connectionDrainTimeout; 
            private HealthCheck healthCheck; 
            private Boolean preserveClientIpEnabled; 
            private String protocol; 
            private String quicVersion; 
            private String regionId; 
            private java.util.List < String > relatedLoadBalancerIds; 
            private String resourceGroupId; 
            private String scheduler; 
            private Integer serverCount; 
            private String serverGroupId; 
            private String serverGroupName; 
            private String serverGroupStatus; 
            private String serverGroupType; 
            private java.util.List < Tags> tags; 
            private String vpcId; 

            /**
             * The IP version. Valid values:
             * <p>
             * 
             * *   **ipv4**
             * *   **DualStack**
             */
            public Builder addressIPVersion(String addressIPVersion) {
                this.addressIPVersion = addressIPVersion;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * Indicates whether the feature of forwarding requests to all ports is enabled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder anyPortEnabled(Boolean anyPortEnabled) {
                this.anyPortEnabled = anyPortEnabled;
                return this;
            }

            /**
             * Indicates whether connection draining is enabled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder connectionDrainEnabled(Boolean connectionDrainEnabled) {
                this.connectionDrainEnabled = connectionDrainEnabled;
                return this;
            }

            /**
             * The timeout period of connection draining. Unit: seconds. Valid values: **10** to **900**.
             */
            public Builder connectionDrainTimeout(Integer connectionDrainTimeout) {
                this.connectionDrainTimeout = connectionDrainTimeout;
                return this;
            }

            /**
             * The configurations of health checks.
             */
            public Builder healthCheck(HealthCheck healthCheck) {
                this.healthCheck = healthCheck;
                return this;
            }

            /**
             * Indicates whether client IP preservation is enabled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * 
             * > This parameter is set to **true** by default when **AddressIPVersion** is set to **ipv4**. This parameter is set to **false** when **AddressIPVersion** is set to **ipv6**. **true** will be supported by later versions.
             */
            public Builder preserveClientIpEnabled(Boolean preserveClientIpEnabled) {
                this.preserveClientIpEnabled = preserveClientIpEnabled;
                return this;
            }

            /**
             * The protocol used to forward requests to the backend servers. Valid values: **TCP**, **UDP**, and **TCPSSL**.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * The Quic version.
             */
            public Builder quicVersion(String quicVersion) {
                this.quicVersion = quicVersion;
                return this;
            }

            /**
             * The region ID of the NLB instance.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The NLB instances.
             */
            public Builder relatedLoadBalancerIds(java.util.List < String > relatedLoadBalancerIds) {
                this.relatedLoadBalancerIds = relatedLoadBalancerIds;
                return this;
            }

            /**
             * The ID of the resource group to which the server group belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The routing algorithm. Valid values:
             * <p>
             * 
             * *   **Wrr**: Backend servers with higher weights receive more requests than backend servers with lower weights.
             * *   **rr**: Requests are forwarded to the backend servers in sequence. sch: Requests are forwarded to the backend servers based on source IP address hashing.
             * *   **sch**: Requests from the same source IP address are forwarded to the same backend server.
             * *   **tch**: Four-element hashing, which specifies consistent hashing that is based on four factors: source IP address, destination IP address, source port, and destination port. Requests that contain the same information based on the four factors are forwarded to the same backend server.
             * *   **qch**: QUIC ID hashing. Requests that contain the same QUIC ID are forwarded to the same backend server.
             */
            public Builder scheduler(String scheduler) {
                this.scheduler = scheduler;
                return this;
            }

            /**
             * The number of server groups associated with the NLB instances.
             */
            public Builder serverCount(Integer serverCount) {
                this.serverCount = serverCount;
                return this;
            }

            /**
             * The server group ID.
             */
            public Builder serverGroupId(String serverGroupId) {
                this.serverGroupId = serverGroupId;
                return this;
            }

            /**
             * The server group name.
             */
            public Builder serverGroupName(String serverGroupName) {
                this.serverGroupName = serverGroupName;
                return this;
            }

            /**
             * The status of the server group. Valid values:
             * <p>
             * 
             * *   **Creating**
             * *   **Available**
             * *   **Configuring**
             */
            public Builder serverGroupStatus(String serverGroupStatus) {
                this.serverGroupStatus = serverGroupStatus;
                return this;
            }

            /**
             * The type of server group. Valid values:
             * <p>
             * 
             * *   **Instance** : contains servers of the **Ecs**, **Ens**, and **Eci** types.
             * *   **Ip**: contains servers specified by IP addresses.
             */
            public Builder serverGroupType(String serverGroupType) {
                this.serverGroupType = serverGroupType;
                return this;
            }

            /**
             * The tag.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The ID of the VPC to which the server group belongs.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public ServerGroups build() {
                return new ServerGroups(this);
            } 

        } 

    }
}
