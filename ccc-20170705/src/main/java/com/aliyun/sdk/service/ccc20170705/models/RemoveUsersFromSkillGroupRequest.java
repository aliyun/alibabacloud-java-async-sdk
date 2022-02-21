// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveUsersFromSkillGroupRequest} extends {@link RequestModel}
 *
 * <p>RemoveUsersFromSkillGroupRequest</p>
 */
public class RemoveUsersFromSkillGroupRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("SkillGroupId")
    @Validation(required = true)
    private String skillGroupId;

    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private java.util.List < String > userId;

    private RemoveUsersFromSkillGroupRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.skillGroupId = builder.skillGroupId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveUsersFromSkillGroupRequest create() {
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
     * @return userId
     */
    public java.util.List < String > getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<RemoveUsersFromSkillGroupRequest, Builder> {
        private String instanceId; 
        private String skillGroupId; 
        private java.util.List < String > userId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveUsersFromSkillGroupRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.skillGroupId = response.skillGroupId;
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
         * SkillGroupId.
         */
        public Builder skillGroupId(String skillGroupId) {
            this.putQueryParameter("SkillGroupId", skillGroupId);
            this.skillGroupId = skillGroupId;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(java.util.List < String > userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public RemoveUsersFromSkillGroupRequest build() {
            return new RemoveUsersFromSkillGroupRequest(this);
        } 

    } 

}
