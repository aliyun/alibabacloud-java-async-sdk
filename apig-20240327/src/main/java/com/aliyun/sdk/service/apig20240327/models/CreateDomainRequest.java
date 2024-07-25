// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDomainRequest} extends {@link RequestModel}
 *
 * <p>CreateDomainRequest</p>
 */
public class CreateDomainRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("protocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String protocol;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tlsMax")
    private String tlsMax;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tlsMin")
    private String tlsMin;

    private CreateDomainRequest(Builder builder) {
        super(builder);
        this.caCertIndentifier = builder.caCertIndentifier;
        this.certIndentifier = builder.certIndentifier;
        this.forceHttps = builder.forceHttps;
        this.http2Option = builder.http2Option;
        this.name = builder.name;
        this.protocol = builder.protocol;
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

    public static final class Builder extends Request.Builder<CreateDomainRequest, Builder> {
        private String caCertIndentifier; 
        private String certIndentifier; 
        private Boolean forceHttps; 
        private String http2Option; 
        private String name; 
        private String protocol; 
        private String tlsMax; 
        private String tlsMin; 

        private Builder() {
            super();
        } 

        private Builder(CreateDomainRequest request) {
            super(request);
            this.caCertIndentifier = request.caCertIndentifier;
            this.certIndentifier = request.certIndentifier;
            this.forceHttps = request.forceHttps;
            this.http2Option = request.http2Option;
            this.name = request.name;
            this.protocol = request.protocol;
            this.tlsMax = request.tlsMax;
            this.tlsMin = request.tlsMin;
        } 

        /**
         * caCertIndentifier.
         */
        public Builder caCertIndentifier(String caCertIndentifier) {
            this.putBodyParameter("caCertIndentifier", caCertIndentifier);
            this.caCertIndentifier = caCertIndentifier;
            return this;
        }

        /**
         * certIndentifier.
         */
        public Builder certIndentifier(String certIndentifier) {
            this.putBodyParameter("certIndentifier", certIndentifier);
            this.certIndentifier = certIndentifier;
            return this;
        }

        /**
         * forceHttps.
         */
        public Builder forceHttps(Boolean forceHttps) {
            this.putBodyParameter("forceHttps", forceHttps);
            this.forceHttps = forceHttps;
            return this;
        }

        /**
         * http2Option.
         */
        public Builder http2Option(String http2Option) {
            this.putBodyParameter("http2Option", http2Option);
            this.http2Option = http2Option;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * protocol.
         */
        public Builder protocol(String protocol) {
            this.putBodyParameter("protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * tlsMax.
         */
        public Builder tlsMax(String tlsMax) {
            this.putBodyParameter("tlsMax", tlsMax);
            this.tlsMax = tlsMax;
            return this;
        }

        /**
         * tlsMin.
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
