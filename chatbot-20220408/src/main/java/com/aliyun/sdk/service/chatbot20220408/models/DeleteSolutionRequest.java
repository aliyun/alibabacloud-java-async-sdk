// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSolutionRequest} extends {@link RequestModel}
 *
 * <p>DeleteSolutionRequest</p>
 */
public class DeleteSolutionRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Body
    @NameInMap("SolutionId")
    @Validation(required = true)
    private Long solutionId;

    private DeleteSolutionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.solutionId = builder.solutionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSolutionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return solutionId
     */
    public Long getSolutionId() {
        return this.solutionId;
    }

    public static final class Builder extends Request.Builder<DeleteSolutionRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private Long solutionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSolutionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.solutionId = request.solutionId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
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
         * SolutionId.
         */
        public Builder solutionId(Long solutionId) {
            this.putBodyParameter("SolutionId", solutionId);
            this.solutionId = solutionId;
            return this;
        }

        @Override
        public DeleteSolutionRequest build() {
            return new DeleteSolutionRequest(this);
        } 

    } 

}
