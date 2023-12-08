// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPromptRequest} extends {@link RequestModel}
 *
 * <p>GetPromptRequest</p>
 */
public class GetPromptRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Query
    @NameInMap("PromptId")
    @Validation(required = true)
    private String promptId;

    @Query
    @NameInMap("Vars")
    private String vars;

    private GetPromptRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.promptId = builder.promptId;
        this.vars = builder.vars;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPromptRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return promptId
     */
    public String getPromptId() {
        return this.promptId;
    }

    /**
     * @return vars
     */
    public String getVars() {
        return this.vars;
    }

    public static final class Builder extends Request.Builder<GetPromptRequest, Builder> {
        private String agentKey; 
        private String promptId; 
        private String vars; 

        private Builder() {
            super();
        } 

        private Builder(GetPromptRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.promptId = request.promptId;
            this.vars = request.vars;
        } 

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * PromptId.
         */
        public Builder promptId(String promptId) {
            this.putQueryParameter("PromptId", promptId);
            this.promptId = promptId;
            return this;
        }

        /**
         * Vars.
         */
        public Builder vars(String vars) {
            this.putQueryParameter("Vars", vars);
            this.vars = vars;
            return this;
        }

        @Override
        public GetPromptRequest build() {
            return new GetPromptRequest(this);
        } 

    } 

}
