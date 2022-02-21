// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDatabaseUserRolesRequest} extends {@link RequestModel}
 *
 * <p>ModifyDatabaseUserRolesRequest</p>
 */
public class ModifyDatabaseUserRolesRequest extends Request {
    @Body
    @NameInMap("DatabaseName")
    @Validation(required = true)
    private String databaseName;

    @Body
    @NameInMap("InstanceId")
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true)
    private String tenantId;

    @Body
    @NameInMap("Users")
    @Validation(required = true)
    private String users;

    private ModifyDatabaseUserRolesRequest(Builder builder) {
        super(builder);
        this.databaseName = builder.databaseName;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.tenantId = builder.tenantId;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDatabaseUserRolesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
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
     * @return users
     */
    public String getUsers() {
        return this.users;
    }

    public static final class Builder extends Request.Builder<ModifyDatabaseUserRolesRequest, Builder> {
        private String databaseName; 
        private String instanceId; 
        private String regionId; 
        private String tenantId; 
        private String users; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDatabaseUserRolesRequest response) {
            super(response);
            this.databaseName = response.databaseName;
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
            this.tenantId = response.tenantId;
            this.users = response.users;
        } 

        /**
         * 数据库名称。 不能使用某些预留关键字，如 test、mysql。
         */
        public Builder databaseName(String databaseName) {
            this.putBodyParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
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
         * 用户名及具备的角色列表。
         */
        public Builder users(String users) {
            this.putBodyParameter("Users", users);
            this.users = users;
            return this;
        }

        @Override
        public ModifyDatabaseUserRolesRequest build() {
            return new ModifyDatabaseUserRolesRequest(this);
        } 

    } 

}
