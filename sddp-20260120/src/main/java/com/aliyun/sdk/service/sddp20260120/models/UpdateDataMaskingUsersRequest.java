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
         * <p>The column encryption access permissions. Valid values:</p>
         * <ul>
         * <li>fullAccess: plaintext access.</li>
         * <li>restrictedAccess: restricted access.</li>
         * <li>noneAccess: decryption denied.</li>
         * </ul>
         * <p>noneAccess applies only to ApsaraDB RDS for MySQL instances whose active key pattern is client_key.</p>
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
         * <p>The expiration time of the plaintext access permissions. Specify a UNIX timestamp in milliseconds since 1970-01-01 00:00:00 UTC. This parameter is required only when ExpireTimeOperation is set to SET. The value must be later than the current time and no later than 2145953410000. The server stores the value with second-level precision. Do not specify this parameter when ExpireTimeOperation is set to PRESERVE or CLEAR.</p>
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
         * <p>The action to take on the permission expiration time. Valid values:</p>
         * <ul>
         * <li>PRESERVE: Retains the existing expiration time.</li>
         * <li>CLEAR: Clears the expiration time.</li>
         * <li>SET: Sets the expiration time to the value specified by ExpireTime.</li>
         * </ul>
         * <p>Default value: PRESERVE. Only fullAccess supports configuring a validity period.</p>
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
         * <p>The language of the response description. Valid values:</p>
         * <ul>
         * <li>zh: Chinese.</li>
         * <li>en: English.</li>
         * </ul>
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
         * <p>The cloud product code. Column encryption supports RDS, POLARDB, and PolarDBX2. If ProductId is also specified, the two parameters must correspond to each other.</p>
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
         * <p>The cloud product type identifier. Valid values:</p>
         * <ul>
         * <li>5: RDS.</li>
         * <li>8: POLARDB.</li>
         * <li>27: PolarDBX2.</li>
         * </ul>
         * <p>If both ProductId and ProductCode are specified, they must correspond to each other.</p>
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
         * <p>The list of database accounts for which to set permissions.</p>
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
             * <p>The database account identifier. Obtain this value from Items[].Id in the response of ListDataAssetAccounts and pass it as a string.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The database instance identity. Obtain this value from Items[].InstanceId in the response of ListDataMaskingInstances.</p>
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
