// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTenantUserPasswordRequest} extends {@link RequestModel}
 *
 * <p>ModifyTenantUserPasswordRequest</p>
 */
public class ModifyTenantUserPasswordRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EncryptionType")
    private String encryptionType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

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

    private ModifyTenantUserPasswordRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.encryptionType = builder.encryptionType;
        this.instanceId = builder.instanceId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String regionId; 
        private String encryptionType; 
        private String instanceId; 
        private String tenantId; 
        private String userName; 
        private String userPassword; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTenantUserPasswordRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.encryptionType = request.encryptionType;
            this.instanceId = request.instanceId;
            this.tenantId = request.tenantId;
            this.userName = request.userName;
            this.userPassword = request.userPassword;
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
         * 加密方式。
         */
        public Builder encryptionType(String encryptionType) {
            this.putBodyParameter("EncryptionType", encryptionType);
            this.encryptionType = encryptionType;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ```
         * <p>
         * http(s)://[Endpoint]/?Action=ModifyTenantUserPassword
         * &UserName=pay_test
         * &TenantId=ob2mr3oae0****
         * &UserPassword=!Aliyun4Oceanbase
         * &InstanceId=ob317v4uif****
         * &Common request parameters
         * ```
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * The ID of the OceanBase cluster.
         */
        public Builder userName(String userName) {
            this.putBodyParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * You can call this operation to change the logon password of a specified account in a tenant.
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
