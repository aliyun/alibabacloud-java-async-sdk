// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSolutionRequest} extends {@link RequestModel}
 *
 * <p>CreateSolutionRequest</p>
 */
public class CreateSolutionRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    @Query
    @NameInMap("ContentType")
    private Integer contentType;

    @Query
    @NameInMap("KnowledgeId")
    @Validation(required = true)
    private Long knowledgeId;

    @Query
    @NameInMap("PerspectiveCodes")
    @Validation(required = true)
    private java.util.List < String > perspectiveCodes;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private CreateSolutionRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.content = builder.content;
        this.contentType = builder.contentType;
        this.knowledgeId = builder.knowledgeId;
        this.perspectiveCodes = builder.perspectiveCodes;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSolutionRequest create() {
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
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return contentType
     */
    public Integer getContentType() {
        return this.contentType;
    }

    /**
     * @return knowledgeId
     */
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    /**
     * @return perspectiveCodes
     */
    public java.util.List < String > getPerspectiveCodes() {
        return this.perspectiveCodes;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateSolutionRequest, Builder> {
        private String agentKey; 
        private String content; 
        private Integer contentType; 
        private Long knowledgeId; 
        private java.util.List < String > perspectiveCodes; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSolutionRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.content = request.content;
            this.contentType = request.contentType;
            this.knowledgeId = request.knowledgeId;
            this.perspectiveCodes = request.perspectiveCodes;
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
         * 答案内容
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * 答案类型
         */
        public Builder contentType(Integer contentType) {
            this.putQueryParameter("ContentType", contentType);
            this.contentType = contentType;
            return this;
        }

        /**
         * 知识ID
         */
        public Builder knowledgeId(Long knowledgeId) {
            this.putQueryParameter("KnowledgeId", knowledgeId);
            this.knowledgeId = knowledgeId;
            return this;
        }

        /**
         * 视角code列表
         */
        public Builder perspectiveCodes(java.util.List < String > perspectiveCodes) {
            this.putQueryParameter("PerspectiveCodes", perspectiveCodes);
            this.perspectiveCodes = perspectiveCodes;
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
        public CreateSolutionRequest build() {
            return new CreateSolutionRequest(this);
        } 

    } 

}
