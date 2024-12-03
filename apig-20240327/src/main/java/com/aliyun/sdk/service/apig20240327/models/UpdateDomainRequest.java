// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateDomainRequest} extends {@link RequestModel}
 *
 * <p>UpdateDomainRequest</p>
 */
public class UpdateDomainRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("domainId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("caCertIndentifier")
    private String caCertIndentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("certIndentifier")
    private String certIndentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("forceHttps")
    private Boolean forceHttps;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("http2Option")
    private String http2Option;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("protocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String protocol;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tlsCipherSuitesConfig")
    private TlsCipherSuitesConfig tlsCipherSuitesConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tlsMax")
    private String tlsMax;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tlsMin")
    private String tlsMin;

    private UpdateDomainRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.caCertIndentifier = builder.caCertIndentifier;
        this.certIndentifier = builder.certIndentifier;
        this.forceHttps = builder.forceHttps;
        this.http2Option = builder.http2Option;
        this.protocol = builder.protocol;
        this.tlsCipherSuitesConfig = builder.tlsCipherSuitesConfig;
        this.tlsMax = builder.tlsMax;
        this.tlsMin = builder.tlsMin;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return caCertIndentifier
     */
    public String getCaCertIndentifier() {
        return this.caCertIndentifier;
    }

    /**
     * @return certIndentifier
     */
    public String getCertIndentifier() {
        return this.certIndentifier;
    }

    /**
     * @return forceHttps
     */
    public Boolean getForceHttps() {
        return this.forceHttps;
    }

    /**
     * @return http2Option
     */
    public String getHttp2Option() {
        return this.http2Option;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
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

    public static final class Builder extends Request.Builder<UpdateDomainRequest, Builder> {
        private String domainId; 
        private String caCertIndentifier; 
        private String certIndentifier; 
        private Boolean forceHttps; 
        private String http2Option; 
        private String protocol; 
        private TlsCipherSuitesConfig tlsCipherSuitesConfig; 
        private String tlsMax; 
        private String tlsMin; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDomainRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.caCertIndentifier = request.caCertIndentifier;
            this.certIndentifier = request.certIndentifier;
            this.forceHttps = request.forceHttps;
            this.http2Option = request.http2Option;
            this.protocol = request.protocol;
            this.tlsCipherSuitesConfig = request.tlsCipherSuitesConfig;
            this.tlsMax = request.tlsMax;
            this.tlsMin = request.tlsMin;
        } 

        /**
         * <p>Domain ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d-cpqnfn5lhtgqbga95sv1</p>
         */
        public Builder domainId(String domainId) {
            this.putPathParameter("domainId", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>Cloud Shield CA certificate identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>123455-cn-hangzhou</p>
         */
        public Builder caCertIndentifier(String caCertIndentifier) {
            this.putBodyParameter("caCertIndentifier", caCertIndentifier);
            this.caCertIndentifier = caCertIndentifier;
            return this;
        }

        /**
         * <p>Cloud Shield certificate identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>123458-cn-hangzhou</p>
         */
        public Builder certIndentifier(String certIndentifier) {
            this.putBodyParameter("certIndentifier", certIndentifier);
            this.certIndentifier = certIndentifier;
            return this;
        }

        /**
         * <p>Set the HTTPS protocol type, whether to enable forced HTTPS redirection.</p>
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
         * <p>HTTP/2 settings.</p>
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
         * <p>The protocol type supported by the domain.</p>
         * <ul>
         * <li>HTTP: Supports only HTTP protocol.</li>
         * <li>HTTPS: Supports only HTTPS protocol.</li>
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
         * tlsCipherSuitesConfig.
         */
        public Builder tlsCipherSuitesConfig(TlsCipherSuitesConfig tlsCipherSuitesConfig) {
            this.putBodyParameter("tlsCipherSuitesConfig", tlsCipherSuitesConfig);
            this.tlsCipherSuitesConfig = tlsCipherSuitesConfig;
            return this;
        }

        /**
         * <p>Maximum TLS protocol version, supports up to TLS 1.3.</p>
         * 
         * <strong>example:</strong>
         * <p>TLS 1.3</p>
         */
        public Builder tlsMax(String tlsMax) {
            this.putBodyParameter("tlsMax", tlsMax);
            this.tlsMax = tlsMax;
            return this;
        }

        /**
         * <p>Minimum TLS protocol version, supports down to TLS 1.0.</p>
         * 
         * <strong>example:</strong>
         * <p>TLS 1.0</p>
         */
        public Builder tlsMin(String tlsMin) {
            this.putBodyParameter("tlsMin", tlsMin);
            this.tlsMin = tlsMin;
            return this;
        }

        @Override
        public UpdateDomainRequest build() {
            return new UpdateDomainRequest(this);
        } 

    } 

}
