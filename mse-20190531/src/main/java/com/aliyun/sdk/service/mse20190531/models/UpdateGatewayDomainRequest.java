// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link UpdateGatewayDomainRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayDomainRequest</p>
 */
public class UpdateGatewayDomainRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CaCertIdentifier")
    private String caCertIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertIdentifier")
    private String certIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableWaf")
    private Boolean enableWaf;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Http2")
    private String http2;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MtlsEnabled")
    private Boolean mtlsEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MustHttps")
    private Boolean mustHttps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TlsCipherSuitesConfigJSON")
    private TlsCipherSuitesConfigJSON tlsCipherSuitesConfigJSON;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TlsMax")
    private String tlsMax;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TlsMin")
    private String tlsMin;

    private UpdateGatewayDomainRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.caCertIdentifier = builder.caCertIdentifier;
        this.certIdentifier = builder.certIdentifier;
        this.enableWaf = builder.enableWaf;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.http2 = builder.http2;
        this.id = builder.id;
        this.mtlsEnabled = builder.mtlsEnabled;
        this.mustHttps = builder.mustHttps;
        this.protocol = builder.protocol;
        this.tlsCipherSuitesConfigJSON = builder.tlsCipherSuitesConfigJSON;
        this.tlsMax = builder.tlsMax;
        this.tlsMin = builder.tlsMin;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayDomainRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
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
     * @return enableWaf
     */
    public Boolean getEnableWaf() {
        return this.enableWaf;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return http2
     */
    public String getHttp2() {
        return this.http2;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return mtlsEnabled
     */
    public Boolean getMtlsEnabled() {
        return this.mtlsEnabled;
    }

    /**
     * @return mustHttps
     */
    public Boolean getMustHttps() {
        return this.mustHttps;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return tlsCipherSuitesConfigJSON
     */
    public TlsCipherSuitesConfigJSON getTlsCipherSuitesConfigJSON() {
        return this.tlsCipherSuitesConfigJSON;
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

    public static final class Builder extends Request.Builder<UpdateGatewayDomainRequest, Builder> {
        private String acceptLanguage; 
        private String caCertIdentifier; 
        private String certIdentifier; 
        private Boolean enableWaf; 
        private String gatewayUniqueId; 
        private String http2; 
        private Long id; 
        private Boolean mtlsEnabled; 
        private Boolean mustHttps; 
        private String protocol; 
        private TlsCipherSuitesConfigJSON tlsCipherSuitesConfigJSON; 
        private String tlsMax; 
        private String tlsMin; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGatewayDomainRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.caCertIdentifier = request.caCertIdentifier;
            this.certIdentifier = request.certIdentifier;
            this.enableWaf = request.enableWaf;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.http2 = request.http2;
            this.id = request.id;
            this.mtlsEnabled = request.mtlsEnabled;
            this.mustHttps = request.mustHttps;
            this.protocol = request.protocol;
            this.tlsCipherSuitesConfigJSON = request.tlsCipherSuitesConfigJSON;
            this.tlsMax = request.tlsMax;
            this.tlsMin = request.tlsMin;
        } 

        /**
         * <p>The language of the returned information. Valid values:</p>
         * <ul>
         * <li>zh: Chinese (default).</li>
         * <li>en: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The CA certificate content.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----
         * MIIFazCCA1OgAwIBAgIRAIIQz7DSQONZRGPgu2OCiwAwDQYJKoZIhvcNAQELBQAw
         * TzELMAkGA1UEBhMCVVMxKTAnBgNVBAoTIEludGVybmV0IFNlY3VyaXR5IFJlc2Vh
         * cmNoIEdyb3VwMRUwEwYDVQQDEwxJU1JHIFJvb3QgWDEwHhcNMTUwNjA0MTEwNDM4
         * WhcNMzUwNjA0MTEwNDM4WjBPMQswCQYDVQQGEwJVUzEpMCcGA1UEChMgSW50ZXJu
         * ZXQgU2VjdXJpdHkgUmVzZWFyY2ggR3JvdXAxFTATBgNVBAMTDElTUkcgUm9vdCBY
         * MTCCAiIwDQYJKoZIhvcNAQEBBQADggIPADCCAgoCggIBAK3oJHP0FDfzm54rVygc
         * h77ct984kIxuPOZXoHj3dcKi/vVqbvYATyjb3miGbESTtrFj/RQSa78f0uoxmyF+
         * 0TM8ukj13Xnfs7j/EvEhmkvBioZxaUpmZmyPfjxwv60pIgbz5MDmgK7iS4+3mX6U
         * A5/TR5d8mUgjU+g4rk8Kb4Mu0UlXjIB0ttov0DiNewNwIRt18jA8+o+u3dpjq+sW
         * T8KOEUt+zwvo/7V3LvSye0rgTBIlDHCNAymg4VMk7BPZ7hm/ELNKjD+Jo2FR3qyH
         * B5T0Y3HsLuJvW5iB4YlcNHlsdu87kGJ55tukmi8mxdAQ4Q7e2RCOFvu396j3x+UC
         * B5iPNgiV5+I3lg02dZ77DnKxHZu8A/lJBdiB3QW0KtZB6awBdpUKD9jf1b0SHzUv
         * KBds0pjBqAlkd25HN7rOrFleaJ1/ctaJxQZBKT5ZPt0m9STJEadao0xAH0ahmbWn
         * OlFuhjuefXKnEgV4We0+UXgVCwOPjdAvBbI+e0ocS3MFEvzG6uBQE3xDk3SzynTn
         * jh8BCNAw1FtxNrQHusEwMFxIt4I7mKZ9YIqioymCzLq9gwQbooMDQaHWBfEbwrbw
         * qHyGO0aoSCqI3Haadr8faqU9GY/rOPNk3sgrDQoo//fb4hVC1CLQJ13hef4Y53CI
         * rU7m2Ys6xt0nUW7/vGT1M0NPAgMBAAGjQjBAMA4GA1UdDwEB/wQEAwIBBjAPBgNV
         * HRMBAf8EBTADAQH/MB0GA1UdDgQWBBR5tFnme7bl5AFzgAiIyBpY9umbbjANBgkq
         * hkiG9w0BAQsFAAOCAgEAVR9YqbyyqFDQDLHYGmkgJykIrGF1XIpu+ILlaS/V9lZL
         * ubhzEFnTIZd+50xx+7LSYK05qAvqFyFWhfFQDlnrzuBZ6brJFe+GnY+EgPbk6ZGQ
         * 3BebYhtF8GaV0nxvwuo77x/Py9auJ/GpsMiu/X1+mvoiBOv/2X/qkSsisRcOj/KK
         * NFtY2PwByVS5uCbMiogziUwthDyC3+6WVwW6LLv3xLfHTjuCvjHIInNzktHCgKQ5
         * ORAzI4JMPJ+GslWYHb4phowim57iaztXOoJwTdwJx4nLCgdNbOhdjsnvzqvHu7Ur
         * TkXWStAmzOVyyghqpZXjFaH3pO3JLF+l+/+sKAIuvtd7u+Nxe5AW0wdeRlN8NwdC
         * jNPElpzVmbUq4JUagEiuTDkHzsxHpFKVK7q4+63SM1N95R1NbdWhscdCb+ZAJzVc
         * oyi3B43njTOQ5yOf+1CceWxG1bQVs5ZufpsMljq4Ui0/1lvh+wjChP4kqKOJ2qxq
         * 4RgqsahDYVvTH9w7jXbyLeiNdd8XM2w9U/t7y0Ff/9yi0GE44Za4rF2LN9d11TPA
         * mRGunUHBcnWEvgJBQl9nJEiU0Zsnvgc/ubhPgXRR4Xq37Z0j4r7g1SgEEzwxA57d
         * emyPxgcYxn/eR44/KJ4EBs+lVDR3veyJm+kXQ99b21/+jh5Xos1AnX5iItreGCc=
         * -----END CERTIFICATE-----</p>
         */
        public Builder caCertIdentifier(String caCertIdentifier) {
            this.putQueryParameter("CaCertIdentifier", caCertIdentifier);
            this.caCertIdentifier = caCertIdentifier;
            return this;
        }

        /**
         * <p>The certificate ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6209108-cn-hangzhou</p>
         */
        public Builder certIdentifier(String certIdentifier) {
            this.putQueryParameter("CertIdentifier", certIdentifier);
            this.certIdentifier = certIdentifier;
            return this;
        }

        /**
         * <p>Specifies whether to enable Web Application Firewall (WAF) for the gateway domain name.</p>
         */
        public Builder enableWaf(Boolean enableWaf) {
            this.putQueryParameter("EnableWaf", enableWaf);
            this.enableWaf = enableWaf;
            return this;
        }

        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-86575c0bc9f04ecfbacb92b8e392****</p>
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * <p>Specifies whether to enable HTTP/2. Valid values:</p>
         * <ul>
         * <li><code>open</code>: enables HTTP/2.</li>
         * <li><code>close</code>: disables HTTP/2.</li>
         * <li><code>globalConfig</code>: uses the global configuration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>close</p>
         */
        public Builder http2(String http2) {
            this.putQueryParameter("Http2", http2);
            this.http2 = http2;
            return this;
        }

        /**
         * <p>The ID of the domain name to be updated.</p>
         * 
         * <strong>example:</strong>
         * <p>94</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>Specifies whether to enable mTLS.</p>
         */
        public Builder mtlsEnabled(Boolean mtlsEnabled) {
            this.putQueryParameter("MtlsEnabled", mtlsEnabled);
            this.mtlsEnabled = mtlsEnabled;
            return this;
        }

        /**
         * <p>Specifies whether to force HTTPS.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder mustHttps(Boolean mustHttps) {
            this.putQueryParameter("MustHttps", mustHttps);
            this.mustHttps = mustHttps;
            return this;
        }

        /**
         * <p>The protocol type. Valid values:</p>
         * <ul>
         * <li>HTTPS</li>
         * <li>HTTP</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTPS</p>
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>The TLS cipher suite configuration.</p>
         */
        public Builder tlsCipherSuitesConfigJSON(TlsCipherSuitesConfigJSON tlsCipherSuitesConfigJSON) {
            String tlsCipherSuitesConfigJSONShrink = shrink(tlsCipherSuitesConfigJSON, "TlsCipherSuitesConfigJSON", "json");
            this.putQueryParameter("TlsCipherSuitesConfigJSON", tlsCipherSuitesConfigJSONShrink);
            this.tlsCipherSuitesConfigJSON = tlsCipherSuitesConfigJSON;
            return this;
        }

        /**
         * <p>The maximum TLS version.</p>
         * 
         * <strong>example:</strong>
         * <p>TLS 1.3</p>
         */
        public Builder tlsMax(String tlsMax) {
            this.putQueryParameter("TlsMax", tlsMax);
            this.tlsMax = tlsMax;
            return this;
        }

        /**
         * <p>The minimum TLS version.</p>
         * 
         * <strong>example:</strong>
         * <p>TLS 1.0</p>
         */
        public Builder tlsMin(String tlsMin) {
            this.putQueryParameter("TlsMin", tlsMin);
            this.tlsMin = tlsMin;
            return this;
        }

        @Override
        public UpdateGatewayDomainRequest build() {
            return new UpdateGatewayDomainRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateGatewayDomainRequest} extends {@link TeaModel}
     *
     * <p>UpdateGatewayDomainRequest</p>
     */
    public static class TlsCipherSuitesConfigJSON extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigType")
        private String configType;

        @com.aliyun.core.annotation.NameInMap("TlsCipherSuites")
        private java.util.List<String> tlsCipherSuites;

        private TlsCipherSuitesConfigJSON(Builder builder) {
            this.configType = builder.configType;
            this.tlsCipherSuites = builder.tlsCipherSuites;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TlsCipherSuitesConfigJSON create() {
            return builder().build();
        }

        /**
         * @return configType
         */
        public String getConfigType() {
            return this.configType;
        }

        /**
         * @return tlsCipherSuites
         */
        public java.util.List<String> getTlsCipherSuites() {
            return this.tlsCipherSuites;
        }

        public static final class Builder {
            private String configType; 
            private java.util.List<String> tlsCipherSuites; 

            private Builder() {
            } 

            private Builder(TlsCipherSuitesConfigJSON model) {
                this.configType = model.configType;
                this.tlsCipherSuites = model.tlsCipherSuites;
            } 

            /**
             * <p>The cipher suite configuration type. Valid values:</p>
             * <ul>
             * <li>DEFAULT</li>
             * <li>CUSTOM</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DEFAULT</p>
             */
            public Builder configType(String configType) {
                this.configType = configType;
                return this;
            }

            /**
             * <p>The list of cipher suite names.</p>
             */
            public Builder tlsCipherSuites(java.util.List<String> tlsCipherSuites) {
                this.tlsCipherSuites = tlsCipherSuites;
                return this;
            }

            public TlsCipherSuitesConfigJSON build() {
                return new TlsCipherSuitesConfigJSON(this);
            } 

        } 

    }
}
