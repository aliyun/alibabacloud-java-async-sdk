// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGatewayDomainRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayDomainRequest</p>
 */
public class UpdateGatewayDomainRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("CertIdentifier")
    private String certIdentifier;

    @Query
    @NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @Query
    @NameInMap("Http2")
    private String http2;

    @Query
    @NameInMap("Id")
    private Long id;

    @Query
    @NameInMap("MustHttps")
    private Boolean mustHttps;

    @Query
    @NameInMap("Protocol")
    private String protocol;

    @Query
    @NameInMap("TlsMax")
    private String tlsMax;

    @Query
    @NameInMap("TlsMin")
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
         * The language of the response. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * The ID of the certificate.
         */
        public Builder certIdentifier(String certIdentifier) {
            this.putQueryParameter("CertIdentifier", certIdentifier);
            this.certIdentifier = certIdentifier;
            return this;
        }

        /**
         * The unique ID of the gateway.
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * Specifies whether to enable `HTTP/2`.
         * <p>
         * 
         * *   `open`: `HTTP/2` is enabled.
         * *   `close`: `HTTP/2` is disabled.
         * *   `globalConfig`: Global configurations are used.
         */
        public Builder http2(String http2) {
            this.putQueryParameter("Http2", http2);
            this.http2 = http2;
            return this;
        }

        /**
         * The ID of the domain name that you want to update.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Specifies whether to forcibly use HTTPS.
         */
        public Builder mustHttps(Boolean mustHttps) {
            this.putQueryParameter("MustHttps", mustHttps);
            this.mustHttps = mustHttps;
            return this;
        }

        /**
         * The type of the protocol. Valid values:
         * <p>
         * 
         * *   HTTPS
         * *   HTTP
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * The maximum version of Transport Layer Security (TLS).
         */
        public Builder tlsMax(String tlsMax) {
            this.putQueryParameter("TlsMax", tlsMax);
            this.tlsMax = tlsMax;
            return this;
        }

        /**
         * The minimum version of TLS.
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
