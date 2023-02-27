// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddSkillGroupsToUserRequest} extends {@link RequestModel}
 *
 * <p>AddSkillGroupsToUserRequest</p>
 */
public class AddSkillGroupsToUserRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("SkillLevelList")
    @Validation(required = true)
    private String skillLevelList;

    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private AddSkillGroupsToUserRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.skillLevelList = builder.skillLevelList;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddSkillGroupsToUserRequest create() {
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
     * @return skillLevelList
     */
    public String getSkillLevelList() {
        return this.skillLevelList;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<AddSkillGroupsToUserRequest, Builder> {
        private String instanceId; 
        private String skillLevelList; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(AddSkillGroupsToUserRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.skillLevelList = request.skillLevelList;
            this.userId = request.userId;
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
         * SkillLevelList.
         */
        public Builder skillLevelList(String skillLevelList) {
            this.putQueryParameter("SkillLevelList", skillLevelList);
            this.skillLevelList = skillLevelList;
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
        public AddSkillGroupsToUserRequest build() {
            return new AddSkillGroupsToUserRequest(this);
        } 

    } 

}
