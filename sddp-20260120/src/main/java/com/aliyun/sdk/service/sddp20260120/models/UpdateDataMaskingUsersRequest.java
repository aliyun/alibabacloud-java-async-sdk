// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20260120.models;

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
 * {@link UpdateDataMaskingUsersRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataMaskingUsersRequest</p>
 */
public class UpdateDataMaskingUsersRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthRole")
    private String authRole;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private Long expireTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireTimeOperation")
    private String expireTimeOperation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductId")
    private Long productId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserList")
    private java.util.List<UserList> userList;

    private UpdateDataMaskingUsersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.authRole = builder.authRole;
        this.expireTime = builder.expireTime;
        this.expireTimeOperation = builder.expireTimeOperation;
        this.lang = builder.lang;
        this.productCode = builder.productCode;
        this.productId = builder.productId;
        this.userList = builder.userList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataMaskingUsersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return authRole
     */
    public String getAuthRole() {
        return this.authRole;
    }

    /**
     * @return expireTime
     */
    public Long getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return expireTimeOperation
     */
    public String getExpireTimeOperation() {
        return this.expireTimeOperation;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return productId
     */
    public Long getProductId() {
        return this.productId;
    }

    /**
     * @return userList
     */
    public java.util.List<UserList> getUserList() {
        return this.userList;
    }

    public static final class Builder extends Request.Builder<UpdateDataMaskingUsersRequest, Builder> {
        private String regionId; 
        private String authRole; 
        private Long expireTime; 
        private String expireTimeOperation; 
        private String lang; 
        private String productCode; 
        private Long productId; 
        private java.util.List<UserList> userList; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataMaskingUsersRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.authRole = request.authRole;
            this.expireTime = request.expireTime;
            this.expireTimeOperation = request.expireTimeOperation;
            this.lang = request.lang;
            this.productCode = request.productCode;
            this.productId = request.productId;
            this.userList = request.userList;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AuthRole.
         */
        public Builder authRole(String authRole) {
            this.putQueryParameter("AuthRole", authRole);
            this.authRole = authRole;
            return this;
        }

        /**
         * ExpireTime.
         */
        public Builder expireTime(Long expireTime) {
            this.putQueryParameter("ExpireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * ExpireTimeOperation.
         */
        public Builder expireTimeOperation(String expireTimeOperation) {
            this.putQueryParameter("ExpireTimeOperation", expireTimeOperation);
            this.expireTimeOperation = expireTimeOperation;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * ProductId.
         */
        public Builder productId(Long productId) {
            this.putQueryParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * UserList.
         */
        public Builder userList(java.util.List<UserList> userList) {
            String userListShrink = shrink(userList, "UserList", "json");
            this.putQueryParameter("UserList", userListShrink);
            this.userList = userList;
            return this;
        }

        @Override
        public UpdateDataMaskingUsersRequest build() {
            return new UpdateDataMaskingUsersRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateDataMaskingUsersRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataMaskingUsersRequest</p>
     */
    public static class UserList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private UserList(Builder builder) {
            this.accountId = builder.accountId;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserList create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String accountId; 
            private String instanceId; 

            private Builder() {
            } 

            private Builder(UserList model) {
                this.accountId = model.accountId;
                this.instanceId = model.instanceId;
            } 

            /**
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public UserList build() {
                return new UserList(this);
            } 

        } 

    }
}
