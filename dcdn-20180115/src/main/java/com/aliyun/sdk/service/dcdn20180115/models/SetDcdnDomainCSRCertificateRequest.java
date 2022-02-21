// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDcdnDomainCSRCertificateRequest} extends {@link RequestModel}
 *
 * <p>SetDcdnDomainCSRCertificateRequest</p>
 */
public class SetDcdnDomainCSRCertificateRequest extends Request {
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

    private SetDcdnDomainCSRCertificateRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.serverCertificate = builder.serverCertificate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDcdnDomainCSRCertificateRequest create() {
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

    public static final class Builder extends Request.Builder<SetDcdnDomainCSRCertificateRequest, Builder> {
        private String domainName; 
        private Long ownerId; 
        private String serverCertificate; 

        private Builder() {
            super();
        } 

        private Builder(SetDcdnDomainCSRCertificateRequest response) {
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
        public SetDcdnDomainCSRCertificateRequest build() {
            return new SetDcdnDomainCSRCertificateRequest(this);
        } 

    } 

}
