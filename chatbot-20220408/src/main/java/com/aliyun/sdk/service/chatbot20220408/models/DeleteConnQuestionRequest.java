// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteConnQuestionRequest} extends {@link RequestModel}
 *
 * <p>DeleteConnQuestionRequest</p>
 */
public class DeleteConnQuestionRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Body
    @NameInMap("OutlineId")
    @Validation(required = true)
    private Long outlineId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DeleteConnQuestionRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.outlineId = builder.outlineId;
        this.regionId = builder.regionId;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteConnQuestionRequest, Builder> {
        private String agentKey; 
        private Long outlineId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteConnQuestionRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.outlineId = request.outlineId;
            this.regionId = request.regionId;
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
         * OutlineId.
         */
        public Builder outlineId(Long outlineId) {
            this.putBodyParameter("OutlineId", outlineId);
            this.outlineId = outlineId;
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

        @Override
        public DeleteConnQuestionRequest build() {
            return new DeleteConnQuestionRequest(this);
        } 

    } 

}
