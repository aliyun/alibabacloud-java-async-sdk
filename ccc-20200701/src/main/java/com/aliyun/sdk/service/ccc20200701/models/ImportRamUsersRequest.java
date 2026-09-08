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
 * {@link ImportRamUsersRequest} extends {@link RequestModel}
 *
 * <p>ImportRamUsersRequest</p>
 */
public class ImportRamUsersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RamIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ramIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillLevelList")
    private String skillLevelList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workMode;

    private ImportRamUsersRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.ramIdList = builder.ramIdList;
        this.roleId = builder.roleId;
        this.skillLevelList = builder.skillLevelList;
        this.workMode = builder.workMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportRamUsersRequest create() {
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
     * @return ramIdList
     */
    public String getRamIdList() {
        return this.ramIdList;
    }

    /**
     * @return roleId
     */
    public String getRoleId() {
        return this.roleId;
    }

    /**
     * @return skillLevelList
     */
    public String getSkillLevelList() {
        return this.skillLevelList;
    }

    /**
     * @return workMode
     */
    public String getWorkMode() {
        return this.workMode;
    }

    public static final class Builder extends Request.Builder<ImportRamUsersRequest, Builder> {
        private String instanceId; 
        private String ramIdList; 
        private String roleId; 
        private String skillLevelList; 
        private String workMode; 

        private Builder() {
            super();
        } 

        private Builder(ImportRamUsersRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.ramIdList = request.ramIdList;
            this.roleId = request.roleId;
            this.skillLevelList = request.skillLevelList;
            this.workMode = request.workMode;
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
         * <p>List of RAM user IDs to add.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;28036411123456****&quot;,&quot;29234301123456****&quot;]</p>
         */
        public Builder ramIdList(String ramIdList) {
            this.putQueryParameter("RamIdList", ramIdList);
            this.ramIdList = ramIdList;
            return this;
        }

        /**
         * <p>Role ID. This is the agent\&quot;s role in the instance after successful import. Roles include administrator, skill group leader, and agent.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Agent@ccc-test</p>
         */
        public Builder roleId(String roleId) {
            this.putQueryParameter("RoleId", roleId);
            this.roleId = roleId;
            return this;
        }

        /**
         * <p>Skill level list for the skill group. This is a JSON array string. Each array element is an object with two fields: skillGroupId and skillLevel. skillGroupId is the ID of the skill group the agent wants to associate with. skillLevel is the agent\&quot;s skill level in that skill group. The range is 1-10. A smaller value indicates stronger business capability and the ability to handle more calls per unit of time.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;skillGroupId&quot;:&quot;skillgroup@ccc-test&quot;,&quot;skillLevel&quot;:5}]</p>
         */
        public Builder skillLevelList(String skillLevelList) {
            this.putQueryParameter("SkillLevelList", skillLevelList);
            this.skillLevelList = skillLevelList;
            return this;
        }

        /**
         * <p>Work mode.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ON_SITE</p>
         */
        public Builder workMode(String workMode) {
            this.putQueryParameter("WorkMode", workMode);
            this.workMode = workMode;
            return this;
        }

        @Override
        public ImportRamUsersRequest build() {
            return new ImportRamUsersRequest(this);
        } 

    } 

}
