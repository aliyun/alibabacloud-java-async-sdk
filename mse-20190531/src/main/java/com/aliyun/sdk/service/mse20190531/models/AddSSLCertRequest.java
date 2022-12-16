// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddSSLCertRequest} extends {@link RequestModel}
 *
 * <p>AddSSLCertRequest</p>
 */
public class AddSSLCertRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("CertIdentifier")
    private String certIdentifier;

    @Query
    @NameInMap("DomainId")
    private Long domainId;

    @Query
    @NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    private AddSSLCertRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.certIdentifier = builder.certIdentifier;
        this.domainId = builder.domainId;
        this.gatewayUniqueId = builder.gatewayUniqueId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddSSLCertRequest create() {
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
     * @return domainId
     */
    public Long getDomainId() {
        return this.domainId;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public static final class Builder extends Request.Builder<AddSSLCertRequest, Builder> {
        private String acceptLanguage; 
        private String certIdentifier; 
        private Long domainId; 
        private String gatewayUniqueId; 

        private Builder() {
            super();
        } 

        private Builder(AddSSLCertRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.certIdentifier = request.certIdentifier;
            this.domainId = request.domainId;
            this.gatewayUniqueId = request.gatewayUniqueId;
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
         * The ID of the domain name.
         */
        public Builder domainId(Long domainId) {
            this.putQueryParameter("DomainId", domainId);
            this.domainId = domainId;
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

        @Override
        public AddSSLCertRequest build() {
            return new AddSSLCertRequest(this);
        } 

    } 

}
