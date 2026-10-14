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
 * {@link CreateOptimizeRunRequest} extends {@link RequestModel}
 *
 * <p>CreateOptimizeRunRequest</p>
 */
public class CreateOptimizeRunRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    private String agentSpace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("optimizeTaskName")
    private String optimizeTaskName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("input")
    @com.aliyun.core.annotation.Validation(required = true)
    private Object input;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("preview")
    private Boolean preview;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private CreateOptimizeRunRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.optimizeTaskName = builder.optimizeTaskName;
        this.input = builder.input;
        this.preview = builder.preview;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOptimizeRunRequest create() {
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
     * @return input
     */
    public Object getInput() {
        return this.input;
    }

    /**
     * @return preview
     */
    public Boolean getPreview() {
        return this.preview;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<CreateOptimizeRunRequest, Builder> {
        private String agentSpace; 
        private String optimizeTaskName; 
        private Object input; 
        private Boolean preview; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateOptimizeRunRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.optimizeTaskName = request.optimizeTaskName;
            this.input = request.input;
            this.preview = request.preview;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The AgentSpace name.</p>
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
         * <p>experience-mining</p>
         */
        public Builder optimizeTaskName(String optimizeTaskName) {
            this.putPathParameter("optimizeTaskName", optimizeTaskName);
            this.optimizeTaskName = optimizeTaskName;
            return this;
        }

        /**
         * <p>The JSON input defined by the task type, preserving the original object or array structure. ExperienceMining accepts a start/end/processTimeMaxNS object. SkillOptimize accepts an inline input array, a skills/window object for SLS, or a skills/records object for ATIF or xTrace. The server validates the input based on the task type and configuration. Memory extraction continues to use the original ContextStore API.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;start&quot;:1727136000,&quot;end&quot;:1727139600,&quot;processTimeMaxNS&quot;:1727139600000000000}</p>
         */
        public Builder input(Object input) {
            this.putBodyParameter("input", input);
            this.input = input;
            return this;
        }

        /**
         * <p>Specifies whether to execute an independent pre-run of the complete algorithm. The pre-run generates candidate results and evidence without publishing them to the target dataset or advancing the formal run history. A formal run executes the algorithm independently.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder preview(Boolean preview) {
            this.putBodyParameter("preview", preview);
            this.preview = preview;
            return this;
        }

        /**
         * <p>The idempotency token. Use the same value when you retry the same creation request.</p>
         * 
         * <strong>example:</strong>
         * <p>a1b2c3d4-1234-5678-90ab-cdef12345678</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public CreateOptimizeRunRequest build() {
            return new CreateOptimizeRunRequest(this);
        } 

    } 

}
