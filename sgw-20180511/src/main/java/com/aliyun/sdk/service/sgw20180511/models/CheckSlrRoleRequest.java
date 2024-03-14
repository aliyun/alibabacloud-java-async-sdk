// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckSlrRoleRequest} extends {@link RequestModel}
 *
 * <p>CheckSlrRoleRequest</p>
 */
public class CheckSlrRoleRequest extends Request {
    @Query
    @NameInMap("CreateIfNotExist")
    @Validation(required = true)
    private Boolean createIfNotExist;

    @Query
    @NameInMap("RoleName")
    @Validation(required = true)
    private String roleName;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private CheckSlrRoleRequest(Builder builder) {
        super(builder);
        this.createIfNotExist = builder.createIfNotExist;
        this.roleName = builder.roleName;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckSlrRoleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createIfNotExist
     */
    public Boolean getCreateIfNotExist() {
        return this.createIfNotExist;
    }

    /**
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<CheckSlrRoleRequest, Builder> {
        private Boolean createIfNotExist; 
        private String roleName; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(CheckSlrRoleRequest request) {
            super(request);
            this.createIfNotExist = request.createIfNotExist;
            this.roleName = request.roleName;
            this.securityToken = request.securityToken;
        } 

        /**
         * CreateIfNotExist.
         */
        public Builder createIfNotExist(Boolean createIfNotExist) {
            this.putQueryParameter("CreateIfNotExist", createIfNotExist);
            this.createIfNotExist = createIfNotExist;
            return this;
        }

        /**
         * RoleName.
         */
        public Builder roleName(String roleName) {
            this.putQueryParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public CheckSlrRoleRequest build() {
            return new CheckSlrRoleRequest(this);
        } 

    } 

}
