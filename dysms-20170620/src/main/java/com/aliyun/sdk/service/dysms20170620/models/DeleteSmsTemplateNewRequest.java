// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link DeleteSmsTemplateNewRequest} extends {@link RequestModel}
 *
 * <p>DeleteSmsTemplateNewRequest</p>
 */
public class DeleteSmsTemplateNewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsSmsSign")
    private Boolean isSmsSign;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProdCode")
    private String prodCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmsTemplateIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String smsTemplateIds;

    private DeleteSmsTemplateNewRequest(Builder builder) {
        super(builder);
        this.isSmsSign = builder.isSmsSign;
        this.ownerId = builder.ownerId;
        this.prodCode = builder.prodCode;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.smsTemplateIds = builder.smsTemplateIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSmsTemplateNewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isSmsSign
     */
    public Boolean getIsSmsSign() {
        return this.isSmsSign;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return prodCode
     */
    public String getProdCode() {
        return this.prodCode;
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

    /**
     * @return smsTemplateIds
     */
    public String getSmsTemplateIds() {
        return this.smsTemplateIds;
    }

    public static final class Builder extends Request.Builder<DeleteSmsTemplateNewRequest, Builder> {
        private Boolean isSmsSign; 
        private Long ownerId; 
        private String prodCode; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String smsTemplateIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSmsTemplateNewRequest request) {
            super(request);
            this.isSmsSign = request.isSmsSign;
            this.ownerId = request.ownerId;
            this.prodCode = request.prodCode;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.smsTemplateIds = request.smsTemplateIds;
        } 

        /**
         * IsSmsSign.
         */
        public Builder isSmsSign(Boolean isSmsSign) {
            this.putQueryParameter("IsSmsSign", isSmsSign);
            this.isSmsSign = isSmsSign;
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
         * ProdCode.
         */
        public Builder prodCode(String prodCode) {
            this.putQueryParameter("ProdCode", prodCode);
            this.prodCode = prodCode;
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

        /**
         * <p>This parameter is required.</p>
         */
        public Builder smsTemplateIds(String smsTemplateIds) {
            this.putQueryParameter("SmsTemplateIds", smsTemplateIds);
            this.smsTemplateIds = smsTemplateIds;
            return this;
        }

        @Override
        public DeleteSmsTemplateNewRequest build() {
            return new DeleteSmsTemplateNewRequest(this);
        } 

    } 

}
