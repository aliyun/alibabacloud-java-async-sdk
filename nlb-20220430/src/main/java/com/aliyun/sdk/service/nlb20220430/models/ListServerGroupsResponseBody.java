// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

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
 * {@link ListServerGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListServerGroupsResponseBody</p>
 */
public class ListServerGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServerGroups")
    private java.util.List<ServerGroups> serverGroups;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<ServerGroups> getServerGroups() {
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
        private java.util.List<ServerGroups> serverGroups; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListServerGroupsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.serverGroups = model.serverGroups;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The number of entries per page. Valid values: <strong>1</strong> to <strong>100</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
         * <li>If a value is returned for <strong>NextToken</strong>, the value is the token that determines the start point of the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>54B28E3D-DF70-471B-AA93-08E683A1B45</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>A list of server groups.</p>
         */
        public Builder serverGroups(java.util.List<ServerGroups> serverGroups) {
            this.serverGroups = serverGroups;
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

        public ListServerGroupsResponseBody build() {
            return new ListServerGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListServerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListServerGroupsResponseBody</p>
     */
    public static class HealthCheck extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HealthCheckConnectPort")
        private Integer healthCheckConnectPort;

        @com.aliyun.core.annotation.NameInMap("HealthCheckConnectTimeout")
        private Integer healthCheckConnectTimeout;

        @com.aliyun.core.annotation.NameInMap("HealthCheckDomain")
        private String healthCheckDomain;

        @com.aliyun.core.annotation.NameInMap("HealthCheckEnabled")
        private Boolean healthCheckEnabled;

        @com.aliyun.core.annotation.NameInMap("HealthCheckExp")
        private String healthCheckExp;

        @com.aliyun.core.annotation.NameInMap("HealthCheckHttpCode")
        private java.util.List<String> healthCheckHttpCode;

        @com.aliyun.core.annotation.NameInMap("HealthCheckHttpVersion")
        private String healthCheckHttpVersion;

        @com.aliyun.core.annotation.NameInMap("HealthCheckInterval")
        private Integer healthCheckInterval;

        @com.aliyun.core.annotation.NameInMap("HealthCheckReq")
        private String healthCheckReq;

        @com.aliyun.core.annotation.NameInMap("HealthCheckType")
        private String healthCheckType;

        @com.aliyun.core.annotation.NameInMap("HealthCheckUrl")
        private String healthCheckUrl;

        @com.aliyun.core.annotation.NameInMap("HealthyThreshold")
        private Integer healthyThreshold;

        @com.aliyun.core.annotation.NameInMap("HttpCheckMethod")
        private String httpCheckMethod;

        @com.aliyun.core.annotation.NameInMap("UnhealthyThreshold")
        private Integer unhealthyThreshold;

        private HealthCheck(Builder builder) {
            this.healthCheckConnectPort = builder.healthCheckConnectPort;
            this.healthCheckConnectTimeout = builder.healthCheckConnectTimeout;
            this.healthCheckDomain = builder.healthCheckDomain;
            this.healthCheckEnabled = builder.healthCheckEnabled;
            this.healthCheckExp = builder.healthCheckExp;
            this.healthCheckHttpCode = builder.healthCheckHttpCode;
            this.healthCheckHttpVersion = builder.healthCheckHttpVersion;
            this.healthCheckInterval = builder.healthCheckInterval;
            this.healthCheckReq = builder.healthCheckReq;
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
         * @return healthCheckExp
         */
        public String getHealthCheckExp() {
            return this.healthCheckExp;
        }

        /**
         * @return healthCheckHttpCode
         */
        public java.util.List<String> getHealthCheckHttpCode() {
            return this.healthCheckHttpCode;
        }

        /**
         * @return healthCheckHttpVersion
         */
        public String getHealthCheckHttpVersion() {
            return this.healthCheckHttpVersion;
        }

        /**
         * @return healthCheckInterval
         */
        public Integer getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        /**
         * @return healthCheckReq
         */
        public String getHealthCheckReq() {
            return this.healthCheckReq;
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
            private String healthCheckExp; 
            private java.util.List<String> healthCheckHttpCode; 
            private String healthCheckHttpVersion; 
            private Integer healthCheckInterval; 
            private String healthCheckReq; 
            private String healthCheckType; 
            private String healthCheckUrl; 
            private Integer healthyThreshold; 
            private String httpCheckMethod; 
            private Integer unhealthyThreshold; 

            private Builder() {
            } 

            private Builder(HealthCheck model) {
                this.healthCheckConnectPort = model.healthCheckConnectPort;
                this.healthCheckConnectTimeout = model.healthCheckConnectTimeout;
                this.healthCheckDomain = model.healthCheckDomain;
                this.healthCheckEnabled = model.healthCheckEnabled;
                this.healthCheckExp = model.healthCheckExp;
                this.healthCheckHttpCode = model.healthCheckHttpCode;
                this.healthCheckHttpVersion = model.healthCheckHttpVersion;
                this.healthCheckInterval = model.healthCheckInterval;
                this.healthCheckReq = model.healthCheckReq;
                this.healthCheckType = model.healthCheckType;
                this.healthCheckUrl = model.healthCheckUrl;
                this.healthyThreshold = model.healthyThreshold;
                this.httpCheckMethod = model.httpCheckMethod;
                this.unhealthyThreshold = model.unhealthyThreshold;
            } 

            /**
             * <p>The backend port that is used for health checks.</p>
             * <p>Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
             * <p>A value of <strong>0</strong> indicates that the port on a backend server is used for health checks.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
                this.healthCheckConnectPort = healthCheckConnectPort;
                return this;
            }

            /**
             * <p>The maximum timeout period of a health check response. Unit: seconds. Default value: <strong>5</strong>.</p>
             * <p>Valid values: <strong>1</strong> to <strong>300</strong></p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder healthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
                this.healthCheckConnectTimeout = healthCheckConnectTimeout;
                return this;
            }

            /**
             * <p>The domain name that you want to use for health checks. Valid values:</p>
             * <ul>
             * <li><strong>$SERVER_IP</strong>: the private IP address of a backend server.</li>
             * <li><strong>domain</strong>: a specified domain name. The domain name must be 1 to 80 characters in length, and can contain lowercase letters, digits, hyphens (-), and periods (.).</li>
             * </ul>
             * <blockquote>
             * <p>This parameter takes effect only when <strong>HealthCheckType</strong> is set to <strong>HTTP</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>$SERVER_IP</p>
             */
            public Builder healthCheckDomain(String healthCheckDomain) {
                this.healthCheckDomain = healthCheckDomain;
                return this;
            }

            /**
             * <p>Indicates whether the health check feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder healthCheckEnabled(Boolean healthCheckEnabled) {
                this.healthCheckEnabled = healthCheckEnabled;
                return this;
            }

            /**
             * <p>The response string of UDP health checks. The string must be 1 to 512 characters in length, and can contain letters and digits.</p>
             * 
             * <strong>example:</strong>
             * <p>ok</p>
             */
            public Builder healthCheckExp(String healthCheckExp) {
                this.healthCheckExp = healthCheckExp;
                return this;
            }

            /**
             * <p>The HTTP status codes returned for health checks. Multiple HTTP status codes are separated by commas (,). Valid values: <strong>http_2xx</strong>, <strong>http_3xx</strong>, <strong>http_4xx</strong>, and <strong>http_5xx</strong>.</p>
             * <blockquote>
             * <p>This parameter takes effect only when <strong>HealthCheckType</strong> is set to <strong>HTTP</strong>.</p>
             * </blockquote>
             */
            public Builder healthCheckHttpCode(java.util.List<String> healthCheckHttpCode) {
                this.healthCheckHttpCode = healthCheckHttpCode;
                return this;
            }

            /**
             * HealthCheckHttpVersion.
             */
            public Builder healthCheckHttpVersion(String healthCheckHttpVersion) {
                this.healthCheckHttpVersion = healthCheckHttpVersion;
                return this;
            }

            /**
             * <p>The interval at which health checks are performed. Unit: seconds. Default value: <strong>5</strong>.</p>
             * <ul>
             * <li>If you set <strong>HealthCheckType</strong> to <strong>TCP</strong> or <strong>HTTP</strong>, valid values are <strong>1 to 50</strong>.</li>
             * <li>If you set <strong>HealthCheckType</strong> to <strong>UDP</strong>, valid values are <strong>1 to 300</strong>. Set the health check interval equal to or larger than the response timeout period to ensure that UDP response timeouts are not determined as no responses.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder healthCheckInterval(Integer healthCheckInterval) {
                this.healthCheckInterval = healthCheckInterval;
                return this;
            }

            /**
             * <p>The request string of UDP health checks. The string must be 1 to 512 characters in length, and can contain letters and digits.</p>
             * 
             * <strong>example:</strong>
             * <p>hello</p>
             */
            public Builder healthCheckReq(String healthCheckReq) {
                this.healthCheckReq = healthCheckReq;
                return this;
            }

            /**
             * <p>The protocol that is used for health checks. Valid values:</p>
             * <ul>
             * <li><strong>TCP</strong></li>
             * <li><strong>HTTP</strong></li>
             * <li><strong>UDP</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder healthCheckType(String healthCheckType) {
                this.healthCheckType = healthCheckType;
                return this;
            }

            /**
             * <p>The path to which health check probes are sent.</p>
             * <blockquote>
             * <p>This parameter takes effect only when <strong>HealthCheckType</strong> is set to <strong>HTTP</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>/test/index.html</p>
             */
            public Builder healthCheckUrl(String healthCheckUrl) {
                this.healthCheckUrl = healthCheckUrl;
                return this;
            }

            /**
             * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status changes from <strong>fail</strong> to <strong>success</strong>.</p>
             * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder healthyThreshold(Integer healthyThreshold) {
                this.healthyThreshold = healthyThreshold;
                return this;
            }

            /**
             * <p>The HTTP method that is used for health checks. Valid values: <strong>GET</strong> and <strong>HEAD</strong>.</p>
             * <blockquote>
             * <p>This parameter takes effect only when <strong>HealthCheckType</strong> is set to <strong>HTTP</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>GET</p>
             */
            public Builder httpCheckMethod(String httpCheckMethod) {
                this.httpCheckMethod = httpCheckMethod;
                return this;
            }

            /**
             * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status changes from <strong>success</strong> to <strong>fail</strong>.</p>
             * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
    /**
     * 
     * {@link ListServerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListServerGroupsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key. At most 10 tag keys are returned.</p>
             * <p>The tag key can be up to 64 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. At most 10 tag values are returned.</p>
             * <p>The tag value can be up to 128 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
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
    /**
     * 
     * {@link ListServerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListServerGroupsResponseBody</p>
     */
    public static class ServerGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressIPVersion")
        private String addressIPVersion;

        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("AnyPortEnabled")
        private Boolean anyPortEnabled;

        @com.aliyun.core.annotation.NameInMap("ConnectionDrainEnabled")
        private Boolean connectionDrainEnabled;

        @com.aliyun.core.annotation.NameInMap("ConnectionDrainTimeout")
        private Integer connectionDrainTimeout;

        @com.aliyun.core.annotation.NameInMap("HealthCheck")
        private HealthCheck healthCheck;

        @com.aliyun.core.annotation.NameInMap("PreserveClientIpEnabled")
        private Boolean preserveClientIpEnabled;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RelatedLoadBalancerIds")
        private java.util.List<String> relatedLoadBalancerIds;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Scheduler")
        private String scheduler;

        @com.aliyun.core.annotation.NameInMap("ServerCount")
        private Integer serverCount;

        @com.aliyun.core.annotation.NameInMap("ServerGroupId")
        private String serverGroupId;

        @com.aliyun.core.annotation.NameInMap("ServerGroupName")
        private String serverGroupName;

        @com.aliyun.core.annotation.NameInMap("ServerGroupStatus")
        private String serverGroupStatus;

        @com.aliyun.core.annotation.NameInMap("ServerGroupType")
        private String serverGroupType;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("VpcId")
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return relatedLoadBalancerIds
         */
        public java.util.List<String> getRelatedLoadBalancerIds() {
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
        public java.util.List<Tags> getTags() {
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
            private String regionId; 
            private java.util.List<String> relatedLoadBalancerIds; 
            private String resourceGroupId; 
            private String scheduler; 
            private Integer serverCount; 
            private String serverGroupId; 
            private String serverGroupName; 
            private String serverGroupStatus; 
            private String serverGroupType; 
            private java.util.List<Tags> tags; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(ServerGroups model) {
                this.addressIPVersion = model.addressIPVersion;
                this.aliUid = model.aliUid;
                this.anyPortEnabled = model.anyPortEnabled;
                this.connectionDrainEnabled = model.connectionDrainEnabled;
                this.connectionDrainTimeout = model.connectionDrainTimeout;
                this.healthCheck = model.healthCheck;
                this.preserveClientIpEnabled = model.preserveClientIpEnabled;
                this.protocol = model.protocol;
                this.regionId = model.regionId;
                this.relatedLoadBalancerIds = model.relatedLoadBalancerIds;
                this.resourceGroupId = model.resourceGroupId;
                this.scheduler = model.scheduler;
                this.serverCount = model.serverCount;
                this.serverGroupId = model.serverGroupId;
                this.serverGroupName = model.serverGroupName;
                this.serverGroupStatus = model.serverGroupStatus;
                this.serverGroupType = model.serverGroupType;
                this.tags = model.tags;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The IP version. Valid values:</p>
             * <ul>
             * <li><strong>ipv4</strong></li>
             * <li><strong>DualStack</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ipv4</p>
             */
            public Builder addressIPVersion(String addressIPVersion) {
                this.addressIPVersion = addressIPVersion;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>165820696622****</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>Indicates whether the feature of forwarding requests to all ports is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder anyPortEnabled(Boolean anyPortEnabled) {
                this.anyPortEnabled = anyPortEnabled;
                return this;
            }

            /**
             * <p>Indicates whether connection draining is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder connectionDrainEnabled(Boolean connectionDrainEnabled) {
                this.connectionDrainEnabled = connectionDrainEnabled;
                return this;
            }

            /**
             * <p>The timeout period of connection draining. Unit: seconds. Valid values: <strong>10</strong> to <strong>900</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder connectionDrainTimeout(Integer connectionDrainTimeout) {
                this.connectionDrainTimeout = connectionDrainTimeout;
                return this;
            }

            /**
             * <p>The configurations of health checks.</p>
             */
            public Builder healthCheck(HealthCheck healthCheck) {
                this.healthCheck = healthCheck;
                return this;
            }

            /**
             * <p>Indicates whether client IP preservation is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p>This parameter is set to <strong>true</strong> by default when <strong>AddressIPVersion</strong> is set to <strong>ipv4</strong>. This parameter is set to <strong>false</strong> when <strong>AddressIPVersion</strong> is set to <strong>ipv6</strong>. <strong>true</strong> will be supported by later versions.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder preserveClientIpEnabled(Boolean preserveClientIpEnabled) {
                this.preserveClientIpEnabled = preserveClientIpEnabled;
                return this;
            }

            /**
             * <p>The backend protocol. Valid values: <strong>TCP</strong> and <strong>UDP</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The region ID of the NLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The NLB instances.</p>
             */
            public Builder relatedLoadBalancerIds(java.util.List<String> relatedLoadBalancerIds) {
                this.relatedLoadBalancerIds = relatedLoadBalancerIds;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the server group belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-atstuj3rtop****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The routing algorithm. Valid values:</p>
             * <ul>
             * <li><strong>Wrr</strong>: Backend servers with higher weights receive more requests than backend servers with lower weights.</li>
             * <li><strong>rr</strong>: Requests are forwarded to the backend servers in sequence. sch: Requests are forwarded to the backend servers based on source IP address hashing.</li>
             * <li><strong>sch</strong>: Requests from the same source IP address are forwarded to the same backend server.</li>
             * <li><strong>tch</strong>: Four-element hashing, which specifies consistent hashing that is based on four factors: source IP address, destination IP address, source port, and destination port. Requests that contain the same information based on the four factors are forwarded to the same backend server.</li>
             * <li><strong>qch</strong>: QUIC ID hashing. Requests that contain the same QUIC ID are forwarded to the same backend server.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Wrr</p>
             */
            public Builder scheduler(String scheduler) {
                this.scheduler = scheduler;
                return this;
            }

            /**
             * <p>The number of server groups associated with the NLB instances.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder serverCount(Integer serverCount) {
                this.serverCount = serverCount;
                return this;
            }

            /**
             * <p>The server group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sgp-atstuj3rtoptyui****</p>
             */
            public Builder serverGroupId(String serverGroupId) {
                this.serverGroupId = serverGroupId;
                return this;
            }

            /**
             * <p>The server group name.</p>
             * 
             * <strong>example:</strong>
             * <p>NLB_ServerGroup</p>
             */
            public Builder serverGroupName(String serverGroupName) {
                this.serverGroupName = serverGroupName;
                return this;
            }

            /**
             * <p>The status of the server group. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong></li>
             * <li><strong>Available</strong></li>
             * <li><strong>Configuring</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder serverGroupStatus(String serverGroupStatus) {
                this.serverGroupStatus = serverGroupStatus;
                return this;
            }

            /**
             * <p>The type of server group. Valid values:</p>
             * <ul>
             * <li><strong>Instance</strong> : contains servers of the <strong>Ecs</strong>, <strong>Ens</strong>, and <strong>Eci</strong> types.</li>
             * <li><strong>Ip</strong>: contains servers specified by IP addresses.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Instance</p>
             */
            public Builder serverGroupType(String serverGroupType) {
                this.serverGroupType = serverGroupType;
                return this;
            }

            /**
             * <p>The tag.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the VPC to which the server group belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp15zckdt37pq72zv****</p>
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
