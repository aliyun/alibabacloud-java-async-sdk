// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyUserLevelsOfSkillGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyUserLevelsOfSkillGroupRequest</p>
 */
public class ModifyUserLevelsOfSkillGroupRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("SkillGroupId")
    @Validation(required = true)
    private String skillGroupId;

    @Query
    @NameInMap("UserLevelList")
    @Validation(required = true)
    private String userLevelList;

    private ModifyUserLevelsOfSkillGroupRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.skillGroupId = builder.skillGroupId;
        this.userLevelList = builder.userLevelList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyUserLevelsOfSkillGroupRequest create() {
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
     * @return skillGroupId
     */
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

    /**
     * @return userLevelList
     */
    public String getUserLevelList() {
        return this.userLevelList;
    }

    public static final class Builder extends Request.Builder<ModifyUserLevelsOfSkillGroupRequest, Builder> {
        private String instanceId; 
        private String skillGroupId; 
        private String userLevelList; 

        private Builder() {
            super();
        } 

        private Builder(ModifyUserLevelsOfSkillGroupRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.skillGroupId = request.skillGroupId;
            this.userLevelList = request.userLevelList;
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
         * SkillGroupId.
         */
        public Builder skillGroupId(String skillGroupId) {
            this.putQueryParameter("SkillGroupId", skillGroupId);
            this.skillGroupId = skillGroupId;
            return this;
        }

        /**
         * UserLevelList.
         */
        public Builder userLevelList(String userLevelList) {
            this.putQueryParameter("UserLevelList", userLevelList);
            this.userLevelList = userLevelList;
            return this;
        }

        @Override
        public ModifyUserLevelsOfSkillGroupRequest build() {
            return new ModifyUserLevelsOfSkillGroupRequest(this);
        } 

    } 

}
