// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCustomRoleRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomRoleRequest</p>
 */
public class CreateCustomRoleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("role_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("role_name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roleName;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private CreateCustomRoleRequest(Builder builder) {
        super(builder);
        this.roleId = builder.roleId;
        this.roleName = builder.roleName;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomRoleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return roleId
     */
    public String getRoleId() {
        return this.roleId;
    }

    /**
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<CreateCustomRoleRequest, Builder> {
        private String roleId; 
        private String roleName; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomRoleRequest request) {
            super(request);
            this.roleId = request.roleId;
            this.roleName = request.roleName;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * role_id.
         */
        public Builder roleId(String roleId) {
            this.putBodyParameter("role_id", roleId);
            this.roleId = roleId;
            return this;
        }

        /**
         * role_name.
         */
        public Builder roleName(String roleName) {
            this.putBodyParameter("role_name", roleName);
            this.roleName = roleName;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public CreateCustomRoleRequest build() {
            return new CreateCustomRoleRequest(this);
        } 

    } 

}
