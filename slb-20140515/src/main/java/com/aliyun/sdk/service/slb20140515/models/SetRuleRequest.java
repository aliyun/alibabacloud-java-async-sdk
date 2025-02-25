// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

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
 * {@link SetRuleRequest} extends {@link RequestModel}
 *
 * <p>SetRuleRequest</p>
 */
public class SetRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cookie")
    private String cookie;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CookieTimeout")
    @com.aliyun.core.annotation.Validation(maximum = 86400, minimum = 1)
    private Integer cookieTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheck")
    private String healthCheck;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckConnectPort")
    @com.aliyun.core.annotation.Validation(maximum = 65535, minimum = 1)
    private Integer healthCheckConnectPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckDomain")
    private String healthCheckDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckHttpCode")
    private String healthCheckHttpCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckInterval")
    @com.aliyun.core.annotation.Validation(maximum = 50, minimum = 1)
    private Integer healthCheckInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckTimeout")
    @com.aliyun.core.annotation.Validation(maximum = 300, minimum = 1)
    private Integer healthCheckTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckURI")
    private String healthCheckURI;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthyThreshold")
    @com.aliyun.core.annotation.Validation(maximum = 10, minimum = 1)
    private Integer healthyThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerSync")
    private String listenerSync;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scheduler")
    private String scheduler;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StickySession")
    private String stickySession;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StickySessionType")
    private String stickySessionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnhealthyThreshold")
    @com.aliyun.core.annotation.Validation(maximum = 10, minimum = 1)
    private Integer unhealthyThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VServerGroupId")
    private String vServerGroupId;

    private SetRuleRequest(Builder builder) {
        super(builder);
        this.cookie = builder.cookie;
        this.cookieTimeout = builder.cookieTimeout;
        this.healthCheck = builder.healthCheck;
        this.healthCheckConnectPort = builder.healthCheckConnectPort;
        this.healthCheckDomain = builder.healthCheckDomain;
        this.healthCheckHttpCode = builder.healthCheckHttpCode;
        this.healthCheckInterval = builder.healthCheckInterval;
        this.healthCheckTimeout = builder.healthCheckTimeout;
        this.healthCheckURI = builder.healthCheckURI;
        this.healthyThreshold = builder.healthyThreshold;
        this.listenerSync = builder.listenerSync;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ruleId = builder.ruleId;
        this.ruleName = builder.ruleName;
        this.scheduler = builder.scheduler;
        this.stickySession = builder.stickySession;
        this.stickySessionType = builder.stickySessionType;
        this.unhealthyThreshold = builder.unhealthyThreshold;
        this.vServerGroupId = builder.vServerGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cookie
     */
    public String getCookie() {
        return this.cookie;
    }

    /**
     * @return cookieTimeout
     */
    public Integer getCookieTimeout() {
        return this.cookieTimeout;
    }

    /**
     * @return healthCheck
     */
    public String getHealthCheck() {
        return this.healthCheck;
    }

    /**
     * @return healthCheckConnectPort
     */
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    /**
     * @return healthCheckDomain
     */
    public String getHealthCheckDomain() {
        return this.healthCheckDomain;
    }

    /**
     * @return healthCheckHttpCode
     */
    public String getHealthCheckHttpCode() {
        return this.healthCheckHttpCode;
    }

    /**
     * @return healthCheckInterval
     */
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    /**
     * @return healthCheckTimeout
     */
    public Integer getHealthCheckTimeout() {
        return this.healthCheckTimeout;
    }

    /**
     * @return healthCheckURI
     */
    public String getHealthCheckURI() {
        return this.healthCheckURI;
    }

    /**
     * @return healthyThreshold
     */
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    /**
     * @return listenerSync
     */
    public String getListenerSync() {
        return this.listenerSync;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return scheduler
     */
    public String getScheduler() {
        return this.scheduler;
    }

    /**
     * @return stickySession
     */
    public String getStickySession() {
        return this.stickySession;
    }

    /**
     * @return stickySessionType
     */
    public String getStickySessionType() {
        return this.stickySessionType;
    }

    /**
     * @return unhealthyThreshold
     */
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    /**
     * @return vServerGroupId
     */
    public String getVServerGroupId() {
        return this.vServerGroupId;
    }

    public static final class Builder extends Request.Builder<SetRuleRequest, Builder> {
        private String cookie; 
        private Integer cookieTimeout; 
        private String healthCheck; 
        private Integer healthCheckConnectPort; 
        private String healthCheckDomain; 
        private String healthCheckHttpCode; 
        private Integer healthCheckInterval; 
        private Integer healthCheckTimeout; 
        private String healthCheckURI; 
        private Integer healthyThreshold; 
        private String listenerSync; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String ruleId; 
        private String ruleName; 
        private String scheduler; 
        private String stickySession; 
        private String stickySessionType; 
        private Integer unhealthyThreshold; 
        private String vServerGroupId; 

        private Builder() {
            super();
        } 

        private Builder(SetRuleRequest request) {
            super(request);
            this.cookie = request.cookie;
            this.cookieTimeout = request.cookieTimeout;
            this.healthCheck = request.healthCheck;
            this.healthCheckConnectPort = request.healthCheckConnectPort;
            this.healthCheckDomain = request.healthCheckDomain;
            this.healthCheckHttpCode = request.healthCheckHttpCode;
            this.healthCheckInterval = request.healthCheckInterval;
            this.healthCheckTimeout = request.healthCheckTimeout;
            this.healthCheckURI = request.healthCheckURI;
            this.healthyThreshold = request.healthyThreshold;
            this.listenerSync = request.listenerSync;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.ruleId = request.ruleId;
            this.ruleName = request.ruleName;
            this.scheduler = request.scheduler;
            this.stickySession = request.stickySession;
            this.stickySessionType = request.stickySessionType;
            this.unhealthyThreshold = request.unhealthyThreshold;
            this.vServerGroupId = request.vServerGroupId;
        } 

        /**
         * <p>The cookie that is configured on the server.</p>
         * <p>The cookie must be 1 to 200 characters in length and can contain only ASCII characters and digits. It cannot contain commas (,), semicolons (;), or space characters. It cannot start with a dollar sign ($).</p>
         * <blockquote>
         * <p> This parameter is required and takes effect if <strong>StickySession</strong> is set to <strong>on</strong> and <strong>StickySessionType</strong> is set to <strong>server</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>23ffsa</p>
         */
        public Builder cookie(String cookie) {
            this.putQueryParameter("Cookie", cookie);
            this.cookie = cookie;
            return this;
        }

        /**
         * <p>The timeout period of a cookie. Unit: seconds. Valid values: <strong>1</strong> to <strong>86400</strong>.</p>
         * <blockquote>
         * <p> This parameter is required and takes effect if <strong>StickySession</strong> is set to <strong>on</strong> and <strong>StickySessionType</strong> is set to <strong>insert</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder cookieTimeout(Integer cookieTimeout) {
            this.putQueryParameter("CookieTimeout", cookieTimeout);
            this.cookieTimeout = cookieTimeout;
            return this;
        }

        /**
         * <p>Specifies whether to enable the health check feature. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: yes</li>
         * <li><strong>off</strong>: no</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is required and takes effect if the <strong>ListenerSync</strong> parameter is set to <strong>off</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder healthCheck(String healthCheck) {
            this.putQueryParameter("HealthCheck", healthCheck);
            this.healthCheck = healthCheck;
            return this;
        }

        /**
         * <p>The port that is used for health checks. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
         * <blockquote>
         * <p> This parameter takes effect when the <strong>HealthCheck</strong> parameter is set to <strong>on</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
            this.putQueryParameter("HealthCheckConnectPort", healthCheckConnectPort);
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }

        /**
         * <p>The domain name that is used for health checks. Valid values:</p>
         * <ul>
         * <li><strong>$_ip</strong>: the private IP address of a backend server. If you do not set this parameter or set the parameter to $_ip, the SLB instance uses the private IP address of each backend server for health checks.</li>
         * <li><strong>domain</strong>: The domain name must be 1 to 80 characters in length, and can contain letters, digits, periods (.), and hyphens (-).</li>
         * </ul>
         * <blockquote>
         * <p> This parameter takes effect if the <strong>HealthCheck</strong> parameter is set to <strong>on</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>$_ip</p>
         */
        public Builder healthCheckDomain(String healthCheckDomain) {
            this.putQueryParameter("HealthCheckDomain", healthCheckDomain);
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }

        /**
         * <p>The HTTP status code for a successful health check. Multiple HTTP status codes are separated by commas (,).</p>
         * <p>Valid values: <strong>http_2xx</strong>, <strong>http_3xx</strong>, <strong>http_4xx</strong>, and <strong>http_5xx</strong>.</p>
         * <blockquote>
         * <p> This parameter is required and takes effect if the <strong>HealthCheck</strong> parameter is set to <strong>on</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>http_2xx</p>
         */
        public Builder healthCheckHttpCode(String healthCheckHttpCode) {
            this.putQueryParameter("HealthCheckHttpCode", healthCheckHttpCode);
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }

        /**
         * <p>The interval between two consecutive health checks. Unit: seconds. Valid values: <strong>1</strong> to <strong>50</strong>.</p>
         * <blockquote>
         * <p> This parameter is required and takes effect if the <strong>HealthCheck</strong> parameter is set to <strong>on</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder healthCheckInterval(Integer healthCheckInterval) {
            this.putQueryParameter("HealthCheckInterval", healthCheckInterval);
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }

        /**
         * <p>The timeout period of a health check response. If a backend server, such as an Elastic Compute Service (ECS) instance, does not return a health check response within the specified timeout period, the server fails the health check. Unit: seconds. Valid values: <strong>1</strong> to <strong>300</strong>.</p>
         * <blockquote>
         * <p> This parameter is required and takes effect if the <strong>HealthCheck</strong> parameter is set to <strong>on</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder healthCheckTimeout(Integer healthCheckTimeout) {
            this.putQueryParameter("HealthCheckTimeout", healthCheckTimeout);
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }

        /**
         * <p>The URI that is used for health checks.</p>
         * <blockquote>
         * <p> This parameter is required and takes effect if the <strong>HealthCheck</strong> parameter is set to <strong>on</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/example</p>
         */
        public Builder healthCheckURI(String healthCheckURI) {
            this.putQueryParameter("HealthCheckURI", healthCheckURI);
            this.healthCheckURI = healthCheckURI;
            return this;
        }

        /**
         * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status is changed from <strong>fail</strong> to <strong>success</strong>.</p>
         * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
         * <blockquote>
         * <p> This parameter is required and takes effect if the <strong>HealthCheck</strong> parameter is set to <strong>on</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder healthyThreshold(Integer healthyThreshold) {
            this.putQueryParameter("HealthyThreshold", healthyThreshold);
            this.healthyThreshold = healthyThreshold;
            return this;
        }

        /**
         * <p>Specifies whether to use the scheduling algorithm, session persistence, and health check configurations of the listener. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: uses the configurations of the listener.</li>
         * <li><strong>off</strong>: does not use the configurations of the listener. You can customize the health check and session persistence configurations for the forwarding rule.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder listenerSync(String listenerSync) {
            this.putQueryParameter("ListenerSync", listenerSync);
            this.listenerSync = listenerSync;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The ID of the region where the Classic Load Balancer (CLB) instance is deployed.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/27584.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The ID of the forwarding rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rule-3ejhkt****</p>
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The name of the forwarding rule. The name must be 1 to 40 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).</p>
         * <blockquote>
         * <p>On the same listener, the forwarding rule names must be unique.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>doctest</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The scheduling algorithm. Valid values:</p>
         * <ul>
         * <li><strong>wrr</strong>: Backend servers with higher weights receive more requests than those with lower weights.</li>
         * <li><strong>rr</strong>: Requests are distributed to backend servers in sequence.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is required and takes effect if the <strong>ListenerSync</strong> parameter is set to <strong>off</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>wrr</p>
         */
        public Builder scheduler(String scheduler) {
            this.putQueryParameter("Scheduler", scheduler);
            this.scheduler = scheduler;
            return this;
        }

        /**
         * <p>Specifies whether to enable session persistence. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: yes</li>
         * <li><strong>off</strong>: no</li>
         * </ul>
         * <p>This parameter is required and takes effect if the <strong>ListenerSync</strong> parameter is set to <strong>off</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder stickySession(String stickySession) {
            this.putQueryParameter("StickySession", stickySession);
            this.stickySession = stickySession;
            return this;
        }

        /**
         * <p>The method that is used to handle a cookie. Valid values:</p>
         * <ul>
         * <li><p><strong>insert</strong>: inserts a cookie.</p>
         * <p>CLB inserts the backend server ID as a cookie into the first HTTP or HTTPS response that is sent to a client. The next request from the client will contain this cookie, and the listener will distribute this request to the recorded backend server.</p>
         * </li>
         * <li><p><strong>server</strong>: rewrites a cookie.</p>
         * <p>When CLB detects a user-defined cookie, it overwrites the original cookie with the user-defined cookie. The next request from the client will contain the user-defined cookie, and the listener will distribute this request to the recorded backend server.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p> This parameter is required and takes effect if the <strong>StickySession</strong> parameter is set to <strong>on</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>insert</p>
         */
        public Builder stickySessionType(String stickySessionType) {
            this.putQueryParameter("StickySessionType", stickySessionType);
            this.stickySessionType = stickySessionType;
            return this;
        }

        /**
         * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status is changed from <strong>success</strong> to <strong>fail</strong>.</p>
         * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
         * <blockquote>
         * <p> This parameter is required and takes effect if the <strong>HealthCheck</strong> parameter is set to <strong>on</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.putQueryParameter("UnhealthyThreshold", unhealthyThreshold);
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        /**
         * <p>The ID of the vServer group that is associated with the forwarding rule.</p>
         * 
         * <strong>example:</strong>
         * <p>rsp-cige6****</p>
         */
        public Builder vServerGroupId(String vServerGroupId) {
            this.putQueryParameter("VServerGroupId", vServerGroupId);
            this.vServerGroupId = vServerGroupId;
            return this;
        }

        @Override
        public SetRuleRequest build() {
            return new SetRuleRequest(this);
        } 

    } 

}
