// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssignUsersRequest} extends {@link RequestModel}
 *
 * <p>AssignUsersRequest</p>
 */
public class AssignUsersRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RoleId")
    private java.util.List < String > roleId;

    @Query
    @NameInMap("SkillGroupId")
    private java.util.List < String > skillGroupId;

    @Query
    @NameInMap("SkillLevel")
    private java.util.List < Integer > skillLevel;

    @Query
    @NameInMap("UserRamId")
    @Validation(required = true)
    private java.util.List < String > userRamId;

    private AssignUsersRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.roleId = builder.roleId;
        this.skillGroupId = builder.skillGroupId;
        this.skillLevel = builder.skillLevel;
        this.userRamId = builder.userRamId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssignUsersRequest create() {
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
     * @return userRamId
     */
    public java.util.List < String > getUserRamId() {
        return this.userRamId;
    }

    public static final class Builder extends Request.Builder<AssignUsersRequest, Builder> {
        private String instanceId; 
        private java.util.List < String > roleId; 
        private java.util.List < String > skillGroupId; 
        private java.util.List < Integer > skillLevel; 
        private java.util.List < String > userRamId; 

        private Builder() {
            super();
        } 

        private Builder(AssignUsersRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.roleId = response.roleId;
            this.skillGroupId = response.skillGroupId;
            this.skillLevel = response.skillLevel;
            this.userRamId = response.userRamId;
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
         * UserRamId.
         */
        public Builder userRamId(java.util.List < String > userRamId) {
            this.putQueryParameter("UserRamId", userRamId);
            this.userRamId = userRamId;
            return this;
        }

        @Override
        public AssignUsersRequest build() {
            return new AssignUsersRequest(this);
        } 

    } 

}
