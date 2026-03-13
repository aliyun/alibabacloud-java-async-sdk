// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20130221.models;

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
 * {@link SetLoadBalancerHTTPListenerAttributeRequest} extends {@link RequestModel}
 *
 * <p>SetLoadBalancerHTTPListenerAttributeRequest</p>
 */
public class SetLoadBalancerHTTPListenerAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cookie")
    private String cookie;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CookieTimeout")
    private Integer cookieTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheck")
    private String healthCheck;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckTimeout")
    private Integer healthCheckTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthyThreshold")
    private Integer healthyThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostId")
    private String hostId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private Integer interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerPort")
    private Integer listenerPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    private String loadBalancerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

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
    @com.aliyun.core.annotation.NameInMap("URI")
    private String URI;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnhealthyThreshold")
    private Integer unhealthyThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("XForwardedFor")
    private String xForwardedFor;

    private SetLoadBalancerHTTPListenerAttributeRequest(Builder builder) {
        super(builder);
        this.cookie = builder.cookie;
        this.cookieTimeout = builder.cookieTimeout;
        this.domain = builder.domain;
        this.healthCheck = builder.healthCheck;
        this.healthCheckTimeout = builder.healthCheckTimeout;
        this.healthyThreshold = builder.healthyThreshold;
        this.hostId = builder.hostId;
        this.interval = builder.interval;
        this.listenerPort = builder.listenerPort;
        this.loadBalancerId = builder.loadBalancerId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.scheduler = builder.scheduler;
        this.stickySession = builder.stickySession;
        this.stickySessionType = builder.stickySessionType;
        this.URI = builder.URI;
        this.unhealthyThreshold = builder.unhealthyThreshold;
        this.xForwardedFor = builder.xForwardedFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetLoadBalancerHTTPListenerAttributeRequest create() {
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
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return healthCheck
     */
    public String getHealthCheck() {
        return this.healthCheck;
    }

    /**
     * @return healthCheckTimeout
     */
    public Integer getHealthCheckTimeout() {
        return this.healthCheckTimeout;
    }

    /**
     * @return healthyThreshold
     */
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    /**
     * @return hostId
     */
    public String getHostId() {
        return this.hostId;
    }

    /**
     * @return interval
     */
    public Integer getInterval() {
        return this.interval;
    }

    /**
     * @return listenerPort
     */
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
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
    public String getOwnerId() {
        return this.ownerId;
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
     * @return URI
     */
    public String getURI() {
        return this.URI;
    }

    /**
     * @return unhealthyThreshold
     */
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    /**
     * @return xForwardedFor
     */
    public String getXForwardedFor() {
        return this.xForwardedFor;
    }

    public static final class Builder extends Request.Builder<SetLoadBalancerHTTPListenerAttributeRequest, Builder> {
        private String cookie; 
        private Integer cookieTimeout; 
        private String domain; 
        private String healthCheck; 
        private Integer healthCheckTimeout; 
        private Integer healthyThreshold; 
        private String hostId; 
        private Integer interval; 
        private Integer listenerPort; 
        private String loadBalancerId; 
        private String ownerAccount; 
        private String ownerId; 
        private String scheduler; 
        private String stickySession; 
        private String stickySessionType; 
        private String URI; 
        private Integer unhealthyThreshold; 
        private String xForwardedFor; 

        private Builder() {
            super();
        } 

        private Builder(SetLoadBalancerHTTPListenerAttributeRequest request) {
            super(request);
            this.cookie = request.cookie;
            this.cookieTimeout = request.cookieTimeout;
            this.domain = request.domain;
            this.healthCheck = request.healthCheck;
            this.healthCheckTimeout = request.healthCheckTimeout;
            this.healthyThreshold = request.healthyThreshold;
            this.hostId = request.hostId;
            this.interval = request.interval;
            this.listenerPort = request.listenerPort;
            this.loadBalancerId = request.loadBalancerId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.scheduler = request.scheduler;
            this.stickySession = request.stickySession;
            this.stickySessionType = request.stickySessionType;
            this.URI = request.URI;
            this.unhealthyThreshold = request.unhealthyThreshold;
            this.xForwardedFor = request.xForwardedFor;
        } 

        /**
         * Cookie.
         */
        public Builder cookie(String cookie) {
            this.putQueryParameter("Cookie", cookie);
            this.cookie = cookie;
            return this;
        }

        /**
         * CookieTimeout.
         */
        public Builder cookieTimeout(Integer cookieTimeout) {
            this.putQueryParameter("CookieTimeout", cookieTimeout);
            this.cookieTimeout = cookieTimeout;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * HealthCheck.
         */
        public Builder healthCheck(String healthCheck) {
            this.putQueryParameter("HealthCheck", healthCheck);
            this.healthCheck = healthCheck;
            return this;
        }

        /**
         * HealthCheckTimeout.
         */
        public Builder healthCheckTimeout(Integer healthCheckTimeout) {
            this.putQueryParameter("HealthCheckTimeout", healthCheckTimeout);
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }

        /**
         * HealthyThreshold.
         */
        public Builder healthyThreshold(Integer healthyThreshold) {
            this.putQueryParameter("HealthyThreshold", healthyThreshold);
            this.healthyThreshold = healthyThreshold;
            return this;
        }

        /**
         * HostId.
         */
        public Builder hostId(String hostId) {
            this.putQueryParameter("HostId", hostId);
            this.hostId = hostId;
            return this;
        }

        /**
         * Interval.
         */
        public Builder interval(Integer interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * ListenerPort.
         */
        public Builder listenerPort(Integer listenerPort) {
            this.putQueryParameter("ListenerPort", listenerPort);
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * LoadBalancerId.
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
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
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Scheduler.
         */
        public Builder scheduler(String scheduler) {
            this.putQueryParameter("Scheduler", scheduler);
            this.scheduler = scheduler;
            return this;
        }

        /**
         * StickySession.
         */
        public Builder stickySession(String stickySession) {
            this.putQueryParameter("StickySession", stickySession);
            this.stickySession = stickySession;
            return this;
        }

        /**
         * StickySessionType.
         */
        public Builder stickySessionType(String stickySessionType) {
            this.putQueryParameter("StickySessionType", stickySessionType);
            this.stickySessionType = stickySessionType;
            return this;
        }

        /**
         * URI.
         */
        public Builder URI(String URI) {
            this.putQueryParameter("URI", URI);
            this.URI = URI;
            return this;
        }

        /**
         * UnhealthyThreshold.
         */
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.putQueryParameter("UnhealthyThreshold", unhealthyThreshold);
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        /**
         * XForwardedFor.
         */
        public Builder xForwardedFor(String xForwardedFor) {
            this.putQueryParameter("XForwardedFor", xForwardedFor);
            this.xForwardedFor = xForwardedFor;
            return this;
        }

        @Override
        public SetLoadBalancerHTTPListenerAttributeRequest build() {
            return new SetLoadBalancerHTTPListenerAttributeRequest(this);
        } 

    } 

}
