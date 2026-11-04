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
 * {@link ModifySkillGroupOfUserRequest} extends {@link RequestModel}
 *
 * <p>ModifySkillGroupOfUserRequest</p>
 */
public class ModifySkillGroupOfUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

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

    private ModifySkillGroupOfUserRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.roleId = builder.roleId;
        this.skillGroupId = builder.skillGroupId;
        this.skillLevel = builder.skillLevel;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySkillGroupOfUserRequest create() {
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

    public static final class Builder extends Request.Builder<ModifySkillGroupOfUserRequest, Builder> {
        private String instanceId; 
        private java.util.List<String> roleId; 
        private java.util.List<String> skillGroupId; 
        private java.util.List<Integer> skillLevel; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ModifySkillGroupOfUserRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.roleId = request.roleId;
            this.skillGroupId = request.skillGroupId;
            this.skillLevel = request.skillLevel;
            this.userId = request.userId;
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
        public ModifySkillGroupOfUserRequest build() {
            return new ModifySkillGroupOfUserRequest(this);
        } 

    } 

}
