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
 * {@link DeleteExperimentPlanRequest} extends {@link RequestModel}
 *
 * <p>DeleteExperimentPlanRequest</p>
 */
public class DeleteExperimentPlanRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    private String agentSpace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("planId")
    private String planId;

    private DeleteExperimentPlanRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.planId = builder.planId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteExperimentPlanRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentSpace
     */
    public String getAgentSpace() {
        return this.agentSpace;
    }

    /**
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
    }

    public static final class Builder extends Request.Builder<DeleteExperimentPlanRequest, Builder> {
        private String agentSpace; 
        private String planId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteExperimentPlanRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.planId = request.planId;
        } 

        /**
         * <p>The AgentSpace name.</p>
         * 
         * <strong>example:</strong>
         * <p>al-playground-cn-hongkong</p>
         */
        public Builder agentSpace(String agentSpace) {
            this.putPathParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * <p>The experiment plan ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exp-plan-aa1a66b074bc42aa8696c73c7dc9b718</p>
         */
        public Builder planId(String planId) {
            this.putPathParameter("planId", planId);
            this.planId = planId;
            return this;
        }

        @Override
        public DeleteExperimentPlanRequest build() {
            return new DeleteExperimentPlanRequest(this);
        } 

    } 

}
