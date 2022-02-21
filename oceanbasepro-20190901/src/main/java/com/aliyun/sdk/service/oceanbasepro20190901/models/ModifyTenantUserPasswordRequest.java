// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTenantUserPasswordRequest} extends {@link RequestModel}
 *
 * <p>ModifyTenantUserPasswordRequest</p>
 */
public class ModifyTenantUserPasswordRequest extends Request {
    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true)
    private String tenantId;

    @Body
    @NameInMap("UserName")
    @Validation(required = true)
    private String userName;

    @Body
    @NameInMap("UserPassword")
    @Validation(required = true)
    private String userPassword;

    private ModifyTenantUserPasswordRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.tenantId = builder.tenantId;
        this.userName = builder.userName;
        this.userPassword = builder.userPassword;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTenantUserPasswordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return userPassword
     */
    public String getUserPassword() {
        return this.userPassword;
    }

    public static final class Builder extends Request.Builder<ModifyTenantUserPasswordRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private String tenantId; 
        private String userName; 
        private String userPassword; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTenantUserPasswordRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
            this.tenantId = response.tenantId;
            this.userName = response.userName;
            this.userPassword = response.userPassword;
        } 

        /**
         * Oceanbase集群ID。
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 地域ID。
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 租户ID。
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * 数据库账号名称。 不能使用某些预留关键字，如 SYS、root等。
         */
        public Builder userName(String userName) {
            this.putBodyParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * 数据库账号访问密码。 必须包含大写英文字符、小写英文字符、数字、特殊字符占三种，长度为 10-32 位； 特殊字符为：!@#$%^&* ()_ +-=
         */
        public Builder userPassword(String userPassword) {
            this.putBodyParameter("UserPassword", userPassword);
            this.userPassword = userPassword;
            return this;
        }

        @Override
        public ModifyTenantUserPasswordRequest build() {
            return new ModifyTenantUserPasswordRequest(this);
        } 

    } 

}
