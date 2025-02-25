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
 * {@link RemoveSkillGroupsFromUserRequest} extends {@link RequestModel}
 *
 * <p>RemoveSkillGroupsFromUserRequest</p>
 */
public class RemoveSkillGroupsFromUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillGroupIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillGroupIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private RemoveSkillGroupsFromUserRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.skillGroupIdList = builder.skillGroupIdList;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveSkillGroupsFromUserRequest create() {
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
     * @return skillGroupIdList
     */
    public String getSkillGroupIdList() {
        return this.skillGroupIdList;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<RemoveSkillGroupsFromUserRequest, Builder> {
        private String instanceId; 
        private String skillGroupIdList; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveSkillGroupsFromUserRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.skillGroupIdList = request.skillGroupIdList;
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
         * <p>[&quot;skillgroup1@ccc-test&quot;,&quot;skillgroup2@ccc-test&quot;]</p>
         */
        public Builder skillGroupIdList(String skillGroupIdList) {
            this.putQueryParameter("SkillGroupIdList", skillGroupIdList);
            this.skillGroupIdList = skillGroupIdList;
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
        public RemoveSkillGroupsFromUserRequest build() {
            return new RemoveSkillGroupsFromUserRequest(this);
        } 

    } 

}
