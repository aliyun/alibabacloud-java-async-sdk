// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteSimQuestionRequest} extends {@link RequestModel}
 *
 * <p>DeleteSimQuestionRequest</p>
 */
public class DeleteSimQuestionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SimQuestionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long simQuestionId;

    private DeleteSimQuestionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.simQuestionId = builder.simQuestionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSimQuestionRequest create() {
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
     * @return simQuestionId
     */
    public Long getSimQuestionId() {
        return this.simQuestionId;
    }

    public static final class Builder extends Request.Builder<DeleteSimQuestionRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private Long simQuestionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSimQuestionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.simQuestionId = request.simQuestionId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000002788</p>
         */
        public Builder simQuestionId(Long simQuestionId) {
            this.putBodyParameter("SimQuestionId", simQuestionId);
            this.simQuestionId = simQuestionId;
            return this;
        }

        @Override
        public DeleteSimQuestionRequest build() {
            return new DeleteSimQuestionRequest(this);
        } 

    } 

}
