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
 * {@link UpdateSSLCertRequest} extends {@link RequestModel}
 *
 * <p>UpdateSSLCertRequest</p>
 */
public class UpdateSSLCertRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertIdentifier")
    private String certIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainId")
    private Long domainId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    private UpdateSSLCertRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.certIdentifier = builder.certIdentifier;
        this.domainId = builder.domainId;
        this.gatewayUniqueId = builder.gatewayUniqueId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSSLCertRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateSSLCertRequest, Builder> {
        private String acceptLanguage; 
        private String certIdentifier; 
        private Long domainId; 
        private String gatewayUniqueId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSSLCertRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.certIdentifier = request.certIdentifier;
            this.domainId = request.domainId;
            this.gatewayUniqueId = request.gatewayUniqueId;
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
         * <p>5951436-cn-hangzhou</p>
         */
        public Builder certIdentifier(String certIdentifier) {
            this.putQueryParameter("CertIdentifier", certIdentifier);
            this.certIdentifier = certIdentifier;
            return this;
        }

        /**
         * <p>The ID of the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>210</p>
         */
        public Builder domainId(Long domainId) {
            this.putQueryParameter("DomainId", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-2a99625886d54722be94d92e9a69****</p>
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        @Override
        public UpdateSSLCertRequest build() {
            return new UpdateSSLCertRequest(this);
        } 

    } 

}
