// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateListenerRequest} extends {@link RequestModel}
 *
 * <p>UpdateListenerRequest</p>
 */
public class UpdateListenerRequest extends Request {
    @Query
    @NameInMap("BackendPorts")
    private java.util.List < BackendPorts> backendPorts;

    @Query
    @NameInMap("Certificates")
    private java.util.List < Certificates> certificates;

    @Query
    @NameInMap("ClientAffinity")
    private String clientAffinity;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ListenerId")
    @Validation(required = true)
    private String listenerId;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PortRanges")
    private java.util.List < PortRanges> portRanges;

    @Query
    @NameInMap("Protocol")
    private String protocol;

    @Query
    @NameInMap("ProxyProtocol")
    private String proxyProtocol;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SecurityPolicyId")
    private String securityPolicyId;

    @Query
    @NameInMap("XForwardedForConfig")
    private XForwardedForConfig XForwardedForConfig;

    private UpdateListenerRequest(Builder builder) {
        super(builder);
        this.backendPorts = builder.backendPorts;
        this.certificates = builder.certificates;
        this.clientAffinity = builder.clientAffinity;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.listenerId = builder.listenerId;
        this.name = builder.name;
        this.portRanges = builder.portRanges;
        this.protocol = builder.protocol;
        this.proxyProtocol = builder.proxyProtocol;
        this.regionId = builder.regionId;
        this.securityPolicyId = builder.securityPolicyId;
        this.XForwardedForConfig = builder.XForwardedForConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateListenerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
    public String getProxyProtocol() {
        return this.proxyProtocol;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return securityPolicyId
     */
    public String getSecurityPolicyId() {
        return this.securityPolicyId;
    }

    /**
     * @return XForwardedForConfig
     */
    public XForwardedForConfig getXForwardedForConfig() {
        return this.XForwardedForConfig;
    }

    public static final class Builder extends Request.Builder<UpdateListenerRequest, Builder> {
        private java.util.List < BackendPorts> backendPorts; 
        private java.util.List < Certificates> certificates; 
        private String clientAffinity; 
        private String clientToken; 
        private String description; 
        private String listenerId; 
        private String name; 
        private java.util.List < PortRanges> portRanges; 
        private String protocol; 
        private String proxyProtocol; 
        private String regionId; 
        private String securityPolicyId; 
        private XForwardedForConfig XForwardedForConfig; 

        private Builder() {
            super();
        } 

        private Builder(UpdateListenerRequest response) {
            super(response);
            this.backendPorts = response.backendPorts;
            this.certificates = response.certificates;
            this.clientAffinity = response.clientAffinity;
            this.clientToken = response.clientToken;
            this.description = response.description;
            this.listenerId = response.listenerId;
            this.name = response.name;
            this.portRanges = response.portRanges;
            this.protocol = response.protocol;
            this.proxyProtocol = response.proxyProtocol;
            this.regionId = response.regionId;
            this.securityPolicyId = response.securityPolicyId;
            this.XForwardedForConfig = response.XForwardedForConfig;
        } 

        /**
         * BackendPorts.
         */
        public Builder backendPorts(java.util.List < BackendPorts> backendPorts) {
            this.putQueryParameter("BackendPorts", backendPorts);
            this.backendPorts = backendPorts;
            return this;
        }

        /**
         * Certificates.
         */
        public Builder certificates(java.util.List < Certificates> certificates) {
            this.putQueryParameter("Certificates", certificates);
            this.certificates = certificates;
            return this;
        }

        /**
         * ClientAffinity.
         */
        public Builder clientAffinity(String clientAffinity) {
            this.putQueryParameter("ClientAffinity", clientAffinity);
            this.clientAffinity = clientAffinity;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * ListenerId.
         */
        public Builder listenerId(String listenerId) {
            this.putQueryParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PortRanges.
         */
        public Builder portRanges(java.util.List < PortRanges> portRanges) {
            this.putQueryParameter("PortRanges", portRanges);
            this.portRanges = portRanges;
            return this;
        }

        /**
         * Protocol.
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * ProxyProtocol.
         */
        public Builder proxyProtocol(String proxyProtocol) {
            this.putQueryParameter("ProxyProtocol", proxyProtocol);
            this.proxyProtocol = proxyProtocol;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SecurityPolicyId.
         */
        public Builder securityPolicyId(String securityPolicyId) {
            this.putQueryParameter("SecurityPolicyId", securityPolicyId);
            this.securityPolicyId = securityPolicyId;
            return this;
        }

        /**
         * XForwardedForConfig.
         */
        public Builder XForwardedForConfig(XForwardedForConfig XForwardedForConfig) {
            this.putQueryParameter("XForwardedForConfig", XForwardedForConfig);
            this.XForwardedForConfig = XForwardedForConfig;
            return this;
        }

        @Override
        public UpdateListenerRequest build() {
            return new UpdateListenerRequest(this);
        } 

    } 

    public static class BackendPorts extends TeaModel {
        @NameInMap("FromPort")
        private Integer fromPort;

        @NameInMap("ToPort")
        private Integer toPort;

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
             * FromPort.
             */
            public Builder fromPort(Integer fromPort) {
                this.fromPort = fromPort;
                return this;
            }

            /**
             * ToPort.
             */
            public Builder toPort(Integer toPort) {
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

        private Certificates(Builder builder) {
            this.id = builder.id;
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

        public static final class Builder {
            private String id; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public Certificates build() {
                return new Certificates(this);
            } 

        } 

    }
    public static class PortRanges extends TeaModel {
        @NameInMap("FromPort")
        @Validation(required = true)
        private Integer fromPort;

        @NameInMap("ToPort")
        @Validation(required = true)
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
             * FromPort.
             */
            public Builder fromPort(Integer fromPort) {
                this.fromPort = fromPort;
                return this;
            }

            /**
             * ToPort.
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
    public static class XForwardedForConfig extends TeaModel {
        @NameInMap("XForwardedForGaApEnabled")
        private Boolean XForwardedForGaApEnabled;

        @NameInMap("XForwardedForGaIdEnabled")
        private Boolean XForwardedForGaIdEnabled;

        @NameInMap("XForwardedForPortEnabled")
        private Boolean XForwardedForPortEnabled;

        @NameInMap("XForwardedForProtoEnabled")
        private Boolean XForwardedForProtoEnabled;

        @NameInMap("XRealIpEnabled")
        private Boolean XRealIpEnabled;

        private XForwardedForConfig(Builder builder) {
            this.XForwardedForGaApEnabled = builder.XForwardedForGaApEnabled;
            this.XForwardedForGaIdEnabled = builder.XForwardedForGaIdEnabled;
            this.XForwardedForPortEnabled = builder.XForwardedForPortEnabled;
            this.XForwardedForProtoEnabled = builder.XForwardedForProtoEnabled;
            this.XRealIpEnabled = builder.XRealIpEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static XForwardedForConfig create() {
            return builder().build();
        }

        /**
         * @return XForwardedForGaApEnabled
         */
        public Boolean getXForwardedForGaApEnabled() {
            return this.XForwardedForGaApEnabled;
        }

        /**
         * @return XForwardedForGaIdEnabled
         */
        public Boolean getXForwardedForGaIdEnabled() {
            return this.XForwardedForGaIdEnabled;
        }

        /**
         * @return XForwardedForPortEnabled
         */
        public Boolean getXForwardedForPortEnabled() {
            return this.XForwardedForPortEnabled;
        }

        /**
         * @return XForwardedForProtoEnabled
         */
        public Boolean getXForwardedForProtoEnabled() {
            return this.XForwardedForProtoEnabled;
        }

        /**
         * @return XRealIpEnabled
         */
        public Boolean getXRealIpEnabled() {
            return this.XRealIpEnabled;
        }

        public static final class Builder {
            private Boolean XForwardedForGaApEnabled; 
            private Boolean XForwardedForGaIdEnabled; 
            private Boolean XForwardedForPortEnabled; 
            private Boolean XForwardedForProtoEnabled; 
            private Boolean XRealIpEnabled; 

            /**
             * XForwardedForGaApEnabled.
             */
            public Builder XForwardedForGaApEnabled(Boolean XForwardedForGaApEnabled) {
                this.XForwardedForGaApEnabled = XForwardedForGaApEnabled;
                return this;
            }

            /**
             * XForwardedForGaIdEnabled.
             */
            public Builder XForwardedForGaIdEnabled(Boolean XForwardedForGaIdEnabled) {
                this.XForwardedForGaIdEnabled = XForwardedForGaIdEnabled;
                return this;
            }

            /**
             * XForwardedForPortEnabled.
             */
            public Builder XForwardedForPortEnabled(Boolean XForwardedForPortEnabled) {
                this.XForwardedForPortEnabled = XForwardedForPortEnabled;
                return this;
            }

            /**
             * XForwardedForProtoEnabled.
             */
            public Builder XForwardedForProtoEnabled(Boolean XForwardedForProtoEnabled) {
                this.XForwardedForProtoEnabled = XForwardedForProtoEnabled;
                return this;
            }

            /**
             * XRealIpEnabled.
             */
            public Builder XRealIpEnabled(Boolean XRealIpEnabled) {
                this.XRealIpEnabled = XRealIpEnabled;
                return this;
            }

            public XForwardedForConfig build() {
                return new XForwardedForConfig(this);
            } 

        } 

    }
}
