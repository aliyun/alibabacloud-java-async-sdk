// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeListenerResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeListenerResponseBody</p>
 */
public class DescribeListenerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AcceleratorId")
    private String acceleratorId;

    @com.aliyun.core.annotation.NameInMap("AclType")
    private String aclType;

    @com.aliyun.core.annotation.NameInMap("BackendPorts")
    private java.util.List < BackendPorts> backendPorts;

    @com.aliyun.core.annotation.NameInMap("Certificates")
    private java.util.List < Certificates> certificates;

    @com.aliyun.core.annotation.NameInMap("ClientAffinity")
    private String clientAffinity;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("HttpVersion")
    private String httpVersion;

    @com.aliyun.core.annotation.NameInMap("IdleTimeout")
    private Integer idleTimeout;

    @com.aliyun.core.annotation.NameInMap("ListenerId")
    private String listenerId;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("PortRanges")
    private java.util.List < PortRanges> portRanges;

    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.NameInMap("ProxyProtocol")
    private Boolean proxyProtocol;

    @com.aliyun.core.annotation.NameInMap("RelatedAcls")
    private java.util.List < RelatedAcls> relatedAcls;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RequestTimeout")
    private Integer requestTimeout;

    @com.aliyun.core.annotation.NameInMap("SecurityPolicyId")
    private String securityPolicyId;

    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    @com.aliyun.core.annotation.NameInMap("ServiceManaged")
    private Boolean serviceManaged;

    @com.aliyun.core.annotation.NameInMap("ServiceManagedInfos")
    private java.util.List < ServiceManagedInfos> serviceManagedInfos;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("XForwardedForConfig")
    private XForwardedForConfig xForwardedForConfig;

    private DescribeListenerResponseBody(Builder builder) {
        this.acceleratorId = builder.acceleratorId;
        this.aclType = builder.aclType;
        this.backendPorts = builder.backendPorts;
        this.certificates = builder.certificates;
        this.clientAffinity = builder.clientAffinity;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.httpVersion = builder.httpVersion;
        this.idleTimeout = builder.idleTimeout;
        this.listenerId = builder.listenerId;
        this.name = builder.name;
        this.portRanges = builder.portRanges;
        this.protocol = builder.protocol;
        this.proxyProtocol = builder.proxyProtocol;
        this.relatedAcls = builder.relatedAcls;
        this.requestId = builder.requestId;
        this.requestTimeout = builder.requestTimeout;
        this.securityPolicyId = builder.securityPolicyId;
        this.serviceId = builder.serviceId;
        this.serviceManaged = builder.serviceManaged;
        this.serviceManagedInfos = builder.serviceManagedInfos;
        this.state = builder.state;
        this.type = builder.type;
        this.xForwardedForConfig = builder.xForwardedForConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeListenerResponseBody create() {
        return builder().build();
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return aclType
     */
    public String getAclType() {
        return this.aclType;
    }

    /**
     * @return backendPorts
     */
    public java.util.List < BackendPorts> getBackendPorts() {
        return this.backendPorts;
    }

    /**
     * @return certificates
     */
    public java.util.List < Certificates> getCertificates() {
        return this.certificates;
    }

    /**
     * @return clientAffinity
     */
    public String getClientAffinity() {
        return this.clientAffinity;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return httpVersion
     */
    public String getHttpVersion() {
        return this.httpVersion;
    }

    /**
     * @return idleTimeout
     */
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    /**
     * @return listenerId
     */
    public String getListenerId() {
        return this.listenerId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return portRanges
     */
    public java.util.List < PortRanges> getPortRanges() {
        return this.portRanges;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return proxyProtocol
     */
    public Boolean getProxyProtocol() {
        return this.proxyProtocol;
    }

    /**
     * @return relatedAcls
     */
    public java.util.List < RelatedAcls> getRelatedAcls() {
        return this.relatedAcls;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return requestTimeout
     */
    public Integer getRequestTimeout() {
        return this.requestTimeout;
    }

    /**
     * @return securityPolicyId
     */
    public String getSecurityPolicyId() {
        return this.securityPolicyId;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return serviceManaged
     */
    public Boolean getServiceManaged() {
        return this.serviceManaged;
    }

    /**
     * @return serviceManagedInfos
     */
    public java.util.List < ServiceManagedInfos> getServiceManagedInfos() {
        return this.serviceManagedInfos;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return xForwardedForConfig
     */
    public XForwardedForConfig getXForwardedForConfig() {
        return this.xForwardedForConfig;
    }

    public static final class Builder {
        private String acceleratorId; 
        private String aclType; 
        private java.util.List < BackendPorts> backendPorts; 
        private java.util.List < Certificates> certificates; 
        private String clientAffinity; 
        private String createTime; 
        private String description; 
        private String httpVersion; 
        private Integer idleTimeout; 
        private String listenerId; 
        private String name; 
        private java.util.List < PortRanges> portRanges; 
        private String protocol; 
        private Boolean proxyProtocol; 
        private java.util.List < RelatedAcls> relatedAcls; 
        private String requestId; 
        private Integer requestTimeout; 
        private String securityPolicyId; 
        private String serviceId; 
        private Boolean serviceManaged; 
        private java.util.List < ServiceManagedInfos> serviceManagedInfos; 
        private String state; 
        private String type; 
        private XForwardedForConfig xForwardedForConfig; 

        /**
         * The ID of the GA instance.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * The type of the ACL. Valid values:
         * <p>
         * 
         * *   **white**: a whitelist. Only requests from the IP addresses or CIDR blocks in the ACL are forwarded. Whitelists are suitable for scenarios in which you want to allow only specific IP addresses to access an application. If a whitelist is improperly configured, risks may arise. After a whitelist is configured for a listener, only requests from the IP addresses that are added to the whitelist are distributed by the listener. If the whitelist is enabled but no IP addresses are added to the ACL, the listener does not forward requests.
         * *   **black**: a blacklist. All requests from the IP addresses or CIDR blocks in the ACL are blocked. Blacklists are suitable for scenarios in which you want to deny access from specific IP addresses to an application. If the blacklist is enabled but no IP addresses are added to the ACL, the listener forwards all requests.
         * 
         * This parameter is returned only if the value of **Status** is **on**.
         */
        public Builder aclType(String aclType) {
            this.aclType = aclType;
            return this;
        }

        /**
         * The information about the backend ports.
         */
        public Builder backendPorts(java.util.List < BackendPorts> backendPorts) {
            this.backendPorts = backendPorts;
            return this;
        }

        /**
         * The SSL certificates.
         */
        public Builder certificates(java.util.List < Certificates> certificates) {
            this.certificates = certificates;
            return this;
        }

        /**
         * Indicates whether client affinity is enabled for the listener.
         * <p>
         * 
         * *   If **NONE** is returned, client affinity is disabled. Requests from the same client may be forwarded to different endpoints.
         * *   If **SOURCE_IP** is returned, client affinity is enabled. When a client accesses stateful applications, requests from the same client are forwarded to the same endpoint regardless of the source port or protocol.
         */
        public Builder clientAffinity(String clientAffinity) {
            this.clientAffinity = clientAffinity;
            return this;
        }

        /**
         * The time when the listener was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. Unit: milliseconds.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * The description of the listener.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The maximum version of the HTTP protocol. Valid values:
         * <p>
         * 
         * *   **http3**
         * *   **http2**
         * *   **http1.1**
         * 
         * >  This parameter is returned only for HTTPS listeners.
         */
        public Builder httpVersion(String httpVersion) {
            this.httpVersion = httpVersion;
            return this;
        }

        /**
         * The timeout period of idle connections. Unit: seconds.
         */
        public Builder idleTimeout(Integer idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }

        /**
         * The ID of the listener.
         */
        public Builder listenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }

        /**
         * The name of the listener.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The information about the listener ports.
         */
        public Builder portRanges(java.util.List < PortRanges> portRanges) {
            this.portRanges = portRanges;
            return this;
        }

        /**
         * The network transmission protocol that is used by the listener. Valid values:
         * <p>
         * 
         * *   **tcp**: TCP.
         * *   **udp**: UDP.
         * *   **http**: HTTP.
         * *   **https**: HTTPS.
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * Indicates whether the client IP address preservation feature is enabled. Valid values:
         * <p>
         * 
         * *   **true** You can view the source IP addresses of clients over the backend service.
         * *   **false**
         */
        public Builder proxyProtocol(Boolean proxyProtocol) {
            this.proxyProtocol = proxyProtocol;
            return this;
        }

        /**
         * The information about the access control list (ACL) that is associated with the listener.
         */
        public Builder relatedAcls(java.util.List < RelatedAcls> relatedAcls) {
            this.relatedAcls = relatedAcls;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The timeout period of HTTP or HTTPS requests. Unit: seconds.
         * <p>
         * 
         * >  This parameter is returned only for HTTP and HTTPS listeners. If no responses are received from the backend server within the specified timeout period, GA returns the HTTP 504 error code to the client.
         */
        public Builder requestTimeout(Integer requestTimeout) {
            this.requestTimeout = requestTimeout;
            return this;
        }

        /**
         * The ID of the security policy.
         * <p>
         * 
         * *   **tls_cipher_policy\_1\_0**
         * 
         *     *   Supported Transport Layer Security (TLS) versions: TLS 1.0, TLS 1.1, and TLS 1.2.
         *     *   Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA.
         * 
         * *   **tls_cipher_policy\_1\_1**
         * 
         *     *   Supported TLS versions: TLS 1.1 and TLS 1.2.
         *     *   Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA.
         * 
         * *   **tls_cipher_policy\_1\_2**
         * 
         *     *   Supported TLS version: TLS 1.2.
         *     *   Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA.
         * 
         * *   **tls_cipher_policy\_1\_2\_strict**
         * 
         *     *   Supported TLS version: TLS 1.2.
         *     *   Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, ECDHE-RSA-AES128-SHA, and ECDHE-RSA-AES256-SHA.
         * 
         * *   **tls_cipher_policy\_1\_2\_strict_with\_1\_3**
         * 
         *     *   Supported TLS versions: TLS 1.2 and TLS 1.3.
         *     *   Supported cipher suites: TLS_AES\_128\_GCM_SHA256, TLS_AES\_256\_GCM_SHA384, TLS_CHACHA20\_POLY1305\_SHA256, TLS_AES\_128\_CCM_SHA256, TLS_AES\_128\_CCM\_8\_SHA256, ECDHE-ECDSA-AES128-GCM-SHA256, ECDHE-ECDSA-AES256-GCM-SHA384, ECDHE-ECDSA-AES128-SHA256, ECDHE-ECDSA-AES256-SHA384, ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, ECDHE-ECDSA-AES128-SHA, ECDHE-ECDSA-AES256-SHA, ECDHE-RSA-AES128-SHA, and ECDHE-RSA-AES256-SHA.
         * 
         * >  This parameter is returned only for HTTPS listeners.
         */
        public Builder securityPolicyId(String securityPolicyId) {
            this.securityPolicyId = securityPolicyId;
            return this;
        }

        /**
         * The ID of the service that manages the instance.
         * <p>
         * 
         * >  This parameter is returned only if the value of **ServiceManaged** is **true**.
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * Indicates whether the instance is managed. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder serviceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }

        /**
         * The actions that users can perform on the managed instance.
         * <p>
         * >*   This parameter is returned only if the value of **ServiceManaged** is **true**.
         * >*   Users can perform only specific actions on a managed instance.
         */
        public Builder serviceManagedInfos(java.util.List < ServiceManagedInfos> serviceManagedInfos) {
            this.serviceManagedInfos = serviceManagedInfos;
            return this;
        }

        /**
         * The status of the listener. Valid values:
         * <p>
         * 
         * *   **configuring**: The listener is being configured.
         * *   **init**: The listener is being initialized.
         * *   **updating**: The listener is being updated.
         * *   **deleting:** The listener is being deleted.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * The routing type of the listener. Valid values:
         * <p>
         * 
         * *   **Standard**: intelligent routing.
         * *   **CustomRouting**: custom routing.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * The configurations of the `XForward` headers.
         */
        public Builder xForwardedForConfig(XForwardedForConfig xForwardedForConfig) {
            this.xForwardedForConfig = xForwardedForConfig;
            return this;
        }

        public DescribeListenerResponseBody build() {
            return new DescribeListenerResponseBody(this);
        } 

    } 

    public static class BackendPorts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FromPort")
        private String fromPort;

        @com.aliyun.core.annotation.NameInMap("ToPort")
        private String toPort;

        private BackendPorts(Builder builder) {
            this.fromPort = builder.fromPort;
            this.toPort = builder.toPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackendPorts create() {
            return builder().build();
        }

        /**
         * @return fromPort
         */
        public String getFromPort() {
            return this.fromPort;
        }

        /**
         * @return toPort
         */
        public String getToPort() {
            return this.toPort;
        }

        public static final class Builder {
            private String fromPort; 
            private String toPort; 

            /**
             * The first port in the range of ports that are used by the backend server to receive requests.
             * <p>
             * 
             * This parameter is returned only if an HTTPS listener is configured and the listener port is the same as the service port of the backend server.
             */
            public Builder fromPort(String fromPort) {
                this.fromPort = fromPort;
                return this;
            }

            /**
             * The last port in the range of ports that are used by the backend server to receive requests.
             */
            public Builder toPort(String toPort) {
                this.toPort = toPort;
                return this;
            }

            public BackendPorts build() {
                return new BackendPorts(this);
            } 

        } 

    }
    public static class Certificates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Certificates(Builder builder) {
            this.id = builder.id;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Certificates create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private String type; 

            /**
             * The ID of the SSL certificate.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The type of the SSL certificate.
             * <p>
             * 
             * Only **Server** may be returned, which indicates a server certificate.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Certificates build() {
                return new Certificates(this);
            } 

        } 

    }
    public static class PortRanges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FromPort")
        private Integer fromPort;

        @com.aliyun.core.annotation.NameInMap("ToPort")
        private Integer toPort;

        private PortRanges(Builder builder) {
            this.fromPort = builder.fromPort;
            this.toPort = builder.toPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PortRanges create() {
            return builder().build();
        }

        /**
         * @return fromPort
         */
        public Integer getFromPort() {
            return this.fromPort;
        }

        /**
         * @return toPort
         */
        public Integer getToPort() {
            return this.toPort;
        }

        public static final class Builder {
            private Integer fromPort; 
            private Integer toPort; 

            /**
             * The first port in the range of listener ports that are used to receive and forward requests to endpoints.
             */
            public Builder fromPort(Integer fromPort) {
                this.fromPort = fromPort;
                return this;
            }

            /**
             * The last port in the range of listener ports that are used to receive and forward requests to endpoints.
             */
            public Builder toPort(Integer toPort) {
                this.toPort = toPort;
                return this;
            }

            public PortRanges build() {
                return new PortRanges(this);
            } 

        } 

    }
    public static class RelatedAcls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclId")
        private String aclId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private RelatedAcls(Builder builder) {
            this.aclId = builder.aclId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedAcls create() {
            return builder().build();
        }

        /**
         * @return aclId
         */
        public String getAclId() {
            return this.aclId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String aclId; 
            private String status; 

            /**
             * The ID of the ACL that is associated with the listener.
             */
            public Builder aclId(String aclId) {
                this.aclId = aclId;
                return this;
            }

            /**
             * Indicates whether the access control feature is enabled. Valid values:
             * <p>
             * 
             * *   **on**: enabled.
             * *   **off**: disabled.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public RelatedAcls build() {
                return new RelatedAcls(this);
            } 

        } 

    }
    public static class ServiceManagedInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("ChildType")
        private String childType;

        @com.aliyun.core.annotation.NameInMap("IsManaged")
        private Boolean isManaged;

        private ServiceManagedInfos(Builder builder) {
            this.action = builder.action;
            this.childType = builder.childType;
            this.isManaged = builder.isManaged;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceManagedInfos create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return childType
         */
        public String getChildType() {
            return this.childType;
        }

        /**
         * @return isManaged
         */
        public Boolean getIsManaged() {
            return this.isManaged;
        }

        public static final class Builder {
            private String action; 
            private String childType; 
            private Boolean isManaged; 

            /**
             * The name of the action on the managed instance. Valid values:
             * <p>
             * 
             * *   **Create**
             * *   **Update**
             * *   **Delete**
             * *   **Associate**
             * *   **UserUnmanaged**
             * *   **CreateChild**
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * The type of the child resource. Valid values:
             * <p>
             * 
             * *   **Listener**: a listener.
             * *   **IpSet**: an acceleration region.
             * *   **EndpointGroup**: an endpoint group.
             * *   **ForwardingRule**: a forwarding rule.
             * *   **Endpoint**: an endpoint.
             * *   **EndpointGroupDestination**: a protocol mapping of an endpoint group associated with a custom routing listener.
             * *   **EndpointPolicy**: a traffic policy of an endpoint associated with a custom routing listener.
             * 
             * >  This parameter is returned only if the value of **Action** is **CreateChild**.
             */
            public Builder childType(String childType) {
                this.childType = childType;
                return this;
            }

            /**
             * Indicates whether the specified actions are managed.
             * <p>
             * 
             * *   **true**: The specified actions are managed, and users cannot perform the specified actions on the managed instance.
             * *   **false**: The specified actions are not managed, and users can perform the specified actions on the managed instance.
             */
            public Builder isManaged(Boolean isManaged) {
                this.isManaged = isManaged;
                return this;
            }

            public ServiceManagedInfos build() {
                return new ServiceManagedInfos(this);
            } 

        } 

    }
    public static class XForwardedForConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("XForwardedForGaApEnabled")
        private Boolean xForwardedForGaApEnabled;

        @com.aliyun.core.annotation.NameInMap("XForwardedForGaIdEnabled")
        private Boolean xForwardedForGaIdEnabled;

        @com.aliyun.core.annotation.NameInMap("XForwardedForPortEnabled")
        private Boolean xForwardedForPortEnabled;

        @com.aliyun.core.annotation.NameInMap("XForwardedForProtoEnabled")
        private Boolean xForwardedForProtoEnabled;

        @com.aliyun.core.annotation.NameInMap("XRealIpEnabled")
        private Boolean xRealIpEnabled;

        private XForwardedForConfig(Builder builder) {
            this.xForwardedForGaApEnabled = builder.xForwardedForGaApEnabled;
            this.xForwardedForGaIdEnabled = builder.xForwardedForGaIdEnabled;
            this.xForwardedForPortEnabled = builder.xForwardedForPortEnabled;
            this.xForwardedForProtoEnabled = builder.xForwardedForProtoEnabled;
            this.xRealIpEnabled = builder.xRealIpEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static XForwardedForConfig create() {
            return builder().build();
        }

        /**
         * @return xForwardedForGaApEnabled
         */
        public Boolean getXForwardedForGaApEnabled() {
            return this.xForwardedForGaApEnabled;
        }

        /**
         * @return xForwardedForGaIdEnabled
         */
        public Boolean getXForwardedForGaIdEnabled() {
            return this.xForwardedForGaIdEnabled;
        }

        /**
         * @return xForwardedForPortEnabled
         */
        public Boolean getXForwardedForPortEnabled() {
            return this.xForwardedForPortEnabled;
        }

        /**
         * @return xForwardedForProtoEnabled
         */
        public Boolean getXForwardedForProtoEnabled() {
            return this.xForwardedForProtoEnabled;
        }

        /**
         * @return xRealIpEnabled
         */
        public Boolean getXRealIpEnabled() {
            return this.xRealIpEnabled;
        }

        public static final class Builder {
            private Boolean xForwardedForGaApEnabled; 
            private Boolean xForwardedForGaIdEnabled; 
            private Boolean xForwardedForPortEnabled; 
            private Boolean xForwardedForProtoEnabled; 
            private Boolean xRealIpEnabled; 

            /**
             * Indicates whether the `GA-AP` header is used to retrieve information about acceleration regions. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * 
             * >  This parameter is returned only for HTTP and HTTPS listeners.
             */
            public Builder xForwardedForGaApEnabled(Boolean xForwardedForGaApEnabled) {
                this.xForwardedForGaApEnabled = xForwardedForGaApEnabled;
                return this;
            }

            /**
             * Indicates whether the `GA-ID` header is used to retrieve the ID of the GA instance. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * 
             * >  This parameter is returned only for HTTP and HTTPS listeners.
             */
            public Builder xForwardedForGaIdEnabled(Boolean xForwardedForGaIdEnabled) {
                this.xForwardedForGaIdEnabled = xForwardedForGaIdEnabled;
                return this;
            }

            /**
             * Indicates whether the `GA-X-Forward-Port` header is used to retrieve the listener ports of the GA instance. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * 
             * >  This parameter is returned only for HTTP and HTTPS listeners.
             */
            public Builder xForwardedForPortEnabled(Boolean xForwardedForPortEnabled) {
                this.xForwardedForPortEnabled = xForwardedForPortEnabled;
                return this;
            }

            /**
             * Indicates whether the `GA-X-Forward-Proto` header is used to retrieve the listener protocol of the GA instance. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * 
             * >  This parameter is returned only for HTTP and HTTPS listeners.
             */
            public Builder xForwardedForProtoEnabled(Boolean xForwardedForProtoEnabled) {
                this.xForwardedForProtoEnabled = xForwardedForProtoEnabled;
                return this;
            }

            /**
             * Indicates whether the `X-Real-IP` header is used to retrieve client IP addresses. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * 
             * >  This parameter is returned only for HTTP and HTTPS listeners.
             */
            public Builder xRealIpEnabled(Boolean xRealIpEnabled) {
                this.xRealIpEnabled = xRealIpEnabled;
                return this;
            }

            public XForwardedForConfig build() {
                return new XForwardedForConfig(this);
            } 

        } 

    }
}
