// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link ModifySupabaseDashboardPasswordRequest} extends {@link RequestModel}
 *
 * <p>ModifySupabaseDashboardPasswordRequest</p>
 */
public class ModifySupabaseDashboardPasswordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ModifySupabaseDashboardPasswordRequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.newPassword = builder.newPassword;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySupabaseDashboardPasswordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return newPassword
     */
    public String getNewPassword() {
        return this.newPassword;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifySupabaseDashboardPasswordRequest, Builder> {
        private String DBInstanceName; 
        private String newPassword; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifySupabaseDashboardPasswordRequest request) {
            super(request);
            this.DBInstanceName = request.DBInstanceName;
            this.newPassword = request.newPassword;
            this.regionId = request.regionId;
        } 

        /**
         * <p>实例名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-xxx</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>新密码</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder newPassword(String newPassword) {
            this.putQueryParameter("NewPassword", newPassword);
            this.newPassword = newPassword;
            return this;
        }

        /**
         * <p>地域ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifySupabaseDashboardPasswordRequest build() {
            return new ModifySupabaseDashboardPasswordRequest(this);
        } 

    } 

}
