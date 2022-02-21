// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelPickUpWaybillRequest} extends {@link RequestModel}
 *
 * <p>CancelPickUpWaybillRequest</p>
 */
public class CancelPickUpWaybillRequest extends Request {
    @Query
    @NameInMap("CancelDesc")
    @Validation(required = true)
    private String cancelDesc;

    @Header
    @NameInMap("Content-Type")
    private String contentType;

    @Query
    @NameInMap("OuterOrderCode")
    @Validation(required = true)
    private String outerOrderCode;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CancelPickUpWaybillRequest(Builder builder) {
        super(builder);
        this.cancelDesc = builder.cancelDesc;
        this.contentType = builder.contentType;
        this.outerOrderCode = builder.outerOrderCode;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelPickUpWaybillRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cancelDesc
     */
    public String getCancelDesc() {
        return this.cancelDesc;
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @return outerOrderCode
     */
    public String getOuterOrderCode() {
        return this.outerOrderCode;
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

    public static final class Builder extends Request.Builder<CancelPickUpWaybillRequest, Builder> {
        private String cancelDesc; 
        private String contentType; 
        private String outerOrderCode; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CancelPickUpWaybillRequest response) {
            super(response);
            this.cancelDesc = response.cancelDesc;
            this.contentType = response.contentType;
            this.outerOrderCode = response.outerOrderCode;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
        } 

        /**
         * CancelDesc.
         */
        public Builder cancelDesc(String cancelDesc) {
            this.putQueryParameter("CancelDesc", cancelDesc);
            this.cancelDesc = cancelDesc;
            return this;
        }

        /**
         * Content-Type.
         */
        public Builder contentType(String contentType) {
            this.putHeaderParameter("Content-Type", contentType);
            this.contentType = contentType;
            return this;
        }

        /**
         * OuterOrderCode.
         */
        public Builder outerOrderCode(String outerOrderCode) {
            this.putQueryParameter("OuterOrderCode", outerOrderCode);
            this.outerOrderCode = outerOrderCode;
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

        @Override
        public CancelPickUpWaybillRequest build() {
            return new CancelPickUpWaybillRequest(this);
        } 

    } 

}
