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
 * {@link AddGatewayDomainRequest} extends {@link RequestModel}
 *
 * <p>AddGatewayDomainRequest</p>
 */
public class AddGatewayDomainRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("MustHttps")
    private Boolean mustHttps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TlsMax")
    private String tlsMax;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TlsMin")
    private String tlsMin;

    private AddGatewayDomainRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.certIdentifier = builder.certIdentifier;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.http2 = builder.http2;
        this.mustHttps = builder.mustHttps;
        this.name = builder.name;
        this.protocol = builder.protocol;
        this.tlsMax = builder.tlsMax;
        this.tlsMin = builder.tlsMin;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddGatewayDomainRequest create() {
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
     * @return mustHttps
     */
    public Boolean getMustHttps() {
        return this.mustHttps;
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

    public static final class Builder extends Request.Builder<AddGatewayDomainRequest, Builder> {
        private String acceptLanguage; 
        private String certIdentifier; 
        private String gatewayUniqueId; 
        private String http2; 
        private Boolean mustHttps; 
        private String name; 
        private String protocol; 
        private String tlsMax; 
        private String tlsMin; 

        private Builder() {
            super();
        } 

        private Builder(AddGatewayDomainRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.certIdentifier = request.certIdentifier;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.http2 = request.http2;
            this.mustHttps = request.mustHttps;
            this.name = request.name;
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
         * <p>6828169-cn-hangzhou</p>
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
         * <li><code>open</code>: enables <code>HTTP/2</code></li>
         * <li><code>close</code>: disables <code>HTTP/2</code></li>
         * <li><code>globalConfig</code>: uses global configurations</li>
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
         * <p>Specifies whether to enable HTTPS.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder mustHttps(Boolean mustHttps) {
            this.putQueryParameter("MustHttps", mustHttps);
            this.mustHttps = mustHttps;
            return this;
        }

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>test.com</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The type of the protocol. Valid values:</p>
         * <ul>
         * <li><code>HTTP</code></li>
         * <li><code>HTTPS</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
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
        public AddGatewayDomainRequest build() {
            return new AddGatewayDomainRequest(this);
        } 

    } 

}
