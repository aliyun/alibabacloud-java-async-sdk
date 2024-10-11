// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
    @com.aliyun.core.annotation.NameInMap("CertIdentifier")
    private String certIdentifier;

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
    @com.aliyun.core.annotation.NameInMap("MustHttps")
    private Boolean mustHttps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TlsMax")
    private String tlsMax;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TlsMin")
    private String tlsMin;

    private UpdateGatewayDomainRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.certIdentifier = builder.certIdentifier;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.http2 = builder.http2;
        this.id = builder.id;
        this.mustHttps = builder.mustHttps;
        this.protocol = builder.protocol;
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
     * @return certIdentifier
     */
    public String getCertIdentifier() {
        return this.certIdentifier;
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
        private String certIdentifier; 
        private String gatewayUniqueId; 
        private String http2; 
        private Long id; 
        private Boolean mustHttps; 
        private String protocol; 
        private String tlsMax; 
        private String tlsMin; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGatewayDomainRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.certIdentifier = request.certIdentifier;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.http2 = request.http2;
            this.id = request.id;
            this.mustHttps = request.mustHttps;
            this.protocol = request.protocol;
            this.tlsMax = request.tlsMax;
            this.tlsMin = request.tlsMin;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
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
         * <p>The ID of the certificate.</p>
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
         * <p>Specifies whether to enable <code>HTTP/2</code>.</p>
         * <ul>
         * <li><code>open</code>: <code>HTTP/2</code> is enabled.</li>
         * <li><code>close</code>: <code>HTTP/2</code> is disabled.</li>
         * <li><code>globalConfig</code>: Global configurations are used.</li>
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
         * <p>The ID of the domain name that you want to update.</p>
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
         * <p>Specifies whether to forcibly use HTTPS.</p>
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
         * <p>The type of the protocol. Valid values:</p>
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
         * <p>The maximum version of Transport Layer Security (TLS).</p>
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
         * <p>The minimum version of TLS.</p>
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

}
