// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateUserWithGroupsRequest} extends {@link RequestModel}
 *
 * <p>CreateUserWithGroupsRequest</p>
 */
public class CreateUserWithGroupsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("displayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("passwordEncrypted")
    @com.aliyun.core.annotation.Validation(required = true)
    private String passwordEncrypted;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("roleCodes")
    private java.util.List<String> roleCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userGroupIds")
    private java.util.List<String> userGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("wnAccountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wnAccountId;

    private CreateUserWithGroupsRequest(Builder builder) {
        super(builder);
        this.displayName = builder.displayName;
        this.passwordEncrypted = builder.passwordEncrypted;
        this.roleCodes = builder.roleCodes;
        this.tenantId = builder.tenantId;
        this.userGroupIds = builder.userGroupIds;
        this.wnAccountId = builder.wnAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserWithGroupsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return passwordEncrypted
     */
    public String getPasswordEncrypted() {
        return this.passwordEncrypted;
    }

    /**
     * @return roleCodes
     */
    public java.util.List<String> getRoleCodes() {
        return this.roleCodes;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return userGroupIds
     */
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    /**
     * @return wnAccountId
     */
    public String getWnAccountId() {
        return this.wnAccountId;
    }

    public static final class Builder extends Request.Builder<CreateUserWithGroupsRequest, Builder> {
        private String displayName; 
        private String passwordEncrypted; 
        private java.util.List<String> roleCodes; 
        private String tenantId; 
        private java.util.List<String> userGroupIds; 
        private String wnAccountId; 

        private Builder() {
            super();
        } 

        private Builder(CreateUserWithGroupsRequest request) {
            super(request);
            this.displayName = request.displayName;
            this.passwordEncrypted = request.passwordEncrypted;
            this.roleCodes = request.roleCodes;
            this.tenantId = request.tenantId;
            this.userGroupIds = request.userGroupIds;
            this.wnAccountId = request.wnAccountId;
        } 

        /**
         * <p>The display name of the user. The name must be unique within the tenant and cannot exceed 100 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The Base64-encoded password ciphertext encrypted by using the RSA-OAEP-SHA256 algorithm.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder passwordEncrypted(String passwordEncrypted) {
            this.putBodyParameter("passwordEncrypted", passwordEncrypted);
            this.passwordEncrypted = passwordEncrypted;
            return this;
        }

        /**
         * <p>The list of initial system role codes. If this parameter is not specified, the <code>APPLICATION_USER</code> role is assigned by default.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder roleCodes(java.util.List<String> roleCodes) {
            String roleCodesShrink = shrink(roleCodes, "roleCodes", "json");
            this.putBodyParameter("roleCodes", roleCodesShrink);
            this.roleCodes = roleCodes;
            return this;
        }

        /**
         * <p>The tenant ID. This is a common parameter. In winnexo-cli, pass this parameter explicitly by using <code>--tenant-id</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The list of initial user group IDs. A maximum of 100 user group IDs can be specified. All user groups must belong to the current tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder userGroupIds(java.util.List<String> userGroupIds) {
            String userGroupIdsShrink = shrink(userGroupIds, "userGroupIds", "json");
            this.putBodyParameter("userGroupIds", userGroupIdsShrink);
            this.userGroupIds = userGroupIds;
            return this;
        }

        /**
         * <p>The WINNEXO logon account. This parameter is a unique identifier and cannot be empty.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleAccountId</p>
         */
        public Builder wnAccountId(String wnAccountId) {
            this.putBodyParameter("wnAccountId", wnAccountId);
            this.wnAccountId = wnAccountId;
            return this;
        }

        @Override
        public CreateUserWithGroupsRequest build() {
            return new CreateUserWithGroupsRequest(this);
        } 

    } 

}
