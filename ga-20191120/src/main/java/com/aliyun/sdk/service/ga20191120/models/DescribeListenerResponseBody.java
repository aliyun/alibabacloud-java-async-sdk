// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeListenerResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeListenerResponseBody</p>
 */
public class DescribeListenerResponseBody extends TeaModel {
    @NameInMap("AcceleratorId")
    private String acceleratorId;

    @NameInMap("AclType")
    private String aclType;

    @NameInMap("BackendPorts")
    private java.util.List < BackendPorts> backendPorts;

    @NameInMap("Certificates")
    private java.util.List < Certificates> certificates;

    @NameInMap("ClientAffinity")
    private String clientAffinity;

    @NameInMap("CreateTime")
    private String createTime;

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

    @NameInMap("RelatedAcls")
    private java.util.List < RelatedAcls> relatedAcls;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityPolicyId")
    private String securityPolicyId;

    @NameInMap("State")
    private String state;

    @NameInMap("XForwardedForConfig")
    private XForwardedForConfig XForwardedForConfig;

    private DescribeListenerResponseBody(Builder builder) {
        this.acceleratorId = builder.acceleratorId;
        this.aclType = builder.aclType;
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
        this.relatedAcls = builder.relatedAcls;
        this.requestId = builder.requestId;
        this.securityPolicyId = builder.securityPolicyId;
        this.state = builder.state;
        this.XForwardedForConfig = builder.XForwardedForConfig;
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
     * @return securityPolicyId
     */
    public String getSecurityPolicyId() {
        return this.securityPolicyId;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return XForwardedForConfig
     */
    public XForwardedForConfig getXForwardedForConfig() {
        return this.XForwardedForConfig;
    }

    public static final class Builder {
        private String acceleratorId; 
        private String aclType; 
        private java.util.List < BackendPorts> backendPorts; 
        private java.util.List < Certificates> certificates; 
        private String clientAffinity; 
        private String createTime; 
        private String description; 
        private String listenerId; 
        private String name; 
        private java.util.List < PortRanges> portRanges; 
        private String protocol; 
        private Boolean proxyProtocol; 
        private java.util.List < RelatedAcls> relatedAcls; 
        private String requestId; 
        private String securityPolicyId; 
        private String state; 
        private XForwardedForConfig XForwardedForConfig; 

        /**
         * AcceleratorId.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * AclType.
         */
        public Builder aclType(String aclType) {
            this.aclType = aclType;
            return this;
        }

        /**
         * BackendPorts.
         */
        public Builder backendPorts(java.util.List < BackendPorts> backendPorts) {
            this.backendPorts = backendPorts;
            return this;
        }

        /**
         * Certificates.
         */
        public Builder certificates(java.util.List < Certificates> certificates) {
            this.certificates = certificates;
            return this;
        }

        /**
         * ClientAffinity.
         */
        public Builder clientAffinity(String clientAffinity) {
            this.clientAffinity = clientAffinity;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * ListenerId.
         */
        public Builder listenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * PortRanges.
         */
        public Builder portRanges(java.util.List < PortRanges> portRanges) {
            this.portRanges = portRanges;
            return this;
        }

        /**
         * Protocol.
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * ProxyProtocol.
         */
        public Builder proxyProtocol(Boolean proxyProtocol) {
            this.proxyProtocol = proxyProtocol;
            return this;
        }

        /**
         * RelatedAcls.
         */
        public Builder relatedAcls(java.util.List < RelatedAcls> relatedAcls) {
            this.relatedAcls = relatedAcls;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SecurityPolicyId.
         */
        public Builder securityPolicyId(String securityPolicyId) {
            this.securityPolicyId = securityPolicyId;
            return this;
        }

        /**
         * State.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * XForwardedForConfig.
         */
        public Builder XForwardedForConfig(XForwardedForConfig XForwardedForConfig) {
            this.XForwardedForConfig = XForwardedForConfig;
            return this;
        }

        public DescribeListenerResponseBody build() {
            return new DescribeListenerResponseBody(this);
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
             * FromPort.
             */
            public Builder fromPort(String fromPort) {
                this.fromPort = fromPort;
                return this;
            }

            /**
             * ToPort.
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Type.
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
    public static class RelatedAcls extends TeaModel {
        @NameInMap("AclId")
        private String aclId;

        @NameInMap("Status")
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
             * AclId.
             */
            public Builder aclId(String aclId) {
                this.aclId = aclId;
                return this;
            }

            /**
             * Status.
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
