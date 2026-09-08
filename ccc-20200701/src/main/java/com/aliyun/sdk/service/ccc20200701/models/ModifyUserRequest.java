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
 * {@link ModifyUserRequest} extends {@link RequestModel}
 *
 * <p>ModifyUserRequest</p>
 */
public class ModifyUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AvatarUrl")
    private String avatarUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisplayId")
    private String displayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Force")
    private Boolean force;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mobile")
    private String mobile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nickname")
    private String nickname;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleId")
    private String roleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workMode;

    private ModifyUserRequest(Builder builder) {
        super(builder);
        this.avatarUrl = builder.avatarUrl;
        this.displayId = builder.displayId;
        this.displayName = builder.displayName;
        this.force = builder.force;
        this.instanceId = builder.instanceId;
        this.mobile = builder.mobile;
        this.nickname = builder.nickname;
        this.roleId = builder.roleId;
        this.userId = builder.userId;
        this.workMode = builder.workMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyUserRequest create() {
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
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * @return nickname
     */
    public String getNickname() {
        return this.nickname;
    }

    /**
     * @return roleId
     */
    public String getRoleId() {
        return this.roleId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return workMode
     */
    public String getWorkMode() {
        return this.workMode;
    }

    public static final class Builder extends Request.Builder<ModifyUserRequest, Builder> {
        private String avatarUrl; 
        private String displayId; 
        private String displayName; 
        private Boolean force; 
        private String instanceId; 
        private String mobile; 
        private String nickname; 
        private String roleId; 
        private String userId; 
        private String workMode; 

        private Builder() {
            super();
        } 

        private Builder(ModifyUserRequest request) {
            super(request);
            this.avatarUrl = request.avatarUrl;
            this.displayId = request.displayId;
            this.displayName = request.displayName;
            this.force = request.force;
            this.instanceId = request.instanceId;
            this.mobile = request.mobile;
            this.nickname = request.nickname;
            this.roleId = request.roleId;
            this.userId = request.userId;
            this.workMode = request.workMode;
        } 

        /**
         * <p>Agent profile picture URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://abc.com/sam.jpb">http://abc.com/sam.jpb</a></p>
         */
        public Builder avatarUrl(String avatarUrl) {
            this.putQueryParameter("AvatarUrl", avatarUrl);
            this.avatarUrl = avatarUrl;
            return this;
        }

        /**
         * <p>Agent ID (employee ID).</p>
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
         * <p>User\&quot;s full name.</p>
         * 
         * <strong>example:</strong>
         * <p>张三疯</p>
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>Whether to force the modification.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * <p>Instance ID.</p>
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
         * <p>Agent\&quot;s personal phone number.</p>
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
         * <p>Agent nickname</p>
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
         * <p>Role ID, in the format: role\@instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Admin@ccc-test</p>
         */
        public Builder roleId(String roleId) {
            this.putQueryParameter("RoleId", roleId);
            this.roleId = roleId;
            return this;
        }

        /**
         * <p>Agent ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user-test@ccc-test</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * <p>Work mode.</p>
         * <p>This parameter is required.</p>
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
        public ModifyUserRequest build() {
            return new ModifyUserRequest(this);
        } 

    } 

}
