// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApproveTemplateRequest} extends {@link RequestModel}
 *
 * <p>ApproveTemplateRequest</p>
 */
public class ApproveTemplateRequest extends Request {
    @Query
    @NameInMap("FromType")
    @Validation(maximum = 2, minimum = 1)
    private Integer fromType;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TemplateId")
    @Validation(required = true)
    private Integer templateId;

    private ApproveTemplateRequest(Builder builder) {
        super(builder);
        this.fromType = builder.fromType;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApproveTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fromType
     */
    public Integer getFromType() {
        return this.fromType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return templateId
     */
    public Integer getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<ApproveTemplateRequest, Builder> {
        private Integer fromType; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer templateId; 

        private Builder() {
            super();
        } 

        private Builder(ApproveTemplateRequest response) {
            super(response);
            this.fromType = response.fromType;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.templateId = response.templateId;
        } 

        /**
         * FromType.
         */
        public Builder fromType(Integer fromType) {
            this.putQueryParameter("FromType", fromType);
            this.fromType = fromType;
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
         * TemplateId.
         */
        public Builder templateId(Integer templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public ApproveTemplateRequest build() {
            return new ApproveTemplateRequest(this);
        } 

    } 

}
