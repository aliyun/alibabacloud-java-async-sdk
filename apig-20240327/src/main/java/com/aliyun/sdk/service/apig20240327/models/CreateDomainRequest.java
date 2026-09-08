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
    @com.aliyun.core.annotation.NameInMap("domainScope")
    private String domainScope;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private Boolean dryRun;

    private CreateDomainRequest(Builder builder) {
        super(builder);
        this.caCertIdentifier = builder.caCertIdentifier;
        this.certIdentifier = builder.certIdentifier;
        this.clientCACert = builder.clientCACert;
        this.domainScope = builder.domainScope;
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
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
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
     * @return domainScope
     */
    public String getDomainScope() {
        return this.domainScope;
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

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static final class Builder extends Request.Builder<CreateDomainRequest, Builder> {
        private String caCertIdentifier; 
        private String certIdentifier; 
        private String clientCACert; 
        private String domainScope; 
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
        private String clientToken; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(CreateDomainRequest request) {
            super(request);
            this.caCertIdentifier = request.caCertIdentifier;
            this.certIdentifier = request.certIdentifier;
            this.clientCACert = request.clientCACert;
            this.domainScope = request.domainScope;
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
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
        } 

        /**
         * <p>The CA certificate identifier. This parameter is optional for Dedicated with HTTPS. This parameter is not allowed for Serverless and is not validated for Dedicated with HTTP.</p>
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
         * <p>The certificate identifier. This parameter is required for Dedicated with HTTPS and must pass validation. This parameter is not allowed for Serverless and is not validated for Dedicated with HTTP.</p>
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
         * <p>The client CA certificate. This parameter is conditionally required for Dedicated with HTTPS (required when MTLSEnabled is set to true). This parameter is not allowed for Serverless and is not validated for Dedicated with HTTP.</p>
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
         * <p>The domain scope. Valid values: Dedicated (dedicated gateway domain name), Serverless (Serverless gateway domain name). Default value: Dedicated.</p>
         * 
         * <strong>example:</strong>
         * <p>Dedicated</p>
         */
        public Builder domainScope(String domainScope) {
            this.putBodyParameter("domainScope", domainScope);
            this.domainScope = domainScope;
            return this;
        }

        /**
         * <p>Specifies whether to enable forced HTTPS redirect when the protocol type is HTTPS. This parameter is required for Serverless and for Dedicated with HTTPS. This parameter is not validated for Dedicated with HTTP.</p>
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
         * <p>The gateway type. If not specified, the default value is API.</p>
         * 
         * <strong>example:</strong>
         * <p>API</p>
         */
        public Builder gatewayType(String gatewayType) {
            this.putBodyParameter("gatewayType", gatewayType);
            this.gatewayType = gatewayType;
            return this;
        }

        /**
         * <p>The HTTP/2 setting. Valid values: GlobalConfig (follows the global configuration), Open (enabled), Close (disabled). Default value: GlobalConfig. This setting is supported only for HTTPS domain names in the Dedicated scope.</p>
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
         * <p>Specifies whether to enable mTLS mutual authentication. This parameter is optional for Dedicated with HTTPS. If set to true, ClientCACert is required. This parameter is not allowed for Serverless.</p>
         */
        public Builder mTLSEnabled(Boolean mTLSEnabled) {
            this.putBodyParameter("mTLSEnabled", mTLSEnabled);
            this.mTLSEnabled = mTLSEnabled;
            return this;
        }

        /**
         * <p>The domain name. The name must be 1 to 128 characters in length, such as abc.com.</p>
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
         * <p>The protocol type used by the domain name. Valid values: HTTP, HTTPS. This parameter is required for the Dedicated scope and is not allowed for the Serverless scope.</p>
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
         * <p>rg-aekzhiv7derfweq</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The TLS cipher suite configuration, including the configuration type, cipher suite names, and supported TLS versions. This configuration is supported only for HTTPS domain names in the Dedicated scope.</p>
         */
        public Builder tlsCipherSuitesConfig(TlsCipherSuitesConfig tlsCipherSuitesConfig) {
            this.putBodyParameter("tlsCipherSuitesConfig", tlsCipherSuitesConfig);
            this.tlsCipherSuitesConfig = tlsCipherSuitesConfig;
            return this;
        }

        /**
         * <p>The maximum TLS protocol version. This parameter is optional for Dedicated with HTTPS. If not specified, the value is derived from TlsMin. The value must be greater than or equal to TlsMin. This parameter is not allowed for Serverless.</p>
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
         * <p>The minimum TLS protocol version. This parameter is optional for Dedicated with HTTPS. If not specified, the default value is TLS 1.0. Valid values range from TLS 1.0 to TLS 1.3, compatible with TLSv1.x. This parameter is not allowed for Serverless.</p>
         * 
         * <strong>example:</strong>
         * <p>TLS1.0</p>
         */
        public Builder tlsMin(String tlsMin) {
            this.putBodyParameter("tlsMin", tlsMin);
            this.tlsMin = tlsMin;
            return this;
        }

        /**
         * <p>The idempotency token generated by the caller as a globally unique value (UUID recommended). The value must be up to 64 characters in length. Within approximately 24 hours after the first successful request, a duplicate request with the same ClientToken and identical request parameters directly returns the domainId created by the first request without creating a duplicate domain name. If the same ClientToken is used with different request parameters, an IdempotentParameterMismatch error is returned. If the first request is still being processed, an IdempotentProcessing error is returned. If this parameter is not specified, idempotency control is not enabled, and the behavior is consistent with the existing version.</p>
         * 
         * <strong>example:</strong>
         * <p>5f7a2c1e-9b3d-4e8f-a1c6-0d2b8e4f7a13</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run. If set to true, all synchronous validations consistent with actual creation are performed (including idempotency checks for existing test domain names), but no domain name is created and no side effects are produced. If not specified or set to false, the behavior is consistent with the existing version.</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        @Override
        public CreateDomainRequest build() {
            return new CreateDomainRequest(this);
        } 

    } 

}
