// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link UpdatePolarClawAgentSkillsRequest} extends {@link RequestModel}
 *
 * <p>UpdatePolarClawAgentSkillsRequest</p>
 */
public class UpdatePolarClawAgentSkillsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Skills")
    private java.util.List<String> skills;

    private UpdatePolarClawAgentSkillsRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.applicationId = builder.applicationId;
        this.skills = builder.skills;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePolarClawAgentSkillsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return skills
     */
    public java.util.List<String> getSkills() {
        return this.skills;
    }

    public static final class Builder extends Request.Builder<UpdatePolarClawAgentSkillsRequest, Builder> {
        private String agentId; 
        private String applicationId; 
        private java.util.List<String> skills; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePolarClawAgentSkillsRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.applicationId = request.applicationId;
            this.skills = request.skills;
        } 

        /**
         * <p>Agent ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>work</p>
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-xxx</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Skills.
         */
        public Builder skills(java.util.List<String> skills) {
            String skillsShrink = shrink(skills, "Skills", "json");
            this.putQueryParameter("Skills", skillsShrink);
            this.skills = skills;
            return this;
        }

        @Override
        public UpdatePolarClawAgentSkillsRequest build() {
            return new UpdatePolarClawAgentSkillsRequest(this);
        } 

    } 

}
