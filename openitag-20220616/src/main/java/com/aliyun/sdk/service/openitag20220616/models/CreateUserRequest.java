// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserRequest} extends {@link RequestModel}
 *
 * <p>CreateUserRequest</p>
 */
public class CreateUserRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Role")
    @com.aliyun.core.annotation.Validation(required = true)
    private String role;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private CreateUserRequest(Builder builder) {
        super(builder);
        this.tenantId = builder.tenantId;
        this.accountNo = builder.accountNo;
        this.accountType = builder.accountType;
        this.role = builder.role;
        this.userName = builder.userName;
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
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return accountNo
     */
    public String getAccountNo() {
        return this.accountNo;
    }

    /**
     * @return accountType
     */
    public String getAccountType() {
        return this.accountType;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<CreateUserRequest, Builder> {
        private String tenantId; 
        private String accountNo; 
        private String accountType; 
        private String role; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(CreateUserRequest request) {
            super(request);
            this.tenantId = request.tenantId;
            this.accountNo = request.accountNo;
            this.accountType = request.accountType;
            this.role = request.role;
            this.userName = request.userName;
        } 

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putPathParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * AccountNo.
         */
        public Builder accountNo(String accountNo) {
            this.putBodyParameter("AccountNo", accountNo);
            this.accountNo = accountNo;
            return this;
        }

        /**
         * AccountType.
         */
        public Builder accountType(String accountType) {
            this.putBodyParameter("AccountType", accountType);
            this.accountType = accountType;
            return this;
        }

        /**
         * Role.
         */
        public Builder role(String role) {
            this.putBodyParameter("Role", role);
            this.role = role;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putBodyParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public CreateUserRequest build() {
            return new CreateUserRequest(this);
        } 

    } 

}
