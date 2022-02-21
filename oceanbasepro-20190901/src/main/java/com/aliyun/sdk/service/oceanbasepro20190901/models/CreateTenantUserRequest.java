// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTenantUserRequest} extends {@link RequestModel}
 *
 * <p>CreateTenantUserRequest</p>
 */
public class CreateTenantUserRequest extends Request {
    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Roles")
    private String roles;

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

    @Body
    @NameInMap("UserType")
    @Validation(required = true)
    private String userType;

    private CreateTenantUserRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.roles = builder.roles;
        this.tenantId = builder.tenantId;
        this.userName = builder.userName;
        this.userPassword = builder.userPassword;
        this.userType = builder.userType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTenantUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return roles
     */
    public String getRoles() {
        return this.roles;
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

    /**
     * @return userType
     */
    public String getUserType() {
        return this.userType;
    }

    public static final class Builder extends Request.Builder<CreateTenantUserRequest, Builder> {
        private String clientToken; 
        private String description; 
        private String instanceId; 
        private String regionId; 
        private String roles; 
        private String tenantId; 
        private String userName; 
        private String userPassword; 
        private String userType; 

        private Builder() {
            super();
        } 

        private Builder(CreateTenantUserRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.description = response.description;
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
            this.roles = response.roles;
            this.tenantId = response.tenantId;
            this.userName = response.userName;
            this.userPassword = response.userPassword;
            this.userType = response.userType;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 数据库描述信息。
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
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
         * 用户的角色信息。 对于Oracle模式：无需填写。 对于MySQL模式：超级账户默认为ALL PRIVILEGES，无需填写。 普通用户填写账户的信息，其为Json格式的字符串，默认为一个数组，数组内包含schema（Oracle模式）或Database（MySQL模式)信息和角色信息（Role）。 角色包含以下几类： 读写权限（ReadWrite）：ALL PRIVILEGES ； 只读权限（ReadOnly）：SELECT DDL权限（DDL）：CREATE,DROP,ALTER,SHOW VIEW,CREATE VIEW DML权限：SELECT,INSERT,UPDATE,DELETE,SHOW VIEW； DML权限（DML）：SELECT,INSERT,UPDATE,DELETE,SHOW VIEW。
         */
        public Builder roles(String roles) {
            this.putBodyParameter("Roles", roles);
            this.roles = roles;
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

        /**
         * 数据库账户的类型 Admin：超级账户 Normal：普通账户
         */
        public Builder userType(String userType) {
            this.putBodyParameter("UserType", userType);
            this.userType = userType;
            return this;
        }

        @Override
        public CreateTenantUserRequest build() {
            return new CreateTenantUserRequest(this);
        } 

    } 

}
