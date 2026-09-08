// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link CreateUserRequest} extends {@link RequestModel}
 *
 * <p>CreateUserRequest</p>
 */
public class CreateUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AvatarUrl")
    private String avatarUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisplayId")
    private String displayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 500)
    private String displayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    @com.aliyun.core.annotation.Validation(required = true)
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loginName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mobile")
    private String mobile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedEmailNotification")
    private String needEmailNotification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nickname")
    private String nickname;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResetPassword")
    private Boolean resetPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillLevelList")
    private String skillLevelList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkMode")
    private String workMode;

    private CreateUserRequest(Builder builder) {
        super(builder);
        this.avatarUrl = builder.avatarUrl;
        this.displayId = builder.displayId;
        this.displayName = builder.displayName;
        this.email = builder.email;
        this.instanceId = builder.instanceId;
        this.loginName = builder.loginName;
        this.mobile = builder.mobile;
        this.needEmailNotification = builder.needEmailNotification;
        this.nickname = builder.nickname;
        this.resetPassword = builder.resetPassword;
        this.roleId = builder.roleId;
        this.skillLevelList = builder.skillLevelList;
        this.workMode = builder.workMode;
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
     * @return avatarUrl
     */
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    /**
     * @return displayId
     */
    public String getDisplayId() {
        return this.displayId;
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return loginName
     */
    public String getLoginName() {
        return this.loginName;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * @return needEmailNotification
     */
    public String getNeedEmailNotification() {
        return this.needEmailNotification;
    }

    /**
     * @return nickname
     */
    public String getNickname() {
        return this.nickname;
    }

    /**
     * @return resetPassword
     */
    public Boolean getResetPassword() {
        return this.resetPassword;
    }

    /**
     * @return roleId
     */
    public String getRoleId() {
        return this.roleId;
    }

    /**
     * @return skillLevelList
     */
    public String getSkillLevelList() {
        return this.skillLevelList;
    }

    /**
     * @return workMode
     */
    public String getWorkMode() {
        return this.workMode;
    }

    public static final class Builder extends Request.Builder<CreateUserRequest, Builder> {
        private String avatarUrl; 
        private String displayId; 
        private String displayName; 
        private String email; 
        private String instanceId; 
        private String loginName; 
        private String mobile; 
        private String needEmailNotification; 
        private String nickname; 
        private Boolean resetPassword; 
        private String roleId; 
        private String skillLevelList; 
        private String workMode; 

        private Builder() {
            super();
        } 

        private Builder(CreateUserRequest request) {
            super(request);
            this.avatarUrl = request.avatarUrl;
            this.displayId = request.displayId;
            this.displayName = request.displayName;
            this.email = request.email;
            this.instanceId = request.instanceId;
            this.loginName = request.loginName;
            this.mobile = request.mobile;
            this.needEmailNotification = request.needEmailNotification;
            this.nickname = request.nickname;
            this.resetPassword = request.resetPassword;
            this.roleId = request.roleId;
            this.skillLevelList = request.skillLevelList;
            this.workMode = request.workMode;
        } 

        /**
         * <p>The URL of the agent\&quot;s profile picture.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://abc.com/sam.jpg">http://abc.com/sam.jpg</a></p>
         */
        public Builder avatarUrl(String avatarUrl) {
            this.putQueryParameter("AvatarUrl", avatarUrl);
            this.avatarUrl = avatarUrl;
            return this;
        }

        /**
         * <p>The agent\&quot;s ID number. Set this as needed.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        public Builder displayId(String displayId) {
            this.putQueryParameter("DisplayId", displayId);
            this.displayId = displayId;
            return this;
        }

        /**
         * <p>The display name of the agent. It must be 1 to 128 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>坐席小王</p>
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The email address of the agent. After the agent is created, an email is sent to this address. The email contains the logon URL for Cloud Contact Center, and the username and password for the RAM account. Keep this information secure.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The logon name of the agent. It must be 4 to 64 characters in length and can contain uppercase letters, lowercase letters, digits, periods (.), underscores (_), and hyphens (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agent</p>
         */
        public Builder loginName(String loginName) {
            this.putQueryParameter("LoginName", loginName);
            this.loginName = loginName;
            return this;
        }

        /**
         * <p>The personal phone number of the agent. This number is used in OFF_SITE mode. The agent can use this number to answer calls in OFF_SITE mode.</p>
         * 
         * <strong>example:</strong>
         * <p>1382114****</p>
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * <p>Specifies whether to send an email notification.</p>
         * <ul>
         * <li><p>true: Send</p>
         * </li>
         * <li><p>false: Do not send</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder needEmailNotification(String needEmailNotification) {
            this.putQueryParameter("NeedEmailNotification", needEmailNotification);
            this.needEmailNotification = needEmailNotification;
            return this;
        }

        /**
         * <p>The agent\&quot;s nickname.</p>
         * 
         * <strong>example:</strong>
         * <p>老王</p>
         */
        public Builder nickname(String nickname) {
            this.putQueryParameter("Nickname", nickname);
            this.nickname = nickname;
            return this;
        }

        /**
         * <p>Specifies whether the agent must reset the password upon the first logon. If set to true, the agent is prompted to reset the password when they first log on to the RAM account. Otherwise, they are not prompted. The default value is false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder resetPassword(Boolean resetPassword) {
            this.putQueryParameter("ResetPassword", resetPassword);
            this.resetPassword = resetPassword;
            return this;
        }

        /**
         * <p>The role ID. The format is Role\@InstanceID. The following roles are supported: Admin (administrator), Manager (skill group leader), and Agent (agent).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Agent@ccc-test</p>
         */
        public Builder roleId(String roleId) {
            this.putQueryParameter("RoleId", roleId);
            this.roleId = roleId;
            return this;
        }

        /**
         * <p>A list of skill levels for skill groups. This is a string in the format of a JSON array. The array can contain up to 100 elements. Each element is an object that contains two fields: skillGroupId and skillLevel. For skillGroupId, enter the ID of the skill group to add. For skillLevel, enter the skill level to add. The value can range from 1 to 10. A smaller value indicates a higher skill level, meaning the agent can handle more calls per unit of time.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;skillGroupId&quot;:&quot;skillgroup1@ccc-test&quot;,&quot;skillLevel&quot;:1},{&quot;skillGroupId&quot;:&quot;skillgroup2@ccc-test&quot;,&quot;skillLevel&quot;:10}]</p>
         */
        public Builder skillLevelList(String skillLevelList) {
            this.putQueryParameter("SkillLevelList", skillLevelList);
            this.skillLevelList = skillLevelList;
            return this;
        }

        /**
         * <p>The work mode.</p>
         * 
         * <strong>example:</strong>
         * <p>ON_SITE</p>
         */
        public Builder workMode(String workMode) {
            this.putQueryParameter("WorkMode", workMode);
            this.workMode = workMode;
            return this;
        }

        @Override
        public CreateUserRequest build() {
            return new CreateUserRequest(this);
        } 

    } 

}
