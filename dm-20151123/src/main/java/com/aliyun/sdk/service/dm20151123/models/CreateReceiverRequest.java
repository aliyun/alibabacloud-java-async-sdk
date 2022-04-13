// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateReceiverRequest} extends {@link RequestModel}
 *
 * <p>CreateReceiverRequest</p>
 */
public class CreateReceiverRequest extends Request {
    @Query
    @NameInMap("Desc")
    private String desc;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ReceiversAlias")
    @Validation(required = true)
    private String receiversAlias;

    @Query
    @NameInMap("ReceiversName")
    @Validation(required = true)
    private String receiversName;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CreateReceiverRequest(Builder builder) {
        super(builder);
        this.desc = builder.desc;
        this.ownerId = builder.ownerId;
        this.receiversAlias = builder.receiversAlias;
        this.receiversName = builder.receiversName;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateReceiverRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return receiversAlias
     */
    public String getReceiversAlias() {
        return this.receiversAlias;
    }

    /**
     * @return receiversName
     */
    public String getReceiversName() {
        return this.receiversName;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<CreateReceiverRequest, Builder> {
        private String desc; 
        private Long ownerId; 
        private String receiversAlias; 
        private String receiversName; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateReceiverRequest request) {
            super(request);
            this.desc = request.desc;
            this.ownerId = request.ownerId;
            this.receiversAlias = request.receiversAlias;
            this.receiversName = request.receiversName;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * Desc.
         */
        public Builder desc(String desc) {
            this.putQueryParameter("Desc", desc);
            this.desc = desc;
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
         * ReceiversAlias.
         */
        public Builder receiversAlias(String receiversAlias) {
            this.putQueryParameter("ReceiversAlias", receiversAlias);
            this.receiversAlias = receiversAlias;
            return this;
        }

        /**
         * ReceiversName.
         */
        public Builder receiversName(String receiversName) {
            this.putQueryParameter("ReceiversName", receiversName);
            this.receiversName = receiversName;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public CreateReceiverRequest build() {
            return new CreateReceiverRequest(this);
        } 

    } 

}
