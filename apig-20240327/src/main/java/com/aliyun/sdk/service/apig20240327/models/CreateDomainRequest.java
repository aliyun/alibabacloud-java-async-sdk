// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link CreateDomainRequest} extends {@link RequestModel}
 *
 * <p>CreateDomainRequest</p>
 */
public class CreateDomainRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("caCertIdentifier")
    private String caCertIdentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("certIdentifier")
    private String certIdentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientCACert")
    private String clientCACert;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("forceHttps")
    private Boolean forceHttps;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gatewayType")
    private String gatewayType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("http2Option")
    private String http2Option;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("mTLSEnabled")
    private Boolean mTLSEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("protocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String protocol;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tlsCipherSuitesConfig")
    private TlsCipherSuitesConfig tlsCipherSuitesConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tlsMax")
    private String tlsMax;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tlsMin")
    private String tlsMin;

    private CreateDomainRequest(Builder builder) {
        super(builder);
        this.caCertIdentifier = builder.caCertIdentifier;
        this.certIdentifier = builder.certIdentifier;
        this.clientCACert = builder.clientCACert;
        this.forceHttps = builder.forceHttps;
        this.gatewayType = builder.gatewayType;
        this.http2Option = builder.http2Option;
        this.mTLSEnabled = builder.mTLSEnabled;
        this.name = builder.name;
        this.protocol = builder.protocol;
        this.resourceGroupId = builder.resourceGroupId;
        this.tlsCipherSuitesConfig = builder.tlsCipherSuitesConfig;
        this.tlsMax = builder.tlsMax;
        this.tlsMin = builder.tlsMin;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDomainRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return caCertIdentifier
     */
    public String getCaCertIdentifier() {
        return this.caCertIdentifier;
    }

    /**
     * @return certIdentifier
     */
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    /**
     * @return clientCACert
     */
    public String getClientCACert() {
        return this.clientCACert;
    }

    /**
     * @return forceHttps
     */
    public Boolean getForceHttps() {
        return this.forceHttps;
    }

    /**
     * @return gatewayType
     */
    public String getGatewayType() {
        return this.gatewayType;
    }

    /**
     * @return http2Option
     */
    public String getHttp2Option() {
        return this.http2Option;
    }

    /**
     * @return mTLSEnabled
     */
    public Boolean getMTLSEnabled() {
        return this.mTLSEnabled;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tlsCipherSuitesConfig
     */
    public TlsCipherSuitesConfig getTlsCipherSuitesConfig() {
        return this.tlsCipherSuitesConfig;
    }

    /**
     * @return tlsMax
     */
    public String getTlsMax() {
        return this.tlsMax;
    }

    /**
     * @return tlsMin
     */
    public String getTlsMin() {
        return this.tlsMin;
    }

    public static final class Builder extends Request.Builder<CreateDomainRequest, Builder> {
        private String caCertIdentifier; 
        private String certIdentifier; 
        private String clientCACert; 
        private Boolean forceHttps; 
        private String gatewayType; 
        private String http2Option; 
        private Boolean mTLSEnabled; 
        private String name; 
        private String protocol; 
        private String resourceGroupId; 
        private TlsCipherSuitesConfig tlsCipherSuitesConfig; 
        private String tlsMax; 
        private String tlsMin; 

        private Builder() {
            super();
        } 

        private Builder(CreateDomainRequest request) {
            super(request);
            this.caCertIdentifier = request.caCertIdentifier;
            this.certIdentifier = request.certIdentifier;
            this.clientCACert = request.clientCACert;
            this.forceHttps = request.forceHttps;
            this.gatewayType = request.gatewayType;
            this.http2Option = request.http2Option;
            this.mTLSEnabled = request.mTLSEnabled;
            this.name = request.name;
            this.protocol = request.protocol;
            this.resourceGroupId = request.resourceGroupId;
            this.tlsCipherSuitesConfig = request.tlsCipherSuitesConfig;
            this.tlsMax = request.tlsMax;
            this.tlsMin = request.tlsMin;
        } 

        /**
         * <p>The CA certificate ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1ef1da5f-38ed-69b3-****-037781890265</p>
         */
        public Builder caCertIdentifier(String caCertIdentifier) {
            this.putBodyParameter("caCertIdentifier", caCertIdentifier);
            this.caCertIdentifier = caCertIdentifier;
            return this;
        }

        /**
         * <p>The certificate ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1ef1da5f-38ed-69b3-****-037781890265</p>
         */
        public Builder certIdentifier(String certIdentifier) {
            this.putBodyParameter("certIdentifier", certIdentifier);
            this.certIdentifier = certIdentifier;
            return this;
        }

        /**
         * <p>The client CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----
         * MIIFBTCCAu2gAwIBAgIUORLpYPGSFD1YOP6PMbE7Wd/mpTQwDQYJKoZIhvcNAQEL
         * BQAwE************************************************2VwVOJ2gqX3
         * YuGaxvIbDy0iQJ1GMerPRyzJTeVEtdIKT29u0PdFRr4KZWom35qX7G4=
         * -----END CERTIFICATE-----</p>
         */
        public Builder clientCACert(String clientCACert) {
            this.putBodyParameter("clientCACert", clientCACert);
            this.clientCACert = clientCACert;
            return this;
        }

        /**
         * <p>Specifies whether to enable forcible HTTPS redirection.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder forceHttps(Boolean forceHttps) {
            this.putBodyParameter("forceHttps", forceHttps);
            this.forceHttps = forceHttps;
            return this;
        }

        /**
         * gatewayType.
         */
        public Builder gatewayType(String gatewayType) {
            this.putBodyParameter("gatewayType", gatewayType);
            this.gatewayType = gatewayType;
            return this;
        }

        /**
         * <p>The HTTP/2 configuration.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>GlobalConfig</li>
         * <li>Close</li>
         * <li>Open</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Open</p>
         */
        public Builder http2Option(String http2Option) {
            this.putBodyParameter("http2Option", http2Option);
            this.http2Option = http2Option;
            return this;
        }

        /**
         * <p>Specifies whether to enable mutual authentication.</p>
         */
        public Builder mTLSEnabled(Boolean mTLSEnabled) {
            this.putBodyParameter("mTLSEnabled", mTLSEnabled);
            this.mTLSEnabled = mTLSEnabled;
            return this;
        }

        /**
         * <p>The domain name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>abc.com</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The protocol type supported by the domain name.</p>
         * <ul>
         * <li>HTTP: Only HTTP is supported.</li>
         * <li>HTTPS: Only HTTPS is supported.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        public Builder protocol(String protocol) {
            this.putBodyParameter("protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>The <a href="https://help.aliyun.com/document_detail/151181.html">resource group ID</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzoiafjtr7zyq</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The cipher suite configuration.</p>
         */
        public Builder tlsCipherSuitesConfig(TlsCipherSuitesConfig tlsCipherSuitesConfig) {
            this.putBodyParameter("tlsCipherSuitesConfig", tlsCipherSuitesConfig);
            this.tlsCipherSuitesConfig = tlsCipherSuitesConfig;
            return this;
        }

        /**
         * <p>The maximum version of the TLS protocol. Up to TLS 1.3 is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>TLS1.3</p>
         */
        public Builder tlsMax(String tlsMax) {
            this.putBodyParameter("tlsMax", tlsMax);
            this.tlsMax = tlsMax;
            return this;
        }

        /**
         * <p>The minimum version of the TLS protocol. Down to TLS 1.0 is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>TLS1.0</p>
         */
        public Builder tlsMin(String tlsMin) {
            this.putBodyParameter("tlsMin", tlsMin);
            this.tlsMin = tlsMin;
            return this;
        }

        @Override
        public CreateDomainRequest build() {
            return new CreateDomainRequest(this);
        } 

    } 

}
