// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTenantUserRequest} extends {@link RequestModel}
 *
 * <p>CreateTenantUserRequest</p>
 */
public class CreateTenantUserRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EncryptionType")
    private String encryptionType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Roles")
    private String roles;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userPassword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userType;

    private CreateTenantUserRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.encryptionType = builder.encryptionType;
        this.instanceId = builder.instanceId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return encryptionType
     */
    public String getEncryptionType() {
        return this.encryptionType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
        private String regionId; 
        private String description; 
        private String encryptionType; 
        private String instanceId; 
        private String roles; 
        private String tenantId; 
        private String userName; 
        private String userPassword; 
        private String userType; 

        private Builder() {
            super();
        } 

        private Builder(CreateTenantUserRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.encryptionType = request.encryptionType;
            this.instanceId = request.instanceId;
            this.roles = request.roles;
            this.tenantId = request.tenantId;
            this.userName = request.userName;
            this.userPassword = request.userPassword;
            this.userType = request.userType;
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
         * The description of the database.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * 加密方式。
         */
        public Builder encryptionType(String encryptionType) {
            this.putBodyParameter("EncryptionType", encryptionType);
            this.encryptionType = encryptionType;
            return this;
        }

        /**
         * The ID of the OceanBase cluster.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The role of the user account.  In Oracle mode, this parameter unspecified is left unspecified.  In MySQL mode, the super administrator account has ALL PRIVILEGES, and you can leave this parameter unspecified.  You need to specify the account information for a general user account. By default, the account information is a JSON array that contains the information of the role and the schema (Oracle mode) or database (MySQL mode).  Valid values: ReadWrite: a role that has the read and write privileges, namely ALL PRIVILEGES. ReadOnly: a role that has only the read-only privilege SELECT. DDL: a role that has DDL privileges such as CREATE, DROP, ALTER, SHOW VIEW, and CREATE VIEW. DML: a role that has DML privileges such as SELECT, INSERT, UPDATE, DELETE, and SHOW VIEW.
         */
        public Builder roles(String roles) {
            this.putBodyParameter("Roles", roles);
            this.roles = roles;
            return this;
        }

        /**
         * The ID of the tenant.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * The name of the database account.  You cannot use reserved keywords, such as SYS and root.
         */
        public Builder userName(String userName) {
            this.putBodyParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * The password of the database account.  It must be 10 to 32 characters in length and contain three types of the following characters: uppercase letters, lowercase letters, digits, and special characters. The special characters are ! @ # $ % \ ^ \ & \ * ( ) _ + - =
         */
        public Builder userPassword(String userPassword) {
            this.putBodyParameter("UserPassword", userPassword);
            this.userPassword = userPassword;
            return this;
        }

        /**
         * The type of the database account. Valid values: Admin: the super administrator account. Normal: a general account.
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
