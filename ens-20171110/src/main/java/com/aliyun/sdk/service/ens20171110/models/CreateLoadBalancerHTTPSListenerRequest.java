// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link CreateLoadBalancerHTTPSListenerRequest} extends {@link RequestModel}
 *
 * <p>CreateLoadBalancerHTTPSListenerRequest</p>
 */
public class CreateLoadBalancerHTTPSListenerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackendServerPort")
    @com.aliyun.core.annotation.Validation(maximum = 65535, minimum = 1)
    private Integer backendServerPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cookie")
    private String cookie;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CookieTimeout")
    @com.aliyun.core.annotation.Validation(maximum = 86400, minimum = 1)
    private Integer cookieTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 80, minLength = 1)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForwardPort")
    @com.aliyun.core.annotation.Validation(maximum = 65535, minimum = 1)
    private Integer forwardPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheck")
    @com.aliyun.core.annotation.Validation(required = true)
    private String healthCheck;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckConnectPort")
    @com.aliyun.core.annotation.Validation(maximum = 65535, minimum = 1)
    private Integer healthCheckConnectPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckDomain")
    @com.aliyun.core.annotation.Validation(maxLength = 80, minLength = 1)
    private String healthCheckDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckHttpCode")
    private String healthCheckHttpCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckInterval")
    @com.aliyun.core.annotation.Validation(maximum = 50, minimum = 1)
    private Integer healthCheckInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckMethod")
    private String healthCheckMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckTimeout")
    @com.aliyun.core.annotation.Validation(maximum = 300, minimum = 1)
    private Integer healthCheckTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckURI")
    @com.aliyun.core.annotation.Validation(maxLength = 80, minLength = 1)
    private String healthCheckURI;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthyThreshold")
    @com.aliyun.core.annotation.Validation(maximum = 10, minimum = 2)
    private Integer healthyThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdleTimeout")
    @com.aliyun.core.annotation.Validation(maximum = 60, minimum = 1)
    private Integer idleTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerForward")
    private String listenerForward;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerPort")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 65535, minimum = 1)
    private Integer listenerPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loadBalancerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestTimeout")
    @com.aliyun.core.annotation.Validation(maximum = 180, minimum = 1)
    private Integer requestTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scheduler")
    private String scheduler;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerCertificateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serverCertificateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StickySessionType")
    private String stickySessionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnhealthyThreshold")
    @com.aliyun.core.annotation.Validation(maximum = 10, minimum = 2)
    private Integer unhealthyThreshold;

    private CreateLoadBalancerHTTPSListenerRequest(Builder builder) {
        super(builder);
        this.backendServerPort = builder.backendServerPort;
        this.cookie = builder.cookie;
        this.cookieTimeout = builder.cookieTimeout;
        this.description = builder.description;
        this.forwardPort = builder.forwardPort;
        this.healthCheck = builder.healthCheck;
        this.healthCheckConnectPort = builder.healthCheckConnectPort;
        this.healthCheckDomain = builder.healthCheckDomain;
        this.healthCheckHttpCode = builder.healthCheckHttpCode;
        this.healthCheckInterval = builder.healthCheckInterval;
        this.healthCheckMethod = builder.healthCheckMethod;
        this.healthCheckTimeout = builder.healthCheckTimeout;
        this.healthCheckURI = builder.healthCheckURI;
        this.healthyThreshold = builder.healthyThreshold;
        this.idleTimeout = builder.idleTimeout;
        this.listenerForward = builder.listenerForward;
        this.listenerPort = builder.listenerPort;
        this.loadBalancerId = builder.loadBalancerId;
        this.requestTimeout = builder.requestTimeout;
        this.scheduler = builder.scheduler;
        this.serverCertificateId = builder.serverCertificateId;
        this.stickySessionType = builder.stickySessionType;
        this.unhealthyThreshold = builder.unhealthyThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLoadBalancerHTTPSListenerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backendServerPort
     */
    public Integer getBackendServerPort() {
        return this.backendServerPort;
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return forwardPort
     */
    public Integer getForwardPort() {
        return this.forwardPort;
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
     * @return healthCheckMethod
     */
    public String getHealthCheckMethod() {
        return this.healthCheckMethod;
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
     * @return idleTimeout
     */
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    /**
     * @return listenerForward
     */
    public String getListenerForward() {
        return this.listenerForward;
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
     * @return requestTimeout
     */
    public Integer getRequestTimeout() {
        return this.requestTimeout;
    }

    /**
     * @return scheduler
     */
    public String getScheduler() {
        return this.scheduler;
    }

    /**
     * @return serverCertificateId
     */
    public String getServerCertificateId() {
        return this.serverCertificateId;
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

    public static final class Builder extends Request.Builder<CreateLoadBalancerHTTPSListenerRequest, Builder> {
        private Integer backendServerPort; 
        private String cookie; 
        private Integer cookieTimeout; 
        private String description; 
        private Integer forwardPort; 
        private String healthCheck; 
        private Integer healthCheckConnectPort; 
        private String healthCheckDomain; 
        private String healthCheckHttpCode; 
        private Integer healthCheckInterval; 
        private String healthCheckMethod; 
        private Integer healthCheckTimeout; 
        private String healthCheckURI; 
        private Integer healthyThreshold; 
        private Integer idleTimeout; 
        private String listenerForward; 
        private Integer listenerPort; 
        private String loadBalancerId; 
        private Integer requestTimeout; 
        private String scheduler; 
        private String serverCertificateId; 
        private String stickySessionType; 
        private Integer unhealthyThreshold; 

        private Builder() {
            super();
        } 

        private Builder(CreateLoadBalancerHTTPSListenerRequest request) {
            super(request);
            this.backendServerPort = request.backendServerPort;
            this.cookie = request.cookie;
            this.cookieTimeout = request.cookieTimeout;
            this.description = request.description;
            this.forwardPort = request.forwardPort;
            this.healthCheck = request.healthCheck;
            this.healthCheckConnectPort = request.healthCheckConnectPort;
            this.healthCheckDomain = request.healthCheckDomain;
            this.healthCheckHttpCode = request.healthCheckHttpCode;
            this.healthCheckInterval = request.healthCheckInterval;
            this.healthCheckMethod = request.healthCheckMethod;
            this.healthCheckTimeout = request.healthCheckTimeout;
            this.healthCheckURI = request.healthCheckURI;
            this.healthyThreshold = request.healthyThreshold;
            this.idleTimeout = request.idleTimeout;
            this.listenerForward = request.listenerForward;
            this.listenerPort = request.listenerPort;
            this.loadBalancerId = request.loadBalancerId;
            this.requestTimeout = request.requestTimeout;
            this.scheduler = request.scheduler;
            this.serverCertificateId = request.serverCertificateId;
            this.stickySessionType = request.stickySessionType;
            this.unhealthyThreshold = request.unhealthyThreshold;
        } 

        /**
         * <p>The listening port that is used by the backend instances. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        public Builder backendServerPort(Integer backendServerPort) {
            this.putQueryParameter("BackendServerPort", backendServerPort);
            this.backendServerPort = backendServerPort;
            return this;
        }

        /**
         * <p>The cookie that is configured on the server. The cookie must be <strong>1</strong> to <strong>200</strong> characters in length and contain only ASCII characters and digits.</p>
         * <blockquote>
         * <p> This parameter is required if you set StickySession to on and StickySessionType to server.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder cookie(String cookie) {
            this.putQueryParameter("Cookie", cookie);
            this.cookie = cookie;
            return this;
        }

        /**
         * <p>The timeout period of a cookie. Valid values: <strong>1</strong> to <strong>86400</strong>. Unit: seconds.</p>
         * <blockquote>
         * <p> This parameter is required if you set StickySession to on and StickySessionType to insert.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder cookieTimeout(Integer cookieTimeout) {
            this.putQueryParameter("CookieTimeout", cookieTimeout);
            this.cookieTimeout = cookieTimeout;
            return this;
        }

        /**
         * <p>The description of the listener. The description must be <strong>1</strong> to <strong>80</strong> characters in length.</p>
         * <blockquote>
         * <p> The value cannot start with <code>http://</code> or <code>https://</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>https_80</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The listener port that is used to redirect HTTP requests to HTTPS.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder forwardPort(Integer forwardPort) {
            this.putQueryParameter("ForwardPort", forwardPort);
            this.forwardPort = forwardPort;
            return this;
        }

        /**
         * <p>Specifies whether to enable the health check feature. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder healthCheck(String healthCheck) {
            this.putQueryParameter("HealthCheck", healthCheck);
            this.healthCheck = healthCheck;
            return this;
        }

        /**
         * <p>The port that is used for health checks. Valid values: <strong>1</strong> to <strong>65535</strong>. If you leave this parameter empty, the port specified by BackendServerPort is used for health checks.</p>
         * <blockquote>
         * <p> This parameter takes effect only if you set HealthCheck to on.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
            this.putQueryParameter("HealthCheckConnectPort", healthCheckConnectPort);
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }

        /**
         * <p>The domain name that you want to use for health checks.</p>
         * <blockquote>
         * <p> This parameter takes effect only if you set HealthCheck to on.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder healthCheckDomain(String healthCheckDomain) {
            this.putQueryParameter("HealthCheckDomain", healthCheckDomain);
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }

        /**
         * <p>The HTTP status code for a successful health check. Valid values:</p>
         * <ul>
         * <li><strong>http_2xx</strong> (default)</li>
         * <li><strong>http_3xx</strong></li>
         * <li><strong>http_4xx</strong></li>
         * <li><strong>http_5xx</strong></li>
         * </ul>
         * <blockquote>
         * <p> This parameter takes effect only if you set HealthCheck to on.</p>
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
         * <p>The interval at which health checks are performed. Valid values: <strong>1</strong> to <strong>50</strong>. Default value: <strong>2</strong>. Unit: seconds.</p>
         * <blockquote>
         * <p> This parameter takes effect only if you set HealthCheck to on.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder healthCheckInterval(Integer healthCheckInterval) {
            this.putQueryParameter("HealthCheckInterval", healthCheckInterval);
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }

        /**
         * <p>The health check method used by HTTP listeners. Valid values:</p>
         * <ul>
         * <li><strong>head</strong> (default): requests the head of the page.</li>
         * <li><strong>get</strong>: requests the specified part of the page and returns the entity body.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter takes effect only if you set HealthCheck to on.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>head</p>
         */
        public Builder healthCheckMethod(String healthCheckMethod) {
            this.putQueryParameter("HealthCheckMethod", healthCheckMethod);
            this.healthCheckMethod = healthCheckMethod;
            return this;
        }

        /**
         * <p>The timeout period of a health check response. If a backend server does not respond within the specified timeout period, the server fails to pass the health check.</p>
         * <ul>
         * <li>Default value: 5.</li>
         * <li>Valid values: <strong>1</strong> to <strong>300</strong>.</li>
         * <li>Unit: seconds.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter takes effect only if the HealthCheck parameter is set to on.</p>
         * </li>
         * <li><p>If the value of HealthCheckTimeout is smaller than the value of HealthCheckInterval, the timeout period specified by HealthCheckTimeout becomes invalid, and the value of HealthCheckInterval is used as the timeout period.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder healthCheckTimeout(Integer healthCheckTimeout) {
            this.putQueryParameter("HealthCheckTimeout", healthCheckTimeout);
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }

        /**
         * <p>The URI used for health checks. The URI must be <strong>1</strong> to <strong>80</strong> characters in length.</p>
         * <blockquote>
         * <p> A URL must start with a forward slash (<code>/</code>) but cannot contain only forward slashes (<code>/</code>).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/checkpreload.htm</p>
         */
        public Builder healthCheckURI(String healthCheckURI) {
            this.putQueryParameter("HealthCheckURI", healthCheckURI);
            this.healthCheckURI = healthCheckURI;
            return this;
        }

        /**
         * <p>The number of consecutive successful health checks that must occur before an unhealthy and inaccessible backend server is declared healthy and accessible. Valid values: <strong>2</strong> to <strong>10</strong>. Default value: <strong>3</strong>.</p>
         * <blockquote>
         * <p> This parameter takes effect only if you set HealthCheck to on.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder healthyThreshold(Integer healthyThreshold) {
            this.putQueryParameter("HealthyThreshold", healthyThreshold);
            this.healthyThreshold = healthyThreshold;
            return this;
        }

        /**
         * <p>The timeout period for idle connections. Default value: 15. Valid values: <strong>1</strong> to <strong>60</strong>. Unit: seconds.</p>
         * <blockquote>
         * <p> If no request is received within the specified timeout period, ELB closes the connection. When another request is received, ELB establishes a new connection.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder idleTimeout(Integer idleTimeout) {
            this.putQueryParameter("IdleTimeout", idleTimeout);
            this.idleTimeout = idleTimeout;
            return this;
        }

        /**
         * <p>Specifies whether to enable HTTP-to-HTTPS redirection. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder listenerForward(String listenerForward) {
            this.putQueryParameter("ListenerForward", listenerForward);
            this.listenerForward = listenerForward;
            return this;
        }

        /**
         * <p>The listening port that is used by Edge Load Balancer (ELB) to receive requests and forward the requests to backend servers. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
         * <blockquote>
         * <p> We recommend that you use port 443 for HTTPS.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        public Builder listenerPort(Integer listenerPort) {
            this.putQueryParameter("ListenerPort", listenerPort);
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * <p>The ID of the Edge Load Balancer (ELB) instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-5s8w63yydi59w7klaikam****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * <p>The timeout period of requests. Default value: 60. Valid values: <strong>1</strong> to <strong>180</strong>. Unit: seconds.</p>
         * <blockquote>
         * <p> If no response is received from the backend server within the specified timeout period, ELB returns an HTTP 504 error code to the client.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder requestTimeout(Integer requestTimeout) {
            this.putQueryParameter("RequestTimeout", requestTimeout);
            this.requestTimeout = requestTimeout;
            return this;
        }

        /**
         * <p>The routing algorithm. Valid values:</p>
         * <ul>
         * <li><strong>wrr</strong> (default): Backend servers with higher weights receive more requests than backend servers with lower weights.</li>
         * <li><strong>wlc</strong>: Requests are distributed based on the weight and load of each backend server. The load refers to the number of connections on a backend server. If two backend servers have the same weight, the backend server that has fewer connections receives more requests.</li>
         * <li><strong>rr</strong>: Requests are distributed to backend servers in sequence.</li>
         * <li><strong>sch</strong>: consistent hashing that is based on source IP addresses. Requests from the same source IP address are distributed to the same backend server.</li>
         * <li><strong>qch</strong>: consistent hashing that is based on QUIC connection IDs. Requests that contain the same QUIC connection ID are distributed to the same backend server.</li>
         * <li><strong>iqch</strong>: consistent hashing that is based on specific three bytes of the iQUIC CIDs. Requests whose second to fourth bytes are the same are distributed to the same backend server.</li>
         * </ul>
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
         * <p>The ID of the server certificate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>60276**</p>
         */
        public Builder serverCertificateId(String serverCertificateId) {
            this.putQueryParameter("ServerCertificateId", serverCertificateId);
            this.serverCertificateId = serverCertificateId;
            return this;
        }

        /**
         * <p>The method that is used to handle a cookie. Valid values:</p>
         * <ul>
         * <li><strong>insert</strong>: inserts a cookie. ELB inserts a session cookie (SERVERID) into the first HTTP or HTTPS response that is sent to a client. Subsequent requests to ELB carry this cookie, and ELB determines the destination servers of the requests based on the cookies.</li>
         * <li><strong>server</strong>: rewrites a cookie. When ELB detects a user-defined cookie, it overwrites the original cookie with the user-defined cookie. The next request from the client carries the user-defined cookie, and the listener forwards this request to the recorded backend server.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is required if you set StickySession to on.</p>
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
         * <p>The number of consecutive failed health checks that must occur before a healthy and accessible backend server is declared unhealthy and inaccessible. Valid values: <strong>2</strong> to <strong>10</strong>. Default value: <strong>3</strong>.</p>
         * <blockquote>
         * <p> This parameter takes effect only if you set HealthCheck to on.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.putQueryParameter("UnhealthyThreshold", unhealthyThreshold);
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        @Override
        public CreateLoadBalancerHTTPSListenerRequest build() {
            return new CreateLoadBalancerHTTPSListenerRequest(this);
        } 

    } 

}
