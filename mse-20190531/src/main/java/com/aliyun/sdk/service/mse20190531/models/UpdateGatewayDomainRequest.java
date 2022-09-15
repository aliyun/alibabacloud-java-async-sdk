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
    @NameInMap("MseSessionId")
    private String mseSessionId;

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
        this.mseSessionId = builder.mseSessionId;
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
     * @return mseSessionId
     */
    public String getMseSessionId() {
        return this.mseSessionId;
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
        private String mseSessionId; 
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
            this.mseSessionId = request.mseSessionId;
            this.mustHttps = request.mustHttps;
            this.protocol = request.protocol;
            this.tlsMax = request.tlsMax;
            this.tlsMin = request.tlsMin;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * CertIdentifier.
         */
        public Builder certIdentifier(String certIdentifier) {
            this.putQueryParameter("CertIdentifier", certIdentifier);
            this.certIdentifier = certIdentifier;
            return this;
        }

        /**
         * GatewayUniqueId.
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * Http2.
         */
        public Builder http2(String http2) {
            this.putQueryParameter("Http2", http2);
            this.http2 = http2;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * MseSessionId.
         */
        public Builder mseSessionId(String mseSessionId) {
            this.putQueryParameter("MseSessionId", mseSessionId);
            this.mseSessionId = mseSessionId;
            return this;
        }

        /**
         * MustHttps.
         */
        public Builder mustHttps(Boolean mustHttps) {
            this.putQueryParameter("MustHttps", mustHttps);
            this.mustHttps = mustHttps;
            return this;
        }

        /**
         * Protocol.
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * TlsMax.
         */
        public Builder tlsMax(String tlsMax) {
            this.putQueryParameter("TlsMax", tlsMax);
            this.tlsMax = tlsMax;
            return this;
        }

        /**
         * TlsMin.
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
