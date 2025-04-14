// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

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
 * {@link CancelPickUpWaybillRequest} extends {@link RequestModel}
 *
 * <p>CancelPickUpWaybillRequest</p>
 */
public class CancelPickUpWaybillRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CancelDesc")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cancelDesc;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("Content-Type")
    private String contentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OuterOrderCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outerOrderCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
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

        private Builder(CancelPickUpWaybillRequest request) {
            super(request);
            this.cancelDesc = request.cancelDesc;
            this.contentType = request.contentType;
            this.outerOrderCode = request.outerOrderCode;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The cancellation reason.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;action&quot;:&quot;UPDATE_DESC&quot;,&quot;value&quot;:&quot;The courier is unable to pick up the package.&quot;}</p>
         */
        public Builder cancelDesc(String cancelDesc) {
            this.putQueryParameter("CancelDesc", cancelDesc);
            this.cancelDesc = cancelDesc;
            return this;
        }

        /**
         * <p>The content type of the HTTP request. This parameter is optional. If you specify this parameter, enter application/json;chatset=UTF-8.</p>
         * 
         * <strong>example:</strong>
         * <p>application/json;chatset=UTF-8</p>
         */
        public Builder contentType(String contentType) {
            this.putHeaderParameter("Content-Type", contentType);
            this.contentType = contentType;
            return this;
        }

        /**
         * <p>The ID of the external order.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1145678823****</p>
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
