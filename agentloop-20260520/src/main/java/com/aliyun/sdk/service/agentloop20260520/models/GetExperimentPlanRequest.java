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
 * {@link GetExperimentPlanRequest} extends {@link RequestModel}
 *
 * <p>GetExperimentPlanRequest</p>
 */
public class GetExperimentPlanRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    private String agentSpace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("planId")
    private String planId;

    private GetExperimentPlanRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.planId = builder.planId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExperimentPlanRequest create() {
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

    public static final class Builder extends Request.Builder<GetExperimentPlanRequest, Builder> {
        private String agentSpace; 
        private String planId; 

        private Builder() {
            super();
        } 

        private Builder(GetExperimentPlanRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.planId = request.planId;
        } 

        /**
         * agentSpace.
         */
        public Builder agentSpace(String agentSpace) {
            this.putPathParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * planId.
         */
        public Builder planId(String planId) {
            this.putPathParameter("planId", planId);
            this.planId = planId;
            return this;
        }

        @Override
        public GetExperimentPlanRequest build() {
            return new GetExperimentPlanRequest(this);
        } 

    } 

}
