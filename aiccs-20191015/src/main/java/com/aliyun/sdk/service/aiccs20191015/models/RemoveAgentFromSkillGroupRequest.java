// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link RemoveAgentFromSkillGroupRequest} extends {@link RequestModel}
 *
 * <p>RemoveAgentFromSkillGroupRequest</p>
 */
public class RemoveAgentFromSkillGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Long> agentIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long skillGroupId;

    private RemoveAgentFromSkillGroupRequest(Builder builder) {
        super(builder);
        this.agentIds = builder.agentIds;
        this.instanceId = builder.instanceId;
        this.skillGroupId = builder.skillGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveAgentFromSkillGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentIds
     */
    public java.util.List<Long> getAgentIds() {
        return this.agentIds;
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
    public Long getSkillGroupId() {
        return this.skillGroupId;
    }

    public static final class Builder extends Request.Builder<RemoveAgentFromSkillGroupRequest, Builder> {
        private java.util.List<Long> agentIds; 
        private String instanceId; 
        private Long skillGroupId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveAgentFromSkillGroupRequest request) {
            super(request);
            this.agentIds = request.agentIds;
            this.instanceId = request.instanceId;
            this.skillGroupId = request.skillGroupId;
        } 

        /**
         * <p>A list of agent IDs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder agentIds(java.util.List<Long> agentIds) {
            String agentIdsShrink = shrink(agentIds, "AgentIds", "json");
            this.putQueryParameter("AgentIds", agentIdsShrink);
            this.agentIds = agentIds;
            return this;
        }

        /**
         * <p>The Artificial Intelligence Cloud Call Service (AICCS) instance ID.<br>You can obtain it from <strong>Instance Management</strong> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc_xp_pre-cn-78v1gnp97002</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Skill group ID.  </p>
         * <p>You can invoke the <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-queryskillgroups">QuerySkillGroups</a> API and view the <strong>SkillGroupId</strong> in the response parameters to obtain the skill group ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1146****</p>
         */
        public Builder skillGroupId(Long skillGroupId) {
            this.putQueryParameter("SkillGroupId", skillGroupId);
            this.skillGroupId = skillGroupId;
            return this;
        }

        @Override
        public RemoveAgentFromSkillGroupRequest build() {
            return new RemoveAgentFromSkillGroupRequest(this);
        } 

    } 

}
