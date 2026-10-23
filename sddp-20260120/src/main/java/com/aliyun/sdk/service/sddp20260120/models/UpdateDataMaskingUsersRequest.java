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
         * <p>The column encryption access permissions. Valid values: fullAccess: plaintext access. restrictedAccess: restricted access. noneAccess: prohibits decryption. noneAccess applies only to RDS MySQL instances whose current effective key pattern is client_key.</p>
         * 
         * <strong>example:</strong>
         * <p>fullAccess</p>
         */
        public Builder authRole(String authRole) {
            this.putQueryParameter("AuthRole", authRole);
            this.authRole = authRole;
            return this;
        }

        /**
         * <p>The expiration time of the plaintext access permissions. The value is a UNIX timestamp in milliseconds since 00:00:00 UTC on January 1, 1970. Specify this parameter only when ExpireTimeOperation is set to SET. The value must be later than the current time and no greater than 2145953410000. The server saves the value with second-level precision. Do not specify this parameter when ExpireTimeOperation is set to PRESERVE or CLEAR.</p>
         * 
         * <strong>example:</strong>
         * <p>2145953410000</p>
         */
        public Builder expireTime(Long expireTime) {
            this.putQueryParameter("ExpireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>The processing method for the permission expiration time. Valid values: PRESERVE: retains the original expiration time. CLEAR: clears the expiration time. SET: sets the expiration time to the value of ExpireTime. Default value: PRESERVE. Only fullAccess supports setting an expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>PRESERVE</p>
         */
        public Builder expireTimeOperation(String expireTimeOperation) {
            this.putQueryParameter("ExpireTimeOperation", expireTimeOperation);
            this.expireTimeOperation = expireTimeOperation;
            return this;
        }

        /**
         * <p>The language of the response description. Valid values: zh: Chinese. en: English.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The cloud product code. Column encryption supports RDS, POLARDB, and PolarDBX2. If ProductId is also provided, the two parameters must match.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The cloud product type identifier. Valid values: 5: RDS. 8: POLARDB. 27: PolarDBX2. If specified together with ProductCode, the values must match.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder productId(Long productId) {
            this.putQueryParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * <p>The list of database accounts for which you want to set permissions.</p>
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

        @com.aliyun.core.annotation.NameInMap("AuthDb")
        private String authDb;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private UserList(Builder builder) {
            this.accountId = builder.accountId;
            this.authDb = builder.authDb;
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
         * @return authDb
         */
        public String getAuthDb() {
            return this.authDb;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String accountId; 
            private String authDb; 
            private String instanceId; 

            private Builder() {
            } 

            private Builder(UserList model) {
                this.accountId = model.accountId;
                this.authDb = model.authDb;
                this.instanceId = model.instanceId;
            } 

            /**
             * <p>The name of the database account. Obtain the value from Items[].AccountName in the records returned by ListDataAssetAccounts and pass it as a string exactly as it is. Do not pass Items[].Id. Each AccountId must correspond to the InstanceId in the same item. Accounts with the same name in different instances are considered different targets.</p>
             * 
             * <strong>example:</strong>
             * <p>app_reader</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The authentication database of MongoDB.</p>
             * 
             * <strong>example:</strong>
             * <p>database</p>
             */
            public Builder authDb(String authDb) {
                this.authDb = authDb;
                return this;
            }

            /**
             * <p>The database instance identity. You can obtain the value from Items[].InstanceId returned by ListDataMaskingInstances.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-2ze1abcdefgh****</p>
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
