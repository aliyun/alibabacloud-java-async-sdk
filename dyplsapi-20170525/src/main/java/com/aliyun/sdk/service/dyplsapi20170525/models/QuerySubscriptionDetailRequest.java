// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySubscriptionDetailRequest} extends {@link RequestModel}
 *
 * <p>QuerySubscriptionDetailRequest</p>
 */
public class QuerySubscriptionDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNoX")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNoX;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PoolKey")
    private String poolKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subsId;

    private QuerySubscriptionDetailRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.phoneNoX = builder.phoneNoX;
        this.poolKey = builder.poolKey;
        this.productType = builder.productType;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.subsId = builder.subsId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySubscriptionDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return phoneNoX
     */
    public String getPhoneNoX() {
        return this.phoneNoX;
    }

    /**
     * @return poolKey
     */
    public String getPoolKey() {
        return this.poolKey;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
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
     * @return subsId
     */
    public String getSubsId() {
        return this.subsId;
    }

    public static final class Builder extends Request.Builder<QuerySubscriptionDetailRequest, Builder> {
        private Long ownerId; 
        private String phoneNoX; 
        private String poolKey; 
        private String productType; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String subsId; 

        private Builder() {
            super();
        } 

        private Builder(QuerySubscriptionDetailRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.phoneNoX = request.phoneNoX;
            this.poolKey = request.poolKey;
            this.productType = request.productType;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.subsId = request.subsId;
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
         * The private number in the binding, that is, phone number X.
         */
        public Builder phoneNoX(String phoneNoX) {
            this.putQueryParameter("PhoneNoX", phoneNoX);
            this.phoneNoX = phoneNoX;
            return this;
        }

        /**
         * The key of the phone number pool. Log on to the [Phone Number Protection console](https://dypls.console.aliyun.com/dypls.htm#/account) and view the key of the phone number pool on the **Number Pool Management** page.
         * <p>
         * 
         * >  This parameter is required when **ProductType** is left empty.
         */
        public Builder poolKey(String poolKey) {
            this.putQueryParameter("PoolKey", poolKey);
            this.poolKey = poolKey;
            return this;
        }

        /**
         * The product type. Valid values:
         * <p>
         * 
         * *   **AXB\_170**
         * *   **AXN\_170**
         * *   **AXN\_95**
         * *   **AXN_EXTENSION_REUSE**
         * 
         * > 
         * 
         * *   This parameter is applicable to the original key accounts of Alibaba Cloud. This parameter can be ignored for Alibaba Cloud users.
         * 
         * *   This parameter is required when **PoolKey** is left empty.
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
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
         * The binding ID.
         * <p>
         * 
         * Log on to the Phone Number Protection console, choose **Number and Number Pool** > **Number Management**. On the Number Management page, select the desired record and click Details to view the binding ID. Alternatively, you can view the value of the **SubsId** parameter returned by an API operation for a phone number binding such as [BindAxb](~~110248~~). The value of this parameter indicates a binding ID.
         */
        public Builder subsId(String subsId) {
            this.putQueryParameter("SubsId", subsId);
            this.subsId = subsId;
            return this;
        }

        @Override
        public QuerySubscriptionDetailRequest build() {
            return new QuerySubscriptionDetailRequest(this);
        } 

    } 

}
