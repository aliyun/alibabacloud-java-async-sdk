// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddUsersToSkillGroupRequest} extends {@link RequestModel}
 *
 * <p>AddUsersToSkillGroupRequest</p>
 */
public class AddUsersToSkillGroupRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("SkillGroupId")
    @Validation(required = true)
    private String skillGroupId;

    @Query
    @NameInMap("UserSkillLevelList")
    @Validation(required = true)
    private String userSkillLevelList;

    private AddUsersToSkillGroupRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.skillGroupId = builder.skillGroupId;
        this.userSkillLevelList = builder.userSkillLevelList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddUsersToSkillGroupRequest create() {
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
     * @return userSkillLevelList
     */
    public String getUserSkillLevelList() {
        return this.userSkillLevelList;
    }

    public static final class Builder extends Request.Builder<AddUsersToSkillGroupRequest, Builder> {
        private String instanceId; 
        private String skillGroupId; 
        private String userSkillLevelList; 

        private Builder() {
            super();
        } 

        private Builder(AddUsersToSkillGroupRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.skillGroupId = request.skillGroupId;
            this.userSkillLevelList = request.userSkillLevelList;
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
         * UserSkillLevelList.
         */
        public Builder userSkillLevelList(String userSkillLevelList) {
            this.putQueryParameter("UserSkillLevelList", userSkillLevelList);
            this.userSkillLevelList = userSkillLevelList;
            return this;
        }

        @Override
        public AddUsersToSkillGroupRequest build() {
            return new AddUsersToSkillGroupRequest(this);
        } 

    } 

}
