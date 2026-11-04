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
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> userId;

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
    public java.util.List<String> getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<RemoveUsersFromSkillGroupRequest, Builder> {
        private String instanceId; 
        private String skillGroupId; 
        private java.util.List<String> userId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveUsersFromSkillGroupRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.skillGroupId = request.skillGroupId;
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
        public Builder skillGroupId(String skillGroupId) {
            this.putQueryParameter("SkillGroupId", skillGroupId);
            this.skillGroupId = skillGroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder userId(java.util.List<String> userId) {
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
