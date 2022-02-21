// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveAgentFromSkillGroupRequest} extends {@link RequestModel}
 *
 * <p>RemoveAgentFromSkillGroupRequest</p>
 */
public class RemoveAgentFromSkillGroupRequest extends Request {
    @Query
    @NameInMap("AgentIds")
    @Validation(required = true)
    private java.util.List < Long > agentIds;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("SkillGroupId")
    @Validation(required = true)
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
    public java.util.List < Long > getAgentIds() {
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
        private java.util.List < Long > agentIds; 
        private String instanceId; 
        private Long skillGroupId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveAgentFromSkillGroupRequest response) {
            super(response);
            this.agentIds = response.agentIds;
            this.instanceId = response.instanceId;
            this.skillGroupId = response.skillGroupId;
        } 

        /**
         * 坐席列表
         */
        public Builder agentIds(java.util.List < Long > agentIds) {
            this.putQueryParameter("AgentIds", agentIds);
            this.agentIds = agentIds;
            return this;
        }

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 技能组id
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
