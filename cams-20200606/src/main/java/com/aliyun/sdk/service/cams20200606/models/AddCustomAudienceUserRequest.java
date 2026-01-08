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
 * {@link AddCustomAudienceUserRequest} extends {@link RequestModel}
 *
 * <p>AddCustomAudienceUserRequest</p>
 */
public class AddCustomAudienceUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdAccountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String adAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchLastFlag")
    private Boolean batchLastFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String custSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomAudienceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customAudienceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EstimatedNumTotal")
    private Long estimatedNumTotal;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Users")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Users> users;

    private AddCustomAudienceUserRequest(Builder builder) {
        super(builder);
        this.adAccountId = builder.adAccountId;
        this.batchLastFlag = builder.batchLastFlag;
        this.custSpaceId = builder.custSpaceId;
        this.customAudienceId = builder.customAudienceId;
        this.estimatedNumTotal = builder.estimatedNumTotal;
        this.ownerId = builder.ownerId;
        this.pageId = builder.pageId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCustomAudienceUserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adAccountId
     */
    public String getAdAccountId() {
        return this.adAccountId;
    }

    /**
     * @return batchLastFlag
     */
    public Boolean getBatchLastFlag() {
        return this.batchLastFlag;
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return customAudienceId
     */
    public String getCustomAudienceId() {
        return this.customAudienceId;
    }

    /**
     * @return estimatedNumTotal
     */
    public Long getEstimatedNumTotal() {
        return this.estimatedNumTotal;
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

    /**
     * @return users
     */
    public java.util.List<Users> getUsers() {
        return this.users;
    }

    public static final class Builder extends Request.Builder<AddCustomAudienceUserRequest, Builder> {
        private String adAccountId; 
        private Boolean batchLastFlag; 
        private String custSpaceId; 
        private String customAudienceId; 
        private Long estimatedNumTotal; 
        private Long ownerId; 
        private String pageId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<Users> users; 

        private Builder() {
            super();
        } 

        private Builder(AddCustomAudienceUserRequest request) {
            super(request);
            this.adAccountId = request.adAccountId;
            this.batchLastFlag = request.batchLastFlag;
            this.custSpaceId = request.custSpaceId;
            this.customAudienceId = request.customAudienceId;
            this.estimatedNumTotal = request.estimatedNumTotal;
            this.ownerId = request.ownerId;
            this.pageId = request.pageId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.users = request.users;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3939**</p>
         */
        public Builder adAccountId(String adAccountId) {
            this.putQueryParameter("AdAccountId", adAccountId);
            this.adAccountId = adAccountId;
            return this;
        }

        /**
         * BatchLastFlag.
         */
        public Builder batchLastFlag(Boolean batchLastFlag) {
            this.putQueryParameter("BatchLastFlag", batchLastFlag);
            this.batchLastFlag = batchLastFlag;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cams-**</p>
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>399**</p>
         */
        public Builder customAudienceId(String customAudienceId) {
            this.putQueryParameter("CustomAudienceId", customAudienceId);
            this.customAudienceId = customAudienceId;
            return this;
        }

        /**
         * EstimatedNumTotal.
         */
        public Builder estimatedNumTotal(Long estimatedNumTotal) {
            this.putQueryParameter("EstimatedNumTotal", estimatedNumTotal);
            this.estimatedNumTotal = estimatedNumTotal;
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
         * <p>239**</p>
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

        /**
         * <p>This parameter is required.</p>
         */
        public Builder users(java.util.List<Users> users) {
            String usersShrink = shrink(users, "Users", "json");
            this.putQueryParameter("Users", usersShrink);
            this.users = users;
            return this;
        }

        @Override
        public AddCustomAudienceUserRequest build() {
            return new AddCustomAudienceUserRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddCustomAudienceUserRequest} extends {@link TeaModel}
     *
     * <p>AddCustomAudienceUserRequest</p>
     */
    public static class Users extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        private Users(Builder builder) {
            this.email = builder.email;
            this.phone = builder.phone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        public static final class Builder {
            private String email; 
            private String phone; 

            private Builder() {
            } 

            private Builder(Users model) {
                this.email = model.email;
                this.phone = model.phone;
            } 

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * Phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
}
