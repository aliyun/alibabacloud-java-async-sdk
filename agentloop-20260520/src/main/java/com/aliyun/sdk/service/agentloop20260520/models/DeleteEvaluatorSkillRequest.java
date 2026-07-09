// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link DeleteEvaluatorSkillRequest} extends {@link RequestModel}
 *
 * <p>DeleteEvaluatorSkillRequest</p>
 */
public class DeleteEvaluatorSkillRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("skillName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentSpace;

    private DeleteEvaluatorSkillRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.skillName = builder.skillName;
        this.agentSpace = builder.agentSpace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEvaluatorSkillRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return skillName
     */
    public String getSkillName() {
        return this.skillName;
    }

    /**
     * @return agentSpace
     */
    public String getAgentSpace() {
        return this.agentSpace;
    }

    public static final class Builder extends Request.Builder<DeleteEvaluatorSkillRequest, Builder> {
        private String name; 
        private String skillName; 
        private String agentSpace; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEvaluatorSkillRequest request) {
            super(request);
            this.name = request.name;
            this.skillName = request.skillName;
            this.agentSpace = request.agentSpace;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>trace_task_completion</p>
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>trace_context_loader</p>
         */
        public Builder skillName(String skillName) {
            this.putPathParameter("skillName", skillName);
            this.skillName = skillName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>prod-agentspace</p>
         */
        public Builder agentSpace(String agentSpace) {
            this.putQueryParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        @Override
        public DeleteEvaluatorSkillRequest build() {
            return new DeleteEvaluatorSkillRequest(this);
        } 

    } 

}
