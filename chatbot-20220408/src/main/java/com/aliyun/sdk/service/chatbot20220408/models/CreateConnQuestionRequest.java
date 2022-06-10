// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConnQuestionRequest} extends {@link RequestModel}
 *
 * <p>CreateConnQuestionRequest</p>
 */
public class CreateConnQuestionRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Body
    @NameInMap("ConnQuestionId")
    @Validation(required = true)
    private Long connQuestionId;

    @Body
    @NameInMap("KnowledgeId")
    @Validation(required = true)
    private Long knowledgeId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private CreateConnQuestionRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.connQuestionId = builder.connQuestionId;
        this.knowledgeId = builder.knowledgeId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConnQuestionRequest create() {
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
     * @return connQuestionId
     */
    public Long getConnQuestionId() {
        return this.connQuestionId;
    }

    /**
     * @return knowledgeId
     */
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateConnQuestionRequest, Builder> {
        private String agentKey; 
        private Long connQuestionId; 
        private Long knowledgeId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateConnQuestionRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.connQuestionId = request.connQuestionId;
            this.knowledgeId = request.knowledgeId;
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
         * ConnQuestionId.
         */
        public Builder connQuestionId(Long connQuestionId) {
            this.putBodyParameter("ConnQuestionId", connQuestionId);
            this.connQuestionId = connQuestionId;
            return this;
        }

        /**
         * KnowledgeId.
         */
        public Builder knowledgeId(Long knowledgeId) {
            this.putBodyParameter("KnowledgeId", knowledgeId);
            this.knowledgeId = knowledgeId;
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
        public CreateConnQuestionRequest build() {
            return new CreateConnQuestionRequest(this);
        } 

    } 

}
