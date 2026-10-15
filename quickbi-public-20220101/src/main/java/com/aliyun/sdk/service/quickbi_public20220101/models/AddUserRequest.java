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
 * {@link AddUserRequest} extends {@link RequestModel}
 *
 * <p>AddUserRequest</p>
 */
public class AddUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private String accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountName")
    @Deprecated
    private String accountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdminUser")
    @Deprecated
    private Boolean adminUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthAdminUser")
    @Deprecated
    private Boolean authAdminUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CopilotModules")
    private String copilotModules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NickName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nickName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleIds")
    private String roleIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserType")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10, minimum = 1)
    private Integer userType;

    private AddUserRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.accountName = builder.accountName;
        this.adminUser = builder.adminUser;
        this.authAdminUser = builder.authAdminUser;
        this.copilotModules = builder.copilotModules;
        this.nickName = builder.nickName;
        this.roleIds = builder.roleIds;
        this.userType = builder.userType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddUserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
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
     * @return userType
     */
    public Integer getUserType() {
        return this.userType;
    }

    public static final class Builder extends Request.Builder<AddUserRequest, Builder> {
        private String accountId; 
        private String accountName; 
        private Boolean adminUser; 
        private Boolean authAdminUser; 
        private String copilotModules; 
        private String nickName; 
        private String roleIds; 
        private Integer userType; 

        private Builder() {
            super();
        } 

        private Builder(AddUserRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.accountName = request.accountName;
            this.adminUser = request.adminUser;
            this.authAdminUser = request.authAdminUser;
            this.copilotModules = request.copilotModules;
            this.nickName = request.nickName;
            this.roleIds = request.roleIds;
            this.userType = request.userType;
        } 

        /**
         * <p>The Alibaba Cloud account ID.</p>
         * <blockquote>
         * <p>Warning: For Quick BI versions released after December 31, 2024, AccountId is a required parameter. Update your API calls before this date.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>191476xxxxx23754</p>
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account name.</p>
         * <ul>
         * <li>Note: For a RAM user, the format is &quot;primary account:RAM user&quot;. Example: <a href="mailto:master_test@aliyun.com">master_test@aliyun.com</a>:subaccount</li>
         * <li>Format check: The maximum length is 50 characters.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:xxxxxx@163.com">xxxxxx@163.com</a></p>
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>Specifies whether to assign the organization administrator role. Valid values: </p>
         * <ul>
         * <li>true: Yes. </li>
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
         * <p>Specifies whether to assign the organization permission management administrator role. Valid values: </p>
         * <ul>
         * <li>true: Yes. </li>
         * <li>false: No.</li>
         * </ul>
         * <p><notice>This parameter has expired and is no longer recommended. When RoleIds is specified, this parameter does not take effect.</notice></p>
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
         * <p>The intelligent module quotas of the user. Separate multiple modules with commas (,).</p>
         * <ul>
         * <li>qreport -- Small Q Report</li>
         * <li>qExploreNum -- Small Q Explorer</li>
         * <li>smartQAskNum -- Small Q Ask</li>
         * <li>smartQDevNum -- Small Q Builder</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>qreport,qExploreNum</p>
         */
        public Builder copilotModules(String copilotModules) {
            this.putQueryParameter("CopilotModules", copilotModules);
            this.copilotModules = copilotModules;
            return this;
        }

        /**
         * <p>The nickname of the Alibaba Cloud account.</p>
         * <ul>
         * <li>Format check: The maximum length is 50 characters.</li>
         * <li>Special character validation: Chinese characters, English characters, digits, _ \ / | () ] [</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>John</p>
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
            this.putBodyParameter("RoleIds", roleIds);
            this.roleIds = roleIds;
            return this;
        }

        /**
         * <p>The user type of the organization member. Valid values:</p>
         * <ul>
         * <li>1: Developer.</li>
         * <li>2: Visitor.</li>
         * <li>3: Analyst.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
        public AddUserRequest build() {
            return new AddUserRequest(this);
        } 

    } 

}
