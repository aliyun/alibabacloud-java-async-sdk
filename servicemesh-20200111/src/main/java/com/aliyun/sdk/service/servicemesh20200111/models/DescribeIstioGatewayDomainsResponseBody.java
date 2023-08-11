// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIstioGatewayDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIstioGatewayDomainsResponseBody</p>
 */
public class DescribeIstioGatewayDomainsResponseBody extends TeaModel {
    @NameInMap("GatewaySecretDetails")
    private java.util.List < GatewaySecretDetails> gatewaySecretDetails;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeIstioGatewayDomainsResponseBody(Builder builder) {
        this.gatewaySecretDetails = builder.gatewaySecretDetails;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIstioGatewayDomainsResponseBody create() {
        return builder().build();
    }

    /**
     * @return gatewaySecretDetails
     */
    public java.util.List < GatewaySecretDetails> getGatewaySecretDetails() {
        return this.gatewaySecretDetails;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < GatewaySecretDetails> gatewaySecretDetails; 
        private String requestId; 

        /**
         * The domain names that are exposed by the ASM gateway.
         */
        public Builder gatewaySecretDetails(java.util.List < GatewaySecretDetails> gatewaySecretDetails) {
            this.gatewaySecretDetails = gatewaySecretDetails;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeIstioGatewayDomainsResponseBody build() {
            return new DescribeIstioGatewayDomainsResponseBody(this);
        } 

    } 

    public static class GatewaySecretDetails extends TeaModel {
        @NameInMap("CredentialName")
        private String credentialName;

        @NameInMap("Detail")
        private String detail;

        @NameInMap("Domains")
        private java.util.List < String > domains;

        @NameInMap("GatewayCRName")
        private String gatewayCRName;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("PortName")
        private String portName;

        @NameInMap("Protocol")
        private String protocol;

        private GatewaySecretDetails(Builder builder) {
            this.credentialName = builder.credentialName;
            this.detail = builder.detail;
            this.domains = builder.domains;
            this.gatewayCRName = builder.gatewayCRName;
            this.namespace = builder.namespace;
            this.portName = builder.portName;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GatewaySecretDetails create() {
            return builder().build();
        }

        /**
         * @return credentialName
         */
        public String getCredentialName() {
            return this.credentialName;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return domains
         */
        public java.util.List < String > getDomains() {
            return this.domains;
        }

        /**
         * @return gatewayCRName
         */
        public String getGatewayCRName() {
            return this.gatewayCRName;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return portName
         */
        public String getPortName() {
            return this.portName;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private String credentialName; 
            private String detail; 
            private java.util.List < String > domains; 
            private String gatewayCRName; 
            private String namespace; 
            private String portName; 
            private String protocol; 

            /**
             * The name of the secret that contains the Transport Layer Security (TLS) certificate and certificate authority (CA) certificate.
             */
            public Builder credentialName(String credentialName) {
                this.credentialName = credentialName;
                return this;
            }

            /**
             * The details of the domain name in the JSON format.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * The domain name.
             */
            public Builder domains(java.util.List < String > domains) {
                this.domains = domains;
                return this;
            }

            /**
             * GatewayCRName.
             */
            public Builder gatewayCRName(String gatewayCRName) {
                this.gatewayCRName = gatewayCRName;
                return this;
            }

            /**
             * The namespace in which the ASM gateway resides.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The name of the port.
             */
            public Builder portName(String portName) {
                this.portName = portName;
                return this;
            }

            /**
             * The type of the protocol. Valid values: `HTTP`, `HTTPS`, `GRPC`, `HTTP2`, `MONGO`, `TCP`, and `TLS`.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public GatewaySecretDetails build() {
                return new GatewaySecretDetails(this);
            } 

        } 

    }
}
