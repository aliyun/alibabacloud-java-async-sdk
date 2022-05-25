// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link CreateUserRequest} extends {@link RequestModel}
 *
 * <p>CreateUserRequest</p>
 */
public class CreateUserRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("applicationId")
    @Validation(required = true)
    private String applicationId;

    @Header
    @NameInMap("Authorization")
    @Validation(required = true)
    private String authorization;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("displayName")
    private String displayName;

    @Body
    @NameInMap("email")
    private String email;

    @Body
    @NameInMap("emailVerified")
    private Boolean emailVerified;

    @Body
    @NameInMap("password")
    private String password;

    @Body
    @NameInMap("phoneNumber")
    private String phoneNumber;

    @Body
    @NameInMap("phoneNumberVerified")
    private Boolean phoneNumberVerified;

    @Body
    @NameInMap("phoneRegion")
    private String phoneRegion;

    @Body
    @NameInMap("primaryOrganizationalUnitId")
    @Validation(required = true)
    private String primaryOrganizationalUnitId;

    @Body
    @NameInMap("userExternalId")
    private String userExternalId;

    @Body
    @NameInMap("username")
    @Validation(required = true)
    private String username;

    @Host
    @NameInMap("regionId")
    private String regionId;

    private CreateUserRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.applicationId = builder.applicationId;
        this.authorization = builder.authorization;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.email = builder.email;
        this.emailVerified = builder.emailVerified;
        this.password = builder.password;
        this.phoneNumber = builder.phoneNumber;
        this.phoneNumberVerified = builder.phoneNumberVerified;
        this.phoneRegion = builder.phoneRegion;
        this.primaryOrganizationalUnitId = builder.primaryOrganizationalUnitId;
        this.userExternalId = builder.userExternalId;
        this.username = builder.username;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserRequest create() {
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
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return authorization
     */
    public String getAuthorization() {
        return this.authorization;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return emailVerified
     */
    public Boolean getEmailVerified() {
        return this.emailVerified;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * @return phoneNumberVerified
     */
    public Boolean getPhoneNumberVerified() {
        return this.phoneNumberVerified;
    }

    /**
     * @return phoneRegion
     */
    public String getPhoneRegion() {
        return this.phoneRegion;
    }

    /**
     * @return primaryOrganizationalUnitId
     */
    public String getPrimaryOrganizationalUnitId() {
        return this.primaryOrganizationalUnitId;
    }

    /**
     * @return userExternalId
     */
    public String getUserExternalId() {
        return this.userExternalId;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateUserRequest, Builder> {
        private String instanceId; 
        private String applicationId; 
        private String authorization; 
        private String description; 
        private String displayName; 
        private String email; 
        private Boolean emailVerified; 
        private String password; 
        private String phoneNumber; 
        private Boolean phoneNumberVerified; 
        private String phoneRegion; 
        private String primaryOrganizationalUnitId; 
        private String userExternalId; 
        private String username; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateUserRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.applicationId = request.applicationId;
            this.authorization = request.authorization;
            this.description = request.description;
            this.displayName = request.displayName;
            this.email = request.email;
            this.emailVerified = request.emailVerified;
            this.password = request.password;
            this.phoneNumber = request.phoneNumber;
            this.phoneNumberVerified = request.phoneNumberVerified;
            this.phoneRegion = request.phoneRegion;
            this.primaryOrganizationalUnitId = request.primaryOrganizationalUnitId;
            this.userExternalId = request.userExternalId;
            this.username = request.username;
            this.regionId = request.regionId;
        } 

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 应用ID
         */
        public Builder applicationId(String applicationId) {
            this.putPathParameter("applicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * 认证信息，格式:Bearer access_token
         */
        public Builder authorization(String authorization) {
            this.putHeaderParameter("Authorization", authorization);
            this.authorization = authorization;
            return this;
        }

        /**
         * 描述
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * 账户展示名
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * 邮箱
         */
        public Builder email(String email) {
            this.putBodyParameter("email", email);
            this.email = email;
            return this;
        }

        /**
         * 邮箱是否验证，邮箱若设置此字段必须设置，无特殊业务可直接设置为true
         */
        public Builder emailVerified(Boolean emailVerified) {
            this.putBodyParameter("emailVerified", emailVerified);
            this.emailVerified = emailVerified;
            return this;
        }

        /**
         * 密码, 参考密码策略
         */
        public Builder password(String password) {
            this.putBodyParameter("password", password);
            this.password = password;
            return this;
        }

        /**
         * 手机号
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putBodyParameter("phoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * 手机号是否验证，手机号若设置此字段必须设置，无特殊业务可直接设置为true
         */
        public Builder phoneNumberVerified(Boolean phoneNumberVerified) {
            this.putBodyParameter("phoneNumberVerified", phoneNumberVerified);
            this.phoneNumberVerified = phoneNumberVerified;
            return this;
        }

        /**
         * 手机地区编号,示例：中国大陆手区号为86，不带 00 或 +, 手机号若设置，此参数必填
         */
        public Builder phoneRegion(String phoneRegion) {
            this.putBodyParameter("phoneRegion", phoneRegion);
            this.phoneRegion = phoneRegion;
            return this;
        }

        /**
         * 账户主机构ID
         */
        public Builder primaryOrganizationalUnitId(String primaryOrganizationalUnitId) {
            this.putBodyParameter("primaryOrganizationalUnitId", primaryOrganizationalUnitId);
            this.primaryOrganizationalUnitId = primaryOrganizationalUnitId;
            return this;
        }

        /**
         * 账户外部ID
         */
        public Builder userExternalId(String userExternalId) {
            this.putBodyParameter("userExternalId", userExternalId);
            this.userExternalId = userExternalId;
            return this;
        }

        /**
         * 账户名
         */
        public Builder username(String username) {
            this.putBodyParameter("username", username);
            this.username = username;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateUserRequest build() {
            return new CreateUserRequest(this);
        } 

    } 

}
