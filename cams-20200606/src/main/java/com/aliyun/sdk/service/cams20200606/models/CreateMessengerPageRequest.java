// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link CreateMessengerPageRequest} extends {@link RequestModel}
 *
 * <p>CreateMessengerPageRequest</p>
 */
public class CreateMessengerPageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdAccountIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> adAccountIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthenticationCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authenticationCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String businessId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String custSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CreateMessengerPageRequest(Builder builder) {
        super(builder);
        this.adAccountIds = builder.adAccountIds;
        this.authenticationCode = builder.authenticationCode;
        this.businessId = builder.businessId;
        this.custSpaceId = builder.custSpaceId;
        this.ownerId = builder.ownerId;
        this.pageId = builder.pageId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMessengerPageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adAccountIds
     */
    public java.util.List<String> getAdAccountIds() {
        return this.adAccountIds;
    }

    /**
     * @return authenticationCode
     */
    public String getAuthenticationCode() {
        return this.authenticationCode;
    }

    /**
     * @return businessId
     */
    public String getBusinessId() {
        return this.businessId;
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageId
     */
    public String getPageId() {
        return this.pageId;
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

    public static final class Builder extends Request.Builder<CreateMessengerPageRequest, Builder> {
        private java.util.List<String> adAccountIds; 
        private String authenticationCode; 
        private String businessId; 
        private String custSpaceId; 
        private Long ownerId; 
        private String pageId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMessengerPageRequest request) {
            super(request);
            this.adAccountIds = request.adAccountIds;
            this.authenticationCode = request.authenticationCode;
            this.businessId = request.businessId;
            this.custSpaceId = request.custSpaceId;
            this.ownerId = request.ownerId;
            this.pageId = request.pageId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder adAccountIds(java.util.List<String> adAccountIds) {
            String adAccountIdsShrink = shrink(adAccountIds, "AdAccountIds", "json");
            this.putQueryParameter("AdAccountIds", adAccountIdsShrink);
            this.adAccountIds = adAccountIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>EAA****</p>
         */
        public Builder authenticationCode(String authenticationCode) {
            this.putQueryParameter("AuthenticationCode", authenticationCode);
            this.authenticationCode = authenticationCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>293***</p>
         */
        public Builder businessId(String businessId) {
            this.putQueryParameter("BusinessId", businessId);
            this.businessId = businessId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cams-s***</p>
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>19283***</p>
         */
        public Builder pageId(String pageId) {
            this.putQueryParameter("PageId", pageId);
            this.pageId = pageId;
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
        public CreateMessengerPageRequest build() {
            return new CreateMessengerPageRequest(this);
        } 

    } 

}
