// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link AddSkillGroupsToUserRequest} extends {@link RequestModel}
 *
 * <p>AddSkillGroupsToUserRequest</p>
 */
public class AddSkillGroupsToUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillLevelList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillLevelList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>[{&quot;skillGroupId&quot;:&quot;test1@ccc-test&quot;,&quot;skillLevel&quot;:5},{&quot;skillGroupId&quot;:&quot;test2@ccc-test&quot;,&quot;skillLevel&quot;:5}]</p>
         */
        public Builder skillLevelList(String skillLevelList) {
            this.putQueryParameter("SkillLevelList", skillLevelList);
            this.skillLevelList = skillLevelList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
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
