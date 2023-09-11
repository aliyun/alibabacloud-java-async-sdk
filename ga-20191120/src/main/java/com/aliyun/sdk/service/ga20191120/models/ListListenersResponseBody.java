// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListListenersResponseBody} extends {@link TeaModel}
 *
 * <p>ListListenersResponseBody</p>
 */
public class ListListenersResponseBody extends TeaModel {
    @NameInMap("Listeners")
    private java.util.List < Listeners> listeners;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListListenersResponseBody(Builder builder) {
        this.listeners = builder.listeners;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListListenersResponseBody create() {
        return builder().build();
    }

    /**
     * @return listeners
     */
    public java.util.List < Listeners> getListeners() {
        return this.listeners;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    public static final class Builder {
        private java.util.List < Listeners> listeners; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The information about the listeners.
         */
        public Builder listeners(java.util.List < Listeners> listeners) {
            this.listeners = listeners;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListListenersResponseBody build() {
            return new ListListenersResponseBody(this);
        } 

    } 

    public static class BackendPorts extends TeaModel {
        @NameInMap("FromPort")
        private String fromPort;

        @NameInMap("ToPort")
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
             * The start port in the range of ports used by the backend server.
             */
            public Builder fromPort(String fromPort) {
                this.fromPort = fromPort;
                return this;
            }

            /**
             * The end port in the range of ports used by the backend server.
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
        @NameInMap("Id")
        private String id;

        @NameInMap("Type")
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
             * The type of the certificate.
             * <p>
             * 
             * Only **Server** can be returned, which indicates a server certificate.
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
        @NameInMap("FromPort")
        private Integer fromPort;

        @NameInMap("ToPort")
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
             * The start port in the range of listener ports used to receive and forward requests to endpoints.
             */
            public Builder fromPort(Integer fromPort) {
                this.fromPort = fromPort;
                return this;
            }

            /**
             * The start port in the range of listener ports used to receive and forward requests to endpoints.
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
    public static class ServiceManagedInfos extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("ChildType")
        private String childType;

        @NameInMap("IsManaged")
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
             * Managed policy action name, Valid values:
             * <p>
             * - Create
             * - Update
             * - Delete
             * - Associate
             * - UserUnmanaged
             * - CreateChild
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * Sub resource type, Valid values:
             * <p>
             * 
             * - Listener
             * - IpSet
             * - EndpointGroup
             * - ForwardingRule
             * - Endpoint
             * - EndpointGroupDestination
             * - EndpointPolicy
             * 
             * >Only valid when the Action parameter is CreateChild.
             */
            public Builder childType(String childType) {
                this.childType = childType;
                return this;
            }

            /**
             * Is the managed policy action managed, Valid values:
             * <p>
             * 
             * - true: The managed policy action is managed, and users do not have permission to perform the operation specified in the Action on the managed instance.
             * 
             * - false: The managed policy action is not managed, and users have permission to perform the operation specified in the Action on the managed instance.
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
        @NameInMap("XForwardedForGaApEnabled")
        private Boolean xForwardedForGaApEnabled;

        @NameInMap("XForwardedForGaIdEnabled")
        private Boolean xForwardedForGaIdEnabled;

        @NameInMap("XForwardedForPortEnabled")
        private Boolean xForwardedForPortEnabled;

        @NameInMap("XForwardedForProtoEnabled")
        private Boolean xForwardedForProtoEnabled;

        @NameInMap("XRealIpEnabled")
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
             * Indicates whether the `GA-AP` header is used to retrieve the information about acceleration regions. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
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
             * *   **true**: yes
             * *   **false**: no
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
             * *   **true**: yes
             * *   **false**: no
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
             * *   **true**: yes
             * *   **false**: no
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
             * *   **true**: yes
             * *   **false**: no
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
    public static class Listeners extends TeaModel {
        @NameInMap("AcceleratorId")
        private String acceleratorId;

        @NameInMap("BackendPorts")
        private java.util.List < BackendPorts> backendPorts;

        @NameInMap("Certificates")
        private java.util.List < Certificates> certificates;

        @NameInMap("ClientAffinity")
        private String clientAffinity;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("ListenerId")
        private String listenerId;

        @NameInMap("Name")
        private String name;

        @NameInMap("PortRanges")
        private java.util.List < PortRanges> portRanges;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("ProxyProtocol")
        private Boolean proxyProtocol;

        @NameInMap("SecurityPolicyId")
        private String securityPolicyId;

        @NameInMap("ServiceId")
        private String serviceId;

        @NameInMap("ServiceManaged")
        private Boolean serviceManaged;

        @NameInMap("ServiceManagedInfos")
        private java.util.List < ServiceManagedInfos> serviceManagedInfos;

        @NameInMap("State")
        private String state;

        @NameInMap("Type")
        private String type;

        @NameInMap("XForwardedForConfig")
        private XForwardedForConfig xForwardedForConfig;

        private Listeners(Builder builder) {
            this.acceleratorId = builder.acceleratorId;
            this.backendPorts = builder.backendPorts;
            this.certificates = builder.certificates;
            this.clientAffinity = builder.clientAffinity;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.listenerId = builder.listenerId;
            this.name = builder.name;
            this.portRanges = builder.portRanges;
            this.protocol = builder.protocol;
            this.proxyProtocol = builder.proxyProtocol;
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

        public static Listeners create() {
            return builder().build();
        }

        /**
         * @return acceleratorId
         */
        public String getAcceleratorId() {
            return this.acceleratorId;
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
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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
            private java.util.List < BackendPorts> backendPorts; 
            private java.util.List < Certificates> certificates; 
            private String clientAffinity; 
            private Long createTime; 
            private String description; 
            private String listenerId; 
            private String name; 
            private java.util.List < PortRanges> portRanges; 
            private String protocol; 
            private Boolean proxyProtocol; 
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
             * Details about the ports that can be used by the backend server.
             */
            public Builder backendPorts(java.util.List < BackendPorts> backendPorts) {
                this.backendPorts = backendPorts;
                return this;
            }

            /**
             * Details about the SSL certificates.
             */
            public Builder certificates(java.util.List < Certificates> certificates) {
                this.certificates = certificates;
                return this;
            }

            /**
             * Indicates whether client affinity is enabled for the listener.
             * <p>
             * 
             * *   If **NONE** is returned, client affinity is disabled. In this case, requests from the same client may be forwarded to different endpoints.
             * *   If **SOURCE_IP** is returned, client affinity is enabled. In this case, when a client accesses stateful applications, requests from the same client are always forwarded to the same endpoint regardless of the source port or protocol.
             */
            public Builder clientAffinity(String clientAffinity) {
                this.clientAffinity = clientAffinity;
                return this;
            }

            /**
             * The timestamp that indicates that the listener was created. Unit: milliseconds.
             */
            public Builder createTime(Long createTime) {
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
             * Details about the listener ports.
             */
            public Builder portRanges(java.util.List < PortRanges> portRanges) {
                this.portRanges = portRanges;
                return this;
            }

            /**
             * The network transmission protocol that is used by the listener. Valid values:
             * <p>
             * 
             * *   **tcp**: TCP
             * *   **udp**: UDP
             * *   **http**: HTTP
             * *   **https**: HTTPS
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * Indicates whether the client IP address preservation feature is enabled. Valid values:
             * <p>
             * 
             * *   **true**: The client IP address preservation feature is enabled. After client IP addresses are reserved, you can view the source IP addresses of clients over the backend service.
             * *   **false**: The client IP address preservation feature is disabled.
             */
            public Builder proxyProtocol(Boolean proxyProtocol) {
                this.proxyProtocol = proxyProtocol;
                return this;
            }

            /**
             * The ID of the security policy.
             * <p>
             * 
             * *   **tls_cipher_policy\_1\_0**
             * 
             *     *   Supported Transport Layer Security (TLS) versions: TLS 1.0, TLS 1.1, and TLS 1.2
             *     *   Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA
             * 
             * *   **tls_cipher_policy\_1\_1**
             * 
             *     *   Supported TLS versions: TLS 1.1 and TLS 1.2
             *     *   Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA
             * 
             * *   **tls_cipher_policy\_1\_2**
             * 
             *     *   Supported TLS version: TLS 1.2
             *     *   Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA
             * 
             * *   **tls_cipher_policy\_1\_2\_strict**
             * 
             *     *   Supported TLS version: TLS 1.2
             *     *   Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, ECDHE-RSA-AES128-SHA, and ECDHE-RSA-AES256-SHA
             * 
             * *   **tls_cipher_policy\_1\_2\_strict_with\_1\_3**
             * 
             *     *   Supported TLS versions: TLS 1.2 and TLS 1.3
             *     *   Supported cipher suites: TLS_AES\_128\_GCM_SHA256, TLS_AES\_256\_GCM_SHA384, TLS_CHACHA20\_POLY1305\_SHA256, TLS_AES\_128\_CCM_SHA256, TLS_AES\_128\_CCM\_8\_SHA256, ECDHE-ECDSA-AES128-GCM-SHA256, ECDHE-ECDSA-AES256-GCM-SHA384, ECDHE-ECDSA-AES128-SHA256, ECDHE-ECDSA-AES256-SHA384, ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, ECDHE-ECDSA-AES128-SHA, ECDHE-ECDSA-AES256-SHA, ECDHE-RSA-AES128-SHA, and ECDHE-RSA-AES256-SHA
             * 
             * >  This parameter is returned only for HTTPS listeners.
             */
            public Builder securityPolicyId(String securityPolicyId) {
                this.securityPolicyId = securityPolicyId;
                return this;
            }

            /**
             * The service ID to which the managed instance belongs.
             * <p>
             * 
             * >  Valid only when the ServiceManaged parameter is True.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * Is it a managed instance. Valid values:
             * <p>
             * 
             * - true
             * - false
             */
            public Builder serviceManaged(Boolean serviceManaged) {
                this.serviceManaged = serviceManaged;
                return this;
            }

            /**
             * A list of action policies that users can execute on this managed instance.
             */
            public Builder serviceManagedInfos(java.util.List < ServiceManagedInfos> serviceManagedInfos) {
                this.serviceManagedInfos = serviceManagedInfos;
                return this;
            }

            /**
             * The state of the listener. Valid values:
             * <p>
             * 
             * *   **active**: The listener is normal.
             * *   **init**: The listener is being initialized.
             * *   **updating**: The listener is being configured.
             * *   **deleting**: The listener is being deleted.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The routing type of the listener. Valid values:
             * <p>
             * 
             * *   **Standard**: intelligent routing
             * *   **CustomRouting**: custom routing
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

            public Listeners build() {
                return new Listeners(this);
            } 

        } 

    }
}
