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
         * ????????????????????????
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Oceanbase??????ID???
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ??????ID???
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ???????????????????????? ??????Oracle???????????????????????? ??????MySQL??????????????????????????????ALL PRIVILEGES?????????????????? ??????????????????????????????????????????Json????????????????????????????????????????????????????????????schema???Oracle????????????Database???MySQL??????)????????????????????????Role?????? ??????????????????????????? ???????????????ReadWrite??????ALL PRIVILEGES ??? ???????????????ReadOnly??????SELECT DDL?????????DDL??????CREATE,DROP,ALTER,SHOW VIEW,CREATE VIEW DML?????????SELECT,INSERT,UPDATE,DELETE,SHOW VIEW??? DML?????????DML??????SELECT,INSERT,UPDATE,DELETE,SHOW VIEW???
         */
        public Builder roles(String roles) {
            this.putBodyParameter("Roles", roles);
            this.roles = roles;
            return this;
        }

        /**
         * ??????ID???
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * ???????????????????????? ??????????????????????????????????????? SYS???root??????
         */
        public Builder userName(String userName) {
            this.putBodyParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * ?????????????????????????????? ???????????????????????????????????????????????????????????????????????????????????????????????? 10-32 ?????? ??????????????????!@#$%^&* ()_ +-=
         */
        public Builder userPassword(String userPassword) {
            this.putBodyParameter("UserPassword", userPassword);
            this.userPassword = userPassword;
            return this;
        }

        /**
         * ???????????????????????? Admin??????????????? Normal???????????????
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
