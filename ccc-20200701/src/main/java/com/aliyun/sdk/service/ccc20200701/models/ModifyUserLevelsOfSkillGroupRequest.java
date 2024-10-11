// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyUserLevelsOfSkillGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyUserLevelsOfSkillGroupRequest</p>
 */
public class ModifyUserLevelsOfSkillGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserLevelList")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>[{&quot;userId&quot;:&quot;agent1@ccc-test&quot;,&quot;skillLevel&quot;:1},{&quot;userId&quot;:&quot;agent2@ccc-test&quot;,&quot;skillLevel&quot;:10}]</p>
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
