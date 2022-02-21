// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetCdnDomainCSRCertificateRequest} extends {@link RequestModel}
 *
 * <p>SetCdnDomainCSRCertificateRequest</p>
 */
public class SetCdnDomainCSRCertificateRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ServerCertificate")
    @Validation(required = true)
    private String serverCertificate;

    private SetCdnDomainCSRCertificateRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.serverCertificate = builder.serverCertificate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetCdnDomainCSRCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return serverCertificate
     */
    public String getServerCertificate() {
        return this.serverCertificate;
    }

    public static final class Builder extends Request.Builder<SetCdnDomainCSRCertificateRequest, Builder> {
        private String domainName; 
        private Long ownerId; 
        private String serverCertificate; 

        private Builder() {
            super();
        } 

        private Builder(SetCdnDomainCSRCertificateRequest response) {
            super(response);
            this.domainName = response.domainName;
            this.ownerId = response.ownerId;
            this.serverCertificate = response.serverCertificate;
        } 

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ServerCertificate.
         */
        public Builder serverCertificate(String serverCertificate) {
            this.putQueryParameter("ServerCertificate", serverCertificate);
            this.serverCertificate = serverCertificate;
            return this;
        }

        @Override
        public SetCdnDomainCSRCertificateRequest build() {
            return new SetCdnDomainCSRCertificateRequest(this);
        } 

    } 

}
