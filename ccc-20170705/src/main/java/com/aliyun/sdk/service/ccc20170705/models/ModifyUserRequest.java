// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.NameInMap("Phone")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateOutboundNumberId")
    private String privateOutboundNumberId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> roleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillGroupId")
    private java.util.List<String> skillGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillLevel")
    private java.util.List<Integer> skillLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private ModifyUserRequest(Builder builder) {
        super(builder);
        this.displayName = builder.displayName;
        this.email = builder.email;
        this.instanceId = builder.instanceId;
        this.phone = builder.phone;
        this.privateOutboundNumberId = builder.privateOutboundNumberId;
        this.roleId = builder.roleId;
        this.skillGroupId = builder.skillGroupId;
        this.skillLevel = builder.skillLevel;
        this.userId = builder.userId;
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
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return privateOutboundNumberId
     */
    public String getPrivateOutboundNumberId() {
        return this.privateOutboundNumberId;
    }

    /**
     * @return roleId
     */
    public java.util.List<String> getRoleId() {
        return this.roleId;
    }

    /**
     * @return skillGroupId
     */
    public java.util.List<String> getSkillGroupId() {
        return this.skillGroupId;
    }

    /**
     * @return skillLevel
     */
    public java.util.List<Integer> getSkillLevel() {
        return this.skillLevel;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<ModifyUserRequest, Builder> {
        private String displayName; 
        private String email; 
        private String instanceId; 
        private String phone; 
        private String privateOutboundNumberId; 
        private java.util.List<String> roleId; 
        private java.util.List<String> skillGroupId; 
        private java.util.List<Integer> skillLevel; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyUserRequest request) {
            super(request);
            this.displayName = request.displayName;
            this.email = request.email;
            this.instanceId = request.instanceId;
            this.phone = request.phone;
            this.privateOutboundNumberId = request.privateOutboundNumberId;
            this.roleId = request.roleId;
            this.skillGroupId = request.skillGroupId;
            this.skillLevel = request.skillLevel;
            this.userId = request.userId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder phone(String phone) {
            this.putQueryParameter("Phone", phone);
            this.phone = phone;
            return this;
        }

        /**
         * PrivateOutboundNumberId.
         */
        public Builder privateOutboundNumberId(String privateOutboundNumberId) {
            this.putQueryParameter("PrivateOutboundNumberId", privateOutboundNumberId);
            this.privateOutboundNumberId = privateOutboundNumberId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder roleId(java.util.List<String> roleId) {
            this.putQueryParameter("RoleId", roleId);
            this.roleId = roleId;
            return this;
        }

        /**
         * SkillGroupId.
         */
        public Builder skillGroupId(java.util.List<String> skillGroupId) {
            this.putQueryParameter("SkillGroupId", skillGroupId);
            this.skillGroupId = skillGroupId;
            return this;
        }

        /**
         * SkillLevel.
         */
        public Builder skillLevel(java.util.List<Integer> skillLevel) {
            this.putQueryParameter("SkillLevel", skillLevel);
            this.skillLevel = skillLevel;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ModifyUserRequest build() {
            return new ModifyUserRequest(this);
        } 

    } 

}
