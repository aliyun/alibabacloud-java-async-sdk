// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCdnDomainRequest} extends {@link RequestModel}
 *
 * <p>DeleteCdnDomainRequest</p>
 */
public class DeleteCdnDomainRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private DeleteCdnDomainRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCdnDomainRequest create() {
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
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<DeleteCdnDomainRequest, Builder> {
        private String domainName; 
        private String ownerAccount; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCdnDomainRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
        } 

        /**
         * The accelerated domain name that you want to remove. You can specify only one domain name in each call.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
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

        @Override
        public DeleteCdnDomainRequest build() {
            return new DeleteCdnDomainRequest(this);
        } 

    } 

}
