// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteConnQuestionRequest} extends {@link RequestModel}
 *
 * <p>DeleteConnQuestionRequest</p>
 */
public class DeleteConnQuestionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OutlineId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long outlineId;

    private DeleteConnQuestionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.outlineId = builder.outlineId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteConnQuestionRequest create() {
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
     * @return outlineId
     */
    public Long getOutlineId() {
        return this.outlineId;
    }

    public static final class Builder extends Request.Builder<DeleteConnQuestionRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private Long outlineId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteConnQuestionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.outlineId = request.outlineId;
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
         * OutlineId.
         */
        public Builder outlineId(Long outlineId) {
            this.putBodyParameter("OutlineId", outlineId);
            this.outlineId = outlineId;
            return this;
        }

        @Override
        public DeleteConnQuestionRequest build() {
            return new DeleteConnQuestionRequest(this);
        } 

    } 

}
