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
 * {@link GetOptimizeRunRequest} extends {@link RequestModel}
 *
 * <p>GetOptimizeRunRequest</p>
 */
public class GetOptimizeRunRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    private String agentSpace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("optimizeTaskName")
    private String optimizeTaskName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("optimizeRunId")
    private String optimizeRunId;

    private GetOptimizeRunRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.optimizeTaskName = builder.optimizeTaskName;
        this.optimizeRunId = builder.optimizeRunId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOptimizeRunRequest create() {
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
     * @return optimizeTaskName
     */
    public String getOptimizeTaskName() {
        return this.optimizeTaskName;
    }

    /**
     * @return optimizeRunId
     */
    public String getOptimizeRunId() {
        return this.optimizeRunId;
    }

    public static final class Builder extends Request.Builder<GetOptimizeRunRequest, Builder> {
        private String agentSpace; 
        private String optimizeTaskName; 
        private String optimizeRunId; 

        private Builder() {
            super();
        } 

        private Builder(GetOptimizeRunRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.optimizeTaskName = request.optimizeTaskName;
            this.optimizeRunId = request.optimizeRunId;
        } 

        /**
         * <p>The name of the AgentSpace.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-space</p>
         */
        public Builder agentSpace(String agentSpace) {
            this.putPathParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * <p>The name of the optimization task.</p>
         * 
         * <strong>example:</strong>
         * <p>efficiency-analysis</p>
         */
        public Builder optimizeTaskName(String optimizeTaskName) {
            this.putPathParameter("optimizeTaskName", optimizeTaskName);
            this.optimizeTaskName = optimizeTaskName;
            return this;
        }

        /**
         * <p>The ID of the execution instance.</p>
         * 
         * <strong>example:</strong>
         * <p>or-20260812-0001</p>
         */
        public Builder optimizeRunId(String optimizeRunId) {
            this.putPathParameter("optimizeRunId", optimizeRunId);
            this.optimizeRunId = optimizeRunId;
            return this;
        }

        @Override
        public GetOptimizeRunRequest build() {
            return new GetOptimizeRunRequest(this);
        } 

    } 

}
