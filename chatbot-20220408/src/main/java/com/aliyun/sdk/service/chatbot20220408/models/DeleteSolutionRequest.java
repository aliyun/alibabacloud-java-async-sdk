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
    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("SolutionId")
    @Validation(required = true)
    private Long solutionId;

    private DeleteSolutionRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.regionId = builder.regionId;
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
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return solutionId
     */
    public Long getSolutionId() {
        return this.solutionId;
    }

    public static final class Builder extends Request.Builder<DeleteSolutionRequest, Builder> {
        private String agentKey; 
        private String regionId; 
        private Long solutionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSolutionRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.regionId = request.regionId;
            this.solutionId = request.solutionId;
        } 

        /**
         * 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
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
         * 答案ID
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
