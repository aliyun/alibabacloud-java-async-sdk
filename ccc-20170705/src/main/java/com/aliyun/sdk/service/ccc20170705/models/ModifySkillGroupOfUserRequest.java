// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySkillGroupOfUserRequest} extends {@link RequestModel}
 *
 * <p>ModifySkillGroupOfUserRequest</p>
 */
public class ModifySkillGroupOfUserRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RoleId")
    @Validation(required = true)
    private java.util.List < String > roleId;

    @Query
    @NameInMap("SkillGroupId")
    private java.util.List < String > skillGroupId;

    @Query
    @NameInMap("SkillLevel")
    private java.util.List < Integer > skillLevel;

    @Query
    @NameInMap("UserId")
    @Validation(required = true)
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
    public java.util.List < String > getRoleId() {
        return this.roleId;
    }

    /**
     * @return skillGroupId
     */
    public java.util.List < String > getSkillGroupId() {
        return this.skillGroupId;
    }

    /**
     * @return skillLevel
     */
    public java.util.List < Integer > getSkillLevel() {
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
        private java.util.List < String > roleId; 
        private java.util.List < String > skillGroupId; 
        private java.util.List < Integer > skillLevel; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ModifySkillGroupOfUserRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.roleId = response.roleId;
            this.skillGroupId = response.skillGroupId;
            this.skillLevel = response.skillLevel;
            this.userId = response.userId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RoleId.
         */
        public Builder roleId(java.util.List < String > roleId) {
            this.putQueryParameter("RoleId", roleId);
            this.roleId = roleId;
            return this;
        }

        /**
         * SkillGroupId.
         */
        public Builder skillGroupId(java.util.List < String > skillGroupId) {
            this.putQueryParameter("SkillGroupId", skillGroupId);
            this.skillGroupId = skillGroupId;
            return this;
        }

        /**
         * SkillLevel.
         */
        public Builder skillLevel(java.util.List < Integer > skillLevel) {
            this.putQueryParameter("SkillLevel", skillLevel);
            this.skillLevel = skillLevel;
            return this;
        }

        /**
         * UserId.
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
