// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link DescribeIstioGatewayDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIstioGatewayDomainsResponseBody</p>
 */
public class DescribeIstioGatewayDomainsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GatewaySecretDetails")
    private java.util.List<GatewaySecretDetails> gatewaySecretDetails;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewaySecretDetails
     */
    public java.util.List<GatewaySecretDetails> getGatewaySecretDetails() {
        return this.gatewaySecretDetails;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<GatewaySecretDetails> gatewaySecretDetails; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeIstioGatewayDomainsResponseBody model) {
            this.gatewaySecretDetails = model.gatewaySecretDetails;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The domain names that are exposed by the ASM gateway.</p>
         */
        public Builder gatewaySecretDetails(java.util.List<GatewaySecretDetails> gatewaySecretDetails) {
            this.gatewaySecretDetails = gatewaySecretDetails;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>31d3a0f0-07ed-4f6e-9004-1804498c****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeIstioGatewayDomainsResponseBody build() {
            return new DescribeIstioGatewayDomainsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeIstioGatewayDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIstioGatewayDomainsResponseBody</p>
     */
    public static class GatewaySecretDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CredentialName")
        private String credentialName;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("Domains")
        private java.util.List<String> domains;

        @com.aliyun.core.annotation.NameInMap("GatewayCRName")
        private String gatewayCRName;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("PortName")
        private String portName;

        @com.aliyun.core.annotation.NameInMap("Protocol")
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
        public java.util.List<String> getDomains() {
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
            private java.util.List<String> domains; 
            private String gatewayCRName; 
            private String namespace; 
            private String portName; 
            private String protocol; 

            private Builder() {
            } 

            private Builder(GatewaySecretDetails model) {
                this.credentialName = model.credentialName;
                this.detail = model.detail;
                this.domains = model.domains;
                this.gatewayCRName = model.gatewayCRName;
                this.namespace = model.namespace;
                this.portName = model.portName;
                this.protocol = model.protocol;
            } 

            /**
             * <p>The name of the secret that contains the Transport Layer Security (TLS) certificate and certificate authority (CA) certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>bookinfo-secret</p>
             */
            public Builder credentialName(String credentialName) {
                this.credentialName = credentialName;
                return this;
            }

            /**
             * <p>The details of the domain name in the JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>{   &quot;servers&quot;: [     {       &quot;port&quot;: {         &quot;number&quot;: 27018,         &quot;name&quot;: &quot;mongo&quot;,         &quot;protocol&quot;: &quot;MONGO&quot;       },       &quot;hosts&quot;: [         &quot;*&quot;       ]     }   ] }</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The list of domain names.</p>
             */
            public Builder domains(java.util.List<String> domains) {
                this.domains = domains;
                return this;
            }

            /**
             * <p>The name of the Istio gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>ingressgateway</p>
             */
            public Builder gatewayCRName(String gatewayCRName) {
                this.gatewayCRName = gatewayCRName;
                return this;
            }

            /**
             * <p>The namespace in which the ASM gateway resides.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The port name.</p>
             * 
             * <strong>example:</strong>
             * <p>https-demo</p>
             */
            public Builder portName(String portName) {
                this.portName = portName;
                return this;
            }

            /**
             * <p>The type of the protocol. Valid values: <code>HTTP</code>, <code>HTTPS</code>, <code>GRPC</code>, <code>HTTP2</code>, <code>MONGO</code>, <code>TCP</code>, and <code>TLS</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTPS</p>
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
