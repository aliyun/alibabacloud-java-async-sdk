// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetHostResponseBody} extends {@link TeaModel}
 *
 * <p>GetHostResponseBody</p>
 */
public class GetHostResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Host")
    private GetHostResponseBodyHost host;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetHostResponseBody(Builder builder) {
        this.host = builder.host;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHostResponseBody create() {
        return builder().build();
    }

    /**
     * @return host
     */
    public GetHostResponseBodyHost getHost() {
        return this.host;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private GetHostResponseBodyHost host; 
        private String requestId; 

        /**
         * <p>The returned information about the host.</p>
         */
        public Builder host(GetHostResponseBodyHost host) {
            this.host = host;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetHostResponseBody build() {
            return new GetHostResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetHostResponseBody} extends {@link TeaModel}
     *
     * <p>GetHostResponseBody</p>
     */
    public static class Protocols extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HostFingerPrint")
        private String hostFingerPrint;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("ProtocolName")
        private String protocolName;

        private Protocols(Builder builder) {
            this.hostFingerPrint = builder.hostFingerPrint;
            this.port = builder.port;
            this.protocolName = builder.protocolName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Protocols create() {
            return builder().build();
        }

        /**
         * @return hostFingerPrint
         */
        public String getHostFingerPrint() {
            return this.hostFingerPrint;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocolName
         */
        public String getProtocolName() {
            return this.protocolName;
        }

        public static final class Builder {
            private String hostFingerPrint; 
            private Integer port; 
            private String protocolName; 

            /**
             * <p>The fingerprint of the host. This parameter uniquely identifies a host. A value is returned for this parameter only if you have performed O&amp;M operations on the host by using the bastion host. Otherwise, no value is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>ssh-ed25519|3e:46:5a:e1:1f:0d:39:7e:61:35:d5:fa:7b:2b:<strong>:</strong></p>
             */
            public Builder hostFingerPrint(String hostFingerPrint) {
                this.hostFingerPrint = hostFingerPrint;
                return this;
            }

            /**
             * <p>The service port of the host.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol that is used to connect to the host. Valid values:</p>
             * <ul>
             * <li><strong>SSH</strong></li>
             * <li><strong>RDP</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SSH</p>
             */
            public Builder protocolName(String protocolName) {
                this.protocolName = protocolName;
                return this;
            }

            public Protocols build() {
                return new Protocols(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetHostResponseBody} extends {@link TeaModel}
     *
     * <p>GetHostResponseBody</p>
     */
    public static class GetHostResponseBodyHost extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveAddressType")
        private String activeAddressType;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("HostId")
        private String hostId;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("HostPrivateAddress")
        private String hostPrivateAddress;

        @com.aliyun.core.annotation.NameInMap("HostPublicAddress")
        private String hostPublicAddress;

        @com.aliyun.core.annotation.NameInMap("NetworkDomainId")
        private String networkDomainId;

        @com.aliyun.core.annotation.NameInMap("OSType")
        private String OSType;

        @com.aliyun.core.annotation.NameInMap("Protocols")
        private java.util.List < Protocols> protocols;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("SourceInstanceId")
        private String sourceInstanceId;

        @com.aliyun.core.annotation.NameInMap("SourceInstanceState")
        private String sourceInstanceState;

        private GetHostResponseBodyHost(Builder builder) {
            this.activeAddressType = builder.activeAddressType;
            this.comment = builder.comment;
            this.hostId = builder.hostId;
            this.hostName = builder.hostName;
            this.hostPrivateAddress = builder.hostPrivateAddress;
            this.hostPublicAddress = builder.hostPublicAddress;
            this.networkDomainId = builder.networkDomainId;
            this.OSType = builder.OSType;
            this.protocols = builder.protocols;
            this.source = builder.source;
            this.sourceInstanceId = builder.sourceInstanceId;
            this.sourceInstanceState = builder.sourceInstanceState;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GetHostResponseBodyHost create() {
            return builder().build();
        }

        /**
         * @return activeAddressType
         */
        public String getActiveAddressType() {
            return this.activeAddressType;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return hostId
         */
        public String getHostId() {
            return this.hostId;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return hostPrivateAddress
         */
        public String getHostPrivateAddress() {
            return this.hostPrivateAddress;
        }

        /**
         * @return hostPublicAddress
         */
        public String getHostPublicAddress() {
            return this.hostPublicAddress;
        }

        /**
         * @return networkDomainId
         */
        public String getNetworkDomainId() {
            return this.networkDomainId;
        }

        /**
         * @return OSType
         */
        public String getOSType() {
            return this.OSType;
        }

        /**
         * @return protocols
         */
        public java.util.List < Protocols> getProtocols() {
            return this.protocols;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourceInstanceId
         */
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        /**
         * @return sourceInstanceState
         */
        public String getSourceInstanceState() {
            return this.sourceInstanceState;
        }

        public static final class Builder {
            private String activeAddressType; 
            private String comment; 
            private String hostId; 
            private String hostName; 
            private String hostPrivateAddress; 
            private String hostPublicAddress; 
            private String networkDomainId; 
            private String OSType; 
            private java.util.List < Protocols> protocols; 
            private String source; 
            private String sourceInstanceId; 
            private String sourceInstanceState; 

            /**
             * <p>The address type of the host. Valid values:</p>
             * <ul>
             * <li><strong>Public</strong>: a public address</li>
             * <li><strong>Private</strong>: a private address</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Public</p>
             */
            public Builder activeAddressType(String activeAddressType) {
                this.activeAddressType = activeAddressType;
                return this;
            }

            /**
             * <p>The description of the host.</p>
             * 
             * <strong>example:</strong>
             * <p>host</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The ID of the host.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * <p>The hostname.</p>
             * 
             * <strong>example:</strong>
             * <p>host</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>The internal endpoint of the host. The value is a domain name or an IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder hostPrivateAddress(String hostPrivateAddress) {
                this.hostPrivateAddress = hostPrivateAddress;
                return this;
            }

            /**
             * <p>The public address of the host. The value is a domain name or an IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.XX.XX</p>
             */
            public Builder hostPublicAddress(String hostPublicAddress) {
                this.hostPublicAddress = hostPublicAddress;
                return this;
            }

            /**
             * <p>The ID of the network domain to which the host belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder networkDomainId(String networkDomainId) {
                this.networkDomainId = networkDomainId;
                return this;
            }

            /**
             * <p>The operating system of the host. Valid values:</p>
             * <ul>
             * <li><strong>Linux</strong></li>
             * <li><strong>Windows</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Linux</p>
             */
            public Builder OSType(String OSType) {
                this.OSType = OSType;
                return this;
            }

            /**
             * <p>The protocol information about the host.</p>
             */
            public Builder protocols(java.util.List < Protocols> protocols) {
                this.protocols = protocols;
                return this;
            }

            /**
             * <p>The source of the host. Valid values:</p>
             * <ul>
             * <li><strong>Local</strong>: a host in a data center</li>
             * <li><strong>Ecs</strong>: an Elastic Compute Service (ECS) instance</li>
             * <li><strong>Rds</strong>: a host in an ApsaraDB MyBase dedicated cluster</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Local</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The ID of the ECS instance or the host in an ApsaraDB MyBase dedicated cluster.</p>
             * <blockquote>
             * <p> If <strong>Local</strong> is returned for the <strong>Source</strong> parameter, no value is returned for this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>i-bp19ienyt0yax748****</p>
             */
            public Builder sourceInstanceId(String sourceInstanceId) {
                this.sourceInstanceId = sourceInstanceId;
                return this;
            }

            /**
             * <p>The status of the host. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong>: normal</li>
             * <li><strong>Release</strong>: released</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder sourceInstanceState(String sourceInstanceState) {
                this.sourceInstanceState = sourceInstanceState;
                return this;
            }

            public GetHostResponseBodyHost build() {
                return new GetHostResponseBodyHost(this);
            } 

        } 

    }
}
