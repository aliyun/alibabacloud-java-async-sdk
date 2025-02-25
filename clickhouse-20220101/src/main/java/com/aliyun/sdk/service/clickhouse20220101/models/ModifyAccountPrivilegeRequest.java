// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyAccountPrivilegeRequest} extends {@link RequestModel}
 *
 * <p>ModifyAccountPrivilegeRequest</p>
 */
public class ModifyAccountPrivilegeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Account")
    @com.aliyun.core.annotation.Validation(required = true)
    private String account;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivilegeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String privilegeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ModifyAccountPrivilegeRequest(Builder builder) {
        super(builder);
        this.account = builder.account;
        this.DBClusterId = builder.DBClusterId;
        this.privilegeType = builder.privilegeType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAccountPrivilegeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return account
     */
    public String getAccount() {
        return this.account;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return privilegeType
     */
    public String getPrivilegeType() {
        return this.privilegeType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyAccountPrivilegeRequest, Builder> {
        private String account; 
        private String DBClusterId; 
        private String privilegeType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAccountPrivilegeRequest request) {
            super(request);
            this.account = request.account;
            this.DBClusterId = request.DBClusterId;
            this.privilegeType = request.privilegeType;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder account(String account) {
            this.putQueryParameter("Account", account);
            this.account = account;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp108z124a8o7****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder privilegeType(String privilegeType) {
            this.putQueryParameter("PrivilegeType", privilegeType);
            this.privilegeType = privilegeType;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyAccountPrivilegeRequest build() {
            return new ModifyAccountPrivilegeRequest(this);
        } 

    } 

}
