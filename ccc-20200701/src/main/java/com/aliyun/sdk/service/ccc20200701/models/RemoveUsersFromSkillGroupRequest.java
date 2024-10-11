// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RemoveUsersFromSkillGroupRequest} extends {@link RequestModel}
 *
 * <p>RemoveUsersFromSkillGroupRequest</p>
 */
public class RemoveUsersFromSkillGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userIdList;

    private RemoveUsersFromSkillGroupRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.skillGroupId = builder.skillGroupId;
        this.userIdList = builder.userIdList;
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
     * @return userIdList
     */
    public String getUserIdList() {
        return this.userIdList;
    }

    public static final class Builder extends Request.Builder<RemoveUsersFromSkillGroupRequest, Builder> {
        private String instanceId; 
        private String skillGroupId; 
        private String userIdList; 

        private Builder() {
            super();
        } 

        private Builder(RemoveUsersFromSkillGroupRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.skillGroupId = request.skillGroupId;
            this.userIdList = request.userIdList;
        } 

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>skillgroup@ccc-test</p>
         */
        public Builder skillGroupId(String skillGroupId) {
            this.putQueryParameter("SkillGroupId", skillGroupId);
            this.skillGroupId = skillGroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;agent1@ccc-test&quot;,&quot;agent2@ccc-test&quot;]</p>
         */
        public Builder userIdList(String userIdList) {
            this.putQueryParameter("UserIdList", userIdList);
            this.userIdList = userIdList;
            return this;
        }

        @Override
        public RemoveUsersFromSkillGroupRequest build() {
            return new RemoveUsersFromSkillGroupRequest(this);
        } 

    } 

}
