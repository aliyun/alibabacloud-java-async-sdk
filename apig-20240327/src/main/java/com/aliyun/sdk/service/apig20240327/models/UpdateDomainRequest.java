// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
            this.tlsMax = request.tlsMax;
            this.tlsMin = request.tlsMin;
        } 

        /**
         * domainId.
         */
        public Builder domainId(String domainId) {
            this.putPathParameter("domainId", domainId);
            this.domainId = domainId;
            return this;
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
        public UpdateDomainRequest build() {
            return new UpdateDomainRequest(this);
        } 

    } 

}
