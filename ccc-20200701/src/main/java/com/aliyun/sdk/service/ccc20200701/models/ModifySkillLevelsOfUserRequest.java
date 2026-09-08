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
 * {@link ModifySkillLevelsOfUserRequest} extends {@link RequestModel}
 *
 * <p>ModifySkillLevelsOfUserRequest</p>
 */
public class ModifySkillLevelsOfUserRequest extends Request {
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

    private ModifySkillLevelsOfUserRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.skillLevelList = builder.skillLevelList;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySkillLevelsOfUserRequest create() {
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

    public static final class Builder extends Request.Builder<ModifySkillLevelsOfUserRequest, Builder> {
        private String instanceId; 
        private String skillLevelList; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ModifySkillLevelsOfUserRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.skillLevelList = request.skillLevelList;
            this.userId = request.userId;
        } 

        /**
         * <p>Instance ID.</p>
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
         * <p>A JSON-formatted string representing an array of objects specifying skill levels for skill groups. Each array element is an object containing two fields: skillGroupId and skillLevel. Set skillGroupId to the ID of the skill group you want to modify, and set skillLevel to the desired skill level, which must be an integer from 1 to 10. A lower value indicates stronger business capability and the ability to handle more calls per unit time.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;skillGroupId&quot;:&quot;skillgroup1@ccc-test&quot;,&quot;skillLevel&quot;:1},{&quot;skillGroupId&quot;:&quot;skillgroup2@ccc-test&quot;,&quot;skillLevel&quot;:10}]</p>
         */
        public Builder skillLevelList(String skillLevelList) {
            this.putQueryParameter("SkillLevelList", skillLevelList);
            this.skillLevelList = skillLevelList;
            return this;
        }

        /**
         * <p>Agent ID.</p>
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
        public ModifySkillLevelsOfUserRequest build() {
            return new ModifySkillLevelsOfUserRequest(this);
        } 

    } 

}
