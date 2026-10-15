// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link UpdateUserRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserRequest</p>
 */
public class UpdateUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdminUser")
    private Boolean adminUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthAdminUser")
    private Boolean authAdminUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CopilotModules")
    private String copilotModules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsDeleted")
    private Boolean isDeleted;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NickName")
    private String nickName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleIds")
    private String roleIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserType")
    @com.aliyun.core.annotation.Validation(maximum = 10, minimum = 1)
    private Integer userType;

    private UpdateUserRequest(Builder builder) {
        super(builder);
        this.adminUser = builder.adminUser;
        this.authAdminUser = builder.authAdminUser;
        this.copilotModules = builder.copilotModules;
        this.isDeleted = builder.isDeleted;
        this.nickName = builder.nickName;
        this.roleIds = builder.roleIds;
        this.userId = builder.userId;
        this.userType = builder.userType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adminUser
     */
    public Boolean getAdminUser() {
        return this.adminUser;
    }

    /**
     * @return authAdminUser
     */
    public Boolean getAuthAdminUser() {
        return this.authAdminUser;
    }

    /**
     * @return copilotModules
     */
    public String getCopilotModules() {
        return this.copilotModules;
    }

    /**
     * @return isDeleted
     */
    public Boolean getIsDeleted() {
        return this.isDeleted;
    }

    /**
     * @return nickName
     */
    public String getNickName() {
        return this.nickName;
    }

    /**
     * @return roleIds
     */
    public String getRoleIds() {
        return this.roleIds;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userType
     */
    public Integer getUserType() {
        return this.userType;
    }

    public static final class Builder extends Request.Builder<UpdateUserRequest, Builder> {
        private Boolean adminUser; 
        private Boolean authAdminUser; 
        private String copilotModules; 
        private Boolean isDeleted; 
        private String nickName; 
        private String roleIds; 
        private String userId; 
        private Integer userType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserRequest request) {
            super(request);
            this.adminUser = request.adminUser;
            this.authAdminUser = request.authAdminUser;
            this.copilotModules = request.copilotModules;
            this.isDeleted = request.isDeleted;
            this.nickName = request.nickName;
            this.roleIds = request.roleIds;
            this.userId = request.userId;
            this.userType = request.userType;
        } 

        /**
         * <p>Specifies whether to assign the organization administrator role. Valid values:</p>
         * <ul>
         * <li>true: Yes.</li>
         * <li>false: No.</li>
         * </ul>
         * <p><notice>This parameter is deprecated. When RoleIds is specified, this parameter does not take effect.</notice></p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder adminUser(Boolean adminUser) {
            this.putQueryParameter("AdminUser", adminUser);
            this.adminUser = adminUser;
            return this;
        }

        /**
         * <p>Specifies whether to assign the organization permission management administrator role. Valid values:</p>
         * <ul>
         * <li>true: Yes.</li>
         * <li>false: No.</li>
         * </ul>
         * <p><notice>This parameter has expired and is not recommended. When RoleIds is specified, this parameter does not take effect.</notice></p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder authAdminUser(Boolean authAdminUser) {
            this.putQueryParameter("AuthAdminUser", authAdminUser);
            this.authAdminUser = authAdminUser;
            return this;
        }

        /**
         * <p>The intelligent module quota modification information.</p>
         * <p>Pass the parameter as a JSON array. Each array element contains the following fields:</p>
         * <p>moduleType -- The intelligent module.</p>
         * <ul>
         * <li>smartQAskNum -- Smart Q question count.</li>
         * <li>smartQDevNum -- Smart Q building.</li>
         * <li>qreport -- Smart Q report.</li>
         * <li>qExploreNum -- Smart Q exploration edition.</li>
         * </ul>
         * <p>status -- Specifies whether to enable the module.</p>
         * <ul>
         * <li>0 -- Revoke authorization.</li>
         * <li>1 -- Grant authorization.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[
         *     {
         *         &quot;moduleType&quot;: &quot;smartQAskNum&quot;,
         *         &quot;status&quot;: 1
         *     },
         *     {
         *         &quot;moduleType&quot;: &quot;smartQDevNum&quot;,
         *         &quot;status&quot;: 0
         *     }
         * ]</p>
         */
        public Builder copilotModules(String copilotModules) {
            this.putQueryParameter("CopilotModules", copilotModules);
            this.copilotModules = copilotModules;
            return this;
        }

        /**
         * <p>The user status. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: Activated.</li>
         * <li><strong>true</strong>: Deactivated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isDeleted(Boolean isDeleted) {
            this.putQueryParameter("IsDeleted", isDeleted);
            this.isDeleted = isDeleted;
            return this;
        }

        /**
         * <p>The nickname.</p>
         * <ul>
         * <li>Format check: The maximum length is 50 characters.</li>
         * <li>Special format check: Chinese characters, English letters, digits, _ \ / | () ] [</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder nickName(String nickName) {
            this.putQueryParameter("NickName", nickName);
            this.nickName = nickName;
            return this;
        }

        /**
         * <p>The IDs of preset or custom organization roles to attach to the user, separated by commas (,). A maximum of three role IDs are supported. Valid values:</p>
         * <ul>
         * <li>Organization administrator (preset role): 111111111</li>
         * <li>Permission management administrator (preset role): 111111112</li>
         * <li>Common user (preset role): 111111113</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>111111111,456</p>
         */
        public Builder roleIds(String roleIds) {
            this.putQueryParameter("RoleIds", roleIds);
            this.roleIds = roleIds;
            return this;
        }

        /**
         * <p>The ID of the user to update. This user ID is the Quick BI UserID, not the Alibaba Cloud UID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fe67f61a35a94b7da1a34ba174a7****</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * <p>The user type of the organization member. Valid values:</p>
         * <ul>
         * <li>1: Developer.</li>
         * <li>2: Visitor.</li>
         * <li>3: Analyst.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder userType(Integer userType) {
            this.putQueryParameter("UserType", userType);
            this.userType = userType;
            return this;
        }

        @Override
        public UpdateUserRequest build() {
            return new UpdateUserRequest(this);
        } 

    } 

}
