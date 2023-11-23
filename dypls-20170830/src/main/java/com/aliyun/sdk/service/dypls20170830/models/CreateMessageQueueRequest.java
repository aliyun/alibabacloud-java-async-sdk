// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypls20170830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMessageQueueRequest} extends {@link RequestModel}
 *
 * <p>CreateMessageQueueRequest</p>
 */
public class CreateMessageQueueRequest extends Request {
    @Query
    @NameInMap("BillIds")
    @Validation(required = true)
    private String billIds;

    @Query
    @NameInMap("BizType")
    @Validation(required = true)
    private String bizType;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ProdCode")
    private String prodCode;

    @Query
    @NameInMap("QueueName")
    private String queueName;

    @Query
    @NameInMap("QueueTitle")
    @Validation(required = true)
    private String queueTitle;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CreateMessageQueueRequest(Builder builder) {
        super(builder);
        this.billIds = builder.billIds;
        this.bizType = builder.bizType;
        this.ownerId = builder.ownerId;
        this.prodCode = builder.prodCode;
        this.queueName = builder.queueName;
        this.queueTitle = builder.queueTitle;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMessageQueueRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billIds
     */
    public String getBillIds() {
        return this.billIds;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
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
     * @return queueName
     */
    public String getQueueName() {
        return this.queueName;
    }

    /**
     * @return queueTitle
     */
    public String getQueueTitle() {
        return this.queueTitle;
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

    public static final class Builder extends Request.Builder<CreateMessageQueueRequest, Builder> {
        private String billIds; 
        private String bizType; 
        private Long ownerId; 
        private String prodCode; 
        private String queueName; 
        private String queueTitle; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMessageQueueRequest request) {
            super(request);
            this.billIds = request.billIds;
            this.bizType = request.bizType;
            this.ownerId = request.ownerId;
            this.prodCode = request.prodCode;
            this.queueName = request.queueName;
            this.queueTitle = request.queueTitle;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * BillIds.
         */
        public Builder billIds(String billIds) {
            this.putQueryParameter("BillIds", billIds);
            this.billIds = billIds;
            return this;
        }

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
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
         * QueueName.
         */
        public Builder queueName(String queueName) {
            this.putQueryParameter("QueueName", queueName);
            this.queueName = queueName;
            return this;
        }

        /**
         * QueueTitle.
         */
        public Builder queueTitle(String queueTitle) {
            this.putQueryParameter("QueueTitle", queueTitle);
            this.queueTitle = queueTitle;
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
        public CreateMessageQueueRequest build() {
            return new CreateMessageQueueRequest(this);
        } 

    } 

}
